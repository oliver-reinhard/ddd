/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SimSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SimGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1;
	protected AbstractElementAlias match_SimAggregateTransposition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_SimAssociationTransposition_CompositeKeyword_1_0_1_1_or_ReferenceKeyword_1_0_1_0;
	protected AbstractElementAlias match_SimAssociationTransposition_CompositeKeyword_1_1_1_1_or_ReferenceKeyword_1_1_1_0;
	protected AbstractElementAlias match_SimAssociationTransposition_CompositeKeyword_1_2_1_1_or_ReferenceKeyword_1_2_1_0;
	protected AbstractElementAlias match_SimAttributeTransposition_AttributeKeyword_1_0_1_0_q;
	protected AbstractElementAlias match_SimAttributeTransposition_AttributeKeyword_1_1_1_0_q;
	protected AbstractElementAlias match_SimAttributeTransposition_AttributeKeyword_1_2_1_0_q;
	protected AbstractElementAlias match_SimEnumerationTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_SimPrimitiveTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SimGrammarAccess) access;
		match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFalseKeyword_1_3()));
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUndefinedKeyword_1_1()));
		match_SimAggregateTransposition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimAggregateTranspositionAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getSimAggregateTranspositionAccess().getRightCurlyBracketKeyword_5_3()));
		match_SimAssociationTransposition_CompositeKeyword_1_0_1_1_or_ReferenceKeyword_1_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getCompositeKeyword_1_0_1_1()), new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getReferenceKeyword_1_0_1_0()));
		match_SimAssociationTransposition_CompositeKeyword_1_1_1_1_or_ReferenceKeyword_1_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getCompositeKeyword_1_1_1_1()), new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getReferenceKeyword_1_1_1_0()));
		match_SimAssociationTransposition_CompositeKeyword_1_2_1_1_or_ReferenceKeyword_1_2_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getCompositeKeyword_1_2_1_1()), new TokenAlias(false, false, grammarAccess.getSimAssociationTranspositionAccess().getReferenceKeyword_1_2_1_0()));
		match_SimAttributeTransposition_AttributeKeyword_1_0_1_0_q = new TokenAlias(false, true, grammarAccess.getSimAttributeTranspositionAccess().getAttributeKeyword_1_0_1_0());
		match_SimAttributeTransposition_AttributeKeyword_1_1_1_0_q = new TokenAlias(false, true, grammarAccess.getSimAttributeTranspositionAccess().getAttributeKeyword_1_1_1_0());
		match_SimAttributeTransposition_AttributeKeyword_1_2_1_0_q = new TokenAlias(false, true, grammarAccess.getSimAttributeTranspositionAccess().getAttributeKeyword_1_2_1_0());
		match_SimEnumerationTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimEnumerationTranspositionAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSimEnumerationTranspositionAccess().getRightCurlyBracketKeyword_4_3()));
		match_SimPrimitiveTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimPrimitiveTranspositionAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSimPrimitiveTranspositionAccess().getRightCurlyBracketKeyword_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDAggregateKeywordRule())
			return getDAggregateKeywordToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxFieldListStartSymbolRule())
			return getDmxFieldListStartSymbolToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpCastRule())
			return getDmxOpCastToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpInstanceOfRule())
			return getDmxOpInstanceOfToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpSingleAssignRule())
			return getDmxOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * @Override 
	 * DAggregateKeyword:
	 * 	'aggregate';
	 */
	protected String getDAggregateKeywordToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "aggregate";
	}
	
	/**
	 * DmxFieldListStartSymbol:
	 * 	'{';
	 */
	protected String getDmxFieldListStartSymbolToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
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
			else if (match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1.equals(syntax))
				emit_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAggregateTransposition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_SimAggregateTransposition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAssociationTransposition_CompositeKeyword_1_0_1_1_or_ReferenceKeyword_1_0_1_0.equals(syntax))
				emit_SimAssociationTransposition_CompositeKeyword_1_0_1_1_or_ReferenceKeyword_1_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAssociationTransposition_CompositeKeyword_1_1_1_1_or_ReferenceKeyword_1_1_1_0.equals(syntax))
				emit_SimAssociationTransposition_CompositeKeyword_1_1_1_1_or_ReferenceKeyword_1_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAssociationTransposition_CompositeKeyword_1_2_1_1_or_ReferenceKeyword_1_2_1_0.equals(syntax))
				emit_SimAssociationTransposition_CompositeKeyword_1_2_1_1_or_ReferenceKeyword_1_2_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAttributeTransposition_AttributeKeyword_1_0_1_0_q.equals(syntax))
				emit_SimAttributeTransposition_AttributeKeyword_1_0_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAttributeTransposition_AttributeKeyword_1_1_1_0_q.equals(syntax))
				emit_SimAttributeTransposition_AttributeKeyword_1_1_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimAttributeTransposition_AttributeKeyword_1_2_1_0_q.equals(syntax))
				emit_SimAttributeTransposition_AttributeKeyword_1_2_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimEnumerationTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_SimEnumerationTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SimPrimitiveTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_SimPrimitiveTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     (rule start) (ambiguity) 'detail' type=[DComplexType|ID]
	 *     (rule start) (ambiguity) 'entity' type=[DComplexType|ID]
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') (rule start)
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
	 *     (rule start) (ambiguity) 'detail' type=[DComplexType|ID]
	 *     (rule start) (ambiguity) 'entity' type=[DComplexType|ID]
	 *     (rule start) (ambiguity) 'if' if=DExpression
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' elements+=DExpression
	 *     (rule start) (ambiguity) ('FALSE' | 'false') ')' (rule start)
	 *     (rule start) (ambiguity) ('UNDEFINED' | 'undefined') ')' (rule start)
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
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=DRichText (ambiguity) (rule end)
	 *     rule=SimGrabAggregateRule (ambiguity) (rule end)
	 */
	protected void emit_SimAggregateTransposition___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'reference' | 'composite'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'grab' (ambiguity) rule=SimGrabFeatureRule
	 */
	protected void emit_SimAssociationTransposition_CompositeKeyword_1_0_1_1_or_ReferenceKeyword_1_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'reference' | 'composite'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'morph' (ambiguity) rule=SimMorphFeatureRule
	 */
	protected void emit_SimAssociationTransposition_CompositeKeyword_1_1_1_1_or_ReferenceKeyword_1_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'reference' | 'composite'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'ditch' (ambiguity) rule=SimDitchFeatureRule
	 */
	protected void emit_SimAssociationTransposition_CompositeKeyword_1_2_1_1_or_ReferenceKeyword_1_2_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attribute'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'grab' (ambiguity) rule=SimGrabFeatureRule
	 */
	protected void emit_SimAttributeTransposition_AttributeKeyword_1_0_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attribute'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'morph' (ambiguity) rule=SimMorphFeatureRule
	 */
	protected void emit_SimAttributeTransposition_AttributeKeyword_1_1_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'attribute'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'ditch' (ambiguity) rule=SimDitchFeatureRule
	 */
	protected void emit_SimAttributeTransposition_AttributeKeyword_1_2_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=DRichText (ambiguity) (rule end)
	 *     notes+=DNote (ambiguity) (rule end)
	 *     rule=SimDitchEnumerationRule (ambiguity) (rule end)
	 *     rule=SimGrabEnumerationRule (ambiguity) (rule end)
	 */
	protected void emit_SimEnumerationTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     description=DRichText (ambiguity) (rule end)
	 *     notes+=DNote (ambiguity) (rule end)
	 *     rule=SimDitchPrimitiveRule (ambiguity) (rule end)
	 *     rule=SimGrabPrimitiveRule (ambiguity) (rule end)
	 */
	protected void emit_SimPrimitiveTransposition___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
