package com.mimacom.ddd.dm.base.richText

import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.base.base.DTextSegment
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.base.styledText.DTextStyle
import com.mimacom.ddd.dm.base.styledText.StyledTextFactory
import com.mimacom.ddd.dm.base.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser
import java.util.List
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

abstract class AbstractRichTextRenderer {

	static class RendererErrorMessageAcceptor implements ErrorMessageAcceptor {

		override void acceptError(String message, int offset, int length) throws IllegalStateException {
			throw new IllegalStateException("DRichText parse error: invalid format: '" + message + "' at position " + offset)
		}
	}

	var String source // stored to provide meaningful error messages
	var List<DExpression> expressions
	var currentExpressionIndex = -1
	var encode = true

	synchronized def CharSequence render(DRichText text) throws IllegalStateException {
		render(text, true)
	}

	synchronized def CharSequence render(DRichText text, boolean encode) throws IllegalStateException {
		val source = text.sourceText
		if (source !== null && ! source.empty) {
			this.source = source
			expressions = text.segments.filter(DExpression).toList
			currentExpressionIndex = -1
			val parser = createParser(source)
			val span = parser.parse // throws IllegalStateException
			if (span !== null) {
				return span.render // the first level is always a pure "Plain" span => skip rendering
			}
		}
		return ""
	}
	
	protected def StyledTextParser createParser(String source) {
		new StyledTextParser(source, new RendererErrorMessageAcceptor)
	}

	/**
	 * Returns the source text underlying the rich text {@code text}, i.e. {@code text} is a structured form of the underlying source text.
	 */
	protected def String getSourceText(DRichText text) {
		if (text === null) return ""
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
			return encode ? encode(parent.text) : parent.text
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
		result.style = if (span.style == parent.style) DTextStyle.PLAIN else span.style
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
			return renderStyleExpression(expr, encode ? encode(span.text) as String : span.text)
		}
		throw new IllegalStateException("Number of expressions in RichText and in parsed DStyledTextSpan do not match: \"" + source +
			"\". Expected expressions: " + expressions.size + ". Escape reserved symbols.")
	}

	/**
	 * Ensure special characters of the rendering language (e.g. HTML) are properly escaped.
	 * 
	 * @param plainText can be {@code null}
	 */
	abstract protected def String encode(String plainText)

	abstract protected def CharSequence renderStylePlain(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleEmphasis(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleStrong(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleKeyword(DStyledTextSpan span)

	/**
	 * @param parsedText represents the plain text of the expression an can be used to provide an easy default implementation
	 */
	abstract protected def CharSequence renderStyleExpression(DExpression expr, String parsedText)

	abstract protected def CharSequence renderStyleMonospace(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleUnderline(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleStrikethrough(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleSubscript(DStyledTextSpan span)

	abstract protected def CharSequence renderStyleSuperscript(DStyledTextSpan span)
	
	

	/**
	 * Preconditions: expr is part of an XtextResource and the syntax the resource's text is valid
	 */
	static def String getSourceTextFromXtextResource(DExpression expr) {
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(expr)
		return node.text // may be null
	}
}
