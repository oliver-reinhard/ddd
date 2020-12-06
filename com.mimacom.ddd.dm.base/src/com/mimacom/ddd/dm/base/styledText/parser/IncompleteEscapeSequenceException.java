package com.mimacom.ddd.dm.base.styledText.parser;

@SuppressWarnings("serial")
public class IncompleteEscapeSequenceException extends Exception {
	
	private final int FRAGMENT_LENGTH = 20;

	final String sourceFragment;
	public IncompleteEscapeSequenceException(char[] source, int startIndex, int endIndex) {
		final int len = endIndex - startIndex + 1;
		if (len <= FRAGMENT_LENGTH) {
			sourceFragment = new String(source, startIndex, len);
		} else {
			sourceFragment = ".." + new String(source, startIndex + len - FRAGMENT_LENGTH, FRAGMENT_LENGTH);
		}
	}
	
	@Override
	public String getMessage() {
		return "Parsed text ends in dangling escape character: \"" + sourceFragment + "\"";
	}
}
