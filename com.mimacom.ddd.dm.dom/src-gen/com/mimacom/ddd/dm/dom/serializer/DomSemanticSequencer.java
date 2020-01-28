/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dom.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
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
import com.mimacom.ddd.dm.dmx.serializer.DmxSemanticSequencer;
import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomPackage;
import com.mimacom.ddd.dm.dom.DomSnapshot;
import com.mimacom.ddd.dm.dom.services.DomGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;

@SuppressWarnings("all")
public class DomSemanticSequencer extends DmxSemanticSequencer {

	@Inject
	private DomGrammarAccess grammarAccess;
	
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
			}
		else if (epackage == DomPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomPackage.DOM_MODEL:
				sequence_DomModel(context, (DomModel) semanticObject); 
				return; 
			case DomPackage.DOM_NAMED_COMPLEX_OBJECT:
				sequence_DomNamedComplexObject(context, (DomNamedComplexObject) semanticObject); 
				return; 
			case DomPackage.DOM_SNAPSHOT:
				sequence_DomSnapshot(context, (DomSnapshot) semanticObject); 
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
	 *     (imports+=DImport* name=DQualifiedName model=DomModel)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomModel returns DomModel
	 *
	 * Constraint:
	 *     snapshots+=DomSnapshot+
	 */
	protected void sequence_DomModel(ISerializationContext context, DomModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomObject returns DomNamedComplexObject
	 *     DomNamedComplexObject returns DomNamedComplexObject
	 *
	 * Constraint:
	 *     (name=ID (object=DmxEntity | object=DmxDetail))
	 */
	protected void sequence_DomNamedComplexObject(ISerializationContext context, DomNamedComplexObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomSnapshot returns DomSnapshot
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? objects+=DomObject*)
	 */
	protected void sequence_DomSnapshot(ISerializationContext context, DomSnapshot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
