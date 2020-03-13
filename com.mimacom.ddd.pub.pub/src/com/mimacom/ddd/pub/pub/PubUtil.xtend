package com.mimacom.ddd.pub.pub

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil
import com.mimacom.ddd.dm.dmx.DmxStaticReference
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
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class PubUtil {
	
	@Inject extension DmxRichTextUtil
	
	def dispatch String displayName(EObject obj) {
		obj.eClass.name.replace("Titled", "")
	}
	
	def dispatch String displayName(Enumerator e) {
		e.name
	}
	
	def dispatch String displayName(Object obj) {
		throw new IllegalArgumentException("Unsupported object type: " + obj.class.name)
	}
	
	def String guard(String subject, String alternative) {
		if(subject !== null && ! subject.empty) return subject
		if(alternative !== null) return alternative
		return ""
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

	def String toPlainText(DRichText text) {
		if (! (text.eContainer instanceof TitledBlock || text.eContainer instanceof Division)) {
			throw new IllegalArgumentException("Text is not the title of a TitledBlock or a Division")
		}
		val renderer = new AbstractRichTextToPlainTextRenderer {
			
			override protected getSourceText(DExpression expr) {
				expr.getSourceTextFromXtextResource
			}

			override protected renderStyleExpression(DExpression expr, String parsedText) {
				switch expr {
					DmxContextReference:
						super.renderStyleExpression(expr, expr.target.name)
					DmxStaticReference:
						super.renderStyleExpression(expr, expr.plainlinkText)
					default:
						throw new IllegalArgumentException("Unsupported content-block type: " + expr.class.name)
				}
			}
			
			override protected encode(String plainText) {
				return plainText
			}
			
		}
		renderer.render(text) as String
	}

	protected def String plainlinkText(DmxStaticReference ref) {
		if (! guard(ref.displayName, "").empty) {
			if (ref.plural) {
				return ref.displayName + "s"
			}
			return ref.displayName
		}
		return ref.target.name + "." + ref.member.name
	}
	
	

	/**
	 * Preconditions: xtextObject is part of an XtextResource and the syntax the resource's text is valid.<p>
	 * 
	 * @return {@code null} if no corresponding node was be found in the syntax tree.
	 */
	def String getSourceCodeFromXtextResource(EObject xtextObject) {
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(xtextObject)
		return node !== null ? node.text : null;
	}
}
