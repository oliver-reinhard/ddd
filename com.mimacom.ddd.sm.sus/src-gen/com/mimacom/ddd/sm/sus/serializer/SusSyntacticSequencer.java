/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sus.services.SusGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SusSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SusGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_DmxRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1;
	protected AbstractElementAlias match_DmxReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1;
	protected AbstractElementAlias match_DmxSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1;
	protected AbstractElementAlias match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1;
	protected AbstractElementAlias match_UserStory_RealisesKeyword_4_0_0_or_RealizesKeyword_4_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SusGrammarAccess) access;
		match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFalseKeyword_1_3()));
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxRaiseExpressionAccess().getRAISEKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxRaiseExpressionAccess().getRaiseKeyword_1_1()));
		match_DmxReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxReturnExpressionAccess().getRETURNKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxReturnExpressionAccess().getReturnKeyword_1_1()));
		match_DmxSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxSelfExpressionAccess().getSELFKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxSelfExpressionAccess().getSelfKeyword_1_1()));
		match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUndefinedKeyword_1_1()));
		match_UserStory_RealisesKeyword_4_0_0_or_RealizesKeyword_4_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUserStoryAccess().getRealisesKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getUserStoryAccess().getRealizesKeyword_4_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDmxOpCastRule())
			return getDmxOpCastToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpConstructorRule())
			return getDmxOpConstructorToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpInstanceOfRule())
			return getDmxOpInstanceOfToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpSingleAssignRule())
			return getDmxOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * DmxOpCast:
	 * 	'AS' | 'as';
	 */
	protected String getDmxOpCastToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AS";
	}
	
	/**
	 * DmxOpConstructor:
	 * 	'NEW' | 'new';
	 */
	protected String getDmxOpConstructorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NEW";
	}
	
	/**
	 * DmxOpInstanceOf:
	 * 	'ISA' | 'isa';
	 */
	protected String getDmxOpInstanceOfToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ISA";
	}
	
	/**
	 * DmxOpSingleAssign:
	 * 	':=';
	 */
	protected String getDmxOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3.equals(syntax))
				emit_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1.equals(syntax))
				emit_DmxRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1.equals(syntax))
				emit_DmxReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1.equals(syntax))
				emit_DmxSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1.equals(syntax))
				emit_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UserStory_RealisesKeyword_4_0_0_or_RealizesKeyword_4_0_1.equals(syntax))
				emit_UserStory_RealisesKeyword_4_0_0_or_RealizesKeyword_4_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'FALSE' | 'false'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) '('+ (ambiguity) ')' (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '[' target=[IStaticReferenceTarget|DQualifiedName]
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') (rule start)
	 *     (rule start) (ambiguity) ('RAISE' | 'raise') expression=DExpression
	 *     (rule start) (ambiguity) ('RETURN' | 'return') (rule start)
	 *     (rule start) (ambiguity) ('RETURN' | 'return') expression=DExpression
	 *     (rule start) (ambiguity) ('SELF' | 'self') (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') (rule start)
	 *     (rule start) (ambiguity) DmxOpConstructor constructor=[DComplexType|ID]
	 *     (rule start) (ambiguity) assignToMember=[DNavigableMember|ID]
	 *     (rule start) (ambiguity) correlationVariable=DmxCorrelationVariable
	 *     (rule start) (ambiguity) function=[DmxFilter|ID]
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) segments+=DmxTextOnly
	 *     (rule start) (ambiguity) segments+=DmxTextStart
	 *     (rule start) (ambiguity) target=[DNamedElement|ID]
	 *     (rule start) (ambiguity) value=DECIMAL
	 *     (rule start) (ambiguity) value=NATURAL
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='TRUE'
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {DmxAssignment.precedingNavigationSegment=}
	 *     (rule start) (ambiguity) {DmxBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {DmxCastExpression.target=}
	 *     (rule start) (ambiguity) {DmxInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {DmxMemberNavigation.precedingNavigationSegment=}
	 */
	protected void emit_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '[' target=[IStaticReferenceTarget|DQualifiedName]
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') ')' (rule start)
	 *     (rule start) (ambiguity) ('RAISE' | 'raise') expression=DExpression
	 *     (rule start) (ambiguity) ('RETURN' | 'return') ')' (rule start)
	 *     (rule start) (ambiguity) ('RETURN' | 'return') expression=DExpression
	 *     (rule start) (ambiguity) ('SELF' | 'self') ')' (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') ')' (rule start)
	 *     (rule start) (ambiguity) DmxOpConstructor constructor=[DComplexType|ID]
	 *     (rule start) (ambiguity) assignToMember=[DNavigableMember|ID]
	 *     (rule start) (ambiguity) correlationVariable=DmxCorrelationVariable
	 *     (rule start) (ambiguity) function=[DmxFilter|ID]
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) segments+=DmxTextOnly
	 *     (rule start) (ambiguity) segments+=DmxTextStart
	 *     (rule start) (ambiguity) target=[DNamedElement|ID]
	 *     (rule start) (ambiguity) value=DECIMAL
	 *     (rule start) (ambiguity) value=NATURAL
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='TRUE'
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {DmxAssignment.precedingNavigationSegment=}
	 *     (rule start) (ambiguity) {DmxBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {DmxCastExpression.target=}
	 *     (rule start) (ambiguity) {DmxInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {DmxMemberNavigation.precedingNavigationSegment=}
	 */
	protected void emit_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'RAISE' | 'raise'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) expression=DExpression
	 *     (rule start) '('+ (ambiguity) expression=DExpression
	 *     (rule start) (ambiguity) expression=DExpression
	 */
	protected void emit_DmxRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'RETURN' | 'return'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) '('* (ambiguity) expression=DExpression
	 *     (rule start) '('+ (ambiguity) ')' (rule start)
	 *     (rule start) '('+ (ambiguity) expression=DExpression
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) expression=DExpression
	 */
	protected void emit_DmxReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'SELF' | 'self'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) '('+ (ambiguity) ')' (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_DmxSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'UNDEFINED' | 'undefined'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 *     (rule start) '('+ (ambiguity) ')' (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'realises' | 'realizes'
	 *
	 * This ambiguous syntax occurs at:
	 *     name=DQualifiedName (ambiguity) event=[DDomainEvent|DQualifiedName]
	 */
	protected void emit_UserStory_RealisesKeyword_4_0_0_or_RealizesKeyword_4_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
