/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.sm.sim.SAggregate
import com.mimacom.ddd.sm.sim.SAssociation
import com.mimacom.ddd.sm.sim.SAttribute
import com.mimacom.ddd.sm.sim.SComplexType
import com.mimacom.ddd.sm.sim.SCondition
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SDetailType
import com.mimacom.ddd.sm.sim.SDitchRule
import com.mimacom.ddd.sm.sim.SEntityType
import com.mimacom.ddd.sm.sim.SEnumeration
import com.mimacom.ddd.sm.sim.SFeature
import com.mimacom.ddd.sm.sim.SGrabRule
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SLiteral
import com.mimacom.ddd.sm.sim.SMultiplicity
import com.mimacom.ddd.sm.sim.SNamedElement
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SQuery
import com.mimacom.ddd.sm.sim.SQueryParameter
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.SValueType
import com.mimacom.ddd.sm.sim.SimPackage
import com.mimacom.ddd.sm.sim.SimUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.sm.sim.SElementNature.*

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SimValidator extends AbstractSimValidator {

	@Inject extension SimUtil
	
	@Inject IQualifiedNameProvider qualifiedNameProvider

	@Check
	def checkAggregateHasSingleRootOrRootHiearchy(SAggregate a) {
		val roots = a.types.filter(SEntityType).filter[nature != DEDUCTION_RULE && isRoot]
		// only one root hierarchy is allowed => top level is in same aggregate (superType == null) or in another aggregate
		val topLevelRoots =roots.filter[superType.aggregate != a]
		if(topLevelRoots.size > 1) {
			for (r: roots) {
				error('Aggregate can only declare a single root or relationship or a a single hierarchy thereof', r, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

// Types: restrictions on features and supertypes
	@Check
	def checkCyclicTypeHierarchy(SComplexType t) {
		if(t.typeHierarchy.contains(t)) {
			error('Type is part of a supertype cycle', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def checkSupertype(SComplexType t) {
		if(t.superType !== null) {
			if(t.superType.eClass !== t.eClass) {
				error('Supertype is not compatible', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
			val tDomain = EcoreUtil2.getContainerOfType(t, SInformationModel)
			val superTypeDomain = EcoreUtil2.getContainerOfType(t.superType, SInformationModel)
			if(superTypeDomain !== tDomain) {
				error('Supertype must be in same information model', t, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkNoFeatureOverrides(SComplexType t) {
		val inherited = t.inheritedFeatureNames
		for (f : t.features) {
			if(inherited.contains(f.name)) {
				error('Feature cannot override inherited feature with same name', f, SimPackage.Literals.SNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkCorrespondingDEntityType(SEntityType t) {
		if(t.nature == DEDUCTION_RULE) {
			val source = t.deductionRule.source
			if (source instanceof DEntityType) {
				// TODO Check whether constaint should be less restrictive to allow mapping from root to non-root types between DIM and SIM
				if (source.root !== t.root) {
					error("Deduced entity rule must match domain-model root root property", t.deductionRule,
						SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
				}
			} else if (source !== null) {
			error("Deduced entity rule must have a domain-model entity as its source", t.deductionRule,
				SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}	
		}
	}

	@Check
	def checkCorrespondingDDetailType(SDetailType t) {
		if(t.nature == DEDUCTION_RULE) {
			if(t.deductionRule.source !== null && ! (t.deductionRule.source instanceof DDetailType)) {
				error("Deduced DetailType rule must have a domain-model DetailType as its source", t.deductionRule,
					SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def void checkDeducedFeaturesCombination(SComplexType type) {
		if(type.nature == DEDUCTION_RULE) {
			if(type.deductionRule instanceof SGrabRule) {
				val hasDitchElements = type.features.exists[deductionRule instanceof SDitchRule]
				val hasGrabElements = type.features.exists[deductionRule instanceof SGrabRule]
				if(hasDitchElements && hasGrabElements) {
					error("Cannot use both grab rule and ditch rules together.", type.deductionRule,
						SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
				}
			}
		}
	}

	@Check
	def void checkHasDeducedContainer(SFeature feature) {
		if(feature.nature == DEDUCTION_RULE) {
			val container = feature.eContainer as SComplexType
			if(container.nature != DEDUCTION_RULE) {
				error("Features can only have a deduction rule if the containing type also has a deduction rule.", feature.deductionRule,
					SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDAttributeType(SAttribute a) {
		if(a.nature == DEDUCTION_RULE) {
			if(a.deductionRule.source !== null && ! (a.deductionRule.source instanceof DAttribute)) {
				error("Deduced attribute rule must have a domain-model attribute as its source", a.deductionRule,
					SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDQueryType(SQuery q) {
		if(q.nature == DEDUCTION_RULE) {
			if(q.deductionRule.source !== null && ! (q.deductionRule.source instanceof DQuery)) {
				error("Deduced query rule must have a domain-model attribute as its source", q.deductionRule,
					SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkCorrespondingDAssociationType(SAssociation a) {
		if(a.nature == DEDUCTION_RULE) {
			if(a.deductionRule.source !== null && ! (a.deductionRule.source instanceof DAssociation)) {
				error("Deduced association rule must have a domain-model association as its source",
					SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def void checkHasDeducedEnumeration(SLiteral literal) {
		if(literal.nature == DEDUCTION_RULE) {
			val container = literal.eContainer as SEnumeration
			if(container.nature != DEDUCTION_RULE) {
				error("Literals can only have a deduction rule if the containing enumeration also has a deduction rule.",
					literal.deductionRule, SimPackage.Literals.SDEDUCTION_RULE__SOURCE)
			}
		}
	}

	@Check
	def checkPrimitiveDoesNotRedefineItself(SPrimitive p) {
		if(p.redefines == p) {
			error('Primitive cannot redefine itself', p, SimPackage.Literals.SPRIMITIVE__REDEFINES)
		}
	}

	@Check
	def checkEnumerationHasLiterals(SEnumeration e) {
		if(e.literals.size == 0) {
			warningOnStructuralElement(e, getDescription(e) + ": Enumeration does not declare literals")
		}
	}

	@Check
	def checkAttributeIsValueType(SAttribute a) {
		if(a.nature == GENUINE && ! (a.type instanceof SValueType)) {
			error('Referenced type is not a ValueType', a, SimPackage.Literals.SFEATURE__TYPE)
		} else if(a.nature == SYNTHETIC) {
			if(a.type === null) {
				errorOnStructuralElement(a,  getDescription(a) + ": no mapping rule for type")
			} else if(! (a.type instanceof SValueType)) {
				errorOnStructuralElement(a, getDescription(a) + ": referenced type is not a ValueType")
			}
		}
	}

	@Check
	def checkAssocitionToRootType(SAssociation a) {
		if (a.nature == GENUINE && (! (a.type instanceof SEntityType && (a.type as SEntityType).root)))  {
			error('Referenced type is not a RootType', a, SimPackage.Literals.SFEATURE__TYPE)
		} else if(a.nature == SYNTHETIC) {
			if(a.type === null) {
				errorOnStructuralElement(a,  getDescription(a) + ": no mapping rule for type")
			} else if(! (a.type instanceof SValueType)) {
				errorOnStructuralElement(a,  getDescription(a) + ": referenced type is not a RootType")
			}
		}
	}

	@Check
	def checkAssociationMultiplicities(SMultiplicity m) {
		if(m.maxOccurs == 0) {
			error('Maximum targets cannot be 0', m, SimPackage.Literals.SMULTIPLICITY__MAX_OCCURS)
		}
	}

// // Parameters: restrictions on their types
	@Check
	def checkParameterIsValueType(SQueryParameter p) {
		if(p.nature == GENUINE) {
			if(! (p.type instanceof SValueType || p.type == p.eContainer)) {
				error('Refererenced query-parameter type is neither a ValueType nor the query\'s own container', p,
					SimPackage.Literals.SQUERY_PARAMETER__TYPE)
			}
		} else if(p.nature == SYNTHETIC) {
			if(p.type === null) {
				errorOnStructuralElement(p,  getDescription(p) + ": no mapping rule for type")
			} else if(! (p.type instanceof SValueType || p.type == p.eContainer)) {
				errorOnStructuralElement(p, getDescription(p) + ": type is neither a ValueType nor the query\'s own container")
			}
		}
	}

	// // Naming: Elements whose names should start with a CAPITAL
	def void checkNameStartsWithCapital(SNamedElement ne) {
		val name = ne.name
		if(name !== null && name.length > 0 && !Character::isUpperCase(name.charAt(0))) {
			warningOnStructuralElement(ne, getDescription(ne) + ": Name should start with a capital")
		}
	}

//	@Check
//	def void checkTypeNameStartsWithCapital(SInformationModel m) {
//		if (DEFAULT_IMPORT_TYPES == dm.name || DEFAULT_IMPORT_FUNCTIONS == m.name) {
//			return
//		}
//		checkNameStartsWithCapital(d)
//	}
	@Check
	def void checkTypeNameStartsWithCapital(SType t) {
		checkNameStartsWithCapital(t)
	}

	@Check
	def void checkTypeNameStartsWithCapital(SCondition c) {
		checkNameStartsWithCapital(c)
	}

// // Naming: Elements whose names should start with a LOWERCASE
	def void checkNameStartsWithLowercase(SNamedElement ne) {
		val first = ne.getName().charAt(0)
		val char underscore = '_'
		if(!Character::isLowerCase(first) && first !== underscore) {
			warningOnStructuralElement(ne,  getDescription(ne) + ": Name should start with a lowercase or underscore")
		}
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(SFeature f) {
		checkNameStartsWithLowercase(f)
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(SQueryParameter p) {
		checkNameStartsWithLowercase(p)
	}

// // Naming: Elements whose names should be ALL UPPERCASE
	@Check def void checkLiteralIsUppercase(SLiteral literal) {
		if(! literal.name.equals(literal.name.toUpperCase)) {
			warningOnStructuralElement(literal, getDescription(literal) + ": Name should be all upercase")
		}
	}

// - only 1 SPrimitive can realize a given DPrimitive

	protected def String getDescription(EObject obj) {
		var synthetic = ""	
		if (obj instanceof SDeducibleElement) {
			if (obj.synthetic) synthetic = "Synthetic "
		}
		synthetic + obj.class.simpleName + " " + qualifiedNameProvider.getFullyQualifiedName(obj)
	}
	
	protected def void warningOnStructuralElement(EObject e, String warningMsg) {
		if(e instanceof SDeducibleElement) {
			if(e.nature == SYNTHETIC) {
				val rule = e.deductionRule
				if(rule instanceof SSyntheticDeductionRule) {
					warningOnStructuralElementImpl(rule.elementWithRule, warningMsg)
				} else {
					val container = e.eContainer
					if(container instanceof SDeducibleElement) {
						warningOnStructuralElement(container, warningMsg) // recursion
					} else {
						warningOnStructuralElementImpl(container, warningMsg)
					}
				}

			} else if(e.nature == DEDUCTION_RULE) {
				warning(warningMsg, e, SimPackage.Literals.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE)

			} else if(e.nature == GENUINE) {
				warningOnStructuralElementImpl(e, warningMsg)
			}
		} else {
			warningOnStructuralElementImpl(e, warningMsg)
		}
	}

	protected def void warningOnStructuralElementImpl(EObject obj, String warningMsg) {
		if(obj instanceof SNamedElement) {
			warning(warningMsg, obj, SimPackage.Literals.SNAMED_ELEMENT__NAME)
		} else {
			warning(warningMsg, obj, null)
		}
	}

	protected def void errorOnStructuralElement(EObject e, String errorMsg) {
		if(e instanceof SDeducibleElement) {
			if(e.nature == SYNTHETIC) {
				val rule = e.deductionRule
				if(rule instanceof SSyntheticDeductionRule) {
					errorOnStructuralElementImpl(rule.elementWithRule, errorMsg)
				} else {
					val container = e.eContainer
					if(container instanceof SDeducibleElement) {
						errorOnStructuralElement(container, errorMsg) // recursion
					} else {
						errorOnStructuralElementImpl(container, errorMsg)
					}
				}

			} else if(e.nature == DEDUCTION_RULE) {
				error(errorMsg, e, SimPackage.Literals.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE)

			} else if(e.nature == GENUINE) {
				errorOnStructuralElementImpl(e, errorMsg)
			}
		} else {
			errorOnStructuralElementImpl(e, errorMsg)
		}
	}

	protected def void errorOnStructuralElementImpl(EObject obj, String errorMsg) {
		if(obj instanceof SNamedElement) {
			error(errorMsg, obj, SimPackage.Literals.SNAMED_ELEMENT__NAME)
		} else {
			error(errorMsg, obj, null)
		}
	}
}
