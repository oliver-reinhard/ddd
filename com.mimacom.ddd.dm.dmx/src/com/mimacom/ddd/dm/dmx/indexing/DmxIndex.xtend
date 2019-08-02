package com.mimacom.ddd.dm.dmx.indexing

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxFunction
import com.mimacom.ddd.dm.dmx.DmxIterator
import com.mimacom.ddd.dm.dmx.DmxPackage
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

@Singleton
class DmxIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm
	
	static val DMX = DmxPackage.eINSTANCE

	def IResourceDescription getResourceDescription(EObject context) {
		val index = rdp.getResourceDescriptions(context.eResource)
		index.getResourceDescription(context.eResource.URI)
	}

	def Iterable<IEObjectDescription> getExportedEObjectDescriptions(EObject context) {
		context.getResourceDescription.getExportedObjects
	}

	def List<IContainer> getVisibleContainers(EObject context) {
		val index = rdp.getResourceDescriptions(context.eResource)
		val rd = index.getResourceDescription(context.eResource.URI)
		if (rd === null) {
			return Collections.EMPTY_LIST
		}
		cm.getVisibleContainers(rd, index)
	}

	/*
	 * Returns also the visible objects of the resource containing context
	 */
	def Iterable<IEObjectDescription> getVisibleEObjectDescriptions(EObject context, EClass type) {
		context.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}
	
	def  List<DmxFilter> allVisibleFilters(EObject context) {
		val functionDescriptions = getVisibleEObjectDescriptions(context, DMX.dmxFilter)

		val result = Lists.newArrayList
		for(desc : functionDescriptions) {
			var filter = desc.EObjectOrProxy
			if (filter.eIsProxy) {
				filter = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
			}
			// When working with an outdated index (e.g. after updating the system filters file), func can be null or of a different type, e.g. DmxIterator:
			if (filter instanceof DmxFilter) {
				result.add(filter)
			}
		}
		return result
	}
	
	def  List<DmxFilter> supportedFilters(EObject context, DmxBaseType baseType, boolean collection) {
		if (collection) {
			return collectionFilters(context, baseType)
		} else {
			return singleObjectFunctions(context, baseType)
		}
	}
	
	
	private def  List<DmxFilter> singleObjectFunctions(EObject context, DmxBaseType baseType) {
		val functionDescriptions = getVisibleEObjectDescriptions(context, DMX.dmxFunction)
		val result = Lists.newArrayList
		for(desc : functionDescriptions) {
			var func = desc.EObjectOrProxy
			if (func.eIsProxy) {
				func = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
			}
			// When working with an outdated index (e.g. after updating the system filters file), func can be null or of a different type, e.g. DmxIterator:
			if (func instanceof DmxFunction) {
				if (func.parameters.size > 0) {
					val param = func.parameters.get(0)
					if (param.baseType == baseType && ! param.baseTypeCollection) {
						result.add(func)
					}
				}
			}
		}
		return result
	}
	
	private def  List<DmxFilter> collectionFilters(EObject context, DmxBaseType baseType) {
		val functionDescriptions = getVisibleEObjectDescriptions(context, DMX.dmxIterator)

		val result = Lists.newArrayList
		for(desc : functionDescriptions) {
			var iterator = desc.EObjectOrProxy
			if (iterator.eIsProxy) {
				iterator = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
			}
			// When working with an outdated index (e.g. after updating the system filters file), func can be null or of a different type, e.g. DmxIterator:
			if (iterator instanceof DmxIterator) {
				result.add(iterator)
			}
		}
		return result
	}
}
