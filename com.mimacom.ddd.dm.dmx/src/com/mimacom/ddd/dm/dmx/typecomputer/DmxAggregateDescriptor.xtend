package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType

class DmxAggregateDescriptor extends AbstractDmxTypeDescriptor<DType> {
	protected val DAggregate aggregate
	
	new(DAggregate aggregate) {
		super(DmxBaseType.AGGREGATE, null, false)
		this.aggregate = aggregate
	}
	
	override getNavigableMembers() {
		if (aggregate.staticQueries !== null) {
			return Lists.newArrayList(aggregate.staticQueries)
		}
		return super.navigableMembers
	}
	
	def aggregate() {
		aggregate
	}
	
	override protected typeName() {
		aggregate.name
	}
}