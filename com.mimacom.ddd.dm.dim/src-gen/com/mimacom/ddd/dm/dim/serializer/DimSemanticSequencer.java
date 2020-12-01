/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dim.serializer;

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
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess;
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
import com.mimacom.ddd.dm.dmx.serializer.DmxSemanticSequencer;
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
public class DimSemanticSequencer extends DmxSemanticSequencer {

	@Inject
	private DimGrammarAccess grammarAccess;
	
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
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DConstraint returns DNamedPredicate
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* predicate=DExpression description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DConstraint(ISerializationContext context, DNamedPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DNamespace returns DNamespace
	 *
	 * Constraint:
	 *     (name=DQualifiedName imports+=DImport* model=DomainInformationModel)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DStateEvent returns DStateEvent
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DStateEvent(ISerializationContext context, DStateEvent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DNAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DNAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDStateEventAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DState returns DState
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DState(ISerializationContext context, DState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DNAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DNAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDStateAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DimAggregate returns DimAggregate
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         features+=DimQuery* 
	 *         types+=DimType*
	 *     )
	 */
	protected void sequence_DimAggregate(ISerializationContext context, DimAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimFeature returns DimAssociation
	 *     DimAssociation returns DimAssociation
	 *
	 * Constraint:
	 *     (
	 *         derived?='derived'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         (kind=DAssociationKind | kind=DAssociationKindInverse) 
	 *         type=[DEntityType|ID]? 
	 *         multiplicity=DMultiplicity? 
	 *         description=DRichText? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_DimAssociation(ISerializationContext context, DimAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimFeature returns DimAttribute
	 *     DimAttribute returns DimAttribute
	 *
	 * Constraint:
	 *     (
	 *         detail?='detail'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         type=[DType|ID]? 
	 *         multiplicity=DMultiplicity? 
	 *         key?='key'? 
	 *         description=DRichText? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_DimAttribute(ISerializationContext context, DimAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns DimDetailType
	 *     DimDetailType returns DimDetailType
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (features+=DimFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DimComplexType_DimDetailType(ISerializationContext context, DimDetailType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns DimEntityType
	 *     DimEntityType returns DimEntityType
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         root?='main'? 
	 *         (nature=DEntityNatureAutonomous | nature=DEntityNatureRelationship)? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (states+=DState states+=DState* (events+=DStateEvent events+=DStateEvent*)?)? 
	 *         (features+=DimFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DimComplexType_DimEntityType(ISerializationContext context, DimEntityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns DimEnumeration
	 *     DimEnumeration returns DimEnumeration
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         (literals+=DimLiteral literals+=DimLiteral*)? 
	 *         constraints+=DConstraint*
	 *     )
	 */
	protected void sequence_DimEnumeration(ISerializationContext context, DimEnumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimLiteral returns DimLiteral
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DimLiteral(ISerializationContext context, DimLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimType returns DimPrimitive
	 *     DimPrimitive returns DimPrimitive
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         redefines=[DmxArchetype|ID] 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         constraints+=DConstraint*
	 *     )
	 */
	protected void sequence_DimPrimitive(ISerializationContext context, DimPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimQueryParameter returns DimQueryParameter
	 *
	 * Constraint:
	 *     (name=ID type=[DType|ID]? multiplicity=DMultiplicity? description=DRichText? notes+=DNote*)
	 */
	protected void sequence_DimQueryParameter(ISerializationContext context, DimQueryParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DimFeature returns DimQuery
	 *     DimQuery returns DimQuery
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         (parameters+=DimQueryParameter parameters+=DimQueryParameter*)? 
	 *         type=[DType|ID]? 
	 *         multiplicity=DMultiplicity? 
	 *         returns=DExpression? 
	 *         description=DRichText? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_DimQuery(ISerializationContext context, DimQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainInformationModel returns DomainInformationModel
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? notes+=DNote* (types+=DimType | aggregates+=DimAggregate)*)
	 */
	protected void sequence_DomainInformationModel(ISerializationContext context, DomainInformationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
