package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.transpose.TransposeAwareDerivedStateComputer
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.xtext.resource.DerivedStateAwareResource

class SimDerivedStateComputer extends TransposeAwareDerivedStateComputer {

	static val LOGGER = Logger.getLogger(SimDerivedStateComputer);

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as SInformationModel
			if (model !== null) {
				if (preLinkingPhase && model.kind !== SInformationModelKind.BASE) {
					LOGGER.debug("Derive pre-linking state SKIPPED for " + resource.URI)
				} else {
					doInstallDerivedState(resource, model)
				}
			}
		}
	}
}
