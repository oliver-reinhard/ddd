package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.dim.DimUtil
import org.eclipse.emf.ecore.EObject

class SimUtil extends DimUtil {

	override String outermostSemanticContainerName(EObject obj) {
		return obj.modelName
	}
	
	override String label(DAggregate a) {
		return "Aggregate " + a.name
	}
}