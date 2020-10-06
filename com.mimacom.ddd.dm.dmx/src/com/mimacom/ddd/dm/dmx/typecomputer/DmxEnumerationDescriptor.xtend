package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.dmx.DmxBaseType
import java.util.List

class DmxEnumerationDescriptor extends AbstractDmxTypeDescriptor<DEnumeration> {
	new(DEnumeration enumeration, boolean collection) {
		super(DmxBaseType.ENUM, enumeration,  collection)
	}
	
	override getNavigableMembers() {
		(type.literals as Object) as List<DNavigableMember>
	}
}