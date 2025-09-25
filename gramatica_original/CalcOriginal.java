import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CalcOriginal {
  public static void main(String[] args) throws Exception {
    String input = args.length > 0 ? String.join(" ", args) : "2+3*4";
    ExprLexer lex = new ExprLexer(CharStreams.fromString(input));
    ExprParser p   = new ExprParser(new CommonTokenStream(lex));
    Double val = new Eval().visit(p.prog());
    if (val == Math.floor(val)) System.out.println(String.format("%.0f", val));
    else System.out.println(val);
  }

  // Visitor que evalúa según la precedencia/asociatividad de Expr.g4
  static class Eval extends ExprBaseVisitor<Double> {
    @Override public Double visitProg(ExprParser.ProgContext c){ return visit(c.expr()); }

    @Override public Double visitAdd(ExprParser.AddContext c){
      double res = visit(c.a);
      for (int i=0;i<c.b.size();i++){
        // Tomamos el operador del hijo intermedio (robusto aunque no uses op+= en la gramática)
        String op = c.getChild(2*i+1).getText();
        double r = visit(c.b.get(i));
        res = op.equals("+") ? res + r : res - r;
      }
      return res;
    }

    @Override public Double visitMul(ExprParser.MulContext c){
      double res = visit(c.a);
      for (int i=0;i<c.b.size();i++){
        String op = c.getChild(2*i+1).getText();
        double r = visit(c.b.get(i));
        res = op.equals("*") ? res * r : res / r;
      }
      return res;
    }

    @Override public Double visitUnary(ExprParser.UnaryContext c){
      double v = visit(c.p);
      if (c.s != null && c.s.getText().equals("-")) v = -v;
      return v;
    }

    // ^ es asociativa a la DERECHA en Expr.g4
    @Override public Double visitPow(ExprParser.PowContext c){
      double base = visit(c.base);
      if (c.exp != null) return Math.pow(base, visit(c.exp));
      return base;
    }

    @Override public Double visitPrimary(ExprParser.PrimaryContext c){
      if (c.NUMBER()!=null) return Double.parseDouble(c.NUMBER().getText());
      return visit(c.expr());
    }
  }
}

