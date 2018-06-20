// Generated from C:/Users/piotr marganski/Desktop/Studia/VI semestr/Kompilatory/PrutoCompiler/src/main/antlr\pruto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link prutoParser}.
 */
public interface prutoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link prutoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(prutoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(prutoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(prutoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(prutoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(prutoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(prutoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(prutoParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(prutoParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#assignWithoutValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignWithoutValue(prutoParser.AssignWithoutValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#assignWithoutValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignWithoutValue(prutoParser.AssignWithoutValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(prutoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(prutoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(prutoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(prutoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(prutoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(prutoParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(prutoParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(prutoParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#devide}.
	 * @param ctx the parse tree
	 */
	void enterDevide(prutoParser.DevideContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#devide}.
	 * @param ctx the parse tree
	 */
	void exitDevide(prutoParser.DevideContext ctx);
	/**
	 * Enter a parse tree produced by {@link prutoParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(prutoParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link prutoParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(prutoParser.PowContext ctx);
}