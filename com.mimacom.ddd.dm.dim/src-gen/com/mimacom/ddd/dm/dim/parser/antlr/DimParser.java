/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dim.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.dim.parser.antlr.internal.InternalDimParser;
import com.mimacom.ddd.dm.dim.services.DimGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DimParser extends AbstractAntlrParser {

	@Inject
	private DimGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDimParser createParser(XtextTokenStream stream) {
		return new InternalDimParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DNamespace";
	}

	public DimGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DimGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
