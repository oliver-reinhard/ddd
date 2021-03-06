/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.esm.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.esm.parser.antlr.internal.InternalEsmParser;
import com.mimacom.ddd.dm.esm.services.EsmGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EsmParser extends AbstractAntlrParser {

	@Inject
	private EsmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEsmParser createParser(XtextTokenStream stream) {
		return new InternalEsmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DNamespace";
	}

	public EsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
