package com.mimacom.ddd.dm.base.styledText.parser;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.base.styledText.DTextAttribute;
import com.mimacom.ddd.dm.base.styledText.DTextStyle;
import com.mimacom.ddd.dm.base.styledText.StyledTextFactory;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextTokenizer.Token;

/**
 * Stateful recursive-descent parser. Only use once.
 *
 */
public class StyledTextParser {

	static final StyledTextFactory FACTORY = StyledTextFactory.eINSTANCE;

	final StyledTextTokenizer tokenizer;
	final char[] styledText;
	final int startIndex;
	final int endIndex;
	protected ErrorMessageAcceptor errorMessageAcceptor;

	public StyledTextParser(String styledText) {
		this(styledText, 0, styledText != null ? styledText.length() - 1 : 0, null);
	}
	
	public StyledTextParser(String styledText, ErrorMessageAcceptor acceptor) {
		this(styledText, 0, styledText != null ? styledText.length() - 1 : 0, acceptor);
	}
	

	public StyledTextParser(String styledText, int startIndex, int endIndex) {
		this(styledText, startIndex, endIndex, null);
	}

	/**
	 * @param styledText not null
	 * @param startIndex index of first character of text to scan
	 * @param endIndex   index of last character of text to scan
	 * @param acceptor	collects parse errors; defaults to {@link ErrorMessageAcceptor} when <code>null</code>
	 * @return null if no format has been detected
	 */
	public StyledTextParser(String styledText, int startIndex, int endIndex, ErrorMessageAcceptor acceptor) {
		if (styledText == null) {
			throw new NullPointerException("text");
		}
		errorMessageAcceptor = acceptor != null? acceptor : new SystemErrorErrorMessageAcceptor();
 		this.styledText = styledText.toCharArray();
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.tokenizer = new StyledTextTokenizer(this.styledText, startIndex, endIndex);
	}

	public ErrorMessageAcceptor getErrorMessageAcceptor() {
		return errorMessageAcceptor;
	}

	void error(String message, int pos, int length) {
		getErrorMessageAcceptor().acceptError(message, pos, length);
	}

	public DStyledTextSpan parse() {
		DStyledTextSpan root = createSpan(null);
		try {
			parseImpl(root, Token.EOF);
		} catch (PrematureEOFException e) {
			// Diagnostic message already issued/accepted.
		}
		root.setEndPos(tokenizer.getIndex() - 1);
		if (root.getSubspans().isEmpty()) {
			root.setText("");
		}
		return root;
	}

	void parseImpl(DStyledTextSpan parent, Token returnOnToken) {
		while (true) {
			Token t = tokenizer.readNext();
			if (t == returnOnToken) {
				return;
			}

			try {
				switch (t) {
				case EOF:
					if (returnOnToken != Token.EOF) {
						error("Unclosed format(s): Expecting '" + returnOnToken.getLiteral() + "'",
								tokenizer.getIndex() - 1, 1);
						throw new PrematureEOFException();
					}
					return;
				case TEXT:
					addTextSpan(parent);
					break;
				case EMPHASIS:
					openStyle(parent, DTextStyle.EMPHASIS, t, Token.EMPHASIS);
					break;
				case STRONG:
					openStyle(parent, DTextStyle.STRONG, t, Token.STRONG);
					break;
				case KEYWORD:
					openStyle(parent, DTextStyle.KEYWORD, t, Token.KEYWORD);
					break;
				case MONOSPACE_START:
					openStyle(parent, DTextStyle.MONOSPACE, t, Token.MONOSPACE_END);
					break;
				case EXPRESSION_START:
					handleExpression(parent);
					break;
				case STATIC_REFERENCE_START:
					handleStaticReference(parent);
					break;
				case UNDERLINE:
					openTextAttribute(parent, DTextAttribute.UNDERLINE, t, Token.UNDERLINE);
					break;
				case STRIKETHROUGH:
					openTextAttribute(parent, DTextAttribute.STRIKETHROUGH, t, Token.STRIKETHROUGH);
					break;
				case SUPERSCRIPT:
					openTextAttribute(parent, DTextAttribute.SUPERSCRIPT, t, Token.SUPERSCRIPT);
					break;
				case SUBSCRIPT:
					openTextAttribute(parent, DTextAttribute.SUBSCRIPT, t, Token.SUBSCRIPT);
					break;
				case EXPRESSION_END:
					// Special treatment for missing EXPRESSION_START symbols:
					error("Unpaired expression end '" + t.getLiteral() + "'", tokenizer.getIndex() - t.getLength(),
								t.getLength());
					break;
				default:
					error("Unexpected token '" + t.getLiteral() + "'", tokenizer.getIndex() - t.getLength(),
							t.getLength());

				}
				
			} catch (ConflictingFormatsException e) {
				error(e.getMessage() + ": Expecting '" + returnOnToken.getLiteral() + "'", e.pos,
						tokenizer.getLastToken().getLength());
				if (tokenizer.getLastToken() != returnOnToken) {
					tokenizer.skipToNext(returnOnToken); // does not consume the token!
				}
			}
		}
	}

