package com.mimacom.ddd.dm.base.styledText.parser;

public class StyledTextTokenizer {

	public static final char ESCAPE_CHAR = '\\';

	/**
	 * Text to tokenize.
	 */
	final protected char[] source;
	final protected int startIndex; // index to source
	final protected int endIndex; // index to source

	/**
	 * Always points to the character to be read next.
	 */
	protected int index;
	protected Symbol lastSymbol;
	protected int lastSymbolStartIndex;
	protected StringBuilder text = null;

	/**
	 * @param styledText cannot be <code>null</code>
	 * @param startIndex points to the first character of text to scan
	 * @param endIndex   points to the last character of text to scan
	 * @return {@code null} if no format has been detected
	 */
	public StyledTextTokenizer(char[] styledText, int startIndex, int endIndex) {
		if (styledText == null)
			throw new NullPointerException("markedText");
		source = styledText;
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
		lastSymbol = Symbol.EOF;
		lastSymbolStartIndex = index;
		text = null;
	}

	/**
	 * @return <code>{@link #endIndex} + 1</code> if all the characters of the
	 *         markedText have been consumed.
	 */
	public int getIndex() {
		return index;
	}

	public Symbol getLastSymbol() {
		return lastSymbol;
	}

	/**
	 * @return the text of the previously consumed {@link Symbol#TEXT} token (text may be empty (""), or
	 *         <code>null</code> if the previous token wasn't {@link Symbol#TEXT}.
	 */
	public String getText() {
		if (lastSymbol == Symbol.TEXT) {
			return text != null ? text.toString() : "";
		}
		return null;
	}

	public int getLastSymbolStartIndex() {
		return lastSymbolStartIndex;
	}

	void consumeCharacter() {
		if (text == null) {
			text = new StringBuilder();
		}
		if (index <= endIndex) {
			text.append(source[index]);
			index++;
		}
	}

	void consumeEscapeCharacter() throws IncompleteEscapeSequenceException {
		index++; // skip ESCAPE_CHAR
		if (index > endIndex) {
			throw new IncompleteEscapeSequenceException(source, startIndex, endIndex);
		}
	}

	/**
	 * When this method returns, the <code>pos</code> index points to the first
	 * character after the successfully parsed symbol.
	 * <p>
	 * When this method returns {@link Symbol#TEXT}, then the corresponding
	 * characters can be retrieved via {@link #getText()}.
	 * 
	 * @return the next symbol or {@link Symbol#EOF} if there were no characters left
	 *         to be consumed.
	 * @throws IncompleteEscapeSequenceException if source text ends with ESCAPE_CHAR
	 */
	public Symbol readNext() throws IncompleteEscapeSequenceException {
		lastSymbol = Symbol.EOF;
		lastSymbolStartIndex = index;
		text = null;

		if (index > endIndex) {
			return Symbol.EOF;
		}

		// try to match symbols with length=2 characters first:
		if (index < endIndex) {
			final int len = 2;
			final String s = new String(source, lastSymbolStartIndex, len);
			final Symbol symbol = Symbol.match(s);
			if (symbol != null) {
				index += len;
				return symbol;
			}
		}

		// match symbols with length=1 character:
		final int len = 1;
		final char c1 = source[index];
		if (c1 == ESCAPE_CHAR) {
			consumeEscapeCharacter();
		} else {
			final Symbol symbol = Symbol.match(Character.toString(c1));
			if (symbol != null) {
				index += len;
				return symbol;
			}
		}
		lastSymbol = Symbol.TEXT;
		consumeCharacter(); // at least 1 character is always consumed
		while (index <= endIndex) {
			final char c = source[index];
			if (c == ESCAPE_CHAR) {
				consumeEscapeCharacter();
			} else if (Symbol.isTokenStartCharacter(c)) {
				break;
			}
			consumeCharacter();
		}
		return lastSymbol;
	}

	/**
	 * Consumes all the characters up to (but not including) those of the given
	 * delimiter symbol. Skips all symbols it encounters up to (but not including) the
	 * given delimiter symbol and consumes them as {@link Symbol#TEXT}.
	 *
	 * @param delimiter cannot be {@code null}, {@link Symbol#TEXT} or
	 *                  {@link Symbol#EOF}
	 * @return {@link Symbol#TEXT} only if the given delimiter was encountered (actual text may be empty, however)
	 * @throws IncompleteEscapeSequenceException if source text ends with ESCAPE_CHAR
	 */
	public Symbol skipToNext(Symbol delimiter) throws IncompleteEscapeSequenceException {
		if (delimiter == null || delimiter == Symbol.TEXT || delimiter == Symbol.EOF) {
			throw new IllegalArgumentException(delimiter == null ? "null" : delimiter.toString());
		}
		lastSymbol = Symbol.EOF;
		lastSymbolStartIndex = index;
		text = null;
		if (index > endIndex) {
			return Symbol.EOF;
		}

		// find delimiter token:
		final int len = delimiter.getLength();
		while (index <= endIndex) {
			if (source[index] == ESCAPE_CHAR) {
				consumeEscapeCharacter();
			} else {
				final String s = new String(source, index, Math.min(len, endIndex - index + 1));
				if (delimiter.matches(s)) {
					lastSymbol = Symbol.TEXT;
					break;
				}
			}
			consumeCharacter();
		}
		return lastSymbol;
	}

	/**
	 * Like {@link #readNext()} but does not consume the the token, i.e. the
	 * {@link #index} is not advanced.
	 * 
	 * @return the next token or {@link Symbol#EOF} if there were no characters left
	 *         to be consumed.
	 * @throws IncompleteEscapeSequenceException if source text ends with ESCAPE_CHAR
	 */
	public Symbol peekNext() throws IncompleteEscapeSequenceException {
		Symbol s = readNext();
		index = lastSymbolStartIndex;
		return s;
	}
}
