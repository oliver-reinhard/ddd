package com.mimacom.ddd.sm.sim.indexing

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import java.util.Collections
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class SimIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm

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
		if (rd === null) { // TODO revisit if this leads to
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

	def Iterable<IEObjectDescription> getExportedSTypeEObjectDescriptions(EObject context) {
		val rd = context.getResourceDescription
		if (rd === null) {
			return Collections.EMPTY_LIST
		}
		rd.getExportedObjectsByType(BasePackage.eINSTANCE.DType)
	}

	def Iterable<IEObjectDescription> getVisibleSTypeDescriptions(EObject context) {
		context.getVisibleEObjectDescriptions(BasePackage.eINSTANCE.DType)
	}

	def Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(EObject context) {
		context.getVisibleEObjectDescriptions(BasePackage.eINSTANCE.DType).toMap[ qualifiedName]
	}

	//
	// This is an EXPENSIVE operation
	//
	def Iterable<IEObjectDescription> getVisibleExternalDeducedSTypes(EObject context) {
		val allVisibleTypes = context.getVisibleSTypeDescriptions.filter[getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM) !== null]
		val allExportedTypes = context.getExportedSTypeEObjectDescriptions.filter[getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM) !== null]
		val difference = allVisibleTypes.toSet
		difference.removeAll(allExportedTypes.toSet)
		return difference
	}

}
