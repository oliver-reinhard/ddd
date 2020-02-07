package com.mimacom.ddd.pub.pub.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

@Singleton
class ExtensionPointsScopeElementsDerivedStateComputer implements IDerivedStateComputer {

	static val FACTORY = PubFactory.eINSTANCE

	@Inject DiagramProviderRegistry registry

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! preLinkingPhase) {
			val model = resource.allContents.head as PubModel
			if (model !== null && model.figureRenderers.empty) {
				val providers = registry.diagramProviders
				for (p : providers) {
					val fr = FACTORY.createFigureRenderer
					fr.name = p.id
					fr.diagramName = p.diagramName
					model.figureRenderers.add(fr)
				}
			}
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val model = resource.allContents.head as PubModel
		if (model !== null) {
			model.figureRenderers.clear

		}
	}
}
