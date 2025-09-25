// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(ExprParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(ExprParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ExprParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ExprParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(ExprParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(ExprParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ExprParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ExprParser.PrimaryContext ctx);
}