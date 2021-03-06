/*
 * generated by Xtext 2.25.0.M1
 */
package com.mimacom.ddd.pub.pub.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.pub.pub.parser.antlr.internal.InternalPubParser;
import com.mimacom.ddd.pub.pub.services.PubGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PubParser extends AbstractAntlrParser {

	@Inject
	private PubGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPubParser createParser(XtextTokenStream stream) {
		return new InternalPubParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PubModel";
	}

	public PubGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PubGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
