package com.mimacom.ddd.pub.pub.generator

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
import com.mimacom.ddd.pub.pub.Chapter
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.NumberedElement
import com.mimacom.ddd.pub.pub.Part
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.ReferenceTarget
import com.mimacom.ddd.pub.pub.Section
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.TitledFigure
import com.mimacom.ddd.pub.pub.TitledTable
import com.mimacom.ddd.pub.pub.impl.PubConstants
import java.util.List
import org.eclipse.xtext.EcoreUtil2

class PubNumberingUtil {

	@Inject extension PubUtil

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
		} else if (div instanceof Section && ! ((div as Section).parent instanceof Chapter)) {
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
		if (b.parent instanceof Chapter) {
			val parentNumber = b.parent.formattedSingleNumber
			if (parentNumber.length > 0) {
				if (b.sequenceNumberInChapter != PubConstants::TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER_IN_CHAPTER) {
					return parentNumber + "." + Integer.toString(b.sequenceNumberInChapter + 1)
				}
			}
		}
		if (b.getSequenceNumber() != PubConstants::TITLED_BLOCK_UNDEFINED_SEQUENCE_NUMBER) {
			return Integer.toString(b.getSequenceNumber() + 1)
		}
		return ""
	}

	def dispatch String tieredNumber(ReferenceTarget t) {
		t.id
	}

	def dispatch String tieredNumber(NumberedElement e) {
		if (e.sequenceNumber == PubConstants::UNDEFINED_SEQUENCE_NUMBER) {
			"UNDEFINED"
		} else {
			e.sequenceNumber.toString
		}
	}

	def String formattedSingleNumber(Division div) {
		val seq = div.getSequenceNumber
		if (seq != PubConstants::UNDEFINED_SEQUENCE_NUMBER) {
			val start = div.startNumber
			val n = if (start != PubConstants::UNDEFINED_SEQUENCE_NUMBER) seq + start else seq
			val prototype = div.prototype
			val numberingStyle = if (prototype !== null) prototype.numberingStyle else ProtoSequenceNumberStyle.ARABIC
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
				return PubConstants::UNDEFINED_SEQUENCE_NUMBER
			}
			return parent.divisions.head.startNumberingAt
		} else if (parent instanceof Division) {
			if (parent.divisions.empty) {
				return PubConstants::UNDEFINED_SEQUENCE_NUMBER
			}
			return parent.divisions.head.startNumberingAt
		}
		return PubConstants::UNDEFINED_SEQUENCE_NUMBER
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
	def List<Division> gatherAllDivisionsAndSetSequenceNumbers(Component compo) {
		val List<Division> acceptor = Lists.newArrayList
		val bodySegments = compo.segments.filter(PublicationBody)
		if (! bodySegments.empty) {
			val body = bodySegments.head
			gatherAllDivisionsImpl(body.divisions, null, acceptor, PubConstants::TOP_LEVEL)
		}
		return acceptor
	}

	protected def void gatherAllDivisionsImpl(List<Division> divisions, Division logicalContainer,
		List<Division> acceptor, int level) {
		var sequenceNumber = PubConstants::FIRST_IN_SEQUENCE_NUMBER
		for (div : divisions) {
			div.level = level
			if (div instanceof Chapter) {
				// Chapters form a global sequence, not one per Part
				val chapterIndex = acceptor.filter(Chapter).size
				div.sequenceNumber = chapterIndex
			} else {
				div.sequenceNumber = sequenceNumber++
			}
			div.logicalContainer = logicalContainer
			acceptor.add(div)
			if (div.include !== null) {
				// skip (i.e. don't number) the included element, only its children
				gatherAllDivisionsImpl(div.include.divisions, div, acceptor, level + 1) // recursion
			} else {
				gatherAllDivisionsImpl(div.divisions, div, acceptor, level + 1) // recursion
			}
		}
	}

	def List<TitledTable> gatherAllTablesInSequenceAndSetSequenceNumbers(Component compo) {
		val List<TitledTable> acceptor = Lists.newArrayList
		gatherAllElementsInSequenceAndSetSequenceNumbers(compo, TitledTable, acceptor)
		return acceptor
	}

	def List<TitledFigure> gatherAllFiguresInSequenceAndSetSequenceNumbers(Component compo) {
		val List<TitledFigure> acceptor = Lists.newArrayList
		gatherAllElementsInSequenceAndSetSequenceNumbers(compo, TitledFigure, acceptor)
		return acceptor
	}

	protected def <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(Component compo,
		Class<T> clazz, List<T> acceptor) {
		val bodySegment = compo.segments.filter(PublicationBody)
		if (! bodySegment.empty) {
			gatherAllElementsInSequenceAndSetSequenceNumbers(bodySegment.head.divisions, clazz, acceptor, null, null)
		}
	}

	protected def <T extends TitledBlock> void gatherAllElementsInSequenceAndSetSequenceNumbers(
		List<Division> divisions, Class<T> clazz, List<T> globalAcceptor, Chapter logicalContainer,
		List<T> acceptorInChapter) {
		for (div : divisions) {
			var chapter = if (div instanceof Chapter && logicalContainer === null) {
					div as Chapter
				} else {
					logicalContainer
				}
			if (div.include !== null) {
				gatherAllElementsInSequenceAndSetSequenceNumbers(Lists.newArrayList(div.include), clazz, globalAcceptor,
					chapter, acceptorInChapter) // recursion
			} else {
				val localAcceptor = (div == chapter) ? Lists.newArrayList : acceptorInChapter
				for (block : div.contents) {
					val allInContents = EcoreUtil2.eAllOfType(block, clazz)
					for (element : allInContents) {
						element.sequenceNumber = globalAcceptor.size
						globalAcceptor.add(element)
						if (localAcceptor !== null) {
							element.sequenceNumberInChapter = localAcceptor.size
							element.logicalContainer = chapter
							localAcceptor.add(element)
						}
					}
				}
				gatherAllElementsInSequenceAndSetSequenceNumbers(div.divisions, clazz, globalAcceptor, chapter,
					localAcceptor) // recursion
			}

		}
	}
}
