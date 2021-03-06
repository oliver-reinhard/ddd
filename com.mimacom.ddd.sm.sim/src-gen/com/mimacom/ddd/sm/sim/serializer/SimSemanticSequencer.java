/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.base.base.DStateEvent;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TFuseRule;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;
import com.mimacom.ddd.dm.dim.DimAggregate;
import com.mimacom.ddd.dm.dim.DimAssociation;
import com.mimacom.ddd.dm.dim.DimAttribute;
import com.mimacom.ddd.dm.dim.DimDetailType;
import com.mimacom.ddd.dm.dim.DimEntityType;
import com.mimacom.ddd.dm.dim.DimEnumeration;
import com.mimacom.ddd.dm.dim.DimLiteral;
import com.mimacom.ddd.dm.dim.DimPackage;
import com.mimacom.ddd.dm.dim.DimPrimitive;
import com.mimacom.ddd.dm.dim.DimQuery;
import com.mimacom.ddd.dm.dim.DimQueryParameter;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.dim.serializer.DimSemanticSequencer;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxDetail;
import com.mimacom.ddd.dm.dmx.DmxEntity;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxTestContext;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;
import com.mimacom.ddd.sm.sim.SimPackage;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
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
			case BasePackage.DIMPORT:
				sequence_DImport(context, (DImport) semanticObject); 
				return; 
			case BasePackage.DMULTIPLICITY:
				sequence_DMultiplicity(context, (DMultiplicity) semanticObject); 
				return; 
			case BasePackage.DNAMED_PREDICATE:
				sequence_DConstraint(context, (DNamedPredicate) semanticObject); 
				return; 
			case BasePackage.DNAMESPACE:
				sequence_DNamespace(context, (DNamespace) semanticObject); 
				return; 
			case BasePackage.DNOTE:
				sequence_DNote(context, (DNote) semanticObject); 
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
		else if (epackage == DimPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DimPackage.DIM_AGGREGATE:
				sequence_DimAggregate(context, (DimAggregate) semanticObject); 
				return; 
			case DimPackage.DIM_ASSOCIATION:
				sequence_DimAssociation(context, (DimAssociation) semanticObject); 
				return; 
			case DimPackage.DIM_ATTRIBUTE:
				sequence_DimAttribute(context, (DimAttribute) semanticObject); 
				return; 
			case DimPackage.DIM_DETAIL_TYPE:
				sequence_DimComplexType_DimDetailType(context, (DimDetailType) semanticObject); 
				return; 
			case DimPackage.DIM_ENTITY_TYPE:
				sequence_DimComplexType_DimEntityType(context, (DimEntityType) semanticObject); 
				return; 
			case DimPackage.DIM_ENUMERATION:
				sequence_DimEnumeration(context, (DimEnumeration) semanticObject); 
				return; 
			case DimPackage.DIM_LITERAL:
				sequence_DimLiteral(context, (DimLiteral) semanticObject); 
				return; 
			case DimPackage.DIM_PRIMITIVE:
				sequence_DimPrimitive(context, (DimPrimitive) semanticObject); 
				return; 
			case DimPackage.DIM_QUERY:
				sequence_DimQuery(context, (DimQuery) semanticObject); 
				return; 
			case DimPackage.DIM_QUERY_PARAMETER:
				sequence_DimQueryParameter(context, (DimQueryParameter) semanticObject); 
				return; 
			case DimPackage.DOMAIN_INFORMATION_MODEL:
				sequence_DomainInformationModel(context, (DomainInformationModel) semanticObject); 
				return; 
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
			case DmxPackage.DMX_CONTEXT_REFERENCE:
				sequence_DmxContextReference(context, (DmxContextReference) semanticObject); 
				return; 
			case DmxPackage.DMX_CORRELATION_VARIABLE:
				sequence_DmxCorrelationVariable(context, (DmxCorrelationVariable) semanticObject); 
				return; 
			case DmxPackage.DMX_DECIMAL_LITERAL:
				sequence_DmxDecimalLiteral(context, (DmxDecimalLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_DETAIL:
				sequence_DmxComplexObject(context, (DmxDetail) semanticObject); 
				return; 
			case DmxPackage.DMX_ENTITY:
				sequence_DmxComplexObject(context, (DmxEntity) semanticObject); 
				return; 
			case DmxPackage.DMX_FIELD:
				sequence_DmxField(context, (DmxField) semanticObject); 
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
				if (rule == grammarAccess.getDExpressionRule()
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
						|| rule == grammarAccess.getDmxParenthesizedExpressionRule()
						|| rule == grammarAccess.getDmxListExpressionRule()) {
					sequence_DmxListExpression(context, (DmxListExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxLiteralListExpressionRule()) {
					sequence_DmxLiteralListExpression(context, (DmxListExpression) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_MEMBER_NAVIGATION:
				sequence_DmxNavigableMemberReference(context, (DmxMemberNavigation) semanticObject); 
				return; 
			case DmxPackage.DMX_MODEL:
				sequence_DmxModel(context, (DmxModel) semanticObject); 
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
			case DmxPackage.DMX_TEST_CONTEXT:
				sequence_DmxTestContext(context, (DmxTestContext) semanticObject); 
				return; 
			case DmxPackage.DMX_UNARY_OPERATION:
				sequence_DmxUnaryOperation(context, (DmxUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DMX_UNDEFINED_LITERAL:
				sequence_DmxUndefinedLiteral(context, (DmxUndefinedLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_URL_LITERAL:
				sequence_DmxUrlLiteral(context, (DmxUrlLiteral) semanticObject); 
				return; 
			}
		else if (epackage == SimPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimPackage.SYSTEM_INFORMATION_MODEL:
				sequence_SystemInformationModel(context, (SystemInformationModel) semanticObject); 
				return; 
			}
		else if (epackage == TransposePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TransposePackage.TAGGREGATE_TRANSPOSITION:
				sequence_SimAggregateTransposition(context, (TAggregateTransposition) semanticObject); 
				return; 
			case TransposePackage.TASSOCIATION_TRANSPOSITION:
				sequence_SimAssociationTransposition(context, (TAssociationTransposition) semanticObject); 
				return; 
			case TransposePackage.TATTRIBUTE_TRANSPOSITION:
				sequence_SimAttributeTransposition(context, (TAttributeTransposition) semanticObject); 
				return; 
			case TransposePackage.TDETAIL_TYPE_TRANSPOSITION:
				sequence_SimDetailTypeTransposition_TComplexTypeFeatures(context, (TDetailTypeTransposition) semanticObject); 
				return; 
			case TransposePackage.TDITCH_RULE:
				if (rule == grammarAccess.getSimDitchComplexTypeRuleRule()) {
					sequence_SimDitchComplexTypeRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimDitchEnumerationLiteralRuleRule()) {
					sequence_SimDitchEnumerationLiteralRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimDitchEnumerationRuleRule()) {
					sequence_SimDitchEnumerationRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimDitchFeatureRuleRule()) {
					sequence_SimDitchFeatureRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimDitchPrimitiveRuleRule()) {
					sequence_SimDitchPrimitiveRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimDitchQueryParameterRuleRule()) {
					sequence_SimDitchQueryParameterRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TENTITY_TYPE_TRANSPOSITION:
				sequence_SimEntityTypeTransposition_TComplexTypeFeatures(context, (TEntityTypeTransposition) semanticObject); 
				return; 
			case TransposePackage.TENUMERATION_TRANSPOSITION:
				sequence_SimEnumerationTransposition(context, (TEnumerationTransposition) semanticObject); 
				return; 
			case TransposePackage.TFUSE_RULE:
				sequence_ChangeComplexType_SimFuseComplexTypeRule(context, (TFuseRule) semanticObject); 
				return; 
			case TransposePackage.TGRAB_AGGREGATE_RULE:
				sequence_SimGrabAggregateRule(context, (TGrabAggregateRule) semanticObject); 
				return; 
			case TransposePackage.TGRAB_RULE:
				if (rule == grammarAccess.getSimGrabComplexTypeRuleRule()) {
					sequence_SimGrabComplexTypeRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimGrabEnumerationLiteralRuleRule()) {
					sequence_SimGrabEnumerationLiteralRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimGrabEnumerationRuleRule()) {
					sequence_SimGrabEnumerationRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimGrabFeatureRuleRule()) {
					sequence_SimGrabFeatureRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimGrabPrimitiveRuleRule()) {
					sequence_SimGrabPrimitiveRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimGrabQueryParameterRuleRule()) {
					sequence_SimGrabQueryParameterRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TLITERAL_TRANSPOSITION:
				sequence_SimLiteralTransposition(context, (TLiteralTransposition) semanticObject); 
				return; 
			case TransposePackage.TMORPH_RULE:
				if (rule == grammarAccess.getSimMorphComplexTypeRuleRule()) {
					sequence_ChangeComplexType_SimMorphComplexTypeRule(context, (TMorphRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimMorphFeatureRuleRule()) {
					sequence_SimMorphFeatureRule(context, (TMorphRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSimMorphQueryParameterRuleRule()) {
					sequence_SimMorphQueryParameterRule(context, (TMorphRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TPRIMITIVE_TRANSPOSITION:
				sequence_SimPrimitiveTransposition(context, (TPrimitiveTransposition) semanticObject); 
				return; 
			case TransposePackage.TQUERY_PARAMETER_TRANSPOSITION:
				sequence_SimQueryParameterTransposition(context, (TQueryParameterTransposition) semanticObject); 
				return; 
			case TransposePackage.TQUERY_TRANSPOSITION:
				sequence_SimQueryTransposition(context, (TQueryTransposition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SimFuseComplexTypeRule returns TFuseRule
	 *
	 * Constraint:
	 *     (
	 *         source=[DimComplexType|DQualifiedName] 
	 *         otherSources+=[DComplexType|DQualifiedName]+ 
	 *         abstract=SimAbstractType? 
	 *         (detail=SimDetailType | (rootEntity=SimRootEntity? detail=SimEntityType)) 
	 *         renameTo=ID? 
	 *         extendFrom=[DComplexType|ID]?
	 *     )
	 */
	protected void sequence_ChangeComplexType_SimFuseComplexTypeRule(ISerializationContext context, TFuseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimMorphComplexTypeRule returns TMorphRule
	 *
	 * Constraint:
	 *     (
	 *         source=[DimComplexType|DQualifiedName] 
	 *         abstract=SimAbstractType? 
	 *         (detail=SimDetailType | (rootEntity=SimRootEntity? detail=SimEntityType)) 
	 *         renameTo=ID? 
	 *         extendFrom=[DComplexType|ID]?
	 *     )
	 */
	protected void sequence_ChangeComplexType_SimMorphComplexTypeRule(ISerializationContext context, TMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DNamespace returns DNamespace
	 *
	 * Constraint:
	 *     (name=DQualifiedName imports+=DImport* model=SystemInformationModel)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimAggregate returns TAggregateTransposition
	 *     SimAggregateTransposition returns TAggregateTransposition
	 *
	 * Constraint:
	 *     (rule=SimGrabAggregateRule description=DRichText? (features+=SimQueryTransposition | features+=DimQuery)* types+=SimType*)
	 */
	protected void sequence_SimAggregateTransposition(ISerializationContext context, TAggregateTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimFeature returns TAssociationTransposition
	 *     SimAssociationTransposition returns TAssociationTransposition
	 *
	 * Constraint:
	 *     ((rule=SimGrabFeatureRule | rule=SimMorphFeatureRule | rule=SimDitchFeatureRule) description=DRichText?)
	 */
	protected void sequence_SimAssociationTransposition(ISerializationContext context, TAssociationTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimFeature returns TAttributeTransposition
	 *     SimAttributeTransposition returns TAttributeTransposition
	 *
	 * Constraint:
	 *     (
	 *         ((detail?='detail'? rule=SimGrabFeatureRule) | (detail?='detail'? rule=SimMorphFeatureRule) | (detail?='detail'? rule=SimDitchFeatureRule)) 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_SimAttributeTransposition(ISerializationContext context, TAttributeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns TDetailTypeTransposition
	 *     SimType returns TDetailTypeTransposition
	 *     SimDetailTypeTransposition returns TDetailTypeTransposition
	 *
	 * Constraint:
	 *     (
	 *         (rule=SimGrabComplexTypeRule | rule=SimDitchComplexTypeRule | rule=SimMorphComplexTypeRule | rule=SimFuseComplexTypeRule) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         features+=SimFeature? 
	 *         (constraints+=DConstraint? features+=SimFeature?)*
	 *     )
	 */
	protected void sequence_SimDetailTypeTransposition_TComplexTypeFeatures(ISerializationContext context, TDetailTypeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchComplexTypeRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimComplexType|DQualifiedName]
	 */
	protected void sequence_SimDitchComplexTypeRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchComplexTypeRuleAccess().getSourceDimComplexTypeDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchEnumerationLiteralRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimLiteral|ID]
	 */
	protected void sequence_SimDitchEnumerationLiteralRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchEnumerationLiteralRuleAccess().getSourceDimLiteralIDTerminalRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchEnumerationRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimEnumeration|DQualifiedName]
	 */
	protected void sequence_SimDitchEnumerationRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchEnumerationRuleAccess().getSourceDimEnumerationDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchFeatureRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimFeature|ID]
	 */
	protected void sequence_SimDitchFeatureRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchFeatureRuleAccess().getSourceDimFeatureIDTerminalRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchPrimitiveRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimPrimitive|DQualifiedName]
	 */
	protected void sequence_SimDitchPrimitiveRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchPrimitiveRuleAccess().getSourceDimPrimitiveDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SimDitchQueryParameterRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimQueryParameter|ID]
	 */
	protected void sequence_SimDitchQueryParameterRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimDitchQueryParameterRuleAccess().getSourceDimQueryParameterIDTerminalRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns TEntityTypeTransposition
	 *     SimType returns TEntityTypeTransposition
	 *     SimEntityTypeTransposition returns TEntityTypeTransposition
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (root?='root'? rule=SimGrabComplexTypeRule) | 
	 *             (root?='root'? rule=SimDitchComplexTypeRule) | 
	 *             (root?='root'? rule=SimMorphComplexTypeRule) | 
	 *             (root?='root'? rule=SimFuseComplexTypeRule)
	 *         ) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (features+=SimFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_SimEntityTypeTransposition_TComplexTypeFeatures(ISerializationContext context, TEntityTypeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns TEnumerationTransposition
	 *     SimType returns TEnumerationTransposition
	 *     SimEnumerationTransposition returns TEnumerationTransposition
	 *
	 * Constraint:
	 *     (
	 *         (rule=SimGrabEnumerationRule | rule=SimDitchEnumerationRule) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (literals+=SimLiteral literals+=SimLiteral*)? 
	 *         constraints+=DConstraint*
	 *     )
	 */
	protected void sequence_SimEnumerationTransposition(ISerializationContext context, TEnumerationTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabAggregateRule returns TGrabAggregateRule
	 *
	 * Constraint:
	 *     (source=[DimAggregate|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SimGrabAggregateRule(ISerializationContext context, TGrabAggregateRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabComplexTypeRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimComplexType|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SimGrabComplexTypeRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabEnumerationLiteralRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimLiteral|ID] renameTo=ID?)
	 */
	protected void sequence_SimGrabEnumerationLiteralRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabEnumerationRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimEnumeration|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SimGrabEnumerationRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabFeatureRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimFeature|ID] renameTo=ID?)
	 */
	protected void sequence_SimGrabFeatureRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabPrimitiveRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimPrimitive|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SimGrabPrimitiveRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimGrabQueryParameterRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimQueryParameter|ID] renameTo=ID?)
	 */
	protected void sequence_SimGrabQueryParameterRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimLiteral returns TLiteralTransposition
	 *     SimLiteralTransposition returns TLiteralTransposition
	 *
	 * Constraint:
	 *     ((rule=SimGrabEnumerationLiteralRule | rule=SimDitchEnumerationLiteralRule) description=DRichText? notes+=DNote*)
	 */
	protected void sequence_SimLiteralTransposition(ISerializationContext context, TLiteralTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimMorphFeatureRule returns TMorphRule
	 *
	 * Constraint:
	 *     (source=[DimFeature|ID] renameTo=ID? retypeTo=[DType|ID] remultiplyTo=DMultiplicity?)
	 */
	protected void sequence_SimMorphFeatureRule(ISerializationContext context, TMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimMorphQueryParameterRule returns TMorphRule
	 *
	 * Constraint:
	 *     (source=[DimQueryParameter|ID] renameTo=ID? retypeTo=[DType|ID] remultiplyTo=DMultiplicity?)
	 */
	protected void sequence_SimMorphQueryParameterRule(ISerializationContext context, TMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns TPrimitiveTransposition
	 *     SimType returns TPrimitiveTransposition
	 *     SimPrimitiveTransposition returns TPrimitiveTransposition
	 *
	 * Constraint:
	 *     ((rule=SimGrabPrimitiveRule | rule=SimDitchPrimitiveRule) description=DRichText? notes+=DNote* constraints+=DConstraint*)
	 */
	protected void sequence_SimPrimitiveTransposition(ISerializationContext context, TPrimitiveTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimQueryParameter returns TQueryParameterTransposition
	 *     SimQueryParameterTransposition returns TQueryParameterTransposition
	 *
	 * Constraint:
	 *     ((rule=SimGrabQueryParameterRule | rule=SimMorphQueryParameterRule | rule=SimDitchQueryParameterRule) description=DRichText? notes+=DNote*)
	 */
	protected void sequence_SimQueryParameterTransposition(ISerializationContext context, TQueryParameterTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SimFeature returns TQueryTransposition
	 *     SimQueryTransposition returns TQueryTransposition
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             ((rule=SimGrabFeatureRule | rule=SimMorphFeatureRule) (parameters+=SimQueryParameter parameters+=SimQueryParameter*)?) | 
	 *             rule=SimDitchFeatureRule
	 *         ) 
	 *         description=DRichText? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_SimQueryTransposition(ISerializationContext context, TQueryTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SystemInformationModel returns SystemInformationModel
	 *
	 * Constraint:
	 *     (
	 *         (kind=STypeModelKind | kind=SystemInformationModelKind) 
	 *         name=ID 
	 *         alias=ID? 
	 *         generate?='generate'? 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (types+=SimType | aggregates+=SimAggregate)*
	 *     )
	 */
	protected void sequence_SystemInformationModel(ISerializationContext context, SystemInformationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
