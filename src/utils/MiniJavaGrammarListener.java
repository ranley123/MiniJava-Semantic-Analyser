// Generated from MiniJavaGrammar.g by ANTLR 4.7.2
package utils;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void enterMainclass(MiniJavaGrammarParser.MainclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainclass}.
	 * @param ctx the parse tree
	 */
	void exitMainclass(MiniJavaGrammarParser.MainclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(MiniJavaGrammarParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(MiniJavaGrammarParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#formallist}.
	 * @param ctx the parse tree
	 */
	void enterFormallist(MiniJavaGrammarParser.FormallistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#formallist}.
	 * @param ctx the parse tree
	 */
	void exitFormallist(MiniJavaGrammarParser.FormallistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void enterFormalrest(MiniJavaGrammarParser.FormalrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#formalrest}.
	 * @param ctx the parse tree
	 */
	void exitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniJavaGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniJavaGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(MiniJavaGrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(MiniJavaGrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(MiniJavaGrammarParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(MiniJavaGrammarParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#exprrest}.
	 * @param ctx the parse tree
	 */
	void enterExprrest(MiniJavaGrammarParser.ExprrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#exprrest}.
	 * @param ctx the parse tree
	 */
	void exitExprrest(MiniJavaGrammarParser.ExprrestContext ctx);
}