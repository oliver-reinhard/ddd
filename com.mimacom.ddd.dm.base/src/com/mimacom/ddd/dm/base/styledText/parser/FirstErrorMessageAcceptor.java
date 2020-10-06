package com.mimacom.ddd.dm.base.styledText.parser;

/**
 * Captures exactly one error -- the first one.
 */
public class FirstErrorMessageAcceptor implements ErrorMessageAcceptor {

	String firstError;
	
	@Override
	public void acceptError(String message, int offset, int length) {
		if (firstError == null) firstError = message + " at position " + offset;
	}
	
	public boolean hasError() {
		return firstError != null;
	}
	
	public String getFirstError() {
		return firstError;
	}

}
