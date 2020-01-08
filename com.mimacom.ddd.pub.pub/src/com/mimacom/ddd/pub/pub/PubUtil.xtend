package com.mimacom.ddd.pub.pub

import com.google.common.collect.Lists
import com.google.inject.Inject
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
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
import com.mimacom.ddd.pub.proto.ProtoSubsection
import com.mimacom.ddd.pub.proto.ProtoSubsubsection
import com.mimacom.ddd.pub.proto.ProtoTOC
import com.mimacom.ddd.pub.pub.generator.PubElementNames
import com.mimacom.ddd.pub.pub.impl.PublicationConstants
import org.eclipse.xtext.EcoreUtil2

class PubUtil {

	@Inject extension PubElementNames
	
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
	// Numbering NumberedElements
	//

	def String labelAndNumber(Division div) {
		switch div {
			Part: div.displayName + " " + div.formattedSingleNumber
			default: div.tieredNumber
		}
	}

	def String labelAndNumber(TitledBlock b) {
		b.displayName + " " + b.tieredNumber
	}

	def dispatch String tieredNumber(Division div) {
		if (div instanceof Part) {
			return div.formattedSingleNumber
		} else if (div instanceof Chapter) {
			return div.formattedSingleNumber + "."
		}
		val parentNumber = tieredNumber(div.parent)
		if (parentNumber.length > 0) {
			val formatted = div.formattedSingleNumber
			if (formatted.length > 0) {
				if (parentNumber.endsWith(".")) {
					return parentNumber + div.formattedSingleNumber
				} else {
					return parentNumber + "." + div.formattedSingleNumber
				}
			}
		}
		return ""
	}

	def dispatch String tieredNumber(TitledBlock b) {
		var parent = b.eContainer
		while (parent !== null && ! (parent instanceof Chapter)) {
			parent = parent.eContainer
		}
		if (parent instanceof Chapter) {
			val parentNumber = parent.formattedSingleNumber
			if (parentNumber.length > 0) {
				if (b.sequenceNumberInChapter !=
					PublicationConstants::TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER_IN_CHAPTER) {
					return parentNumber + "." + Integer.toString(b.sequenceNumberInChapter + 1)
				}
			}
		}
		if (b.getSequenceNumber() != PublicationConstants::TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER) {
			return Integer.toString(b.getSequenceNumber() + 1)
		}
		return ""
	}

	def dispatch String tieredNumber(NumberedElement e) {
		throw new IllegalArgumentException("Unsupported object type: " + e.class.name)
	}

	def String formattedSingleNumber(Division div) {
		val seq = div.getSequenceNumber
		if (seq != -1) {
			val start = div.startNumber
			val n = if(start != -1) seq + start else seq
			val prototype = div.prototype
			val numberingStyle = if(prototype !== null) prototype.numberingStyle else ProtoSequenceNumberStyle.ARABIC
			val formatted = formatNumbering(numberingStyle, n)
			return formatted
		}
		return ""
	}

	def String formattedSingleNumber(ListItem item) {
		val n = item.getSequenceNumber() + 1
		val formatted = formatNumbering(item.list.numberingStyle, n)
		return formatted
	}

	protected def String formatNumbering(ProtoSequenceNumberStyle numberingStyle, int n) {
		switch numberingStyle {
			case ARABIC: n.toString
			case CAPITAL_LETTER: n.toLetter
			case SMALL_LETTER: n.toLetter.toLowerCase
			case CAPITAL_ROMAN: n.toRoman
			case SMALL_ROMAN: n.toRoman.toLowerCase
			case NONE: ""
		}
	}

	protected def int startNumber(Division div) {
		val parent = div.eContainer
		if (parent instanceof PublicationBody) {
			if (parent.divisions.empty) {
				return -1
			}
			return parent.divisions.head.startNumberingAt
		} else if (parent instanceof Division) {
			if (parent.subdivisions.empty) {
				return -1
			}
			return parent.subdivisions.head.startNumberingAt
		}
		return -1
	}

