package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxBaseType
import java.util.Objects

class DmxAggregateDescriptor extends AbstractDmxTypeDescriptor<DType> {
	
	val DAggregate aggregate
	
	new(DAggregate aggregate, boolean collection) {
		super(DmxBaseType.AGGREGATE, null, collection)
		this.aggregate = aggregate
	}
	
	def DAggregate aggregate()  {
		aggregate
	}
	
	override equals(Object other) {
		if (super.equals(other)) {
			val obj = other as DmxAggregateDescriptor
			return aggregate === null && obj.aggregate === null || aggregate.equals((obj).aggregate)
		}
		return false
	}

	override int hashCode() {
		return Objects.hash(baseType, type, collection, aggregate);
	}
	
	override getNavigableMembers() {
		if (aggregate.features !== null) {
			return Lists.newArrayList(aggregate.features)
		}
		return super.navigableMembers
	}
	
	override protected typeName() {
		aggregate.name
	}
}