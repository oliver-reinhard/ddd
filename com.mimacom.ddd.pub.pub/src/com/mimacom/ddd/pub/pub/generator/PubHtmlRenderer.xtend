/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToHtmlRenderer
import com.mimacom.ddd.dm.base.richText.RichTextUtil
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxRichTextUtil
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral
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
import com.mimacom.ddd.pub.pub.Footnote
import com.mimacom.ddd.pub.pub.GridLines
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

class PubHtmlRenderer extends AbstractPubRenderer {

	@Inject extension RichTextUtil
	@Inject extension DmxRichTextUtil
	@Inject extension PubUtil
	@Inject extension PubNumberingUtil
	@Inject extension PubGeneratorUtil

	static public val DOCUMENT_SUFFIX = "html"
	static public val CSS_FILENAME = "pubstyles.css"

	@Inject PubHtmlDiagramFileFormatPreference diagramFileFormatPreference

	override String fileSuffix(Document doc) {
		DOCUMENT_SUFFIX
	}

	override PubGeneratorTarget target() {
		PubGeneratorTarget.HTML
	}

	override prepare(Document doc, IFileSystemAccess2 fsa) {
		val css = ''' 
			table, th {
				border-top: 1px solid black;
				border-bottom: 1px solid black;
				border-left: 0.5px solid black;
				border-right: 0.5px solid black;
				border-collapse: collapse;
			}
			td {
				border-bottom: 0.5px solid black;
				border-left: 0.5px solid black;
				border-right: 0.5px solid black;
				border-collapse: collapse;
			}
			th {
				text-align: left;
			}
			th, td {
				height: 10px
				padding-left: 5px;
			}
			pre {tab-size: «PubGeneratorUtil::TAB_SIZE»;}
		'''
		fsa.generateFile(doc.fileSuffix + "/" + CSS_FILENAME, css)
	}

	override finish(Document doc, IFileSystemAccess2 fsa) {
	}

	//
	// Structure
	//
	override CharSequence renderDocument(Document doc, NestedElementsRenderer p) '''
		<!DOCTYPE html>
		<html lang="en-US">
		<head>
		  <meta charset="UTF-8">
		  <title>«doc.title»</title>
		  <link rel="stylesheet" href="«CSS_FILENAME»">
		</head>
		
		«doc.renderPreamble»
		
		<!-- Document class: «doc.publicationClass.name» -->
		<body>
		<h1>«doc.title»</h1>
		«p.render»
		</body>
		</html>
	'''

