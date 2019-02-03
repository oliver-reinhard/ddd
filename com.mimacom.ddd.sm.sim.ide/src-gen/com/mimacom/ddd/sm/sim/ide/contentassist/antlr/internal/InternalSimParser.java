package com.mimacom.ddd.sm.sim.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.mimacom.ddd.sm.sim.services.SimGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'aggregate'", "'realizes'", "'realises'", "'reference'", "'composite'", "'attribute'", "'*'", "'domain'", "'import'", "'as'", "'extends'", "'='", "'and'", "':'", "'{'", "'}'", "'grab'", "'constraint'", "'primitive'", "'redefines'", "'archetype'", "'enumeration'", "'ditch'", "','", "'root'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'abstract'", "'derived'", "'key'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSimParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSim.g"; }


    	private SimGrammarAccess grammarAccess;

    	public void setGrammarAccess(SimGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSDomain"
    // InternalSim.g:53:1: entryRuleSDomain : ruleSDomain EOF ;
    public final void entryRuleSDomain() throws RecognitionException {
        try {
            // InternalSim.g:54:1: ( ruleSDomain EOF )
            // InternalSim.g:55:1: ruleSDomain EOF
            {
             before(grammarAccess.getSDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleSDomain();

            state._fsp--;

             after(grammarAccess.getSDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDomain"


    // $ANTLR start "ruleSDomain"
    // InternalSim.g:62:1: ruleSDomain : ( ( rule__SDomain__Group__0 ) ) ;
    public final void ruleSDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:66:2: ( ( ( rule__SDomain__Group__0 ) ) )
            // InternalSim.g:67:2: ( ( rule__SDomain__Group__0 ) )
            {
            // InternalSim.g:67:2: ( ( rule__SDomain__Group__0 ) )
            // InternalSim.g:68:3: ( rule__SDomain__Group__0 )
            {
             before(grammarAccess.getSDomainAccess().getGroup()); 
            // InternalSim.g:69:3: ( rule__SDomain__Group__0 )
            // InternalSim.g:69:4: rule__SDomain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDomain"


    // $ANTLR start "entryRuleSImport"
    // InternalSim.g:78:1: entryRuleSImport : ruleSImport EOF ;
    public final void entryRuleSImport() throws RecognitionException {
        try {
            // InternalSim.g:79:1: ( ruleSImport EOF )
            // InternalSim.g:80:1: ruleSImport EOF
            {
             before(grammarAccess.getSImportRule()); 
            pushFollow(FOLLOW_1);
            ruleSImport();

            state._fsp--;

             after(grammarAccess.getSImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSImport"


    // $ANTLR start "ruleSImport"
    // InternalSim.g:87:1: ruleSImport : ( ( rule__SImport__Group__0 ) ) ;
    public final void ruleSImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:91:2: ( ( ( rule__SImport__Group__0 ) ) )
            // InternalSim.g:92:2: ( ( rule__SImport__Group__0 ) )
            {
            // InternalSim.g:92:2: ( ( rule__SImport__Group__0 ) )
            // InternalSim.g:93:3: ( rule__SImport__Group__0 )
            {
             before(grammarAccess.getSImportAccess().getGroup()); 
            // InternalSim.g:94:3: ( rule__SImport__Group__0 )
            // InternalSim.g:94:4: rule__SImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSImport"


    // $ANTLR start "entryRuleSGrabAggregateRule"
    // InternalSim.g:103:1: entryRuleSGrabAggregateRule : ruleSGrabAggregateRule EOF ;
    public final void entryRuleSGrabAggregateRule() throws RecognitionException {
        try {
            // InternalSim.g:104:1: ( ruleSGrabAggregateRule EOF )
            // InternalSim.g:105:1: ruleSGrabAggregateRule EOF
            {
             before(grammarAccess.getSGrabAggregateRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabAggregateRule();

            state._fsp--;

             after(grammarAccess.getSGrabAggregateRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGrabAggregateRule"


    // $ANTLR start "ruleSGrabAggregateRule"
    // InternalSim.g:112:1: ruleSGrabAggregateRule : ( ( rule__SGrabAggregateRule__SourceAssignment ) ) ;
    public final void ruleSGrabAggregateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:116:2: ( ( ( rule__SGrabAggregateRule__SourceAssignment ) ) )
            // InternalSim.g:117:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            {
            // InternalSim.g:117:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            // InternalSim.g:118:3: ( rule__SGrabAggregateRule__SourceAssignment )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceAssignment()); 
            // InternalSim.g:119:3: ( rule__SGrabAggregateRule__SourceAssignment )
            // InternalSim.g:119:4: rule__SGrabAggregateRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SGrabAggregateRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSGrabAggregateRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabAggregateRule"


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSim.g:128:1: entryRuleSGrabEnumerationRule : ruleSGrabEnumerationRule EOF ;
    public final void entryRuleSGrabEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:129:1: ( ruleSGrabEnumerationRule EOF )
            // InternalSim.g:130:1: ruleSGrabEnumerationRule EOF
            {
             before(grammarAccess.getSGrabEnumerationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabEnumerationRule();

            state._fsp--;

             after(grammarAccess.getSGrabEnumerationRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGrabEnumerationRule"


    // $ANTLR start "ruleSGrabEnumerationRule"
    // InternalSim.g:137:1: ruleSGrabEnumerationRule : ( ( rule__SGrabEnumerationRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:141:2: ( ( ( rule__SGrabEnumerationRule__Group__0 ) ) )
            // InternalSim.g:142:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            {
            // InternalSim.g:142:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            // InternalSim.g:143:3: ( rule__SGrabEnumerationRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup()); 
            // InternalSim.g:144:3: ( rule__SGrabEnumerationRule__Group__0 )
            // InternalSim.g:144:4: rule__SGrabEnumerationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabEnumerationRule"


    // $ANTLR start "entryRuleSDitchEnumerationRule"
    // InternalSim.g:153:1: entryRuleSDitchEnumerationRule : ruleSDitchEnumerationRule EOF ;
    public final void entryRuleSDitchEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:154:1: ( ruleSDitchEnumerationRule EOF )
            // InternalSim.g:155:1: ruleSDitchEnumerationRule EOF
            {
             before(grammarAccess.getSDitchEnumerationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSDitchEnumerationRule();

            state._fsp--;

             after(grammarAccess.getSDitchEnumerationRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDitchEnumerationRule"


    // $ANTLR start "ruleSDitchEnumerationRule"
    // InternalSim.g:162:1: ruleSDitchEnumerationRule : ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:166:2: ( ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) )
            // InternalSim.g:167:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            {
            // InternalSim.g:167:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            // InternalSim.g:168:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceAssignment()); 
            // InternalSim.g:169:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            // InternalSim.g:169:4: rule__SDitchEnumerationRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SDitchEnumerationRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSDitchEnumerationRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDitchEnumerationRule"


    // $ANTLR start "entryRuleSGrabEnumerationLiteralRule"
    // InternalSim.g:178:1: entryRuleSGrabEnumerationLiteralRule : ruleSGrabEnumerationLiteralRule EOF ;
    public final void entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:179:1: ( ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:180:1: ruleSGrabEnumerationLiteralRule EOF
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSGrabEnumerationLiteralRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGrabEnumerationLiteralRule"


    // $ANTLR start "ruleSGrabEnumerationLiteralRule"
    // InternalSim.g:187:1: ruleSGrabEnumerationLiteralRule : ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:191:2: ( ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) )
            // InternalSim.g:192:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            {
            // InternalSim.g:192:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            // InternalSim.g:193:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup()); 
            // InternalSim.g:194:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            // InternalSim.g:194:4: rule__SGrabEnumerationLiteralRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabEnumerationLiteralRule"


    // $ANTLR start "entryRuleSDitchEnumerationLiteralRule"
    // InternalSim.g:203:1: entryRuleSDitchEnumerationLiteralRule : ruleSDitchEnumerationLiteralRule EOF ;
    public final void entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:204:1: ( ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:205:1: ruleSDitchEnumerationLiteralRule EOF
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSDitchEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSDitchEnumerationLiteralRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDitchEnumerationLiteralRule"


    // $ANTLR start "ruleSDitchEnumerationLiteralRule"
    // InternalSim.g:212:1: ruleSDitchEnumerationLiteralRule : ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:216:2: ( ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) )
            // InternalSim.g:217:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            {
            // InternalSim.g:217:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            // InternalSim.g:218:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceAssignment()); 
            // InternalSim.g:219:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            // InternalSim.g:219:4: rule__SDitchEnumerationLiteralRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SDitchEnumerationLiteralRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDitchEnumerationLiteralRule"


    // $ANTLR start "entryRuleSGrabComplexTypeRule"
    // InternalSim.g:228:1: entryRuleSGrabComplexTypeRule : ruleSGrabComplexTypeRule EOF ;
    public final void entryRuleSGrabComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:229:1: ( ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:230:1: ruleSGrabComplexTypeRule EOF
            {
             before(grammarAccess.getSGrabComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSGrabComplexTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGrabComplexTypeRule"


    // $ANTLR start "ruleSGrabComplexTypeRule"
    // InternalSim.g:237:1: ruleSGrabComplexTypeRule : ( ( rule__SGrabComplexTypeRule__Group__0 ) ) ;
    public final void ruleSGrabComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:241:2: ( ( ( rule__SGrabComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:242:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:242:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            // InternalSim.g:243:3: ( rule__SGrabComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:244:3: ( rule__SGrabComplexTypeRule__Group__0 )
            // InternalSim.g:244:4: rule__SGrabComplexTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabComplexTypeRule"


    // $ANTLR start "entryRuleSDitchComplexTypeRule"
    // InternalSim.g:253:1: entryRuleSDitchComplexTypeRule : ruleSDitchComplexTypeRule EOF ;
    public final void entryRuleSDitchComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:254:1: ( ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:255:1: ruleSDitchComplexTypeRule EOF
            {
             before(grammarAccess.getSDitchComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSDitchComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDitchComplexTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDitchComplexTypeRule"


    // $ANTLR start "ruleSDitchComplexTypeRule"
    // InternalSim.g:262:1: ruleSDitchComplexTypeRule : ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) ;
    public final void ruleSDitchComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:266:2: ( ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) )
            // InternalSim.g:267:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            {
            // InternalSim.g:267:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            // InternalSim.g:268:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceAssignment()); 
            // InternalSim.g:269:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            // InternalSim.g:269:4: rule__SDitchComplexTypeRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SDitchComplexTypeRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDitchComplexTypeRule"


    // $ANTLR start "entryRuleSMorphComplexTypeRule"
    // InternalSim.g:278:1: entryRuleSMorphComplexTypeRule : ruleSMorphComplexTypeRule EOF ;
    public final void entryRuleSMorphComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:279:1: ( ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:280:1: ruleSMorphComplexTypeRule EOF
            {
             before(grammarAccess.getSMorphComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSMorphComplexTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSMorphComplexTypeRule"


    // $ANTLR start "ruleSMorphComplexTypeRule"
    // InternalSim.g:287:1: ruleSMorphComplexTypeRule : ( ( rule__SMorphComplexTypeRule__Group__0 ) ) ;
    public final void ruleSMorphComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:291:2: ( ( ( rule__SMorphComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:292:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:292:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            // InternalSim.g:293:3: ( rule__SMorphComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:294:3: ( rule__SMorphComplexTypeRule__Group__0 )
            // InternalSim.g:294:4: rule__SMorphComplexTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMorphComplexTypeRule"


    // $ANTLR start "entryRuleSFuseComplexTypeRule"
    // InternalSim.g:303:1: entryRuleSFuseComplexTypeRule : ruleSFuseComplexTypeRule EOF ;
    public final void entryRuleSFuseComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:304:1: ( ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:305:1: ruleSFuseComplexTypeRule EOF
            {
             before(grammarAccess.getSFuseComplexTypeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSFuseComplexTypeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSFuseComplexTypeRule"


    // $ANTLR start "ruleSFuseComplexTypeRule"
    // InternalSim.g:312:1: ruleSFuseComplexTypeRule : ( ( rule__SFuseComplexTypeRule__Group__0 ) ) ;
    public final void ruleSFuseComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:316:2: ( ( ( rule__SFuseComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:317:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:317:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            // InternalSim.g:318:3: ( rule__SFuseComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:319:3: ( rule__SFuseComplexTypeRule__Group__0 )
            // InternalSim.g:319:4: rule__SFuseComplexTypeRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSFuseComplexTypeRule"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:328:1: entryRuleSGrabFeatureRule : ruleSGrabFeatureRule EOF ;
    public final void entryRuleSGrabFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:329:1: ( ruleSGrabFeatureRule EOF )
            // InternalSim.g:330:1: ruleSGrabFeatureRule EOF
            {
             before(grammarAccess.getSGrabFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSGrabFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGrabFeatureRule"


    // $ANTLR start "ruleSGrabFeatureRule"
    // InternalSim.g:337:1: ruleSGrabFeatureRule : ( ( rule__SGrabFeatureRule__Group__0 ) ) ;
    public final void ruleSGrabFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:341:2: ( ( ( rule__SGrabFeatureRule__Group__0 ) ) )
            // InternalSim.g:342:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            {
            // InternalSim.g:342:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            // InternalSim.g:343:3: ( rule__SGrabFeatureRule__Group__0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 
            // InternalSim.g:344:3: ( rule__SGrabFeatureRule__Group__0 )
            // InternalSim.g:344:4: rule__SGrabFeatureRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabFeatureRule"


    // $ANTLR start "entryRuleSMorphFeatureRule"
    // InternalSim.g:353:1: entryRuleSMorphFeatureRule : ruleSMorphFeatureRule EOF ;
    public final void entryRuleSMorphFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:354:1: ( ruleSMorphFeatureRule EOF )
            // InternalSim.g:355:1: ruleSMorphFeatureRule EOF
            {
             before(grammarAccess.getSMorphFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSMorphFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSMorphFeatureRule"


    // $ANTLR start "ruleSMorphFeatureRule"
    // InternalSim.g:362:1: ruleSMorphFeatureRule : ( ( rule__SMorphFeatureRule__Group__0 ) ) ;
    public final void ruleSMorphFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:366:2: ( ( ( rule__SMorphFeatureRule__Group__0 ) ) )
            // InternalSim.g:367:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            {
            // InternalSim.g:367:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            // InternalSim.g:368:3: ( rule__SMorphFeatureRule__Group__0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 
            // InternalSim.g:369:3: ( rule__SMorphFeatureRule__Group__0 )
            // InternalSim.g:369:4: rule__SMorphFeatureRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMorphFeatureRule"


    // $ANTLR start "entryRuleSDitchFeatureRule"
    // InternalSim.g:378:1: entryRuleSDitchFeatureRule : ruleSDitchFeatureRule EOF ;
    public final void entryRuleSDitchFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:379:1: ( ruleSDitchFeatureRule EOF )
            // InternalSim.g:380:1: ruleSDitchFeatureRule EOF
            {
             before(grammarAccess.getSDitchFeatureRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSDitchFeatureRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDitchFeatureRule"


    // $ANTLR start "ruleSDitchFeatureRule"
    // InternalSim.g:387:1: ruleSDitchFeatureRule : ( ( rule__SDitchFeatureRule__SourceAssignment ) ) ;
    public final void ruleSDitchFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:391:2: ( ( ( rule__SDitchFeatureRule__SourceAssignment ) ) )
            // InternalSim.g:392:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            {
            // InternalSim.g:392:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            // InternalSim.g:393:3: ( rule__SDitchFeatureRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 
            // InternalSim.g:394:3: ( rule__SDitchFeatureRule__SourceAssignment )
            // InternalSim.g:394:4: rule__SDitchFeatureRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SDitchFeatureRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDitchFeatureRule"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSim.g:403:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSim.g:404:1: ( ruleSAggregate EOF )
            // InternalSim.g:405:1: ruleSAggregate EOF
            {
             before(grammarAccess.getSAggregateRule()); 
            pushFollow(FOLLOW_1);
            ruleSAggregate();

            state._fsp--;

             after(grammarAccess.getSAggregateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSAggregate"


    // $ANTLR start "ruleSAggregate"
    // InternalSim.g:412:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:416:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSim.g:417:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSim.g:417:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSim.g:418:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSim.g:419:3: ( rule__SAggregate__Group__0 )
            // InternalSim.g:419:4: rule__SAggregate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAggregateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAggregate"


    // $ANTLR start "entryRuleSType"
    // InternalSim.g:428:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSim.g:429:1: ( ruleSType EOF )
            // InternalSim.g:430:1: ruleSType EOF
            {
             before(grammarAccess.getSTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSType();

            state._fsp--;

             after(grammarAccess.getSTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSType"


    // $ANTLR start "ruleSType"
    // InternalSim.g:437:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:441:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSim.g:442:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSim.g:442:2: ( ( rule__SType__Alternatives ) )
            // InternalSim.g:443:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSim.g:444:3: ( rule__SType__Alternatives )
            // InternalSim.g:444:4: rule__SType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSType"


    // $ANTLR start "entryRuleSConstraint"
    // InternalSim.g:453:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSim.g:454:1: ( ruleSConstraint EOF )
            // InternalSim.g:455:1: ruleSConstraint EOF
            {
             before(grammarAccess.getSConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSConstraint"


    // $ANTLR start "ruleSConstraint"
    // InternalSim.g:462:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:466:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSim.g:467:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSim.g:467:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSim.g:468:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSim.g:469:3: ( rule__SConstraint__Group__0 )
            // InternalSim.g:469:4: rule__SConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSConstraint"


    // $ANTLR start "entryRuleSPrimitive"
    // InternalSim.g:478:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSim.g:479:1: ( ruleSPrimitive EOF )
            // InternalSim.g:480:1: ruleSPrimitive EOF
            {
             before(grammarAccess.getSPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            ruleSPrimitive();

            state._fsp--;

             after(grammarAccess.getSPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPrimitive"


    // $ANTLR start "ruleSPrimitive"
    // InternalSim.g:487:1: ruleSPrimitive : ( ( rule__SPrimitive__Group__0 ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:491:2: ( ( ( rule__SPrimitive__Group__0 ) ) )
            // InternalSim.g:492:2: ( ( rule__SPrimitive__Group__0 ) )
            {
            // InternalSim.g:492:2: ( ( rule__SPrimitive__Group__0 ) )
            // InternalSim.g:493:3: ( rule__SPrimitive__Group__0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getGroup()); 
            // InternalSim.g:494:3: ( rule__SPrimitive__Group__0 )
            // InternalSim.g:494:4: rule__SPrimitive__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPrimitive"


    // $ANTLR start "entryRuleSPrimitiveArchetype"
    // InternalSim.g:503:1: entryRuleSPrimitiveArchetype : ruleSPrimitiveArchetype EOF ;
    public final void entryRuleSPrimitiveArchetype() throws RecognitionException {
        try {
            // InternalSim.g:504:1: ( ruleSPrimitiveArchetype EOF )
            // InternalSim.g:505:1: ruleSPrimitiveArchetype EOF
            {
             before(grammarAccess.getSPrimitiveArchetypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSPrimitiveArchetype();

            state._fsp--;

             after(grammarAccess.getSPrimitiveArchetypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPrimitiveArchetype"


    // $ANTLR start "ruleSPrimitiveArchetype"
    // InternalSim.g:512:1: ruleSPrimitiveArchetype : ( ( rule__SPrimitiveArchetype__Group__0 ) ) ;
    public final void ruleSPrimitiveArchetype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:516:2: ( ( ( rule__SPrimitiveArchetype__Group__0 ) ) )
            // InternalSim.g:517:2: ( ( rule__SPrimitiveArchetype__Group__0 ) )
            {
            // InternalSim.g:517:2: ( ( rule__SPrimitiveArchetype__Group__0 ) )
            // InternalSim.g:518:3: ( rule__SPrimitiveArchetype__Group__0 )
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getGroup()); 
            // InternalSim.g:519:3: ( rule__SPrimitiveArchetype__Group__0 )
            // InternalSim.g:519:4: rule__SPrimitiveArchetype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveArchetypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPrimitiveArchetype"


    // $ANTLR start "entryRuleSEnumeration"
    // InternalSim.g:528:1: entryRuleSEnumeration : ruleSEnumeration EOF ;
    public final void entryRuleSEnumeration() throws RecognitionException {
        try {
            // InternalSim.g:529:1: ( ruleSEnumeration EOF )
            // InternalSim.g:530:1: ruleSEnumeration EOF
            {
             before(grammarAccess.getSEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleSEnumeration();

            state._fsp--;

             after(grammarAccess.getSEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSEnumeration"


    // $ANTLR start "ruleSEnumeration"
    // InternalSim.g:537:1: ruleSEnumeration : ( ( rule__SEnumeration__Group__0 ) ) ;
    public final void ruleSEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:541:2: ( ( ( rule__SEnumeration__Group__0 ) ) )
            // InternalSim.g:542:2: ( ( rule__SEnumeration__Group__0 ) )
            {
            // InternalSim.g:542:2: ( ( rule__SEnumeration__Group__0 ) )
            // InternalSim.g:543:3: ( rule__SEnumeration__Group__0 )
            {
             before(grammarAccess.getSEnumerationAccess().getGroup()); 
            // InternalSim.g:544:3: ( rule__SEnumeration__Group__0 )
            // InternalSim.g:544:4: rule__SEnumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEnumeration"


    // $ANTLR start "entryRuleSLiteral"
    // InternalSim.g:553:1: entryRuleSLiteral : ruleSLiteral EOF ;
    public final void entryRuleSLiteral() throws RecognitionException {
        try {
            // InternalSim.g:554:1: ( ruleSLiteral EOF )
            // InternalSim.g:555:1: ruleSLiteral EOF
            {
             before(grammarAccess.getSLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleSLiteral();

            state._fsp--;

             after(grammarAccess.getSLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSLiteral"


    // $ANTLR start "ruleSLiteral"
    // InternalSim.g:562:1: ruleSLiteral : ( ( rule__SLiteral__Alternatives ) ) ;
    public final void ruleSLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:566:2: ( ( ( rule__SLiteral__Alternatives ) ) )
            // InternalSim.g:567:2: ( ( rule__SLiteral__Alternatives ) )
            {
            // InternalSim.g:567:2: ( ( rule__SLiteral__Alternatives ) )
            // InternalSim.g:568:3: ( rule__SLiteral__Alternatives )
            {
             before(grammarAccess.getSLiteralAccess().getAlternatives()); 
            // InternalSim.g:569:3: ( rule__SLiteral__Alternatives )
            // InternalSim.g:569:4: rule__SLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSLiteral"


    // $ANTLR start "entryRuleSRootType"
    // InternalSim.g:578:1: entryRuleSRootType : ruleSRootType EOF ;
    public final void entryRuleSRootType() throws RecognitionException {
        try {
            // InternalSim.g:579:1: ( ruleSRootType EOF )
            // InternalSim.g:580:1: ruleSRootType EOF
            {
             before(grammarAccess.getSRootTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSRootType();

            state._fsp--;

             after(grammarAccess.getSRootTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSRootType"


    // $ANTLR start "ruleSRootType"
    // InternalSim.g:587:1: ruleSRootType : ( ( rule__SRootType__Group__0 ) ) ;
    public final void ruleSRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:591:2: ( ( ( rule__SRootType__Group__0 ) ) )
            // InternalSim.g:592:2: ( ( rule__SRootType__Group__0 ) )
            {
            // InternalSim.g:592:2: ( ( rule__SRootType__Group__0 ) )
            // InternalSim.g:593:3: ( rule__SRootType__Group__0 )
            {
             before(grammarAccess.getSRootTypeAccess().getGroup()); 
            // InternalSim.g:594:3: ( rule__SRootType__Group__0 )
            // InternalSim.g:594:4: rule__SRootType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSRootType"


    // $ANTLR start "entryRuleSDetailType"
    // InternalSim.g:603:1: entryRuleSDetailType : ruleSDetailType EOF ;
    public final void entryRuleSDetailType() throws RecognitionException {
        try {
            // InternalSim.g:604:1: ( ruleSDetailType EOF )
            // InternalSim.g:605:1: ruleSDetailType EOF
            {
             before(grammarAccess.getSDetailTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSDetailType();

            state._fsp--;

             after(grammarAccess.getSDetailTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSDetailType"


    // $ANTLR start "ruleSDetailType"
    // InternalSim.g:612:1: ruleSDetailType : ( ( rule__SDetailType__Group__0 ) ) ;
    public final void ruleSDetailType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:616:2: ( ( ( rule__SDetailType__Group__0 ) ) )
            // InternalSim.g:617:2: ( ( rule__SDetailType__Group__0 ) )
            {
            // InternalSim.g:617:2: ( ( rule__SDetailType__Group__0 ) )
            // InternalSim.g:618:3: ( rule__SDetailType__Group__0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getGroup()); 
            // InternalSim.g:619:3: ( rule__SDetailType__Group__0 )
            // InternalSim.g:619:4: rule__SDetailType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDetailType"


    // $ANTLR start "ruleSComplexTypeExtends"
    // InternalSim.g:629:1: ruleSComplexTypeExtends : ( ( rule__SComplexTypeExtends__Group__0 )? ) ;
    public final void ruleSComplexTypeExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:633:2: ( ( ( rule__SComplexTypeExtends__Group__0 )? ) )
            // InternalSim.g:634:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            {
            // InternalSim.g:634:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            // InternalSim.g:635:3: ( rule__SComplexTypeExtends__Group__0 )?
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getGroup()); 
            // InternalSim.g:636:3: ( rule__SComplexTypeExtends__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSim.g:636:4: rule__SComplexTypeExtends__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexTypeExtends__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSComplexTypeExtendsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSComplexTypeExtends"


    // $ANTLR start "ruleSComplexTypeFeatures"
    // InternalSim.g:646:1: ruleSComplexTypeFeatures : ( ( rule__SComplexTypeFeatures__Group__0 ) ) ;
    public final void ruleSComplexTypeFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:650:2: ( ( ( rule__SComplexTypeFeatures__Group__0 ) ) )
            // InternalSim.g:651:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            {
            // InternalSim.g:651:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            // InternalSim.g:652:3: ( rule__SComplexTypeFeatures__Group__0 )
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getGroup()); 
            // InternalSim.g:653:3: ( rule__SComplexTypeFeatures__Group__0 )
            // InternalSim.g:653:4: rule__SComplexTypeFeatures__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SComplexTypeFeatures__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSComplexTypeFeaturesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSComplexTypeFeatures"


    // $ANTLR start "entryRuleSFeature"
    // InternalSim.g:662:1: entryRuleSFeature : ruleSFeature EOF ;
    public final void entryRuleSFeature() throws RecognitionException {
        try {
            // InternalSim.g:663:1: ( ruleSFeature EOF )
            // InternalSim.g:664:1: ruleSFeature EOF
            {
             before(grammarAccess.getSFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSFeature();

            state._fsp--;

             after(grammarAccess.getSFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSFeature"


    // $ANTLR start "ruleSFeature"
    // InternalSim.g:671:1: ruleSFeature : ( ( rule__SFeature__Alternatives ) ) ;
    public final void ruleSFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:675:2: ( ( ( rule__SFeature__Alternatives ) ) )
            // InternalSim.g:676:2: ( ( rule__SFeature__Alternatives ) )
            {
            // InternalSim.g:676:2: ( ( rule__SFeature__Alternatives ) )
            // InternalSim.g:677:3: ( rule__SFeature__Alternatives )
            {
             before(grammarAccess.getSFeatureAccess().getAlternatives()); 
            // InternalSim.g:678:3: ( rule__SFeature__Alternatives )
            // InternalSim.g:678:4: rule__SFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSFeature"


    // $ANTLR start "entryRuleSAssociation"
    // InternalSim.g:687:1: entryRuleSAssociation : ruleSAssociation EOF ;
    public final void entryRuleSAssociation() throws RecognitionException {
        try {
            // InternalSim.g:688:1: ( ruleSAssociation EOF )
            // InternalSim.g:689:1: ruleSAssociation EOF
            {
             before(grammarAccess.getSAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleSAssociation();

            state._fsp--;

             after(grammarAccess.getSAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSAssociation"


    // $ANTLR start "ruleSAssociation"
    // InternalSim.g:696:1: ruleSAssociation : ( ( rule__SAssociation__Alternatives ) ) ;
    public final void ruleSAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:700:2: ( ( ( rule__SAssociation__Alternatives ) ) )
            // InternalSim.g:701:2: ( ( rule__SAssociation__Alternatives ) )
            {
            // InternalSim.g:701:2: ( ( rule__SAssociation__Alternatives ) )
            // InternalSim.g:702:3: ( rule__SAssociation__Alternatives )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives()); 
            // InternalSim.g:703:3: ( rule__SAssociation__Alternatives )
            // InternalSim.g:703:4: rule__SAssociation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAssociation"


    // $ANTLR start "entryRuleSAttribute"
    // InternalSim.g:712:1: entryRuleSAttribute : ruleSAttribute EOF ;
    public final void entryRuleSAttribute() throws RecognitionException {
        try {
            // InternalSim.g:713:1: ( ruleSAttribute EOF )
            // InternalSim.g:714:1: ruleSAttribute EOF
            {
             before(grammarAccess.getSAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleSAttribute();

            state._fsp--;

             after(grammarAccess.getSAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSAttribute"


    // $ANTLR start "ruleSAttribute"
    // InternalSim.g:721:1: ruleSAttribute : ( ( rule__SAttribute__Alternatives ) ) ;
    public final void ruleSAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:725:2: ( ( ( rule__SAttribute__Alternatives ) ) )
            // InternalSim.g:726:2: ( ( rule__SAttribute__Alternatives ) )
            {
            // InternalSim.g:726:2: ( ( rule__SAttribute__Alternatives ) )
            // InternalSim.g:727:3: ( rule__SAttribute__Alternatives )
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives()); 
            // InternalSim.g:728:3: ( rule__SAttribute__Alternatives )
            // InternalSim.g:728:4: rule__SAttribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAttribute"


    // $ANTLR start "entryRuleSQuery"
    // InternalSim.g:737:1: entryRuleSQuery : ruleSQuery EOF ;
    public final void entryRuleSQuery() throws RecognitionException {
        try {
            // InternalSim.g:738:1: ( ruleSQuery EOF )
            // InternalSim.g:739:1: ruleSQuery EOF
            {
             before(grammarAccess.getSQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSQuery();

            state._fsp--;

             after(grammarAccess.getSQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSQuery"


    // $ANTLR start "ruleSQuery"
    // InternalSim.g:746:1: ruleSQuery : ( ( rule__SQuery__Alternatives ) ) ;
    public final void ruleSQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:750:2: ( ( ( rule__SQuery__Alternatives ) ) )
            // InternalSim.g:751:2: ( ( rule__SQuery__Alternatives ) )
            {
            // InternalSim.g:751:2: ( ( rule__SQuery__Alternatives ) )
            // InternalSim.g:752:3: ( rule__SQuery__Alternatives )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives()); 
            // InternalSim.g:753:3: ( rule__SQuery__Alternatives )
            // InternalSim.g:753:4: rule__SQuery__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSQuery"


    // $ANTLR start "entryRuleSQueryParameter"
    // InternalSim.g:762:1: entryRuleSQueryParameter : ruleSQueryParameter EOF ;
    public final void entryRuleSQueryParameter() throws RecognitionException {
        try {
            // InternalSim.g:763:1: ( ruleSQueryParameter EOF )
            // InternalSim.g:764:1: ruleSQueryParameter EOF
            {
             before(grammarAccess.getSQueryParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSQueryParameter"


    // $ANTLR start "ruleSQueryParameter"
    // InternalSim.g:771:1: ruleSQueryParameter : ( ( rule__SQueryParameter__Alternatives ) ) ;
    public final void ruleSQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:775:2: ( ( ( rule__SQueryParameter__Alternatives ) ) )
            // InternalSim.g:776:2: ( ( rule__SQueryParameter__Alternatives ) )
            {
            // InternalSim.g:776:2: ( ( rule__SQueryParameter__Alternatives ) )
            // InternalSim.g:777:3: ( rule__SQueryParameter__Alternatives )
            {
             before(grammarAccess.getSQueryParameterAccess().getAlternatives()); 
            // InternalSim.g:778:3: ( rule__SQueryParameter__Alternatives )
            // InternalSim.g:778:4: rule__SQueryParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSQueryParameter"


    // $ANTLR start "entryRuleSExpression"
    // InternalSim.g:787:1: entryRuleSExpression : ruleSExpression EOF ;
    public final void entryRuleSExpression() throws RecognitionException {
        try {
            // InternalSim.g:788:1: ( ruleSExpression EOF )
            // InternalSim.g:789:1: ruleSExpression EOF
            {
             before(grammarAccess.getSExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSExpression();

            state._fsp--;

             after(grammarAccess.getSExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSExpression"


    // $ANTLR start "ruleSExpression"
    // InternalSim.g:796:1: ruleSExpression : ( ( rule__SExpression__ExprAssignment ) ) ;
    public final void ruleSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:800:2: ( ( ( rule__SExpression__ExprAssignment ) ) )
            // InternalSim.g:801:2: ( ( rule__SExpression__ExprAssignment ) )
            {
            // InternalSim.g:801:2: ( ( rule__SExpression__ExprAssignment ) )
            // InternalSim.g:802:3: ( rule__SExpression__ExprAssignment )
            {
             before(grammarAccess.getSExpressionAccess().getExprAssignment()); 
            // InternalSim.g:803:3: ( rule__SExpression__ExprAssignment )
            // InternalSim.g:803:4: rule__SExpression__ExprAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SExpression__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSExpressionAccess().getExprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSExpression"


    // $ANTLR start "entryRuleSQualifiedNameWithWildcard"
    // InternalSim.g:812:1: entryRuleSQualifiedNameWithWildcard : ruleSQualifiedNameWithWildcard EOF ;
    public final void entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSim.g:813:1: ( ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:814:1: ruleSQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getSQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleSQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getSQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSQualifiedNameWithWildcard"


    // $ANTLR start "ruleSQualifiedNameWithWildcard"
    // InternalSim.g:821:1: ruleSQualifiedNameWithWildcard : ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleSQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:825:2: ( ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSim.g:826:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSim.g:826:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            // InternalSim.g:827:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSim.g:828:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            // InternalSim.g:828:4: rule__SQualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleSQualifiedName"
    // InternalSim.g:837:1: entryRuleSQualifiedName : ruleSQualifiedName EOF ;
    public final void entryRuleSQualifiedName() throws RecognitionException {
        try {
            // InternalSim.g:838:1: ( ruleSQualifiedName EOF )
            // InternalSim.g:839:1: ruleSQualifiedName EOF
            {
             before(grammarAccess.getSQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSQualifiedName"


    // $ANTLR start "ruleSQualifiedName"
    // InternalSim.g:846:1: ruleSQualifiedName : ( ( rule__SQualifiedName__Group__0 ) ) ;
    public final void ruleSQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:850:2: ( ( ( rule__SQualifiedName__Group__0 ) ) )
            // InternalSim.g:851:2: ( ( rule__SQualifiedName__Group__0 ) )
            {
            // InternalSim.g:851:2: ( ( rule__SQualifiedName__Group__0 ) )
            // InternalSim.g:852:3: ( rule__SQualifiedName__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup()); 
            // InternalSim.g:853:3: ( rule__SQualifiedName__Group__0 )
            // InternalSim.g:853:4: rule__SQualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSQualifiedName"


    // $ANTLR start "entryRuleSMultiplicity"
    // InternalSim.g:862:1: entryRuleSMultiplicity : ruleSMultiplicity EOF ;
    public final void entryRuleSMultiplicity() throws RecognitionException {
        try {
            // InternalSim.g:863:1: ( ruleSMultiplicity EOF )
            // InternalSim.g:864:1: ruleSMultiplicity EOF
            {
             before(grammarAccess.getSMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSMultiplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSMultiplicity"


    // $ANTLR start "ruleSMultiplicity"
    // InternalSim.g:871:1: ruleSMultiplicity : ( ( rule__SMultiplicity__Group__0 ) ) ;
    public final void ruleSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:875:2: ( ( ( rule__SMultiplicity__Group__0 ) ) )
            // InternalSim.g:876:2: ( ( rule__SMultiplicity__Group__0 ) )
            {
            // InternalSim.g:876:2: ( ( rule__SMultiplicity__Group__0 ) )
            // InternalSim.g:877:3: ( rule__SMultiplicity__Group__0 )
            {
             before(grammarAccess.getSMultiplicityAccess().getGroup()); 
            // InternalSim.g:878:3: ( rule__SMultiplicity__Group__0 )
            // InternalSim.g:878:4: rule__SMultiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMultiplicityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMultiplicity"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalSim.g:887:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalSim.g:888:1: ( ruleMULTIPLICITY EOF )
            // InternalSim.g:889:1: ruleMULTIPLICITY EOF
            {
             before(grammarAccess.getMULTIPLICITYRule()); 
            pushFollow(FOLLOW_1);
            ruleMULTIPLICITY();

            state._fsp--;

             after(grammarAccess.getMULTIPLICITYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMULTIPLICITY"


    // $ANTLR start "ruleMULTIPLICITY"
    // InternalSim.g:896:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:900:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalSim.g:901:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalSim.g:901:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalSim.g:902:3: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // InternalSim.g:903:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalSim.g:903:4: rule__MULTIPLICITY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MULTIPLICITY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMULTIPLICITY"


    // $ANTLR start "ruleSAssociationKind"
    // InternalSim.g:912:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:916:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSim.g:917:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSim.g:917:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSim.g:918:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSim.g:919:3: ( rule__SAssociationKind__Alternatives )
            // InternalSim.g:919:4: rule__SAssociationKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SAssociationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAssociationKind"


    // $ANTLR start "ruleSAssociationKindInverse"
    // InternalSim.g:928:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:932:1: ( ( ( 'inverse' ) ) )
            // InternalSim.g:933:2: ( ( 'inverse' ) )
            {
            // InternalSim.g:933:2: ( ( 'inverse' ) )
            // InternalSim.g:934:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSim.g:935:3: ( 'inverse' )
            // InternalSim.g:935:4: 'inverse'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAssociationKindInverse"


    // $ANTLR start "rule__SDomain__Alternatives_3"
    // InternalSim.g:943:1: rule__SDomain__Alternatives_3 : ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) );
    public final void rule__SDomain__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:947:1: ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 30:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
            case 47:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==33||LA2_2==36||LA2_2==39||LA2_2==47) ) {
                    alt2=1;
                }
                else if ( (LA2_2==12) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSim.g:948:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    {
                    // InternalSim.g:948:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    // InternalSim.g:949:3: ( rule__SDomain__TypesAssignment_3_0 )
                    {
                     before(grammarAccess.getSDomainAccess().getTypesAssignment_3_0()); 
                    // InternalSim.g:950:3: ( rule__SDomain__TypesAssignment_3_0 )
                    // InternalSim.g:950:4: rule__SDomain__TypesAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDomain__TypesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDomainAccess().getTypesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:954:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    {
                    // InternalSim.g:954:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    // InternalSim.g:955:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    {
                     before(grammarAccess.getSDomainAccess().getAggregatesAssignment_3_1()); 
                    // InternalSim.g:956:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    // InternalSim.g:956:4: rule__SDomain__AggregatesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDomain__AggregatesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDomainAccess().getAggregatesAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Alternatives_3"


    // $ANTLR start "rule__SAggregate__Alternatives_1"
    // InternalSim.g:964:1: rule__SAggregate__Alternatives_1 : ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) );
    public final void rule__SAggregate__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:968:1: ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSim.g:969:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    {
                    // InternalSim.g:969:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    // InternalSim.g:970:3: ( rule__SAggregate__Group_1_0__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_0()); 
                    // InternalSim.g:971:3: ( rule__SAggregate__Group_1_0__0 )
                    // InternalSim.g:971:4: rule__SAggregate__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAggregate__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAggregateAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:975:2: ( 'aggregate' )
                    {
                    // InternalSim.g:975:2: ( 'aggregate' )
                    // InternalSim.g:976:3: 'aggregate'
                    {
                     before(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Alternatives_1"


    // $ANTLR start "rule__SType__Alternatives"
    // InternalSim.g:985:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:989:1: ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSim.g:990:2: ( ruleSPrimitive )
                    {
                    // InternalSim.g:990:2: ( ruleSPrimitive )
                    // InternalSim.g:991:3: ruleSPrimitive
                    {
                     before(grammarAccess.getSTypeAccess().getSPrimitiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSPrimitive();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSPrimitiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:996:2: ( ruleSPrimitiveArchetype )
                    {
                    // InternalSim.g:996:2: ( ruleSPrimitiveArchetype )
                    // InternalSim.g:997:3: ruleSPrimitiveArchetype
                    {
                     before(grammarAccess.getSTypeAccess().getSPrimitiveArchetypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSPrimitiveArchetype();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSPrimitiveArchetypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1002:2: ( ruleSEnumeration )
                    {
                    // InternalSim.g:1002:2: ( ruleSEnumeration )
                    // InternalSim.g:1003:3: ruleSEnumeration
                    {
                     before(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSEnumeration();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1008:2: ( ruleSRootType )
                    {
                    // InternalSim.g:1008:2: ( ruleSRootType )
                    // InternalSim.g:1009:3: ruleSRootType
                    {
                     before(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSRootType();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1014:2: ( ruleSDetailType )
                    {
                    // InternalSim.g:1014:2: ( ruleSDetailType )
                    // InternalSim.g:1015:3: ruleSDetailType
                    {
                     before(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSDetailType();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SType__Alternatives"


    // $ANTLR start "rule__SPrimitive__Alternatives_2"
    // InternalSim.g:1024:1: rule__SPrimitive__Alternatives_2 : ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) );
    public final void rule__SPrimitive__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1028:1: ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSim.g:1029:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    {
                    // InternalSim.g:1029:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    // InternalSim.g:1030:3: ( rule__SPrimitive__Group_2_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_0()); 
                    // InternalSim.g:1031:3: ( rule__SPrimitive__Group_2_0__0 )
                    // InternalSim.g:1031:4: rule__SPrimitive__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1035:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    {
                    // InternalSim.g:1035:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    // InternalSim.g:1036:3: ( rule__SPrimitive__Group_2_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_1()); 
                    // InternalSim.g:1037:3: ( rule__SPrimitive__Group_2_1__0 )
                    // InternalSim.g:1037:4: rule__SPrimitive__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Alternatives_2"


    // $ANTLR start "rule__SPrimitive__Alternatives_2_1_0"
    // InternalSim.g:1045:1: rule__SPrimitive__Alternatives_2_1_0 : ( ( 'realizes' ) | ( 'realises' ) );
    public final void rule__SPrimitive__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1049:1: ( ( 'realizes' ) | ( 'realises' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSim.g:1050:2: ( 'realizes' )
                    {
                    // InternalSim.g:1050:2: ( 'realizes' )
                    // InternalSim.g:1051:3: 'realizes'
                    {
                     before(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1056:2: ( 'realises' )
                    {
                    // InternalSim.g:1056:2: ( 'realises' )
                    // InternalSim.g:1057:3: 'realises'
                    {
                     before(grammarAccess.getSPrimitiveAccess().getRealisesKeyword_2_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSPrimitiveAccess().getRealisesKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Alternatives_2_1_0"


    // $ANTLR start "rule__SEnumeration__Alternatives_0"
    // InternalSim.g:1066:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1070:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSim.g:1071:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1071:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSim.g:1072:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSim.g:1073:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSim.g:1073:4: rule__SEnumeration__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1077:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1077:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSim.g:1078:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSim.g:1079:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSim.g:1079:4: rule__SEnumeration__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1083:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1083:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    // InternalSim.g:1084:3: ( rule__SEnumeration__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 
                    // InternalSim.g:1085:3: ( rule__SEnumeration__Group_0_2__0 )
                    // InternalSim.g:1085:4: rule__SEnumeration__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Alternatives_0"


    // $ANTLR start "rule__SLiteral__Alternatives"
    // InternalSim.g:1093:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1097:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSim.g:1098:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSim.g:1098:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSim.g:1099:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSim.g:1100:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSim.g:1100:4: rule__SLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1104:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSim.g:1104:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSim.g:1105:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSim.g:1106:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSim.g:1106:4: rule__SLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1110:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSim.g:1110:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSim.g:1111:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSim.g:1112:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSim.g:1112:4: rule__SLiteral__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SLiteral__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Alternatives"


    // $ANTLR start "rule__SRootType__Alternatives_0"
    // InternalSim.g:1120:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1124:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            case 36:
            case 47:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSim.g:1125:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1125:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSim.g:1126:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1127:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSim.g:1127:4: rule__SRootType__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1131:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1131:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSim.g:1132:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1133:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSim.g:1133:4: rule__SRootType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1137:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1137:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    // InternalSim.g:1138:3: ( rule__SRootType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1139:3: ( rule__SRootType__Group_0_2__0 )
                    // InternalSim.g:1139:4: rule__SRootType__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1143:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1143:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    // InternalSim.g:1144:3: ( rule__SRootType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1145:3: ( rule__SRootType__Group_0_3__0 )
                    // InternalSim.g:1145:4: rule__SRootType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1149:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1149:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    // InternalSim.g:1150:3: ( rule__SRootType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1151:3: ( rule__SRootType__Group_0_4__0 )
                    // InternalSim.g:1151:4: rule__SRootType__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Alternatives_0"


    // $ANTLR start "rule__SDetailType__Alternatives_0"
    // InternalSim.g:1159:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1163:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            case 39:
            case 47:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSim.g:1164:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1164:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSim.g:1165:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1166:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSim.g:1166:4: rule__SDetailType__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1170:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1170:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSim.g:1171:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1172:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSim.g:1172:4: rule__SDetailType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1176:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1176:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSim.g:1177:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1178:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSim.g:1178:4: rule__SDetailType__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1182:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1182:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSim.g:1183:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1184:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSim.g:1184:4: rule__SDetailType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1188:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1188:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    // InternalSim.g:1189:3: ( rule__SDetailType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1190:3: ( rule__SDetailType__Group_0_4__0 )
                    // InternalSim.g:1190:4: rule__SDetailType__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Alternatives_0"


    // $ANTLR start "rule__SComplexTypeFeatures__Alternatives_1"
    // InternalSim.g:1198:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1202:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==11||(LA11_0>=15 && LA11_0<=16)||LA11_0==28||LA11_0==34||LA11_0==37||LA11_0==39||LA11_0==48) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:1203:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSim.g:1203:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSim.g:1204:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSim.g:1205:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSim.g:1205:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexTypeFeatures__FeaturesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1209:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSim.g:1209:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSim.g:1210:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSim.g:1211:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSim.g:1211:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexTypeFeatures__ConstraintsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Alternatives_1"


    // $ANTLR start "rule__SFeature__Alternatives"
    // InternalSim.g:1219:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1223:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 17:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case 42:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 17:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                case 42:
                    {
                    alt12=3;
                    }
                    break;
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case 42:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_ID:
                case 17:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }

                }
                break;
            case 11:
            case 15:
            case 16:
            case 48:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                int LA12_6 = input.LA(2);

                if ( (LA12_6==25) ) {
                    alt12=2;
                }
                else if ( (LA12_6==40) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSim.g:1224:2: ( ruleSAssociation )
                    {
                    // InternalSim.g:1224:2: ( ruleSAssociation )
                    // InternalSim.g:1225:3: ruleSAssociation
                    {
                     before(grammarAccess.getSFeatureAccess().getSAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSAssociation();

                    state._fsp--;

                     after(grammarAccess.getSFeatureAccess().getSAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1230:2: ( ruleSAttribute )
                    {
                    // InternalSim.g:1230:2: ( ruleSAttribute )
                    // InternalSim.g:1231:3: ruleSAttribute
                    {
                     before(grammarAccess.getSFeatureAccess().getSAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSAttribute();

                    state._fsp--;

                     after(grammarAccess.getSFeatureAccess().getSAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1236:2: ( ruleSQuery )
                    {
                    // InternalSim.g:1236:2: ( ruleSQuery )
                    // InternalSim.g:1237:3: ruleSQuery
                    {
                     before(grammarAccess.getSFeatureAccess().getSQueryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSQuery();

                    state._fsp--;

                     after(grammarAccess.getSFeatureAccess().getSQueryParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFeature__Alternatives"


    // $ANTLR start "rule__SAssociation__Alternatives"
    // InternalSim.g:1246:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1250:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            case 11:
            case 15:
            case 16:
            case 48:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSim.g:1251:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSim.g:1251:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSim.g:1252:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSim.g:1253:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSim.g:1253:4: rule__SAssociation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1257:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSim.g:1257:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSim.g:1258:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSim.g:1259:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSim.g:1259:4: rule__SAssociation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1263:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSim.g:1263:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSim.g:1264:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSim.g:1265:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSim.g:1265:4: rule__SAssociation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1269:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSim.g:1269:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSim.g:1270:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSim.g:1271:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSim.g:1271:4: rule__SAssociation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Alternatives"


    // $ANTLR start "rule__SAssociation__Alternatives_0_2"
    // InternalSim.g:1279:1: rule__SAssociation__Alternatives_0_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1283:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            else if ( (LA14_0==16) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:1284:2: ( 'reference' )
                    {
                    // InternalSim.g:1284:2: ( 'reference' )
                    // InternalSim.g:1285:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1290:2: ( 'composite' )
                    {
                    // InternalSim.g:1290:2: ( 'composite' )
                    // InternalSim.g:1291:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Alternatives_0_2"


    // $ANTLR start "rule__SAssociation__Alternatives_1_2"
    // InternalSim.g:1300:1: rule__SAssociation__Alternatives_1_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1304:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSim.g:1305:2: ( 'reference' )
                    {
                    // InternalSim.g:1305:2: ( 'reference' )
                    // InternalSim.g:1306:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1311:2: ( 'composite' )
                    {
                    // InternalSim.g:1311:2: ( 'composite' )
                    // InternalSim.g:1312:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Alternatives_1_2"


    // $ANTLR start "rule__SAssociation__Alternatives_2_2"
    // InternalSim.g:1321:1: rule__SAssociation__Alternatives_2_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1325:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            else if ( (LA16_0==16) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:1326:2: ( 'reference' )
                    {
                    // InternalSim.g:1326:2: ( 'reference' )
                    // InternalSim.g:1327:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1332:2: ( 'composite' )
                    {
                    // InternalSim.g:1332:2: ( 'composite' )
                    // InternalSim.g:1333:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Alternatives_2_2"


    // $ANTLR start "rule__SAssociation__Alternatives_3_1"
    // InternalSim.g:1342:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1346:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=15 && LA17_0<=16)) ) {
                alt17=1;
            }
            else if ( (LA17_0==11) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSim.g:1347:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSim.g:1347:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSim.g:1348:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSim.g:1349:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSim.g:1349:4: rule__SAssociation__KindAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__KindAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1353:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSim.g:1353:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSim.g:1354:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSim.g:1355:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSim.g:1355:4: rule__SAssociation__Group_3_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_3_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Alternatives_3_1"


    // $ANTLR start "rule__SAttribute__Alternatives"
    // InternalSim.g:1363:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1367:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
            case 39:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalSim.g:1368:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSim.g:1368:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSim.g:1369:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSim.g:1370:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSim.g:1370:4: rule__SAttribute__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1374:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSim.g:1374:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSim.g:1375:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSim.g:1376:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSim.g:1376:4: rule__SAttribute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1380:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSim.g:1380:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSim.g:1381:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSim.g:1382:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSim.g:1382:4: rule__SAttribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1386:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSim.g:1386:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSim.g:1387:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSim.g:1388:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSim.g:1388:4: rule__SAttribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Alternatives"


    // $ANTLR start "rule__SAttribute__Alternatives_0_2"
    // InternalSim.g:1396:1: rule__SAttribute__Alternatives_0_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1400:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1401:2: ( 'attribute' )
                    {
                    // InternalSim.g:1401:2: ( 'attribute' )
                    // InternalSim.g:1402:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1407:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    {
                    // InternalSim.g:1407:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    // InternalSim.g:1408:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 
                    // InternalSim.g:1409:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    // InternalSim.g:1409:4: rule__SAttribute__DetailAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_0_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Alternatives_0_2"


    // $ANTLR start "rule__SAttribute__Alternatives_1_2"
    // InternalSim.g:1417:1: rule__SAttribute__Alternatives_1_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1421:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1422:2: ( 'attribute' )
                    {
                    // InternalSim.g:1422:2: ( 'attribute' )
                    // InternalSim.g:1423:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1428:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    {
                    // InternalSim.g:1428:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    // InternalSim.g:1429:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 
                    // InternalSim.g:1430:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    // InternalSim.g:1430:4: rule__SAttribute__DetailAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Alternatives_1_2"


    // $ANTLR start "rule__SAttribute__Alternatives_2_2"
    // InternalSim.g:1438:1: rule__SAttribute__Alternatives_2_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1442:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSim.g:1443:2: ( 'attribute' )
                    {
                    // InternalSim.g:1443:2: ( 'attribute' )
                    // InternalSim.g:1444:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1449:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    {
                    // InternalSim.g:1449:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    // InternalSim.g:1450:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 
                    // InternalSim.g:1451:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    // InternalSim.g:1451:4: rule__SAttribute__DetailAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_2_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Alternatives_2_2"


    // $ANTLR start "rule__SQuery__Alternatives"
    // InternalSim.g:1459:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1463:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 28:
            case 37:
                {
                alt22=1;
                }
                break;
            case 34:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalSim.g:1464:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSim.g:1464:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSim.g:1465:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSim.g:1466:3: ( rule__SQuery__Group_0__0 )
                    // InternalSim.g:1466:4: rule__SQuery__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1470:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSim.g:1470:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSim.g:1471:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSim.g:1472:3: ( rule__SQuery__Group_1__0 )
                    // InternalSim.g:1472:4: rule__SQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1476:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSim.g:1476:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSim.g:1477:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSim.g:1478:3: ( rule__SQuery__Group_2__0 )
                    // InternalSim.g:1478:4: rule__SQuery__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Alternatives"


    // $ANTLR start "rule__SQuery__Alternatives_0_0"
    // InternalSim.g:1486:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1490:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSim.g:1491:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSim.g:1491:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSim.g:1492:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSim.g:1493:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSim.g:1493:4: rule__SQuery__Group_0_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1497:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSim.g:1497:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSim.g:1498:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSim.g:1499:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSim.g:1499:4: rule__SQuery__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Alternatives_0_0"


    // $ANTLR start "rule__SQuery__Alternatives_0_2"
    // InternalSim.g:1507:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1511:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||LA25_0==28||LA25_0==34||LA25_0==37||LA25_0==41) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSim.g:1512:2: ( '*' )
                    {
                    // InternalSim.g:1512:2: ( '*' )
                    // InternalSim.g:1513:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1518:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSim.g:1518:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSim.g:1519:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSim.g:1520:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID||LA24_0==28||LA24_0==34||LA24_0==37) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSim.g:1520:4: rule__SQuery__Group_0_2_1__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__SQuery__Group_0_2_1__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Alternatives_0_2"


    // $ANTLR start "rule__SQueryParameter__Alternatives"
    // InternalSim.g:1528:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1532:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            case RULE_ID:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalSim.g:1533:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSim.g:1533:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSim.g:1534:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSim.g:1535:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSim.g:1535:4: rule__SQueryParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1539:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSim.g:1539:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSim.g:1540:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSim.g:1541:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSim.g:1541:4: rule__SQueryParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1545:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSim.g:1545:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSim.g:1546:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSim.g:1547:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSim.g:1547:4: rule__SQueryParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryParameterAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1551:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    {
                    // InternalSim.g:1551:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    // InternalSim.g:1552:3: ( rule__SQueryParameter__Group_3__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_3()); 
                    // InternalSim.g:1553:3: ( rule__SQueryParameter__Group_3__0 )
                    // InternalSim.g:1553:4: rule__SQueryParameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryParameterAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Alternatives"


    // $ANTLR start "rule__MULTIPLICITY__Alternatives"
    // InternalSim.g:1561:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1565:1: ( ( RULE_INT ) | ( '*' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            else if ( (LA27_0==18) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalSim.g:1566:2: ( RULE_INT )
                    {
                    // InternalSim.g:1566:2: ( RULE_INT )
                    // InternalSim.g:1567:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1572:2: ( '*' )
                    {
                    // InternalSim.g:1572:2: ( '*' )
                    // InternalSim.g:1573:3: '*'
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLICITY__Alternatives"


    // $ANTLR start "rule__SAssociationKind__Alternatives"
    // InternalSim.g:1582:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1586:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            else if ( (LA28_0==16) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSim.g:1587:2: ( ( 'reference' ) )
                    {
                    // InternalSim.g:1587:2: ( ( 'reference' ) )
                    // InternalSim.g:1588:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1589:3: ( 'reference' )
                    // InternalSim.g:1589:4: 'reference'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1593:2: ( ( 'composite' ) )
                    {
                    // InternalSim.g:1593:2: ( ( 'composite' ) )
                    // InternalSim.g:1594:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1595:3: ( 'composite' )
                    // InternalSim.g:1595:4: 'composite'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociationKind__Alternatives"


    // $ANTLR start "rule__SDomain__Group__0"
    // InternalSim.g:1603:1: rule__SDomain__Group__0 : rule__SDomain__Group__0__Impl rule__SDomain__Group__1 ;
    public final void rule__SDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1607:1: ( rule__SDomain__Group__0__Impl rule__SDomain__Group__1 )
            // InternalSim.g:1608:2: rule__SDomain__Group__0__Impl rule__SDomain__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__0"


    // $ANTLR start "rule__SDomain__Group__0__Impl"
    // InternalSim.g:1615:1: rule__SDomain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__SDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1619:1: ( ( 'domain' ) )
            // InternalSim.g:1620:1: ( 'domain' )
            {
            // InternalSim.g:1620:1: ( 'domain' )
            // InternalSim.g:1621:2: 'domain'
            {
             before(grammarAccess.getSDomainAccess().getDomainKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__0__Impl"


    // $ANTLR start "rule__SDomain__Group__1"
    // InternalSim.g:1630:1: rule__SDomain__Group__1 : rule__SDomain__Group__1__Impl rule__SDomain__Group__2 ;
    public final void rule__SDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1634:1: ( rule__SDomain__Group__1__Impl rule__SDomain__Group__2 )
            // InternalSim.g:1635:2: rule__SDomain__Group__1__Impl rule__SDomain__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SDomain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__1"


    // $ANTLR start "rule__SDomain__Group__1__Impl"
    // InternalSim.g:1642:1: rule__SDomain__Group__1__Impl : ( ( rule__SDomain__NameAssignment_1 ) ) ;
    public final void rule__SDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1646:1: ( ( ( rule__SDomain__NameAssignment_1 ) ) )
            // InternalSim.g:1647:1: ( ( rule__SDomain__NameAssignment_1 ) )
            {
            // InternalSim.g:1647:1: ( ( rule__SDomain__NameAssignment_1 ) )
            // InternalSim.g:1648:2: ( rule__SDomain__NameAssignment_1 )
            {
             before(grammarAccess.getSDomainAccess().getNameAssignment_1()); 
            // InternalSim.g:1649:2: ( rule__SDomain__NameAssignment_1 )
            // InternalSim.g:1649:3: rule__SDomain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SDomain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__1__Impl"


    // $ANTLR start "rule__SDomain__Group__2"
    // InternalSim.g:1657:1: rule__SDomain__Group__2 : rule__SDomain__Group__2__Impl rule__SDomain__Group__3 ;
    public final void rule__SDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1661:1: ( rule__SDomain__Group__2__Impl rule__SDomain__Group__3 )
            // InternalSim.g:1662:2: rule__SDomain__Group__2__Impl rule__SDomain__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SDomain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__2"


    // $ANTLR start "rule__SDomain__Group__2__Impl"
    // InternalSim.g:1669:1: rule__SDomain__Group__2__Impl : ( ( rule__SDomain__ImportsAssignment_2 )* ) ;
    public final void rule__SDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1673:1: ( ( ( rule__SDomain__ImportsAssignment_2 )* ) )
            // InternalSim.g:1674:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            {
            // InternalSim.g:1674:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            // InternalSim.g:1675:2: ( rule__SDomain__ImportsAssignment_2 )*
            {
             before(grammarAccess.getSDomainAccess().getImportsAssignment_2()); 
            // InternalSim.g:1676:2: ( rule__SDomain__ImportsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSim.g:1676:3: rule__SDomain__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SDomain__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSDomainAccess().getImportsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__2__Impl"


    // $ANTLR start "rule__SDomain__Group__3"
    // InternalSim.g:1684:1: rule__SDomain__Group__3 : rule__SDomain__Group__3__Impl ;
    public final void rule__SDomain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1688:1: ( rule__SDomain__Group__3__Impl )
            // InternalSim.g:1689:2: rule__SDomain__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDomain__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__3"


    // $ANTLR start "rule__SDomain__Group__3__Impl"
    // InternalSim.g:1695:1: rule__SDomain__Group__3__Impl : ( ( rule__SDomain__Alternatives_3 )* ) ;
    public final void rule__SDomain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1699:1: ( ( ( rule__SDomain__Alternatives_3 )* ) )
            // InternalSim.g:1700:1: ( ( rule__SDomain__Alternatives_3 )* )
            {
            // InternalSim.g:1700:1: ( ( rule__SDomain__Alternatives_3 )* )
            // InternalSim.g:1701:2: ( rule__SDomain__Alternatives_3 )*
            {
             before(grammarAccess.getSDomainAccess().getAlternatives_3()); 
            // InternalSim.g:1702:2: ( rule__SDomain__Alternatives_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==12||LA30_0==28||LA30_0==30||(LA30_0>=32 && LA30_0<=34)||(LA30_0>=36 && LA30_0<=39)||LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSim.g:1702:3: rule__SDomain__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SDomain__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSDomainAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__Group__3__Impl"


    // $ANTLR start "rule__SImport__Group__0"
    // InternalSim.g:1711:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1715:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSim.g:1716:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SImport__Group__0"


    // $ANTLR start "rule__SImport__Group__0__Impl"
    // InternalSim.g:1723:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1727:1: ( ( 'import' ) )
            // InternalSim.g:1728:1: ( 'import' )
            {
            // InternalSim.g:1728:1: ( 'import' )
            // InternalSim.g:1729:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SImport__Group__0__Impl"


    // $ANTLR start "rule__SImport__Group__1"
    // InternalSim.g:1738:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1742:1: ( rule__SImport__Group__1__Impl )
            // InternalSim.g:1743:2: rule__SImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SImport__Group__1"


    // $ANTLR start "rule__SImport__Group__1__Impl"
    // InternalSim.g:1749:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1753:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSim.g:1754:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSim.g:1754:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSim.g:1755:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSim.g:1756:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSim.g:1756:3: rule__SImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SImport__Group__1__Impl"


    // $ANTLR start "rule__SGrabEnumerationRule__Group__0"
    // InternalSim.g:1765:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1769:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSim.g:1770:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SGrabEnumerationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group__0"


    // $ANTLR start "rule__SGrabEnumerationRule__Group__0__Impl"
    // InternalSim.g:1777:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1781:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1782:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1782:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSim.g:1783:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1784:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSim.g:1784:3: rule__SGrabEnumerationRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabEnumerationRule__Group__1"
    // InternalSim.g:1792:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1796:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSim.g:1797:2: rule__SGrabEnumerationRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group__1"


    // $ANTLR start "rule__SGrabEnumerationRule__Group__1__Impl"
    // InternalSim.g:1803:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1807:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSim.g:1808:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSim.g:1808:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSim.g:1809:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSim.g:1810:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSim.g:1810:3: rule__SGrabEnumerationRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SGrabEnumerationRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__0"
    // InternalSim.g:1819:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1823:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSim.g:1824:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SGrabEnumerationRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__0"


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__0__Impl"
    // InternalSim.g:1831:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1835:1: ( ( 'as' ) )
            // InternalSim.g:1836:1: ( 'as' )
            {
            // InternalSim.g:1836:1: ( 'as' )
            // InternalSim.g:1837:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__0__Impl"


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__1"
    // InternalSim.g:1846:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1850:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl )
            // InternalSim.g:1851:2: rule__SGrabEnumerationRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__1"


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__1__Impl"
    // InternalSim.g:1857:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1861:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:1862:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:1862:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:1863:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:1864:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            // InternalSim.g:1864:3: rule__SGrabEnumerationRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__1__Impl"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group__0"
    // InternalSim.g:1873:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1877:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSim.g:1878:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SGrabEnumerationLiteralRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group__0"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group__0__Impl"
    // InternalSim.g:1885:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1889:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1890:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1890:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSim.g:1891:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1892:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSim.g:1892:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group__1"
    // InternalSim.g:1900:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1904:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSim.g:1905:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group__1"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group__1__Impl"
    // InternalSim.g:1911:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1915:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSim.g:1916:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSim.g:1916:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSim.g:1917:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSim.g:1918:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSim.g:1918:3: rule__SGrabEnumerationLiteralRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SGrabEnumerationLiteralRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__0"
    // InternalSim.g:1927:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1931:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSim.g:1932:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SGrabEnumerationLiteralRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__0"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__0__Impl"
    // InternalSim.g:1939:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1943:1: ( ( 'as' ) )
            // InternalSim.g:1944:1: ( 'as' )
            {
            // InternalSim.g:1944:1: ( 'as' )
            // InternalSim.g:1945:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__0__Impl"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__1"
    // InternalSim.g:1954:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1958:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl )
            // InternalSim.g:1959:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__1"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__1__Impl"
    // InternalSim.g:1965:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1969:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:1970:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:1970:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:1971:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:1972:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            // InternalSim.g:1972:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__1__Impl"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group__0"
    // InternalSim.g:1981:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1985:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSim.g:1986:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SGrabComplexTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group__0"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group__0__Impl"
    // InternalSim.g:1993:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1997:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1998:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1998:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:1999:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2000:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2000:3: rule__SGrabComplexTypeRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group__1"
    // InternalSim.g:2008:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2012:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2013:2: rule__SGrabComplexTypeRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group__1"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group__1__Impl"
    // InternalSim.g:2019:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2023:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2024:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2024:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2025:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2026:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSim.g:2026:3: rule__SGrabComplexTypeRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SGrabComplexTypeRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__0"
    // InternalSim.g:2035:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2039:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSim.g:2040:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SGrabComplexTypeRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__0"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__0__Impl"
    // InternalSim.g:2047:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2051:1: ( ( 'as' ) )
            // InternalSim.g:2052:1: ( 'as' )
            {
            // InternalSim.g:2052:1: ( 'as' )
            // InternalSim.g:2053:2: 'as'
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__0__Impl"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__1"
    // InternalSim.g:2062:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2066:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2067:2: rule__SGrabComplexTypeRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__1"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__1__Impl"
    // InternalSim.g:2073:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2077:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2078:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2078:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2079:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2080:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2080:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__1__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__0"
    // InternalSim.g:2089:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2093:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSim.g:2094:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SMorphComplexTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__0"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__0__Impl"
    // InternalSim.g:2101:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2105:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2106:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2106:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2107:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2108:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2108:3: rule__SMorphComplexTypeRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__0__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__1"
    // InternalSim.g:2116:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2120:1: ( rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 )
            // InternalSim.g:2121:2: rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SMorphComplexTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__1"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__1__Impl"
    // InternalSim.g:2128:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2132:1: ( ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2133:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2133:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2134:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2135:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:2135:3: rule__SMorphComplexTypeRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphComplexTypeRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__1__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__2"
    // InternalSim.g:2143:1: rule__SMorphComplexTypeRule__Group__2 : rule__SMorphComplexTypeRule__Group__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2147:1: ( rule__SMorphComplexTypeRule__Group__2__Impl )
            // InternalSim.g:2148:2: rule__SMorphComplexTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__2"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__2__Impl"
    // InternalSim.g:2154:1: rule__SMorphComplexTypeRule__Group__2__Impl : ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2158:1: ( ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) )
            // InternalSim.g:2159:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            {
            // InternalSim.g:2159:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            // InternalSim.g:2160:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 
            // InternalSim.g:2161:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2161:3: rule__SMorphComplexTypeRule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphComplexTypeRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group__2__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__0"
    // InternalSim.g:2170:1: rule__SMorphComplexTypeRule__Group_1__0 : rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 ;
    public final void rule__SMorphComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2174:1: ( rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 )
            // InternalSim.g:2175:2: rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SMorphComplexTypeRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__0"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__0__Impl"
    // InternalSim.g:2182:1: rule__SMorphComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2186:1: ( ( 'as' ) )
            // InternalSim.g:2187:1: ( 'as' )
            {
            // InternalSim.g:2187:1: ( 'as' )
            // InternalSim.g:2188:2: 'as'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__0__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__1"
    // InternalSim.g:2197:1: rule__SMorphComplexTypeRule__Group_1__1 : rule__SMorphComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2201:1: ( rule__SMorphComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2202:2: rule__SMorphComplexTypeRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__1"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__1__Impl"
    // InternalSim.g:2208:1: rule__SMorphComplexTypeRule__Group_1__1__Impl : ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2212:1: ( ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2213:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2213:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2214:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2215:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2215:3: rule__SMorphComplexTypeRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__1__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__0"
    // InternalSim.g:2224:1: rule__SMorphComplexTypeRule__Group_2__0 : rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 ;
    public final void rule__SMorphComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2228:1: ( rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 )
            // InternalSim.g:2229:2: rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__SMorphComplexTypeRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__0"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__0__Impl"
    // InternalSim.g:2236:1: rule__SMorphComplexTypeRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2240:1: ( ( 'extends' ) )
            // InternalSim.g:2241:1: ( 'extends' )
            {
            // InternalSim.g:2241:1: ( 'extends' )
            // InternalSim.g:2242:2: 'extends'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__0__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__1"
    // InternalSim.g:2251:1: rule__SMorphComplexTypeRule__Group_2__1 : rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 ;
    public final void rule__SMorphComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2255:1: ( rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 )
            // InternalSim.g:2256:2: rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__SMorphComplexTypeRule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__1"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__1__Impl"
    // InternalSim.g:2263:1: rule__SMorphComplexTypeRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2267:1: ( ( '=' ) )
            // InternalSim.g:2268:1: ( '=' )
            {
            // InternalSim.g:2268:1: ( '=' )
            // InternalSim.g:2269:2: '='
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__1__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__2"
    // InternalSim.g:2278:1: rule__SMorphComplexTypeRule__Group_2__2 : rule__SMorphComplexTypeRule__Group_2__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2282:1: ( rule__SMorphComplexTypeRule__Group_2__2__Impl )
            // InternalSim.g:2283:2: rule__SMorphComplexTypeRule__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__2"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__2__Impl"
    // InternalSim.g:2289:1: rule__SMorphComplexTypeRule__Group_2__2__Impl : ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2293:1: ( ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) )
            // InternalSim.g:2294:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSim.g:2294:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            // InternalSim.g:2295:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSim.g:2296:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            // InternalSim.g:2296:3: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__RetypeToAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_2__2__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__0"
    // InternalSim.g:2305:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2309:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSim.g:2310:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SFuseComplexTypeRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__0__Impl"
    // InternalSim.g:2317:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2321:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2322:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2322:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2323:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2324:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2324:3: rule__SFuseComplexTypeRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__0__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__1"
    // InternalSim.g:2332:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2336:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSim.g:2337:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SFuseComplexTypeRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__1"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__1__Impl"
    // InternalSim.g:2344:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2348:1: ( ( 'and' ) )
            // InternalSim.g:2349:1: ( 'and' )
            {
            // InternalSim.g:2349:1: ( 'and' )
            // InternalSim.g:2350:2: 'and'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__1__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__2"
    // InternalSim.g:2359:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2363:1: ( rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 )
            // InternalSim.g:2364:2: rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SFuseComplexTypeRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__2"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__2__Impl"
    // InternalSim.g:2371:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2375:1: ( ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) )
            // InternalSim.g:2376:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            {
            // InternalSim.g:2376:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            // InternalSim.g:2377:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2Assignment_2()); 
            // InternalSim.g:2378:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            // InternalSim.g:2378:3: rule__SFuseComplexTypeRule__Source2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Source2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__2__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__3"
    // InternalSim.g:2386:1: rule__SFuseComplexTypeRule__Group__3 : rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 ;
    public final void rule__SFuseComplexTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2390:1: ( rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 )
            // InternalSim.g:2391:2: rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SFuseComplexTypeRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__3"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__3__Impl"
    // InternalSim.g:2398:1: rule__SFuseComplexTypeRule__Group__3__Impl : ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2402:1: ( ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) )
            // InternalSim.g:2403:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            {
            // InternalSim.g:2403:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            // InternalSim.g:2404:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 
            // InternalSim.g:2405:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:2405:3: rule__SFuseComplexTypeRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SFuseComplexTypeRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__3__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__4"
    // InternalSim.g:2413:1: rule__SFuseComplexTypeRule__Group__4 : rule__SFuseComplexTypeRule__Group__4__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2417:1: ( rule__SFuseComplexTypeRule__Group__4__Impl )
            // InternalSim.g:2418:2: rule__SFuseComplexTypeRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__4"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__4__Impl"
    // InternalSim.g:2424:1: rule__SFuseComplexTypeRule__Group__4__Impl : ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2428:1: ( ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) )
            // InternalSim.g:2429:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            {
            // InternalSim.g:2429:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            // InternalSim.g:2430:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_4()); 
            // InternalSim.g:2431:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:2431:3: rule__SFuseComplexTypeRule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SFuseComplexTypeRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group__4__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__0"
    // InternalSim.g:2440:1: rule__SFuseComplexTypeRule__Group_3__0 : rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 ;
    public final void rule__SFuseComplexTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2444:1: ( rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 )
            // InternalSim.g:2445:2: rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__SFuseComplexTypeRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__0__Impl"
    // InternalSim.g:2452:1: rule__SFuseComplexTypeRule__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2456:1: ( ( 'as' ) )
            // InternalSim.g:2457:1: ( 'as' )
            {
            // InternalSim.g:2457:1: ( 'as' )
            // InternalSim.g:2458:2: 'as'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__0__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__1"
    // InternalSim.g:2467:1: rule__SFuseComplexTypeRule__Group_3__1 : rule__SFuseComplexTypeRule__Group_3__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2471:1: ( rule__SFuseComplexTypeRule__Group_3__1__Impl )
            // InternalSim.g:2472:2: rule__SFuseComplexTypeRule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__1"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__1__Impl"
    // InternalSim.g:2478:1: rule__SFuseComplexTypeRule__Group_3__1__Impl : ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2482:1: ( ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) )
            // InternalSim.g:2483:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            {
            // InternalSim.g:2483:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            // InternalSim.g:2484:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_1()); 
            // InternalSim.g:2485:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            // InternalSim.g:2485:3: rule__SFuseComplexTypeRule__RenameToAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__RenameToAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__1__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__0"
    // InternalSim.g:2494:1: rule__SFuseComplexTypeRule__Group_4__0 : rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 ;
    public final void rule__SFuseComplexTypeRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2498:1: ( rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 )
            // InternalSim.g:2499:2: rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__SFuseComplexTypeRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__0__Impl"
    // InternalSim.g:2506:1: rule__SFuseComplexTypeRule__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2510:1: ( ( 'extends' ) )
            // InternalSim.g:2511:1: ( 'extends' )
            {
            // InternalSim.g:2511:1: ( 'extends' )
            // InternalSim.g:2512:2: 'extends'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__0__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__1"
    // InternalSim.g:2521:1: rule__SFuseComplexTypeRule__Group_4__1 : rule__SFuseComplexTypeRule__Group_4__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2525:1: ( rule__SFuseComplexTypeRule__Group_4__1__Impl )
            // InternalSim.g:2526:2: rule__SFuseComplexTypeRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__1"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__1__Impl"
    // InternalSim.g:2532:1: rule__SFuseComplexTypeRule__Group_4__1__Impl : ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2536:1: ( ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) )
            // InternalSim.g:2537:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            {
            // InternalSim.g:2537:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            // InternalSim.g:2538:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_1()); 
            // InternalSim.g:2539:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            // InternalSim.g:2539:3: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__1__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group__0"
    // InternalSim.g:2548:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2552:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSim.g:2553:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SGrabFeatureRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group__0"


    // $ANTLR start "rule__SGrabFeatureRule__Group__0__Impl"
    // InternalSim.g:2560:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2564:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2565:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2565:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2566:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2567:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2567:3: rule__SGrabFeatureRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group__1"
    // InternalSim.g:2575:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2579:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSim.g:2580:2: rule__SGrabFeatureRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group__1"


    // $ANTLR start "rule__SGrabFeatureRule__Group__1__Impl"
    // InternalSim.g:2586:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2590:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2591:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2591:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSim.g:2592:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2593:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSim.g:2593:3: rule__SGrabFeatureRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SGrabFeatureRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__0"
    // InternalSim.g:2602:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2606:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSim.g:2607:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SGrabFeatureRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__0"


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__0__Impl"
    // InternalSim.g:2614:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2618:1: ( ( 'as' ) )
            // InternalSim.g:2619:1: ( 'as' )
            {
            // InternalSim.g:2619:1: ( 'as' )
            // InternalSim.g:2620:2: 'as'
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__0__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__1"
    // InternalSim.g:2629:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2633:1: ( rule__SGrabFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2634:2: rule__SGrabFeatureRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__1"


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__1__Impl"
    // InternalSim.g:2640:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2644:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2645:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2645:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2646:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2647:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2647:3: rule__SGrabFeatureRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__1__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group__0"
    // InternalSim.g:2656:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2660:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSim.g:2661:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SMorphFeatureRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__0"


    // $ANTLR start "rule__SMorphFeatureRule__Group__0__Impl"
    // InternalSim.g:2668:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2672:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2673:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2673:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2674:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2675:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2675:3: rule__SMorphFeatureRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__0__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group__1"
    // InternalSim.g:2683:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2687:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSim.g:2688:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SMorphFeatureRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__1"


    // $ANTLR start "rule__SMorphFeatureRule__Group__1__Impl"
    // InternalSim.g:2695:1: rule__SMorphFeatureRule__Group__1__Impl : ( ( rule__SMorphFeatureRule__Group_1__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2699:1: ( ( ( rule__SMorphFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2700:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2700:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            // InternalSim.g:2701:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2702:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSim.g:2702:3: rule__SMorphFeatureRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphFeatureRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__1__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group__2"
    // InternalSim.g:2710:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2714:1: ( rule__SMorphFeatureRule__Group__2__Impl )
            // InternalSim.g:2715:2: rule__SMorphFeatureRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__2"


    // $ANTLR start "rule__SMorphFeatureRule__Group__2__Impl"
    // InternalSim.g:2721:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2725:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSim.g:2726:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSim.g:2726:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSim.g:2727:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSim.g:2728:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2728:3: rule__SMorphFeatureRule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphFeatureRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__2__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__0"
    // InternalSim.g:2737:1: rule__SMorphFeatureRule__Group_1__0 : rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 ;
    public final void rule__SMorphFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2741:1: ( rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 )
            // InternalSim.g:2742:2: rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SMorphFeatureRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__0"


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__0__Impl"
    // InternalSim.g:2749:1: rule__SMorphFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2753:1: ( ( 'as' ) )
            // InternalSim.g:2754:1: ( 'as' )
            {
            // InternalSim.g:2754:1: ( 'as' )
            // InternalSim.g:2755:2: 'as'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__0__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__1"
    // InternalSim.g:2764:1: rule__SMorphFeatureRule__Group_1__1 : rule__SMorphFeatureRule__Group_1__1__Impl ;
    public final void rule__SMorphFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2768:1: ( rule__SMorphFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2769:2: rule__SMorphFeatureRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__1"


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__1__Impl"
    // InternalSim.g:2775:1: rule__SMorphFeatureRule__Group_1__1__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2779:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2780:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2780:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2781:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2782:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2782:3: rule__SMorphFeatureRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__1__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__0"
    // InternalSim.g:2791:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2795:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSim.g:2796:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SMorphFeatureRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__0"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__0__Impl"
    // InternalSim.g:2803:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2807:1: ( ( ':' ) )
            // InternalSim.g:2808:1: ( ':' )
            {
            // InternalSim.g:2808:1: ( ':' )
            // InternalSim.g:2809:2: ':'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__0__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__1"
    // InternalSim.g:2818:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2822:1: ( rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 )
            // InternalSim.g:2823:2: rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__SMorphFeatureRule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__1"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__1__Impl"
    // InternalSim.g:2830:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2834:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) )
            // InternalSim.g:2835:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            {
            // InternalSim.g:2835:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            // InternalSim.g:2836:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_1()); 
            // InternalSim.g:2837:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            // InternalSim.g:2837:3: rule__SMorphFeatureRule__RetypeToAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RetypeToAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__1__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__2"
    // InternalSim.g:2845:1: rule__SMorphFeatureRule__Group_2__2 : rule__SMorphFeatureRule__Group_2__2__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2849:1: ( rule__SMorphFeatureRule__Group_2__2__Impl )
            // InternalSim.g:2850:2: rule__SMorphFeatureRule__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__2"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__2__Impl"
    // InternalSim.g:2856:1: rule__SMorphFeatureRule__Group_2__2__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) ;
    public final void rule__SMorphFeatureRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2860:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) )
            // InternalSim.g:2861:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            {
            // InternalSim.g:2861:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            // InternalSim.g:2862:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_2()); 
            // InternalSim.g:2863:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_INT) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalSim.g:2863:3: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphFeatureRule__RemultiplyToAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__2__Impl"


    // $ANTLR start "rule__SAggregate__Group__0"
    // InternalSim.g:2872:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2876:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSim.g:2877:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SAggregate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__0"


    // $ANTLR start "rule__SAggregate__Group__0__Impl"
    // InternalSim.g:2884:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2888:1: ( ( () ) )
            // InternalSim.g:2889:1: ( () )
            {
            // InternalSim.g:2889:1: ( () )
            // InternalSim.g:2890:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSim.g:2891:2: ()
            // InternalSim.g:2891:3: 
            {
            }

             after(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__0__Impl"


    // $ANTLR start "rule__SAggregate__Group__1"
    // InternalSim.g:2899:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2903:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSim.g:2904:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SAggregate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__1"


    // $ANTLR start "rule__SAggregate__Group__1__Impl"
    // InternalSim.g:2911:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2915:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSim.g:2916:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSim.g:2916:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSim.g:2917:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSim.g:2918:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSim.g:2918:3: rule__SAggregate__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSAggregateAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__1__Impl"


    // $ANTLR start "rule__SAggregate__Group__2"
    // InternalSim.g:2926:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2930:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSim.g:2931:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SAggregate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__2"


    // $ANTLR start "rule__SAggregate__Group__2__Impl"
    // InternalSim.g:2938:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2942:1: ( ( '{' ) )
            // InternalSim.g:2943:1: ( '{' )
            {
            // InternalSim.g:2943:1: ( '{' )
            // InternalSim.g:2944:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__2__Impl"


    // $ANTLR start "rule__SAggregate__Group__3"
    // InternalSim.g:2953:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2957:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSim.g:2958:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__SAggregate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__3"


    // $ANTLR start "rule__SAggregate__Group__3__Impl"
    // InternalSim.g:2965:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2969:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSim.g:2970:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSim.g:2970:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSim.g:2971:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSim.g:2972:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28||LA42_0==30||(LA42_0>=32 && LA42_0<=34)||(LA42_0>=36 && LA42_0<=39)||LA42_0==47) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSim.g:2972:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SAggregate__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__3__Impl"


    // $ANTLR start "rule__SAggregate__Group__4"
    // InternalSim.g:2980:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2984:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSim.g:2985:2: rule__SAggregate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__4"


    // $ANTLR start "rule__SAggregate__Group__4__Impl"
    // InternalSim.g:2991:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2995:1: ( ( '}' ) )
            // InternalSim.g:2996:1: ( '}' )
            {
            // InternalSim.g:2996:1: ( '}' )
            // InternalSim.g:2997:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group__4__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_0__0"
    // InternalSim.g:3007:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3011:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSim.g:3012:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__SAggregate__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__0"


    // $ANTLR start "rule__SAggregate__Group_1_0__0__Impl"
    // InternalSim.g:3019:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3023:1: ( ( 'grab' ) )
            // InternalSim.g:3024:1: ( 'grab' )
            {
            // InternalSim.g:3024:1: ( 'grab' )
            // InternalSim.g:3025:2: 'grab'
            {
             before(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__0__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_0__1"
    // InternalSim.g:3034:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3038:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSim.g:3039:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__SAggregate__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__1"


    // $ANTLR start "rule__SAggregate__Group_1_0__1__Impl"
    // InternalSim.g:3046:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3050:1: ( ( 'aggregate' ) )
            // InternalSim.g:3051:1: ( 'aggregate' )
            {
            // InternalSim.g:3051:1: ( 'aggregate' )
            // InternalSim.g:3052:2: 'aggregate'
            {
             before(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__1__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_0__2"
    // InternalSim.g:3061:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3065:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSim.g:3066:2: rule__SAggregate__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__2"


    // $ANTLR start "rule__SAggregate__Group_1_0__2__Impl"
    // InternalSim.g:3072:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3076:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSim.g:3077:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSim.g:3077:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSim.g:3078:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSim.g:3079:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSim.g:3079:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__DeductionRuleAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_0__2__Impl"


    // $ANTLR start "rule__SConstraint__Group__0"
    // InternalSim.g:3088:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3092:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSim.g:3093:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__0"


    // $ANTLR start "rule__SConstraint__Group__0__Impl"
    // InternalSim.g:3100:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3104:1: ( ( 'constraint' ) )
            // InternalSim.g:3105:1: ( 'constraint' )
            {
            // InternalSim.g:3105:1: ( 'constraint' )
            // InternalSim.g:3106:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__0__Impl"


    // $ANTLR start "rule__SConstraint__Group__1"
    // InternalSim.g:3115:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3119:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSim.g:3120:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__1"


    // $ANTLR start "rule__SConstraint__Group__1__Impl"
    // InternalSim.g:3127:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3131:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSim.g:3132:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSim.g:3132:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSim.g:3133:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSim.g:3134:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSim.g:3134:3: rule__SConstraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__1__Impl"


    // $ANTLR start "rule__SConstraint__Group__2"
    // InternalSim.g:3142:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3146:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSim.g:3147:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__SConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__2"


    // $ANTLR start "rule__SConstraint__Group__2__Impl"
    // InternalSim.g:3154:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3158:1: ( ( ':' ) )
            // InternalSim.g:3159:1: ( ':' )
            {
            // InternalSim.g:3159:1: ( ':' )
            // InternalSim.g:3160:2: ':'
            {
             before(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__2__Impl"


    // $ANTLR start "rule__SConstraint__Group__3"
    // InternalSim.g:3169:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3173:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSim.g:3174:2: rule__SConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__3"


    // $ANTLR start "rule__SConstraint__Group__3__Impl"
    // InternalSim.g:3180:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3184:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSim.g:3185:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSim.g:3185:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSim.g:3186:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSim.g:3187:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSim.g:3187:3: rule__SConstraint__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SConstraint__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__Group__3__Impl"


    // $ANTLR start "rule__SPrimitive__Group__0"
    // InternalSim.g:3196:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3200:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSim.g:3201:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__0"


    // $ANTLR start "rule__SPrimitive__Group__0__Impl"
    // InternalSim.g:3208:1: rule__SPrimitive__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3212:1: ( ( 'primitive' ) )
            // InternalSim.g:3213:1: ( 'primitive' )
            {
            // InternalSim.g:3213:1: ( 'primitive' )
            // InternalSim.g:3214:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group__1"
    // InternalSim.g:3223:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3227:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSim.g:3228:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SPrimitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__1"


    // $ANTLR start "rule__SPrimitive__Group__1__Impl"
    // InternalSim.g:3235:1: rule__SPrimitive__Group__1__Impl : ( ( rule__SPrimitive__NameAssignment_1 ) ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3239:1: ( ( ( rule__SPrimitive__NameAssignment_1 ) ) )
            // InternalSim.g:3240:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            {
            // InternalSim.g:3240:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            // InternalSim.g:3241:2: ( rule__SPrimitive__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_1()); 
            // InternalSim.g:3242:2: ( rule__SPrimitive__NameAssignment_1 )
            // InternalSim.g:3242:3: rule__SPrimitive__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group__2"
    // InternalSim.g:3250:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3254:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSim.g:3255:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SPrimitive__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__2"


    // $ANTLR start "rule__SPrimitive__Group__2__Impl"
    // InternalSim.g:3262:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__Alternatives_2 ) ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3266:1: ( ( ( rule__SPrimitive__Alternatives_2 ) ) )
            // InternalSim.g:3267:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            {
            // InternalSim.g:3267:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            // InternalSim.g:3268:2: ( rule__SPrimitive__Alternatives_2 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2()); 
            // InternalSim.g:3269:2: ( rule__SPrimitive__Alternatives_2 )
            // InternalSim.g:3269:3: rule__SPrimitive__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__2__Impl"


    // $ANTLR start "rule__SPrimitive__Group__3"
    // InternalSim.g:3277:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3281:1: ( rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 )
            // InternalSim.g:3282:2: rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__SPrimitive__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__3"


    // $ANTLR start "rule__SPrimitive__Group__3__Impl"
    // InternalSim.g:3289:1: rule__SPrimitive__Group__3__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3293:1: ( ( '{' ) )
            // InternalSim.g:3294:1: ( '{' )
            {
            // InternalSim.g:3294:1: ( '{' )
            // InternalSim.g:3295:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__3__Impl"


    // $ANTLR start "rule__SPrimitive__Group__4"
    // InternalSim.g:3304:1: rule__SPrimitive__Group__4 : rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 ;
    public final void rule__SPrimitive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3308:1: ( rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 )
            // InternalSim.g:3309:2: rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__SPrimitive__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__4"


    // $ANTLR start "rule__SPrimitive__Group__4__Impl"
    // InternalSim.g:3316:1: rule__SPrimitive__Group__4__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) ;
    public final void rule__SPrimitive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3320:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) )
            // InternalSim.g:3321:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            {
            // InternalSim.g:3321:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            // InternalSim.g:3322:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_4()); 
            // InternalSim.g:3323:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==29) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSim.g:3323:3: rule__SPrimitive__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SPrimitive__ConstraintsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__4__Impl"


    // $ANTLR start "rule__SPrimitive__Group__5"
    // InternalSim.g:3331:1: rule__SPrimitive__Group__5 : rule__SPrimitive__Group__5__Impl ;
    public final void rule__SPrimitive__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3335:1: ( rule__SPrimitive__Group__5__Impl )
            // InternalSim.g:3336:2: rule__SPrimitive__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__5"


    // $ANTLR start "rule__SPrimitive__Group__5__Impl"
    // InternalSim.g:3342:1: rule__SPrimitive__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3346:1: ( ( '}' ) )
            // InternalSim.g:3347:1: ( '}' )
            {
            // InternalSim.g:3347:1: ( '}' )
            // InternalSim.g:3348:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group__5__Impl"


    // $ANTLR start "rule__SPrimitive__Group_2_0__0"
    // InternalSim.g:3358:1: rule__SPrimitive__Group_2_0__0 : rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 ;
    public final void rule__SPrimitive__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3362:1: ( rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 )
            // InternalSim.g:3363:2: rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_0__0"


    // $ANTLR start "rule__SPrimitive__Group_2_0__0__Impl"
    // InternalSim.g:3370:1: rule__SPrimitive__Group_2_0__0__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3374:1: ( ( 'redefines' ) )
            // InternalSim.g:3375:1: ( 'redefines' )
            {
            // InternalSim.g:3375:1: ( 'redefines' )
            // InternalSim.g:3376:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_2_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_0__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_2_0__1"
    // InternalSim.g:3385:1: rule__SPrimitive__Group_2_0__1 : rule__SPrimitive__Group_2_0__1__Impl ;
    public final void rule__SPrimitive__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3389:1: ( rule__SPrimitive__Group_2_0__1__Impl )
            // InternalSim.g:3390:2: rule__SPrimitive__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_0__1"


    // $ANTLR start "rule__SPrimitive__Group_2_0__1__Impl"
    // InternalSim.g:3396:1: rule__SPrimitive__Group_2_0__1__Impl : ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) ;
    public final void rule__SPrimitive__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3400:1: ( ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) )
            // InternalSim.g:3401:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            {
            // InternalSim.g:3401:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            // InternalSim.g:3402:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_2_0_1()); 
            // InternalSim.g:3403:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            // InternalSim.g:3403:3: rule__SPrimitive__RedefinesAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__RedefinesAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_0__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_2_1__0"
    // InternalSim.g:3412:1: rule__SPrimitive__Group_2_1__0 : rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 ;
    public final void rule__SPrimitive__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3416:1: ( rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 )
            // InternalSim.g:3417:2: rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_1__0"


    // $ANTLR start "rule__SPrimitive__Group_2_1__0__Impl"
    // InternalSim.g:3424:1: rule__SPrimitive__Group_2_1__0__Impl : ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) ;
    public final void rule__SPrimitive__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3428:1: ( ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) )
            // InternalSim.g:3429:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            {
            // InternalSim.g:3429:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            // InternalSim.g:3430:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2_1_0()); 
            // InternalSim.g:3431:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            // InternalSim.g:3431:3: rule__SPrimitive__Alternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Alternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_1__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_2_1__1"
    // InternalSim.g:3439:1: rule__SPrimitive__Group_2_1__1 : rule__SPrimitive__Group_2_1__1__Impl ;
    public final void rule__SPrimitive__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3443:1: ( rule__SPrimitive__Group_2_1__1__Impl )
            // InternalSim.g:3444:2: rule__SPrimitive__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_1__1"


    // $ANTLR start "rule__SPrimitive__Group_2_1__1__Impl"
    // InternalSim.g:3450:1: rule__SPrimitive__Group_2_1__1__Impl : ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) ;
    public final void rule__SPrimitive__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3454:1: ( ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) )
            // InternalSim.g:3455:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            {
            // InternalSim.g:3455:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            // InternalSim.g:3456:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_2_1_1()); 
            // InternalSim.g:3457:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            // InternalSim.g:3457:3: rule__SPrimitive__RealizesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__RealizesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_2_1__1__Impl"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__0"
    // InternalSim.g:3466:1: rule__SPrimitiveArchetype__Group__0 : rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 ;
    public final void rule__SPrimitiveArchetype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3470:1: ( rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 )
            // InternalSim.g:3471:2: rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitiveArchetype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__0"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__0__Impl"
    // InternalSim.g:3478:1: rule__SPrimitiveArchetype__Group__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitiveArchetype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3482:1: ( ( 'archetype' ) )
            // InternalSim.g:3483:1: ( 'archetype' )
            {
            // InternalSim.g:3483:1: ( 'archetype' )
            // InternalSim.g:3484:2: 'archetype'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getArchetypeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveArchetypeAccess().getArchetypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__0__Impl"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__1"
    // InternalSim.g:3493:1: rule__SPrimitiveArchetype__Group__1 : rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 ;
    public final void rule__SPrimitiveArchetype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3497:1: ( rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 )
            // InternalSim.g:3498:2: rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SPrimitiveArchetype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__1"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__1__Impl"
    // InternalSim.g:3505:1: rule__SPrimitiveArchetype__Group__1__Impl : ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) ;
    public final void rule__SPrimitiveArchetype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3509:1: ( ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) )
            // InternalSim.g:3510:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            {
            // InternalSim.g:3510:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            // InternalSim.g:3511:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getNameAssignment_1()); 
            // InternalSim.g:3512:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            // InternalSim.g:3512:3: rule__SPrimitiveArchetype__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveArchetypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__1__Impl"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__2"
    // InternalSim.g:3520:1: rule__SPrimitiveArchetype__Group__2 : rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 ;
    public final void rule__SPrimitiveArchetype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3524:1: ( rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 )
            // InternalSim.g:3525:2: rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__SPrimitiveArchetype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__2"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__2__Impl"
    // InternalSim.g:3532:1: rule__SPrimitiveArchetype__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrimitiveArchetype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3536:1: ( ( '{' ) )
            // InternalSim.g:3537:1: ( '{' )
            {
            // InternalSim.g:3537:1: ( '{' )
            // InternalSim.g:3538:2: '{'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__2__Impl"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__3"
    // InternalSim.g:3547:1: rule__SPrimitiveArchetype__Group__3 : rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 ;
    public final void rule__SPrimitiveArchetype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3551:1: ( rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 )
            // InternalSim.g:3552:2: rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__SPrimitiveArchetype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__3"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__3__Impl"
    // InternalSim.g:3559:1: rule__SPrimitiveArchetype__Group__3__Impl : ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) ;
    public final void rule__SPrimitiveArchetype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3563:1: ( ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:3564:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:3564:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            // InternalSim.g:3565:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:3566:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSim.g:3566:3: rule__SPrimitiveArchetype__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SPrimitiveArchetype__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__3__Impl"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__4"
    // InternalSim.g:3574:1: rule__SPrimitiveArchetype__Group__4 : rule__SPrimitiveArchetype__Group__4__Impl ;
    public final void rule__SPrimitiveArchetype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3578:1: ( rule__SPrimitiveArchetype__Group__4__Impl )
            // InternalSim.g:3579:2: rule__SPrimitiveArchetype__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitiveArchetype__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__4"


    // $ANTLR start "rule__SPrimitiveArchetype__Group__4__Impl"
    // InternalSim.g:3585:1: rule__SPrimitiveArchetype__Group__4__Impl : ( '}' ) ;
    public final void rule__SPrimitiveArchetype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3589:1: ( ( '}' ) )
            // InternalSim.g:3590:1: ( '}' )
            {
            // InternalSim.g:3590:1: ( '}' )
            // InternalSim.g:3591:2: '}'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__Group__4__Impl"


    // $ANTLR start "rule__SEnumeration__Group__0"
    // InternalSim.g:3601:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3605:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSim.g:3606:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SEnumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__0"


    // $ANTLR start "rule__SEnumeration__Group__0__Impl"
    // InternalSim.g:3613:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3617:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSim.g:3618:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSim.g:3618:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSim.g:3619:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSim.g:3620:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSim.g:3620:3: rule__SEnumeration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group__1"
    // InternalSim.g:3628:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3632:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSim.g:3633:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SEnumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__1"


    // $ANTLR start "rule__SEnumeration__Group__1__Impl"
    // InternalSim.g:3640:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3644:1: ( ( '{' ) )
            // InternalSim.g:3645:1: ( '{' )
            {
            // InternalSim.g:3645:1: ( '{' )
            // InternalSim.g:3646:2: '{'
            {
             before(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group__2"
    // InternalSim.g:3655:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3659:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSim.g:3660:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SEnumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__2"


    // $ANTLR start "rule__SEnumeration__Group__2__Impl"
    // InternalSim.g:3667:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3671:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSim.g:3672:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSim.g:3672:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSim.g:3673:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSim.g:3674:2: ( rule__SEnumeration__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==28||LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSim.g:3674:3: rule__SEnumeration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEnumerationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__2__Impl"


    // $ANTLR start "rule__SEnumeration__Group__3"
    // InternalSim.g:3682:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3686:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSim.g:3687:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__SEnumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__3"


    // $ANTLR start "rule__SEnumeration__Group__3__Impl"
    // InternalSim.g:3694:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3698:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:3699:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:3699:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSim.g:3700:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:3701:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSim.g:3701:3: rule__SEnumeration__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SEnumeration__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__3__Impl"


    // $ANTLR start "rule__SEnumeration__Group__4"
    // InternalSim.g:3709:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3713:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSim.g:3714:2: rule__SEnumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__4"


    // $ANTLR start "rule__SEnumeration__Group__4__Impl"
    // InternalSim.g:3720:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3724:1: ( ( '}' ) )
            // InternalSim.g:3725:1: ( '}' )
            {
            // InternalSim.g:3725:1: ( '}' )
            // InternalSim.g:3726:2: '}'
            {
             before(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__4__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_0__0"
    // InternalSim.g:3736:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3740:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSim.g:3741:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SEnumeration__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__0"


    // $ANTLR start "rule__SEnumeration__Group_0_0__0__Impl"
    // InternalSim.g:3748:1: rule__SEnumeration__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3752:1: ( ( () ) )
            // InternalSim.g:3753:1: ( () )
            {
            // InternalSim.g:3753:1: ( () )
            // InternalSim.g:3754:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 
            // InternalSim.g:3755:2: ()
            // InternalSim.g:3755:3: 
            {
            }

             after(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_0__1"
    // InternalSim.g:3763:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3767:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSim.g:3768:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
            {
            pushFollow(FOLLOW_25);
            rule__SEnumeration__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__1"


    // $ANTLR start "rule__SEnumeration__Group_0_0__1__Impl"
    // InternalSim.g:3775:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3779:1: ( ( 'grab' ) )
            // InternalSim.g:3780:1: ( 'grab' )
            {
            // InternalSim.g:3780:1: ( 'grab' )
            // InternalSim.g:3781:2: 'grab'
            {
             before(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_0__2"
    // InternalSim.g:3790:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3794:1: ( rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 )
            // InternalSim.g:3795:2: rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3
            {
            pushFollow(FOLLOW_3);
            rule__SEnumeration__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__2"


    // $ANTLR start "rule__SEnumeration__Group_0_0__2__Impl"
    // InternalSim.g:3802:1: rule__SEnumeration__Group_0_0__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3806:1: ( ( 'enumeration' ) )
            // InternalSim.g:3807:1: ( 'enumeration' )
            {
            // InternalSim.g:3807:1: ( 'enumeration' )
            // InternalSim.g:3808:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__2__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_0__3"
    // InternalSim.g:3817:1: rule__SEnumeration__Group_0_0__3 : rule__SEnumeration__Group_0_0__3__Impl ;
    public final void rule__SEnumeration__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3821:1: ( rule__SEnumeration__Group_0_0__3__Impl )
            // InternalSim.g:3822:2: rule__SEnumeration__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__3"


    // $ANTLR start "rule__SEnumeration__Group_0_0__3__Impl"
    // InternalSim.g:3828:1: rule__SEnumeration__Group_0_0__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SEnumeration__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3832:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:3833:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:3833:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:3834:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:3835:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:3835:3: rule__SEnumeration__DeductionRuleAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__DeductionRuleAssignment_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__3__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_1__0"
    // InternalSim.g:3844:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3848:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSim.g:3849:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
            {
            pushFollow(FOLLOW_26);
            rule__SEnumeration__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__0"


    // $ANTLR start "rule__SEnumeration__Group_0_1__0__Impl"
    // InternalSim.g:3856:1: rule__SEnumeration__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3860:1: ( ( () ) )
            // InternalSim.g:3861:1: ( () )
            {
            // InternalSim.g:3861:1: ( () )
            // InternalSim.g:3862:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 
            // InternalSim.g:3863:2: ()
            // InternalSim.g:3863:3: 
            {
            }

             after(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_1__1"
    // InternalSim.g:3871:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3875:1: ( rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 )
            // InternalSim.g:3876:2: rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2
            {
            pushFollow(FOLLOW_25);
            rule__SEnumeration__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__1"


    // $ANTLR start "rule__SEnumeration__Group_0_1__1__Impl"
    // InternalSim.g:3883:1: rule__SEnumeration__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3887:1: ( ( 'ditch' ) )
            // InternalSim.g:3888:1: ( 'ditch' )
            {
            // InternalSim.g:3888:1: ( 'ditch' )
            // InternalSim.g:3889:2: 'ditch'
            {
             before(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_1__2"
    // InternalSim.g:3898:1: rule__SEnumeration__Group_0_1__2 : rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 ;
    public final void rule__SEnumeration__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3902:1: ( rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 )
            // InternalSim.g:3903:2: rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3
            {
            pushFollow(FOLLOW_3);
            rule__SEnumeration__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__2"


    // $ANTLR start "rule__SEnumeration__Group_0_1__2__Impl"
    // InternalSim.g:3910:1: rule__SEnumeration__Group_0_1__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3914:1: ( ( 'enumeration' ) )
            // InternalSim.g:3915:1: ( 'enumeration' )
            {
            // InternalSim.g:3915:1: ( 'enumeration' )
            // InternalSim.g:3916:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__2__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_1__3"
    // InternalSim.g:3925:1: rule__SEnumeration__Group_0_1__3 : rule__SEnumeration__Group_0_1__3__Impl ;
    public final void rule__SEnumeration__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3929:1: ( rule__SEnumeration__Group_0_1__3__Impl )
            // InternalSim.g:3930:2: rule__SEnumeration__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__3"


    // $ANTLR start "rule__SEnumeration__Group_0_1__3__Impl"
    // InternalSim.g:3936:1: rule__SEnumeration__Group_0_1__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SEnumeration__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3940:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:3941:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:3941:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:3942:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:3943:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:3943:3: rule__SEnumeration__DeductionRuleAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__DeductionRuleAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__3__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_2__0"
    // InternalSim.g:3952:1: rule__SEnumeration__Group_0_2__0 : rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 ;
    public final void rule__SEnumeration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3956:1: ( rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 )
            // InternalSim.g:3957:2: rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1
            {
            pushFollow(FOLLOW_3);
            rule__SEnumeration__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_2__0"


    // $ANTLR start "rule__SEnumeration__Group_0_2__0__Impl"
    // InternalSim.g:3964:1: rule__SEnumeration__Group_0_2__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3968:1: ( ( 'enumeration' ) )
            // InternalSim.g:3969:1: ( 'enumeration' )
            {
            // InternalSim.g:3969:1: ( 'enumeration' )
            // InternalSim.g:3970:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_2__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_2__1"
    // InternalSim.g:3979:1: rule__SEnumeration__Group_0_2__1 : rule__SEnumeration__Group_0_2__1__Impl ;
    public final void rule__SEnumeration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3983:1: ( rule__SEnumeration__Group_0_2__1__Impl )
            // InternalSim.g:3984:2: rule__SEnumeration__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_2__1"


    // $ANTLR start "rule__SEnumeration__Group_0_2__1__Impl"
    // InternalSim.g:3990:1: rule__SEnumeration__Group_0_2__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) ;
    public final void rule__SEnumeration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3994:1: ( ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:3995:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:3995:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            // InternalSim.g:3996:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:3997:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            // InternalSim.g:3997:3: rule__SEnumeration__NameAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__NameAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_2__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group_2__0"
    // InternalSim.g:4006:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4010:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSim.g:4011:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__SEnumeration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2__0"


    // $ANTLR start "rule__SEnumeration__Group_2__0__Impl"
    // InternalSim.g:4018:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4022:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSim.g:4023:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSim.g:4023:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSim.g:4024:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSim.g:4025:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSim.g:4025:3: rule__SEnumeration__LiteralsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__LiteralsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_2__1"
    // InternalSim.g:4033:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4037:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSim.g:4038:2: rule__SEnumeration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2__1"


    // $ANTLR start "rule__SEnumeration__Group_2__1__Impl"
    // InternalSim.g:4044:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4048:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSim.g:4049:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSim.g:4049:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSim.g:4050:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSim.g:4051:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSim.g:4051:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SEnumeration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group_2_1__0"
    // InternalSim.g:4060:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4064:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSim.g:4065:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
            {
            pushFollow(FOLLOW_29);
            rule__SEnumeration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2_1__0"


    // $ANTLR start "rule__SEnumeration__Group_2_1__0__Impl"
    // InternalSim.g:4072:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4076:1: ( ( ',' ) )
            // InternalSim.g:4077:1: ( ',' )
            {
            // InternalSim.g:4077:1: ( ',' )
            // InternalSim.g:4078:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2_1__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_2_1__1"
    // InternalSim.g:4087:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4091:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSim.g:4092:2: rule__SEnumeration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2_1__1"


    // $ANTLR start "rule__SEnumeration__Group_2_1__1__Impl"
    // InternalSim.g:4098:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4102:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSim.g:4103:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSim.g:4103:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSim.g:4104:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSim.g:4105:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSim.g:4105:3: rule__SEnumeration__LiteralsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__LiteralsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_2_1__1__Impl"


    // $ANTLR start "rule__SLiteral__Group_0__0"
    // InternalSim.g:4114:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4118:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSim.g:4119:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__0"


    // $ANTLR start "rule__SLiteral__Group_0__0__Impl"
    // InternalSim.g:4126:1: rule__SLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4130:1: ( ( () ) )
            // InternalSim.g:4131:1: ( () )
            {
            // InternalSim.g:4131:1: ( () )
            // InternalSim.g:4132:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 
            // InternalSim.g:4133:2: ()
            // InternalSim.g:4133:3: 
            {
            }

             after(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__SLiteral__Group_0__1"
    // InternalSim.g:4141:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4145:1: ( rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 )
            // InternalSim.g:4146:2: rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__SLiteral__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__1"


    // $ANTLR start "rule__SLiteral__Group_0__1__Impl"
    // InternalSim.g:4153:1: rule__SLiteral__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4157:1: ( ( 'grab' ) )
            // InternalSim.g:4158:1: ( 'grab' )
            {
            // InternalSim.g:4158:1: ( 'grab' )
            // InternalSim.g:4159:2: 'grab'
            {
             before(grammarAccess.getSLiteralAccess().getGrabKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getGrabKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__SLiteral__Group_0__2"
    // InternalSim.g:4168:1: rule__SLiteral__Group_0__2 : rule__SLiteral__Group_0__2__Impl ;
    public final void rule__SLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4172:1: ( rule__SLiteral__Group_0__2__Impl )
            // InternalSim.g:4173:2: rule__SLiteral__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__2"


    // $ANTLR start "rule__SLiteral__Group_0__2__Impl"
    // InternalSim.g:4179:1: rule__SLiteral__Group_0__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4183:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:4184:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:4184:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:4185:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:4186:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            // InternalSim.g:4186:3: rule__SLiteral__DeductionRuleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__DeductionRuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__2__Impl"


    // $ANTLR start "rule__SLiteral__Group_1__0"
    // InternalSim.g:4195:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4199:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSim.g:4200:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__SLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__0"


    // $ANTLR start "rule__SLiteral__Group_1__0__Impl"
    // InternalSim.g:4207:1: rule__SLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4211:1: ( ( () ) )
            // InternalSim.g:4212:1: ( () )
            {
            // InternalSim.g:4212:1: ( () )
            // InternalSim.g:4213:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 
            // InternalSim.g:4214:2: ()
            // InternalSim.g:4214:3: 
            {
            }

             after(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__SLiteral__Group_1__1"
    // InternalSim.g:4222:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4226:1: ( rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 )
            // InternalSim.g:4227:2: rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__1"


    // $ANTLR start "rule__SLiteral__Group_1__1__Impl"
    // InternalSim.g:4234:1: rule__SLiteral__Group_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4238:1: ( ( 'ditch' ) )
            // InternalSim.g:4239:1: ( 'ditch' )
            {
            // InternalSim.g:4239:1: ( 'ditch' )
            // InternalSim.g:4240:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__SLiteral__Group_1__2"
    // InternalSim.g:4249:1: rule__SLiteral__Group_1__2 : rule__SLiteral__Group_1__2__Impl ;
    public final void rule__SLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4253:1: ( rule__SLiteral__Group_1__2__Impl )
            // InternalSim.g:4254:2: rule__SLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__2"


    // $ANTLR start "rule__SLiteral__Group_1__2__Impl"
    // InternalSim.g:4260:1: rule__SLiteral__Group_1__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4264:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:4265:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:4265:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:4266:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:4267:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            // InternalSim.g:4267:3: rule__SLiteral__DeductionRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__DeductionRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__SRootType__Group__0"
    // InternalSim.g:4276:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4280:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSim.g:4281:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SRootType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group__0"


    // $ANTLR start "rule__SRootType__Group__0__Impl"
    // InternalSim.g:4288:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4292:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSim.g:4293:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSim.g:4293:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSim.g:4294:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4295:2: ( rule__SRootType__Alternatives_0 )
            // InternalSim.g:4295:3: rule__SRootType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group__0__Impl"


    // $ANTLR start "rule__SRootType__Group__1"
    // InternalSim.g:4303:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4307:1: ( rule__SRootType__Group__1__Impl )
            // InternalSim.g:4308:2: rule__SRootType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group__1"


    // $ANTLR start "rule__SRootType__Group__1__Impl"
    // InternalSim.g:4314:1: rule__SRootType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4318:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:4319:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:4319:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:4320:2: ruleSComplexTypeFeatures
            {
             before(grammarAccess.getSRootTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeFeatures();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__0"
    // InternalSim.g:4330:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4334:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSim.g:4335:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SRootType__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__0"


    // $ANTLR start "rule__SRootType__Group_0_0__0__Impl"
    // InternalSim.g:4342:1: rule__SRootType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4346:1: ( ( () ) )
            // InternalSim.g:4347:1: ( () )
            {
            // InternalSim.g:4347:1: ( () )
            // InternalSim.g:4348:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0()); 
            // InternalSim.g:4349:2: ()
            // InternalSim.g:4349:3: 
            {
            }

             after(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__1"
    // InternalSim.g:4357:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4361:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSim.g:4362:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__1"


    // $ANTLR start "rule__SRootType__Group_0_0__1__Impl"
    // InternalSim.g:4369:1: rule__SRootType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4373:1: ( ( 'grab' ) )
            // InternalSim.g:4374:1: ( 'grab' )
            {
            // InternalSim.g:4374:1: ( 'grab' )
            // InternalSim.g:4375:2: 'grab'
            {
             before(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__2"
    // InternalSim.g:4384:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4388:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSim.g:4389:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__2"


    // $ANTLR start "rule__SRootType__Group_0_0__2__Impl"
    // InternalSim.g:4396:1: rule__SRootType__Group_0_0__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4400:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:4401:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:4401:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:4402:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:4403:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSim.g:4403:3: rule__SRootType__AbstractAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__2__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__3"
    // InternalSim.g:4411:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4415:1: ( rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 )
            // InternalSim.g:4416:2: rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4
            {
            pushFollow(FOLLOW_3);
            rule__SRootType__Group_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__3"


    // $ANTLR start "rule__SRootType__Group_0_0__3__Impl"
    // InternalSim.g:4423:1: rule__SRootType__Group_0_0__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4427:1: ( ( 'root' ) )
            // InternalSim.g:4428:1: ( 'root' )
            {
            // InternalSim.g:4428:1: ( 'root' )
            // InternalSim.g:4429:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__3__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__4"
    // InternalSim.g:4438:1: rule__SRootType__Group_0_0__4 : rule__SRootType__Group_0_0__4__Impl ;
    public final void rule__SRootType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4442:1: ( rule__SRootType__Group_0_0__4__Impl )
            // InternalSim.g:4443:2: rule__SRootType__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__4"


    // $ANTLR start "rule__SRootType__Group_0_0__4__Impl"
    // InternalSim.g:4449:1: rule__SRootType__Group_0_0__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SRootType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4453:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:4454:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:4454:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:4455:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:4456:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:4456:3: rule__SRootType__DeductionRuleAssignment_0_0_4
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_0_4();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__4__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__0"
    // InternalSim.g:4465:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4469:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSim.g:4470:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
            {
            pushFollow(FOLLOW_26);
            rule__SRootType__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__0"


    // $ANTLR start "rule__SRootType__Group_0_1__0__Impl"
    // InternalSim.g:4477:1: rule__SRootType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4481:1: ( ( () ) )
            // InternalSim.g:4482:1: ( () )
            {
            // InternalSim.g:4482:1: ( () )
            // InternalSim.g:4483:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0()); 
            // InternalSim.g:4484:2: ()
            // InternalSim.g:4484:3: 
            {
            }

             after(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__1"
    // InternalSim.g:4492:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4496:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSim.g:4497:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__1"


    // $ANTLR start "rule__SRootType__Group_0_1__1__Impl"
    // InternalSim.g:4504:1: rule__SRootType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4508:1: ( ( 'ditch' ) )
            // InternalSim.g:4509:1: ( 'ditch' )
            {
            // InternalSim.g:4509:1: ( 'ditch' )
            // InternalSim.g:4510:2: 'ditch'
            {
             before(grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__2"
    // InternalSim.g:4519:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4523:1: ( rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 )
            // InternalSim.g:4524:2: rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__2"


    // $ANTLR start "rule__SRootType__Group_0_1__2__Impl"
    // InternalSim.g:4531:1: rule__SRootType__Group_0_1__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4535:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:4536:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:4536:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:4537:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:4538:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSim.g:4538:3: rule__SRootType__AbstractAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__2__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__3"
    // InternalSim.g:4546:1: rule__SRootType__Group_0_1__3 : rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 ;
    public final void rule__SRootType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4550:1: ( rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 )
            // InternalSim.g:4551:2: rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4
            {
            pushFollow(FOLLOW_3);
            rule__SRootType__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__3"


    // $ANTLR start "rule__SRootType__Group_0_1__3__Impl"
    // InternalSim.g:4558:1: rule__SRootType__Group_0_1__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4562:1: ( ( 'root' ) )
            // InternalSim.g:4563:1: ( 'root' )
            {
            // InternalSim.g:4563:1: ( 'root' )
            // InternalSim.g:4564:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__3__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__4"
    // InternalSim.g:4573:1: rule__SRootType__Group_0_1__4 : rule__SRootType__Group_0_1__4__Impl ;
    public final void rule__SRootType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4577:1: ( rule__SRootType__Group_0_1__4__Impl )
            // InternalSim.g:4578:2: rule__SRootType__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__4"


    // $ANTLR start "rule__SRootType__Group_0_1__4__Impl"
    // InternalSim.g:4584:1: rule__SRootType__Group_0_1__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SRootType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4588:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:4589:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:4589:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:4590:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:4591:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:4591:3: rule__SRootType__DeductionRuleAssignment_0_1_4
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__4__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__0"
    // InternalSim.g:4600:1: rule__SRootType__Group_0_2__0 : rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 ;
    public final void rule__SRootType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4604:1: ( rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 )
            // InternalSim.g:4605:2: rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1
            {
            pushFollow(FOLLOW_31);
            rule__SRootType__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__0"


    // $ANTLR start "rule__SRootType__Group_0_2__0__Impl"
    // InternalSim.g:4612:1: rule__SRootType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4616:1: ( ( () ) )
            // InternalSim.g:4617:1: ( () )
            {
            // InternalSim.g:4617:1: ( () )
            // InternalSim.g:4618:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0()); 
            // InternalSim.g:4619:2: ()
            // InternalSim.g:4619:3: 
            {
            }

             after(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__1"
    // InternalSim.g:4627:1: rule__SRootType__Group_0_2__1 : rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 ;
    public final void rule__SRootType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4631:1: ( rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 )
            // InternalSim.g:4632:2: rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__1"


    // $ANTLR start "rule__SRootType__Group_0_2__1__Impl"
    // InternalSim.g:4639:1: rule__SRootType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SRootType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4643:1: ( ( 'morph' ) )
            // InternalSim.g:4644:1: ( 'morph' )
            {
            // InternalSim.g:4644:1: ( 'morph' )
            // InternalSim.g:4645:2: 'morph'
            {
             before(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__2"
    // InternalSim.g:4654:1: rule__SRootType__Group_0_2__2 : rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 ;
    public final void rule__SRootType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4658:1: ( rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 )
            // InternalSim.g:4659:2: rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__2"


    // $ANTLR start "rule__SRootType__Group_0_2__2__Impl"
    // InternalSim.g:4666:1: rule__SRootType__Group_0_2__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SRootType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4670:1: ( ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:4671:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:4671:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:4672:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:4673:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSim.g:4673:3: rule__SRootType__AbstractAssignment_0_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__2__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__3"
    // InternalSim.g:4681:1: rule__SRootType__Group_0_2__3 : rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 ;
    public final void rule__SRootType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4685:1: ( rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 )
            // InternalSim.g:4686:2: rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4
            {
            pushFollow(FOLLOW_3);
            rule__SRootType__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__3"


    // $ANTLR start "rule__SRootType__Group_0_2__3__Impl"
    // InternalSim.g:4693:1: rule__SRootType__Group_0_2__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4697:1: ( ( 'root' ) )
            // InternalSim.g:4698:1: ( 'root' )
            {
            // InternalSim.g:4698:1: ( 'root' )
            // InternalSim.g:4699:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__3__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__4"
    // InternalSim.g:4708:1: rule__SRootType__Group_0_2__4 : rule__SRootType__Group_0_2__4__Impl ;
    public final void rule__SRootType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4712:1: ( rule__SRootType__Group_0_2__4__Impl )
            // InternalSim.g:4713:2: rule__SRootType__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__4"


    // $ANTLR start "rule__SRootType__Group_0_2__4__Impl"
    // InternalSim.g:4719:1: rule__SRootType__Group_0_2__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SRootType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4723:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:4724:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:4724:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:4725:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:4726:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:4726:3: rule__SRootType__DeductionRuleAssignment_0_2_4
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_2_4();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__4__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__0"
    // InternalSim.g:4735:1: rule__SRootType__Group_0_3__0 : rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 ;
    public final void rule__SRootType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4739:1: ( rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 )
            // InternalSim.g:4740:2: rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1
            {
            pushFollow(FOLLOW_32);
            rule__SRootType__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__0"


    // $ANTLR start "rule__SRootType__Group_0_3__0__Impl"
    // InternalSim.g:4747:1: rule__SRootType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4751:1: ( ( () ) )
            // InternalSim.g:4752:1: ( () )
            {
            // InternalSim.g:4752:1: ( () )
            // InternalSim.g:4753:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0()); 
            // InternalSim.g:4754:2: ()
            // InternalSim.g:4754:3: 
            {
            }

             after(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__1"
    // InternalSim.g:4762:1: rule__SRootType__Group_0_3__1 : rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 ;
    public final void rule__SRootType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4766:1: ( rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 )
            // InternalSim.g:4767:2: rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__1"


    // $ANTLR start "rule__SRootType__Group_0_3__1__Impl"
    // InternalSim.g:4774:1: rule__SRootType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SRootType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4778:1: ( ( 'fuse' ) )
            // InternalSim.g:4779:1: ( 'fuse' )
            {
            // InternalSim.g:4779:1: ( 'fuse' )
            // InternalSim.g:4780:2: 'fuse'
            {
             before(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__2"
    // InternalSim.g:4789:1: rule__SRootType__Group_0_3__2 : rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 ;
    public final void rule__SRootType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4793:1: ( rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 )
            // InternalSim.g:4794:2: rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3
            {
            pushFollow(FOLLOW_30);
            rule__SRootType__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__2"


    // $ANTLR start "rule__SRootType__Group_0_3__2__Impl"
    // InternalSim.g:4801:1: rule__SRootType__Group_0_3__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SRootType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4805:1: ( ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:4806:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:4806:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:4807:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:4808:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:4808:3: rule__SRootType__AbstractAssignment_0_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__2__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__3"
    // InternalSim.g:4816:1: rule__SRootType__Group_0_3__3 : rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 ;
    public final void rule__SRootType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4820:1: ( rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 )
            // InternalSim.g:4821:2: rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4
            {
            pushFollow(FOLLOW_3);
            rule__SRootType__Group_0_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__3"


    // $ANTLR start "rule__SRootType__Group_0_3__3__Impl"
    // InternalSim.g:4828:1: rule__SRootType__Group_0_3__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4832:1: ( ( 'root' ) )
            // InternalSim.g:4833:1: ( 'root' )
            {
            // InternalSim.g:4833:1: ( 'root' )
            // InternalSim.g:4834:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__3__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__4"
    // InternalSim.g:4843:1: rule__SRootType__Group_0_3__4 : rule__SRootType__Group_0_3__4__Impl ;
    public final void rule__SRootType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4847:1: ( rule__SRootType__Group_0_3__4__Impl )
            // InternalSim.g:4848:2: rule__SRootType__Group_0_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__4"


    // $ANTLR start "rule__SRootType__Group_0_3__4__Impl"
    // InternalSim.g:4854:1: rule__SRootType__Group_0_3__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SRootType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4858:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:4859:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:4859:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:4860:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:4861:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:4861:3: rule__SRootType__DeductionRuleAssignment_0_3_4
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_3_4();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__4__Impl"


    // $ANTLR start "rule__SRootType__Group_0_4__0"
    // InternalSim.g:4870:1: rule__SRootType__Group_0_4__0 : rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 ;
    public final void rule__SRootType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4874:1: ( rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 )
            // InternalSim.g:4875:2: rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1
            {
            pushFollow(FOLLOW_33);
            rule__SRootType__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__0"


    // $ANTLR start "rule__SRootType__Group_0_4__0__Impl"
    // InternalSim.g:4882:1: rule__SRootType__Group_0_4__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SRootType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4886:1: ( ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:4887:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:4887:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:4888:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:4889:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSim.g:4889:3: rule__SRootType__AbstractAssignment_0_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_4__1"
    // InternalSim.g:4897:1: rule__SRootType__Group_0_4__1 : rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 ;
    public final void rule__SRootType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4901:1: ( rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 )
            // InternalSim.g:4902:2: rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SRootType__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__1"


    // $ANTLR start "rule__SRootType__Group_0_4__1__Impl"
    // InternalSim.g:4909:1: rule__SRootType__Group_0_4__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4913:1: ( ( 'root' ) )
            // InternalSim.g:4914:1: ( 'root' )
            {
            // InternalSim.g:4914:1: ( 'root' )
            // InternalSim.g:4915:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__1__Impl"


    // $ANTLR start "rule__SRootType__Group_0_4__2"
    // InternalSim.g:4924:1: rule__SRootType__Group_0_4__2 : rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 ;
    public final void rule__SRootType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4928:1: ( rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 )
            // InternalSim.g:4929:2: rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3
            {
            pushFollow(FOLLOW_34);
            rule__SRootType__Group_0_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__2"


    // $ANTLR start "rule__SRootType__Group_0_4__2__Impl"
    // InternalSim.g:4936:1: rule__SRootType__Group_0_4__2__Impl : ( ( rule__SRootType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SRootType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4940:1: ( ( ( rule__SRootType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:4941:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:4941:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            // InternalSim.g:4942:2: ( rule__SRootType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:4943:2: ( rule__SRootType__NameAssignment_0_4_2 )
            // InternalSim.g:4943:3: rule__SRootType__NameAssignment_0_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__NameAssignment_0_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getNameAssignment_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__2__Impl"


    // $ANTLR start "rule__SRootType__Group_0_4__3"
    // InternalSim.g:4951:1: rule__SRootType__Group_0_4__3 : rule__SRootType__Group_0_4__3__Impl ;
    public final void rule__SRootType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4955:1: ( rule__SRootType__Group_0_4__3__Impl )
            // InternalSim.g:4956:2: rule__SRootType__Group_0_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__3"


    // $ANTLR start "rule__SRootType__Group_0_4__3__Impl"
    // InternalSim.g:4962:1: rule__SRootType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SRootType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4966:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:4967:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:4967:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:4968:2: ruleSComplexTypeExtends
            {
             before(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeExtends();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_4__3__Impl"


    // $ANTLR start "rule__SDetailType__Group__0"
    // InternalSim.g:4978:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4982:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSim.g:4983:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SDetailType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group__0"


    // $ANTLR start "rule__SDetailType__Group__0__Impl"
    // InternalSim.g:4990:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4994:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSim.g:4995:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSim.g:4995:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSim.g:4996:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4997:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSim.g:4997:3: rule__SDetailType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group__0__Impl"


    // $ANTLR start "rule__SDetailType__Group__1"
    // InternalSim.g:5005:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5009:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSim.g:5010:2: rule__SDetailType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group__1"


    // $ANTLR start "rule__SDetailType__Group__1__Impl"
    // InternalSim.g:5016:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5020:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:5021:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:5021:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:5022:2: ruleSComplexTypeFeatures
            {
             before(grammarAccess.getSDetailTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeFeatures();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__0"
    // InternalSim.g:5032:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5036:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSim.g:5037:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SDetailType__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__0"


    // $ANTLR start "rule__SDetailType__Group_0_0__0__Impl"
    // InternalSim.g:5044:1: rule__SDetailType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5048:1: ( ( () ) )
            // InternalSim.g:5049:1: ( () )
            {
            // InternalSim.g:5049:1: ( () )
            // InternalSim.g:5050:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 
            // InternalSim.g:5051:2: ()
            // InternalSim.g:5051:3: 
            {
            }

             after(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__1"
    // InternalSim.g:5059:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5063:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSim.g:5064:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__1"


    // $ANTLR start "rule__SDetailType__Group_0_0__1__Impl"
    // InternalSim.g:5071:1: rule__SDetailType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5075:1: ( ( 'grab' ) )
            // InternalSim.g:5076:1: ( 'grab' )
            {
            // InternalSim.g:5076:1: ( 'grab' )
            // InternalSim.g:5077:2: 'grab'
            {
             before(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__2"
    // InternalSim.g:5086:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5090:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSim.g:5091:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__2"


    // $ANTLR start "rule__SDetailType__Group_0_0__2__Impl"
    // InternalSim.g:5098:1: rule__SDetailType__Group_0_0__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5102:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:5103:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:5103:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:5104:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:5105:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:5105:3: rule__SDetailType__AbstractAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__2__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__3"
    // InternalSim.g:5113:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5117:1: ( rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 )
            // InternalSim.g:5118:2: rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4
            {
            pushFollow(FOLLOW_3);
            rule__SDetailType__Group_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__3"


    // $ANTLR start "rule__SDetailType__Group_0_0__3__Impl"
    // InternalSim.g:5125:1: rule__SDetailType__Group_0_0__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5129:1: ( ( 'detail' ) )
            // InternalSim.g:5130:1: ( 'detail' )
            {
            // InternalSim.g:5130:1: ( 'detail' )
            // InternalSim.g:5131:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__3__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__4"
    // InternalSim.g:5140:1: rule__SDetailType__Group_0_0__4 : rule__SDetailType__Group_0_0__4__Impl ;
    public final void rule__SDetailType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5144:1: ( rule__SDetailType__Group_0_0__4__Impl )
            // InternalSim.g:5145:2: rule__SDetailType__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__4"


    // $ANTLR start "rule__SDetailType__Group_0_0__4__Impl"
    // InternalSim.g:5151:1: rule__SDetailType__Group_0_0__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SDetailType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5155:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:5156:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:5156:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:5157:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:5158:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:5158:3: rule__SDetailType__DeductionRuleAssignment_0_0_4
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_0_4();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__4__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__0"
    // InternalSim.g:5167:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5171:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSim.g:5172:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
            {
            pushFollow(FOLLOW_26);
            rule__SDetailType__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__0"


    // $ANTLR start "rule__SDetailType__Group_0_1__0__Impl"
    // InternalSim.g:5179:1: rule__SDetailType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5183:1: ( ( () ) )
            // InternalSim.g:5184:1: ( () )
            {
            // InternalSim.g:5184:1: ( () )
            // InternalSim.g:5185:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 
            // InternalSim.g:5186:2: ()
            // InternalSim.g:5186:3: 
            {
            }

             after(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__1"
    // InternalSim.g:5194:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5198:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSim.g:5199:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__1"


    // $ANTLR start "rule__SDetailType__Group_0_1__1__Impl"
    // InternalSim.g:5206:1: rule__SDetailType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5210:1: ( ( 'ditch' ) )
            // InternalSim.g:5211:1: ( 'ditch' )
            {
            // InternalSim.g:5211:1: ( 'ditch' )
            // InternalSim.g:5212:2: 'ditch'
            {
             before(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__2"
    // InternalSim.g:5221:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5225:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSim.g:5226:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__2"


    // $ANTLR start "rule__SDetailType__Group_0_1__2__Impl"
    // InternalSim.g:5233:1: rule__SDetailType__Group_0_1__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5237:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:5238:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:5238:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:5239:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:5240:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:5240:3: rule__SDetailType__AbstractAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__2__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__3"
    // InternalSim.g:5248:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5252:1: ( rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 )
            // InternalSim.g:5253:2: rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4
            {
            pushFollow(FOLLOW_3);
            rule__SDetailType__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__3"


    // $ANTLR start "rule__SDetailType__Group_0_1__3__Impl"
    // InternalSim.g:5260:1: rule__SDetailType__Group_0_1__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5264:1: ( ( 'detail' ) )
            // InternalSim.g:5265:1: ( 'detail' )
            {
            // InternalSim.g:5265:1: ( 'detail' )
            // InternalSim.g:5266:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__3__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__4"
    // InternalSim.g:5275:1: rule__SDetailType__Group_0_1__4 : rule__SDetailType__Group_0_1__4__Impl ;
    public final void rule__SDetailType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5279:1: ( rule__SDetailType__Group_0_1__4__Impl )
            // InternalSim.g:5280:2: rule__SDetailType__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__4"


    // $ANTLR start "rule__SDetailType__Group_0_1__4__Impl"
    // InternalSim.g:5286:1: rule__SDetailType__Group_0_1__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SDetailType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5290:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:5291:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:5291:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:5292:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:5293:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:5293:3: rule__SDetailType__DeductionRuleAssignment_0_1_4
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__4__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__0"
    // InternalSim.g:5302:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5306:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSim.g:5307:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
            {
            pushFollow(FOLLOW_31);
            rule__SDetailType__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__0"


    // $ANTLR start "rule__SDetailType__Group_0_2__0__Impl"
    // InternalSim.g:5314:1: rule__SDetailType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5318:1: ( ( () ) )
            // InternalSim.g:5319:1: ( () )
            {
            // InternalSim.g:5319:1: ( () )
            // InternalSim.g:5320:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 
            // InternalSim.g:5321:2: ()
            // InternalSim.g:5321:3: 
            {
            }

             after(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__1"
    // InternalSim.g:5329:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5333:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSim.g:5334:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__1"


    // $ANTLR start "rule__SDetailType__Group_0_2__1__Impl"
    // InternalSim.g:5341:1: rule__SDetailType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5345:1: ( ( 'morph' ) )
            // InternalSim.g:5346:1: ( 'morph' )
            {
            // InternalSim.g:5346:1: ( 'morph' )
            // InternalSim.g:5347:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__2"
    // InternalSim.g:5356:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5360:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSim.g:5361:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__2"


    // $ANTLR start "rule__SDetailType__Group_0_2__2__Impl"
    // InternalSim.g:5368:1: rule__SDetailType__Group_0_2__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5372:1: ( ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:5373:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:5373:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:5374:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:5375:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSim.g:5375:3: rule__SDetailType__AbstractAssignment_0_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__2__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__3"
    // InternalSim.g:5383:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5387:1: ( rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 )
            // InternalSim.g:5388:2: rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4
            {
            pushFollow(FOLLOW_3);
            rule__SDetailType__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__3"


    // $ANTLR start "rule__SDetailType__Group_0_2__3__Impl"
    // InternalSim.g:5395:1: rule__SDetailType__Group_0_2__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5399:1: ( ( 'detail' ) )
            // InternalSim.g:5400:1: ( 'detail' )
            {
            // InternalSim.g:5400:1: ( 'detail' )
            // InternalSim.g:5401:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__3__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__4"
    // InternalSim.g:5410:1: rule__SDetailType__Group_0_2__4 : rule__SDetailType__Group_0_2__4__Impl ;
    public final void rule__SDetailType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5414:1: ( rule__SDetailType__Group_0_2__4__Impl )
            // InternalSim.g:5415:2: rule__SDetailType__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__4"


    // $ANTLR start "rule__SDetailType__Group_0_2__4__Impl"
    // InternalSim.g:5421:1: rule__SDetailType__Group_0_2__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SDetailType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5425:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5426:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5426:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5427:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5428:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5428:3: rule__SDetailType__DeductionRuleAssignment_0_2_4
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_2_4();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__4__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__0"
    // InternalSim.g:5437:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5441:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSim.g:5442:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
            {
            pushFollow(FOLLOW_32);
            rule__SDetailType__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__0"


    // $ANTLR start "rule__SDetailType__Group_0_3__0__Impl"
    // InternalSim.g:5449:1: rule__SDetailType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5453:1: ( ( () ) )
            // InternalSim.g:5454:1: ( () )
            {
            // InternalSim.g:5454:1: ( () )
            // InternalSim.g:5455:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 
            // InternalSim.g:5456:2: ()
            // InternalSim.g:5456:3: 
            {
            }

             after(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__1"
    // InternalSim.g:5464:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5468:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSim.g:5469:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__1"


    // $ANTLR start "rule__SDetailType__Group_0_3__1__Impl"
    // InternalSim.g:5476:1: rule__SDetailType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5480:1: ( ( 'fuse' ) )
            // InternalSim.g:5481:1: ( 'fuse' )
            {
            // InternalSim.g:5481:1: ( 'fuse' )
            // InternalSim.g:5482:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__2"
    // InternalSim.g:5491:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5495:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSim.g:5496:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
            {
            pushFollow(FOLLOW_35);
            rule__SDetailType__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__2"


    // $ANTLR start "rule__SDetailType__Group_0_3__2__Impl"
    // InternalSim.g:5503:1: rule__SDetailType__Group_0_3__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5507:1: ( ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:5508:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:5508:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:5509:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:5510:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==47) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:5510:3: rule__SDetailType__AbstractAssignment_0_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__2__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__3"
    // InternalSim.g:5518:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5522:1: ( rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 )
            // InternalSim.g:5523:2: rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4
            {
            pushFollow(FOLLOW_3);
            rule__SDetailType__Group_0_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__3"


    // $ANTLR start "rule__SDetailType__Group_0_3__3__Impl"
    // InternalSim.g:5530:1: rule__SDetailType__Group_0_3__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5534:1: ( ( 'detail' ) )
            // InternalSim.g:5535:1: ( 'detail' )
            {
            // InternalSim.g:5535:1: ( 'detail' )
            // InternalSim.g:5536:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__3__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__4"
    // InternalSim.g:5545:1: rule__SDetailType__Group_0_3__4 : rule__SDetailType__Group_0_3__4__Impl ;
    public final void rule__SDetailType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5549:1: ( rule__SDetailType__Group_0_3__4__Impl )
            // InternalSim.g:5550:2: rule__SDetailType__Group_0_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__4"


    // $ANTLR start "rule__SDetailType__Group_0_3__4__Impl"
    // InternalSim.g:5556:1: rule__SDetailType__Group_0_3__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SDetailType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5560:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5561:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5561:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5562:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5563:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5563:3: rule__SDetailType__DeductionRuleAssignment_0_3_4
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_3_4();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__4__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_4__0"
    // InternalSim.g:5572:1: rule__SDetailType__Group_0_4__0 : rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 ;
    public final void rule__SDetailType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5576:1: ( rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 )
            // InternalSim.g:5577:2: rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1
            {
            pushFollow(FOLLOW_36);
            rule__SDetailType__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__0"


    // $ANTLR start "rule__SDetailType__Group_0_4__0__Impl"
    // InternalSim.g:5584:1: rule__SDetailType__Group_0_4__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SDetailType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5588:1: ( ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5589:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5589:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5590:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5591:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==47) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSim.g:5591:3: rule__SDetailType__AbstractAssignment_0_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_4__1"
    // InternalSim.g:5599:1: rule__SDetailType__Group_0_4__1 : rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 ;
    public final void rule__SDetailType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5603:1: ( rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 )
            // InternalSim.g:5604:2: rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SDetailType__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__1"


    // $ANTLR start "rule__SDetailType__Group_0_4__1__Impl"
    // InternalSim.g:5611:1: rule__SDetailType__Group_0_4__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5615:1: ( ( 'detail' ) )
            // InternalSim.g:5616:1: ( 'detail' )
            {
            // InternalSim.g:5616:1: ( 'detail' )
            // InternalSim.g:5617:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__1__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_4__2"
    // InternalSim.g:5626:1: rule__SDetailType__Group_0_4__2 : rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 ;
    public final void rule__SDetailType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5630:1: ( rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 )
            // InternalSim.g:5631:2: rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3
            {
            pushFollow(FOLLOW_34);
            rule__SDetailType__Group_0_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__2"


    // $ANTLR start "rule__SDetailType__Group_0_4__2__Impl"
    // InternalSim.g:5638:1: rule__SDetailType__Group_0_4__2__Impl : ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SDetailType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5642:1: ( ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5643:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5643:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5644:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5645:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            // InternalSim.g:5645:3: rule__SDetailType__NameAssignment_0_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__NameAssignment_0_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__2__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_4__3"
    // InternalSim.g:5653:1: rule__SDetailType__Group_0_4__3 : rule__SDetailType__Group_0_4__3__Impl ;
    public final void rule__SDetailType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5657:1: ( rule__SDetailType__Group_0_4__3__Impl )
            // InternalSim.g:5658:2: rule__SDetailType__Group_0_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__3"


    // $ANTLR start "rule__SDetailType__Group_0_4__3__Impl"
    // InternalSim.g:5664:1: rule__SDetailType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5668:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5669:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5669:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5670:2: ruleSComplexTypeExtends
            {
             before(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeExtends();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_4__3__Impl"


    // $ANTLR start "rule__SComplexTypeExtends__Group__0"
    // InternalSim.g:5680:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5684:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSim.g:5685:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SComplexTypeExtends__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexTypeExtends__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeExtends__Group__0"


    // $ANTLR start "rule__SComplexTypeExtends__Group__0__Impl"
    // InternalSim.g:5692:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5696:1: ( ( 'extends' ) )
            // InternalSim.g:5697:1: ( 'extends' )
            {
            // InternalSim.g:5697:1: ( 'extends' )
            // InternalSim.g:5698:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeExtends__Group__0__Impl"


    // $ANTLR start "rule__SComplexTypeExtends__Group__1"
    // InternalSim.g:5707:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5711:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSim.g:5712:2: rule__SComplexTypeExtends__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SComplexTypeExtends__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeExtends__Group__1"


    // $ANTLR start "rule__SComplexTypeExtends__Group__1__Impl"
    // InternalSim.g:5718:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5722:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSim.g:5723:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSim.g:5723:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSim.g:5724:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSim.g:5725:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSim.g:5725:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SComplexTypeExtends__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeExtends__Group__1__Impl"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__0"
    // InternalSim.g:5734:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5738:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSim.g:5739:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__SComplexTypeFeatures__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexTypeFeatures__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__0"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__0__Impl"
    // InternalSim.g:5746:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5750:1: ( ( '{' ) )
            // InternalSim.g:5751:1: ( '{' )
            {
            // InternalSim.g:5751:1: ( '{' )
            // InternalSim.g:5752:2: '{'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__0__Impl"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__1"
    // InternalSim.g:5761:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5765:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSim.g:5766:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__SComplexTypeFeatures__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexTypeFeatures__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__1"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__1__Impl"
    // InternalSim.g:5773:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5777:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSim.g:5778:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSim.g:5778:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSim.g:5779:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSim.g:5780:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==11||(LA58_0>=15 && LA58_0<=16)||(LA58_0>=28 && LA58_0<=29)||LA58_0==34||LA58_0==37||LA58_0==39||LA58_0==48) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSim.g:5780:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SComplexTypeFeatures__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__1__Impl"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__2"
    // InternalSim.g:5788:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5792:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSim.g:5793:2: rule__SComplexTypeFeatures__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SComplexTypeFeatures__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__2"


    // $ANTLR start "rule__SComplexTypeFeatures__Group__2__Impl"
    // InternalSim.g:5799:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5803:1: ( ( '}' ) )
            // InternalSim.g:5804:1: ( '}' )
            {
            // InternalSim.g:5804:1: ( '}' )
            // InternalSim.g:5805:2: '}'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__Group__2__Impl"


    // $ANTLR start "rule__SAssociation__Group_0__0"
    // InternalSim.g:5815:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5819:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSim.g:5820:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SAssociation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__0"


    // $ANTLR start "rule__SAssociation__Group_0__0__Impl"
    // InternalSim.g:5827:1: rule__SAssociation__Group_0__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5831:1: ( ( () ) )
            // InternalSim.g:5832:1: ( () )
            {
            // InternalSim.g:5832:1: ( () )
            // InternalSim.g:5833:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 
            // InternalSim.g:5834:2: ()
            // InternalSim.g:5834:3: 
            {
            }

             after(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_0__1"
    // InternalSim.g:5842:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5846:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSim.g:5847:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
            {
            pushFollow(FOLLOW_39);
            rule__SAssociation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__1"


    // $ANTLR start "rule__SAssociation__Group_0__1__Impl"
    // InternalSim.g:5854:1: rule__SAssociation__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5858:1: ( ( 'grab' ) )
            // InternalSim.g:5859:1: ( 'grab' )
            {
            // InternalSim.g:5859:1: ( 'grab' )
            // InternalSim.g:5860:2: 'grab'
            {
             before(grammarAccess.getSAssociationAccess().getGrabKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getGrabKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__1__Impl"


    // $ANTLR start "rule__SAssociation__Group_0__2"
    // InternalSim.g:5869:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5873:1: ( rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 )
            // InternalSim.g:5874:2: rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__2"


    // $ANTLR start "rule__SAssociation__Group_0__2__Impl"
    // InternalSim.g:5881:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__Alternatives_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5885:1: ( ( ( rule__SAssociation__Alternatives_0_2 ) ) )
            // InternalSim.g:5886:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            {
            // InternalSim.g:5886:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            // InternalSim.g:5887:2: ( rule__SAssociation__Alternatives_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 
            // InternalSim.g:5888:2: ( rule__SAssociation__Alternatives_0_2 )
            // InternalSim.g:5888:3: rule__SAssociation__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__2__Impl"


    // $ANTLR start "rule__SAssociation__Group_0__3"
    // InternalSim.g:5896:1: rule__SAssociation__Group_0__3 : rule__SAssociation__Group_0__3__Impl ;
    public final void rule__SAssociation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5900:1: ( rule__SAssociation__Group_0__3__Impl )
            // InternalSim.g:5901:2: rule__SAssociation__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__3"


    // $ANTLR start "rule__SAssociation__Group_0__3__Impl"
    // InternalSim.g:5907:1: rule__SAssociation__Group_0__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAssociation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5911:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:5912:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:5912:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:5913:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:5914:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            // InternalSim.g:5914:3: rule__SAssociation__DeductionRuleAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__3__Impl"


    // $ANTLR start "rule__SAssociation__Group_1__0"
    // InternalSim.g:5923:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5927:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSim.g:5928:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SAssociation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__0"


    // $ANTLR start "rule__SAssociation__Group_1__0__Impl"
    // InternalSim.g:5935:1: rule__SAssociation__Group_1__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5939:1: ( ( () ) )
            // InternalSim.g:5940:1: ( () )
            {
            // InternalSim.g:5940:1: ( () )
            // InternalSim.g:5941:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 
            // InternalSim.g:5942:2: ()
            // InternalSim.g:5942:3: 
            {
            }

             after(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_1__1"
    // InternalSim.g:5950:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5954:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSim.g:5955:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__SAssociation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__1"


    // $ANTLR start "rule__SAssociation__Group_1__1__Impl"
    // InternalSim.g:5962:1: rule__SAssociation__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5966:1: ( ( 'morph' ) )
            // InternalSim.g:5967:1: ( 'morph' )
            {
            // InternalSim.g:5967:1: ( 'morph' )
            // InternalSim.g:5968:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__1__Impl"


    // $ANTLR start "rule__SAssociation__Group_1__2"
    // InternalSim.g:5977:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5981:1: ( rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 )
            // InternalSim.g:5982:2: rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__2"


    // $ANTLR start "rule__SAssociation__Group_1__2__Impl"
    // InternalSim.g:5989:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__Alternatives_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5993:1: ( ( ( rule__SAssociation__Alternatives_1_2 ) ) )
            // InternalSim.g:5994:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            {
            // InternalSim.g:5994:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            // InternalSim.g:5995:2: ( rule__SAssociation__Alternatives_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 
            // InternalSim.g:5996:2: ( rule__SAssociation__Alternatives_1_2 )
            // InternalSim.g:5996:3: rule__SAssociation__Alternatives_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__2__Impl"


    // $ANTLR start "rule__SAssociation__Group_1__3"
    // InternalSim.g:6004:1: rule__SAssociation__Group_1__3 : rule__SAssociation__Group_1__3__Impl ;
    public final void rule__SAssociation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6008:1: ( rule__SAssociation__Group_1__3__Impl )
            // InternalSim.g:6009:2: rule__SAssociation__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__3"


    // $ANTLR start "rule__SAssociation__Group_1__3__Impl"
    // InternalSim.g:6015:1: rule__SAssociation__Group_1__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAssociation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6019:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6020:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6020:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6021:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6022:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6022:3: rule__SAssociation__DeductionRuleAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__3__Impl"


    // $ANTLR start "rule__SAssociation__Group_2__0"
    // InternalSim.g:6031:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6035:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSim.g:6036:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SAssociation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__0"


    // $ANTLR start "rule__SAssociation__Group_2__0__Impl"
    // InternalSim.g:6043:1: rule__SAssociation__Group_2__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6047:1: ( ( () ) )
            // InternalSim.g:6048:1: ( () )
            {
            // InternalSim.g:6048:1: ( () )
            // InternalSim.g:6049:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 
            // InternalSim.g:6050:2: ()
            // InternalSim.g:6050:3: 
            {
            }

             after(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_2__1"
    // InternalSim.g:6058:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6062:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSim.g:6063:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
            {
            pushFollow(FOLLOW_39);
            rule__SAssociation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__1"


    // $ANTLR start "rule__SAssociation__Group_2__1__Impl"
    // InternalSim.g:6070:1: rule__SAssociation__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6074:1: ( ( 'ditch' ) )
            // InternalSim.g:6075:1: ( 'ditch' )
            {
            // InternalSim.g:6075:1: ( 'ditch' )
            // InternalSim.g:6076:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__1__Impl"


    // $ANTLR start "rule__SAssociation__Group_2__2"
    // InternalSim.g:6085:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6089:1: ( rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 )
            // InternalSim.g:6090:2: rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__2"


    // $ANTLR start "rule__SAssociation__Group_2__2__Impl"
    // InternalSim.g:6097:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__Alternatives_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6101:1: ( ( ( rule__SAssociation__Alternatives_2_2 ) ) )
            // InternalSim.g:6102:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            {
            // InternalSim.g:6102:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            // InternalSim.g:6103:2: ( rule__SAssociation__Alternatives_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 
            // InternalSim.g:6104:2: ( rule__SAssociation__Alternatives_2_2 )
            // InternalSim.g:6104:3: rule__SAssociation__Alternatives_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__2__Impl"


    // $ANTLR start "rule__SAssociation__Group_2__3"
    // InternalSim.g:6112:1: rule__SAssociation__Group_2__3 : rule__SAssociation__Group_2__3__Impl ;
    public final void rule__SAssociation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6116:1: ( rule__SAssociation__Group_2__3__Impl )
            // InternalSim.g:6117:2: rule__SAssociation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__3"


    // $ANTLR start "rule__SAssociation__Group_2__3__Impl"
    // InternalSim.g:6123:1: rule__SAssociation__Group_2__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAssociation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6127:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6128:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6128:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6129:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6130:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6130:3: rule__SAssociation__DeductionRuleAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__3__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__0"
    // InternalSim.g:6139:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6143:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSim.g:6144:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__SAssociation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__0"


    // $ANTLR start "rule__SAssociation__Group_3__0__Impl"
    // InternalSim.g:6151:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6155:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSim.g:6156:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSim.g:6156:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSim.g:6157:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSim.g:6158:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==48) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSim.g:6158:3: rule__SAssociation__DerivedAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__DerivedAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__1"
    // InternalSim.g:6166:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6170:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSim.g:6171:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__1"


    // $ANTLR start "rule__SAssociation__Group_3__1__Impl"
    // InternalSim.g:6178:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6182:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSim.g:6183:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSim.g:6183:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSim.g:6184:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSim.g:6185:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSim.g:6185:3: rule__SAssociation__Alternatives_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__1__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__2"
    // InternalSim.g:6193:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6197:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSim.g:6198:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__SAssociation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__2"


    // $ANTLR start "rule__SAssociation__Group_3__2__Impl"
    // InternalSim.g:6205:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6209:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSim.g:6210:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSim.g:6210:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSim.g:6211:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSim.g:6212:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSim.g:6212:3: rule__SAssociation__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__2__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__3"
    // InternalSim.g:6220:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6224:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSim.g:6225:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__3"


    // $ANTLR start "rule__SAssociation__Group_3__3__Impl"
    // InternalSim.g:6232:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6236:1: ( ( ':' ) )
            // InternalSim.g:6237:1: ( ':' )
            {
            // InternalSim.g:6237:1: ( ':' )
            // InternalSim.g:6238:2: ':'
            {
             before(grammarAccess.getSAssociationAccess().getColonKeyword_3_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getColonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__3__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__4"
    // InternalSim.g:6247:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6251:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSim.g:6252:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
            {
            pushFollow(FOLLOW_12);
            rule__SAssociation__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__4"


    // $ANTLR start "rule__SAssociation__Group_3__4__Impl"
    // InternalSim.g:6259:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6263:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSim.g:6264:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSim.g:6264:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSim.g:6265:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSim.g:6266:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSim.g:6266:3: rule__SAssociation__TypeAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__TypeAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__4__Impl"


    // $ANTLR start "rule__SAssociation__Group_3__5"
    // InternalSim.g:6274:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6278:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSim.g:6279:2: rule__SAssociation__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__5"


    // $ANTLR start "rule__SAssociation__Group_3__5__Impl"
    // InternalSim.g:6285:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6289:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSim.g:6290:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSim.g:6290:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSim.g:6291:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSim.g:6292:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSim.g:6292:3: rule__SAssociation__MultiplicityAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__MultiplicityAssignment_3_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3__5__Impl"


    // $ANTLR start "rule__SAssociation__Group_3_1_1__0"
    // InternalSim.g:6301:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6305:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSim.g:6306:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
            {
            pushFollow(FOLLOW_41);
            rule__SAssociation__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3_1_1__0"


    // $ANTLR start "rule__SAssociation__Group_3_1_1__0__Impl"
    // InternalSim.g:6313:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6317:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSim.g:6318:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSim.g:6318:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSim.g:6319:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSim.g:6320:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSim.g:6320:3: rule__SAssociation__KindAssignment_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__KindAssignment_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_3_1_1__1"
    // InternalSim.g:6328:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6332:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSim.g:6333:2: rule__SAssociation__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3_1_1__1"


    // $ANTLR start "rule__SAssociation__Group_3_1_1__1__Impl"
    // InternalSim.g:6339:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6343:1: ( ( 'composite' ) )
            // InternalSim.g:6344:1: ( 'composite' )
            {
            // InternalSim.g:6344:1: ( 'composite' )
            // InternalSim.g:6345:2: 'composite'
            {
             before(grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__0"
    // InternalSim.g:6355:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6359:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSim.g:6360:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SAttribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__0"


    // $ANTLR start "rule__SAttribute__Group_0__0__Impl"
    // InternalSim.g:6367:1: rule__SAttribute__Group_0__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6371:1: ( ( () ) )
            // InternalSim.g:6372:1: ( () )
            {
            // InternalSim.g:6372:1: ( () )
            // InternalSim.g:6373:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 
            // InternalSim.g:6374:2: ()
            // InternalSim.g:6374:3: 
            {
            }

             after(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__1"
    // InternalSim.g:6382:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6386:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSim.g:6387:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__1"


    // $ANTLR start "rule__SAttribute__Group_0__1__Impl"
    // InternalSim.g:6394:1: rule__SAttribute__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6398:1: ( ( 'grab' ) )
            // InternalSim.g:6399:1: ( 'grab' )
            {
            // InternalSim.g:6399:1: ( 'grab' )
            // InternalSim.g:6400:2: 'grab'
            {
             before(grammarAccess.getSAttributeAccess().getGrabKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getGrabKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__2"
    // InternalSim.g:6409:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6413:1: ( rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 )
            // InternalSim.g:6414:2: rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__2"


    // $ANTLR start "rule__SAttribute__Group_0__2__Impl"
    // InternalSim.g:6421:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__Alternatives_0_2 )? ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6425:1: ( ( ( rule__SAttribute__Alternatives_0_2 )? ) )
            // InternalSim.g:6426:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            {
            // InternalSim.g:6426:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            // InternalSim.g:6427:2: ( rule__SAttribute__Alternatives_0_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 
            // InternalSim.g:6428:2: ( rule__SAttribute__Alternatives_0_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==17||LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:6428:3: rule__SAttribute__Alternatives_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Alternatives_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__2__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__3"
    // InternalSim.g:6436:1: rule__SAttribute__Group_0__3 : rule__SAttribute__Group_0__3__Impl ;
    public final void rule__SAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6440:1: ( rule__SAttribute__Group_0__3__Impl )
            // InternalSim.g:6441:2: rule__SAttribute__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__3"


    // $ANTLR start "rule__SAttribute__Group_0__3__Impl"
    // InternalSim.g:6447:1: rule__SAttribute__Group_0__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6451:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6452:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6452:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6453:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6454:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6454:3: rule__SAttribute__DeductionRuleAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__3__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__0"
    // InternalSim.g:6463:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6467:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSim.g:6468:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SAttribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__0"


    // $ANTLR start "rule__SAttribute__Group_1__0__Impl"
    // InternalSim.g:6475:1: rule__SAttribute__Group_1__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6479:1: ( ( () ) )
            // InternalSim.g:6480:1: ( () )
            {
            // InternalSim.g:6480:1: ( () )
            // InternalSim.g:6481:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 
            // InternalSim.g:6482:2: ()
            // InternalSim.g:6482:3: 
            {
            }

             after(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__1"
    // InternalSim.g:6490:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6494:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSim.g:6495:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__1"


    // $ANTLR start "rule__SAttribute__Group_1__1__Impl"
    // InternalSim.g:6502:1: rule__SAttribute__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6506:1: ( ( 'morph' ) )
            // InternalSim.g:6507:1: ( 'morph' )
            {
            // InternalSim.g:6507:1: ( 'morph' )
            // InternalSim.g:6508:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__2"
    // InternalSim.g:6517:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6521:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSim.g:6522:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__2"


    // $ANTLR start "rule__SAttribute__Group_1__2__Impl"
    // InternalSim.g:6529:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__Alternatives_1_2 )? ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6533:1: ( ( ( rule__SAttribute__Alternatives_1_2 )? ) )
            // InternalSim.g:6534:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            {
            // InternalSim.g:6534:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            // InternalSim.g:6535:2: ( rule__SAttribute__Alternatives_1_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 
            // InternalSim.g:6536:2: ( rule__SAttribute__Alternatives_1_2 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==17||LA62_0==39) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSim.g:6536:3: rule__SAttribute__Alternatives_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Alternatives_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__2__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__3"
    // InternalSim.g:6544:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6548:1: ( rule__SAttribute__Group_1__3__Impl )
            // InternalSim.g:6549:2: rule__SAttribute__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__3"


    // $ANTLR start "rule__SAttribute__Group_1__3__Impl"
    // InternalSim.g:6555:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6559:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6560:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6560:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6561:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6562:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6562:3: rule__SAttribute__DeductionRuleAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__3__Impl"


    // $ANTLR start "rule__SAttribute__Group_2__0"
    // InternalSim.g:6571:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6575:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSim.g:6576:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SAttribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__0"


    // $ANTLR start "rule__SAttribute__Group_2__0__Impl"
    // InternalSim.g:6583:1: rule__SAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6587:1: ( ( () ) )
            // InternalSim.g:6588:1: ( () )
            {
            // InternalSim.g:6588:1: ( () )
            // InternalSim.g:6589:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 
            // InternalSim.g:6590:2: ()
            // InternalSim.g:6590:3: 
            {
            }

             after(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_2__1"
    // InternalSim.g:6598:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6602:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSim.g:6603:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__1"


    // $ANTLR start "rule__SAttribute__Group_2__1__Impl"
    // InternalSim.g:6610:1: rule__SAttribute__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6614:1: ( ( 'ditch' ) )
            // InternalSim.g:6615:1: ( 'ditch' )
            {
            // InternalSim.g:6615:1: ( 'ditch' )
            // InternalSim.g:6616:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_2__2"
    // InternalSim.g:6625:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6629:1: ( rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 )
            // InternalSim.g:6630:2: rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3
            {
            pushFollow(FOLLOW_42);
            rule__SAttribute__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__2"


    // $ANTLR start "rule__SAttribute__Group_2__2__Impl"
    // InternalSim.g:6637:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__Alternatives_2_2 )? ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6641:1: ( ( ( rule__SAttribute__Alternatives_2_2 )? ) )
            // InternalSim.g:6642:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            {
            // InternalSim.g:6642:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            // InternalSim.g:6643:2: ( rule__SAttribute__Alternatives_2_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 
            // InternalSim.g:6644:2: ( rule__SAttribute__Alternatives_2_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==17||LA63_0==39) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:6644:3: rule__SAttribute__Alternatives_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Alternatives_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__2__Impl"


    // $ANTLR start "rule__SAttribute__Group_2__3"
    // InternalSim.g:6652:1: rule__SAttribute__Group_2__3 : rule__SAttribute__Group_2__3__Impl ;
    public final void rule__SAttribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6656:1: ( rule__SAttribute__Group_2__3__Impl )
            // InternalSim.g:6657:2: rule__SAttribute__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__3"


    // $ANTLR start "rule__SAttribute__Group_2__3__Impl"
    // InternalSim.g:6663:1: rule__SAttribute__Group_2__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAttribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6667:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6668:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6668:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6669:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6670:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6670:3: rule__SAttribute__DeductionRuleAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__3__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__0"
    // InternalSim.g:6679:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6683:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSim.g:6684:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
            {
            pushFollow(FOLLOW_43);
            rule__SAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__0"


    // $ANTLR start "rule__SAttribute__Group_3__0__Impl"
    // InternalSim.g:6691:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6695:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSim.g:6696:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSim.g:6696:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSim.g:6697:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSim.g:6698:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==39) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSim.g:6698:3: rule__SAttribute__DetailAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__1"
    // InternalSim.g:6706:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6710:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSim.g:6711:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__SAttribute__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__1"


    // $ANTLR start "rule__SAttribute__Group_3__1__Impl"
    // InternalSim.g:6718:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6722:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSim.g:6723:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSim.g:6723:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSim.g:6724:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSim.g:6725:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSim.g:6725:3: rule__SAttribute__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__2"
    // InternalSim.g:6733:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6737:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSim.g:6738:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
            {
            pushFollow(FOLLOW_3);
            rule__SAttribute__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__2"


    // $ANTLR start "rule__SAttribute__Group_3__2__Impl"
    // InternalSim.g:6745:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6749:1: ( ( ':' ) )
            // InternalSim.g:6750:1: ( ':' )
            {
            // InternalSim.g:6750:1: ( ':' )
            // InternalSim.g:6751:2: ':'
            {
             before(grammarAccess.getSAttributeAccess().getColonKeyword_3_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__2__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__3"
    // InternalSim.g:6760:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6764:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSim.g:6765:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
            {
            pushFollow(FOLLOW_44);
            rule__SAttribute__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__3"


    // $ANTLR start "rule__SAttribute__Group_3__3__Impl"
    // InternalSim.g:6772:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6776:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSim.g:6777:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSim.g:6777:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSim.g:6778:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSim.g:6779:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSim.g:6779:3: rule__SAttribute__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__TypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__3__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__4"
    // InternalSim.g:6787:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6791:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSim.g:6792:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
            {
            pushFollow(FOLLOW_44);
            rule__SAttribute__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__4"


    // $ANTLR start "rule__SAttribute__Group_3__4__Impl"
    // InternalSim.g:6799:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6803:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSim.g:6804:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSim.g:6804:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSim.g:6805:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSim.g:6806:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==40) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:6806:3: rule__SAttribute__MultiplicityAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__MultiplicityAssignment_3_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__4__Impl"


    // $ANTLR start "rule__SAttribute__Group_3__5"
    // InternalSim.g:6814:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6818:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSim.g:6819:2: rule__SAttribute__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__5"


    // $ANTLR start "rule__SAttribute__Group_3__5__Impl"
    // InternalSim.g:6825:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6829:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSim.g:6830:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSim.g:6830:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSim.g:6831:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSim.g:6832:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==49) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:6832:3: rule__SAttribute__KeyAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__KeyAssignment_3_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_3__5__Impl"


    // $ANTLR start "rule__SQuery__Group_0__0"
    // InternalSim.g:6841:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6845:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSim.g:6846:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__SQuery__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__0"


    // $ANTLR start "rule__SQuery__Group_0__0__Impl"
    // InternalSim.g:6853:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6857:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSim.g:6858:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSim.g:6858:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSim.g:6859:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSim.g:6860:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSim.g:6860:3: rule__SQuery__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0__1"
    // InternalSim.g:6868:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6872:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSim.g:6873:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
            {
            pushFollow(FOLLOW_45);
            rule__SQuery__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__1"


    // $ANTLR start "rule__SQuery__Group_0__1__Impl"
    // InternalSim.g:6880:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6884:1: ( ( '(' ) )
            // InternalSim.g:6885:1: ( '(' )
            {
            // InternalSim.g:6885:1: ( '(' )
            // InternalSim.g:6886:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__1__Impl"


    // $ANTLR start "rule__SQuery__Group_0__2"
    // InternalSim.g:6895:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6899:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSim.g:6900:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
            {
            pushFollow(FOLLOW_46);
            rule__SQuery__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__2"


    // $ANTLR start "rule__SQuery__Group_0__2__Impl"
    // InternalSim.g:6907:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6911:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSim.g:6912:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSim.g:6912:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSim.g:6913:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSim.g:6914:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSim.g:6914:3: rule__SQuery__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__2__Impl"


    // $ANTLR start "rule__SQuery__Group_0__3"
    // InternalSim.g:6922:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6926:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSim.g:6927:2: rule__SQuery__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__3"


    // $ANTLR start "rule__SQuery__Group_0__3__Impl"
    // InternalSim.g:6933:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6937:1: ( ( ')' ) )
            // InternalSim.g:6938:1: ( ')' )
            {
            // InternalSim.g:6938:1: ( ')' )
            // InternalSim.g:6939:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0__3__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_0__0"
    // InternalSim.g:6949:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6953:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSim.g:6954:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SQuery__Group_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__0"


    // $ANTLR start "rule__SQuery__Group_0_0_0__0__Impl"
    // InternalSim.g:6961:1: rule__SQuery__Group_0_0_0__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6965:1: ( ( () ) )
            // InternalSim.g:6966:1: ( () )
            {
            // InternalSim.g:6966:1: ( () )
            // InternalSim.g:6967:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 
            // InternalSim.g:6968:2: ()
            // InternalSim.g:6968:3: 
            {
            }

             after(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_0__1"
    // InternalSim.g:6976:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6980:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSim.g:6981:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
            {
            pushFollow(FOLLOW_47);
            rule__SQuery__Group_0_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__1"


    // $ANTLR start "rule__SQuery__Group_0_0_0__1__Impl"
    // InternalSim.g:6988:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6992:1: ( ( 'grab' ) )
            // InternalSim.g:6993:1: ( 'grab' )
            {
            // InternalSim.g:6993:1: ( 'grab' )
            // InternalSim.g:6994:2: 'grab'
            {
             before(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__1__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_0__2"
    // InternalSim.g:7003:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7007:1: ( rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 )
            // InternalSim.g:7008:2: rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group_0_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__2"


    // $ANTLR start "rule__SQuery__Group_0_0_0__2__Impl"
    // InternalSim.g:7015:1: rule__SQuery__Group_0_0_0__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7019:1: ( ( 'query' ) )
            // InternalSim.g:7020:1: ( 'query' )
            {
            // InternalSim.g:7020:1: ( 'query' )
            // InternalSim.g:7021:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__2__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_0__3"
    // InternalSim.g:7030:1: rule__SQuery__Group_0_0_0__3 : rule__SQuery__Group_0_0_0__3__Impl ;
    public final void rule__SQuery__Group_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7034:1: ( rule__SQuery__Group_0_0_0__3__Impl )
            // InternalSim.g:7035:2: rule__SQuery__Group_0_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__3"


    // $ANTLR start "rule__SQuery__Group_0_0_0__3__Impl"
    // InternalSim.g:7041:1: rule__SQuery__Group_0_0_0__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) ;
    public final void rule__SQuery__Group_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7045:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) )
            // InternalSim.g:7046:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            {
            // InternalSim.g:7046:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            // InternalSim.g:7047:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 
            // InternalSim.g:7048:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            // InternalSim.g:7048:3: rule__SQuery__DeductionRuleAssignment_0_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__DeductionRuleAssignment_0_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__3__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_1__0"
    // InternalSim.g:7057:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7061:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSim.g:7062:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
            {
            pushFollow(FOLLOW_48);
            rule__SQuery__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__0"


    // $ANTLR start "rule__SQuery__Group_0_0_1__0__Impl"
    // InternalSim.g:7069:1: rule__SQuery__Group_0_0_1__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7073:1: ( ( () ) )
            // InternalSim.g:7074:1: ( () )
            {
            // InternalSim.g:7074:1: ( () )
            // InternalSim.g:7075:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 
            // InternalSim.g:7076:2: ()
            // InternalSim.g:7076:3: 
            {
            }

             after(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_1__1"
    // InternalSim.g:7084:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7088:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSim.g:7089:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
            {
            pushFollow(FOLLOW_47);
            rule__SQuery__Group_0_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__1"


    // $ANTLR start "rule__SQuery__Group_0_0_1__1__Impl"
    // InternalSim.g:7096:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7100:1: ( ( 'morph' ) )
            // InternalSim.g:7101:1: ( 'morph' )
            {
            // InternalSim.g:7101:1: ( 'morph' )
            // InternalSim.g:7102:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_1__2"
    // InternalSim.g:7111:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7115:1: ( rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 )
            // InternalSim.g:7116:2: rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group_0_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__2"


    // $ANTLR start "rule__SQuery__Group_0_0_1__2__Impl"
    // InternalSim.g:7123:1: rule__SQuery__Group_0_0_1__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7127:1: ( ( 'query' ) )
            // InternalSim.g:7128:1: ( 'query' )
            {
            // InternalSim.g:7128:1: ( 'query' )
            // InternalSim.g:7129:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__2__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_1__3"
    // InternalSim.g:7138:1: rule__SQuery__Group_0_0_1__3 : rule__SQuery__Group_0_0_1__3__Impl ;
    public final void rule__SQuery__Group_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7142:1: ( rule__SQuery__Group_0_0_1__3__Impl )
            // InternalSim.g:7143:2: rule__SQuery__Group_0_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__3"


    // $ANTLR start "rule__SQuery__Group_0_0_1__3__Impl"
    // InternalSim.g:7149:1: rule__SQuery__Group_0_0_1__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) ;
    public final void rule__SQuery__Group_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7153:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) )
            // InternalSim.g:7154:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            {
            // InternalSim.g:7154:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            // InternalSim.g:7155:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 
            // InternalSim.g:7156:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            // InternalSim.g:7156:3: rule__SQuery__DeductionRuleAssignment_0_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__DeductionRuleAssignment_0_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__3__Impl"


    // $ANTLR start "rule__SQuery__Group_0_2_1__0"
    // InternalSim.g:7165:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7169:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSim.g:7170:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
            {
            pushFollow(FOLLOW_27);
            rule__SQuery__Group_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1__0"


    // $ANTLR start "rule__SQuery__Group_0_2_1__0__Impl"
    // InternalSim.g:7177:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7181:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSim.g:7182:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSim.g:7182:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSim.g:7183:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSim.g:7184:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSim.g:7184:3: rule__SQuery__ParametersAssignment_0_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_0_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_2_1__1"
    // InternalSim.g:7192:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7196:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSim.g:7197:2: rule__SQuery__Group_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1__1"


    // $ANTLR start "rule__SQuery__Group_0_2_1__1__Impl"
    // InternalSim.g:7203:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7207:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSim.g:7208:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSim.g:7208:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSim.g:7209:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSim.g:7210:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==35) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSim.g:7210:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SQuery__Group_0_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_0_2_1_1__0"
    // InternalSim.g:7219:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7223:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSim.g:7224:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
            {
            pushFollow(FOLLOW_49);
            rule__SQuery__Group_0_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1_1__0"


    // $ANTLR start "rule__SQuery__Group_0_2_1_1__0__Impl"
    // InternalSim.g:7231:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7235:1: ( ( ',' ) )
            // InternalSim.g:7236:1: ( ',' )
            {
            // InternalSim.g:7236:1: ( ',' )
            // InternalSim.g:7237:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_2_1_1__1"
    // InternalSim.g:7246:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7250:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSim.g:7251:2: rule__SQuery__Group_0_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1_1__1"


    // $ANTLR start "rule__SQuery__Group_0_2_1_1__1__Impl"
    // InternalSim.g:7257:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7261:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSim.g:7262:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSim.g:7262:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSim.g:7263:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSim.g:7264:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSim.g:7264:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_0_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_2_1_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_1__0"
    // InternalSim.g:7273:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7277:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSim.g:7278:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__SQuery__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__0"


    // $ANTLR start "rule__SQuery__Group_1__0__Impl"
    // InternalSim.g:7285:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7289:1: ( ( 'ditch' ) )
            // InternalSim.g:7290:1: ( 'ditch' )
            {
            // InternalSim.g:7290:1: ( 'ditch' )
            // InternalSim.g:7291:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_1__1"
    // InternalSim.g:7300:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7304:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSim.g:7305:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__1"


    // $ANTLR start "rule__SQuery__Group_1__1__Impl"
    // InternalSim.g:7312:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7316:1: ( ( 'query' ) )
            // InternalSim.g:7317:1: ( 'query' )
            {
            // InternalSim.g:7317:1: ( 'query' )
            // InternalSim.g:7318:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_1__2"
    // InternalSim.g:7327:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7331:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSim.g:7332:2: rule__SQuery__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__2"


    // $ANTLR start "rule__SQuery__Group_1__2__Impl"
    // InternalSim.g:7338:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7342:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7343:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7343:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7344:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7345:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7345:3: rule__SQuery__DeductionRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__DeductionRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_1__2__Impl"


    // $ANTLR start "rule__SQuery__Group_2__0"
    // InternalSim.g:7354:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7358:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSim.g:7359:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__SQuery__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__0"


    // $ANTLR start "rule__SQuery__Group_2__0__Impl"
    // InternalSim.g:7366:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7370:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSim.g:7371:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSim.g:7371:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSim.g:7372:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSim.g:7373:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSim.g:7373:3: rule__SQuery__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__0__Impl"


    // $ANTLR start "rule__SQuery__Group_2__1"
    // InternalSim.g:7381:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7385:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSim.g:7386:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
            {
            pushFollow(FOLLOW_50);
            rule__SQuery__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__1"


    // $ANTLR start "rule__SQuery__Group_2__1__Impl"
    // InternalSim.g:7393:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7397:1: ( ( '(' ) )
            // InternalSim.g:7398:1: ( '(' )
            {
            // InternalSim.g:7398:1: ( '(' )
            // InternalSim.g:7399:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__1__Impl"


    // $ANTLR start "rule__SQuery__Group_2__2"
    // InternalSim.g:7408:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7412:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSim.g:7413:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
            {
            pushFollow(FOLLOW_50);
            rule__SQuery__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__2"


    // $ANTLR start "rule__SQuery__Group_2__2__Impl"
    // InternalSim.g:7420:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7424:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSim.g:7425:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSim.g:7425:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSim.g:7426:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSim.g:7427:2: ( rule__SQuery__Group_2_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==28||LA68_0==34||LA68_0==37) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:7427:3: rule__SQuery__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__2__Impl"


    // $ANTLR start "rule__SQuery__Group_2__3"
    // InternalSim.g:7435:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7439:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSim.g:7440:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
            {
            pushFollow(FOLLOW_18);
            rule__SQuery__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__3"


    // $ANTLR start "rule__SQuery__Group_2__3__Impl"
    // InternalSim.g:7447:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7451:1: ( ( ')' ) )
            // InternalSim.g:7452:1: ( ')' )
            {
            // InternalSim.g:7452:1: ( ')' )
            // InternalSim.g:7453:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__3__Impl"


    // $ANTLR start "rule__SQuery__Group_2__4"
    // InternalSim.g:7462:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7466:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSim.g:7467:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__4"


    // $ANTLR start "rule__SQuery__Group_2__4__Impl"
    // InternalSim.g:7474:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7478:1: ( ( ':' ) )
            // InternalSim.g:7479:1: ( ':' )
            {
            // InternalSim.g:7479:1: ( ':' )
            // InternalSim.g:7480:2: ':'
            {
             before(grammarAccess.getSQueryAccess().getColonKeyword_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getColonKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__4__Impl"


    // $ANTLR start "rule__SQuery__Group_2__5"
    // InternalSim.g:7489:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7493:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSim.g:7494:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
            {
            pushFollow(FOLLOW_51);
            rule__SQuery__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__5"


    // $ANTLR start "rule__SQuery__Group_2__5__Impl"
    // InternalSim.g:7501:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7505:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSim.g:7506:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSim.g:7506:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSim.g:7507:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSim.g:7508:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSim.g:7508:3: rule__SQuery__TypeAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__TypeAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__5__Impl"


    // $ANTLR start "rule__SQuery__Group_2__6"
    // InternalSim.g:7516:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7520:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSim.g:7521:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
            {
            pushFollow(FOLLOW_51);
            rule__SQuery__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__6"


    // $ANTLR start "rule__SQuery__Group_2__6__Impl"
    // InternalSim.g:7528:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7532:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSim.g:7533:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSim.g:7533:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSim.g:7534:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSim.g:7535:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==40) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSim.g:7535:3: rule__SQuery__MultiplicityAssignment_2_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__MultiplicityAssignment_2_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__6__Impl"


    // $ANTLR start "rule__SQuery__Group_2__7"
    // InternalSim.g:7543:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7547:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSim.g:7548:2: rule__SQuery__Group_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__7"


    // $ANTLR start "rule__SQuery__Group_2__7__Impl"
    // InternalSim.g:7554:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7558:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSim.g:7559:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSim.g:7559:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSim.g:7560:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSim.g:7561:2: ( rule__SQuery__Group_2_7__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==43) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:7561:3: rule__SQuery__Group_2_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_2_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getGroup_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2__7__Impl"


    // $ANTLR start "rule__SQuery__Group_2_2__0"
    // InternalSim.g:7570:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7574:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSim.g:7575:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
            {
            pushFollow(FOLLOW_27);
            rule__SQuery__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2__0"


    // $ANTLR start "rule__SQuery__Group_2_2__0__Impl"
    // InternalSim.g:7582:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7586:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSim.g:7587:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSim.g:7587:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSim.g:7588:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSim.g:7589:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSim.g:7589:3: rule__SQuery__ParametersAssignment_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2__0__Impl"


    // $ANTLR start "rule__SQuery__Group_2_2__1"
    // InternalSim.g:7597:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7601:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSim.g:7602:2: rule__SQuery__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2__1"


    // $ANTLR start "rule__SQuery__Group_2_2__1__Impl"
    // InternalSim.g:7608:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7612:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSim.g:7613:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSim.g:7613:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSim.g:7614:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSim.g:7615:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==35) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSim.g:7615:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__SQuery__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

             after(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2__1__Impl"


    // $ANTLR start "rule__SQuery__Group_2_2_1__0"
    // InternalSim.g:7624:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7628:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSim.g:7629:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
            {
            pushFollow(FOLLOW_49);
            rule__SQuery__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2_1__0"


    // $ANTLR start "rule__SQuery__Group_2_2_1__0__Impl"
    // InternalSim.g:7636:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7640:1: ( ( ',' ) )
            // InternalSim.g:7641:1: ( ',' )
            {
            // InternalSim.g:7641:1: ( ',' )
            // InternalSim.g:7642:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_2_2_1__1"
    // InternalSim.g:7651:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7655:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSim.g:7656:2: rule__SQuery__Group_2_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2_1__1"


    // $ANTLR start "rule__SQuery__Group_2_2_1__1__Impl"
    // InternalSim.g:7662:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7666:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSim.g:7667:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSim.g:7667:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSim.g:7668:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSim.g:7669:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSim.g:7669:3: rule__SQuery__ParametersAssignment_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_2_7__0"
    // InternalSim.g:7678:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7682:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSim.g:7683:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
            {
            pushFollow(FOLLOW_19);
            rule__SQuery__Group_2_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_7__0"


    // $ANTLR start "rule__SQuery__Group_2_7__0__Impl"
    // InternalSim.g:7690:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7694:1: ( ( 'returns' ) )
            // InternalSim.g:7695:1: ( 'returns' )
            {
            // InternalSim.g:7695:1: ( 'returns' )
            // InternalSim.g:7696:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_7__0__Impl"


    // $ANTLR start "rule__SQuery__Group_2_7__1"
    // InternalSim.g:7705:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7709:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSim.g:7710:2: rule__SQuery__Group_2_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_7__1"


    // $ANTLR start "rule__SQuery__Group_2_7__1__Impl"
    // InternalSim.g:7716:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7720:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSim.g:7721:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSim.g:7721:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSim.g:7722:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSim.g:7723:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSim.g:7723:3: rule__SQuery__ReturnsAssignment_2_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ReturnsAssignment_2_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_7__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_0__0"
    // InternalSim.g:7732:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7736:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSim.g:7737:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SQueryParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__0"


    // $ANTLR start "rule__SQueryParameter__Group_0__0__Impl"
    // InternalSim.g:7744:1: rule__SQueryParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7748:1: ( ( () ) )
            // InternalSim.g:7749:1: ( () )
            {
            // InternalSim.g:7749:1: ( () )
            // InternalSim.g:7750:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 
            // InternalSim.g:7751:2: ()
            // InternalSim.g:7751:3: 
            {
            }

             after(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_0__1"
    // InternalSim.g:7759:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7763:1: ( rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 )
            // InternalSim.g:7764:2: rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__1"


    // $ANTLR start "rule__SQueryParameter__Group_0__1__Impl"
    // InternalSim.g:7771:1: rule__SQueryParameter__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7775:1: ( ( 'grab' ) )
            // InternalSim.g:7776:1: ( 'grab' )
            {
            // InternalSim.g:7776:1: ( 'grab' )
            // InternalSim.g:7777:2: 'grab'
            {
             before(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_0__2"
    // InternalSim.g:7786:1: rule__SQueryParameter__Group_0__2 : rule__SQueryParameter__Group_0__2__Impl ;
    public final void rule__SQueryParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7790:1: ( rule__SQueryParameter__Group_0__2__Impl )
            // InternalSim.g:7791:2: rule__SQueryParameter__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__2"


    // $ANTLR start "rule__SQueryParameter__Group_0__2__Impl"
    // InternalSim.g:7797:1: rule__SQueryParameter__Group_0__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SQueryParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7801:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:7802:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:7802:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:7803:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:7804:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            // InternalSim.g:7804:3: rule__SQueryParameter__DeductionRuleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__2__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_1__0"
    // InternalSim.g:7813:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7817:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSim.g:7818:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SQueryParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__0"


    // $ANTLR start "rule__SQueryParameter__Group_1__0__Impl"
    // InternalSim.g:7825:1: rule__SQueryParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7829:1: ( ( () ) )
            // InternalSim.g:7830:1: ( () )
            {
            // InternalSim.g:7830:1: ( () )
            // InternalSim.g:7831:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 
            // InternalSim.g:7832:2: ()
            // InternalSim.g:7832:3: 
            {
            }

             after(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_1__1"
    // InternalSim.g:7840:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7844:1: ( rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 )
            // InternalSim.g:7845:2: rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__1"


    // $ANTLR start "rule__SQueryParameter__Group_1__1__Impl"
    // InternalSim.g:7852:1: rule__SQueryParameter__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7856:1: ( ( 'morph' ) )
            // InternalSim.g:7857:1: ( 'morph' )
            {
            // InternalSim.g:7857:1: ( 'morph' )
            // InternalSim.g:7858:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_1__2"
    // InternalSim.g:7867:1: rule__SQueryParameter__Group_1__2 : rule__SQueryParameter__Group_1__2__Impl ;
    public final void rule__SQueryParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7871:1: ( rule__SQueryParameter__Group_1__2__Impl )
            // InternalSim.g:7872:2: rule__SQueryParameter__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__2"


    // $ANTLR start "rule__SQueryParameter__Group_1__2__Impl"
    // InternalSim.g:7878:1: rule__SQueryParameter__Group_1__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQueryParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7882:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7883:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7883:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7884:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7885:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7885:3: rule__SQueryParameter__DeductionRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__2__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__0"
    // InternalSim.g:7894:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7898:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSim.g:7899:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__SQueryParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__0"


    // $ANTLR start "rule__SQueryParameter__Group_2__0__Impl"
    // InternalSim.g:7906:1: rule__SQueryParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7910:1: ( ( () ) )
            // InternalSim.g:7911:1: ( () )
            {
            // InternalSim.g:7911:1: ( () )
            // InternalSim.g:7912:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 
            // InternalSim.g:7913:2: ()
            // InternalSim.g:7913:3: 
            {
            }

             after(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__1"
    // InternalSim.g:7921:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7925:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSim.g:7926:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__1"


    // $ANTLR start "rule__SQueryParameter__Group_2__1__Impl"
    // InternalSim.g:7933:1: rule__SQueryParameter__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7937:1: ( ( 'ditch' ) )
            // InternalSim.g:7938:1: ( 'ditch' )
            {
            // InternalSim.g:7938:1: ( 'ditch' )
            // InternalSim.g:7939:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__2"
    // InternalSim.g:7948:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7952:1: ( rule__SQueryParameter__Group_2__2__Impl )
            // InternalSim.g:7953:2: rule__SQueryParameter__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__2"


    // $ANTLR start "rule__SQueryParameter__Group_2__2__Impl"
    // InternalSim.g:7959:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7963:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) )
            // InternalSim.g:7964:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSim.g:7964:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            // InternalSim.g:7965:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSim.g:7966:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            // InternalSim.g:7966:3: rule__SQueryParameter__DeductionRuleAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__2__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_3__0"
    // InternalSim.g:7975:1: rule__SQueryParameter__Group_3__0 : rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 ;
    public final void rule__SQueryParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7979:1: ( rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 )
            // InternalSim.g:7980:2: rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__SQueryParameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__0"


    // $ANTLR start "rule__SQueryParameter__Group_3__0__Impl"
    // InternalSim.g:7987:1: rule__SQueryParameter__Group_3__0__Impl : ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) ;
    public final void rule__SQueryParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7991:1: ( ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) )
            // InternalSim.g:7992:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            {
            // InternalSim.g:7992:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            // InternalSim.g:7993:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 
            // InternalSim.g:7994:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            // InternalSim.g:7994:3: rule__SQueryParameter__NameAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_3__1"
    // InternalSim.g:8002:1: rule__SQueryParameter__Group_3__1 : rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 ;
    public final void rule__SQueryParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8006:1: ( rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 )
            // InternalSim.g:8007:2: rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__1"


    // $ANTLR start "rule__SQueryParameter__Group_3__1__Impl"
    // InternalSim.g:8014:1: rule__SQueryParameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8018:1: ( ( ':' ) )
            // InternalSim.g:8019:1: ( ':' )
            {
            // InternalSim.g:8019:1: ( ':' )
            // InternalSim.g:8020:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_3__2"
    // InternalSim.g:8029:1: rule__SQueryParameter__Group_3__2 : rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 ;
    public final void rule__SQueryParameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8033:1: ( rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 )
            // InternalSim.g:8034:2: rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__SQueryParameter__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__2"


    // $ANTLR start "rule__SQueryParameter__Group_3__2__Impl"
    // InternalSim.g:8041:1: rule__SQueryParameter__Group_3__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) ;
    public final void rule__SQueryParameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8045:1: ( ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) )
            // InternalSim.g:8046:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            {
            // InternalSim.g:8046:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            // InternalSim.g:8047:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 
            // InternalSim.g:8048:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            // InternalSim.g:8048:3: rule__SQueryParameter__TypeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__TypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__2__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_3__3"
    // InternalSim.g:8056:1: rule__SQueryParameter__Group_3__3 : rule__SQueryParameter__Group_3__3__Impl ;
    public final void rule__SQueryParameter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8060:1: ( rule__SQueryParameter__Group_3__3__Impl )
            // InternalSim.g:8061:2: rule__SQueryParameter__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__3"


    // $ANTLR start "rule__SQueryParameter__Group_3__3__Impl"
    // InternalSim.g:8067:1: rule__SQueryParameter__Group_3__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) ;
    public final void rule__SQueryParameter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8071:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) )
            // InternalSim.g:8072:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            {
            // InternalSim.g:8072:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            // InternalSim.g:8073:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 
            // InternalSim.g:8074:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==40) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:8074:3: rule__SQueryParameter__MultiplicityAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__MultiplicityAssignment_3_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_3__3__Impl"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__0"
    // InternalSim.g:8083:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8087:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSim.g:8088:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__SQualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__0__Impl"
    // InternalSim.g:8095:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8099:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8100:1: ( ruleSQualifiedName )
            {
            // InternalSim.g:8100:1: ( ruleSQualifiedName )
            // InternalSim.g:8101:2: ruleSQualifiedName
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSQualifiedNameWithWildcardAccess().getSQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__1"
    // InternalSim.g:8110:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8114:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSim.g:8115:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__1__Impl"
    // InternalSim.g:8121:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8125:1: ( ( ( '.*' )? ) )
            // InternalSim.g:8126:1: ( ( '.*' )? )
            {
            // InternalSim.g:8126:1: ( ( '.*' )? )
            // InternalSim.g:8127:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSim.g:8128:2: ( '.*' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==44) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSim.g:8128:3: '.*'
                    {
                    match(input,44,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__SQualifiedName__Group__0"
    // InternalSim.g:8137:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8141:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSim.g:8142:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__SQualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group__0"


    // $ANTLR start "rule__SQualifiedName__Group__0__Impl"
    // InternalSim.g:8149:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8153:1: ( ( RULE_ID ) )
            // InternalSim.g:8154:1: ( RULE_ID )
            {
            // InternalSim.g:8154:1: ( RULE_ID )
            // InternalSim.g:8155:2: RULE_ID
            {
             before(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__SQualifiedName__Group__1"
    // InternalSim.g:8164:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8168:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSim.g:8169:2: rule__SQualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group__1"


    // $ANTLR start "rule__SQualifiedName__Group__1__Impl"
    // InternalSim.g:8175:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8179:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSim.g:8180:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSim.g:8180:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSim.g:8181:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSim.g:8182:2: ( rule__SQualifiedName__Group_1__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==45) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalSim.g:8182:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__SQualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

             after(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__SQualifiedName__Group_1__0"
    // InternalSim.g:8191:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8195:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSim.g:8196:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SQualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group_1__0"


    // $ANTLR start "rule__SQualifiedName__Group_1__0__Impl"
    // InternalSim.g:8203:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8207:1: ( ( '.' ) )
            // InternalSim.g:8208:1: ( '.' )
            {
            // InternalSim.g:8208:1: ( '.' )
            // InternalSim.g:8209:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__SQualifiedName__Group_1__1"
    // InternalSim.g:8218:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8222:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSim.g:8223:2: rule__SQualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group_1__1"


    // $ANTLR start "rule__SQualifiedName__Group_1__1__Impl"
    // InternalSim.g:8229:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8233:1: ( ( RULE_ID ) )
            // InternalSim.g:8234:1: ( RULE_ID )
            {
            // InternalSim.g:8234:1: ( RULE_ID )
            // InternalSim.g:8235:2: RULE_ID
            {
             before(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SMultiplicity__Group__0"
    // InternalSim.g:8245:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8249:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSim.g:8250:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__SMultiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__0"


    // $ANTLR start "rule__SMultiplicity__Group__0__Impl"
    // InternalSim.g:8257:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8261:1: ( ( '(' ) )
            // InternalSim.g:8262:1: ( '(' )
            {
            // InternalSim.g:8262:1: ( '(' )
            // InternalSim.g:8263:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__0__Impl"


    // $ANTLR start "rule__SMultiplicity__Group__1"
    // InternalSim.g:8272:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8276:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSim.g:8277:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__SMultiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__1"


    // $ANTLR start "rule__SMultiplicity__Group__1__Impl"
    // InternalSim.g:8284:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8288:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSim.g:8289:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSim.g:8289:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSim.g:8290:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSim.g:8291:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSim.g:8291:3: rule__SMultiplicity__MinOccursAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SMultiplicity__MinOccursAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__1__Impl"


    // $ANTLR start "rule__SMultiplicity__Group__2"
    // InternalSim.g:8299:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8303:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSim.g:8304:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__SMultiplicity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__2"


    // $ANTLR start "rule__SMultiplicity__Group__2__Impl"
    // InternalSim.g:8311:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8315:1: ( ( '..' ) )
            // InternalSim.g:8316:1: ( '..' )
            {
            // InternalSim.g:8316:1: ( '..' )
            // InternalSim.g:8317:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__2__Impl"


    // $ANTLR start "rule__SMultiplicity__Group__3"
    // InternalSim.g:8326:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8330:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSim.g:8331:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__SMultiplicity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__3"


    // $ANTLR start "rule__SMultiplicity__Group__3__Impl"
    // InternalSim.g:8338:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8342:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSim.g:8343:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSim.g:8343:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSim.g:8344:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSim.g:8345:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSim.g:8345:3: rule__SMultiplicity__MaxOccursAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SMultiplicity__MaxOccursAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__3__Impl"


    // $ANTLR start "rule__SMultiplicity__Group__4"
    // InternalSim.g:8353:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8357:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSim.g:8358:2: rule__SMultiplicity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMultiplicity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__4"


    // $ANTLR start "rule__SMultiplicity__Group__4__Impl"
    // InternalSim.g:8364:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8368:1: ( ( ')' ) )
            // InternalSim.g:8369:1: ( ')' )
            {
            // InternalSim.g:8369:1: ( ')' )
            // InternalSim.g:8370:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__Group__4__Impl"


    // $ANTLR start "rule__SDomain__NameAssignment_1"
    // InternalSim.g:8380:1: rule__SDomain__NameAssignment_1 : ( ruleSQualifiedName ) ;
    public final void rule__SDomain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8384:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8385:2: ( ruleSQualifiedName )
            {
            // InternalSim.g:8385:2: ( ruleSQualifiedName )
            // InternalSim.g:8386:3: ruleSQualifiedName
            {
             before(grammarAccess.getSDomainAccess().getNameSQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSDomainAccess().getNameSQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__NameAssignment_1"


    // $ANTLR start "rule__SDomain__ImportsAssignment_2"
    // InternalSim.g:8395:1: rule__SDomain__ImportsAssignment_2 : ( ruleSImport ) ;
    public final void rule__SDomain__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8399:1: ( ( ruleSImport ) )
            // InternalSim.g:8400:2: ( ruleSImport )
            {
            // InternalSim.g:8400:2: ( ruleSImport )
            // InternalSim.g:8401:3: ruleSImport
            {
             before(grammarAccess.getSDomainAccess().getImportsSImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSImport();

            state._fsp--;

             after(grammarAccess.getSDomainAccess().getImportsSImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__ImportsAssignment_2"


    // $ANTLR start "rule__SDomain__TypesAssignment_3_0"
    // InternalSim.g:8410:1: rule__SDomain__TypesAssignment_3_0 : ( ruleSType ) ;
    public final void rule__SDomain__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8414:1: ( ( ruleSType ) )
            // InternalSim.g:8415:2: ( ruleSType )
            {
            // InternalSim.g:8415:2: ( ruleSType )
            // InternalSim.g:8416:3: ruleSType
            {
             before(grammarAccess.getSDomainAccess().getTypesSTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSType();

            state._fsp--;

             after(grammarAccess.getSDomainAccess().getTypesSTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__TypesAssignment_3_0"


    // $ANTLR start "rule__SDomain__AggregatesAssignment_3_1"
    // InternalSim.g:8425:1: rule__SDomain__AggregatesAssignment_3_1 : ( ruleSAggregate ) ;
    public final void rule__SDomain__AggregatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8429:1: ( ( ruleSAggregate ) )
            // InternalSim.g:8430:2: ( ruleSAggregate )
            {
            // InternalSim.g:8430:2: ( ruleSAggregate )
            // InternalSim.g:8431:3: ruleSAggregate
            {
             before(grammarAccess.getSDomainAccess().getAggregatesSAggregateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSAggregate();

            state._fsp--;

             after(grammarAccess.getSDomainAccess().getAggregatesSAggregateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomain__AggregatesAssignment_3_1"


    // $ANTLR start "rule__SImport__ImportedNamespaceAssignment_1"
    // InternalSim.g:8440:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8444:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:8445:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:8445:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSim.g:8446:3: ruleSQualifiedNameWithWildcard
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getSImportAccess().getImportedNamespaceSQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__SGrabAggregateRule__SourceAssignment"
    // InternalSim.g:8455:1: rule__SGrabAggregateRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8459:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8460:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8460:2: ( ( RULE_ID ) )
            // InternalSim.g:8461:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSim.g:8462:3: ( RULE_ID )
            // InternalSim.g:8463:4: RULE_ID
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabAggregateRule__SourceAssignment"


    // $ANTLR start "rule__SGrabEnumerationRule__SourceAssignment_0"
    // InternalSim.g:8474:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8478:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8479:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8479:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8480:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSim.g:8481:3: ( ruleSQualifiedName )
            // InternalSim.g:8482:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__SourceAssignment_0"


    // $ANTLR start "rule__SGrabEnumerationRule__RenameToAssignment_1_1"
    // InternalSim.g:8493:1: rule__SGrabEnumerationRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8497:1: ( ( RULE_ID ) )
            // InternalSim.g:8498:2: ( RULE_ID )
            {
            // InternalSim.g:8498:2: ( RULE_ID )
            // InternalSim.g:8499:3: RULE_ID
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SDitchEnumerationRule__SourceAssignment"
    // InternalSim.g:8508:1: rule__SDitchEnumerationRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8512:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8513:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8513:2: ( ( RULE_ID ) )
            // InternalSim.g:8514:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8515:3: ( RULE_ID )
            // InternalSim.g:8516:4: RULE_ID
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDitchEnumerationRule__SourceAssignment"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__SourceAssignment_0"
    // InternalSim.g:8527:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8531:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8532:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8532:2: ( ( RULE_ID ) )
            // InternalSim.g:8533:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSim.g:8534:3: ( RULE_ID )
            // InternalSim.g:8535:4: RULE_ID
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__SourceAssignment_0"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1"
    // InternalSim.g:8546:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8550:1: ( ( RULE_ID ) )
            // InternalSim.g:8551:2: ( RULE_ID )
            {
            // InternalSim.g:8551:2: ( RULE_ID )
            // InternalSim.g:8552:3: RULE_ID
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SDitchEnumerationLiteralRule__SourceAssignment"
    // InternalSim.g:8561:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8565:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8566:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8566:2: ( ( RULE_ID ) )
            // InternalSim.g:8567:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSim.g:8568:3: ( RULE_ID )
            // InternalSim.g:8569:4: RULE_ID
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDitchEnumerationLiteralRule__SourceAssignment"


    // $ANTLR start "rule__SGrabComplexTypeRule__SourceAssignment_0"
    // InternalSim.g:8580:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8584:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8585:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8585:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8586:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8587:3: ( ruleSQualifiedName )
            // InternalSim.g:8588:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__SourceAssignment_0"


    // $ANTLR start "rule__SGrabComplexTypeRule__RenameToAssignment_1_1"
    // InternalSim.g:8599:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8603:1: ( ( RULE_ID ) )
            // InternalSim.g:8604:2: ( RULE_ID )
            {
            // InternalSim.g:8604:2: ( RULE_ID )
            // InternalSim.g:8605:3: RULE_ID
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SDitchComplexTypeRule__SourceAssignment"
    // InternalSim.g:8614:1: rule__SDitchComplexTypeRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchComplexTypeRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8618:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8619:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8619:2: ( ( RULE_ID ) )
            // InternalSim.g:8620:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8621:3: ( RULE_ID )
            // InternalSim.g:8622:4: RULE_ID
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDitchComplexTypeRule__SourceAssignment"


    // $ANTLR start "rule__SMorphComplexTypeRule__SourceAssignment_0"
    // InternalSim.g:8633:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8637:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8638:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8638:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8639:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8640:3: ( ruleSQualifiedName )
            // InternalSim.g:8641:4: ruleSQualifiedName
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__SourceAssignment_0"


    // $ANTLR start "rule__SMorphComplexTypeRule__RenameToAssignment_1_1"
    // InternalSim.g:8652:1: rule__SMorphComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8656:1: ( ( RULE_ID ) )
            // InternalSim.g:8657:2: ( RULE_ID )
            {
            // InternalSim.g:8657:2: ( RULE_ID )
            // InternalSim.g:8658:3: RULE_ID
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SMorphComplexTypeRule__RetypeToAssignment_2_2"
    // InternalSim.g:8667:1: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphComplexTypeRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8671:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8672:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8672:2: ( ( RULE_ID ) )
            // InternalSim.g:8673:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 
            // InternalSim.g:8674:3: ( RULE_ID )
            // InternalSim.g:8675:4: RULE_ID
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__RetypeToAssignment_2_2"


    // $ANTLR start "rule__SFuseComplexTypeRule__SourceAssignment_0"
    // InternalSim.g:8686:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8690:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8691:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8691:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8692:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8693:3: ( ruleSQualifiedName )
            // InternalSim.g:8694:4: ruleSQualifiedName
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__SourceAssignment_0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Source2Assignment_2"
    // InternalSim.g:8705:1: rule__SFuseComplexTypeRule__Source2Assignment_2 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__Source2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8709:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8710:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8710:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8711:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0()); 
            // InternalSim.g:8712:3: ( ruleSQualifiedName )
            // InternalSim.g:8713:4: ruleSQualifiedName
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeSQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeSQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Source2Assignment_2"


    // $ANTLR start "rule__SFuseComplexTypeRule__RenameToAssignment_3_1"
    // InternalSim.g:8724:1: rule__SFuseComplexTypeRule__RenameToAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SFuseComplexTypeRule__RenameToAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8728:1: ( ( RULE_ID ) )
            // InternalSim.g:8729:2: ( RULE_ID )
            {
            // InternalSim.g:8729:2: ( RULE_ID )
            // InternalSim.g:8730:3: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__RenameToAssignment_3_1"


    // $ANTLR start "rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1"
    // InternalSim.g:8739:1: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8743:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8744:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8744:2: ( ( RULE_ID ) )
            // InternalSim.g:8745:3: ( RULE_ID )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 
            // InternalSim.g:8746:3: ( RULE_ID )
            // InternalSim.g:8747:4: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1"


    // $ANTLR start "rule__SGrabFeatureRule__SourceAssignment_0"
    // InternalSim.g:8758:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8762:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8763:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8763:2: ( ( RULE_ID ) )
            // InternalSim.g:8764:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:8765:3: ( RULE_ID )
            // InternalSim.g:8766:4: RULE_ID
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__SourceAssignment_0"


    // $ANTLR start "rule__SGrabFeatureRule__RenameToAssignment_1_1"
    // InternalSim.g:8777:1: rule__SGrabFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8781:1: ( ( RULE_ID ) )
            // InternalSim.g:8782:2: ( RULE_ID )
            {
            // InternalSim.g:8782:2: ( RULE_ID )
            // InternalSim.g:8783:3: RULE_ID
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SMorphFeatureRule__SourceAssignment_0"
    // InternalSim.g:8792:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8796:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8797:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8797:2: ( ( RULE_ID ) )
            // InternalSim.g:8798:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:8799:3: ( RULE_ID )
            // InternalSim.g:8800:4: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__SourceAssignment_0"


    // $ANTLR start "rule__SMorphFeatureRule__RenameToAssignment_1_1"
    // InternalSim.g:8811:1: rule__SMorphFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8815:1: ( ( RULE_ID ) )
            // InternalSim.g:8816:2: ( RULE_ID )
            {
            // InternalSim.g:8816:2: ( RULE_ID )
            // InternalSim.g:8817:3: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SMorphFeatureRule__RetypeToAssignment_2_1"
    // InternalSim.g:8826:1: rule__SMorphFeatureRule__RetypeToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8830:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8831:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8831:2: ( ( RULE_ID ) )
            // InternalSim.g:8832:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0()); 
            // InternalSim.g:8833:3: ( RULE_ID )
            // InternalSim.g:8834:4: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RetypeToAssignment_2_1"


    // $ANTLR start "rule__SMorphFeatureRule__RemultiplyToAssignment_2_2"
    // InternalSim.g:8845:1: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8849:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:8850:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:8850:2: ( ruleSMultiplicity )
            // InternalSim.g:8851:3: ruleSMultiplicity
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RemultiplyToAssignment_2_2"


    // $ANTLR start "rule__SDitchFeatureRule__SourceAssignment"
    // InternalSim.g:8860:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8864:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8865:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8865:2: ( ( RULE_ID ) )
            // InternalSim.g:8866:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSim.g:8867:3: ( RULE_ID )
            // InternalSim.g:8868:4: RULE_ID
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDitchFeatureRule__SourceAssignment"


    // $ANTLR start "rule__SAggregate__DeductionRuleAssignment_1_0_2"
    // InternalSim.g:8879:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8883:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSim.g:8884:2: ( ruleSGrabAggregateRule )
            {
            // InternalSim.g:8884:2: ( ruleSGrabAggregateRule )
            // InternalSim.g:8885:3: ruleSGrabAggregateRule
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabAggregateRule();

            state._fsp--;

             after(grammarAccess.getSAggregateAccess().getDeductionRuleSGrabAggregateRuleParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__DeductionRuleAssignment_1_0_2"


    // $ANTLR start "rule__SAggregate__TypesAssignment_3"
    // InternalSim.g:8894:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8898:1: ( ( ruleSType ) )
            // InternalSim.g:8899:2: ( ruleSType )
            {
            // InternalSim.g:8899:2: ( ruleSType )
            // InternalSim.g:8900:3: ruleSType
            {
             before(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSType();

            state._fsp--;

             after(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__TypesAssignment_3"


    // $ANTLR start "rule__SConstraint__NameAssignment_1"
    // InternalSim.g:8909:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8913:1: ( ( RULE_ID ) )
            // InternalSim.g:8914:2: ( RULE_ID )
            {
            // InternalSim.g:8914:2: ( RULE_ID )
            // InternalSim.g:8915:3: RULE_ID
            {
             before(grammarAccess.getSConstraintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSConstraintAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__NameAssignment_1"


    // $ANTLR start "rule__SConstraint__ConditionAssignment_3"
    // InternalSim.g:8924:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8928:1: ( ( ruleSExpression ) )
            // InternalSim.g:8929:2: ( ruleSExpression )
            {
            // InternalSim.g:8929:2: ( ruleSExpression )
            // InternalSim.g:8930:3: ruleSExpression
            {
             before(grammarAccess.getSConstraintAccess().getConditionSExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSExpression();

            state._fsp--;

             after(grammarAccess.getSConstraintAccess().getConditionSExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SConstraint__ConditionAssignment_3"


    // $ANTLR start "rule__SPrimitive__NameAssignment_1"
    // InternalSim.g:8939:1: rule__SPrimitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8943:1: ( ( RULE_ID ) )
            // InternalSim.g:8944:2: ( RULE_ID )
            {
            // InternalSim.g:8944:2: ( RULE_ID )
            // InternalSim.g:8945:3: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__NameAssignment_1"


    // $ANTLR start "rule__SPrimitive__RedefinesAssignment_2_0_1"
    // InternalSim.g:8954:1: rule__SPrimitive__RedefinesAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8958:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8959:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8959:2: ( ( RULE_ID ) )
            // InternalSim.g:8960:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_2_0_1_0()); 
            // InternalSim.g:8961:3: ( RULE_ID )
            // InternalSim.g:8962:4: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__RedefinesAssignment_2_0_1"


    // $ANTLR start "rule__SPrimitive__RealizesAssignment_2_1_1"
    // InternalSim.g:8973:1: rule__SPrimitive__RealizesAssignment_2_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SPrimitive__RealizesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8977:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8978:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8978:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8979:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_2_1_1_0()); 
            // InternalSim.g:8980:3: ( ruleSQualifiedName )
            // InternalSim.g:8981:4: ruleSQualifiedName
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveSQualifiedNameParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveSQualifiedNameParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__RealizesAssignment_2_1_1"


    // $ANTLR start "rule__SPrimitive__ConstraintsAssignment_4"
    // InternalSim.g:8992:1: rule__SPrimitive__ConstraintsAssignment_4 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8996:1: ( ( ruleSConstraint ) )
            // InternalSim.g:8997:2: ( ruleSConstraint )
            {
            // InternalSim.g:8997:2: ( ruleSConstraint )
            // InternalSim.g:8998:3: ruleSConstraint
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__ConstraintsAssignment_4"


    // $ANTLR start "rule__SPrimitiveArchetype__NameAssignment_1"
    // InternalSim.g:9007:1: rule__SPrimitiveArchetype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitiveArchetype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9011:1: ( ( RULE_ID ) )
            // InternalSim.g:9012:2: ( RULE_ID )
            {
            // InternalSim.g:9012:2: ( RULE_ID )
            // InternalSim.g:9013:3: RULE_ID
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveArchetypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__NameAssignment_1"


    // $ANTLR start "rule__SPrimitiveArchetype__ConstraintsAssignment_3"
    // InternalSim.g:9022:1: rule__SPrimitiveArchetype__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SPrimitiveArchetype__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9026:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9027:2: ( ruleSConstraint )
            {
            // InternalSim.g:9027:2: ( ruleSConstraint )
            // InternalSim.g:9028:3: ruleSConstraint
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsSConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsSConstraintParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitiveArchetype__ConstraintsAssignment_3"


    // $ANTLR start "rule__SEnumeration__DeductionRuleAssignment_0_0_3"
    // InternalSim.g:9037:1: rule__SEnumeration__DeductionRuleAssignment_0_0_3 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9041:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSim.g:9042:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSim.g:9042:2: ( ruleSGrabEnumerationRule )
            // InternalSim.g:9043:3: ruleSGrabEnumerationRule
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabEnumerationRule();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__DeductionRuleAssignment_0_0_3"


    // $ANTLR start "rule__SEnumeration__DeductionRuleAssignment_0_1_3"
    // InternalSim.g:9052:1: rule__SEnumeration__DeductionRuleAssignment_0_1_3 : ( ruleSDitchEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9056:1: ( ( ruleSDitchEnumerationRule ) )
            // InternalSim.g:9057:2: ( ruleSDitchEnumerationRule )
            {
            // InternalSim.g:9057:2: ( ruleSDitchEnumerationRule )
            // InternalSim.g:9058:3: ruleSDitchEnumerationRule
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchEnumerationRule();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleSDitchEnumerationRuleParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__DeductionRuleAssignment_0_1_3"


    // $ANTLR start "rule__SEnumeration__NameAssignment_0_2_1"
    // InternalSim.g:9067:1: rule__SEnumeration__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9071:1: ( ( RULE_ID ) )
            // InternalSim.g:9072:2: ( RULE_ID )
            {
            // InternalSim.g:9072:2: ( RULE_ID )
            // InternalSim.g:9073:3: RULE_ID
            {
             before(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__NameAssignment_0_2_1"


    // $ANTLR start "rule__SEnumeration__LiteralsAssignment_2_0"
    // InternalSim.g:9082:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9086:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9087:2: ( ruleSLiteral )
            {
            // InternalSim.g:9087:2: ( ruleSLiteral )
            // InternalSim.g:9088:3: ruleSLiteral
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__LiteralsAssignment_2_0"


    // $ANTLR start "rule__SEnumeration__LiteralsAssignment_2_1_1"
    // InternalSim.g:9097:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9101:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9102:2: ( ruleSLiteral )
            {
            // InternalSim.g:9102:2: ( ruleSLiteral )
            // InternalSim.g:9103:3: ruleSLiteral
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__LiteralsAssignment_2_1_1"


    // $ANTLR start "rule__SEnumeration__ConstraintsAssignment_3"
    // InternalSim.g:9112:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9116:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9117:2: ( ruleSConstraint )
            {
            // InternalSim.g:9117:2: ( ruleSConstraint )
            // InternalSim.g:9118:3: ruleSConstraint
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__ConstraintsAssignment_3"


    // $ANTLR start "rule__SLiteral__DeductionRuleAssignment_0_2"
    // InternalSim.g:9127:1: rule__SLiteral__DeductionRuleAssignment_0_2 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9131:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSim.g:9132:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSim.g:9132:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSim.g:9133:3: ruleSGrabEnumerationLiteralRule
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__DeductionRuleAssignment_0_2"


    // $ANTLR start "rule__SLiteral__DeductionRuleAssignment_1_2"
    // InternalSim.g:9142:1: rule__SLiteral__DeductionRuleAssignment_1_2 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9146:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSim.g:9147:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSim.g:9147:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSim.g:9148:3: ruleSDitchEnumerationLiteralRule
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__DeductionRuleAssignment_1_2"


    // $ANTLR start "rule__SLiteral__NameAssignment_2"
    // InternalSim.g:9157:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9161:1: ( ( RULE_ID ) )
            // InternalSim.g:9162:2: ( RULE_ID )
            {
            // InternalSim.g:9162:2: ( RULE_ID )
            // InternalSim.g:9163:3: RULE_ID
            {
             before(grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__NameAssignment_2"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_0_2"
    // InternalSim.g:9172:1: rule__SRootType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9176:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9177:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9177:2: ( ( 'abstract' ) )
            // InternalSim.g:9178:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9179:3: ( 'abstract' )
            // InternalSim.g:9180:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_0_2"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_0_4"
    // InternalSim.g:9191:1: rule__SRootType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9195:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9196:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9196:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9197:3: ruleSGrabComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_0_4"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_1_2"
    // InternalSim.g:9206:1: rule__SRootType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9210:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9211:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9211:2: ( ( 'abstract' ) )
            // InternalSim.g:9212:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9213:3: ( 'abstract' )
            // InternalSim.g:9214:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_1_2"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_1_4"
    // InternalSim.g:9225:1: rule__SRootType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9229:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9230:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9230:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9231:3: ruleSDitchComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_1_4"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_2_2"
    // InternalSim.g:9240:1: rule__SRootType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9244:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9245:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9245:2: ( ( 'abstract' ) )
            // InternalSim.g:9246:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9247:3: ( 'abstract' )
            // InternalSim.g:9248:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_2_2"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_2_4"
    // InternalSim.g:9259:1: rule__SRootType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9263:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9264:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9264:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9265:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_2_4"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_3_2"
    // InternalSim.g:9274:1: rule__SRootType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9278:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9279:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9279:2: ( ( 'abstract' ) )
            // InternalSim.g:9280:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9281:3: ( 'abstract' )
            // InternalSim.g:9282:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_3_2"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_3_4"
    // InternalSim.g:9293:1: rule__SRootType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9297:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9298:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9298:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9299:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_3_4"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_4_0"
    // InternalSim.g:9308:1: rule__SRootType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9312:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9313:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9313:2: ( ( 'abstract' ) )
            // InternalSim.g:9314:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9315:3: ( 'abstract' )
            // InternalSim.g:9316:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_4_0"


    // $ANTLR start "rule__SRootType__NameAssignment_0_4_2"
    // InternalSim.g:9327:1: rule__SRootType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9331:1: ( ( RULE_ID ) )
            // InternalSim.g:9332:2: ( RULE_ID )
            {
            // InternalSim.g:9332:2: ( RULE_ID )
            // InternalSim.g:9333:3: RULE_ID
            {
             before(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__NameAssignment_0_4_2"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_0_2"
    // InternalSim.g:9342:1: rule__SDetailType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9346:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9347:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9347:2: ( ( 'abstract' ) )
            // InternalSim.g:9348:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9349:3: ( 'abstract' )
            // InternalSim.g:9350:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_0_2"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_0_4"
    // InternalSim.g:9361:1: rule__SDetailType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9365:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9366:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9366:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9367:3: ruleSGrabComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_0_4"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_1_2"
    // InternalSim.g:9376:1: rule__SDetailType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9380:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9381:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9381:2: ( ( 'abstract' ) )
            // InternalSim.g:9382:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9383:3: ( 'abstract' )
            // InternalSim.g:9384:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_1_2"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_1_4"
    // InternalSim.g:9395:1: rule__SDetailType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9399:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9400:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9400:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9401:3: ruleSDitchComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_1_4"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_2_2"
    // InternalSim.g:9410:1: rule__SDetailType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9414:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9415:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9415:2: ( ( 'abstract' ) )
            // InternalSim.g:9416:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9417:3: ( 'abstract' )
            // InternalSim.g:9418:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_2_2"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_2_4"
    // InternalSim.g:9429:1: rule__SDetailType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9433:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9434:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9434:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9435:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_2_4"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_3_2"
    // InternalSim.g:9444:1: rule__SDetailType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9448:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9449:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9449:2: ( ( 'abstract' ) )
            // InternalSim.g:9450:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9451:3: ( 'abstract' )
            // InternalSim.g:9452:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_3_2"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_3_4"
    // InternalSim.g:9463:1: rule__SDetailType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9467:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9468:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9468:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9469:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_3_4"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_4_0"
    // InternalSim.g:9478:1: rule__SDetailType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9482:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9483:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9483:2: ( ( 'abstract' ) )
            // InternalSim.g:9484:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9485:3: ( 'abstract' )
            // InternalSim.g:9486:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_4_0"


    // $ANTLR start "rule__SDetailType__NameAssignment_0_4_2"
    // InternalSim.g:9497:1: rule__SDetailType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9501:1: ( ( RULE_ID ) )
            // InternalSim.g:9502:2: ( RULE_ID )
            {
            // InternalSim.g:9502:2: ( RULE_ID )
            // InternalSim.g:9503:3: RULE_ID
            {
             before(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__NameAssignment_0_4_2"


    // $ANTLR start "rule__SComplexTypeExtends__SuperTypeAssignment_1"
    // InternalSim.g:9512:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9516:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9517:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9517:2: ( ( RULE_ID ) )
            // InternalSim.g:9518:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSim.g:9519:3: ( RULE_ID )
            // InternalSim.g:9520:4: RULE_ID
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeExtends__SuperTypeAssignment_1"


    // $ANTLR start "rule__SComplexTypeFeatures__FeaturesAssignment_1_0"
    // InternalSim.g:9531:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9535:1: ( ( ruleSFeature ) )
            // InternalSim.g:9536:2: ( ruleSFeature )
            {
            // InternalSim.g:9536:2: ( ruleSFeature )
            // InternalSim.g:9537:3: ruleSFeature
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesSFeatureParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSFeature();

            state._fsp--;

             after(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesSFeatureParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__FeaturesAssignment_1_0"


    // $ANTLR start "rule__SComplexTypeFeatures__ConstraintsAssignment_1_1"
    // InternalSim.g:9546:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9550:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9551:2: ( ruleSConstraint )
            {
            // InternalSim.g:9551:2: ( ruleSConstraint )
            // InternalSim.g:9552:3: ruleSConstraint
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsSConstraintParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsSConstraintParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexTypeFeatures__ConstraintsAssignment_1_1"


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_0_3"
    // InternalSim.g:9561:1: rule__SAssociation__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9565:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9566:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9566:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9567:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_0_3"


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_1_3"
    // InternalSim.g:9576:1: rule__SAssociation__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9580:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9581:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9581:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9582:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_1_3"


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_2_3"
    // InternalSim.g:9591:1: rule__SAssociation__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9595:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9596:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9596:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9597:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_2_3"


    // $ANTLR start "rule__SAssociation__DerivedAssignment_3_0"
    // InternalSim.g:9606:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9610:1: ( ( ( 'derived' ) ) )
            // InternalSim.g:9611:2: ( ( 'derived' ) )
            {
            // InternalSim.g:9611:2: ( ( 'derived' ) )
            // InternalSim.g:9612:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSim.g:9613:3: ( 'derived' )
            // InternalSim.g:9614:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 

            }

             after(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DerivedAssignment_3_0"


    // $ANTLR start "rule__SAssociation__KindAssignment_3_1_0"
    // InternalSim.g:9625:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9629:1: ( ( ruleSAssociationKind ) )
            // InternalSim.g:9630:2: ( ruleSAssociationKind )
            {
            // InternalSim.g:9630:2: ( ruleSAssociationKind )
            // InternalSim.g:9631:3: ruleSAssociationKind
            {
             before(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAssociationKind();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__KindAssignment_3_1_0"


    // $ANTLR start "rule__SAssociation__KindAssignment_3_1_1_0"
    // InternalSim.g:9640:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9644:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSim.g:9645:2: ( ruleSAssociationKindInverse )
            {
            // InternalSim.g:9645:2: ( ruleSAssociationKindInverse )
            // InternalSim.g:9646:3: ruleSAssociationKindInverse
            {
             before(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAssociationKindInverse();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_3_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__KindAssignment_3_1_1_0"


    // $ANTLR start "rule__SAssociation__NameAssignment_3_2"
    // InternalSim.g:9655:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9659:1: ( ( RULE_ID ) )
            // InternalSim.g:9660:2: ( RULE_ID )
            {
            // InternalSim.g:9660:2: ( RULE_ID )
            // InternalSim.g:9661:3: RULE_ID
            {
             before(grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__NameAssignment_3_2"


    // $ANTLR start "rule__SAssociation__TypeAssignment_3_4"
    // InternalSim.g:9670:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9674:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9675:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9675:2: ( ( RULE_ID ) )
            // InternalSim.g:9676:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 
            // InternalSim.g:9677:3: ( RULE_ID )
            // InternalSim.g:9678:4: RULE_ID
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeIDTerminalRuleCall_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getTypeSRootTypeIDTerminalRuleCall_3_4_0_1()); 

            }

             after(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__TypeAssignment_3_4"


    // $ANTLR start "rule__SAssociation__MultiplicityAssignment_3_5"
    // InternalSim.g:9689:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9693:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9694:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9694:2: ( ruleSMultiplicity )
            // InternalSim.g:9695:3: ruleSMultiplicity
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__MultiplicityAssignment_3_5"


    // $ANTLR start "rule__SAttribute__DetailAssignment_0_2_1"
    // InternalSim.g:9704:1: rule__SAttribute__DetailAssignment_0_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9708:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9709:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9709:2: ( ( 'detail' ) )
            // InternalSim.g:9710:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            // InternalSim.g:9711:3: ( 'detail' )
            // InternalSim.g:9712:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_0_2_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_0_3"
    // InternalSim.g:9723:1: rule__SAttribute__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9727:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9728:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9728:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9729:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_0_3"


    // $ANTLR start "rule__SAttribute__DetailAssignment_1_2_1"
    // InternalSim.g:9738:1: rule__SAttribute__DetailAssignment_1_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9742:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9743:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9743:2: ( ( 'detail' ) )
            // InternalSim.g:9744:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            // InternalSim.g:9745:3: ( 'detail' )
            // InternalSim.g:9746:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_1_2_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_1_3"
    // InternalSim.g:9757:1: rule__SAttribute__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9761:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9762:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9762:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9763:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_1_3"


    // $ANTLR start "rule__SAttribute__DetailAssignment_2_2_1"
    // InternalSim.g:9772:1: rule__SAttribute__DetailAssignment_2_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9776:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9777:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9777:2: ( ( 'detail' ) )
            // InternalSim.g:9778:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            // InternalSim.g:9779:3: ( 'detail' )
            // InternalSim.g:9780:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_2_2_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_2_3"
    // InternalSim.g:9791:1: rule__SAttribute__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9795:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9796:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9796:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9797:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_2_3"


    // $ANTLR start "rule__SAttribute__DetailAssignment_3_0"
    // InternalSim.g:9806:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9810:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9811:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9811:2: ( ( 'detail' ) )
            // InternalSim.g:9812:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSim.g:9813:3: ( 'detail' )
            // InternalSim.g:9814:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_3_0"


    // $ANTLR start "rule__SAttribute__NameAssignment_3_1"
    // InternalSim.g:9825:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9829:1: ( ( RULE_ID ) )
            // InternalSim.g:9830:2: ( RULE_ID )
            {
            // InternalSim.g:9830:2: ( RULE_ID )
            // InternalSim.g:9831:3: RULE_ID
            {
             before(grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__NameAssignment_3_1"


    // $ANTLR start "rule__SAttribute__TypeAssignment_3_3"
    // InternalSim.g:9840:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9844:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9845:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9845:2: ( ( RULE_ID ) )
            // InternalSim.g:9846:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSim.g:9847:3: ( RULE_ID )
            // InternalSim.g:9848:4: RULE_ID
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__TypeAssignment_3_3"


    // $ANTLR start "rule__SAttribute__MultiplicityAssignment_3_4"
    // InternalSim.g:9859:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9863:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9864:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9864:2: ( ruleSMultiplicity )
            // InternalSim.g:9865:3: ruleSMultiplicity
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__MultiplicityAssignment_3_4"


    // $ANTLR start "rule__SAttribute__KeyAssignment_3_5"
    // InternalSim.g:9874:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9878:1: ( ( ( 'key' ) ) )
            // InternalSim.g:9879:2: ( ( 'key' ) )
            {
            // InternalSim.g:9879:2: ( ( 'key' ) )
            // InternalSim.g:9880:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSim.g:9881:3: ( 'key' )
            // InternalSim.g:9882:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__KeyAssignment_3_5"


    // $ANTLR start "rule__SQuery__DeductionRuleAssignment_0_0_0_3"
    // InternalSim.g:9893:1: rule__SQuery__DeductionRuleAssignment_0_0_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9897:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9898:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9898:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9899:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__DeductionRuleAssignment_0_0_0_3"


    // $ANTLR start "rule__SQuery__DeductionRuleAssignment_0_0_1_3"
    // InternalSim.g:9908:1: rule__SQuery__DeductionRuleAssignment_0_0_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9912:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9913:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9913:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9914:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__DeductionRuleAssignment_0_0_1_3"


    // $ANTLR start "rule__SQuery__ParametersAssignment_0_2_1_0"
    // InternalSim.g:9923:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9927:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:9928:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:9928:2: ( ruleSQueryParameter )
            // InternalSim.g:9929:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_0_2_1_0"


    // $ANTLR start "rule__SQuery__ParametersAssignment_0_2_1_1_1"
    // InternalSim.g:9938:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9942:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:9943:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:9943:2: ( ruleSQueryParameter )
            // InternalSim.g:9944:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_0_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_0_2_1_1_1"


    // $ANTLR start "rule__SQuery__DeductionRuleAssignment_1_2"
    // InternalSim.g:9953:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9957:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9958:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9958:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9959:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__DeductionRuleAssignment_1_2"


    // $ANTLR start "rule__SQuery__NameAssignment_2_0"
    // InternalSim.g:9968:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9972:1: ( ( RULE_ID ) )
            // InternalSim.g:9973:2: ( RULE_ID )
            {
            // InternalSim.g:9973:2: ( RULE_ID )
            // InternalSim.g:9974:3: RULE_ID
            {
             before(grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__NameAssignment_2_0"


    // $ANTLR start "rule__SQuery__ParametersAssignment_2_2_0"
    // InternalSim.g:9983:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9987:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:9988:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:9988:2: ( ruleSQueryParameter )
            // InternalSim.g:9989:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_2_2_0"


    // $ANTLR start "rule__SQuery__ParametersAssignment_2_2_1_1"
    // InternalSim.g:9998:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10002:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10003:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10003:2: ( ruleSQueryParameter )
            // InternalSim.g:10004:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_2_2_1_1"


    // $ANTLR start "rule__SQuery__TypeAssignment_2_5"
    // InternalSim.g:10013:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10017:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10018:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10018:2: ( ( RULE_ID ) )
            // InternalSim.g:10019:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSim.g:10020:3: ( RULE_ID )
            // InternalSim.g:10021:4: RULE_ID
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeIDTerminalRuleCall_2_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getTypeSTypeIDTerminalRuleCall_2_5_0_1()); 

            }

             after(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__TypeAssignment_2_5"


    // $ANTLR start "rule__SQuery__MultiplicityAssignment_2_6"
    // InternalSim.g:10032:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10036:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10037:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10037:2: ( ruleSMultiplicity )
            // InternalSim.g:10038:3: ruleSMultiplicity
            {
             before(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__MultiplicityAssignment_2_6"


    // $ANTLR start "rule__SQuery__ReturnsAssignment_2_7_1"
    // InternalSim.g:10047:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10051:1: ( ( ruleSExpression ) )
            // InternalSim.g:10052:2: ( ruleSExpression )
            {
            // InternalSim.g:10052:2: ( ruleSExpression )
            // InternalSim.g:10053:3: ruleSExpression
            {
             before(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_2_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSExpression();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_2_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ReturnsAssignment_2_7_1"


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_0_2"
    // InternalSim.g:10062:1: rule__SQueryParameter__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10066:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10067:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10067:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10068:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_0_2"


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_1_2"
    // InternalSim.g:10077:1: rule__SQueryParameter__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10081:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10082:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10082:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10083:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_1_2"


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_2_2"
    // InternalSim.g:10092:1: rule__SQueryParameter__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10096:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10097:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10097:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10098:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_2_2"


    // $ANTLR start "rule__SQueryParameter__NameAssignment_3_0"
    // InternalSim.g:10107:1: rule__SQueryParameter__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10111:1: ( ( RULE_ID ) )
            // InternalSim.g:10112:2: ( RULE_ID )
            {
            // InternalSim.g:10112:2: ( RULE_ID )
            // InternalSim.g:10113:3: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__NameAssignment_3_0"


    // $ANTLR start "rule__SQueryParameter__TypeAssignment_3_2"
    // InternalSim.g:10122:1: rule__SQueryParameter__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10126:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10127:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10127:2: ( ( RULE_ID ) )
            // InternalSim.g:10128:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 
            // InternalSim.g:10129:3: ( RULE_ID )
            // InternalSim.g:10130:4: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__TypeAssignment_3_2"


    // $ANTLR start "rule__SQueryParameter__MultiplicityAssignment_3_3"
    // InternalSim.g:10141:1: rule__SQueryParameter__MultiplicityAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10145:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10146:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10146:2: ( ruleSMultiplicity )
            // InternalSim.g:10147:3: ruleSMultiplicity
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__MultiplicityAssignment_3_3"


    // $ANTLR start "rule__SExpression__ExprAssignment"
    // InternalSim.g:10156:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10160:1: ( ( RULE_STRING ) )
            // InternalSim.g:10161:2: ( RULE_STRING )
            {
            // InternalSim.g:10161:2: ( RULE_STRING )
            // InternalSim.g:10162:3: RULE_STRING
            {
             before(grammarAccess.getSExpressionAccess().getExprSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSExpressionAccess().getExprSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SExpression__ExprAssignment"


    // $ANTLR start "rule__SMultiplicity__MinOccursAssignment_1"
    // InternalSim.g:10171:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10175:1: ( ( RULE_INT ) )
            // InternalSim.g:10176:2: ( RULE_INT )
            {
            // InternalSim.g:10176:2: ( RULE_INT )
            // InternalSim.g:10177:3: RULE_INT
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSMultiplicityAccess().getMinOccursINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__MinOccursAssignment_1"


    // $ANTLR start "rule__SMultiplicity__MaxOccursAssignment_3"
    // InternalSim.g:10186:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10190:1: ( ( ruleMULTIPLICITY ) )
            // InternalSim.g:10191:2: ( ruleMULTIPLICITY )
            {
            // InternalSim.g:10191:2: ( ruleMULTIPLICITY )
            // InternalSim.g:10192:3: ruleMULTIPLICITY
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMULTIPLICITY();

            state._fsp--;

             after(grammarAccess.getSMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMultiplicity__MaxOccursAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\34\2\uffff\2\41\1\uffff\3\44\2\uffff\4\44";
    static final String dfa_3s = "\1\57\2\uffff\2\57\1\uffff\2\57\1\47\2\uffff\4\47";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\3\3\uffff\1\4\1\5\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\1\1\uffff\1\2\1\5\1\4\1\uffff\1\11\1\6\1\7\1\12\7\uffff\1\10",
            "",
            "",
            "\1\5\2\uffff\1\11\2\uffff\1\12\7\uffff\1\13",
            "\1\5\2\uffff\1\11\2\uffff\1\12\7\uffff\1\14",
            "",
            "\1\11\2\uffff\1\12\7\uffff\1\15",
            "\1\11\2\uffff\1\12\7\uffff\1\16",
            "\1\11\2\uffff\1\12",
            "",
            "",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12",
            "\1\11\2\uffff\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "985:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000080F750101000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000080F750001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000080F750001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000080F758000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000080F750000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000438000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000410000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000807410000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000080F750000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000100A438018820L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000100A430018822L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001002410018800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000020020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000A410000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002410040020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000002410000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000022410000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000040010L});

}