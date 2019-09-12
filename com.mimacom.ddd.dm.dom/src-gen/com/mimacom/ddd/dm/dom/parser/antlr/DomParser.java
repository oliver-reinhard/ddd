/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.dom.parser.antlr.internal.InternalDomParser;
import com.mimacom.ddd.dm.dom.services.DomGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DomParser extends AbstractAntlrParser {

	@Inject
	private DomGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDomParser createParser(XtextTokenStream stream) {
		return new InternalDomParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DomModel";
	}

	public DomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
