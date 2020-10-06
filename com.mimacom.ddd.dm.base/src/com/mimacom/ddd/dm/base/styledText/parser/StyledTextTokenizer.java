package com.mimacom.ddd.dm.base.styledText.parser;

public class StyledTextTokenizer {

	public enum Token {
		// NOTE: Tokens must be ordered by text length!
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

		Token(String literal) {
			if (literal == null)
				throw new NullPointerException("literal");
			this.literal = literal;
			this.length = literal.length();
		}

		Token() {
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
			return literal.toCharArray()[0] == c;
		}

		/**
		 * Tries to match the given candidate String.
		 * 
		 * @param candidate cannot be <code>null</code>
		 * @return the matching token or {@link Token#EOF} if no match was found
		 */
		static public Token match(String candidate) {
			if (candidate == null)
				throw new NullPointerException("candidate");
			final int length = candidate.length();
			for (Token t : values()) {
				if (t.getLength() > length)
					return Token.EOF;
				if (t.matches(candidate))
					return t;
			}
			return Token.EOF;
		}

		static public boolean isTokenStartCharacter(char c) {
			for (Token t : values()) {
				if (t.getLength() > 0 && t.startsWith(c))
					return true;
			}
			return false;
		}
	}

	/**
	 * Text to tokenize.
	 */
	final protected char[] text;
	final protected int startIndex;
	final protected int endIndex;

	/**
	 * Always points to the character to be read next.
	 */
	protected int index;
	protected Token lastToken;
	protected int lastTokenStartIndex;

	/**
	 * @param styledText cannot be <code>null</code>
	 * @param startIndex points to the first character of text to scan
	 * @param endIndex   points to the last character of text to scan
	 * @return null if no format has been detected
	 */
	public StyledTextTokenizer(char[] styledText, int startIndex, int endIndex) {
		if (styledText == null)
			throw new NullPointerException("markedText");
		text = styledText;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		reset();
	}

	/**
	 * @param styledText cannot be <code>null</code>
	 */
	public StyledTextTokenizer(String styledText) {
		this(styledText.toCharArray(), 0, styledText.length() - 1);
	}

	public void reset() {
		index = startIndex;
		lastToken = Token.EOF;
		lastTokenStartIndex = index;
	}

	/**
	 * @return <code>{@link #endIndex} + 1</code> if all the characters of the
	 *         markedText have been consumed.
	 */
	public int getIndex() {
		return index;
	}

	public Token getLastToken() {
		return lastToken;
	}

	public int getLastTokenStartIndex() {
		return lastTokenStartIndex;
	}

	/**
	 * When this method returns, the <code>pos</code> index points to the first
	 * character after the successfully parsed token.
	 * <p>
	 * When this method returns {@link Token#TEXT}, then the corresponding
	 * characters can be retrieved via {@link #getText()}.
	 * 
	 * @return the next token or {@link Token#EOF} if there were no characters left
	 *         to be consumed.
	 */
	public Token readNext() {
		lastToken = Token.EOF;
		lastTokenStartIndex = index;

		if (index > endIndex) {
			return Token.EOF;
		}
		
		// try to match symbols with two characters first:
		if (index+1 <= endIndex) {
			final String s2 = new String(text, lastTokenStartIndex, 2);
			final Token t2 = Token.match(s2);
			if (t2 != Token.EOF) {
				index += 2;
				return t2;
			}
		}
		
		// match first character:
		final String s1 = new String(text, lastTokenStartIndex, 1);
		final Token t1 = Token.match(s1);
		if (t1 != Token.EOF) {
			index++;
			return t1;
		}

		// It's not a special symbol => return text up to next symbol or up to EOF:
		lastToken = Token.TEXT;
		index++; // ensure we advance by at least one character
		while (index <= endIndex) {
			final char c = text[index];
			if (Token.isTokenStartCharacter(c)) {
				break;
			}
			index++;
		}
		return lastToken;
	}

	/**
	 * Like {@link #readNext()} but does not consume the the token, i.e. the {@link #index} is not advanced.
	 * 
	 * @return the next token or {@link Token#EOF} if there were no characters left
	 *         to be consumed.
	 */
	public Token peekNext() {
		Token t = readNext();
		index = lastTokenStartIndex;
		return t;
	}

	/**
	 * @return the text of the previously consumed {@link Token#TEXT} token, or
	 *         <code>null</code> if the previous token wasn't {@link Token#TEXT}.
	 */
	public String getText() {
		if (lastToken == Token.TEXT) {
			final String s = new String(text, lastTokenStartIndex, index - lastTokenStartIndex);
			return s;
		}
		return null;
	}

	/**
	 * Consumes all the characters up to (but not including) those of the given
	 * delimiter token. Skips all tokens it encounters up to (but not including) the
	 * given delimiter token.
	 *
	 * @param delimiter
	 * @return {@link Token#TEXT} if at least one character was consumed (even if
	 *         the given delimiter was not encountered), or else returns
	 *         {@link Token#EOF}
	 */
	public Token skipToNext(Token delimiter) {
		lastToken = Token.EOF;
		lastTokenStartIndex = index;
		if (index > endIndex) {
			return lastToken;
		}

		// find delimiter token:
		final int len = delimiter.getLength();
		final int lookahead = len - 1;
		int i = index;
		while (i + lookahead <= endIndex) {
			final String s = new String(text, i, len);
			final Token t = Token.match(s);
			if (t == delimiter) {
				index = i;
				if (index >= lastTokenStartIndex)
					lastToken = Token.TEXT;
				return lastToken;
			}
			i++;
		}
		index = endIndex + 1;
		lastToken = Token.TEXT;
		return lastToken;
	}
}
