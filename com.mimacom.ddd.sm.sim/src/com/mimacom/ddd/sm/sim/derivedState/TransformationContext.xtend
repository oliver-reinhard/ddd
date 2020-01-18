package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Maps
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.indexing.SimIndex
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy
import java.util.Map
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.DerivedStateAwareResource

class TransformationContext {

	@Inject SimIndex index
	
	var Map<DType, DType> localDomainToSystemModelTypeMap
	var Map<DType, DType> importedDomainToSystemModelTypeMap
	var DerivedStateAwareResource resource
	
	def void init(DerivedStateAwareResource resource) {
		this.resource = resource
		localDomainToSystemModelTypeMap = Maps.newHashMap()
		importedDomainToSystemModelTypeMap = Maps.newHashMap()
//		initializeLocallyMappedDTypes()
		initializeImportedMappedDomainTypesFromIndex() 
	}
	
	def void initializeImportedMappedDomainTypesFromIndex() {
		val model = resource.contents.head
		val deducedSTypeDescriptions = index.getVisibleExternalDeducedSystemModelTypes(model)
		val dTypeDescriptionsMap = index.getVisibleDomainTypeDescriptionsMap(model)
		for (sTypeDesc : deducedSTypeDescriptions) {
			val sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM)
			val sourceQN = QualifiedName.create(sourceNameStr.split("\\."))
			val dTypeDesc = dTypeDescriptionsMap.get(sourceQN)
			if (dTypeDesc !== null) {
				var dType = dTypeDesc.EObjectOrProxy
				var sType = sTypeDesc.EObjectOrProxy
				if (dType instanceof DType && sType instanceof DType) {
					if (dType.eIsProxy) {
						dType = resource.resourceSet.getEObject(dTypeDesc.EObjectURI, true)
					}
					if (sType.eIsProxy) {
						sType = resource.resourceSet.getEObject(sTypeDesc.EObjectURI, true)
					}
					importedDomainToSystemModelTypeMap.put(dType as DType, sType as DType)
				}
			}
		}
	}
	
	/*
	 * Crates a new map and adds those primitives of the resource to the map that realize DPrimitives.
	 */
	def void initializeLocallyMappedDTypes() {
//		val contibutors = resource.allContents.filter(SPrimitive).filter[deductionRule?.source !== null]
//		while(contibutors.hasNext) {
//			val sPrimitive = contibutors.next
//			if (sPrimitive.archetype && sPrimitive.deductionRule.source instanceof DPrimitive) {
//				putSType(sPrimitive.deductionRule.source as DPrimitive, sPrimitive)
//			}
//		}
	}
	
	def putSystemType(DType domainType, DType systemType) {
		val previousS = localDomainToSystemModelTypeMap.put(domainType, systemType)
		if (previousS !== null) {
			// TODO remove => log  or create error marker
			throw new IllegalStateException("There are two STypes realizing DType \"" + domainType.name + "\": as \"" + systemType.name + "\" and as \"" + previousS + "\"") 
		}
	}
	
	/*
	 * @return  null if no system type is found for the given domain type.
	 */
	def DType getSystemType(DType domainType)  {
		var systemType = localDomainToSystemModelTypeMap.get(domainType)
		if (systemType === null) {
			systemType = importedDomainToSystemModelTypeMap.get(domainType)
//			if (sPrimitive === null) {
//				sPrimitive = UNKNOWN_TYPE
//			}
		}
		return systemType
	}
}
