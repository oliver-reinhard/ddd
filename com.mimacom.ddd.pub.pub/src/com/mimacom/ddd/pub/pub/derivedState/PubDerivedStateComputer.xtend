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
	static val PUB = PubFactory.eINSTANCE

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
			model.providedTableTypes.clear
			model.providedDiagramTypes.clear
		}
	}

	protected def void installTitleSymbol(PubModel model) {
		val doc = model.document
		if (doc !== null && doc.symbols.filter[it.name == TITLE_SYMBOL_NAME].empty) {
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
		if (doc !== null) {
			val titleSymbol = doc.symbols.filter[it.name == TITLE_SYMBOL_NAME].head
			if (titleSymbol !== null) {
				doc.symbols.remove(titleSymbol)
			}
		}
	}

// Used to support extension point
	protected def void installTableRenderers(PubModel model) {
		if (model !== null && model.providedTableTypes.empty) {
			val renderers = tableProviderRegistry.allTableRenderers
			for (r : renderers) {
				val tr = PubDerivedStateComputer.PUB.createProvidedTableType
				tr.name = r.id
				tr.tableTypeName = r.tableName
				model.providedTableTypes.add(tr)
			}
		}
	}

// Used to support extension point
	protected def void installFigureRenderers(PubModel model) {
		if (model !== null && model.providedDiagramTypes.empty) {
			val diagramTypeIDs = diagramProviderRegistry.allDiagramRenderers.map[it.diagramTypeID].toSet
			for (id : diagramTypeIDs) {
				val fr = PubDerivedStateComputer.PUB.createProvidedDiagramType
				fr.name = id
				fr.diagramTypeName = diagramProviderRegistry.getDiagramTypeName(id)
				model.providedDiagramTypes.add(fr)
			}
		}
	}
}
