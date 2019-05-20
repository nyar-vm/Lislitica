// Generated from D:/Hybrid/Lislitica\La.g4 by ANTLR 4.7.2
package Lislitica.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(LaParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(LaParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(LaParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#literalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralStatement(LaParser.LiteralStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(LaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityExpression(LaParser.PriorityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApply(LaParser.FunctionApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftOperator(LaParser.LeftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(LaParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpaceOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceOperator(LaParser.SpaceOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(LaParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodApply(LaParser.MethodApplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOperator(LaParser.RightOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dict}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(LaParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(LaParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolExpression(LaParser.SymbolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code List}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(LaParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(LaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#function_apply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_apply(LaParser.Function_applyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#function_curry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_curry(LaParser.Function_curryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(LaParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link LaParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(LaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignable(LaParser.AssignableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignValue(LaParser.AssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAttribute}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAttribute(LaParser.AssignAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunction(LaParser.AssignFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignWithList}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignWithList(LaParser.AssignWithListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#assign_pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_pass(LaParser.Assign_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralList}
	 * labeled alternative in {@link LaParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralList(LaParser.LiteralListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyList}
	 * labeled alternative in {@link LaParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(LaParser.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#indexLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexLiteral(LaParser.IndexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link LaParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralDict(LaParser.LiteralDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link LaParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDict(LaParser.EmptyDictContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalKey}
	 * labeled alternative in {@link LaParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalKey(LaParser.NormalKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymbolKey}
	 * labeled alternative in {@link LaParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolKey(LaParser.SymbolKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RawKey}
	 * labeled alternative in {@link LaParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRawKey(LaParser.RawKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#validKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidKey(LaParser.ValidKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#raw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw(LaParser.RawContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(LaParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#index_valid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_valid(LaParser.Index_validContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#signedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedInteger(LaParser.SignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#prefix_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_ops(LaParser.Prefix_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#postfix_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_ops(LaParser.Postfix_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#left_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_ops(LaParser.Left_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#right_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_ops(LaParser.Right_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LaParser#assign_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_ops(LaParser.Assign_opsContext ctx);
}