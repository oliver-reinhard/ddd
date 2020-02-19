package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.pub.pub.Abbreviations
import com.mimacom.ddd.pub.pub.Bibliography
import com.mimacom.ddd.pub.pub.ChangeHistory
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Glossary
import com.mimacom.ddd.pub.pub.ListOfFigures
import com.mimacom.ddd.pub.pub.ListOfTables
import com.mimacom.ddd.pub.pub.NumberedElement
import com.mimacom.ddd.pub.pub.PubElementNames
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubTableUtil
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.ReferenceTarget
import com.mimacom.ddd.pub.pub.TOC
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledFigure
import com.mimacom.ddd.pub.pub.TitledTable
import java.util.List

class PubGeneratorUtil {

	@Inject extension PubUtil
	@Inject extension PubTableUtil
	@Inject extension PubNumberingUtil
	@Inject extension PubElementNames
	
	static val PUB = PubFactory.eINSTANCE


	def String nonEmptyTitle(DocumentSegment segment) {
		val protoSegment = segment.prototype
		if (protoSegment?.title !== null) {
			return protoSegment.title
		}
		return segment.displayName
	}

	def String referenceDisplayText(ReferenceTarget t) {
		if (t instanceof NumberedElement) {
			t.displayName + " " + t.tieredNumber
		} else {
			t.displayName
		}
	}
	
	//
	// Segments
	//

	def Table toTable(ChangeHistory ch) {
		val Table t = createTableWithHeader(#["Version", "Date", "Author", "What has changed"])
		for (e : ch.entries) {
			t.addSimpleRow(#[e.version, e.date, e.author, e.description])
		}
		return t
	}

	def Table toTable(TOC toc, List<Division> allDivisionsInSequence) {
		val Table t = createTableWithHeader(#["Section", "Title", "Reference/Page"])
		for (div : allDivisionsInSequence) {
			val ref = PUB.createReference
			ref.target = div
			t.addRowWithReference(#[div.labelAndNumber, div.title.toPlainText], ref) // TODO calculate Reference/Page
		}
		return t
	}

	def Table toTable(Abbreviations seg) {
		val Table t = createTableWithHeader(#["Abbreviation", "Stands for"])
		for (e : seg.entries) {
			t.addSimpleRow(#[e.name, e.longForm])
		}
		return t
	}

	def Table toTable(ListOfTables seg, List<TitledTable> allTablesInSequence) {
		val Table lot = createTableWithHeader(#["Table", "Title", "Reference/Page"])
		for (t : allTablesInSequence) {
			val ref = PUB.createReference
			ref.target = t 
			lot.addRowWithReference(#[t.labelAndNumber, t.title.toPlainText], ref) // TODO calculate Reference/Page
		}
		return lot
	}

	def Table toTable(ListOfFigures seg, List<TitledFigure> allFiguresInSequence) {
		val Table lof = createTableWithHeader(#["Figure", "Title", "Reference/Page"])
		for (f : allFiguresInSequence) {
			val ref = PUB.createReference
			ref.target = f 
			lof.addRowWithReference(#[f.labelAndNumber, f.title.toPlainText], ref) // TODO calculate Reference/Page
		}
		return lof
	}

	def Table toTable(Bibliography seg) {
		val Table t = createTableWithHeader(#["Name", "Authors", "Title", "Publisher", "Publication Date", "Comment"])
		for (e : seg.entries) {
			t.addSimpleRow(#[e.name, e.authors, e.title, e.publisher, e.date, e.comment])
		}
		return t
	}

	def Table toTable(Glossary seg) {
		val Table t = createTableWithHeader(#["Name", "Description", "Comment"])
		for (e : seg.entries) {
			t.addSimpleRow(#[e.name, e.text, e.comment])
		}
		return t
	}
}
