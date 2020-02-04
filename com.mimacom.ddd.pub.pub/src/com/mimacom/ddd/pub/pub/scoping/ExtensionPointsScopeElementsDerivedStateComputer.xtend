package com.mimacom.ddd.pub.pub.scoping

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.pub.pub.FigureRenderer
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import java.util.List
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

@Singleton
class ExtensionPointsScopeElementsDerivedStateComputer implements IDerivedStateComputer {

	static val FACTORY = PubFactory.eINSTANCE

	@Inject DiagramProviderRegistry registry

	var List<FigureRenderer> figureRenderers = null

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! preLinkingPhase) {
			val model = resource.allContents.head as PubModel
			if (model !== null && model.figureRenderers.empty) {
				if (figureRenderers === null || ! figureRenderers.empty && figureRenderers.get(0).eIsProxy) {
					initFigureRenderers
				}
				model.figureRenderers.addAll(figureRenderers)
			}
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val model = resource.allContents.head as PubModel
		if (model !== null) {
			model.figureRenderers.clear

		}
	}

	protected def void initFigureRenderers() {
		figureRenderers = Lists.newArrayList
		val providers = registry.diagramProviders
		for (p : providers) {
			val fr = FACTORY.createFigureRenderer
			fr.name = p.id
			fr.diagramName = p.diagramName
			figureRenderers.add(fr)
		}
	}
}
