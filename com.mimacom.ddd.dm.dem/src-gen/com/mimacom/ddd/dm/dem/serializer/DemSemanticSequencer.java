/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dem.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DHuman;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.DTime;
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess;
import com.mimacom.ddd.dm.dmx.DAssignment;
import com.mimacom.ddd.dm.dmx.DBinaryOperation;
import com.mimacom.ddd.dm.dmx.DBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DCastExpression;
import com.mimacom.ddd.dm.dmx.DConstructorCall;
import com.mimacom.ddd.dm.dmx.DDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DForLoopExpression;
import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DIfExpression;
import com.mimacom.ddd.dm.dmx.DInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DPredicate;
import com.mimacom.ddd.dm.dmx.DRaiseExpression;
import com.mimacom.ddd.dm.dmx.DReturnExpression;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DStringLiteral;
import com.mimacom.ddd.dm.dmx.DUnaryOperation;
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxFunction;
import com.mimacom.ddd.dm.dmx.DmxFunctionParameter;
import com.mimacom.ddd.dm.dmx.DmxIterator;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxTest;
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
public class DemSemanticSequencer extends DmxSemanticSequencer {

	@Inject
	private DemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BasePackage.DCONDITION:
				sequence_DCondition(context, (DCondition) semanticObject); 
				return; 
			case BasePackage.DCONTEXT:
				if (rule == grammarAccess.getDContextRule()) {
					sequence_DContext(context, (DContext) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDPredicateContextRule()) {
					sequence_DPredicateContext(context, (DContext) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTestContextRule()) {
					sequence_DmxTestContext(context, (DContext) semanticObject); 
					return; 
				}
				else break;
			case BasePackage.DDOMAIN:
				sequence_DDomain(context, (DDomain) semanticObject); 
				return; 
			case BasePackage.DDOMAIN_EVENT:
				sequence_DDomainEvent(context, (DDomainEvent) semanticObject); 
				return; 
			case BasePackage.DHUMAN:
				sequence_DHuman(context, (DHuman) semanticObject); 
				return; 
			case BasePackage.DIMPORT:
				sequence_DImport(context, (DImport) semanticObject); 
				return; 
			case BasePackage.DMULTIPLICITY:
				sequence_DMultiplicity(context, (DMultiplicity) semanticObject); 
				return; 
			case BasePackage.DNOTIFICATION:
				sequence_DNotification(context, (DNotification) semanticObject); 
				return; 
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
				return; 
			case BasePackage.DTEXT_SEGMENT:
				if (rule == grammarAccess.getDTextEndRule()) {
					sequence_DTextEnd(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextMiddleRule()) {
					sequence_DTextMiddle(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextOnlyRule()) {
					sequence_DTextOnly(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextStartRule()) {
					sequence_DTextStart(context, (DTextSegment) semanticObject); 
					return; 
				}
				else break;
			case BasePackage.DTIME:
				sequence_DTime(context, (DTime) semanticObject); 
				return; 
			}
		else if (epackage == DmxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DmxPackage.DASSIGNMENT:
				if (rule == grammarAccess.getDAssignmentRule()) {
					sequence_DAssignment(context, (DAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDExpressionRule()
						|| rule == grammarAccess.getDNavigableMemberReferenceRule()
						|| action == grammarAccess.getDNavigableMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()
						|| action == grammarAccess.getDNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0()
						|| rule == grammarAccess.getDPredicateRule()
						|| rule == grammarAccess.getDOrExpressionRule()
						|| action == grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDAndExpressionRule()
						|| action == grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDEqualityExpressionRule()
						|| action == grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDRelationalExpressionRule()
						|| action == grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getDOtherOperatorExpressionRule()
						|| action == grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDAdditiveExpressionRule()
						|| action == grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDMultiplicativeExpressionRule()
						|| action == grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDUnaryOperationRule()
						|| rule == grammarAccess.getDCastExpressionRule()
						|| action == grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getDPrimaryExpressionRule()
						|| rule == grammarAccess.getDParenthesizedExpressionRule()) {
					sequence_DAssignment_DNavigableMemberReference(context, (DAssignment) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DBINARY_OPERATION:
				sequence_DAdditiveExpression_DAndExpression_DEqualityExpression_DMultiplicativeExpression_DOrExpression_DOtherOperatorExpression_DRelationalExpression(context, (DBinaryOperation) semanticObject); 
				return; 
			case DmxPackage.DBOOLEAN_LITERAL:
				sequence_DBooleanLiteral(context, (DBooleanLiteral) semanticObject); 
				return; 
			case DmxPackage.DCAST_EXPRESSION:
				sequence_DCastExpression(context, (DCastExpression) semanticObject); 
				return; 
			case DmxPackage.DCONSTRUCTOR_CALL:
				sequence_DConstructorCall(context, (DConstructorCall) semanticObject); 
				return; 
			case DmxPackage.DDECIMAL_LITERAL:
				sequence_DDecimalLiteral(context, (DDecimalLiteral) semanticObject); 
				return; 
			case DmxPackage.DFOR_LOOP_EXPRESSION:
				sequence_DForLoopExpression(context, (DForLoopExpression) semanticObject); 
				return; 
			case DmxPackage.DFUNCTION_CALL:
				sequence_DFunctionCall(context, (DFunctionCall) semanticObject); 
				return; 
			case DmxPackage.DIF_EXPRESSION:
				sequence_DIfExpression(context, (DIfExpression) semanticObject); 
				return; 
			case DmxPackage.DINSTANCE_OF_EXPRESSION:
				sequence_DRelationalExpression(context, (DInstanceOfExpression) semanticObject); 
				return; 
			case DmxPackage.DNATURAL_LITERAL:
				sequence_DNaturalLiteral(context, (DNaturalLiteral) semanticObject); 
				return; 
			case DmxPackage.DPREDICATE:
				sequence_DPredicate(context, (DPredicate) semanticObject); 
				return; 
			case DmxPackage.DRAISE_EXPRESSION:
				sequence_DRaiseExpression(context, (DRaiseExpression) semanticObject); 
				return; 
			case DmxPackage.DRETURN_EXPRESSION:
				sequence_DReturnExpression(context, (DReturnExpression) semanticObject); 
				return; 
			case DmxPackage.DSELF_EXPRESSION:
				sequence_DSelfExpression(context, (DSelfExpression) semanticObject); 
				return; 
			case DmxPackage.DSTRING_LITERAL:
				sequence_DStringLiteral(context, (DStringLiteral) semanticObject); 
				return; 
			case DmxPackage.DUNARY_OPERATION:
				sequence_DUnaryOperation(context, (DUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DUNDEFINED_LITERAL:
				sequence_DUndefinedLiteral(context, (DUndefinedLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_ARCHETYPE:
				sequence_DmxArchetype(context, (DmxArchetype) semanticObject); 
				return; 
			case DmxPackage.DMX_CONTEXT_REFERENCE:
				sequence_DmxContextReference(context, (DmxContextReference) semanticObject); 
				return; 
			case DmxPackage.DMX_FUNCTION:
				sequence_DmxFunction(context, (DmxFunction) semanticObject); 
				return; 
			case DmxPackage.DMX_FUNCTION_PARAMETER:
				sequence_DmxFunctionParameter(context, (DmxFunctionParameter) semanticObject); 
				return; 
			case DmxPackage.DMX_ITERATOR:
				sequence_DmxIterator(context, (DmxIterator) semanticObject); 
				return; 
			case DmxPackage.DMX_MEMBER_NAVIGATION:
				sequence_DNavigableMemberReference(context, (DmxMemberNavigation) semanticObject); 
				return; 
			case DmxPackage.DMX_NAMESPACE:
				sequence_DmxNamespace(context, (DmxNamespace) semanticObject); 
				return; 
			case DmxPackage.DMX_STATIC_REFERENCE:
				sequence_DmxStaticReference(context, (DmxStaticReference) semanticObject); 
				return; 
			case DmxPackage.DMX_TEST:
				sequence_DmxTest(context, (DmxTest) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DCondition returns DCondition
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* condition=DExpression description=DRichText?)
	 */
	protected void sequence_DCondition(ISerializationContext context, DCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DContext returns DContext
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* type=[DType|ID] multiplicity=DMultiplicity? description=DRichText?)
	 */
	protected void sequence_DContext(ISerializationContext context, DContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DDomainEvent returns DDomainEvent
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         description=DRichText? 
	 *         context+=DContext+ 
	 *         trigger=[DActor|ID] 
	 *         notifications+=DNotification* 
	 *         before+=DCondition* 
	 *         after+=DCondition*
	 *     )
	 */
	protected void sequence_DDomainEvent(ISerializationContext context, DDomainEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DDomain returns DDomain
	 *
	 * Constraint:
	 *     (name=DQualifiedName aliases+=ID* description=DRichText? imports+=DImport* (events+=DDomainEvent | actors+=DActor)*)
	 */
	protected void sequence_DDomain(ISerializationContext context, DDomain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DActor returns DHuman
	 *     DHuman returns DHuman
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText?)
	 */
	protected void sequence_DHuman(ISerializationContext context, DHuman semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DImport returns DImport
	 *
	 * Constraint:
	 *     importedNamespace=DQualifiedNameWithWildcard
	 */
	protected void sequence_DImport(ISerializationContext context, DImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DIMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DIMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDImportAccess().getImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DNotification returns DNotification
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         aliases+=ID* 
	 *         type=[DType|ID] 
	 *         multiplicity=DMultiplicity? 
	 *         notified=[DActor|ID] 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_DNotification(ISerializationContext context, DNotification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DActor returns DTime
	 *     DTime returns DTime
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText?)
	 */
	protected void sequence_DTime(ISerializationContext context, DTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
