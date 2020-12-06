package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.Abbreviations
import com.mimacom.ddd.pub.pub.Bibliography
import com.mimacom.ddd.pub.pub.ChangeHistory
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Glossary
import com.mimacom.ddd.pub.pub.ListOfFigures
import com.mimacom.ddd.pub.pub.ListOfTables
import com.mimacom.ddd.pub.pub.Numbered
import com.mimacom.ddd.pub.pub.ProvidedFigure
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.ReferenceTarget
import com.mimacom.ddd.pub.pub.TOC
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledFigure
import com.mimacom.ddd.pub.pub.TitledTable
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramFileFormat
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy
import java.util.List

class PubGeneratorUtil {

	@Inject extension PubUtil
	@Inject extension PubTableUtil
	@Inject extension PubNumberingUtil
	@Inject DiagramProviderRegistry diagramProviderRegistry
	
	public static val TAB_SIZE = 2
	static val PUB = PubFactory.eINSTANCE

	def boolean empty(String s) {
		return s === null || s.isEmpty
	}

	def String nonEmptyTitle(DocumentSegment segment) {
		val protoSegment = segment.prototype
		if (protoSegment?.title !== null) {
			return protoSegment.title
		}
		return segment.displayName
	}

	def String referenceDisplayText(ReferenceTarget t) {
		if (t instanceof Numbered) {
			t.displayName + " " + t.tieredNumber
		} else {
			t.displayName
		}
	}
	
	 def DiagramRendererProxy preferredDiagramRenderer(ProvidedFigure f, IDiagramFileFormatPreference format) {
	 	val preferRasterDiagram = f.preferRasterDiagram
		val preferredFileFormats = preferRasterDiagram ? format.raster : format.vector
		val renderer = preferredFileFormats.findDiagramRenderer(f.diagramRoot.class, f.diagramType.name)
		if (renderer !== null) {
			return renderer
		}
		val otherFileFormats = preferRasterDiagram ? format.vector : format.raster
		return otherFileFormats.findDiagramRenderer(f.diagramRoot.class, f.diagramType.name)
	}

	protected def DiagramRendererProxy findDiagramRenderer(List<DiagramFileFormat> preferredFileFormats,
		Class<? extends IDiagramRoot> diagramRootClass, String diagramTypeID) {
		for (format : preferredFileFormats) {
			val renderer = diagramProviderRegistry.getDiagramRenderer(diagramRootClass, diagramTypeID, format)
			if (renderer !== null) {
				return renderer
			}
		}
		return null
	}
	
	//
	// Segments
	//

	def Table toTable(ChangeHistory ch) {
		val Table t = createTableWithHeader(#["Version", "Date", "Author", "What has changed"])
		for (e : ch.entries) {
			t.addPlainTextRow(#[e.version, e.date, e.author, e.description])
		}
		return t
	}

	def Table toTable(TOC toc, List<Division> allDivisionsInSequence) {
		val Table t = createTableWithHeader(#["Section", "Title", "Page"])
		for (div : allDivisionsInSequence) {
			val ref = PUB.createReference
			ref.target = div
			ref.pageReference = true
			t.addRowWithReference(#[div.labelAndNumber, div.title.toPlainText], ref)
		}
		return t
	}

	def Table toTable(Abbreviations seg) {
		val Table t = createTableWithHeader(#["Abbreviation", "Stands for"])
		for (e : seg.entries) {
			t.addPlainTextRow(#[e.name, e.longForm])
		}
		return t
	}

	def Table toTable(ListOfTables seg, List<TitledTable> allTablesInSequence) {
		val Table lot = createTableWithHeader(#["Table", "Title", "Page"])
		for (t : allTablesInSequence) {
			val ref = PUB.createReference
			ref.target = t 
			ref.pageReference = true
			lot.addRowWithReference(#[t.labelAndNumber, t.title.toPlainText], ref)
		}
		return lot
	}

	def Table toTable(ListOfFigures seg, List<TitledFigure> allFiguresInSequence) {
		val Table lof = createTableWithHeader(#["Figure", "Title", "Page"])
		for (f : allFiguresInSequence) {
			val ref = PUB.createReference
			ref.target = f 
			ref.pageReference = true
			lof.addRowWithReference(#[f.labelAndNumber, f.title.toPlainText], ref)
		}
		return lof
	}

	def Table toTable(Bibliography seg) {
		val Table t = createTableWithHeader(#["Name", "Authors", "Title", "Publisher", "Publication Date", "Comment"])
		for (e : seg.entries) {
			t.addPlainTextRow(#[e.name, e.authors, e.title, e.publisher, e.date, e.comment])
		}
		return t
	}

	def Table toTable(Glossary seg) {
		val Table t = createTableWithHeader(#["Name", "Description", "Comment"])
		for (e : seg.entries) {
			t.addPlainTextRow(#[e.name, e.text, e.comment])
		}
		return t
	}
}
