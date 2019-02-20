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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'aggregate'", "'reference'", "'composite'", "'attribute'", "'*'", "'base'", "'interface'", "'core'", "'information'", "'model'", "'import'", "'grab'", "'domain'", "'as'", "'extends'", "'='", "'and'", "':'", "'{'", "'}'", "'constraint'", "'primitive'", "'archetype'", "'redefines'", "'enumeration'", "'ditch'", "','", "'root'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'generate'", "'abstract'", "'derived'", "'key'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    // InternalSim.g:112:1: ruleSGrabDomainRule : ( ( rule__SGrabDomainRule__Group__0 ) ) ;
    public final void ruleSGrabDomainRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:116:2: ( ( ( rule__SGrabDomainRule__Group__0 ) ) )
            // InternalSim.g:117:2: ( ( rule__SGrabDomainRule__Group__0 ) )
            {
            // InternalSim.g:117:2: ( ( rule__SGrabDomainRule__Group__0 ) )
            // InternalSim.g:118:3: ( rule__SGrabDomainRule__Group__0 )
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getGroup()); 
            // InternalSim.g:119:3: ( rule__SGrabDomainRule__Group__0 )
            // InternalSim.g:119:4: rule__SGrabDomainRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGrabDomainRuleAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSGrabFeatureRule"
    // InternalSim.g:378:1: entryRuleSGrabFeatureRule : ruleSGrabFeatureRule EOF ;
    public final void entryRuleSGrabFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:379:1: ( ruleSGrabFeatureRule EOF )
            // InternalSim.g:380:1: ruleSGrabFeatureRule EOF
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
    // InternalSim.g:387:1: ruleSGrabFeatureRule : ( ( rule__SGrabFeatureRule__Group__0 ) ) ;
    public final void ruleSGrabFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:391:2: ( ( ( rule__SGrabFeatureRule__Group__0 ) ) )
            // InternalSim.g:392:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            {
            // InternalSim.g:392:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            // InternalSim.g:393:3: ( rule__SGrabFeatureRule__Group__0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 
            // InternalSim.g:394:3: ( rule__SGrabFeatureRule__Group__0 )
            // InternalSim.g:394:4: rule__SGrabFeatureRule__Group__0
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
    // InternalSim.g:403:1: entryRuleSMorphFeatureRule : ruleSMorphFeatureRule EOF ;
    public final void entryRuleSMorphFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:404:1: ( ruleSMorphFeatureRule EOF )
            // InternalSim.g:405:1: ruleSMorphFeatureRule EOF
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
    // InternalSim.g:412:1: ruleSMorphFeatureRule : ( ( rule__SMorphFeatureRule__Group__0 ) ) ;
    public final void ruleSMorphFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:416:2: ( ( ( rule__SMorphFeatureRule__Group__0 ) ) )
            // InternalSim.g:417:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            {
            // InternalSim.g:417:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            // InternalSim.g:418:3: ( rule__SMorphFeatureRule__Group__0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 
            // InternalSim.g:419:3: ( rule__SMorphFeatureRule__Group__0 )
            // InternalSim.g:419:4: rule__SMorphFeatureRule__Group__0
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
    // InternalSim.g:428:1: entryRuleSDitchFeatureRule : ruleSDitchFeatureRule EOF ;
    public final void entryRuleSDitchFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:429:1: ( ruleSDitchFeatureRule EOF )
            // InternalSim.g:430:1: ruleSDitchFeatureRule EOF
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
    // InternalSim.g:437:1: ruleSDitchFeatureRule : ( ( rule__SDitchFeatureRule__SourceAssignment ) ) ;
    public final void ruleSDitchFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:441:2: ( ( ( rule__SDitchFeatureRule__SourceAssignment ) ) )
            // InternalSim.g:442:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            {
            // InternalSim.g:442:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            // InternalSim.g:443:3: ( rule__SDitchFeatureRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 
            // InternalSim.g:444:3: ( rule__SDitchFeatureRule__SourceAssignment )
            // InternalSim.g:444:4: rule__SDitchFeatureRule__SourceAssignment
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
    // InternalSim.g:453:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSim.g:454:1: ( ruleSAggregate EOF )
            // InternalSim.g:455:1: ruleSAggregate EOF
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
    // InternalSim.g:462:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:466:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSim.g:467:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSim.g:467:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSim.g:468:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSim.g:469:3: ( rule__SAggregate__Group__0 )
            // InternalSim.g:469:4: rule__SAggregate__Group__0
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
    // InternalSim.g:478:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSim.g:479:1: ( ruleSType EOF )
            // InternalSim.g:480:1: ruleSType EOF
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
    // InternalSim.g:487:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:491:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSim.g:492:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSim.g:492:2: ( ( rule__SType__Alternatives ) )
            // InternalSim.g:493:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSim.g:494:3: ( rule__SType__Alternatives )
            // InternalSim.g:494:4: rule__SType__Alternatives
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
    // InternalSim.g:503:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSim.g:504:1: ( ruleSConstraint EOF )
            // InternalSim.g:505:1: ruleSConstraint EOF
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
    // InternalSim.g:512:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:516:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSim.g:517:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSim.g:517:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSim.g:518:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSim.g:519:3: ( rule__SConstraint__Group__0 )
            // InternalSim.g:519:4: rule__SConstraint__Group__0
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
    // InternalSim.g:528:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSim.g:529:1: ( ruleSPrimitive EOF )
            // InternalSim.g:530:1: ruleSPrimitive EOF
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
    // InternalSim.g:537:1: ruleSPrimitive : ( ( rule__SPrimitive__Group__0 ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:541:2: ( ( ( rule__SPrimitive__Group__0 ) ) )
            // InternalSim.g:542:2: ( ( rule__SPrimitive__Group__0 ) )
            {
            // InternalSim.g:542:2: ( ( rule__SPrimitive__Group__0 ) )
            // InternalSim.g:543:3: ( rule__SPrimitive__Group__0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getGroup()); 
            // InternalSim.g:544:3: ( rule__SPrimitive__Group__0 )
            // InternalSim.g:544:4: rule__SPrimitive__Group__0
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
    // InternalSim.g:553:1: entryRuleSEnumeration : ruleSEnumeration EOF ;
    public final void entryRuleSEnumeration() throws RecognitionException {
        try {
            // InternalSim.g:554:1: ( ruleSEnumeration EOF )
            // InternalSim.g:555:1: ruleSEnumeration EOF
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
    // InternalSim.g:562:1: ruleSEnumeration : ( ( rule__SEnumeration__Group__0 ) ) ;
    public final void ruleSEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:566:2: ( ( ( rule__SEnumeration__Group__0 ) ) )
            // InternalSim.g:567:2: ( ( rule__SEnumeration__Group__0 ) )
            {
            // InternalSim.g:567:2: ( ( rule__SEnumeration__Group__0 ) )
            // InternalSim.g:568:3: ( rule__SEnumeration__Group__0 )
            {
             before(grammarAccess.getSEnumerationAccess().getGroup()); 
            // InternalSim.g:569:3: ( rule__SEnumeration__Group__0 )
            // InternalSim.g:569:4: rule__SEnumeration__Group__0
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
    // InternalSim.g:578:1: entryRuleSLiteral : ruleSLiteral EOF ;
    public final void entryRuleSLiteral() throws RecognitionException {
        try {
            // InternalSim.g:579:1: ( ruleSLiteral EOF )
            // InternalSim.g:580:1: ruleSLiteral EOF
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
    // InternalSim.g:587:1: ruleSLiteral : ( ( rule__SLiteral__Alternatives ) ) ;
    public final void ruleSLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:591:2: ( ( ( rule__SLiteral__Alternatives ) ) )
            // InternalSim.g:592:2: ( ( rule__SLiteral__Alternatives ) )
            {
            // InternalSim.g:592:2: ( ( rule__SLiteral__Alternatives ) )
            // InternalSim.g:593:3: ( rule__SLiteral__Alternatives )
            {
             before(grammarAccess.getSLiteralAccess().getAlternatives()); 
            // InternalSim.g:594:3: ( rule__SLiteral__Alternatives )
            // InternalSim.g:594:4: rule__SLiteral__Alternatives
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
    // InternalSim.g:603:1: entryRuleSRootType : ruleSRootType EOF ;
    public final void entryRuleSRootType() throws RecognitionException {
        try {
            // InternalSim.g:604:1: ( ruleSRootType EOF )
            // InternalSim.g:605:1: ruleSRootType EOF
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
    // InternalSim.g:612:1: ruleSRootType : ( ( rule__SRootType__Group__0 ) ) ;
    public final void ruleSRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:616:2: ( ( ( rule__SRootType__Group__0 ) ) )
            // InternalSim.g:617:2: ( ( rule__SRootType__Group__0 ) )
            {
            // InternalSim.g:617:2: ( ( rule__SRootType__Group__0 ) )
            // InternalSim.g:618:3: ( rule__SRootType__Group__0 )
            {
             before(grammarAccess.getSRootTypeAccess().getGroup()); 
            // InternalSim.g:619:3: ( rule__SRootType__Group__0 )
            // InternalSim.g:619:4: rule__SRootType__Group__0
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
    // InternalSim.g:628:1: entryRuleSDetailType : ruleSDetailType EOF ;
    public final void entryRuleSDetailType() throws RecognitionException {
        try {
            // InternalSim.g:629:1: ( ruleSDetailType EOF )
            // InternalSim.g:630:1: ruleSDetailType EOF
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
    // InternalSim.g:637:1: ruleSDetailType : ( ( rule__SDetailType__Group__0 ) ) ;
    public final void ruleSDetailType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:641:2: ( ( ( rule__SDetailType__Group__0 ) ) )
            // InternalSim.g:642:2: ( ( rule__SDetailType__Group__0 ) )
            {
            // InternalSim.g:642:2: ( ( rule__SDetailType__Group__0 ) )
            // InternalSim.g:643:3: ( rule__SDetailType__Group__0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getGroup()); 
            // InternalSim.g:644:3: ( rule__SDetailType__Group__0 )
            // InternalSim.g:644:4: rule__SDetailType__Group__0
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
    // InternalSim.g:654:1: ruleSComplexTypeExtends : ( ( rule__SComplexTypeExtends__Group__0 )? ) ;
    public final void ruleSComplexTypeExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:658:2: ( ( ( rule__SComplexTypeExtends__Group__0 )? ) )
            // InternalSim.g:659:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            {
            // InternalSim.g:659:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            // InternalSim.g:660:3: ( rule__SComplexTypeExtends__Group__0 )?
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getGroup()); 
            // InternalSim.g:661:3: ( rule__SComplexTypeExtends__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSim.g:661:4: rule__SComplexTypeExtends__Group__0
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
    // InternalSim.g:671:1: ruleSComplexTypeFeatures : ( ( rule__SComplexTypeFeatures__Group__0 ) ) ;
    public final void ruleSComplexTypeFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:675:2: ( ( ( rule__SComplexTypeFeatures__Group__0 ) ) )
            // InternalSim.g:676:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            {
            // InternalSim.g:676:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            // InternalSim.g:677:3: ( rule__SComplexTypeFeatures__Group__0 )
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getGroup()); 
            // InternalSim.g:678:3: ( rule__SComplexTypeFeatures__Group__0 )
            // InternalSim.g:678:4: rule__SComplexTypeFeatures__Group__0
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
    // InternalSim.g:687:1: entryRuleSFeature : ruleSFeature EOF ;
    public final void entryRuleSFeature() throws RecognitionException {
        try {
            // InternalSim.g:688:1: ( ruleSFeature EOF )
            // InternalSim.g:689:1: ruleSFeature EOF
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
    // InternalSim.g:696:1: ruleSFeature : ( ( rule__SFeature__Alternatives ) ) ;
    public final void ruleSFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:700:2: ( ( ( rule__SFeature__Alternatives ) ) )
            // InternalSim.g:701:2: ( ( rule__SFeature__Alternatives ) )
            {
            // InternalSim.g:701:2: ( ( rule__SFeature__Alternatives ) )
            // InternalSim.g:702:3: ( rule__SFeature__Alternatives )
            {
             before(grammarAccess.getSFeatureAccess().getAlternatives()); 
            // InternalSim.g:703:3: ( rule__SFeature__Alternatives )
            // InternalSim.g:703:4: rule__SFeature__Alternatives
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
    // InternalSim.g:712:1: entryRuleSAssociation : ruleSAssociation EOF ;
    public final void entryRuleSAssociation() throws RecognitionException {
        try {
            // InternalSim.g:713:1: ( ruleSAssociation EOF )
            // InternalSim.g:714:1: ruleSAssociation EOF
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
    // InternalSim.g:721:1: ruleSAssociation : ( ( rule__SAssociation__Alternatives ) ) ;
    public final void ruleSAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:725:2: ( ( ( rule__SAssociation__Alternatives ) ) )
            // InternalSim.g:726:2: ( ( rule__SAssociation__Alternatives ) )
            {
            // InternalSim.g:726:2: ( ( rule__SAssociation__Alternatives ) )
            // InternalSim.g:727:3: ( rule__SAssociation__Alternatives )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives()); 
            // InternalSim.g:728:3: ( rule__SAssociation__Alternatives )
            // InternalSim.g:728:4: rule__SAssociation__Alternatives
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
    // InternalSim.g:737:1: entryRuleSAttribute : ruleSAttribute EOF ;
    public final void entryRuleSAttribute() throws RecognitionException {
        try {
            // InternalSim.g:738:1: ( ruleSAttribute EOF )
            // InternalSim.g:739:1: ruleSAttribute EOF
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
    // InternalSim.g:746:1: ruleSAttribute : ( ( rule__SAttribute__Alternatives ) ) ;
    public final void ruleSAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:750:2: ( ( ( rule__SAttribute__Alternatives ) ) )
            // InternalSim.g:751:2: ( ( rule__SAttribute__Alternatives ) )
            {
            // InternalSim.g:751:2: ( ( rule__SAttribute__Alternatives ) )
            // InternalSim.g:752:3: ( rule__SAttribute__Alternatives )
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives()); 
            // InternalSim.g:753:3: ( rule__SAttribute__Alternatives )
            // InternalSim.g:753:4: rule__SAttribute__Alternatives
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
    // InternalSim.g:762:1: entryRuleSQuery : ruleSQuery EOF ;
    public final void entryRuleSQuery() throws RecognitionException {
        try {
            // InternalSim.g:763:1: ( ruleSQuery EOF )
            // InternalSim.g:764:1: ruleSQuery EOF
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
    // InternalSim.g:771:1: ruleSQuery : ( ( rule__SQuery__Alternatives ) ) ;
    public final void ruleSQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:775:2: ( ( ( rule__SQuery__Alternatives ) ) )
            // InternalSim.g:776:2: ( ( rule__SQuery__Alternatives ) )
            {
            // InternalSim.g:776:2: ( ( rule__SQuery__Alternatives ) )
            // InternalSim.g:777:3: ( rule__SQuery__Alternatives )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives()); 
            // InternalSim.g:778:3: ( rule__SQuery__Alternatives )
            // InternalSim.g:778:4: rule__SQuery__Alternatives
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
    // InternalSim.g:787:1: entryRuleSQueryParameter : ruleSQueryParameter EOF ;
    public final void entryRuleSQueryParameter() throws RecognitionException {
        try {
            // InternalSim.g:788:1: ( ruleSQueryParameter EOF )
            // InternalSim.g:789:1: ruleSQueryParameter EOF
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
    // InternalSim.g:796:1: ruleSQueryParameter : ( ( rule__SQueryParameter__Alternatives ) ) ;
    public final void ruleSQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:800:2: ( ( ( rule__SQueryParameter__Alternatives ) ) )
            // InternalSim.g:801:2: ( ( rule__SQueryParameter__Alternatives ) )
            {
            // InternalSim.g:801:2: ( ( rule__SQueryParameter__Alternatives ) )
            // InternalSim.g:802:3: ( rule__SQueryParameter__Alternatives )
            {
             before(grammarAccess.getSQueryParameterAccess().getAlternatives()); 
            // InternalSim.g:803:3: ( rule__SQueryParameter__Alternatives )
            // InternalSim.g:803:4: rule__SQueryParameter__Alternatives
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
    // InternalSim.g:812:1: entryRuleSExpression : ruleSExpression EOF ;
    public final void entryRuleSExpression() throws RecognitionException {
        try {
            // InternalSim.g:813:1: ( ruleSExpression EOF )
            // InternalSim.g:814:1: ruleSExpression EOF
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
    // InternalSim.g:821:1: ruleSExpression : ( ( rule__SExpression__ExprAssignment ) ) ;
    public final void ruleSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:825:2: ( ( ( rule__SExpression__ExprAssignment ) ) )
            // InternalSim.g:826:2: ( ( rule__SExpression__ExprAssignment ) )
            {
            // InternalSim.g:826:2: ( ( rule__SExpression__ExprAssignment ) )
            // InternalSim.g:827:3: ( rule__SExpression__ExprAssignment )
            {
             before(grammarAccess.getSExpressionAccess().getExprAssignment()); 
            // InternalSim.g:828:3: ( rule__SExpression__ExprAssignment )
            // InternalSim.g:828:4: rule__SExpression__ExprAssignment
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
    // InternalSim.g:837:1: entryRuleSQualifiedNameWithWildcard : ruleSQualifiedNameWithWildcard EOF ;
    public final void entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSim.g:838:1: ( ruleSQualifiedNameWithWildcard EOF )
            // InternalSim.g:839:1: ruleSQualifiedNameWithWildcard EOF
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
    // InternalSim.g:846:1: ruleSQualifiedNameWithWildcard : ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleSQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:850:2: ( ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSim.g:851:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSim.g:851:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            // InternalSim.g:852:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSim.g:853:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            // InternalSim.g:853:4: rule__SQualifiedNameWithWildcard__Group__0
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
    // InternalSim.g:862:1: entryRuleSQualifiedName : ruleSQualifiedName EOF ;
    public final void entryRuleSQualifiedName() throws RecognitionException {
        try {
            // InternalSim.g:863:1: ( ruleSQualifiedName EOF )
            // InternalSim.g:864:1: ruleSQualifiedName EOF
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
    // InternalSim.g:871:1: ruleSQualifiedName : ( ( rule__SQualifiedName__Group__0 ) ) ;
    public final void ruleSQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:875:2: ( ( ( rule__SQualifiedName__Group__0 ) ) )
            // InternalSim.g:876:2: ( ( rule__SQualifiedName__Group__0 ) )
            {
            // InternalSim.g:876:2: ( ( rule__SQualifiedName__Group__0 ) )
            // InternalSim.g:877:3: ( rule__SQualifiedName__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup()); 
            // InternalSim.g:878:3: ( rule__SQualifiedName__Group__0 )
            // InternalSim.g:878:4: rule__SQualifiedName__Group__0
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
    // InternalSim.g:887:1: entryRuleSMultiplicity : ruleSMultiplicity EOF ;
    public final void entryRuleSMultiplicity() throws RecognitionException {
        try {
            // InternalSim.g:888:1: ( ruleSMultiplicity EOF )
            // InternalSim.g:889:1: ruleSMultiplicity EOF
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
    // InternalSim.g:896:1: ruleSMultiplicity : ( ( rule__SMultiplicity__Group__0 ) ) ;
    public final void ruleSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:900:2: ( ( ( rule__SMultiplicity__Group__0 ) ) )
            // InternalSim.g:901:2: ( ( rule__SMultiplicity__Group__0 ) )
            {
            // InternalSim.g:901:2: ( ( rule__SMultiplicity__Group__0 ) )
            // InternalSim.g:902:3: ( rule__SMultiplicity__Group__0 )
            {
             before(grammarAccess.getSMultiplicityAccess().getGroup()); 
            // InternalSim.g:903:3: ( rule__SMultiplicity__Group__0 )
            // InternalSim.g:903:4: rule__SMultiplicity__Group__0
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
    // InternalSim.g:912:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalSim.g:913:1: ( ruleMULTIPLICITY EOF )
            // InternalSim.g:914:1: ruleMULTIPLICITY EOF
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
    // InternalSim.g:921:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:925:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalSim.g:926:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalSim.g:926:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalSim.g:927:3: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // InternalSim.g:928:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalSim.g:928:4: rule__MULTIPLICITY__Alternatives
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
    // InternalSim.g:937:1: ruleSInformationModelKind : ( ( rule__SInformationModelKind__Alternatives ) ) ;
    public final void ruleSInformationModelKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:941:1: ( ( ( rule__SInformationModelKind__Alternatives ) ) )
            // InternalSim.g:942:2: ( ( rule__SInformationModelKind__Alternatives ) )
            {
            // InternalSim.g:942:2: ( ( rule__SInformationModelKind__Alternatives ) )
            // InternalSim.g:943:3: ( rule__SInformationModelKind__Alternatives )
            {
             before(grammarAccess.getSInformationModelKindAccess().getAlternatives()); 
            // InternalSim.g:944:3: ( rule__SInformationModelKind__Alternatives )
            // InternalSim.g:944:4: rule__SInformationModelKind__Alternatives
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


    // $ANTLR start "ruleSAssociationKind"
    // InternalSim.g:953:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:957:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSim.g:958:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSim.g:958:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSim.g:959:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSim.g:960:3: ( rule__SAssociationKind__Alternatives )
            // InternalSim.g:960:4: rule__SAssociationKind__Alternatives
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
    // InternalSim.g:969:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:973:1: ( ( ( 'inverse' ) ) )
            // InternalSim.g:974:2: ( ( 'inverse' ) )
            {
            // InternalSim.g:974:2: ( ( 'inverse' ) )
            // InternalSim.g:975:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSim.g:976:3: ( 'inverse' )
            // InternalSim.g:976:4: 'inverse'
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
    // InternalSim.g:984:1: rule__SInformationModel__Alternatives_6 : ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) | ( ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 ) ) );
    public final void rule__SInformationModel__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:988:1: ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) | ( ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                switch ( input.LA(2) ) {
                case 33:
                case 36:
                case 39:
                case 42:
                case 51:
                    {
                    alt2=1;
                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 12:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 33:
            case 34:
            case 36:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 51:
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
                    // InternalSim.g:989:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    {
                    // InternalSim.g:989:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    // InternalSim.g:990:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getTypesAssignment_6_0()); 
                    // InternalSim.g:991:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    // InternalSim.g:991:4: rule__SInformationModel__TypesAssignment_6_0
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
                    // InternalSim.g:995:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    {
                    // InternalSim.g:995:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    // InternalSim.g:996:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getAggregatesAssignment_6_1()); 
                    // InternalSim.g:997:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    // InternalSim.g:997:4: rule__SInformationModel__AggregatesAssignment_6_1
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
                    // InternalSim.g:1001:2: ( ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 ) )
                    {
                    // InternalSim.g:1001:2: ( ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 ) )
                    // InternalSim.g:1002:3: ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getGrabDomainRulesAssignment_6_2()); 
                    // InternalSim.g:1003:3: ( rule__SInformationModel__GrabDomainRulesAssignment_6_2 )
                    // InternalSim.g:1003:4: rule__SInformationModel__GrabDomainRulesAssignment_6_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__GrabDomainRulesAssignment_6_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSInformationModelAccess().getGrabDomainRulesAssignment_6_2()); 

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
    // InternalSim.g:1011:1: rule__SAggregate__Alternatives_1 : ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) );
    public final void rule__SAggregate__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1015:1: ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
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
                    // InternalSim.g:1016:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    {
                    // InternalSim.g:1016:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    // InternalSim.g:1017:3: ( rule__SAggregate__Group_1_0__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_0()); 
                    // InternalSim.g:1018:3: ( rule__SAggregate__Group_1_0__0 )
                    // InternalSim.g:1018:4: rule__SAggregate__Group_1_0__0
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
                    // InternalSim.g:1022:2: ( 'aggregate' )
                    {
                    // InternalSim.g:1022:2: ( 'aggregate' )
                    // InternalSim.g:1023:3: 'aggregate'
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
    // InternalSim.g:1032:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1036:1: ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSim.g:1037:2: ( ruleSPrimitive )
                    {
                    // InternalSim.g:1037:2: ( ruleSPrimitive )
                    // InternalSim.g:1038:3: ruleSPrimitive
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
                    // InternalSim.g:1043:2: ( ruleSEnumeration )
                    {
                    // InternalSim.g:1043:2: ( ruleSEnumeration )
                    // InternalSim.g:1044:3: ruleSEnumeration
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
                    // InternalSim.g:1049:2: ( ruleSRootType )
                    {
                    // InternalSim.g:1049:2: ( ruleSRootType )
                    // InternalSim.g:1050:3: ruleSRootType
                    {
                     before(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSRootType();

                    state._fsp--;

                     after(grammarAccess.getSTypeAccess().getSRootTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSim.g:1055:2: ( ruleSDetailType )
                    {
                    // InternalSim.g:1055:2: ( ruleSDetailType )
                    // InternalSim.g:1056:3: ruleSDetailType
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
    // InternalSim.g:1065:1: rule__SPrimitive__Alternatives_0 : ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) );
    public final void rule__SPrimitive__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1069:1: ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 33:
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
                    // InternalSim.g:1070:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1070:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    // InternalSim.g:1071:3: ( rule__SPrimitive__Group_0_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_0()); 
                    // InternalSim.g:1072:3: ( rule__SPrimitive__Group_0_0__0 )
                    // InternalSim.g:1072:4: rule__SPrimitive__Group_0_0__0
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
                    // InternalSim.g:1076:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1076:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    // InternalSim.g:1077:3: ( rule__SPrimitive__Group_0_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_1()); 
                    // InternalSim.g:1078:3: ( rule__SPrimitive__Group_0_1__0 )
                    // InternalSim.g:1078:4: rule__SPrimitive__Group_0_1__0
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
                    // InternalSim.g:1082:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1082:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    // InternalSim.g:1083:3: ( rule__SPrimitive__Group_0_2__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_2()); 
                    // InternalSim.g:1084:3: ( rule__SPrimitive__Group_0_2__0 )
                    // InternalSim.g:1084:4: rule__SPrimitive__Group_0_2__0
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
    // InternalSim.g:1092:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1096:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 36:
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
                    // InternalSim.g:1097:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1097:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSim.g:1098:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSim.g:1099:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSim.g:1099:4: rule__SEnumeration__Group_0_0__0
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
                    // InternalSim.g:1103:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1103:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSim.g:1104:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSim.g:1105:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSim.g:1105:4: rule__SEnumeration__Group_0_1__0
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
                    // InternalSim.g:1109:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1109:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    // InternalSim.g:1110:3: ( rule__SEnumeration__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 
                    // InternalSim.g:1111:3: ( rule__SEnumeration__Group_0_2__0 )
                    // InternalSim.g:1111:4: rule__SEnumeration__Group_0_2__0
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
    // InternalSim.g:1119:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1123:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 37:
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
                    // InternalSim.g:1124:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSim.g:1124:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSim.g:1125:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSim.g:1126:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSim.g:1126:4: rule__SLiteral__Group_0__0
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
                    // InternalSim.g:1130:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSim.g:1130:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSim.g:1131:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSim.g:1132:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSim.g:1132:4: rule__SLiteral__Group_1__0
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
                    // InternalSim.g:1136:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSim.g:1136:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSim.g:1137:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSim.g:1138:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSim.g:1138:4: rule__SLiteral__NameAssignment_2
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
    // InternalSim.g:1146:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1150:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 40:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 39:
            case 51:
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
                    // InternalSim.g:1151:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1151:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSim.g:1152:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1153:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSim.g:1153:4: rule__SRootType__Group_0_0__0
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
                    // InternalSim.g:1157:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1157:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSim.g:1158:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1159:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSim.g:1159:4: rule__SRootType__Group_0_1__0
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
                    // InternalSim.g:1163:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1163:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    // InternalSim.g:1164:3: ( rule__SRootType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1165:3: ( rule__SRootType__Group_0_2__0 )
                    // InternalSim.g:1165:4: rule__SRootType__Group_0_2__0
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
                    // InternalSim.g:1169:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1169:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    // InternalSim.g:1170:3: ( rule__SRootType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1171:3: ( rule__SRootType__Group_0_3__0 )
                    // InternalSim.g:1171:4: rule__SRootType__Group_0_3__0
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
                    // InternalSim.g:1175:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1175:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    // InternalSim.g:1176:3: ( rule__SRootType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1177:3: ( rule__SRootType__Group_0_4__0 )
                    // InternalSim.g:1177:4: rule__SRootType__Group_0_4__0
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
    // InternalSim.g:1185:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1189:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            case 41:
                {
                alt9=4;
                }
                break;
            case 42:
            case 51:
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
                    // InternalSim.g:1190:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1190:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSim.g:1191:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1192:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSim.g:1192:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSim.g:1196:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1196:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSim.g:1197:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1198:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSim.g:1198:4: rule__SDetailType__Group_0_1__0
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
                    // InternalSim.g:1202:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1202:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSim.g:1203:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1204:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSim.g:1204:4: rule__SDetailType__Group_0_2__0
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
                    // InternalSim.g:1208:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1208:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSim.g:1209:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1210:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSim.g:1210:4: rule__SDetailType__Group_0_3__0
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
                    // InternalSim.g:1214:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1214:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    // InternalSim.g:1215:3: ( rule__SDetailType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1216:3: ( rule__SDetailType__Group_0_4__0 )
                    // InternalSim.g:1216:4: rule__SDetailType__Group_0_4__0
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
    // InternalSim.g:1224:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1228:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==11||(LA10_0>=13 && LA10_0<=14)||LA10_0==23||LA10_0==37||LA10_0==40||LA10_0==42||LA10_0==52) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:1229:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSim.g:1229:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSim.g:1230:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSim.g:1231:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSim.g:1231:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
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
                    // InternalSim.g:1235:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSim.g:1235:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSim.g:1236:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSim.g:1237:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSim.g:1237:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
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
    // InternalSim.g:1245:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1249:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 42:
                    {
                    alt11=2;
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
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 45:
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
                case RULE_ID:
                case 15:
                case 42:
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
            case 37:
                {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 42:
                    {
                    alt11=2;
                    }
                    break;
                case 45:
                    {
                    alt11=3;
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
            case 52:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==43) ) {
                    alt11=3;
                }
                else if ( (LA11_6==29) ) {
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
                    // InternalSim.g:1250:2: ( ruleSAssociation )
                    {
                    // InternalSim.g:1250:2: ( ruleSAssociation )
                    // InternalSim.g:1251:3: ruleSAssociation
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
                    // InternalSim.g:1256:2: ( ruleSAttribute )
                    {
                    // InternalSim.g:1256:2: ( ruleSAttribute )
                    // InternalSim.g:1257:3: ruleSAttribute
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
                    // InternalSim.g:1262:2: ( ruleSQuery )
                    {
                    // InternalSim.g:1262:2: ( ruleSQuery )
                    // InternalSim.g:1263:3: ruleSQuery
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
    // InternalSim.g:1272:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1276:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 37:
                {
                alt12=3;
                }
                break;
            case 11:
            case 13:
            case 14:
            case 52:
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
                    // InternalSim.g:1277:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSim.g:1277:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSim.g:1278:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSim.g:1279:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSim.g:1279:4: rule__SAssociation__Group_0__0
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
                    // InternalSim.g:1283:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSim.g:1283:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSim.g:1284:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSim.g:1285:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSim.g:1285:4: rule__SAssociation__Group_1__0
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
                    // InternalSim.g:1289:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSim.g:1289:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSim.g:1290:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSim.g:1291:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSim.g:1291:4: rule__SAssociation__Group_2__0
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
                    // InternalSim.g:1295:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSim.g:1295:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSim.g:1296:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSim.g:1297:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSim.g:1297:4: rule__SAssociation__Group_3__0
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
    // InternalSim.g:1305:1: rule__SAssociation__Alternatives_0_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1309:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1310:2: ( 'reference' )
                    {
                    // InternalSim.g:1310:2: ( 'reference' )
                    // InternalSim.g:1311:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1316:2: ( 'composite' )
                    {
                    // InternalSim.g:1316:2: ( 'composite' )
                    // InternalSim.g:1317:3: 'composite'
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
    // InternalSim.g:1326:1: rule__SAssociation__Alternatives_1_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1330:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1331:2: ( 'reference' )
                    {
                    // InternalSim.g:1331:2: ( 'reference' )
                    // InternalSim.g:1332:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1337:2: ( 'composite' )
                    {
                    // InternalSim.g:1337:2: ( 'composite' )
                    // InternalSim.g:1338:3: 'composite'
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
    // InternalSim.g:1347:1: rule__SAssociation__Alternatives_2_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1351:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1352:2: ( 'reference' )
                    {
                    // InternalSim.g:1352:2: ( 'reference' )
                    // InternalSim.g:1353:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1358:2: ( 'composite' )
                    {
                    // InternalSim.g:1358:2: ( 'composite' )
                    // InternalSim.g:1359:3: 'composite'
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
    // InternalSim.g:1368:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1372:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
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
                    // InternalSim.g:1373:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSim.g:1373:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSim.g:1374:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSim.g:1375:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSim.g:1375:4: rule__SAssociation__KindAssignment_3_1_0
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
                    // InternalSim.g:1379:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSim.g:1379:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSim.g:1380:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSim.g:1381:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSim.g:1381:4: rule__SAssociation__Group_3_1_1__0
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
    // InternalSim.g:1389:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1393:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 37:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
            case 42:
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
                    // InternalSim.g:1394:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSim.g:1394:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSim.g:1395:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSim.g:1396:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSim.g:1396:4: rule__SAttribute__Group_0__0
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
                    // InternalSim.g:1400:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSim.g:1400:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSim.g:1401:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSim.g:1402:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSim.g:1402:4: rule__SAttribute__Group_1__0
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
                    // InternalSim.g:1406:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSim.g:1406:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSim.g:1407:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSim.g:1408:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSim.g:1408:4: rule__SAttribute__Group_2__0
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
                    // InternalSim.g:1412:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSim.g:1412:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSim.g:1413:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSim.g:1414:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSim.g:1414:4: rule__SAttribute__Group_3__0
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
    // InternalSim.g:1422:1: rule__SAttribute__Alternatives_0_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1426:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1427:2: ( 'attribute' )
                    {
                    // InternalSim.g:1427:2: ( 'attribute' )
                    // InternalSim.g:1428:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1433:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    {
                    // InternalSim.g:1433:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    // InternalSim.g:1434:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 
                    // InternalSim.g:1435:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    // InternalSim.g:1435:4: rule__SAttribute__DetailAssignment_0_2_1
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
    // InternalSim.g:1443:1: rule__SAttribute__Alternatives_1_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1447:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            else if ( (LA19_0==42) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1448:2: ( 'attribute' )
                    {
                    // InternalSim.g:1448:2: ( 'attribute' )
                    // InternalSim.g:1449:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1454:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    {
                    // InternalSim.g:1454:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    // InternalSim.g:1455:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 
                    // InternalSim.g:1456:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    // InternalSim.g:1456:4: rule__SAttribute__DetailAssignment_1_2_1
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
    // InternalSim.g:1464:1: rule__SAttribute__Alternatives_2_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1468:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( (LA20_0==42) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1469:2: ( 'attribute' )
                    {
                    // InternalSim.g:1469:2: ( 'attribute' )
                    // InternalSim.g:1470:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1475:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    {
                    // InternalSim.g:1475:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    // InternalSim.g:1476:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 
                    // InternalSim.g:1477:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    // InternalSim.g:1477:4: rule__SAttribute__DetailAssignment_2_2_1
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
    // InternalSim.g:1485:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1489:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 23:
            case 40:
                {
                alt21=1;
                }
                break;
            case 37:
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
                    // InternalSim.g:1490:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSim.g:1490:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSim.g:1491:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSim.g:1492:3: ( rule__SQuery__Group_0__0 )
                    // InternalSim.g:1492:4: rule__SQuery__Group_0__0
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
                    // InternalSim.g:1496:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSim.g:1496:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSim.g:1497:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSim.g:1498:3: ( rule__SQuery__Group_1__0 )
                    // InternalSim.g:1498:4: rule__SQuery__Group_1__0
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
                    // InternalSim.g:1502:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSim.g:1502:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSim.g:1503:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSim.g:1504:3: ( rule__SQuery__Group_2__0 )
                    // InternalSim.g:1504:4: rule__SQuery__Group_2__0
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
    // InternalSim.g:1512:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1516:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSim.g:1517:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSim.g:1517:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSim.g:1518:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSim.g:1519:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSim.g:1519:4: rule__SQuery__Group_0_0_0__0
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
                    // InternalSim.g:1523:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSim.g:1523:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSim.g:1524:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSim.g:1525:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSim.g:1525:4: rule__SQuery__Group_0_0_1__0
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
    // InternalSim.g:1533:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1537:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==23||LA24_0==37||LA24_0==40||LA24_0==44) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSim.g:1538:2: ( '*' )
                    {
                    // InternalSim.g:1538:2: ( '*' )
                    // InternalSim.g:1539:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1544:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSim.g:1544:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSim.g:1545:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSim.g:1546:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==23||LA23_0==37||LA23_0==40) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSim.g:1546:4: rule__SQuery__Group_0_2_1__0
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
    // InternalSim.g:1554:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1558:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 37:
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
                    // InternalSim.g:1559:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSim.g:1559:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSim.g:1560:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSim.g:1561:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSim.g:1561:4: rule__SQueryParameter__Group_0__0
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
                    // InternalSim.g:1565:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSim.g:1565:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSim.g:1566:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSim.g:1567:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSim.g:1567:4: rule__SQueryParameter__Group_1__0
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
                    // InternalSim.g:1571:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSim.g:1571:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSim.g:1572:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSim.g:1573:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSim.g:1573:4: rule__SQueryParameter__Group_2__0
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
                    // InternalSim.g:1577:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    {
                    // InternalSim.g:1577:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    // InternalSim.g:1578:3: ( rule__SQueryParameter__Group_3__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_3()); 
                    // InternalSim.g:1579:3: ( rule__SQueryParameter__Group_3__0 )
                    // InternalSim.g:1579:4: rule__SQueryParameter__Group_3__0
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
    // InternalSim.g:1587:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1591:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalSim.g:1592:2: ( RULE_INT )
                    {
                    // InternalSim.g:1592:2: ( RULE_INT )
                    // InternalSim.g:1593:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1598:2: ( '*' )
                    {
                    // InternalSim.g:1598:2: ( '*' )
                    // InternalSim.g:1599:3: '*'
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
    // InternalSim.g:1608:1: rule__SInformationModelKind__Alternatives : ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) );
    public final void rule__SInformationModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1612:1: ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) )
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
                    // InternalSim.g:1613:2: ( ( 'base' ) )
                    {
                    // InternalSim.g:1613:2: ( ( 'base' ) )
                    // InternalSim.g:1614:3: ( 'base' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1615:3: ( 'base' )
                    // InternalSim.g:1615:4: 'base'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1619:2: ( ( 'interface' ) )
                    {
                    // InternalSim.g:1619:2: ( ( 'interface' ) )
                    // InternalSim.g:1620:3: ( 'interface' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1621:3: ( 'interface' )
                    // InternalSim.g:1621:4: 'interface'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1625:2: ( ( 'core' ) )
                    {
                    // InternalSim.g:1625:2: ( ( 'core' ) )
                    // InternalSim.g:1626:3: ( 'core' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2()); 
                    // InternalSim.g:1627:3: ( 'core' )
                    // InternalSim.g:1627:4: 'core'
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


    // $ANTLR start "rule__SAssociationKind__Alternatives"
    // InternalSim.g:1635:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1639:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            else if ( (LA28_0==14) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSim.g:1640:2: ( ( 'reference' ) )
                    {
                    // InternalSim.g:1640:2: ( ( 'reference' ) )
                    // InternalSim.g:1641:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1642:3: ( 'reference' )
                    // InternalSim.g:1642:4: 'reference'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1646:2: ( ( 'composite' ) )
                    {
                    // InternalSim.g:1646:2: ( ( 'composite' ) )
                    // InternalSim.g:1647:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1648:3: ( 'composite' )
                    // InternalSim.g:1648:4: 'composite'
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
    // InternalSim.g:1656:1: rule__SInformationModel__Group__0 : rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 ;
    public final void rule__SInformationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1660:1: ( rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 )
            // InternalSim.g:1661:2: rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1
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
    // InternalSim.g:1668:1: rule__SInformationModel__Group__0__Impl : ( ( rule__SInformationModel__KindAssignment_0 ) ) ;
    public final void rule__SInformationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1672:1: ( ( ( rule__SInformationModel__KindAssignment_0 ) ) )
            // InternalSim.g:1673:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            {
            // InternalSim.g:1673:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            // InternalSim.g:1674:2: ( rule__SInformationModel__KindAssignment_0 )
            {
             before(grammarAccess.getSInformationModelAccess().getKindAssignment_0()); 
            // InternalSim.g:1675:2: ( rule__SInformationModel__KindAssignment_0 )
            // InternalSim.g:1675:3: rule__SInformationModel__KindAssignment_0
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
    // InternalSim.g:1683:1: rule__SInformationModel__Group__1 : rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 ;
    public final void rule__SInformationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1687:1: ( rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 )
            // InternalSim.g:1688:2: rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2
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
    // InternalSim.g:1695:1: rule__SInformationModel__Group__1__Impl : ( 'information' ) ;
    public final void rule__SInformationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1699:1: ( ( 'information' ) )
            // InternalSim.g:1700:1: ( 'information' )
            {
            // InternalSim.g:1700:1: ( 'information' )
            // InternalSim.g:1701:2: 'information'
            {
             before(grammarAccess.getSInformationModelAccess().getInformationKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSim.g:1710:1: rule__SInformationModel__Group__2 : rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 ;
    public final void rule__SInformationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1714:1: ( rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 )
            // InternalSim.g:1715:2: rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3
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
    // InternalSim.g:1722:1: rule__SInformationModel__Group__2__Impl : ( 'model' ) ;
    public final void rule__SInformationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1726:1: ( ( 'model' ) )
            // InternalSim.g:1727:1: ( 'model' )
            {
            // InternalSim.g:1727:1: ( 'model' )
            // InternalSim.g:1728:2: 'model'
            {
             before(grammarAccess.getSInformationModelAccess().getModelKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSim.g:1737:1: rule__SInformationModel__Group__3 : rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 ;
    public final void rule__SInformationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1741:1: ( rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 )
            // InternalSim.g:1742:2: rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4
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
    // InternalSim.g:1749:1: rule__SInformationModel__Group__3__Impl : ( ( rule__SInformationModel__NameAssignment_3 ) ) ;
    public final void rule__SInformationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1753:1: ( ( ( rule__SInformationModel__NameAssignment_3 ) ) )
            // InternalSim.g:1754:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            {
            // InternalSim.g:1754:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            // InternalSim.g:1755:2: ( rule__SInformationModel__NameAssignment_3 )
            {
             before(grammarAccess.getSInformationModelAccess().getNameAssignment_3()); 
            // InternalSim.g:1756:2: ( rule__SInformationModel__NameAssignment_3 )
            // InternalSim.g:1756:3: rule__SInformationModel__NameAssignment_3
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
    // InternalSim.g:1764:1: rule__SInformationModel__Group__4 : rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 ;
    public final void rule__SInformationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1768:1: ( rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 )
            // InternalSim.g:1769:2: rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5
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
    // InternalSim.g:1776:1: rule__SInformationModel__Group__4__Impl : ( ( rule__SInformationModel__GenerateAssignment_4 )? ) ;
    public final void rule__SInformationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1780:1: ( ( ( rule__SInformationModel__GenerateAssignment_4 )? ) )
            // InternalSim.g:1781:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            {
            // InternalSim.g:1781:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            // InternalSim.g:1782:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateAssignment_4()); 
            // InternalSim.g:1783:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSim.g:1783:3: rule__SInformationModel__GenerateAssignment_4
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
    // InternalSim.g:1791:1: rule__SInformationModel__Group__5 : rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 ;
    public final void rule__SInformationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1795:1: ( rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 )
            // InternalSim.g:1796:2: rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6
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
    // InternalSim.g:1803:1: rule__SInformationModel__Group__5__Impl : ( ( rule__SInformationModel__ImportsAssignment_5 )* ) ;
    public final void rule__SInformationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1807:1: ( ( ( rule__SInformationModel__ImportsAssignment_5 )* ) )
            // InternalSim.g:1808:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            {
            // InternalSim.g:1808:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            // InternalSim.g:1809:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            {
             before(grammarAccess.getSInformationModelAccess().getImportsAssignment_5()); 
            // InternalSim.g:1810:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSim.g:1810:3: rule__SInformationModel__ImportsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SInformationModel__ImportsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalSim.g:1818:1: rule__SInformationModel__Group__6 : rule__SInformationModel__Group__6__Impl ;
    public final void rule__SInformationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1822:1: ( rule__SInformationModel__Group__6__Impl )
            // InternalSim.g:1823:2: rule__SInformationModel__Group__6__Impl
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
    // InternalSim.g:1829:1: rule__SInformationModel__Group__6__Impl : ( ( rule__SInformationModel__Alternatives_6 )* ) ;
    public final void rule__SInformationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1833:1: ( ( ( rule__SInformationModel__Alternatives_6 )* ) )
            // InternalSim.g:1834:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            {
            // InternalSim.g:1834:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            // InternalSim.g:1835:2: ( rule__SInformationModel__Alternatives_6 )*
            {
             before(grammarAccess.getSInformationModelAccess().getAlternatives_6()); 
            // InternalSim.g:1836:2: ( rule__SInformationModel__Alternatives_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==12||LA31_0==23||(LA31_0>=33 && LA31_0<=34)||(LA31_0>=36 && LA31_0<=37)||(LA31_0>=39 && LA31_0<=42)||LA31_0==51) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSim.g:1836:3: rule__SInformationModel__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SInformationModel__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSim.g:1845:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1849:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSim.g:1850:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
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
    // InternalSim.g:1857:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1861:1: ( ( 'import' ) )
            // InternalSim.g:1862:1: ( 'import' )
            {
            // InternalSim.g:1862:1: ( 'import' )
            // InternalSim.g:1863:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSim.g:1872:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1876:1: ( rule__SImport__Group__1__Impl )
            // InternalSim.g:1877:2: rule__SImport__Group__1__Impl
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
    // InternalSim.g:1883:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1887:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSim.g:1888:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSim.g:1888:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSim.g:1889:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSim.g:1890:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSim.g:1890:3: rule__SImport__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__SGrabDomainRule__Group__0"
    // InternalSim.g:1899:1: rule__SGrabDomainRule__Group__0 : rule__SGrabDomainRule__Group__0__Impl rule__SGrabDomainRule__Group__1 ;
    public final void rule__SGrabDomainRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1903:1: ( rule__SGrabDomainRule__Group__0__Impl rule__SGrabDomainRule__Group__1 )
            // InternalSim.g:1904:2: rule__SGrabDomainRule__Group__0__Impl rule__SGrabDomainRule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SGrabDomainRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__0"


    // $ANTLR start "rule__SGrabDomainRule__Group__0__Impl"
    // InternalSim.g:1911:1: rule__SGrabDomainRule__Group__0__Impl : ( 'grab' ) ;
    public final void rule__SGrabDomainRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1915:1: ( ( 'grab' ) )
            // InternalSim.g:1916:1: ( 'grab' )
            {
            // InternalSim.g:1916:1: ( 'grab' )
            // InternalSim.g:1917:2: 'grab'
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getGrabKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSGrabDomainRuleAccess().getGrabKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__0__Impl"


    // $ANTLR start "rule__SGrabDomainRule__Group__1"
    // InternalSim.g:1926:1: rule__SGrabDomainRule__Group__1 : rule__SGrabDomainRule__Group__1__Impl rule__SGrabDomainRule__Group__2 ;
    public final void rule__SGrabDomainRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1930:1: ( rule__SGrabDomainRule__Group__1__Impl rule__SGrabDomainRule__Group__2 )
            // InternalSim.g:1931:2: rule__SGrabDomainRule__Group__1__Impl rule__SGrabDomainRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SGrabDomainRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__1"


    // $ANTLR start "rule__SGrabDomainRule__Group__1__Impl"
    // InternalSim.g:1938:1: rule__SGrabDomainRule__Group__1__Impl : ( 'domain' ) ;
    public final void rule__SGrabDomainRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1942:1: ( ( 'domain' ) )
            // InternalSim.g:1943:1: ( 'domain' )
            {
            // InternalSim.g:1943:1: ( 'domain' )
            // InternalSim.g:1944:2: 'domain'
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getDomainKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSGrabDomainRuleAccess().getDomainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__1__Impl"


    // $ANTLR start "rule__SGrabDomainRule__Group__2"
    // InternalSim.g:1953:1: rule__SGrabDomainRule__Group__2 : rule__SGrabDomainRule__Group__2__Impl ;
    public final void rule__SGrabDomainRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1957:1: ( rule__SGrabDomainRule__Group__2__Impl )
            // InternalSim.g:1958:2: rule__SGrabDomainRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__2"


    // $ANTLR start "rule__SGrabDomainRule__Group__2__Impl"
    // InternalSim.g:1964:1: rule__SGrabDomainRule__Group__2__Impl : ( ( rule__SGrabDomainRule__SourceAssignment_2 ) ) ;
    public final void rule__SGrabDomainRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1968:1: ( ( ( rule__SGrabDomainRule__SourceAssignment_2 ) ) )
            // InternalSim.g:1969:1: ( ( rule__SGrabDomainRule__SourceAssignment_2 ) )
            {
            // InternalSim.g:1969:1: ( ( rule__SGrabDomainRule__SourceAssignment_2 ) )
            // InternalSim.g:1970:2: ( rule__SGrabDomainRule__SourceAssignment_2 )
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceAssignment_2()); 
            // InternalSim.g:1971:2: ( rule__SGrabDomainRule__SourceAssignment_2 )
            // InternalSim.g:1971:3: rule__SGrabDomainRule__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SGrabDomainRule__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__Group__2__Impl"


    // $ANTLR start "rule__SGrabPrimitiveRule__Group__0"
    // InternalSim.g:1980:1: rule__SGrabPrimitiveRule__Group__0 : rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 ;
    public final void rule__SGrabPrimitiveRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1984:1: ( rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 )
            // InternalSim.g:1985:2: rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:1992:1: rule__SGrabPrimitiveRule__Group__0__Impl : ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1996:1: ( ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1997:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1997:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            // InternalSim.g:1998:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1999:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            // InternalSim.g:1999:3: rule__SGrabPrimitiveRule__SourceAssignment_0
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
    // InternalSim.g:2007:1: rule__SGrabPrimitiveRule__Group__1 : rule__SGrabPrimitiveRule__Group__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2011:1: ( rule__SGrabPrimitiveRule__Group__1__Impl )
            // InternalSim.g:2012:2: rule__SGrabPrimitiveRule__Group__1__Impl
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
    // InternalSim.g:2018:1: rule__SGrabPrimitiveRule__Group__1__Impl : ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) ;
    public final void rule__SGrabPrimitiveRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2022:1: ( ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) )
            // InternalSim.g:2023:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            {
            // InternalSim.g:2023:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            // InternalSim.g:2024:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup_1()); 
            // InternalSim.g:2025:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSim.g:2025:3: rule__SGrabPrimitiveRule__Group_1__0
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
    // InternalSim.g:2034:1: rule__SGrabPrimitiveRule__Group_1__0 : rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 ;
    public final void rule__SGrabPrimitiveRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2038:1: ( rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 )
            // InternalSim.g:2039:2: rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1
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
    // InternalSim.g:2046:1: rule__SGrabPrimitiveRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2050:1: ( ( 'as' ) )
            // InternalSim.g:2051:1: ( 'as' )
            {
            // InternalSim.g:2051:1: ( 'as' )
            // InternalSim.g:2052:2: 'as'
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2061:1: rule__SGrabPrimitiveRule__Group_1__1 : rule__SGrabPrimitiveRule__Group_1__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2065:1: ( rule__SGrabPrimitiveRule__Group_1__1__Impl )
            // InternalSim.g:2066:2: rule__SGrabPrimitiveRule__Group_1__1__Impl
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
    // InternalSim.g:2072:1: rule__SGrabPrimitiveRule__Group_1__1__Impl : ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2076:1: ( ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2077:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2077:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2078:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2079:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            // InternalSim.g:2079:3: rule__SGrabPrimitiveRule__RenameToAssignment_1_1
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
    // InternalSim.g:2088:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2092:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSim.g:2093:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2100:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2104:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2105:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2105:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSim.g:2106:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2107:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSim.g:2107:3: rule__SGrabEnumerationRule__SourceAssignment_0
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
    // InternalSim.g:2115:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2119:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSim.g:2120:2: rule__SGrabEnumerationRule__Group__1__Impl
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
    // InternalSim.g:2126:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2130:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSim.g:2131:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSim.g:2131:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSim.g:2132:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSim.g:2133:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSim.g:2133:3: rule__SGrabEnumerationRule__Group_1__0
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
    // InternalSim.g:2142:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2146:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSim.g:2147:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
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
    // InternalSim.g:2154:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2158:1: ( ( 'as' ) )
            // InternalSim.g:2159:1: ( 'as' )
            {
            // InternalSim.g:2159:1: ( 'as' )
            // InternalSim.g:2160:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2169:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2173:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl )
            // InternalSim.g:2174:2: rule__SGrabEnumerationRule__Group_1__1__Impl
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
    // InternalSim.g:2180:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2184:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2185:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2185:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2186:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2187:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            // InternalSim.g:2187:3: rule__SGrabEnumerationRule__RenameToAssignment_1_1
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
    // InternalSim.g:2196:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2200:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSim.g:2201:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2208:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2212:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2213:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2213:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSim.g:2214:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2215:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSim.g:2215:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
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
    // InternalSim.g:2223:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2227:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSim.g:2228:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
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
    // InternalSim.g:2234:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2238:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSim.g:2239:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSim.g:2239:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSim.g:2240:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSim.g:2241:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:2241:3: rule__SGrabEnumerationLiteralRule__Group_1__0
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
    // InternalSim.g:2250:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2254:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSim.g:2255:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
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
    // InternalSim.g:2262:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2266:1: ( ( 'as' ) )
            // InternalSim.g:2267:1: ( 'as' )
            {
            // InternalSim.g:2267:1: ( 'as' )
            // InternalSim.g:2268:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2277:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2281:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl )
            // InternalSim.g:2282:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl
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
    // InternalSim.g:2288:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2292:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2293:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2293:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2294:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2295:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            // InternalSim.g:2295:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1
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
    // InternalSim.g:2304:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2308:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSim.g:2309:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2316:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2320:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2321:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2321:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2322:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2323:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2323:3: rule__SGrabComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2331:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2335:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2336:2: rule__SGrabComplexTypeRule__Group__1__Impl
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
    // InternalSim.g:2342:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2346:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2347:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2347:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2348:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2349:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2349:3: rule__SGrabComplexTypeRule__Group_1__0
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
    // InternalSim.g:2358:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2362:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSim.g:2363:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
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
    // InternalSim.g:2370:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2374:1: ( ( 'as' ) )
            // InternalSim.g:2375:1: ( 'as' )
            {
            // InternalSim.g:2375:1: ( 'as' )
            // InternalSim.g:2376:2: 'as'
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2385:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2389:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2390:2: rule__SGrabComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2396:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2400:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2401:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2401:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2402:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2403:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2403:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2412:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2416:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSim.g:2417:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2424:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2428:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2429:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2429:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2430:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2431:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2431:3: rule__SMorphComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2439:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2443:1: ( rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 )
            // InternalSim.g:2444:2: rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2451:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2455:1: ( ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2456:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2456:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2457:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2458:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:2458:3: rule__SMorphComplexTypeRule__Group_1__0
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
    // InternalSim.g:2466:1: rule__SMorphComplexTypeRule__Group__2 : rule__SMorphComplexTypeRule__Group__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2470:1: ( rule__SMorphComplexTypeRule__Group__2__Impl )
            // InternalSim.g:2471:2: rule__SMorphComplexTypeRule__Group__2__Impl
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
    // InternalSim.g:2477:1: rule__SMorphComplexTypeRule__Group__2__Impl : ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2481:1: ( ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) )
            // InternalSim.g:2482:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            {
            // InternalSim.g:2482:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            // InternalSim.g:2483:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 
            // InternalSim.g:2484:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:2484:3: rule__SMorphComplexTypeRule__Group_2__0
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
    // InternalSim.g:2493:1: rule__SMorphComplexTypeRule__Group_1__0 : rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 ;
    public final void rule__SMorphComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2497:1: ( rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 )
            // InternalSim.g:2498:2: rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2505:1: rule__SMorphComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2509:1: ( ( 'as' ) )
            // InternalSim.g:2510:1: ( 'as' )
            {
            // InternalSim.g:2510:1: ( 'as' )
            // InternalSim.g:2511:2: 'as'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2520:1: rule__SMorphComplexTypeRule__Group_1__1 : rule__SMorphComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2524:1: ( rule__SMorphComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2525:2: rule__SMorphComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2531:1: rule__SMorphComplexTypeRule__Group_1__1__Impl : ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2535:1: ( ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2536:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2536:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2537:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2538:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2538:3: rule__SMorphComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2547:1: rule__SMorphComplexTypeRule__Group_2__0 : rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 ;
    public final void rule__SMorphComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2551:1: ( rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 )
            // InternalSim.g:2552:2: rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSim.g:2559:1: rule__SMorphComplexTypeRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2563:1: ( ( 'extends' ) )
            // InternalSim.g:2564:1: ( 'extends' )
            {
            // InternalSim.g:2564:1: ( 'extends' )
            // InternalSim.g:2565:2: 'extends'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSim.g:2574:1: rule__SMorphComplexTypeRule__Group_2__1 : rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 ;
    public final void rule__SMorphComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2578:1: ( rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 )
            // InternalSim.g:2579:2: rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2586:1: rule__SMorphComplexTypeRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2590:1: ( ( '=' ) )
            // InternalSim.g:2591:1: ( '=' )
            {
            // InternalSim.g:2591:1: ( '=' )
            // InternalSim.g:2592:2: '='
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:2601:1: rule__SMorphComplexTypeRule__Group_2__2 : rule__SMorphComplexTypeRule__Group_2__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2605:1: ( rule__SMorphComplexTypeRule__Group_2__2__Impl )
            // InternalSim.g:2606:2: rule__SMorphComplexTypeRule__Group_2__2__Impl
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
    // InternalSim.g:2612:1: rule__SMorphComplexTypeRule__Group_2__2__Impl : ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2616:1: ( ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) )
            // InternalSim.g:2617:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSim.g:2617:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            // InternalSim.g:2618:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSim.g:2619:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            // InternalSim.g:2619:3: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2
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
    // InternalSim.g:2628:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2632:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSim.g:2633:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSim.g:2640:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2644:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2645:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2645:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2646:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2647:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2647:3: rule__SFuseComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2655:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2659:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSim.g:2660:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2667:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2671:1: ( ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) ) )
            // InternalSim.g:2672:1: ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) )
            {
            // InternalSim.g:2672:1: ( ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* ) )
            // InternalSim.g:2673:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 ) ) ( ( rule__SFuseComplexTypeRule__Group_1__0 )* )
            {
            // InternalSim.g:2673:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 ) )
            // InternalSim.g:2674:3: ( rule__SFuseComplexTypeRule__Group_1__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2675:3: ( rule__SFuseComplexTypeRule__Group_1__0 )
            // InternalSim.g:2675:4: rule__SFuseComplexTypeRule__Group_1__0
            {
            pushFollow(FOLLOW_14);
            rule__SFuseComplexTypeRule__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 

            }

            // InternalSim.g:2678:2: ( ( rule__SFuseComplexTypeRule__Group_1__0 )* )
            // InternalSim.g:2679:3: ( rule__SFuseComplexTypeRule__Group_1__0 )*
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2680:3: ( rule__SFuseComplexTypeRule__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSim.g:2680:4: rule__SFuseComplexTypeRule__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalSim.g:2689:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2693:1: ( rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 )
            // InternalSim.g:2694:2: rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2701:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ( rule__SFuseComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2705:1: ( ( ( rule__SFuseComplexTypeRule__Group_2__0 )? ) )
            // InternalSim.g:2706:1: ( ( rule__SFuseComplexTypeRule__Group_2__0 )? )
            {
            // InternalSim.g:2706:1: ( ( rule__SFuseComplexTypeRule__Group_2__0 )? )
            // InternalSim.g:2707:2: ( rule__SFuseComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_2()); 
            // InternalSim.g:2708:2: ( rule__SFuseComplexTypeRule__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSim.g:2708:3: rule__SFuseComplexTypeRule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SFuseComplexTypeRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalSim.g:2716:1: rule__SFuseComplexTypeRule__Group__3 : rule__SFuseComplexTypeRule__Group__3__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2720:1: ( rule__SFuseComplexTypeRule__Group__3__Impl )
            // InternalSim.g:2721:2: rule__SFuseComplexTypeRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSim.g:2727:1: rule__SFuseComplexTypeRule__Group__3__Impl : ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2731:1: ( ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) )
            // InternalSim.g:2732:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            {
            // InternalSim.g:2732:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            // InternalSim.g:2733:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 
            // InternalSim.g:2734:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2734:3: rule__SFuseComplexTypeRule__Group_3__0
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_1__0"
    // InternalSim.g:2743:1: rule__SFuseComplexTypeRule__Group_1__0 : rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1 ;
    public final void rule__SFuseComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2747:1: ( rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1 )
            // InternalSim.g:2748:2: rule__SFuseComplexTypeRule__Group_1__0__Impl rule__SFuseComplexTypeRule__Group_1__1
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
    // InternalSim.g:2755:1: rule__SFuseComplexTypeRule__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2759:1: ( ( 'and' ) )
            // InternalSim.g:2760:1: ( 'and' )
            {
            // InternalSim.g:2760:1: ( 'and' )
            // InternalSim.g:2761:2: 'and'
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
    // InternalSim.g:2770:1: rule__SFuseComplexTypeRule__Group_1__1 : rule__SFuseComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2774:1: ( rule__SFuseComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2775:2: rule__SFuseComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2781:1: rule__SFuseComplexTypeRule__Group_1__1__Impl : ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2785:1: ( ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) ) )
            // InternalSim.g:2786:1: ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) )
            {
            // InternalSim.g:2786:1: ( ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 ) )
            // InternalSim.g:2787:2: ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesAssignment_1_1()); 
            // InternalSim.g:2788:2: ( rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 )
            // InternalSim.g:2788:3: rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_2__0"
    // InternalSim.g:2797:1: rule__SFuseComplexTypeRule__Group_2__0 : rule__SFuseComplexTypeRule__Group_2__0__Impl rule__SFuseComplexTypeRule__Group_2__1 ;
    public final void rule__SFuseComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2801:1: ( rule__SFuseComplexTypeRule__Group_2__0__Impl rule__SFuseComplexTypeRule__Group_2__1 )
            // InternalSim.g:2802:2: rule__SFuseComplexTypeRule__Group_2__0__Impl rule__SFuseComplexTypeRule__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SFuseComplexTypeRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_2__0"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_2__0__Impl"
    // InternalSim.g:2809:1: rule__SFuseComplexTypeRule__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__SFuseComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2813:1: ( ( 'as' ) )
            // InternalSim.g:2814:1: ( 'as' )
            {
            // InternalSim.g:2814:1: ( 'as' )
            // InternalSim.g:2815:2: 'as'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_2__0__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_2__1"
    // InternalSim.g:2824:1: rule__SFuseComplexTypeRule__Group_2__1 : rule__SFuseComplexTypeRule__Group_2__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2828:1: ( rule__SFuseComplexTypeRule__Group_2__1__Impl )
            // InternalSim.g:2829:2: rule__SFuseComplexTypeRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_2__1"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_2__1__Impl"
    // InternalSim.g:2835:1: rule__SFuseComplexTypeRule__Group_2__1__Impl : ( ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2839:1: ( ( ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 ) ) )
            // InternalSim.g:2840:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 ) )
            {
            // InternalSim.g:2840:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 ) )
            // InternalSim.g:2841:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_2_1()); 
            // InternalSim.g:2842:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_2_1 )
            // InternalSim.g:2842:3: rule__SFuseComplexTypeRule__RenameToAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__RenameToAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_2__1__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__0"
    // InternalSim.g:2851:1: rule__SFuseComplexTypeRule__Group_3__0 : rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 ;
    public final void rule__SFuseComplexTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2855:1: ( rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 )
            // InternalSim.g:2856:2: rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2863:1: rule__SFuseComplexTypeRule__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2867:1: ( ( 'extends' ) )
            // InternalSim.g:2868:1: ( 'extends' )
            {
            // InternalSim.g:2868:1: ( 'extends' )
            // InternalSim.g:2869:2: 'extends'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
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
    // InternalSim.g:2878:1: rule__SFuseComplexTypeRule__Group_3__1 : rule__SFuseComplexTypeRule__Group_3__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2882:1: ( rule__SFuseComplexTypeRule__Group_3__1__Impl )
            // InternalSim.g:2883:2: rule__SFuseComplexTypeRule__Group_3__1__Impl
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
    // InternalSim.g:2889:1: rule__SFuseComplexTypeRule__Group_3__1__Impl : ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2893:1: ( ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 ) ) )
            // InternalSim.g:2894:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 ) )
            {
            // InternalSim.g:2894:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 ) )
            // InternalSim.g:2895:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_3_1()); 
            // InternalSim.g:2896:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 )
            // InternalSim.g:2896:3: rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SGrabFeatureRule__Group__0"
    // InternalSim.g:2905:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2909:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSim.g:2910:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2917:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2921:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2922:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2922:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2923:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2924:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2924:3: rule__SGrabFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2932:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2936:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSim.g:2937:2: rule__SGrabFeatureRule__Group__1__Impl
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
    // InternalSim.g:2943:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2947:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2948:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2948:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSim.g:2949:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2950:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSim.g:2950:3: rule__SGrabFeatureRule__Group_1__0
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
    // InternalSim.g:2959:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2963:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSim.g:2964:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
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
    // InternalSim.g:2971:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2975:1: ( ( 'as' ) )
            // InternalSim.g:2976:1: ( 'as' )
            {
            // InternalSim.g:2976:1: ( 'as' )
            // InternalSim.g:2977:2: 'as'
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2986:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2990:1: ( rule__SGrabFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2991:2: rule__SGrabFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2997:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3001:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:3002:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:3002:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:3003:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:3004:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:3004:3: rule__SGrabFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:3013:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3017:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSim.g:3018:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:3025:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3029:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:3030:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:3030:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:3031:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:3032:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSim.g:3032:3: rule__SMorphFeatureRule__SourceAssignment_0
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
    // InternalSim.g:3040:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3044:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSim.g:3045:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:3052:1: rule__SMorphFeatureRule__Group__1__Impl : ( ( rule__SMorphFeatureRule__Group_1__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3056:1: ( ( ( rule__SMorphFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:3057:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:3057:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            // InternalSim.g:3058:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:3059:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSim.g:3059:3: rule__SMorphFeatureRule__Group_1__0
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
    // InternalSim.g:3067:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3071:1: ( rule__SMorphFeatureRule__Group__2__Impl )
            // InternalSim.g:3072:2: rule__SMorphFeatureRule__Group__2__Impl
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
    // InternalSim.g:3078:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3082:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSim.g:3083:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSim.g:3083:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSim.g:3084:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSim.g:3085:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSim.g:3085:3: rule__SMorphFeatureRule__Group_2__0
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
    // InternalSim.g:3094:1: rule__SMorphFeatureRule__Group_1__0 : rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 ;
    public final void rule__SMorphFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3098:1: ( rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 )
            // InternalSim.g:3099:2: rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:3106:1: rule__SMorphFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3110:1: ( ( 'as' ) )
            // InternalSim.g:3111:1: ( 'as' )
            {
            // InternalSim.g:3111:1: ( 'as' )
            // InternalSim.g:3112:2: 'as'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:3121:1: rule__SMorphFeatureRule__Group_1__1 : rule__SMorphFeatureRule__Group_1__1__Impl ;
    public final void rule__SMorphFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3125:1: ( rule__SMorphFeatureRule__Group_1__1__Impl )
            // InternalSim.g:3126:2: rule__SMorphFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:3132:1: rule__SMorphFeatureRule__Group_1__1__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3136:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:3137:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:3137:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:3138:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:3139:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:3139:3: rule__SMorphFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:3148:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3152:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSim.g:3153:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:3160:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3164:1: ( ( ':' ) )
            // InternalSim.g:3165:1: ( ':' )
            {
            // InternalSim.g:3165:1: ( ':' )
            // InternalSim.g:3166:2: ':'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:3175:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3179:1: ( rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 )
            // InternalSim.g:3180:2: rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:3187:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3191:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) )
            // InternalSim.g:3192:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            {
            // InternalSim.g:3192:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            // InternalSim.g:3193:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_1()); 
            // InternalSim.g:3194:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            // InternalSim.g:3194:3: rule__SMorphFeatureRule__RetypeToAssignment_2_1
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
    // InternalSim.g:3202:1: rule__SMorphFeatureRule__Group_2__2 : rule__SMorphFeatureRule__Group_2__2__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3206:1: ( rule__SMorphFeatureRule__Group_2__2__Impl )
            // InternalSim.g:3207:2: rule__SMorphFeatureRule__Group_2__2__Impl
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
    // InternalSim.g:3213:1: rule__SMorphFeatureRule__Group_2__2__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) ;
    public final void rule__SMorphFeatureRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3217:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) )
            // InternalSim.g:3218:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            {
            // InternalSim.g:3218:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            // InternalSim.g:3219:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_2()); 
            // InternalSim.g:3220:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_INT) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalSim.g:3220:3: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2
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
    // InternalSim.g:3229:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3233:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSim.g:3234:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3241:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3245:1: ( ( () ) )
            // InternalSim.g:3246:1: ( () )
            {
            // InternalSim.g:3246:1: ( () )
            // InternalSim.g:3247:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSim.g:3248:2: ()
            // InternalSim.g:3248:3: 
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
    // InternalSim.g:3256:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3260:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSim.g:3261:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3268:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3272:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSim.g:3273:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSim.g:3273:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSim.g:3274:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSim.g:3275:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSim.g:3275:3: rule__SAggregate__Alternatives_1
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
    // InternalSim.g:3283:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3287:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSim.g:3288:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3295:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3299:1: ( ( '{' ) )
            // InternalSim.g:3300:1: ( '{' )
            {
            // InternalSim.g:3300:1: ( '{' )
            // InternalSim.g:3301:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3310:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3314:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSim.g:3315:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3322:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3326:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSim.g:3327:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSim.g:3327:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSim.g:3328:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSim.g:3329:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==23||(LA45_0>=33 && LA45_0<=34)||(LA45_0>=36 && LA45_0<=37)||(LA45_0>=39 && LA45_0<=42)||LA45_0==51) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSim.g:3329:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SAggregate__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalSim.g:3337:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3341:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSim.g:3342:2: rule__SAggregate__Group__4__Impl
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
    // InternalSim.g:3348:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3352:1: ( ( '}' ) )
            // InternalSim.g:3353:1: ( '}' )
            {
            // InternalSim.g:3353:1: ( '}' )
            // InternalSim.g:3354:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3364:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3368:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSim.g:3369:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:3376:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3380:1: ( ( 'grab' ) )
            // InternalSim.g:3381:1: ( 'grab' )
            {
            // InternalSim.g:3381:1: ( 'grab' )
            // InternalSim.g:3382:2: 'grab'
            {
             before(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:3391:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3395:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSim.g:3396:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
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
    // InternalSim.g:3403:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3407:1: ( ( 'aggregate' ) )
            // InternalSim.g:3408:1: ( 'aggregate' )
            {
            // InternalSim.g:3408:1: ( 'aggregate' )
            // InternalSim.g:3409:2: 'aggregate'
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
    // InternalSim.g:3418:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3422:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSim.g:3423:2: rule__SAggregate__Group_1_0__2__Impl
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
    // InternalSim.g:3429:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3433:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSim.g:3434:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSim.g:3434:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSim.g:3435:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSim.g:3436:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSim.g:3436:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
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
    // InternalSim.g:3445:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3449:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSim.g:3450:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
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
    // InternalSim.g:3457:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3461:1: ( ( 'constraint' ) )
            // InternalSim.g:3462:1: ( 'constraint' )
            {
            // InternalSim.g:3462:1: ( 'constraint' )
            // InternalSim.g:3463:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:3472:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3476:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSim.g:3477:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:3484:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3488:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSim.g:3489:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSim.g:3489:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSim.g:3490:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSim.g:3491:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSim.g:3491:3: rule__SConstraint__NameAssignment_1
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
    // InternalSim.g:3499:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3503:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSim.g:3504:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
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
    // InternalSim.g:3511:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3515:1: ( ( ':' ) )
            // InternalSim.g:3516:1: ( ':' )
            {
            // InternalSim.g:3516:1: ( ':' )
            // InternalSim.g:3517:2: ':'
            {
             before(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:3526:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3530:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSim.g:3531:2: rule__SConstraint__Group__3__Impl
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
    // InternalSim.g:3537:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3541:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSim.g:3542:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSim.g:3542:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSim.g:3543:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSim.g:3544:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSim.g:3544:3: rule__SConstraint__ConditionAssignment_3
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
    // InternalSim.g:3553:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3557:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSim.g:3558:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3565:1: rule__SPrimitive__Group__0__Impl : ( ( rule__SPrimitive__Alternatives_0 ) ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3569:1: ( ( ( rule__SPrimitive__Alternatives_0 ) ) )
            // InternalSim.g:3570:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            {
            // InternalSim.g:3570:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            // InternalSim.g:3571:2: ( rule__SPrimitive__Alternatives_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_0()); 
            // InternalSim.g:3572:2: ( rule__SPrimitive__Alternatives_0 )
            // InternalSim.g:3572:3: rule__SPrimitive__Alternatives_0
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
    // InternalSim.g:3580:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3584:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSim.g:3585:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
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
    // InternalSim.g:3592:1: rule__SPrimitive__Group__1__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3596:1: ( ( '{' ) )
            // InternalSim.g:3597:1: ( '{' )
            {
            // InternalSim.g:3597:1: ( '{' )
            // InternalSim.g:3598:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3607:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3611:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSim.g:3612:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
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
    // InternalSim.g:3619:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3623:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) )
            // InternalSim.g:3624:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            {
            // InternalSim.g:3624:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            // InternalSim.g:3625:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_2()); 
            // InternalSim.g:3626:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==32) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSim.g:3626:3: rule__SPrimitive__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SPrimitive__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalSim.g:3634:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3638:1: ( rule__SPrimitive__Group__3__Impl )
            // InternalSim.g:3639:2: rule__SPrimitive__Group__3__Impl
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
    // InternalSim.g:3645:1: rule__SPrimitive__Group__3__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3649:1: ( ( '}' ) )
            // InternalSim.g:3650:1: ( '}' )
            {
            // InternalSim.g:3650:1: ( '}' )
            // InternalSim.g:3651:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3661:1: rule__SPrimitive__Group_0_0__0 : rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 ;
    public final void rule__SPrimitive__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3665:1: ( rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 )
            // InternalSim.g:3666:2: rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1
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
    // InternalSim.g:3673:1: rule__SPrimitive__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SPrimitive__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3677:1: ( ( () ) )
            // InternalSim.g:3678:1: ( () )
            {
            // InternalSim.g:3678:1: ( () )
            // InternalSim.g:3679:2: ()
            {
             before(grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0()); 
            // InternalSim.g:3680:2: ()
            // InternalSim.g:3680:3: 
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
    // InternalSim.g:3688:1: rule__SPrimitive__Group_0_0__1 : rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 ;
    public final void rule__SPrimitive__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3692:1: ( rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 )
            // InternalSim.g:3693:2: rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2
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
    // InternalSim.g:3700:1: rule__SPrimitive__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SPrimitive__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3704:1: ( ( 'grab' ) )
            // InternalSim.g:3705:1: ( 'grab' )
            {
            // InternalSim.g:3705:1: ( 'grab' )
            // InternalSim.g:3706:2: 'grab'
            {
             before(grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:3715:1: rule__SPrimitive__Group_0_0__2 : rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 ;
    public final void rule__SPrimitive__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3719:1: ( rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 )
            // InternalSim.g:3720:2: rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3
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
    // InternalSim.g:3727:1: rule__SPrimitive__Group_0_0__2__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3731:1: ( ( 'primitive' ) )
            // InternalSim.g:3732:1: ( 'primitive' )
            {
            // InternalSim.g:3732:1: ( 'primitive' )
            // InternalSim.g:3733:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSim.g:3742:1: rule__SPrimitive__Group_0_0__3 : rule__SPrimitive__Group_0_0__3__Impl ;
    public final void rule__SPrimitive__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3746:1: ( rule__SPrimitive__Group_0_0__3__Impl )
            // InternalSim.g:3747:2: rule__SPrimitive__Group_0_0__3__Impl
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
    // InternalSim.g:3753:1: rule__SPrimitive__Group_0_0__3__Impl : ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SPrimitive__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3757:1: ( ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:3758:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:3758:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:3759:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:3760:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:3760:3: rule__SPrimitive__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:3769:1: rule__SPrimitive__Group_0_1__0 : rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 ;
    public final void rule__SPrimitive__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3773:1: ( rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 )
            // InternalSim.g:3774:2: rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1
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
    // InternalSim.g:3781:1: rule__SPrimitive__Group_0_1__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitive__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3785:1: ( ( 'archetype' ) )
            // InternalSim.g:3786:1: ( 'archetype' )
            {
            // InternalSim.g:3786:1: ( 'archetype' )
            // InternalSim.g:3787:2: 'archetype'
            {
             before(grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:3796:1: rule__SPrimitive__Group_0_1__1 : rule__SPrimitive__Group_0_1__1__Impl ;
    public final void rule__SPrimitive__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3800:1: ( rule__SPrimitive__Group_0_1__1__Impl )
            // InternalSim.g:3801:2: rule__SPrimitive__Group_0_1__1__Impl
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
    // InternalSim.g:3807:1: rule__SPrimitive__Group_0_1__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) ;
    public final void rule__SPrimitive__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3811:1: ( ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) )
            // InternalSim.g:3812:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            {
            // InternalSim.g:3812:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            // InternalSim.g:3813:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_1_1()); 
            // InternalSim.g:3814:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            // InternalSim.g:3814:3: rule__SPrimitive__NameAssignment_0_1_1
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
    // InternalSim.g:3823:1: rule__SPrimitive__Group_0_2__0 : rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 ;
    public final void rule__SPrimitive__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3827:1: ( rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 )
            // InternalSim.g:3828:2: rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1
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
    // InternalSim.g:3835:1: rule__SPrimitive__Group_0_2__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3839:1: ( ( 'primitive' ) )
            // InternalSim.g:3840:1: ( 'primitive' )
            {
            // InternalSim.g:3840:1: ( 'primitive' )
            // InternalSim.g:3841:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSim.g:3850:1: rule__SPrimitive__Group_0_2__1 : rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 ;
    public final void rule__SPrimitive__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3854:1: ( rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 )
            // InternalSim.g:3855:2: rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2
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
    // InternalSim.g:3862:1: rule__SPrimitive__Group_0_2__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) ;
    public final void rule__SPrimitive__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3866:1: ( ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:3867:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:3867:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            // InternalSim.g:3868:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:3869:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            // InternalSim.g:3869:3: rule__SPrimitive__NameAssignment_0_2_1
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
    // InternalSim.g:3877:1: rule__SPrimitive__Group_0_2__2 : rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 ;
    public final void rule__SPrimitive__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3881:1: ( rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 )
            // InternalSim.g:3882:2: rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3
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
    // InternalSim.g:3889:1: rule__SPrimitive__Group_0_2__2__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3893:1: ( ( 'redefines' ) )
            // InternalSim.g:3894:1: ( 'redefines' )
            {
            // InternalSim.g:3894:1: ( 'redefines' )
            // InternalSim.g:3895:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_0_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:3904:1: rule__SPrimitive__Group_0_2__3 : rule__SPrimitive__Group_0_2__3__Impl ;
    public final void rule__SPrimitive__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3908:1: ( rule__SPrimitive__Group_0_2__3__Impl )
            // InternalSim.g:3909:2: rule__SPrimitive__Group_0_2__3__Impl
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
    // InternalSim.g:3915:1: rule__SPrimitive__Group_0_2__3__Impl : ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) ;
    public final void rule__SPrimitive__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3919:1: ( ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) )
            // InternalSim.g:3920:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            {
            // InternalSim.g:3920:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            // InternalSim.g:3921:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_0_2_3()); 
            // InternalSim.g:3922:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            // InternalSim.g:3922:3: rule__SPrimitive__RedefinesAssignment_0_2_3
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
    // InternalSim.g:3931:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3935:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSim.g:3936:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3943:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3947:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSim.g:3948:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSim.g:3948:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSim.g:3949:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSim.g:3950:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSim.g:3950:3: rule__SEnumeration__Alternatives_0
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
    // InternalSim.g:3958:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3962:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSim.g:3963:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
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
    // InternalSim.g:3970:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3974:1: ( ( '{' ) )
            // InternalSim.g:3975:1: ( '{' )
            {
            // InternalSim.g:3975:1: ( '{' )
            // InternalSim.g:3976:2: '{'
            {
             before(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3985:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3989:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSim.g:3990:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
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
    // InternalSim.g:3997:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4001:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSim.g:4002:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSim.g:4002:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSim.g:4003:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSim.g:4004:2: ( rule__SEnumeration__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==23||LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSim.g:4004:3: rule__SEnumeration__Group_2__0
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
    // InternalSim.g:4012:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4016:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSim.g:4017:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
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
    // InternalSim.g:4024:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4028:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:4029:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:4029:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSim.g:4030:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:4031:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==32) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSim.g:4031:3: rule__SEnumeration__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SEnumeration__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalSim.g:4039:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4043:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSim.g:4044:2: rule__SEnumeration__Group__4__Impl
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
    // InternalSim.g:4050:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4054:1: ( ( '}' ) )
            // InternalSim.g:4055:1: ( '}' )
            {
            // InternalSim.g:4055:1: ( '}' )
            // InternalSim.g:4056:2: '}'
            {
             before(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:4066:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4070:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSim.g:4071:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
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
    // InternalSim.g:4078:1: rule__SEnumeration__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4082:1: ( ( () ) )
            // InternalSim.g:4083:1: ( () )
            {
            // InternalSim.g:4083:1: ( () )
            // InternalSim.g:4084:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 
            // InternalSim.g:4085:2: ()
            // InternalSim.g:4085:3: 
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
    // InternalSim.g:4093:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4097:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSim.g:4098:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
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
    // InternalSim.g:4105:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4109:1: ( ( 'grab' ) )
            // InternalSim.g:4110:1: ( 'grab' )
            {
            // InternalSim.g:4110:1: ( 'grab' )
            // InternalSim.g:4111:2: 'grab'
            {
             before(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:4120:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4124:1: ( rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 )
            // InternalSim.g:4125:2: rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3
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
    // InternalSim.g:4132:1: rule__SEnumeration__Group_0_0__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4136:1: ( ( 'enumeration' ) )
            // InternalSim.g:4137:1: ( 'enumeration' )
            {
            // InternalSim.g:4137:1: ( 'enumeration' )
            // InternalSim.g:4138:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4147:1: rule__SEnumeration__Group_0_0__3 : rule__SEnumeration__Group_0_0__3__Impl ;
    public final void rule__SEnumeration__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4151:1: ( rule__SEnumeration__Group_0_0__3__Impl )
            // InternalSim.g:4152:2: rule__SEnumeration__Group_0_0__3__Impl
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
    // InternalSim.g:4158:1: rule__SEnumeration__Group_0_0__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SEnumeration__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4162:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:4163:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:4163:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:4164:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:4165:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:4165:3: rule__SEnumeration__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:4174:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4178:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSim.g:4179:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
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
    // InternalSim.g:4186:1: rule__SEnumeration__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4190:1: ( ( () ) )
            // InternalSim.g:4191:1: ( () )
            {
            // InternalSim.g:4191:1: ( () )
            // InternalSim.g:4192:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 
            // InternalSim.g:4193:2: ()
            // InternalSim.g:4193:3: 
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
    // InternalSim.g:4201:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4205:1: ( rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 )
            // InternalSim.g:4206:2: rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2
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
    // InternalSim.g:4213:1: rule__SEnumeration__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4217:1: ( ( 'ditch' ) )
            // InternalSim.g:4218:1: ( 'ditch' )
            {
            // InternalSim.g:4218:1: ( 'ditch' )
            // InternalSim.g:4219:2: 'ditch'
            {
             before(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4228:1: rule__SEnumeration__Group_0_1__2 : rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 ;
    public final void rule__SEnumeration__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4232:1: ( rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 )
            // InternalSim.g:4233:2: rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3
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
    // InternalSim.g:4240:1: rule__SEnumeration__Group_0_1__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4244:1: ( ( 'enumeration' ) )
            // InternalSim.g:4245:1: ( 'enumeration' )
            {
            // InternalSim.g:4245:1: ( 'enumeration' )
            // InternalSim.g:4246:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4255:1: rule__SEnumeration__Group_0_1__3 : rule__SEnumeration__Group_0_1__3__Impl ;
    public final void rule__SEnumeration__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4259:1: ( rule__SEnumeration__Group_0_1__3__Impl )
            // InternalSim.g:4260:2: rule__SEnumeration__Group_0_1__3__Impl
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
    // InternalSim.g:4266:1: rule__SEnumeration__Group_0_1__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SEnumeration__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4270:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:4271:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:4271:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:4272:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:4273:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:4273:3: rule__SEnumeration__DeductionRuleAssignment_0_1_3
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
    // InternalSim.g:4282:1: rule__SEnumeration__Group_0_2__0 : rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 ;
    public final void rule__SEnumeration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4286:1: ( rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 )
            // InternalSim.g:4287:2: rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1
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
    // InternalSim.g:4294:1: rule__SEnumeration__Group_0_2__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4298:1: ( ( 'enumeration' ) )
            // InternalSim.g:4299:1: ( 'enumeration' )
            {
            // InternalSim.g:4299:1: ( 'enumeration' )
            // InternalSim.g:4300:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4309:1: rule__SEnumeration__Group_0_2__1 : rule__SEnumeration__Group_0_2__1__Impl ;
    public final void rule__SEnumeration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4313:1: ( rule__SEnumeration__Group_0_2__1__Impl )
            // InternalSim.g:4314:2: rule__SEnumeration__Group_0_2__1__Impl
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
    // InternalSim.g:4320:1: rule__SEnumeration__Group_0_2__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) ;
    public final void rule__SEnumeration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4324:1: ( ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:4325:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:4325:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            // InternalSim.g:4326:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:4327:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            // InternalSim.g:4327:3: rule__SEnumeration__NameAssignment_0_2_1
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
    // InternalSim.g:4336:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4340:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSim.g:4341:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
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
    // InternalSim.g:4348:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4352:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSim.g:4353:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSim.g:4353:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSim.g:4354:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSim.g:4355:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSim.g:4355:3: rule__SEnumeration__LiteralsAssignment_2_0
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
    // InternalSim.g:4363:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4367:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSim.g:4368:2: rule__SEnumeration__Group_2__1__Impl
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
    // InternalSim.g:4374:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4378:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSim.g:4379:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSim.g:4379:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSim.g:4380:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSim.g:4381:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==38) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSim.g:4381:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SEnumeration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalSim.g:4390:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4394:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSim.g:4395:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
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
    // InternalSim.g:4402:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4406:1: ( ( ',' ) )
            // InternalSim.g:4407:1: ( ',' )
            {
            // InternalSim.g:4407:1: ( ',' )
            // InternalSim.g:4408:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4417:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4421:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSim.g:4422:2: rule__SEnumeration__Group_2_1__1__Impl
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
    // InternalSim.g:4428:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4432:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSim.g:4433:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSim.g:4433:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSim.g:4434:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSim.g:4435:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSim.g:4435:3: rule__SEnumeration__LiteralsAssignment_2_1_1
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
    // InternalSim.g:4444:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4448:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSim.g:4449:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
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
    // InternalSim.g:4456:1: rule__SLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4460:1: ( ( () ) )
            // InternalSim.g:4461:1: ( () )
            {
            // InternalSim.g:4461:1: ( () )
            // InternalSim.g:4462:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 
            // InternalSim.g:4463:2: ()
            // InternalSim.g:4463:3: 
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
    // InternalSim.g:4471:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4475:1: ( rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 )
            // InternalSim.g:4476:2: rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2
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
    // InternalSim.g:4483:1: rule__SLiteral__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4487:1: ( ( 'grab' ) )
            // InternalSim.g:4488:1: ( 'grab' )
            {
            // InternalSim.g:4488:1: ( 'grab' )
            // InternalSim.g:4489:2: 'grab'
            {
             before(grammarAccess.getSLiteralAccess().getGrabKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:4498:1: rule__SLiteral__Group_0__2 : rule__SLiteral__Group_0__2__Impl ;
    public final void rule__SLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4502:1: ( rule__SLiteral__Group_0__2__Impl )
            // InternalSim.g:4503:2: rule__SLiteral__Group_0__2__Impl
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
    // InternalSim.g:4509:1: rule__SLiteral__Group_0__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4513:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:4514:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:4514:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:4515:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:4516:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            // InternalSim.g:4516:3: rule__SLiteral__DeductionRuleAssignment_0_2
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
    // InternalSim.g:4525:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4529:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSim.g:4530:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
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
    // InternalSim.g:4537:1: rule__SLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4541:1: ( ( () ) )
            // InternalSim.g:4542:1: ( () )
            {
            // InternalSim.g:4542:1: ( () )
            // InternalSim.g:4543:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 
            // InternalSim.g:4544:2: ()
            // InternalSim.g:4544:3: 
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
    // InternalSim.g:4552:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4556:1: ( rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 )
            // InternalSim.g:4557:2: rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2
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
    // InternalSim.g:4564:1: rule__SLiteral__Group_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4568:1: ( ( 'ditch' ) )
            // InternalSim.g:4569:1: ( 'ditch' )
            {
            // InternalSim.g:4569:1: ( 'ditch' )
            // InternalSim.g:4570:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4579:1: rule__SLiteral__Group_1__2 : rule__SLiteral__Group_1__2__Impl ;
    public final void rule__SLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4583:1: ( rule__SLiteral__Group_1__2__Impl )
            // InternalSim.g:4584:2: rule__SLiteral__Group_1__2__Impl
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
    // InternalSim.g:4590:1: rule__SLiteral__Group_1__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4594:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:4595:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:4595:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:4596:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:4597:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            // InternalSim.g:4597:3: rule__SLiteral__DeductionRuleAssignment_1_2
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
    // InternalSim.g:4606:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4610:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSim.g:4611:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:4618:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4622:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSim.g:4623:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSim.g:4623:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSim.g:4624:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4625:2: ( rule__SRootType__Alternatives_0 )
            // InternalSim.g:4625:3: rule__SRootType__Alternatives_0
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
    // InternalSim.g:4633:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4637:1: ( rule__SRootType__Group__1__Impl )
            // InternalSim.g:4638:2: rule__SRootType__Group__1__Impl
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
    // InternalSim.g:4644:1: rule__SRootType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4648:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:4649:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:4649:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:4650:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:4660:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4664:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSim.g:4665:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:4672:1: rule__SRootType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4676:1: ( ( () ) )
            // InternalSim.g:4677:1: ( () )
            {
            // InternalSim.g:4677:1: ( () )
            // InternalSim.g:4678:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0()); 
            // InternalSim.g:4679:2: ()
            // InternalSim.g:4679:3: 
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
    // InternalSim.g:4687:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4691:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSim.g:4692:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4699:1: rule__SRootType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4703:1: ( ( 'grab' ) )
            // InternalSim.g:4704:1: ( 'grab' )
            {
            // InternalSim.g:4704:1: ( 'grab' )
            // InternalSim.g:4705:2: 'grab'
            {
             before(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:4714:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4718:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSim.g:4719:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4726:1: rule__SRootType__Group_0_0__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4730:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:4731:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:4731:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:4732:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:4733:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSim.g:4733:3: rule__SRootType__AbstractAssignment_0_0_2
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
    // InternalSim.g:4741:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4745:1: ( rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 )
            // InternalSim.g:4746:2: rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4753:1: rule__SRootType__Group_0_0__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4757:1: ( ( 'root' ) )
            // InternalSim.g:4758:1: ( 'root' )
            {
            // InternalSim.g:4758:1: ( 'root' )
            // InternalSim.g:4759:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:4768:1: rule__SRootType__Group_0_0__4 : rule__SRootType__Group_0_0__4__Impl ;
    public final void rule__SRootType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4772:1: ( rule__SRootType__Group_0_0__4__Impl )
            // InternalSim.g:4773:2: rule__SRootType__Group_0_0__4__Impl
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
    // InternalSim.g:4779:1: rule__SRootType__Group_0_0__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SRootType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4783:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:4784:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:4784:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:4785:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:4786:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:4786:3: rule__SRootType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:4795:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4799:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSim.g:4800:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSim.g:4807:1: rule__SRootType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4811:1: ( ( () ) )
            // InternalSim.g:4812:1: ( () )
            {
            // InternalSim.g:4812:1: ( () )
            // InternalSim.g:4813:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0()); 
            // InternalSim.g:4814:2: ()
            // InternalSim.g:4814:3: 
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
    // InternalSim.g:4822:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4826:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSim.g:4827:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4834:1: rule__SRootType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4838:1: ( ( 'ditch' ) )
            // InternalSim.g:4839:1: ( 'ditch' )
            {
            // InternalSim.g:4839:1: ( 'ditch' )
            // InternalSim.g:4840:2: 'ditch'
            {
             before(grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4849:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4853:1: ( rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 )
            // InternalSim.g:4854:2: rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4861:1: rule__SRootType__Group_0_1__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4865:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:4866:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:4866:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:4867:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:4868:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:4868:3: rule__SRootType__AbstractAssignment_0_1_2
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
    // InternalSim.g:4876:1: rule__SRootType__Group_0_1__3 : rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 ;
    public final void rule__SRootType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4880:1: ( rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 )
            // InternalSim.g:4881:2: rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:4888:1: rule__SRootType__Group_0_1__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4892:1: ( ( 'root' ) )
            // InternalSim.g:4893:1: ( 'root' )
            {
            // InternalSim.g:4893:1: ( 'root' )
            // InternalSim.g:4894:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:4903:1: rule__SRootType__Group_0_1__4 : rule__SRootType__Group_0_1__4__Impl ;
    public final void rule__SRootType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4907:1: ( rule__SRootType__Group_0_1__4__Impl )
            // InternalSim.g:4908:2: rule__SRootType__Group_0_1__4__Impl
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
    // InternalSim.g:4914:1: rule__SRootType__Group_0_1__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SRootType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4918:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:4919:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:4919:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:4920:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:4921:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:4921:3: rule__SRootType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:4930:1: rule__SRootType__Group_0_2__0 : rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 ;
    public final void rule__SRootType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4934:1: ( rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 )
            // InternalSim.g:4935:2: rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:4942:1: rule__SRootType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4946:1: ( ( () ) )
            // InternalSim.g:4947:1: ( () )
            {
            // InternalSim.g:4947:1: ( () )
            // InternalSim.g:4948:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0()); 
            // InternalSim.g:4949:2: ()
            // InternalSim.g:4949:3: 
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
    // InternalSim.g:4957:1: rule__SRootType__Group_0_2__1 : rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 ;
    public final void rule__SRootType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4961:1: ( rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 )
            // InternalSim.g:4962:2: rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4969:1: rule__SRootType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SRootType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4973:1: ( ( 'morph' ) )
            // InternalSim.g:4974:1: ( 'morph' )
            {
            // InternalSim.g:4974:1: ( 'morph' )
            // InternalSim.g:4975:2: 'morph'
            {
             before(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4984:1: rule__SRootType__Group_0_2__2 : rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 ;
    public final void rule__SRootType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4988:1: ( rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 )
            // InternalSim.g:4989:2: rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4996:1: rule__SRootType__Group_0_2__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SRootType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5000:1: ( ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:5001:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:5001:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:5002:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:5003:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==51) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSim.g:5003:3: rule__SRootType__AbstractAssignment_0_2_2
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
    // InternalSim.g:5011:1: rule__SRootType__Group_0_2__3 : rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 ;
    public final void rule__SRootType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5015:1: ( rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 )
            // InternalSim.g:5016:2: rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5023:1: rule__SRootType__Group_0_2__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5027:1: ( ( 'root' ) )
            // InternalSim.g:5028:1: ( 'root' )
            {
            // InternalSim.g:5028:1: ( 'root' )
            // InternalSim.g:5029:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:5038:1: rule__SRootType__Group_0_2__4 : rule__SRootType__Group_0_2__4__Impl ;
    public final void rule__SRootType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5042:1: ( rule__SRootType__Group_0_2__4__Impl )
            // InternalSim.g:5043:2: rule__SRootType__Group_0_2__4__Impl
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
    // InternalSim.g:5049:1: rule__SRootType__Group_0_2__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SRootType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5053:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5054:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5054:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5055:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5056:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5056:3: rule__SRootType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:5065:1: rule__SRootType__Group_0_3__0 : rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 ;
    public final void rule__SRootType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5069:1: ( rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 )
            // InternalSim.g:5070:2: rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSim.g:5077:1: rule__SRootType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5081:1: ( ( () ) )
            // InternalSim.g:5082:1: ( () )
            {
            // InternalSim.g:5082:1: ( () )
            // InternalSim.g:5083:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0()); 
            // InternalSim.g:5084:2: ()
            // InternalSim.g:5084:3: 
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
    // InternalSim.g:5092:1: rule__SRootType__Group_0_3__1 : rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 ;
    public final void rule__SRootType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5096:1: ( rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 )
            // InternalSim.g:5097:2: rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:5104:1: rule__SRootType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SRootType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5108:1: ( ( 'fuse' ) )
            // InternalSim.g:5109:1: ( 'fuse' )
            {
            // InternalSim.g:5109:1: ( 'fuse' )
            // InternalSim.g:5110:2: 'fuse'
            {
             before(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5119:1: rule__SRootType__Group_0_3__2 : rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 ;
    public final void rule__SRootType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5123:1: ( rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 )
            // InternalSim.g:5124:2: rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:5131:1: rule__SRootType__Group_0_3__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SRootType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5135:1: ( ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:5136:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:5136:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:5137:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:5138:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:5138:3: rule__SRootType__AbstractAssignment_0_3_2
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
    // InternalSim.g:5146:1: rule__SRootType__Group_0_3__3 : rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 ;
    public final void rule__SRootType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5150:1: ( rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 )
            // InternalSim.g:5151:2: rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5158:1: rule__SRootType__Group_0_3__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5162:1: ( ( 'root' ) )
            // InternalSim.g:5163:1: ( 'root' )
            {
            // InternalSim.g:5163:1: ( 'root' )
            // InternalSim.g:5164:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:5173:1: rule__SRootType__Group_0_3__4 : rule__SRootType__Group_0_3__4__Impl ;
    public final void rule__SRootType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5177:1: ( rule__SRootType__Group_0_3__4__Impl )
            // InternalSim.g:5178:2: rule__SRootType__Group_0_3__4__Impl
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
    // InternalSim.g:5184:1: rule__SRootType__Group_0_3__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SRootType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5188:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5189:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5189:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5190:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5191:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5191:3: rule__SRootType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:5200:1: rule__SRootType__Group_0_4__0 : rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 ;
    public final void rule__SRootType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5204:1: ( rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 )
            // InternalSim.g:5205:2: rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5212:1: rule__SRootType__Group_0_4__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SRootType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5216:1: ( ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5217:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5217:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5218:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5219:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:5219:3: rule__SRootType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5227:1: rule__SRootType__Group_0_4__1 : rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 ;
    public final void rule__SRootType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5231:1: ( rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 )
            // InternalSim.g:5232:2: rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5239:1: rule__SRootType__Group_0_4__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5243:1: ( ( 'root' ) )
            // InternalSim.g:5244:1: ( 'root' )
            {
            // InternalSim.g:5244:1: ( 'root' )
            // InternalSim.g:5245:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:5254:1: rule__SRootType__Group_0_4__2 : rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 ;
    public final void rule__SRootType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5258:1: ( rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 )
            // InternalSim.g:5259:2: rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalSim.g:5266:1: rule__SRootType__Group_0_4__2__Impl : ( ( rule__SRootType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SRootType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5270:1: ( ( ( rule__SRootType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5271:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5271:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5272:2: ( rule__SRootType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5273:2: ( rule__SRootType__NameAssignment_0_4_2 )
            // InternalSim.g:5273:3: rule__SRootType__NameAssignment_0_4_2
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
    // InternalSim.g:5281:1: rule__SRootType__Group_0_4__3 : rule__SRootType__Group_0_4__3__Impl ;
    public final void rule__SRootType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5285:1: ( rule__SRootType__Group_0_4__3__Impl )
            // InternalSim.g:5286:2: rule__SRootType__Group_0_4__3__Impl
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
    // InternalSim.g:5292:1: rule__SRootType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SRootType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5296:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5297:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5297:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5298:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5308:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5312:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSim.g:5313:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:5320:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5324:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSim.g:5325:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSim.g:5325:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSim.g:5326:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSim.g:5327:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSim.g:5327:3: rule__SDetailType__Alternatives_0
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
    // InternalSim.g:5335:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5339:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSim.g:5340:2: rule__SDetailType__Group__1__Impl
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
    // InternalSim.g:5346:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5350:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:5351:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:5351:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:5352:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:5362:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5366:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSim.g:5367:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
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
    // InternalSim.g:5374:1: rule__SDetailType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5378:1: ( ( () ) )
            // InternalSim.g:5379:1: ( () )
            {
            // InternalSim.g:5379:1: ( () )
            // InternalSim.g:5380:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 
            // InternalSim.g:5381:2: ()
            // InternalSim.g:5381:3: 
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
    // InternalSim.g:5389:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5393:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSim.g:5394:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
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
    // InternalSim.g:5401:1: rule__SDetailType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5405:1: ( ( 'grab' ) )
            // InternalSim.g:5406:1: ( 'grab' )
            {
            // InternalSim.g:5406:1: ( 'grab' )
            // InternalSim.g:5407:2: 'grab'
            {
             before(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:5416:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5420:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSim.g:5421:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5428:1: rule__SDetailType__Group_0_0__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5432:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:5433:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:5433:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:5434:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:5435:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSim.g:5435:3: rule__SDetailType__AbstractAssignment_0_0_2
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
    // InternalSim.g:5443:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5447:1: ( rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 )
            // InternalSim.g:5448:2: rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5455:1: rule__SDetailType__Group_0_0__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5459:1: ( ( 'detail' ) )
            // InternalSim.g:5460:1: ( 'detail' )
            {
            // InternalSim.g:5460:1: ( 'detail' )
            // InternalSim.g:5461:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5470:1: rule__SDetailType__Group_0_0__4 : rule__SDetailType__Group_0_0__4__Impl ;
    public final void rule__SDetailType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5474:1: ( rule__SDetailType__Group_0_0__4__Impl )
            // InternalSim.g:5475:2: rule__SDetailType__Group_0_0__4__Impl
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
    // InternalSim.g:5481:1: rule__SDetailType__Group_0_0__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SDetailType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5485:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:5486:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:5486:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:5487:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:5488:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:5488:3: rule__SDetailType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:5497:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5501:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSim.g:5502:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
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
    // InternalSim.g:5509:1: rule__SDetailType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5513:1: ( ( () ) )
            // InternalSim.g:5514:1: ( () )
            {
            // InternalSim.g:5514:1: ( () )
            // InternalSim.g:5515:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 
            // InternalSim.g:5516:2: ()
            // InternalSim.g:5516:3: 
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
    // InternalSim.g:5524:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5528:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSim.g:5529:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
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
    // InternalSim.g:5536:1: rule__SDetailType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5540:1: ( ( 'ditch' ) )
            // InternalSim.g:5541:1: ( 'ditch' )
            {
            // InternalSim.g:5541:1: ( 'ditch' )
            // InternalSim.g:5542:2: 'ditch'
            {
             before(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:5551:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5555:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSim.g:5556:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5563:1: rule__SDetailType__Group_0_1__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5567:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:5568:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:5568:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:5569:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:5570:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:5570:3: rule__SDetailType__AbstractAssignment_0_1_2
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
    // InternalSim.g:5578:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5582:1: ( rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 )
            // InternalSim.g:5583:2: rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5590:1: rule__SDetailType__Group_0_1__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5594:1: ( ( 'detail' ) )
            // InternalSim.g:5595:1: ( 'detail' )
            {
            // InternalSim.g:5595:1: ( 'detail' )
            // InternalSim.g:5596:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5605:1: rule__SDetailType__Group_0_1__4 : rule__SDetailType__Group_0_1__4__Impl ;
    public final void rule__SDetailType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5609:1: ( rule__SDetailType__Group_0_1__4__Impl )
            // InternalSim.g:5610:2: rule__SDetailType__Group_0_1__4__Impl
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
    // InternalSim.g:5616:1: rule__SDetailType__Group_0_1__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SDetailType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5620:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:5621:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:5621:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:5622:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:5623:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:5623:3: rule__SDetailType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:5632:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5636:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSim.g:5637:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
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
    // InternalSim.g:5644:1: rule__SDetailType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5648:1: ( ( () ) )
            // InternalSim.g:5649:1: ( () )
            {
            // InternalSim.g:5649:1: ( () )
            // InternalSim.g:5650:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 
            // InternalSim.g:5651:2: ()
            // InternalSim.g:5651:3: 
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
    // InternalSim.g:5659:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5663:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSim.g:5664:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
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
    // InternalSim.g:5671:1: rule__SDetailType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5675:1: ( ( 'morph' ) )
            // InternalSim.g:5676:1: ( 'morph' )
            {
            // InternalSim.g:5676:1: ( 'morph' )
            // InternalSim.g:5677:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:5686:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5690:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSim.g:5691:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5698:1: rule__SDetailType__Group_0_2__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5702:1: ( ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:5703:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:5703:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:5704:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:5705:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==51) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSim.g:5705:3: rule__SDetailType__AbstractAssignment_0_2_2
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
    // InternalSim.g:5713:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5717:1: ( rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 )
            // InternalSim.g:5718:2: rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5725:1: rule__SDetailType__Group_0_2__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5729:1: ( ( 'detail' ) )
            // InternalSim.g:5730:1: ( 'detail' )
            {
            // InternalSim.g:5730:1: ( 'detail' )
            // InternalSim.g:5731:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5740:1: rule__SDetailType__Group_0_2__4 : rule__SDetailType__Group_0_2__4__Impl ;
    public final void rule__SDetailType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5744:1: ( rule__SDetailType__Group_0_2__4__Impl )
            // InternalSim.g:5745:2: rule__SDetailType__Group_0_2__4__Impl
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
    // InternalSim.g:5751:1: rule__SDetailType__Group_0_2__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SDetailType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5755:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5756:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5756:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5757:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5758:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5758:3: rule__SDetailType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:5767:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5771:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSim.g:5772:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
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
    // InternalSim.g:5779:1: rule__SDetailType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5783:1: ( ( () ) )
            // InternalSim.g:5784:1: ( () )
            {
            // InternalSim.g:5784:1: ( () )
            // InternalSim.g:5785:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 
            // InternalSim.g:5786:2: ()
            // InternalSim.g:5786:3: 
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
    // InternalSim.g:5794:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5798:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSim.g:5799:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
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
    // InternalSim.g:5806:1: rule__SDetailType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5810:1: ( ( 'fuse' ) )
            // InternalSim.g:5811:1: ( 'fuse' )
            {
            // InternalSim.g:5811:1: ( 'fuse' )
            // InternalSim.g:5812:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5821:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5825:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSim.g:5826:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5833:1: rule__SDetailType__Group_0_3__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5837:1: ( ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:5838:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:5838:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:5839:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:5840:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSim.g:5840:3: rule__SDetailType__AbstractAssignment_0_3_2
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
    // InternalSim.g:5848:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5852:1: ( rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 )
            // InternalSim.g:5853:2: rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:5860:1: rule__SDetailType__Group_0_3__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5864:1: ( ( 'detail' ) )
            // InternalSim.g:5865:1: ( 'detail' )
            {
            // InternalSim.g:5865:1: ( 'detail' )
            // InternalSim.g:5866:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5875:1: rule__SDetailType__Group_0_3__4 : rule__SDetailType__Group_0_3__4__Impl ;
    public final void rule__SDetailType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5879:1: ( rule__SDetailType__Group_0_3__4__Impl )
            // InternalSim.g:5880:2: rule__SDetailType__Group_0_3__4__Impl
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
    // InternalSim.g:5886:1: rule__SDetailType__Group_0_3__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SDetailType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5890:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5891:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5891:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5892:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5893:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5893:3: rule__SDetailType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:5902:1: rule__SDetailType__Group_0_4__0 : rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 ;
    public final void rule__SDetailType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5906:1: ( rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 )
            // InternalSim.g:5907:2: rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1
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
    // InternalSim.g:5914:1: rule__SDetailType__Group_0_4__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SDetailType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5918:1: ( ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5919:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5919:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5920:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5921:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSim.g:5921:3: rule__SDetailType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5929:1: rule__SDetailType__Group_0_4__1 : rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 ;
    public final void rule__SDetailType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5933:1: ( rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 )
            // InternalSim.g:5934:2: rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2
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
    // InternalSim.g:5941:1: rule__SDetailType__Group_0_4__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5945:1: ( ( 'detail' ) )
            // InternalSim.g:5946:1: ( 'detail' )
            {
            // InternalSim.g:5946:1: ( 'detail' )
            // InternalSim.g:5947:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5956:1: rule__SDetailType__Group_0_4__2 : rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 ;
    public final void rule__SDetailType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5960:1: ( rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 )
            // InternalSim.g:5961:2: rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3
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
    // InternalSim.g:5968:1: rule__SDetailType__Group_0_4__2__Impl : ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SDetailType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5972:1: ( ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5973:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5973:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5974:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5975:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            // InternalSim.g:5975:3: rule__SDetailType__NameAssignment_0_4_2
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
    // InternalSim.g:5983:1: rule__SDetailType__Group_0_4__3 : rule__SDetailType__Group_0_4__3__Impl ;
    public final void rule__SDetailType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5987:1: ( rule__SDetailType__Group_0_4__3__Impl )
            // InternalSim.g:5988:2: rule__SDetailType__Group_0_4__3__Impl
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
    // InternalSim.g:5994:1: rule__SDetailType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5998:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5999:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5999:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:6000:2: ruleSComplexTypeExtends
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
    // InternalSim.g:6010:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6014:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSim.g:6015:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
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
    // InternalSim.g:6022:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6026:1: ( ( 'extends' ) )
            // InternalSim.g:6027:1: ( 'extends' )
            {
            // InternalSim.g:6027:1: ( 'extends' )
            // InternalSim.g:6028:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSim.g:6037:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6041:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSim.g:6042:2: rule__SComplexTypeExtends__Group__1__Impl
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
    // InternalSim.g:6048:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6052:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSim.g:6053:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSim.g:6053:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSim.g:6054:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSim.g:6055:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSim.g:6055:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
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
    // InternalSim.g:6064:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6068:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSim.g:6069:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
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
    // InternalSim.g:6076:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6080:1: ( ( '{' ) )
            // InternalSim.g:6081:1: ( '{' )
            {
            // InternalSim.g:6081:1: ( '{' )
            // InternalSim.g:6082:2: '{'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:6091:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6095:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSim.g:6096:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
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
    // InternalSim.g:6103:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6107:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSim.g:6108:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSim.g:6108:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSim.g:6109:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSim.g:6110:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID||LA60_0==11||(LA60_0>=13 && LA60_0<=14)||LA60_0==23||LA60_0==32||LA60_0==37||LA60_0==40||LA60_0==42||LA60_0==52) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSim.g:6110:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__SComplexTypeFeatures__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalSim.g:6118:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6122:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSim.g:6123:2: rule__SComplexTypeFeatures__Group__2__Impl
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
    // InternalSim.g:6129:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6133:1: ( ( '}' ) )
            // InternalSim.g:6134:1: ( '}' )
            {
            // InternalSim.g:6134:1: ( '}' )
            // InternalSim.g:6135:2: '}'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:6145:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6149:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSim.g:6150:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
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
    // InternalSim.g:6157:1: rule__SAssociation__Group_0__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6161:1: ( ( () ) )
            // InternalSim.g:6162:1: ( () )
            {
            // InternalSim.g:6162:1: ( () )
            // InternalSim.g:6163:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 
            // InternalSim.g:6164:2: ()
            // InternalSim.g:6164:3: 
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
    // InternalSim.g:6172:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6176:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSim.g:6177:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
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
    // InternalSim.g:6184:1: rule__SAssociation__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6188:1: ( ( 'grab' ) )
            // InternalSim.g:6189:1: ( 'grab' )
            {
            // InternalSim.g:6189:1: ( 'grab' )
            // InternalSim.g:6190:2: 'grab'
            {
             before(grammarAccess.getSAssociationAccess().getGrabKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:6199:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6203:1: ( rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 )
            // InternalSim.g:6204:2: rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3
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
    // InternalSim.g:6211:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__Alternatives_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6215:1: ( ( ( rule__SAssociation__Alternatives_0_2 ) ) )
            // InternalSim.g:6216:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            {
            // InternalSim.g:6216:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            // InternalSim.g:6217:2: ( rule__SAssociation__Alternatives_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 
            // InternalSim.g:6218:2: ( rule__SAssociation__Alternatives_0_2 )
            // InternalSim.g:6218:3: rule__SAssociation__Alternatives_0_2
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
    // InternalSim.g:6226:1: rule__SAssociation__Group_0__3 : rule__SAssociation__Group_0__3__Impl ;
    public final void rule__SAssociation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6230:1: ( rule__SAssociation__Group_0__3__Impl )
            // InternalSim.g:6231:2: rule__SAssociation__Group_0__3__Impl
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
    // InternalSim.g:6237:1: rule__SAssociation__Group_0__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAssociation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6241:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6242:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6242:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6243:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6244:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6244:3: rule__SAssociation__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6253:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6257:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSim.g:6258:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
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
    // InternalSim.g:6265:1: rule__SAssociation__Group_1__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6269:1: ( ( () ) )
            // InternalSim.g:6270:1: ( () )
            {
            // InternalSim.g:6270:1: ( () )
            // InternalSim.g:6271:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 
            // InternalSim.g:6272:2: ()
            // InternalSim.g:6272:3: 
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
    // InternalSim.g:6280:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6284:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSim.g:6285:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
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
    // InternalSim.g:6292:1: rule__SAssociation__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6296:1: ( ( 'morph' ) )
            // InternalSim.g:6297:1: ( 'morph' )
            {
            // InternalSim.g:6297:1: ( 'morph' )
            // InternalSim.g:6298:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:6307:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6311:1: ( rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 )
            // InternalSim.g:6312:2: rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3
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
    // InternalSim.g:6319:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__Alternatives_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6323:1: ( ( ( rule__SAssociation__Alternatives_1_2 ) ) )
            // InternalSim.g:6324:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            {
            // InternalSim.g:6324:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            // InternalSim.g:6325:2: ( rule__SAssociation__Alternatives_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 
            // InternalSim.g:6326:2: ( rule__SAssociation__Alternatives_1_2 )
            // InternalSim.g:6326:3: rule__SAssociation__Alternatives_1_2
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
    // InternalSim.g:6334:1: rule__SAssociation__Group_1__3 : rule__SAssociation__Group_1__3__Impl ;
    public final void rule__SAssociation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6338:1: ( rule__SAssociation__Group_1__3__Impl )
            // InternalSim.g:6339:2: rule__SAssociation__Group_1__3__Impl
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
    // InternalSim.g:6345:1: rule__SAssociation__Group_1__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAssociation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6349:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6350:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6350:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6351:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6352:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6352:3: rule__SAssociation__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6361:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6365:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSim.g:6366:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
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
    // InternalSim.g:6373:1: rule__SAssociation__Group_2__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6377:1: ( ( () ) )
            // InternalSim.g:6378:1: ( () )
            {
            // InternalSim.g:6378:1: ( () )
            // InternalSim.g:6379:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 
            // InternalSim.g:6380:2: ()
            // InternalSim.g:6380:3: 
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
    // InternalSim.g:6388:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6392:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSim.g:6393:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
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
    // InternalSim.g:6400:1: rule__SAssociation__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6404:1: ( ( 'ditch' ) )
            // InternalSim.g:6405:1: ( 'ditch' )
            {
            // InternalSim.g:6405:1: ( 'ditch' )
            // InternalSim.g:6406:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:6415:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6419:1: ( rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 )
            // InternalSim.g:6420:2: rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3
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
    // InternalSim.g:6427:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__Alternatives_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6431:1: ( ( ( rule__SAssociation__Alternatives_2_2 ) ) )
            // InternalSim.g:6432:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            {
            // InternalSim.g:6432:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            // InternalSim.g:6433:2: ( rule__SAssociation__Alternatives_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 
            // InternalSim.g:6434:2: ( rule__SAssociation__Alternatives_2_2 )
            // InternalSim.g:6434:3: rule__SAssociation__Alternatives_2_2
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
    // InternalSim.g:6442:1: rule__SAssociation__Group_2__3 : rule__SAssociation__Group_2__3__Impl ;
    public final void rule__SAssociation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6446:1: ( rule__SAssociation__Group_2__3__Impl )
            // InternalSim.g:6447:2: rule__SAssociation__Group_2__3__Impl
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
    // InternalSim.g:6453:1: rule__SAssociation__Group_2__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAssociation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6457:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6458:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6458:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6459:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6460:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6460:3: rule__SAssociation__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6469:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6473:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSim.g:6474:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
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
    // InternalSim.g:6481:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6485:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSim.g:6486:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSim.g:6486:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSim.g:6487:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSim.g:6488:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:6488:3: rule__SAssociation__DerivedAssignment_3_0
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
    // InternalSim.g:6496:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6500:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSim.g:6501:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
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
    // InternalSim.g:6508:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6512:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSim.g:6513:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSim.g:6513:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSim.g:6514:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSim.g:6515:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSim.g:6515:3: rule__SAssociation__Alternatives_3_1
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
    // InternalSim.g:6523:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6527:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSim.g:6528:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:6535:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6539:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSim.g:6540:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSim.g:6540:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSim.g:6541:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSim.g:6542:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSim.g:6542:3: rule__SAssociation__NameAssignment_3_2
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
    // InternalSim.g:6550:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6554:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSim.g:6555:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
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
    // InternalSim.g:6562:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6566:1: ( ( ':' ) )
            // InternalSim.g:6567:1: ( ':' )
            {
            // InternalSim.g:6567:1: ( ':' )
            // InternalSim.g:6568:2: ':'
            {
             before(grammarAccess.getSAssociationAccess().getColonKeyword_3_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:6577:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6581:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSim.g:6582:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:6589:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6593:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSim.g:6594:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSim.g:6594:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSim.g:6595:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSim.g:6596:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSim.g:6596:3: rule__SAssociation__TypeAssignment_3_4
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
    // InternalSim.g:6604:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6608:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSim.g:6609:2: rule__SAssociation__Group_3__5__Impl
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
    // InternalSim.g:6615:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6619:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSim.g:6620:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSim.g:6620:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSim.g:6621:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSim.g:6622:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==43) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSim.g:6622:3: rule__SAssociation__MultiplicityAssignment_3_5
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
    // InternalSim.g:6631:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6635:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSim.g:6636:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
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
    // InternalSim.g:6643:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6647:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSim.g:6648:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSim.g:6648:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSim.g:6649:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSim.g:6650:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSim.g:6650:3: rule__SAssociation__KindAssignment_3_1_1_0
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
    // InternalSim.g:6658:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6662:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSim.g:6663:2: rule__SAssociation__Group_3_1_1__1__Impl
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
    // InternalSim.g:6669:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6673:1: ( ( 'composite' ) )
            // InternalSim.g:6674:1: ( 'composite' )
            {
            // InternalSim.g:6674:1: ( 'composite' )
            // InternalSim.g:6675:2: 'composite'
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
    // InternalSim.g:6685:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6689:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSim.g:6690:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
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
    // InternalSim.g:6697:1: rule__SAttribute__Group_0__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6701:1: ( ( () ) )
            // InternalSim.g:6702:1: ( () )
            {
            // InternalSim.g:6702:1: ( () )
            // InternalSim.g:6703:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 
            // InternalSim.g:6704:2: ()
            // InternalSim.g:6704:3: 
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
    // InternalSim.g:6712:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6716:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSim.g:6717:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
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
    // InternalSim.g:6724:1: rule__SAttribute__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6728:1: ( ( 'grab' ) )
            // InternalSim.g:6729:1: ( 'grab' )
            {
            // InternalSim.g:6729:1: ( 'grab' )
            // InternalSim.g:6730:2: 'grab'
            {
             before(grammarAccess.getSAttributeAccess().getGrabKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:6739:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6743:1: ( rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 )
            // InternalSim.g:6744:2: rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3
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
    // InternalSim.g:6751:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__Alternatives_0_2 )? ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6755:1: ( ( ( rule__SAttribute__Alternatives_0_2 )? ) )
            // InternalSim.g:6756:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            {
            // InternalSim.g:6756:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            // InternalSim.g:6757:2: ( rule__SAttribute__Alternatives_0_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 
            // InternalSim.g:6758:2: ( rule__SAttribute__Alternatives_0_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==15||LA63_0==42) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:6758:3: rule__SAttribute__Alternatives_0_2
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
    // InternalSim.g:6766:1: rule__SAttribute__Group_0__3 : rule__SAttribute__Group_0__3__Impl ;
    public final void rule__SAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6770:1: ( rule__SAttribute__Group_0__3__Impl )
            // InternalSim.g:6771:2: rule__SAttribute__Group_0__3__Impl
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
    // InternalSim.g:6777:1: rule__SAttribute__Group_0__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6781:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6782:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6782:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6783:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6784:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6784:3: rule__SAttribute__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6793:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6797:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSim.g:6798:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
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
    // InternalSim.g:6805:1: rule__SAttribute__Group_1__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6809:1: ( ( () ) )
            // InternalSim.g:6810:1: ( () )
            {
            // InternalSim.g:6810:1: ( () )
            // InternalSim.g:6811:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 
            // InternalSim.g:6812:2: ()
            // InternalSim.g:6812:3: 
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
    // InternalSim.g:6820:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6824:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSim.g:6825:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
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
    // InternalSim.g:6832:1: rule__SAttribute__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6836:1: ( ( 'morph' ) )
            // InternalSim.g:6837:1: ( 'morph' )
            {
            // InternalSim.g:6837:1: ( 'morph' )
            // InternalSim.g:6838:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:6847:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6851:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSim.g:6852:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
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
    // InternalSim.g:6859:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__Alternatives_1_2 )? ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6863:1: ( ( ( rule__SAttribute__Alternatives_1_2 )? ) )
            // InternalSim.g:6864:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            {
            // InternalSim.g:6864:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            // InternalSim.g:6865:2: ( rule__SAttribute__Alternatives_1_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 
            // InternalSim.g:6866:2: ( rule__SAttribute__Alternatives_1_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==15||LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSim.g:6866:3: rule__SAttribute__Alternatives_1_2
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
    // InternalSim.g:6874:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6878:1: ( rule__SAttribute__Group_1__3__Impl )
            // InternalSim.g:6879:2: rule__SAttribute__Group_1__3__Impl
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
    // InternalSim.g:6885:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6889:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6890:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6890:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6891:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6892:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6892:3: rule__SAttribute__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6901:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6905:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSim.g:6906:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
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
    // InternalSim.g:6913:1: rule__SAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6917:1: ( ( () ) )
            // InternalSim.g:6918:1: ( () )
            {
            // InternalSim.g:6918:1: ( () )
            // InternalSim.g:6919:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 
            // InternalSim.g:6920:2: ()
            // InternalSim.g:6920:3: 
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
    // InternalSim.g:6928:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6932:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSim.g:6933:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
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
    // InternalSim.g:6940:1: rule__SAttribute__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6944:1: ( ( 'ditch' ) )
            // InternalSim.g:6945:1: ( 'ditch' )
            {
            // InternalSim.g:6945:1: ( 'ditch' )
            // InternalSim.g:6946:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:6955:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6959:1: ( rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 )
            // InternalSim.g:6960:2: rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3
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
    // InternalSim.g:6967:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__Alternatives_2_2 )? ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6971:1: ( ( ( rule__SAttribute__Alternatives_2_2 )? ) )
            // InternalSim.g:6972:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            {
            // InternalSim.g:6972:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            // InternalSim.g:6973:2: ( rule__SAttribute__Alternatives_2_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 
            // InternalSim.g:6974:2: ( rule__SAttribute__Alternatives_2_2 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==15||LA65_0==42) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:6974:3: rule__SAttribute__Alternatives_2_2
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
    // InternalSim.g:6982:1: rule__SAttribute__Group_2__3 : rule__SAttribute__Group_2__3__Impl ;
    public final void rule__SAttribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6986:1: ( rule__SAttribute__Group_2__3__Impl )
            // InternalSim.g:6987:2: rule__SAttribute__Group_2__3__Impl
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
    // InternalSim.g:6993:1: rule__SAttribute__Group_2__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAttribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6997:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6998:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6998:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6999:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:7000:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            // InternalSim.g:7000:3: rule__SAttribute__DeductionRuleAssignment_2_3
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
    // InternalSim.g:7009:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7013:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSim.g:7014:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
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
    // InternalSim.g:7021:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7025:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSim.g:7026:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSim.g:7026:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSim.g:7027:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSim.g:7028:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:7028:3: rule__SAttribute__DetailAssignment_3_0
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
    // InternalSim.g:7036:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7040:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSim.g:7041:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:7048:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7052:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSim.g:7053:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSim.g:7053:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSim.g:7054:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSim.g:7055:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSim.g:7055:3: rule__SAttribute__NameAssignment_3_1
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
    // InternalSim.g:7063:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7067:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSim.g:7068:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
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
    // InternalSim.g:7075:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7079:1: ( ( ':' ) )
            // InternalSim.g:7080:1: ( ':' )
            {
            // InternalSim.g:7080:1: ( ':' )
            // InternalSim.g:7081:2: ':'
            {
             before(grammarAccess.getSAttributeAccess().getColonKeyword_3_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:7090:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7094:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSim.g:7095:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
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
    // InternalSim.g:7102:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7106:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSim.g:7107:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSim.g:7107:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSim.g:7108:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSim.g:7109:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSim.g:7109:3: rule__SAttribute__TypeAssignment_3_3
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
    // InternalSim.g:7117:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7121:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSim.g:7122:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
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
    // InternalSim.g:7129:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7133:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSim.g:7134:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSim.g:7134:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSim.g:7135:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSim.g:7136:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==43) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSim.g:7136:3: rule__SAttribute__MultiplicityAssignment_3_4
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
    // InternalSim.g:7144:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7148:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSim.g:7149:2: rule__SAttribute__Group_3__5__Impl
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
    // InternalSim.g:7155:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7159:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSim.g:7160:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSim.g:7160:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSim.g:7161:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSim.g:7162:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==53) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:7162:3: rule__SAttribute__KeyAssignment_3_5
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
    // InternalSim.g:7171:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7175:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSim.g:7176:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:7183:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7187:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSim.g:7188:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSim.g:7188:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSim.g:7189:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSim.g:7190:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSim.g:7190:3: rule__SQuery__Alternatives_0_0
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
    // InternalSim.g:7198:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7202:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSim.g:7203:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
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
    // InternalSim.g:7210:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7214:1: ( ( '(' ) )
            // InternalSim.g:7215:1: ( '(' )
            {
            // InternalSim.g:7215:1: ( '(' )
            // InternalSim.g:7216:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:7225:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7229:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSim.g:7230:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
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
    // InternalSim.g:7237:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7241:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSim.g:7242:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSim.g:7242:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSim.g:7243:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSim.g:7244:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSim.g:7244:3: rule__SQuery__Alternatives_0_2
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
    // InternalSim.g:7252:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7256:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSim.g:7257:2: rule__SQuery__Group_0__3__Impl
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
    // InternalSim.g:7263:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7267:1: ( ( ')' ) )
            // InternalSim.g:7268:1: ( ')' )
            {
            // InternalSim.g:7268:1: ( ')' )
            // InternalSim.g:7269:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7279:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7283:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSim.g:7284:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
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
    // InternalSim.g:7291:1: rule__SQuery__Group_0_0_0__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7295:1: ( ( () ) )
            // InternalSim.g:7296:1: ( () )
            {
            // InternalSim.g:7296:1: ( () )
            // InternalSim.g:7297:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 
            // InternalSim.g:7298:2: ()
            // InternalSim.g:7298:3: 
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
    // InternalSim.g:7306:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7310:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSim.g:7311:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
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
    // InternalSim.g:7318:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7322:1: ( ( 'grab' ) )
            // InternalSim.g:7323:1: ( 'grab' )
            {
            // InternalSim.g:7323:1: ( 'grab' )
            // InternalSim.g:7324:2: 'grab'
            {
             before(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:7333:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7337:1: ( rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 )
            // InternalSim.g:7338:2: rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3
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
    // InternalSim.g:7345:1: rule__SQuery__Group_0_0_0__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7349:1: ( ( 'query' ) )
            // InternalSim.g:7350:1: ( 'query' )
            {
            // InternalSim.g:7350:1: ( 'query' )
            // InternalSim.g:7351:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7360:1: rule__SQuery__Group_0_0_0__3 : rule__SQuery__Group_0_0_0__3__Impl ;
    public final void rule__SQuery__Group_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7364:1: ( rule__SQuery__Group_0_0_0__3__Impl )
            // InternalSim.g:7365:2: rule__SQuery__Group_0_0_0__3__Impl
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
    // InternalSim.g:7371:1: rule__SQuery__Group_0_0_0__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) ;
    public final void rule__SQuery__Group_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7375:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) )
            // InternalSim.g:7376:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            {
            // InternalSim.g:7376:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            // InternalSim.g:7377:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 
            // InternalSim.g:7378:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            // InternalSim.g:7378:3: rule__SQuery__DeductionRuleAssignment_0_0_0_3
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
    // InternalSim.g:7387:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7391:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSim.g:7392:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
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
    // InternalSim.g:7399:1: rule__SQuery__Group_0_0_1__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7403:1: ( ( () ) )
            // InternalSim.g:7404:1: ( () )
            {
            // InternalSim.g:7404:1: ( () )
            // InternalSim.g:7405:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 
            // InternalSim.g:7406:2: ()
            // InternalSim.g:7406:3: 
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
    // InternalSim.g:7414:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7418:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSim.g:7419:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
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
    // InternalSim.g:7426:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7430:1: ( ( 'morph' ) )
            // InternalSim.g:7431:1: ( 'morph' )
            {
            // InternalSim.g:7431:1: ( 'morph' )
            // InternalSim.g:7432:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:7441:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7445:1: ( rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 )
            // InternalSim.g:7446:2: rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3
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
    // InternalSim.g:7453:1: rule__SQuery__Group_0_0_1__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7457:1: ( ( 'query' ) )
            // InternalSim.g:7458:1: ( 'query' )
            {
            // InternalSim.g:7458:1: ( 'query' )
            // InternalSim.g:7459:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7468:1: rule__SQuery__Group_0_0_1__3 : rule__SQuery__Group_0_0_1__3__Impl ;
    public final void rule__SQuery__Group_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7472:1: ( rule__SQuery__Group_0_0_1__3__Impl )
            // InternalSim.g:7473:2: rule__SQuery__Group_0_0_1__3__Impl
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
    // InternalSim.g:7479:1: rule__SQuery__Group_0_0_1__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) ;
    public final void rule__SQuery__Group_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7483:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) )
            // InternalSim.g:7484:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            {
            // InternalSim.g:7484:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            // InternalSim.g:7485:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 
            // InternalSim.g:7486:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            // InternalSim.g:7486:3: rule__SQuery__DeductionRuleAssignment_0_0_1_3
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
    // InternalSim.g:7495:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7499:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSim.g:7500:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
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
    // InternalSim.g:7507:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7511:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSim.g:7512:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSim.g:7512:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSim.g:7513:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSim.g:7514:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSim.g:7514:3: rule__SQuery__ParametersAssignment_0_2_1_0
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
    // InternalSim.g:7522:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7526:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSim.g:7527:2: rule__SQuery__Group_0_2_1__1__Impl
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
    // InternalSim.g:7533:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7537:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSim.g:7538:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSim.g:7538:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSim.g:7539:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSim.g:7540:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==38) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSim.g:7540:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SQuery__Group_0_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // InternalSim.g:7549:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7553:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSim.g:7554:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
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
    // InternalSim.g:7561:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7565:1: ( ( ',' ) )
            // InternalSim.g:7566:1: ( ',' )
            {
            // InternalSim.g:7566:1: ( ',' )
            // InternalSim.g:7567:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:7576:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7580:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSim.g:7581:2: rule__SQuery__Group_0_2_1_1__1__Impl
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
    // InternalSim.g:7587:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7591:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSim.g:7592:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSim.g:7592:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSim.g:7593:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSim.g:7594:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSim.g:7594:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
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
    // InternalSim.g:7603:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7607:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSim.g:7608:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
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
    // InternalSim.g:7615:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7619:1: ( ( 'ditch' ) )
            // InternalSim.g:7620:1: ( 'ditch' )
            {
            // InternalSim.g:7620:1: ( 'ditch' )
            // InternalSim.g:7621:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:7630:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7634:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSim.g:7635:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
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
    // InternalSim.g:7642:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7646:1: ( ( 'query' ) )
            // InternalSim.g:7647:1: ( 'query' )
            {
            // InternalSim.g:7647:1: ( 'query' )
            // InternalSim.g:7648:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7657:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7661:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSim.g:7662:2: rule__SQuery__Group_1__2__Impl
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
    // InternalSim.g:7668:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7672:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7673:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7673:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7674:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7675:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7675:3: rule__SQuery__DeductionRuleAssignment_1_2
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
    // InternalSim.g:7684:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7688:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSim.g:7689:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:7696:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7700:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSim.g:7701:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSim.g:7701:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSim.g:7702:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSim.g:7703:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSim.g:7703:3: rule__SQuery__NameAssignment_2_0
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
    // InternalSim.g:7711:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7715:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSim.g:7716:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
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
    // InternalSim.g:7723:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7727:1: ( ( '(' ) )
            // InternalSim.g:7728:1: ( '(' )
            {
            // InternalSim.g:7728:1: ( '(' )
            // InternalSim.g:7729:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:7738:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7742:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSim.g:7743:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
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
    // InternalSim.g:7750:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7754:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSim.g:7755:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSim.g:7755:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSim.g:7756:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSim.g:7757:2: ( rule__SQuery__Group_2_2__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||LA70_0==23||LA70_0==37||LA70_0==40) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:7757:3: rule__SQuery__Group_2_2__0
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
    // InternalSim.g:7765:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7769:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSim.g:7770:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:7777:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7781:1: ( ( ')' ) )
            // InternalSim.g:7782:1: ( ')' )
            {
            // InternalSim.g:7782:1: ( ')' )
            // InternalSim.g:7783:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7792:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7796:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSim.g:7797:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
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
    // InternalSim.g:7804:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7808:1: ( ( ':' ) )
            // InternalSim.g:7809:1: ( ':' )
            {
            // InternalSim.g:7809:1: ( ':' )
            // InternalSim.g:7810:2: ':'
            {
             before(grammarAccess.getSQueryAccess().getColonKeyword_2_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:7819:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7823:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSim.g:7824:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
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
    // InternalSim.g:7831:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7835:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSim.g:7836:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSim.g:7836:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSim.g:7837:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSim.g:7838:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSim.g:7838:3: rule__SQuery__TypeAssignment_2_5
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
    // InternalSim.g:7846:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7850:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSim.g:7851:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
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
    // InternalSim.g:7858:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7862:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSim.g:7863:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSim.g:7863:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSim.g:7864:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSim.g:7865:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==43) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSim.g:7865:3: rule__SQuery__MultiplicityAssignment_2_6
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
    // InternalSim.g:7873:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7877:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSim.g:7878:2: rule__SQuery__Group_2__7__Impl
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
    // InternalSim.g:7884:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7888:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSim.g:7889:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSim.g:7889:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSim.g:7890:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSim.g:7891:2: ( rule__SQuery__Group_2_7__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==46) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:7891:3: rule__SQuery__Group_2_7__0
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
    // InternalSim.g:7900:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7904:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSim.g:7905:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
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
    // InternalSim.g:7912:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7916:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSim.g:7917:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSim.g:7917:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSim.g:7918:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSim.g:7919:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSim.g:7919:3: rule__SQuery__ParametersAssignment_2_2_0
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
    // InternalSim.g:7927:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7931:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSim.g:7932:2: rule__SQuery__Group_2_2__1__Impl
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
    // InternalSim.g:7938:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7942:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSim.g:7943:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSim.g:7943:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSim.g:7944:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSim.g:7945:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==38) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSim.g:7945:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__SQuery__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // InternalSim.g:7954:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7958:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSim.g:7959:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
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
    // InternalSim.g:7966:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7970:1: ( ( ',' ) )
            // InternalSim.g:7971:1: ( ',' )
            {
            // InternalSim.g:7971:1: ( ',' )
            // InternalSim.g:7972:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:7981:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7985:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSim.g:7986:2: rule__SQuery__Group_2_2_1__1__Impl
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
    // InternalSim.g:7992:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7996:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSim.g:7997:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSim.g:7997:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSim.g:7998:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSim.g:7999:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSim.g:7999:3: rule__SQuery__ParametersAssignment_2_2_1_1
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
    // InternalSim.g:8008:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8012:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSim.g:8013:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
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
    // InternalSim.g:8020:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8024:1: ( ( 'returns' ) )
            // InternalSim.g:8025:1: ( 'returns' )
            {
            // InternalSim.g:8025:1: ( 'returns' )
            // InternalSim.g:8026:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:8035:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8039:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSim.g:8040:2: rule__SQuery__Group_2_7__1__Impl
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
    // InternalSim.g:8046:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8050:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSim.g:8051:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSim.g:8051:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSim.g:8052:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSim.g:8053:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSim.g:8053:3: rule__SQuery__ReturnsAssignment_2_7_1
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
    // InternalSim.g:8062:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8066:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSim.g:8067:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
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
    // InternalSim.g:8074:1: rule__SQueryParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8078:1: ( ( () ) )
            // InternalSim.g:8079:1: ( () )
            {
            // InternalSim.g:8079:1: ( () )
            // InternalSim.g:8080:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 
            // InternalSim.g:8081:2: ()
            // InternalSim.g:8081:3: 
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
    // InternalSim.g:8089:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8093:1: ( rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 )
            // InternalSim.g:8094:2: rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2
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
    // InternalSim.g:8101:1: rule__SQueryParameter__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8105:1: ( ( 'grab' ) )
            // InternalSim.g:8106:1: ( 'grab' )
            {
            // InternalSim.g:8106:1: ( 'grab' )
            // InternalSim.g:8107:2: 'grab'
            {
             before(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:8116:1: rule__SQueryParameter__Group_0__2 : rule__SQueryParameter__Group_0__2__Impl ;
    public final void rule__SQueryParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8120:1: ( rule__SQueryParameter__Group_0__2__Impl )
            // InternalSim.g:8121:2: rule__SQueryParameter__Group_0__2__Impl
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
    // InternalSim.g:8127:1: rule__SQueryParameter__Group_0__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SQueryParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8131:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:8132:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:8132:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:8133:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:8134:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            // InternalSim.g:8134:3: rule__SQueryParameter__DeductionRuleAssignment_0_2
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
    // InternalSim.g:8143:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8147:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSim.g:8148:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
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
    // InternalSim.g:8155:1: rule__SQueryParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8159:1: ( ( () ) )
            // InternalSim.g:8160:1: ( () )
            {
            // InternalSim.g:8160:1: ( () )
            // InternalSim.g:8161:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 
            // InternalSim.g:8162:2: ()
            // InternalSim.g:8162:3: 
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
    // InternalSim.g:8170:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8174:1: ( rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 )
            // InternalSim.g:8175:2: rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2
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
    // InternalSim.g:8182:1: rule__SQueryParameter__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8186:1: ( ( 'morph' ) )
            // InternalSim.g:8187:1: ( 'morph' )
            {
            // InternalSim.g:8187:1: ( 'morph' )
            // InternalSim.g:8188:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:8197:1: rule__SQueryParameter__Group_1__2 : rule__SQueryParameter__Group_1__2__Impl ;
    public final void rule__SQueryParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8201:1: ( rule__SQueryParameter__Group_1__2__Impl )
            // InternalSim.g:8202:2: rule__SQueryParameter__Group_1__2__Impl
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
    // InternalSim.g:8208:1: rule__SQueryParameter__Group_1__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQueryParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8212:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:8213:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:8213:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:8214:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:8215:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            // InternalSim.g:8215:3: rule__SQueryParameter__DeductionRuleAssignment_1_2
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
    // InternalSim.g:8224:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8228:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSim.g:8229:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
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
    // InternalSim.g:8236:1: rule__SQueryParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8240:1: ( ( () ) )
            // InternalSim.g:8241:1: ( () )
            {
            // InternalSim.g:8241:1: ( () )
            // InternalSim.g:8242:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 
            // InternalSim.g:8243:2: ()
            // InternalSim.g:8243:3: 
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
    // InternalSim.g:8251:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8255:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSim.g:8256:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
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
    // InternalSim.g:8263:1: rule__SQueryParameter__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8267:1: ( ( 'ditch' ) )
            // InternalSim.g:8268:1: ( 'ditch' )
            {
            // InternalSim.g:8268:1: ( 'ditch' )
            // InternalSim.g:8269:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:8278:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8282:1: ( rule__SQueryParameter__Group_2__2__Impl )
            // InternalSim.g:8283:2: rule__SQueryParameter__Group_2__2__Impl
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
    // InternalSim.g:8289:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8293:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) )
            // InternalSim.g:8294:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSim.g:8294:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            // InternalSim.g:8295:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSim.g:8296:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            // InternalSim.g:8296:3: rule__SQueryParameter__DeductionRuleAssignment_2_2
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
    // InternalSim.g:8305:1: rule__SQueryParameter__Group_3__0 : rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 ;
    public final void rule__SQueryParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8309:1: ( rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 )
            // InternalSim.g:8310:2: rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:8317:1: rule__SQueryParameter__Group_3__0__Impl : ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) ;
    public final void rule__SQueryParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8321:1: ( ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) )
            // InternalSim.g:8322:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            {
            // InternalSim.g:8322:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            // InternalSim.g:8323:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 
            // InternalSim.g:8324:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            // InternalSim.g:8324:3: rule__SQueryParameter__NameAssignment_3_0
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
    // InternalSim.g:8332:1: rule__SQueryParameter__Group_3__1 : rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 ;
    public final void rule__SQueryParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8336:1: ( rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 )
            // InternalSim.g:8337:2: rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2
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
    // InternalSim.g:8344:1: rule__SQueryParameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8348:1: ( ( ':' ) )
            // InternalSim.g:8349:1: ( ':' )
            {
            // InternalSim.g:8349:1: ( ':' )
            // InternalSim.g:8350:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:8359:1: rule__SQueryParameter__Group_3__2 : rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 ;
    public final void rule__SQueryParameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8363:1: ( rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 )
            // InternalSim.g:8364:2: rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:8371:1: rule__SQueryParameter__Group_3__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) ;
    public final void rule__SQueryParameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8375:1: ( ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) )
            // InternalSim.g:8376:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            {
            // InternalSim.g:8376:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            // InternalSim.g:8377:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 
            // InternalSim.g:8378:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            // InternalSim.g:8378:3: rule__SQueryParameter__TypeAssignment_3_2
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
    // InternalSim.g:8386:1: rule__SQueryParameter__Group_3__3 : rule__SQueryParameter__Group_3__3__Impl ;
    public final void rule__SQueryParameter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8390:1: ( rule__SQueryParameter__Group_3__3__Impl )
            // InternalSim.g:8391:2: rule__SQueryParameter__Group_3__3__Impl
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
    // InternalSim.g:8397:1: rule__SQueryParameter__Group_3__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) ;
    public final void rule__SQueryParameter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8401:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) )
            // InternalSim.g:8402:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            {
            // InternalSim.g:8402:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            // InternalSim.g:8403:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 
            // InternalSim.g:8404:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==43) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSim.g:8404:3: rule__SQueryParameter__MultiplicityAssignment_3_3
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
    // InternalSim.g:8413:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8417:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSim.g:8418:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
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
    // InternalSim.g:8425:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8429:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8430:1: ( ruleSQualifiedName )
            {
            // InternalSim.g:8430:1: ( ruleSQualifiedName )
            // InternalSim.g:8431:2: ruleSQualifiedName
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
    // InternalSim.g:8440:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8444:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSim.g:8445:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSim.g:8451:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8455:1: ( ( ( '.*' )? ) )
            // InternalSim.g:8456:1: ( ( '.*' )? )
            {
            // InternalSim.g:8456:1: ( ( '.*' )? )
            // InternalSim.g:8457:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSim.g:8458:2: ( '.*' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==47) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSim.g:8458:3: '.*'
                    {
                    match(input,47,FOLLOW_2); 

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
    // InternalSim.g:8467:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8471:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSim.g:8472:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
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
    // InternalSim.g:8479:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8483:1: ( ( RULE_ID ) )
            // InternalSim.g:8484:1: ( RULE_ID )
            {
            // InternalSim.g:8484:1: ( RULE_ID )
            // InternalSim.g:8485:2: RULE_ID
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
    // InternalSim.g:8494:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8498:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSim.g:8499:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSim.g:8505:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8509:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSim.g:8510:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSim.g:8510:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSim.g:8511:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSim.g:8512:2: ( rule__SQualifiedName__Group_1__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==48) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalSim.g:8512:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_59);
            	    rule__SQualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalSim.g:8521:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8525:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSim.g:8526:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
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
    // InternalSim.g:8533:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8537:1: ( ( '.' ) )
            // InternalSim.g:8538:1: ( '.' )
            {
            // InternalSim.g:8538:1: ( '.' )
            // InternalSim.g:8539:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSim.g:8548:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8552:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSim.g:8553:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSim.g:8559:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8563:1: ( ( RULE_ID ) )
            // InternalSim.g:8564:1: ( RULE_ID )
            {
            // InternalSim.g:8564:1: ( RULE_ID )
            // InternalSim.g:8565:2: RULE_ID
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
    // InternalSim.g:8575:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8579:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSim.g:8580:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
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
    // InternalSim.g:8587:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8591:1: ( ( '(' ) )
            // InternalSim.g:8592:1: ( '(' )
            {
            // InternalSim.g:8592:1: ( '(' )
            // InternalSim.g:8593:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:8602:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8606:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSim.g:8607:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
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
    // InternalSim.g:8614:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8618:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSim.g:8619:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSim.g:8619:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSim.g:8620:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSim.g:8621:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSim.g:8621:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSim.g:8629:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8633:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSim.g:8634:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
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
    // InternalSim.g:8641:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8645:1: ( ( '..' ) )
            // InternalSim.g:8646:1: ( '..' )
            {
            // InternalSim.g:8646:1: ( '..' )
            // InternalSim.g:8647:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:8656:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8660:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSim.g:8661:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
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
    // InternalSim.g:8668:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8672:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSim.g:8673:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSim.g:8673:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSim.g:8674:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSim.g:8675:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSim.g:8675:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSim.g:8683:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8687:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSim.g:8688:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSim.g:8694:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8698:1: ( ( ')' ) )
            // InternalSim.g:8699:1: ( ')' )
            {
            // InternalSim.g:8699:1: ( ')' )
            // InternalSim.g:8700:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:8710:1: rule__SInformationModel__KindAssignment_0 : ( ruleSInformationModelKind ) ;
    public final void rule__SInformationModel__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8714:1: ( ( ruleSInformationModelKind ) )
            // InternalSim.g:8715:2: ( ruleSInformationModelKind )
            {
            // InternalSim.g:8715:2: ( ruleSInformationModelKind )
            // InternalSim.g:8716:3: ruleSInformationModelKind
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
    // InternalSim.g:8725:1: rule__SInformationModel__NameAssignment_3 : ( ruleSQualifiedName ) ;
    public final void rule__SInformationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8729:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8730:2: ( ruleSQualifiedName )
            {
            // InternalSim.g:8730:2: ( ruleSQualifiedName )
            // InternalSim.g:8731:3: ruleSQualifiedName
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
    // InternalSim.g:8740:1: rule__SInformationModel__GenerateAssignment_4 : ( ( 'generate' ) ) ;
    public final void rule__SInformationModel__GenerateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8744:1: ( ( ( 'generate' ) ) )
            // InternalSim.g:8745:2: ( ( 'generate' ) )
            {
            // InternalSim.g:8745:2: ( ( 'generate' ) )
            // InternalSim.g:8746:3: ( 'generate' )
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            // InternalSim.g:8747:3: ( 'generate' )
            // InternalSim.g:8748:4: 'generate'
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:8759:1: rule__SInformationModel__ImportsAssignment_5 : ( ruleSImport ) ;
    public final void rule__SInformationModel__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8763:1: ( ( ruleSImport ) )
            // InternalSim.g:8764:2: ( ruleSImport )
            {
            // InternalSim.g:8764:2: ( ruleSImport )
            // InternalSim.g:8765:3: ruleSImport
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
    // InternalSim.g:8774:1: rule__SInformationModel__TypesAssignment_6_0 : ( ruleSType ) ;
    public final void rule__SInformationModel__TypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8778:1: ( ( ruleSType ) )
            // InternalSim.g:8779:2: ( ruleSType )
            {
            // InternalSim.g:8779:2: ( ruleSType )
            // InternalSim.g:8780:3: ruleSType
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
    // InternalSim.g:8789:1: rule__SInformationModel__AggregatesAssignment_6_1 : ( ruleSAggregate ) ;
    public final void rule__SInformationModel__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8793:1: ( ( ruleSAggregate ) )
            // InternalSim.g:8794:2: ( ruleSAggregate )
            {
            // InternalSim.g:8794:2: ( ruleSAggregate )
            // InternalSim.g:8795:3: ruleSAggregate
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


    // $ANTLR start "rule__SInformationModel__GrabDomainRulesAssignment_6_2"
    // InternalSim.g:8804:1: rule__SInformationModel__GrabDomainRulesAssignment_6_2 : ( ruleSGrabDomainRule ) ;
    public final void rule__SInformationModel__GrabDomainRulesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8808:1: ( ( ruleSGrabDomainRule ) )
            // InternalSim.g:8809:2: ( ruleSGrabDomainRule )
            {
            // InternalSim.g:8809:2: ( ruleSGrabDomainRule )
            // InternalSim.g:8810:3: ruleSGrabDomainRule
            {
             before(grammarAccess.getSInformationModelAccess().getGrabDomainRulesSGrabDomainRuleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabDomainRule();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getGrabDomainRulesSGrabDomainRuleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__GrabDomainRulesAssignment_6_2"


    // $ANTLR start "rule__SImport__ImportedNamespaceAssignment_1"
    // InternalSim.g:8819:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8823:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:8824:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:8824:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSim.g:8825:3: ruleSQualifiedNameWithWildcard
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


    // $ANTLR start "rule__SGrabDomainRule__SourceAssignment_2"
    // InternalSim.g:8834:1: rule__SGrabDomainRule__SourceAssignment_2 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabDomainRule__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8838:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8839:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8839:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8840:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_2_0()); 
            // InternalSim.g:8841:3: ( ruleSQualifiedName )
            // InternalSim.g:8842:4: ruleSQualifiedName
            {
             before(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainSQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainSQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSGrabDomainRuleAccess().getSourceDDomainCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabDomainRule__SourceAssignment_2"


    // $ANTLR start "rule__SGrabAggregateRule__SourceAssignment"
    // InternalSim.g:8853:1: rule__SGrabAggregateRule__SourceAssignment : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8857:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8858:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8858:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8859:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSim.g:8860:3: ( ruleSQualifiedName )
            // InternalSim.g:8861:4: ruleSQualifiedName
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
    // InternalSim.g:8872:1: rule__SGrabPrimitiveRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabPrimitiveRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8876:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8877:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8877:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8878:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0()); 
            // InternalSim.g:8879:3: ( ruleSQualifiedName )
            // InternalSim.g:8880:4: ruleSQualifiedName
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
    // InternalSim.g:8891:1: rule__SGrabPrimitiveRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabPrimitiveRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8895:1: ( ( RULE_ID ) )
            // InternalSim.g:8896:2: ( RULE_ID )
            {
            // InternalSim.g:8896:2: ( RULE_ID )
            // InternalSim.g:8897:3: RULE_ID
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
    // InternalSim.g:8906:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8910:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8911:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8911:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8912:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSim.g:8913:3: ( ruleSQualifiedName )
            // InternalSim.g:8914:4: ruleSQualifiedName
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
    // InternalSim.g:8925:1: rule__SGrabEnumerationRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8929:1: ( ( RULE_ID ) )
            // InternalSim.g:8930:2: ( RULE_ID )
            {
            // InternalSim.g:8930:2: ( RULE_ID )
            // InternalSim.g:8931:3: RULE_ID
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
    // InternalSim.g:8940:1: rule__SDitchEnumerationRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8944:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8945:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8945:2: ( ( RULE_ID ) )
            // InternalSim.g:8946:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8947:3: ( RULE_ID )
            // InternalSim.g:8948:4: RULE_ID
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
    // InternalSim.g:8959:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8963:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8964:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8964:2: ( ( RULE_ID ) )
            // InternalSim.g:8965:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSim.g:8966:3: ( RULE_ID )
            // InternalSim.g:8967:4: RULE_ID
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
    // InternalSim.g:8978:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8982:1: ( ( RULE_ID ) )
            // InternalSim.g:8983:2: ( RULE_ID )
            {
            // InternalSim.g:8983:2: ( RULE_ID )
            // InternalSim.g:8984:3: RULE_ID
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
    // InternalSim.g:8993:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8997:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8998:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8998:2: ( ( RULE_ID ) )
            // InternalSim.g:8999:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSim.g:9000:3: ( RULE_ID )
            // InternalSim.g:9001:4: RULE_ID
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
    // InternalSim.g:9012:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9016:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9017:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9017:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9018:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:9019:3: ( ruleSQualifiedName )
            // InternalSim.g:9020:4: ruleSQualifiedName
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
    // InternalSim.g:9031:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9035:1: ( ( RULE_ID ) )
            // InternalSim.g:9036:2: ( RULE_ID )
            {
            // InternalSim.g:9036:2: ( RULE_ID )
            // InternalSim.g:9037:3: RULE_ID
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
    // InternalSim.g:9046:1: rule__SDitchComplexTypeRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchComplexTypeRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9050:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9051:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9051:2: ( ( RULE_ID ) )
            // InternalSim.g:9052:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:9053:3: ( RULE_ID )
            // InternalSim.g:9054:4: RULE_ID
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
    // InternalSim.g:9065:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9069:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9070:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9070:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9071:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:9072:3: ( ruleSQualifiedName )
            // InternalSim.g:9073:4: ruleSQualifiedName
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
    // InternalSim.g:9084:1: rule__SMorphComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9088:1: ( ( RULE_ID ) )
            // InternalSim.g:9089:2: ( RULE_ID )
            {
            // InternalSim.g:9089:2: ( RULE_ID )
            // InternalSim.g:9090:3: RULE_ID
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
    // InternalSim.g:9099:1: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphComplexTypeRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9103:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9104:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9104:2: ( ( RULE_ID ) )
            // InternalSim.g:9105:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 
            // InternalSim.g:9106:3: ( RULE_ID )
            // InternalSim.g:9107:4: RULE_ID
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
    // InternalSim.g:9118:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9122:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9123:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9123:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9124:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:9125:3: ( ruleSQualifiedName )
            // InternalSim.g:9126:4: ruleSQualifiedName
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
    // InternalSim.g:9137:1: rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__OtherSourcesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9141:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9142:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9142:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9143:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getOtherSourcesDComplexTypeCrossReference_1_1_0()); 
            // InternalSim.g:9144:3: ( ruleSQualifiedName )
            // InternalSim.g:9145:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SFuseComplexTypeRule__RenameToAssignment_2_1"
    // InternalSim.g:9156:1: rule__SFuseComplexTypeRule__RenameToAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__SFuseComplexTypeRule__RenameToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9160:1: ( ( RULE_ID ) )
            // InternalSim.g:9161:2: ( RULE_ID )
            {
            // InternalSim.g:9161:2: ( RULE_ID )
            // InternalSim.g:9162:3: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__RenameToAssignment_2_1"


    // $ANTLR start "rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1"
    // InternalSim.g:9171:1: rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9175:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9176:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9176:2: ( ( RULE_ID ) )
            // InternalSim.g:9177:3: ( RULE_ID )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_3_1_0()); 
            // InternalSim.g:9178:3: ( RULE_ID )
            // InternalSim.g:9179:4: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__ExtendFromAssignment_3_1"


    // $ANTLR start "rule__SGrabFeatureRule__SourceAssignment_0"
    // InternalSim.g:9190:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9194:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9195:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9195:2: ( ( RULE_ID ) )
            // InternalSim.g:9196:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9197:3: ( RULE_ID )
            // InternalSim.g:9198:4: RULE_ID
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
    // InternalSim.g:9209:1: rule__SGrabFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9213:1: ( ( RULE_ID ) )
            // InternalSim.g:9214:2: ( RULE_ID )
            {
            // InternalSim.g:9214:2: ( RULE_ID )
            // InternalSim.g:9215:3: RULE_ID
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
    // InternalSim.g:9224:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9228:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9229:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9229:2: ( ( RULE_ID ) )
            // InternalSim.g:9230:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9231:3: ( RULE_ID )
            // InternalSim.g:9232:4: RULE_ID
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
    // InternalSim.g:9243:1: rule__SMorphFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9247:1: ( ( RULE_ID ) )
            // InternalSim.g:9248:2: ( RULE_ID )
            {
            // InternalSim.g:9248:2: ( RULE_ID )
            // InternalSim.g:9249:3: RULE_ID
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
    // InternalSim.g:9258:1: rule__SMorphFeatureRule__RetypeToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9262:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9263:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9263:2: ( ( RULE_ID ) )
            // InternalSim.g:9264:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0()); 
            // InternalSim.g:9265:3: ( RULE_ID )
            // InternalSim.g:9266:4: RULE_ID
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
    // InternalSim.g:9277:1: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9281:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9282:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9282:2: ( ruleSMultiplicity )
            // InternalSim.g:9283:3: ruleSMultiplicity
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
    // InternalSim.g:9292:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9296:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9297:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9297:2: ( ( RULE_ID ) )
            // InternalSim.g:9298:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSim.g:9299:3: ( RULE_ID )
            // InternalSim.g:9300:4: RULE_ID
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
    // InternalSim.g:9311:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9315:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSim.g:9316:2: ( ruleSGrabAggregateRule )
            {
            // InternalSim.g:9316:2: ( ruleSGrabAggregateRule )
            // InternalSim.g:9317:3: ruleSGrabAggregateRule
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
    // InternalSim.g:9326:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9330:1: ( ( ruleSType ) )
            // InternalSim.g:9331:2: ( ruleSType )
            {
            // InternalSim.g:9331:2: ( ruleSType )
            // InternalSim.g:9332:3: ruleSType
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
    // InternalSim.g:9341:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9345:1: ( ( RULE_ID ) )
            // InternalSim.g:9346:2: ( RULE_ID )
            {
            // InternalSim.g:9346:2: ( RULE_ID )
            // InternalSim.g:9347:3: RULE_ID
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
    // InternalSim.g:9356:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9360:1: ( ( ruleSExpression ) )
            // InternalSim.g:9361:2: ( ruleSExpression )
            {
            // InternalSim.g:9361:2: ( ruleSExpression )
            // InternalSim.g:9362:3: ruleSExpression
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
    // InternalSim.g:9371:1: rule__SPrimitive__DeductionRuleAssignment_0_0_3 : ( ruleSGrabPrimitiveRule ) ;
    public final void rule__SPrimitive__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9375:1: ( ( ruleSGrabPrimitiveRule ) )
            // InternalSim.g:9376:2: ( ruleSGrabPrimitiveRule )
            {
            // InternalSim.g:9376:2: ( ruleSGrabPrimitiveRule )
            // InternalSim.g:9377:3: ruleSGrabPrimitiveRule
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
    // InternalSim.g:9386:1: rule__SPrimitive__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9390:1: ( ( RULE_ID ) )
            // InternalSim.g:9391:2: ( RULE_ID )
            {
            // InternalSim.g:9391:2: ( RULE_ID )
            // InternalSim.g:9392:3: RULE_ID
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
    // InternalSim.g:9401:1: rule__SPrimitive__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9405:1: ( ( RULE_ID ) )
            // InternalSim.g:9406:2: ( RULE_ID )
            {
            // InternalSim.g:9406:2: ( RULE_ID )
            // InternalSim.g:9407:3: RULE_ID
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
    // InternalSim.g:9416:1: rule__SPrimitive__RedefinesAssignment_0_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9420:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9421:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9421:2: ( ( RULE_ID ) )
            // InternalSim.g:9422:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0()); 
            // InternalSim.g:9423:3: ( RULE_ID )
            // InternalSim.g:9424:4: RULE_ID
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
    // InternalSim.g:9435:1: rule__SPrimitive__ConstraintsAssignment_2 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9439:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9440:2: ( ruleSConstraint )
            {
            // InternalSim.g:9440:2: ( ruleSConstraint )
            // InternalSim.g:9441:3: ruleSConstraint
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
    // InternalSim.g:9450:1: rule__SEnumeration__DeductionRuleAssignment_0_0_3 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9454:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSim.g:9455:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSim.g:9455:2: ( ruleSGrabEnumerationRule )
            // InternalSim.g:9456:3: ruleSGrabEnumerationRule
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
    // InternalSim.g:9465:1: rule__SEnumeration__DeductionRuleAssignment_0_1_3 : ( ruleSDitchEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9469:1: ( ( ruleSDitchEnumerationRule ) )
            // InternalSim.g:9470:2: ( ruleSDitchEnumerationRule )
            {
            // InternalSim.g:9470:2: ( ruleSDitchEnumerationRule )
            // InternalSim.g:9471:3: ruleSDitchEnumerationRule
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
    // InternalSim.g:9480:1: rule__SEnumeration__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9484:1: ( ( RULE_ID ) )
            // InternalSim.g:9485:2: ( RULE_ID )
            {
            // InternalSim.g:9485:2: ( RULE_ID )
            // InternalSim.g:9486:3: RULE_ID
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
    // InternalSim.g:9495:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9499:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9500:2: ( ruleSLiteral )
            {
            // InternalSim.g:9500:2: ( ruleSLiteral )
            // InternalSim.g:9501:3: ruleSLiteral
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
    // InternalSim.g:9510:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9514:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9515:2: ( ruleSLiteral )
            {
            // InternalSim.g:9515:2: ( ruleSLiteral )
            // InternalSim.g:9516:3: ruleSLiteral
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
    // InternalSim.g:9525:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9529:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9530:2: ( ruleSConstraint )
            {
            // InternalSim.g:9530:2: ( ruleSConstraint )
            // InternalSim.g:9531:3: ruleSConstraint
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
    // InternalSim.g:9540:1: rule__SLiteral__DeductionRuleAssignment_0_2 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9544:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSim.g:9545:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSim.g:9545:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSim.g:9546:3: ruleSGrabEnumerationLiteralRule
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
    // InternalSim.g:9555:1: rule__SLiteral__DeductionRuleAssignment_1_2 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9559:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSim.g:9560:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSim.g:9560:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSim.g:9561:3: ruleSDitchEnumerationLiteralRule
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
    // InternalSim.g:9570:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9574:1: ( ( RULE_ID ) )
            // InternalSim.g:9575:2: ( RULE_ID )
            {
            // InternalSim.g:9575:2: ( RULE_ID )
            // InternalSim.g:9576:3: RULE_ID
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
    // InternalSim.g:9585:1: rule__SRootType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9589:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9590:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9590:2: ( ( 'abstract' ) )
            // InternalSim.g:9591:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9592:3: ( 'abstract' )
            // InternalSim.g:9593:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9604:1: rule__SRootType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9608:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9609:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9609:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9610:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9619:1: rule__SRootType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9623:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9624:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9624:2: ( ( 'abstract' ) )
            // InternalSim.g:9625:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9626:3: ( 'abstract' )
            // InternalSim.g:9627:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9638:1: rule__SRootType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9642:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9643:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9643:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9644:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9653:1: rule__SRootType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9657:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9658:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9658:2: ( ( 'abstract' ) )
            // InternalSim.g:9659:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9660:3: ( 'abstract' )
            // InternalSim.g:9661:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9672:1: rule__SRootType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9676:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9677:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9677:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9678:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9687:1: rule__SRootType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9691:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9692:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9692:2: ( ( 'abstract' ) )
            // InternalSim.g:9693:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9694:3: ( 'abstract' )
            // InternalSim.g:9695:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9706:1: rule__SRootType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9710:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9711:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9711:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9712:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9721:1: rule__SRootType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9725:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9726:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9726:2: ( ( 'abstract' ) )
            // InternalSim.g:9727:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9728:3: ( 'abstract' )
            // InternalSim.g:9729:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9740:1: rule__SRootType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9744:1: ( ( RULE_ID ) )
            // InternalSim.g:9745:2: ( RULE_ID )
            {
            // InternalSim.g:9745:2: ( RULE_ID )
            // InternalSim.g:9746:3: RULE_ID
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
    // InternalSim.g:9755:1: rule__SDetailType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9759:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9760:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9760:2: ( ( 'abstract' ) )
            // InternalSim.g:9761:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9762:3: ( 'abstract' )
            // InternalSim.g:9763:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9774:1: rule__SDetailType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9778:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9779:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9779:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9780:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9789:1: rule__SDetailType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9793:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9794:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9794:2: ( ( 'abstract' ) )
            // InternalSim.g:9795:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9796:3: ( 'abstract' )
            // InternalSim.g:9797:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9808:1: rule__SDetailType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9812:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9813:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9813:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9814:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9823:1: rule__SDetailType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9827:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9828:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9828:2: ( ( 'abstract' ) )
            // InternalSim.g:9829:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9830:3: ( 'abstract' )
            // InternalSim.g:9831:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9842:1: rule__SDetailType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9846:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9847:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9847:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9848:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9857:1: rule__SDetailType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9861:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9862:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9862:2: ( ( 'abstract' ) )
            // InternalSim.g:9863:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9864:3: ( 'abstract' )
            // InternalSim.g:9865:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9876:1: rule__SDetailType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9880:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9881:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9881:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9882:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9891:1: rule__SDetailType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9895:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9896:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9896:2: ( ( 'abstract' ) )
            // InternalSim.g:9897:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9898:3: ( 'abstract' )
            // InternalSim.g:9899:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9910:1: rule__SDetailType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9914:1: ( ( RULE_ID ) )
            // InternalSim.g:9915:2: ( RULE_ID )
            {
            // InternalSim.g:9915:2: ( RULE_ID )
            // InternalSim.g:9916:3: RULE_ID
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
    // InternalSim.g:9925:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9929:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9930:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9930:2: ( ( RULE_ID ) )
            // InternalSim.g:9931:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSim.g:9932:3: ( RULE_ID )
            // InternalSim.g:9933:4: RULE_ID
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
    // InternalSim.g:9944:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9948:1: ( ( ruleSFeature ) )
            // InternalSim.g:9949:2: ( ruleSFeature )
            {
            // InternalSim.g:9949:2: ( ruleSFeature )
            // InternalSim.g:9950:3: ruleSFeature
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
    // InternalSim.g:9959:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9963:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9964:2: ( ruleSConstraint )
            {
            // InternalSim.g:9964:2: ( ruleSConstraint )
            // InternalSim.g:9965:3: ruleSConstraint
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
    // InternalSim.g:9974:1: rule__SAssociation__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9978:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9979:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9979:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9980:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9989:1: rule__SAssociation__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9993:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9994:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9994:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9995:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10004:1: rule__SAssociation__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10008:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10009:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10009:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10010:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10019:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10023:1: ( ( ( 'derived' ) ) )
            // InternalSim.g:10024:2: ( ( 'derived' ) )
            {
            // InternalSim.g:10024:2: ( ( 'derived' ) )
            // InternalSim.g:10025:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSim.g:10026:3: ( 'derived' )
            // InternalSim.g:10027:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:10038:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10042:1: ( ( ruleSAssociationKind ) )
            // InternalSim.g:10043:2: ( ruleSAssociationKind )
            {
            // InternalSim.g:10043:2: ( ruleSAssociationKind )
            // InternalSim.g:10044:3: ruleSAssociationKind
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
    // InternalSim.g:10053:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10057:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSim.g:10058:2: ( ruleSAssociationKindInverse )
            {
            // InternalSim.g:10058:2: ( ruleSAssociationKindInverse )
            // InternalSim.g:10059:3: ruleSAssociationKindInverse
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
    // InternalSim.g:10068:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10072:1: ( ( RULE_ID ) )
            // InternalSim.g:10073:2: ( RULE_ID )
            {
            // InternalSim.g:10073:2: ( RULE_ID )
            // InternalSim.g:10074:3: RULE_ID
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
    // InternalSim.g:10083:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10087:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10088:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10088:2: ( ( RULE_ID ) )
            // InternalSim.g:10089:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 
            // InternalSim.g:10090:3: ( RULE_ID )
            // InternalSim.g:10091:4: RULE_ID
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
    // InternalSim.g:10102:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10106:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10107:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10107:2: ( ruleSMultiplicity )
            // InternalSim.g:10108:3: ruleSMultiplicity
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
    // InternalSim.g:10117:1: rule__SAttribute__DetailAssignment_0_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10121:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10122:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10122:2: ( ( 'detail' ) )
            // InternalSim.g:10123:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            // InternalSim.g:10124:3: ( 'detail' )
            // InternalSim.g:10125:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:10136:1: rule__SAttribute__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10140:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10141:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10141:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10142:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10151:1: rule__SAttribute__DetailAssignment_1_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10155:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10156:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10156:2: ( ( 'detail' ) )
            // InternalSim.g:10157:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            // InternalSim.g:10158:3: ( 'detail' )
            // InternalSim.g:10159:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:10170:1: rule__SAttribute__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10174:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10175:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10175:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10176:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10185:1: rule__SAttribute__DetailAssignment_2_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10189:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10190:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10190:2: ( ( 'detail' ) )
            // InternalSim.g:10191:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            // InternalSim.g:10192:3: ( 'detail' )
            // InternalSim.g:10193:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:10204:1: rule__SAttribute__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10208:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10209:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10209:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10210:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10219:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10223:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10224:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10224:2: ( ( 'detail' ) )
            // InternalSim.g:10225:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSim.g:10226:3: ( 'detail' )
            // InternalSim.g:10227:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:10238:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10242:1: ( ( RULE_ID ) )
            // InternalSim.g:10243:2: ( RULE_ID )
            {
            // InternalSim.g:10243:2: ( RULE_ID )
            // InternalSim.g:10244:3: RULE_ID
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
    // InternalSim.g:10253:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10257:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10258:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10258:2: ( ( RULE_ID ) )
            // InternalSim.g:10259:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSim.g:10260:3: ( RULE_ID )
            // InternalSim.g:10261:4: RULE_ID
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
    // InternalSim.g:10272:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10276:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10277:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10277:2: ( ruleSMultiplicity )
            // InternalSim.g:10278:3: ruleSMultiplicity
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
    // InternalSim.g:10287:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10291:1: ( ( ( 'key' ) ) )
            // InternalSim.g:10292:2: ( ( 'key' ) )
            {
            // InternalSim.g:10292:2: ( ( 'key' ) )
            // InternalSim.g:10293:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSim.g:10294:3: ( 'key' )
            // InternalSim.g:10295:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSim.g:10306:1: rule__SQuery__DeductionRuleAssignment_0_0_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10310:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10311:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10311:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10312:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10321:1: rule__SQuery__DeductionRuleAssignment_0_0_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10325:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10326:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10326:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10327:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10336:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10340:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10341:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10341:2: ( ruleSQueryParameter )
            // InternalSim.g:10342:3: ruleSQueryParameter
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
    // InternalSim.g:10351:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10355:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10356:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10356:2: ( ruleSQueryParameter )
            // InternalSim.g:10357:3: ruleSQueryParameter
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
    // InternalSim.g:10366:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10370:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10371:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10371:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10372:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10381:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10385:1: ( ( RULE_ID ) )
            // InternalSim.g:10386:2: ( RULE_ID )
            {
            // InternalSim.g:10386:2: ( RULE_ID )
            // InternalSim.g:10387:3: RULE_ID
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
    // InternalSim.g:10396:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10400:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10401:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10401:2: ( ruleSQueryParameter )
            // InternalSim.g:10402:3: ruleSQueryParameter
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
    // InternalSim.g:10411:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10415:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10416:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10416:2: ( ruleSQueryParameter )
            // InternalSim.g:10417:3: ruleSQueryParameter
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
    // InternalSim.g:10426:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10430:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10431:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10431:2: ( ( RULE_ID ) )
            // InternalSim.g:10432:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSim.g:10433:3: ( RULE_ID )
            // InternalSim.g:10434:4: RULE_ID
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
    // InternalSim.g:10445:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10449:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10450:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10450:2: ( ruleSMultiplicity )
            // InternalSim.g:10451:3: ruleSMultiplicity
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
    // InternalSim.g:10460:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10464:1: ( ( ruleSExpression ) )
            // InternalSim.g:10465:2: ( ruleSExpression )
            {
            // InternalSim.g:10465:2: ( ruleSExpression )
            // InternalSim.g:10466:3: ruleSExpression
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
    // InternalSim.g:10475:1: rule__SQueryParameter__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10479:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10480:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10480:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10481:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10490:1: rule__SQueryParameter__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10494:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10495:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10495:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10496:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10505:1: rule__SQueryParameter__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10509:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10510:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10510:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10511:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10520:1: rule__SQueryParameter__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10524:1: ( ( RULE_ID ) )
            // InternalSim.g:10525:2: ( RULE_ID )
            {
            // InternalSim.g:10525:2: ( RULE_ID )
            // InternalSim.g:10526:3: RULE_ID
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
    // InternalSim.g:10535:1: rule__SQueryParameter__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10539:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10540:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10540:2: ( ( RULE_ID ) )
            // InternalSim.g:10541:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 
            // InternalSim.g:10542:3: ( RULE_ID )
            // InternalSim.g:10543:4: RULE_ID
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
    // InternalSim.g:10554:1: rule__SQueryParameter__MultiplicityAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10558:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10559:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10559:2: ( ruleSMultiplicity )
            // InternalSim.g:10560:3: ruleSMultiplicity
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
    // InternalSim.g:10569:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10573:1: ( ( RULE_STRING ) )
            // InternalSim.g:10574:2: ( RULE_STRING )
            {
            // InternalSim.g:10574:2: ( RULE_STRING )
            // InternalSim.g:10575:3: RULE_STRING
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
    // InternalSim.g:10584:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10588:1: ( ( RULE_INT ) )
            // InternalSim.g:10589:2: ( RULE_INT )
            {
            // InternalSim.g:10589:2: ( RULE_INT )
            // InternalSim.g:10590:3: RULE_INT
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
    // InternalSim.g:10599:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10603:1: ( ( ruleMULTIPLICITY ) )
            // InternalSim.g:10604:2: ( ruleMULTIPLICITY )
            {
            // InternalSim.g:10604:2: ( ruleMULTIPLICITY )
            // InternalSim.g:10605:3: ruleMULTIPLICITY
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
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\27\1\41\1\uffff\1\44\1\uffff\3\47\2\uffff\4\47";
    static final String dfa_3s = "\2\63\1\uffff\1\63\1\uffff\2\63\1\52\2\uffff\4\52";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4\4\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\11\uffff\2\2\1\uffff\1\4\1\3\1\uffff\1\10\1\5\1\6\1\11\10\uffff\1\7",
            "\1\2\2\uffff\1\4\2\uffff\1\10\2\uffff\1\11\10\uffff\1\12",
            "",
            "\1\4\2\uffff\1\10\2\uffff\1\11\10\uffff\1\13",
            "",
            "\1\10\2\uffff\1\11\10\uffff\1\14",
            "\1\10\2\uffff\1\11\10\uffff\1\15",
            "\1\10\2\uffff\1\11",
            "",
            "",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11",
            "\1\10\2\uffff\1\11"
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
            return "1032:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000C07B600C01000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000807B600801002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000807B680800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000807B600800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002180800020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000800020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000803A000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000807B600800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010052180806820L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010052100806822L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010012000806800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000008020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000052000800020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000012000810020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000012000800020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000112000800020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000010010L});

}