/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.parser.antlr;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.asm.parser.antlr.internal.InternalAsmParser;
import com.mimacom.ddd.sm.asm.services.AsmGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AsmParser extends AbstractAntlrParser {

	@Inject
	private AsmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAsmParser createParser(XtextTokenStream stream) {
		return new InternalAsmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
