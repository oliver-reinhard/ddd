package com.mimacom.ddd.dm.dmx

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DFeature
import java.util.Collections
import java.util.LinkedHashSet
import java.util.List
import java.util.Set

class DmxUtil {
	
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
	
	def List<DExpression> nullSafeCallArguments(DmxMemberNavigation nav) {
		if (nav.callArguments === null) return Collections.EMPTY_LIST
		return nav.callArguments.arguments
	}
	
	def List<DExpression> nullSafeCallArguments(DmxFunctionCall call) {
		if (call.callArguments === null) return Collections.EMPTY_LIST
		return call.callArguments.arguments
	}
	
	def List<DExpression> nullSafeCallArguments(DmxConstructorCall call) {
		if (call.callArguments === null) return Collections.EMPTY_LIST
		return call.callArguments.arguments
	}
}