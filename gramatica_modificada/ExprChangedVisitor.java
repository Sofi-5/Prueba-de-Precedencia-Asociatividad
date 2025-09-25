// Generated from ExprChanged.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprChangedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprChangedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprChangedParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprChangedParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ExprChangedParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#mulWeak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulWeak(ExprChangedParser.MulWeakContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#addStrong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStrong(ExprChangedParser.AddStrongContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#powLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowLeft(ExprChangedParser.PowLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprChangedParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ExprChangedParser.PrimaryContext ctx);
}