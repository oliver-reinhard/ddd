package com.mimacom.ddd.pub.pub

import com.mimacom.ddd.dm.base.BaseFactory
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.pub.proto.ProtoAbbreviations
import com.mimacom.ddd.pub.proto.ProtoAbstract
import com.mimacom.ddd.pub.proto.ProtoAppendix
import com.mimacom.ddd.pub.proto.ProtoBibliography
import com.mimacom.ddd.pub.proto.ProtoChangeHistory
import com.mimacom.ddd.pub.proto.ProtoChapter
import com.mimacom.ddd.pub.proto.ProtoDivision
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment
import com.mimacom.ddd.pub.proto.ProtoEpilogue
import com.mimacom.ddd.pub.proto.ProtoGlossary
import com.mimacom.ddd.pub.proto.ProtoIndex
import com.mimacom.ddd.pub.proto.ProtoListOfFigures
import com.mimacom.ddd.pub.proto.ProtoListOfTables
import com.mimacom.ddd.pub.proto.ProtoPart
import com.mimacom.ddd.pub.proto.ProtoPreface
import com.mimacom.ddd.pub.proto.ProtoPublicationBody
import com.mimacom.ddd.pub.proto.ProtoSection
import com.mimacom.ddd.pub.proto.ProtoSubsection
import com.mimacom.ddd.pub.proto.ProtoSubsubsection
import com.mimacom.ddd.pub.proto.ProtoTOC

class PubUtil {
	
	static val BASE = BaseFactory.eINSTANCE
	static val PUB = PubFactory.eINSTANCE

	def boolean empty(DRichText text) {
		return text.segments.empty
	}

	/**
	 * Returns the prototype segment corresponding to the given segment.
	 * 
	 * @return null if no corresponding prototype segment was found, or the first one if several prototype segments match
	 */
	def ProtoDocumentSegment prototype(DocumentSegment segment) {
		val prototypeType = switch segment {
			Abstract:
				ProtoAbstract
			Preface:
				ProtoPreface
			Epilogue:
				ProtoEpilogue
			PublicationBody:
				ProtoPublicationBody
			ChangeHistory:
				ProtoChangeHistory
			TOC:
				ProtoTOC
			Abbreviations:
				ProtoAbbreviations
			ListOfTables:
				ProtoListOfTables
			ListOfFigures:
				ProtoListOfFigures
			Bibliography:
				ProtoBibliography
			Glossary:
				ProtoGlossary
			Index:
				ProtoIndex
			default:
				throw new IllegalArgumentException(segment.class.toString)
		}

		val pubClass = segment.parent.publicationClass
		val result = pubClass.segments.filter(prototypeType)
		if(result.empty) return null
		return result.head
	}

	def ProtoDivision prototype(Division div) {
		val prototypeType = switch div {
			Appendix:
				ProtoAppendix
			Part:
				ProtoPart
			Chapter:
				ProtoChapter
			Section:
				ProtoSection
			Subsection:
				ProtoSubsection
			Subsubsection:
				ProtoSubsubsection
			default:
				throw new IllegalArgumentException(div.class.toString)
		}

		val pubClass = div.document.publicationClass
		val result = pubClass.divisions.filter(prototypeType)
		if(result.empty) return null
		return result.head
	}

	//
	// Tables
	//
	
	def Table createTableWithHeader(String[] labels) {
		if (labels.length == 0) {
			throw new IllegalArgumentException("lables.length = 0")
		}
		val Table t = PUB.createTable
		t.columns = labels.length
		val row = t.addSimpleRow(labels)
		row.isHeading = true
		return t
	}

	def TableRow addSimpleRow(Table t, String[] labels) {
		if (labels.length == 0) {
			throw new IllegalArgumentException("lables.length = 0")
		}
		if (labels.length != t.columns) {
			throw new IllegalArgumentException(
				"lables.length (" + labels.length + " does not match number of tables columns (" + t.columns + ")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (label : labels) {
			val cell = PUB.createTableCell
			row.cells.add(cell)
			val para = PUB.createUnformattedParagraph
			cell.contents.add(para)
			para.text = if(label !== null) label else ""
		}
		return row
	}

	def TableRow addRowWithReference(Table t, String[] labels, Reference ref) {
		if (labels.length == 0) {
			throw new IllegalArgumentException("lables.length = 0")
		}
		if (labels.length != t.columns - 1) {
			throw new IllegalArgumentException(
				"lables.length (" + labels.length + " does not match number of tables columns (" + t.columns + ")")
		}
		val row = PUB.createTableRow
		t.rows.add(row)
		for (label : labels) {
			val cell = PUB.createTableCell
			row.cells.add(cell)
			val para = PUB.createUnformattedParagraph
			cell.contents.add(para)
			para.text = if(label !== null) label else ""
		}
		// Reference:
		val cell = PUB.createTableCell
		row.cells.add(cell)
		val para = PUB.createParagraph
		cell.contents.add(para)
		para.text = BASE.createDRichText
		para.text.segments.add(ref)
		return row
	}
}