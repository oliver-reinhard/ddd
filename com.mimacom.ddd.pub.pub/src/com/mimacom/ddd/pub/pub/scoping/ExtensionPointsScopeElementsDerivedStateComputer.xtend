package com.mimacom.ddd.pub.pub.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

@Singleton
class ExtensionPointsScopeElementsDerivedStateComputer implements IDerivedStateComputer {

	static val FACTORY = PubFactory.eINSTANCE

	@Inject TableProviderRegistry tableProviderRegistry
	@Inject DiagramProviderRegistry diagramProviderRegistry

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! preLinkingPhase) {
			val model = resource.allContents.head as PubModel
			model.installTableRenderers
			model.installFigureRenderers
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val model = resource.allContents.head as PubModel
		if (model !== null) {
			model.tableRenderers.clear
			model.figureRenderers.clear
		}
	}
	
	protected def void installTableRenderers(PubModel model) {
		if (model !== null && model.tableRenderers.empty) {
			val renderers = tableProviderRegistry.allTableRenderers
			for (r : renderers) {
				val tr = FACTORY.createTableRenderer
				tr.name = r.id
				tr.tableName = r.tableName
				model.tableRenderers.add(tr)
			}
		}
	}
	
	protected def void installFigureRenderers(PubModel model) {
		if (model !== null && model.figureRenderers.empty) {
			val renderers = diagramProviderRegistry.allDiagramRenderers
			for (r : renderers) {
				val fr = FACTORY.createFigureRenderer
				fr.name = r.id
				fr.diagramName = r.diagramName
				model.figureRenderers.add(fr)
			}
		}
	}
}
