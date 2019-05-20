// Generated from D:/Hybrid/Lislitica\La.g4 by ANTLR 4.7.2
package Lislitica.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaParser}.
 */
public interface LaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(LaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(LaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(LaParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(LaParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(LaParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(LaParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(LaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(LaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpression(LaParser.PriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriorityExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpression(LaParser.PriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApply(LaParser.FunctionApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApply(LaParser.FunctionApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLeftOperator(LaParser.LeftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLeftOperator(LaParser.LeftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex(LaParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex(LaParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpaceOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSpaceOperator(LaParser.SpaceOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpaceOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSpaceOperator(LaParser.SpaceOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(LaParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(LaParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodApply(LaParser.MethodApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodApply}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodApply(LaParser.MethodApplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(LaParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(LaParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(LaParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(LaParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRightOperator(LaParser.RightOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightOperator}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRightOperator(LaParser.RightOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(LaParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(LaParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSymbolExpression(LaParser.SymbolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSymbolExpression(LaParser.SymbolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code List}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterList(LaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code List}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitList(LaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(LaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpression}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(LaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(LaParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link LaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(LaParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#function_apply}.
	 * @param ctx the parse tree
	 */
	void enterFunction_apply(LaParser.Function_applyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#function_apply}.
	 * @param ctx the parse tree
	 */
	void exitFunction_apply(LaParser.Function_applyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#function_curry}.
	 * @param ctx the parse tree
	 */
	void enterFunction_curry(LaParser.Function_curryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#function_curry}.
	 * @param ctx the parse tree
	 */
	void exitFunction_curry(LaParser.Function_curryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(LaParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(LaParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link LaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(LaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link LaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(LaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAssignable(LaParser.AssignableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAssignable(LaParser.AssignableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(LaParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignValue}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(LaParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignAttribute}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignAttribute(LaParser.AssignAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignAttribute}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignAttribute(LaParser.AssignAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunction(LaParser.AssignFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunction(LaParser.AssignFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignWithList}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void enterAssignWithList(LaParser.AssignWithListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignWithList}
	 * labeled alternative in {@link LaParser#assign_lhs}.
	 * @param ctx the parse tree
	 */
	void exitAssignWithList(LaParser.AssignWithListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#assign_pass}.
	 * @param ctx the parse tree
	 */
	void enterAssign_pass(LaParser.Assign_passContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#assign_pass}.
	 * @param ctx the parse tree
	 */
	void exitAssign_pass(LaParser.Assign_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link LaParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralDict(LaParser.LiteralDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralDict}
	 * labeled alternative in {@link LaParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralDict(LaParser.LiteralDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link LaParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDict(LaParser.EmptyDictContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyDict}
	 * labeled alternative in {@link LaParser#dict_literal}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDict(LaParser.EmptyDictContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterNormalKey(LaParser.NormalKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitNormalKey(LaParser.NormalKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SymbolKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterSymbolKey(LaParser.SymbolKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SymbolKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitSymbolKey(LaParser.SymbolKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RawKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterRawKey(LaParser.RawKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RawKey}
	 * labeled alternative in {@link LaParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitRawKey(LaParser.RawKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#validKey}.
	 * @param ctx the parse tree
	 */
	void enterValidKey(LaParser.ValidKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#validKey}.
	 * @param ctx the parse tree
	 */
	void exitValidKey(LaParser.ValidKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#raw}.
	 * @param ctx the parse tree
	 */
	void enterRaw(LaParser.RawContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#raw}.
	 * @param ctx the parse tree
	 */
	void exitRaw(LaParser.RawContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(LaParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(LaParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(LaParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(LaParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#indexLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIndexLiteral(LaParser.IndexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#indexLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIndexLiteral(LaParser.IndexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#index_valid}.
	 * @param ctx the parse tree
	 */
	void enterIndex_valid(LaParser.Index_validContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#index_valid}.
	 * @param ctx the parse tree
	 */
	void exitIndex_valid(LaParser.Index_validContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#signedInteger}.
	 * @param ctx the parse tree
	 */
	void enterSignedInteger(LaParser.SignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#signedInteger}.
	 * @param ctx the parse tree
	 */
	void exitSignedInteger(LaParser.SignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#prefix_ops}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_ops(LaParser.Prefix_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#prefix_ops}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_ops(LaParser.Prefix_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#postfix_ops}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_ops(LaParser.Postfix_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#postfix_ops}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_ops(LaParser.Postfix_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#left_ops}.
	 * @param ctx the parse tree
	 */
	void enterLeft_ops(LaParser.Left_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#left_ops}.
	 * @param ctx the parse tree
	 */
	void exitLeft_ops(LaParser.Left_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#right_ops}.
	 * @param ctx the parse tree
	 */
	void enterRight_ops(LaParser.Right_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#right_ops}.
	 * @param ctx the parse tree
	 */
	void exitRight_ops(LaParser.Right_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#assign_ops}.
	 * @param ctx the parse tree
	 */
	void enterAssign_ops(LaParser.Assign_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#assign_ops}.
	 * @param ctx the parse tree
	 */
	void exitAssign_ops(LaParser.Assign_opsContext ctx);
}