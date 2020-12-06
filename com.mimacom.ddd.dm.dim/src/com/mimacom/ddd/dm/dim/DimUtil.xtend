package com.mimacom.ddd.dm.dim

import com.mimacom.ddd.dm.dmx.DmxUtil
import org.eclipse.emf.ecore.EObject

class DimUtil extends DmxUtil {
	
	def String outermostSemanticContainerName(EObject obj) {
		return obj.domainName
	}

}
