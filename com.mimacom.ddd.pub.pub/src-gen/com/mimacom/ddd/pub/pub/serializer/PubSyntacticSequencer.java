/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.pub.pub.services.PubGrammarAccess;
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
public class PubSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PubGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1;
	protected AbstractElementAlias match_PubCodeListing___NumberedKeyword_5_0_FalseKeyword_5_1_1__q;
	protected AbstractElementAlias match_PubGenerate___DiagramsKeyword_2_0_VectorKeyword_2_1_1__q;
	protected AbstractElementAlias match_PubListItem_HyphenMinusKeyword_1_1_0_or_ItemKeyword_1_0_0;
	protected AbstractElementAlias match_PubListItem___LeftCurlyBracketKeyword_1_0_3_0_0_RightCurlyBracketKeyword_1_0_3_0_2__q;
	protected AbstractElementAlias match_PubList_NumberSignKeyword_2_1_q;
	protected AbstractElementAlias match_PubReferenceTargetName_NumberSignKeyword_1_q;
	protected AbstractElementAlias match_PubRichTextParagraph_PKeyword_0_1_or_ParagraphKeyword_0_0;
	protected AbstractElementAlias match_PubSubsection_SubKeyword_0_0_or_SubsectionKeyword_0_1;
	protected AbstractElementAlias match_PubSubsubsection_SubsubKeyword_0_0_or_SubsubsectionKeyword_0_1;
	protected AbstractElementAlias match_PubTableCell___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__q;
	protected AbstractElementAlias match_PubTableRow_FalseKeyword_1_0_0_0_1_1_q;
	protected AbstractElementAlias match_PubTableRow_VerticalLineVerticalLineKeyword_1_1_0_1_or___RowKeyword_1_0_0_0_0_FalseKeyword_1_0_0_0_1_1_q___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q__;
	protected AbstractElementAlias match_PubTableRow___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PubGrammarAccess) access;
		match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFalseKeyword_1_3()));
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUndefinedKeyword_1_1()));
		match_PubCodeListing___NumberedKeyword_5_0_FalseKeyword_5_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubCodeListingAccess().getNumberedKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getPubCodeListingAccess().getFalseKeyword_5_1_1()));
		match_PubGenerate___DiagramsKeyword_2_0_VectorKeyword_2_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubGenerateAccess().getDiagramsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getPubGenerateAccess().getVectorKeyword_2_1_1()));
		match_PubListItem_HyphenMinusKeyword_1_1_0_or_ItemKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPubListItemAccess().getHyphenMinusKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getPubListItemAccess().getItemKeyword_1_0_0()));
		match_PubListItem___LeftCurlyBracketKeyword_1_0_3_0_0_RightCurlyBracketKeyword_1_0_3_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubListItemAccess().getLeftCurlyBracketKeyword_1_0_3_0_0()), new TokenAlias(false, false, grammarAccess.getPubListItemAccess().getRightCurlyBracketKeyword_1_0_3_0_2()));
		match_PubList_NumberSignKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getPubListAccess().getNumberSignKeyword_2_1());
		match_PubReferenceTargetName_NumberSignKeyword_1_q = new TokenAlias(false, true, grammarAccess.getPubReferenceTargetNameAccess().getNumberSignKeyword_1());
		match_PubRichTextParagraph_PKeyword_0_1_or_ParagraphKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPubRichTextParagraphAccess().getPKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getPubRichTextParagraphAccess().getParagraphKeyword_0_0()));
		match_PubSubsection_SubKeyword_0_0_or_SubsectionKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPubSubsectionAccess().getSubKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPubSubsectionAccess().getSubsectionKeyword_0_1()));
		match_PubSubsubsection_SubsubKeyword_0_0_or_SubsubsectionKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPubSubsubsectionAccess().getSubsubKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPubSubsubsectionAccess().getSubsubsectionKeyword_0_1()));
		match_PubTableCell___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubTableCellAccess().getLeftCurlyBracketKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getPubTableCellAccess().getRightCurlyBracketKeyword_4_0_2()));
		match_PubTableRow_FalseKeyword_1_0_0_0_1_1_q = new TokenAlias(false, true, grammarAccess.getPubTableRowAccess().getFalseKeyword_1_0_0_0_1_1());
		match_PubTableRow_VerticalLineVerticalLineKeyword_1_1_0_1_or___RowKeyword_1_0_0_0_0_FalseKeyword_1_0_0_0_1_1_q___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getRowKeyword_1_0_0_0_0()), new TokenAlias(false, true, grammarAccess.getPubTableRowAccess().getFalseKeyword_1_0_0_0_1_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getLeftCurlyBracketKeyword_1_0_1_0_0()), new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getRightCurlyBracketKeyword_1_0_1_0_2()))), new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getVerticalLineVerticalLineKeyword_1_1_0_1()));
		match_PubTableRow___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getLeftCurlyBracketKeyword_1_0_1_0_0()), new TokenAlias(false, false, grammarAccess.getPubTableRowAccess().getRightCurlyBracketKeyword_1_0_1_0_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDmxOpCastRule())
			return getDmxOpCastToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpInstanceOfRule())
			return getDmxOpInstanceOfToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDmxOpSingleAssignRule())
			return getDmxOpSingleAssignToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDomFieldListStartSymbolRule())
			return getDomFieldListStartSymbolToken(semanticObject, ruleCall, node);
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
	
	/**
	 * DomFieldListStartSymbol:
	 * 	'{';
	 */
	protected String getDomFieldListStartSymbolToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
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
			else if (match_PubCodeListing___NumberedKeyword_5_0_FalseKeyword_5_1_1__q.equals(syntax))
				emit_PubCodeListing___NumberedKeyword_5_0_FalseKeyword_5_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubGenerate___DiagramsKeyword_2_0_VectorKeyword_2_1_1__q.equals(syntax))
				emit_PubGenerate___DiagramsKeyword_2_0_VectorKeyword_2_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubListItem_HyphenMinusKeyword_1_1_0_or_ItemKeyword_1_0_0.equals(syntax))
				emit_PubListItem_HyphenMinusKeyword_1_1_0_or_ItemKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubListItem___LeftCurlyBracketKeyword_1_0_3_0_0_RightCurlyBracketKeyword_1_0_3_0_2__q.equals(syntax))
				emit_PubListItem___LeftCurlyBracketKeyword_1_0_3_0_0_RightCurlyBracketKeyword_1_0_3_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubList_NumberSignKeyword_2_1_q.equals(syntax))
				emit_PubList_NumberSignKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubReferenceTargetName_NumberSignKeyword_1_q.equals(syntax))
				emit_PubReferenceTargetName_NumberSignKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubRichTextParagraph_PKeyword_0_1_or_ParagraphKeyword_0_0.equals(syntax))
				emit_PubRichTextParagraph_PKeyword_0_1_or_ParagraphKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubSubsection_SubKeyword_0_0_or_SubsectionKeyword_0_1.equals(syntax))
				emit_PubSubsection_SubKeyword_0_0_or_SubsectionKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubSubsubsection_SubsubKeyword_0_0_or_SubsubsectionKeyword_0_1.equals(syntax))
				emit_PubSubsubsection_SubsubKeyword_0_0_or_SubsubsectionKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubTableCell___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__q.equals(syntax))
				emit_PubTableCell___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubTableRow_FalseKeyword_1_0_0_0_1_1_q.equals(syntax))
				emit_PubTableRow_FalseKeyword_1_0_0_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubTableRow_VerticalLineVerticalLineKeyword_1_1_0_1_or___RowKeyword_1_0_0_0_0_FalseKeyword_1_0_0_0_1_1_q___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q__.equals(syntax))
				emit_PubTableRow_VerticalLineVerticalLineKeyword_1_1_0_1_or___RowKeyword_1_0_0_0_0_FalseKeyword_1_0_0_0_1_1_q___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PubTableRow___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q.equals(syntax))
				emit_PubTableRow___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     (rule start) (ambiguity) '#' scope=PubReferenceScope
	 *     (rule start) (ambiguity) '#' target=[ReferenceTarget|DQualifiedName]
	 *     (rule start) (ambiguity) 'URL:' value=STRING
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
	 *     (rule start) (ambiguity) '#' scope=PubReferenceScope
	 *     (rule start) (ambiguity) '#' target=[ReferenceTarget|DQualifiedName]
	 *     (rule start) (ambiguity) 'URL:' value=STRING
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
	 *     ('numbered:' 'false')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'CodeListing' 'title:' 'false' '{' (ambiguity) 'include:' include=[EObject|DQualifiedName]
	 *     (rule start) 'CodeListing' 'title:' 'false' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'CodeListing' 'title:' 'false' '{' (ambiguity) codeLines+=STRING
	 *     name=ID ')' 'title:' 'false' '{' (ambiguity) 'include:' include=[EObject|DQualifiedName]
	 *     name=ID ')' 'title:' 'false' '{' (ambiguity) '}' (rule end)
	 *     name=ID ')' 'title:' 'false' '{' (ambiguity) codeLines+=STRING
	 *     title=DRichText '{' (ambiguity) 'include:' include=[EObject|DQualifiedName]
	 *     title=DRichText '{' (ambiguity) '}' (rule end)
	 *     title=DRichText '{' (ambiguity) codeLines+=STRING
	 */
	protected void emit_PubCodeListing___NumberedKeyword_5_0_FalseKeyword_5_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('diagrams:' 'vector')?
	 *
	 * This ambiguous syntax occurs at:
	 *     generateHtml?='html' (ambiguity) 'include:' includes+=[Component|ID]
	 *     generateHtml?='html' (ambiguity) (rule end)
	 *     generateHtml?='html' (ambiguity) segments+=PubDocumentSegment
	 *     generateHtml?='html' (ambiguity) symbols+=PubSymbol
	 *     generateLaTeX?='latex' (ambiguity) 'include:' includes+=[Component|ID]
	 *     generateLaTeX?='latex' (ambiguity) (rule end)
	 *     generateLaTeX?='latex' (ambiguity) segments+=PubDocumentSegment
	 *     generateLaTeX?='latex' (ambiguity) symbols+=PubSymbol
	 *     publicationClass=[PublicationClass|ID] 'generate' (ambiguity) 'include:' includes+=[Component|ID]
	 *     publicationClass=[PublicationClass|ID] 'generate' (ambiguity) (rule end)
	 *     publicationClass=[PublicationClass|ID] 'generate' (ambiguity) segments+=PubDocumentSegment
	 *     publicationClass=[PublicationClass|ID] 'generate' (ambiguity) symbols+=PubSymbol
	 */
	protected void emit_PubGenerate___DiagramsKeyword_2_0_VectorKeyword_2_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Item' | '-'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' '#'? name=ID
	 */
	protected void emit_PubListItem_HyphenMinusKeyword_1_1_0_or_ItemKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Item' (ambiguity) (rule start)
	 *     name=ID ')' (ambiguity) (rule end)
	 *     title=DRichText (ambiguity) (rule end)
	 */
	protected void emit_PubListItem___LeftCurlyBracketKeyword_1_0_3_0_0_RightCurlyBracketKeyword_1_0_3_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'List' '(' (ambiguity) name=ID
	 */
	protected void emit_PubList_NumberSignKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '#'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Admonition' '(' (ambiguity) name=ID
	 *     (rule start) 'Appendix' '(' (ambiguity) name=ID
	 *     (rule start) 'Chapter' '(' (ambiguity) name=ID
	 *     (rule start) 'CodeListing' '(' (ambiguity) name=ID
	 *     (rule start) 'Component' '(' (ambiguity) name=ID
	 *     (rule start) 'Equation' '(' (ambiguity) name=ID
	 *     (rule start) 'Figure' '(' (ambiguity) name=ID
	 *     (rule start) 'Part' '(' (ambiguity) name=ID
	 *     (rule start) 'Publication' '(' (ambiguity) name=ID
	 *     (rule start) 'Section' '(' (ambiguity) name=ID
	 *     (rule start) 'Table' '(' (ambiguity) name=ID
	 *     (rule start) ('Item' | '-') '(' (ambiguity) name=ID
	 *     (rule start) ('Sub' | 'Subsection') '(' (ambiguity) name=ID
	 *     (rule start) ('Subsub' | 'Subsubsection') '(' (ambiguity) name=ID
	 */
	protected void emit_PubReferenceTargetName_NumberSignKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Paragraph' | 'P'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) style=PubParagraphStyle
	 *     (rule start) (ambiguity) text=DRichText
	 */
	protected void emit_PubRichTextParagraph_PKeyword_0_1_or_ParagraphKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Sub' | 'Subsection'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' '#'? name=ID
	 *     (rule start) (ambiguity) 'include:' include=[Subsection|DQualifiedName]
	 *     (rule start) (ambiguity) title=DRichText
	 */
	protected void emit_PubSubsection_SubKeyword_0_0_or_SubsectionKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Subsub' | 'Subsubsection'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' '#'? name=ID
	 *     (rule start) (ambiguity) 'include:' include=[Subsubsection|DQualifiedName]
	 *     (rule start) (ambiguity) title=DRichText
	 */
	protected void emit_PubSubsubsection_SubsubKeyword_0_0_or_SubsubsectionKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Cell' (ambiguity) (rule start)
	 *     height=NATURAL (ambiguity) (rule end)
	 *     width=NATURAL (ambiguity) (rule end)
	 */
	protected void emit_PubTableCell___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'false'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Row' (ambiguity) '{' cells+=PubTableCell
	 *     (rule start) 'Row' (ambiguity) cells+=PubTableCell
	 */
	protected void emit_PubTableRow_FalseKeyword_1_0_0_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Row' 'false'? ('{' '}')?) | '||'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_PubTableRow_VerticalLineVerticalLineKeyword_1_1_0_1_or___RowKeyword_1_0_0_0_0_FalseKeyword_1_0_0_0_1_1_q___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     isHeading?='Header' 'Row' (ambiguity) (rule end)
	 *     isHeading?='true' (ambiguity) (rule end)
	 */
	protected void emit_PubTableRow___LeftCurlyBracketKeyword_1_0_1_0_0_RightCurlyBracketKeyword_1_0_1_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
