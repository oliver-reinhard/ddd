package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxUndefinedDescriptor extends AbstractDmxTypeDescriptor<DType> {
	new() {
		super(DmxBaseType.UNDEFINED, null, false)
	}
}