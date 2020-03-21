/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToLaTeXRenderer
import com.mimacom.ddd.dm.base.richText.RichTextUtil
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
import com.mimacom.ddd.pub.proto.ProtoSymbolReference
import com.mimacom.ddd.pub.pub.Abstract
import com.mimacom.ddd.pub.pub.AbstractFigure
import com.mimacom.ddd.pub.pub.Admonition
import com.mimacom.ddd.pub.pub.Appendix
import com.mimacom.ddd.pub.pub.ContentBlock
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Equation
import com.mimacom.ddd.pub.pub.Footnote
import com.mimacom.ddd.pub.pub.Index
import com.mimacom.ddd.pub.pub.List
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.Paragraph
import com.mimacom.ddd.pub.pub.PubPackage
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
import com.mimacom.ddd.pub.pub.TitledTable
import com.mimacom.ddd.pub.pub.UnformattedParagraph
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2

class PubLaTeXRenderer extends AbstractPubRenderer {

	@Inject extension RichTextUtil
	@Inject extension DmxRichTextUtil
	@Inject extension PubUtil
	@Inject extension PubGeneratorUtil
	@Inject extension PubNumberingUtil

	static public val DOCUMENT_SUFFIX = "tex"
	static public val CSS_FILENAME = "pubstyles.css"
	static val PUB = PubPackage.eINSTANCE

	@Inject PubLaTeXDiagramFileFormatPreference diagramFileFormatPreference

	override String fileSuffix(Document doc) {
		DOCUMENT_SUFFIX
	}

	override PubGeneratorTarget target() {
		PubGeneratorTarget.LaTeX
	}
	
	override prepare(Document doc, IFileSystemAccess2 fsa) {
	}

	override finish(Document doc, IFileSystemAccess2 fsa) {
	}

	//
	// Structure
	//
	override CharSequence renderDocument(Document doc, NestedElementsRenderer p) '''
		% Generated by «this.class.name»
		
		\documentclass[a4paper]{«doc.laTeXClass»}
		
		\usepackage{fullpage}      % use narrower page margins
		\usepackage{ulem}          % strikethrough
		\usepackage{etoolbox}      % quotes
		\usepackage{enumitem}      % list numbering
		\usepackage{multirow}      % tables with column span and or rowspan
		\usepackage{pbox}          % paragraphs or line breaks in table cell
		\usepackage{graphicx}      % include graphics files; supports .eps (but not .svg)
		\usepackage{listings}      % code listings, see https://en.wikibooks.org/wiki/LaTeX/Source_Code_Listings
		\usepackage{lstautogobble} % listing-indent control
		\usepackage{hyperref}      % hyperlinks
		
		\lstset{captionpos=b, basicstyle=\footnotesize, numberstyle=\tiny,
			tabsize=«PubGeneratorUtil::TAB_SIZE», autogobble,
			breaklines, breakatwhitespace,
			extendedchars, literate={≤}{$\leq$}1 {≥}{$\geq$}1 {->}{{$\rightarrow$}}1 {=>}{{$\rightarrow$}}1 % DMX special symbols
		}
		
		«doc.renderPreamble»
		
		\begin{document}
			\maketitle
			«p.render»
		\end{document}
	'''

	protected def String laTeXClass(Document doc) {
		empty(doc.publicationClass.laTeXClass) ? doc.publicationClass.name.toLowerCase : doc.publicationClass.laTeXClass
	}
	
