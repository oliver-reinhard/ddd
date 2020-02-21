/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToLaTeXRenderer
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.dm.dmx.RichTextUtil
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
import com.mimacom.ddd.pub.proto.ProtoSymbolReference
import com.mimacom.ddd.pub.pub.AbstractFigure
import com.mimacom.ddd.pub.pub.Admonition
import com.mimacom.ddd.pub.pub.ContentBlock
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Equation
import com.mimacom.ddd.pub.pub.Index
import com.mimacom.ddd.pub.pub.List
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.Reference
import com.mimacom.ddd.pub.pub.ReferenceTarget
import com.mimacom.ddd.pub.pub.RichTextParagraph
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph
import com.mimacom.ddd.pub.pub.SegmentWithTable
import com.mimacom.ddd.pub.pub.SegmentWithText
import com.mimacom.ddd.pub.pub.Symbol
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TableCell
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.TitledCodeListing
import com.mimacom.ddd.pub.pub.TitledFigure
import com.mimacom.ddd.pub.pub.UnformattedParagraph
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class PubLaTeXRenderer extends AbstractPubRenderer {

	@Inject extension RichTextUtil
	@Inject extension PubUtil
	@Inject extension PubNumberingUtil
	@Inject extension PubGeneratorUtil

	static public val DOCUMENT_SUFFIX = "tex"
	static public val CSS_FILENAME = "pubstyles.css"

	override String fileSuffix(Document doc) {
		DOCUMENT_SUFFIX
	}

	override prepare(Document doc, IFileSystemAccess2 fsa) {
	}

	override finish(Document doc, IFileSystemAccess2 fsa) {
	}

	//
	// Structure
	//
	override CharSequence renderDocument(Document doc, NestedElementsRenderer p) '''
		% Produced by «class.name»
		\documentclass{«doc.publicationClass.name.toLowerCase»}
		
		\usepackage{ulem} % strikethrough
		\usepackage{etoolbox} % quotes
		\usepackage{enumitem} % list numbering
		\usepackage{multirow} % tables with column span and or rowspan
		
		«doc.renderPreamble»
		
		\begin{document}
			\maketitle
			«p.render»
		\end{document}
	'''

	protected def CharSequence renderPreamble(Document doc) {
		val preamble = doc.publicationClass?.preamble
		if (preamble !== null) {
			val renderer = new AbstractRichTextToLaTeXRenderer {

				override protected getSourceText(DExpression expr) {
					expr.getSourceTextFromXtextResource
				}

				override protected renderStyleExpression(DExpression expr, String parsedText) {
					if (expr instanceof ProtoSymbolReference) {
						val docSymbol = doc.getSymbol(expr.target.name)
						if (docSymbol !== null) {
							return renderRichText(docSymbol.value)
						}
						throw new NullPointerException("No value for symbol '" + expr.target.name + "'")
					}
					return super.renderStyleExpression(expr, parsedText)
				}
			}
			return renderer.render(preamble)
		}
		return ''
	}

	override CharSequence renderSegment(SegmentWithText seg, NestedElementsRenderer blocks) '''
		<div>
		«seg.renderTitle»
		«blocks.render»
		</div>
	'''

	override CharSequence renderSegment(PublicationBody seg, NestedElementsRenderer divisions) '''
		«divisions.render»
	'''

	override CharSequence renderSegment(SegmentWithTable seg, Table t, NestedContentBlockGenerator g) '''
		<div>
		«seg.renderTitle»
		«t.renderTable(g)»
		</div>
	'''

	override CharSequence renderSegment(Index seg) '''
		<div>
		«seg.renderTitle»
		-- index
		</div>
	'''

	override CharSequence renderTitle(DocumentSegment seg) '''
		<h2>«renderAnchor(seg)»«seg.nonEmptyTitle»</h2>
	'''

	override CharSequence renderTitle(Division div) '''
		«div.divisionName»{«div.title.renderRichText»} % «div.level+2»>«renderAnchor(div)»«div.tieredNumber»
	'''

	protected def CharSequence divisionName(Division div) {
		div.eClass.name.toLowerCase
	}

	override CharSequence renderAnchor(ReferenceTarget target) {
		val id = target.id
		if (id !== null && ! target.id.empty) {
			return "<a id=\"" + id + "\"></a>"
		}
		return ""
	}

	override CharSequence renderReferenceTo(ReferenceTarget target,
		String linkText) '''<a href="#«target.id»">«linkText»</a>'''

	//
	// Content
	//
	override CharSequence renderAdmonition(Admonition a) '''
		-- admonition
	'''

	override CharSequence renderBulletList(List list, NestedElementsRenderer p) '''
		\begin{itemize} % «renderAnchor(list)»
			«p.render»
		\end{itemize} 
	'''

	override CharSequence renderNumberedList(List list, NestedElementsRenderer p) '''
		\begin{enumerate}[label=\«list.numberingStyle.latexNumberingAttribute»"*]  % «renderAnchor(list)»
			«p.render»
		\end{enumerate}
	'''

	protected def String latexNumberingAttribute(ProtoSequenceNumberStyle style) {
		switch style {
			case ARABIC: "arabic"
			case CAPITAL_ROMAN: "Roman"
			case SMALL_ROMAN: "roman"
			case CAPITAL_LETTER: "Alph"
			case SMALL_LETTER: "alph"
			case NONE: "arabic"
		}
	}

	override CharSequence renderTitledList(List list, NestedElementsRenderer p) '''
		\begin{description}	% «renderAnchor(list)»
			«p.render»
		\end{description}
	'''

	override CharSequence renderListItem(ListItem item, NestedElementsRenderer p) '''
		\item «p.render» % «renderAnchor(item)»
	'''

	override CharSequence renderTitledListItem(ListItem item, NestedElementsRenderer p) '''
		\item[«item.title.renderRichText»] «p.render» % «renderAnchor(item)»
	'''

	override CharSequence renderTitledBlock(TitledBlock b, NestedElementsRenderer p) '''
	<div>«p.render»</div>'''

	override CharSequence renderTitledBlockTitle(TitledBlock b) '''
		<h5>«renderAnchor(b)»«b.labelAndNumber» «b.title.renderRichText»</h5>
	'''

	override CharSequence renderTable(Table t, NestedContentBlockGenerator g) {
		val gen = new PubLaTeXTableGenerator(t, g)
		gen.render
	}

	override CharSequence renderFigure(AbstractFigure f, String fileUri) '''
		<img src="«fileUri»" alt="«(f.eContainer as TitledFigure).title.renderRichText»">
	'''

	override CharSequence renderEquation(Equation e) '''
		-- equation (TODO)
	'''

	override CharSequence renderCodeListing(TitledCodeListing cl, java.util.List<String> codeLines) '''
		\\begin{verbatim}
		«FOR line : codeLines»«line»«ENDFOR»
		\\end{verbatim}
	'''

	override CharSequence renderPlainParagraph(RichTextParagraph para) {
		para.text.renderRichText
	}

	protected def boolean isOnlyContentBlockOfTableCell(ContentBlock para) {
		return para.eContainer instanceof TableCell && (para.eContainer as TableCell).contents.length == 1
	}

	override CharSequence renderQuotedParagraph(RichTextParagraph para) '''
		\quote{«para.text.renderRichText»}
	'''

	override CharSequence renderUnformattedParagraph(UnformattedParagraph para) {
		para.text
	}

	override CharSequence renderRichTextReferencingParagraph(RichTextReferencingParagraph para) {
		para.text.renderRichText
	}

	override createRichTextRenderer(ErrorMessageAcceptor acceptor) {
		return new AbstractRichTextToLaTeXRenderer {

			override protected getSourceText(DExpression expr) {
				expr.getSourceTextFromXtextResource
			}

			override protected renderStyleExpression(DExpression expr, String parsedText) {
				switch expr {
					DmxContextReference: {
						if (expr.target instanceof Symbol) {
							renderRichText((expr.target as Symbol).value)
						} else {
							super.renderStyleExpression(expr, expr.target.name)
						}
					}
					DmxStaticReference:
						super.renderStyleExpression(expr, expr.staticReferenceLinkText)
					Reference:
						"<a href=\"" + expr.htmlReferenceLinkTargetId + "\">" + expr.target.referenceDisplayText +
							"</a>"
					default:
						super.renderStyleExpression(expr, parsedText)
				}
			}

		}
	}

	protected def String staticReferenceLinkText(DmxStaticReference ref) {
		if (! guard(ref.displayName, "").empty) {
			if (ref.plural) {
				return ref.displayName + "s"
			}
			return ref.displayName
		}
		return ref.target.name + "." + ref.member.name
	}

	protected def String htmlReferenceLinkTargetId(Reference ref) {
		var result = "#" + ref.target.id
		val refContainer = EcoreUtil2.getContainerOfType(ref, Document)
		val targetContainer = EcoreUtil2.getContainerOfType(ref.target, Document)
		if (refContainer !== null && targetContainer !== refContainer) {
			return targetContainer.fileName + result
		}
		return result
	}

}
