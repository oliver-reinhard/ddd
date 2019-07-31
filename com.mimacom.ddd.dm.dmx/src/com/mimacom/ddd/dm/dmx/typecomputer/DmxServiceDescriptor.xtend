package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DService
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxServiceDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DService service
	
	new(DService service) {
		super(DmxBaseType.SERVICE, null, false)
		this.service = service
	}
	
	def service() {
		service
	}
	
	override protected typeName() {
		service.name
	}
}