/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SAssociation;
import com.mimacom.ddd.sm.sim.SAttribute;
import com.mimacom.ddd.sm.sim.SCondition;
import com.mimacom.ddd.sm.sim.SDetailType;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SExpression;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabDomainRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SImport;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SRootType;
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
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SimSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimPackage.SAGGREGATE:
				sequence_SAggregate(context, (SAggregate) semanticObject); 
				return; 
			case SimPackage.SASSOCIATION:
				sequence_SAssociation(context, (SAssociation) semanticObject); 
				return; 
			case SimPackage.SATTRIBUTE:
				sequence_SAttribute(context, (SAttribute) semanticObject); 
				return; 
			case SimPackage.SCONDITION:
				sequence_SConstraint(context, (SCondition) semanticObject); 
				return; 
			case SimPackage.SDETAIL_TYPE:
				sequence_SComplexTypeExtends_SComplexTypeFeatures_SDetailType(context, (SDetailType) semanticObject); 
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
				else break;
			case SimPackage.SENUMERATION:
				sequence_SEnumeration(context, (SEnumeration) semanticObject); 
				return; 
			case SimPackage.SEXPRESSION:
				sequence_SExpression(context, (SExpression) semanticObject); 
				return; 
			case SimPackage.SFUSE_RULE:
				sequence_SFuseComplexTypeRule(context, (SFuseRule) semanticObject); 
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
			case SimPackage.SIMPORT:
				sequence_SImport(context, (SImport) semanticObject); 
				return; 
			case SimPackage.SINFORMATION_MODEL:
				sequence_SInformationModel(context, (SInformationModel) semanticObject); 
				return; 
			case SimPackage.SLITERAL:
				sequence_SLiteral(context, (SLiteral) semanticObject); 
				return; 
			case SimPackage.SMORPH_RULE:
				if (rule == grammarAccess.getSMorphComplexTypeRuleRule()) {
					sequence_SMorphComplexTypeRule(context, (SMorphRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSMorphFeatureRuleRule()) {
					sequence_SMorphFeatureRule(context, (SMorphRule) semanticObject); 
					return; 
				}
				else break;
			case SimPackage.SMULTIPLICITY:
				sequence_SMultiplicity(context, (SMultiplicity) semanticObject); 
				return; 
			case SimPackage.SPRIMITIVE:
				sequence_SPrimitive(context, (SPrimitive) semanticObject); 
				return; 
			case SimPackage.SQUERY:
				sequence_SQuery(context, (SQuery) semanticObject); 
				return; 
			case SimPackage.SQUERY_PARAMETER:
				sequence_SQueryParameter(context, (SQueryParameter) semanticObject); 
				return; 
			case SimPackage.SROOT_TYPE:
				sequence_SComplexTypeExtends_SComplexTypeFeatures_SRootType(context, (SRootType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SAggregate returns SAggregate
	 *
	 * Constraint:
	 *     (deductionRule=SGrabAggregateRule? types+=SType*)
	 */
	protected void sequence_SAggregate(ISerializationContext context, SAggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SFeature returns SAssociation
	 *     SAssociation returns SAssociation
	 *
	 * Constraint:
	 *     (
	 *         deductionRule=SGrabFeatureRule | 
	 *         deductionRule=SMorphFeatureRule | 
	 *         deductionRule=SDitchFeatureRule | 
	 *         (derived?='derived'? (kind=SAssociationKind | kind=SAssociationKindInverse) name=ID type=[SRootType|ID] multiplicity=SMultiplicity?)
	 *     )
	 */
	protected void sequence_SAssociation(ISerializationContext context, SAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SFeature returns SAttribute
	 *     SAttribute returns SAttribute
	 *
	 * Constraint:
	 *     (
	 *         (detail?='detail'? deductionRule=SGrabFeatureRule) | 
	 *         (detail?='detail'? deductionRule=SMorphFeatureRule) | 
	 *         (detail?='detail'? deductionRule=SDitchFeatureRule) | 
	 *         (detail?='detail'? name=ID type=[SSimpleType|ID] multiplicity=SMultiplicity? key?='key'?)
	 *     )
	 */
	protected void sequence_SAttribute(ISerializationContext context, SAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SType returns SDetailType
	 *     SDetailType returns SDetailType
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (abstract?='abstract'? deductionRule=SGrabComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SDitchComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SMorphComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SFuseComplexTypeRule) | 
	 *             (abstract?='abstract'? name=ID superType=[SComplexType|ID]?)
	 *         ) 
	 *         (features+=SFeature | constraints+=SConstraint)*
	 *     )
	 */
	protected void sequence_SComplexTypeExtends_SComplexTypeFeatures_SDetailType(ISerializationContext context, SDetailType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SType returns SRootType
	 *     SRootType returns SRootType
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (abstract?='abstract'? deductionRule=SGrabComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SDitchComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SMorphComplexTypeRule) | 
	 *             (abstract?='abstract'? deductionRule=SFuseComplexTypeRule) | 
	 *             (abstract?='abstract'? name=ID superType=[SComplexType|ID]?)
	 *         ) 
	 *         (features+=SFeature | constraints+=SConstraint)*
	 *     )
	 */
	protected void sequence_SComplexTypeExtends_SComplexTypeFeatures_SRootType(ISerializationContext context, SRootType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SConstraint returns SCondition
	 *
	 * Constraint:
	 *     (name=ID condition=SExpression)
	 */
	protected void sequence_SConstraint(ISerializationContext context, SCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SNAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SNAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SCONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SCONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSConstraintAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSConstraintAccess().getConditionSExpressionParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchComplexTypeRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DEnumeration|ID]
	 */
	protected void sequence_SDitchComplexTypeRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
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
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SDitchEnumerationRule returns SDitchRule
	 *
	 * Constraint:
	 *     source=[DEnumeration|ID]
	 */
	protected void sequence_SDitchEnumerationRule(ISerializationContext context, SDitchRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
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
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SType returns SEnumeration
	 *     SEnumeration returns SEnumeration
	 *
	 * Constraint:
	 *     (
	 *         (deductionRule=SGrabEnumerationRule | deductionRule=SDitchEnumerationRule | name=ID) 
	 *         (literals+=SLiteral literals+=SLiteral*)? 
	 *         constraints+=SConstraint*
	 *     )
	 */
	protected void sequence_SEnumeration(ISerializationContext context, SEnumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SExpression returns SExpression
	 *
	 * Constraint:
	 *     expr=STRING
	 */
	protected void sequence_SExpression(ISerializationContext context, SExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SEXPRESSION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SEXPRESSION__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSExpressionAccess().getExprSTRINGTerminalRuleCall_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SFuseComplexTypeRule returns SFuseRule
	 *
	 * Constraint:
	 *     (source=[DComplexType|SQualifiedName] otherSources+=[DComplexType|SQualifiedName]+ renameTo=ID? extendFrom=[SComplexType|ID]?)
	 */
	protected void sequence_SFuseComplexTypeRule(ISerializationContext context, SFuseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabAggregateRule returns SGrabAggregateRule
	 *
	 * Constraint:
	 *     source=[DAggregate|ID]
	 */
	protected void sequence_SGrabAggregateRule(ISerializationContext context, SGrabAggregateRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateIDTerminalRuleCall_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SGrabComplexTypeRule returns SGrabRule
	 *
	 * Constraint:
	 *     (source=[DComplexType|SQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SGrabComplexTypeRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SGrabDomainRule returns SGrabDomainRule
	 *
	 * Constraint:
	 *     source=[DDomain|SQualifiedName]
	 */
	protected void sequence_SGrabDomainRule(ISerializationContext context, SGrabDomainRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SDEDUCTION_RULE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainSQualifiedNameParserRuleCall_2_0_1(), semanticObject.eGet(SimPackage.Literals.SDEDUCTION_RULE__SOURCE, false));
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
	 *     (source=[DEnumeration|SQualifiedName] renameTo=ID?)
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
	 *     (source=[DPrimitive|SQualifiedName] renameTo=ID?)
	 */
	protected void sequence_SGrabPrimitiveRule(ISerializationContext context, SGrabRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SImport returns SImport
	 *
	 * Constraint:
	 *     importedNamespace=SQualifiedNameWithWildcard
	 */
	protected void sequence_SImport(ISerializationContext context, SImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SIMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SIMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SInformationModel returns SInformationModel
	 *
	 * Constraint:
	 *     (
	 *         kind=SInformationModelKind 
	 *         name=SQualifiedName 
	 *         generate?='generate'? 
	 *         imports+=SImport* 
	 *         (types+=SType | aggregates+=SAggregate | grabDomainRules+=SGrabDomainRule)*
	 *     )
	 */
	protected void sequence_SInformationModel(ISerializationContext context, SInformationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SLiteral returns SLiteral
	 *
	 * Constraint:
	 *     (deductionRule=SGrabEnumerationLiteralRule | deductionRule=SDitchEnumerationLiteralRule | name=ID)
	 */
	protected void sequence_SLiteral(ISerializationContext context, SLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMorphComplexTypeRule returns SMorphRule
	 *
	 * Constraint:
	 *     (source=[DComplexType|SQualifiedName] renameTo=ID? retypeTo=[SComplexType|ID]?)
	 */
	protected void sequence_SMorphComplexTypeRule(ISerializationContext context, SMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMorphFeatureRule returns SMorphRule
	 *
	 * Constraint:
	 *     (source=[DFeature|ID] renameTo=ID? (retypeTo=[SType|ID] remultiplyTo=SMultiplicity?)?)
	 */
	protected void sequence_SMorphFeatureRule(ISerializationContext context, SMorphRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMultiplicity returns SMultiplicity
	 *
	 * Constraint:
	 *     (minOccurs=INT maxOccurs=MULTIPLICITY)
	 */
	protected void sequence_SMultiplicity(ISerializationContext context, SMultiplicity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SMULTIPLICITY__MIN_OCCURS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SMULTIPLICITY__MIN_OCCURS));
			if (transientValues.isValueTransient(semanticObject, SimPackage.Literals.SMULTIPLICITY__MAX_OCCURS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimPackage.Literals.SMULTIPLICITY__MAX_OCCURS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSMultiplicityAccess().getMinOccursINTTerminalRuleCall_1_0(), semanticObject.getMinOccurs());
		feeder.accept(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0(), semanticObject.getMaxOccurs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SType returns SPrimitive
	 *     SPrimitive returns SPrimitive
	 *
	 * Constraint:
	 *     ((deductionRule=SGrabPrimitiveRule | name=ID | (name=ID redefines=[SPrimitive|ID])) constraints+=SConstraint*)
	 */
	protected void sequence_SPrimitive(ISerializationContext context, SPrimitive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SQueryParameter returns SQueryParameter
	 *
	 * Constraint:
	 *     (
	 *         deductionRule=SGrabFeatureRule | 
	 *         deductionRule=SMorphFeatureRule | 
	 *         deductionRule=SDitchFeatureRule | 
	 *         (name=ID type=[SType|ID] multiplicity=SMultiplicity?)
	 *     )
	 */
	protected void sequence_SQueryParameter(ISerializationContext context, SQueryParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SFeature returns SQuery
	 *     SQuery returns SQuery
	 *
	 * Constraint:
	 *     (
	 *         ((deductionRule=SGrabFeatureRule | deductionRule=SMorphFeatureRule) (parameters+=SQueryParameter parameters+=SQueryParameter*)?) | 
	 *         deductionRule=SDitchFeatureRule | 
	 *         (name=ID (parameters+=SQueryParameter parameters+=SQueryParameter*)? type=[SType|ID] multiplicity=SMultiplicity? returns=SExpression?)
	 *     )
	 */
	protected void sequence_SQuery(ISerializationContext context, SQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
