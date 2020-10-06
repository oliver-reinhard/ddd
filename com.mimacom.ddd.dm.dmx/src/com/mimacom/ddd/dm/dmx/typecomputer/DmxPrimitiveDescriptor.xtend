package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.dmx.DmxArchetype
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxPrimitiveDescriptor extends AbstractDmxTypeDescriptor<DPrimitive> {
	new(DPrimitive type, boolean collection) {
		// The if-statement below is a work-around to suppress an NPE because of a failing proxy resolution during a full project rebuild.
		// Since DmxTypeDescriptors are re-calculated each time, a new descriptor with a resolved proxy will be created at a later time.
		super(if (!(type.redefines instanceof DmxArchetype)) DmxBaseType.VOID else (type.redefines as DmxArchetype).baseType, type,  collection)
	}
	
	new(DmxArchetype type, boolean collection) {
		super(type.baseType, type,  collection)
	}
}