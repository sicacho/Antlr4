// Generated from rule\Rule.g4 by ANTLR 4.5.3
package antlr4.generate.rule;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RuleParser}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RuleParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(RuleParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(RuleParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RuleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RuleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#rev}.
	 * @param ctx the parse tree
	 */
	void enterRev(RuleParser.RevContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#rev}.
	 * @param ctx the parse tree
	 */
	void exitRev(RuleParser.RevContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(RuleParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(RuleParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#ruleEx}.
	 * @param ctx the parse tree
	 */
	void enterRuleEx(RuleParser.RuleExContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#ruleEx}.
	 * @param ctx the parse tree
	 */
	void exitRuleEx(RuleParser.RuleExContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RuleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RuleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(RuleParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(RuleParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(RuleParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(RuleParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(RuleParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(RuleParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(RuleParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(RuleParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(RuleParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(RuleParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(RuleParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(RuleParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(RuleParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RuleParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(RuleParser.ValueContext ctx);
}