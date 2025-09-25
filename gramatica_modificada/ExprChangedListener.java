// Generated from ExprChanged.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprChangedParser}.
 */
public interface ExprChangedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprChangedParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprChangedParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprChangedParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprChangedParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ExprChangedParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ExprChangedParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#mulWeak}.
	 * @param ctx the parse tree
	 */
	void enterMulWeak(ExprChangedParser.MulWeakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#mulWeak}.
	 * @param ctx the parse tree
	 */
	void exitMulWeak(ExprChangedParser.MulWeakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#addStrong}.
	 * @param ctx the parse tree
	 */
	void enterAddStrong(ExprChangedParser.AddStrongContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#addStrong}.
	 * @param ctx the parse tree
	 */
	void exitAddStrong(ExprChangedParser.AddStrongContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#powLeft}.
	 * @param ctx the parse tree
	 */
	void enterPowLeft(ExprChangedParser.PowLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#powLeft}.
	 * @param ctx the parse tree
	 */
	void exitPowLeft(ExprChangedParser.PowLeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprChangedParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ExprChangedParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprChangedParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ExprChangedParser.PrimaryContext ctx);
}