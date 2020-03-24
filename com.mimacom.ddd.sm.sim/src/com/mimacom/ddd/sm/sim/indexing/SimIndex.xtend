package com.mimacom.ddd.sm.sim.indexing

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.dmx.indexing.AbstractXtextIndex
import java.util.Collections
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class SimIndex extends AbstractXtextIndex {
	
	val BASE = BasePackage.eINSTANCE

	def Iterable<IEObjectDescription> getExportedDTypeDescriptions(EObject context) {
		val rd = context.getEResourceDescription
		if (rd === null) {
			return Collections.EMPTY_LIST
		}
		rd.getExportedObjectsByType(BASE.DType)
	}

	def Iterable<IEObjectDescription> getVisibleDTypeDescriptions(EObject context) {
		context.getVisibleEObjectDescriptions(BASE.DType)
	}

	def Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(EObject context) {
		context.getVisibleEObjectDescriptions(BASE.DType).toMap[ qualifiedName]
	}
	
	protected def boolean isDeducedSystemType(IEObjectDescription desc) {
		desc.getUserData(SimResourceDescriptionStrategy::KEY_DEDUCED_FROM) !== null
	}

	//
	// This is an EXPENSIVE operation
	//
	def Iterable<IEObjectDescription> getVisibleExternalDeducedDTypes(EObject context) {
		val allVisibleTypes = context.getVisibleDTypeDescriptions.filter[isDeducedSystemType]
		val allExportedTypes = context.getExportedDTypeDescriptions.filter[isDeducedSystemType]
		val difference = allVisibleTypes.toSet
		difference.removeAll(allExportedTypes.toSet)
		return difference
	}

}
