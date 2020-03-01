package com.mimacom.ddd.dm.base.richText

import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.styledText.DStyledTextSpan

abstract class AbstractRichTextToLaTeXRenderer extends AbstractRichTextRenderer {
	
	extension RichTextUtil = new RichTextUtil
	
	override protected String encode(String plainText) {
		return escapeLaTeX(plainText)
	}
	
	override protected renderStylePlain(DStyledTextSpan span) {
		span.render
	}
	
	override protected renderStyleEmphasis(DStyledTextSpan span) {
		"\\textit{" + span.render + "}"
	}
	
	override protected renderStyleStrong(DStyledTextSpan span) {
		"\\textbf{" + span.render + "}"
	}
	
	override protected renderStyleMonospace(DStyledTextSpan span) {
		"\\texttt{" + span.render + "}"
	}
	
	override protected renderStyleKeyword(DStyledTextSpan span) {
		"\\textbf{\\textsf{" + span.render + "}}"
	}
	
	override protected renderStyleExpression(DExpression expr, String parsedText) {
		"\\textbf{\\texttt{" + parsedText + "}}"
	}
	
	override protected renderStyleUnderline(DStyledTextSpan span) {
		"\\underline{" + span.render + "}"
	}
	
	override protected renderStyleStrikethrough(DStyledTextSpan span) {
		"\\sout{" + span.render + "}"
	}
	
	override protected renderStyleSubscript(DStyledTextSpan span) {
		"\\textsubscript{" + span.render + "}"
	}
	
	override protected renderStyleSuperscript(DStyledTextSpan span) {
		"\\textsuperscript{" + span.render + "}"
	}
}