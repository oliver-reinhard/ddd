/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.asm.services.AsmGrammarAccess;
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
public class AsmSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AsmGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3;
	protected AbstractElementAlias match_DNilLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1;
	protected AbstractElementAlias match_DParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_DParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_DRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1;
	protected AbstractElementAlias match_DReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1;
	protected AbstractElementAlias match_DSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AsmGrammarAccess) access;
		match_DBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3()));
		match_DNilLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDNilLiteralAccess().getUndefinedKeyword_1_1()));
		match_DParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1()));
		match_DReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1()));
		match_DSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNATURALRule())
			return getNATURALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpCastRule())
			return getOpCastToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpConstructorRule())
			return getOpConstructorToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpInstanceOfRule())
			return getOpInstanceOfToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NATURAL returns ecore::EInt: '0'..'9'+;
	 */
	protected String getNATURALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * OpCast:
	 * 	'AS' | 'as';
	 */
	protected String getOpCastToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AS";
	}
	
	/**
	 * OpConstructor:
	 * 	'NEW' | 'new';
	 */
	protected String getOpConstructorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NEW";
	}
	
	/**
	 * OpInstanceOf:
	 * 	'ISA' | 'isa';
	 */
	protected String getOpInstanceOfToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ISA";
	}
	
	/**
	 * OpSingleAssign:
	 * 	':=';
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if (match_DBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3.equals(syntax))
				emit_DBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DNilLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1.equals(syntax))
				emit_DNilLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_DParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_DParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1.equals(syntax))
				emit_DRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1.equals(syntax))
				emit_DReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1.equals(syntax))
				emit_DSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
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
	protected void emit_DBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_DNilLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'for' declaredParam=ID
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') (rule start)
	 *     (rule start) (ambiguity) ('RAISE' | 'raise') expression=DExpression
	 *     (rule start) (ambiguity) ('RETURN' | 'return') (rule start)
	 *     (rule start) (ambiguity) ('RETURN' | 'return') expression=DExpression
	 *     (rule start) (ambiguity) ('SELF' | 'self') (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') (rule start)
	 *     (rule start) (ambiguity) OpConstructor constructor=[DIdentityType|ID]
	 *     (rule start) (ambiguity) function=[DFunction|ID]
	 *     (rule start) (ambiguity) member=[DTypedMember|ID]
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) segments+=DTextOnly
	 *     (rule start) (ambiguity) segments+=DTextStart
	 *     (rule start) (ambiguity) target=[DNamedElement|ID]
	 *     (rule start) (ambiguity) value=DECIMAL
	 *     (rule start) (ambiguity) value=NATURAL
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='TRUE'
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {DAssignment.memberContainer=}
	 *     (rule start) (ambiguity) {DBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {DCastExpression.target=}
	 *     (rule start) (ambiguity) {DInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {DTypedMemberReference.memberContainerReference=}
	 */
	protected void emit_DParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'for' declaredParam=ID
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') ')' (rule start)
	 *     (rule start) (ambiguity) ('RAISE' | 'raise') expression=DExpression
	 *     (rule start) (ambiguity) ('RETURN' | 'return') ')' (rule start)
	 *     (rule start) (ambiguity) ('RETURN' | 'return') expression=DExpression
	 *     (rule start) (ambiguity) ('SELF' | 'self') ')' (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') ')' (rule start)
	 *     (rule start) (ambiguity) OpConstructor constructor=[DIdentityType|ID]
	 *     (rule start) (ambiguity) function=[DFunction|ID]
	 *     (rule start) (ambiguity) member=[DTypedMember|ID]
	 *     (rule start) (ambiguity) operator=OpUnary
	 *     (rule start) (ambiguity) segments+=DTextOnly
	 *     (rule start) (ambiguity) segments+=DTextStart
	 *     (rule start) (ambiguity) target=[DNamedElement|ID]
	 *     (rule start) (ambiguity) value=DECIMAL
	 *     (rule start) (ambiguity) value=NATURAL
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) value?='TRUE'
	 *     (rule start) (ambiguity) value?='true'
	 *     (rule start) (ambiguity) {DAssignment.memberContainer=}
	 *     (rule start) (ambiguity) {DBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {DCastExpression.target=}
	 *     (rule start) (ambiguity) {DInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {DTypedMemberReference.memberContainerReference=}
	 */
	protected void emit_DParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_DRaiseExpression_RAISEKeyword_1_0_or_RaiseKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_DReturnExpression_RETURNKeyword_1_0_or_ReturnKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_DSelfExpression_SELFKeyword_1_0_or_SelfKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
