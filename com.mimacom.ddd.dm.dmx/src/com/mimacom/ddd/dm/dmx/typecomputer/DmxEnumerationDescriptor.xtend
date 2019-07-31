package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import java.util.List

class DmxEnumerationDescriptor extends AbstractDmxTypeDescriptor<DEnumeration> {
	new(DEnumeration enumeration) {
		super(DmxBaseType.ENUM, enumeration,  false)
	}
	
	override getNavigableMembers() {
		(type.literals as Object) as List<DNavigableMember>
	}
}