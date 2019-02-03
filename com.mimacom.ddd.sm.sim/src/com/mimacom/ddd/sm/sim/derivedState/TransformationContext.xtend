package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Maps
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SType
import java.util.Map
import org.eclipse.xtext.resource.DerivedStateAwareResource

class TransformationContext {
	
	static class UnsupportedDomainTypeException extends Exception {
		new(DType type) {
			super("A system-model primitive type realizing the domain-model primitive type \"" + type?.name + "\"  the has not been declared")
		}
	}

	val Map<DType, SType> dTypeToSTypeMap
	val DerivedStateAwareResource resource

	new (DerivedStateAwareResource resource) {
		this.resource = resource
		dTypeToSTypeMap = Maps.newHashMap()
		initializeMappedDPrimitives(resource)
	}
	/*
	 * Crates a new map and adds those primitives of the resource to the map that realize DPrimitives.
	 */
	def void initializeMappedDPrimitives(DerivedStateAwareResource resource) {
		val contibutors = resource.allContents.filter(SPrimitive)
		while(contibutors.hasNext) {
			val sPrimitive = contibutors.next
			if (sPrimitive.archetype) {
				putSType(sPrimitive.realizes, sPrimitive)
			}
		}
	}
	
	def putSType(DType dType, SType sType) {
		val previousS = dTypeToSTypeMap.put(dType, sType)
		if (previousS !== null) {
			throw new IllegalStateException("There are two STypes realizing DType \"" + dType.name + "\"") // TODO remove => log  or create error marker
		}
	}
	
	def SType getSType(DType dType) throws UnsupportedDomainTypeException {
		val sPrimitive = dTypeToSTypeMap.get(dType)
		if (sPrimitive === null) {
			throw new UnsupportedDomainTypeException(dType) 
		}
		return sPrimitive
	}
}
