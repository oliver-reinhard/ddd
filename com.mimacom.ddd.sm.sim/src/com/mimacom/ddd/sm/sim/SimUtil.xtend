package com.mimacom.ddd.sm.sim

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import java.util.LinkedHashSet
import java.util.List
import java.util.Set

class SimUtil {
	
	def baseClass(SFeature feature) {
		switch (feature) {
			SAttribute : DAttribute
			SAssociation : DAssociation
			SQuery : DQuery
		}
	}
	
	def baseEClass(SFeature feature) {
		switch (feature) {
			SAttribute : BasePackage.eINSTANCE.DAttribute
			SAssociation : BasePackage.eINSTANCE.DAssociation
			SQuery : BasePackage.eINSTANCE.DQuery
		}
	}
	
	/*
	 * Returns all the supertypes of the given type.
	 */
	def Set<SComplexType> typeHierarchy(SComplexType type) {
		val hierarchy = new LinkedHashSet<SComplexType>()
		var current = type.superType
		while (current !== null && ! hierarchy.contains(current)) {
			hierarchy.add(current)
			current = current.superType
		}
		return hierarchy
	}
	
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
	def List<DFeature> allFeatures(DComplexType type) {
		val features = Lists.newArrayList(type.features)
		for (t : type.typeHierarchy) {
			features.addAll(t.features)
		}
		return features
	}
	
	/*
	 * Returns the names of all the inherited features of the given type.
	 */
	def Set<String> inheritedFeatureNames(SComplexType type) {
		val supertypes = type.typeHierarchy
		val features = new LinkedHashSet<String>()
		for (t : supertypes) {
			features.addAll(t.features.map[name])
		}
		return features
	}
	//// Labels
	
	def String label(SAggregate a) {
		return "Aggregate " + a.rootName
	}
	
	def String label(SType type) {
		val typeLabel = switch type {
			SPrimitive: if (type.archetype) "Archetype " else  "Primitive "
			SEnumeration: "Enumeration "
			SRootType: "Root "
			SDetailType: "Detail "
			SAssociation: switch type.kind {
				case REFERENCE: "Reference "
				case COMPOSITE: "Composite "
				case INVERSE_COMPOSITE: "Inverse Composite "
				default: type.kind.toString
			}
			default: type.class.simpleName
		}
		return typeLabel + type?.name
	}
	
	def String label(SFeature f) {
		return f?.name + " : " + f.type?.label
	}
	
	def String label(SCondition c) {
		return "Constraint " + c.name
	}
	
	def String label(SDeductionRule rule) {
		return switch rule {
			SMorphRule : "Morph "  + rule.namedSource?.name
			SFuseRule:  "Fuse "  + rule.namedSource?.name + " and " + rule.source2?.name
			SGrabRule : "Grab "  + rule.namedSource?.name
			SDitchRule : "Ditch "  + rule.namedSource?.name
			SGrabAggregateRule: "Grab aggregate " + rule.aggregate?.rootName
			default: rule.class.simpleName
		}
	}
}