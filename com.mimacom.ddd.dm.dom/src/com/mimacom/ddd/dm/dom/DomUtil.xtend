package com.mimacom.ddd.dm.dom

import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.dmx.DmxComplexObject
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dmx.DmxUtil

class DomUtil extends DmxUtil {

	def String label(DomNamedComplexObject o) {
		if (o.object !== null && o.object.type !== null) {
			return o.name + ":" + o.object.type.name
		}
		return o.name
	}

	def boolean root(DmxComplexObject o) {
		val type = o.type
		if (type instanceof DEntityType) {
			return type.root
		}
		return false
	}

	def String label(DmxField f) {
		if (f.feature !== null) {
			return f.feature.name + ":" + f.feature.type?.name
		}
		return "field"
	}
}
