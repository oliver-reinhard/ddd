package com.mimacom.ddd.dm.base.styledText.parser;

public interface ErrorMessageAcceptor {
	
	void acceptError(String message, int offset, int length);
	
}
