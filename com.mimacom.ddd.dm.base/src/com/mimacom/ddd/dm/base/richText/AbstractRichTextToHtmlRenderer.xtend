package com.mimacom.ddd.dm.base.richText

import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan

abstract class AbstractRichTextToHtmlRenderer extends AbstractRichTextRenderer {
	
	extension RichTextUtil = new RichTextUtil
		
	override protected encode(String plainText) {
		return escapeHtml(plainText)
	}
	
	override protected renderStylePlain(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleEmphasis(DStyledTextSpan span) {
		"<em>" + span.render + "</em>"
	}
	
	override protected renderStyleStrong(DStyledTextSpan span) {
		"<strong>" + span.render + "</strong>"
	}
	
	override protected renderStyleMonospace(DStyledTextSpan span) {
		"<code>" + span.render + "</code>"
	}
	
	override protected renderStyleKeyword(DStyledTextSpan span) {
		"<b>" + span.render + "</b>"
	}
	
	override protected renderStyleExpression(DExpression expr, String parsedText) {
		"<b><code>" + parsedText + "</code></b>"
	}
	
	override protected renderStyleUnderline(DStyledTextSpan span) {
		"<u>" + span.render + "</u>"
	}
	
	override protected renderStyleStrikethrough(DStyledTextSpan span) {
		"<s>" + span.render + "</s>"
	}
	
	override protected renderStyleSubscript(DStyledTextSpan span) {
		"<sub>" + span.render + "</sub>"
	}
	
	override protected renderStyleSuperscript(DStyledTextSpan span) {
		"<sup>" + span.render + "</sup>"
	}
}