	def String toRoman(int value) {
		if (value <= 0) {
			return "--"
		}
		val StringBuilder b = new StringBuilder
		// tens -- skip thousands and hundreds:
		val x = value % 100
		switch (x / 10) {
			case 1:
				b.append("X")
			case 2:
				b.append("XX")
			case 3:
				b.append("XXX")
			case 4:
				b.append("XL")
			case 5:
				b.append("L")
			case 6:
				b.append("LX")
			case 7:
				b.append("LXX")
			case 8:
				b.append("LXXX")
			case 9:
				b.append("XC")
			default: {
			}
		}
		switch (x % 10) {
			case 1:
				b.append("I")
			case 2:
				b.append("II")
			case 3:
				b.append("III")
			case 4:
				b.append("IL")
			case 5:
				b.append("V")
			case 6:
				b.append("VI")
			case 7:
				b.append("VII")
			case 8:
				b.append("VIII")
			case 9:
				b.append("IX")
			default: {
			}
		}
		return b.toString
	}

	def String toLetter(int value) {
		if (value <= 0) {
			return "--"
		}
		val StringBuilder b = new StringBuilder
		val LETTERS = 26 // number of letters in the alphabet
		val char a = 'A'
		// skip more than two ASCII letters
		val x = (value - 1) % ((LETTERS + 1) * LETTERS)
		if (x >= LETTERS) {
			val n = (a as int) + (x / LETTERS) - 1
			b.append(n as char)
		}
		val n = (a as int) + (x % LETTERS)
		b.append(n as char)
		return b.toString
	}


	//
	// Collecting elements with sequence numbers
	//
	
	def java.util.List<Division> gatherAllDivisionsInSequence(Component compo) {
		val java.util.List<Division> acceptor = Lists.newArrayList
		val bodySegment = compo.segments.filter(PublicationBody)
		if (! bodySegment.empty) {
			for (div : bodySegment.head.divisions) {
				gatherAllDivisionsImpl(div, acceptor)
			}
		}
		return acceptor
	}

	protected def void gatherAllDivisionsImpl(Division div, java.util.List<Division> acceptor) {
		if (div.include !== null) {
			gatherAllDivisionsImpl(div.include, acceptor) // recurse
		} else {
			acceptor.add(div)
			for (subdiv : div.subdivisions) {
				gatherAllDivisionsImpl(subdiv, acceptor) // recurse		
			}
		}
	}

	def java.util.List<Table> gatherAllTablesInSequenceAndSetSequenceNumbers(Component compo) {
		val java.util.List<Table> acceptor = Lists.newArrayList
		gatherAllElementsInSequenceAndSetSequenceNumbers(compo, Table, acceptor)
		return acceptor
	}

	def java.util.List<Figure> gatherAllFiguresInSequenceAndSetSequenceNumbers(Component compo) {
		val java.util.List<Figure> acceptor = Lists.newArrayList
		gatherAllElementsInSequenceAndSetSequenceNumbers(compo, Figure, acceptor)
		return acceptor
	}

	protected def <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(Component compo,
		Class<T> clazz, java.util.List<T> acceptor) {
		val bodySegment = compo.segments.filter(PublicationBody)
		if (! bodySegment.empty) {
			for (div : bodySegment.head.divisions) {
				gatherAllElementsInSequenceAndSetSequenceNumbers(div, clazz, acceptor, null)
			}
		}
	}

	protected def <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(Division div,
		Class<T> clazz, java.util.List<T> globalAcceptor, java.util.List<T> acceptorInChapter) {
		if (div.include !== null) {
			gatherAllElementsInSequenceAndSetSequenceNumbers(div.include, clazz, globalAcceptor, acceptorInChapter) // recurse
		} else {
			val localAcceptor = div instanceof Chapter ? Lists.newArrayList : acceptorInChapter
			for (block : div.contents) {
				val allInContents = EcoreUtil2.eAllOfType(block, clazz)
				for (element : allInContents) {
					element.sequenceNumber = globalAcceptor.size
					globalAcceptor.add(element)
					if (localAcceptor !== null) {
						element.sequenceNumberInChapter = localAcceptor.size
						localAcceptor.add(element)
					}
				}
			}
			for (subdiv : div.subdivisions) {
				gatherAllElementsInSequenceAndSetSequenceNumbers(subdiv, clazz, globalAcceptor, localAcceptor) // recurse		
			}
		}
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
