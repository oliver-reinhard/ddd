package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer
import com.mimacom.ddd.dm.base.richText.RichTextUtil
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.base.styledText.parser.NullErrorMessageAcceptor
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser
import com.mimacom.ddd.util.plantuml.SkinparamNote

class RichTextToPlantUmlNoteTextRenderer extends AbstractRichTextRenderer {
	
	@Inject extension RichTextUtil
	@Inject SkinparamNote skinparamNote
	
	override protected getSourceText(DExpression expr) {
		expr.getSourceTextFromXtextResource
	}

	override protected createParser(String source) {
		new StyledTextParser(source, new NullErrorMessageAcceptor) // ignore error messages
	}
		
	override protected encode(String plainText) {
		return escapePlantUml(plainText)
	}
	
	override protected renderStylePlain(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleEmphasis(DStyledTextSpan span) {
		"<i>" + span.render + "</i>"
	}
	
	override protected renderStyleStrong(DStyledTextSpan span) {
		"<b>" + span.render + "</b>"
	}
	
	override protected renderStyleMonospace(DStyledTextSpan span) {
		"\"\"" + span.render + "\"\"" // covered by escapeHtml encoder
	}
	
	override protected renderStyleKeyword(DStyledTextSpan span) {
		val color = skinparamNote.keywordFontColor
		"<b><color:" + color + ">" + span.render + "</color></b>"
	}
	
	override protected renderStyleExpression(DExpression expr, String parsedText) {
		"<b>\"\"" + parsedText + "\"\"</b>"
	}
	
	override protected renderStyleUnderline(DStyledTextSpan span) {
		"<u>" + span.render + "</u>"
	}
	
	override protected renderStyleStrikethrough(DStyledTextSpan span) {
		"<s>" + span.render + "</s>"
	}
	
	override protected renderStyleSuperscript(DStyledTextSpan span) {
		"<sup>" + span.render + "</sup>"
	}
	
	override protected renderStyleSubscript(DStyledTextSpan span) {
		"<sub>" + span.render + "</sub>"
	}
}
