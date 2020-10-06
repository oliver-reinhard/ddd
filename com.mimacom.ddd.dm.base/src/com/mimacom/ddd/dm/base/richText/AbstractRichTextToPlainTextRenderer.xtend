package com.mimacom.ddd.dm.base.richText

import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan

abstract class AbstractRichTextToPlainTextRenderer extends AbstractRichTextRenderer {
	
	
	override protected renderStylePlain(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleEmphasis(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleStrong(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleKeyword(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleExpression(DExpression expr, String parsedText) {
		parsedText
	}
	
	override protected renderStyleMonospace(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleUnderline(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleStrikethrough(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleSubscript(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleSuperscript(DStyledTextSpan span) {
		span.render
	}
	
}