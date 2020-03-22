package com.mimacom.ddd.dm.dem.scoping

import com.mimacom.ddd.dm.dem.DemActor
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName

class DemQualifiedNameProvider extends DmxQualifiedNameProvider {

	static final Logger LOGGER = Logger.getLogger(DemQualifiedNameProvider);

	override QualifiedName computeFullyQualifiedName(EObject obj) {
		val qualifiedName = switch obj { 
			DemActor:
				namespaceWideObject(obj)
			default:
				super.computeFullyQualifiedName(obj) // namespace name is a dotted notation -> need to break up into segments
		}
		if (LOGGER.debugEnabled) {
			LOGGER.debug(qualifiedName?.toString("|") + " - " + obj)
		}
		return qualifiedName;
	}
}
