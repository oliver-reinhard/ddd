/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dim.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DimAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mimacom/ddd/dm/dim/parser/antlr/internal/InternalDim.tokens");
	}
}
