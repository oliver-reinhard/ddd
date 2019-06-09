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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'aggregate'", "'reference'", "'composite'", "'attribute'", "'*'", "'base'", "'interface'", "'core'", "'nonabstract'", "'abstract'", "'nonroot'", "'root'", "'information'", "'model'", "'import'", "'as'", "'and'", "'to'", "'extends'", "':'", "'grab'", "'domain'", "'{'", "'}'", "'constraint'", "'primitive'", "'archetype'", "'redefines'", "'enumeration'", "'ditch'", "','", "'entity'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'generate'", "'derived'", "'key'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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



    // $ANTLR start "entryRuleSInformationModel"
    // InternalSim.g:53:1: entryRuleSInformationModel : ruleSInformationModel EOF ;
    public final void entryRuleSInformationModel() throws RecognitionException {
        try {
            // InternalSim.g:54:1: ( ruleSInformationModel EOF )
            // InternalSim.g:55:1: ruleSInformationModel EOF
            {
             before(grammarAccess.getSInformationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSInformationModel();

            state._fsp--;

             after(grammarAccess.getSInformationModelRule()); 
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
    // $ANTLR end "entryRuleSInformationModel"


    // $ANTLR start "ruleSInformationModel"
    // InternalSim.g:62:1: ruleSInformationModel : ( ( rule__SInformationModel__Group__0 ) ) ;
    public final void ruleSInformationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:66:2: ( ( ( rule__SInformationModel__Group__0 ) ) )
            // InternalSim.g:67:2: ( ( rule__SInformationModel__Group__0 ) )
            {
            // InternalSim.g:67:2: ( ( rule__SInformationModel__Group__0 ) )
            // InternalSim.g:68:3: ( rule__SInformationModel__Group__0 )
            {
             before(grammarAccess.getSInformationModelAccess().getGroup()); 
            // InternalSim.g:69:3: ( rule__SInformationModel__Group__0 )
            // InternalSim.g:69:4: rule__SInformationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSInformationModel"


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


    // $ANTLR start "entryRuleSGrabDomainRule"
    // InternalSim.g:103:1: entryRuleSGrabDomainRule : ruleSGrabDomainRule EOF ;
    public final void entryRuleSGrabDomainRule() throws RecognitionException {
        try {
            // InternalSim.g:104:1: ( ruleSGrabDomainRule EOF )
            // InternalSim.g:105:1: ruleSGrabDomainRule EOF
            {
             before(grammarAccess.getSGrabDomainRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabDomainRule();

            state._fsp--;

             after(grammarAccess.getSGrabDomainRuleRule()); 
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
    // $ANTLR end "entryRuleSGrabDomainRule"


    // $ANTLR start "ruleSGrabDomainRule"
    // InternalSim.g:112:1: ruleSGrabDomainRule : ( ( rule__SGrabDomainRule__SourceAssignment ) ) ;
    public final void ruleSGrabDomainRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:116:2: ( ( ( rule__SGrabDomainRule__SourceAssignment ) ) )
            // InternalSim.g:117:2: ( ( rule__SGrabDomainRule__SourceAssignment ) )
            {
            // InternalSim.g:117:2: ( ( rule__SGrabDomainRule__SourceAssignment ) )
            // InternalSim.g:118:3: ( rule__SGrabDomainRule__SourceAssignment )
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceAssignment()); 
            // InternalSim.g:119:3: ( rule__SGrabDomainRule__SourceAssignment )
            // InternalSim.g:119:4: rule__SGrabDomainRule__SourceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__SourceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabDomainRule"


    // $ANTLR start "entryRuleSGrabAggregateRule"
    // InternalSim.g:128:1: entryRuleSGrabAggregateRule : ruleSGrabAggregateRule EOF ;
    public final void entryRuleSGrabAggregateRule() throws RecognitionException {
        try {
            // InternalSim.g:129:1: ( ruleSGrabAggregateRule EOF )
            // InternalSim.g:130:1: ruleSGrabAggregateRule EOF
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
    // InternalSim.g:137:1: ruleSGrabAggregateRule : ( ( rule__SGrabAggregateRule__SourceAssignment ) ) ;
    public final void ruleSGrabAggregateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:141:2: ( ( ( rule__SGrabAggregateRule__SourceAssignment ) ) )
            // InternalSim.g:142:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            {
            // InternalSim.g:142:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            // InternalSim.g:143:3: ( rule__SGrabAggregateRule__SourceAssignment )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceAssignment()); 
            // InternalSim.g:144:3: ( rule__SGrabAggregateRule__SourceAssignment )
            // InternalSim.g:144:4: rule__SGrabAggregateRule__SourceAssignment
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


    // $ANTLR start "entryRuleSGrabPrimitiveRule"
    // InternalSim.g:153:1: entryRuleSGrabPrimitiveRule : ruleSGrabPrimitiveRule EOF ;
    public final void entryRuleSGrabPrimitiveRule() throws RecognitionException {
        try {
            // InternalSim.g:154:1: ( ruleSGrabPrimitiveRule EOF )
            // InternalSim.g:155:1: ruleSGrabPrimitiveRule EOF
            {
             before(grammarAccess.getSGrabPrimitiveRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSGrabPrimitiveRule();

            state._fsp--;

             after(grammarAccess.getSGrabPrimitiveRuleRule()); 
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
    // $ANTLR end "entryRuleSGrabPrimitiveRule"


    // $ANTLR start "ruleSGrabPrimitiveRule"
    // InternalSim.g:162:1: ruleSGrabPrimitiveRule : ( ( rule__SGrabPrimitiveRule__Group__0 ) ) ;
    public final void ruleSGrabPrimitiveRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:166:2: ( ( ( rule__SGrabPrimitiveRule__Group__0 ) ) )
            // InternalSim.g:167:2: ( ( rule__SGrabPrimitiveRule__Group__0 ) )
            {
            // InternalSim.g:167:2: ( ( rule__SGrabPrimitiveRule__Group__0 ) )
            // InternalSim.g:168:3: ( rule__SGrabPrimitiveRule__Group__0 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup()); 
            // InternalSim.g:169:3: ( rule__SGrabPrimitiveRule__Group__0 )
            // InternalSim.g:169:4: rule__SGrabPrimitiveRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGrabPrimitiveRule"


    // $ANTLR start "entryRuleSGrabEnumerationRule"
    // InternalSim.g:178:1: entryRuleSGrabEnumerationRule : ruleSGrabEnumerationRule EOF ;
    public final void entryRuleSGrabEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:179:1: ( ruleSGrabEnumerationRule EOF )
            // InternalSim.g:180:1: ruleSGrabEnumerationRule EOF
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
    // InternalSim.g:187:1: ruleSGrabEnumerationRule : ( ( rule__SGrabEnumerationRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:191:2: ( ( ( rule__SGrabEnumerationRule__Group__0 ) ) )
            // InternalSim.g:192:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            {
            // InternalSim.g:192:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            // InternalSim.g:193:3: ( rule__SGrabEnumerationRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup()); 
            // InternalSim.g:194:3: ( rule__SGrabEnumerationRule__Group__0 )
            // InternalSim.g:194:4: rule__SGrabEnumerationRule__Group__0
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
    // InternalSim.g:203:1: entryRuleSDitchEnumerationRule : ruleSDitchEnumerationRule EOF ;
    public final void entryRuleSDitchEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:204:1: ( ruleSDitchEnumerationRule EOF )
            // InternalSim.g:205:1: ruleSDitchEnumerationRule EOF
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
    // InternalSim.g:212:1: ruleSDitchEnumerationRule : ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:216:2: ( ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) )
            // InternalSim.g:217:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            {
            // InternalSim.g:217:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            // InternalSim.g:218:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceAssignment()); 
            // InternalSim.g:219:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            // InternalSim.g:219:4: rule__SDitchEnumerationRule__SourceAssignment
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
    // InternalSim.g:228:1: entryRuleSGrabEnumerationLiteralRule : ruleSGrabEnumerationLiteralRule EOF ;
    public final void entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:229:1: ( ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:230:1: ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSim.g:237:1: ruleSGrabEnumerationLiteralRule : ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:241:2: ( ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) )
            // InternalSim.g:242:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            {
            // InternalSim.g:242:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            // InternalSim.g:243:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup()); 
            // InternalSim.g:244:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            // InternalSim.g:244:4: rule__SGrabEnumerationLiteralRule__Group__0
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
    // InternalSim.g:253:1: entryRuleSDitchEnumerationLiteralRule : ruleSDitchEnumerationLiteralRule EOF ;
    public final void entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:254:1: ( ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:255:1: ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSim.g:262:1: ruleSDitchEnumerationLiteralRule : ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:266:2: ( ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) )
            // InternalSim.g:267:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            {
            // InternalSim.g:267:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            // InternalSim.g:268:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceAssignment()); 
            // InternalSim.g:269:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            // InternalSim.g:269:4: rule__SDitchEnumerationLiteralRule__SourceAssignment
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
    // InternalSim.g:278:1: entryRuleSGrabComplexTypeRule : ruleSGrabComplexTypeRule EOF ;
    public final void entryRuleSGrabComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:279:1: ( ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:280:1: ruleSGrabComplexTypeRule EOF
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
    // InternalSim.g:287:1: ruleSGrabComplexTypeRule : ( ( rule__SGrabComplexTypeRule__Group__0 ) ) ;
    public final void ruleSGrabComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:291:2: ( ( ( rule__SGrabComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:292:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:292:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            // InternalSim.g:293:3: ( rule__SGrabComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:294:3: ( rule__SGrabComplexTypeRule__Group__0 )
            // InternalSim.g:294:4: rule__SGrabComplexTypeRule__Group__0
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
    // InternalSim.g:303:1: entryRuleSDitchComplexTypeRule : ruleSDitchComplexTypeRule EOF ;
    public final void entryRuleSDitchComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:304:1: ( ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:305:1: ruleSDitchComplexTypeRule EOF
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
    // InternalSim.g:312:1: ruleSDitchComplexTypeRule : ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) ;
    public final void ruleSDitchComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:316:2: ( ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) )
            // InternalSim.g:317:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            {
            // InternalSim.g:317:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            // InternalSim.g:318:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceAssignment()); 
            // InternalSim.g:319:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            // InternalSim.g:319:4: rule__SDitchComplexTypeRule__SourceAssignment
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
    // InternalSim.g:328:1: entryRuleSMorphComplexTypeRule : ruleSMorphComplexTypeRule EOF ;
    public final void entryRuleSMorphComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:329:1: ( ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:330:1: ruleSMorphComplexTypeRule EOF
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
    // InternalSim.g:337:1: ruleSMorphComplexTypeRule : ( ( rule__SMorphComplexTypeRule__Group__0 ) ) ;
    public final void ruleSMorphComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:341:2: ( ( ( rule__SMorphComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:342:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:342:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            // InternalSim.g:343:3: ( rule__SMorphComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:344:3: ( rule__SMorphComplexTypeRule__Group__0 )
            // InternalSim.g:344:4: rule__SMorphComplexTypeRule__Group__0
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
    // InternalSim.g:353:1: entryRuleSFuseComplexTypeRule : ruleSFuseComplexTypeRule EOF ;
    public final void entryRuleSFuseComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:354:1: ( ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:355:1: ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:362:1: ruleSFuseComplexTypeRule : ( ( rule__SFuseComplexTypeRule__Group__0 ) ) ;
    public final void ruleSFuseComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:366:2: ( ( ( rule__SFuseComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:367:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:367:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            // InternalSim.g:368:3: ( rule__SFuseComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:369:3: ( rule__SFuseComplexTypeRule__Group__0 )
            // InternalSim.g:369:4: rule__SFuseComplexTypeRule__Group__0
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


    // $ANTLR start "ruleChangeComplexType"
    // InternalSim.g:379:1: ruleChangeComplexType : ( ( rule__ChangeComplexType__Group__0 ) ) ;
    public final void ruleChangeComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:383:2: ( ( ( rule__ChangeComplexType__Group__0 ) ) )
            // InternalSim.g:384:2: ( ( rule__ChangeComplexType__Group__0 ) )
            {
            // InternalSim.g:384:2: ( ( rule__ChangeComplexType__Group__0 ) )
            // InternalSim.g:385:3: ( rule__ChangeComplexType__Group__0 )
            {
             before(grammarAccess.getChangeComplexTypeAccess().getGroup()); 
            // InternalSim.g:386:3: ( rule__ChangeComplexType__Group__0 )
            // InternalSim.g:386:4: rule__ChangeComplexType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeComplexTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeComplexType"


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:395:1: entryRuleSGrabFeatureRule : ruleSGrabFeatureRule EOF ;
    public final void entryRuleSGrabFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:396:1: ( ruleSGrabFeatureRule EOF )
            // InternalSim.g:397:1: ruleSGrabFeatureRule EOF
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
    // InternalSim.g:404:1: ruleSGrabFeatureRule : ( ( rule__SGrabFeatureRule__Group__0 ) ) ;
    public final void ruleSGrabFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:408:2: ( ( ( rule__SGrabFeatureRule__Group__0 ) ) )
            // InternalSim.g:409:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            {
            // InternalSim.g:409:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            // InternalSim.g:410:3: ( rule__SGrabFeatureRule__Group__0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 
            // InternalSim.g:411:3: ( rule__SGrabFeatureRule__Group__0 )
            // InternalSim.g:411:4: rule__SGrabFeatureRule__Group__0
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
    // InternalSim.g:420:1: entryRuleSMorphFeatureRule : ruleSMorphFeatureRule EOF ;
    public final void entryRuleSMorphFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:421:1: ( ruleSMorphFeatureRule EOF )
            // InternalSim.g:422:1: ruleSMorphFeatureRule EOF
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
    // InternalSim.g:429:1: ruleSMorphFeatureRule : ( ( rule__SMorphFeatureRule__Group__0 ) ) ;
    public final void ruleSMorphFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:433:2: ( ( ( rule__SMorphFeatureRule__Group__0 ) ) )
            // InternalSim.g:434:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            {
            // InternalSim.g:434:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            // InternalSim.g:435:3: ( rule__SMorphFeatureRule__Group__0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 
            // InternalSim.g:436:3: ( rule__SMorphFeatureRule__Group__0 )
            // InternalSim.g:436:4: rule__SMorphFeatureRule__Group__0
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
    // InternalSim.g:445:1: entryRuleSDitchFeatureRule : ruleSDitchFeatureRule EOF ;
    public final void entryRuleSDitchFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:446:1: ( ruleSDitchFeatureRule EOF )
            // InternalSim.g:447:1: ruleSDitchFeatureRule EOF
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
    // InternalSim.g:454:1: ruleSDitchFeatureRule : ( ( rule__SDitchFeatureRule__SourceAssignment ) ) ;
    public final void ruleSDitchFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:458:2: ( ( ( rule__SDitchFeatureRule__SourceAssignment ) ) )
            // InternalSim.g:459:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            {
            // InternalSim.g:459:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            // InternalSim.g:460:3: ( rule__SDitchFeatureRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 
            // InternalSim.g:461:3: ( rule__SDitchFeatureRule__SourceAssignment )
            // InternalSim.g:461:4: rule__SDitchFeatureRule__SourceAssignment
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


    // $ANTLR start "entryRuleSDomainProxy"
    // InternalSim.g:470:1: entryRuleSDomainProxy : ruleSDomainProxy EOF ;
    public final void entryRuleSDomainProxy() throws RecognitionException {
        try {
            // InternalSim.g:471:1: ( ruleSDomainProxy EOF )
            // InternalSim.g:472:1: ruleSDomainProxy EOF
            {
             before(grammarAccess.getSDomainProxyRule()); 
            pushFollow(FOLLOW_1);
            ruleSDomainProxy();

            state._fsp--;

             after(grammarAccess.getSDomainProxyRule()); 
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
    // $ANTLR end "entryRuleSDomainProxy"


    // $ANTLR start "ruleSDomainProxy"
    // InternalSim.g:479:1: ruleSDomainProxy : ( ( rule__SDomainProxy__Group__0 ) ) ;
    public final void ruleSDomainProxy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:483:2: ( ( ( rule__SDomainProxy__Group__0 ) ) )
            // InternalSim.g:484:2: ( ( rule__SDomainProxy__Group__0 ) )
            {
            // InternalSim.g:484:2: ( ( rule__SDomainProxy__Group__0 ) )
            // InternalSim.g:485:3: ( rule__SDomainProxy__Group__0 )
            {
             before(grammarAccess.getSDomainProxyAccess().getGroup()); 
            // InternalSim.g:486:3: ( rule__SDomainProxy__Group__0 )
            // InternalSim.g:486:4: rule__SDomainProxy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SDomainProxy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDomainProxyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDomainProxy"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSim.g:495:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSim.g:496:1: ( ruleSAggregate EOF )
            // InternalSim.g:497:1: ruleSAggregate EOF
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
    // InternalSim.g:504:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:508:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSim.g:509:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSim.g:509:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSim.g:510:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSim.g:511:3: ( rule__SAggregate__Group__0 )
            // InternalSim.g:511:4: rule__SAggregate__Group__0
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
    // InternalSim.g:520:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSim.g:521:1: ( ruleSType EOF )
            // InternalSim.g:522:1: ruleSType EOF
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
    // InternalSim.g:529:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:533:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSim.g:534:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSim.g:534:2: ( ( rule__SType__Alternatives ) )
            // InternalSim.g:535:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSim.g:536:3: ( rule__SType__Alternatives )
            // InternalSim.g:536:4: rule__SType__Alternatives
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
    // InternalSim.g:545:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSim.g:546:1: ( ruleSConstraint EOF )
            // InternalSim.g:547:1: ruleSConstraint EOF
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
    // InternalSim.g:554:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:558:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSim.g:559:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSim.g:559:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSim.g:560:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSim.g:561:3: ( rule__SConstraint__Group__0 )
            // InternalSim.g:561:4: rule__SConstraint__Group__0
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
    // InternalSim.g:570:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSim.g:571:1: ( ruleSPrimitive EOF )
            // InternalSim.g:572:1: ruleSPrimitive EOF
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
    // InternalSim.g:579:1: ruleSPrimitive : ( ( rule__SPrimitive__Group__0 ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:583:2: ( ( ( rule__SPrimitive__Group__0 ) ) )
            // InternalSim.g:584:2: ( ( rule__SPrimitive__Group__0 ) )
            {
            // InternalSim.g:584:2: ( ( rule__SPrimitive__Group__0 ) )
            // InternalSim.g:585:3: ( rule__SPrimitive__Group__0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getGroup()); 
            // InternalSim.g:586:3: ( rule__SPrimitive__Group__0 )
            // InternalSim.g:586:4: rule__SPrimitive__Group__0
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


    // $ANTLR start "entryRuleSEnumeration"
    // InternalSim.g:595:1: entryRuleSEnumeration : ruleSEnumeration EOF ;
    public final void entryRuleSEnumeration() throws RecognitionException {
        try {
            // InternalSim.g:596:1: ( ruleSEnumeration EOF )
            // InternalSim.g:597:1: ruleSEnumeration EOF
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
    // InternalSim.g:604:1: ruleSEnumeration : ( ( rule__SEnumeration__Group__0 ) ) ;
    public final void ruleSEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:608:2: ( ( ( rule__SEnumeration__Group__0 ) ) )
            // InternalSim.g:609:2: ( ( rule__SEnumeration__Group__0 ) )
            {
            // InternalSim.g:609:2: ( ( rule__SEnumeration__Group__0 ) )
            // InternalSim.g:610:3: ( rule__SEnumeration__Group__0 )
            {
             before(grammarAccess.getSEnumerationAccess().getGroup()); 
            // InternalSim.g:611:3: ( rule__SEnumeration__Group__0 )
            // InternalSim.g:611:4: rule__SEnumeration__Group__0
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
    // InternalSim.g:620:1: entryRuleSLiteral : ruleSLiteral EOF ;
    public final void entryRuleSLiteral() throws RecognitionException {
        try {
            // InternalSim.g:621:1: ( ruleSLiteral EOF )
            // InternalSim.g:622:1: ruleSLiteral EOF
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
    // InternalSim.g:629:1: ruleSLiteral : ( ( rule__SLiteral__Alternatives ) ) ;
    public final void ruleSLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:633:2: ( ( ( rule__SLiteral__Alternatives ) ) )
            // InternalSim.g:634:2: ( ( rule__SLiteral__Alternatives ) )
            {
            // InternalSim.g:634:2: ( ( rule__SLiteral__Alternatives ) )
            // InternalSim.g:635:3: ( rule__SLiteral__Alternatives )
            {
             before(grammarAccess.getSLiteralAccess().getAlternatives()); 
            // InternalSim.g:636:3: ( rule__SLiteral__Alternatives )
            // InternalSim.g:636:4: rule__SLiteral__Alternatives
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


    // $ANTLR start "entryRuleSEntityType"
    // InternalSim.g:645:1: entryRuleSEntityType : ruleSEntityType EOF ;
    public final void entryRuleSEntityType() throws RecognitionException {
        try {
            // InternalSim.g:646:1: ( ruleSEntityType EOF )
            // InternalSim.g:647:1: ruleSEntityType EOF
            {
             before(grammarAccess.getSEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSEntityType();

            state._fsp--;

             after(grammarAccess.getSEntityTypeRule()); 
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
    // $ANTLR end "entryRuleSEntityType"


    // $ANTLR start "ruleSEntityType"
    // InternalSim.g:654:1: ruleSEntityType : ( ( rule__SEntityType__Group__0 ) ) ;
    public final void ruleSEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:658:2: ( ( ( rule__SEntityType__Group__0 ) ) )
            // InternalSim.g:659:2: ( ( rule__SEntityType__Group__0 ) )
            {
            // InternalSim.g:659:2: ( ( rule__SEntityType__Group__0 ) )
            // InternalSim.g:660:3: ( rule__SEntityType__Group__0 )
            {
             before(grammarAccess.getSEntityTypeAccess().getGroup()); 
            // InternalSim.g:661:3: ( rule__SEntityType__Group__0 )
            // InternalSim.g:661:4: rule__SEntityType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSEntityType"


    // $ANTLR start "entryRuleSDetailType"
    // InternalSim.g:670:1: entryRuleSDetailType : ruleSDetailType EOF ;
    public final void entryRuleSDetailType() throws RecognitionException {
        try {
            // InternalSim.g:671:1: ( ruleSDetailType EOF )
            // InternalSim.g:672:1: ruleSDetailType EOF
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
    // InternalSim.g:679:1: ruleSDetailType : ( ( rule__SDetailType__Group__0 ) ) ;
    public final void ruleSDetailType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:683:2: ( ( ( rule__SDetailType__Group__0 ) ) )
            // InternalSim.g:684:2: ( ( rule__SDetailType__Group__0 ) )
            {
            // InternalSim.g:684:2: ( ( rule__SDetailType__Group__0 ) )
            // InternalSim.g:685:3: ( rule__SDetailType__Group__0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getGroup()); 
            // InternalSim.g:686:3: ( rule__SDetailType__Group__0 )
            // InternalSim.g:686:4: rule__SDetailType__Group__0
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
    // InternalSim.g:696:1: ruleSComplexTypeExtends : ( ( rule__SComplexTypeExtends__Group__0 )? ) ;
    public final void ruleSComplexTypeExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:700:2: ( ( ( rule__SComplexTypeExtends__Group__0 )? ) )
            // InternalSim.g:701:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            {
            // InternalSim.g:701:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            // InternalSim.g:702:3: ( rule__SComplexTypeExtends__Group__0 )?
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getGroup()); 
            // InternalSim.g:703:3: ( rule__SComplexTypeExtends__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSim.g:703:4: rule__SComplexTypeExtends__Group__0
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
    // InternalSim.g:713:1: ruleSComplexTypeFeatures : ( ( rule__SComplexTypeFeatures__Group__0 ) ) ;
    public final void ruleSComplexTypeFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:717:2: ( ( ( rule__SComplexTypeFeatures__Group__0 ) ) )
            // InternalSim.g:718:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            {
            // InternalSim.g:718:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            // InternalSim.g:719:3: ( rule__SComplexTypeFeatures__Group__0 )
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getGroup()); 
            // InternalSim.g:720:3: ( rule__SComplexTypeFeatures__Group__0 )
            // InternalSim.g:720:4: rule__SComplexTypeFeatures__Group__0
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
    // InternalSim.g:729:1: entryRuleSFeature : ruleSFeature EOF ;
    public final void entryRuleSFeature() throws RecognitionException {
        try {
            // InternalSim.g:730:1: ( ruleSFeature EOF )
            // InternalSim.g:731:1: ruleSFeature EOF
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
    // InternalSim.g:738:1: ruleSFeature : ( ( rule__SFeature__Alternatives ) ) ;
    public final void ruleSFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:742:2: ( ( ( rule__SFeature__Alternatives ) ) )
            // InternalSim.g:743:2: ( ( rule__SFeature__Alternatives ) )
            {
            // InternalSim.g:743:2: ( ( rule__SFeature__Alternatives ) )
            // InternalSim.g:744:3: ( rule__SFeature__Alternatives )
            {
             before(grammarAccess.getSFeatureAccess().getAlternatives()); 
            // InternalSim.g:745:3: ( rule__SFeature__Alternatives )
            // InternalSim.g:745:4: rule__SFeature__Alternatives
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
    // InternalSim.g:754:1: entryRuleSAssociation : ruleSAssociation EOF ;
    public final void entryRuleSAssociation() throws RecognitionException {
        try {
            // InternalSim.g:755:1: ( ruleSAssociation EOF )
            // InternalSim.g:756:1: ruleSAssociation EOF
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
    // InternalSim.g:763:1: ruleSAssociation : ( ( rule__SAssociation__Alternatives ) ) ;
    public final void ruleSAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:767:2: ( ( ( rule__SAssociation__Alternatives ) ) )
            // InternalSim.g:768:2: ( ( rule__SAssociation__Alternatives ) )
            {
            // InternalSim.g:768:2: ( ( rule__SAssociation__Alternatives ) )
            // InternalSim.g:769:3: ( rule__SAssociation__Alternatives )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives()); 
            // InternalSim.g:770:3: ( rule__SAssociation__Alternatives )
            // InternalSim.g:770:4: rule__SAssociation__Alternatives
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
    // InternalSim.g:779:1: entryRuleSAttribute : ruleSAttribute EOF ;
    public final void entryRuleSAttribute() throws RecognitionException {
        try {
            // InternalSim.g:780:1: ( ruleSAttribute EOF )
            // InternalSim.g:781:1: ruleSAttribute EOF
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
    // InternalSim.g:788:1: ruleSAttribute : ( ( rule__SAttribute__Alternatives ) ) ;
    public final void ruleSAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:792:2: ( ( ( rule__SAttribute__Alternatives ) ) )
            // InternalSim.g:793:2: ( ( rule__SAttribute__Alternatives ) )
            {
            // InternalSim.g:793:2: ( ( rule__SAttribute__Alternatives ) )
            // InternalSim.g:794:3: ( rule__SAttribute__Alternatives )
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives()); 
            // InternalSim.g:795:3: ( rule__SAttribute__Alternatives )
            // InternalSim.g:795:4: rule__SAttribute__Alternatives
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
    // InternalSim.g:804:1: entryRuleSQuery : ruleSQuery EOF ;
    public final void entryRuleSQuery() throws RecognitionException {
        try {
            // InternalSim.g:805:1: ( ruleSQuery EOF )
            // InternalSim.g:806:1: ruleSQuery EOF
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
    // InternalSim.g:813:1: ruleSQuery : ( ( rule__SQuery__Alternatives ) ) ;
    public final void ruleSQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:817:2: ( ( ( rule__SQuery__Alternatives ) ) )
            // InternalSim.g:818:2: ( ( rule__SQuery__Alternatives ) )
            {
            // InternalSim.g:818:2: ( ( rule__SQuery__Alternatives ) )
            // InternalSim.g:819:3: ( rule__SQuery__Alternatives )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives()); 
            // InternalSim.g:820:3: ( rule__SQuery__Alternatives )
            // InternalSim.g:820:4: rule__SQuery__Alternatives
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
    // InternalSim.g:829:1: entryRuleSQueryParameter : ruleSQueryParameter EOF ;
    public final void entryRuleSQueryParameter() throws RecognitionException {
        try {
            // InternalSim.g:830:1: ( ruleSQueryParameter EOF )
            // InternalSim.g:831:1: ruleSQueryParameter EOF
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
    // InternalSim.g:838:1: ruleSQueryParameter : ( ( rule__SQueryParameter__Alternatives ) ) ;
    public final void ruleSQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:842:2: ( ( ( rule__SQueryParameter__Alternatives ) ) )
            // InternalSim.g:843:2: ( ( rule__SQueryParameter__Alternatives ) )
            {
            // InternalSim.g:843:2: ( ( rule__SQueryParameter__Alternatives ) )
            // InternalSim.g:844:3: ( rule__SQueryParameter__Alternatives )
            {
             before(grammarAccess.getSQueryParameterAccess().getAlternatives()); 
            // InternalSim.g:845:3: ( rule__SQueryParameter__Alternatives )
            // InternalSim.g:845:4: rule__SQueryParameter__Alternatives
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
    // InternalSim.g:854:1: entryRuleSExpression : ruleSExpression EOF ;
    public final void entryRuleSExpression() throws RecognitionException {
        try {
            // InternalSim.g:855:1: ( ruleSExpression EOF )
            // InternalSim.g:856:1: ruleSExpression EOF
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
    // InternalSim.g:863:1: ruleSExpression : ( ( rule__SExpression__ExprAssignment ) ) ;
    public final void ruleSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:867:2: ( ( ( rule__SExpression__ExprAssignment ) ) )
            // InternalSim.g:868:2: ( ( rule__SExpression__ExprAssignment ) )
            {
            // InternalSim.g:868:2: ( ( rule__SExpression__ExprAssignment ) )
            // InternalSim.g:869:3: ( rule__SExpression__ExprAssignment )
            {
             before(grammarAccess.getSExpressionAccess().getExprAssignment()); 
            // InternalSim.g:870:3: ( rule__SExpression__ExprAssignment )
            // InternalSim.g:870:4: rule__SExpression__ExprAssignment
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
    // InternalSim.g:879:1: entryRuleSQualifiedNameWithWildcard : ruleSQualifiedNameWithWildcard EOF ;
    public final void entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSim.g:880:1: ( ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:881:1: ruleSQualifiedNameWithWildcard EOF
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
    // InternalSim.g:888:1: ruleSQualifiedNameWithWildcard : ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleSQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:892:2: ( ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSim.g:893:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSim.g:893:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            // InternalSim.g:894:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSim.g:895:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            // InternalSim.g:895:4: rule__SQualifiedNameWithWildcard__Group__0
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
    // InternalSim.g:904:1: entryRuleSQualifiedName : ruleSQualifiedName EOF ;
    public final void entryRuleSQualifiedName() throws RecognitionException {
        try {
            // InternalSim.g:905:1: ( ruleSQualifiedName EOF )
            // InternalSim.g:906:1: ruleSQualifiedName EOF
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
    // InternalSim.g:913:1: ruleSQualifiedName : ( ( rule__SQualifiedName__Group__0 ) ) ;
    public final void ruleSQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:917:2: ( ( ( rule__SQualifiedName__Group__0 ) ) )
            // InternalSim.g:918:2: ( ( rule__SQualifiedName__Group__0 ) )
            {
            // InternalSim.g:918:2: ( ( rule__SQualifiedName__Group__0 ) )
            // InternalSim.g:919:3: ( rule__SQualifiedName__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup()); 
            // InternalSim.g:920:3: ( rule__SQualifiedName__Group__0 )
            // InternalSim.g:920:4: rule__SQualifiedName__Group__0
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
    // InternalSim.g:929:1: entryRuleSMultiplicity : ruleSMultiplicity EOF ;
    public final void entryRuleSMultiplicity() throws RecognitionException {
        try {
            // InternalSim.g:930:1: ( ruleSMultiplicity EOF )
            // InternalSim.g:931:1: ruleSMultiplicity EOF
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
    // InternalSim.g:938:1: ruleSMultiplicity : ( ( rule__SMultiplicity__Group__0 ) ) ;
    public final void ruleSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:942:2: ( ( ( rule__SMultiplicity__Group__0 ) ) )
            // InternalSim.g:943:2: ( ( rule__SMultiplicity__Group__0 ) )
            {
            // InternalSim.g:943:2: ( ( rule__SMultiplicity__Group__0 ) )
            // InternalSim.g:944:3: ( rule__SMultiplicity__Group__0 )
            {
             before(grammarAccess.getSMultiplicityAccess().getGroup()); 
            // InternalSim.g:945:3: ( rule__SMultiplicity__Group__0 )
            // InternalSim.g:945:4: rule__SMultiplicity__Group__0
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
    // InternalSim.g:954:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalSim.g:955:1: ( ruleMULTIPLICITY EOF )
            // InternalSim.g:956:1: ruleMULTIPLICITY EOF
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
    // InternalSim.g:963:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:967:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalSim.g:968:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalSim.g:968:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalSim.g:969:3: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // InternalSim.g:970:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalSim.g:970:4: rule__MULTIPLICITY__Alternatives
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


    // $ANTLR start "ruleSInformationModelKind"
    // InternalSim.g:979:1: ruleSInformationModelKind : ( ( rule__SInformationModelKind__Alternatives ) ) ;
    public final void ruleSInformationModelKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:983:1: ( ( ( rule__SInformationModelKind__Alternatives ) ) )
            // InternalSim.g:984:2: ( ( rule__SInformationModelKind__Alternatives ) )
            {
            // InternalSim.g:984:2: ( ( rule__SInformationModelKind__Alternatives ) )
            // InternalSim.g:985:3: ( rule__SInformationModelKind__Alternatives )
            {
             before(grammarAccess.getSInformationModelKindAccess().getAlternatives()); 
            // InternalSim.g:986:3: ( rule__SInformationModelKind__Alternatives )
            // InternalSim.g:986:4: rule__SInformationModelKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModelKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSInformationModelKind"


    // $ANTLR start "ruleSAbstractType"
    // InternalSim.g:995:1: ruleSAbstractType : ( ( rule__SAbstractType__Alternatives ) ) ;
    public final void ruleSAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:999:1: ( ( ( rule__SAbstractType__Alternatives ) ) )
            // InternalSim.g:1000:2: ( ( rule__SAbstractType__Alternatives ) )
            {
            // InternalSim.g:1000:2: ( ( rule__SAbstractType__Alternatives ) )
            // InternalSim.g:1001:3: ( rule__SAbstractType__Alternatives )
            {
             before(grammarAccess.getSAbstractTypeAccess().getAlternatives()); 
            // InternalSim.g:1002:3: ( rule__SAbstractType__Alternatives )
            // InternalSim.g:1002:4: rule__SAbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SAbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSAbstractType"


    // $ANTLR start "ruleSRootEntity"
    // InternalSim.g:1011:1: ruleSRootEntity : ( ( rule__SRootEntity__Alternatives ) ) ;
    public final void ruleSRootEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1015:1: ( ( ( rule__SRootEntity__Alternatives ) ) )
            // InternalSim.g:1016:2: ( ( rule__SRootEntity__Alternatives ) )
            {
            // InternalSim.g:1016:2: ( ( rule__SRootEntity__Alternatives ) )
            // InternalSim.g:1017:3: ( rule__SRootEntity__Alternatives )
            {
             before(grammarAccess.getSRootEntityAccess().getAlternatives()); 
            // InternalSim.g:1018:3: ( rule__SRootEntity__Alternatives )
            // InternalSim.g:1018:4: rule__SRootEntity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SRootEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSRootEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSRootEntity"


    // $ANTLR start "ruleSAssociationKind"
    // InternalSim.g:1027:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1031:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSim.g:1032:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSim.g:1032:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSim.g:1033:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSim.g:1034:3: ( rule__SAssociationKind__Alternatives )
            // InternalSim.g:1034:4: rule__SAssociationKind__Alternatives
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
    // InternalSim.g:1043:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1047:1: ( ( ( 'inverse' ) ) )
            // InternalSim.g:1048:2: ( ( 'inverse' ) )
            {
            // InternalSim.g:1048:2: ( ( 'inverse' ) )
            // InternalSim.g:1049:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSim.g:1050:3: ( 'inverse' )
            // InternalSim.g:1050:4: 'inverse'
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


    // $ANTLR start "rule__SInformationModel__Alternatives_6"
    // InternalSim.g:1058:1: rule__SInformationModel__Alternatives_6 : ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) | ( ( rule__SInformationModel__DomainProxiesAssignment_6_2 ) ) );
    public final void rule__SInformationModel__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1062:1: ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) | ( ( rule__SInformationModel__DomainProxiesAssignment_6_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt2=3;
                    }
                    break;
                case 12:
                    {
                    alt2=2;
                    }
                    break;
                case 23:
                case 37:
                case 40:
                case 43:
                case 46:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
            case 23:
            case 37:
            case 38:
            case 40:
            case 41:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt2=1;
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
                    // InternalSim.g:1063:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    {
                    // InternalSim.g:1063:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    // InternalSim.g:1064:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getTypesAssignment_6_0()); 
                    // InternalSim.g:1065:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    // InternalSim.g:1065:4: rule__SInformationModel__TypesAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__TypesAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSInformationModelAccess().getTypesAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1069:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    {
                    // InternalSim.g:1069:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    // InternalSim.g:1070:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getAggregatesAssignment_6_1()); 
                    // InternalSim.g:1071:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    // InternalSim.g:1071:4: rule__SInformationModel__AggregatesAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__AggregatesAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSInformationModelAccess().getAggregatesAssignment_6_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1075:2: ( ( rule__SInformationModel__DomainProxiesAssignment_6_2 ) )
                    {
                    // InternalSim.g:1075:2: ( ( rule__SInformationModel__DomainProxiesAssignment_6_2 ) )
                    // InternalSim.g:1076:3: ( rule__SInformationModel__DomainProxiesAssignment_6_2 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getDomainProxiesAssignment_6_2()); 
                    // InternalSim.g:1077:3: ( rule__SInformationModel__DomainProxiesAssignment_6_2 )
                    // InternalSim.g:1077:4: rule__SInformationModel__DomainProxiesAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__DomainProxiesAssignment_6_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSInformationModelAccess().getDomainProxiesAssignment_6_2()); 

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
    // $ANTLR end "rule__SInformationModel__Alternatives_6"


    // $ANTLR start "rule__SAggregate__Alternatives_1"
    // InternalSim.g:1085:1: rule__SAggregate__Alternatives_1 : ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) );
    public final void rule__SAggregate__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1089:1: ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
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
                    // InternalSim.g:1090:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    {
                    // InternalSim.g:1090:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    // InternalSim.g:1091:3: ( rule__SAggregate__Group_1_0__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_0()); 
                    // InternalSim.g:1092:3: ( rule__SAggregate__Group_1_0__0 )
                    // InternalSim.g:1092:4: rule__SAggregate__Group_1_0__0
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
                    // InternalSim.g:1096:2: ( 'aggregate' )
                    {
                    // InternalSim.g:1096:2: ( 'aggregate' )
                    // InternalSim.g:1097:3: 'aggregate'
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
    // InternalSim.g:1106:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSEntityType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1110:1: ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSEntityType ) | ( ruleSDetailType ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSim.g:1111:2: ( ruleSPrimitive )
                    {
                    // InternalSim.g:1111:2: ( ruleSPrimitive )
                    // InternalSim.g:1112:3: ruleSPrimitive
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
                    // InternalSim.g:1117:2: ( ruleSEnumeration )
                    {
                    // InternalSim.g:1117:2: ( ruleSEnumeration )
                    // InternalSim.g:1118:3: ruleSEnumeration
                    {
                     before(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSEnumeration();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1123:2: ( ruleSEntityType )
                    {
                    // InternalSim.g:1123:2: ( ruleSEntityType )
                    // InternalSim.g:1124:3: ruleSEntityType
                    {
                     before(grammarAccess.getSTypeAccess().getSEntityTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSEntityType();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSEntityTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1129:2: ( ruleSDetailType )
                    {
                    // InternalSim.g:1129:2: ( ruleSDetailType )
                    // InternalSim.g:1130:3: ruleSDetailType
                    {
                     before(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSDetailType();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSDetailTypeParserRuleCall_3()); 

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


    // $ANTLR start "rule__SPrimitive__Alternatives_0"
    // InternalSim.g:1139:1: rule__SPrimitive__Alternatives_0 : ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) );
    public final void rule__SPrimitive__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1143:1: ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSim.g:1144:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1144:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    // InternalSim.g:1145:3: ( rule__SPrimitive__Group_0_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_0()); 
                    // InternalSim.g:1146:3: ( rule__SPrimitive__Group_0_0__0 )
                    // InternalSim.g:1146:4: rule__SPrimitive__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1150:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1150:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    // InternalSim.g:1151:3: ( rule__SPrimitive__Group_0_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_1()); 
                    // InternalSim.g:1152:3: ( rule__SPrimitive__Group_0_1__0 )
                    // InternalSim.g:1152:4: rule__SPrimitive__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1156:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1156:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    // InternalSim.g:1157:3: ( rule__SPrimitive__Group_0_2__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_2()); 
                    // InternalSim.g:1158:3: ( rule__SPrimitive__Group_0_2__0 )
                    // InternalSim.g:1158:4: rule__SPrimitive__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__SPrimitive__Alternatives_0"


    // $ANTLR start "rule__SEnumeration__Alternatives_0"
    // InternalSim.g:1166:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1170:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSim.g:1171:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1171:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSim.g:1172:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSim.g:1173:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSim.g:1173:4: rule__SEnumeration__Group_0_0__0
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
                    // InternalSim.g:1177:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1177:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSim.g:1178:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSim.g:1179:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSim.g:1179:4: rule__SEnumeration__Group_0_1__0
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
                    // InternalSim.g:1183:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1183:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    // InternalSim.g:1184:3: ( rule__SEnumeration__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 
                    // InternalSim.g:1185:3: ( rule__SEnumeration__Group_0_2__0 )
                    // InternalSim.g:1185:4: rule__SEnumeration__Group_0_2__0
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
    // InternalSim.g:1193:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1197:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
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
                    // InternalSim.g:1198:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSim.g:1198:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSim.g:1199:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSim.g:1200:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSim.g:1200:4: rule__SLiteral__Group_0__0
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
                    // InternalSim.g:1204:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSim.g:1204:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSim.g:1205:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSim.g:1206:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSim.g:1206:4: rule__SLiteral__Group_1__0
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
                    // InternalSim.g:1210:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSim.g:1210:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSim.g:1211:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSim.g:1212:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSim.g:1212:4: rule__SLiteral__NameAssignment_2
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


    // $ANTLR start "rule__SEntityType__Alternatives_0"
    // InternalSim.g:1220:1: rule__SEntityType__Alternatives_0 : ( ( ( rule__SEntityType__Group_0_0__0 ) ) | ( ( rule__SEntityType__Group_0_1__0 ) ) | ( ( rule__SEntityType__Group_0_2__0 ) ) | ( ( rule__SEntityType__Group_0_3__0 ) ) | ( ( rule__SEntityType__Group_0_4__0 ) ) );
    public final void rule__SEntityType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1224:1: ( ( ( rule__SEntityType__Group_0_0__0 ) ) | ( ( rule__SEntityType__Group_0_1__0 ) ) | ( ( rule__SEntityType__Group_0_2__0 ) ) | ( ( rule__SEntityType__Group_0_3__0 ) ) | ( ( rule__SEntityType__Group_0_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 41:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 45:
                {
                alt8=4;
                }
                break;
            case 21:
            case 23:
            case 43:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSim.g:1225:2: ( ( rule__SEntityType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1225:2: ( ( rule__SEntityType__Group_0_0__0 ) )
                    // InternalSim.g:1226:3: ( rule__SEntityType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEntityTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1227:3: ( rule__SEntityType__Group_0_0__0 )
                    // InternalSim.g:1227:4: rule__SEntityType__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEntityTypeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1231:2: ( ( rule__SEntityType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1231:2: ( ( rule__SEntityType__Group_0_1__0 ) )
                    // InternalSim.g:1232:3: ( rule__SEntityType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEntityTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1233:3: ( rule__SEntityType__Group_0_1__0 )
                    // InternalSim.g:1233:4: rule__SEntityType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEntityTypeAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1237:2: ( ( rule__SEntityType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1237:2: ( ( rule__SEntityType__Group_0_2__0 ) )
                    // InternalSim.g:1238:3: ( rule__SEntityType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEntityTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1239:3: ( rule__SEntityType__Group_0_2__0 )
                    // InternalSim.g:1239:4: rule__SEntityType__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEntityTypeAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1243:2: ( ( rule__SEntityType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1243:2: ( ( rule__SEntityType__Group_0_3__0 ) )
                    // InternalSim.g:1244:3: ( rule__SEntityType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSEntityTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1245:3: ( rule__SEntityType__Group_0_3__0 )
                    // InternalSim.g:1245:4: rule__SEntityType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEntityTypeAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSim.g:1249:2: ( ( rule__SEntityType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1249:2: ( ( rule__SEntityType__Group_0_4__0 ) )
                    // InternalSim.g:1250:3: ( rule__SEntityType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSEntityTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1251:3: ( rule__SEntityType__Group_0_4__0 )
                    // InternalSim.g:1251:4: rule__SEntityType__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEntityTypeAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__SEntityType__Alternatives_0"


    // $ANTLR start "rule__SDetailType__Alternatives_0"
    // InternalSim.g:1259:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1263:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 44:
                {
                alt9=3;
                }
                break;
            case 45:
                {
                alt9=4;
                }
                break;
            case 21:
            case 46:
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
                    // InternalSim.g:1264:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1264:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSim.g:1265:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1266:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSim.g:1266:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSim.g:1270:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1270:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSim.g:1271:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1272:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSim.g:1272:4: rule__SDetailType__Group_0_1__0
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
                    // InternalSim.g:1276:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1276:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSim.g:1277:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1278:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSim.g:1278:4: rule__SDetailType__Group_0_2__0
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
                    // InternalSim.g:1282:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1282:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSim.g:1283:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1284:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSim.g:1284:4: rule__SDetailType__Group_0_3__0
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
                    // InternalSim.g:1288:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1288:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    // InternalSim.g:1289:3: ( rule__SDetailType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1290:3: ( rule__SDetailType__Group_0_4__0 )
                    // InternalSim.g:1290:4: rule__SDetailType__Group_0_4__0
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
    // InternalSim.g:1298:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1302:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==11||(LA10_0>=13 && LA10_0<=14)||LA10_0==32||LA10_0==41||LA10_0==44||LA10_0==46||LA10_0==55) ) {
                alt10=1;
            }
            else if ( (LA10_0==36) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:1303:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSim.g:1303:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSim.g:1304:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSim.g:1305:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSim.g:1305:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
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
                    // InternalSim.g:1309:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSim.g:1309:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSim.g:1310:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSim.g:1311:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSim.g:1311:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
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
    // InternalSim.g:1319:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1323:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                case 49:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 46:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case 44:
                {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                case 49:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 46:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 15:
                case 46:
                    {
                    alt11=2;
                    }
                    break;
                case 49:
                    {
                    alt11=3;
                    }
                    break;
                case 13:
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }

                }
                break;
            case 11:
            case 13:
            case 14:
            case 55:
                {
                alt11=1;
                }
                break;
            case 46:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==47) ) {
                    alt11=3;
                }
                else if ( (LA11_6==31) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSim.g:1324:2: ( ruleSAssociation )
                    {
                    // InternalSim.g:1324:2: ( ruleSAssociation )
                    // InternalSim.g:1325:3: ruleSAssociation
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
                    // InternalSim.g:1330:2: ( ruleSAttribute )
                    {
                    // InternalSim.g:1330:2: ( ruleSAttribute )
                    // InternalSim.g:1331:3: ruleSAttribute
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
                    // InternalSim.g:1336:2: ( ruleSQuery )
                    {
                    // InternalSim.g:1336:2: ( ruleSQuery )
                    // InternalSim.g:1337:3: ruleSQuery
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
    // InternalSim.g:1346:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1350:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 44:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 11:
            case 13:
            case 14:
            case 55:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSim.g:1351:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSim.g:1351:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSim.g:1352:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSim.g:1353:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSim.g:1353:4: rule__SAssociation__Group_0__0
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
                    // InternalSim.g:1357:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSim.g:1357:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSim.g:1358:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSim.g:1359:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSim.g:1359:4: rule__SAssociation__Group_1__0
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
                    // InternalSim.g:1363:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSim.g:1363:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSim.g:1364:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSim.g:1365:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSim.g:1365:4: rule__SAssociation__Group_2__0
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
                    // InternalSim.g:1369:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSim.g:1369:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSim.g:1370:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSim.g:1371:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSim.g:1371:4: rule__SAssociation__Group_3__0
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
    // InternalSim.g:1379:1: rule__SAssociation__Alternatives_0_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1383:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSim.g:1384:2: ( 'reference' )
                    {
                    // InternalSim.g:1384:2: ( 'reference' )
                    // InternalSim.g:1385:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1390:2: ( 'composite' )
                    {
                    // InternalSim.g:1390:2: ( 'composite' )
                    // InternalSim.g:1391:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_0_2_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalSim.g:1400:1: rule__SAssociation__Alternatives_1_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1404:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSim.g:1405:2: ( 'reference' )
                    {
                    // InternalSim.g:1405:2: ( 'reference' )
                    // InternalSim.g:1406:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1411:2: ( 'composite' )
                    {
                    // InternalSim.g:1411:2: ( 'composite' )
                    // InternalSim.g:1412:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_2_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalSim.g:1421:1: rule__SAssociation__Alternatives_2_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1425:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            else if ( (LA15_0==14) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSim.g:1426:2: ( 'reference' )
                    {
                    // InternalSim.g:1426:2: ( 'reference' )
                    // InternalSim.g:1427:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1432:2: ( 'composite' )
                    {
                    // InternalSim.g:1432:2: ( 'composite' )
                    // InternalSim.g:1433:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_2_2_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalSim.g:1442:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1446:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                alt16=1;
            }
            else if ( (LA16_0==11) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSim.g:1447:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSim.g:1447:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSim.g:1448:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSim.g:1449:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSim.g:1449:4: rule__SAssociation__KindAssignment_3_1_0
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
                    // InternalSim.g:1453:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSim.g:1453:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSim.g:1454:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSim.g:1455:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSim.g:1455:4: rule__SAssociation__Group_3_1_1__0
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
    // InternalSim.g:1463:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1467:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 44:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
            case 46:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSim.g:1468:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSim.g:1468:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSim.g:1469:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSim.g:1470:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSim.g:1470:4: rule__SAttribute__Group_0__0
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
                    // InternalSim.g:1474:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSim.g:1474:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSim.g:1475:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSim.g:1476:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSim.g:1476:4: rule__SAttribute__Group_1__0
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
                    // InternalSim.g:1480:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSim.g:1480:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSim.g:1481:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSim.g:1482:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSim.g:1482:4: rule__SAttribute__Group_2__0
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
                    // InternalSim.g:1486:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSim.g:1486:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSim.g:1487:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSim.g:1488:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSim.g:1488:4: rule__SAttribute__Group_3__0
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
    // InternalSim.g:1496:1: rule__SAttribute__Alternatives_0_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1500:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            else if ( (LA18_0==46) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1501:2: ( 'attribute' )
                    {
                    // InternalSim.g:1501:2: ( 'attribute' )
                    // InternalSim.g:1502:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1507:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    {
                    // InternalSim.g:1507:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    // InternalSim.g:1508:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 
                    // InternalSim.g:1509:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    // InternalSim.g:1509:4: rule__SAttribute__DetailAssignment_0_2_1
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
    // InternalSim.g:1517:1: rule__SAttribute__Alternatives_1_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1521:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            else if ( (LA19_0==46) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1522:2: ( 'attribute' )
                    {
                    // InternalSim.g:1522:2: ( 'attribute' )
                    // InternalSim.g:1523:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1528:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    {
                    // InternalSim.g:1528:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    // InternalSim.g:1529:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 
                    // InternalSim.g:1530:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    // InternalSim.g:1530:4: rule__SAttribute__DetailAssignment_1_2_1
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
    // InternalSim.g:1538:1: rule__SAttribute__Alternatives_2_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1542:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( (LA20_0==46) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1543:2: ( 'attribute' )
                    {
                    // InternalSim.g:1543:2: ( 'attribute' )
                    // InternalSim.g:1544:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1549:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    {
                    // InternalSim.g:1549:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    // InternalSim.g:1550:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 
                    // InternalSim.g:1551:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    // InternalSim.g:1551:4: rule__SAttribute__DetailAssignment_2_2_1
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
    // InternalSim.g:1559:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1563:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 32:
            case 44:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case RULE_ID:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalSim.g:1564:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSim.g:1564:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSim.g:1565:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSim.g:1566:3: ( rule__SQuery__Group_0__0 )
                    // InternalSim.g:1566:4: rule__SQuery__Group_0__0
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
                    // InternalSim.g:1570:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSim.g:1570:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSim.g:1571:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSim.g:1572:3: ( rule__SQuery__Group_1__0 )
                    // InternalSim.g:1572:4: rule__SQuery__Group_1__0
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
                    // InternalSim.g:1576:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSim.g:1576:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSim.g:1577:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSim.g:1578:3: ( rule__SQuery__Group_2__0 )
                    // InternalSim.g:1578:4: rule__SQuery__Group_2__0
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
    // InternalSim.g:1586:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1590:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSim.g:1591:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSim.g:1591:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSim.g:1592:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSim.g:1593:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSim.g:1593:4: rule__SQuery__Group_0_0_0__0
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
                    // InternalSim.g:1597:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSim.g:1597:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSim.g:1598:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSim.g:1599:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSim.g:1599:4: rule__SQuery__Group_0_0_1__0
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
    // InternalSim.g:1607:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1611:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==32||LA24_0==41||LA24_0==44||LA24_0==48) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSim.g:1612:2: ( '*' )
                    {
                    // InternalSim.g:1612:2: ( '*' )
                    // InternalSim.g:1613:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1618:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSim.g:1618:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSim.g:1619:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSim.g:1620:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==32||LA23_0==41||LA23_0==44) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSim.g:1620:4: rule__SQuery__Group_0_2_1__0
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
    // InternalSim.g:1628:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1632:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSim.g:1633:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSim.g:1633:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSim.g:1634:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSim.g:1635:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSim.g:1635:4: rule__SQueryParameter__Group_0__0
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
                    // InternalSim.g:1639:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSim.g:1639:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSim.g:1640:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSim.g:1641:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSim.g:1641:4: rule__SQueryParameter__Group_1__0
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
                    // InternalSim.g:1645:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSim.g:1645:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSim.g:1646:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSim.g:1647:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSim.g:1647:4: rule__SQueryParameter__Group_2__0
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
                    // InternalSim.g:1651:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    {
                    // InternalSim.g:1651:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    // InternalSim.g:1652:3: ( rule__SQueryParameter__Group_3__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_3()); 
                    // InternalSim.g:1653:3: ( rule__SQueryParameter__Group_3__0 )
                    // InternalSim.g:1653:4: rule__SQueryParameter__Group_3__0
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
    // InternalSim.g:1661:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1665:1: ( ( RULE_INT ) | ( '*' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==16) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSim.g:1666:2: ( RULE_INT )
                    {
                    // InternalSim.g:1666:2: ( RULE_INT )
                    // InternalSim.g:1667:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1672:2: ( '*' )
                    {
                    // InternalSim.g:1672:2: ( '*' )
                    // InternalSim.g:1673:3: '*'
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__SInformationModelKind__Alternatives"
    // InternalSim.g:1682:1: rule__SInformationModelKind__Alternatives : ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) );
    public final void rule__SInformationModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1686:1: ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt27=1;
                }
                break;
            case 18:
                {
                alt27=2;
                }
                break;
            case 19:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSim.g:1687:2: ( ( 'base' ) )
                    {
                    // InternalSim.g:1687:2: ( ( 'base' ) )
                    // InternalSim.g:1688:3: ( 'base' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1689:3: ( 'base' )
                    // InternalSim.g:1689:4: 'base'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1693:2: ( ( 'interface' ) )
                    {
                    // InternalSim.g:1693:2: ( ( 'interface' ) )
                    // InternalSim.g:1694:3: ( 'interface' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1695:3: ( 'interface' )
                    // InternalSim.g:1695:4: 'interface'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1699:2: ( ( 'core' ) )
                    {
                    // InternalSim.g:1699:2: ( ( 'core' ) )
                    // InternalSim.g:1700:3: ( 'core' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2()); 
                    // InternalSim.g:1701:3: ( 'core' )
                    // InternalSim.g:1701:4: 'core'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SInformationModelKind__Alternatives"


    // $ANTLR start "rule__SAbstractType__Alternatives"
    // InternalSim.g:1709:1: rule__SAbstractType__Alternatives : ( ( ( 'nonabstract' ) ) | ( ( 'abstract' ) ) );
    public final void rule__SAbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1713:1: ( ( ( 'nonabstract' ) ) | ( ( 'abstract' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            else if ( (LA28_0==21) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSim.g:1714:2: ( ( 'nonabstract' ) )
                    {
                    // InternalSim.g:1714:2: ( ( 'nonabstract' ) )
                    // InternalSim.g:1715:3: ( 'nonabstract' )
                    {
                     before(grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1716:3: ( 'nonabstract' )
                    // InternalSim.g:1716:4: 'nonabstract'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAbstractTypeAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1720:2: ( ( 'abstract' ) )
                    {
                    // InternalSim.g:1720:2: ( ( 'abstract' ) )
                    // InternalSim.g:1721:3: ( 'abstract' )
                    {
                     before(grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1722:3: ( 'abstract' )
                    // InternalSim.g:1722:4: 'abstract'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAbstractTypeAccess().getTRUEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SAbstractType__Alternatives"


    // $ANTLR start "rule__SRootEntity__Alternatives"
    // InternalSim.g:1730:1: rule__SRootEntity__Alternatives : ( ( ( 'nonroot' ) ) | ( ( 'root' ) ) );
    public final void rule__SRootEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1734:1: ( ( ( 'nonroot' ) ) | ( ( 'root' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            else if ( (LA29_0==23) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSim.g:1735:2: ( ( 'nonroot' ) )
                    {
                    // InternalSim.g:1735:2: ( ( 'nonroot' ) )
                    // InternalSim.g:1736:3: ( 'nonroot' )
                    {
                     before(grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1737:3: ( 'nonroot' )
                    // InternalSim.g:1737:4: 'nonroot'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getSRootEntityAccess().getFALSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1741:2: ( ( 'root' ) )
                    {
                    // InternalSim.g:1741:2: ( ( 'root' ) )
                    // InternalSim.g:1742:3: ( 'root' )
                    {
                     before(grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1743:3: ( 'root' )
                    // InternalSim.g:1743:4: 'root'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSRootEntityAccess().getTRUEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SRootEntity__Alternatives"


    // $ANTLR start "rule__SAssociationKind__Alternatives"
    // InternalSim.g:1751:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1755:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            else if ( (LA30_0==14) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSim.g:1756:2: ( ( 'reference' ) )
                    {
                    // InternalSim.g:1756:2: ( ( 'reference' ) )
                    // InternalSim.g:1757:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1758:3: ( 'reference' )
                    // InternalSim.g:1758:4: 'reference'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1762:2: ( ( 'composite' ) )
                    {
                    // InternalSim.g:1762:2: ( ( 'composite' ) )
                    // InternalSim.g:1763:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1764:3: ( 'composite' )
                    // InternalSim.g:1764:4: 'composite'
                    {
                    match(input,14,FOLLOW_2); 

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


    // $ANTLR start "rule__SInformationModel__Group__0"
    // InternalSim.g:1772:1: rule__SInformationModel__Group__0 : rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 ;
    public final void rule__SInformationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1776:1: ( rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 )
            // InternalSim.g:1777:2: rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SInformationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__1();

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
    // $ANTLR end "rule__SInformationModel__Group__0"


    // $ANTLR start "rule__SInformationModel__Group__0__Impl"
    // InternalSim.g:1784:1: rule__SInformationModel__Group__0__Impl : ( ( rule__SInformationModel__KindAssignment_0 ) ) ;
    public final void rule__SInformationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1788:1: ( ( ( rule__SInformationModel__KindAssignment_0 ) ) )
            // InternalSim.g:1789:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            {
            // InternalSim.g:1789:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            // InternalSim.g:1790:2: ( rule__SInformationModel__KindAssignment_0 )
            {
             before(grammarAccess.getSInformationModelAccess().getKindAssignment_0()); 
            // InternalSim.g:1791:2: ( rule__SInformationModel__KindAssignment_0 )
            // InternalSim.g:1791:3: rule__SInformationModel__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__0__Impl"


    // $ANTLR start "rule__SInformationModel__Group__1"
    // InternalSim.g:1799:1: rule__SInformationModel__Group__1 : rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 ;
    public final void rule__SInformationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1803:1: ( rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 )
            // InternalSim.g:1804:2: rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SInformationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__2();

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
    // $ANTLR end "rule__SInformationModel__Group__1"


    // $ANTLR start "rule__SInformationModel__Group__1__Impl"
    // InternalSim.g:1811:1: rule__SInformationModel__Group__1__Impl : ( 'information' ) ;
    public final void rule__SInformationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1815:1: ( ( 'information' ) )
            // InternalSim.g:1816:1: ( 'information' )
            {
            // InternalSim.g:1816:1: ( 'information' )
            // InternalSim.g:1817:2: 'information'
            {
             before(grammarAccess.getSInformationModelAccess().getInformationKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getInformationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__1__Impl"


    // $ANTLR start "rule__SInformationModel__Group__2"
    // InternalSim.g:1826:1: rule__SInformationModel__Group__2 : rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 ;
    public final void rule__SInformationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1830:1: ( rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 )
            // InternalSim.g:1831:2: rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SInformationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__3();

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
    // $ANTLR end "rule__SInformationModel__Group__2"


    // $ANTLR start "rule__SInformationModel__Group__2__Impl"
    // InternalSim.g:1838:1: rule__SInformationModel__Group__2__Impl : ( 'model' ) ;
    public final void rule__SInformationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1842:1: ( ( 'model' ) )
            // InternalSim.g:1843:1: ( 'model' )
            {
            // InternalSim.g:1843:1: ( 'model' )
            // InternalSim.g:1844:2: 'model'
            {
             before(grammarAccess.getSInformationModelAccess().getModelKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__2__Impl"


    // $ANTLR start "rule__SInformationModel__Group__3"
    // InternalSim.g:1853:1: rule__SInformationModel__Group__3 : rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 ;
    public final void rule__SInformationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1857:1: ( rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 )
            // InternalSim.g:1858:2: rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SInformationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__4();

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
    // $ANTLR end "rule__SInformationModel__Group__3"


    // $ANTLR start "rule__SInformationModel__Group__3__Impl"
    // InternalSim.g:1865:1: rule__SInformationModel__Group__3__Impl : ( ( rule__SInformationModel__NameAssignment_3 ) ) ;
    public final void rule__SInformationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1869:1: ( ( ( rule__SInformationModel__NameAssignment_3 ) ) )
            // InternalSim.g:1870:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            {
            // InternalSim.g:1870:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            // InternalSim.g:1871:2: ( rule__SInformationModel__NameAssignment_3 )
            {
             before(grammarAccess.getSInformationModelAccess().getNameAssignment_3()); 
            // InternalSim.g:1872:2: ( rule__SInformationModel__NameAssignment_3 )
            // InternalSim.g:1872:3: rule__SInformationModel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__3__Impl"


    // $ANTLR start "rule__SInformationModel__Group__4"
    // InternalSim.g:1880:1: rule__SInformationModel__Group__4 : rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 ;
    public final void rule__SInformationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1884:1: ( rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 )
            // InternalSim.g:1885:2: rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SInformationModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__5();

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
    // $ANTLR end "rule__SInformationModel__Group__4"


    // $ANTLR start "rule__SInformationModel__Group__4__Impl"
    // InternalSim.g:1892:1: rule__SInformationModel__Group__4__Impl : ( ( rule__SInformationModel__GenerateAssignment_4 )? ) ;
    public final void rule__SInformationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1896:1: ( ( ( rule__SInformationModel__GenerateAssignment_4 )? ) )
            // InternalSim.g:1897:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            {
            // InternalSim.g:1897:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            // InternalSim.g:1898:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateAssignment_4()); 
            // InternalSim.g:1899:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSim.g:1899:3: rule__SInformationModel__GenerateAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__GenerateAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSInformationModelAccess().getGenerateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__4__Impl"


    // $ANTLR start "rule__SInformationModel__Group__5"
    // InternalSim.g:1907:1: rule__SInformationModel__Group__5 : rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 ;
    public final void rule__SInformationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1911:1: ( rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 )
            // InternalSim.g:1912:2: rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SInformationModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__6();

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
    // $ANTLR end "rule__SInformationModel__Group__5"


    // $ANTLR start "rule__SInformationModel__Group__5__Impl"
    // InternalSim.g:1919:1: rule__SInformationModel__Group__5__Impl : ( ( rule__SInformationModel__ImportsAssignment_5 )* ) ;
    public final void rule__SInformationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1923:1: ( ( ( rule__SInformationModel__ImportsAssignment_5 )* ) )
            // InternalSim.g:1924:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            {
            // InternalSim.g:1924:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            // InternalSim.g:1925:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            {
             before(grammarAccess.getSInformationModelAccess().getImportsAssignment_5()); 
            // InternalSim.g:1926:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSim.g:1926:3: rule__SInformationModel__ImportsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SInformationModel__ImportsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSInformationModelAccess().getImportsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__5__Impl"


    // $ANTLR start "rule__SInformationModel__Group__6"
    // InternalSim.g:1934:1: rule__SInformationModel__Group__6 : rule__SInformationModel__Group__6__Impl ;
    public final void rule__SInformationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1938:1: ( rule__SInformationModel__Group__6__Impl )
            // InternalSim.g:1939:2: rule__SInformationModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__Group__6__Impl();

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
    // $ANTLR end "rule__SInformationModel__Group__6"


    // $ANTLR start "rule__SInformationModel__Group__6__Impl"
    // InternalSim.g:1945:1: rule__SInformationModel__Group__6__Impl : ( ( rule__SInformationModel__Alternatives_6 )* ) ;
    public final void rule__SInformationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1949:1: ( ( ( rule__SInformationModel__Alternatives_6 )* ) )
            // InternalSim.g:1950:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            {
            // InternalSim.g:1950:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            // InternalSim.g:1951:2: ( rule__SInformationModel__Alternatives_6 )*
            {
             before(grammarAccess.getSInformationModelAccess().getAlternatives_6()); 
            // InternalSim.g:1952:2: ( rule__SInformationModel__Alternatives_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==12||LA33_0==21||LA33_0==23||LA33_0==32||(LA33_0>=37 && LA33_0<=38)||(LA33_0>=40 && LA33_0<=41)||(LA33_0>=43 && LA33_0<=46)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSim.g:1952:3: rule__SInformationModel__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SInformationModel__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSInformationModelAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__Group__6__Impl"


    // $ANTLR start "rule__SImport__Group__0"
    // InternalSim.g:1961:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1965:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSim.g:1966:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:1973:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1977:1: ( ( 'import' ) )
            // InternalSim.g:1978:1: ( 'import' )
            {
            // InternalSim.g:1978:1: ( 'import' )
            // InternalSim.g:1979:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSim.g:1988:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1992:1: ( rule__SImport__Group__1__Impl )
            // InternalSim.g:1993:2: rule__SImport__Group__1__Impl
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
    // InternalSim.g:1999:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2003:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSim.g:2004:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSim.g:2004:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSim.g:2005:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSim.g:2006:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSim.g:2006:3: rule__SImport__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__SGrabPrimitiveRule__Group__0"
    // InternalSim.g:2015:1: rule__SGrabPrimitiveRule__Group__0 : rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 ;
    public final void rule__SGrabPrimitiveRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2019:1: ( rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 )
            // InternalSim.g:2020:2: rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SGrabPrimitiveRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__Group__1();

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
    // $ANTLR end "rule__SGrabPrimitiveRule__Group__0"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group__0__Impl"
    // InternalSim.g:2027:1: rule__SGrabPrimitiveRule__Group__0__Impl : ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2031:1: ( ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2032:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2032:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            // InternalSim.g:2033:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2034:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            // InternalSim.g:2034:3: rule__SGrabPrimitiveRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group__1"
    // InternalSim.g:2042:1: rule__SGrabPrimitiveRule__Group__1 : rule__SGrabPrimitiveRule__Group__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2046:1: ( rule__SGrabPrimitiveRule__Group__1__Impl )
            // InternalSim.g:2047:2: rule__SGrabPrimitiveRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__Group__1__Impl();

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
    // $ANTLR end "rule__SGrabPrimitiveRule__Group__1"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group__1__Impl"
    // InternalSim.g:2053:1: rule__SGrabPrimitiveRule__Group__1__Impl : ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) ;
    public final void rule__SGrabPrimitiveRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2057:1: ( ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) )
            // InternalSim.g:2058:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            {
            // InternalSim.g:2058:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            // InternalSim.g:2059:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup_1()); 
            // InternalSim.g:2060:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:2060:3: rule__SGrabPrimitiveRule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SGrabPrimitiveRule__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group_1__0"
    // InternalSim.g:2069:1: rule__SGrabPrimitiveRule__Group_1__0 : rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 ;
    public final void rule__SGrabPrimitiveRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2073:1: ( rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 )
            // InternalSim.g:2074:2: rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SGrabPrimitiveRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__Group_1__1();

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
    // $ANTLR end "rule__SGrabPrimitiveRule__Group_1__0"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group_1__0__Impl"
    // InternalSim.g:2081:1: rule__SGrabPrimitiveRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2085:1: ( ( 'as' ) )
            // InternalSim.g:2086:1: ( 'as' )
            {
            // InternalSim.g:2086:1: ( 'as' )
            // InternalSim.g:2087:2: 'as'
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__Group_1__0__Impl"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group_1__1"
    // InternalSim.g:2096:1: rule__SGrabPrimitiveRule__Group_1__1 : rule__SGrabPrimitiveRule__Group_1__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2100:1: ( rule__SGrabPrimitiveRule__Group_1__1__Impl )
            // InternalSim.g:2101:2: rule__SGrabPrimitiveRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__Group_1__1__Impl();

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
    // $ANTLR end "rule__SGrabPrimitiveRule__Group_1__1"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group_1__1__Impl"
    // InternalSim.g:2107:1: rule__SGrabPrimitiveRule__Group_1__1__Impl : ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2111:1: ( ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2112:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2112:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2113:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2114:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            // InternalSim.g:2114:3: rule__SGrabPrimitiveRule__RenameToAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SGrabPrimitiveRule__RenameToAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__Group_1__1__Impl"


    // $ANTLR start "rule__SGrabEnumerationRule__Group__0"
    // InternalSim.g:2123:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2127:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSim.g:2128:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSim.g:2135:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2139:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2140:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2140:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSim.g:2141:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2142:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSim.g:2142:3: rule__SGrabEnumerationRule__SourceAssignment_0
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
    // InternalSim.g:2150:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2154:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSim.g:2155:2: rule__SGrabEnumerationRule__Group__1__Impl
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
    // InternalSim.g:2161:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2165:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSim.g:2166:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSim.g:2166:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSim.g:2167:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSim.g:2168:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2168:3: rule__SGrabEnumerationRule__Group_1__0
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
    // InternalSim.g:2177:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2181:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSim.g:2182:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2189:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2193:1: ( ( 'as' ) )
            // InternalSim.g:2194:1: ( 'as' )
            {
            // InternalSim.g:2194:1: ( 'as' )
            // InternalSim.g:2195:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:2204:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2208:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl )
            // InternalSim.g:2209:2: rule__SGrabEnumerationRule__Group_1__1__Impl
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
    // InternalSim.g:2215:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2219:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2220:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2220:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2221:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2222:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            // InternalSim.g:2222:3: rule__SGrabEnumerationRule__RenameToAssignment_1_1
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
    // InternalSim.g:2231:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2235:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSim.g:2236:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSim.g:2243:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2247:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2248:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2248:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSim.g:2249:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2250:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSim.g:2250:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
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
    // InternalSim.g:2258:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2262:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSim.g:2263:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
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
    // InternalSim.g:2269:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2273:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSim.g:2274:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSim.g:2274:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSim.g:2275:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSim.g:2276:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:2276:3: rule__SGrabEnumerationLiteralRule__Group_1__0
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
    // InternalSim.g:2285:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2289:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSim.g:2290:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2297:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2301:1: ( ( 'as' ) )
            // InternalSim.g:2302:1: ( 'as' )
            {
            // InternalSim.g:2302:1: ( 'as' )
            // InternalSim.g:2303:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:2312:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2316:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl )
            // InternalSim.g:2317:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl
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
    // InternalSim.g:2323:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2327:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2328:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2328:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2329:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2330:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            // InternalSim.g:2330:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1
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
    // InternalSim.g:2339:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2343:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSim.g:2344:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSim.g:2351:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2355:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2356:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2356:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2357:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2358:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2358:3: rule__SGrabComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2366:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2370:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2371:2: rule__SGrabComplexTypeRule__Group__1__Impl
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
    // InternalSim.g:2377:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2381:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2382:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2382:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2383:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2384:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:2384:3: rule__SGrabComplexTypeRule__Group_1__0
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
    // InternalSim.g:2393:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2397:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSim.g:2398:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2405:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2409:1: ( ( 'as' ) )
            // InternalSim.g:2410:1: ( 'as' )
            {
            // InternalSim.g:2410:1: ( 'as' )
            // InternalSim.g:2411:2: 'as'
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:2420:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2424:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2425:2: rule__SGrabComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2431:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2435:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2436:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2436:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2437:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2438:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2438:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2447:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2451:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSim.g:2452:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2459:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2463:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2464:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2464:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2465:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2466:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2466:3: rule__SMorphComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2474:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2478:1: ( rule__SMorphComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2479:2: rule__SMorphComplexTypeRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group__1__Impl();

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
    // InternalSim.g:2485:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ruleChangeComplexType ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2489:1: ( ( ruleChangeComplexType ) )
            // InternalSim.g:2490:1: ( ruleChangeComplexType )
            {
            // InternalSim.g:2490:1: ( ruleChangeComplexType )
            // InternalSim.g:2491:2: ruleChangeComplexType
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleChangeComplexType();

            state._fsp--;

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group__0"
    // InternalSim.g:2501:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2505:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSim.g:2506:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2513:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2517:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2518:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2518:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2519:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2520:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2520:3: rule__SFuseComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2528:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2532:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSim.g:2533:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2540:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2544:1: ( ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) ) )
            // InternalSim.g:2545:1: ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) )
            {
            // InternalSim.g:2545:1: ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) )
            // InternalSim.g:2546:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* )
            {
            // InternalSim.g:2546:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 ) )
            // InternalSim.g:2547:3: ( rule__SFuseComplexTypeRule__Group_1__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2548:3: ( rule__SFuseComplexTypeRule__Group_1__0 )
            // InternalSim.g:2548:4: rule__SFuseComplexTypeRule__Group_1__0
            {
            pushFollow(FOLLOW_12);
            rule__SFuseComplexTypeRule__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 

            }

            // InternalSim.g:2551:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 )* )
            // InternalSim.g:2552:3: ( rule__SFuseComplexTypeRule__Group_1__0 )*
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2553:3: ( rule__SFuseComplexTypeRule__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSim.g:2553:4: rule__SFuseComplexTypeRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SFuseComplexTypeRule__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 

            }


            }


            }

        }
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
    // InternalSim.g:2562:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2566:1: ( rule__SFuseComplexTypeRule__Group__2__Impl )
            // InternalSim.g:2567:2: rule__SFuseComplexTypeRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__2__Impl();

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
    // InternalSim.g:2573:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ruleChangeComplexType ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2577:1: ( ( ruleChangeComplexType ) )
            // InternalSim.g:2578:1: ( ruleChangeComplexType )
            {
            // InternalSim.g:2578:1: ( ruleChangeComplexType )
            // InternalSim.g:2579:2: ruleChangeComplexType
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleChangeComplexType();

            state._fsp--;

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getChangeComplexTypeParserRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_1__0"
    // InternalSim.g:2589:1: rule__SFuseComplexTypeRule__Group_1__0 : rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1 ;
    public final void rule__SFuseComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2593:1: ( rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1 )
            // InternalSim.g:2594:2: rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SFuseComplexTypeRule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_1__1();

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
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_1__0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_1__0__Impl"
    // InternalSim.g:2601:1: rule__SFuseComplexTypeRule__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2605:1: ( ( 'and' ) )
            // InternalSim.g:2606:1: ( 'and' )
            {
            // InternalSim.g:2606:1: ( 'and' )
            // InternalSim.g:2607:2: 'and'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_1__0__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_1__1"
    // InternalSim.g:2616:1: rule__SFuseComplexTypeRule__Group_1__1 : rule__SFuseComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2620:1: ( rule__SFuseComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2621:2: rule__SFuseComplexTypeRule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_1__1__Impl();

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
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_1__1"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_1__1__Impl"
    // InternalSim.g:2627:1: rule__SFuseComplexTypeRule__Group_1__1__Impl : ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2631:1: ( ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) ) )
            // InternalSim.g:2632:1: ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) )
            {
            // InternalSim.g:2632:1: ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) )
            // InternalSim.g:2633:2: ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesAssignment_1_1()); 
            // InternalSim.g:2634:2: ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 )
            // InternalSim.g:2634:3: rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_1__1__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group__0"
    // InternalSim.g:2643:1: rule__ChangeComplexType__Group__0 : rule__ChangeComplexType__Group__0__Impl rule__ChangeComplexType__Group__1 ;
    public final void rule__ChangeComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2647:1: ( rule__ChangeComplexType__Group__0__Impl rule__ChangeComplexType__Group__1 )
            // InternalSim.g:2648:2: rule__ChangeComplexType__Group__0__Impl rule__ChangeComplexType__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ChangeComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__1();

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
    // $ANTLR end "rule__ChangeComplexType__Group__0"


    // $ANTLR start "rule__ChangeComplexType__Group__0__Impl"
    // InternalSim.g:2655:1: rule__ChangeComplexType__Group__0__Impl : ( 'to' ) ;
    public final void rule__ChangeComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2659:1: ( ( 'to' ) )
            // InternalSim.g:2660:1: ( 'to' )
            {
            // InternalSim.g:2660:1: ( 'to' )
            // InternalSim.g:2661:2: 'to'
            {
             before(grammarAccess.getChangeComplexTypeAccess().getToKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChangeComplexTypeAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group__0__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group__1"
    // InternalSim.g:2670:1: rule__ChangeComplexType__Group__1 : rule__ChangeComplexType__Group__1__Impl rule__ChangeComplexType__Group__2 ;
    public final void rule__ChangeComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2674:1: ( rule__ChangeComplexType__Group__1__Impl rule__ChangeComplexType__Group__2 )
            // InternalSim.g:2675:2: rule__ChangeComplexType__Group__1__Impl rule__ChangeComplexType__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ChangeComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__2();

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
    // $ANTLR end "rule__ChangeComplexType__Group__1"


    // $ANTLR start "rule__ChangeComplexType__Group__1__Impl"
    // InternalSim.g:2682:1: rule__ChangeComplexType__Group__1__Impl : ( ( rule__ChangeComplexType__AbstractAssignment_1 )? ) ;
    public final void rule__ChangeComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2686:1: ( ( ( rule__ChangeComplexType__AbstractAssignment_1 )? ) )
            // InternalSim.g:2687:1: ( ( rule__ChangeComplexType__AbstractAssignment_1 )? )
            {
            // InternalSim.g:2687:1: ( ( rule__ChangeComplexType__AbstractAssignment_1 )? )
            // InternalSim.g:2688:2: ( rule__ChangeComplexType__AbstractAssignment_1 )?
            {
             before(grammarAccess.getChangeComplexTypeAccess().getAbstractAssignment_1()); 
            // InternalSim.g:2689:2: ( rule__ChangeComplexType__AbstractAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=20 && LA39_0<=21)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSim.g:2689:3: rule__ChangeComplexType__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeComplexType__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeComplexTypeAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group__1__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group__2"
    // InternalSim.g:2697:1: rule__ChangeComplexType__Group__2 : rule__ChangeComplexType__Group__2__Impl rule__ChangeComplexType__Group__3 ;
    public final void rule__ChangeComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2701:1: ( rule__ChangeComplexType__Group__2__Impl rule__ChangeComplexType__Group__3 )
            // InternalSim.g:2702:2: rule__ChangeComplexType__Group__2__Impl rule__ChangeComplexType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ChangeComplexType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__3();

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
    // $ANTLR end "rule__ChangeComplexType__Group__2"


    // $ANTLR start "rule__ChangeComplexType__Group__2__Impl"
    // InternalSim.g:2709:1: rule__ChangeComplexType__Group__2__Impl : ( ( rule__ChangeComplexType__RootEntityAssignment_2 )? ) ;
    public final void rule__ChangeComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2713:1: ( ( ( rule__ChangeComplexType__RootEntityAssignment_2 )? ) )
            // InternalSim.g:2714:1: ( ( rule__ChangeComplexType__RootEntityAssignment_2 )? )
            {
            // InternalSim.g:2714:1: ( ( rule__ChangeComplexType__RootEntityAssignment_2 )? )
            // InternalSim.g:2715:2: ( rule__ChangeComplexType__RootEntityAssignment_2 )?
            {
             before(grammarAccess.getChangeComplexTypeAccess().getRootEntityAssignment_2()); 
            // InternalSim.g:2716:2: ( rule__ChangeComplexType__RootEntityAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=22 && LA40_0<=23)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2716:3: rule__ChangeComplexType__RootEntityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeComplexType__RootEntityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeComplexTypeAccess().getRootEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group__2__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group__3"
    // InternalSim.g:2724:1: rule__ChangeComplexType__Group__3 : rule__ChangeComplexType__Group__3__Impl rule__ChangeComplexType__Group__4 ;
    public final void rule__ChangeComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2728:1: ( rule__ChangeComplexType__Group__3__Impl rule__ChangeComplexType__Group__4 )
            // InternalSim.g:2729:2: rule__ChangeComplexType__Group__3__Impl rule__ChangeComplexType__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ChangeComplexType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__4();

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
    // $ANTLR end "rule__ChangeComplexType__Group__3"


    // $ANTLR start "rule__ChangeComplexType__Group__3__Impl"
    // InternalSim.g:2736:1: rule__ChangeComplexType__Group__3__Impl : ( ( rule__ChangeComplexType__RenameToAssignment_3 )? ) ;
    public final void rule__ChangeComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2740:1: ( ( ( rule__ChangeComplexType__RenameToAssignment_3 )? ) )
            // InternalSim.g:2741:1: ( ( rule__ChangeComplexType__RenameToAssignment_3 )? )
            {
            // InternalSim.g:2741:1: ( ( rule__ChangeComplexType__RenameToAssignment_3 )? )
            // InternalSim.g:2742:2: ( rule__ChangeComplexType__RenameToAssignment_3 )?
            {
             before(grammarAccess.getChangeComplexTypeAccess().getRenameToAssignment_3()); 
            // InternalSim.g:2743:2: ( rule__ChangeComplexType__RenameToAssignment_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSim.g:2743:3: rule__ChangeComplexType__RenameToAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeComplexType__RenameToAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeComplexTypeAccess().getRenameToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group__3__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group__4"
    // InternalSim.g:2751:1: rule__ChangeComplexType__Group__4 : rule__ChangeComplexType__Group__4__Impl ;
    public final void rule__ChangeComplexType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2755:1: ( rule__ChangeComplexType__Group__4__Impl )
            // InternalSim.g:2756:2: rule__ChangeComplexType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group__4__Impl();

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
    // $ANTLR end "rule__ChangeComplexType__Group__4"


    // $ANTLR start "rule__ChangeComplexType__Group__4__Impl"
    // InternalSim.g:2762:1: rule__ChangeComplexType__Group__4__Impl : ( ( rule__ChangeComplexType__Group_4__0 )? ) ;
    public final void rule__ChangeComplexType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2766:1: ( ( ( rule__ChangeComplexType__Group_4__0 )? ) )
            // InternalSim.g:2767:1: ( ( rule__ChangeComplexType__Group_4__0 )? )
            {
            // InternalSim.g:2767:1: ( ( rule__ChangeComplexType__Group_4__0 )? )
            // InternalSim.g:2768:2: ( rule__ChangeComplexType__Group_4__0 )?
            {
             before(grammarAccess.getChangeComplexTypeAccess().getGroup_4()); 
            // InternalSim.g:2769:2: ( rule__ChangeComplexType__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==30) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSim.g:2769:3: rule__ChangeComplexType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ChangeComplexType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChangeComplexTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group__4__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group_4__0"
    // InternalSim.g:2778:1: rule__ChangeComplexType__Group_4__0 : rule__ChangeComplexType__Group_4__0__Impl rule__ChangeComplexType__Group_4__1 ;
    public final void rule__ChangeComplexType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2782:1: ( rule__ChangeComplexType__Group_4__0__Impl rule__ChangeComplexType__Group_4__1 )
            // InternalSim.g:2783:2: rule__ChangeComplexType__Group_4__0__Impl rule__ChangeComplexType__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ChangeComplexType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group_4__1();

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
    // $ANTLR end "rule__ChangeComplexType__Group_4__0"


    // $ANTLR start "rule__ChangeComplexType__Group_4__0__Impl"
    // InternalSim.g:2790:1: rule__ChangeComplexType__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__ChangeComplexType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2794:1: ( ( 'extends' ) )
            // InternalSim.g:2795:1: ( 'extends' )
            {
            // InternalSim.g:2795:1: ( 'extends' )
            // InternalSim.g:2796:2: 'extends'
            {
             before(grammarAccess.getChangeComplexTypeAccess().getExtendsKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChangeComplexTypeAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group_4__0__Impl"


    // $ANTLR start "rule__ChangeComplexType__Group_4__1"
    // InternalSim.g:2805:1: rule__ChangeComplexType__Group_4__1 : rule__ChangeComplexType__Group_4__1__Impl ;
    public final void rule__ChangeComplexType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2809:1: ( rule__ChangeComplexType__Group_4__1__Impl )
            // InternalSim.g:2810:2: rule__ChangeComplexType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__Group_4__1__Impl();

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
    // $ANTLR end "rule__ChangeComplexType__Group_4__1"


    // $ANTLR start "rule__ChangeComplexType__Group_4__1__Impl"
    // InternalSim.g:2816:1: rule__ChangeComplexType__Group_4__1__Impl : ( ( rule__ChangeComplexType__ExtendFromAssignment_4_1 ) ) ;
    public final void rule__ChangeComplexType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2820:1: ( ( ( rule__ChangeComplexType__ExtendFromAssignment_4_1 ) ) )
            // InternalSim.g:2821:1: ( ( rule__ChangeComplexType__ExtendFromAssignment_4_1 ) )
            {
            // InternalSim.g:2821:1: ( ( rule__ChangeComplexType__ExtendFromAssignment_4_1 ) )
            // InternalSim.g:2822:2: ( rule__ChangeComplexType__ExtendFromAssignment_4_1 )
            {
             before(grammarAccess.getChangeComplexTypeAccess().getExtendFromAssignment_4_1()); 
            // InternalSim.g:2823:2: ( rule__ChangeComplexType__ExtendFromAssignment_4_1 )
            // InternalSim.g:2823:3: rule__ChangeComplexType__ExtendFromAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeComplexType__ExtendFromAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeComplexTypeAccess().getExtendFromAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__Group_4__1__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group__0"
    // InternalSim.g:2832:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2836:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSim.g:2837:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSim.g:2844:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2848:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2849:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2849:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2850:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2851:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2851:3: rule__SGrabFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2859:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2863:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSim.g:2864:2: rule__SGrabFeatureRule__Group__1__Impl
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
    // InternalSim.g:2870:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2874:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2875:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2875:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSim.g:2876:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2877:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSim.g:2877:3: rule__SGrabFeatureRule__Group_1__0
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
    // InternalSim.g:2886:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2890:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSim.g:2891:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2898:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2902:1: ( ( 'as' ) )
            // InternalSim.g:2903:1: ( 'as' )
            {
            // InternalSim.g:2903:1: ( 'as' )
            // InternalSim.g:2904:2: 'as'
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:2913:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2917:1: ( rule__SGrabFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2918:2: rule__SGrabFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2924:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2928:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2929:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2929:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2930:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2931:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2931:3: rule__SGrabFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:2940:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2944:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSim.g:2945:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2952:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2956:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2957:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2957:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2958:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2959:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2959:3: rule__SMorphFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2967:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2971:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSim.g:2972:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2979:1: rule__SMorphFeatureRule__Group__1__Impl : ( 'to' ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2983:1: ( ( 'to' ) )
            // InternalSim.g:2984:1: ( 'to' )
            {
            // InternalSim.g:2984:1: ( 'to' )
            // InternalSim.g:2985:2: 'to'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getToKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getToKeyword_1()); 

            }


            }

        }
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
    // InternalSim.g:2994:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl rule__SMorphFeatureRule__Group__3 ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2998:1: ( rule__SMorphFeatureRule__Group__2__Impl rule__SMorphFeatureRule__Group__3 )
            // InternalSim.g:2999:2: rule__SMorphFeatureRule__Group__2__Impl rule__SMorphFeatureRule__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SMorphFeatureRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__3();

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
    // InternalSim.g:3006:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3010:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSim.g:3011:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSim.g:3011:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSim.g:3012:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSim.g:3013:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==31) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalSim.g:3013:3: rule__SMorphFeatureRule__Group_2__0
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


    // $ANTLR start "rule__SMorphFeatureRule__Group__3"
    // InternalSim.g:3021:1: rule__SMorphFeatureRule__Group__3 : rule__SMorphFeatureRule__Group__3__Impl rule__SMorphFeatureRule__Group__4 ;
    public final void rule__SMorphFeatureRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3025:1: ( rule__SMorphFeatureRule__Group__3__Impl rule__SMorphFeatureRule__Group__4 )
            // InternalSim.g:3026:2: rule__SMorphFeatureRule__Group__3__Impl rule__SMorphFeatureRule__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SMorphFeatureRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__4();

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
    // $ANTLR end "rule__SMorphFeatureRule__Group__3"


    // $ANTLR start "rule__SMorphFeatureRule__Group__3__Impl"
    // InternalSim.g:3033:1: rule__SMorphFeatureRule__Group__3__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_3 ) ) ;
    public final void rule__SMorphFeatureRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3037:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_3 ) ) )
            // InternalSim.g:3038:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_3 ) )
            {
            // InternalSim.g:3038:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_3 ) )
            // InternalSim.g:3039:2: ( rule__SMorphFeatureRule__RetypeToAssignment_3 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_3()); 
            // InternalSim.g:3040:2: ( rule__SMorphFeatureRule__RetypeToAssignment_3 )
            // InternalSim.g:3040:3: rule__SMorphFeatureRule__RetypeToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RetypeToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__3__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group__4"
    // InternalSim.g:3048:1: rule__SMorphFeatureRule__Group__4 : rule__SMorphFeatureRule__Group__4__Impl ;
    public final void rule__SMorphFeatureRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3052:1: ( rule__SMorphFeatureRule__Group__4__Impl )
            // InternalSim.g:3053:2: rule__SMorphFeatureRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group__4__Impl();

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
    // $ANTLR end "rule__SMorphFeatureRule__Group__4"


    // $ANTLR start "rule__SMorphFeatureRule__Group__4__Impl"
    // InternalSim.g:3059:1: rule__SMorphFeatureRule__Group__4__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )? ) ;
    public final void rule__SMorphFeatureRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3063:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )? ) )
            // InternalSim.g:3064:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )? )
            {
            // InternalSim.g:3064:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )? )
            // InternalSim.g:3065:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_4()); 
            // InternalSim.g:3066:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_INT) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalSim.g:3066:3: rule__SMorphFeatureRule__RemultiplyToAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphFeatureRule__RemultiplyToAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group__4__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__0"
    // InternalSim.g:3075:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3079:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSim.g:3080:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:3087:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_2_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3091:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_2_0 ) ) )
            // InternalSim.g:3092:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_2_0 ) )
            {
            // InternalSim.g:3092:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_2_0 ) )
            // InternalSim.g:3093:2: ( rule__SMorphFeatureRule__RenameToAssignment_2_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_2_0()); 
            // InternalSim.g:3094:2: ( rule__SMorphFeatureRule__RenameToAssignment_2_0 )
            // InternalSim.g:3094:3: rule__SMorphFeatureRule__RenameToAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RenameToAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_2_0()); 

            }


            }

        }
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
    // InternalSim.g:3102:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3106:1: ( rule__SMorphFeatureRule__Group_2__1__Impl )
            // InternalSim.g:3107:2: rule__SMorphFeatureRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__1__Impl();

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
    // InternalSim.g:3113:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( ':' ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3117:1: ( ( ':' ) )
            // InternalSim.g:3118:1: ( ':' )
            {
            // InternalSim.g:3118:1: ( ':' )
            // InternalSim.g:3119:2: ':'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDomainProxy__Group__0"
    // InternalSim.g:3129:1: rule__SDomainProxy__Group__0 : rule__SDomainProxy__Group__0__Impl rule__SDomainProxy__Group__1 ;
    public final void rule__SDomainProxy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3133:1: ( rule__SDomainProxy__Group__0__Impl rule__SDomainProxy__Group__1 )
            // InternalSim.g:3134:2: rule__SDomainProxy__Group__0__Impl rule__SDomainProxy__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SDomainProxy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomainProxy__Group__1();

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
    // $ANTLR end "rule__SDomainProxy__Group__0"


    // $ANTLR start "rule__SDomainProxy__Group__0__Impl"
    // InternalSim.g:3141:1: rule__SDomainProxy__Group__0__Impl : ( () ) ;
    public final void rule__SDomainProxy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3145:1: ( ( () ) )
            // InternalSim.g:3146:1: ( () )
            {
            // InternalSim.g:3146:1: ( () )
            // InternalSim.g:3147:2: ()
            {
             before(grammarAccess.getSDomainProxyAccess().getSDomainProxyAction_0()); 
            // InternalSim.g:3148:2: ()
            // InternalSim.g:3148:3: 
            {
            }

             after(grammarAccess.getSDomainProxyAccess().getSDomainProxyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomainProxy__Group__0__Impl"


    // $ANTLR start "rule__SDomainProxy__Group__1"
    // InternalSim.g:3156:1: rule__SDomainProxy__Group__1 : rule__SDomainProxy__Group__1__Impl rule__SDomainProxy__Group__2 ;
    public final void rule__SDomainProxy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3160:1: ( rule__SDomainProxy__Group__1__Impl rule__SDomainProxy__Group__2 )
            // InternalSim.g:3161:2: rule__SDomainProxy__Group__1__Impl rule__SDomainProxy__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SDomainProxy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomainProxy__Group__2();

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
    // $ANTLR end "rule__SDomainProxy__Group__1"


    // $ANTLR start "rule__SDomainProxy__Group__1__Impl"
    // InternalSim.g:3168:1: rule__SDomainProxy__Group__1__Impl : ( 'grab' ) ;
    public final void rule__SDomainProxy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3172:1: ( ( 'grab' ) )
            // InternalSim.g:3173:1: ( 'grab' )
            {
            // InternalSim.g:3173:1: ( 'grab' )
            // InternalSim.g:3174:2: 'grab'
            {
             before(grammarAccess.getSDomainProxyAccess().getGrabKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSDomainProxyAccess().getGrabKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomainProxy__Group__1__Impl"


    // $ANTLR start "rule__SDomainProxy__Group__2"
    // InternalSim.g:3183:1: rule__SDomainProxy__Group__2 : rule__SDomainProxy__Group__2__Impl rule__SDomainProxy__Group__3 ;
    public final void rule__SDomainProxy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3187:1: ( rule__SDomainProxy__Group__2__Impl rule__SDomainProxy__Group__3 )
            // InternalSim.g:3188:2: rule__SDomainProxy__Group__2__Impl rule__SDomainProxy__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SDomainProxy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDomainProxy__Group__3();

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
    // $ANTLR end "rule__SDomainProxy__Group__2"


    // $ANTLR start "rule__SDomainProxy__Group__2__Impl"
    // InternalSim.g:3195:1: rule__SDomainProxy__Group__2__Impl : ( 'domain' ) ;
    public final void rule__SDomainProxy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3199:1: ( ( 'domain' ) )
            // InternalSim.g:3200:1: ( 'domain' )
            {
            // InternalSim.g:3200:1: ( 'domain' )
            // InternalSim.g:3201:2: 'domain'
            {
             before(grammarAccess.getSDomainProxyAccess().getDomainKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSDomainProxyAccess().getDomainKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomainProxy__Group__2__Impl"


    // $ANTLR start "rule__SDomainProxy__Group__3"
    // InternalSim.g:3210:1: rule__SDomainProxy__Group__3 : rule__SDomainProxy__Group__3__Impl ;
    public final void rule__SDomainProxy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3214:1: ( rule__SDomainProxy__Group__3__Impl )
            // InternalSim.g:3215:2: rule__SDomainProxy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDomainProxy__Group__3__Impl();

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
    // $ANTLR end "rule__SDomainProxy__Group__3"


    // $ANTLR start "rule__SDomainProxy__Group__3__Impl"
    // InternalSim.g:3221:1: rule__SDomainProxy__Group__3__Impl : ( ( rule__SDomainProxy__DeductionRuleAssignment_3 ) ) ;
    public final void rule__SDomainProxy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3225:1: ( ( ( rule__SDomainProxy__DeductionRuleAssignment_3 ) ) )
            // InternalSim.g:3226:1: ( ( rule__SDomainProxy__DeductionRuleAssignment_3 ) )
            {
            // InternalSim.g:3226:1: ( ( rule__SDomainProxy__DeductionRuleAssignment_3 ) )
            // InternalSim.g:3227:2: ( rule__SDomainProxy__DeductionRuleAssignment_3 )
            {
             before(grammarAccess.getSDomainProxyAccess().getDeductionRuleAssignment_3()); 
            // InternalSim.g:3228:2: ( rule__SDomainProxy__DeductionRuleAssignment_3 )
            // InternalSim.g:3228:3: rule__SDomainProxy__DeductionRuleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SDomainProxy__DeductionRuleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSDomainProxyAccess().getDeductionRuleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomainProxy__Group__3__Impl"


    // $ANTLR start "rule__SAggregate__Group__0"
    // InternalSim.g:3237:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3241:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSim.g:3242:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3249:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3253:1: ( ( () ) )
            // InternalSim.g:3254:1: ( () )
            {
            // InternalSim.g:3254:1: ( () )
            // InternalSim.g:3255:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSim.g:3256:2: ()
            // InternalSim.g:3256:3: 
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
    // InternalSim.g:3264:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3268:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSim.g:3269:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3276:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3280:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSim.g:3281:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSim.g:3281:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSim.g:3282:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSim.g:3283:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSim.g:3283:3: rule__SAggregate__Alternatives_1
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
    // InternalSim.g:3291:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3295:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSim.g:3296:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:3303:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3307:1: ( ( '{' ) )
            // InternalSim.g:3308:1: ( '{' )
            {
            // InternalSim.g:3308:1: ( '{' )
            // InternalSim.g:3309:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:3318:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3322:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSim.g:3323:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:3330:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3334:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSim.g:3335:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSim.g:3335:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSim.g:3336:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSim.g:3337:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==21||LA46_0==23||LA46_0==32||(LA46_0>=37 && LA46_0<=38)||(LA46_0>=40 && LA46_0<=41)||(LA46_0>=43 && LA46_0<=46)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSim.g:3337:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SAggregate__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalSim.g:3345:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3349:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSim.g:3350:2: rule__SAggregate__Group__4__Impl
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
    // InternalSim.g:3356:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3360:1: ( ( '}' ) )
            // InternalSim.g:3361:1: ( '}' )
            {
            // InternalSim.g:3361:1: ( '}' )
            // InternalSim.g:3362:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:3372:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3376:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSim.g:3377:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:3384:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3388:1: ( ( 'grab' ) )
            // InternalSim.g:3389:1: ( 'grab' )
            {
            // InternalSim.g:3389:1: ( 'grab' )
            // InternalSim.g:3390:2: 'grab'
            {
             before(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:3399:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3403:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSim.g:3404:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:3411:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3415:1: ( ( 'aggregate' ) )
            // InternalSim.g:3416:1: ( 'aggregate' )
            {
            // InternalSim.g:3416:1: ( 'aggregate' )
            // InternalSim.g:3417:2: 'aggregate'
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
    // InternalSim.g:3426:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3430:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSim.g:3431:2: rule__SAggregate__Group_1_0__2__Impl
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
    // InternalSim.g:3437:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3441:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSim.g:3442:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSim.g:3442:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSim.g:3443:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSim.g:3444:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSim.g:3444:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
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
    // InternalSim.g:3453:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3457:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSim.g:3458:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:3465:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3469:1: ( ( 'constraint' ) )
            // InternalSim.g:3470:1: ( 'constraint' )
            {
            // InternalSim.g:3470:1: ( 'constraint' )
            // InternalSim.g:3471:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:3480:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3484:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSim.g:3485:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:3492:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3496:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSim.g:3497:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSim.g:3497:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSim.g:3498:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSim.g:3499:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSim.g:3499:3: rule__SConstraint__NameAssignment_1
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
    // InternalSim.g:3507:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3511:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSim.g:3512:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalSim.g:3519:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3523:1: ( ( ':' ) )
            // InternalSim.g:3524:1: ( ':' )
            {
            // InternalSim.g:3524:1: ( ':' )
            // InternalSim.g:3525:2: ':'
            {
             before(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3534:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3538:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSim.g:3539:2: rule__SConstraint__Group__3__Impl
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
    // InternalSim.g:3545:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3549:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSim.g:3550:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSim.g:3550:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSim.g:3551:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSim.g:3552:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSim.g:3552:3: rule__SConstraint__ConditionAssignment_3
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
    // InternalSim.g:3561:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3565:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSim.g:3566:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3573:1: rule__SPrimitive__Group__0__Impl : ( ( rule__SPrimitive__Alternatives_0 ) ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3577:1: ( ( ( rule__SPrimitive__Alternatives_0 ) ) )
            // InternalSim.g:3578:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            {
            // InternalSim.g:3578:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            // InternalSim.g:3579:2: ( rule__SPrimitive__Alternatives_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_0()); 
            // InternalSim.g:3580:2: ( rule__SPrimitive__Alternatives_0 )
            // InternalSim.g:3580:3: rule__SPrimitive__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalSim.g:3588:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3592:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSim.g:3593:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3600:1: rule__SPrimitive__Group__1__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3604:1: ( ( '{' ) )
            // InternalSim.g:3605:1: ( '{' )
            {
            // InternalSim.g:3605:1: ( '{' )
            // InternalSim.g:3606:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalSim.g:3615:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3619:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSim.g:3620:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3627:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3631:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) )
            // InternalSim.g:3632:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            {
            // InternalSim.g:3632:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            // InternalSim.g:3633:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_2()); 
            // InternalSim.g:3634:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==36) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSim.g:3634:3: rule__SPrimitive__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SPrimitive__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_2()); 

            }


            }

        }
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
    // InternalSim.g:3642:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3646:1: ( rule__SPrimitive__Group__3__Impl )
            // InternalSim.g:3647:2: rule__SPrimitive__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group__3__Impl();

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
    // InternalSim.g:3653:1: rule__SPrimitive__Group__3__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3657:1: ( ( '}' ) )
            // InternalSim.g:3658:1: ( '}' )
            {
            // InternalSim.g:3658:1: ( '}' )
            // InternalSim.g:3659:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SPrimitive__Group_0_0__0"
    // InternalSim.g:3669:1: rule__SPrimitive__Group_0_0__0 : rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 ;
    public final void rule__SPrimitive__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3673:1: ( rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 )
            // InternalSim.g:3674:2: rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1
            {
            pushFollow(FOLLOW_26);
            rule__SPrimitive__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_0__1();

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
    // $ANTLR end "rule__SPrimitive__Group_0_0__0"


    // $ANTLR start "rule__SPrimitive__Group_0_0__0__Impl"
    // InternalSim.g:3681:1: rule__SPrimitive__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SPrimitive__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3685:1: ( ( () ) )
            // InternalSim.g:3686:1: ( () )
            {
            // InternalSim.g:3686:1: ( () )
            // InternalSim.g:3687:2: ()
            {
             before(grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0()); 
            // InternalSim.g:3688:2: ()
            // InternalSim.g:3688:3: 
            {
            }

             after(grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_0__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_0__1"
    // InternalSim.g:3696:1: rule__SPrimitive__Group_0_0__1 : rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 ;
    public final void rule__SPrimitive__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3700:1: ( rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 )
            // InternalSim.g:3701:2: rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2
            {
            pushFollow(FOLLOW_27);
            rule__SPrimitive__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_0__2();

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
    // $ANTLR end "rule__SPrimitive__Group_0_0__1"


    // $ANTLR start "rule__SPrimitive__Group_0_0__1__Impl"
    // InternalSim.g:3708:1: rule__SPrimitive__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SPrimitive__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3712:1: ( ( 'grab' ) )
            // InternalSim.g:3713:1: ( 'grab' )
            {
            // InternalSim.g:3713:1: ( 'grab' )
            // InternalSim.g:3714:2: 'grab'
            {
             before(grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_0__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_0__2"
    // InternalSim.g:3723:1: rule__SPrimitive__Group_0_0__2 : rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 ;
    public final void rule__SPrimitive__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3727:1: ( rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 )
            // InternalSim.g:3728:2: rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3
            {
            pushFollow(FOLLOW_5);
            rule__SPrimitive__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_0__3();

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
    // $ANTLR end "rule__SPrimitive__Group_0_0__2"


    // $ANTLR start "rule__SPrimitive__Group_0_0__2__Impl"
    // InternalSim.g:3735:1: rule__SPrimitive__Group_0_0__2__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3739:1: ( ( 'primitive' ) )
            // InternalSim.g:3740:1: ( 'primitive' )
            {
            // InternalSim.g:3740:1: ( 'primitive' )
            // InternalSim.g:3741:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_0__2__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_0__3"
    // InternalSim.g:3750:1: rule__SPrimitive__Group_0_0__3 : rule__SPrimitive__Group_0_0__3__Impl ;
    public final void rule__SPrimitive__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3754:1: ( rule__SPrimitive__Group_0_0__3__Impl )
            // InternalSim.g:3755:2: rule__SPrimitive__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_0__3__Impl();

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
    // $ANTLR end "rule__SPrimitive__Group_0_0__3"


    // $ANTLR start "rule__SPrimitive__Group_0_0__3__Impl"
    // InternalSim.g:3761:1: rule__SPrimitive__Group_0_0__3__Impl : ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SPrimitive__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3765:1: ( ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:3766:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:3766:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:3767:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:3768:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:3768:3: rule__SPrimitive__DeductionRuleAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__DeductionRuleAssignment_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_0__3__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_1__0"
    // InternalSim.g:3777:1: rule__SPrimitive__Group_0_1__0 : rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 ;
    public final void rule__SPrimitive__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3781:1: ( rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 )
            // InternalSim.g:3782:2: rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SPrimitive__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_1__1();

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
    // $ANTLR end "rule__SPrimitive__Group_0_1__0"


    // $ANTLR start "rule__SPrimitive__Group_0_1__0__Impl"
    // InternalSim.g:3789:1: rule__SPrimitive__Group_0_1__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitive__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3793:1: ( ( 'archetype' ) )
            // InternalSim.g:3794:1: ( 'archetype' )
            {
            // InternalSim.g:3794:1: ( 'archetype' )
            // InternalSim.g:3795:2: 'archetype'
            {
             before(grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_1__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_1__1"
    // InternalSim.g:3804:1: rule__SPrimitive__Group_0_1__1 : rule__SPrimitive__Group_0_1__1__Impl ;
    public final void rule__SPrimitive__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3808:1: ( rule__SPrimitive__Group_0_1__1__Impl )
            // InternalSim.g:3809:2: rule__SPrimitive__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__SPrimitive__Group_0_1__1"


    // $ANTLR start "rule__SPrimitive__Group_0_1__1__Impl"
    // InternalSim.g:3815:1: rule__SPrimitive__Group_0_1__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) ;
    public final void rule__SPrimitive__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3819:1: ( ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) )
            // InternalSim.g:3820:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            {
            // InternalSim.g:3820:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            // InternalSim.g:3821:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_1_1()); 
            // InternalSim.g:3822:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            // InternalSim.g:3822:3: rule__SPrimitive__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_1__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_2__0"
    // InternalSim.g:3831:1: rule__SPrimitive__Group_0_2__0 : rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 ;
    public final void rule__SPrimitive__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3835:1: ( rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 )
            // InternalSim.g:3836:2: rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SPrimitive__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_2__1();

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
    // $ANTLR end "rule__SPrimitive__Group_0_2__0"


    // $ANTLR start "rule__SPrimitive__Group_0_2__0__Impl"
    // InternalSim.g:3843:1: rule__SPrimitive__Group_0_2__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3847:1: ( ( 'primitive' ) )
            // InternalSim.g:3848:1: ( 'primitive' )
            {
            // InternalSim.g:3848:1: ( 'primitive' )
            // InternalSim.g:3849:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_2__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_2__1"
    // InternalSim.g:3858:1: rule__SPrimitive__Group_0_2__1 : rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 ;
    public final void rule__SPrimitive__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3862:1: ( rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 )
            // InternalSim.g:3863:2: rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2
            {
            pushFollow(FOLLOW_28);
            rule__SPrimitive__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_2__2();

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
    // $ANTLR end "rule__SPrimitive__Group_0_2__1"


    // $ANTLR start "rule__SPrimitive__Group_0_2__1__Impl"
    // InternalSim.g:3870:1: rule__SPrimitive__Group_0_2__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) ;
    public final void rule__SPrimitive__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3874:1: ( ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:3875:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:3875:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            // InternalSim.g:3876:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:3877:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            // InternalSim.g:3877:3: rule__SPrimitive__NameAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__NameAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_2__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_2__2"
    // InternalSim.g:3885:1: rule__SPrimitive__Group_0_2__2 : rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 ;
    public final void rule__SPrimitive__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3889:1: ( rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 )
            // InternalSim.g:3890:2: rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3
            {
            pushFollow(FOLLOW_5);
            rule__SPrimitive__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_2__3();

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
    // $ANTLR end "rule__SPrimitive__Group_0_2__2"


    // $ANTLR start "rule__SPrimitive__Group_0_2__2__Impl"
    // InternalSim.g:3897:1: rule__SPrimitive__Group_0_2__2__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3901:1: ( ( 'redefines' ) )
            // InternalSim.g:3902:1: ( 'redefines' )
            {
            // InternalSim.g:3902:1: ( 'redefines' )
            // InternalSim.g:3903:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_0_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_2__2__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0_2__3"
    // InternalSim.g:3912:1: rule__SPrimitive__Group_0_2__3 : rule__SPrimitive__Group_0_2__3__Impl ;
    public final void rule__SPrimitive__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3916:1: ( rule__SPrimitive__Group_0_2__3__Impl )
            // InternalSim.g:3917:2: rule__SPrimitive__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0_2__3__Impl();

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
    // $ANTLR end "rule__SPrimitive__Group_0_2__3"


    // $ANTLR start "rule__SPrimitive__Group_0_2__3__Impl"
    // InternalSim.g:3923:1: rule__SPrimitive__Group_0_2__3__Impl : ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) ;
    public final void rule__SPrimitive__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3927:1: ( ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) )
            // InternalSim.g:3928:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            {
            // InternalSim.g:3928:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            // InternalSim.g:3929:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_0_2_3()); 
            // InternalSim.g:3930:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            // InternalSim.g:3930:3: rule__SPrimitive__RedefinesAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__RedefinesAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0_2__3__Impl"


    // $ANTLR start "rule__SEnumeration__Group__0"
    // InternalSim.g:3939:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3943:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSim.g:3944:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3951:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3955:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSim.g:3956:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSim.g:3956:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSim.g:3957:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSim.g:3958:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSim.g:3958:3: rule__SEnumeration__Alternatives_0
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
    // InternalSim.g:3966:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3970:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSim.g:3971:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:3978:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3982:1: ( ( '{' ) )
            // InternalSim.g:3983:1: ( '{' )
            {
            // InternalSim.g:3983:1: ( '{' )
            // InternalSim.g:3984:2: '{'
            {
             before(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:3993:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3997:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSim.g:3998:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:4005:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4009:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSim.g:4010:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSim.g:4010:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSim.g:4011:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSim.g:4012:2: ( rule__SEnumeration__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==32||LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSim.g:4012:3: rule__SEnumeration__Group_2__0
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
    // InternalSim.g:4020:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4024:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSim.g:4025:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:4032:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4036:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:4037:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:4037:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSim.g:4038:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:4039:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSim.g:4039:3: rule__SEnumeration__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SEnumeration__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalSim.g:4047:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4051:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSim.g:4052:2: rule__SEnumeration__Group__4__Impl
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
    // InternalSim.g:4058:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4062:1: ( ( '}' ) )
            // InternalSim.g:4063:1: ( '}' )
            {
            // InternalSim.g:4063:1: ( '}' )
            // InternalSim.g:4064:2: '}'
            {
             before(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:4074:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4078:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSim.g:4079:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:4086:1: rule__SEnumeration__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4090:1: ( ( () ) )
            // InternalSim.g:4091:1: ( () )
            {
            // InternalSim.g:4091:1: ( () )
            // InternalSim.g:4092:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 
            // InternalSim.g:4093:2: ()
            // InternalSim.g:4093:3: 
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
    // InternalSim.g:4101:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4105:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSim.g:4106:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSim.g:4113:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4117:1: ( ( 'grab' ) )
            // InternalSim.g:4118:1: ( 'grab' )
            {
            // InternalSim.g:4118:1: ( 'grab' )
            // InternalSim.g:4119:2: 'grab'
            {
             before(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:4128:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4132:1: ( rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 )
            // InternalSim.g:4133:2: rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4140:1: rule__SEnumeration__Group_0_0__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4144:1: ( ( 'enumeration' ) )
            // InternalSim.g:4145:1: ( 'enumeration' )
            {
            // InternalSim.g:4145:1: ( 'enumeration' )
            // InternalSim.g:4146:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4155:1: rule__SEnumeration__Group_0_0__3 : rule__SEnumeration__Group_0_0__3__Impl ;
    public final void rule__SEnumeration__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4159:1: ( rule__SEnumeration__Group_0_0__3__Impl )
            // InternalSim.g:4160:2: rule__SEnumeration__Group_0_0__3__Impl
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
    // InternalSim.g:4166:1: rule__SEnumeration__Group_0_0__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SEnumeration__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4170:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:4171:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:4171:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:4172:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:4173:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:4173:3: rule__SEnumeration__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:4182:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4186:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSim.g:4187:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:4194:1: rule__SEnumeration__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4198:1: ( ( () ) )
            // InternalSim.g:4199:1: ( () )
            {
            // InternalSim.g:4199:1: ( () )
            // InternalSim.g:4200:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 
            // InternalSim.g:4201:2: ()
            // InternalSim.g:4201:3: 
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
    // InternalSim.g:4209:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4213:1: ( rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 )
            // InternalSim.g:4214:2: rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSim.g:4221:1: rule__SEnumeration__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4225:1: ( ( 'ditch' ) )
            // InternalSim.g:4226:1: ( 'ditch' )
            {
            // InternalSim.g:4226:1: ( 'ditch' )
            // InternalSim.g:4227:2: 'ditch'
            {
             before(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:4236:1: rule__SEnumeration__Group_0_1__2 : rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 ;
    public final void rule__SEnumeration__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4240:1: ( rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 )
            // InternalSim.g:4241:2: rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4248:1: rule__SEnumeration__Group_0_1__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4252:1: ( ( 'enumeration' ) )
            // InternalSim.g:4253:1: ( 'enumeration' )
            {
            // InternalSim.g:4253:1: ( 'enumeration' )
            // InternalSim.g:4254:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4263:1: rule__SEnumeration__Group_0_1__3 : rule__SEnumeration__Group_0_1__3__Impl ;
    public final void rule__SEnumeration__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4267:1: ( rule__SEnumeration__Group_0_1__3__Impl )
            // InternalSim.g:4268:2: rule__SEnumeration__Group_0_1__3__Impl
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
    // InternalSim.g:4274:1: rule__SEnumeration__Group_0_1__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SEnumeration__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4278:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:4279:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:4279:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:4280:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:4281:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:4281:3: rule__SEnumeration__DeductionRuleAssignment_0_1_3
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
    // InternalSim.g:4290:1: rule__SEnumeration__Group_0_2__0 : rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 ;
    public final void rule__SEnumeration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4294:1: ( rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 )
            // InternalSim.g:4295:2: rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4302:1: rule__SEnumeration__Group_0_2__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4306:1: ( ( 'enumeration' ) )
            // InternalSim.g:4307:1: ( 'enumeration' )
            {
            // InternalSim.g:4307:1: ( 'enumeration' )
            // InternalSim.g:4308:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4317:1: rule__SEnumeration__Group_0_2__1 : rule__SEnumeration__Group_0_2__1__Impl ;
    public final void rule__SEnumeration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4321:1: ( rule__SEnumeration__Group_0_2__1__Impl )
            // InternalSim.g:4322:2: rule__SEnumeration__Group_0_2__1__Impl
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
    // InternalSim.g:4328:1: rule__SEnumeration__Group_0_2__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) ;
    public final void rule__SEnumeration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4332:1: ( ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:4333:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:4333:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            // InternalSim.g:4334:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:4335:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            // InternalSim.g:4335:3: rule__SEnumeration__NameAssignment_0_2_1
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
    // InternalSim.g:4344:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4348:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSim.g:4349:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSim.g:4356:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4360:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSim.g:4361:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSim.g:4361:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSim.g:4362:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSim.g:4363:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSim.g:4363:3: rule__SEnumeration__LiteralsAssignment_2_0
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
    // InternalSim.g:4371:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4375:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSim.g:4376:2: rule__SEnumeration__Group_2__1__Impl
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
    // InternalSim.g:4382:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4386:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSim.g:4387:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSim.g:4387:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSim.g:4388:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSim.g:4389:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==42) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalSim.g:4389:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SEnumeration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalSim.g:4398:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4402:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSim.g:4403:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:4410:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4414:1: ( ( ',' ) )
            // InternalSim.g:4415:1: ( ',' )
            {
            // InternalSim.g:4415:1: ( ',' )
            // InternalSim.g:4416:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:4425:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4429:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSim.g:4430:2: rule__SEnumeration__Group_2_1__1__Impl
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
    // InternalSim.g:4436:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4440:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSim.g:4441:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSim.g:4441:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSim.g:4442:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSim.g:4443:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSim.g:4443:3: rule__SEnumeration__LiteralsAssignment_2_1_1
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
    // InternalSim.g:4452:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4456:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSim.g:4457:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:4464:1: rule__SLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4468:1: ( ( () ) )
            // InternalSim.g:4469:1: ( () )
            {
            // InternalSim.g:4469:1: ( () )
            // InternalSim.g:4470:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 
            // InternalSim.g:4471:2: ()
            // InternalSim.g:4471:3: 
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
    // InternalSim.g:4479:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4483:1: ( rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 )
            // InternalSim.g:4484:2: rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4491:1: rule__SLiteral__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4495:1: ( ( 'grab' ) )
            // InternalSim.g:4496:1: ( 'grab' )
            {
            // InternalSim.g:4496:1: ( 'grab' )
            // InternalSim.g:4497:2: 'grab'
            {
             before(grammarAccess.getSLiteralAccess().getGrabKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:4506:1: rule__SLiteral__Group_0__2 : rule__SLiteral__Group_0__2__Impl ;
    public final void rule__SLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4510:1: ( rule__SLiteral__Group_0__2__Impl )
            // InternalSim.g:4511:2: rule__SLiteral__Group_0__2__Impl
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
    // InternalSim.g:4517:1: rule__SLiteral__Group_0__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4521:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:4522:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:4522:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:4523:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:4524:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            // InternalSim.g:4524:3: rule__SLiteral__DeductionRuleAssignment_0_2
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
    // InternalSim.g:4533:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4537:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSim.g:4538:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:4545:1: rule__SLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4549:1: ( ( () ) )
            // InternalSim.g:4550:1: ( () )
            {
            // InternalSim.g:4550:1: ( () )
            // InternalSim.g:4551:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 
            // InternalSim.g:4552:2: ()
            // InternalSim.g:4552:3: 
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
    // InternalSim.g:4560:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4564:1: ( rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 )
            // InternalSim.g:4565:2: rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4572:1: rule__SLiteral__Group_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4576:1: ( ( 'ditch' ) )
            // InternalSim.g:4577:1: ( 'ditch' )
            {
            // InternalSim.g:4577:1: ( 'ditch' )
            // InternalSim.g:4578:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:4587:1: rule__SLiteral__Group_1__2 : rule__SLiteral__Group_1__2__Impl ;
    public final void rule__SLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4591:1: ( rule__SLiteral__Group_1__2__Impl )
            // InternalSim.g:4592:2: rule__SLiteral__Group_1__2__Impl
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
    // InternalSim.g:4598:1: rule__SLiteral__Group_1__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4602:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:4603:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:4603:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:4604:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:4605:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            // InternalSim.g:4605:3: rule__SLiteral__DeductionRuleAssignment_1_2
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


    // $ANTLR start "rule__SEntityType__Group__0"
    // InternalSim.g:4614:1: rule__SEntityType__Group__0 : rule__SEntityType__Group__0__Impl rule__SEntityType__Group__1 ;
    public final void rule__SEntityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4618:1: ( rule__SEntityType__Group__0__Impl rule__SEntityType__Group__1 )
            // InternalSim.g:4619:2: rule__SEntityType__Group__0__Impl rule__SEntityType__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SEntityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group__1();

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
    // $ANTLR end "rule__SEntityType__Group__0"


    // $ANTLR start "rule__SEntityType__Group__0__Impl"
    // InternalSim.g:4626:1: rule__SEntityType__Group__0__Impl : ( ( rule__SEntityType__Alternatives_0 ) ) ;
    public final void rule__SEntityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4630:1: ( ( ( rule__SEntityType__Alternatives_0 ) ) )
            // InternalSim.g:4631:1: ( ( rule__SEntityType__Alternatives_0 ) )
            {
            // InternalSim.g:4631:1: ( ( rule__SEntityType__Alternatives_0 ) )
            // InternalSim.g:4632:2: ( rule__SEntityType__Alternatives_0 )
            {
             before(grammarAccess.getSEntityTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4633:2: ( rule__SEntityType__Alternatives_0 )
            // InternalSim.g:4633:3: rule__SEntityType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group__0__Impl"


    // $ANTLR start "rule__SEntityType__Group__1"
    // InternalSim.g:4641:1: rule__SEntityType__Group__1 : rule__SEntityType__Group__1__Impl ;
    public final void rule__SEntityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4645:1: ( rule__SEntityType__Group__1__Impl )
            // InternalSim.g:4646:2: rule__SEntityType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group__1__Impl();

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
    // $ANTLR end "rule__SEntityType__Group__1"


    // $ANTLR start "rule__SEntityType__Group__1__Impl"
    // InternalSim.g:4652:1: rule__SEntityType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SEntityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4656:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:4657:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:4657:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:4658:2: ruleSComplexTypeFeatures
            {
             before(grammarAccess.getSEntityTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeFeatures();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getSComplexTypeFeaturesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_0__0"
    // InternalSim.g:4668:1: rule__SEntityType__Group_0_0__0 : rule__SEntityType__Group_0_0__0__Impl rule__SEntityType__Group_0_0__1 ;
    public final void rule__SEntityType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4672:1: ( rule__SEntityType__Group_0_0__0__Impl rule__SEntityType__Group_0_0__1 )
            // InternalSim.g:4673:2: rule__SEntityType__Group_0_0__0__Impl rule__SEntityType__Group_0_0__1
            {
            pushFollow(FOLLOW_26);
            rule__SEntityType__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_0__1();

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
    // $ANTLR end "rule__SEntityType__Group_0_0__0"


    // $ANTLR start "rule__SEntityType__Group_0_0__0__Impl"
    // InternalSim.g:4680:1: rule__SEntityType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEntityType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4684:1: ( ( () ) )
            // InternalSim.g:4685:1: ( () )
            {
            // InternalSim.g:4685:1: ( () )
            // InternalSim.g:4686:2: ()
            {
             before(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_0_0()); 
            // InternalSim.g:4687:2: ()
            // InternalSim.g:4687:3: 
            {
            }

             after(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_0__0__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_0__1"
    // InternalSim.g:4695:1: rule__SEntityType__Group_0_0__1 : rule__SEntityType__Group_0_0__1__Impl rule__SEntityType__Group_0_0__2 ;
    public final void rule__SEntityType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4699:1: ( rule__SEntityType__Group_0_0__1__Impl rule__SEntityType__Group_0_0__2 )
            // InternalSim.g:4700:2: rule__SEntityType__Group_0_0__1__Impl rule__SEntityType__Group_0_0__2
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_0__2();

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
    // $ANTLR end "rule__SEntityType__Group_0_0__1"


    // $ANTLR start "rule__SEntityType__Group_0_0__1__Impl"
    // InternalSim.g:4707:1: rule__SEntityType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEntityType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4711:1: ( ( 'grab' ) )
            // InternalSim.g:4712:1: ( 'grab' )
            {
            // InternalSim.g:4712:1: ( 'grab' )
            // InternalSim.g:4713:2: 'grab'
            {
             before(grammarAccess.getSEntityTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getGrabKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_0__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_0__2"
    // InternalSim.g:4722:1: rule__SEntityType__Group_0_0__2 : rule__SEntityType__Group_0_0__2__Impl rule__SEntityType__Group_0_0__3 ;
    public final void rule__SEntityType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4726:1: ( rule__SEntityType__Group_0_0__2__Impl rule__SEntityType__Group_0_0__3 )
            // InternalSim.g:4727:2: rule__SEntityType__Group_0_0__2__Impl rule__SEntityType__Group_0_0__3
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_0__3();

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
    // $ANTLR end "rule__SEntityType__Group_0_0__2"


    // $ANTLR start "rule__SEntityType__Group_0_0__2__Impl"
    // InternalSim.g:4734:1: rule__SEntityType__Group_0_0__2__Impl : ( ( rule__SEntityType__RootAssignment_0_0_2 )? ) ;
    public final void rule__SEntityType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4738:1: ( ( ( rule__SEntityType__RootAssignment_0_0_2 )? ) )
            // InternalSim.g:4739:1: ( ( rule__SEntityType__RootAssignment_0_0_2 )? )
            {
            // InternalSim.g:4739:1: ( ( rule__SEntityType__RootAssignment_0_0_2 )? )
            // InternalSim.g:4740:2: ( rule__SEntityType__RootAssignment_0_0_2 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_0_2()); 
            // InternalSim.g:4741:2: ( rule__SEntityType__RootAssignment_0_0_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:4741:3: rule__SEntityType__RootAssignment_0_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__RootAssignment_0_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_0__2__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_0__3"
    // InternalSim.g:4749:1: rule__SEntityType__Group_0_0__3 : rule__SEntityType__Group_0_0__3__Impl rule__SEntityType__Group_0_0__4 ;
    public final void rule__SEntityType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4753:1: ( rule__SEntityType__Group_0_0__3__Impl rule__SEntityType__Group_0_0__4 )
            // InternalSim.g:4754:2: rule__SEntityType__Group_0_0__3__Impl rule__SEntityType__Group_0_0__4
            {
            pushFollow(FOLLOW_5);
            rule__SEntityType__Group_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_0__4();

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
    // $ANTLR end "rule__SEntityType__Group_0_0__3"


    // $ANTLR start "rule__SEntityType__Group_0_0__3__Impl"
    // InternalSim.g:4761:1: rule__SEntityType__Group_0_0__3__Impl : ( 'entity' ) ;
    public final void rule__SEntityType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4765:1: ( ( 'entity' ) )
            // InternalSim.g:4766:1: ( 'entity' )
            {
            // InternalSim.g:4766:1: ( 'entity' )
            // InternalSim.g:4767:2: 'entity'
            {
             before(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_0_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_0__3__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_0__4"
    // InternalSim.g:4776:1: rule__SEntityType__Group_0_0__4 : rule__SEntityType__Group_0_0__4__Impl ;
    public final void rule__SEntityType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4780:1: ( rule__SEntityType__Group_0_0__4__Impl )
            // InternalSim.g:4781:2: rule__SEntityType__Group_0_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_0__4__Impl();

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
    // $ANTLR end "rule__SEntityType__Group_0_0__4"


    // $ANTLR start "rule__SEntityType__Group_0_0__4__Impl"
    // InternalSim.g:4787:1: rule__SEntityType__Group_0_0__4__Impl : ( ( rule__SEntityType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SEntityType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4791:1: ( ( ( rule__SEntityType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:4792:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:4792:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:4793:2: ( rule__SEntityType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:4794:2: ( rule__SEntityType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:4794:3: rule__SEntityType__DeductionRuleAssignment_0_0_4
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__DeductionRuleAssignment_0_0_4();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_0__4__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_1__0"
    // InternalSim.g:4803:1: rule__SEntityType__Group_0_1__0 : rule__SEntityType__Group_0_1__0__Impl rule__SEntityType__Group_0_1__1 ;
    public final void rule__SEntityType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4807:1: ( rule__SEntityType__Group_0_1__0__Impl rule__SEntityType__Group_0_1__1 )
            // InternalSim.g:4808:2: rule__SEntityType__Group_0_1__0__Impl rule__SEntityType__Group_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SEntityType__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_1__1();

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
    // $ANTLR end "rule__SEntityType__Group_0_1__0"


    // $ANTLR start "rule__SEntityType__Group_0_1__0__Impl"
    // InternalSim.g:4815:1: rule__SEntityType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEntityType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4819:1: ( ( () ) )
            // InternalSim.g:4820:1: ( () )
            {
            // InternalSim.g:4820:1: ( () )
            // InternalSim.g:4821:2: ()
            {
             before(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_1_0()); 
            // InternalSim.g:4822:2: ()
            // InternalSim.g:4822:3: 
            {
            }

             after(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_1__0__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_1__1"
    // InternalSim.g:4830:1: rule__SEntityType__Group_0_1__1 : rule__SEntityType__Group_0_1__1__Impl rule__SEntityType__Group_0_1__2 ;
    public final void rule__SEntityType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4834:1: ( rule__SEntityType__Group_0_1__1__Impl rule__SEntityType__Group_0_1__2 )
            // InternalSim.g:4835:2: rule__SEntityType__Group_0_1__1__Impl rule__SEntityType__Group_0_1__2
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_1__2();

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
    // $ANTLR end "rule__SEntityType__Group_0_1__1"


    // $ANTLR start "rule__SEntityType__Group_0_1__1__Impl"
    // InternalSim.g:4842:1: rule__SEntityType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEntityType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4846:1: ( ( 'ditch' ) )
            // InternalSim.g:4847:1: ( 'ditch' )
            {
            // InternalSim.g:4847:1: ( 'ditch' )
            // InternalSim.g:4848:2: 'ditch'
            {
             before(grammarAccess.getSEntityTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getDitchKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_1__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_1__2"
    // InternalSim.g:4857:1: rule__SEntityType__Group_0_1__2 : rule__SEntityType__Group_0_1__2__Impl rule__SEntityType__Group_0_1__3 ;
    public final void rule__SEntityType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4861:1: ( rule__SEntityType__Group_0_1__2__Impl rule__SEntityType__Group_0_1__3 )
            // InternalSim.g:4862:2: rule__SEntityType__Group_0_1__2__Impl rule__SEntityType__Group_0_1__3
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_1__3();

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
    // $ANTLR end "rule__SEntityType__Group_0_1__2"


    // $ANTLR start "rule__SEntityType__Group_0_1__2__Impl"
    // InternalSim.g:4869:1: rule__SEntityType__Group_0_1__2__Impl : ( ( rule__SEntityType__RootAssignment_0_1_2 )? ) ;
    public final void rule__SEntityType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4873:1: ( ( ( rule__SEntityType__RootAssignment_0_1_2 )? ) )
            // InternalSim.g:4874:1: ( ( rule__SEntityType__RootAssignment_0_1_2 )? )
            {
            // InternalSim.g:4874:1: ( ( rule__SEntityType__RootAssignment_0_1_2 )? )
            // InternalSim.g:4875:2: ( rule__SEntityType__RootAssignment_0_1_2 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_1_2()); 
            // InternalSim.g:4876:2: ( rule__SEntityType__RootAssignment_0_1_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==23) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSim.g:4876:3: rule__SEntityType__RootAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__RootAssignment_0_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_1__2__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_1__3"
    // InternalSim.g:4884:1: rule__SEntityType__Group_0_1__3 : rule__SEntityType__Group_0_1__3__Impl rule__SEntityType__Group_0_1__4 ;
    public final void rule__SEntityType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4888:1: ( rule__SEntityType__Group_0_1__3__Impl rule__SEntityType__Group_0_1__4 )
            // InternalSim.g:4889:2: rule__SEntityType__Group_0_1__3__Impl rule__SEntityType__Group_0_1__4
            {
            pushFollow(FOLLOW_5);
            rule__SEntityType__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_1__4();

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
    // $ANTLR end "rule__SEntityType__Group_0_1__3"


    // $ANTLR start "rule__SEntityType__Group_0_1__3__Impl"
    // InternalSim.g:4896:1: rule__SEntityType__Group_0_1__3__Impl : ( 'entity' ) ;
    public final void rule__SEntityType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4900:1: ( ( 'entity' ) )
            // InternalSim.g:4901:1: ( 'entity' )
            {
            // InternalSim.g:4901:1: ( 'entity' )
            // InternalSim.g:4902:2: 'entity'
            {
             before(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_1_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_1__3__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_1__4"
    // InternalSim.g:4911:1: rule__SEntityType__Group_0_1__4 : rule__SEntityType__Group_0_1__4__Impl ;
    public final void rule__SEntityType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4915:1: ( rule__SEntityType__Group_0_1__4__Impl )
            // InternalSim.g:4916:2: rule__SEntityType__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_1__4__Impl();

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
    // $ANTLR end "rule__SEntityType__Group_0_1__4"


    // $ANTLR start "rule__SEntityType__Group_0_1__4__Impl"
    // InternalSim.g:4922:1: rule__SEntityType__Group_0_1__4__Impl : ( ( rule__SEntityType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SEntityType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4926:1: ( ( ( rule__SEntityType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:4927:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:4927:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:4928:2: ( rule__SEntityType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:4929:2: ( rule__SEntityType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:4929:3: rule__SEntityType__DeductionRuleAssignment_0_1_4
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__DeductionRuleAssignment_0_1_4();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_1__4__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_2__0"
    // InternalSim.g:4938:1: rule__SEntityType__Group_0_2__0 : rule__SEntityType__Group_0_2__0__Impl rule__SEntityType__Group_0_2__1 ;
    public final void rule__SEntityType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4942:1: ( rule__SEntityType__Group_0_2__0__Impl rule__SEntityType__Group_0_2__1 )
            // InternalSim.g:4943:2: rule__SEntityType__Group_0_2__0__Impl rule__SEntityType__Group_0_2__1
            {
            pushFollow(FOLLOW_36);
            rule__SEntityType__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_2__1();

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
    // $ANTLR end "rule__SEntityType__Group_0_2__0"


    // $ANTLR start "rule__SEntityType__Group_0_2__0__Impl"
    // InternalSim.g:4950:1: rule__SEntityType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SEntityType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4954:1: ( ( () ) )
            // InternalSim.g:4955:1: ( () )
            {
            // InternalSim.g:4955:1: ( () )
            // InternalSim.g:4956:2: ()
            {
             before(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_2_0()); 
            // InternalSim.g:4957:2: ()
            // InternalSim.g:4957:3: 
            {
            }

             after(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_2__0__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_2__1"
    // InternalSim.g:4965:1: rule__SEntityType__Group_0_2__1 : rule__SEntityType__Group_0_2__1__Impl rule__SEntityType__Group_0_2__2 ;
    public final void rule__SEntityType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4969:1: ( rule__SEntityType__Group_0_2__1__Impl rule__SEntityType__Group_0_2__2 )
            // InternalSim.g:4970:2: rule__SEntityType__Group_0_2__1__Impl rule__SEntityType__Group_0_2__2
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_2__2();

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
    // $ANTLR end "rule__SEntityType__Group_0_2__1"


    // $ANTLR start "rule__SEntityType__Group_0_2__1__Impl"
    // InternalSim.g:4977:1: rule__SEntityType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SEntityType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4981:1: ( ( 'morph' ) )
            // InternalSim.g:4982:1: ( 'morph' )
            {
            // InternalSim.g:4982:1: ( 'morph' )
            // InternalSim.g:4983:2: 'morph'
            {
             before(grammarAccess.getSEntityTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getMorphKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_2__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_2__2"
    // InternalSim.g:4992:1: rule__SEntityType__Group_0_2__2 : rule__SEntityType__Group_0_2__2__Impl rule__SEntityType__Group_0_2__3 ;
    public final void rule__SEntityType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4996:1: ( rule__SEntityType__Group_0_2__2__Impl rule__SEntityType__Group_0_2__3 )
            // InternalSim.g:4997:2: rule__SEntityType__Group_0_2__2__Impl rule__SEntityType__Group_0_2__3
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_2__3();

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
    // $ANTLR end "rule__SEntityType__Group_0_2__2"


    // $ANTLR start "rule__SEntityType__Group_0_2__2__Impl"
    // InternalSim.g:5004:1: rule__SEntityType__Group_0_2__2__Impl : ( ( rule__SEntityType__RootAssignment_0_2_2 )? ) ;
    public final void rule__SEntityType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5008:1: ( ( ( rule__SEntityType__RootAssignment_0_2_2 )? ) )
            // InternalSim.g:5009:1: ( ( rule__SEntityType__RootAssignment_0_2_2 )? )
            {
            // InternalSim.g:5009:1: ( ( rule__SEntityType__RootAssignment_0_2_2 )? )
            // InternalSim.g:5010:2: ( rule__SEntityType__RootAssignment_0_2_2 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_2_2()); 
            // InternalSim.g:5011:2: ( rule__SEntityType__RootAssignment_0_2_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==23) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:5011:3: rule__SEntityType__RootAssignment_0_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__RootAssignment_0_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_2__2__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_2__3"
    // InternalSim.g:5019:1: rule__SEntityType__Group_0_2__3 : rule__SEntityType__Group_0_2__3__Impl rule__SEntityType__Group_0_2__4 ;
    public final void rule__SEntityType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5023:1: ( rule__SEntityType__Group_0_2__3__Impl rule__SEntityType__Group_0_2__4 )
            // InternalSim.g:5024:2: rule__SEntityType__Group_0_2__3__Impl rule__SEntityType__Group_0_2__4
            {
            pushFollow(FOLLOW_5);
            rule__SEntityType__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_2__4();

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
    // $ANTLR end "rule__SEntityType__Group_0_2__3"


    // $ANTLR start "rule__SEntityType__Group_0_2__3__Impl"
    // InternalSim.g:5031:1: rule__SEntityType__Group_0_2__3__Impl : ( 'entity' ) ;
    public final void rule__SEntityType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5035:1: ( ( 'entity' ) )
            // InternalSim.g:5036:1: ( 'entity' )
            {
            // InternalSim.g:5036:1: ( 'entity' )
            // InternalSim.g:5037:2: 'entity'
            {
             before(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_2_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_2__3__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_2__4"
    // InternalSim.g:5046:1: rule__SEntityType__Group_0_2__4 : rule__SEntityType__Group_0_2__4__Impl ;
    public final void rule__SEntityType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5050:1: ( rule__SEntityType__Group_0_2__4__Impl )
            // InternalSim.g:5051:2: rule__SEntityType__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_2__4__Impl();

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
    // $ANTLR end "rule__SEntityType__Group_0_2__4"


    // $ANTLR start "rule__SEntityType__Group_0_2__4__Impl"
    // InternalSim.g:5057:1: rule__SEntityType__Group_0_2__4__Impl : ( ( rule__SEntityType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SEntityType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5061:1: ( ( ( rule__SEntityType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5062:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5062:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5063:2: ( rule__SEntityType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5064:2: ( rule__SEntityType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5064:3: rule__SEntityType__DeductionRuleAssignment_0_2_4
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__DeductionRuleAssignment_0_2_4();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_2__4__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_3__0"
    // InternalSim.g:5073:1: rule__SEntityType__Group_0_3__0 : rule__SEntityType__Group_0_3__0__Impl rule__SEntityType__Group_0_3__1 ;
    public final void rule__SEntityType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5077:1: ( rule__SEntityType__Group_0_3__0__Impl rule__SEntityType__Group_0_3__1 )
            // InternalSim.g:5078:2: rule__SEntityType__Group_0_3__0__Impl rule__SEntityType__Group_0_3__1
            {
            pushFollow(FOLLOW_37);
            rule__SEntityType__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_3__1();

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
    // $ANTLR end "rule__SEntityType__Group_0_3__0"


    // $ANTLR start "rule__SEntityType__Group_0_3__0__Impl"
    // InternalSim.g:5085:1: rule__SEntityType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SEntityType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5089:1: ( ( () ) )
            // InternalSim.g:5090:1: ( () )
            {
            // InternalSim.g:5090:1: ( () )
            // InternalSim.g:5091:2: ()
            {
             before(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_3_0()); 
            // InternalSim.g:5092:2: ()
            // InternalSim.g:5092:3: 
            {
            }

             after(grammarAccess.getSEntityTypeAccess().getSEntityTypeAction_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_3__0__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_3__1"
    // InternalSim.g:5100:1: rule__SEntityType__Group_0_3__1 : rule__SEntityType__Group_0_3__1__Impl rule__SEntityType__Group_0_3__2 ;
    public final void rule__SEntityType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5104:1: ( rule__SEntityType__Group_0_3__1__Impl rule__SEntityType__Group_0_3__2 )
            // InternalSim.g:5105:2: rule__SEntityType__Group_0_3__1__Impl rule__SEntityType__Group_0_3__2
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_3__2();

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
    // $ANTLR end "rule__SEntityType__Group_0_3__1"


    // $ANTLR start "rule__SEntityType__Group_0_3__1__Impl"
    // InternalSim.g:5112:1: rule__SEntityType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SEntityType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5116:1: ( ( 'fuse' ) )
            // InternalSim.g:5117:1: ( 'fuse' )
            {
            // InternalSim.g:5117:1: ( 'fuse' )
            // InternalSim.g:5118:2: 'fuse'
            {
             before(grammarAccess.getSEntityTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getFuseKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_3__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_3__2"
    // InternalSim.g:5127:1: rule__SEntityType__Group_0_3__2 : rule__SEntityType__Group_0_3__2__Impl rule__SEntityType__Group_0_3__3 ;
    public final void rule__SEntityType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5131:1: ( rule__SEntityType__Group_0_3__2__Impl rule__SEntityType__Group_0_3__3 )
            // InternalSim.g:5132:2: rule__SEntityType__Group_0_3__2__Impl rule__SEntityType__Group_0_3__3
            {
            pushFollow(FOLLOW_35);
            rule__SEntityType__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_3__3();

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
    // $ANTLR end "rule__SEntityType__Group_0_3__2"


    // $ANTLR start "rule__SEntityType__Group_0_3__2__Impl"
    // InternalSim.g:5139:1: rule__SEntityType__Group_0_3__2__Impl : ( ( rule__SEntityType__RootAssignment_0_3_2 )? ) ;
    public final void rule__SEntityType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5143:1: ( ( ( rule__SEntityType__RootAssignment_0_3_2 )? ) )
            // InternalSim.g:5144:1: ( ( rule__SEntityType__RootAssignment_0_3_2 )? )
            {
            // InternalSim.g:5144:1: ( ( rule__SEntityType__RootAssignment_0_3_2 )? )
            // InternalSim.g:5145:2: ( rule__SEntityType__RootAssignment_0_3_2 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_3_2()); 
            // InternalSim.g:5146:2: ( rule__SEntityType__RootAssignment_0_3_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:5146:3: rule__SEntityType__RootAssignment_0_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__RootAssignment_0_3_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_3__2__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_3__3"
    // InternalSim.g:5154:1: rule__SEntityType__Group_0_3__3 : rule__SEntityType__Group_0_3__3__Impl rule__SEntityType__Group_0_3__4 ;
    public final void rule__SEntityType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5158:1: ( rule__SEntityType__Group_0_3__3__Impl rule__SEntityType__Group_0_3__4 )
            // InternalSim.g:5159:2: rule__SEntityType__Group_0_3__3__Impl rule__SEntityType__Group_0_3__4
            {
            pushFollow(FOLLOW_5);
            rule__SEntityType__Group_0_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_3__4();

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
    // $ANTLR end "rule__SEntityType__Group_0_3__3"


    // $ANTLR start "rule__SEntityType__Group_0_3__3__Impl"
    // InternalSim.g:5166:1: rule__SEntityType__Group_0_3__3__Impl : ( 'entity' ) ;
    public final void rule__SEntityType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5170:1: ( ( 'entity' ) )
            // InternalSim.g:5171:1: ( 'entity' )
            {
            // InternalSim.g:5171:1: ( 'entity' )
            // InternalSim.g:5172:2: 'entity'
            {
             before(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_3_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_3__3__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_3__4"
    // InternalSim.g:5181:1: rule__SEntityType__Group_0_3__4 : rule__SEntityType__Group_0_3__4__Impl ;
    public final void rule__SEntityType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5185:1: ( rule__SEntityType__Group_0_3__4__Impl )
            // InternalSim.g:5186:2: rule__SEntityType__Group_0_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_3__4__Impl();

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
    // $ANTLR end "rule__SEntityType__Group_0_3__4"


    // $ANTLR start "rule__SEntityType__Group_0_3__4__Impl"
    // InternalSim.g:5192:1: rule__SEntityType__Group_0_3__4__Impl : ( ( rule__SEntityType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SEntityType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5196:1: ( ( ( rule__SEntityType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5197:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5197:1: ( ( rule__SEntityType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5198:2: ( rule__SEntityType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5199:2: ( rule__SEntityType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5199:3: rule__SEntityType__DeductionRuleAssignment_0_3_4
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__DeductionRuleAssignment_0_3_4();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleAssignment_0_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_3__4__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_4__0"
    // InternalSim.g:5208:1: rule__SEntityType__Group_0_4__0 : rule__SEntityType__Group_0_4__0__Impl rule__SEntityType__Group_0_4__1 ;
    public final void rule__SEntityType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5212:1: ( rule__SEntityType__Group_0_4__0__Impl rule__SEntityType__Group_0_4__1 )
            // InternalSim.g:5213:2: rule__SEntityType__Group_0_4__0__Impl rule__SEntityType__Group_0_4__1
            {
            pushFollow(FOLLOW_38);
            rule__SEntityType__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_4__1();

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
    // $ANTLR end "rule__SEntityType__Group_0_4__0"


    // $ANTLR start "rule__SEntityType__Group_0_4__0__Impl"
    // InternalSim.g:5220:1: rule__SEntityType__Group_0_4__0__Impl : ( ( rule__SEntityType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SEntityType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5224:1: ( ( ( rule__SEntityType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5225:1: ( ( rule__SEntityType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5225:1: ( ( rule__SEntityType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5226:2: ( rule__SEntityType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5227:2: ( rule__SEntityType__AbstractAssignment_0_4_0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSim.g:5227:3: rule__SEntityType__AbstractAssignment_0_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__AbstractAssignment_0_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getAbstractAssignment_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_4__0__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_4__1"
    // InternalSim.g:5235:1: rule__SEntityType__Group_0_4__1 : rule__SEntityType__Group_0_4__1__Impl rule__SEntityType__Group_0_4__2 ;
    public final void rule__SEntityType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5239:1: ( rule__SEntityType__Group_0_4__1__Impl rule__SEntityType__Group_0_4__2 )
            // InternalSim.g:5240:2: rule__SEntityType__Group_0_4__1__Impl rule__SEntityType__Group_0_4__2
            {
            pushFollow(FOLLOW_38);
            rule__SEntityType__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_4__2();

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
    // $ANTLR end "rule__SEntityType__Group_0_4__1"


    // $ANTLR start "rule__SEntityType__Group_0_4__1__Impl"
    // InternalSim.g:5247:1: rule__SEntityType__Group_0_4__1__Impl : ( ( rule__SEntityType__RootAssignment_0_4_1 )? ) ;
    public final void rule__SEntityType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5251:1: ( ( ( rule__SEntityType__RootAssignment_0_4_1 )? ) )
            // InternalSim.g:5252:1: ( ( rule__SEntityType__RootAssignment_0_4_1 )? )
            {
            // InternalSim.g:5252:1: ( ( rule__SEntityType__RootAssignment_0_4_1 )? )
            // InternalSim.g:5253:2: ( rule__SEntityType__RootAssignment_0_4_1 )?
            {
             before(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_4_1()); 
            // InternalSim.g:5254:2: ( rule__SEntityType__RootAssignment_0_4_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:5254:3: rule__SEntityType__RootAssignment_0_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEntityType__RootAssignment_0_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEntityTypeAccess().getRootAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_4__1__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_4__2"
    // InternalSim.g:5262:1: rule__SEntityType__Group_0_4__2 : rule__SEntityType__Group_0_4__2__Impl rule__SEntityType__Group_0_4__3 ;
    public final void rule__SEntityType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5266:1: ( rule__SEntityType__Group_0_4__2__Impl rule__SEntityType__Group_0_4__3 )
            // InternalSim.g:5267:2: rule__SEntityType__Group_0_4__2__Impl rule__SEntityType__Group_0_4__3
            {
            pushFollow(FOLLOW_5);
            rule__SEntityType__Group_0_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_4__3();

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
    // $ANTLR end "rule__SEntityType__Group_0_4__2"


    // $ANTLR start "rule__SEntityType__Group_0_4__2__Impl"
    // InternalSim.g:5274:1: rule__SEntityType__Group_0_4__2__Impl : ( 'entity' ) ;
    public final void rule__SEntityType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5278:1: ( ( 'entity' ) )
            // InternalSim.g:5279:1: ( 'entity' )
            {
            // InternalSim.g:5279:1: ( 'entity' )
            // InternalSim.g:5280:2: 'entity'
            {
             before(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_4_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getEntityKeyword_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_4__2__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_4__3"
    // InternalSim.g:5289:1: rule__SEntityType__Group_0_4__3 : rule__SEntityType__Group_0_4__3__Impl rule__SEntityType__Group_0_4__4 ;
    public final void rule__SEntityType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5293:1: ( rule__SEntityType__Group_0_4__3__Impl rule__SEntityType__Group_0_4__4 )
            // InternalSim.g:5294:2: rule__SEntityType__Group_0_4__3__Impl rule__SEntityType__Group_0_4__4
            {
            pushFollow(FOLLOW_39);
            rule__SEntityType__Group_0_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_4__4();

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
    // $ANTLR end "rule__SEntityType__Group_0_4__3"


    // $ANTLR start "rule__SEntityType__Group_0_4__3__Impl"
    // InternalSim.g:5301:1: rule__SEntityType__Group_0_4__3__Impl : ( ( rule__SEntityType__NameAssignment_0_4_3 ) ) ;
    public final void rule__SEntityType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5305:1: ( ( ( rule__SEntityType__NameAssignment_0_4_3 ) ) )
            // InternalSim.g:5306:1: ( ( rule__SEntityType__NameAssignment_0_4_3 ) )
            {
            // InternalSim.g:5306:1: ( ( rule__SEntityType__NameAssignment_0_4_3 ) )
            // InternalSim.g:5307:2: ( rule__SEntityType__NameAssignment_0_4_3 )
            {
             before(grammarAccess.getSEntityTypeAccess().getNameAssignment_0_4_3()); 
            // InternalSim.g:5308:2: ( rule__SEntityType__NameAssignment_0_4_3 )
            // InternalSim.g:5308:3: rule__SEntityType__NameAssignment_0_4_3
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__NameAssignment_0_4_3();

            state._fsp--;


            }

             after(grammarAccess.getSEntityTypeAccess().getNameAssignment_0_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_4__3__Impl"


    // $ANTLR start "rule__SEntityType__Group_0_4__4"
    // InternalSim.g:5316:1: rule__SEntityType__Group_0_4__4 : rule__SEntityType__Group_0_4__4__Impl ;
    public final void rule__SEntityType__Group_0_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5320:1: ( rule__SEntityType__Group_0_4__4__Impl )
            // InternalSim.g:5321:2: rule__SEntityType__Group_0_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEntityType__Group_0_4__4__Impl();

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
    // $ANTLR end "rule__SEntityType__Group_0_4__4"


    // $ANTLR start "rule__SEntityType__Group_0_4__4__Impl"
    // InternalSim.g:5327:1: rule__SEntityType__Group_0_4__4__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SEntityType__Group_0_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5331:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5332:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5332:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5333:2: ruleSComplexTypeExtends
            {
             before(grammarAccess.getSEntityTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_4()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeExtends();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getSComplexTypeExtendsParserRuleCall_0_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__Group_0_4__4__Impl"


    // $ANTLR start "rule__SDetailType__Group__0"
    // InternalSim.g:5343:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5347:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSim.g:5348:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:5355:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5359:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSim.g:5360:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSim.g:5360:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSim.g:5361:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSim.g:5362:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSim.g:5362:3: rule__SDetailType__Alternatives_0
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
    // InternalSim.g:5370:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5374:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSim.g:5375:2: rule__SDetailType__Group__1__Impl
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
    // InternalSim.g:5381:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5385:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:5386:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:5386:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:5387:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:5397:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5401:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSim.g:5402:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:5409:1: rule__SDetailType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5413:1: ( ( () ) )
            // InternalSim.g:5414:1: ( () )
            {
            // InternalSim.g:5414:1: ( () )
            // InternalSim.g:5415:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 
            // InternalSim.g:5416:2: ()
            // InternalSim.g:5416:3: 
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
    // InternalSim.g:5424:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5428:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSim.g:5429:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5436:1: rule__SDetailType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5440:1: ( ( 'grab' ) )
            // InternalSim.g:5441:1: ( 'grab' )
            {
            // InternalSim.g:5441:1: ( 'grab' )
            // InternalSim.g:5442:2: 'grab'
            {
             before(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:5451:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5455:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSim.g:5456:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5463:1: rule__SDetailType__Group_0_0__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5467:1: ( ( 'detail' ) )
            // InternalSim.g:5468:1: ( 'detail' )
            {
            // InternalSim.g:5468:1: ( 'detail' )
            // InternalSim.g:5469:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2()); 

            }


            }

        }
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
    // InternalSim.g:5478:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5482:1: ( rule__SDetailType__Group_0_0__3__Impl )
            // InternalSim.g:5483:2: rule__SDetailType__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_0__3__Impl();

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
    // InternalSim.g:5489:1: rule__SDetailType__Group_0_0__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5493:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:5494:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:5494:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:5495:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:5496:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:5496:3: rule__SDetailType__DeductionRuleAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group_0_1__0"
    // InternalSim.g:5505:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5509:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSim.g:5510:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:5517:1: rule__SDetailType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5521:1: ( ( () ) )
            // InternalSim.g:5522:1: ( () )
            {
            // InternalSim.g:5522:1: ( () )
            // InternalSim.g:5523:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 
            // InternalSim.g:5524:2: ()
            // InternalSim.g:5524:3: 
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
    // InternalSim.g:5532:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5536:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSim.g:5537:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5544:1: rule__SDetailType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5548:1: ( ( 'ditch' ) )
            // InternalSim.g:5549:1: ( 'ditch' )
            {
            // InternalSim.g:5549:1: ( 'ditch' )
            // InternalSim.g:5550:2: 'ditch'
            {
             before(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5559:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5563:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSim.g:5564:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5571:1: rule__SDetailType__Group_0_1__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5575:1: ( ( 'detail' ) )
            // InternalSim.g:5576:1: ( 'detail' )
            {
            // InternalSim.g:5576:1: ( 'detail' )
            // InternalSim.g:5577:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_2()); 

            }


            }

        }
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
    // InternalSim.g:5586:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5590:1: ( rule__SDetailType__Group_0_1__3__Impl )
            // InternalSim.g:5591:2: rule__SDetailType__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__3__Impl();

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
    // InternalSim.g:5597:1: rule__SDetailType__Group_0_1__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5601:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:5602:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:5602:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:5603:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:5604:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:5604:3: rule__SDetailType__DeductionRuleAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group_0_2__0"
    // InternalSim.g:5613:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5617:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSim.g:5618:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:5625:1: rule__SDetailType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5629:1: ( ( () ) )
            // InternalSim.g:5630:1: ( () )
            {
            // InternalSim.g:5630:1: ( () )
            // InternalSim.g:5631:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 
            // InternalSim.g:5632:2: ()
            // InternalSim.g:5632:3: 
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
    // InternalSim.g:5640:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5644:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSim.g:5645:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5652:1: rule__SDetailType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5656:1: ( ( 'morph' ) )
            // InternalSim.g:5657:1: ( 'morph' )
            {
            // InternalSim.g:5657:1: ( 'morph' )
            // InternalSim.g:5658:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:5667:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5671:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSim.g:5672:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5679:1: rule__SDetailType__Group_0_2__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5683:1: ( ( 'detail' ) )
            // InternalSim.g:5684:1: ( 'detail' )
            {
            // InternalSim.g:5684:1: ( 'detail' )
            // InternalSim.g:5685:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_2()); 

            }


            }

        }
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
    // InternalSim.g:5694:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5698:1: ( rule__SDetailType__Group_0_2__3__Impl )
            // InternalSim.g:5699:2: rule__SDetailType__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_2__3__Impl();

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
    // InternalSim.g:5705:1: rule__SDetailType__Group_0_2__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5709:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) ) )
            // InternalSim.g:5710:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) )
            {
            // InternalSim.g:5710:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) )
            // InternalSim.g:5711:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_3()); 
            // InternalSim.g:5712:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_3 )
            // InternalSim.g:5712:3: rule__SDetailType__DeductionRuleAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group_0_3__0"
    // InternalSim.g:5721:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5725:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSim.g:5726:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSim.g:5733:1: rule__SDetailType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5737:1: ( ( () ) )
            // InternalSim.g:5738:1: ( () )
            {
            // InternalSim.g:5738:1: ( () )
            // InternalSim.g:5739:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 
            // InternalSim.g:5740:2: ()
            // InternalSim.g:5740:3: 
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
    // InternalSim.g:5748:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5752:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSim.g:5753:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5760:1: rule__SDetailType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5764:1: ( ( 'fuse' ) )
            // InternalSim.g:5765:1: ( 'fuse' )
            {
            // InternalSim.g:5765:1: ( 'fuse' )
            // InternalSim.g:5766:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:5775:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5779:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSim.g:5780:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5787:1: rule__SDetailType__Group_0_3__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5791:1: ( ( 'detail' ) )
            // InternalSim.g:5792:1: ( 'detail' )
            {
            // InternalSim.g:5792:1: ( 'detail' )
            // InternalSim.g:5793:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_2()); 

            }


            }

        }
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
    // InternalSim.g:5802:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5806:1: ( rule__SDetailType__Group_0_3__3__Impl )
            // InternalSim.g:5807:2: rule__SDetailType__Group_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_3__3__Impl();

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
    // InternalSim.g:5813:1: rule__SDetailType__Group_0_3__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_3_3 ) ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5817:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_3_3 ) ) )
            // InternalSim.g:5818:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_3 ) )
            {
            // InternalSim.g:5818:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_3 ) )
            // InternalSim.g:5819:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_3()); 
            // InternalSim.g:5820:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_3 )
            // InternalSim.g:5820:3: rule__SDetailType__DeductionRuleAssignment_0_3_3
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__DeductionRuleAssignment_0_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group_0_4__0"
    // InternalSim.g:5829:1: rule__SDetailType__Group_0_4__0 : rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 ;
    public final void rule__SDetailType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5833:1: ( rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 )
            // InternalSim.g:5834:2: rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalSim.g:5841:1: rule__SDetailType__Group_0_4__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SDetailType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5845:1: ( ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5846:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5846:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5847:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5848:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSim.g:5848:3: rule__SDetailType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5856:1: rule__SDetailType__Group_0_4__1 : rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 ;
    public final void rule__SDetailType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5860:1: ( rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 )
            // InternalSim.g:5861:2: rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5868:1: rule__SDetailType__Group_0_4__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5872:1: ( ( 'detail' ) )
            // InternalSim.g:5873:1: ( 'detail' )
            {
            // InternalSim.g:5873:1: ( 'detail' )
            // InternalSim.g:5874:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:5883:1: rule__SDetailType__Group_0_4__2 : rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 ;
    public final void rule__SDetailType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5887:1: ( rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 )
            // InternalSim.g:5888:2: rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalSim.g:5895:1: rule__SDetailType__Group_0_4__2__Impl : ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SDetailType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5899:1: ( ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5900:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5900:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5901:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5902:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            // InternalSim.g:5902:3: rule__SDetailType__NameAssignment_0_4_2
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
    // InternalSim.g:5910:1: rule__SDetailType__Group_0_4__3 : rule__SDetailType__Group_0_4__3__Impl ;
    public final void rule__SDetailType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5914:1: ( rule__SDetailType__Group_0_4__3__Impl )
            // InternalSim.g:5915:2: rule__SDetailType__Group_0_4__3__Impl
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
    // InternalSim.g:5921:1: rule__SDetailType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5925:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5926:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5926:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5927:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5937:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5941:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSim.g:5942:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5949:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5953:1: ( ( 'extends' ) )
            // InternalSim.g:5954:1: ( 'extends' )
            {
            // InternalSim.g:5954:1: ( 'extends' )
            // InternalSim.g:5955:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:5964:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5968:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSim.g:5969:2: rule__SComplexTypeExtends__Group__1__Impl
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
    // InternalSim.g:5975:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5979:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSim.g:5980:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSim.g:5980:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSim.g:5981:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSim.g:5982:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSim.g:5982:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
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
    // InternalSim.g:5991:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5995:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSim.g:5996:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSim.g:6003:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6007:1: ( ( '{' ) )
            // InternalSim.g:6008:1: ( '{' )
            {
            // InternalSim.g:6008:1: ( '{' )
            // InternalSim.g:6009:2: '{'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:6018:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6022:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSim.g:6023:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSim.g:6030:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6034:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSim.g:6035:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSim.g:6035:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSim.g:6036:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSim.g:6037:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==11||(LA58_0>=13 && LA58_0<=14)||LA58_0==32||LA58_0==36||LA58_0==41||LA58_0==44||LA58_0==46||LA58_0==55) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalSim.g:6037:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_43);
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
    // InternalSim.g:6045:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6049:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSim.g:6050:2: rule__SComplexTypeFeatures__Group__2__Impl
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
    // InternalSim.g:6056:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6060:1: ( ( '}' ) )
            // InternalSim.g:6061:1: ( '}' )
            {
            // InternalSim.g:6061:1: ( '}' )
            // InternalSim.g:6062:2: '}'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:6072:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6076:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSim.g:6077:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:6084:1: rule__SAssociation__Group_0__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6088:1: ( ( () ) )
            // InternalSim.g:6089:1: ( () )
            {
            // InternalSim.g:6089:1: ( () )
            // InternalSim.g:6090:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 
            // InternalSim.g:6091:2: ()
            // InternalSim.g:6091:3: 
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
    // InternalSim.g:6099:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6103:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSim.g:6104:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSim.g:6111:1: rule__SAssociation__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6115:1: ( ( 'grab' ) )
            // InternalSim.g:6116:1: ( 'grab' )
            {
            // InternalSim.g:6116:1: ( 'grab' )
            // InternalSim.g:6117:2: 'grab'
            {
             before(grammarAccess.getSAssociationAccess().getGrabKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:6126:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6130:1: ( rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 )
            // InternalSim.g:6131:2: rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:6138:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__Alternatives_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6142:1: ( ( ( rule__SAssociation__Alternatives_0_2 ) ) )
            // InternalSim.g:6143:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            {
            // InternalSim.g:6143:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            // InternalSim.g:6144:2: ( rule__SAssociation__Alternatives_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 
            // InternalSim.g:6145:2: ( rule__SAssociation__Alternatives_0_2 )
            // InternalSim.g:6145:3: rule__SAssociation__Alternatives_0_2
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
    // InternalSim.g:6153:1: rule__SAssociation__Group_0__3 : rule__SAssociation__Group_0__3__Impl ;
    public final void rule__SAssociation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6157:1: ( rule__SAssociation__Group_0__3__Impl )
            // InternalSim.g:6158:2: rule__SAssociation__Group_0__3__Impl
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
    // InternalSim.g:6164:1: rule__SAssociation__Group_0__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAssociation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6168:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6169:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6169:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6170:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6171:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6171:3: rule__SAssociation__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6180:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6184:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSim.g:6185:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:6192:1: rule__SAssociation__Group_1__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6196:1: ( ( () ) )
            // InternalSim.g:6197:1: ( () )
            {
            // InternalSim.g:6197:1: ( () )
            // InternalSim.g:6198:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 
            // InternalSim.g:6199:2: ()
            // InternalSim.g:6199:3: 
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
    // InternalSim.g:6207:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6211:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSim.g:6212:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSim.g:6219:1: rule__SAssociation__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6223:1: ( ( 'morph' ) )
            // InternalSim.g:6224:1: ( 'morph' )
            {
            // InternalSim.g:6224:1: ( 'morph' )
            // InternalSim.g:6225:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:6234:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6238:1: ( rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 )
            // InternalSim.g:6239:2: rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:6246:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__Alternatives_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6250:1: ( ( ( rule__SAssociation__Alternatives_1_2 ) ) )
            // InternalSim.g:6251:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            {
            // InternalSim.g:6251:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            // InternalSim.g:6252:2: ( rule__SAssociation__Alternatives_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 
            // InternalSim.g:6253:2: ( rule__SAssociation__Alternatives_1_2 )
            // InternalSim.g:6253:3: rule__SAssociation__Alternatives_1_2
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
    // InternalSim.g:6261:1: rule__SAssociation__Group_1__3 : rule__SAssociation__Group_1__3__Impl ;
    public final void rule__SAssociation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6265:1: ( rule__SAssociation__Group_1__3__Impl )
            // InternalSim.g:6266:2: rule__SAssociation__Group_1__3__Impl
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
    // InternalSim.g:6272:1: rule__SAssociation__Group_1__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAssociation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6276:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6277:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6277:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6278:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6279:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6279:3: rule__SAssociation__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6288:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6292:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSim.g:6293:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:6300:1: rule__SAssociation__Group_2__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6304:1: ( ( () ) )
            // InternalSim.g:6305:1: ( () )
            {
            // InternalSim.g:6305:1: ( () )
            // InternalSim.g:6306:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 
            // InternalSim.g:6307:2: ()
            // InternalSim.g:6307:3: 
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
    // InternalSim.g:6315:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6319:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSim.g:6320:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalSim.g:6327:1: rule__SAssociation__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6331:1: ( ( 'ditch' ) )
            // InternalSim.g:6332:1: ( 'ditch' )
            {
            // InternalSim.g:6332:1: ( 'ditch' )
            // InternalSim.g:6333:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:6342:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6346:1: ( rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 )
            // InternalSim.g:6347:2: rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:6354:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__Alternatives_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6358:1: ( ( ( rule__SAssociation__Alternatives_2_2 ) ) )
            // InternalSim.g:6359:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            {
            // InternalSim.g:6359:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            // InternalSim.g:6360:2: ( rule__SAssociation__Alternatives_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 
            // InternalSim.g:6361:2: ( rule__SAssociation__Alternatives_2_2 )
            // InternalSim.g:6361:3: rule__SAssociation__Alternatives_2_2
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
    // InternalSim.g:6369:1: rule__SAssociation__Group_2__3 : rule__SAssociation__Group_2__3__Impl ;
    public final void rule__SAssociation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6373:1: ( rule__SAssociation__Group_2__3__Impl )
            // InternalSim.g:6374:2: rule__SAssociation__Group_2__3__Impl
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
    // InternalSim.g:6380:1: rule__SAssociation__Group_2__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAssociation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6384:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6385:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6385:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6386:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6387:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6387:3: rule__SAssociation__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6396:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6400:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSim.g:6401:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6408:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6412:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSim.g:6413:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSim.g:6413:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSim.g:6414:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSim.g:6415:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==55) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSim.g:6415:3: rule__SAssociation__DerivedAssignment_3_0
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
    // InternalSim.g:6423:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6427:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSim.g:6428:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:6435:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6439:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSim.g:6440:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSim.g:6440:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSim.g:6441:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSim.g:6442:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSim.g:6442:3: rule__SAssociation__Alternatives_3_1
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
    // InternalSim.g:6450:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6454:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSim.g:6455:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:6462:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6466:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSim.g:6467:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSim.g:6467:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSim.g:6468:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSim.g:6469:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSim.g:6469:3: rule__SAssociation__NameAssignment_3_2
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
    // InternalSim.g:6477:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6481:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSim.g:6482:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:6489:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6493:1: ( ( ':' ) )
            // InternalSim.g:6494:1: ( ':' )
            {
            // InternalSim.g:6494:1: ( ':' )
            // InternalSim.g:6495:2: ':'
            {
             before(grammarAccess.getSAssociationAccess().getColonKeyword_3_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:6504:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6508:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSim.g:6509:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:6516:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6520:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSim.g:6521:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSim.g:6521:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSim.g:6522:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSim.g:6523:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSim.g:6523:3: rule__SAssociation__TypeAssignment_3_4
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
    // InternalSim.g:6531:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6535:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSim.g:6536:2: rule__SAssociation__Group_3__5__Impl
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
    // InternalSim.g:6542:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6546:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSim.g:6547:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSim.g:6547:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSim.g:6548:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSim.g:6549:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSim.g:6549:3: rule__SAssociation__MultiplicityAssignment_3_5
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
    // InternalSim.g:6558:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6562:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSim.g:6563:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSim.g:6570:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6574:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSim.g:6575:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSim.g:6575:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSim.g:6576:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSim.g:6577:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSim.g:6577:3: rule__SAssociation__KindAssignment_3_1_1_0
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
    // InternalSim.g:6585:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6589:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSim.g:6590:2: rule__SAssociation__Group_3_1_1__1__Impl
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
    // InternalSim.g:6596:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6600:1: ( ( 'composite' ) )
            // InternalSim.g:6601:1: ( 'composite' )
            {
            // InternalSim.g:6601:1: ( 'composite' )
            // InternalSim.g:6602:2: 'composite'
            {
             before(grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSim.g:6612:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6616:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSim.g:6617:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:6624:1: rule__SAttribute__Group_0__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6628:1: ( ( () ) )
            // InternalSim.g:6629:1: ( () )
            {
            // InternalSim.g:6629:1: ( () )
            // InternalSim.g:6630:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 
            // InternalSim.g:6631:2: ()
            // InternalSim.g:6631:3: 
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
    // InternalSim.g:6639:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6643:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSim.g:6644:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6651:1: rule__SAttribute__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6655:1: ( ( 'grab' ) )
            // InternalSim.g:6656:1: ( 'grab' )
            {
            // InternalSim.g:6656:1: ( 'grab' )
            // InternalSim.g:6657:2: 'grab'
            {
             before(grammarAccess.getSAttributeAccess().getGrabKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:6666:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6670:1: ( rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 )
            // InternalSim.g:6671:2: rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6678:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__Alternatives_0_2 )? ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6682:1: ( ( ( rule__SAttribute__Alternatives_0_2 )? ) )
            // InternalSim.g:6683:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            {
            // InternalSim.g:6683:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            // InternalSim.g:6684:2: ( rule__SAttribute__Alternatives_0_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 
            // InternalSim.g:6685:2: ( rule__SAttribute__Alternatives_0_2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==15||LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:6685:3: rule__SAttribute__Alternatives_0_2
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
    // InternalSim.g:6693:1: rule__SAttribute__Group_0__3 : rule__SAttribute__Group_0__3__Impl ;
    public final void rule__SAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6697:1: ( rule__SAttribute__Group_0__3__Impl )
            // InternalSim.g:6698:2: rule__SAttribute__Group_0__3__Impl
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
    // InternalSim.g:6704:1: rule__SAttribute__Group_0__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6708:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6709:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6709:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6710:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6711:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6711:3: rule__SAttribute__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6720:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6724:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSim.g:6725:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:6732:1: rule__SAttribute__Group_1__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6736:1: ( ( () ) )
            // InternalSim.g:6737:1: ( () )
            {
            // InternalSim.g:6737:1: ( () )
            // InternalSim.g:6738:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 
            // InternalSim.g:6739:2: ()
            // InternalSim.g:6739:3: 
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
    // InternalSim.g:6747:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6751:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSim.g:6752:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6759:1: rule__SAttribute__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6763:1: ( ( 'morph' ) )
            // InternalSim.g:6764:1: ( 'morph' )
            {
            // InternalSim.g:6764:1: ( 'morph' )
            // InternalSim.g:6765:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:6774:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6778:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSim.g:6779:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6786:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__Alternatives_1_2 )? ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6790:1: ( ( ( rule__SAttribute__Alternatives_1_2 )? ) )
            // InternalSim.g:6791:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            {
            // InternalSim.g:6791:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            // InternalSim.g:6792:2: ( rule__SAttribute__Alternatives_1_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 
            // InternalSim.g:6793:2: ( rule__SAttribute__Alternatives_1_2 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==15||LA62_0==46) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSim.g:6793:3: rule__SAttribute__Alternatives_1_2
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
    // InternalSim.g:6801:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6805:1: ( rule__SAttribute__Group_1__3__Impl )
            // InternalSim.g:6806:2: rule__SAttribute__Group_1__3__Impl
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
    // InternalSim.g:6812:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6816:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6817:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6817:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6818:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6819:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6819:3: rule__SAttribute__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6828:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6832:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSim.g:6833:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:6840:1: rule__SAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6844:1: ( ( () ) )
            // InternalSim.g:6845:1: ( () )
            {
            // InternalSim.g:6845:1: ( () )
            // InternalSim.g:6846:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 
            // InternalSim.g:6847:2: ()
            // InternalSim.g:6847:3: 
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
    // InternalSim.g:6855:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6859:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSim.g:6860:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6867:1: rule__SAttribute__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6871:1: ( ( 'ditch' ) )
            // InternalSim.g:6872:1: ( 'ditch' )
            {
            // InternalSim.g:6872:1: ( 'ditch' )
            // InternalSim.g:6873:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:6882:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6886:1: ( rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 )
            // InternalSim.g:6887:2: rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6894:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__Alternatives_2_2 )? ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6898:1: ( ( ( rule__SAttribute__Alternatives_2_2 )? ) )
            // InternalSim.g:6899:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            {
            // InternalSim.g:6899:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            // InternalSim.g:6900:2: ( rule__SAttribute__Alternatives_2_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 
            // InternalSim.g:6901:2: ( rule__SAttribute__Alternatives_2_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==15||LA63_0==46) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:6901:3: rule__SAttribute__Alternatives_2_2
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
    // InternalSim.g:6909:1: rule__SAttribute__Group_2__3 : rule__SAttribute__Group_2__3__Impl ;
    public final void rule__SAttribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6913:1: ( rule__SAttribute__Group_2__3__Impl )
            // InternalSim.g:6914:2: rule__SAttribute__Group_2__3__Impl
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
    // InternalSim.g:6920:1: rule__SAttribute__Group_2__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAttribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6924:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6925:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6925:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6926:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6927:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6927:3: rule__SAttribute__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6936:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6940:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSim.g:6941:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalSim.g:6948:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6952:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSim.g:6953:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSim.g:6953:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSim.g:6954:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSim.g:6955:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSim.g:6955:3: rule__SAttribute__DetailAssignment_3_0
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
    // InternalSim.g:6963:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6967:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSim.g:6968:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:6975:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6979:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSim.g:6980:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSim.g:6980:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSim.g:6981:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSim.g:6982:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSim.g:6982:3: rule__SAttribute__NameAssignment_3_1
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
    // InternalSim.g:6990:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6994:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSim.g:6995:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:7002:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7006:1: ( ( ':' ) )
            // InternalSim.g:7007:1: ( ':' )
            {
            // InternalSim.g:7007:1: ( ':' )
            // InternalSim.g:7008:2: ':'
            {
             before(grammarAccess.getSAttributeAccess().getColonKeyword_3_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:7017:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7021:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSim.g:7022:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalSim.g:7029:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7033:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSim.g:7034:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSim.g:7034:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSim.g:7035:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSim.g:7036:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSim.g:7036:3: rule__SAttribute__TypeAssignment_3_3
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
    // InternalSim.g:7044:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7048:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSim.g:7049:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalSim.g:7056:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7060:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSim.g:7061:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSim.g:7061:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSim.g:7062:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSim.g:7063:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==47) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:7063:3: rule__SAttribute__MultiplicityAssignment_3_4
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
    // InternalSim.g:7071:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7075:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSim.g:7076:2: rule__SAttribute__Group_3__5__Impl
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
    // InternalSim.g:7082:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7086:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSim.g:7087:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSim.g:7087:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSim.g:7088:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSim.g:7089:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:7089:3: rule__SAttribute__KeyAssignment_3_5
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
    // InternalSim.g:7098:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7102:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSim.g:7103:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:7110:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7114:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSim.g:7115:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSim.g:7115:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSim.g:7116:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSim.g:7117:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSim.g:7117:3: rule__SQuery__Alternatives_0_0
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
    // InternalSim.g:7125:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7129:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSim.g:7130:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalSim.g:7137:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7141:1: ( ( '(' ) )
            // InternalSim.g:7142:1: ( '(' )
            {
            // InternalSim.g:7142:1: ( '(' )
            // InternalSim.g:7143:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSim.g:7152:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7156:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSim.g:7157:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalSim.g:7164:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7168:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSim.g:7169:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSim.g:7169:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSim.g:7170:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSim.g:7171:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSim.g:7171:3: rule__SQuery__Alternatives_0_2
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
    // InternalSim.g:7179:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7183:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSim.g:7184:2: rule__SQuery__Group_0__3__Impl
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
    // InternalSim.g:7190:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7194:1: ( ( ')' ) )
            // InternalSim.g:7195:1: ( ')' )
            {
            // InternalSim.g:7195:1: ( ')' )
            // InternalSim.g:7196:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSim.g:7206:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7210:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSim.g:7211:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:7218:1: rule__SQuery__Group_0_0_0__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7222:1: ( ( () ) )
            // InternalSim.g:7223:1: ( () )
            {
            // InternalSim.g:7223:1: ( () )
            // InternalSim.g:7224:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 
            // InternalSim.g:7225:2: ()
            // InternalSim.g:7225:3: 
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
    // InternalSim.g:7233:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7237:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSim.g:7238:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalSim.g:7245:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7249:1: ( ( 'grab' ) )
            // InternalSim.g:7250:1: ( 'grab' )
            {
            // InternalSim.g:7250:1: ( 'grab' )
            // InternalSim.g:7251:2: 'grab'
            {
             before(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:7260:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7264:1: ( rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 )
            // InternalSim.g:7265:2: rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:7272:1: rule__SQuery__Group_0_0_0__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7276:1: ( ( 'query' ) )
            // InternalSim.g:7277:1: ( 'query' )
            {
            // InternalSim.g:7277:1: ( 'query' )
            // InternalSim.g:7278:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:7287:1: rule__SQuery__Group_0_0_0__3 : rule__SQuery__Group_0_0_0__3__Impl ;
    public final void rule__SQuery__Group_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7291:1: ( rule__SQuery__Group_0_0_0__3__Impl )
            // InternalSim.g:7292:2: rule__SQuery__Group_0_0_0__3__Impl
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
    // InternalSim.g:7298:1: rule__SQuery__Group_0_0_0__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) ;
    public final void rule__SQuery__Group_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7302:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) )
            // InternalSim.g:7303:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            {
            // InternalSim.g:7303:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            // InternalSim.g:7304:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 
            // InternalSim.g:7305:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            // InternalSim.g:7305:3: rule__SQuery__DeductionRuleAssignment_0_0_0_3
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
    // InternalSim.g:7314:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7318:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSim.g:7319:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalSim.g:7326:1: rule__SQuery__Group_0_0_1__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7330:1: ( ( () ) )
            // InternalSim.g:7331:1: ( () )
            {
            // InternalSim.g:7331:1: ( () )
            // InternalSim.g:7332:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 
            // InternalSim.g:7333:2: ()
            // InternalSim.g:7333:3: 
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
    // InternalSim.g:7341:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7345:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSim.g:7346:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalSim.g:7353:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7357:1: ( ( 'morph' ) )
            // InternalSim.g:7358:1: ( 'morph' )
            {
            // InternalSim.g:7358:1: ( 'morph' )
            // InternalSim.g:7359:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7368:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7372:1: ( rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 )
            // InternalSim.g:7373:2: rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:7380:1: rule__SQuery__Group_0_0_1__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7384:1: ( ( 'query' ) )
            // InternalSim.g:7385:1: ( 'query' )
            {
            // InternalSim.g:7385:1: ( 'query' )
            // InternalSim.g:7386:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:7395:1: rule__SQuery__Group_0_0_1__3 : rule__SQuery__Group_0_0_1__3__Impl ;
    public final void rule__SQuery__Group_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7399:1: ( rule__SQuery__Group_0_0_1__3__Impl )
            // InternalSim.g:7400:2: rule__SQuery__Group_0_0_1__3__Impl
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
    // InternalSim.g:7406:1: rule__SQuery__Group_0_0_1__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) ;
    public final void rule__SQuery__Group_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7410:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) )
            // InternalSim.g:7411:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            {
            // InternalSim.g:7411:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            // InternalSim.g:7412:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 
            // InternalSim.g:7413:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            // InternalSim.g:7413:3: rule__SQuery__DeductionRuleAssignment_0_0_1_3
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
    // InternalSim.g:7422:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7426:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSim.g:7427:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSim.g:7434:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7438:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSim.g:7439:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSim.g:7439:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSim.g:7440:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSim.g:7441:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSim.g:7441:3: rule__SQuery__ParametersAssignment_0_2_1_0
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
    // InternalSim.g:7449:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7453:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSim.g:7454:2: rule__SQuery__Group_0_2_1__1__Impl
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
    // InternalSim.g:7460:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7464:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSim.g:7465:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSim.g:7465:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSim.g:7466:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSim.g:7467:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==42) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSim.g:7467:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalSim.g:7476:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7480:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSim.g:7481:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalSim.g:7488:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7492:1: ( ( ',' ) )
            // InternalSim.g:7493:1: ( ',' )
            {
            // InternalSim.g:7493:1: ( ',' )
            // InternalSim.g:7494:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:7503:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7507:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSim.g:7508:2: rule__SQuery__Group_0_2_1_1__1__Impl
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
    // InternalSim.g:7514:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7518:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSim.g:7519:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSim.g:7519:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSim.g:7520:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSim.g:7521:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSim.g:7521:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
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
    // InternalSim.g:7530:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7534:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSim.g:7535:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalSim.g:7542:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7546:1: ( ( 'ditch' ) )
            // InternalSim.g:7547:1: ( 'ditch' )
            {
            // InternalSim.g:7547:1: ( 'ditch' )
            // InternalSim.g:7548:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:7557:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7561:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSim.g:7562:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:7569:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7573:1: ( ( 'query' ) )
            // InternalSim.g:7574:1: ( 'query' )
            {
            // InternalSim.g:7574:1: ( 'query' )
            // InternalSim.g:7575:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:7584:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7588:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSim.g:7589:2: rule__SQuery__Group_1__2__Impl
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
    // InternalSim.g:7595:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7599:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7600:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7600:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7601:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7602:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7602:3: rule__SQuery__DeductionRuleAssignment_1_2
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
    // InternalSim.g:7611:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7615:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSim.g:7616:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:7623:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7627:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSim.g:7628:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSim.g:7628:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSim.g:7629:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSim.g:7630:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSim.g:7630:3: rule__SQuery__NameAssignment_2_0
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
    // InternalSim.g:7638:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7642:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSim.g:7643:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalSim.g:7650:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7654:1: ( ( '(' ) )
            // InternalSim.g:7655:1: ( '(' )
            {
            // InternalSim.g:7655:1: ( '(' )
            // InternalSim.g:7656:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSim.g:7665:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7669:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSim.g:7670:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalSim.g:7677:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7681:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSim.g:7682:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSim.g:7682:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSim.g:7683:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSim.g:7684:2: ( rule__SQuery__Group_2_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||LA68_0==32||LA68_0==41||LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:7684:3: rule__SQuery__Group_2_2__0
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
    // InternalSim.g:7692:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7696:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSim.g:7697:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:7704:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7708:1: ( ( ')' ) )
            // InternalSim.g:7709:1: ( ')' )
            {
            // InternalSim.g:7709:1: ( ')' )
            // InternalSim.g:7710:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSim.g:7719:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7723:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSim.g:7724:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:7731:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7735:1: ( ( ':' ) )
            // InternalSim.g:7736:1: ( ':' )
            {
            // InternalSim.g:7736:1: ( ':' )
            // InternalSim.g:7737:2: ':'
            {
             before(grammarAccess.getSQueryAccess().getColonKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:7746:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7750:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSim.g:7751:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
            {
            pushFollow(FOLLOW_56);
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
    // InternalSim.g:7758:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7762:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSim.g:7763:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSim.g:7763:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSim.g:7764:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSim.g:7765:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSim.g:7765:3: rule__SQuery__TypeAssignment_2_5
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
    // InternalSim.g:7773:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7777:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSim.g:7778:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
            {
            pushFollow(FOLLOW_56);
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
    // InternalSim.g:7785:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7789:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSim.g:7790:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSim.g:7790:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSim.g:7791:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSim.g:7792:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==47) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSim.g:7792:3: rule__SQuery__MultiplicityAssignment_2_6
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
    // InternalSim.g:7800:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7804:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSim.g:7805:2: rule__SQuery__Group_2__7__Impl
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
    // InternalSim.g:7811:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7815:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSim.g:7816:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSim.g:7816:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSim.g:7817:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSim.g:7818:2: ( rule__SQuery__Group_2_7__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:7818:3: rule__SQuery__Group_2_7__0
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
    // InternalSim.g:7827:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7831:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSim.g:7832:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSim.g:7839:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7843:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSim.g:7844:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSim.g:7844:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSim.g:7845:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSim.g:7846:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSim.g:7846:3: rule__SQuery__ParametersAssignment_2_2_0
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
    // InternalSim.g:7854:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7858:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSim.g:7859:2: rule__SQuery__Group_2_2__1__Impl
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
    // InternalSim.g:7865:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7869:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSim.g:7870:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSim.g:7870:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSim.g:7871:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSim.g:7872:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==42) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalSim.g:7872:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_33);
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
    // InternalSim.g:7881:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7885:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSim.g:7886:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalSim.g:7893:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7897:1: ( ( ',' ) )
            // InternalSim.g:7898:1: ( ',' )
            {
            // InternalSim.g:7898:1: ( ',' )
            // InternalSim.g:7899:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:7908:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7912:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSim.g:7913:2: rule__SQuery__Group_2_2_1__1__Impl
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
    // InternalSim.g:7919:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7923:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSim.g:7924:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSim.g:7924:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSim.g:7925:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSim.g:7926:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSim.g:7926:3: rule__SQuery__ParametersAssignment_2_2_1_1
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
    // InternalSim.g:7935:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7939:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSim.g:7940:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSim.g:7947:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7951:1: ( ( 'returns' ) )
            // InternalSim.g:7952:1: ( 'returns' )
            {
            // InternalSim.g:7952:1: ( 'returns' )
            // InternalSim.g:7953:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:7962:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7966:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSim.g:7967:2: rule__SQuery__Group_2_7__1__Impl
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
    // InternalSim.g:7973:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7977:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSim.g:7978:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSim.g:7978:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSim.g:7979:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSim.g:7980:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSim.g:7980:3: rule__SQuery__ReturnsAssignment_2_7_1
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
    // InternalSim.g:7989:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7993:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSim.g:7994:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:8001:1: rule__SQueryParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8005:1: ( ( () ) )
            // InternalSim.g:8006:1: ( () )
            {
            // InternalSim.g:8006:1: ( () )
            // InternalSim.g:8007:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 
            // InternalSim.g:8008:2: ()
            // InternalSim.g:8008:3: 
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
    // InternalSim.g:8016:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8020:1: ( rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 )
            // InternalSim.g:8021:2: rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:8028:1: rule__SQueryParameter__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8032:1: ( ( 'grab' ) )
            // InternalSim.g:8033:1: ( 'grab' )
            {
            // InternalSim.g:8033:1: ( 'grab' )
            // InternalSim.g:8034:2: 'grab'
            {
             before(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:8043:1: rule__SQueryParameter__Group_0__2 : rule__SQueryParameter__Group_0__2__Impl ;
    public final void rule__SQueryParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8047:1: ( rule__SQueryParameter__Group_0__2__Impl )
            // InternalSim.g:8048:2: rule__SQueryParameter__Group_0__2__Impl
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
    // InternalSim.g:8054:1: rule__SQueryParameter__Group_0__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SQueryParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8058:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:8059:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:8059:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:8060:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:8061:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            // InternalSim.g:8061:3: rule__SQueryParameter__DeductionRuleAssignment_0_2
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
    // InternalSim.g:8070:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8074:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSim.g:8075:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:8082:1: rule__SQueryParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8086:1: ( ( () ) )
            // InternalSim.g:8087:1: ( () )
            {
            // InternalSim.g:8087:1: ( () )
            // InternalSim.g:8088:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 
            // InternalSim.g:8089:2: ()
            // InternalSim.g:8089:3: 
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
    // InternalSim.g:8097:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8101:1: ( rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 )
            // InternalSim.g:8102:2: rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:8109:1: rule__SQueryParameter__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8113:1: ( ( 'morph' ) )
            // InternalSim.g:8114:1: ( 'morph' )
            {
            // InternalSim.g:8114:1: ( 'morph' )
            // InternalSim.g:8115:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:8124:1: rule__SQueryParameter__Group_1__2 : rule__SQueryParameter__Group_1__2__Impl ;
    public final void rule__SQueryParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8128:1: ( rule__SQueryParameter__Group_1__2__Impl )
            // InternalSim.g:8129:2: rule__SQueryParameter__Group_1__2__Impl
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
    // InternalSim.g:8135:1: rule__SQueryParameter__Group_1__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQueryParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8139:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:8140:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:8140:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:8141:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:8142:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            // InternalSim.g:8142:3: rule__SQueryParameter__DeductionRuleAssignment_1_2
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
    // InternalSim.g:8151:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8155:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSim.g:8156:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:8163:1: rule__SQueryParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8167:1: ( ( () ) )
            // InternalSim.g:8168:1: ( () )
            {
            // InternalSim.g:8168:1: ( () )
            // InternalSim.g:8169:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 
            // InternalSim.g:8170:2: ()
            // InternalSim.g:8170:3: 
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
    // InternalSim.g:8178:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8182:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSim.g:8183:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:8190:1: rule__SQueryParameter__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8194:1: ( ( 'ditch' ) )
            // InternalSim.g:8195:1: ( 'ditch' )
            {
            // InternalSim.g:8195:1: ( 'ditch' )
            // InternalSim.g:8196:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:8205:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8209:1: ( rule__SQueryParameter__Group_2__2__Impl )
            // InternalSim.g:8210:2: rule__SQueryParameter__Group_2__2__Impl
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
    // InternalSim.g:8216:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8220:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) )
            // InternalSim.g:8221:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSim.g:8221:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            // InternalSim.g:8222:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSim.g:8223:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            // InternalSim.g:8223:3: rule__SQueryParameter__DeductionRuleAssignment_2_2
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
    // InternalSim.g:8232:1: rule__SQueryParameter__Group_3__0 : rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 ;
    public final void rule__SQueryParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8236:1: ( rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 )
            // InternalSim.g:8237:2: rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:8244:1: rule__SQueryParameter__Group_3__0__Impl : ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) ;
    public final void rule__SQueryParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8248:1: ( ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) )
            // InternalSim.g:8249:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            {
            // InternalSim.g:8249:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            // InternalSim.g:8250:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 
            // InternalSim.g:8251:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            // InternalSim.g:8251:3: rule__SQueryParameter__NameAssignment_3_0
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
    // InternalSim.g:8259:1: rule__SQueryParameter__Group_3__1 : rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 ;
    public final void rule__SQueryParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8263:1: ( rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 )
            // InternalSim.g:8264:2: rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:8271:1: rule__SQueryParameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8275:1: ( ( ':' ) )
            // InternalSim.g:8276:1: ( ':' )
            {
            // InternalSim.g:8276:1: ( ':' )
            // InternalSim.g:8277:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:8286:1: rule__SQueryParameter__Group_3__2 : rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 ;
    public final void rule__SQueryParameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8290:1: ( rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 )
            // InternalSim.g:8291:2: rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:8298:1: rule__SQueryParameter__Group_3__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) ;
    public final void rule__SQueryParameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8302:1: ( ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) )
            // InternalSim.g:8303:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            {
            // InternalSim.g:8303:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            // InternalSim.g:8304:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 
            // InternalSim.g:8305:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            // InternalSim.g:8305:3: rule__SQueryParameter__TypeAssignment_3_2
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
    // InternalSim.g:8313:1: rule__SQueryParameter__Group_3__3 : rule__SQueryParameter__Group_3__3__Impl ;
    public final void rule__SQueryParameter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8317:1: ( rule__SQueryParameter__Group_3__3__Impl )
            // InternalSim.g:8318:2: rule__SQueryParameter__Group_3__3__Impl
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
    // InternalSim.g:8324:1: rule__SQueryParameter__Group_3__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) ;
    public final void rule__SQueryParameter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8328:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) )
            // InternalSim.g:8329:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            {
            // InternalSim.g:8329:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            // InternalSim.g:8330:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 
            // InternalSim.g:8331:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:8331:3: rule__SQueryParameter__MultiplicityAssignment_3_3
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
    // InternalSim.g:8340:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8344:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSim.g:8345:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalSim.g:8352:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8356:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8357:1: ( ruleSQualifiedName )
            {
            // InternalSim.g:8357:1: ( ruleSQualifiedName )
            // InternalSim.g:8358:2: ruleSQualifiedName
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
    // InternalSim.g:8367:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8371:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSim.g:8372:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSim.g:8378:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8382:1: ( ( ( '.*' )? ) )
            // InternalSim.g:8383:1: ( ( '.*' )? )
            {
            // InternalSim.g:8383:1: ( ( '.*' )? )
            // InternalSim.g:8384:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSim.g:8385:2: ( '.*' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==51) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSim.g:8385:3: '.*'
                    {
                    match(input,51,FOLLOW_2); 

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
    // InternalSim.g:8394:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8398:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSim.g:8399:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSim.g:8406:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8410:1: ( ( RULE_ID ) )
            // InternalSim.g:8411:1: ( RULE_ID )
            {
            // InternalSim.g:8411:1: ( RULE_ID )
            // InternalSim.g:8412:2: RULE_ID
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
    // InternalSim.g:8421:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8425:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSim.g:8426:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSim.g:8432:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8436:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSim.g:8437:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSim.g:8437:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSim.g:8438:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSim.g:8439:2: ( rule__SQualifiedName__Group_1__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==52) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalSim.g:8439:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
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
    // InternalSim.g:8448:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8452:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSim.g:8453:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:8460:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8464:1: ( ( '.' ) )
            // InternalSim.g:8465:1: ( '.' )
            {
            // InternalSim.g:8465:1: ( '.' )
            // InternalSim.g:8466:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:8475:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8479:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSim.g:8480:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSim.g:8486:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8490:1: ( ( RULE_ID ) )
            // InternalSim.g:8491:1: ( RULE_ID )
            {
            // InternalSim.g:8491:1: ( RULE_ID )
            // InternalSim.g:8492:2: RULE_ID
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
    // InternalSim.g:8502:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8506:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSim.g:8507:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalSim.g:8514:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8518:1: ( ( '(' ) )
            // InternalSim.g:8519:1: ( '(' )
            {
            // InternalSim.g:8519:1: ( '(' )
            // InternalSim.g:8520:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSim.g:8529:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8533:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSim.g:8534:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalSim.g:8541:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8545:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSim.g:8546:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSim.g:8546:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSim.g:8547:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSim.g:8548:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSim.g:8548:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSim.g:8556:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8560:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSim.g:8561:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
            {
            pushFollow(FOLLOW_62);
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
    // InternalSim.g:8568:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8572:1: ( ( '..' ) )
            // InternalSim.g:8573:1: ( '..' )
            {
            // InternalSim.g:8573:1: ( '..' )
            // InternalSim.g:8574:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSim.g:8583:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8587:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSim.g:8588:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalSim.g:8595:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8599:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSim.g:8600:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSim.g:8600:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSim.g:8601:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSim.g:8602:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSim.g:8602:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSim.g:8610:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8614:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSim.g:8615:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSim.g:8621:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8625:1: ( ( ')' ) )
            // InternalSim.g:8626:1: ( ')' )
            {
            // InternalSim.g:8626:1: ( ')' )
            // InternalSim.g:8627:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,48,FOLLOW_2); 
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


    // $ANTLR start "rule__SInformationModel__KindAssignment_0"
    // InternalSim.g:8637:1: rule__SInformationModel__KindAssignment_0 : ( ruleSInformationModelKind ) ;
    public final void rule__SInformationModel__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8641:1: ( ( ruleSInformationModelKind ) )
            // InternalSim.g:8642:2: ( ruleSInformationModelKind )
            {
            // InternalSim.g:8642:2: ( ruleSInformationModelKind )
            // InternalSim.g:8643:3: ruleSInformationModelKind
            {
             before(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSInformationModelKind();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__KindAssignment_0"


    // $ANTLR start "rule__SInformationModel__NameAssignment_3"
    // InternalSim.g:8652:1: rule__SInformationModel__NameAssignment_3 : ( ruleSQualifiedName ) ;
    public final void rule__SInformationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8656:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8657:2: ( ruleSQualifiedName )
            {
            // InternalSim.g:8657:2: ( ruleSQualifiedName )
            // InternalSim.g:8658:3: ruleSQualifiedName
            {
             before(grammarAccess.getSInformationModelAccess().getNameSQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getNameSQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__NameAssignment_3"


    // $ANTLR start "rule__SInformationModel__GenerateAssignment_4"
    // InternalSim.g:8667:1: rule__SInformationModel__GenerateAssignment_4 : ( ( 'generate' ) ) ;
    public final void rule__SInformationModel__GenerateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8671:1: ( ( ( 'generate' ) ) )
            // InternalSim.g:8672:2: ( ( 'generate' ) )
            {
            // InternalSim.g:8672:2: ( ( 'generate' ) )
            // InternalSim.g:8673:3: ( 'generate' )
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            // InternalSim.g:8674:3: ( 'generate' )
            // InternalSim.g:8675:4: 'generate'
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 

            }

             after(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__GenerateAssignment_4"


    // $ANTLR start "rule__SInformationModel__ImportsAssignment_5"
    // InternalSim.g:8686:1: rule__SInformationModel__ImportsAssignment_5 : ( ruleSImport ) ;
    public final void rule__SInformationModel__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8690:1: ( ( ruleSImport ) )
            // InternalSim.g:8691:2: ( ruleSImport )
            {
            // InternalSim.g:8691:2: ( ruleSImport )
            // InternalSim.g:8692:3: ruleSImport
            {
             before(grammarAccess.getSInformationModelAccess().getImportsSImportParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSImport();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getImportsSImportParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__ImportsAssignment_5"


    // $ANTLR start "rule__SInformationModel__TypesAssignment_6_0"
    // InternalSim.g:8701:1: rule__SInformationModel__TypesAssignment_6_0 : ( ruleSType ) ;
    public final void rule__SInformationModel__TypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8705:1: ( ( ruleSType ) )
            // InternalSim.g:8706:2: ( ruleSType )
            {
            // InternalSim.g:8706:2: ( ruleSType )
            // InternalSim.g:8707:3: ruleSType
            {
             before(grammarAccess.getSInformationModelAccess().getTypesSTypeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSType();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getTypesSTypeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__TypesAssignment_6_0"


    // $ANTLR start "rule__SInformationModel__AggregatesAssignment_6_1"
    // InternalSim.g:8716:1: rule__SInformationModel__AggregatesAssignment_6_1 : ( ruleSAggregate ) ;
    public final void rule__SInformationModel__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8720:1: ( ( ruleSAggregate ) )
            // InternalSim.g:8721:2: ( ruleSAggregate )
            {
            // InternalSim.g:8721:2: ( ruleSAggregate )
            // InternalSim.g:8722:3: ruleSAggregate
            {
             before(grammarAccess.getSInformationModelAccess().getAggregatesSAggregateParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSAggregate();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getAggregatesSAggregateParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__AggregatesAssignment_6_1"


    // $ANTLR start "rule__SInformationModel__DomainProxiesAssignment_6_2"
    // InternalSim.g:8731:1: rule__SInformationModel__DomainProxiesAssignment_6_2 : ( ruleSDomainProxy ) ;
    public final void rule__SInformationModel__DomainProxiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8735:1: ( ( ruleSDomainProxy ) )
            // InternalSim.g:8736:2: ( ruleSDomainProxy )
            {
            // InternalSim.g:8736:2: ( ruleSDomainProxy )
            // InternalSim.g:8737:3: ruleSDomainProxy
            {
             before(grammarAccess.getSInformationModelAccess().getDomainProxiesSDomainProxyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDomainProxy();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getDomainProxiesSDomainProxyParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__DomainProxiesAssignment_6_2"


    // $ANTLR start "rule__SImport__ImportedNamespaceAssignment_1"
    // InternalSim.g:8746:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8750:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:8751:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:8751:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSim.g:8752:3: ruleSQualifiedNameWithWildcard
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


    // $ANTLR start "rule__SGrabDomainRule__SourceAssignment"
    // InternalSim.g:8761:1: rule__SGrabDomainRule__SourceAssignment : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabDomainRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8765:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8766:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8766:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8767:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_0()); 
            // InternalSim.g:8768:3: ( ruleSQualifiedName )
            // InternalSim.g:8769:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainSQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainSQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__SourceAssignment"


    // $ANTLR start "rule__SGrabAggregateRule__SourceAssignment"
    // InternalSim.g:8780:1: rule__SGrabAggregateRule__SourceAssignment : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8784:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8785:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8785:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8786:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSim.g:8787:3: ( ruleSQualifiedName )
            // InternalSim.g:8788:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateSQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateSQualifiedNameParserRuleCall_0_1()); 

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


    // $ANTLR start "rule__SGrabPrimitiveRule__SourceAssignment_0"
    // InternalSim.g:8799:1: rule__SGrabPrimitiveRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabPrimitiveRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8803:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8804:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8804:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8805:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0()); 
            // InternalSim.g:8806:3: ( ruleSQualifiedName )
            // InternalSim.g:8807:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__SourceAssignment_0"


    // $ANTLR start "rule__SGrabPrimitiveRule__RenameToAssignment_1_1"
    // InternalSim.g:8818:1: rule__SGrabPrimitiveRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabPrimitiveRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8822:1: ( ( RULE_ID ) )
            // InternalSim.g:8823:2: ( RULE_ID )
            {
            // InternalSim.g:8823:2: ( RULE_ID )
            // InternalSim.g:8824:3: RULE_ID
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabPrimitiveRule__RenameToAssignment_1_1"


    // $ANTLR start "rule__SGrabEnumerationRule__SourceAssignment_0"
    // InternalSim.g:8833:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8837:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8838:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8838:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8839:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSim.g:8840:3: ( ruleSQualifiedName )
            // InternalSim.g:8841:4: ruleSQualifiedName
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
    // InternalSim.g:8852:1: rule__SGrabEnumerationRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8856:1: ( ( RULE_ID ) )
            // InternalSim.g:8857:2: ( RULE_ID )
            {
            // InternalSim.g:8857:2: ( RULE_ID )
            // InternalSim.g:8858:3: RULE_ID
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
    // InternalSim.g:8867:1: rule__SDitchEnumerationRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8871:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8872:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8872:2: ( ( RULE_ID ) )
            // InternalSim.g:8873:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8874:3: ( RULE_ID )
            // InternalSim.g:8875:4: RULE_ID
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
    // InternalSim.g:8886:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8890:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8891:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8891:2: ( ( RULE_ID ) )
            // InternalSim.g:8892:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSim.g:8893:3: ( RULE_ID )
            // InternalSim.g:8894:4: RULE_ID
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
    // InternalSim.g:8905:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8909:1: ( ( RULE_ID ) )
            // InternalSim.g:8910:2: ( RULE_ID )
            {
            // InternalSim.g:8910:2: ( RULE_ID )
            // InternalSim.g:8911:3: RULE_ID
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
    // InternalSim.g:8920:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8924:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8925:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8925:2: ( ( RULE_ID ) )
            // InternalSim.g:8926:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSim.g:8927:3: ( RULE_ID )
            // InternalSim.g:8928:4: RULE_ID
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
    // InternalSim.g:8939:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8943:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8944:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8944:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8945:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8946:3: ( ruleSQualifiedName )
            // InternalSim.g:8947:4: ruleSQualifiedName
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
    // InternalSim.g:8958:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8962:1: ( ( RULE_ID ) )
            // InternalSim.g:8963:2: ( RULE_ID )
            {
            // InternalSim.g:8963:2: ( RULE_ID )
            // InternalSim.g:8964:3: RULE_ID
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
    // InternalSim.g:8973:1: rule__SDitchComplexTypeRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchComplexTypeRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8977:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8978:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8978:2: ( ( RULE_ID ) )
            // InternalSim.g:8979:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8980:3: ( RULE_ID )
            // InternalSim.g:8981:4: RULE_ID
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
    // InternalSim.g:8992:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8996:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8997:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8997:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8998:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8999:3: ( ruleSQualifiedName )
            // InternalSim.g:9000:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SFuseComplexTypeRule__SourceAssignment_0"
    // InternalSim.g:9011:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9015:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9016:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9016:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9017:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:9018:3: ( ruleSQualifiedName )
            // InternalSim.g:9019:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1"
    // InternalSim.g:9030:1: rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9034:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9035:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9035:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9036:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0()); 
            // InternalSim.g:9037:3: ( ruleSQualifiedName )
            // InternalSim.g:9038:4: ruleSQualifiedName
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeSQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeSQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1"


    // $ANTLR start "rule__ChangeComplexType__AbstractAssignment_1"
    // InternalSim.g:9049:1: rule__ChangeComplexType__AbstractAssignment_1 : ( ruleSAbstractType ) ;
    public final void rule__ChangeComplexType__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9053:1: ( ( ruleSAbstractType ) )
            // InternalSim.g:9054:2: ( ruleSAbstractType )
            {
            // InternalSim.g:9054:2: ( ruleSAbstractType )
            // InternalSim.g:9055:3: ruleSAbstractType
            {
             before(grammarAccess.getChangeComplexTypeAccess().getAbstractSAbstractTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSAbstractType();

            state._fsp--;

             after(grammarAccess.getChangeComplexTypeAccess().getAbstractSAbstractTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__AbstractAssignment_1"


    // $ANTLR start "rule__ChangeComplexType__RootEntityAssignment_2"
    // InternalSim.g:9064:1: rule__ChangeComplexType__RootEntityAssignment_2 : ( ruleSRootEntity ) ;
    public final void rule__ChangeComplexType__RootEntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9068:1: ( ( ruleSRootEntity ) )
            // InternalSim.g:9069:2: ( ruleSRootEntity )
            {
            // InternalSim.g:9069:2: ( ruleSRootEntity )
            // InternalSim.g:9070:3: ruleSRootEntity
            {
             before(grammarAccess.getChangeComplexTypeAccess().getRootEntitySRootEntityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSRootEntity();

            state._fsp--;

             after(grammarAccess.getChangeComplexTypeAccess().getRootEntitySRootEntityEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__RootEntityAssignment_2"


    // $ANTLR start "rule__ChangeComplexType__RenameToAssignment_3"
    // InternalSim.g:9079:1: rule__ChangeComplexType__RenameToAssignment_3 : ( RULE_ID ) ;
    public final void rule__ChangeComplexType__RenameToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9083:1: ( ( RULE_ID ) )
            // InternalSim.g:9084:2: ( RULE_ID )
            {
            // InternalSim.g:9084:2: ( RULE_ID )
            // InternalSim.g:9085:3: RULE_ID
            {
             before(grammarAccess.getChangeComplexTypeAccess().getRenameToIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeComplexTypeAccess().getRenameToIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__RenameToAssignment_3"


    // $ANTLR start "rule__ChangeComplexType__ExtendFromAssignment_4_1"
    // InternalSim.g:9094:1: rule__ChangeComplexType__ExtendFromAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__ChangeComplexType__ExtendFromAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9098:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9099:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9099:2: ( ( RULE_ID ) )
            // InternalSim.g:9100:3: ( RULE_ID )
            {
             before(grammarAccess.getChangeComplexTypeAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 
            // InternalSim.g:9101:3: ( RULE_ID )
            // InternalSim.g:9102:4: RULE_ID
            {
             before(grammarAccess.getChangeComplexTypeAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChangeComplexTypeAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getChangeComplexTypeAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeComplexType__ExtendFromAssignment_4_1"


    // $ANTLR start "rule__SGrabFeatureRule__SourceAssignment_0"
    // InternalSim.g:9113:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9117:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9118:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9118:2: ( ( RULE_ID ) )
            // InternalSim.g:9119:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9120:3: ( RULE_ID )
            // InternalSim.g:9121:4: RULE_ID
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
    // InternalSim.g:9132:1: rule__SGrabFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9136:1: ( ( RULE_ID ) )
            // InternalSim.g:9137:2: ( RULE_ID )
            {
            // InternalSim.g:9137:2: ( RULE_ID )
            // InternalSim.g:9138:3: RULE_ID
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
    // InternalSim.g:9147:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9151:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9152:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9152:2: ( ( RULE_ID ) )
            // InternalSim.g:9153:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9154:3: ( RULE_ID )
            // InternalSim.g:9155:4: RULE_ID
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


    // $ANTLR start "rule__SMorphFeatureRule__RenameToAssignment_2_0"
    // InternalSim.g:9166:1: rule__SMorphFeatureRule__RenameToAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9170:1: ( ( RULE_ID ) )
            // InternalSim.g:9171:2: ( RULE_ID )
            {
            // InternalSim.g:9171:2: ( RULE_ID )
            // InternalSim.g:9172:3: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RenameToAssignment_2_0"


    // $ANTLR start "rule__SMorphFeatureRule__RetypeToAssignment_3"
    // InternalSim.g:9181:1: rule__SMorphFeatureRule__RetypeToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9185:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9186:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9186:2: ( ( RULE_ID ) )
            // InternalSim.g:9187:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_3_0()); 
            // InternalSim.g:9188:3: ( RULE_ID )
            // InternalSim.g:9189:4: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RetypeToAssignment_3"


    // $ANTLR start "rule__SMorphFeatureRule__RemultiplyToAssignment_4"
    // InternalSim.g:9200:1: rule__SMorphFeatureRule__RemultiplyToAssignment_4 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9204:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9205:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9205:2: ( ruleSMultiplicity )
            // InternalSim.g:9206:3: ruleSMultiplicity
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RemultiplyToAssignment_4"


    // $ANTLR start "rule__SDitchFeatureRule__SourceAssignment"
    // InternalSim.g:9215:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9219:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9220:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9220:2: ( ( RULE_ID ) )
            // InternalSim.g:9221:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSim.g:9222:3: ( RULE_ID )
            // InternalSim.g:9223:4: RULE_ID
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


    // $ANTLR start "rule__SDomainProxy__DeductionRuleAssignment_3"
    // InternalSim.g:9234:1: rule__SDomainProxy__DeductionRuleAssignment_3 : ( ruleSGrabDomainRule ) ;
    public final void rule__SDomainProxy__DeductionRuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9238:1: ( ( ruleSGrabDomainRule ) )
            // InternalSim.g:9239:2: ( ruleSGrabDomainRule )
            {
            // InternalSim.g:9239:2: ( ruleSGrabDomainRule )
            // InternalSim.g:9240:3: ruleSGrabDomainRule
            {
             before(grammarAccess.getSDomainProxyAccess().getDeductionRuleSGrabDomainRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabDomainRule();

            state._fsp--;

             after(grammarAccess.getSDomainProxyAccess().getDeductionRuleSGrabDomainRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDomainProxy__DeductionRuleAssignment_3"


    // $ANTLR start "rule__SAggregate__DeductionRuleAssignment_1_0_2"
    // InternalSim.g:9249:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9253:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSim.g:9254:2: ( ruleSGrabAggregateRule )
            {
            // InternalSim.g:9254:2: ( ruleSGrabAggregateRule )
            // InternalSim.g:9255:3: ruleSGrabAggregateRule
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
    // InternalSim.g:9264:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9268:1: ( ( ruleSType ) )
            // InternalSim.g:9269:2: ( ruleSType )
            {
            // InternalSim.g:9269:2: ( ruleSType )
            // InternalSim.g:9270:3: ruleSType
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
    // InternalSim.g:9279:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9283:1: ( ( RULE_ID ) )
            // InternalSim.g:9284:2: ( RULE_ID )
            {
            // InternalSim.g:9284:2: ( RULE_ID )
            // InternalSim.g:9285:3: RULE_ID
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
    // InternalSim.g:9294:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9298:1: ( ( ruleSExpression ) )
            // InternalSim.g:9299:2: ( ruleSExpression )
            {
            // InternalSim.g:9299:2: ( ruleSExpression )
            // InternalSim.g:9300:3: ruleSExpression
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


    // $ANTLR start "rule__SPrimitive__DeductionRuleAssignment_0_0_3"
    // InternalSim.g:9309:1: rule__SPrimitive__DeductionRuleAssignment_0_0_3 : ( ruleSGrabPrimitiveRule ) ;
    public final void rule__SPrimitive__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9313:1: ( ( ruleSGrabPrimitiveRule ) )
            // InternalSim.g:9314:2: ( ruleSGrabPrimitiveRule )
            {
            // InternalSim.g:9314:2: ( ruleSGrabPrimitiveRule )
            // InternalSim.g:9315:3: ruleSGrabPrimitiveRule
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabPrimitiveRule();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getDeductionRuleSGrabPrimitiveRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__DeductionRuleAssignment_0_0_3"


    // $ANTLR start "rule__SPrimitive__NameAssignment_0_1_1"
    // InternalSim.g:9324:1: rule__SPrimitive__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9328:1: ( ( RULE_ID ) )
            // InternalSim.g:9329:2: ( RULE_ID )
            {
            // InternalSim.g:9329:2: ( RULE_ID )
            // InternalSim.g:9330:3: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__NameAssignment_0_1_1"


    // $ANTLR start "rule__SPrimitive__NameAssignment_0_2_1"
    // InternalSim.g:9339:1: rule__SPrimitive__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9343:1: ( ( RULE_ID ) )
            // InternalSim.g:9344:2: ( RULE_ID )
            {
            // InternalSim.g:9344:2: ( RULE_ID )
            // InternalSim.g:9345:3: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__NameAssignment_0_2_1"


    // $ANTLR start "rule__SPrimitive__RedefinesAssignment_0_2_3"
    // InternalSim.g:9354:1: rule__SPrimitive__RedefinesAssignment_0_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9358:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9359:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9359:2: ( ( RULE_ID ) )
            // InternalSim.g:9360:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0()); 
            // InternalSim.g:9361:3: ( RULE_ID )
            // InternalSim.g:9362:4: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_0_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_0_2_3_0_1()); 

            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__RedefinesAssignment_0_2_3"


    // $ANTLR start "rule__SPrimitive__ConstraintsAssignment_2"
    // InternalSim.g:9373:1: rule__SPrimitive__ConstraintsAssignment_2 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9377:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9378:2: ( ruleSConstraint )
            {
            // InternalSim.g:9378:2: ( ruleSConstraint )
            // InternalSim.g:9379:3: ruleSConstraint
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__ConstraintsAssignment_2"


    // $ANTLR start "rule__SEnumeration__DeductionRuleAssignment_0_0_3"
    // InternalSim.g:9388:1: rule__SEnumeration__DeductionRuleAssignment_0_0_3 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9392:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSim.g:9393:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSim.g:9393:2: ( ruleSGrabEnumerationRule )
            // InternalSim.g:9394:3: ruleSGrabEnumerationRule
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
    // InternalSim.g:9403:1: rule__SEnumeration__DeductionRuleAssignment_0_1_3 : ( ruleSDitchEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9407:1: ( ( ruleSDitchEnumerationRule ) )
            // InternalSim.g:9408:2: ( ruleSDitchEnumerationRule )
            {
            // InternalSim.g:9408:2: ( ruleSDitchEnumerationRule )
            // InternalSim.g:9409:3: ruleSDitchEnumerationRule
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
    // InternalSim.g:9418:1: rule__SEnumeration__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9422:1: ( ( RULE_ID ) )
            // InternalSim.g:9423:2: ( RULE_ID )
            {
            // InternalSim.g:9423:2: ( RULE_ID )
            // InternalSim.g:9424:3: RULE_ID
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
    // InternalSim.g:9433:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9437:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9438:2: ( ruleSLiteral )
            {
            // InternalSim.g:9438:2: ( ruleSLiteral )
            // InternalSim.g:9439:3: ruleSLiteral
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
    // InternalSim.g:9448:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9452:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9453:2: ( ruleSLiteral )
            {
            // InternalSim.g:9453:2: ( ruleSLiteral )
            // InternalSim.g:9454:3: ruleSLiteral
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
    // InternalSim.g:9463:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9467:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9468:2: ( ruleSConstraint )
            {
            // InternalSim.g:9468:2: ( ruleSConstraint )
            // InternalSim.g:9469:3: ruleSConstraint
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
    // InternalSim.g:9478:1: rule__SLiteral__DeductionRuleAssignment_0_2 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9482:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSim.g:9483:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSim.g:9483:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSim.g:9484:3: ruleSGrabEnumerationLiteralRule
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
    // InternalSim.g:9493:1: rule__SLiteral__DeductionRuleAssignment_1_2 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9497:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSim.g:9498:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSim.g:9498:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSim.g:9499:3: ruleSDitchEnumerationLiteralRule
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
    // InternalSim.g:9508:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9512:1: ( ( RULE_ID ) )
            // InternalSim.g:9513:2: ( RULE_ID )
            {
            // InternalSim.g:9513:2: ( RULE_ID )
            // InternalSim.g:9514:3: RULE_ID
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


    // $ANTLR start "rule__SEntityType__RootAssignment_0_0_2"
    // InternalSim.g:9523:1: rule__SEntityType__RootAssignment_0_0_2 : ( ( 'root' ) ) ;
    public final void rule__SEntityType__RootAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9527:1: ( ( ( 'root' ) ) )
            // InternalSim.g:9528:2: ( ( 'root' ) )
            {
            // InternalSim.g:9528:2: ( ( 'root' ) )
            // InternalSim.g:9529:3: ( 'root' )
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_2_0()); 
            // InternalSim.g:9530:3: ( 'root' )
            // InternalSim.g:9531:4: 'root'
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_2_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__RootAssignment_0_0_2"


    // $ANTLR start "rule__SEntityType__DeductionRuleAssignment_0_0_4"
    // InternalSim.g:9542:1: rule__SEntityType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SEntityType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9546:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9547:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9547:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9548:3: ruleSGrabComplexTypeRule
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__DeductionRuleAssignment_0_0_4"


    // $ANTLR start "rule__SEntityType__RootAssignment_0_1_2"
    // InternalSim.g:9557:1: rule__SEntityType__RootAssignment_0_1_2 : ( ( 'root' ) ) ;
    public final void rule__SEntityType__RootAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9561:1: ( ( ( 'root' ) ) )
            // InternalSim.g:9562:2: ( ( 'root' ) )
            {
            // InternalSim.g:9562:2: ( ( 'root' ) )
            // InternalSim.g:9563:3: ( 'root' )
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_2_0()); 
            // InternalSim.g:9564:3: ( 'root' )
            // InternalSim.g:9565:4: 'root'
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_2_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__RootAssignment_0_1_2"


    // $ANTLR start "rule__SEntityType__DeductionRuleAssignment_0_1_4"
    // InternalSim.g:9576:1: rule__SEntityType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SEntityType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9580:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9581:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9581:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9582:3: ruleSDitchComplexTypeRule
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__DeductionRuleAssignment_0_1_4"


    // $ANTLR start "rule__SEntityType__RootAssignment_0_2_2"
    // InternalSim.g:9591:1: rule__SEntityType__RootAssignment_0_2_2 : ( ( 'root' ) ) ;
    public final void rule__SEntityType__RootAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9595:1: ( ( ( 'root' ) ) )
            // InternalSim.g:9596:2: ( ( 'root' ) )
            {
            // InternalSim.g:9596:2: ( ( 'root' ) )
            // InternalSim.g:9597:3: ( 'root' )
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_2_0()); 
            // InternalSim.g:9598:3: ( 'root' )
            // InternalSim.g:9599:4: 'root'
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_2_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__RootAssignment_0_2_2"


    // $ANTLR start "rule__SEntityType__DeductionRuleAssignment_0_2_4"
    // InternalSim.g:9610:1: rule__SEntityType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SEntityType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9614:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9615:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9615:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9616:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__DeductionRuleAssignment_0_2_4"


    // $ANTLR start "rule__SEntityType__RootAssignment_0_3_2"
    // InternalSim.g:9625:1: rule__SEntityType__RootAssignment_0_3_2 : ( ( 'root' ) ) ;
    public final void rule__SEntityType__RootAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9629:1: ( ( ( 'root' ) ) )
            // InternalSim.g:9630:2: ( ( 'root' ) )
            {
            // InternalSim.g:9630:2: ( ( 'root' ) )
            // InternalSim.g:9631:3: ( 'root' )
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_2_0()); 
            // InternalSim.g:9632:3: ( 'root' )
            // InternalSim.g:9633:4: 'root'
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_2_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__RootAssignment_0_3_2"


    // $ANTLR start "rule__SEntityType__DeductionRuleAssignment_0_3_4"
    // InternalSim.g:9644:1: rule__SEntityType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SEntityType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9648:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9649:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9649:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9650:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSEntityTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSEntityTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__DeductionRuleAssignment_0_3_4"


    // $ANTLR start "rule__SEntityType__AbstractAssignment_0_4_0"
    // InternalSim.g:9659:1: rule__SEntityType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SEntityType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9663:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9664:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9664:2: ( ( 'abstract' ) )
            // InternalSim.g:9665:3: ( 'abstract' )
            {
             before(grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9666:3: ( 'abstract' )
            // InternalSim.g:9667:4: 'abstract'
            {
             before(grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__AbstractAssignment_0_4_0"


    // $ANTLR start "rule__SEntityType__RootAssignment_0_4_1"
    // InternalSim.g:9678:1: rule__SEntityType__RootAssignment_0_4_1 : ( ( 'root' ) ) ;
    public final void rule__SEntityType__RootAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9682:1: ( ( ( 'root' ) ) )
            // InternalSim.g:9683:2: ( ( 'root' ) )
            {
            // InternalSim.g:9683:2: ( ( 'root' ) )
            // InternalSim.g:9684:3: ( 'root' )
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0()); 
            // InternalSim.g:9685:3: ( 'root' )
            // InternalSim.g:9686:4: 'root'
            {
             before(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0()); 

            }

             after(grammarAccess.getSEntityTypeAccess().getRootRootKeyword_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__RootAssignment_0_4_1"


    // $ANTLR start "rule__SEntityType__NameAssignment_0_4_3"
    // InternalSim.g:9697:1: rule__SEntityType__NameAssignment_0_4_3 : ( RULE_ID ) ;
    public final void rule__SEntityType__NameAssignment_0_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9701:1: ( ( RULE_ID ) )
            // InternalSim.g:9702:2: ( RULE_ID )
            {
            // InternalSim.g:9702:2: ( RULE_ID )
            // InternalSim.g:9703:3: RULE_ID
            {
             before(grammarAccess.getSEntityTypeAccess().getNameIDTerminalRuleCall_0_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSEntityTypeAccess().getNameIDTerminalRuleCall_0_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEntityType__NameAssignment_0_4_3"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_0_3"
    // InternalSim.g:9712:1: rule__SDetailType__DeductionRuleAssignment_0_0_3 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9716:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9717:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9717:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9718:3: ruleSGrabComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_0_3"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_1_3"
    // InternalSim.g:9727:1: rule__SDetailType__DeductionRuleAssignment_0_1_3 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9731:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9732:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9732:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9733:3: ruleSDitchComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDitchComplexTypeRuleParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_1_3"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_2_3"
    // InternalSim.g:9742:1: rule__SDetailType__DeductionRuleAssignment_0_2_3 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9746:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9747:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9747:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9748:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_2_3"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_3_3"
    // InternalSim.g:9757:1: rule__SDetailType__DeductionRuleAssignment_0_3_3 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9761:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9762:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9762:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9763:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__DeductionRuleAssignment_0_3_3"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_4_0"
    // InternalSim.g:9772:1: rule__SDetailType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9776:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9777:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9777:2: ( ( 'abstract' ) )
            // InternalSim.g:9778:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9779:3: ( 'abstract' )
            // InternalSim.g:9780:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSim.g:9791:1: rule__SDetailType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9795:1: ( ( RULE_ID ) )
            // InternalSim.g:9796:2: ( RULE_ID )
            {
            // InternalSim.g:9796:2: ( RULE_ID )
            // InternalSim.g:9797:3: RULE_ID
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
    // InternalSim.g:9806:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9810:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9811:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9811:2: ( ( RULE_ID ) )
            // InternalSim.g:9812:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSim.g:9813:3: ( RULE_ID )
            // InternalSim.g:9814:4: RULE_ID
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
    // InternalSim.g:9825:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9829:1: ( ( ruleSFeature ) )
            // InternalSim.g:9830:2: ( ruleSFeature )
            {
            // InternalSim.g:9830:2: ( ruleSFeature )
            // InternalSim.g:9831:3: ruleSFeature
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
    // InternalSim.g:9840:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9844:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9845:2: ( ruleSConstraint )
            {
            // InternalSim.g:9845:2: ( ruleSConstraint )
            // InternalSim.g:9846:3: ruleSConstraint
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
    // InternalSim.g:9855:1: rule__SAssociation__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9859:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9860:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9860:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9861:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9870:1: rule__SAssociation__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9874:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9875:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9875:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9876:3: ruleSMorphFeatureRule
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
    // InternalSim.g:9885:1: rule__SAssociation__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9889:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9890:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9890:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9891:3: ruleSDitchFeatureRule
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
    // InternalSim.g:9900:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9904:1: ( ( ( 'derived' ) ) )
            // InternalSim.g:9905:2: ( ( 'derived' ) )
            {
            // InternalSim.g:9905:2: ( ( 'derived' ) )
            // InternalSim.g:9906:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSim.g:9907:3: ( 'derived' )
            // InternalSim.g:9908:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalSim.g:9919:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9923:1: ( ( ruleSAssociationKind ) )
            // InternalSim.g:9924:2: ( ruleSAssociationKind )
            {
            // InternalSim.g:9924:2: ( ruleSAssociationKind )
            // InternalSim.g:9925:3: ruleSAssociationKind
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
    // InternalSim.g:9934:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9938:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSim.g:9939:2: ( ruleSAssociationKindInverse )
            {
            // InternalSim.g:9939:2: ( ruleSAssociationKindInverse )
            // InternalSim.g:9940:3: ruleSAssociationKindInverse
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
    // InternalSim.g:9949:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9953:1: ( ( RULE_ID ) )
            // InternalSim.g:9954:2: ( RULE_ID )
            {
            // InternalSim.g:9954:2: ( RULE_ID )
            // InternalSim.g:9955:3: RULE_ID
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
    // InternalSim.g:9964:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9968:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9969:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9969:2: ( ( RULE_ID ) )
            // InternalSim.g:9970:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSEntityTypeCrossReference_3_4_0()); 
            // InternalSim.g:9971:3: ( RULE_ID )
            // InternalSim.g:9972:4: RULE_ID
            {
             before(grammarAccess.getSAssociationAccess().getTypeSEntityTypeIDTerminalRuleCall_3_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getTypeSEntityTypeIDTerminalRuleCall_3_4_0_1()); 

            }

             after(grammarAccess.getSAssociationAccess().getTypeSEntityTypeCrossReference_3_4_0()); 

            }


            }

        }
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
    // InternalSim.g:9983:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9987:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9988:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9988:2: ( ruleSMultiplicity )
            // InternalSim.g:9989:3: ruleSMultiplicity
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
    // InternalSim.g:9998:1: rule__SAttribute__DetailAssignment_0_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10002:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10003:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10003:2: ( ( 'detail' ) )
            // InternalSim.g:10004:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            // InternalSim.g:10005:3: ( 'detail' )
            // InternalSim.g:10006:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:10017:1: rule__SAttribute__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10021:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10022:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10022:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10023:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10032:1: rule__SAttribute__DetailAssignment_1_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10036:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10037:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10037:2: ( ( 'detail' ) )
            // InternalSim.g:10038:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            // InternalSim.g:10039:3: ( 'detail' )
            // InternalSim.g:10040:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:10051:1: rule__SAttribute__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10055:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10056:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10056:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10057:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10066:1: rule__SAttribute__DetailAssignment_2_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10070:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10071:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10071:2: ( ( 'detail' ) )
            // InternalSim.g:10072:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            // InternalSim.g:10073:3: ( 'detail' )
            // InternalSim.g:10074:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:10085:1: rule__SAttribute__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10089:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10090:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10090:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10091:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10100:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10104:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10105:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10105:2: ( ( 'detail' ) )
            // InternalSim.g:10106:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSim.g:10107:3: ( 'detail' )
            // InternalSim.g:10108:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:10119:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10123:1: ( ( RULE_ID ) )
            // InternalSim.g:10124:2: ( RULE_ID )
            {
            // InternalSim.g:10124:2: ( RULE_ID )
            // InternalSim.g:10125:3: RULE_ID
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
    // InternalSim.g:10134:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10138:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10139:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10139:2: ( ( RULE_ID ) )
            // InternalSim.g:10140:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSim.g:10141:3: ( RULE_ID )
            // InternalSim.g:10142:4: RULE_ID
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
    // InternalSim.g:10153:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10157:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10158:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10158:2: ( ruleSMultiplicity )
            // InternalSim.g:10159:3: ruleSMultiplicity
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
    // InternalSim.g:10168:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10172:1: ( ( ( 'key' ) ) )
            // InternalSim.g:10173:2: ( ( 'key' ) )
            {
            // InternalSim.g:10173:2: ( ( 'key' ) )
            // InternalSim.g:10174:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSim.g:10175:3: ( 'key' )
            // InternalSim.g:10176:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalSim.g:10187:1: rule__SQuery__DeductionRuleAssignment_0_0_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10191:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10192:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10192:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10193:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10202:1: rule__SQuery__DeductionRuleAssignment_0_0_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10206:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10207:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10207:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10208:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10217:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10221:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10222:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10222:2: ( ruleSQueryParameter )
            // InternalSim.g:10223:3: ruleSQueryParameter
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
    // InternalSim.g:10232:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10236:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10237:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10237:2: ( ruleSQueryParameter )
            // InternalSim.g:10238:3: ruleSQueryParameter
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
    // InternalSim.g:10247:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10251:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10252:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10252:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10253:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10262:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10266:1: ( ( RULE_ID ) )
            // InternalSim.g:10267:2: ( RULE_ID )
            {
            // InternalSim.g:10267:2: ( RULE_ID )
            // InternalSim.g:10268:3: RULE_ID
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
    // InternalSim.g:10277:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10281:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10282:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10282:2: ( ruleSQueryParameter )
            // InternalSim.g:10283:3: ruleSQueryParameter
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
    // InternalSim.g:10292:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10296:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10297:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10297:2: ( ruleSQueryParameter )
            // InternalSim.g:10298:3: ruleSQueryParameter
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
    // InternalSim.g:10307:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10311:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10312:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10312:2: ( ( RULE_ID ) )
            // InternalSim.g:10313:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSim.g:10314:3: ( RULE_ID )
            // InternalSim.g:10315:4: RULE_ID
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
    // InternalSim.g:10326:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10330:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10331:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10331:2: ( ruleSMultiplicity )
            // InternalSim.g:10332:3: ruleSMultiplicity
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
    // InternalSim.g:10341:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10345:1: ( ( ruleSExpression ) )
            // InternalSim.g:10346:2: ( ruleSExpression )
            {
            // InternalSim.g:10346:2: ( ruleSExpression )
            // InternalSim.g:10347:3: ruleSExpression
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
    // InternalSim.g:10356:1: rule__SQueryParameter__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10360:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10361:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10361:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10362:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10371:1: rule__SQueryParameter__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10375:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10376:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10376:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10377:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10386:1: rule__SQueryParameter__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10390:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10391:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10391:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10392:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10401:1: rule__SQueryParameter__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10405:1: ( ( RULE_ID ) )
            // InternalSim.g:10406:2: ( RULE_ID )
            {
            // InternalSim.g:10406:2: ( RULE_ID )
            // InternalSim.g:10407:3: RULE_ID
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
    // InternalSim.g:10416:1: rule__SQueryParameter__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10420:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10421:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10421:2: ( ( RULE_ID ) )
            // InternalSim.g:10422:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 
            // InternalSim.g:10423:3: ( RULE_ID )
            // InternalSim.g:10424:4: RULE_ID
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
    // InternalSim.g:10435:1: rule__SQueryParameter__MultiplicityAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10439:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10440:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10440:2: ( ruleSMultiplicity )
            // InternalSim.g:10441:3: ruleSMultiplicity
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
    // InternalSim.g:10450:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10454:1: ( ( RULE_STRING ) )
            // InternalSim.g:10455:2: ( RULE_STRING )
            {
            // InternalSim.g:10455:2: ( RULE_STRING )
            // InternalSim.g:10456:3: RULE_STRING
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
    // InternalSim.g:10465:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10469:1: ( ( RULE_INT ) )
            // InternalSim.g:10470:2: ( RULE_INT )
            {
            // InternalSim.g:10470:2: ( RULE_INT )
            // InternalSim.g:10471:3: RULE_INT
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
    // InternalSim.g:10480:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10484:1: ( ( ruleMULTIPLICITY ) )
            // InternalSim.g:10485:2: ( ruleMULTIPLICITY )
            {
            // InternalSim.g:10485:2: ( ruleMULTIPLICITY )
            // InternalSim.g:10486:3: ruleMULTIPLICITY
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\25\1\27\1\uffff\1\27\1\uffff\3\27\2\uffff";
    static final String dfa_3s = "\2\56\1\uffff\1\56\1\uffff\3\56\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\1\uffff\1\10\10\uffff\1\1\4\uffff\2\2\1\uffff\1\4\1\3\1\uffff\1\10\1\5\1\6\1\11",
            "\1\10\15\uffff\1\2\2\uffff\1\4\2\uffff\1\10\2\uffff\1\11",
            "",
            "\1\10\20\uffff\1\4\2\uffff\1\10\2\uffff\1\11",
            "",
            "\1\10\23\uffff\1\10\2\uffff\1\11",
            "\1\10\23\uffff\1\10\2\uffff\1\11",
            "\1\10\23\uffff\1\10\2\uffff\1\11",
            "",
            ""
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
            return "1106:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSEntityType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00407B6104A01000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00007B6100A01002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040F00020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00007B6100A01000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00007B6900A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00007B6100A00002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000021900000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020100000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00003A0100A00000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00007B6100A00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080521900006820L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080521100006822L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080120100006800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000008020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000520100000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000120100010020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000120100000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001120100000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000010010L});

}