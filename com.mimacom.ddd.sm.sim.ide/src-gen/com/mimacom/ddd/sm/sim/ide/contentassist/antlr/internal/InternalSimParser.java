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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'aggregate'", "'realizes'", "'realises'", "'reference'", "'composite'", "'attribute'", "'*'", "'base'", "'interface'", "'core'", "'information'", "'model'", "'import'", "'as'", "'extends'", "'='", "'and'", "':'", "'{'", "'}'", "'grab'", "'constraint'", "'primitive'", "'redefines'", "'archetype'", "'enumeration'", "'ditch'", "','", "'root'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'deduced'", "'abstract'", "'derived'", "'key'"
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

            if ( (LA1_0==26) ) {
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


    // $ANTLR start "ruleSInformationModelKind"
    // InternalSim.g:912:1: ruleSInformationModelKind : ( ( rule__SInformationModelKind__Alternatives ) ) ;
    public final void ruleSInformationModelKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:916:1: ( ( ( rule__SInformationModelKind__Alternatives ) ) )
            // InternalSim.g:917:2: ( ( rule__SInformationModelKind__Alternatives ) )
            {
            // InternalSim.g:917:2: ( ( rule__SInformationModelKind__Alternatives ) )
            // InternalSim.g:918:3: ( rule__SInformationModelKind__Alternatives )
            {
             before(grammarAccess.getSInformationModelKindAccess().getAlternatives()); 
            // InternalSim.g:919:3: ( rule__SInformationModelKind__Alternatives )
            // InternalSim.g:919:4: rule__SInformationModelKind__Alternatives
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
    // InternalSim.g:928:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:932:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSim.g:933:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSim.g:933:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSim.g:934:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSim.g:935:3: ( rule__SAssociationKind__Alternatives )
            // InternalSim.g:935:4: rule__SAssociationKind__Alternatives
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
    // InternalSim.g:944:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:948:1: ( ( ( 'inverse' ) ) )
            // InternalSim.g:949:2: ( ( 'inverse' ) )
            {
            // InternalSim.g:949:2: ( ( 'inverse' ) )
            // InternalSim.g:950:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSim.g:951:3: ( 'inverse' )
            // InternalSim.g:951:4: 'inverse'
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
    // InternalSim.g:959:1: rule__SInformationModel__Alternatives_6 : ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) );
    public final void rule__SInformationModel__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:963:1: ( ( ( rule__SInformationModel__TypesAssignment_6_0 ) ) | ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 34:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case 43:
            case 52:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==37||LA2_2==40||LA2_2==43||LA2_2==52) ) {
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
                    // InternalSim.g:964:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    {
                    // InternalSim.g:964:2: ( ( rule__SInformationModel__TypesAssignment_6_0 ) )
                    // InternalSim.g:965:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getTypesAssignment_6_0()); 
                    // InternalSim.g:966:3: ( rule__SInformationModel__TypesAssignment_6_0 )
                    // InternalSim.g:966:4: rule__SInformationModel__TypesAssignment_6_0
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
                    // InternalSim.g:970:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    {
                    // InternalSim.g:970:2: ( ( rule__SInformationModel__AggregatesAssignment_6_1 ) )
                    // InternalSim.g:971:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    {
                     before(grammarAccess.getSInformationModelAccess().getAggregatesAssignment_6_1()); 
                    // InternalSim.g:972:3: ( rule__SInformationModel__AggregatesAssignment_6_1 )
                    // InternalSim.g:972:4: rule__SInformationModel__AggregatesAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__AggregatesAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSInformationModelAccess().getAggregatesAssignment_6_1()); 

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
    // InternalSim.g:980:1: rule__SAggregate__Alternatives_1 : ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) );
    public final void rule__SAggregate__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:984:1: ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( 'aggregate' ) )
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
                    // InternalSim.g:985:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    {
                    // InternalSim.g:985:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    // InternalSim.g:986:3: ( rule__SAggregate__Group_1_0__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_0()); 
                    // InternalSim.g:987:3: ( rule__SAggregate__Group_1_0__0 )
                    // InternalSim.g:987:4: rule__SAggregate__Group_1_0__0
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
                    // InternalSim.g:991:2: ( 'aggregate' )
                    {
                    // InternalSim.g:991:2: ( 'aggregate' )
                    // InternalSim.g:992:3: 'aggregate'
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
    // InternalSim.g:1001:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1005:1: ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSim.g:1006:2: ( ruleSPrimitive )
                    {
                    // InternalSim.g:1006:2: ( ruleSPrimitive )
                    // InternalSim.g:1007:3: ruleSPrimitive
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
                    // InternalSim.g:1012:2: ( ruleSPrimitiveArchetype )
                    {
                    // InternalSim.g:1012:2: ( ruleSPrimitiveArchetype )
                    // InternalSim.g:1013:3: ruleSPrimitiveArchetype
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
                    // InternalSim.g:1018:2: ( ruleSEnumeration )
                    {
                    // InternalSim.g:1018:2: ( ruleSEnumeration )
                    // InternalSim.g:1019:3: ruleSEnumeration
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
                    // InternalSim.g:1024:2: ( ruleSRootType )
                    {
                    // InternalSim.g:1024:2: ( ruleSRootType )
                    // InternalSim.g:1025:3: ruleSRootType
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
                    // InternalSim.g:1030:2: ( ruleSDetailType )
                    {
                    // InternalSim.g:1030:2: ( ruleSDetailType )
                    // InternalSim.g:1031:3: ruleSDetailType
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
    // InternalSim.g:1040:1: rule__SPrimitive__Alternatives_2 : ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) );
    public final void rule__SPrimitive__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1044:1: ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
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
                    // InternalSim.g:1045:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    {
                    // InternalSim.g:1045:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    // InternalSim.g:1046:3: ( rule__SPrimitive__Group_2_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_0()); 
                    // InternalSim.g:1047:3: ( rule__SPrimitive__Group_2_0__0 )
                    // InternalSim.g:1047:4: rule__SPrimitive__Group_2_0__0
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
                    // InternalSim.g:1051:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    {
                    // InternalSim.g:1051:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    // InternalSim.g:1052:3: ( rule__SPrimitive__Group_2_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_1()); 
                    // InternalSim.g:1053:3: ( rule__SPrimitive__Group_2_1__0 )
                    // InternalSim.g:1053:4: rule__SPrimitive__Group_2_1__0
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
    // InternalSim.g:1061:1: rule__SPrimitive__Alternatives_2_1_0 : ( ( 'realizes' ) | ( 'realises' ) );
    public final void rule__SPrimitive__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1065:1: ( ( 'realizes' ) | ( 'realises' ) )
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
                    // InternalSim.g:1066:2: ( 'realizes' )
                    {
                    // InternalSim.g:1066:2: ( 'realizes' )
                    // InternalSim.g:1067:3: 'realizes'
                    {
                     before(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1072:2: ( 'realises' )
                    {
                    // InternalSim.g:1072:2: ( 'realises' )
                    // InternalSim.g:1073:3: 'realises'
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
    // InternalSim.g:1082:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1086:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 37:
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
                    // InternalSim.g:1087:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1087:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSim.g:1088:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSim.g:1089:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSim.g:1089:4: rule__SEnumeration__Group_0_0__0
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
                    // InternalSim.g:1093:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1093:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSim.g:1094:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSim.g:1095:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSim.g:1095:4: rule__SEnumeration__Group_0_1__0
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
                    // InternalSim.g:1099:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1099:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    // InternalSim.g:1100:3: ( rule__SEnumeration__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 
                    // InternalSim.g:1101:3: ( rule__SEnumeration__Group_0_2__0 )
                    // InternalSim.g:1101:4: rule__SEnumeration__Group_0_2__0
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
    // InternalSim.g:1109:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1113:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 38:
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
                    // InternalSim.g:1114:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSim.g:1114:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSim.g:1115:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSim.g:1116:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSim.g:1116:4: rule__SLiteral__Group_0__0
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
                    // InternalSim.g:1120:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSim.g:1120:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSim.g:1121:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSim.g:1122:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSim.g:1122:4: rule__SLiteral__Group_1__0
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
                    // InternalSim.g:1126:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSim.g:1126:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSim.g:1127:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSim.g:1128:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSim.g:1128:4: rule__SLiteral__NameAssignment_2
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
    // InternalSim.g:1136:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1140:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 40:
            case 52:
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
                    // InternalSim.g:1141:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1141:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSim.g:1142:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1143:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSim.g:1143:4: rule__SRootType__Group_0_0__0
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
                    // InternalSim.g:1147:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1147:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSim.g:1148:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1149:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSim.g:1149:4: rule__SRootType__Group_0_1__0
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
                    // InternalSim.g:1153:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1153:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    // InternalSim.g:1154:3: ( rule__SRootType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1155:3: ( rule__SRootType__Group_0_2__0 )
                    // InternalSim.g:1155:4: rule__SRootType__Group_0_2__0
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
                    // InternalSim.g:1159:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1159:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    // InternalSim.g:1160:3: ( rule__SRootType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1161:3: ( rule__SRootType__Group_0_3__0 )
                    // InternalSim.g:1161:4: rule__SRootType__Group_0_3__0
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
                    // InternalSim.g:1165:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1165:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    // InternalSim.g:1166:3: ( rule__SRootType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1167:3: ( rule__SRootType__Group_0_4__0 )
                    // InternalSim.g:1167:4: rule__SRootType__Group_0_4__0
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
    // InternalSim.g:1175:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1179:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
                {
                alt10=4;
                }
                break;
            case 43:
            case 52:
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
                    // InternalSim.g:1180:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1180:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSim.g:1181:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1182:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSim.g:1182:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSim.g:1186:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1186:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSim.g:1187:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1188:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSim.g:1188:4: rule__SDetailType__Group_0_1__0
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
                    // InternalSim.g:1192:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1192:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSim.g:1193:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1194:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSim.g:1194:4: rule__SDetailType__Group_0_2__0
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
                    // InternalSim.g:1198:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1198:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSim.g:1199:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1200:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSim.g:1200:4: rule__SDetailType__Group_0_3__0
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
                    // InternalSim.g:1204:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1204:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    // InternalSim.g:1205:3: ( rule__SDetailType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1206:3: ( rule__SDetailType__Group_0_4__0 )
                    // InternalSim.g:1206:4: rule__SDetailType__Group_0_4__0
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
    // InternalSim.g:1214:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1218:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==11||(LA11_0>=15 && LA11_0<=16)||LA11_0==32||LA11_0==38||LA11_0==41||LA11_0==43||LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSim.g:1219:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSim.g:1219:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSim.g:1220:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSim.g:1221:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSim.g:1221:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
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
                    // InternalSim.g:1225:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSim.g:1225:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSim.g:1226:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSim.g:1227:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSim.g:1227:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
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
    // InternalSim.g:1235:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1239:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case 46:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_ID:
                case 17:
                case 43:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                switch ( input.LA(2) ) {
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_ID:
                case 17:
                case 43:
                    {
                    alt12=2;
                    }
                    break;
                case 46:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 17:
                case 43:
                    {
                    alt12=2;
                    }
                    break;
                case 46:
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
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }

                }
                break;
            case 11:
            case 15:
            case 16:
            case 53:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                int LA12_6 = input.LA(2);

                if ( (LA12_6==44) ) {
                    alt12=3;
                }
                else if ( (LA12_6==29) ) {
                    alt12=2;
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
                    // InternalSim.g:1240:2: ( ruleSAssociation )
                    {
                    // InternalSim.g:1240:2: ( ruleSAssociation )
                    // InternalSim.g:1241:3: ruleSAssociation
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
                    // InternalSim.g:1246:2: ( ruleSAttribute )
                    {
                    // InternalSim.g:1246:2: ( ruleSAttribute )
                    // InternalSim.g:1247:3: ruleSAttribute
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
                    // InternalSim.g:1252:2: ( ruleSQuery )
                    {
                    // InternalSim.g:1252:2: ( ruleSQuery )
                    // InternalSim.g:1253:3: ruleSQuery
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
    // InternalSim.g:1262:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1266:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 41:
                {
                alt13=2;
                }
                break;
            case 38:
                {
                alt13=3;
                }
                break;
            case 11:
            case 15:
            case 16:
            case 53:
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
                    // InternalSim.g:1267:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSim.g:1267:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSim.g:1268:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSim.g:1269:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSim.g:1269:4: rule__SAssociation__Group_0__0
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
                    // InternalSim.g:1273:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSim.g:1273:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSim.g:1274:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSim.g:1275:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSim.g:1275:4: rule__SAssociation__Group_1__0
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
                    // InternalSim.g:1279:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSim.g:1279:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSim.g:1280:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSim.g:1281:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSim.g:1281:4: rule__SAssociation__Group_2__0
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
                    // InternalSim.g:1285:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSim.g:1285:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSim.g:1286:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSim.g:1287:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSim.g:1287:4: rule__SAssociation__Group_3__0
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
    // InternalSim.g:1295:1: rule__SAssociation__Alternatives_0_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1299:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1300:2: ( 'reference' )
                    {
                    // InternalSim.g:1300:2: ( 'reference' )
                    // InternalSim.g:1301:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1306:2: ( 'composite' )
                    {
                    // InternalSim.g:1306:2: ( 'composite' )
                    // InternalSim.g:1307:3: 'composite'
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
    // InternalSim.g:1316:1: rule__SAssociation__Alternatives_1_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1320:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1321:2: ( 'reference' )
                    {
                    // InternalSim.g:1321:2: ( 'reference' )
                    // InternalSim.g:1322:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1327:2: ( 'composite' )
                    {
                    // InternalSim.g:1327:2: ( 'composite' )
                    // InternalSim.g:1328:3: 'composite'
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
    // InternalSim.g:1337:1: rule__SAssociation__Alternatives_2_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1341:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1342:2: ( 'reference' )
                    {
                    // InternalSim.g:1342:2: ( 'reference' )
                    // InternalSim.g:1343:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1348:2: ( 'composite' )
                    {
                    // InternalSim.g:1348:2: ( 'composite' )
                    // InternalSim.g:1349:3: 'composite'
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
    // InternalSim.g:1358:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1362:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
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
                    // InternalSim.g:1363:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSim.g:1363:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSim.g:1364:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSim.g:1365:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSim.g:1365:4: rule__SAssociation__KindAssignment_3_1_0
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
                    // InternalSim.g:1369:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSim.g:1369:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSim.g:1370:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSim.g:1371:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSim.g:1371:4: rule__SAssociation__Group_3_1_1__0
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
    // InternalSim.g:1379:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1383:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case RULE_ID:
            case 43:
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
                    // InternalSim.g:1384:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSim.g:1384:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSim.g:1385:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSim.g:1386:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSim.g:1386:4: rule__SAttribute__Group_0__0
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
                    // InternalSim.g:1390:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSim.g:1390:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSim.g:1391:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSim.g:1392:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSim.g:1392:4: rule__SAttribute__Group_1__0
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
                    // InternalSim.g:1396:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSim.g:1396:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSim.g:1397:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSim.g:1398:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSim.g:1398:4: rule__SAttribute__Group_2__0
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
                    // InternalSim.g:1402:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSim.g:1402:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSim.g:1403:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSim.g:1404:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSim.g:1404:4: rule__SAttribute__Group_3__0
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
    // InternalSim.g:1412:1: rule__SAttribute__Alternatives_0_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1416:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSim.g:1417:2: ( 'attribute' )
                    {
                    // InternalSim.g:1417:2: ( 'attribute' )
                    // InternalSim.g:1418:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1423:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    {
                    // InternalSim.g:1423:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    // InternalSim.g:1424:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 
                    // InternalSim.g:1425:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    // InternalSim.g:1425:4: rule__SAttribute__DetailAssignment_0_2_1
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
    // InternalSim.g:1433:1: rule__SAttribute__Alternatives_1_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1437:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            else if ( (LA20_0==43) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSim.g:1438:2: ( 'attribute' )
                    {
                    // InternalSim.g:1438:2: ( 'attribute' )
                    // InternalSim.g:1439:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1444:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    {
                    // InternalSim.g:1444:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    // InternalSim.g:1445:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 
                    // InternalSim.g:1446:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    // InternalSim.g:1446:4: rule__SAttribute__DetailAssignment_1_2_1
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
    // InternalSim.g:1454:1: rule__SAttribute__Alternatives_2_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1458:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSim.g:1459:2: ( 'attribute' )
                    {
                    // InternalSim.g:1459:2: ( 'attribute' )
                    // InternalSim.g:1460:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1465:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    {
                    // InternalSim.g:1465:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    // InternalSim.g:1466:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 
                    // InternalSim.g:1467:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    // InternalSim.g:1467:4: rule__SAttribute__DetailAssignment_2_2_1
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
    // InternalSim.g:1475:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1479:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 32:
            case 41:
                {
                alt22=1;
                }
                break;
            case 38:
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
                    // InternalSim.g:1480:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSim.g:1480:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSim.g:1481:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSim.g:1482:3: ( rule__SQuery__Group_0__0 )
                    // InternalSim.g:1482:4: rule__SQuery__Group_0__0
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
                    // InternalSim.g:1486:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSim.g:1486:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSim.g:1487:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSim.g:1488:3: ( rule__SQuery__Group_1__0 )
                    // InternalSim.g:1488:4: rule__SQuery__Group_1__0
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
                    // InternalSim.g:1492:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSim.g:1492:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSim.g:1493:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSim.g:1494:3: ( rule__SQuery__Group_2__0 )
                    // InternalSim.g:1494:4: rule__SQuery__Group_2__0
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
    // InternalSim.g:1502:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1506:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalSim.g:1507:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSim.g:1507:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSim.g:1508:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSim.g:1509:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSim.g:1509:4: rule__SQuery__Group_0_0_0__0
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
                    // InternalSim.g:1513:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSim.g:1513:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSim.g:1514:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSim.g:1515:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSim.g:1515:4: rule__SQuery__Group_0_0_1__0
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
    // InternalSim.g:1523:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1527:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID||LA25_0==32||LA25_0==38||LA25_0==41||LA25_0==45) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSim.g:1528:2: ( '*' )
                    {
                    // InternalSim.g:1528:2: ( '*' )
                    // InternalSim.g:1529:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1534:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSim.g:1534:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSim.g:1535:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSim.g:1536:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID||LA24_0==32||LA24_0==38||LA24_0==41) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalSim.g:1536:4: rule__SQuery__Group_0_2_1__0
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
    // InternalSim.g:1544:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1548:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 38:
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
                    // InternalSim.g:1549:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSim.g:1549:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSim.g:1550:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSim.g:1551:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSim.g:1551:4: rule__SQueryParameter__Group_0__0
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
                    // InternalSim.g:1555:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSim.g:1555:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSim.g:1556:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSim.g:1557:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSim.g:1557:4: rule__SQueryParameter__Group_1__0
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
                    // InternalSim.g:1561:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSim.g:1561:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSim.g:1562:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSim.g:1563:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSim.g:1563:4: rule__SQueryParameter__Group_2__0
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
                    // InternalSim.g:1567:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    {
                    // InternalSim.g:1567:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    // InternalSim.g:1568:3: ( rule__SQueryParameter__Group_3__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_3()); 
                    // InternalSim.g:1569:3: ( rule__SQueryParameter__Group_3__0 )
                    // InternalSim.g:1569:4: rule__SQueryParameter__Group_3__0
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
    // InternalSim.g:1577:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1581:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalSim.g:1582:2: ( RULE_INT )
                    {
                    // InternalSim.g:1582:2: ( RULE_INT )
                    // InternalSim.g:1583:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1588:2: ( '*' )
                    {
                    // InternalSim.g:1588:2: ( '*' )
                    // InternalSim.g:1589:3: '*'
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


    // $ANTLR start "rule__SInformationModelKind__Alternatives"
    // InternalSim.g:1598:1: rule__SInformationModelKind__Alternatives : ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) );
    public final void rule__SInformationModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1602:1: ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt28=1;
                }
                break;
            case 20:
                {
                alt28=2;
                }
                break;
            case 21:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalSim.g:1603:2: ( ( 'base' ) )
                    {
                    // InternalSim.g:1603:2: ( ( 'base' ) )
                    // InternalSim.g:1604:3: ( 'base' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1605:3: ( 'base' )
                    // InternalSim.g:1605:4: 'base'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1609:2: ( ( 'interface' ) )
                    {
                    // InternalSim.g:1609:2: ( ( 'interface' ) )
                    // InternalSim.g:1610:3: ( 'interface' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1611:3: ( 'interface' )
                    // InternalSim.g:1611:4: 'interface'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1615:2: ( ( 'core' ) )
                    {
                    // InternalSim.g:1615:2: ( ( 'core' ) )
                    // InternalSim.g:1616:3: ( 'core' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2()); 
                    // InternalSim.g:1617:3: ( 'core' )
                    // InternalSim.g:1617:4: 'core'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalSim.g:1625:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1629:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                alt29=1;
            }
            else if ( (LA29_0==16) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalSim.g:1630:2: ( ( 'reference' ) )
                    {
                    // InternalSim.g:1630:2: ( ( 'reference' ) )
                    // InternalSim.g:1631:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1632:3: ( 'reference' )
                    // InternalSim.g:1632:4: 'reference'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1636:2: ( ( 'composite' ) )
                    {
                    // InternalSim.g:1636:2: ( ( 'composite' ) )
                    // InternalSim.g:1637:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1638:3: ( 'composite' )
                    // InternalSim.g:1638:4: 'composite'
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


    // $ANTLR start "rule__SInformationModel__Group__0"
    // InternalSim.g:1646:1: rule__SInformationModel__Group__0 : rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 ;
    public final void rule__SInformationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1650:1: ( rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 )
            // InternalSim.g:1651:2: rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1
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
    // InternalSim.g:1658:1: rule__SInformationModel__Group__0__Impl : ( ( rule__SInformationModel__DeducedAssignment_0 )? ) ;
    public final void rule__SInformationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1662:1: ( ( ( rule__SInformationModel__DeducedAssignment_0 )? ) )
            // InternalSim.g:1663:1: ( ( rule__SInformationModel__DeducedAssignment_0 )? )
            {
            // InternalSim.g:1663:1: ( ( rule__SInformationModel__DeducedAssignment_0 )? )
            // InternalSim.g:1664:2: ( rule__SInformationModel__DeducedAssignment_0 )?
            {
             before(grammarAccess.getSInformationModelAccess().getDeducedAssignment_0()); 
            // InternalSim.g:1665:2: ( rule__SInformationModel__DeducedAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSim.g:1665:3: rule__SInformationModel__DeducedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SInformationModel__DeducedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSInformationModelAccess().getDeducedAssignment_0()); 

            }


            }

        }
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
    // InternalSim.g:1673:1: rule__SInformationModel__Group__1 : rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 ;
    public final void rule__SInformationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1677:1: ( rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 )
            // InternalSim.g:1678:2: rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2
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
    // InternalSim.g:1685:1: rule__SInformationModel__Group__1__Impl : ( ( rule__SInformationModel__KindAssignment_1 ) ) ;
    public final void rule__SInformationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1689:1: ( ( ( rule__SInformationModel__KindAssignment_1 ) ) )
            // InternalSim.g:1690:1: ( ( rule__SInformationModel__KindAssignment_1 ) )
            {
            // InternalSim.g:1690:1: ( ( rule__SInformationModel__KindAssignment_1 ) )
            // InternalSim.g:1691:2: ( rule__SInformationModel__KindAssignment_1 )
            {
             before(grammarAccess.getSInformationModelAccess().getKindAssignment_1()); 
            // InternalSim.g:1692:2: ( rule__SInformationModel__KindAssignment_1 )
            // InternalSim.g:1692:3: rule__SInformationModel__KindAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelAccess().getKindAssignment_1()); 

            }


            }

        }
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
    // InternalSim.g:1700:1: rule__SInformationModel__Group__2 : rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 ;
    public final void rule__SInformationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1704:1: ( rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 )
            // InternalSim.g:1705:2: rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3
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
    // InternalSim.g:1712:1: rule__SInformationModel__Group__2__Impl : ( 'information' ) ;
    public final void rule__SInformationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1716:1: ( ( 'information' ) )
            // InternalSim.g:1717:1: ( 'information' )
            {
            // InternalSim.g:1717:1: ( 'information' )
            // InternalSim.g:1718:2: 'information'
            {
             before(grammarAccess.getSInformationModelAccess().getInformationKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getInformationKeyword_2()); 

            }


            }

        }
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
    // InternalSim.g:1727:1: rule__SInformationModel__Group__3 : rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 ;
    public final void rule__SInformationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1731:1: ( rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 )
            // InternalSim.g:1732:2: rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4
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
    // InternalSim.g:1739:1: rule__SInformationModel__Group__3__Impl : ( 'model' ) ;
    public final void rule__SInformationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1743:1: ( ( 'model' ) )
            // InternalSim.g:1744:1: ( 'model' )
            {
            // InternalSim.g:1744:1: ( 'model' )
            // InternalSim.g:1745:2: 'model'
            {
             before(grammarAccess.getSInformationModelAccess().getModelKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getModelKeyword_3()); 

            }


            }

        }
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
    // InternalSim.g:1754:1: rule__SInformationModel__Group__4 : rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 ;
    public final void rule__SInformationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1758:1: ( rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 )
            // InternalSim.g:1759:2: rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalSim.g:1766:1: rule__SInformationModel__Group__4__Impl : ( ( rule__SInformationModel__NameAssignment_4 ) ) ;
    public final void rule__SInformationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1770:1: ( ( ( rule__SInformationModel__NameAssignment_4 ) ) )
            // InternalSim.g:1771:1: ( ( rule__SInformationModel__NameAssignment_4 ) )
            {
            // InternalSim.g:1771:1: ( ( rule__SInformationModel__NameAssignment_4 ) )
            // InternalSim.g:1772:2: ( rule__SInformationModel__NameAssignment_4 )
            {
             before(grammarAccess.getSInformationModelAccess().getNameAssignment_4()); 
            // InternalSim.g:1773:2: ( rule__SInformationModel__NameAssignment_4 )
            // InternalSim.g:1773:3: rule__SInformationModel__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SInformationModel__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSInformationModelAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // InternalSim.g:1781:1: rule__SInformationModel__Group__5 : rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 ;
    public final void rule__SInformationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1785:1: ( rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 )
            // InternalSim.g:1786:2: rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalSim.g:1793:1: rule__SInformationModel__Group__5__Impl : ( ( rule__SInformationModel__ImportsAssignment_5 )* ) ;
    public final void rule__SInformationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1797:1: ( ( ( rule__SInformationModel__ImportsAssignment_5 )* ) )
            // InternalSim.g:1798:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            {
            // InternalSim.g:1798:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            // InternalSim.g:1799:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            {
             before(grammarAccess.getSInformationModelAccess().getImportsAssignment_5()); 
            // InternalSim.g:1800:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSim.g:1800:3: rule__SInformationModel__ImportsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SInformationModel__ImportsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalSim.g:1808:1: rule__SInformationModel__Group__6 : rule__SInformationModel__Group__6__Impl ;
    public final void rule__SInformationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1812:1: ( rule__SInformationModel__Group__6__Impl )
            // InternalSim.g:1813:2: rule__SInformationModel__Group__6__Impl
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
    // InternalSim.g:1819:1: rule__SInformationModel__Group__6__Impl : ( ( rule__SInformationModel__Alternatives_6 )* ) ;
    public final void rule__SInformationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1823:1: ( ( ( rule__SInformationModel__Alternatives_6 )* ) )
            // InternalSim.g:1824:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            {
            // InternalSim.g:1824:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            // InternalSim.g:1825:2: ( rule__SInformationModel__Alternatives_6 )*
            {
             before(grammarAccess.getSInformationModelAccess().getAlternatives_6()); 
            // InternalSim.g:1826:2: ( rule__SInformationModel__Alternatives_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==12||LA32_0==32||LA32_0==34||(LA32_0>=36 && LA32_0<=38)||(LA32_0>=40 && LA32_0<=43)||LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSim.g:1826:3: rule__SInformationModel__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SInformationModel__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSim.g:1835:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1839:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSim.g:1840:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:1847:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1851:1: ( ( 'import' ) )
            // InternalSim.g:1852:1: ( 'import' )
            {
            // InternalSim.g:1852:1: ( 'import' )
            // InternalSim.g:1853:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSim.g:1862:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1866:1: ( rule__SImport__Group__1__Impl )
            // InternalSim.g:1867:2: rule__SImport__Group__1__Impl
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
    // InternalSim.g:1873:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1877:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSim.g:1878:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSim.g:1878:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSim.g:1879:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSim.g:1880:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSim.g:1880:3: rule__SImport__ImportedNamespaceAssignment_1
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
    // InternalSim.g:1889:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1893:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSim.g:1894:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
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
    // InternalSim.g:1901:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1905:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1906:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1906:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSim.g:1907:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1908:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSim.g:1908:3: rule__SGrabEnumerationRule__SourceAssignment_0
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
    // InternalSim.g:1916:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1920:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSim.g:1921:2: rule__SGrabEnumerationRule__Group__1__Impl
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
    // InternalSim.g:1927:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1931:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSim.g:1932:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSim.g:1932:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSim.g:1933:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSim.g:1934:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSim.g:1934:3: rule__SGrabEnumerationRule__Group_1__0
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
    // InternalSim.g:1943:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1947:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSim.g:1948:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:1955:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1959:1: ( ( 'as' ) )
            // InternalSim.g:1960:1: ( 'as' )
            {
            // InternalSim.g:1960:1: ( 'as' )
            // InternalSim.g:1961:2: 'as'
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
    // InternalSim.g:1970:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1974:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl )
            // InternalSim.g:1975:2: rule__SGrabEnumerationRule__Group_1__1__Impl
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
    // InternalSim.g:1981:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1985:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:1986:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:1986:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:1987:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:1988:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            // InternalSim.g:1988:3: rule__SGrabEnumerationRule__RenameToAssignment_1_1
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
    // InternalSim.g:1997:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2001:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSim.g:2002:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
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
    // InternalSim.g:2009:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2013:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2014:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2014:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSim.g:2015:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2016:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSim.g:2016:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
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
    // InternalSim.g:2024:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2028:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSim.g:2029:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
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
    // InternalSim.g:2035:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2039:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSim.g:2040:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSim.g:2040:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSim.g:2041:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSim.g:2042:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:2042:3: rule__SGrabEnumerationLiteralRule__Group_1__0
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
    // InternalSim.g:2051:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2055:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSim.g:2056:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2063:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2067:1: ( ( 'as' ) )
            // InternalSim.g:2068:1: ( 'as' )
            {
            // InternalSim.g:2068:1: ( 'as' )
            // InternalSim.g:2069:2: 'as'
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
    // InternalSim.g:2078:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2082:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl )
            // InternalSim.g:2083:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl
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
    // InternalSim.g:2089:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2093:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2094:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2094:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2095:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2096:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            // InternalSim.g:2096:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1
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
    // InternalSim.g:2105:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2109:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSim.g:2110:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
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
    // InternalSim.g:2117:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2121:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2122:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2122:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2123:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2124:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2124:3: rule__SGrabComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2132:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2136:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2137:2: rule__SGrabComplexTypeRule__Group__1__Impl
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
    // InternalSim.g:2143:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2147:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2148:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2148:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2149:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2150:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2150:3: rule__SGrabComplexTypeRule__Group_1__0
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
    // InternalSim.g:2159:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2163:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSim.g:2164:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2171:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2175:1: ( ( 'as' ) )
            // InternalSim.g:2176:1: ( 'as' )
            {
            // InternalSim.g:2176:1: ( 'as' )
            // InternalSim.g:2177:2: 'as'
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
    // InternalSim.g:2186:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2190:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2191:2: rule__SGrabComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2197:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2201:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2202:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2202:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2203:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2204:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2204:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2213:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2217:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSim.g:2218:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
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
    // InternalSim.g:2225:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2229:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2230:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2230:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2231:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2232:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2232:3: rule__SMorphComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2240:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2244:1: ( rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 )
            // InternalSim.g:2245:2: rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2
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
    // InternalSim.g:2252:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2256:1: ( ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2257:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2257:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2258:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2259:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:2259:3: rule__SMorphComplexTypeRule__Group_1__0
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
    // InternalSim.g:2267:1: rule__SMorphComplexTypeRule__Group__2 : rule__SMorphComplexTypeRule__Group__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2271:1: ( rule__SMorphComplexTypeRule__Group__2__Impl )
            // InternalSim.g:2272:2: rule__SMorphComplexTypeRule__Group__2__Impl
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
    // InternalSim.g:2278:1: rule__SMorphComplexTypeRule__Group__2__Impl : ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2282:1: ( ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) )
            // InternalSim.g:2283:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            {
            // InternalSim.g:2283:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            // InternalSim.g:2284:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 
            // InternalSim.g:2285:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:2285:3: rule__SMorphComplexTypeRule__Group_2__0
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
    // InternalSim.g:2294:1: rule__SMorphComplexTypeRule__Group_1__0 : rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 ;
    public final void rule__SMorphComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2298:1: ( rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 )
            // InternalSim.g:2299:2: rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2306:1: rule__SMorphComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2310:1: ( ( 'as' ) )
            // InternalSim.g:2311:1: ( 'as' )
            {
            // InternalSim.g:2311:1: ( 'as' )
            // InternalSim.g:2312:2: 'as'
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
    // InternalSim.g:2321:1: rule__SMorphComplexTypeRule__Group_1__1 : rule__SMorphComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2325:1: ( rule__SMorphComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2326:2: rule__SMorphComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2332:1: rule__SMorphComplexTypeRule__Group_1__1__Impl : ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2336:1: ( ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2337:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2337:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2338:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2339:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2339:3: rule__SMorphComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2348:1: rule__SMorphComplexTypeRule__Group_2__0 : rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 ;
    public final void rule__SMorphComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2352:1: ( rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 )
            // InternalSim.g:2353:2: rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1
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
    // InternalSim.g:2360:1: rule__SMorphComplexTypeRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2364:1: ( ( 'extends' ) )
            // InternalSim.g:2365:1: ( 'extends' )
            {
            // InternalSim.g:2365:1: ( 'extends' )
            // InternalSim.g:2366:2: 'extends'
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
    // InternalSim.g:2375:1: rule__SMorphComplexTypeRule__Group_2__1 : rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 ;
    public final void rule__SMorphComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2379:1: ( rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 )
            // InternalSim.g:2380:2: rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2387:1: rule__SMorphComplexTypeRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2391:1: ( ( '=' ) )
            // InternalSim.g:2392:1: ( '=' )
            {
            // InternalSim.g:2392:1: ( '=' )
            // InternalSim.g:2393:2: '='
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
    // InternalSim.g:2402:1: rule__SMorphComplexTypeRule__Group_2__2 : rule__SMorphComplexTypeRule__Group_2__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2406:1: ( rule__SMorphComplexTypeRule__Group_2__2__Impl )
            // InternalSim.g:2407:2: rule__SMorphComplexTypeRule__Group_2__2__Impl
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
    // InternalSim.g:2413:1: rule__SMorphComplexTypeRule__Group_2__2__Impl : ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2417:1: ( ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) )
            // InternalSim.g:2418:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSim.g:2418:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            // InternalSim.g:2419:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSim.g:2420:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            // InternalSim.g:2420:3: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2
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
    // InternalSim.g:2429:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2433:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSim.g:2434:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
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
    // InternalSim.g:2441:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2445:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2446:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2446:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2447:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2448:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2448:3: rule__SFuseComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2456:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2460:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSim.g:2461:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2468:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2472:1: ( ( 'and' ) )
            // InternalSim.g:2473:1: ( 'and' )
            {
            // InternalSim.g:2473:1: ( 'and' )
            // InternalSim.g:2474:2: 'and'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSim.g:2483:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2487:1: ( rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 )
            // InternalSim.g:2488:2: rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3
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
    // InternalSim.g:2495:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2499:1: ( ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) )
            // InternalSim.g:2500:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            {
            // InternalSim.g:2500:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            // InternalSim.g:2501:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2Assignment_2()); 
            // InternalSim.g:2502:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            // InternalSim.g:2502:3: rule__SFuseComplexTypeRule__Source2Assignment_2
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
    // InternalSim.g:2510:1: rule__SFuseComplexTypeRule__Group__3 : rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 ;
    public final void rule__SFuseComplexTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2514:1: ( rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 )
            // InternalSim.g:2515:2: rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2522:1: rule__SFuseComplexTypeRule__Group__3__Impl : ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2526:1: ( ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) )
            // InternalSim.g:2527:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            {
            // InternalSim.g:2527:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            // InternalSim.g:2528:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 
            // InternalSim.g:2529:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSim.g:2529:3: rule__SFuseComplexTypeRule__Group_3__0
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
    // InternalSim.g:2537:1: rule__SFuseComplexTypeRule__Group__4 : rule__SFuseComplexTypeRule__Group__4__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2541:1: ( rule__SFuseComplexTypeRule__Group__4__Impl )
            // InternalSim.g:2542:2: rule__SFuseComplexTypeRule__Group__4__Impl
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
    // InternalSim.g:2548:1: rule__SFuseComplexTypeRule__Group__4__Impl : ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2552:1: ( ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) )
            // InternalSim.g:2553:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            {
            // InternalSim.g:2553:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            // InternalSim.g:2554:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_4()); 
            // InternalSim.g:2555:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSim.g:2555:3: rule__SFuseComplexTypeRule__Group_4__0
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
    // InternalSim.g:2564:1: rule__SFuseComplexTypeRule__Group_3__0 : rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 ;
    public final void rule__SFuseComplexTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2568:1: ( rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 )
            // InternalSim.g:2569:2: rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2576:1: rule__SFuseComplexTypeRule__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2580:1: ( ( 'as' ) )
            // InternalSim.g:2581:1: ( 'as' )
            {
            // InternalSim.g:2581:1: ( 'as' )
            // InternalSim.g:2582:2: 'as'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2591:1: rule__SFuseComplexTypeRule__Group_3__1 : rule__SFuseComplexTypeRule__Group_3__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2595:1: ( rule__SFuseComplexTypeRule__Group_3__1__Impl )
            // InternalSim.g:2596:2: rule__SFuseComplexTypeRule__Group_3__1__Impl
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
    // InternalSim.g:2602:1: rule__SFuseComplexTypeRule__Group_3__1__Impl : ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2606:1: ( ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) )
            // InternalSim.g:2607:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            {
            // InternalSim.g:2607:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            // InternalSim.g:2608:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_1()); 
            // InternalSim.g:2609:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            // InternalSim.g:2609:3: rule__SFuseComplexTypeRule__RenameToAssignment_3_1
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
    // InternalSim.g:2618:1: rule__SFuseComplexTypeRule__Group_4__0 : rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 ;
    public final void rule__SFuseComplexTypeRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2622:1: ( rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 )
            // InternalSim.g:2623:2: rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2630:1: rule__SFuseComplexTypeRule__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2634:1: ( ( 'extends' ) )
            // InternalSim.g:2635:1: ( 'extends' )
            {
            // InternalSim.g:2635:1: ( 'extends' )
            // InternalSim.g:2636:2: 'extends'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSim.g:2645:1: rule__SFuseComplexTypeRule__Group_4__1 : rule__SFuseComplexTypeRule__Group_4__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2649:1: ( rule__SFuseComplexTypeRule__Group_4__1__Impl )
            // InternalSim.g:2650:2: rule__SFuseComplexTypeRule__Group_4__1__Impl
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
    // InternalSim.g:2656:1: rule__SFuseComplexTypeRule__Group_4__1__Impl : ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2660:1: ( ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) )
            // InternalSim.g:2661:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            {
            // InternalSim.g:2661:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            // InternalSim.g:2662:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_1()); 
            // InternalSim.g:2663:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            // InternalSim.g:2663:3: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1
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
    // InternalSim.g:2672:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2676:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSim.g:2677:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
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
    // InternalSim.g:2684:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2688:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2689:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2689:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2690:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2691:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2691:3: rule__SGrabFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2699:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2703:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSim.g:2704:2: rule__SGrabFeatureRule__Group__1__Impl
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
    // InternalSim.g:2710:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2714:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2715:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2715:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSim.g:2716:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2717:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2717:3: rule__SGrabFeatureRule__Group_1__0
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
    // InternalSim.g:2726:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2730:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSim.g:2731:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2738:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2742:1: ( ( 'as' ) )
            // InternalSim.g:2743:1: ( 'as' )
            {
            // InternalSim.g:2743:1: ( 'as' )
            // InternalSim.g:2744:2: 'as'
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
    // InternalSim.g:2753:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2757:1: ( rule__SGrabFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2758:2: rule__SGrabFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2764:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2768:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2769:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2769:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2770:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2771:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2771:3: rule__SGrabFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:2780:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2784:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSim.g:2785:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:2792:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2796:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2797:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2797:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2798:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2799:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2799:3: rule__SMorphFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2807:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2811:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSim.g:2812:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:2819:1: rule__SMorphFeatureRule__Group__1__Impl : ( ( rule__SMorphFeatureRule__Group_1__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2823:1: ( ( ( rule__SMorphFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2824:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2824:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            // InternalSim.g:2825:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2826:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSim.g:2826:3: rule__SMorphFeatureRule__Group_1__0
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
    // InternalSim.g:2834:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2838:1: ( rule__SMorphFeatureRule__Group__2__Impl )
            // InternalSim.g:2839:2: rule__SMorphFeatureRule__Group__2__Impl
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
    // InternalSim.g:2845:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2849:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSim.g:2850:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSim.g:2850:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSim.g:2851:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSim.g:2852:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSim.g:2852:3: rule__SMorphFeatureRule__Group_2__0
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
    // InternalSim.g:2861:1: rule__SMorphFeatureRule__Group_1__0 : rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 ;
    public final void rule__SMorphFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2865:1: ( rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 )
            // InternalSim.g:2866:2: rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2873:1: rule__SMorphFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2877:1: ( ( 'as' ) )
            // InternalSim.g:2878:1: ( 'as' )
            {
            // InternalSim.g:2878:1: ( 'as' )
            // InternalSim.g:2879:2: 'as'
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
    // InternalSim.g:2888:1: rule__SMorphFeatureRule__Group_1__1 : rule__SMorphFeatureRule__Group_1__1__Impl ;
    public final void rule__SMorphFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2892:1: ( rule__SMorphFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2893:2: rule__SMorphFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2899:1: rule__SMorphFeatureRule__Group_1__1__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2903:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2904:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2904:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2905:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2906:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2906:3: rule__SMorphFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:2915:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2919:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSim.g:2920:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:2927:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2931:1: ( ( ':' ) )
            // InternalSim.g:2932:1: ( ':' )
            {
            // InternalSim.g:2932:1: ( ':' )
            // InternalSim.g:2933:2: ':'
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
    // InternalSim.g:2942:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2946:1: ( rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 )
            // InternalSim.g:2947:2: rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:2954:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2958:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) )
            // InternalSim.g:2959:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            {
            // InternalSim.g:2959:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            // InternalSim.g:2960:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_1()); 
            // InternalSim.g:2961:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            // InternalSim.g:2961:3: rule__SMorphFeatureRule__RetypeToAssignment_2_1
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
    // InternalSim.g:2969:1: rule__SMorphFeatureRule__Group_2__2 : rule__SMorphFeatureRule__Group_2__2__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2973:1: ( rule__SMorphFeatureRule__Group_2__2__Impl )
            // InternalSim.g:2974:2: rule__SMorphFeatureRule__Group_2__2__Impl
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
    // InternalSim.g:2980:1: rule__SMorphFeatureRule__Group_2__2__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) ;
    public final void rule__SMorphFeatureRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2984:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) )
            // InternalSim.g:2985:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            {
            // InternalSim.g:2985:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            // InternalSim.g:2986:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_2()); 
            // InternalSim.g:2987:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_INT) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalSim.g:2987:3: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2
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
    // InternalSim.g:2996:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3000:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSim.g:3001:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:3008:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3012:1: ( ( () ) )
            // InternalSim.g:3013:1: ( () )
            {
            // InternalSim.g:3013:1: ( () )
            // InternalSim.g:3014:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSim.g:3015:2: ()
            // InternalSim.g:3015:3: 
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
    // InternalSim.g:3023:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3027:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSim.g:3028:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3035:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3039:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSim.g:3040:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSim.g:3040:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSim.g:3041:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSim.g:3042:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSim.g:3042:3: rule__SAggregate__Alternatives_1
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
    // InternalSim.g:3050:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3054:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSim.g:3055:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3062:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3066:1: ( ( '{' ) )
            // InternalSim.g:3067:1: ( '{' )
            {
            // InternalSim.g:3067:1: ( '{' )
            // InternalSim.g:3068:2: '{'
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
    // InternalSim.g:3077:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3081:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSim.g:3082:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSim.g:3089:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3093:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSim.g:3094:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSim.g:3094:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSim.g:3095:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSim.g:3096:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==32||LA44_0==34||(LA44_0>=36 && LA44_0<=38)||(LA44_0>=40 && LA44_0<=43)||LA44_0==52) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSim.g:3096:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SAggregate__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSim.g:3104:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3108:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSim.g:3109:2: rule__SAggregate__Group__4__Impl
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
    // InternalSim.g:3115:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3119:1: ( ( '}' ) )
            // InternalSim.g:3120:1: ( '}' )
            {
            // InternalSim.g:3120:1: ( '}' )
            // InternalSim.g:3121:2: '}'
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
    // InternalSim.g:3131:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3135:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSim.g:3136:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:3143:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3147:1: ( ( 'grab' ) )
            // InternalSim.g:3148:1: ( 'grab' )
            {
            // InternalSim.g:3148:1: ( 'grab' )
            // InternalSim.g:3149:2: 'grab'
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
    // InternalSim.g:3158:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3162:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSim.g:3163:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3170:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3174:1: ( ( 'aggregate' ) )
            // InternalSim.g:3175:1: ( 'aggregate' )
            {
            // InternalSim.g:3175:1: ( 'aggregate' )
            // InternalSim.g:3176:2: 'aggregate'
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
    // InternalSim.g:3185:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3189:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSim.g:3190:2: rule__SAggregate__Group_1_0__2__Impl
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
    // InternalSim.g:3196:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3200:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSim.g:3201:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSim.g:3201:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSim.g:3202:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSim.g:3203:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSim.g:3203:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
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
    // InternalSim.g:3212:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3216:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSim.g:3217:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3224:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3228:1: ( ( 'constraint' ) )
            // InternalSim.g:3229:1: ( 'constraint' )
            {
            // InternalSim.g:3229:1: ( 'constraint' )
            // InternalSim.g:3230:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSim.g:3239:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3243:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSim.g:3244:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:3251:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3255:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSim.g:3256:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSim.g:3256:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSim.g:3257:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSim.g:3258:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSim.g:3258:3: rule__SConstraint__NameAssignment_1
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
    // InternalSim.g:3266:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3270:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSim.g:3271:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:3278:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3282:1: ( ( ':' ) )
            // InternalSim.g:3283:1: ( ':' )
            {
            // InternalSim.g:3283:1: ( ':' )
            // InternalSim.g:3284:2: ':'
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
    // InternalSim.g:3293:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3297:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSim.g:3298:2: rule__SConstraint__Group__3__Impl
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
    // InternalSim.g:3304:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3308:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSim.g:3309:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSim.g:3309:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSim.g:3310:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSim.g:3311:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSim.g:3311:3: rule__SConstraint__ConditionAssignment_3
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
    // InternalSim.g:3320:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3324:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSim.g:3325:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3332:1: rule__SPrimitive__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3336:1: ( ( 'primitive' ) )
            // InternalSim.g:3337:1: ( 'primitive' )
            {
            // InternalSim.g:3337:1: ( 'primitive' )
            // InternalSim.g:3338:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:3347:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3351:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSim.g:3352:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSim.g:3359:1: rule__SPrimitive__Group__1__Impl : ( ( rule__SPrimitive__NameAssignment_1 ) ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3363:1: ( ( ( rule__SPrimitive__NameAssignment_1 ) ) )
            // InternalSim.g:3364:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            {
            // InternalSim.g:3364:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            // InternalSim.g:3365:2: ( rule__SPrimitive__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_1()); 
            // InternalSim.g:3366:2: ( rule__SPrimitive__NameAssignment_1 )
            // InternalSim.g:3366:3: rule__SPrimitive__NameAssignment_1
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
    // InternalSim.g:3374:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3378:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSim.g:3379:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3386:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__Alternatives_2 ) ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3390:1: ( ( ( rule__SPrimitive__Alternatives_2 ) ) )
            // InternalSim.g:3391:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            {
            // InternalSim.g:3391:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            // InternalSim.g:3392:2: ( rule__SPrimitive__Alternatives_2 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2()); 
            // InternalSim.g:3393:2: ( rule__SPrimitive__Alternatives_2 )
            // InternalSim.g:3393:3: rule__SPrimitive__Alternatives_2
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
    // InternalSim.g:3401:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3405:1: ( rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 )
            // InternalSim.g:3406:2: rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3413:1: rule__SPrimitive__Group__3__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3417:1: ( ( '{' ) )
            // InternalSim.g:3418:1: ( '{' )
            {
            // InternalSim.g:3418:1: ( '{' )
            // InternalSim.g:3419:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3428:1: rule__SPrimitive__Group__4 : rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 ;
    public final void rule__SPrimitive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3432:1: ( rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 )
            // InternalSim.g:3433:2: rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3440:1: rule__SPrimitive__Group__4__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) ;
    public final void rule__SPrimitive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3444:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) )
            // InternalSim.g:3445:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            {
            // InternalSim.g:3445:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            // InternalSim.g:3446:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_4()); 
            // InternalSim.g:3447:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSim.g:3447:3: rule__SPrimitive__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SPrimitive__ConstraintsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalSim.g:3455:1: rule__SPrimitive__Group__5 : rule__SPrimitive__Group__5__Impl ;
    public final void rule__SPrimitive__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3459:1: ( rule__SPrimitive__Group__5__Impl )
            // InternalSim.g:3460:2: rule__SPrimitive__Group__5__Impl
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
    // InternalSim.g:3466:1: rule__SPrimitive__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3470:1: ( ( '}' ) )
            // InternalSim.g:3471:1: ( '}' )
            {
            // InternalSim.g:3471:1: ( '}' )
            // InternalSim.g:3472:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3482:1: rule__SPrimitive__Group_2_0__0 : rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 ;
    public final void rule__SPrimitive__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3486:1: ( rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 )
            // InternalSim.g:3487:2: rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3494:1: rule__SPrimitive__Group_2_0__0__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3498:1: ( ( 'redefines' ) )
            // InternalSim.g:3499:1: ( 'redefines' )
            {
            // InternalSim.g:3499:1: ( 'redefines' )
            // InternalSim.g:3500:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_2_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:3509:1: rule__SPrimitive__Group_2_0__1 : rule__SPrimitive__Group_2_0__1__Impl ;
    public final void rule__SPrimitive__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3513:1: ( rule__SPrimitive__Group_2_0__1__Impl )
            // InternalSim.g:3514:2: rule__SPrimitive__Group_2_0__1__Impl
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
    // InternalSim.g:3520:1: rule__SPrimitive__Group_2_0__1__Impl : ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) ;
    public final void rule__SPrimitive__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3524:1: ( ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) )
            // InternalSim.g:3525:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            {
            // InternalSim.g:3525:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            // InternalSim.g:3526:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_2_0_1()); 
            // InternalSim.g:3527:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            // InternalSim.g:3527:3: rule__SPrimitive__RedefinesAssignment_2_0_1
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
    // InternalSim.g:3536:1: rule__SPrimitive__Group_2_1__0 : rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 ;
    public final void rule__SPrimitive__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3540:1: ( rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 )
            // InternalSim.g:3541:2: rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3548:1: rule__SPrimitive__Group_2_1__0__Impl : ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) ;
    public final void rule__SPrimitive__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3552:1: ( ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) )
            // InternalSim.g:3553:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            {
            // InternalSim.g:3553:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            // InternalSim.g:3554:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2_1_0()); 
            // InternalSim.g:3555:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            // InternalSim.g:3555:3: rule__SPrimitive__Alternatives_2_1_0
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
    // InternalSim.g:3563:1: rule__SPrimitive__Group_2_1__1 : rule__SPrimitive__Group_2_1__1__Impl ;
    public final void rule__SPrimitive__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3567:1: ( rule__SPrimitive__Group_2_1__1__Impl )
            // InternalSim.g:3568:2: rule__SPrimitive__Group_2_1__1__Impl
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
    // InternalSim.g:3574:1: rule__SPrimitive__Group_2_1__1__Impl : ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) ;
    public final void rule__SPrimitive__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3578:1: ( ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) )
            // InternalSim.g:3579:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            {
            // InternalSim.g:3579:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            // InternalSim.g:3580:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_2_1_1()); 
            // InternalSim.g:3581:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            // InternalSim.g:3581:3: rule__SPrimitive__RealizesAssignment_2_1_1
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
    // InternalSim.g:3590:1: rule__SPrimitiveArchetype__Group__0 : rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 ;
    public final void rule__SPrimitiveArchetype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3594:1: ( rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 )
            // InternalSim.g:3595:2: rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3602:1: rule__SPrimitiveArchetype__Group__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitiveArchetype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3606:1: ( ( 'archetype' ) )
            // InternalSim.g:3607:1: ( 'archetype' )
            {
            // InternalSim.g:3607:1: ( 'archetype' )
            // InternalSim.g:3608:2: 'archetype'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getArchetypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:3617:1: rule__SPrimitiveArchetype__Group__1 : rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 ;
    public final void rule__SPrimitiveArchetype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3621:1: ( rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 )
            // InternalSim.g:3622:2: rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3629:1: rule__SPrimitiveArchetype__Group__1__Impl : ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) ;
    public final void rule__SPrimitiveArchetype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3633:1: ( ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) )
            // InternalSim.g:3634:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            {
            // InternalSim.g:3634:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            // InternalSim.g:3635:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getNameAssignment_1()); 
            // InternalSim.g:3636:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            // InternalSim.g:3636:3: rule__SPrimitiveArchetype__NameAssignment_1
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
    // InternalSim.g:3644:1: rule__SPrimitiveArchetype__Group__2 : rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 ;
    public final void rule__SPrimitiveArchetype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3648:1: ( rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 )
            // InternalSim.g:3649:2: rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3656:1: rule__SPrimitiveArchetype__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrimitiveArchetype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3660:1: ( ( '{' ) )
            // InternalSim.g:3661:1: ( '{' )
            {
            // InternalSim.g:3661:1: ( '{' )
            // InternalSim.g:3662:2: '{'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3671:1: rule__SPrimitiveArchetype__Group__3 : rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 ;
    public final void rule__SPrimitiveArchetype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3675:1: ( rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 )
            // InternalSim.g:3676:2: rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3683:1: rule__SPrimitiveArchetype__Group__3__Impl : ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) ;
    public final void rule__SPrimitiveArchetype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3687:1: ( ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:3688:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:3688:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            // InternalSim.g:3689:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:3690:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalSim.g:3690:3: rule__SPrimitiveArchetype__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__SPrimitiveArchetype__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalSim.g:3698:1: rule__SPrimitiveArchetype__Group__4 : rule__SPrimitiveArchetype__Group__4__Impl ;
    public final void rule__SPrimitiveArchetype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3702:1: ( rule__SPrimitiveArchetype__Group__4__Impl )
            // InternalSim.g:3703:2: rule__SPrimitiveArchetype__Group__4__Impl
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
    // InternalSim.g:3709:1: rule__SPrimitiveArchetype__Group__4__Impl : ( '}' ) ;
    public final void rule__SPrimitiveArchetype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3713:1: ( ( '}' ) )
            // InternalSim.g:3714:1: ( '}' )
            {
            // InternalSim.g:3714:1: ( '}' )
            // InternalSim.g:3715:2: '}'
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3725:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3729:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSim.g:3730:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3737:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3741:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSim.g:3742:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSim.g:3742:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSim.g:3743:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSim.g:3744:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSim.g:3744:3: rule__SEnumeration__Alternatives_0
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
    // InternalSim.g:3752:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3756:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSim.g:3757:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:3764:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3768:1: ( ( '{' ) )
            // InternalSim.g:3769:1: ( '{' )
            {
            // InternalSim.g:3769:1: ( '{' )
            // InternalSim.g:3770:2: '{'
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
    // InternalSim.g:3779:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3783:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSim.g:3784:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:3791:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3795:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSim.g:3796:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSim.g:3796:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSim.g:3797:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSim.g:3798:2: ( rule__SEnumeration__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==32||LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSim.g:3798:3: rule__SEnumeration__Group_2__0
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
    // InternalSim.g:3806:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3810:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSim.g:3811:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:3818:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3822:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:3823:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:3823:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSim.g:3824:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:3825:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSim.g:3825:3: rule__SEnumeration__ConstraintsAssignment_3
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
    // InternalSim.g:3833:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3837:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSim.g:3838:2: rule__SEnumeration__Group__4__Impl
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
    // InternalSim.g:3844:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3848:1: ( ( '}' ) )
            // InternalSim.g:3849:1: ( '}' )
            {
            // InternalSim.g:3849:1: ( '}' )
            // InternalSim.g:3850:2: '}'
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
    // InternalSim.g:3860:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3864:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSim.g:3865:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:3872:1: rule__SEnumeration__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3876:1: ( ( () ) )
            // InternalSim.g:3877:1: ( () )
            {
            // InternalSim.g:3877:1: ( () )
            // InternalSim.g:3878:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 
            // InternalSim.g:3879:2: ()
            // InternalSim.g:3879:3: 
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
    // InternalSim.g:3887:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3891:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSim.g:3892:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSim.g:3899:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3903:1: ( ( 'grab' ) )
            // InternalSim.g:3904:1: ( 'grab' )
            {
            // InternalSim.g:3904:1: ( 'grab' )
            // InternalSim.g:3905:2: 'grab'
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
    // InternalSim.g:3914:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3918:1: ( rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 )
            // InternalSim.g:3919:2: rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:3926:1: rule__SEnumeration__Group_0_0__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3930:1: ( ( 'enumeration' ) )
            // InternalSim.g:3931:1: ( 'enumeration' )
            {
            // InternalSim.g:3931:1: ( 'enumeration' )
            // InternalSim.g:3932:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:3941:1: rule__SEnumeration__Group_0_0__3 : rule__SEnumeration__Group_0_0__3__Impl ;
    public final void rule__SEnumeration__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3945:1: ( rule__SEnumeration__Group_0_0__3__Impl )
            // InternalSim.g:3946:2: rule__SEnumeration__Group_0_0__3__Impl
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
    // InternalSim.g:3952:1: rule__SEnumeration__Group_0_0__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SEnumeration__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3956:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:3957:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:3957:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:3958:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:3959:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:3959:3: rule__SEnumeration__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:3968:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3972:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSim.g:3973:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:3980:1: rule__SEnumeration__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3984:1: ( ( () ) )
            // InternalSim.g:3985:1: ( () )
            {
            // InternalSim.g:3985:1: ( () )
            // InternalSim.g:3986:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 
            // InternalSim.g:3987:2: ()
            // InternalSim.g:3987:3: 
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
    // InternalSim.g:3995:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3999:1: ( rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 )
            // InternalSim.g:4000:2: rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSim.g:4007:1: rule__SEnumeration__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4011:1: ( ( 'ditch' ) )
            // InternalSim.g:4012:1: ( 'ditch' )
            {
            // InternalSim.g:4012:1: ( 'ditch' )
            // InternalSim.g:4013:2: 'ditch'
            {
             before(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4022:1: rule__SEnumeration__Group_0_1__2 : rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 ;
    public final void rule__SEnumeration__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4026:1: ( rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 )
            // InternalSim.g:4027:2: rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4034:1: rule__SEnumeration__Group_0_1__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4038:1: ( ( 'enumeration' ) )
            // InternalSim.g:4039:1: ( 'enumeration' )
            {
            // InternalSim.g:4039:1: ( 'enumeration' )
            // InternalSim.g:4040:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4049:1: rule__SEnumeration__Group_0_1__3 : rule__SEnumeration__Group_0_1__3__Impl ;
    public final void rule__SEnumeration__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4053:1: ( rule__SEnumeration__Group_0_1__3__Impl )
            // InternalSim.g:4054:2: rule__SEnumeration__Group_0_1__3__Impl
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
    // InternalSim.g:4060:1: rule__SEnumeration__Group_0_1__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SEnumeration__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4064:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:4065:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:4065:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:4066:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:4067:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:4067:3: rule__SEnumeration__DeductionRuleAssignment_0_1_3
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
    // InternalSim.g:4076:1: rule__SEnumeration__Group_0_2__0 : rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 ;
    public final void rule__SEnumeration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4080:1: ( rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 )
            // InternalSim.g:4081:2: rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4088:1: rule__SEnumeration__Group_0_2__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4092:1: ( ( 'enumeration' ) )
            // InternalSim.g:4093:1: ( 'enumeration' )
            {
            // InternalSim.g:4093:1: ( 'enumeration' )
            // InternalSim.g:4094:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4103:1: rule__SEnumeration__Group_0_2__1 : rule__SEnumeration__Group_0_2__1__Impl ;
    public final void rule__SEnumeration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4107:1: ( rule__SEnumeration__Group_0_2__1__Impl )
            // InternalSim.g:4108:2: rule__SEnumeration__Group_0_2__1__Impl
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
    // InternalSim.g:4114:1: rule__SEnumeration__Group_0_2__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) ;
    public final void rule__SEnumeration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4118:1: ( ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:4119:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:4119:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            // InternalSim.g:4120:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:4121:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            // InternalSim.g:4121:3: rule__SEnumeration__NameAssignment_0_2_1
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
    // InternalSim.g:4130:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4134:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSim.g:4135:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSim.g:4142:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4146:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSim.g:4147:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSim.g:4147:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSim.g:4148:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSim.g:4149:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSim.g:4149:3: rule__SEnumeration__LiteralsAssignment_2_0
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
    // InternalSim.g:4157:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4161:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSim.g:4162:2: rule__SEnumeration__Group_2__1__Impl
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
    // InternalSim.g:4168:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4172:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSim.g:4173:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSim.g:4173:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSim.g:4174:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSim.g:4175:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==39) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSim.g:4175:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalSim.g:4184:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4188:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSim.g:4189:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSim.g:4196:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4200:1: ( ( ',' ) )
            // InternalSim.g:4201:1: ( ',' )
            {
            // InternalSim.g:4201:1: ( ',' )
            // InternalSim.g:4202:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:4211:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4215:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSim.g:4216:2: rule__SEnumeration__Group_2_1__1__Impl
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
    // InternalSim.g:4222:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4226:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSim.g:4227:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSim.g:4227:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSim.g:4228:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSim.g:4229:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSim.g:4229:3: rule__SEnumeration__LiteralsAssignment_2_1_1
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
    // InternalSim.g:4238:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4242:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSim.g:4243:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:4250:1: rule__SLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4254:1: ( ( () ) )
            // InternalSim.g:4255:1: ( () )
            {
            // InternalSim.g:4255:1: ( () )
            // InternalSim.g:4256:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 
            // InternalSim.g:4257:2: ()
            // InternalSim.g:4257:3: 
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
    // InternalSim.g:4265:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4269:1: ( rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 )
            // InternalSim.g:4270:2: rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4277:1: rule__SLiteral__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4281:1: ( ( 'grab' ) )
            // InternalSim.g:4282:1: ( 'grab' )
            {
            // InternalSim.g:4282:1: ( 'grab' )
            // InternalSim.g:4283:2: 'grab'
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
    // InternalSim.g:4292:1: rule__SLiteral__Group_0__2 : rule__SLiteral__Group_0__2__Impl ;
    public final void rule__SLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4296:1: ( rule__SLiteral__Group_0__2__Impl )
            // InternalSim.g:4297:2: rule__SLiteral__Group_0__2__Impl
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
    // InternalSim.g:4303:1: rule__SLiteral__Group_0__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4307:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:4308:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:4308:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:4309:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:4310:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            // InternalSim.g:4310:3: rule__SLiteral__DeductionRuleAssignment_0_2
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
    // InternalSim.g:4319:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4323:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSim.g:4324:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:4331:1: rule__SLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4335:1: ( ( () ) )
            // InternalSim.g:4336:1: ( () )
            {
            // InternalSim.g:4336:1: ( () )
            // InternalSim.g:4337:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 
            // InternalSim.g:4338:2: ()
            // InternalSim.g:4338:3: 
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
    // InternalSim.g:4346:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4350:1: ( rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 )
            // InternalSim.g:4351:2: rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4358:1: rule__SLiteral__Group_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4362:1: ( ( 'ditch' ) )
            // InternalSim.g:4363:1: ( 'ditch' )
            {
            // InternalSim.g:4363:1: ( 'ditch' )
            // InternalSim.g:4364:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4373:1: rule__SLiteral__Group_1__2 : rule__SLiteral__Group_1__2__Impl ;
    public final void rule__SLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4377:1: ( rule__SLiteral__Group_1__2__Impl )
            // InternalSim.g:4378:2: rule__SLiteral__Group_1__2__Impl
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
    // InternalSim.g:4384:1: rule__SLiteral__Group_1__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4388:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:4389:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:4389:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:4390:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:4391:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            // InternalSim.g:4391:3: rule__SLiteral__DeductionRuleAssignment_1_2
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
    // InternalSim.g:4400:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4404:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSim.g:4405:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:4412:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4416:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSim.g:4417:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSim.g:4417:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSim.g:4418:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4419:2: ( rule__SRootType__Alternatives_0 )
            // InternalSim.g:4419:3: rule__SRootType__Alternatives_0
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
    // InternalSim.g:4427:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4431:1: ( rule__SRootType__Group__1__Impl )
            // InternalSim.g:4432:2: rule__SRootType__Group__1__Impl
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
    // InternalSim.g:4438:1: rule__SRootType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4442:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:4443:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:4443:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:4444:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:4454:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4458:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSim.g:4459:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:4466:1: rule__SRootType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4470:1: ( ( () ) )
            // InternalSim.g:4471:1: ( () )
            {
            // InternalSim.g:4471:1: ( () )
            // InternalSim.g:4472:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0()); 
            // InternalSim.g:4473:2: ()
            // InternalSim.g:4473:3: 
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
    // InternalSim.g:4481:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4485:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSim.g:4486:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4493:1: rule__SRootType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4497:1: ( ( 'grab' ) )
            // InternalSim.g:4498:1: ( 'grab' )
            {
            // InternalSim.g:4498:1: ( 'grab' )
            // InternalSim.g:4499:2: 'grab'
            {
             before(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:4508:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4512:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSim.g:4513:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4520:1: rule__SRootType__Group_0_0__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4524:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:4525:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:4525:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:4526:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:4527:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSim.g:4527:3: rule__SRootType__AbstractAssignment_0_0_2
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
    // InternalSim.g:4535:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4539:1: ( rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 )
            // InternalSim.g:4540:2: rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4547:1: rule__SRootType__Group_0_0__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4551:1: ( ( 'root' ) )
            // InternalSim.g:4552:1: ( 'root' )
            {
            // InternalSim.g:4552:1: ( 'root' )
            // InternalSim.g:4553:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4562:1: rule__SRootType__Group_0_0__4 : rule__SRootType__Group_0_0__4__Impl ;
    public final void rule__SRootType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4566:1: ( rule__SRootType__Group_0_0__4__Impl )
            // InternalSim.g:4567:2: rule__SRootType__Group_0_0__4__Impl
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
    // InternalSim.g:4573:1: rule__SRootType__Group_0_0__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SRootType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4577:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:4578:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:4578:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:4579:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:4580:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:4580:3: rule__SRootType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:4589:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4593:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSim.g:4594:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:4601:1: rule__SRootType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4605:1: ( ( () ) )
            // InternalSim.g:4606:1: ( () )
            {
            // InternalSim.g:4606:1: ( () )
            // InternalSim.g:4607:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0()); 
            // InternalSim.g:4608:2: ()
            // InternalSim.g:4608:3: 
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
    // InternalSim.g:4616:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4620:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSim.g:4621:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4628:1: rule__SRootType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4632:1: ( ( 'ditch' ) )
            // InternalSim.g:4633:1: ( 'ditch' )
            {
            // InternalSim.g:4633:1: ( 'ditch' )
            // InternalSim.g:4634:2: 'ditch'
            {
             before(grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4643:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4647:1: ( rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 )
            // InternalSim.g:4648:2: rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4655:1: rule__SRootType__Group_0_1__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4659:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:4660:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:4660:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:4661:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:4662:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:4662:3: rule__SRootType__AbstractAssignment_0_1_2
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
    // InternalSim.g:4670:1: rule__SRootType__Group_0_1__3 : rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 ;
    public final void rule__SRootType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4674:1: ( rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 )
            // InternalSim.g:4675:2: rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4682:1: rule__SRootType__Group_0_1__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4686:1: ( ( 'root' ) )
            // InternalSim.g:4687:1: ( 'root' )
            {
            // InternalSim.g:4687:1: ( 'root' )
            // InternalSim.g:4688:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4697:1: rule__SRootType__Group_0_1__4 : rule__SRootType__Group_0_1__4__Impl ;
    public final void rule__SRootType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4701:1: ( rule__SRootType__Group_0_1__4__Impl )
            // InternalSim.g:4702:2: rule__SRootType__Group_0_1__4__Impl
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
    // InternalSim.g:4708:1: rule__SRootType__Group_0_1__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SRootType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4712:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:4713:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:4713:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:4714:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:4715:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:4715:3: rule__SRootType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:4724:1: rule__SRootType__Group_0_2__0 : rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 ;
    public final void rule__SRootType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4728:1: ( rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 )
            // InternalSim.g:4729:2: rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:4736:1: rule__SRootType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4740:1: ( ( () ) )
            // InternalSim.g:4741:1: ( () )
            {
            // InternalSim.g:4741:1: ( () )
            // InternalSim.g:4742:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0()); 
            // InternalSim.g:4743:2: ()
            // InternalSim.g:4743:3: 
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
    // InternalSim.g:4751:1: rule__SRootType__Group_0_2__1 : rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 ;
    public final void rule__SRootType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4755:1: ( rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 )
            // InternalSim.g:4756:2: rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4763:1: rule__SRootType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SRootType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4767:1: ( ( 'morph' ) )
            // InternalSim.g:4768:1: ( 'morph' )
            {
            // InternalSim.g:4768:1: ( 'morph' )
            // InternalSim.g:4769:2: 'morph'
            {
             before(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:4778:1: rule__SRootType__Group_0_2__2 : rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 ;
    public final void rule__SRootType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4782:1: ( rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 )
            // InternalSim.g:4783:2: rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4790:1: rule__SRootType__Group_0_2__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SRootType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4794:1: ( ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:4795:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:4795:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:4796:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:4797:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSim.g:4797:3: rule__SRootType__AbstractAssignment_0_2_2
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
    // InternalSim.g:4805:1: rule__SRootType__Group_0_2__3 : rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 ;
    public final void rule__SRootType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4809:1: ( rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 )
            // InternalSim.g:4810:2: rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4817:1: rule__SRootType__Group_0_2__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4821:1: ( ( 'root' ) )
            // InternalSim.g:4822:1: ( 'root' )
            {
            // InternalSim.g:4822:1: ( 'root' )
            // InternalSim.g:4823:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4832:1: rule__SRootType__Group_0_2__4 : rule__SRootType__Group_0_2__4__Impl ;
    public final void rule__SRootType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4836:1: ( rule__SRootType__Group_0_2__4__Impl )
            // InternalSim.g:4837:2: rule__SRootType__Group_0_2__4__Impl
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
    // InternalSim.g:4843:1: rule__SRootType__Group_0_2__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SRootType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4847:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:4848:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:4848:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:4849:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:4850:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:4850:3: rule__SRootType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:4859:1: rule__SRootType__Group_0_3__0 : rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 ;
    public final void rule__SRootType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4863:1: ( rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 )
            // InternalSim.g:4864:2: rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:4871:1: rule__SRootType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4875:1: ( ( () ) )
            // InternalSim.g:4876:1: ( () )
            {
            // InternalSim.g:4876:1: ( () )
            // InternalSim.g:4877:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0()); 
            // InternalSim.g:4878:2: ()
            // InternalSim.g:4878:3: 
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
    // InternalSim.g:4886:1: rule__SRootType__Group_0_3__1 : rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 ;
    public final void rule__SRootType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4890:1: ( rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 )
            // InternalSim.g:4891:2: rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4898:1: rule__SRootType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SRootType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4902:1: ( ( 'fuse' ) )
            // InternalSim.g:4903:1: ( 'fuse' )
            {
            // InternalSim.g:4903:1: ( 'fuse' )
            // InternalSim.g:4904:2: 'fuse'
            {
             before(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:4913:1: rule__SRootType__Group_0_3__2 : rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 ;
    public final void rule__SRootType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4917:1: ( rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 )
            // InternalSim.g:4918:2: rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalSim.g:4925:1: rule__SRootType__Group_0_3__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SRootType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4929:1: ( ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:4930:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:4930:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:4931:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:4932:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:4932:3: rule__SRootType__AbstractAssignment_0_3_2
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
    // InternalSim.g:4940:1: rule__SRootType__Group_0_3__3 : rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 ;
    public final void rule__SRootType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4944:1: ( rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 )
            // InternalSim.g:4945:2: rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:4952:1: rule__SRootType__Group_0_3__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4956:1: ( ( 'root' ) )
            // InternalSim.g:4957:1: ( 'root' )
            {
            // InternalSim.g:4957:1: ( 'root' )
            // InternalSim.g:4958:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4967:1: rule__SRootType__Group_0_3__4 : rule__SRootType__Group_0_3__4__Impl ;
    public final void rule__SRootType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4971:1: ( rule__SRootType__Group_0_3__4__Impl )
            // InternalSim.g:4972:2: rule__SRootType__Group_0_3__4__Impl
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
    // InternalSim.g:4978:1: rule__SRootType__Group_0_3__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SRootType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4982:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:4983:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:4983:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:4984:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:4985:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:4985:3: rule__SRootType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:4994:1: rule__SRootType__Group_0_4__0 : rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 ;
    public final void rule__SRootType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4998:1: ( rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 )
            // InternalSim.g:4999:2: rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSim.g:5006:1: rule__SRootType__Group_0_4__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SRootType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5010:1: ( ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5011:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5011:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5012:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5013:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==52) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:5013:3: rule__SRootType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5021:1: rule__SRootType__Group_0_4__1 : rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 ;
    public final void rule__SRootType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5025:1: ( rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 )
            // InternalSim.g:5026:2: rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5033:1: rule__SRootType__Group_0_4__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5037:1: ( ( 'root' ) )
            // InternalSim.g:5038:1: ( 'root' )
            {
            // InternalSim.g:5038:1: ( 'root' )
            // InternalSim.g:5039:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:5048:1: rule__SRootType__Group_0_4__2 : rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 ;
    public final void rule__SRootType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5052:1: ( rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 )
            // InternalSim.g:5053:2: rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSim.g:5060:1: rule__SRootType__Group_0_4__2__Impl : ( ( rule__SRootType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SRootType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5064:1: ( ( ( rule__SRootType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5065:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5065:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5066:2: ( rule__SRootType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5067:2: ( rule__SRootType__NameAssignment_0_4_2 )
            // InternalSim.g:5067:3: rule__SRootType__NameAssignment_0_4_2
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
    // InternalSim.g:5075:1: rule__SRootType__Group_0_4__3 : rule__SRootType__Group_0_4__3__Impl ;
    public final void rule__SRootType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5079:1: ( rule__SRootType__Group_0_4__3__Impl )
            // InternalSim.g:5080:2: rule__SRootType__Group_0_4__3__Impl
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
    // InternalSim.g:5086:1: rule__SRootType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SRootType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5090:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5091:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5091:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5092:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5102:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5106:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSim.g:5107:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:5114:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5118:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSim.g:5119:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSim.g:5119:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSim.g:5120:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSim.g:5121:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSim.g:5121:3: rule__SDetailType__Alternatives_0
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
    // InternalSim.g:5129:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5133:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSim.g:5134:2: rule__SDetailType__Group__1__Impl
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
    // InternalSim.g:5140:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5144:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:5145:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:5145:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:5146:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:5156:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5160:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSim.g:5161:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:5168:1: rule__SDetailType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5172:1: ( ( () ) )
            // InternalSim.g:5173:1: ( () )
            {
            // InternalSim.g:5173:1: ( () )
            // InternalSim.g:5174:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 
            // InternalSim.g:5175:2: ()
            // InternalSim.g:5175:3: 
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
    // InternalSim.g:5183:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5187:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSim.g:5188:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5195:1: rule__SDetailType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5199:1: ( ( 'grab' ) )
            // InternalSim.g:5200:1: ( 'grab' )
            {
            // InternalSim.g:5200:1: ( 'grab' )
            // InternalSim.g:5201:2: 'grab'
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
    // InternalSim.g:5210:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5214:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSim.g:5215:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5222:1: rule__SDetailType__Group_0_0__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5226:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:5227:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:5227:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:5228:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:5229:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSim.g:5229:3: rule__SDetailType__AbstractAssignment_0_0_2
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
    // InternalSim.g:5237:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5241:1: ( rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 )
            // InternalSim.g:5242:2: rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5249:1: rule__SDetailType__Group_0_0__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5253:1: ( ( 'detail' ) )
            // InternalSim.g:5254:1: ( 'detail' )
            {
            // InternalSim.g:5254:1: ( 'detail' )
            // InternalSim.g:5255:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:5264:1: rule__SDetailType__Group_0_0__4 : rule__SDetailType__Group_0_0__4__Impl ;
    public final void rule__SDetailType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5268:1: ( rule__SDetailType__Group_0_0__4__Impl )
            // InternalSim.g:5269:2: rule__SDetailType__Group_0_0__4__Impl
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
    // InternalSim.g:5275:1: rule__SDetailType__Group_0_0__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SDetailType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5279:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:5280:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:5280:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:5281:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:5282:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:5282:3: rule__SDetailType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:5291:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5295:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSim.g:5296:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:5303:1: rule__SDetailType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5307:1: ( ( () ) )
            // InternalSim.g:5308:1: ( () )
            {
            // InternalSim.g:5308:1: ( () )
            // InternalSim.g:5309:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 
            // InternalSim.g:5310:2: ()
            // InternalSim.g:5310:3: 
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
    // InternalSim.g:5318:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5322:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSim.g:5323:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5330:1: rule__SDetailType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5334:1: ( ( 'ditch' ) )
            // InternalSim.g:5335:1: ( 'ditch' )
            {
            // InternalSim.g:5335:1: ( 'ditch' )
            // InternalSim.g:5336:2: 'ditch'
            {
             before(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:5345:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5349:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSim.g:5350:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5357:1: rule__SDetailType__Group_0_1__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5361:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:5362:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:5362:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:5363:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:5364:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==52) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:5364:3: rule__SDetailType__AbstractAssignment_0_1_2
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
    // InternalSim.g:5372:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5376:1: ( rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 )
            // InternalSim.g:5377:2: rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5384:1: rule__SDetailType__Group_0_1__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5388:1: ( ( 'detail' ) )
            // InternalSim.g:5389:1: ( 'detail' )
            {
            // InternalSim.g:5389:1: ( 'detail' )
            // InternalSim.g:5390:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:5399:1: rule__SDetailType__Group_0_1__4 : rule__SDetailType__Group_0_1__4__Impl ;
    public final void rule__SDetailType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5403:1: ( rule__SDetailType__Group_0_1__4__Impl )
            // InternalSim.g:5404:2: rule__SDetailType__Group_0_1__4__Impl
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
    // InternalSim.g:5410:1: rule__SDetailType__Group_0_1__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SDetailType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5414:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:5415:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:5415:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:5416:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:5417:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:5417:3: rule__SDetailType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:5426:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5430:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSim.g:5431:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:5438:1: rule__SDetailType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5442:1: ( ( () ) )
            // InternalSim.g:5443:1: ( () )
            {
            // InternalSim.g:5443:1: ( () )
            // InternalSim.g:5444:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 
            // InternalSim.g:5445:2: ()
            // InternalSim.g:5445:3: 
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
    // InternalSim.g:5453:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5457:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSim.g:5458:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5465:1: rule__SDetailType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5469:1: ( ( 'morph' ) )
            // InternalSim.g:5470:1: ( 'morph' )
            {
            // InternalSim.g:5470:1: ( 'morph' )
            // InternalSim.g:5471:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5480:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5484:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSim.g:5485:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5492:1: rule__SDetailType__Group_0_2__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5496:1: ( ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:5497:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:5497:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:5498:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:5499:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==52) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSim.g:5499:3: rule__SDetailType__AbstractAssignment_0_2_2
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
    // InternalSim.g:5507:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5511:1: ( rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 )
            // InternalSim.g:5512:2: rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5519:1: rule__SDetailType__Group_0_2__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5523:1: ( ( 'detail' ) )
            // InternalSim.g:5524:1: ( 'detail' )
            {
            // InternalSim.g:5524:1: ( 'detail' )
            // InternalSim.g:5525:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:5534:1: rule__SDetailType__Group_0_2__4 : rule__SDetailType__Group_0_2__4__Impl ;
    public final void rule__SDetailType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5538:1: ( rule__SDetailType__Group_0_2__4__Impl )
            // InternalSim.g:5539:2: rule__SDetailType__Group_0_2__4__Impl
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
    // InternalSim.g:5545:1: rule__SDetailType__Group_0_2__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SDetailType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5549:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5550:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5550:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5551:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5552:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5552:3: rule__SDetailType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:5561:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5565:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSim.g:5566:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSim.g:5573:1: rule__SDetailType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5577:1: ( ( () ) )
            // InternalSim.g:5578:1: ( () )
            {
            // InternalSim.g:5578:1: ( () )
            // InternalSim.g:5579:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 
            // InternalSim.g:5580:2: ()
            // InternalSim.g:5580:3: 
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
    // InternalSim.g:5588:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5592:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSim.g:5593:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5600:1: rule__SDetailType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5604:1: ( ( 'fuse' ) )
            // InternalSim.g:5605:1: ( 'fuse' )
            {
            // InternalSim.g:5605:1: ( 'fuse' )
            // InternalSim.g:5606:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:5615:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5619:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSim.g:5620:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalSim.g:5627:1: rule__SDetailType__Group_0_3__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5631:1: ( ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:5632:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:5632:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:5633:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:5634:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSim.g:5634:3: rule__SDetailType__AbstractAssignment_0_3_2
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
    // InternalSim.g:5642:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5646:1: ( rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 )
            // InternalSim.g:5647:2: rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5654:1: rule__SDetailType__Group_0_3__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5658:1: ( ( 'detail' ) )
            // InternalSim.g:5659:1: ( 'detail' )
            {
            // InternalSim.g:5659:1: ( 'detail' )
            // InternalSim.g:5660:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:5669:1: rule__SDetailType__Group_0_3__4 : rule__SDetailType__Group_0_3__4__Impl ;
    public final void rule__SDetailType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5673:1: ( rule__SDetailType__Group_0_3__4__Impl )
            // InternalSim.g:5674:2: rule__SDetailType__Group_0_3__4__Impl
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
    // InternalSim.g:5680:1: rule__SDetailType__Group_0_3__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SDetailType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5684:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5685:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5685:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5686:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5687:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5687:3: rule__SDetailType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:5696:1: rule__SDetailType__Group_0_4__0 : rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 ;
    public final void rule__SDetailType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5700:1: ( rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 )
            // InternalSim.g:5701:2: rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSim.g:5708:1: rule__SDetailType__Group_0_4__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SDetailType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5712:1: ( ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5713:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5713:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5714:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5715:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==52) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSim.g:5715:3: rule__SDetailType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5723:1: rule__SDetailType__Group_0_4__1 : rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 ;
    public final void rule__SDetailType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5727:1: ( rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 )
            // InternalSim.g:5728:2: rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5735:1: rule__SDetailType__Group_0_4__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5739:1: ( ( 'detail' ) )
            // InternalSim.g:5740:1: ( 'detail' )
            {
            // InternalSim.g:5740:1: ( 'detail' )
            // InternalSim.g:5741:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:5750:1: rule__SDetailType__Group_0_4__2 : rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 ;
    public final void rule__SDetailType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5754:1: ( rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 )
            // InternalSim.g:5755:2: rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalSim.g:5762:1: rule__SDetailType__Group_0_4__2__Impl : ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SDetailType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5766:1: ( ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5767:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5767:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5768:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5769:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            // InternalSim.g:5769:3: rule__SDetailType__NameAssignment_0_4_2
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
    // InternalSim.g:5777:1: rule__SDetailType__Group_0_4__3 : rule__SDetailType__Group_0_4__3__Impl ;
    public final void rule__SDetailType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5781:1: ( rule__SDetailType__Group_0_4__3__Impl )
            // InternalSim.g:5782:2: rule__SDetailType__Group_0_4__3__Impl
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
    // InternalSim.g:5788:1: rule__SDetailType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5792:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5793:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5793:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5794:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5804:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5808:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSim.g:5809:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:5816:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5820:1: ( ( 'extends' ) )
            // InternalSim.g:5821:1: ( 'extends' )
            {
            // InternalSim.g:5821:1: ( 'extends' )
            // InternalSim.g:5822:2: 'extends'
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
    // InternalSim.g:5831:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5835:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSim.g:5836:2: rule__SComplexTypeExtends__Group__1__Impl
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
    // InternalSim.g:5842:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5846:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSim.g:5847:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSim.g:5847:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSim.g:5848:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSim.g:5849:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSim.g:5849:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
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
    // InternalSim.g:5858:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5862:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSim.g:5863:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5870:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5874:1: ( ( '{' ) )
            // InternalSim.g:5875:1: ( '{' )
            {
            // InternalSim.g:5875:1: ( '{' )
            // InternalSim.g:5876:2: '{'
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
    // InternalSim.g:5885:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5889:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSim.g:5890:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalSim.g:5897:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5901:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSim.g:5902:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSim.g:5902:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSim.g:5903:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSim.g:5904:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID||LA60_0==11||(LA60_0>=15 && LA60_0<=16)||(LA60_0>=32 && LA60_0<=33)||LA60_0==38||LA60_0==41||LA60_0==43||LA60_0==53) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalSim.g:5904:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_41);
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
    // InternalSim.g:5912:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5916:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSim.g:5917:2: rule__SComplexTypeFeatures__Group__2__Impl
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
    // InternalSim.g:5923:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5927:1: ( ( '}' ) )
            // InternalSim.g:5928:1: ( '}' )
            {
            // InternalSim.g:5928:1: ( '}' )
            // InternalSim.g:5929:2: '}'
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
    // InternalSim.g:5939:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5943:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSim.g:5944:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:5951:1: rule__SAssociation__Group_0__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5955:1: ( ( () ) )
            // InternalSim.g:5956:1: ( () )
            {
            // InternalSim.g:5956:1: ( () )
            // InternalSim.g:5957:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 
            // InternalSim.g:5958:2: ()
            // InternalSim.g:5958:3: 
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
    // InternalSim.g:5966:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5970:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSim.g:5971:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSim.g:5978:1: rule__SAssociation__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5982:1: ( ( 'grab' ) )
            // InternalSim.g:5983:1: ( 'grab' )
            {
            // InternalSim.g:5983:1: ( 'grab' )
            // InternalSim.g:5984:2: 'grab'
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
    // InternalSim.g:5993:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5997:1: ( rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 )
            // InternalSim.g:5998:2: rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6005:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__Alternatives_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6009:1: ( ( ( rule__SAssociation__Alternatives_0_2 ) ) )
            // InternalSim.g:6010:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            {
            // InternalSim.g:6010:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            // InternalSim.g:6011:2: ( rule__SAssociation__Alternatives_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 
            // InternalSim.g:6012:2: ( rule__SAssociation__Alternatives_0_2 )
            // InternalSim.g:6012:3: rule__SAssociation__Alternatives_0_2
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
    // InternalSim.g:6020:1: rule__SAssociation__Group_0__3 : rule__SAssociation__Group_0__3__Impl ;
    public final void rule__SAssociation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6024:1: ( rule__SAssociation__Group_0__3__Impl )
            // InternalSim.g:6025:2: rule__SAssociation__Group_0__3__Impl
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
    // InternalSim.g:6031:1: rule__SAssociation__Group_0__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAssociation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6035:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6036:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6036:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6037:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6038:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6038:3: rule__SAssociation__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6047:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6051:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSim.g:6052:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:6059:1: rule__SAssociation__Group_1__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6063:1: ( ( () ) )
            // InternalSim.g:6064:1: ( () )
            {
            // InternalSim.g:6064:1: ( () )
            // InternalSim.g:6065:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 
            // InternalSim.g:6066:2: ()
            // InternalSim.g:6066:3: 
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
    // InternalSim.g:6074:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6078:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSim.g:6079:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSim.g:6086:1: rule__SAssociation__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6090:1: ( ( 'morph' ) )
            // InternalSim.g:6091:1: ( 'morph' )
            {
            // InternalSim.g:6091:1: ( 'morph' )
            // InternalSim.g:6092:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:6101:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6105:1: ( rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 )
            // InternalSim.g:6106:2: rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6113:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__Alternatives_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6117:1: ( ( ( rule__SAssociation__Alternatives_1_2 ) ) )
            // InternalSim.g:6118:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            {
            // InternalSim.g:6118:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            // InternalSim.g:6119:2: ( rule__SAssociation__Alternatives_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 
            // InternalSim.g:6120:2: ( rule__SAssociation__Alternatives_1_2 )
            // InternalSim.g:6120:3: rule__SAssociation__Alternatives_1_2
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
    // InternalSim.g:6128:1: rule__SAssociation__Group_1__3 : rule__SAssociation__Group_1__3__Impl ;
    public final void rule__SAssociation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6132:1: ( rule__SAssociation__Group_1__3__Impl )
            // InternalSim.g:6133:2: rule__SAssociation__Group_1__3__Impl
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
    // InternalSim.g:6139:1: rule__SAssociation__Group_1__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAssociation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6143:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6144:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6144:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6145:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6146:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6146:3: rule__SAssociation__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6155:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6159:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSim.g:6160:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:6167:1: rule__SAssociation__Group_2__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6171:1: ( ( () ) )
            // InternalSim.g:6172:1: ( () )
            {
            // InternalSim.g:6172:1: ( () )
            // InternalSim.g:6173:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 
            // InternalSim.g:6174:2: ()
            // InternalSim.g:6174:3: 
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
    // InternalSim.g:6182:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6186:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSim.g:6187:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalSim.g:6194:1: rule__SAssociation__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6198:1: ( ( 'ditch' ) )
            // InternalSim.g:6199:1: ( 'ditch' )
            {
            // InternalSim.g:6199:1: ( 'ditch' )
            // InternalSim.g:6200:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:6209:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6213:1: ( rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 )
            // InternalSim.g:6214:2: rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6221:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__Alternatives_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6225:1: ( ( ( rule__SAssociation__Alternatives_2_2 ) ) )
            // InternalSim.g:6226:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            {
            // InternalSim.g:6226:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            // InternalSim.g:6227:2: ( rule__SAssociation__Alternatives_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 
            // InternalSim.g:6228:2: ( rule__SAssociation__Alternatives_2_2 )
            // InternalSim.g:6228:3: rule__SAssociation__Alternatives_2_2
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
    // InternalSim.g:6236:1: rule__SAssociation__Group_2__3 : rule__SAssociation__Group_2__3__Impl ;
    public final void rule__SAssociation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6240:1: ( rule__SAssociation__Group_2__3__Impl )
            // InternalSim.g:6241:2: rule__SAssociation__Group_2__3__Impl
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
    // InternalSim.g:6247:1: rule__SAssociation__Group_2__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAssociation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6251:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6252:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6252:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6253:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6254:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6254:3: rule__SAssociation__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6263:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6267:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSim.g:6268:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSim.g:6275:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6279:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSim.g:6280:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSim.g:6280:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSim.g:6281:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSim.g:6282:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:6282:3: rule__SAssociation__DerivedAssignment_3_0
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
    // InternalSim.g:6290:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6294:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSim.g:6295:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6302:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6306:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSim.g:6307:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSim.g:6307:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSim.g:6308:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSim.g:6309:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSim.g:6309:3: rule__SAssociation__Alternatives_3_1
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
    // InternalSim.g:6317:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6321:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSim.g:6322:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:6329:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6333:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSim.g:6334:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSim.g:6334:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSim.g:6335:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSim.g:6336:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSim.g:6336:3: rule__SAssociation__NameAssignment_3_2
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
    // InternalSim.g:6344:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6348:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSim.g:6349:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6356:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6360:1: ( ( ':' ) )
            // InternalSim.g:6361:1: ( ':' )
            {
            // InternalSim.g:6361:1: ( ':' )
            // InternalSim.g:6362:2: ':'
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
    // InternalSim.g:6371:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6375:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSim.g:6376:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:6383:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6387:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSim.g:6388:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSim.g:6388:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSim.g:6389:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSim.g:6390:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSim.g:6390:3: rule__SAssociation__TypeAssignment_3_4
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
    // InternalSim.g:6398:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6402:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSim.g:6403:2: rule__SAssociation__Group_3__5__Impl
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
    // InternalSim.g:6409:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6413:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSim.g:6414:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSim.g:6414:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSim.g:6415:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSim.g:6416:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSim.g:6416:3: rule__SAssociation__MultiplicityAssignment_3_5
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
    // InternalSim.g:6425:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6429:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSim.g:6430:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSim.g:6437:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6441:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSim.g:6442:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSim.g:6442:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSim.g:6443:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSim.g:6444:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSim.g:6444:3: rule__SAssociation__KindAssignment_3_1_1_0
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
    // InternalSim.g:6452:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6456:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSim.g:6457:2: rule__SAssociation__Group_3_1_1__1__Impl
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
    // InternalSim.g:6463:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6467:1: ( ( 'composite' ) )
            // InternalSim.g:6468:1: ( 'composite' )
            {
            // InternalSim.g:6468:1: ( 'composite' )
            // InternalSim.g:6469:2: 'composite'
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
    // InternalSim.g:6479:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6483:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSim.g:6484:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:6491:1: rule__SAttribute__Group_0__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6495:1: ( ( () ) )
            // InternalSim.g:6496:1: ( () )
            {
            // InternalSim.g:6496:1: ( () )
            // InternalSim.g:6497:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 
            // InternalSim.g:6498:2: ()
            // InternalSim.g:6498:3: 
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
    // InternalSim.g:6506:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6510:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSim.g:6511:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6518:1: rule__SAttribute__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6522:1: ( ( 'grab' ) )
            // InternalSim.g:6523:1: ( 'grab' )
            {
            // InternalSim.g:6523:1: ( 'grab' )
            // InternalSim.g:6524:2: 'grab'
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
    // InternalSim.g:6533:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6537:1: ( rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 )
            // InternalSim.g:6538:2: rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6545:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__Alternatives_0_2 )? ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6549:1: ( ( ( rule__SAttribute__Alternatives_0_2 )? ) )
            // InternalSim.g:6550:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            {
            // InternalSim.g:6550:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            // InternalSim.g:6551:2: ( rule__SAttribute__Alternatives_0_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 
            // InternalSim.g:6552:2: ( rule__SAttribute__Alternatives_0_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==17||LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:6552:3: rule__SAttribute__Alternatives_0_2
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
    // InternalSim.g:6560:1: rule__SAttribute__Group_0__3 : rule__SAttribute__Group_0__3__Impl ;
    public final void rule__SAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6564:1: ( rule__SAttribute__Group_0__3__Impl )
            // InternalSim.g:6565:2: rule__SAttribute__Group_0__3__Impl
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
    // InternalSim.g:6571:1: rule__SAttribute__Group_0__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6575:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6576:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6576:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6577:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6578:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6578:3: rule__SAttribute__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6587:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6591:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSim.g:6592:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:6599:1: rule__SAttribute__Group_1__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6603:1: ( ( () ) )
            // InternalSim.g:6604:1: ( () )
            {
            // InternalSim.g:6604:1: ( () )
            // InternalSim.g:6605:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 
            // InternalSim.g:6606:2: ()
            // InternalSim.g:6606:3: 
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
    // InternalSim.g:6614:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6618:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSim.g:6619:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6626:1: rule__SAttribute__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6630:1: ( ( 'morph' ) )
            // InternalSim.g:6631:1: ( 'morph' )
            {
            // InternalSim.g:6631:1: ( 'morph' )
            // InternalSim.g:6632:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:6641:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6645:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSim.g:6646:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6653:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__Alternatives_1_2 )? ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6657:1: ( ( ( rule__SAttribute__Alternatives_1_2 )? ) )
            // InternalSim.g:6658:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            {
            // InternalSim.g:6658:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            // InternalSim.g:6659:2: ( rule__SAttribute__Alternatives_1_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 
            // InternalSim.g:6660:2: ( rule__SAttribute__Alternatives_1_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==17||LA64_0==43) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSim.g:6660:3: rule__SAttribute__Alternatives_1_2
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
    // InternalSim.g:6668:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6672:1: ( rule__SAttribute__Group_1__3__Impl )
            // InternalSim.g:6673:2: rule__SAttribute__Group_1__3__Impl
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
    // InternalSim.g:6679:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6683:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6684:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6684:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6685:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6686:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6686:3: rule__SAttribute__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6695:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6699:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSim.g:6700:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:6707:1: rule__SAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6711:1: ( ( () ) )
            // InternalSim.g:6712:1: ( () )
            {
            // InternalSim.g:6712:1: ( () )
            // InternalSim.g:6713:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 
            // InternalSim.g:6714:2: ()
            // InternalSim.g:6714:3: 
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
    // InternalSim.g:6722:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6726:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSim.g:6727:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6734:1: rule__SAttribute__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6738:1: ( ( 'ditch' ) )
            // InternalSim.g:6739:1: ( 'ditch' )
            {
            // InternalSim.g:6739:1: ( 'ditch' )
            // InternalSim.g:6740:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:6749:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6753:1: ( rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 )
            // InternalSim.g:6754:2: rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSim.g:6761:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__Alternatives_2_2 )? ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6765:1: ( ( ( rule__SAttribute__Alternatives_2_2 )? ) )
            // InternalSim.g:6766:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            {
            // InternalSim.g:6766:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            // InternalSim.g:6767:2: ( rule__SAttribute__Alternatives_2_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 
            // InternalSim.g:6768:2: ( rule__SAttribute__Alternatives_2_2 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==17||LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:6768:3: rule__SAttribute__Alternatives_2_2
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
    // InternalSim.g:6776:1: rule__SAttribute__Group_2__3 : rule__SAttribute__Group_2__3__Impl ;
    public final void rule__SAttribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6780:1: ( rule__SAttribute__Group_2__3__Impl )
            // InternalSim.g:6781:2: rule__SAttribute__Group_2__3__Impl
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
    // InternalSim.g:6787:1: rule__SAttribute__Group_2__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAttribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6791:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6792:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6792:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6793:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6794:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6794:3: rule__SAttribute__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6803:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6807:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSim.g:6808:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalSim.g:6815:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6819:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSim.g:6820:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSim.g:6820:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSim.g:6821:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSim.g:6822:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:6822:3: rule__SAttribute__DetailAssignment_3_0
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
    // InternalSim.g:6830:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6834:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSim.g:6835:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:6842:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6846:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSim.g:6847:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSim.g:6847:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSim.g:6848:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSim.g:6849:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSim.g:6849:3: rule__SAttribute__NameAssignment_3_1
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
    // InternalSim.g:6857:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6861:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSim.g:6862:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:6869:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6873:1: ( ( ':' ) )
            // InternalSim.g:6874:1: ( ':' )
            {
            // InternalSim.g:6874:1: ( ':' )
            // InternalSim.g:6875:2: ':'
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
    // InternalSim.g:6884:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6888:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSim.g:6889:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6896:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6900:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSim.g:6901:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSim.g:6901:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSim.g:6902:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSim.g:6903:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSim.g:6903:3: rule__SAttribute__TypeAssignment_3_3
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
    // InternalSim.g:6911:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6915:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSim.g:6916:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalSim.g:6923:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6927:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSim.g:6928:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSim.g:6928:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSim.g:6929:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSim.g:6930:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==44) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSim.g:6930:3: rule__SAttribute__MultiplicityAssignment_3_4
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
    // InternalSim.g:6938:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6942:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSim.g:6943:2: rule__SAttribute__Group_3__5__Impl
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
    // InternalSim.g:6949:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6953:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSim.g:6954:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSim.g:6954:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSim.g:6955:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSim.g:6956:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==54) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSim.g:6956:3: rule__SAttribute__KeyAssignment_3_5
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
    // InternalSim.g:6965:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6969:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSim.g:6970:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:6977:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6981:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSim.g:6982:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSim.g:6982:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSim.g:6983:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSim.g:6984:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSim.g:6984:3: rule__SQuery__Alternatives_0_0
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
    // InternalSim.g:6992:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6996:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSim.g:6997:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalSim.g:7004:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7008:1: ( ( '(' ) )
            // InternalSim.g:7009:1: ( '(' )
            {
            // InternalSim.g:7009:1: ( '(' )
            // InternalSim.g:7010:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7019:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7023:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSim.g:7024:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalSim.g:7031:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7035:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSim.g:7036:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSim.g:7036:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSim.g:7037:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSim.g:7038:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSim.g:7038:3: rule__SQuery__Alternatives_0_2
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
    // InternalSim.g:7046:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7050:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSim.g:7051:2: rule__SQuery__Group_0__3__Impl
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
    // InternalSim.g:7057:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7061:1: ( ( ')' ) )
            // InternalSim.g:7062:1: ( ')' )
            {
            // InternalSim.g:7062:1: ( ')' )
            // InternalSim.g:7063:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7073:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7077:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSim.g:7078:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:7085:1: rule__SQuery__Group_0_0_0__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7089:1: ( ( () ) )
            // InternalSim.g:7090:1: ( () )
            {
            // InternalSim.g:7090:1: ( () )
            // InternalSim.g:7091:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 
            // InternalSim.g:7092:2: ()
            // InternalSim.g:7092:3: 
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
    // InternalSim.g:7100:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7104:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSim.g:7105:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalSim.g:7112:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7116:1: ( ( 'grab' ) )
            // InternalSim.g:7117:1: ( 'grab' )
            {
            // InternalSim.g:7117:1: ( 'grab' )
            // InternalSim.g:7118:2: 'grab'
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
    // InternalSim.g:7127:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7131:1: ( rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 )
            // InternalSim.g:7132:2: rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7139:1: rule__SQuery__Group_0_0_0__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7143:1: ( ( 'query' ) )
            // InternalSim.g:7144:1: ( 'query' )
            {
            // InternalSim.g:7144:1: ( 'query' )
            // InternalSim.g:7145:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:7154:1: rule__SQuery__Group_0_0_0__3 : rule__SQuery__Group_0_0_0__3__Impl ;
    public final void rule__SQuery__Group_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7158:1: ( rule__SQuery__Group_0_0_0__3__Impl )
            // InternalSim.g:7159:2: rule__SQuery__Group_0_0_0__3__Impl
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
    // InternalSim.g:7165:1: rule__SQuery__Group_0_0_0__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) ;
    public final void rule__SQuery__Group_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7169:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) )
            // InternalSim.g:7170:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            {
            // InternalSim.g:7170:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            // InternalSim.g:7171:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 
            // InternalSim.g:7172:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            // InternalSim.g:7172:3: rule__SQuery__DeductionRuleAssignment_0_0_0_3
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
    // InternalSim.g:7181:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7185:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSim.g:7186:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalSim.g:7193:1: rule__SQuery__Group_0_0_1__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7197:1: ( ( () ) )
            // InternalSim.g:7198:1: ( () )
            {
            // InternalSim.g:7198:1: ( () )
            // InternalSim.g:7199:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 
            // InternalSim.g:7200:2: ()
            // InternalSim.g:7200:3: 
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
    // InternalSim.g:7208:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7212:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSim.g:7213:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalSim.g:7220:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7224:1: ( ( 'morph' ) )
            // InternalSim.g:7225:1: ( 'morph' )
            {
            // InternalSim.g:7225:1: ( 'morph' )
            // InternalSim.g:7226:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:7235:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7239:1: ( rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 )
            // InternalSim.g:7240:2: rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7247:1: rule__SQuery__Group_0_0_1__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7251:1: ( ( 'query' ) )
            // InternalSim.g:7252:1: ( 'query' )
            {
            // InternalSim.g:7252:1: ( 'query' )
            // InternalSim.g:7253:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:7262:1: rule__SQuery__Group_0_0_1__3 : rule__SQuery__Group_0_0_1__3__Impl ;
    public final void rule__SQuery__Group_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7266:1: ( rule__SQuery__Group_0_0_1__3__Impl )
            // InternalSim.g:7267:2: rule__SQuery__Group_0_0_1__3__Impl
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
    // InternalSim.g:7273:1: rule__SQuery__Group_0_0_1__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) ;
    public final void rule__SQuery__Group_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7277:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) )
            // InternalSim.g:7278:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            {
            // InternalSim.g:7278:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            // InternalSim.g:7279:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 
            // InternalSim.g:7280:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            // InternalSim.g:7280:3: rule__SQuery__DeductionRuleAssignment_0_0_1_3
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
    // InternalSim.g:7289:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7293:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSim.g:7294:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSim.g:7301:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7305:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSim.g:7306:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSim.g:7306:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSim.g:7307:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSim.g:7308:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSim.g:7308:3: rule__SQuery__ParametersAssignment_0_2_1_0
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
    // InternalSim.g:7316:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7320:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSim.g:7321:2: rule__SQuery__Group_0_2_1__1__Impl
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
    // InternalSim.g:7327:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7331:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSim.g:7332:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSim.g:7332:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSim.g:7333:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSim.g:7334:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==39) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSim.g:7334:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalSim.g:7343:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7347:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSim.g:7348:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalSim.g:7355:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7359:1: ( ( ',' ) )
            // InternalSim.g:7360:1: ( ',' )
            {
            // InternalSim.g:7360:1: ( ',' )
            // InternalSim.g:7361:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:7370:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7374:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSim.g:7375:2: rule__SQuery__Group_0_2_1_1__1__Impl
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
    // InternalSim.g:7381:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7385:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSim.g:7386:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSim.g:7386:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSim.g:7387:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSim.g:7388:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSim.g:7388:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
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
    // InternalSim.g:7397:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7401:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSim.g:7402:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalSim.g:7409:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7413:1: ( ( 'ditch' ) )
            // InternalSim.g:7414:1: ( 'ditch' )
            {
            // InternalSim.g:7414:1: ( 'ditch' )
            // InternalSim.g:7415:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:7424:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7428:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSim.g:7429:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7436:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7440:1: ( ( 'query' ) )
            // InternalSim.g:7441:1: ( 'query' )
            {
            // InternalSim.g:7441:1: ( 'query' )
            // InternalSim.g:7442:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSim.g:7451:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7455:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSim.g:7456:2: rule__SQuery__Group_1__2__Impl
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
    // InternalSim.g:7462:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7466:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7467:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7467:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7468:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7469:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7469:3: rule__SQuery__DeductionRuleAssignment_1_2
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
    // InternalSim.g:7478:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7482:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSim.g:7483:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:7490:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7494:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSim.g:7495:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSim.g:7495:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSim.g:7496:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSim.g:7497:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSim.g:7497:3: rule__SQuery__NameAssignment_2_0
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
    // InternalSim.g:7505:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7509:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSim.g:7510:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalSim.g:7517:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7521:1: ( ( '(' ) )
            // InternalSim.g:7522:1: ( '(' )
            {
            // InternalSim.g:7522:1: ( '(' )
            // InternalSim.g:7523:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7532:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7536:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSim.g:7537:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalSim.g:7544:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7548:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSim.g:7549:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSim.g:7549:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSim.g:7550:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSim.g:7551:2: ( rule__SQuery__Group_2_2__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||LA70_0==32||LA70_0==38||LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:7551:3: rule__SQuery__Group_2_2__0
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
    // InternalSim.g:7559:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7563:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSim.g:7564:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:7571:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7575:1: ( ( ')' ) )
            // InternalSim.g:7576:1: ( ')' )
            {
            // InternalSim.g:7576:1: ( ')' )
            // InternalSim.g:7577:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7586:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7590:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSim.g:7591:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7598:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7602:1: ( ( ':' ) )
            // InternalSim.g:7603:1: ( ':' )
            {
            // InternalSim.g:7603:1: ( ':' )
            // InternalSim.g:7604:2: ':'
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
    // InternalSim.g:7613:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7617:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSim.g:7618:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
            {
            pushFollow(FOLLOW_54);
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
    // InternalSim.g:7625:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7629:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSim.g:7630:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSim.g:7630:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSim.g:7631:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSim.g:7632:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSim.g:7632:3: rule__SQuery__TypeAssignment_2_5
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
    // InternalSim.g:7640:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7644:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSim.g:7645:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
            {
            pushFollow(FOLLOW_54);
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
    // InternalSim.g:7652:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7656:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSim.g:7657:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSim.g:7657:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSim.g:7658:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSim.g:7659:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSim.g:7659:3: rule__SQuery__MultiplicityAssignment_2_6
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
    // InternalSim.g:7667:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7671:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSim.g:7672:2: rule__SQuery__Group_2__7__Impl
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
    // InternalSim.g:7678:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7682:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSim.g:7683:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSim.g:7683:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSim.g:7684:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSim.g:7685:2: ( rule__SQuery__Group_2_7__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==47) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalSim.g:7685:3: rule__SQuery__Group_2_7__0
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
    // InternalSim.g:7694:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7698:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSim.g:7699:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSim.g:7706:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7710:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSim.g:7711:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSim.g:7711:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSim.g:7712:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSim.g:7713:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSim.g:7713:3: rule__SQuery__ParametersAssignment_2_2_0
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
    // InternalSim.g:7721:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7725:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSim.g:7726:2: rule__SQuery__Group_2_2__1__Impl
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
    // InternalSim.g:7732:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7736:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSim.g:7737:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSim.g:7737:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSim.g:7738:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSim.g:7739:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==39) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalSim.g:7739:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalSim.g:7748:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7752:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSim.g:7753:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalSim.g:7760:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7764:1: ( ( ',' ) )
            // InternalSim.g:7765:1: ( ',' )
            {
            // InternalSim.g:7765:1: ( ',' )
            // InternalSim.g:7766:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:7775:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7779:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSim.g:7780:2: rule__SQuery__Group_2_2_1__1__Impl
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
    // InternalSim.g:7786:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7790:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSim.g:7791:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSim.g:7791:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSim.g:7792:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSim.g:7793:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSim.g:7793:3: rule__SQuery__ParametersAssignment_2_2_1_1
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
    // InternalSim.g:7802:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7806:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSim.g:7807:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:7814:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7818:1: ( ( 'returns' ) )
            // InternalSim.g:7819:1: ( 'returns' )
            {
            // InternalSim.g:7819:1: ( 'returns' )
            // InternalSim.g:7820:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSim.g:7829:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7833:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSim.g:7834:2: rule__SQuery__Group_2_7__1__Impl
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
    // InternalSim.g:7840:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7844:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSim.g:7845:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSim.g:7845:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSim.g:7846:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSim.g:7847:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSim.g:7847:3: rule__SQuery__ReturnsAssignment_2_7_1
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
    // InternalSim.g:7856:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7860:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSim.g:7861:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:7868:1: rule__SQueryParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7872:1: ( ( () ) )
            // InternalSim.g:7873:1: ( () )
            {
            // InternalSim.g:7873:1: ( () )
            // InternalSim.g:7874:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 
            // InternalSim.g:7875:2: ()
            // InternalSim.g:7875:3: 
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
    // InternalSim.g:7883:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7887:1: ( rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 )
            // InternalSim.g:7888:2: rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7895:1: rule__SQueryParameter__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7899:1: ( ( 'grab' ) )
            // InternalSim.g:7900:1: ( 'grab' )
            {
            // InternalSim.g:7900:1: ( 'grab' )
            // InternalSim.g:7901:2: 'grab'
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
    // InternalSim.g:7910:1: rule__SQueryParameter__Group_0__2 : rule__SQueryParameter__Group_0__2__Impl ;
    public final void rule__SQueryParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7914:1: ( rule__SQueryParameter__Group_0__2__Impl )
            // InternalSim.g:7915:2: rule__SQueryParameter__Group_0__2__Impl
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
    // InternalSim.g:7921:1: rule__SQueryParameter__Group_0__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SQueryParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7925:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:7926:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:7926:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:7927:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:7928:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            // InternalSim.g:7928:3: rule__SQueryParameter__DeductionRuleAssignment_0_2
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
    // InternalSim.g:7937:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7941:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSim.g:7942:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSim.g:7949:1: rule__SQueryParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7953:1: ( ( () ) )
            // InternalSim.g:7954:1: ( () )
            {
            // InternalSim.g:7954:1: ( () )
            // InternalSim.g:7955:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 
            // InternalSim.g:7956:2: ()
            // InternalSim.g:7956:3: 
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
    // InternalSim.g:7964:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7968:1: ( rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 )
            // InternalSim.g:7969:2: rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:7976:1: rule__SQueryParameter__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7980:1: ( ( 'morph' ) )
            // InternalSim.g:7981:1: ( 'morph' )
            {
            // InternalSim.g:7981:1: ( 'morph' )
            // InternalSim.g:7982:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:7991:1: rule__SQueryParameter__Group_1__2 : rule__SQueryParameter__Group_1__2__Impl ;
    public final void rule__SQueryParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7995:1: ( rule__SQueryParameter__Group_1__2__Impl )
            // InternalSim.g:7996:2: rule__SQueryParameter__Group_1__2__Impl
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
    // InternalSim.g:8002:1: rule__SQueryParameter__Group_1__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQueryParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8006:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:8007:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:8007:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:8008:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:8009:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            // InternalSim.g:8009:3: rule__SQueryParameter__DeductionRuleAssignment_1_2
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
    // InternalSim.g:8018:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8022:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSim.g:8023:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSim.g:8030:1: rule__SQueryParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8034:1: ( ( () ) )
            // InternalSim.g:8035:1: ( () )
            {
            // InternalSim.g:8035:1: ( () )
            // InternalSim.g:8036:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 
            // InternalSim.g:8037:2: ()
            // InternalSim.g:8037:3: 
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
    // InternalSim.g:8045:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8049:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSim.g:8050:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:8057:1: rule__SQueryParameter__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8061:1: ( ( 'ditch' ) )
            // InternalSim.g:8062:1: ( 'ditch' )
            {
            // InternalSim.g:8062:1: ( 'ditch' )
            // InternalSim.g:8063:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:8072:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8076:1: ( rule__SQueryParameter__Group_2__2__Impl )
            // InternalSim.g:8077:2: rule__SQueryParameter__Group_2__2__Impl
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
    // InternalSim.g:8083:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8087:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) )
            // InternalSim.g:8088:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSim.g:8088:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            // InternalSim.g:8089:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSim.g:8090:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            // InternalSim.g:8090:3: rule__SQueryParameter__DeductionRuleAssignment_2_2
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
    // InternalSim.g:8099:1: rule__SQueryParameter__Group_3__0 : rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 ;
    public final void rule__SQueryParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8103:1: ( rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 )
            // InternalSim.g:8104:2: rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:8111:1: rule__SQueryParameter__Group_3__0__Impl : ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) ;
    public final void rule__SQueryParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8115:1: ( ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) )
            // InternalSim.g:8116:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            {
            // InternalSim.g:8116:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            // InternalSim.g:8117:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 
            // InternalSim.g:8118:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            // InternalSim.g:8118:3: rule__SQueryParameter__NameAssignment_3_0
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
    // InternalSim.g:8126:1: rule__SQueryParameter__Group_3__1 : rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 ;
    public final void rule__SQueryParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8130:1: ( rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 )
            // InternalSim.g:8131:2: rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:8138:1: rule__SQueryParameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8142:1: ( ( ':' ) )
            // InternalSim.g:8143:1: ( ':' )
            {
            // InternalSim.g:8143:1: ( ':' )
            // InternalSim.g:8144:2: ':'
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
    // InternalSim.g:8153:1: rule__SQueryParameter__Group_3__2 : rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 ;
    public final void rule__SQueryParameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8157:1: ( rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 )
            // InternalSim.g:8158:2: rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:8165:1: rule__SQueryParameter__Group_3__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) ;
    public final void rule__SQueryParameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8169:1: ( ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) )
            // InternalSim.g:8170:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            {
            // InternalSim.g:8170:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            // InternalSim.g:8171:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 
            // InternalSim.g:8172:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            // InternalSim.g:8172:3: rule__SQueryParameter__TypeAssignment_3_2
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
    // InternalSim.g:8180:1: rule__SQueryParameter__Group_3__3 : rule__SQueryParameter__Group_3__3__Impl ;
    public final void rule__SQueryParameter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8184:1: ( rule__SQueryParameter__Group_3__3__Impl )
            // InternalSim.g:8185:2: rule__SQueryParameter__Group_3__3__Impl
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
    // InternalSim.g:8191:1: rule__SQueryParameter__Group_3__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) ;
    public final void rule__SQueryParameter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8195:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) )
            // InternalSim.g:8196:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            {
            // InternalSim.g:8196:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            // InternalSim.g:8197:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 
            // InternalSim.g:8198:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==44) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSim.g:8198:3: rule__SQueryParameter__MultiplicityAssignment_3_3
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
    // InternalSim.g:8207:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8211:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSim.g:8212:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalSim.g:8219:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8223:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8224:1: ( ruleSQualifiedName )
            {
            // InternalSim.g:8224:1: ( ruleSQualifiedName )
            // InternalSim.g:8225:2: ruleSQualifiedName
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
    // InternalSim.g:8234:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8238:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSim.g:8239:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSim.g:8245:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8249:1: ( ( ( '.*' )? ) )
            // InternalSim.g:8250:1: ( ( '.*' )? )
            {
            // InternalSim.g:8250:1: ( ( '.*' )? )
            // InternalSim.g:8251:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSim.g:8252:2: ( '.*' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==48) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSim.g:8252:3: '.*'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalSim.g:8261:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8265:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSim.g:8266:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalSim.g:8273:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8277:1: ( ( RULE_ID ) )
            // InternalSim.g:8278:1: ( RULE_ID )
            {
            // InternalSim.g:8278:1: ( RULE_ID )
            // InternalSim.g:8279:2: RULE_ID
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
    // InternalSim.g:8288:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8292:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSim.g:8293:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSim.g:8299:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8303:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSim.g:8304:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSim.g:8304:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSim.g:8305:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSim.g:8306:2: ( rule__SQualifiedName__Group_1__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==49) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalSim.g:8306:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
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
    // InternalSim.g:8315:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8319:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSim.g:8320:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSim.g:8327:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8331:1: ( ( '.' ) )
            // InternalSim.g:8332:1: ( '.' )
            {
            // InternalSim.g:8332:1: ( '.' )
            // InternalSim.g:8333:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:8342:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8346:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSim.g:8347:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSim.g:8353:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8357:1: ( ( RULE_ID ) )
            // InternalSim.g:8358:1: ( RULE_ID )
            {
            // InternalSim.g:8358:1: ( RULE_ID )
            // InternalSim.g:8359:2: RULE_ID
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
    // InternalSim.g:8369:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8373:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSim.g:8374:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalSim.g:8381:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8385:1: ( ( '(' ) )
            // InternalSim.g:8386:1: ( '(' )
            {
            // InternalSim.g:8386:1: ( '(' )
            // InternalSim.g:8387:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:8396:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8400:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSim.g:8401:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalSim.g:8408:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8412:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSim.g:8413:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSim.g:8413:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSim.g:8414:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSim.g:8415:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSim.g:8415:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSim.g:8423:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8427:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSim.g:8428:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
            {
            pushFollow(FOLLOW_60);
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
    // InternalSim.g:8435:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8439:1: ( ( '..' ) )
            // InternalSim.g:8440:1: ( '..' )
            {
            // InternalSim.g:8440:1: ( '..' )
            // InternalSim.g:8441:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:8450:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8454:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSim.g:8455:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalSim.g:8462:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8466:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSim.g:8467:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSim.g:8467:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSim.g:8468:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSim.g:8469:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSim.g:8469:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSim.g:8477:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8481:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSim.g:8482:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSim.g:8488:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8492:1: ( ( ')' ) )
            // InternalSim.g:8493:1: ( ')' )
            {
            // InternalSim.g:8493:1: ( ')' )
            // InternalSim.g:8494:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__SInformationModel__DeducedAssignment_0"
    // InternalSim.g:8504:1: rule__SInformationModel__DeducedAssignment_0 : ( ( 'deduced' ) ) ;
    public final void rule__SInformationModel__DeducedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8508:1: ( ( ( 'deduced' ) ) )
            // InternalSim.g:8509:2: ( ( 'deduced' ) )
            {
            // InternalSim.g:8509:2: ( ( 'deduced' ) )
            // InternalSim.g:8510:3: ( 'deduced' )
            {
             before(grammarAccess.getSInformationModelAccess().getDeducedDeducedKeyword_0_0()); 
            // InternalSim.g:8511:3: ( 'deduced' )
            // InternalSim.g:8512:4: 'deduced'
            {
             before(grammarAccess.getSInformationModelAccess().getDeducedDeducedKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSInformationModelAccess().getDeducedDeducedKeyword_0_0()); 

            }

             after(grammarAccess.getSInformationModelAccess().getDeducedDeducedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__DeducedAssignment_0"


    // $ANTLR start "rule__SInformationModel__KindAssignment_1"
    // InternalSim.g:8523:1: rule__SInformationModel__KindAssignment_1 : ( ruleSInformationModelKind ) ;
    public final void rule__SInformationModel__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8527:1: ( ( ruleSInformationModelKind ) )
            // InternalSim.g:8528:2: ( ruleSInformationModelKind )
            {
            // InternalSim.g:8528:2: ( ruleSInformationModelKind )
            // InternalSim.g:8529:3: ruleSInformationModelKind
            {
             before(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSInformationModelKind();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getKindSInformationModelKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__KindAssignment_1"


    // $ANTLR start "rule__SInformationModel__NameAssignment_4"
    // InternalSim.g:8538:1: rule__SInformationModel__NameAssignment_4 : ( ruleSQualifiedName ) ;
    public final void rule__SInformationModel__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8542:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8543:2: ( ruleSQualifiedName )
            {
            // InternalSim.g:8543:2: ( ruleSQualifiedName )
            // InternalSim.g:8544:3: ruleSQualifiedName
            {
             before(grammarAccess.getSInformationModelAccess().getNameSQualifiedNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSInformationModelAccess().getNameSQualifiedNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SInformationModel__NameAssignment_4"


    // $ANTLR start "rule__SInformationModel__ImportsAssignment_5"
    // InternalSim.g:8553:1: rule__SInformationModel__ImportsAssignment_5 : ( ruleSImport ) ;
    public final void rule__SInformationModel__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8557:1: ( ( ruleSImport ) )
            // InternalSim.g:8558:2: ( ruleSImport )
            {
            // InternalSim.g:8558:2: ( ruleSImport )
            // InternalSim.g:8559:3: ruleSImport
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
    // InternalSim.g:8568:1: rule__SInformationModel__TypesAssignment_6_0 : ( ruleSType ) ;
    public final void rule__SInformationModel__TypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8572:1: ( ( ruleSType ) )
            // InternalSim.g:8573:2: ( ruleSType )
            {
            // InternalSim.g:8573:2: ( ruleSType )
            // InternalSim.g:8574:3: ruleSType
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
    // InternalSim.g:8583:1: rule__SInformationModel__AggregatesAssignment_6_1 : ( ruleSAggregate ) ;
    public final void rule__SInformationModel__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8587:1: ( ( ruleSAggregate ) )
            // InternalSim.g:8588:2: ( ruleSAggregate )
            {
            // InternalSim.g:8588:2: ( ruleSAggregate )
            // InternalSim.g:8589:3: ruleSAggregate
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


    // $ANTLR start "rule__SImport__ImportedNamespaceAssignment_1"
    // InternalSim.g:8598:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8602:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:8603:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:8603:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSim.g:8604:3: ruleSQualifiedNameWithWildcard
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
    // InternalSim.g:8613:1: rule__SGrabAggregateRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8617:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8618:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8618:2: ( ( RULE_ID ) )
            // InternalSim.g:8619:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSim.g:8620:3: ( RULE_ID )
            // InternalSim.g:8621:4: RULE_ID
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
    // InternalSim.g:8632:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8636:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8637:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8637:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8638:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSim.g:8639:3: ( ruleSQualifiedName )
            // InternalSim.g:8640:4: ruleSQualifiedName
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
    // InternalSim.g:8651:1: rule__SGrabEnumerationRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8655:1: ( ( RULE_ID ) )
            // InternalSim.g:8656:2: ( RULE_ID )
            {
            // InternalSim.g:8656:2: ( RULE_ID )
            // InternalSim.g:8657:3: RULE_ID
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
    // InternalSim.g:8666:1: rule__SDitchEnumerationRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8670:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8671:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8671:2: ( ( RULE_ID ) )
            // InternalSim.g:8672:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8673:3: ( RULE_ID )
            // InternalSim.g:8674:4: RULE_ID
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
    // InternalSim.g:8685:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8689:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8690:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8690:2: ( ( RULE_ID ) )
            // InternalSim.g:8691:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSim.g:8692:3: ( RULE_ID )
            // InternalSim.g:8693:4: RULE_ID
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
    // InternalSim.g:8704:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8708:1: ( ( RULE_ID ) )
            // InternalSim.g:8709:2: ( RULE_ID )
            {
            // InternalSim.g:8709:2: ( RULE_ID )
            // InternalSim.g:8710:3: RULE_ID
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
    // InternalSim.g:8719:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8723:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8724:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8724:2: ( ( RULE_ID ) )
            // InternalSim.g:8725:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSim.g:8726:3: ( RULE_ID )
            // InternalSim.g:8727:4: RULE_ID
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
    // InternalSim.g:8738:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8742:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8743:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8743:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8744:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8745:3: ( ruleSQualifiedName )
            // InternalSim.g:8746:4: ruleSQualifiedName
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
    // InternalSim.g:8757:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8761:1: ( ( RULE_ID ) )
            // InternalSim.g:8762:2: ( RULE_ID )
            {
            // InternalSim.g:8762:2: ( RULE_ID )
            // InternalSim.g:8763:3: RULE_ID
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
    // InternalSim.g:8772:1: rule__SDitchComplexTypeRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchComplexTypeRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8776:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8777:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8777:2: ( ( RULE_ID ) )
            // InternalSim.g:8778:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8779:3: ( RULE_ID )
            // InternalSim.g:8780:4: RULE_ID
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
    // InternalSim.g:8791:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8795:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8796:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8796:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8797:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8798:3: ( ruleSQualifiedName )
            // InternalSim.g:8799:4: ruleSQualifiedName
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
    // InternalSim.g:8810:1: rule__SMorphComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8814:1: ( ( RULE_ID ) )
            // InternalSim.g:8815:2: ( RULE_ID )
            {
            // InternalSim.g:8815:2: ( RULE_ID )
            // InternalSim.g:8816:3: RULE_ID
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
    // InternalSim.g:8825:1: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphComplexTypeRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8829:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8830:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8830:2: ( ( RULE_ID ) )
            // InternalSim.g:8831:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 
            // InternalSim.g:8832:3: ( RULE_ID )
            // InternalSim.g:8833:4: RULE_ID
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
    // InternalSim.g:8844:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8848:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8849:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8849:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8850:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8851:3: ( ruleSQualifiedName )
            // InternalSim.g:8852:4: ruleSQualifiedName
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
    // InternalSim.g:8863:1: rule__SFuseComplexTypeRule__Source2Assignment_2 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__Source2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8867:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8868:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8868:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8869:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0()); 
            // InternalSim.g:8870:3: ( ruleSQualifiedName )
            // InternalSim.g:8871:4: ruleSQualifiedName
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
    // InternalSim.g:8882:1: rule__SFuseComplexTypeRule__RenameToAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SFuseComplexTypeRule__RenameToAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8886:1: ( ( RULE_ID ) )
            // InternalSim.g:8887:2: ( RULE_ID )
            {
            // InternalSim.g:8887:2: ( RULE_ID )
            // InternalSim.g:8888:3: RULE_ID
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
    // InternalSim.g:8897:1: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8901:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8902:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8902:2: ( ( RULE_ID ) )
            // InternalSim.g:8903:3: ( RULE_ID )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 
            // InternalSim.g:8904:3: ( RULE_ID )
            // InternalSim.g:8905:4: RULE_ID
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
    // InternalSim.g:8916:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8920:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8921:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8921:2: ( ( RULE_ID ) )
            // InternalSim.g:8922:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:8923:3: ( RULE_ID )
            // InternalSim.g:8924:4: RULE_ID
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
    // InternalSim.g:8935:1: rule__SGrabFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8939:1: ( ( RULE_ID ) )
            // InternalSim.g:8940:2: ( RULE_ID )
            {
            // InternalSim.g:8940:2: ( RULE_ID )
            // InternalSim.g:8941:3: RULE_ID
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
    // InternalSim.g:8950:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8954:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8955:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8955:2: ( ( RULE_ID ) )
            // InternalSim.g:8956:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:8957:3: ( RULE_ID )
            // InternalSim.g:8958:4: RULE_ID
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
    // InternalSim.g:8969:1: rule__SMorphFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8973:1: ( ( RULE_ID ) )
            // InternalSim.g:8974:2: ( RULE_ID )
            {
            // InternalSim.g:8974:2: ( RULE_ID )
            // InternalSim.g:8975:3: RULE_ID
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
    // InternalSim.g:8984:1: rule__SMorphFeatureRule__RetypeToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8988:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8989:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8989:2: ( ( RULE_ID ) )
            // InternalSim.g:8990:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0()); 
            // InternalSim.g:8991:3: ( RULE_ID )
            // InternalSim.g:8992:4: RULE_ID
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
    // InternalSim.g:9003:1: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9007:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9008:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9008:2: ( ruleSMultiplicity )
            // InternalSim.g:9009:3: ruleSMultiplicity
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
    // InternalSim.g:9018:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9022:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9023:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9023:2: ( ( RULE_ID ) )
            // InternalSim.g:9024:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSim.g:9025:3: ( RULE_ID )
            // InternalSim.g:9026:4: RULE_ID
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
    // InternalSim.g:9037:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9041:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSim.g:9042:2: ( ruleSGrabAggregateRule )
            {
            // InternalSim.g:9042:2: ( ruleSGrabAggregateRule )
            // InternalSim.g:9043:3: ruleSGrabAggregateRule
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
    // InternalSim.g:9052:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9056:1: ( ( ruleSType ) )
            // InternalSim.g:9057:2: ( ruleSType )
            {
            // InternalSim.g:9057:2: ( ruleSType )
            // InternalSim.g:9058:3: ruleSType
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
    // InternalSim.g:9067:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9071:1: ( ( RULE_ID ) )
            // InternalSim.g:9072:2: ( RULE_ID )
            {
            // InternalSim.g:9072:2: ( RULE_ID )
            // InternalSim.g:9073:3: RULE_ID
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
    // InternalSim.g:9082:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9086:1: ( ( ruleSExpression ) )
            // InternalSim.g:9087:2: ( ruleSExpression )
            {
            // InternalSim.g:9087:2: ( ruleSExpression )
            // InternalSim.g:9088:3: ruleSExpression
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
    // InternalSim.g:9097:1: rule__SPrimitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9101:1: ( ( RULE_ID ) )
            // InternalSim.g:9102:2: ( RULE_ID )
            {
            // InternalSim.g:9102:2: ( RULE_ID )
            // InternalSim.g:9103:3: RULE_ID
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
    // InternalSim.g:9112:1: rule__SPrimitive__RedefinesAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9116:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9117:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9117:2: ( ( RULE_ID ) )
            // InternalSim.g:9118:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_2_0_1_0()); 
            // InternalSim.g:9119:3: ( RULE_ID )
            // InternalSim.g:9120:4: RULE_ID
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
    // InternalSim.g:9131:1: rule__SPrimitive__RealizesAssignment_2_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SPrimitive__RealizesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9135:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:9136:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:9136:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:9137:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_2_1_1_0()); 
            // InternalSim.g:9138:3: ( ruleSQualifiedName )
            // InternalSim.g:9139:4: ruleSQualifiedName
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
    // InternalSim.g:9150:1: rule__SPrimitive__ConstraintsAssignment_4 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9154:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9155:2: ( ruleSConstraint )
            {
            // InternalSim.g:9155:2: ( ruleSConstraint )
            // InternalSim.g:9156:3: ruleSConstraint
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
    // InternalSim.g:9165:1: rule__SPrimitiveArchetype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitiveArchetype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9169:1: ( ( RULE_ID ) )
            // InternalSim.g:9170:2: ( RULE_ID )
            {
            // InternalSim.g:9170:2: ( RULE_ID )
            // InternalSim.g:9171:3: RULE_ID
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
    // InternalSim.g:9180:1: rule__SPrimitiveArchetype__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SPrimitiveArchetype__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9184:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9185:2: ( ruleSConstraint )
            {
            // InternalSim.g:9185:2: ( ruleSConstraint )
            // InternalSim.g:9186:3: ruleSConstraint
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
    // InternalSim.g:9195:1: rule__SEnumeration__DeductionRuleAssignment_0_0_3 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9199:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSim.g:9200:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSim.g:9200:2: ( ruleSGrabEnumerationRule )
            // InternalSim.g:9201:3: ruleSGrabEnumerationRule
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
    // InternalSim.g:9210:1: rule__SEnumeration__DeductionRuleAssignment_0_1_3 : ( ruleSDitchEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9214:1: ( ( ruleSDitchEnumerationRule ) )
            // InternalSim.g:9215:2: ( ruleSDitchEnumerationRule )
            {
            // InternalSim.g:9215:2: ( ruleSDitchEnumerationRule )
            // InternalSim.g:9216:3: ruleSDitchEnumerationRule
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
    // InternalSim.g:9225:1: rule__SEnumeration__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9229:1: ( ( RULE_ID ) )
            // InternalSim.g:9230:2: ( RULE_ID )
            {
            // InternalSim.g:9230:2: ( RULE_ID )
            // InternalSim.g:9231:3: RULE_ID
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
    // InternalSim.g:9240:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9244:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9245:2: ( ruleSLiteral )
            {
            // InternalSim.g:9245:2: ( ruleSLiteral )
            // InternalSim.g:9246:3: ruleSLiteral
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
    // InternalSim.g:9255:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9259:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9260:2: ( ruleSLiteral )
            {
            // InternalSim.g:9260:2: ( ruleSLiteral )
            // InternalSim.g:9261:3: ruleSLiteral
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
    // InternalSim.g:9270:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9274:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9275:2: ( ruleSConstraint )
            {
            // InternalSim.g:9275:2: ( ruleSConstraint )
            // InternalSim.g:9276:3: ruleSConstraint
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
    // InternalSim.g:9285:1: rule__SLiteral__DeductionRuleAssignment_0_2 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9289:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSim.g:9290:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSim.g:9290:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSim.g:9291:3: ruleSGrabEnumerationLiteralRule
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
    // InternalSim.g:9300:1: rule__SLiteral__DeductionRuleAssignment_1_2 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9304:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSim.g:9305:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSim.g:9305:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSim.g:9306:3: ruleSDitchEnumerationLiteralRule
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
    // InternalSim.g:9315:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9319:1: ( ( RULE_ID ) )
            // InternalSim.g:9320:2: ( RULE_ID )
            {
            // InternalSim.g:9320:2: ( RULE_ID )
            // InternalSim.g:9321:3: RULE_ID
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
    // InternalSim.g:9330:1: rule__SRootType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9334:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9335:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9335:2: ( ( 'abstract' ) )
            // InternalSim.g:9336:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9337:3: ( 'abstract' )
            // InternalSim.g:9338:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9349:1: rule__SRootType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9353:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9354:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9354:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9355:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9364:1: rule__SRootType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9368:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9369:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9369:2: ( ( 'abstract' ) )
            // InternalSim.g:9370:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9371:3: ( 'abstract' )
            // InternalSim.g:9372:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9383:1: rule__SRootType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9387:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9388:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9388:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9389:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9398:1: rule__SRootType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9402:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9403:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9403:2: ( ( 'abstract' ) )
            // InternalSim.g:9404:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9405:3: ( 'abstract' )
            // InternalSim.g:9406:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9417:1: rule__SRootType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9421:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9422:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9422:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9423:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9432:1: rule__SRootType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9436:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9437:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9437:2: ( ( 'abstract' ) )
            // InternalSim.g:9438:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9439:3: ( 'abstract' )
            // InternalSim.g:9440:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9451:1: rule__SRootType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9455:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9456:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9456:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9457:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9466:1: rule__SRootType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9470:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9471:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9471:2: ( ( 'abstract' ) )
            // InternalSim.g:9472:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9473:3: ( 'abstract' )
            // InternalSim.g:9474:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9485:1: rule__SRootType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9489:1: ( ( RULE_ID ) )
            // InternalSim.g:9490:2: ( RULE_ID )
            {
            // InternalSim.g:9490:2: ( RULE_ID )
            // InternalSim.g:9491:3: RULE_ID
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
    // InternalSim.g:9500:1: rule__SDetailType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9504:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9505:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9505:2: ( ( 'abstract' ) )
            // InternalSim.g:9506:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9507:3: ( 'abstract' )
            // InternalSim.g:9508:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9519:1: rule__SDetailType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9523:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9524:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9524:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9525:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9534:1: rule__SDetailType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9538:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9539:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9539:2: ( ( 'abstract' ) )
            // InternalSim.g:9540:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9541:3: ( 'abstract' )
            // InternalSim.g:9542:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9553:1: rule__SDetailType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9557:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9558:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9558:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9559:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9568:1: rule__SDetailType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9572:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9573:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9573:2: ( ( 'abstract' ) )
            // InternalSim.g:9574:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9575:3: ( 'abstract' )
            // InternalSim.g:9576:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9587:1: rule__SDetailType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9591:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9592:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9592:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9593:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9602:1: rule__SDetailType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9606:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9607:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9607:2: ( ( 'abstract' ) )
            // InternalSim.g:9608:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9609:3: ( 'abstract' )
            // InternalSim.g:9610:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9621:1: rule__SDetailType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9625:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9626:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9626:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9627:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9636:1: rule__SDetailType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9640:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9641:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9641:2: ( ( 'abstract' ) )
            // InternalSim.g:9642:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9643:3: ( 'abstract' )
            // InternalSim.g:9644:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:9655:1: rule__SDetailType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9659:1: ( ( RULE_ID ) )
            // InternalSim.g:9660:2: ( RULE_ID )
            {
            // InternalSim.g:9660:2: ( RULE_ID )
            // InternalSim.g:9661:3: RULE_ID
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
    // InternalSim.g:9670:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9674:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9675:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9675:2: ( ( RULE_ID ) )
            // InternalSim.g:9676:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSim.g:9677:3: ( RULE_ID )
            // InternalSim.g:9678:4: RULE_ID
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
    // InternalSim.g:9689:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9693:1: ( ( ruleSFeature ) )
            // InternalSim.g:9694:2: ( ruleSFeature )
            {
            // InternalSim.g:9694:2: ( ruleSFeature )
            // InternalSim.g:9695:3: ruleSFeature
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
    // InternalSim.g:9704:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9708:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9709:2: ( ruleSConstraint )
            {
            // InternalSim.g:9709:2: ( ruleSConstraint )
            // InternalSim.g:9710:3: ruleSConstraint
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
    // InternalSim.g:9719:1: rule__SAssociation__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9723:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9724:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9724:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9725:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9734:1: rule__SAssociation__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9738:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9739:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9739:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9740:3: ruleSMorphFeatureRule
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
    // InternalSim.g:9749:1: rule__SAssociation__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9753:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9754:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9754:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9755:3: ruleSDitchFeatureRule
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
    // InternalSim.g:9764:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9768:1: ( ( ( 'derived' ) ) )
            // InternalSim.g:9769:2: ( ( 'derived' ) )
            {
            // InternalSim.g:9769:2: ( ( 'derived' ) )
            // InternalSim.g:9770:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSim.g:9771:3: ( 'derived' )
            // InternalSim.g:9772:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalSim.g:9783:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9787:1: ( ( ruleSAssociationKind ) )
            // InternalSim.g:9788:2: ( ruleSAssociationKind )
            {
            // InternalSim.g:9788:2: ( ruleSAssociationKind )
            // InternalSim.g:9789:3: ruleSAssociationKind
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
    // InternalSim.g:9798:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9802:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSim.g:9803:2: ( ruleSAssociationKindInverse )
            {
            // InternalSim.g:9803:2: ( ruleSAssociationKindInverse )
            // InternalSim.g:9804:3: ruleSAssociationKindInverse
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
    // InternalSim.g:9813:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9817:1: ( ( RULE_ID ) )
            // InternalSim.g:9818:2: ( RULE_ID )
            {
            // InternalSim.g:9818:2: ( RULE_ID )
            // InternalSim.g:9819:3: RULE_ID
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
    // InternalSim.g:9828:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9832:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9833:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9833:2: ( ( RULE_ID ) )
            // InternalSim.g:9834:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 
            // InternalSim.g:9835:3: ( RULE_ID )
            // InternalSim.g:9836:4: RULE_ID
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
    // InternalSim.g:9847:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9851:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9852:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9852:2: ( ruleSMultiplicity )
            // InternalSim.g:9853:3: ruleSMultiplicity
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
    // InternalSim.g:9862:1: rule__SAttribute__DetailAssignment_0_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9866:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9867:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9867:2: ( ( 'detail' ) )
            // InternalSim.g:9868:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            // InternalSim.g:9869:3: ( 'detail' )
            // InternalSim.g:9870:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:9881:1: rule__SAttribute__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9885:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9886:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9886:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9887:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9896:1: rule__SAttribute__DetailAssignment_1_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9900:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9901:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9901:2: ( ( 'detail' ) )
            // InternalSim.g:9902:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            // InternalSim.g:9903:3: ( 'detail' )
            // InternalSim.g:9904:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:9915:1: rule__SAttribute__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9919:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9920:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9920:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9921:3: ruleSMorphFeatureRule
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
    // InternalSim.g:9930:1: rule__SAttribute__DetailAssignment_2_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9934:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9935:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9935:2: ( ( 'detail' ) )
            // InternalSim.g:9936:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            // InternalSim.g:9937:3: ( 'detail' )
            // InternalSim.g:9938:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:9949:1: rule__SAttribute__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9953:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9954:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9954:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9955:3: ruleSDitchFeatureRule
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
    // InternalSim.g:9964:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9968:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9969:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9969:2: ( ( 'detail' ) )
            // InternalSim.g:9970:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSim.g:9971:3: ( 'detail' )
            // InternalSim.g:9972:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:9983:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9987:1: ( ( RULE_ID ) )
            // InternalSim.g:9988:2: ( RULE_ID )
            {
            // InternalSim.g:9988:2: ( RULE_ID )
            // InternalSim.g:9989:3: RULE_ID
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
    // InternalSim.g:9998:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10002:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10003:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10003:2: ( ( RULE_ID ) )
            // InternalSim.g:10004:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSim.g:10005:3: ( RULE_ID )
            // InternalSim.g:10006:4: RULE_ID
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
    // InternalSim.g:10017:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10021:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10022:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10022:2: ( ruleSMultiplicity )
            // InternalSim.g:10023:3: ruleSMultiplicity
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
    // InternalSim.g:10032:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10036:1: ( ( ( 'key' ) ) )
            // InternalSim.g:10037:2: ( ( 'key' ) )
            {
            // InternalSim.g:10037:2: ( ( 'key' ) )
            // InternalSim.g:10038:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSim.g:10039:3: ( 'key' )
            // InternalSim.g:10040:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalSim.g:10051:1: rule__SQuery__DeductionRuleAssignment_0_0_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10055:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10056:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10056:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10057:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10066:1: rule__SQuery__DeductionRuleAssignment_0_0_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10070:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10071:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10071:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10072:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10081:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10085:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10086:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10086:2: ( ruleSQueryParameter )
            // InternalSim.g:10087:3: ruleSQueryParameter
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
    // InternalSim.g:10096:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10100:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10101:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10101:2: ( ruleSQueryParameter )
            // InternalSim.g:10102:3: ruleSQueryParameter
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
    // InternalSim.g:10111:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10115:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10116:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10116:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10117:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10126:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10130:1: ( ( RULE_ID ) )
            // InternalSim.g:10131:2: ( RULE_ID )
            {
            // InternalSim.g:10131:2: ( RULE_ID )
            // InternalSim.g:10132:3: RULE_ID
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
    // InternalSim.g:10141:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10145:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10146:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10146:2: ( ruleSQueryParameter )
            // InternalSim.g:10147:3: ruleSQueryParameter
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
    // InternalSim.g:10156:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10160:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10161:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10161:2: ( ruleSQueryParameter )
            // InternalSim.g:10162:3: ruleSQueryParameter
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
    // InternalSim.g:10171:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10175:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10176:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10176:2: ( ( RULE_ID ) )
            // InternalSim.g:10177:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSim.g:10178:3: ( RULE_ID )
            // InternalSim.g:10179:4: RULE_ID
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
    // InternalSim.g:10190:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10194:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10195:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10195:2: ( ruleSMultiplicity )
            // InternalSim.g:10196:3: ruleSMultiplicity
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
    // InternalSim.g:10205:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10209:1: ( ( ruleSExpression ) )
            // InternalSim.g:10210:2: ( ruleSExpression )
            {
            // InternalSim.g:10210:2: ( ruleSExpression )
            // InternalSim.g:10211:3: ruleSExpression
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
    // InternalSim.g:10220:1: rule__SQueryParameter__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10224:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10225:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10225:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10226:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10235:1: rule__SQueryParameter__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10239:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10240:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10240:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10241:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10250:1: rule__SQueryParameter__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10254:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10255:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10255:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10256:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10265:1: rule__SQueryParameter__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10269:1: ( ( RULE_ID ) )
            // InternalSim.g:10270:2: ( RULE_ID )
            {
            // InternalSim.g:10270:2: ( RULE_ID )
            // InternalSim.g:10271:3: RULE_ID
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
    // InternalSim.g:10280:1: rule__SQueryParameter__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10284:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10285:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10285:2: ( ( RULE_ID ) )
            // InternalSim.g:10286:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 
            // InternalSim.g:10287:3: ( RULE_ID )
            // InternalSim.g:10288:4: RULE_ID
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
    // InternalSim.g:10299:1: rule__SQueryParameter__MultiplicityAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10303:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10304:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10304:2: ( ruleSMultiplicity )
            // InternalSim.g:10305:3: ruleSMultiplicity
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
    // InternalSim.g:10314:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10318:1: ( ( RULE_STRING ) )
            // InternalSim.g:10319:2: ( RULE_STRING )
            {
            // InternalSim.g:10319:2: ( RULE_STRING )
            // InternalSim.g:10320:3: RULE_STRING
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
    // InternalSim.g:10329:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10333:1: ( ( RULE_INT ) )
            // InternalSim.g:10334:2: ( RULE_INT )
            {
            // InternalSim.g:10334:2: ( RULE_INT )
            // InternalSim.g:10335:3: RULE_INT
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
    // InternalSim.g:10344:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10348:1: ( ( ruleMULTIPLICITY ) )
            // InternalSim.g:10349:2: ( ruleMULTIPLICITY )
            {
            // InternalSim.g:10349:2: ( ruleMULTIPLICITY )
            // InternalSim.g:10350:3: ruleMULTIPLICITY
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
    static final String dfa_2s = "\1\40\2\uffff\2\45\1\uffff\3\50\2\uffff\4\50";
    static final String dfa_3s = "\1\64\2\uffff\2\64\1\uffff\2\64\1\53\2\uffff\4\53";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\3\3\uffff\1\4\1\5\4\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\uffff\1\1\1\uffff\1\2\1\5\1\4\1\uffff\1\11\1\6\1\7\1\12\10\uffff\1\10",
            "",
            "",
            "\1\5\2\uffff\1\11\2\uffff\1\12\10\uffff\1\13",
            "\1\5\2\uffff\1\11\2\uffff\1\12\10\uffff\1\14",
            "",
            "\1\11\2\uffff\1\12\10\uffff\1\15",
            "\1\11\2\uffff\1\12\10\uffff\1\16",
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
            return "1001:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00100F7501001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00100F7500001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00100F7500001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00100F7580000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00100F7500000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800006000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004380000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004100000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010074100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00100F7500000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00200A4380018820L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00200A4300018822L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020024100018800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000020020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000A4100000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000024100040020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000024100000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000224100000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000040010L});

}