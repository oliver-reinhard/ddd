package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Maps
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SType
import com.mimacom.ddd.sm.sim.indexing.SimIndex
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy
import java.util.Map
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.DerivedStateAwareResource

class TransformationContext {

	@Inject SimIndex index
	
	var Map<DType, SType> localDTypeToSTypeMap
	var Map<DType, SType> importedDTypeToSTypeMap
	var DerivedStateAwareResource resource
	
	def void init(DerivedStateAwareResource resource) {
		this.resource = resource
		localDTypeToSTypeMap = Maps.newHashMap()
		importedDTypeToSTypeMap = Maps.newHashMap()
//		initializeLocallyMappedDTypes()
		initializeImportedMappedDTypesFromIndex() 
	}
	
	def void initializeImportedMappedDTypesFromIndex() {
		val model = resource.contents.head
		val deducedSTypeDescriptions = index.getVisibleExternalDeducedSTypes(model)
		val dTypeDescriptionsMap = index.getVisibleDTypeDescriptionsMap(model)
		for (sTypeDesc : deducedSTypeDescriptions) {
			val sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM)
			val sourceQN = QualifiedName.create(sourceNameStr.split("\\."))
			val dTypeDesc = dTypeDescriptionsMap.get(sourceQN)
			if (dTypeDesc !== null) {
				var dType = dTypeDesc.EObjectOrProxy
				var sType = sTypeDesc.EObjectOrProxy
				if (dType instanceof DType && sType instanceof SType) {
					if (dType.eIsProxy) {
						dType = resource.resourceSet.getEObject(dTypeDesc.EObjectURI, true)
					}
					if (sType.eIsProxy) {
						sType = resource.resourceSet.getEObject(sTypeDesc.EObjectURI, true)
					}
					importedDTypeToSTypeMap.put(dType as DType, sType as SType)
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
	
	def putSType(DType dType, SType sType) {
		val previousS = localDTypeToSTypeMap.put(dType, sType)
		if (previousS !== null) {
			throw new IllegalStateException("There are two STypes realizing DType \"" + dType.name + "\" as \"" + sType.name + "\" and as \"" + previousS + "\"") // TODO remove => log  or create error marker
		}
	}
	
	/*
	 * @return  null if no SType is found for DType.
	 */
	def SType getSType(DType dType)  {
		var sPrimitive = localDTypeToSTypeMap.get(dType)
		if (sPrimitive === null) {
			sPrimitive = importedDTypeToSTypeMap.get(dType)
//			if (sPrimitive === null) {
//				sPrimitive = UNKNOWN_TYPE
//			}
		}
		return sPrimitive
	}
}
