/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sim.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.parser.antlr.internal.InternalSimParser;
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SimParser extends AbstractAntlrParser {

	@Inject
	private SimGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSimParser createParser(XtextTokenStream stream) {
		return new InternalSimParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DNamespace";
	}

	public SimGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
