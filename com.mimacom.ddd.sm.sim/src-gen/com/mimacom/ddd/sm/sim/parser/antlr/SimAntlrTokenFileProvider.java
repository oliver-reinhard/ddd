/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mimacom/ddd/sm/sim/parser/antlr/internal/InternalSim.tokens");
	}
}
