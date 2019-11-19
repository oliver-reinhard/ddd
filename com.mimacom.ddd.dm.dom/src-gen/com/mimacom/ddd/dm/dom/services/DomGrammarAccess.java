/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dom.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class DomGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.dm.dom.Dom.DomModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsDImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Keyword cDomainKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameDQualifiedNameParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cSnapshotsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSnapshotsDomSnapshotParserRuleCall_3_0 = (RuleCall)cSnapshotsAssignment_3.eContents().get(0);
		
		//DomModel:
		//	imports+=DImport*
		//	'domain'
		//	name=DQualifiedName
		//	snapshots+=DomSnapshot+;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=DImport* 'domain' name=DQualifiedName snapshots+=DomSnapshot+
		public Group getGroup() { return cGroup; }
		
		//imports+=DImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//DImport
		public RuleCall getImportsDImportParserRuleCall_0_0() { return cImportsDImportParserRuleCall_0_0; }
		
		//'domain'
		public Keyword getDomainKeyword_1() { return cDomainKeyword_1; }
		
		//name=DQualifiedName
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//DQualifiedName
		public RuleCall getNameDQualifiedNameParserRuleCall_2_0() { return cNameDQualifiedNameParserRuleCall_2_0; }
		
		//snapshots+=DomSnapshot+
		public Assignment getSnapshotsAssignment_3() { return cSnapshotsAssignment_3; }
		
		//DomSnapshot
		public RuleCall getSnapshotsDomSnapshotParserRuleCall_3_0() { return cSnapshotsDomSnapshotParserRuleCall_3_0; }
	}
	public class DomSnapshotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.dm.dom.Dom.DomSnapshot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSnapshotKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cObjectsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cObjectsDomObjectParserRuleCall_3_0 = (RuleCall)cObjectsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DomSnapshot:
		//	'snapshot' name=ID
		//	'{'
		//	objects+=DomObject*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'snapshot' name=ID '{' objects+=DomObject* '}'
		public Group getGroup() { return cGroup; }
		
		//'snapshot'
		public Keyword getSnapshotKeyword_0() { return cSnapshotKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//objects+=DomObject*
		public Assignment getObjectsAssignment_3() { return cObjectsAssignment_3; }
		
		//DomObject
		public RuleCall getObjectsDomObjectParserRuleCall_3_0() { return cObjectsDomObjectParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DomObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.dm.dom.Dom.DomObject");
		private final RuleCall cDomNamedComplexObjectParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DomObject:
		//	DomNamedComplexObject;
		@Override public ParserRule getRule() { return rule; }
		
		//DomNamedComplexObject
		public RuleCall getDomNamedComplexObjectParserRuleCall() { return cDomNamedComplexObjectParserRuleCall; }
	}
	public class DomNamedComplexObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.mimacom.ddd.dm.dom.Dom.DomNamedComplexObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cObjectAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cObjectAlternatives_2_0 = (Alternatives)cObjectAssignment_2.eContents().get(0);
		private final RuleCall cObjectDmxEntityParserRuleCall_2_0_0 = (RuleCall)cObjectAlternatives_2_0.eContents().get(0);
		private final RuleCall cObjectDmxDetailParserRuleCall_2_0_1 = (RuleCall)cObjectAlternatives_2_0.eContents().get(1);
		
		//DomNamedComplexObject:
		//	name=ID
		//	'='
		//	object=(DmxEntity | DmxDetail);
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' object=(DmxEntity | DmxDetail)
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//object=(DmxEntity | DmxDetail)
		public Assignment getObjectAssignment_2() { return cObjectAssignment_2; }
		
		//(DmxEntity | DmxDetail)
		public Alternatives getObjectAlternatives_2_0() { return cObjectAlternatives_2_0; }
		
		//DmxEntity
		public RuleCall getObjectDmxEntityParserRuleCall_2_0_0() { return cObjectDmxEntityParserRuleCall_2_0_0; }
		
		//DmxDetail
		public RuleCall getObjectDmxDetailParserRuleCall_2_0_1() { return cObjectDmxDetailParserRuleCall_2_0_1; }
	}
	
	
	private final DomModelElements pDomModel;
	private final DomSnapshotElements pDomSnapshot;
	private final DomObjectElements pDomObject;
	private final DomNamedComplexObjectElements pDomNamedComplexObject;
	
	private final Grammar grammar;
	
	private final DmxGrammarAccess gaDmx;

	@Inject
	public DomGrammarAccess(GrammarProvider grammarProvider,
			DmxGrammarAccess gaDmx) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaDmx = gaDmx;
		this.pDomModel = new DomModelElements();
		this.pDomSnapshot = new DomSnapshotElements();
		this.pDomObject = new DomObjectElements();
		this.pDomNamedComplexObject = new DomNamedComplexObjectElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.mimacom.ddd.dm.dom.Dom".equals(grammar.getName())) {
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

	
	//DomModel:
	//	imports+=DImport*
	//	'domain'
	//	name=DQualifiedName
	//	snapshots+=DomSnapshot+;
	public DomModelElements getDomModelAccess() {
		return pDomModel;
	}
	
	public ParserRule getDomModelRule() {
		return getDomModelAccess().getRule();
	}
	
	//DomSnapshot:
	//	'snapshot' name=ID
	//	'{'
	//	objects+=DomObject*
	//	'}';
	public DomSnapshotElements getDomSnapshotAccess() {
		return pDomSnapshot;
	}
	
	public ParserRule getDomSnapshotRule() {
		return getDomSnapshotAccess().getRule();
	}
	
	//DomObject:
	//	DomNamedComplexObject;
	public DomObjectElements getDomObjectAccess() {
		return pDomObject;
	}
	
	public ParserRule getDomObjectRule() {
		return getDomObjectAccess().getRule();
	}
	
	//DomNamedComplexObject:
	//	name=ID
	//	'='
	//	object=(DmxEntity | DmxDetail);
	public DomNamedComplexObjectElements getDomNamedComplexObjectAccess() {
		return pDomNamedComplexObject;
	}
	
	public ParserRule getDomNamedComplexObjectRule() {
		return getDomNamedComplexObjectAccess().getRule();
	}
	
	//DmxNamespace:
	//	imports+=DImport*
	//	'namespace'
	//	name=DQualifiedName
	//	types+=DmxArchetype*
	//	filters+=DmxFilter*
	//	// For unit-testing purposes:
	//	tests+=DmxTest*;
	public DmxGrammarAccess.DmxNamespaceElements getDmxNamespaceAccess() {
		return gaDmx.getDmxNamespaceAccess();
	}
	
	public ParserRule getDmxNamespaceRule() {
		return getDmxNamespaceAccess().getRule();
	}
	
	//DImport:
	//	'import' importedNamespace=DQualifiedNameWithWildcard;
	public DmxGrammarAccess.DImportElements getDImportAccess() {
		return gaDmx.getDImportAccess();
	}
	
	public ParserRule getDImportRule() {
		return getDImportAccess().getRule();
	}
	
	///* 
	// * Testing
	// */ DmxTest:
	//	'test'
	//	name=ID ('context'
	//	context+=DmxTestContext (',' context+=DmxTestContext)*)?
	//	'{'
	//	expr=DExpression
	//	'}';
	public DmxGrammarAccess.DmxTestElements getDmxTestAccess() {
		return gaDmx.getDmxTestAccess();
	}
	
	public ParserRule getDmxTestRule() {
		return getDmxTestAccess().getRule();
	}
	
	//DmxTestContext:
	//	name=ID
	//	':'
	//	type=[DType] multiplicity=DMultiplicity? (':=' (value=DmxLiteralExpression | value=DmxLiteralListExpression))?;
	public DmxGrammarAccess.DmxTestContextElements getDmxTestContextAccess() {
		return gaDmx.getDmxTestContextAccess();
	}
	
	public ParserRule getDmxTestContextRule() {
		return getDmxTestContextAccess().getRule();
	}
	
	//enum DmxBaseType:
	//	VOID | BOOLEAN | NUMBER | TEXT | IDENTIFIER | TIMEPOINT | STATE /*transition*/ | STATE_EVENT | COMPLEX | NOTIFICATION
	//	/*sent* */ | SERVICE /*invoked* */;
	public DmxGrammarAccess.DmxBaseTypeElements getDmxBaseTypeAccess() {
		return gaDmx.getDmxBaseTypeAccess();
	}
	
	public EnumRule getDmxBaseTypeRule() {
		return getDmxBaseTypeAccess().getRule();
	}
	
	//DmxBaseTypeSet:
	//	name=ID
	//	'in'
	//	'(' members+=DmxBaseType (',' members+=DmxBaseType)+ ')';
	public DmxGrammarAccess.DmxBaseTypeSetElements getDmxBaseTypeSetAccess() {
		return gaDmx.getDmxBaseTypeSetAccess();
	}
	
	public ParserRule getDmxBaseTypeSetRule() {
		return getDmxBaseTypeSetAccess().getRule();
	}
	
	//DmxArchetype:
	//	'archetype'
	//	name=ID
	//	'is'
	//	baseType=DmxBaseType
	//	description=DRichText?;
	public DmxGrammarAccess.DmxArchetypeElements getDmxArchetypeAccess() {
		return gaDmx.getDmxArchetypeAccess();
	}
	
	public ParserRule getDmxArchetypeRule() {
		return getDmxArchetypeAccess().getRule();
	}
	
	//DmxFilter:
	//	'filter'
	//	name=ID
	//	'(' (parameters+=DmxFilterParameter (',' parameters+=DmxFilterParameter)*)? ')'
	//	':'
	//	typeDesc=DmxFilterTypeDescriptor ('with' withTypeSet=DmxBaseTypeSet)?;
	public DmxGrammarAccess.DmxFilterElements getDmxFilterAccess() {
		return gaDmx.getDmxFilterAccess();
	}
	
	public ParserRule getDmxFilterRule() {
		return getDmxFilterAccess().getRule();
	}
	
	//DmxFilterTypeDescriptor:
	//	(single=DmxBaseType
	//	| multiple=[DmxBaseTypeSet]) collection?='*'?;
	public DmxGrammarAccess.DmxFilterTypeDescriptorElements getDmxFilterTypeDescriptorAccess() {
		return gaDmx.getDmxFilterTypeDescriptorAccess();
	}
	
	public ParserRule getDmxFilterTypeDescriptorRule() {
		return getDmxFilterTypeDescriptorAccess().getRule();
	}
	
	//DmxFilterParameter:
	//	name=ID
	//	':'
	//	typeDesc=DmxFilterTypeDescriptor;
	public DmxGrammarAccess.DmxFilterParameterElements getDmxFilterParameterAccess() {
		return gaDmx.getDmxFilterParameterAccess();
	}
	
	public ParserRule getDmxFilterParameterRule() {
		return getDmxFilterParameterAccess().getRule();
	}
	
	///*
	// * Expressions
	// */ DExpression:
	//	DmxAssignment | DmxPredicateWithCorrelationVariable | DRichText;
	public DmxGrammarAccess.DExpressionElements getDExpressionAccess() {
		return gaDmx.getDExpressionAccess();
	}
	
	public ParserRule getDExpressionRule() {
		return getDExpressionAccess().getRule();
	}
	
	//DRichText:
	//	segments+=DmxTextOnly
	//	| segments+=DmxTextStart
	//	segments+=DExpression (segments+=DmxTextMiddle segments+=DExpression)*
	//	segments+=DmxTextEnd;
	public DmxGrammarAccess.DRichTextElements getDRichTextAccess() {
		return gaDmx.getDRichTextAccess();
	}
	
	public ParserRule getDRichTextRule() {
		return getDRichTextAccess().getRule();
	}
	
	//DmxTextOnly DTextSegment:
	//	value=PLAIN_TEXT_ONLY;
	public DmxGrammarAccess.DmxTextOnlyElements getDmxTextOnlyAccess() {
		return gaDmx.getDmxTextOnlyAccess();
	}
	
	public ParserRule getDmxTextOnlyRule() {
		return getDmxTextOnlyAccess().getRule();
	}
	
	//DmxTextStart DTextSegment:
	//	value=PLAIN_TEXT_START;
	public DmxGrammarAccess.DmxTextStartElements getDmxTextStartAccess() {
		return gaDmx.getDmxTextStartAccess();
	}
	
	public ParserRule getDmxTextStartRule() {
		return getDmxTextStartAccess().getRule();
	}
	
	//DmxTextMiddle DTextSegment:
	//	value=PLAIN_TEXT_MIDDLE;
	public DmxGrammarAccess.DmxTextMiddleElements getDmxTextMiddleAccess() {
		return gaDmx.getDmxTextMiddleAccess();
	}
	
	public ParserRule getDmxTextMiddleRule() {
		return getDmxTextMiddleAccess().getRule();
	}
	
	//DmxTextEnd DTextSegment:
	//	value=PLAIN_TEXT_END;
	public DmxGrammarAccess.DmxTextEndElements getDmxTextEndAccess() {
		return gaDmx.getDmxTextEndAccess();
	}
	
	public ParserRule getDmxTextEndRule() {
		return getDmxTextEndAccess().getRule();
	}
	
	//DmxNavigableMemberReference DExpression:
	//	DmxPrimaryExpression (=> ({DmxAssignment.precedingNavigationSegment=current} '.'
	//	assignToMember=[DNavigableMember] DmxOpSingleAssign) value=DmxOrExpression
	//	| => ({DmxMemberNavigation.precedingNavigationSegment=current} '.') member=[DNavigableMember] (=>
	//	explicitOperationCall?='(' // => boolean => has 0.n explicit arguments
	//	callArguments=DmxCallArguments
	//	')'
	//	| before?="@before")?)*;
	public DmxGrammarAccess.DmxNavigableMemberReferenceElements getDmxNavigableMemberReferenceAccess() {
		return gaDmx.getDmxNavigableMemberReferenceAccess();
	}
	
	public ParserRule getDmxNavigableMemberReferenceRule() {
		return getDmxNavigableMemberReferenceAccess().getRule();
	}
	
	//DmxCallArguments:
	//	{DmxCallArguments} (arguments+=DmxPredicateWithCorrelationVariable (','
	//	arguments+=DmxPredicateWithCorrelationVariable)*)?;
	public DmxGrammarAccess.DmxCallArgumentsElements getDmxCallArgumentsAccess() {
		return gaDmx.getDmxCallArgumentsAccess();
	}
	
	public ParserRule getDmxCallArgumentsRule() {
		return getDmxCallArgumentsAccess().getRule();
	}
	
	//DmxAssignment DExpression:
	//	{DmxAssignment} assignToMember=[DNavigableMember] DmxOpSingleAssign value=DmxOrExpression;
	public DmxGrammarAccess.DmxAssignmentElements getDmxAssignmentAccess() {
		return gaDmx.getDmxAssignmentAccess();
	}
	
	public ParserRule getDmxAssignmentRule() {
		return getDmxAssignmentAccess().getRule();
	}
	
	//DmxOpSingleAssign:
	//	':=';
	public DmxGrammarAccess.DmxOpSingleAssignElements getDmxOpSingleAssignAccess() {
		return gaDmx.getDmxOpSingleAssignAccess();
	}
	
	public ParserRule getDmxOpSingleAssignRule() {
		return getDmxOpSingleAssignAccess().getRule();
	}
	
	//DmxPredicateWithCorrelationVariable DExpression:
	//	{DmxPredicateWithCorrelationVariable} correlationVariable=DmxCorrelationVariable
	//	'|'
	//	predicate=DmxOrExpression
	//	| DmxOrExpression;
	public DmxGrammarAccess.DmxPredicateWithCorrelationVariableElements getDmxPredicateWithCorrelationVariableAccess() {
		return gaDmx.getDmxPredicateWithCorrelationVariableAccess();
	}
	
	public ParserRule getDmxPredicateWithCorrelationVariableRule() {
		return getDmxPredicateWithCorrelationVariableAccess().getRule();
	}
	
	//DmxCorrelationVariable:
	//	name=ID;
	public DmxGrammarAccess.DmxCorrelationVariableElements getDmxCorrelationVariableAccess() {
		return gaDmx.getDmxCorrelationVariableAccess();
	}
	
	public ParserRule getDmxCorrelationVariableRule() {
		return getDmxCorrelationVariableAccess().getRule();
	}
	
	////	(':' type=[DType])? => type is always NULL!
	//DmxOrExpression DExpression:
	//	DmxAndExpression (=> ({DmxBinaryOperation.leftOperand=current} operator=DmxOpOr) rightOperand=DmxAndExpression)*;
	public DmxGrammarAccess.DmxOrExpressionElements getDmxOrExpressionAccess() {
		return gaDmx.getDmxOrExpressionAccess();
	}
	
	public ParserRule getDmxOrExpressionRule() {
		return getDmxOrExpressionAccess().getRule();
	}
	
	//enum DmxOpOr returns DmxBinaryOperator:
	//	OR | OR='or' | XOR | XOR='xor';
	public DmxGrammarAccess.DmxOpOrElements getDmxOpOrAccess() {
		return gaDmx.getDmxOpOrAccess();
	}
	
	public EnumRule getDmxOpOrRule() {
		return getDmxOpOrAccess().getRule();
	}
	
	//DmxAndExpression DExpression:
	//	DmxEqualityExpression (=> ({DmxBinaryOperation.leftOperand=current} operator=DmxOpAnd)
	//	rightOperand=DmxEqualityExpression)*;
	public DmxGrammarAccess.DmxAndExpressionElements getDmxAndExpressionAccess() {
		return gaDmx.getDmxAndExpressionAccess();
	}
	
	public ParserRule getDmxAndExpressionRule() {
		return getDmxAndExpressionAccess().getRule();
	}
	
	//enum DmxOpAnd returns DmxBinaryOperator:
	//	AND | AND='and';
	public DmxGrammarAccess.DmxOpAndElements getDmxOpAndAccess() {
		return gaDmx.getDmxOpAndAccess();
	}
	
	public EnumRule getDmxOpAndRule() {
		return getDmxOpAndAccess().getRule();
	}
	
	//DmxEqualityExpression DExpression:
	//	DmxRelationalExpression (=> ({DmxBinaryOperation.leftOperand=current} operator=DmxOpEquality)
	//	rightOperand=DmxRelationalExpression)*;
	public DmxGrammarAccess.DmxEqualityExpressionElements getDmxEqualityExpressionAccess() {
		return gaDmx.getDmxEqualityExpressionAccess();
	}
	
	public ParserRule getDmxEqualityExpressionRule() {
		return getDmxEqualityExpressionAccess().getRule();
	}
	
	//enum DmxOpEquality returns DmxBinaryOperator:
	//	EQUAL='=' | NOT_EQUAL='!=' | NOT_EQUAL='<>';
	public DmxGrammarAccess.DmxOpEqualityElements getDmxOpEqualityAccess() {
		return gaDmx.getDmxOpEqualityAccess();
	}
	
	public EnumRule getDmxOpEqualityRule() {
		return getDmxOpEqualityAccess().getRule();
	}
	
	//DmxRelationalExpression DExpression:
	//	DmxOtherOperatorExpression (=> ({DmxInstanceOfExpression.expression=current} DmxOpInstanceOf) type=[DType] | =>
	//	({DmxBinaryOperation.leftOperand=current} operator=OpCompare) rightOperand=DmxOtherOperatorExpression)*;
	public DmxGrammarAccess.DmxRelationalExpressionElements getDmxRelationalExpressionAccess() {
		return gaDmx.getDmxRelationalExpressionAccess();
	}
	
	public ParserRule getDmxRelationalExpressionRule() {
		return getDmxRelationalExpressionAccess().getRule();
	}
	
	//DmxOpInstanceOf:
	//	'ISA' | 'isa';
	public DmxGrammarAccess.DmxOpInstanceOfElements getDmxOpInstanceOfAccess() {
		return gaDmx.getDmxOpInstanceOfAccess();
	}
	
	public ParserRule getDmxOpInstanceOfRule() {
		return getDmxOpInstanceOfAccess().getRule();
	}
	
	//enum OpCompare returns DmxBinaryOperator:
	//	LESS='<' | LESS_OR_EQUAL='<=' | LESS_OR_EQUAL='≤' | GREATER_OR_EQUAL='>=' | GREATER_OR_EQUAL='≥' | GREATER='>';
	public DmxGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaDmx.getOpCompareAccess();
	}
	
	public EnumRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}
	
	//DmxOtherOperatorExpression DExpression:
	//	DmxAdditiveExpression (=> ({DmxBinaryOperation.leftOperand=current} operator=OpOther)
	//	rightOperand=DmxAdditiveExpression)*;
	public DmxGrammarAccess.DmxOtherOperatorExpressionElements getDmxOtherOperatorExpressionAccess() {
		return gaDmx.getDmxOtherOperatorExpressionAccess();
	}
	
	public ParserRule getDmxOtherOperatorExpressionRule() {
		return getDmxOtherOperatorExpressionAccess().getRule();
	}
	
	//enum OpOther returns DmxBinaryOperator:
	//	IN | IN='in' | UNTIL='..' | SINGLE_ARROW='->' | DOUBLE_ARROW='=>';
	public DmxGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaDmx.getOpOtherAccess();
	}
	
	public EnumRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}
	
	//DmxAdditiveExpression DExpression:
	//	DmxMultiplicativeExpression (=> ({DmxBinaryOperation.leftOperand=current} operator=OpAdd)
	//	rightOperand=DmxMultiplicativeExpression)*;
	public DmxGrammarAccess.DmxAdditiveExpressionElements getDmxAdditiveExpressionAccess() {
		return gaDmx.getDmxAdditiveExpressionAccess();
	}
	
	public ParserRule getDmxAdditiveExpressionRule() {
		return getDmxAdditiveExpressionAccess().getRule();
	}
	
	//enum OpAdd returns DmxBinaryOperator:
	//	ADD='+' | SUBTRACT='-';
	public DmxGrammarAccess.OpAddElements getOpAddAccess() {
		return gaDmx.getOpAddAccess();
	}
	
	public EnumRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}
	
	//DmxMultiplicativeExpression DExpression:
	//	DmxUnaryOperation (=> ({DmxBinaryOperation.leftOperand=current} operator=OpMulti) rightOperand=DmxUnaryOperation)*;
	public DmxGrammarAccess.DmxMultiplicativeExpressionElements getDmxMultiplicativeExpressionAccess() {
		return gaDmx.getDmxMultiplicativeExpressionAccess();
	}
	
	public ParserRule getDmxMultiplicativeExpressionRule() {
		return getDmxMultiplicativeExpressionAccess().getRule();
	}
	
	//enum OpMulti returns DmxBinaryOperator:
	//	MULTIPLY='*' | DIVIDE='/' | POWER='**' | MODULO='%';
	public DmxGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaDmx.getOpMultiAccess();
	}
	
	public EnumRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}
	
	//DmxUnaryOperation DExpression:
	//	{DmxUnaryOperation} operator=OpUnary operand=DmxUnaryOperation
	//	| DmxCastExpression;
	public DmxGrammarAccess.DmxUnaryOperationElements getDmxUnaryOperationAccess() {
		return gaDmx.getDmxUnaryOperationAccess();
	}
	
	public ParserRule getDmxUnaryOperationRule() {
		return getDmxUnaryOperationAccess().getRule();
	}
	
	//enum OpUnary returns DmxUnaryOperator:
	//	PLUS='+' | MINUS='-' | NOT='!' | NOT | NOT='not';
	public DmxGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaDmx.getOpUnaryAccess();
	}
	
	public EnumRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}
	
	//DmxCastExpression DExpression:
	//	DmxNavigableMemberReference (=> ({DmxCastExpression.target=current} DmxOpCast) type=[DType])?;
	public DmxGrammarAccess.DmxCastExpressionElements getDmxCastExpressionAccess() {
		return gaDmx.getDmxCastExpressionAccess();
	}
	
	public ParserRule getDmxCastExpressionRule() {
		return getDmxCastExpressionAccess().getRule();
	}
	
	//DmxOpCast:
	//	'AS' | 'as';
	public DmxGrammarAccess.DmxOpCastElements getDmxOpCastAccess() {
		return gaDmx.getDmxOpCastAccess();
	}
	
	public ParserRule getDmxOpCastRule() {
		return getDmxOpCastAccess().getRule();
	}
	
	//DmxPrimaryExpression DExpression:
	//	DmxLiteralExpression | DmxParenthesizedExpression | DmxListExpression | DmxFunctionCall | DmxStaticReference |
	//	DmxContextReference | DmxIfExpression;
	public DmxGrammarAccess.DmxPrimaryExpressionElements getDmxPrimaryExpressionAccess() {
		return gaDmx.getDmxPrimaryExpressionAccess();
	}
	
	public ParserRule getDmxPrimaryExpressionRule() {
		return getDmxPrimaryExpressionAccess().getRule();
	}
	
	//DmxLiteralExpression DExpression:
	//	DmxBooleanLiteral | DmxStringLiteral | DmxNaturalLiteral | DmxDecimalLiteral | DmxUndefinedLiteral | DmxEntity |
	//	DmxDetail;
	public DmxGrammarAccess.DmxLiteralExpressionElements getDmxLiteralExpressionAccess() {
		return gaDmx.getDmxLiteralExpressionAccess();
	}
	
	public ParserRule getDmxLiteralExpressionRule() {
		return getDmxLiteralExpressionAccess().getRule();
	}
	
	//DmxParenthesizedExpression DExpression:
	//	'(' DExpression ')';
	public DmxGrammarAccess.DmxParenthesizedExpressionElements getDmxParenthesizedExpressionAccess() {
		return gaDmx.getDmxParenthesizedExpressionAccess();
	}
	
	public ParserRule getDmxParenthesizedExpressionRule() {
		return getDmxParenthesizedExpressionAccess().getRule();
	}
	
	//DmxListExpression DExpression:
	//	{DmxListExpression}
	//	'{' (elements+=DExpression (',' elements+=DExpression)*)?
	//	'}';
	public DmxGrammarAccess.DmxListExpressionElements getDmxListExpressionAccess() {
		return gaDmx.getDmxListExpressionAccess();
	}
	
	public ParserRule getDmxListExpressionRule() {
		return getDmxListExpressionAccess().getRule();
	}
	
	//DmxLiteralListExpression DExpression:
	//	{DmxListExpression}
	//	'{' (elements+=DmxLiteralExpression (',' elements+=DmxLiteralExpression)*)?
	//	'}';
	public DmxGrammarAccess.DmxLiteralListExpressionElements getDmxLiteralListExpressionAccess() {
		return gaDmx.getDmxLiteralListExpressionAccess();
	}
	
	public ParserRule getDmxLiteralListExpressionRule() {
		return getDmxLiteralListExpressionAccess().getRule();
	}
	
	//DmxFunctionCall DExpression:
	//	{DmxFunctionCall} function=[DmxFilter]
	//	'('
	//	callArguments=DmxFunctionCallArguments
	//	')';
	public DmxGrammarAccess.DmxFunctionCallElements getDmxFunctionCallAccess() {
		return gaDmx.getDmxFunctionCallAccess();
	}
	
	public ParserRule getDmxFunctionCallRule() {
		return getDmxFunctionCallAccess().getRule();
	}
	
	//DmxFunctionCallArguments DmxCallArguments:
	//	{DmxCallArguments} (arguments+=DExpression (',' arguments+=DExpression)*)?;
	public DmxGrammarAccess.DmxFunctionCallArgumentsElements getDmxFunctionCallArgumentsAccess() {
		return gaDmx.getDmxFunctionCallArgumentsAccess();
	}
	
	public ParserRule getDmxFunctionCallArgumentsRule() {
		return getDmxFunctionCallArgumentsAccess().getRule();
	}
	
	//DmxEntity:
	//	'entity'
	//	DmxComplexObject;
	public DmxGrammarAccess.DmxEntityElements getDmxEntityAccess() {
		return gaDmx.getDmxEntityAccess();
	}
	
	public ParserRule getDmxEntityRule() {
		return getDmxEntityAccess().getRule();
	}
	
	//DmxDetail:
	//	'detail'
	//	DmxComplexObject;
	public DmxGrammarAccess.DmxDetailElements getDmxDetailAccess() {
		return gaDmx.getDmxDetailAccess();
	}
	
	public ParserRule getDmxDetailRule() {
		return getDmxDetailAccess().getRule();
	}
	
	//fragment DmxComplexObject:
	//	type=[DComplexType] DomFieldListStartSymbol
	//	fields+=DmxField*
	//	'}';
	public DmxGrammarAccess.DmxComplexObjectElements getDmxComplexObjectAccess() {
		return gaDmx.getDmxComplexObjectAccess();
	}
	
	public ParserRule getDmxComplexObjectRule() {
		return getDmxComplexObjectAccess().getRule();
	}
	
	//DmxField:
	//	feature=[DFeature] "=" value=DExpression;
	public DmxGrammarAccess.DmxFieldElements getDmxFieldAccess() {
		return gaDmx.getDmxFieldAccess();
	}
	
	public ParserRule getDmxFieldRule() {
		return getDmxFieldAccess().getRule();
	}
	
	//DmxStaticReference DExpression:
	//	{DmxStaticReference}
	//	'['
	//	target=[IStaticReferenceTarget|DQualifiedName] ('#' member=[DNavigableMember])? ("|" (displayName=ID | plural?="*"))?
	//	-> ']';
	public DmxGrammarAccess.DmxStaticReferenceElements getDmxStaticReferenceAccess() {
		return gaDmx.getDmxStaticReferenceAccess();
	}
	
	public ParserRule getDmxStaticReferenceRule() {
		return getDmxStaticReferenceAccess().getRule();
	}
	
	//// '->' gives precedence to this ']' over PLAIN_TEXT_MIDDLE ('=>' works too but generates more lookahead overhead)
	//DmxContextReference DExpression:
	//	{DmxContextReference} target=[DNamedElement] (before?="@before"
	//	| '.' all?='all')?;
	public DmxGrammarAccess.DmxContextReferenceElements getDmxContextReferenceAccess() {
		return gaDmx.getDmxContextReferenceAccess();
	}
	
	public ParserRule getDmxContextReferenceRule() {
		return getDmxContextReferenceAccess().getRule();
	}
	
	//DmxIfExpression DExpression:
	//	{DmxIfExpression}
	//	'if' if=DExpression
	//	'then' then=DExpression (=> 'else' else=DExpression)?
	//	'end';
	public DmxGrammarAccess.DmxIfExpressionElements getDmxIfExpressionAccess() {
		return gaDmx.getDmxIfExpressionAccess();
	}
	
	public ParserRule getDmxIfExpressionRule() {
		return getDmxIfExpressionAccess().getRule();
	}
	
	//DMultiplicity:
	//	shorthand=DMultiplicityShorthand | '(' minOccurs=NATURAL '..' maxOccurs=MULTIPLICITY ')';
	public DmxGrammarAccess.DMultiplicityElements getDMultiplicityAccess() {
		return gaDmx.getDMultiplicityAccess();
	}
	
	public ParserRule getDMultiplicityRule() {
		return getDMultiplicityAccess().getRule();
	}
	
	//enum DMultiplicityShorthand:
	//	ZERO_OR_ONE='?' | ONE_OR_MORE='+' | ZERO_OR_MORE='*';
	public DmxGrammarAccess.DMultiplicityShorthandElements getDMultiplicityShorthandAccess() {
		return gaDmx.getDMultiplicityShorthandAccess();
	}
	
	public EnumRule getDMultiplicityShorthandRule() {
		return getDMultiplicityShorthandAccess().getRule();
	}
	
	//MULTIPLICITY ecore::EInt:
	//	NATURAL | '*';
	public DmxGrammarAccess.MULTIPLICITYElements getMULTIPLICITYAccess() {
		return gaDmx.getMULTIPLICITYAccess();
	}
	
	public ParserRule getMULTIPLICITYRule() {
		return getMULTIPLICITYAccess().getRule();
	}
	
	//DmxBooleanLiteral DExpression:
	//	{DmxBooleanLiteral} (value?='TRUE' | value?='true' | 'FALSE' | 'false');
	public DmxGrammarAccess.DmxBooleanLiteralElements getDmxBooleanLiteralAccess() {
		return gaDmx.getDmxBooleanLiteralAccess();
	}
	
	public ParserRule getDmxBooleanLiteralRule() {
		return getDmxBooleanLiteralAccess().getRule();
	}
	
	//DmxNaturalLiteral DExpression:
	//	{DmxNaturalLiteral} value=NATURAL;
	public DmxGrammarAccess.DmxNaturalLiteralElements getDmxNaturalLiteralAccess() {
		return gaDmx.getDmxNaturalLiteralAccess();
	}
	
	public ParserRule getDmxNaturalLiteralRule() {
		return getDmxNaturalLiteralAccess().getRule();
	}
	
	//DmxDecimalLiteral DExpression:
	//	{DmxDecimalLiteral} value=DECIMAL;
	public DmxGrammarAccess.DmxDecimalLiteralElements getDmxDecimalLiteralAccess() {
		return gaDmx.getDmxDecimalLiteralAccess();
	}
	
	public ParserRule getDmxDecimalLiteralRule() {
		return getDmxDecimalLiteralAccess().getRule();
	}
	
	//DmxStringLiteral DExpression:
	//	{DmxStringLiteral} value=STRING;
	public DmxGrammarAccess.DmxStringLiteralElements getDmxStringLiteralAccess() {
		return gaDmx.getDmxStringLiteralAccess();
	}
	
	public ParserRule getDmxStringLiteralRule() {
		return getDmxStringLiteralAccess().getRule();
	}
	
	//DmxUndefinedLiteral DExpression:
	//	{DmxUndefinedLiteral} ('UNDEFINED' | 'undefined');
	public DmxGrammarAccess.DmxUndefinedLiteralElements getDmxUndefinedLiteralAccess() {
		return gaDmx.getDmxUndefinedLiteralAccess();
	}
	
	public ParserRule getDmxUndefinedLiteralRule() {
		return getDmxUndefinedLiteralAccess().getRule();
	}
	
	//DECIMAL:
	//	NATURAL '.' NATURAL (('E' | 'e') ('+' | '-')? NATURAL)?;
	public DmxGrammarAccess.DECIMALElements getDECIMALAccess() {
		return gaDmx.getDECIMALAccess();
	}
	
	public ParserRule getDECIMALRule() {
		return getDECIMALAccess().getRule();
	}
	
	//DomFieldListStartSymbol:
	//	'{';
	public DmxGrammarAccess.DomFieldListStartSymbolElements getDomFieldListStartSymbolAccess() {
		return gaDmx.getDomFieldListStartSymbolAccess();
	}
	
	public ParserRule getDomFieldListStartSymbolRule() {
		return getDomFieldListStartSymbolAccess().getRule();
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
	//	'0'..'9'+ | '∞';
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
