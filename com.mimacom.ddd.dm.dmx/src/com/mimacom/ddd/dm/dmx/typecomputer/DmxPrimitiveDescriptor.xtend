package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.dmx.DmxArchetype

class DmxPrimitiveDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
	new(DPrimitive type, boolean collection) {
		super((type.redefines as DmxArchetype)?.baseType, type,  collection)
	}
}