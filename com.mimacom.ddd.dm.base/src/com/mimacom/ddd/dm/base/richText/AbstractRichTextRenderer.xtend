package com.mimacom.ddd.dm.base.richText

import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.styledText.DTextStyle
import com.mimacom.ddd.dm.styledText.StyledTextFactory
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.dm.styledText.parser.StyledTextParser
import java.util.List
import com.mimacom.ddd.dm.base.DTextSegment

abstract class AbstractRichTextRenderer {

	static class RendererErrorMessageAcceptor implements ErrorMessageAcceptor {

		override void acceptError(String message, int offset, int length) throws IllegalStateException {
			throw new IllegalStateException("DRichText parse error: invalid format: '" + message + "' at position " +
				offset)
		}
	}

	var List<DExpression> expressions
	var currentExpressionIndex = -1

	synchronized def CharSequence render(DRichText text) throws IllegalStateException {
		val source = text.sourceText
		if (source !== null) {
			expressions = text.segments.filter(DExpression).toList
			currentExpressionIndex = -1
			val parser = new StyledTextParser(source, new RendererErrorMessageAcceptor)
			val span = parser.parse // throws IllegalStateException
			if (span !== null) {
				return span.render // the first level is always a pure "Plain" span => skip rendering
			}
		}
		return ""
	}

	/**
	 * Returns the source text underlying the rich text {@code text}, i.e. {@code text} is a structured form of the underlying source text.
	 */
	protected def String getSourceText(DRichText text) {
		val StringBuilder b = new StringBuilder
		for (s : text.segments) {
			if (s instanceof DTextSegment) {
				b.append(s.value)
			} else if (s instanceof DExpression) {
				val exprText = s.getSourceText
				b.append('[')
				b.append(exprText)
				b.append(']')
			}
		}
		return b.toString
	}

	/**
	 * Returns the source text underlying the given expression. If this text is not required to later render the expression, return an empty but non-null string.
	 */
	abstract protected def String getSourceText(DExpression expr);

	protected def CharSequence render(DStyledTextSpan parent) {
		if (parent.leaf) {
			return parent.text
		}
		val StringBuilder b = new StringBuilder
		for (subspan : parent.subspans) {
			b.append(parent.renderStyledText(subspan))
		}
		return b.toString
	}

	protected def CharSequence renderStyledText(DStyledTextSpan parent, DStyledTextSpan span) {
		val format = diff(span, parent)
		return switch format.style {
			case EMPHASIS:
				span.renderStyleEmphasis
			case STRONG:
				span.renderStyleStrong
			case KEYWORD:
				span.renderStyleKeyword
			case MONOSPACE:
				span.renderStyleMonospace
			case EXPRESSION:
				span.renderExpression
			case PLAIN: {
				if (format.attributes.empty) {
					span.renderStylePlain
				} else {
					switch format.attributes.head {
						case UNDERLINE: span.renderStyleUnderline
						case STRIKETHROUGH: span.renderStyleStrikethrough
						case SUBSCRIPT: span.renderStyleSubscript
						case SUPERSCRIPT: span.renderStyleSuperscript
					}
				}
			}
		}
	}

	/**
	 * Returns a new span that defines only a single style or attribute.
	 */
	protected def DStyledTextSpan diff(DStyledTextSpan span, DStyledTextSpan parent) {
		if (parent === null) {
			return span
		}
		val result = StyledTextFactory.eINSTANCE.createDStyledTextSpan
		result.style = if(span.style == parent.style) DTextStyle.PLAIN else span.style
		if (span.attributes.length > parent.attributes.length) {
			result.attributes.add(span.attributes.last)
		}
		result.text = span.text
		return result
	}

	protected def CharSequence renderExpression(DStyledTextSpan span) {
		currentExpressionIndex++
		if (currentExpressionIndex < expressions.length) {
			val expr = expressions.get(currentExpressionIndex)
			return renderStyleExpression(expr, span.text)
		}
		throw new IllegalStateException("Number of expressions in RichText and in parsed DStyledTextSpan do not match")
	}

	abstract protected def CharSequence renderStylePlain(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleEmphasis(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleStrong(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleKeyword(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleExpression(DExpression expr, String parsedText)

	abstract protected def CharSequence renderStyleMonospace(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleUnderline(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleStrikethrough(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleSubscript(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleSuperscript(DStyledTextSpan span)
}
