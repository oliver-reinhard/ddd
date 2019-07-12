package com.mimacom.ddd.dm.dim

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DCondition
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DDomain
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQueryParameter
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeducibleElement
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class DimUtil {
	
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
	
	/*
	 * Returns the names of all the features of the given type: its own as well as the inherited ones.
	 */
	def List<DFeature> allFeatures(DComplexType type) {
		val features = Lists.newArrayList(type.features)
		for (t : type.typeHierarchy) {
			features.addAll(t.features)
		}
		return features
	}
	
	def DDomain domain(EObject obj) {
			return EcoreUtil2.getContainerOfType(obj, DDomain) // global types are not owned by a domain => null
	}
	
	
	def String domainName(EObject obj) {
			val d = obj.domain
			return if (d !== null) d.name else "NO_DOMAIN" 
	}
	
	def DAggregate aggregate(EObject obj) {
			return EcoreUtil2.getContainerOfType(obj, DAggregate)// global types are not owned by a domain => null
	}
	
	def String aggregateName(EObject obj) {
			val a = obj.aggregate
			return if (a !== null) a.derivedName else "NO_AGGREGATE" 
	}
	
	/*
	 * Precondition: d is the domain owning the association
	 */
	def boolean isTargetInsideDomain(DAssociation a, DDomain d) {
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
	def boolean isTypeInsideDomain(DFeature f, DDomain d) {
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
	
	//// Labels
	
	def String label(DAggregate a) {
		return "Aggregate " + a.derivedName
	}
	
	def String label(DType type) {
		val typeLabel = switch type {
			DPrimitive: if (type.archetype) "Archetype " else  "Primitive "
			DEnumeration: "Enumeration "
			DEntityType: if (type.root) "Root " else "Entity "
			DDetailType: "Detail "
			DAssociation: switch type.kind {
				case REFERENCE: "Reference to "
				case COMPOSITE: "Composite to "
				case INVERSE_COMPOSITE: "Inverse Composite to "
				default: type.kind.toString
			}
			default: type.class.simpleName
		}
		return typeLabel + type?.name
	}
	
	def String label(DFeature f) {
		return f.name + " : " + f.getType?.label
	}
	
	def String label(DQueryParameter p) {
		return p.name + " : " + p.getType?.label
	}
	
	def String label(DCondition c) {
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