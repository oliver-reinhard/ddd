package com.mimacom.ddd.sm.sms

import java.util.LinkedHashSet
import java.util.Set
import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DFeature
import java.util.List

class SmsUtil {
	
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
}