	/**
	 * 
	 * @param parent if not <code>null</code>, then the parent's
	 *               {@link DStyledTextSpan#getStyle()} and
	 *               {@link DStyledTextSpan#getAttributes()} are copied and the new
	 *               span is added to <code>parent</code> to the parent's
	 *               {@link DStyledTextSpan#getSubspans()}
	 * @return the new span
	 */
	DStyledTextSpan createSpan(DStyledTextSpan parent) {
		DStyledTextSpan span = FACTORY.createDStyledTextSpan();
		span.setStartPos(tokenizer.getLastTokenStartIndex());
		span.setStyle(DTextStyle.PLAIN);
		if (parent != null) {
			span.setStyle(parent.getStyle());
			span.getAttributes().addAll(parent.getAttributes());
			parent.getSubspans().add(span);
		}
		return span;
	}

	void addTextSpan(DStyledTextSpan parent) {
		DStyledTextSpan span = createSpan(parent);
		span.setEndPos(tokenizer.getIndex() - 1);
		span.setText(tokenizer.getText());
	}

	void openStyle(DStyledTextSpan parent, DTextStyle style, Token openingToken, Token closingToken) {
		if (parent.getStyle() == DTextStyle.PLAIN) {
			DStyledTextSpan span = createSpan(parent);
			span.setStyle(style);
			try {
				parseImpl(span, closingToken);
			} finally {
				span.setEndPos(tokenizer.getIndex() - 1);
			}
		} else if (parent.getStyle() == style) {
			throw new ConflictingFormatsException("Format overlap", tokenizer.getIndex() - openingToken.getLength());
		} else {
			throw new ConflictingFormatsException("Conflicting styles",
					tokenizer.getIndex() - openingToken.getLength());
		}
	}

	void openTextAttribute(DStyledTextSpan parent, DTextAttribute attr, Token openingToken, Token closingToken) {
		if (!parent.getAttributes().contains(attr)) {
			DStyledTextSpan span = createSpan(parent);
			span.getAttributes().add(attr);
			try {
				parseImpl(span, closingToken);
			} finally {
				span.setEndPos(tokenizer.getIndex() - 1);
			}
		} else {
			throw new ConflictingFormatsException("Format overlap", tokenizer.getIndex() - openingToken.getLength());
		}
	}
	

	void handleExpression(DStyledTextSpan parent) {
		DStyledTextSpan span = createSpan(parent);
		span.setStyle(DTextStyle.EXPRESSION);
		Token t;
		while (true) {
			t = tokenizer.peekNext(); // do not consume the token
			if (t == Token.EXPRESSION_START) {
				error("Unclosed expression: Expecting '" + Token.EXPRESSION_END.getLiteral() + "'",
						tokenizer.getIndex(), Token.EXPRESSION_START.getLength());
				break;
			} else if (t == Token.EXPRESSION_END) {
				tokenizer.readNext();
				break;
			} else if (t == Token.EOF) {
				tokenizer.readNext(); 
				break;
			}
			tokenizer.readNext(); 
		}
		span.setEndPos(tokenizer.getIndex() - 1);
		final int textStartPos = span.getStartPos() + 1;
		final int textEndPos = span.getEndPos();
		final int length = textEndPos - textStartPos;
		String text = length > 0 ? new String(styledText, textStartPos, length) : "";
		span.setText(text);
		if (t == Token.EOF) {
			error("Unclosed expression: Expecting '" + Token.EXPRESSION_END.getLiteral() + "'",
					tokenizer.getIndex() - 1, 1);
		}
	}
	

