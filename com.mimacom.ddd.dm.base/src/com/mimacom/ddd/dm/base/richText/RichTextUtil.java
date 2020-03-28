package com.mimacom.ddd.dm.base.richText;

import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.parser.FirstErrorMessageAcceptor;
import com.mimacom.ddd.dm.styledText.parser.StyledTextParser;

/**
 * This module has been written in Java because Xtend has problems with
 * character comparison. Seriously.
 *
 */
public class RichTextUtil {

	protected static BaseFactory BASE = BaseFactory.eINSTANCE;

	public static final DRichText EMPTY_TEXT = BASE.createDRichText();
	{
		final DTextSegment s = BASE.createDTextSegment();
		s.setValue("");
		EMPTY_TEXT.getSegments().add(s);
	}

	public DRichText toRichText(String text) {
		final DRichText t = BASE.createDRichText();
		final DTextSegment s = BASE.createDTextSegment();
		s.setValue(text);
		t.getSegments().add(s);
		return t;
	}

	/**
	 * Parses a formatted string and throws an exception if the parsing has errors.
	 * @param formattedString cannot be {@code null}.
	 * @return
	 * @throws IllegalArgumentException
	 */
	public DStyledTextSpan parse(String formattedString) throws IllegalArgumentException {
		final FirstErrorMessageAcceptor acceptor = new FirstErrorMessageAcceptor();
		final StyledTextParser parser = new StyledTextParser(formattedString, acceptor);
		final DStyledTextSpan span = parser.parse();
		if (acceptor.hasError()) {
			throw new IllegalArgumentException(acceptor.getFirstError());
		}
		return span;
	}

	public boolean isEmpty(DRichText rt) {
		if (rt != null) {
			for (IRichTextSegment seg : rt.getSegments()) {
				if (seg instanceof DExpression) {
					return false;
				} else if (seg instanceof DTextSegment) {
					if (!((DTextSegment) seg).getValue().trim().isEmpty()) {
						return false;
					}
				}
			}
		}
		return true;
	};

//	/**
//	 * @param rt can be {@code null}.
//	 * @return {@code null} if input is {@code null}
//	 */
//	public DRichText escapeLaTeX(DRichText rt) {
//		if (rt == null || isEmpty(rt)) {
//			return rt;
//		}
//		
//	}

	/**
	 * Replace characters reserved by LaTeX language by their "escaped"
	 * counterparts.
	 * 
	 * @param plainText can be {@code null}.
	 * @return {@code null} if input is {@code null}
	 */
	public String escapeLaTeX(String plainText) {
		if (plainText == null || plainText.isEmpty()) {
			return plainText;
		}
		final char[] source = plainText.toCharArray();
		final StringBuilder b = new StringBuilder();
		for (int i = 0; i < source.length; i++) {
			final char c = source[i];
			switch (c) {
			case '\\':
				b.append("\\textbackslash");
				break;
			case '#':
				b.append("\\#");
				break;
			case '$':
				b.append("\\$");
				break;
			case '£':
				b.append("\\pounds");
				break;
			case '€':
				b.append("\\euro");
				break;
			case '%':
				b.append("\\%");
				break;
			case '&':
				b.append("\\&");
				break;
			case '{':
				b.append("\\{");
				break;
			case '}':
				b.append("\\}");
				break;
			case '«':
				b.append("\\guillemotleft");
				break;
			case '»':
				b.append("\\guillemotright");
				break;
			case '_':
				b.append("\\_");
				break;
			case '§':
				b.append("\\S");
				break;
			case '~':
				b.append("\\~{}");
				break;
			case '^':
				b.append("\\^{}");
			case '|':
				b.append("\\textbar");
				break;
			case '\n':
				b.append(" \\\\ ");
				break;
			default:
				b.append(c);
			}
		}
		return b.toString();
	}

	/**
	 * Replace characters reserved by HTML language by their "escaped" counterparts.
	 * 
	 * @param plainText can be {@code null}.
	 * @return {@code null} if input is {@code null}
	 */
	public String escapeHtml(String plainText) {
		if (plainText == null || plainText.isEmpty()) {
			return plainText;
		}
		final char[] source = plainText.toCharArray();
		final StringBuilder b = new StringBuilder();
		for (int i = 0; i < source.length; i++) {
			final char c = source[i];
			switch (c) {
			case '<':
				b.append("&lt;");
				break;
			case '>':
				b.append("&gt;");
				break;
			case '\"':
				b.append("&quot;");
				break;
			case '\'':
				b.append("&apos;");
				break;
			case '\n':
				b.append("<br>");
				break;
			default:
				b.append(c);
			}
		}
		return b.toString();
	}
}
