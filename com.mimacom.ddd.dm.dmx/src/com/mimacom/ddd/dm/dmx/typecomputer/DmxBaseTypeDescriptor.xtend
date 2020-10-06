package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxBaseTypeDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
	
	new(DmxBaseType baseType, boolean collection) {
		super(baseType, null,  collection)
	}
}