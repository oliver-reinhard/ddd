/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.asm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AsmAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mimacom/ddd/sm/asm/parser/antlr/internal/InternalAsm.tokens");
	}
}
