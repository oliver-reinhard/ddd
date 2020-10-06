package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.indexing.DmxIndex
import java.util.Collections
import org.eclipse.emf.ecore.EObject

class DmxVoidDescriptor extends AbstractDmxTypeDescriptor<DType> {
	new() {
		super(DmxBaseType.VOID, null, false)
	}
	
	override getSupportedIterators(EObject context, DmxIndex index) {
		Collections.EMPTY_LIST
	}
}