package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.dm.styledText.parser.NullErrorMessageAcceptor
import com.mimacom.ddd.pub.pub.Admonition
import com.mimacom.ddd.pub.pub.CodeListing
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Equation
import com.mimacom.ddd.pub.pub.Figure
import com.mimacom.ddd.pub.pub.Index
import com.mimacom.ddd.pub.pub.List
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.Paragraph
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.ReferenceTarget
import com.mimacom.ddd.pub.pub.SegmentWithTable
import com.mimacom.ddd.pub.pub.SegmentWithText
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.UnformattedParagraph
import org.eclipse.xtext.generator.IFileSystemAccess2

abstract class AbstractPubRenderer {

	static val NULL_ERROR_MSG_ACCEPTOR = new NullErrorMessageAcceptor
	
	def String fileName(Document doc) {
		doc.name + "." + doc.fileSuffix
	}
	
	/*
	 * Returns file-name suffix excluding any leading dot.
	 */
	abstract def String fileSuffix(Document doc)
	
	abstract def void prepare(Document doc, IFileSystemAccess2 fsa)
	abstract def void finish(Document doc, IFileSystemAccess2 fsa)
	
	//
	// Structure
	//

	abstract def CharSequence renderDocument(Document doc, NestedElementsRenderer p)
	
	abstract def CharSequence renderSegment(SegmentWithText seg, NestedElementsRenderer blocks)
	
	abstract def CharSequence renderSegment(PublicationBody seg, NestedElementsRenderer divisions)
	
	abstract def CharSequence renderSegment(Index seg)
	
	abstract def CharSequence renderSegment(SegmentWithTable seg, Table t, NestedContentBlockGenerator g)
	
	abstract def CharSequence renderTitle(DocumentSegment seg) 
	
	abstract def CharSequence renderTitle(Division div) 
	
	abstract def CharSequence renderAnchor(ReferenceTarget target)
	
	abstract def CharSequence renderReferenceTo(ReferenceTarget target, String linkText)
	

	//
	// Content
	// 	
	
	abstract def CharSequence renderAdmonition(Admonition a) 
	
	abstract def CharSequence renderBulletList(List list, NestedElementsRenderer p) 
	
	abstract def CharSequence renderNumberedList(List list, NestedElementsRenderer p) 
	
	abstract def CharSequence renderTitledList(List list, NestedElementsRenderer p) 
	
	abstract def CharSequence renderListItem(ListItem item, NestedElementsRenderer p) 
	
	abstract def CharSequence renderTitledListItem(ListItem item, NestedElementsRenderer p)

	abstract def CharSequence renderTitledBlock(TitledBlock b, NestedElementsRenderer p)
	
	abstract def CharSequence renderTitledBlockTitle(TitledBlock b)

	abstract def CharSequence renderTable(Table t, NestedContentBlockGenerator g)

	abstract def CharSequence renderFigure(Figure f, String fileUri)

	abstract def CharSequence renderEquation(Equation e)

	abstract def CharSequence renderCodeListing(CodeListing cl, java.util.List<String> lines)

	abstract def CharSequence renderPlainParagraph(Paragraph para) 
	
	abstract def CharSequence renderQuotedParagraph(Paragraph para)
	
	abstract def CharSequence renderUnformattedParagraph(UnformattedParagraph para)

	//
	// RichText
	//
	abstract def AbstractRichTextRenderer createRichTextRenderer(ErrorMessageAcceptor acceptor) 
	
	def CharSequence renderRichText(DRichText text) {
		val renderer = createRichTextRenderer(NULL_ERROR_MSG_ACCEPTOR)
		val result = renderer.render(text)
		return result
	}
}
