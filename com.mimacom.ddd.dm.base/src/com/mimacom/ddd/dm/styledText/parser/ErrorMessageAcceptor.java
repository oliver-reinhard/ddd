package com.mimacom.ddd.dm.styledText.parser;

public interface ErrorMessageAcceptor {
	
	void acceptError(String message, int offset, int length);
	
}
