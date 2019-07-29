/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SusGrammarAccess extends AbstractGrammarElementFinder {
	
	public class UserStoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.sm.sus.Sus.UserStory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsDImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Keyword cUserKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cStoryKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameDQualifiedNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cRealisesKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cRealizesKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Assignment cEventAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cEventDDomainEventCrossReference_4_1_0 = (CrossReference)cEventAssignment_4_1.eContents().get(0);
		private final RuleCall cEventDDomainEventDQualifiedNameParserRuleCall_4_1_0_1 = (RuleCall)cEventDDomainEventCrossReference_4_1_0.eContents().get(1);
		private final Assignment cDescriptionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDescriptionDRichTextParserRuleCall_5_0 = (RuleCall)cDescriptionAssignment_5.eContents().get(0);
		private final Assignment cSectionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSectionsSectionParserRuleCall_6_0 = (RuleCall)cSectionsAssignment_6.eContents().get(0);
		
		//UserStory:
		//	imports+=DImport*
		//	'user' 'story'
		//	name=DQualifiedName (('realises' | 'realizes') event=[DDomainEvent|DQualifiedName])?
		//	description=DRichText?
		//	sections+=Section*;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=DImport* 'user' 'story' name=DQualifiedName (('realises' | 'realizes') event=[DDomainEvent|DQualifiedName])?
		//description=DRichText? sections+=Section*
		public Group getGroup() { return cGroup; }
		
		//imports+=DImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//DImport
		public RuleCall getImportsDImportParserRuleCall_0_0() { return cImportsDImportParserRuleCall_0_0; }
		
		//'user'
		public Keyword getUserKeyword_1() { return cUserKeyword_1; }
		
		//'story'
		public Keyword getStoryKeyword_2() { return cStoryKeyword_2; }
		
		//name=DQualifiedName
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//DQualifiedName
		public RuleCall getNameDQualifiedNameParserRuleCall_3_0() { return cNameDQualifiedNameParserRuleCall_3_0; }
		
		//(('realises' | 'realizes') event=[DDomainEvent|DQualifiedName])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'realises' | 'realizes'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'realises'
		public Keyword getRealisesKeyword_4_0_0() { return cRealisesKeyword_4_0_0; }
		
		//'realizes'
		public Keyword getRealizesKeyword_4_0_1() { return cRealizesKeyword_4_0_1; }
		
		//event=[DDomainEvent|DQualifiedName]
		public Assignment getEventAssignment_4_1() { return cEventAssignment_4_1; }
		
		//[DDomainEvent|DQualifiedName]
		public CrossReference getEventDDomainEventCrossReference_4_1_0() { return cEventDDomainEventCrossReference_4_1_0; }
		
		//DQualifiedName
		public RuleCall getEventDDomainEventDQualifiedNameParserRuleCall_4_1_0_1() { return cEventDDomainEventDQualifiedNameParserRuleCall_4_1_0_1; }
		
		//description=DRichText?
		public Assignment getDescriptionAssignment_5() { return cDescriptionAssignment_5; }
		
		//DRichText
		public RuleCall getDescriptionDRichTextParserRuleCall_5_0() { return cDescriptionDRichTextParserRuleCall_5_0; }
		
		//sections+=Section*
		public Assignment getSectionsAssignment_6() { return cSectionsAssignment_6; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_6_0() { return cSectionsSectionParserRuleCall_6_0; }
	}
	public class DImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.sm.sus.Sus.DImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//DImport:
		//	'import' importedNamespace=DQualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=DQualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=DQualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//DQualifiedNameWithWildcard
		public RuleCall getImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.sm.sus.Sus.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cParagraphsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParagraphsParagraphParserRuleCall_2_0 = (RuleCall)cParagraphsAssignment_2.eContents().get(0);
		
		//Section:
		//	'section' name=ID
		//	paragraphs+=Paragraph*;
		@Override public ParserRule getRule() { return rule; }
		
		//'section' name=ID paragraphs+=Paragraph*
		public Group getGroup() { return cGroup; }
		
		//'section'
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//paragraphs+=Paragraph*
		public Assignment getParagraphsAssignment_2() { return cParagraphsAssignment_2; }
		
		//Paragraph
		public RuleCall getParagraphsParagraphParserRuleCall_2_0() { return cParagraphsParagraphParserRuleCall_2_0; }
	}
	public class ParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.sm.sus.Sus.Paragraph");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextDRichTextParserRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Paragraph:
		//	text=DRichText;
		@Override public ParserRule getRule() { return rule; }
		
		//text=DRichText
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//DRichText
		public RuleCall getTextDRichTextParserRuleCall_0() { return cTextDRichTextParserRuleCall_0; }
	}
	
	
	private final UserStoryElements pUserStory;
	private final DImportElements pDImport;
	private final SectionElements pSection;
	private final ParagraphElements pParagraph;
	
	private final Grammar grammar;
	
	private final DmxGrammarAccess gaDmx;

	@Inject
	public SusGrammarAccess(GrammarProvider grammarProvider,
			DmxGrammarAccess gaDmx) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaDmx = gaDmx;
		this.pUserStory = new UserStoryElements();
		this.pDImport = new DImportElements();
		this.pSection = new SectionElements();
		this.pParagraph = new ParagraphElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.mimacom.ddd.sm.sus.Sus".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public DmxGrammarAccess getDmxGrammarAccess() {
		return gaDmx;
	}

	
	//UserStory:
	//	imports+=DImport*
	//	'user' 'story'
	//	name=DQualifiedName (('realises' | 'realizes') event=[DDomainEvent|DQualifiedName])?
	//	description=DRichText?
	//	sections+=Section*;
	public UserStoryElements getUserStoryAccess() {
		return pUserStory;
	}
	
	public ParserRule getUserStoryRule() {
		return getUserStoryAccess().getRule();
	}
	
	//DImport:
	//	'import' importedNamespace=DQualifiedNameWithWildcard;
	public DImportElements getDImportAccess() {
		return pDImport;
	}
	
	public ParserRule getDImportRule() {
		return getDImportAccess().getRule();
	}
	
	//Section:
	//	'section' name=ID
	//	paragraphs+=Paragraph*;
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//Paragraph:
	//	text=DRichText;
	public ParagraphElements getParagraphAccess() {
		return pParagraph;
	}
	
	public ParserRule getParagraphRule() {
		return getParagraphAccess().getRule();
	}
	
	//DmxNamespace:
	//	imports+=super::DImport*
	//	'namespace'
	//	name=DQualifiedName
	//	types+=DArchetype*
	//	filters+=DFilter* ('text' NATURAL ':' texts+=DRichText ';')* ('expr' NATURAL ':' expressions+=DExpression ';')*;
	public DmxGrammarAccess.DmxNamespaceElements getDmxNamespaceAccess() {
		return gaDmx.getDmxNamespaceAccess();
	}
	
	public ParserRule getDmxNamespaceRule() {
		return getDmxNamespaceAccess().getRule();
	}
	
	//enum DSystemType:
	//	VOID | BOOLEAN | NUMBER | TEXT | ID | TIMEPOINT | TYPE | OBJECT | ACTOR | OPERATION | LAMBDA;
	public DmxGrammarAccess.DSystemTypeElements getDSystemTypeAccess() {
		return gaDmx.getDSystemTypeAccess();
	}
	
	public EnumRule getDSystemTypeRule() {
		return getDSystemTypeAccess().getRule();
	}
	
	//DArchetype:
	//	'archetype'
	//	name=ID
	//	'is'
	//	systemType=DSystemType
	//	description=DRichText?;
	public DmxGrammarAccess.DArchetypeElements getDArchetypeAccess() {
		return gaDmx.getDArchetypeAccess();
	}
	
	public ParserRule getDArchetypeRule() {
		return getDArchetypeAccess().getRule();
	}
	
	//DFilter:
	//	DFunction | DIterator;
	public DmxGrammarAccess.DFilterElements getDFilterAccess() {
		return gaDmx.getDFilterAccess();
	}
	
	public ParserRule getDFilterRule() {
		return getDFilterAccess().getRule();
	}
	
	//DFunction:
	//	'function' name=ID
	//	'(' (parameters+=DFunctionParameter (',' parameters+=DFunctionParameter)*)? ')'
	//	':'
	//	systemType=DSystemType
	//	systemTypeMany?='*'?;
	public DmxGrammarAccess.DFunctionElements getDFunctionAccess() {
		return gaDmx.getDFunctionAccess();
	}
	
	public ParserRule getDFunctionRule() {
		return getDFunctionAccess().getRule();
	}
	
	//DFunctionParameter:
	//	name=ID
	//	':'
	//	systemType=DSystemType
	//	systemTypeMany?='*'?;
	public DmxGrammarAccess.DFunctionParameterElements getDFunctionParameterAccess() {
		return gaDmx.getDFunctionParameterAccess();
	}
	
	public ParserRule getDFunctionParameterRule() {
		return getDFunctionParameterAccess().getRule();
	}
	
	//DIterator:
	//	'iterator' name=ID
	//	':'
	//	systemType=DSystemType
	//	systemTypeMany?='*'?;
	public DmxGrammarAccess.DIteratorElements getDIteratorAccess() {
		return gaDmx.getDIteratorAccess();
	}
	
	public ParserRule getDIteratorRule() {
		return getDIteratorAccess().getRule();
	}
	
	//DExpression:
	//	DAssignment | DRichText;
	public DmxGrammarAccess.DExpressionElements getDExpressionAccess() {
		return gaDmx.getDExpressionAccess();
	}
	
	public ParserRule getDExpressionRule() {
		return getDExpressionAccess().getRule();
	}
	
	//DRichText:
	//	segments+=DTextOnly
	//	| segments+=DTextStart
	//	segments+=DExpression (segments+=DTextMiddle segments+=DExpression)*
	//	segments+=DTextEnd;
	public DmxGrammarAccess.DRichTextElements getDRichTextAccess() {
		return gaDmx.getDRichTextAccess();
	}
	
	public ParserRule getDRichTextRule() {
		return getDRichTextAccess().getRule();
	}
	
	//DTextOnly DTextSegment:
	//	value=PLAIN_TEXT_ONLY;
	public DmxGrammarAccess.DTextOnlyElements getDTextOnlyAccess() {
		return gaDmx.getDTextOnlyAccess();
	}
	
	public ParserRule getDTextOnlyRule() {
		return getDTextOnlyAccess().getRule();
	}
	
	//DTextStart DTextSegment:
	//	value=PLAIN_TEXT_START;
	public DmxGrammarAccess.DTextStartElements getDTextStartAccess() {
		return gaDmx.getDTextStartAccess();
	}
	
	public ParserRule getDTextStartRule() {
		return getDTextStartAccess().getRule();
	}
	
	//DTextMiddle DTextSegment:
	//	value=PLAIN_TEXT_MIDDLE;
	public DmxGrammarAccess.DTextMiddleElements getDTextMiddleAccess() {
		return gaDmx.getDTextMiddleAccess();
	}
	
	public ParserRule getDTextMiddleRule() {
		return getDTextMiddleAccess().getRule();
	}
	
	//DTextEnd DTextSegment:
	//	value=PLAIN_TEXT_END;
	public DmxGrammarAccess.DTextEndElements getDTextEndAccess() {
		return gaDmx.getDTextEndAccess();
	}
	
	public ParserRule getDTextEndRule() {
		return getDTextEndAccess().getRule();
	}
	
	//DAssignment DExpression:
	//	{DAssignment} assignToMember=[DNavigableMember] OpSingleAssign value=DAssignment
	//	| DOrExpression;
	public DmxGrammarAccess.DAssignmentElements getDAssignmentAccess() {
		return gaDmx.getDAssignmentAccess();
	}
	
	public ParserRule getDAssignmentRule() {
		return getDAssignmentAccess().getRule();
	}
	
	//OpSingleAssign:
	//	':=';
	public DmxGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaDmx.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}
	
	//DOrExpression DExpression:
	//	DAndExpression (=> ({DBinaryOperation.leftOperand=current} operator=OpOr) rightOperand=DAndExpression)*;
	public DmxGrammarAccess.DOrExpressionElements getDOrExpressionAccess() {
		return gaDmx.getDOrExpressionAccess();
	}
	
	public ParserRule getDOrExpressionRule() {
		return getDOrExpressionAccess().getRule();
	}
	
	//enum OpOr returns DBinaryOperator:
	//	OR | OR='or' | XOR | XOR='xor';
	public DmxGrammarAccess.OpOrElements getOpOrAccess() {
		return gaDmx.getOpOrAccess();
	}
	
	public EnumRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}
	
	//DAndExpression DExpression:
	//	DEqualityExpression (=> ({DBinaryOperation.leftOperand=current} operator=OpAnd) rightOperand=DEqualityExpression)*;
	public DmxGrammarAccess.DAndExpressionElements getDAndExpressionAccess() {
		return gaDmx.getDAndExpressionAccess();
	}
	
	public ParserRule getDAndExpressionRule() {
		return getDAndExpressionAccess().getRule();
	}
	
	//enum OpAnd returns DBinaryOperator:
	//	AND | AND='and';
	public DmxGrammarAccess.OpAndElements getOpAndAccess() {
		return gaDmx.getOpAndAccess();
	}
	
	public EnumRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}
	
	//DEqualityExpression DExpression:
	//	DRelationalExpression (=> ({DBinaryOperation.leftOperand=current} operator=OpEquality)
	//	rightOperand=DRelationalExpression)*;
	public DmxGrammarAccess.DEqualityExpressionElements getDEqualityExpressionAccess() {
		return gaDmx.getDEqualityExpressionAccess();
	}
	
	public ParserRule getDEqualityExpressionRule() {
		return getDEqualityExpressionAccess().getRule();
	}
	
	//enum OpEquality returns DBinaryOperator:
	//	EQUAL='=' | NOT_EQUAL='!=' | NOT_EQUAL='<>';
	public DmxGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaDmx.getOpEqualityAccess();
	}
	
	public EnumRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}
	
	//DRelationalExpression DExpression:
	//	DOtherOperatorExpression (=> ({DInstanceOfExpression.expression=current} OpInstanceOf) type=[DType] | =>
	//	({DBinaryOperation.leftOperand=current} operator=OpCompare) rightOperand=DOtherOperatorExpression)*;
	public DmxGrammarAccess.DRelationalExpressionElements getDRelationalExpressionAccess() {
		return gaDmx.getDRelationalExpressionAccess();
	}
	
	public ParserRule getDRelationalExpressionRule() {
		return getDRelationalExpressionAccess().getRule();
	}
	
	//OpInstanceOf:
	//	'ISA' | 'isa';
	public DmxGrammarAccess.OpInstanceOfElements getOpInstanceOfAccess() {
		return gaDmx.getOpInstanceOfAccess();
	}
	
	public ParserRule getOpInstanceOfRule() {
		return getOpInstanceOfAccess().getRule();
	}
	
	//enum OpCompare returns DBinaryOperator:
	//	LESS='<' | LESS_OR_EQUAL='<=' | LESS_OR_EQUAL='≤' | GREATER_OR_EQUAL='>=' | GREATER_OR_EQUAL='≥' | GREATER='>';
	public DmxGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaDmx.getOpCompareAccess();
	}
	
	public EnumRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}
	
	//DOtherOperatorExpression DExpression:
	//	DAdditiveExpression (=> ({DBinaryOperation.leftOperand=current} operator=OpOther) rightOperand=DAdditiveExpression)*;
	public DmxGrammarAccess.DOtherOperatorExpressionElements getDOtherOperatorExpressionAccess() {
		return gaDmx.getDOtherOperatorExpressionAccess();
	}
	
	public ParserRule getDOtherOperatorExpressionRule() {
		return getDOtherOperatorExpressionAccess().getRule();
	}
	
	//enum OpOther returns DBinaryOperator:
	//	UNTIL='..' | SINGLE_ARROW='->' | DOUBLE_ARROW='=>';
	public DmxGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaDmx.getOpOtherAccess();
	}
	
	public EnumRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}
	
	//DAdditiveExpression DExpression:
	//	DMultiplicativeExpression (=> ({DBinaryOperation.leftOperand=current} operator=OpAdd)
	//	rightOperand=DMultiplicativeExpression)*;
	public DmxGrammarAccess.DAdditiveExpressionElements getDAdditiveExpressionAccess() {
		return gaDmx.getDAdditiveExpressionAccess();
	}
	
	public ParserRule getDAdditiveExpressionRule() {
		return getDAdditiveExpressionAccess().getRule();
	}
	
	//enum OpAdd returns DBinaryOperator:
	//	ADD='+' | SUBTRACT='-';
	public DmxGrammarAccess.OpAddElements getOpAddAccess() {
		return gaDmx.getOpAddAccess();
	}
	
	public EnumRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}
	
	//DMultiplicativeExpression DExpression:
	//	DUnaryOperation (=> ({DBinaryOperation.leftOperand=current} operator=OpMulti) rightOperand=DUnaryOperation)*;
	public DmxGrammarAccess.DMultiplicativeExpressionElements getDMultiplicativeExpressionAccess() {
		return gaDmx.getDMultiplicativeExpressionAccess();
	}
	
	public ParserRule getDMultiplicativeExpressionRule() {
		return getDMultiplicativeExpressionAccess().getRule();
	}
	
	//enum OpMulti returns DBinaryOperator:
	//	MULTIPLY='*' | DIVIDE='/' | POWER='**' | MODULO='%';
	public DmxGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaDmx.getOpMultiAccess();
	}
	
	public EnumRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}
	
	//DUnaryOperation DExpression:
	//	{DUnaryOperation} operator=OpUnary operand=DUnaryOperation
	//	| DCastExpression;
	public DmxGrammarAccess.DUnaryOperationElements getDUnaryOperationAccess() {
		return gaDmx.getDUnaryOperationAccess();
	}
	
	public ParserRule getDUnaryOperationRule() {
		return getDUnaryOperationAccess().getRule();
	}
	
	//enum OpUnary returns DUnaryOperator:
	//	PLUS='+' | MINUS='-' | NOT='!' | NOT | NOT='not';
	public DmxGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaDmx.getOpUnaryAccess();
	}
	
	public EnumRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}
	
	//DCastExpression DExpression:
	//	DNavigableMemberReference (=> ({DCastExpression.target=current} OpCast) type=[DType])?;
	public DmxGrammarAccess.DCastExpressionElements getDCastExpressionAccess() {
		return gaDmx.getDCastExpressionAccess();
	}
	
	public ParserRule getDCastExpressionRule() {
		return getDCastExpressionAccess().getRule();
	}
	
	//OpCast:
	//	'AS' | 'as';
	public DmxGrammarAccess.OpCastElements getOpCastAccess() {
		return gaDmx.getOpCastAccess();
	}
	
	public ParserRule getOpCastRule() {
		return getOpCastAccess().getRule();
	}
	
	//DNavigableMemberReference DExpression:
	//	DPrimaryExpression (=> ({DAssignment.memberContainer=current} '.' assignToMember=[DNavigableMember] OpSingleAssign)
	//	value=DAssignment
	//	| => ({DNavigableMemberReference.memberContainerReference=current} '.') member=[DNavigableMember] (=>
	//	explicitOperationCall?='(' (memberCallArguments+=DExpression (',' memberCallArguments+=DExpression)*)?
	//	')'
	//	| before?="@before")?)*;
	public DmxGrammarAccess.DNavigableMemberReferenceElements getDNavigableMemberReferenceAccess() {
		return gaDmx.getDNavigableMemberReferenceAccess();
	}
	
	public ParserRule getDNavigableMemberReferenceRule() {
		return getDNavigableMemberReferenceAccess().getRule();
	}
	
	//DPrimaryExpression DExpression:
	//	DLiteralExpression | DSelfExpression | DReturnExpression | DRaiseExpression | DParenthesizedExpression | DFunctionCall
	//	| DConstructorCall | DContextReference | DIfExpression | DForLoopExpression;
	public DmxGrammarAccess.DPrimaryExpressionElements getDPrimaryExpressionAccess() {
		return gaDmx.getDPrimaryExpressionAccess();
	}
	
	public ParserRule getDPrimaryExpressionRule() {
		return getDPrimaryExpressionAccess().getRule();
	}
	
	//DLiteralExpression DExpression:
	//	DBooleanLiteral | DStringLiteral | DNaturalLiteral | DDecimalLiteral | DNilLiteral;
	public DmxGrammarAccess.DLiteralExpressionElements getDLiteralExpressionAccess() {
		return gaDmx.getDLiteralExpressionAccess();
	}
	
	public ParserRule getDLiteralExpressionRule() {
		return getDLiteralExpressionAccess().getRule();
	}
	
	//DSelfExpression DExpression:
	//	{DSelfExpression} ('SELF' | 'self');
	public DmxGrammarAccess.DSelfExpressionElements getDSelfExpressionAccess() {
		return gaDmx.getDSelfExpressionAccess();
	}
	
	public ParserRule getDSelfExpressionRule() {
		return getDSelfExpressionAccess().getRule();
	}
	
	//DReturnExpression DExpression:
	//	{DReturnExpression} ('RETURN' | 'return') -> expression=DExpression?;
	public DmxGrammarAccess.DReturnExpressionElements getDReturnExpressionAccess() {
		return gaDmx.getDReturnExpressionAccess();
	}
	
	public ParserRule getDReturnExpressionRule() {
		return getDReturnExpressionAccess().getRule();
	}
	
	//DRaiseExpression DExpression:
	//	{DRaiseExpression} ('RAISE' | 'raise') expression=DExpression;
	public DmxGrammarAccess.DRaiseExpressionElements getDRaiseExpressionAccess() {
		return gaDmx.getDRaiseExpressionAccess();
	}
	
	public ParserRule getDRaiseExpressionRule() {
		return getDRaiseExpressionAccess().getRule();
	}
	
	//DParenthesizedExpression DExpression:
	//	'(' DExpression ')';
	public DmxGrammarAccess.DParenthesizedExpressionElements getDParenthesizedExpressionAccess() {
		return gaDmx.getDParenthesizedExpressionAccess();
	}
	
	public ParserRule getDParenthesizedExpressionRule() {
		return getDParenthesizedExpressionAccess().getRule();
	}
	
	//DFunctionCall DExpression:
	//	{DFunctionCall} function=[DFunction]
	//	'(' (functionCallArguments+=DExpression (',' functionCallArguments+=DExpression)*)?
	//	')';
	public DmxGrammarAccess.DFunctionCallElements getDFunctionCallAccess() {
		return gaDmx.getDFunctionCallAccess();
	}
	
	public ParserRule getDFunctionCallRule() {
		return getDFunctionCallAccess().getRule();
	}
	
	//DConstructorCall DExpression:
	//	{DConstructorCall} OpConstructor constructor=[DComplexType] (=> explicitConstructorCall?='(' (arguments+=DExpression
	//	(',' arguments+=DExpression)*)?
	//	')')?;
	public DmxGrammarAccess.DConstructorCallElements getDConstructorCallAccess() {
		return gaDmx.getDConstructorCallAccess();
	}
	
	public ParserRule getDConstructorCallRule() {
		return getDConstructorCallAccess().getRule();
	}
	
	//OpConstructor:
	//	'NEW' | 'new';
	public DmxGrammarAccess.OpConstructorElements getOpConstructorAccess() {
		return gaDmx.getOpConstructorAccess();
	}
	
	public ParserRule getOpConstructorRule() {
		return getOpConstructorAccess().getRule();
	}
	
	//DContextReference DExpression:
	//	{DContextReference} (target=[DNamedElement] before?="@before"?
	//	| '['
	//	target=[IPrimaryNavigationTarget|DQualifiedName] ('#' member=[DNavigableMember])? ("|" (displayName=ID |
	//	plural?="*"))?
	//	-> ']');
	public DmxGrammarAccess.DContextReferenceElements getDContextReferenceAccess() {
		return gaDmx.getDContextReferenceAccess();
	}
	
	public ParserRule getDContextReferenceRule() {
		return getDContextReferenceAccess().getRule();
	}
	
	//DIfExpression DExpression:
	//	{DIfExpression}
	//	'if' if=DExpression
	//	'then' then=DExpression (=> 'else' else=DExpression)?
	//	'end';
	public DmxGrammarAccess.DIfExpressionElements getDIfExpressionAccess() {
		return gaDmx.getDIfExpressionAccess();
	}
	
	public ParserRule getDIfExpressionRule() {
		return getDIfExpressionAccess().getRule();
	}
	
	//DForLoopExpression DExpression:
	//	=> ({DForLoopExpression}
	//	'for' declaredParam=ID ':') forExpression=DExpression 'do'
	//	eachExpression=DExpression
	//	'end';
	public DmxGrammarAccess.DForLoopExpressionElements getDForLoopExpressionAccess() {
		return gaDmx.getDForLoopExpressionAccess();
	}
	
	public ParserRule getDForLoopExpressionRule() {
		return getDForLoopExpressionAccess().getRule();
	}
	
	//DMultiplicity:
	//	'(' minOccurs=NATURAL '..' maxOccurs=MULTIPLICITY ')';
	public DmxGrammarAccess.DMultiplicityElements getDMultiplicityAccess() {
		return gaDmx.getDMultiplicityAccess();
	}
	
	public ParserRule getDMultiplicityRule() {
		return getDMultiplicityAccess().getRule();
	}
	
	//MULTIPLICITY ecore::EInt:
	//	NATURAL | '*';
	public DmxGrammarAccess.MULTIPLICITYElements getMULTIPLICITYAccess() {
		return gaDmx.getMULTIPLICITYAccess();
	}
	
	public ParserRule getMULTIPLICITYRule() {
		return getMULTIPLICITYAccess().getRule();
	}
	
	//DBooleanLiteral DExpression:
	//	{DBooleanLiteral} (value?='TRUE' | value?='true' | 'FALSE' | 'false');
	public DmxGrammarAccess.DBooleanLiteralElements getDBooleanLiteralAccess() {
		return gaDmx.getDBooleanLiteralAccess();
	}
	
	public ParserRule getDBooleanLiteralRule() {
		return getDBooleanLiteralAccess().getRule();
	}
	
	//DStringLiteral DExpression:
	//	{DStringLiteral} value=STRING;
	public DmxGrammarAccess.DStringLiteralElements getDStringLiteralAccess() {
		return gaDmx.getDStringLiteralAccess();
	}
	
	public ParserRule getDStringLiteralRule() {
		return getDStringLiteralAccess().getRule();
	}
	
	//DNaturalLiteral DExpression:
	//	{DNaturalLiteral} value=NATURAL;
	public DmxGrammarAccess.DNaturalLiteralElements getDNaturalLiteralAccess() {
		return gaDmx.getDNaturalLiteralAccess();
	}
	
	public ParserRule getDNaturalLiteralRule() {
		return getDNaturalLiteralAccess().getRule();
	}
	
	//DDecimalLiteral DExpression:
	//	{DDecimalLiteral} value=DECIMAL;
	public DmxGrammarAccess.DDecimalLiteralElements getDDecimalLiteralAccess() {
		return gaDmx.getDDecimalLiteralAccess();
	}
	
	public ParserRule getDDecimalLiteralRule() {
		return getDDecimalLiteralAccess().getRule();
	}
	
	//DNilLiteral DExpression:
	//	{DUndefinedLiteral} ('UNDEFINED' | 'undefined');
	public DmxGrammarAccess.DNilLiteralElements getDNilLiteralAccess() {
		return gaDmx.getDNilLiteralAccess();
	}
	
	public ParserRule getDNilLiteralRule() {
		return getDNilLiteralAccess().getRule();
	}
	
	//DECIMAL:
	//	NATURAL '.' NATURAL (('E' | 'e') ('+' | '-')? NATURAL)?;
	public DmxGrammarAccess.DECIMALElements getDECIMALAccess() {
		return gaDmx.getDECIMALAccess();
	}
	
	public ParserRule getDECIMALRule() {
		return getDECIMALAccess().getRule();
	}
	
	//DQualifiedNameWithWildcard:
	//	DQualifiedName '.*'?;
	public DmxGrammarAccess.DQualifiedNameWithWildcardElements getDQualifiedNameWithWildcardAccess() {
		return gaDmx.getDQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getDQualifiedNameWithWildcardRule() {
		return getDQualifiedNameWithWildcardAccess().getRule();
	}
	
	//DQualifiedName:
	//	ID ('.' ID)*;
	public DmxGrammarAccess.DQualifiedNameElements getDQualifiedNameAccess() {
		return gaDmx.getDQualifiedNameAccess();
	}
	
	public ParserRule getDQualifiedNameRule() {
		return getDQualifiedNameAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? (LETTER | '_') (LETTER | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaDmx.getIDRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"';
	public TerminalRule getSTRINGRule() {
		return gaDmx.getSTRINGRule();
	}
	
	//terminal NATURAL returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getNATURALRule() {
		return gaDmx.getNATURALRule();
	}
	
	//terminal fragment LETTER:
	//	'a'..'z' | 'A'..'Z' | '\\u00c0'..'\\u00d6' | '\\u00d8'..'\\u00f6' | '\\u00f8'..'\\u00ff';
	public TerminalRule getLETTERRule() {
		return gaDmx.getLETTERRule();
	}
	
	//terminal fragment PLAIN_TEXT:
	//	!('»' | ']' | '[');
	public TerminalRule getPLAIN_TEXTRule() {
		return gaDmx.getPLAIN_TEXTRule();
	}
	
	//terminal PLAIN_TEXT_ONLY:
	//	'«' PLAIN_TEXT* '»';
	public TerminalRule getPLAIN_TEXT_ONLYRule() {
		return gaDmx.getPLAIN_TEXT_ONLYRule();
	}
	
	//terminal PLAIN_TEXT_START:
	//	'«' PLAIN_TEXT* '[';
	public TerminalRule getPLAIN_TEXT_STARTRule() {
		return gaDmx.getPLAIN_TEXT_STARTRule();
	}
	
	//terminal PLAIN_TEXT_MIDDLE:
	//	']' PLAIN_TEXT* '[';
	public TerminalRule getPLAIN_TEXT_MIDDLERule() {
		return gaDmx.getPLAIN_TEXT_MIDDLERule();
	}
	
	//terminal PLAIN_TEXT_END:
	//	']' PLAIN_TEXT* '»';
	public TerminalRule getPLAIN_TEXT_ENDRule() {
		return gaDmx.getPLAIN_TEXT_ENDRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaDmx.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDmx.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaDmx.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaDmx.getANY_OTHERRule();
	}
}