	protected def CharSequence renderPreamble(Document doc) {
		val preamble = doc.publicationClass.laTeXPreamble
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
				
				override protected encode(String plainText) {
					// do not escape the actual preamble template text:
					return plainText
				}
				
			}
			return renderer.render(preamble)
		}
		return ''
	}

	override CharSequence renderSegment(SegmentWithText seg, NestedElementsRenderer blocks) {
		seg.renderSegmentWithText(blocks)
	}

	def dispatch CharSequence renderSegmentWithText(Abstract seg, NestedElementsRenderer blocks) '''
		\begin{abstract}
			«seg.renderAnchor»
			«blocks.render»
		\end{abstract}
	'''

	def dispatch CharSequence renderSegmentWithText(SegmentWithText seg, NestedElementsRenderer blocks) '''
		«seg.renderTitle»
		«blocks.render»
	'''

	override CharSequence renderSegment(PublicationBody seg, NestedElementsRenderer divisions) 
	'''«divisions.render»
	'''

	override CharSequence renderSegment(SegmentWithTable seg, Table t, NestedContentBlockGenerator g) '''
		«seg.renderTitle»
		«t.renderTable(g)»
	'''

	override CharSequence renderSegment(Index seg) '''
		«seg.renderTitle»
		-- index TODO
	'''

	override CharSequence renderTitle(DocumentSegment seg) '''
		\section*{«seg.nonEmptyTitle.encode»}
		«seg.renderAnchor»
	'''

	override CharSequence renderTitle(Division div) '''
		«IF div instanceof Appendix»\appendix«ENDIF»
		\«div.divisionName»{«div.title.renderRichText»}
		«div.renderAnchor»
	'''

	protected def CharSequence divisionName(Division div) {
		if (div instanceof Appendix) {
			return PUB.section.name.toLowerCase
		}
		return div.eClass.name.toLowerCase
	}

	override CharSequence renderAnchor(ReferenceTarget target) {
		val label = target.labelFor
		if (! label.empty) {
			return '''\label{«label»}'''
		}
		return ""
	}

	def CharSequence renderListingAnchor(ReferenceTarget target) {
		val label = target.labelFor
		if (! label.empty) {
			return ''', label={«label»}'''
		}
		return ""
	}
	
	protected def String labelFor(ReferenceTarget target) {
		val id = target.id
		if (id !== null && ! target.id.empty) {
			return target.displayName.toLowerCase + "-" + id
		}
		return ""
	}

	//
	// Content
	//
	override CharSequence renderAdmonition(Admonition a) '''
		-- admonition TODO
	'''

	override CharSequence renderBulletList(List list, NestedElementsRenderer p) '''
		\begin{itemize}
			«list.renderAnchor»
			«p.render»
		\end{itemize} 
	'''

	override CharSequence renderNumberedList(List list, NestedElementsRenderer p) '''
		\begin{enumerate}[label=\«list.numberingStyle.latexNumberingAttribute»"*]
			«list.renderAnchor»
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
		\begin{description}
			«list.renderAnchor»
			«p.render»
		\end{description}
	'''

	override CharSequence renderListItem(ListItem item, NestedElementsRenderer p) '''
		\item «p.render»
		«item.renderAnchor»
	'''

	override CharSequence renderTitledListItem(ListItem item, NestedElementsRenderer p) '''
		\item[«item.title.renderRichText»] «p.render»
		«item.renderAnchor»
	'''

	override CharSequence renderTitledBlock(TitledBlock b, NestedElementsRenderer p) {
		b.renderTitledBlockImpl(p)
	}
	
	protected def dispatch CharSequence renderTitledBlockImpl(TitledTable b, NestedElementsRenderer p) '''
		\begin{table}[hpt]
			\centering\small
			«p.render»
		\end{table}
	'''
	
	protected def dispatch CharSequence renderTitledBlockImpl(TitledCodeListing cl, NestedElementsRenderer p) '''
		\begin{lstlisting}[xleftmargin=12pt«IF cl.title !== null», caption={«cl.title.renderRichText»}«ENDIF»«IF cl.numbered», numbers=left«ENDIF»«cl.renderListingAnchor»]
		«p.render»
		\end{lstlisting}
	'''
	
	protected def dispatch CharSequence renderTitledBlockImpl(TitledBlock b, NestedElementsRenderer p) '''
		«IF b.title !== null»
			\begin{figure}[ht]
				\centering
				«p.render»
			\end{figure}
		«ELSE»
		«p.render»
		«ENDIF»
	'''

	override CharSequence renderTitledBlockTitle(TitledBlock b) '''
		«IF b.title !== null && ! (b instanceof TitledCodeListing)»\caption{«b.title.renderRichText»«b.renderAnchor»}«ENDIF»
	'''

	override CharSequence renderTable(Table t, NestedContentBlockGenerator g) {
		val tableGenerator = new PubLaTeXTableGenerator(t, g)
		tableGenerator.render
	}

	override CharSequence renderFigure(AbstractFigure f, String fileUri) '''
		\includegraphics[width=«f.widthPercent/100.0»\textwidth]{«fileUri.encode»}
	'''

	override IDiagramFileFormatPreference diagramFileFormatPreference(){
		diagramFileFormatPreference
	}
	
	override CharSequence renderEquation(Equation e) '''
		-- equation TODO
	'''

	override CharSequence renderCodeListing(TitledCodeListing cl, String outdentedListing) {
		outdentedListing
	}

	override CharSequence renderPlainParagraph(RichTextParagraph para) {
		para.text.renderRichText + para.endParagraph
	}

	protected def boolean isOnlyContentBlockOfTableCell(ContentBlock para) {
		return para.eContainer instanceof TableCell && (para.eContainer as TableCell).contents.length == 1
	}

	override CharSequence renderQuotedParagraph(RichTextParagraph para) '''
		\quote{«para.text.renderRichText»}
	'''

	override CharSequence renderUnformattedParagraph(UnformattedParagraph para) {
		encode(para.text) + para.endParagraph
	}

	override CharSequence renderRichTextReferencingParagraph(RichTextReferencingParagraph para) {
		para.text.renderRichText 
	}
	
	protected def String endParagraph(Paragraph para) {
		return ! para.isInTableCell ? "\\par" : "" 
	}
	
	protected def boolean isInTableCell(ContentBlock para) {
		return para.eContainer instanceof TableCell && (para.eContainer as TableCell).contents.length == 1
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
					DmxUrlLiteral:
						hyperlink(expr.value, expr.display)
					Reference:
						if (expr.target instanceof Footnote) {
							'''\footnotemark[«(expr.target as Footnote).formattedSingleNumber»]'''
						} else {
							expr.refToReferenceTarget
						}
						
					default:
						super.renderStyleExpression(expr, parsedText)
				}
			}
		}
	}
	
	protected def String hyperlink(String url, String displayText) 
		'''\textsf{«IF empty(displayText)»\url{«url»}«ELSE»\href{«url»}{«displayText»}«ENDIF»}'''

	protected def String staticReferenceLinkText(DmxStaticReference ref) {
		if (! guard(ref.displayName, "").empty) {
			if (ref.plural) {
				return ref.displayName + "s"
			}
			return ref.displayName
		}
		return ref.target.name + "." + ref.member.name
	}

	protected def String refToReferenceTarget(Reference ref) {
		var result = /* "#" +  */ ref.target.labelFor
		val refContainer = EcoreUtil2.getContainerOfType(ref, Document)
		val targetContainer = EcoreUtil2.getContainerOfType(ref.target, Document)
		if (refContainer !== null && targetContainer !== refContainer) {
			result = targetContainer.fileName + "/" + result
		}
		return ref.pageReference ? '''\pageref{«result»}''' : '''\hyperref[«result»]{«IF ref.scope !== null»«ref.scope.displayName» «ENDIF»«ref.target.id»}'''
	}
	
	override CharSequence renderFootnoteInPlace(Footnote f) 
	'''\footnotetext[«f.formattedSingleNumber»]{«f.text.renderRichText»}'''
	
	override CharSequence renderFootnotes(Iterable<Footnote> footnotes) {
		// footnotes are rendered in place and the LaTeX decides where they are placed in the document.
	}
	
	override protected CharSequence encode(CharSequence plainText) {
		escapeLaTeX(plainText as String)
	}

}
