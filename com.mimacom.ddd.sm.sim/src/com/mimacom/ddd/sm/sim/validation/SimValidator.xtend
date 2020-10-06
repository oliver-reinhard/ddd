/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.IIdentityType
import com.mimacom.ddd.dm.base.base.ITransposableElement
import com.mimacom.ddd.dm.base.base.ITransposition
import com.mimacom.ddd.dm.base.base.IValueType
import com.mimacom.ddd.dm.base.base.TImplicitTransposition
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TDitchRule
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TFuseRule
import com.mimacom.ddd.dm.base.transpose.TGrabRule
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule
import com.mimacom.ddd.dm.base.transpose.TTristate
import com.mimacom.ddd.dm.base.transpose.TransposePackage
import com.mimacom.ddd.sm.sim.SimUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimValidator extends AbstractSimValidator {

	@Inject extension SimUtil

	@Inject IQualifiedNameProvider qualifiedNameProvider

	@Check
	override checkAggregateHasSingleRootOrRootHiearchy(DAggregate a) {
		val roots = a.types.filter(DEntityType).filter[! (it instanceof TEntityTypeTransposition) && isRoot]
		// only one root hierarchy is allowed => top level is in same aggregate (superType == null) or in another aggregate
		val topLevelRoots = roots.filter[superType.aggregate != a]
		if (topLevelRoots.size > 1) {
			for (r : roots) {
				error('Aggregate can only declare a single root or relationship or a single hierarchy thereof', r,
					BasePackage.Literals.DNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkCorrespondingAggregateType(TAggregateTransposition a) {
		if (a.getTranspositionRule.getSource !== null && ! (a.getTranspositionRule.getSource instanceof DAggregate)) {
			error("Deduced-aggregate rule must have a domain-model Aggregate as its source", a.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

// Types: restrictions on features and supertypes
	@Check
	def checkCorrespondingDEntityType(TEntityTypeTransposition t) {
		val source = t.getTranspositionRule.getSource
		if (source instanceof DEntityType) {
			if (source.root !== t.root) {
				error("Deduced-entity rule must match domain-model root property", t.getTranspositionRule,
					BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
			}
		} else if (source !== null) {
			error("Deduced-entity rule must have a domain-model entity as its source", t.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def checkCorrespondingDDetailType(TDetailTypeTransposition t) {
		if (t.getTranspositionRule.getSource !== null && ! (t.getTranspositionRule.getSource instanceof DDetailType)) {
			error("Deduced-DetailType rule must have a domain-model DetailType as its source", t.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def checkRootPropertyForDetailType(TDetailTypeTransposition t) {
		val rule = t.getTranspositionRule
		if (rule instanceof TStructureChangingRule) {
			val setsRootProperty = rule.getRootEntity != TTristate.DONT_CARE
			if (setsRootProperty) {
				warning("Setting the root property for DetailTypes does not have any effect.", rule,
					TransposePackage.Literals.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY)
			}
		}
	}

	@Check
	def void checkDeducedFeaturesCombination(TComplexTypeTransposition t) {
		if (t.getTranspositionRule instanceof TGrabRule) {
			val featureDeductionDefinitions = (t as DComplexType).features.filter(TFeatureTransposition)
			val hasDitchElements = featureDeductionDefinitions.exists[getTranspositionRule instanceof TDitchRule]
			val hasGrabElements = featureDeductionDefinitions.exists[getTranspositionRule instanceof TGrabRule]
			if (hasDitchElements && hasGrabElements) {
				error("Cannot use both grab rule and ditch rules together.", t.getTranspositionRule,
					BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
			}
		}
	}

	@Check
	def void checkComplexTypeExtensionChange(TStructureChangingRule r) {
		if (r.getExtendFrom !== null) {
			val container = r.eContainer
			if (container instanceof TComplexTypeTransposition) {
				if (container.baseImplClass != r.getExtendFrom.class) {
					error("New super type is not compatible with the subject of this rule", r,
						TransposePackage.Literals.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM)
				}
			}
		}
	}

	@Check
	def void checkComplexTypeExtensionChange(TFuseRule r) {
		// TODO remove check after feature has been implemented
		if (! r.otherSources.empty) {
			error("Feature not implemented yet", r, TransposePackage.Literals.TFUSE_RULE__OTHER_SOURCES)
		}
	}

	@Check
	def void checkHasDeducedContainer(TFeatureTransposition f) {
		val container = f.eContainer
		if (!(container instanceof TComplexTypeTransposition || container instanceof TAggregateTransposition)) {
			error(
				"Features can only have a deduction rule if the containing type or aggregate also has a deduction rule.",
				f.getTranspositionRule, BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def checkCorrespondingDAttributeType(TAttributeTransposition a) {
		if (a.getTranspositionRule.getSource !== null && ! (a.getTranspositionRule.getSource instanceof DAttribute)) {
			error("Deduced attribute rule must have a domain-model attribute as its source", a.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def checkCorrespondingDQueryType(TQueryTransposition q) {
		if (q.getTranspositionRule.getSource !== null && ! (q.getTranspositionRule.getSource instanceof DQuery)) {
			error("Deduced query rule must have a domain-model query as its source", q.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def checkCorrespondingDAssociationType(TAssociationTransposition a) {
		if (a.getTranspositionRule.getSource !== null && ! (a.getTranspositionRule.getSource instanceof DAssociation)) {
			error("Deduced association rule must have a domain-model association as its source", a.getTranspositionRule,
				BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	def void checkHasDeducedEnumeration(TLiteralTransposition literal) {
		val container = literal.eContainer
		if (! (container instanceof TEnumerationTransposition)) {
			error("Literals can only have a deduction rule if the containing enumeration also has a deduction rule.",
				literal.getTranspositionRule, BasePackage.Literals.TTRANSPOSITION_RULE__SOURCE)
		}
	}

	@Check
	override checkEnumerationHasLiterals(DEnumeration e) {
		if (e instanceof ITransposition) {
			return
		}
		super.checkEnumerationHasLiterals(e)
	}
	
	override protected allTypes(DAggregate a) {
		if (a instanceof TAggregateTransposition) {
			val types = Lists.newArrayList
			types.addAll(a.types.filter[! (it instanceof ITransposition)])
			types.addAll(a.syntheticTypes)
			return types
		}
		return super.allTypes(a)
	}

	override checkFeatureTypeIsSet(DFeature f) {
		if (! (f instanceof ITransposition || f.isSynthetic)) {
			super.checkFeatureTypeIsSet(f)
		}
	}
	
	@Check
	override checkAttributeIsValueType(DAttribute a) {
		if (a instanceof ITransposition) {
			return
		}
		if (! a.isSynthetic && ! (a.getType instanceof IValueType)) {
			super.checkAttributeIsValueType(a)
		} else if (a.isSynthetic) {
			if (a.type === null) {
				val deductionDefinition = a.getTransposedBy
				val source = deductionDefinition?.getTranspositionRule?.getSource as DAttribute
				val sourceType = source?.type
				errorOnStructuralElement(a, getDescription(a) + ": no type mapping for domain type '" + sourceType?.name + "'")
			} else if (! (a.getType instanceof IValueType)) {
				errorOnStructuralElement(a, getDescription(a) + ": attribute type must be a ValueType")
			}
		}
	}

	@Check
	override checkAssocitionToEntityType(DAssociation a) {
		if (a instanceof ITransposition) {
			return
		}
//		if (! a.synthetic && (! (a.getType instanceof DEntityType && (a.getType as DEntityType).root)))  {
//			super.checkAssocitionToRootType(a)
//		} else
		if (a.isSynthetic) {
			if (a.type === null) {
				val deductionDefinition = a.getTransposedBy
				val source = deductionDefinition?.getTranspositionRule?.getSource as DAssociation
				val sourceType = source?.type
				errorOnStructuralElement(a,
					getDescription(a) + ": no type mapping for association-target domain type '" + sourceType?.name + "'")
			} else if (! (a.getType instanceof IIdentityType)) {
				errorOnStructuralElement(a, getDescription(a) + ": association target must be an IdentityType")
			}
		}
	}

// // Queries and their parameters: restrictions on their types
	override checkMemberType(DNavigableMember p) {
		if (p instanceof ITransposition) {
			return
		}
		if (p instanceof ITransposableElement) {
			if (! p.isSynthetic) {
				super.checkMemberType(p)
			} else if (p.getType === null) {
				val source = p.getTransposedBy?.getTranspositionRule?.getSource
				var sourceType = ""
				if (source instanceof DNavigableMember) {
					if (source.type !== null) {
						sourceType = " '" + source.type.name + "'"
					}
				}
				errorOnStructuralElement(p, getDescription(p) + ": no type mapping for domain type" + sourceType)
			} else if (! p.isAllowedMemberType) {
				errorOnStructuralElement(p, getDescription(p) + ": " + ILLEGAL_MEMBER_TYPE_MSG)
			}
		}
	}

// // Naming: Elements whose names should start with a CAPITAL
//	@Check
//	def void checkTypeNameStartsWithCapital(SInformationModel m) {
//		if (DEFAULT_IMPORT_TYPES == dm.name || DEFAULT_IMPORT_FUNCTIONS == m.name) {
//			return
//		}
//		checkNameStartsWithCapital(d)
//	}
// // Naming: Elements whose names should start with a LOWERCASE
// // Naming: Elements whose names should be ALL UPPERCASE
// - only 1 SPrimitive can realize a given DPrimitive
	protected def String getDescription(EObject obj) {
		var synthetic = ""
		if (obj instanceof ITransposableElement) {
			if (obj.isSynthetic) synthetic = "Synthetic "
		}
		synthetic + obj.class.simpleName + " " + qualifiedNameProvider.getFullyQualifiedName(obj)
	}

	protected def void warningOnStructuralElement(EObject e, String warningMsg) {
		if (e instanceof ITransposableElement) {
			if (e.isSynthetic) {
				var definition = e.getTransposedBy
				if (definition instanceof TImplicitTransposition) {
					while (definition instanceof TImplicitTransposition) {
						definition = definition.originalDeductionDefinition
					}
					warningOnStructuralElementImpl(definition, warningMsg)
				} else {
					val container = e.eContainer
					if (container instanceof ITransposableElement) {
						warningOnStructuralElement(container, warningMsg) // recursion
					} else {
						warningOnStructuralElementImpl(container, warningMsg)
					}
				}

			} else if (e instanceof ITransposition) {
				warning(warningMsg, e, BasePackage.Literals.ITRANSPOSITION__TRANSPOSITION_RULE)

			} else if (! e.isSynthetic) {
				warningOnStructuralElementImpl(e, warningMsg)
			}
		} else {
			warningOnStructuralElementImpl(e, warningMsg)
		}
	}

	protected def void warningOnStructuralElementImpl(EObject obj, String warningMsg) {
		if (obj instanceof DNamedElement) {
			warning(warningMsg, obj, BasePackage.Literals.DNAMED_ELEMENT__NAME)
		} else {
			warning(warningMsg, obj, null)
		}
	}

	protected def void errorOnStructuralElement(EObject e, String errorMsg) {
		if (e instanceof ITransposableElement) {
			if (e.isSynthetic) {
				var definition = e.getTransposedBy
				if (definition instanceof TImplicitTransposition) {
					while (definition instanceof TImplicitTransposition) {
						definition = definition.originalDeductionDefinition
					}
					errorOnStructuralElementImpl(definition, errorMsg)
				} else {
					val container = e.eContainer
					if (container instanceof ITransposableElement) {
						errorOnStructuralElement(container, errorMsg) // recursion
					} else {
						errorOnStructuralElementImpl(container, errorMsg)
					}
				}

			} else if (e instanceof ITransposition) {
				error(errorMsg, e, BasePackage.Literals.ITRANSPOSITION__TRANSPOSITION_RULE)

			} else if (! e.isSynthetic) {
				errorOnStructuralElementImpl(e, errorMsg)
			}
		} else {
			errorOnStructuralElementImpl(e, errorMsg)
		}
	}

	protected def void errorOnStructuralElementImpl(EObject obj, String errorMsg) {
		if (obj instanceof DNamedElement) {
			error(errorMsg, obj, BasePackage.Literals.DNAMED_ELEMENT__NAME)
		} else {
			error(errorMsg, obj, null)
		}
	}
}
