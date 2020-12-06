package com.mimacom.ddd.dm.base.styledText;

import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.EMPHASIS;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.KEYWORD;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.MONOSPACE_END;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.MONOSPACE_START;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.STRONG;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.SUBSCRIPT;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.SUPERSCRIPT;
import static com.mimacom.ddd.dm.base.styledText.parser.Symbol.UNDERLINE;

import com.mimacom.ddd.dm.base.styledText.parser.Symbol;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextTokenizer;

public class StyledTextUtil {

	public String emphasis(String s) {
		return surroundWith(s, EMPHASIS);
	}

	public String strong(String s) {
		return surroundWith(s, STRONG);
	}
	
	public String keyword(String s) {
		return surroundWith(s, KEYWORD);
	}

	public String monospace(String s) {
		final StringBuilder b = new StringBuilder(MONOSPACE_START.getLiteral());
		b.append(s);
		b.append(MONOSPACE_END.getLiteral());
		return b.toString();
	}

	public String underline(String s) {
		return surroundWith(s, UNDERLINE);
	}

	public String superscript(String s) {
		return surroundWith(s, SUPERSCRIPT);
	}

	public String subscript(String s) {
		return surroundWith(s, SUBSCRIPT);
	}
	
	protected String surroundWith(String s, Symbol t) {
		final StringBuilder b = new StringBuilder(t.getLiteral());
		b.append(s);
		b.append(t.getLiteral());
		return b.toString();
	}
	
	public String escapeStyledText(String styledText) {
		final StringBuilder b = new StringBuilder();
		final char[] source = styledText.toCharArray();
		int index = 0;
		while (index < source.length) {
			if (source[index] == StyledTextTokenizer.ESCAPE_CHAR) {
				b.append(StyledTextTokenizer.ESCAPE_CHAR);
			} else if (matchKeywords(source, index, 2)) {
				b.append(StyledTextTokenizer.ESCAPE_CHAR);
				b.append(source[index++]);
			} else if(matchKeywords(source, index, 1)) {
				b.append(StyledTextTokenizer.ESCAPE_CHAR);
			}
			b.append(source[index++]);
		}
		return b.toString();
	}
	
	/**
	 * Precondition: index < source.length
	 */
	protected Boolean matchKeywords(char[] source, int index, int len) {
		final String s = new String(source, index, Math.min(len, source.length - index));
		final Symbol t = Symbol.match(s);
		return t != null;
	}
}
