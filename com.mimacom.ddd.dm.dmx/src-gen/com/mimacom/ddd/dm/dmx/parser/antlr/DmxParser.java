/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dmx.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.dmx.parser.antlr.internal.InternalDmxParser;
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DmxParser extends AbstractAntlrParser {

	@Inject
	private DmxGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDmxParser createParser(XtextTokenStream stream) {
		return new InternalDmxParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DNamespace";
	}

	public DmxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DmxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
