package com.mimacom.ddd.dm.base.transpose

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.util.indexing.AbstractXtextIndex
import java.util.Collections
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription

@Singleton
class TransposeIndex extends AbstractXtextIndex {
	
	static val BASE = BasePackage.eINSTANCE
	static val TRANSPOSE = TransposePackage.eINSTANCE

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

	/*
	 * @param name must end in segment "@" (otherwise there will be no matches!)
	 */
	def Iterable<IEObjectDescription> getVisibleTTypeMappingDescriptions(EObject context, QualifiedName name) {
		if (name.segments.last != TranspositionUtil.TRANSPOSITION_INDEX_ENTRY_MARKER) {
			throw new IllegalArgumentException("Name must end in '" + TranspositionUtil.TRANSPOSITION_INDEX_ENTRY_MARKER + "' segment: " + name)
		}
		context.getVisibleEObjectDescriptions(TRANSPOSE.TTypeMapping, name)
	}

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
