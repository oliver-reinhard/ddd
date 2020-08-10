package com.mimacom.ddd.sm.sim.derivedState

import com.google.common.collect.Maps
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.indexing.SimIndex
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy
import java.util.Map
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

class TransformationContext {

	static final Logger LOGGER = Logger.getLogger(TransformationContext);

	@Inject SimIndex index

	@Inject
	IQualifiedNameProvider qualifiedNameProvider;

	var Map<DType, DType> localDomainToSystemModelTypeMap
	var Map<QualifiedName, DType> importedDomainQNToSystemModelTypeMap
	var EObject context // used to determine visibility in index
	
	new() {
//		LOGGER.level = Level.DEBUG
	}

	def void init(EObject context) {
		this.context = context
		localDomainToSystemModelTypeMap = Maps.newHashMap()
		importedDomainQNToSystemModelTypeMap = Maps.newHashMap()
		initializeImportedMappedDomainTypesFromIndex()
	}

	def void initializeImportedMappedDomainTypesFromIndex() {
		val Iterable<IEObjectDescription> deducedTypeDescriptions = index.getVisibleExternalDeducedDTypes(context) // expensive operation
		val Map<QualifiedName, IEObjectDescription> allTypeDescriptionsMap = index.getVisibleDTypeDescriptionsMap(context)

		for (sTypeDesc : deducedTypeDescriptions) {
			val sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM)
			val sourceQN = QualifiedName.create(sourceNameStr.split("\\."))

			val dTypeDesc = allTypeDescriptionsMap.get(sourceQN)
			if (dTypeDesc !== null) {
				var dType = dTypeDesc.EObjectOrProxy
				var sType = sTypeDesc.EObjectOrProxy
				if (dType instanceof DType && sType instanceof DType) {
//					if (dType.eIsProxy) {
//						dType = resource.resourceSet.getEObject(dTypeDesc.EObjectURI, true)
//					}
//					if (sType.eIsProxy) {
//						sType = resource.resourceSet.getEObject(sTypeDesc.EObjectURI, true)
//					}
					importedDomainQNToSystemModelTypeMap.put(sourceQN, sType as DType)
					if (LOGGER.level == Level.DEBUG) {
						LOGGER.debug("putSystemType for " + sourceQN + " -> " + sTypeDesc.EObjectURI)
					}
				}
			}
		}
	}

	def putSystemType(DType domainType, DType systemType) {
		val previousS = localDomainToSystemModelTypeMap.put(domainType, systemType)
		if (previousS !== null) {
			LOGGER.error("There are two system types realizing domain type \"" + domainType.name + "\": as \"" + systemType.name +
					"\" and as \"" + previousS + "\"")
		}
	}

	/*
	 * @return  null if no system type is found for the given domain type.
	 */
	def DType getSystemType(DType domainType) {
		var systemType = localDomainToSystemModelTypeMap.get(domainType)
		if (systemType === null) {
			val domainTypeQN = qualifiedNameProvider.getFullyQualifiedName(domainType)
			systemType = importedDomainQNToSystemModelTypeMap.get(domainTypeQN)
			if (systemType === null && LOGGER.level == Level.DEBUG) {
				LOGGER.debug("getSystemType for " + domainTypeQN + " -> null")
			}
		}
		return systemType
	}
}
