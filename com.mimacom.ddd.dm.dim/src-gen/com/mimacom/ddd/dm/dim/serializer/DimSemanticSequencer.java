/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DException;
import com.mimacom.ddd.dm.base.DExistingApplication;
import com.mimacom.ddd.dm.base.DFunction;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DRootType;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DText;
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess;
import com.mimacom.ddd.dm.dmx.DAssignment;
import com.mimacom.ddd.dm.dmx.DBinaryOperation;
import com.mimacom.ddd.dm.dmx.DBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DCastExpression;
import com.mimacom.ddd.dm.dmx.DConstructorCall;
import com.mimacom.ddd.dm.dmx.DContextReference;
import com.mimacom.ddd.dm.dmx.DDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DForLoopExpression;
import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DIfExpression;
import com.mimacom.ddd.dm.dmx.DInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DRaiseExpression;
import com.mimacom.ddd.dm.dmx.DReturnExpression;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DStringLiteral;
import com.mimacom.ddd.dm.dmx.DTypedMemberReference;
import com.mimacom.ddd.dm.dmx.DUnaryOperation;
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxPackage;
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
			case BasePackage.DAGGREGATE:
				sequence_DAggregate(context, (DAggregate) semanticObject); 
				return; 
			case BasePackage.DASSOCIATION:
				sequence_DAssociation(context, (DAssociation) semanticObject); 
				return; 
			case BasePackage.DATTRIBUTE:
				sequence_DAttribute(context, (DAttribute) semanticObject); 
				return; 
			case BasePackage.DCONDITION:
				sequence_DConstraint(context, (DCondition) semanticObject); 
				return; 
			case BasePackage.DDETAIL_TYPE:
				sequence_DComplexType_DDetailType(context, (DDetailType) semanticObject); 
				return; 
			case BasePackage.DDOMAIN:
				sequence_DDomain(context, (DDomain) semanticObject); 
				return; 
			case BasePackage.DENUMERATION:
				sequence_DEnumeration(context, (DEnumeration) semanticObject); 
				return; 
			case BasePackage.DEXCEPTION:
				sequence_DException(context, (DException) semanticObject); 
				return; 
			case BasePackage.DEXISTING_APPLICATION:
				sequence_DExistingApplication(context, (DExistingApplication) semanticObject); 
				return; 
			case BasePackage.DFUNCTION:
				sequence_DFunction(context, (DFunction) semanticObject); 
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
			case BasePackage.DPRIMITIVE:
				if (rule == grammarAccess.getDPrimitiveArchetypeRule()) {
					sequence_DPrimitiveArchetype(context, (DPrimitive) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDPrimitiveRule()) {
					sequence_DPrimitive(context, (DPrimitive) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTypeRule()) {
					sequence_DPrimitive_DPrimitiveArchetype(context, (DPrimitive) semanticObject); 
					return; 
				}
				else break;
			case BasePackage.DQUERY:
				sequence_DQuery(context, (DQuery) semanticObject); 
				return; 
			case BasePackage.DQUERY_PARAMETER:
				sequence_DQueryParameter(context, (DQueryParameter) semanticObject); 
				return; 
			case BasePackage.DRELATIONSHIP:
				sequence_DComplexType_DRelationship(context, (DRelationship) semanticObject); 
				return; 
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
				return; 
			case BasePackage.DROOT_TYPE:
				sequence_DComplexType_DRootType(context, (DRootType) semanticObject); 
				return; 
			case BasePackage.DSERVICE:
				sequence_DService(context, (DService) semanticObject); 
				return; 
			case BasePackage.DSERVICE_PARAMETER:
				sequence_DServiceParameter(context, (DServiceParameter) semanticObject); 
				return; 
			case BasePackage.DTEXT:
				if (rule == grammarAccess.getDTextEndRule()) {
					sequence_DTextEnd(context, (DText) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextMiddleRule()) {
					sequence_DTextMiddle(context, (DText) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextOnlyRule()) {
					sequence_DTextOnly(context, (DText) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextStartRule()) {
					sequence_DTextStart(context, (DText) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == DmxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DmxPackage.DASSIGNMENT:
				sequence_DAssignment_DTypedMemberReference(context, (DAssignment) semanticObject); 
				return; 
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
			case DmxPackage.DCONTEXT_REFERENCE:
				sequence_DContextReference(context, (DContextReference) semanticObject); 
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE:
				sequence_DTypedMemberReference(context, (DTypedMemberReference) semanticObject); 
				return; 
			case DmxPackage.DUNARY_OPERATION:
				sequence_DUnaryOperation(context, (DUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DUNDEFINED_LITERAL:
				sequence_DNilLiteral(context, (DUndefinedLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_MODEL:
				sequence_DmxModel(context, (DmxModel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DAggregate returns DAggregate
	 *
	 * Constraint:
	 *     (description=DRichText? types+=DType*)
	 */
	protected void sequence_DAggregate(ISerializationContext context, DAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DFeature returns DAssociation
	 *     DAssociation returns DAssociation
	 *
	 * Constraint:
	 *     (
	 *         derived?='derived'? 
	 *         (kind=DAssociationKind | kind=DAssociationKindInverse) 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         type=[DRootType|ID] 
	 *         multiplicity=DMultiplicity? 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_DAssociation(ISerializationContext context, DAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DFeature returns DAttribute
	 *     DAttribute returns DAttribute
	 *
	 * Constraint:
	 *     (
	 *         detail?='detail'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         type=[DType|ID] 
	 *         multiplicity=DMultiplicity? 
	 *         key?='key'? 
	 *         description=DRichText?
	 *     )
	 */
	protected void sequence_DAttribute(ISerializationContext context, DAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
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
	 *         (features+=DFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DComplexType_DDetailType(ISerializationContext context, DDetailType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DType returns DRelationship
	 *     DRelationship returns DRelationship
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         (features+=DFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DComplexType_DRelationship(ISerializationContext context, DRelationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DType returns DRootType
	 *     DRootType returns DRootType
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         aliases+=ID* 
	 *         superType=[DComplexType|ID]? 
	 *         description=DRichText? 
	 *         (features+=DFeature | constraints+=DConstraint)*
	 *     )
	 */
	protected void sequence_DComplexType_DRootType(ISerializationContext context, DRootType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DConstraint returns DCondition
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* condition=DExpression description=DRichText?)
	 */
	protected void sequence_DConstraint(ISerializationContext context, DCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DDomain returns DDomain
	 *
	 * Constraint:
	 *     (
	 *         name=DQualifiedName 
	 *         aliases+=ID* 
	 *         description=DRichText? 
	 *         imports+=DImport* 
	 *         (types+=DType | functions+=DFunction | aggregates+=DAggregate | applications+=DExistingApplication | actors+=DService)*
	 *     )
	 */
	protected void sequence_DDomain(ISerializationContext context, DDomain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DType returns DEnumeration
	 *     DEnumeration returns DEnumeration
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? (literals+=DLiteral literals+=DLiteral*)? constraints+=DConstraint*)
	 */
	protected void sequence_DEnumeration(ISerializationContext context, DEnumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DException returns DException
	 *
	 * Constraint:
	 *     (name=ID description=DRichText?)
	 */
	protected void sequence_DException(ISerializationContext context, DException semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DExistingApplication returns DExistingApplication
	 *
	 * Constraint:
	 *     (name=ID description=DRichText? (services+=DService | exceptions+=DException | types+=DType)*)
	 */
	protected void sequence_DExistingApplication(ISerializationContext context, DExistingApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DFunction returns DFunction
	 *
	 * Constraint:
	 *     (name=ID type=[DType|ID] multiplicity=DMultiplicity?)
	 */
	protected void sequence_DFunction(ISerializationContext context, DFunction semanticObject) {
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
	 *     DLiteral returns DLiteral
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText?)
	 */
	protected void sequence_DLiteral(ISerializationContext context, DLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DPrimitiveArchetype returns DPrimitive
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* description=DRichText? constraints+=DConstraint*)
	 */
	protected void sequence_DPrimitiveArchetype(ISerializationContext context, DPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DPrimitive returns DPrimitive
	 *
	 * Constraint:
	 *     (name=ID aliases+=ID* redefines=[DPrimitive|ID] description=DRichText? constraints+=DConstraint*)
	 */
	protected void sequence_DPrimitive(ISerializationContext context, DPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DType returns DPrimitive
	 *
	 * Constraint:
	 *     (
	 *         (name=ID aliases+=ID* redefines=[DPrimitive|ID] description=DRichText? constraints+=DConstraint*) | 
	 *         (name=ID aliases+=ID* description=DRichText? constraints+=DConstraint*)
	 *     )
	 */
	protected void sequence_DPrimitive_DPrimitiveArchetype(ISerializationContext context, DPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DQueryParameter returns DQueryParameter
	 *
	 * Constraint:
	 *     (name=ID type=[DType|ID] multiplicity=DMultiplicity? description=DRichText?)
	 */
	protected void sequence_DQueryParameter(ISerializationContext context, DQueryParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DFeature returns DQuery
	 *     DQuery returns DQuery
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
	protected void sequence_DQuery(ISerializationContext context, DQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DServiceParameter returns DServiceParameter
	 *
	 * Constraint:
	 *     (direction=DDirection name=ID type=[DType|ID] multiplicity=DMultiplicity? description=DRichText?)
	 */
	protected void sequence_DServiceParameter(ISerializationContext context, DServiceParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DService returns DService
	 *
	 * Constraint:
	 *     (
	 *         kind=DServiceKind? 
	 *         name=ID 
	 *         (parameters+=DServiceParameter parameters+=DServiceParameter*)? 
	 *         (raises+=[DException|ID] raises+=[DException|ID]*)? 
	 *         description=DRichText? 
	 *         precondition=DExpression? 
	 *         postcondition=DExpression? 
	 *         types+=DType*
	 *     )
	 */
	protected void sequence_DService(ISerializationContext context, DService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
