import org.antlr.v4.runtime.*;

public class CalcChanged {
  public static void main(String[] args) throws Exception {
    String input = args.length > 0 ? String.join(" ", args) : "2+3*4";
    ExprChangedLexer lex = new ExprChangedLexer(CharStreams.fromString(input));
    ExprChangedParser p  = new ExprChangedParser(new CommonTokenStream(lex));
    Double val = new Eval().visit(p.prog());
    if (val == Math.floor(val)) System.out.println(String.format("%.0f", val));
    else System.out.println(val);
  }

  // Visitor acorde a ExprChanged.g4 (+: fuerte; ^ izquierda; unario débil)
  static class Eval extends ExprChangedBaseVisitor<Double> {
    @Override public Double visitProg(ExprChangedParser.ProgContext c){ return visit(c.expr()); }

    @Override public Double visitUnary(ExprChangedParser.UnaryContext c){
      double v = visit(c.m);
      if (c.s!=null && c.s.getText().equals("-")) v = -v;
      return v;
    }

    @Override public Double visitMulWeak(ExprChangedParser.MulWeakContext c){
      double res = visit(c.a);
      for (int i=0;i<c.b.size();i++){
        String op = c.getChild(2*i+1).getText();
        double r = visit(c.b.get(i));
        res = op.equals("*") ? res * r : res / r;
      }
      return res;
    }

    @Override public Double visitAddStrong(ExprChangedParser.AddStrongContext c){
      double left = visit(c.a);
      if (c.op != null) {
        double right = visit(c.b);
        return c.op.getText().equals("+") ? left + right : left - right;
      }
      return left;
    }

    // ^ izquierda: (a^b^c) = ((a^b)^c)
    @Override public Double visitPowLeft(ExprChangedParser.PowLeftContext c){
      double res = visit(c.a);
      for (int i=0;i<c.b.size();i++) res = Math.pow(res, visit(c.b.get(i)));
      return res;
    }

    @Override public Double visitPrimary(ExprChangedParser.PrimaryContext c){
      if (c.NUMBER()!=null) return Double.parseDouble(c.NUMBER().getText());
      return visit(c.expr());
    }
  }
}

