package com.mimacom.ddd.dm.dom

import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.dmx.DmxUtil

class DomUtil extends DmxUtil {

	def String label(DomNamedComplexObject o) {
		if (o.object !== null && o.object.ref !== null) {
			return o.name + ":" + o.object.ref.name
		}
		return o.name
	}

	def boolean root(DomComplexObject o) {
		val type = o.ref
		if (type instanceof DEntityType) {
			return type.root
		}
		return false
	}

	def String label(DomField f) {
		if (f.ref !== null) {
			return f.ref.name + ":" + f.ref.type?.name
		}
		return "field"
	}
}
