/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dom.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DomAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mimacom/ddd/dm/dom/parser/antlr/internal/InternalDom.tokens");
	}
}
