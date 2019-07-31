package com.mimacom.ddd.dm.dmx.typecomputer

import com.mimacom.ddd.dm.base.DActor
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxActorDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DActor actor
	
	new(DActor actor) {
		super(DmxBaseType.ACTOR, null, false)
		this.actor = actor
	}
	
	def actor() {
		actor
	}
	
	override protected typeName() {
		actor.name
	}
}