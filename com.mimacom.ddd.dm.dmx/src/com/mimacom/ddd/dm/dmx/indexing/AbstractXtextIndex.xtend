package com.mimacom.ddd.dm.dmx.indexing

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

abstract class AbstractXtextIndex {
	
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm

	/**
	 * Returns the resource description of the context's containing eResource.
	 * 
	 * @param context used to derive the relevant eResource.
	 */
	protected def IResourceDescription getEResourceDescription(EObject context) {
		val index = rdp.getResourceDescriptions(context.eResource)
		index.getResourceDescription(context.eResource.URI)
	}

	/**
	 * @param context used to derive the relevant eResource.
	 */
	protected def Iterable<IEObjectDescription> getExportedEObjectDescriptions(EObject context) {
		context.getEResourceDescription.getExportedObjects
	}

	/**
	 * @param context used to derive the relevant eResource.
	 */
	protected def List<IContainer> getVisibleContainers(EObject context) {
		val index = rdp.getResourceDescriptions(context.eResource)
		val rd = index.getResourceDescription(context.eResource.URI)
		if (rd === null) {
			return Collections.EMPTY_LIST
		}
		cm.getVisibleContainers(rd, index)
	}

	/**
	 * Returns also the visible objects of the resource containing the 'context' object.
	 *
	 * @param context used to derive the relevant eResource.
	 */
	def Iterable<IEObjectDescription> getVisibleEObjectDescriptions(EObject context, EClass type) {
		context.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}
	
	/**
	 * @param context used to derive the relevant eResource.
	 */
	def <T> resolveEObjectDescription(EObject context, IEObjectDescription desc, Class<T> type) {
		var obj = desc.EObjectOrProxy
		if (obj.eIsProxy) {
			obj = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
			if (obj === null || obj.eIsProxy) {
				return null
			}
		}
		if (type.isAssignableFrom(obj.class)) {
			return obj as T
		}
		return null
	}
}
