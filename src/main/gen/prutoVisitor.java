// Generated from C:/Users/piotr marganski/Desktop/Studia/VI semestr/Kompilatory/PrutoCompiler/src/main/antlr\pruto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link prutoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface prutoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link prutoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(prutoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(prutoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(prutoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(prutoParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#assignWithoutValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignWithoutValue(prutoParser.AssignWithoutValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(prutoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(prutoParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(prutoParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(prutoParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#devide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevide(prutoParser.DevideContext ctx);
	/**
	 * Visit a parse tree produced by {@link prutoParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(prutoParser.PowContext ctx);
}