package com.mimacom.ddd.dm.div.derivedState

import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.transpose.TransposeAwareDerivedStateComputer
import com.mimacom.ddd.dm.div.DomainInformationView
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.xtext.resource.DerivedStateAwareResource

class DivDerivedStateComputer extends TransposeAwareDerivedStateComputer {

	static val LOGGER = Logger.getLogger(DivDerivedStateComputer);

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as DomainInformationView
			if (model !== null) {
				doInstallDerivedState(resource, model)
			}
		}
	}
}
