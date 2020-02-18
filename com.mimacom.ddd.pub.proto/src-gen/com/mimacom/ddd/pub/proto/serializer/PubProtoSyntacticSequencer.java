/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.proto.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.pub.proto.services.PubProtoGrammarAccess;
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
public class PubProtoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PubProtoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3;
	protected AbstractElementAlias match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1;
	protected AbstractElementAlias match_ProtoPublicationBody___AppendixKeyword_4_0_FalseKeyword_4_1_1__q;
	protected AbstractElementAlias match_ProtoPublicationBody___PartsKeyword_3_0_FalseKeyword_3_1_1__q;
	protected AbstractElementAlias match_SegmentBody___OptionalKeyword_1_0_FalseKeyword_1_1_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PubProtoGrammarAccess) access;
		match_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDmxBooleanLiteralAccess().getFalseKeyword_1_3()));
		match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDmxUndefinedLiteralAccess().getUndefinedKeyword_1_1()));
		match_ProtoPublicationBody___AppendixKeyword_4_0_FalseKeyword_4_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProtoPublicationBodyAccess().getAppendixKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_4_1_1()));
		match_ProtoPublicationBody___PartsKeyword_3_0_FalseKeyword_3_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProtoPublicationBodyAccess().getPartsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getProtoPublicationBodyAccess().getFalseKeyword_3_1_1()));
		match_SegmentBody___OptionalKeyword_1_0_FalseKeyword_1_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSegmentBodyAccess().getOptionalKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getSegmentBodyAccess().getFalseKeyword_1_1_1()));
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
			else if (match_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1.equals(syntax))
				emit_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProtoPublicationBody___AppendixKeyword_4_0_FalseKeyword_4_1_1__q.equals(syntax))
				emit_ProtoPublicationBody___AppendixKeyword_4_0_FalseKeyword_4_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ProtoPublicationBody___PartsKeyword_3_0_FalseKeyword_3_1_1__q.equals(syntax))
				emit_ProtoPublicationBody___PartsKeyword_3_0_FalseKeyword_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SegmentBody___OptionalKeyword_1_0_FalseKeyword_1_1_1__q.equals(syntax))
				emit_SegmentBody___OptionalKeyword_1_0_FalseKeyword_1_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'FALSE' | 'false'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_DmxBooleanLiteral_FALSEKeyword_1_2_or_FalseKeyword_1_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'UNDEFINED' | 'undefined'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_DmxUndefinedLiteral_UNDEFINEDKeyword_1_0_or_UndefinedKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('appendix:' 'false')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Body' '{' ('parts:' 'false')? (ambiguity) '}' (rule start)
	 *     allowParts?='true' (ambiguity) '}' (rule end)
	 */
	protected void emit_ProtoPublicationBody___AppendixKeyword_4_0_FalseKeyword_4_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('parts:' 'false')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Body' '{' (ambiguity) 'appendix:' allowAppendix?='true'
	 *     (rule start) 'Body' '{' (ambiguity) ('appendix:' 'false')? '}' (rule start)
	 */
	protected void emit_ProtoPublicationBody___PartsKeyword_3_0_FalseKeyword_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('optional:' 'false')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Abbreviations' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Abstract' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Bibliography' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'ChangeHistory' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Epilogue' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Glossary' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Index' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'ListOfFigures' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'ListOfTables' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'Preface' '{' (ambiguity) '}' (rule start)
	 *     (rule start) 'TableOfContents' '{' (ambiguity) 'maxLevel:' maxLevel=NATURAL
	 *     (rule start) 'TableOfContents' '{' (ambiguity) '}' (rule start)
	 *     title=STRING (ambiguity) 'maxLevel:' maxLevel=NATURAL
	 *     title=STRING (ambiguity) '}' (rule end)
	 */
	protected void emit_SegmentBody___OptionalKeyword_1_0_FalseKeyword_1_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