	protected def CharSequence renderPreamble(Document doc) {
		val preamble = doc.publicationClass.htmlPreamble
		if (preamble !== null) {
			val renderer = new AbstractRichTextToHtmlRenderer {

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

				override encode(String plainText) {
					// do not escape the actual preamble template text:
					return plainText
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
		<div>
		«divisions.render»
		</div>
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
		<h2>«renderAnchor(seg)»«seg.nonEmptyTitle.encode»</h2>
	'''

	override CharSequence renderTitle(Division div) '''
		<h«div.getLevel+2»>«renderAnchor(div)»«div.tieredNumber» «div.title.renderRichText»</h1>
	'''

	override CharSequence renderAnchor(ReferenceTarget target) {
		val id = target.id
		if (id !== null && ! target.id.empty) {
			return "<a id=\"" + id + "\"></a>"
		}
		return ""
	}

//
//	override CharSequence renderReferenceTo(ReferenceTarget target,
//		String linkText) '''<a href="#«target.id»">«linkText»</a>'''
	//
	// Content
	//
	override CharSequence renderAdmonition(Admonition a) '''
		-- admonition
	'''

	override CharSequence renderBulletList(List list, NestedElementsRenderer p) '''
		<ul>«renderAnchor(list)»«p.render»</ul>
	'''

	override CharSequence renderNumberedList(List list, NestedElementsRenderer p) '''
		<ol type=«list.numberingStyle.htmlNumberingAttribute»">«renderAnchor(list)»«p.render»</ol>
	'''

	protected def String htmlNumberingAttribute(ProtoSequenceNumberStyle style) {
		switch style {
			case ARABIC: "1"
			case CAPITAL_ROMAN: "I"
			case SMALL_ROMAN: "i"
			case CAPITAL_LETTER: "A"
			case SMALL_LETTER: "a"
			case NONE: "1"
		}
	}

	override CharSequence renderTitledList(List list, NestedElementsRenderer p) '''
		<ul style="list-style-type:none;">«renderAnchor(list)»
			«p.render»</ul>
	'''

	override CharSequence renderListItem(ListItem item, NestedElementsRenderer p) '''
		<li>«renderAnchor(item)»«p.render»</li>
	'''

	override CharSequence renderTitledListItem(ListItem item, NestedElementsRenderer p) '''
		<li>«renderAnchor(item)»<p><b>«item.title.renderRichText»</b></p>
		«p.render»
		</li>
	'''

	override CharSequence renderTitledBlock(TitledBlock b, NestedElementsRenderer p) '''
	<div>
		«renderAnchor(b)»
		«p.render»
	</div>'''

	override CharSequence renderTitledBlockTitle(TitledBlock b) '''
		<h5>«b.labelAndNumber»: «b.title.renderRichText»</h5>
	'''

	override CharSequence renderTable(Table t, NestedContentBlockGenerator g) '''
		<table style="width:«t.widthPercent»%; «t.gridlines.tableBorders»">
			«FOR row : t.rows»
				<tr>	
					«FOR cell : row.cells»
						«cell.startTag»«FOR block : cell.contents»«g.generate(block)»«ENDFOR»«row.isHeading?"</th>":"</td>"»
			«««						Note: HTML cannot handle multiple (vertically parallel) colspans that start and end in different rows -> try HTML directly.
					«ENDFOR»
			</tr>
			«ENDFOR»
		</table>
	'''

	protected def String tableBorders(GridLines gl) {
		switch gl {
			case HORIZONTAL: "border-left:0; border-right:0;"
			case VERTICAL: "border-top:0; border-bottom:0;"
			case BOTH: ""
			case NONE: "border:0;"
		}
	}

	protected def String startTag(TableCell cell) {
		val StringBuilder b = new StringBuilder
		b.append(cell.row.isHeading ? "<th" : "<td")
		val gridLines = cell.row.table.gridlines.tableBorders
		if (! gridLines.empty) {
			b.append(" style=\"")
			b.append(gridLines)
			b.append("\"")
		}
		if (cell.width > 1) {
			b.append(" colspan=\"");
			b.append(cell.width)
			b.append("\"")
		}
		if (cell.height > 1) {
			b.append(" rowspan=\"");
			b.append(cell.height)
			b.append("\"")
		}
		b.append('>')
		return b.toString
	}

	override CharSequence renderFigure(AbstractFigure f, String fileUri) '''
		<img src="«fileUri.encode»" alt="«(f.eContainer as TitledFigure).title.renderRichText»">
	'''

	override IDiagramFileFormatPreference diagramFileFormatPreference(){
		diagramFileFormatPreference
	}

	override CharSequence renderEquation(Equation e) '''
		-- equation (TODO)
	'''

	override CharSequence renderCodeListing(TitledCodeListing cl, java.util.List<String> codeLines) '''
		<pre>
		«FOR line : codeLines»«encode(line)»«ENDFOR»</pre>
	'''

	override CharSequence renderPlainParagraph(
		RichTextParagraph para) '''«IF para.isOnlyContentBlockOfTableCell»«para.text.renderRichText»«ELSE»<p>«para.text.renderRichText»</p>«ENDIF»'''

	protected def boolean isOnlyContentBlockOfTableCell(ContentBlock para) {
		return para.eContainer instanceof TableCell && (para.eContainer as TableCell).contents.length == 1
	}

	override CharSequence renderQuotedParagraph(RichTextParagraph para) '''
		<p><blockquote>«para.text.renderRichText»</blockquote></p>
	'''

	override CharSequence renderUnformattedParagraph(
		UnformattedParagraph para) '''«IF para.isOnlyContentBlockOfTableCell»«encode(para.text)»«ELSE»<p>«encode(para.text)»</p>«ENDIF»'''

	override CharSequence renderRichTextReferencingParagraph(
		RichTextReferencingParagraph para) '''«IF para.isOnlyContentBlockOfTableCell»«para.text.renderRichText»«ELSE»<p>«para.text.renderRichText»</p>«ENDIF»'''

	override createRichTextRenderer(ErrorMessageAcceptor acceptor) {
		return new AbstractRichTextToHtmlRenderer {

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
						hyperlink(expr.value, expr.display !== null ? expr.display : expr.value)
					Reference:
						if (expr.target instanceof Footnote) {
							'''<sup>[«hyperlink(expr.htmlReferenceLinkTargetId, (expr.target as Footnote).formattedSingleNumber)»]</sup>'''
						} else {
							hyperlink(expr.htmlReferenceLinkTargetId, expr.target.referenceDisplayText)
						}
					default:
						super.renderStyleExpression(expr, parsedText)
				}
			}
		}
	}

	protected def String hyperlink(String url, String displayText) '''<a href="«url»">«displayText»</a>'''

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

	override CharSequence renderFootnoteInPlace(Footnote f) {
		// footnotes are not rendered where they occur
	}

	override CharSequence renderFootnotes(Iterable<Footnote> footnotes) '''
		<br><div style="border:0.5px solid grey; width: 200px;"></div><br>
		«FOR f : footnotes»
			«renderAnchor(f)» <sup>«f.formattedSingleNumber»</sup> <small>«f.text.renderRichText»</small>
		«ENDFOR»
	'''

	override protected CharSequence encode(CharSequence plainText) {
		escapeHtml(plainText as String)
	}

}
