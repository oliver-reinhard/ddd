package com.mimacom.ddd.dm.base.richText;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.IRichTextSegment;

/**
 * This module has been written in Java because Xtend has problems with
 * character comparison. Seriously.
 *
 */
public class RichTextUtil {

	public boolean isEmpty(DRichText rt) {
		if (rt != null) {
			for (IRichTextSegment seg : rt.getSegments()) {
				if (seg instanceof DExpression) {
					return false;
				} else if (seg instanceof DTextSegment) {
					if (! ((DTextSegment) seg).getValue().trim().isEmpty()) {
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
	 * Replace characters reserved by LaTeX language by their "escaped" counterparts.
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
				break;
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
