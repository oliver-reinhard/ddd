package com.mimacom.ddd.dm.dmx

import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DFeature
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Collections
import java.util.Date
import java.util.List

class DmxUtil extends TypesUtil {

	public static val ENTITY_TYPE_STATE_FILTER_NAME = "state"
	public static val String TIMEPOINT_SYNTAX = "yyyy-MM-dd [HH:mm]"
	public static val SimpleDateFormat TIMEPOINT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd")
	public static val SimpleDateFormat TIMEPOINT_DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm")


	def List<DExpression> nullSafeCallArguments(DmxMemberNavigation nav) {
		if(nav.callArguments === null) return Collections.EMPTY_LIST
		return nav.callArguments.arguments
	}

	def List<DExpression> nullSafeCallArguments(DmxFunctionCall call) {
		if(call.callArguments === null) return Collections.EMPTY_LIST
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

	def DmxField field(DmxComplexObject obj, DFeature feature) {
		for (f : obj.fields) {
			if (f.feature == feature) {
				return f
			}
		}
		return null
	}

	private def Date parseTimepoint(String value, SimpleDateFormat format) {
		try {
			if (value.length <= format.toPattern.length)
				return format.parse(value)
		} catch (ParseException | NumberFormatException ex) {
			return null
		}
	}
}
