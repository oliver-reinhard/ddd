package com.mimacom.ddd.dm.base.styledText.parser;

public class SystemErrorErrorMessageAcceptor implements ErrorMessageAcceptor {

	@Override
	public void acceptError(String message, int offset, int length) {
		System.err.println(message + " at position " + offset);
	}

}
