package com.mimacom.ddd.pub.pub.derivedState

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import static com.mimacom.ddd.pub.proto.derivedState.PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME

@Singleton
class PubDerivedStateComputer implements IDerivedStateComputer {

	static val BASE = BaseFactory.eINSTANCE
	static  val PUB = PubFactory.eINSTANCE

	@Inject TableProviderRegistry tableProviderRegistry
	@Inject DiagramProviderRegistry diagramProviderRegistry

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! preLinkingPhase) {
			val model = resource.allContents.head as PubModel
			model.installTitleSymbol
			model.installTableRenderers
			model.installFigureRenderers
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		val model = resource.allContents.head as PubModel
		if (model !== null) {
			model.removeTitleSymbol
			model.tableRenderers.clear
			model.figureRenderers.clear
		}
	}
	
	protected def void installTitleSymbol(PubModel model) {
		val doc = model.document
		if (doc.symbols.filter[it.name == TITLE_SYMBOL_NAME].empty) {
			val titleSymbol = PubDerivedStateComputer.PUB.createSymbol
			titleSymbol.name = TITLE_SYMBOL_NAME
			titleSymbol.value = BASE.createDRichText
			val seg = BASE.createDTextSegment
			seg.value = doc.title
			titleSymbol.value.segments.add(seg)
			doc.symbols.add(titleSymbol)
		}
	}
	
	protected def void removeTitleSymbol(PubModel model) {
		val doc = model.document
		val titleSymbol = doc.symbols.filter[it.name == TITLE_SYMBOL_NAME].head
		if (titleSymbol !== null) {
			doc.symbols.remove(titleSymbol)
		}
	}
	
	// Used to support extension point
	protected def void installTableRenderers(PubModel model) {
		if (model !== null && model.tableRenderers.empty) {
			val renderers = tableProviderRegistry.allTableRenderers
			for (r : renderers) {
				val tr = PubDerivedStateComputer.PUB.createTableRenderer
				tr.name = r.id
				tr.tableName = r.tableName
				model.tableRenderers.add(tr)
			}
		}
	}
	
	// Used to support extension point
	protected def void installFigureRenderers(PubModel model) {
		if (model !== null && model.figureRenderers.empty) {
			val renderers = diagramProviderRegistry.allDiagramRenderers
			for (r : renderers) {
				val fr = PubDerivedStateComputer.PUB.createFigureRenderer
				fr.name = r.id
				fr.diagramName = r.diagramName
				model.figureRenderers.add(fr)
			}
		}
	}
}
