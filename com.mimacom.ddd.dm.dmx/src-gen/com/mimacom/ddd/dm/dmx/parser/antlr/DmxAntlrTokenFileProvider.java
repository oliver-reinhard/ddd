/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dmx.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DmxAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mimacom/ddd/dm/dmx/parser/antlr/internal/InternalDmx.tokens");
	}
}
