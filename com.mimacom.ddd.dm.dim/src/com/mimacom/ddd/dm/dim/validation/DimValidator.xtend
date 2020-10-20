/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.validation

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DContext
import com.mimacom.ddd.dm.base.base.DEntityNature
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DMultiplicity
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DNamedPredicate
import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.DState
import com.mimacom.ddd.dm.base.base.DStateEvent
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.IValueType
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.dm.dim.DomainInformationModel
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.*

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DimValidator extends AbstractDimValidator {

	@Inject extension DimUtil

	val NAME_ALL_UPPERCASE = "Name should be all uppercase"

	@Check
	def checkDomainDeclaresOnlyValueTypes(DomainInformationModel d) {
		for (vt : d.types) {
			if (! (vt instanceof IValueType)) {
				error('Declared type is not a value type', vt, BasePackage.Literals.DNAMED_ELEMENT__NAME)
			} else if (vt instanceof DComplexType) {
				for (f : vt.features) {
					if (f instanceof DAssociation) {
						error('Declared feature cannot be an association', f, BasePackage.Literals.DNAMED_ELEMENT__NAME)
					}
				}
			}
		}
	}

	@Check
	def checkAggregateHasSingleRootOrRootHiearchy(DAggregate a) {
		val roots = a.types.filter(DEntityType).filter[isRoot]
		// only one root hierarchy is allowed => top level is in same aggregate (superType == null) or in another aggregate
		val topLevelRoots = roots.filter[superType.aggregate != a]
		if (topLevelRoots.size > 1) {
			for (r : roots) {
				error(
					'Aggregate can only declare a single root / main entity or relationship or a a single hierarchy thereof',
					r, BasePackage.Literals.DNAMED_ELEMENT__NAME)
			}
		}
//		if(roots.size == 0) {
//			warning('Aggregate does not declare a root or a relationship', a, BasePackage.Literals.DAGGREGATE)
//		}
	}

// Types: restrictions on features and supertypes
	@Check
	def checkCyclicTypeHierarchy(DComplexType t) {
		if (t.typeHierarchy.contains(t)) {
			error('Type is part of a supertype cycle', t, BasePackage.Literals.DNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def checkSupertype(DComplexType t) {
		if (t.superType !== null) {
			if (t.superType.eClass !== t.eClass) {
				error('Supertype is not compatible', t, BasePackage.Literals.DNAMED_ELEMENT__NAME)
			} else if (t instanceof DEntityType) {
				if (t.isRoot !== (t.superType as DEntityType).isRoot) {
					error("Entity or relationship root property must match supertype's root property", t,
						BasePackage.Literals.DNAMED_ELEMENT__NAME)
				}
			}
			val tDomain = EcoreUtil2.getContainerOfType(t, DomainInformationModel)
			val superTypeDomain = EcoreUtil2.getContainerOfType(t.superType, DomainInformationModel)
			if (superTypeDomain !== tDomain) {
				error('Supertype must be in same domain', t, BasePackage.Literals.DNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkNoFeatureOverrides(DComplexType t) {
		val inherited = t.inheritedFeatureNames
		for (f : t.features) {
			if (inherited.contains(f.name)) {
				error('Feature cannot override inherited feature with same name', f,
					BasePackage.Literals.DNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkRelationshipHasTwoAssociations(DEntityType r) {
		if (r.nature == DEntityNature.RELATIONSHIP) {
			var count = 0;
			for (i : 0 ..< r.features.size) {
				if (r.features.get(i) instanceof DAssociation) count++
			}
			if (count < 2) {
				error('A relationship must declare at least 2 associations', r,
					BasePackage.Literals.DNAMED_ELEMENT__NAME)
			}
		}
	}

	@Check
	def checkPrimitiveDoesNotRedefineItself(DPrimitive p) {
		if (p.redefines == p) {
			error('Primitive cannot redefine itself', p, BasePackage.Literals.DPRIMITIVE__REDEFINES)
		}
	}

	@Check
	def checkEnumerationHasLiterals(DEnumeration e) {
		if (e.literals.size == 0) {
			warning('Enumeration does not declare literals', e, BasePackage.Literals.DNAMED_ELEMENT__NAME)
		}
	}
	
	@Check
	def checkFeatureTypeIsSet(DFeature f) {
		if (f.type === null) {
			error('Feature must have a type', f, BasePackage.Literals.DNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def checkAttributeIsValueType(DAttribute a) {
		if (! (a.type instanceof IValueType)) {
			error('Referenced type must be a ValueType', a, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE)
		}
	}

	@Check
	def checkRealWorldEntityType(DEntityType e) {
		if (e.nature == DEntityNature.AUTONOMOUS_ENTITY && e.abstract) {
			error('Autonomous entities cannot be abstract', e,
				BasePackage.Literals.DCOMPLEX_TYPE__ABSTRACT)
		}
	}

	@Check
	def checkAssocitionToEntityType(DAssociation a) {
		if (! (a.getType instanceof DEntityType)) {
			error('Referenced type must be an EntityType', a, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE)
		}
	}

	@Check
	def checkAssociationMultiplicities(DMultiplicity m) {
		if (m.maxOccurs == 0) {
			error('Maximum targets cannot be 0', m, BasePackage.Literals.DMULTIPLICITY__MAX_OCCURS)
		}
	}

	// // Queries: restrictions on types

	@Check
	def checkQueryType(DQuery q) {
		checkMemberType(q)
	}
	
	@Check
	def checkQueryParameterType(DQueryParameter p) {
		checkMemberType(p)
	}
	
	protected def checkMemberType(DNavigableMember member) {
		if (! member.isAllowedMemberType) {
			error("Referenced " + ILLEGAL_MEMBER_TYPE_MSG, member, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE)
		}
	}
	
	protected static val ILLEGAL_MEMBER_TYPE_MSG = "type must be a ValueType, the query's own container, or the component's main entity"
	
	protected def boolean isAllowedMemberType(DNavigableMember member) {
		val containingType = EcoreUtil2.getContainerOfType(member, DComplexType)  // is null if container is an aggregate
		val aggregate = EcoreUtil2.getContainerOfType(member, DAggregate)
		val type = member.type
		return type instanceof IValueType || type == containingType ||
			type instanceof DEntityType && (type as DEntityType).root && aggregate.allTypes.contains(type)
	}
	
	// use to override
	protected def List<DType> allTypes(DAggregate a) {
		a.types
	}

	// // Naming: Elements whose names should start with a CAPITAL
	protected def void checkNameStartsWithCapitalImpl(String name, DNamedElement ne) {
		if (name !== null && name.length > 0 && !Character::isUpperCase(name.charAt(0))) {
			warning("Name should start with a capital", ne, BasePackage.Literals::DNAMED_ELEMENT__NAME)

		}
	}

	def void checkNameStartsWithCapital(DNamedElement ne) {
		checkNameStartsWithCapitalImpl(ne.name, ne)
	}

	@Check
	def void checkTypeNameStartsWithCapital(DomainInformationModel d) {
		if (DEFAULT_IMPORT_TYPES == d.name) {
			return
		} else if (d.name.startsWith(PREFIX + ".")) {
			checkNameStartsWithCapitalImpl(d.name.substring(3), d)
			return
		}
		checkNameStartsWithCapital(d)
	}

	@Check
	def void checkTypeNameStartsWithCapital(DType t) {
		checkNameStartsWithCapital(t)
	}

	@Check
	def void checkTypeNameStartsWithCapital(DNamedPredicate c) {
		checkNameStartsWithCapital(c)
	}

// // Naming: Elements whose names should start with a LOWERCASE
	def void checkNameStartsWithLowercase(DNamedElement ne) {
		val first = ne.getName().charAt(0)
		val char underscore = '_'
		if (!Character::isLowerCase(first) && first !== underscore) {
			warning("Name should start with a lowercase or underscore", BasePackage.Literals::DNAMED_ELEMENT__NAME)
		}
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(DFeature f) {
		checkNameStartsWithLowercase(f)
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(DQueryParameter p) {
		checkNameStartsWithLowercase(p)
	}

	@Check
	def void checkFeatureNameStartsWithLowercase(DContext c) {
		checkNameStartsWithLowercase(c)
	}

// // Naming: Elements whose names should be ALL UPPERCASE
	@Check def void checkLiteralIsUppercase(DLiteral literal) {
		if (! literal.name.equals(literal.name.toUpperCase)) {
			warning(NAME_ALL_UPPERCASE, BasePackage.Literals::DNAMED_ELEMENT__NAME)
		}
	}

	@Check def void checkStateNameIsUppercase(DState state) {
		if (! state.name.equals(state.name.toUpperCase)) {
			warning(NAME_ALL_UPPERCASE, BasePackage.Literals::DNAMED_ELEMENT__NAME)
		}
	}

	@Check def void checkStateEventNameIsUppercase(DStateEvent event) {
		if (! event.name.equals(event.name.toUpperCase)) {
			warning(NAME_ALL_UPPERCASE, BasePackage.Literals::DNAMED_ELEMENT__NAME)
		}
	}
}
