package com.mimacom.ddd.dm.base.styledText;

import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.EMPHASIS;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.KEYWORD;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.MONOSPACE_END;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.MONOSPACE_START;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.STRONG;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.SUBSCRIPT;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.SUPERSCRIPT;
import static com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token.UNDERLINE;

import com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token;

public class StyledTextUtil {

	public String emphasis(String s) {
		return surround(s, EMPHASIS);
	}

	public String strong(String s) {
		return surround(s, STRONG);
	}
	
	public String keyword(String s) {
		return surround(s, KEYWORD);
	}

	public String monospace(String s) {
		return MONOSPACE_START.getLiteral() + s + MONOSPACE_END.getLiteral();
	}

	public String underline(String s) {
		return surround(s, UNDERLINE);
	}

	public String superscript(String s) {
		return surround(s, SUPERSCRIPT);
	}

	public String subscript(String s) {
		return surround(s, SUBSCRIPT);
	}
	
	protected String surround(String s, Token t) {
		final String f = t.getLiteral();
		return f + s + f;
	}
}