	void handleStaticReference(DStyledTextSpan parent) {
		DStyledTextSpan span = createSpan(parent);
		// Return as an expression but adjust length of actual static-reference text:
		span.setStyle(DTextStyle.EXPRESSION);
		Token t;
		while (true) {
			t = tokenizer.peekNext(); // do not consume the token
			if (t == Token.STATIC_REFERENCE_START) {
				error("Unclosed expression: Expecting '" + Token.STATIC_REFERENCE_END.getLiteral() + "'",
						tokenizer.getIndex(), Token.STATIC_REFERENCE_START.getLength());
				break;
			} else if (t == Token.STATIC_REFERENCE_END) {
				tokenizer.readNext();
				break;
			} else if (t == Token.EOF) {
				tokenizer.readNext(); 
				break;
			}
			tokenizer.readNext(); 
		}
		span.setEndPos(tokenizer.getIndex() - 1);
		final int textStartPos = span.getStartPos() + 2;
		final int textEndPos = span.getEndPos() - 1;
		final int length = textEndPos - textStartPos;
		String text = length > 0 ? new String(styledText, textStartPos, length) : "";
		span.setText(text);
		if (t == Token.EOF) {
			error("Unclosed expression: Expecting '" + Token.STATIC_REFERENCE_END.getLiteral() + "'",
					tokenizer.getIndex() - 1, 1);
		}
	}

	/*
	 * --- Print parsed tree ---
	 */

	public String toString(DStyledTextSpan root) {
		// Collect tree nodes by level so we can later print all the nodes at the same
		// level:
		final Multimap<Integer, DStyledTextSpan> mapByTreeLevel = ArrayListMultimap.create();
		traverse(mapByTreeLevel, 0, root);
		List<Integer> levels = Lists.newArrayList(mapByTreeLevel.keySet());
		Collections.sort(levels);
		
		final StringBuilder b = new StringBuilder();

		for (Integer level : levels) {
			final StringBuilder line1 = new StringBuilder();
			for (DStyledTextSpan span : mapByTreeLevel.get(level)) {
				putFormat(line1, span);
			}
			b.append(line1);
			b.append('\n');

			final StringBuilder line2 = new StringBuilder();
			int spanIndex = 0;
			for (DStyledTextSpan span : mapByTreeLevel.get(level)) {
				putLine(line2, span, spanIndex);
				spanIndex++;
			}
			b.append(line2);
			b.append('\n');

			final StringBuilder line3 = new StringBuilder();
			for (DStyledTextSpan span : mapByTreeLevel.get(level)) {
				putText(line3, span);
			}
			b.append(line3);
			b.append('\n');

			final StringBuilder line4 = new StringBuilder();
			for (DStyledTextSpan span : mapByTreeLevel.get(level)) {
				putPositionRuler(line4, span);
			}
			b.append(line4);
			b.append('\n');
			b.append('\n');
		}
		return b.toString();
	}

	public void traverse(Multimap<Integer, DStyledTextSpan> map, int level, DStyledTextSpan span) {
		map.put(level, span);
		for (DStyledTextSpan child : span.getSubspans()) {
			traverse(map, level + 1, child);
		}
	}

	void putPositionRuler(StringBuilder b, DStyledTextSpan span) {
		alignWithPosition(b, span);
		for (int printPos = b.length(); printPos <= span.getEndPos(); printPos++) {
			b.append(printPos % 10); // only print last digit
		}
	}

	void putFormat(StringBuilder b, DStyledTextSpan span) {
		alignWithPosition(b, span);
		b.append(getFormatDescription(span));
	}

	void putLine(StringBuilder b, DStyledTextSpan span, int spanIndex) {
		alignWithPosition(b, span);
		final int len = span.getEndPos() - span.getStartPos() + 1;
		final int digit = spanIndex % 10; // only print last digit
		for (int i = 0; i < len; i++) {
			b.append(digit);
		}
	}

	void putText(StringBuilder b, DStyledTextSpan span) {
		alignWithPosition(b, span);
		for (int i = span.getStartPos(); i <= span.getEndPos(); i++) {
			b.append(styledText[i]);
		}
	}

	void alignWithPosition(StringBuilder b, DStyledTextSpan span) {
		final int printPos = b.length();
		for (int i = startIndex + printPos; i < span.getStartPos(); i++) {
			b.append(' ');
		}
	}

	String getFormatDescription(DStyledTextSpan span) {
		final int DESC_LEN = 2;
		final StringBuilder b = new StringBuilder();
		final String style = span.getStyle().getName();
		b.append(style.substring(0, Math.min(style.length() - 1, DESC_LEN)));
		if (!span.getAttributes().isEmpty()) {
			final String attr = span.getAttributes().get(span.getAttributes().size() - 1).getName(); // last element
			b.append(',');
			b.append(attr.substring(0, Math.min(attr.length() - 1, DESC_LEN)));
		}
		return b.toString();
	}
	
	/*
	 * --- Local exceptions ---
	 */

	@SuppressWarnings("serial")
	static class ConflictingFormatsException extends RuntimeException {
		int pos;

		ConflictingFormatsException(String msg, int pos) {
			super(msg);
			this.pos = pos;
		}
	}

	@SuppressWarnings("serial")
	static class PrematureEOFException extends RuntimeException {
	}

}
