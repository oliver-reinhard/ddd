package com.mimacom.ddd.dm.dmx

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DFeature
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Collections
import java.util.Date
import java.util.LinkedHashSet
import java.util.List
import java.util.Set

class DmxUtil {

	public static val ENTITY_TYPE_STATE_FILTER_NAME = "state"
	public static val String TIMEPOINT_SYNTAX = "yyyy-MM-dd [HH:mm]"
	public static val SimpleDateFormat TIMEPOINT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd")
	public static val SimpleDateFormat TIMEPOINT_DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm")

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
		if (type === null) {
			return Collections.EMPTY_LIST
		}
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

	def Date parseTimepoint(String value) {
		if (value === null) {
			return null
		}
		val trimmed = value.trim
		val date = parseTimepoint(trimmed, DmxUtil::TIMEPOINT_DATE_TIME_FORMAT)
		if (date !== null) {
			return date
		}
		return parseTimepoint(trimmed, DmxUtil::TIMEPOINT_DATE_FORMAT)
	}

	private def Date parseTimepoint(String value, SimpleDateFormat format) {
		try {
			if (value.length <= format.toPattern.length)
				return format.parse(value)
		} catch (ParseException ex) {
			return null
		}
	}
}
