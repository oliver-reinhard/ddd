package com.mimacom.ddd.dm.base

import com.google.common.collect.Lists
import java.util.Collections
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class TypesUtil {
	
	/*
	 * Returns all the supertypes of the given type.
	 */
	def Set<DComplexType> typeHierarchy(DComplexType type) {
		val hierarchy = new LinkedHashSet<DComplexType>()
		var current = type.superType
		while (current !== null && ! hierarchy.contains(current)) {
			hierarchy.add(current)
			current = current.superType
		}
		return hierarchy
	}

	/*
	 * Returns the names of all the features of the given type: its own as well as the inherited ones.
	 */
	def dispatch List<DFeature> allFeatures(DComplexType type) {
		if (type === null) {
			return Collections.EMPTY_LIST
		}
		val features = Lists.newArrayList(type.features)
		for (t : type.typeHierarchy) {
			features.addAll(t.features)
		}
		return features
	}
	
	def dispatch List<DFeature> allFeatures(IFeatureContainer container) {
		return container.features
	}

	/*
	 * Returns the names of all the inherited features of the given type (but not its own features).
	 */
	def Set<String> inheritedFeatureNames(DComplexType type) {
		val supertypes = type.typeHierarchy
		val features = new LinkedHashSet<String>()
		for (t : supertypes) {
			features.addAll(t.features.map[name])
		}
		return features
	}

	def DInformationModel domain(EObject obj) {
		return EcoreUtil2.getContainerOfType(obj, DInformationModel) // global types are not owned by a domain => null
	}

	def String domainName(EObject obj) {
		val d = obj.domain
		return if (d !== null) d.name else "NO_DOMAIN"
	}

	def DAggregate aggregate(EObject obj) {
		return EcoreUtil2.getContainerOfType(obj, DAggregate) // global types are not owned by a domain => null
	}

	def String aggregateName(EObject obj) {
		val a = obj.aggregate
		return if (a !== null) a.name else "default"
	}

	def multiplicityText(DNavigableMember member) {
		val m = member.multiplicity
		if (m === null || m.minOccurs == 1 && m.maxOccurs == 1) return ""
		val maxOccurs = if (m.maxOccurs == -1) "*" else m.maxOccurs.toString
		return "[" + m.minOccurs + "," + maxOccurs + "]"
	}

	/*
	 * Precondition: d is the domain owning the association
	 */
	def boolean isTargetInsideDomain(DAssociation a, DInformationModel d) {
		if (a.targetType !== null) {
			val targetDomain = a.targetType.domain
			return d == targetDomain
		}
		return false
	}

	def boolean isTargetInsideDomain(DAssociation a) {
		val d = a.domain
		if (d === null) return false
		return a.isTargetInsideDomain(d)
	}

	/*
	 * Precondition: d is the domain owning the feature
	 */
	def boolean isTypeInsideDomain(DFeature f, DInformationModel d) {
		if (f.getType !== null) {
			val targetDomain = f.getType.domain
			return d == targetDomain
		}
		return false
	}

	def boolean isTypeInsideDomain(DFeature f) {
		val d = f.domain
		if (d === null) return false
		return f.isTypeInsideDomain(d)
	}

	// // Labels

	def String describeType(DNavigableMember m) {
		m.type !== null ? m.type.label + " " + m.multiplicityText : ""
	}
	
	def String label(DAggregate a) {
		return "Component " + a.name
	}

	def String label(DType type) {
		val typeLabel = switch type {
			DPrimitive:
				"Primitive "
			DEnumeration:
				"Enumeration "
			DEntityType:
				if (type.root) "Root Entity " else "Entity "
			DDetailType:
				"Detail "
			DAssociation:
				switch type.kind {
					case REFERENCE: "Reference to "
					case COMPOSITE: "Composite to "
					case INVERSE_COMPOSITE: "Inverse Composite to "
					default: type.kind.toString
				}
			default:
				type.class.simpleName
		}
		return typeLabel + type?.name
	}

	def String label(DFeature f) {
		return f.name + " : " + f.getType?.label
	}

	def String label(DQueryParameter p) {
		return p.name + " : " + p.getType?.label
	}

	def String label(DNamedPredicate c) {
		return "Constraint " + c.name
	}

	def String label(IDeducibleElement e) {
		switch e {
			DAggregate: e.label
			DType: e.label
			DFeature: e.label
			DQueryParameter: e.label
			DLiteral: e.name
			default: e.toString
		}
	}
}
