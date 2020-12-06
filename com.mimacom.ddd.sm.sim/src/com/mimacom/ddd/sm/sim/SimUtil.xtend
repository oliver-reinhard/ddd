package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.dim.DimUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class SimUtil extends DimUtil {
	
	def String modelName(EObject obj) {
		val d = EcoreUtil2.getContainerOfType(obj, SystemInformationModel)
		return if (d !== null) d.name else "<undefined model>"
	}

	override String outermostSemanticContainerName(EObject obj) {
		return obj.modelName
	}
	
	override String label(DAggregate a) {
		return "Aggregate " + a.name
	}
}