package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.dim.DimUtil

class SimUtil extends DimUtil {
	
	override String label(DAggregate a) {
		return "Aggregate " + a.name
	}
}