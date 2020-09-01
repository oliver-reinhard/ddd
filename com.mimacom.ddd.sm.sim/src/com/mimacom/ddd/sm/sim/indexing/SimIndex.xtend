package com.mimacom.ddd.sm.sim.indexing

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.dmx.indexing.AbstractXtextIndex
import com.mimacom.ddd.sm.sim.SimPackage
import java.util.Collections
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class SimIndex extends AbstractXtextIndex {
	
	static val BASE = BasePackage.eINSTANCE
	static val SIM = SimPackage.eINSTANCE

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

	def Iterable<IEObjectDescription> getVisibleDTypeDescriptions(EObject context, QualifiedName name) {
		context.getVisibleEObjectDescriptions(BASE.DType, name)
	}

	def Map<QualifiedName, IEObjectDescription> getVisibleDTypeDescriptionsMap(EObject context) {
		context.getVisibleEObjectDescriptions(BASE.DType).toMap[qualifiedName]
	}

	def Iterable<IEObjectDescription> getVisibleSTypeMappingDescriptions(EObject context, QualifiedName name) {
		context.getVisibleEObjectDescriptions(SIM.STypeMapping, name)
	}
	
//	protected def boolean isDeducedSystemType(IEObjectDescription desc) {
//		SIM.STypeDeduction.isSuperTypeOf(desc.getEClass)
//	}

//	//
//	// This is an EXPENSIVE operation
//	//
//	def Iterable<IEObjectDescription> getVisibleSTypeDeductions(EObject context) {
//		val allVisibleTypes = context.getVisibleDTypeDescriptions.filter[isDeducedSystemType]
//		val allExportedTypes = context.getExportedDTypeDescriptions.filter[isDeducedSystemType]
//		val difference = allVisibleTypes.toSet
//		difference.removeAll(allExportedTypes.toSet)
//		return difference
//	}

}
