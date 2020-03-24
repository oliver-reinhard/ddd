package com.mimacom.ddd.dm.dmx.indexing

import com.google.common.collect.Lists
import com.google.inject.Singleton
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxPackage
import java.util.List
import org.eclipse.emf.ecore.EObject

@Singleton
class DmxIndex extends AbstractXtextIndex {

	static val DMX = DmxPackage.eINSTANCE

	def List<DmxFilter> allVisibleFilters(EObject context) {
		val functionDescriptions = getVisibleEObjectDescriptions(context, DMX.dmxFilter)

		val result = Lists.newArrayList
		for (desc : functionDescriptions) {
			// When working with an outdated index (e.g. after updating the system filters file), 
			// filter can be null (e.g. because desc was of a different type, e.g. DmxIterator)
			var filter = context.resolveEObjectDescription(desc, DmxFilter)
			if (filter !== null) {
				result.add(filter)
			}
		}
		return result
	}

	def List<DmxFilter> supportedFilters(EObject context, DmxBaseType baseType, boolean collection) {
		val functionDescriptions = getVisibleEObjectDescriptions(context, DMX.dmxFilter)
		val result = Lists.newArrayList
		for (desc : functionDescriptions) {
			// When working with an outdated index (e.g. after updating the system filters file), 
			// func can be null (e.g. because desc was of a different type, e.g. DmxIterator)
			var func = context.resolveEObjectDescription(desc, DmxFilter)
			if (func !== null) {
				if (func.parameters.size > 0) {
					val param = func.parameters.get(0)
					if (param.typeDesc.isCompatible(baseType, collection)) {
						result.add(func)
					}
				}
			}
		}
		return result
	}
}
