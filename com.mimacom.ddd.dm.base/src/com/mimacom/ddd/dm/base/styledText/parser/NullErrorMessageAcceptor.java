package com.mimacom.ddd.dm.base.styledText.parser;

public class NullErrorMessageAcceptor implements ErrorMessageAcceptor {

	@Override
	public void acceptError(String message, int offset, int length) {
		// do nothing
	}

}
