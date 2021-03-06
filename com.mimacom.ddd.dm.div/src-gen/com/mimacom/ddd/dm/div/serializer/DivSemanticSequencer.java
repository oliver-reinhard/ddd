/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div.serializer;

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
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
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
import com.mimacom.ddd.dm.div.DivPackage;
import com.mimacom.ddd.dm.div.DomainInformationView;
import com.mimacom.ddd.dm.div.services.DivGrammarAccess;
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
public class DivSemanticSequencer extends DimSemanticSequencer {

	@Inject
	private DivGrammarAccess grammarAccess;
	
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
		else if (epackage == DivPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DivPackage.DOMAIN_INFORMATION_VIEW:
				sequence_DomainInformationView(context, (DomainInformationView) semanticObject); 
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
		else if (epackage == TransposePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TransposePackage.TAGGREGATE_TRANSPOSITION:
				sequence_DivAggregateTransposition(context, (TAggregateTransposition) semanticObject); 
				return; 
			case TransposePackage.TASSOCIATION_TRANSPOSITION:
				sequence_DivAssociationTransposition(context, (TAssociationTransposition) semanticObject); 
				return; 
			case TransposePackage.TATTRIBUTE_TRANSPOSITION:
				sequence_DivAttributeTransposition(context, (TAttributeTransposition) semanticObject); 
				return; 
			case TransposePackage.TDETAIL_TYPE_TRANSPOSITION:
				sequence_DivDetailTypeTransposition_TComplexTypeFeatures(context, (TDetailTypeTransposition) semanticObject); 
				return; 
			case TransposePackage.TDITCH_RULE:
				if (rule == grammarAccess.getDivDitchComplexTypeRuleRule()) {
					sequence_DivDitchComplexTypeRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivDitchEnumerationLiteralRuleRule()) {
					sequence_DivDitchEnumerationLiteralRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivDitchEnumerationRuleRule()) {
					sequence_DivDitchEnumerationRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivDitchFeatureRuleRule()) {
					sequence_DivDitchFeatureRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivDitchPrimitiveRuleRule()) {
					sequence_DivDitchPrimitiveRule(context, (TDitchRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TENTITY_TYPE_TRANSPOSITION:
				sequence_DivEntityTypeTransposition_TComplexTypeFeatures(context, (TEntityTypeTransposition) semanticObject); 
				return; 
			case TransposePackage.TENUMERATION_TRANSPOSITION:
				sequence_DivEnumerationTransposition(context, (TEnumerationTransposition) semanticObject); 
				return; 
			case TransposePackage.TGRAB_AGGREGATE_RULE:
				sequence_DivGrabAggregateRule(context, (TGrabAggregateRule) semanticObject); 
				return; 
			case TransposePackage.TGRAB_RULE:
				if (rule == grammarAccess.getDivGrabComplexTypeRuleRule()) {
					sequence_DivGrabComplexTypeRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivGrabEnumerationLiteralRuleRule()) {
					sequence_DivGrabEnumerationLiteralRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivGrabEnumerationRuleRule()) {
					sequence_DivGrabEnumerationRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivGrabFeatureRuleRule()) {
					sequence_DivGrabFeatureRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivGrabPrimitiveRuleRule()) {
					sequence_DivGrabPrimitiveRule(context, (TGrabRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TLITERAL_TRANSPOSITION:
				sequence_DivLiteralTransposition(context, (TLiteralTransposition) semanticObject); 
				return; 
			case TransposePackage.TMORPH_RULE:
				if (rule == grammarAccess.getDivMorphComplexTypeRuleRule()) {
					sequence_DivMorphComplexTypeRule(context, (TMorphRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDivMorphFeatureRuleRule()) {
					sequence_DivMorphFeatureRule(context, (TMorphRule) semanticObject); 
					return; 
				}
				else break;
			case TransposePackage.TPRIMITIVE_TRANSPOSITION:
				sequence_DivPrimitiveTransposition(context, (TPrimitiveTransposition) semanticObject); 
				return; 
			case TransposePackage.TQUERY_TRANSPOSITION:
				sequence_DivQueryTransposition(context, (TQueryTransposition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DNamespace returns DNamespace
	 *
	 * Constraint:
	 *     (name=DQualifiedName imports+=DImport* model=DomainInformationView)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivAggregate returns TAggregateTransposition
	 *     DivAggregateTransposition returns TAggregateTransposition
	 *
	 * Constraint:
	 *     (rule=DivGrabAggregateRule description=DRichText? (features+=DivQueryTransposition | features+=DimQuery)* types+=DivType*)
	 */
	protected void sequence_DivAggregateTransposition(ISerializationContext context, TAggregateTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivFeature returns TAssociationTransposition
	 *     DivAssociationTransposition returns TAssociationTransposition
	 *
	 * Constraint:
	 *     ((rule=DivGrabFeatureRule | rule=DivDitchFeatureRule | rule=DivMorphFeatureRule) description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DivAssociationTransposition(ISerializationContext context, TAssociationTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivFeature returns TAttributeTransposition
	 *     DivAttributeTransposition returns TAttributeTransposition
	 *
	 * Constraint:
	 *     (
	 *         ((detail?='detail'? rule=DivGrabFeatureRule) | (detail?='detail'? rule=DivDitchFeatureRule) | (detail?='detail'? rule=DivMorphFeatureRule)) 
	 *         description=DRichText? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_DivAttributeTransposition(ISerializationContext context, TAttributeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivType returns TDetailTypeTransposition
	 *     DivDetailTypeTransposition returns TDetailTypeTransposition
	 *
	 * Constraint:
	 *     (
	 *         (rule=DivGrabComplexTypeRule | rule=DivDitchComplexTypeRule) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         features+=DivFeature? 
	 *         (constraints+=DConstraint? features+=DivFeature?)*
	 *     )
	 */
	protected void sequence_DivDetailTypeTransposition_TComplexTypeFeatures(ISerializationContext context, TDetailTypeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivDitchComplexTypeRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimComplexType|DQualifiedName]
	 */
	protected void sequence_DivDitchComplexTypeRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivDitchComplexTypeRuleAccess().getSourceDimComplexTypeDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivDitchEnumerationLiteralRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimLiteral|ID]
	 */
	protected void sequence_DivDitchEnumerationLiteralRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivDitchEnumerationLiteralRuleAccess().getSourceDimLiteralIDTerminalRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivDitchEnumerationRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimEnumeration|DQualifiedName]
	 */
	protected void sequence_DivDitchEnumerationRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivDitchEnumerationRuleAccess().getSourceDimEnumerationDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivDitchFeatureRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimFeature|ID]
	 */
	protected void sequence_DivDitchFeatureRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivDitchFeatureRuleAccess().getSourceDimFeatureIDTerminalRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivDitchPrimitiveRule returns TDitchRule
	 *
	 * Constraint:
	 *     source=[DimPrimitive|DQualifiedName]
	 */
	protected void sequence_DivDitchPrimitiveRule(ISerializationContext context, TDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivDitchPrimitiveRuleAccess().getSourceDimPrimitiveDQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivType returns TEntityTypeTransposition
	 *     DivEntityTypeTransposition returns TEntityTypeTransposition
	 *
	 * Constraint:
	 *     (
	 *         ((root?='root'? rule=DivGrabComplexTypeRule) | (root?='root'? rule=DivDitchComplexTypeRule) | (root?='root'? rule=DivMorphComplexTypeRule)) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (features+=DivFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DivEntityTypeTransposition_TComplexTypeFeatures(ISerializationContext context, TEntityTypeTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivType returns TEnumerationTransposition
	 *     DivEnumerationTransposition returns TEnumerationTransposition
	 *
	 * Constraint:
	 *     (
	 *         (rule=DivGrabEnumerationRule | rule=DivDitchEnumerationRule) 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (literals+=DivLiteralTransposition literals+=DivLiteralTransposition*)? 
	 *         constraints+=DConstraint*
	 *     )
	 */
	protected void sequence_DivEnumerationTransposition(ISerializationContext context, TEnumerationTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabAggregateRule returns TGrabAggregateRule
	 *
	 * Constraint:
	 *     (source=[DimAggregate|DQualifiedName] readOnlyView?='read'? renameTo=ID?)
	 */
	protected void sequence_DivGrabAggregateRule(ISerializationContext context, TGrabAggregateRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabComplexTypeRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimComplexType|DQualifiedName] readOnlyView?='read'? renameTo=ID?)
	 */
	protected void sequence_DivGrabComplexTypeRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabEnumerationLiteralRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimLiteral|ID] renameTo=ID?)
	 */
	protected void sequence_DivGrabEnumerationLiteralRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabEnumerationRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimEnumeration|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_DivGrabEnumerationRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabFeatureRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimFeature|ID] readOnlyView?='read'? renameTo=ID?)
	 */
	protected void sequence_DivGrabFeatureRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivGrabPrimitiveRule returns TGrabRule
	 *
	 * Constraint:
	 *     (source=[DimPrimitive|DQualifiedName] renameTo=ID?)
	 */
	protected void sequence_DivGrabPrimitiveRule(ISerializationContext context, TGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivLiteralTransposition returns TLiteralTransposition
	 *
	 * Constraint:
	 *     ((rule=DivGrabEnumerationLiteralRule | rule=DivDitchEnumerationLiteralRule) description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DivLiteralTransposition(ISerializationContext context, TLiteralTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivMorphComplexTypeRule returns TMorphRule
	 *
	 * Constraint:
	 *     (source=[DimComplexType|DQualifiedName] readOnlyView?='read')
	 */
	protected void sequence_DivMorphComplexTypeRule(ISerializationContext context, TMorphRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TRENAME_RULE__READ_ONLY_VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TRENAME_RULE__READ_ONLY_VIEW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivMorphComplexTypeRuleAccess().getSourceDimComplexTypeDQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.accept(grammarAccess.getDivMorphComplexTypeRuleAccess().getReadOnlyViewReadKeyword_2_0(), semanticObject.isReadOnlyView());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivMorphFeatureRule returns TMorphRule
	 *
	 * Constraint:
	 *     (source=[DimFeature|ID] readOnlyView?='read')
	 */
	protected void sequence_DivMorphFeatureRule(ISerializationContext context, TMorphRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE));
			if (transientValues.isValueTransient(semanticObject, TransposePackage.Literals.TRENAME_RULE__READ_ONLY_VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TransposePackage.Literals.TRENAME_RULE__READ_ONLY_VIEW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDivMorphFeatureRuleAccess().getSourceDimFeatureIDTerminalRuleCall_0_0_1(), semanticObject.eGet(TransposePackage.Literals.TTRANSPOSITION_RULE__SOURCE, false));
		feeder.accept(grammarAccess.getDivMorphFeatureRuleAccess().getReadOnlyViewReadKeyword_2_0(), semanticObject.isReadOnlyView());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DivType returns TPrimitiveTransposition
	 *     DivPrimitiveTransposition returns TPrimitiveTransposition
	 *
	 * Constraint:
	 *     ((rule=DivGrabPrimitiveRule | rule=DivDitchPrimitiveRule) description=DRichText? notes+=DNote* constraints+=DConstraint*)
	 */
	protected void sequence_DivPrimitiveTransposition(ISerializationContext context, TPrimitiveTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DivFeature returns TQueryTransposition
	 *     DivQueryTransposition returns TQueryTransposition
	 *
	 * Constraint:
	 *     ((rule=DivGrabFeatureRule | rule=DivDitchFeatureRule) description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DivQueryTransposition(ISerializationContext context, TQueryTransposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainInformationView returns DomainInformationView
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         alias=ID? 
	 *         readOnlyView?='read'? 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (types+=DivType | aggregates+=DivAggregate)*
	 *     )
	 */
	protected void sequence_DomainInformationView(ISerializationContext context, DomainInformationView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
