/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.esm.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DTextSegment;
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
import com.mimacom.ddd.dm.esm.EsmCompositeState;
import com.mimacom.ddd.dm.esm.EsmConcurrentState;
import com.mimacom.ddd.dm.esm.EsmDerivedState;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmState;
import com.mimacom.ddd.dm.esm.EsmSubStateModel;
import com.mimacom.ddd.dm.esm.EsmTransition;
import com.mimacom.ddd.dm.esm.services.EsmGrammarAccess;
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
public class EsmSemanticSequencer extends DmxSemanticSequencer {

	@Inject
	private EsmGrammarAccess grammarAccess;
	
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
			case BasePackage.DNAMESPACE:
				sequence_DNamespace(context, (DNamespace) semanticObject); 
				return; 
			case BasePackage.DNOTE:
				sequence_DNote(context, (DNote) semanticObject); 
				return; 
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
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
						|| rule == grammarAccess.getDmxPrimaryExpressionRule()
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
						|| rule == grammarAccess.getDmxParenthesizedExpressionRule()) {
					sequence_DmxNavigableMemberReference(context, (DmxAssignment) semanticObject); 
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
				if (rule == grammarAccess.getDmxListExpressionRule()) {
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
		else if (epackage == EsmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EsmPackage.ESM_COMPOSITE_STATE:
				sequence_EsmCompositeState(context, (EsmCompositeState) semanticObject); 
				return; 
			case EsmPackage.ESM_CONCURRENT_STATE:
				sequence_EsmConcurrentState(context, (EsmConcurrentState) semanticObject); 
				return; 
			case EsmPackage.ESM_DERIVED_STATE:
				sequence_EsmDerivedState(context, (EsmDerivedState) semanticObject); 
				return; 
			case EsmPackage.ESM_ENTITY_STATE_MODEL:
				sequence_EsmEntityStateModel(context, (EsmEntityStateModel) semanticObject); 
				return; 
			case EsmPackage.ESM_STATE:
				sequence_EsmNormalState(context, (EsmState) semanticObject); 
				return; 
			case EsmPackage.ESM_SUB_STATE_MODEL:
				sequence_EsmSubStateModel(context, (EsmSubStateModel) semanticObject); 
				return; 
			case EsmPackage.ESM_TRANSITION:
				sequence_EsmTransition(context, (EsmTransition) semanticObject); 
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
	 *     (name=DQualifiedName imports+=DImport* model=EsmEntityStateModel)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DExpression returns DmxAssignment
	 *     DmxPrimaryExpression returns DmxAssignment
	 *     DmxNavigableMemberReference returns DmxAssignment
	 *     DmxNavigableMemberReference.DmxAssignment_1_0_0_0_0 returns DmxAssignment
	 *     DmxNavigableMemberReference.DmxMemberNavigation_1_1_0_0_0 returns DmxAssignment
	 *     DmxPredicateWithCorrelationVariable returns DmxAssignment
	 *     DmxOrExpression returns DmxAssignment
	 *     DmxOrExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxAndExpression returns DmxAssignment
	 *     DmxAndExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxEqualityExpression returns DmxAssignment
	 *     DmxEqualityExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxRelationalExpression returns DmxAssignment
	 *     DmxRelationalExpression.DmxInstanceOfExpression_1_0_0_0_0 returns DmxAssignment
	 *     DmxRelationalExpression.DmxBinaryOperation_1_1_0_0_0 returns DmxAssignment
	 *     DmxOtherOperatorExpression returns DmxAssignment
	 *     DmxOtherOperatorExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxAdditiveExpression returns DmxAssignment
	 *     DmxAdditiveExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxMultiplicativeExpression returns DmxAssignment
	 *     DmxMultiplicativeExpression.DmxBinaryOperation_1_0_0_0 returns DmxAssignment
	 *     DmxUnaryOperation returns DmxAssignment
	 *     DmxCastExpression returns DmxAssignment
	 *     DmxCastExpression.DmxCastExpression_1_0_0_0 returns DmxAssignment
	 *     DmxParenthesizedExpression returns DmxAssignment
	 *
	 * Constraint:
	 *     (precedingNavigationSegment=DmxNavigableMemberReference_DmxAssignment_1_0_0_0_0 assignToMember=[DNavigableMember|ID] value=DmxOrExpression)
	 */
	protected void sequence_DmxNavigableMemberReference(ISerializationContext context, DmxAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT));
			if (transientValues.isValueTransient(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER));
			if (transientValues.isValueTransient(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmxPackage.Literals.DMX_ASSIGNMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(), semanticObject.getPrecedingNavigationSegment());
		feeder.accept(grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberIDTerminalRuleCall_1_0_0_0_2_0_1(), semanticObject.eGet(DmxPackage.Literals.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER, false));
		feeder.accept(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EsmState returns EsmCompositeState
	 *     EsmCompositeState returns EsmCompositeState
	 *
	 * Constraint:
	 *     (
	 *         kind=EsmStateKind? 
	 *         state=[DState|ID] 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         direction=EsmLayoutDirection? 
	 *         states+=EsmState+ 
	 *         transitions+=EsmTransition+
	 *     )
	 */
	protected void sequence_EsmCompositeState(ISerializationContext context, EsmCompositeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmState returns EsmConcurrentState
	 *     EsmConcurrentState returns EsmConcurrentState
	 *
	 * Constraint:
	 *     (kind=EsmStateKind? state=[DState|ID] description=DRichText? notes+=DNote* subStates+=EsmSubStateModel+)
	 */
	protected void sequence_EsmConcurrentState(ISerializationContext context, EsmConcurrentState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmState returns EsmDerivedState
	 *     EsmDerivedState returns EsmDerivedState
	 *
	 * Constraint:
	 *     (kind=EsmStateKind? state=[DState|ID] description=DRichText? notes+=DNote* expression=DExpression)
	 */
	protected void sequence_EsmDerivedState(ISerializationContext context, EsmDerivedState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmEntityStateModel returns EsmEntityStateModel
	 *
	 * Constraint:
	 *     (
	 *         name=DQualifiedName 
	 *         alias=ID? 
	 *         forType=[DimEntityType|DQualifiedName] 
	 *         description=DRichText? 
	 *         notes+=DNote* 
	 *         direction=EsmLayoutDirection? 
	 *         states+=EsmState+ 
	 *         transitions+=EsmTransition+
	 *     )
	 */
	protected void sequence_EsmEntityStateModel(ISerializationContext context, EsmEntityStateModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmState returns EsmState
	 *     EsmNormalState returns EsmState
	 *
	 * Constraint:
	 *     (kind=EsmStateKind? state=[DState|ID] description=DRichText? notes+=DNote*)
	 */
	protected void sequence_EsmNormalState(ISerializationContext context, EsmState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmSubStateModel returns EsmSubStateModel
	 *
	 * Constraint:
	 *     (states+=EsmState+ transitions+=EsmTransition+)
	 */
	protected void sequence_EsmSubStateModel(ISerializationContext context, EsmSubStateModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EsmTransition returns EsmTransition
	 *
	 * Constraint:
	 *     (
	 *         direction=EsmLayoutDirection? 
	 *         from=[DState|ID] 
	 *         to=[DState|ID] 
	 *         event=[DStateEvent|ID] 
	 *         guard=DExpression? 
	 *         notes+=DNote*
	 *     )
	 */
	protected void sequence_EsmTransition(ISerializationContext context, EsmTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
