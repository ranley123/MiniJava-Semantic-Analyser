// Generated from /home/ranley/Desktop/CS4201/SemanticAnalyser/src/utils/MiniJavaGrammar.g4 by ANTLR 4.8
package utils;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainclass(MiniJavaGrammarParser.MainclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdecl(MiniJavaGrammarParser.ClassdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(MiniJavaGrammarParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddecl(MiniJavaGrammarParser.MethoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#formallist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormallist(MiniJavaGrammarParser.FormallistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#formalrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalrest(MiniJavaGrammarParser.FormalrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiniJavaGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(MiniJavaGrammarParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(MiniJavaGrammarParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#exprrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprrest(MiniJavaGrammarParser.ExprrestContext ctx);
}