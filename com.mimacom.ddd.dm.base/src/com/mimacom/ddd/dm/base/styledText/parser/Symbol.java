package com.mimacom.ddd.dm.base.styledText.parser;

import java.util.HashMap;

import com.google.common.collect.Maps;

public enum Symbol {
	
	/* Length = 1 */
	EXPRESSION_START("["), EXPRESSION_END("]"),

	/* Length = 2 */
	EMPHASIS("**"), STRONG("++"), KEYWORD("##"), MONOSPACE_START("{{"), MONOSPACE_END("}}"), UNDERLINE("__"),
	STRIKETHROUGH("--"), SUPERSCRIPT("^^"), SUBSCRIPT("°°"), STATIC_REFERENCE_START("[["), STATIC_REFERENCE_END("]]"),

	/* Length = 0 (special value) */
	TEXT, // text = everything else than the above tokens
	EOF;

	private String literal;
	private int length;
	private char first;

	Symbol(String literal) {
		if (literal == null)
			throw new NullPointerException("literal");
		this.literal = literal;
		this.length = literal.length();
		this.first = literal.isEmpty() ? '\0' : literal.toCharArray()[0];
	}

	Symbol() {
		this("");
	}

	public int getLength() {
		return length;
	}

	public String getLiteral() {
		return literal;
	}

	public boolean matches(String candidate) {
		return literal.equals(candidate);
	}

	public boolean startsWith(char c) {
		return first == c;
	}

	private static HashMap<Integer, Symbol[]> symbolsByLength;

	private static Symbol[] lookupCandidates(int symbolLength) {
		if (symbolsByLength == null) {
			final HashMap<Integer, Integer> symbolCountByLength = Maps.newHashMap();
			for (Symbol s : values()) {
				if (s.length > 0) {
					final Integer count = symbolCountByLength.get(s.length);
					symbolCountByLength.put(s.length, count == null ? 1 : count + 1);
				}
			}
			symbolsByLength = Maps.newHashMap();
			for (Integer length : symbolCountByLength.keySet()) {
				final int count = symbolCountByLength.get(length);
				final Symbol[] symbols = new Symbol[count];
				symbolsByLength.put(length, symbols);
			}
			for (Symbol s : values()) {
				if (s.length > 0) {
					final Symbol[] symbols = symbolsByLength.get(s.length);
					for (int i = 0; i < symbols.length; i++) {
						if (symbols[i] == null) {
							symbols[i] = s;
							break;
						}
					}
				}
			}
		}
		return symbolsByLength.get(symbolLength);
	}

	/**
	 * Tries to match the given candidate String.
	 * 
	 * @param candidate cannot be <code>null</code> or empty.
	 * @return the matching token or {@code null} if no match was found
	 */
	static public Symbol match(String candidate) {
		if (candidate == null || candidate.isEmpty())
			throw new IllegalArgumentException(candidate == null ? "null" : "empty");
		final Symbol[] symbols = lookupCandidates(candidate.length());
		if (symbols != null) {
			for (int i = 0; i < symbols.length; i++) {
				if (symbols[i].matches(candidate)) {
					return symbols[i];
				}
			}
		}
		return null;
	}

	static public boolean isTokenStartCharacter(char c) {
		for (Symbol s : values()) {
			if (s.getLength() > 0 && s.startsWith(c))
				return true;
		}
		return false;
	}
}