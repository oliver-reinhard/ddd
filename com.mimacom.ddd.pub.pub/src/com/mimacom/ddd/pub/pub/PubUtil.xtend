package com.mimacom.ddd.pub.pub

import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil
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
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EObject

class PubUtil extends DmxRichTextUtil {
	
	def dispatch String displayName(EObject obj) {
		obj.eClass.name.replace("Titled", "")
	}
	
	def dispatch String displayName(Enumerator e) {
		e.name
	}
	
	def dispatch String displayName(Object obj) {
		throw new IllegalArgumentException("Unsupported object type: " + obj.class.name)
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

	/**
	 * Returns the prototype division corresponding to the given division.
	 * 
	 * @return null if no corresponding prototype division was found, or the first one if several prototype division match
	 */
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

	override String toPlainText(DRichText text) {
		if (! (text.eContainer instanceof TitledBlock || text.eContainer instanceof Division)) {
			throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division")
		}
		return super.toPlainText(text)
	}
}
