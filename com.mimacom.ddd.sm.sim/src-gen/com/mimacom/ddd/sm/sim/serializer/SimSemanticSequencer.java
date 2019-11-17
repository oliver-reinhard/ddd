/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DStateEvent;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.dim.serializer.DimSemanticSequencer;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SAssociationDeduction;
import com.mimacom.ddd.sm.sim.SAttributeDeduction;
import com.mimacom.ddd.sm.sim.SCoreQuery;
import com.mimacom.ddd.sm.sim.SDetailTypeDeduction;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SDomainDeduction;
import com.mimacom.ddd.sm.sim.SEntityTypeDeduction;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabDomainRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteralDeduction;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction;
import com.mimacom.ddd.sm.sim.SQueryDeduction;
import com.mimacom.ddd.sm.sim.SQueryParameterDeduction;
import com.mimacom.ddd.sm.sim.SimPackage;
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SimSemanticSequencer extends DimSemanticSequencer {

	@Inject
	private SimGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BasePackage.DAGGREGATE:
				sequence_DAggregate(context, (DAggregate) semanticObject); 
				return; 
			case BasePackage.DASSOCIATION:
				sequence_DAssociation(context, (DAssociation) semanticObject); 
				return; 
			case BasePackage.DATTRIBUTE:
				sequence_DAttribute(context, (DAttribute) semanticObject); 
				return; 
			case BasePackage.DCONTEXT:
				sequence_DmxTestContext(context, (DContext) semanticObject); 
				return; 
			case BasePackage.DDETAIL_TYPE:
				sequence_DComplexType_DDetailType(context, (DDetailType) semanticObject); 
				return; 
			case BasePackage.DDOMAIN:
				sequence_DDomain(context, (DDomain) semanticObject); 
				return; 
			case BasePackage.DENTITY_TYPE:
				sequence_DComplexType_DEntityType(context, (DEntityType) semanticObject); 
				return; 
			case BasePackage.DENUMERATION:
				sequence_DEnumeration(context, (DEnumeration) semanticObject); 
				return; 
			case BasePackage.DIMPORT:
				sequence_DImport(context, (DImport) semanticObject); 
				return; 
			case BasePackage.DLITERAL:
				sequence_DLiteral(context, (DLiteral) semanticObject); 
				return; 
			case BasePackage.DMULTIPLICITY:
				sequence_DMultiplicity(context, (DMultiplicity) semanticObject); 
				return; 
			case BasePackage.DNAMED_PREDICATE:
				sequence_DConstraint(context, (DNamedPredicate) semanticObject); 
				return; 
			case BasePackage.DPRIMITIVE:
				sequence_DPrimitive(context, (DPrimitive) semanticObject); 
				return; 
			case BasePackage.DQUERY:
				sequence_DQuery(context, (DQuery) semanticObject); 
				return; 
			case BasePackage.DQUERY_PARAMETER:
				sequence_DQueryParameter(context, (DQueryParameter) semanticObject); 
				return; 
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
				return; 
			case BasePackage.DSTATE:
				sequence_DState(context, (DState) semanticObject); 
				return; 
			case BasePackage.DSTATE_EVENT:
				sequence_DStateEvent(context, (DStateEvent) semanticObject); 
				return; 
			case BasePackage.DTEXT_SEGMENT:
				if (rule == grammarAccess.getDmxTextEndRule()) {
					sequence_DmxTextEnd(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextMiddleRule()) {
					sequence_DmxTextMiddle(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextOnlyRule()) {
					sequence_DmxTextOnly(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextStartRule()) {
					sequence_DmxTextStart(context, (DTextSegment) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == DmxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DmxPackage.DMX_ARCHETYPE:
				sequence_DmxArchetype(context, (DmxArchetype) semanticObject); 
				return; 
			case DmxPackage.DMX_ASSIGNMENT:
				if (rule == grammarAccess.getDmxAssignmentRule()) {
					sequence_DmxAssignment(context, (DmxAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDExpressionRule()
						|| rule == grammarAccess.getDmxNavigableMemberReferenceRule()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxPredicateWithCorrelationVariableRule()
						|| rule == grammarAccess.getDmxOrExpressionRule()
						|| action == grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAndExpressionRule()
						|| action == grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxEqualityExpressionRule()
						|| action == grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxRelationalExpressionRule()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxOtherOperatorExpressionRule()
						|| action == grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAdditiveExpressionRule()
						|| action == grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxMultiplicativeExpressionRule()
						|| action == grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxUnaryOperationRule()
						|| rule == grammarAccess.getDmxCastExpressionRule()
						|| action == grammarAccess.getDmxCastExpressionAccess().getDmxCastExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getDmxPrimaryExpressionRule()
						|| rule == grammarAccess.getDmxParenthesizedExpressionRule()) {
					sequence_DmxAssignment_DmxNavigableMemberReference(context, (DmxAssignment) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_BASE_TYPE_SET:
				sequence_DmxBaseTypeSet(context, (DmxBaseTypeSet) semanticObject); 
				return; 
			case DmxPackage.DMX_BINARY_OPERATION:
				sequence_DmxAdditiveExpression_DmxAndExpression_DmxEqualityExpression_DmxMultiplicativeExpression_DmxOrExpression_DmxOtherOperatorExpression_DmxRelationalExpression(context, (DmxBinaryOperation) semanticObject); 
				return; 
			case DmxPackage.DMX_BOOLEAN_LITERAL:
				sequence_DmxBooleanLiteral(context, (DmxBooleanLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_CALL_ARGUMENTS:
				if (rule == grammarAccess.getDmxCallArgumentsRule()) {
					sequence_DmxCallArguments(context, (DmxCallArguments) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxFunctionCallArgumentsRule()) {
					sequence_DmxFunctionCallArguments(context, (DmxCallArguments) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_CAST_EXPRESSION:
				sequence_DmxCastExpression(context, (DmxCastExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_CONSTRUCTOR_CALL:
				sequence_DmxConstructorCall(context, (DmxConstructorCall) semanticObject); 
				return; 
			case DmxPackage.DMX_CONTEXT_REFERENCE:
				sequence_DmxContextReference(context, (DmxContextReference) semanticObject); 
				return; 
			case DmxPackage.DMX_CORRELATION_VARIABLE:
				sequence_DmxCorrelationVariable(context, (DmxCorrelationVariable) semanticObject); 
				return; 
			case DmxPackage.DMX_DECIMAL_LITERAL:
				sequence_DmxDecimalLiteral(context, (DmxDecimalLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER:
				sequence_DmxFilter(context, (DmxFilter) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER_PARAMETER:
				sequence_DmxFilterParameter(context, (DmxFilterParameter) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR:
				sequence_DmxFilterTypeDescriptor(context, (DmxFilterTypeDescriptor) semanticObject); 
				return; 
			case DmxPackage.DMX_FUNCTION_CALL:
				sequence_DmxFunctionCall(context, (DmxFunctionCall) semanticObject); 
				return; 
			case DmxPackage.DMX_IF_EXPRESSION:
				sequence_DmxIfExpression(context, (DmxIfExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION:
				sequence_DmxRelationalExpression(context, (DmxInstanceOfExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_LIST_EXPRESSION:
				sequence_DmxListExpression(context, (DmxListExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_MEMBER_NAVIGATION:
				sequence_DmxNavigableMemberReference(context, (DmxMemberNavigation) semanticObject); 
				return; 
			case DmxPackage.DMX_NAMESPACE:
				sequence_DmxNamespace(context, (DmxNamespace) semanticObject); 
				return; 
			case DmxPackage.DMX_NATURAL_LITERAL:
				sequence_DmxNaturalLiteral(context, (DmxNaturalLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE:
				sequence_DmxPredicateWithCorrelationVariable(context, (DmxPredicateWithCorrelationVariable) semanticObject); 
				return; 
			case DmxPackage.DMX_STATIC_REFERENCE:
				sequence_DmxStaticReference(context, (DmxStaticReference) semanticObject); 
				return; 
			case DmxPackage.DMX_STRING_LITERAL:
				sequence_DmxStringLiteral(context, (DmxStringLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_TEST:
				sequence_DmxTest(context, (DmxTest) semanticObject); 
				return; 
			case DmxPackage.DMX_UNARY_OPERATION:
				sequence_DmxUnaryOperation(context, (DmxUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DMX_UNDEFINED_LITERAL:
				sequence_DmxUndefinedLiteral(context, (DmxUndefinedLiteral) semanticObject); 
				return; 
			}
		else if (epackage == SimPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimPackage.SAGGREGATE_DEDUCTION:
				sequence_SAggregateDeduction(context, (SAggregateDeduction) semanticObject); 
				return; 
			case SimPackage.SASSOCIATION_DEDUCTION:
				sequence_SAssociationDeduction(context, (SAssociationDeduction) semanticObject); 
				return; 
			case SimPackage.SATTRIBUTE_DEDUCTION:
				sequence_SAttributeDeduction(context, (SAttributeDeduction) semanticObject); 
				return; 
			case SimPackage.SCORE_QUERY:
				sequence_SCoreQuery(context, (SCoreQuery) semanticObject); 
				return; 
			case SimPackage.SDETAIL_TYPE_DEDUCTION:
				sequence_SComplexTypeFeatures_SDetailTypeDeduction(context, (SDetailTypeDeduction) semanticObject); 
				return; 
			case SimPackage.SDITCH_RULE:
				if (rule == grammarAccess.getSDitchComplexTypeRuleRule()) {
					sequence_SDitchComplexTypeRule(context, (SDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSDitchEnumerationLiteralRuleRule()) {
					sequence_SDitchEnumerationLiteralRule(context, (SDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSDitchEnumerationRuleRule()) {
					sequence_SDitchEnumerationRule(context, (SDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSDitchFeatureRuleRule()) {
					sequence_SDitchFeatureRule(context, (SDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSDitchPrimitiveRuleRule()) {
					sequence_SDitchPrimitiveRule(context, (SDitchRule) semanticObject); 
					return; 
				}
				else break;
			case SimPackage.SDOMAIN_DEDUCTION:
				sequence_Domain(context, (SDomainDeduction) semanticObject); 
				return; 
			case SimPackage.SENTITY_TYPE_DEDUCTION:
				sequence_SComplexTypeFeatures_SEntityTypeDeduction(context, (SEntityTypeDeduction) semanticObject); 
				return; 
			case SimPackage.SENUMERATION_DEDUCTION:
				sequence_SEnumerationDeduction(context, (SEnumerationDeduction) semanticObject); 
				return; 
			case SimPackage.SFUSE_RULE:
				sequence_ChangeComplexType_SFuseComplexTypeRule(context, (SFuseRule) semanticObject); 
				return; 
			case SimPackage.SGRAB_AGGREGATE_RULE:
				sequence_SGrabAggregateRule(context, (SGrabAggregateRule) semanticObject); 
				return; 
			case SimPackage.SGRAB_DOMAIN_RULE:
				sequence_SGrabDomainRule(context, (SGrabDomainRule) semanticObject); 
				return; 
			case SimPackage.SGRAB_RULE:
				if (rule == grammarAccess.getSGrabComplexTypeRuleRule()) {
					sequence_SGrabComplexTypeRule(context, (SGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSGrabEnumerationLiteralRuleRule()) {
					sequence_SGrabEnumerationLiteralRule(context, (SGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSGrabEnumerationRuleRule()) {
					sequence_SGrabEnumerationRule(context, (SGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSGrabFeatureRuleRule()) {
					sequence_SGrabFeatureRule(context, (SGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSGrabPrimitiveRuleRule()) {
					sequence_SGrabPrimitiveRule(context, (SGrabRule) semanticObject); 
					return; 
				}
				else break;
			case SimPackage.SINFORMATION_MODEL:
				sequence_SInformationModel(context, (SInformationModel) semanticObject); 
				return; 
			case SimPackage.SLITERAL_DEDUCTION:
				sequence_SLiteralDeduction(context, (SLiteralDeduction) semanticObject); 
				return; 
			case SimPackage.SMORPH_RULE:
				if (rule == grammarAccess.getSMorphComplexTypeRuleRule()) {
					sequence_ChangeComplexType_SMorphComplexTypeRule(context, (SMorphRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSMorphFeatureRuleRule()) {
					sequence_SMorphFeatureRule(context, (SMorphRule) semanticObject); 
					return; 
				}
				else break;
			case SimPackage.SPRIMITIVE_DEDUCTION:
				sequence_SPrimitiveDeduction(context, (SPrimitiveDeduction) semanticObject); 
				return; 
			case SimPackage.SQUERY_DEDUCTION:
				sequence_SQueryDeduction(context, (SQueryDeduction) semanticObject); 
				return; 
			case SimPackage.SQUERY_PARAMETER_DEDUCTION:
				sequence_SQueryParameterDeduction(context, (SQueryParameterDeduction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SFuseComplexTypeRule returns SFuseRule
	 *
	 * Constraint:
	 *     (
	 *         source=[DComplexType|DQualifiedName] 
	 *         otherSources+=[DComplexType|DQualifiedName]+ 
	 *         abstract=SAbstractType? 
	 *         (rootEntity=SRootEntity | detail=SDetailType)? 
	 *         renameTo=ID? 
	 *         extendFrom=[DComplexType|ID]?
	 *     )
	 */
	protected void sequence_ChangeComplexType_SFuseComplexTypeRule(ISerializationContext context, SFuseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMorphComplexTypeRule returns SMorphRule
	 *
	 * Constraint:
	 *     (
	 *         source=[DComplexType|DQualifiedName] 
	 *         abstract=SAbstractType? 
	 *         (rootEntity=SRootEntity | detail=SDetailType)? 
	 *         renameTo=ID? 
	 *         extendFrom=[DComplexType|ID]?
	 *     )
	 */
	protected void sequence_ChangeComplexType_SMorphComplexTypeRule(ISerializationContext context, SMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Aggregate returns DAggregate
	 *     DAggregate returns DAggregate
	 *
	 * Constraint:
	 *     (description=DRichText? types+=Type*)
	 */
	protected void sequence_DAggregate(ISerializationContext context, DAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns DDetailType
	 *     DType returns DDetailType
	 *     DDetailType returns DDetailType
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         features+=Feature? 
	 *         (constraints+=DConstraint? features+=Feature?)* 
	 *         (features+=DFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DComplexType_DDetailType(ISerializationContext context, DDetailType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns DEntityType
	 *     DEntityType returns DEntityType
	 *     DType returns DEntityType
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         root?='root'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         (features+=Feature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DComplexType_DEntityType(ISerializationContext context, DEntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns DEnumeration
	 *     DEnumeration returns DEnumeration
	 *     DType returns DEnumeration
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? (literals+=Literal literals+=Literal*)? constraints+=DConstraint*)
	 */
	protected void sequence_DEnumeration(ISerializationContext context, DEnumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns DQuery
	 *     DQuery returns DQuery
	 *     DFeature returns DQuery
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         (parameters+=QueryParameter parameters+=QueryParameter*)? 
	 *         type=[DType|ID] 
	 *         multiplicity=DMultiplicity? 
	 *         returns=DExpression? 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_DQuery(ISerializationContext context, DQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domain returns SDomainDeduction
	 *
	 * Constraint:
	 *     deductionRule=SGrabDomainRule
	 */
	protected void sequence_Domain(ISerializationContext context, SDomainDeduction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.IDEDUCTION_DEFINITION__DEDUCTION_RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.IDEDUCTION_DEFINITION__DEDUCTION_RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDomainAccess().getDeductionRuleSGrabDomainRuleParserRuleCall_3_0(), semanticObject.getDeductionRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Aggregate returns SAggregateDeduction
	 *     SAggregateDeduction returns SAggregateDeduction
	 *
	 * Constraint:
	 *     (deductionRule=SGrabAggregateRule description=DRichText? types+=Type*)
	 */
	protected void sequence_SAggregateDeduction(ISerializationContext context, SAggregateDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns SAssociationDeduction
	 *     SAssociationDeduction returns SAssociationDeduction
	 *
	 * Constraint:
	 *     ((deductionRule=SGrabFeatureRule | deductionRule=SMorphFeatureRule | deductionRule=SDitchFeatureRule) description=DRichText?)
	 */
	protected void sequence_SAssociationDeduction(ISerializationContext context, SAssociationDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns SAttributeDeduction
	 *     SAttributeDeduction returns SAttributeDeduction
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (detail?='detail'? deductionRule=SGrabFeatureRule) | 
	 *             (detail?='detail'? deductionRule=SMorphFeatureRule) | 
	 *             (detail?='detail'? deductionRule=SDitchFeatureRule)
	 *         ) 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_SAttributeDeduction(ISerializationContext context, SAttributeDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SDetailTypeDeduction
	 *     SDetailTypeDeduction returns SDetailTypeDeduction
	 *
	 * Constraint:
	 *     (
	 *         (deductionRule=SGrabComplexTypeRule | deductionRule=SDitchComplexTypeRule | deductionRule=SMorphComplexTypeRule | deductionRule=SFuseComplexTypeRule) 
	 *         description=DRichText? 
	 *         constraints+=DConstraint? 
	 *         (features+=Feature? constraints+=DConstraint?)*
	 *     )
	 */
	protected void sequence_SComplexTypeFeatures_SDetailTypeDeduction(ISerializationContext context, SDetailTypeDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SEntityTypeDeduction
	 *     SEntityTypeDeduction returns SEntityTypeDeduction
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (root?='root'? deductionRule=SGrabComplexTypeRule) | 
	 *             (root?='root'? deductionRule=SDitchComplexTypeRule) | 
	 *             (root?='root'? deductionRule=SMorphComplexTypeRule) | 
	 *             (root?='root'? deductionRule=SFuseComplexTypeRule)
	 *         ) 
	 *         description=DRichText? 
	 *         (features+=Feature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_SComplexTypeFeatures_SEntityTypeDeduction(ISerializationContext context, SEntityTypeDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SCoreQuery returns SCoreQuery
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         (parameters+=DQueryParameter parameters+=DQueryParameter*)? 
	 *         type=[DType|ID] 
	 *         multiplicity=DMultiplicity? 
	 *         returns=DExpression? 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_SCoreQuery(ISerializationContext context, SCoreQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SDitchComplexTypeRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DComplexType|DQualifiedName]
	 */
	protected void sequence_SDitchComplexTypeRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDComplexTypeDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchEnumerationLiteralRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DLiteral|ID]
	 */
	protected void sequence_SDitchEnumerationLiteralRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchEnumerationRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DEnumeration|DQualifiedName]
	 */
	protected void sequence_SDitchEnumerationRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchFeatureRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DFeature|ID]
	 */
	protected void sequence_SDitchFeatureRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchPrimitiveRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DPrimitive|DQualifiedName]
	 */
	protected void sequence_SDitchPrimitiveRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchPrimitiveRuleAccess().getSourceDPrimitiveDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SEnumerationDeduction
	 *     SEnumerationDeduction returns SEnumerationDeduction
	 *
	 * Constraint:
	 *     (
	 *         (deductionRule=SGrabEnumerationRule | deductionRule=SDitchEnumerationRule) 
	 *         description=DRichText? 
	 *         (literals+=Literal literals+=Literal*)? 
	 *         constraints+=DConstraint*
	 *     )
	 */
	protected void sequence_SEnumerationDeduction(ISerializationContext context, SEnumerationDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabAggregateRule returns SGrabAggregateRule
	 *
	 * Constraint:
	 *     source=[DAggregate|DQualifiedName]
	 */
	protected void sequence_SGrabAggregateRule(ISerializationContext context, SGrabAggregateRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SGrabComplexTypeRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DComplexType|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SGrabComplexTypeRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabDomainRule returns SGrabDomainRule
	 *
	 * Constraint:
	 *     source=[DDomain|DQualifiedName]
	 */
	protected void sequence_SGrabDomainRule(ISerializationContext context, SGrabDomainRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(BasePackage.Literals.DDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SGrabEnumerationLiteralRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DLiteral|ID] renameTo=ID?)
	 */
	protected void sequence_SGrabEnumerationLiteralRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabEnumerationRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DEnumeration|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SGrabEnumerationRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabFeatureRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DFeature|ID] renameTo=ID?)
	 */
	protected void sequence_SGrabFeatureRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabPrimitiveRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DPrimitive|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SGrabPrimitiveRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SInformationModel returns SInformationModel
	 *
	 * Constraint:
	 *     (
	 *         imports+=DImport* 
	 *         kind=SInformationModelKind 
	 *         name=DQualifiedName 
	 *         generate?='generate'? 
	 *         description=DRichText? 
	 *         queries+=SCoreQuery* 
	 *         (types+=Type | aggregates+=Aggregate | domainProxies+=Domain)*
	 *     )
	 */
	protected void sequence_SInformationModel(ISerializationContext context, SInformationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns SLiteralDeduction
	 *     SLiteralDeduction returns SLiteralDeduction
	 *
	 * Constraint:
	 *     ((deductionRule=SGrabEnumerationLiteralRule | deductionRule=SDitchEnumerationLiteralRule) description=DRichText?)
	 */
	protected void sequence_SLiteralDeduction(ISerializationContext context, SLiteralDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMorphFeatureRule returns SMorphRule
	 *
	 * Constraint:
	 *     (source=[DFeature|ID] renameTo=ID? retypeTo=[DType|ID] remultiplyTo=DMultiplicity?)
	 */
	protected void sequence_SMorphFeatureRule(ISerializationContext context, SMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SPrimitiveDeduction
	 *     SPrimitiveDeduction returns SPrimitiveDeduction
	 *
	 * Constraint:
	 *     ((deductionRule=SGrabPrimitiveRule | deductionRule=SDitchPrimitiveRule) description=DRichText? constraints+=DConstraint*)
	 */
	protected void sequence_SPrimitiveDeduction(ISerializationContext context, SPrimitiveDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns SQueryDeduction
	 *     SQueryDeduction returns SQueryDeduction
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             ((deductionRule=SGrabFeatureRule | deductionRule=SMorphFeatureRule) (parameters+=QueryParameter parameters+=QueryParameter*)?) | 
	 *             deductionRule=SDitchFeatureRule
	 *         ) 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_SQueryDeduction(ISerializationContext context, SQueryDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QueryParameter returns SQueryParameterDeduction
	 *     SQueryParameterDeduction returns SQueryParameterDeduction
	 *
	 * Constraint:
	 *     ((deductionRule=SGrabFeatureRule | deductionRule=SMorphFeatureRule | deductionRule=SDitchFeatureRule) description=DRichText?)
	 */
	protected void sequence_SQueryParameterDeduction(ISerializationContext context, SQueryParameterDeduction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
