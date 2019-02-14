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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'aggregate'", "'reference'", "'composite'", "'attribute'", "'*'", "'base'", "'interface'", "'core'", "'information'", "'model'", "'import'", "'as'", "'extends'", "'='", "'and'", "':'", "'{'", "'}'", "'grab'", "'constraint'", "'primitive'", "'archetype'", "'redefines'", "'enumeration'", "'ditch'", "','", "'root'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'generate'", "'abstract'", "'derived'", "'key'"
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


    // $ANTLR start "entryRuleSGrabPrimitiveRule"
    // InternalSim.g:128:1: entryRuleSGrabPrimitiveRule : ruleSGrabPrimitiveRule EOF ;
    public final void entryRuleSGrabPrimitiveRule() throws RecognitionException {
        try {
            // InternalSim.g:129:1: ( ruleSGrabPrimitiveRule EOF )
            // InternalSim.g:130:1: ruleSGrabPrimitiveRule EOF
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
    // InternalSim.g:137:1: ruleSGrabPrimitiveRule : ( ( rule__SGrabPrimitiveRule__Group__0 ) ) ;
    public final void ruleSGrabPrimitiveRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:141:2: ( ( ( rule__SGrabPrimitiveRule__Group__0 ) ) )
            // InternalSim.g:142:2: ( ( rule__SGrabPrimitiveRule__Group__0 ) )
            {
            // InternalSim.g:142:2: ( ( rule__SGrabPrimitiveRule__Group__0 ) )
            // InternalSim.g:143:3: ( rule__SGrabPrimitiveRule__Group__0 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup()); 
            // InternalSim.g:144:3: ( rule__SGrabPrimitiveRule__Group__0 )
            // InternalSim.g:144:4: rule__SGrabPrimitiveRule__Group__0
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
    // InternalSim.g:153:1: entryRuleSGrabEnumerationRule : ruleSGrabEnumerationRule EOF ;
    public final void entryRuleSGrabEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:154:1: ( ruleSGrabEnumerationRule EOF )
            // InternalSim.g:155:1: ruleSGrabEnumerationRule EOF
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
    // InternalSim.g:162:1: ruleSGrabEnumerationRule : ( ( rule__SGrabEnumerationRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:166:2: ( ( ( rule__SGrabEnumerationRule__Group__0 ) ) )
            // InternalSim.g:167:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            {
            // InternalSim.g:167:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            // InternalSim.g:168:3: ( rule__SGrabEnumerationRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup()); 
            // InternalSim.g:169:3: ( rule__SGrabEnumerationRule__Group__0 )
            // InternalSim.g:169:4: rule__SGrabEnumerationRule__Group__0
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
    // InternalSim.g:178:1: entryRuleSDitchEnumerationRule : ruleSDitchEnumerationRule EOF ;
    public final void entryRuleSDitchEnumerationRule() throws RecognitionException {
        try {
            // InternalSim.g:179:1: ( ruleSDitchEnumerationRule EOF )
            // InternalSim.g:180:1: ruleSDitchEnumerationRule EOF
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
    // InternalSim.g:187:1: ruleSDitchEnumerationRule : ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:191:2: ( ( ( rule__SDitchEnumerationRule__SourceAssignment ) ) )
            // InternalSim.g:192:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            {
            // InternalSim.g:192:2: ( ( rule__SDitchEnumerationRule__SourceAssignment ) )
            // InternalSim.g:193:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceAssignment()); 
            // InternalSim.g:194:3: ( rule__SDitchEnumerationRule__SourceAssignment )
            // InternalSim.g:194:4: rule__SDitchEnumerationRule__SourceAssignment
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
    // InternalSim.g:203:1: entryRuleSGrabEnumerationLiteralRule : ruleSGrabEnumerationLiteralRule EOF ;
    public final void entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:204:1: ( ruleSGrabEnumerationLiteralRule EOF )
            // InternalSim.g:205:1: ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSim.g:212:1: ruleSGrabEnumerationLiteralRule : ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:216:2: ( ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) )
            // InternalSim.g:217:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            {
            // InternalSim.g:217:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            // InternalSim.g:218:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup()); 
            // InternalSim.g:219:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            // InternalSim.g:219:4: rule__SGrabEnumerationLiteralRule__Group__0
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
    // InternalSim.g:228:1: entryRuleSDitchEnumerationLiteralRule : ruleSDitchEnumerationLiteralRule EOF ;
    public final void entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSim.g:229:1: ( ruleSDitchEnumerationLiteralRule EOF )
            // InternalSim.g:230:1: ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSim.g:237:1: ruleSDitchEnumerationLiteralRule : ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:241:2: ( ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) )
            // InternalSim.g:242:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            {
            // InternalSim.g:242:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            // InternalSim.g:243:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceAssignment()); 
            // InternalSim.g:244:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            // InternalSim.g:244:4: rule__SDitchEnumerationLiteralRule__SourceAssignment
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
    // InternalSim.g:253:1: entryRuleSGrabComplexTypeRule : ruleSGrabComplexTypeRule EOF ;
    public final void entryRuleSGrabComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:254:1: ( ruleSGrabComplexTypeRule EOF )
            // InternalSim.g:255:1: ruleSGrabComplexTypeRule EOF
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
    // InternalSim.g:262:1: ruleSGrabComplexTypeRule : ( ( rule__SGrabComplexTypeRule__Group__0 ) ) ;
    public final void ruleSGrabComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:266:2: ( ( ( rule__SGrabComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:267:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:267:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            // InternalSim.g:268:3: ( rule__SGrabComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:269:3: ( rule__SGrabComplexTypeRule__Group__0 )
            // InternalSim.g:269:4: rule__SGrabComplexTypeRule__Group__0
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
    // InternalSim.g:278:1: entryRuleSDitchComplexTypeRule : ruleSDitchComplexTypeRule EOF ;
    public final void entryRuleSDitchComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:279:1: ( ruleSDitchComplexTypeRule EOF )
            // InternalSim.g:280:1: ruleSDitchComplexTypeRule EOF
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
    // InternalSim.g:287:1: ruleSDitchComplexTypeRule : ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) ;
    public final void ruleSDitchComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:291:2: ( ( ( rule__SDitchComplexTypeRule__SourceAssignment ) ) )
            // InternalSim.g:292:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            {
            // InternalSim.g:292:2: ( ( rule__SDitchComplexTypeRule__SourceAssignment ) )
            // InternalSim.g:293:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceAssignment()); 
            // InternalSim.g:294:3: ( rule__SDitchComplexTypeRule__SourceAssignment )
            // InternalSim.g:294:4: rule__SDitchComplexTypeRule__SourceAssignment
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
    // InternalSim.g:303:1: entryRuleSMorphComplexTypeRule : ruleSMorphComplexTypeRule EOF ;
    public final void entryRuleSMorphComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:304:1: ( ruleSMorphComplexTypeRule EOF )
            // InternalSim.g:305:1: ruleSMorphComplexTypeRule EOF
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
    // InternalSim.g:312:1: ruleSMorphComplexTypeRule : ( ( rule__SMorphComplexTypeRule__Group__0 ) ) ;
    public final void ruleSMorphComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:316:2: ( ( ( rule__SMorphComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:317:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:317:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            // InternalSim.g:318:3: ( rule__SMorphComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:319:3: ( rule__SMorphComplexTypeRule__Group__0 )
            // InternalSim.g:319:4: rule__SMorphComplexTypeRule__Group__0
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
    // InternalSim.g:328:1: entryRuleSFuseComplexTypeRule : ruleSFuseComplexTypeRule EOF ;
    public final void entryRuleSFuseComplexTypeRule() throws RecognitionException {
        try {
            // InternalSim.g:329:1: ( ruleSFuseComplexTypeRule EOF )
            // InternalSim.g:330:1: ruleSFuseComplexTypeRule EOF
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
    // InternalSim.g:337:1: ruleSFuseComplexTypeRule : ( ( rule__SFuseComplexTypeRule__Group__0 ) ) ;
    public final void ruleSFuseComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:341:2: ( ( ( rule__SFuseComplexTypeRule__Group__0 ) ) )
            // InternalSim.g:342:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            {
            // InternalSim.g:342:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            // InternalSim.g:343:3: ( rule__SFuseComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup()); 
            // InternalSim.g:344:3: ( rule__SFuseComplexTypeRule__Group__0 )
            // InternalSim.g:344:4: rule__SFuseComplexTypeRule__Group__0
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
    // InternalSim.g:353:1: entryRuleSGrabFeatureRule : ruleSGrabFeatureRule EOF ;
    public final void entryRuleSGrabFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:354:1: ( ruleSGrabFeatureRule EOF )
            // InternalSim.g:355:1: ruleSGrabFeatureRule EOF
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
    // InternalSim.g:362:1: ruleSGrabFeatureRule : ( ( rule__SGrabFeatureRule__Group__0 ) ) ;
    public final void ruleSGrabFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:366:2: ( ( ( rule__SGrabFeatureRule__Group__0 ) ) )
            // InternalSim.g:367:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            {
            // InternalSim.g:367:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            // InternalSim.g:368:3: ( rule__SGrabFeatureRule__Group__0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 
            // InternalSim.g:369:3: ( rule__SGrabFeatureRule__Group__0 )
            // InternalSim.g:369:4: rule__SGrabFeatureRule__Group__0
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
    // InternalSim.g:378:1: entryRuleSMorphFeatureRule : ruleSMorphFeatureRule EOF ;
    public final void entryRuleSMorphFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:379:1: ( ruleSMorphFeatureRule EOF )
            // InternalSim.g:380:1: ruleSMorphFeatureRule EOF
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
    // InternalSim.g:387:1: ruleSMorphFeatureRule : ( ( rule__SMorphFeatureRule__Group__0 ) ) ;
    public final void ruleSMorphFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:391:2: ( ( ( rule__SMorphFeatureRule__Group__0 ) ) )
            // InternalSim.g:392:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            {
            // InternalSim.g:392:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            // InternalSim.g:393:3: ( rule__SMorphFeatureRule__Group__0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 
            // InternalSim.g:394:3: ( rule__SMorphFeatureRule__Group__0 )
            // InternalSim.g:394:4: rule__SMorphFeatureRule__Group__0
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
    // InternalSim.g:403:1: entryRuleSDitchFeatureRule : ruleSDitchFeatureRule EOF ;
    public final void entryRuleSDitchFeatureRule() throws RecognitionException {
        try {
            // InternalSim.g:404:1: ( ruleSDitchFeatureRule EOF )
            // InternalSim.g:405:1: ruleSDitchFeatureRule EOF
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
    // InternalSim.g:412:1: ruleSDitchFeatureRule : ( ( rule__SDitchFeatureRule__SourceAssignment ) ) ;
    public final void ruleSDitchFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:416:2: ( ( ( rule__SDitchFeatureRule__SourceAssignment ) ) )
            // InternalSim.g:417:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            {
            // InternalSim.g:417:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            // InternalSim.g:418:3: ( rule__SDitchFeatureRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 
            // InternalSim.g:419:3: ( rule__SDitchFeatureRule__SourceAssignment )
            // InternalSim.g:419:4: rule__SDitchFeatureRule__SourceAssignment
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
    // InternalSim.g:428:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSim.g:429:1: ( ruleSAggregate EOF )
            // InternalSim.g:430:1: ruleSAggregate EOF
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
    // InternalSim.g:437:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:441:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSim.g:442:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSim.g:442:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSim.g:443:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSim.g:444:3: ( rule__SAggregate__Group__0 )
            // InternalSim.g:444:4: rule__SAggregate__Group__0
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
    // InternalSim.g:453:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSim.g:454:1: ( ruleSType EOF )
            // InternalSim.g:455:1: ruleSType EOF
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
    // InternalSim.g:462:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:466:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSim.g:467:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSim.g:467:2: ( ( rule__SType__Alternatives ) )
            // InternalSim.g:468:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSim.g:469:3: ( rule__SType__Alternatives )
            // InternalSim.g:469:4: rule__SType__Alternatives
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
    // InternalSim.g:478:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSim.g:479:1: ( ruleSConstraint EOF )
            // InternalSim.g:480:1: ruleSConstraint EOF
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
    // InternalSim.g:487:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:491:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSim.g:492:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSim.g:492:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSim.g:493:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSim.g:494:3: ( rule__SConstraint__Group__0 )
            // InternalSim.g:494:4: rule__SConstraint__Group__0
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
    // InternalSim.g:503:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSim.g:504:1: ( ruleSPrimitive EOF )
            // InternalSim.g:505:1: ruleSPrimitive EOF
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
    // InternalSim.g:512:1: ruleSPrimitive : ( ( rule__SPrimitive__Group__0 ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:516:2: ( ( ( rule__SPrimitive__Group__0 ) ) )
            // InternalSim.g:517:2: ( ( rule__SPrimitive__Group__0 ) )
            {
            // InternalSim.g:517:2: ( ( rule__SPrimitive__Group__0 ) )
            // InternalSim.g:518:3: ( rule__SPrimitive__Group__0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getGroup()); 
            // InternalSim.g:519:3: ( rule__SPrimitive__Group__0 )
            // InternalSim.g:519:4: rule__SPrimitive__Group__0
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

            if ( (LA1_0==24) ) {
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
            case 30:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==32||LA2_1==35||LA2_1==38||LA2_1==41||LA2_1==50) ) {
                    alt2=1;
                }
                else if ( (LA2_1==12) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
            case 35:
            case 36:
            case 38:
            case 39:
            case 40:
            case 41:
            case 50:
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

            if ( (LA3_0==30) ) {
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
    // InternalSim.g:1001:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1005:1: ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt4=4;
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
                    // InternalSim.g:1012:2: ( ruleSEnumeration )
                    {
                    // InternalSim.g:1012:2: ( ruleSEnumeration )
                    // InternalSim.g:1013:3: ruleSEnumeration
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
                    // InternalSim.g:1018:2: ( ruleSRootType )
                    {
                    // InternalSim.g:1018:2: ( ruleSRootType )
                    // InternalSim.g:1019:3: ruleSRootType
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
                    // InternalSim.g:1024:2: ( ruleSDetailType )
                    {
                    // InternalSim.g:1024:2: ( ruleSDetailType )
                    // InternalSim.g:1025:3: ruleSDetailType
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
    // InternalSim.g:1034:1: rule__SPrimitive__Alternatives_0 : ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) );
    public final void rule__SPrimitive__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1038:1: ( ( ( rule__SPrimitive__Group_0_0__0 ) ) | ( ( rule__SPrimitive__Group_0_1__0 ) ) | ( ( rule__SPrimitive__Group_0_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 32:
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
                    // InternalSim.g:1039:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1039:2: ( ( rule__SPrimitive__Group_0_0__0 ) )
                    // InternalSim.g:1040:3: ( rule__SPrimitive__Group_0_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_0()); 
                    // InternalSim.g:1041:3: ( rule__SPrimitive__Group_0_0__0 )
                    // InternalSim.g:1041:4: rule__SPrimitive__Group_0_0__0
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
                    // InternalSim.g:1045:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1045:2: ( ( rule__SPrimitive__Group_0_1__0 ) )
                    // InternalSim.g:1046:3: ( rule__SPrimitive__Group_0_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_1()); 
                    // InternalSim.g:1047:3: ( rule__SPrimitive__Group_0_1__0 )
                    // InternalSim.g:1047:4: rule__SPrimitive__Group_0_1__0
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
                    // InternalSim.g:1051:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1051:2: ( ( rule__SPrimitive__Group_0_2__0 ) )
                    // InternalSim.g:1052:3: ( rule__SPrimitive__Group_0_2__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0_2()); 
                    // InternalSim.g:1053:3: ( rule__SPrimitive__Group_0_2__0 )
                    // InternalSim.g:1053:4: rule__SPrimitive__Group_0_2__0
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
    // InternalSim.g:1061:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1065:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) | ( ( rule__SEnumeration__Group_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 35:
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
                    // InternalSim.g:1066:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1066:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSim.g:1067:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSim.g:1068:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSim.g:1068:4: rule__SEnumeration__Group_0_0__0
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
                    // InternalSim.g:1072:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1072:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSim.g:1073:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSim.g:1074:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSim.g:1074:4: rule__SEnumeration__Group_0_1__0
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
                    // InternalSim.g:1078:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1078:2: ( ( rule__SEnumeration__Group_0_2__0 ) )
                    // InternalSim.g:1079:3: ( rule__SEnumeration__Group_0_2__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_2()); 
                    // InternalSim.g:1080:3: ( rule__SEnumeration__Group_0_2__0 )
                    // InternalSim.g:1080:4: rule__SEnumeration__Group_0_2__0
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
    // InternalSim.g:1088:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1092:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 36:
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
                    // InternalSim.g:1093:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSim.g:1093:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSim.g:1094:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSim.g:1095:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSim.g:1095:4: rule__SLiteral__Group_0__0
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
                    // InternalSim.g:1099:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSim.g:1099:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSim.g:1100:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSim.g:1101:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSim.g:1101:4: rule__SLiteral__Group_1__0
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
                    // InternalSim.g:1105:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSim.g:1105:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSim.g:1106:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSim.g:1107:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSim.g:1107:4: rule__SLiteral__NameAssignment_2
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
    // InternalSim.g:1115:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1119:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) | ( ( rule__SRootType__Group_0_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 39:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            case 38:
            case 50:
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
                    // InternalSim.g:1120:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1120:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSim.g:1121:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1122:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSim.g:1122:4: rule__SRootType__Group_0_0__0
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
                    // InternalSim.g:1126:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1126:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSim.g:1127:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1128:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSim.g:1128:4: rule__SRootType__Group_0_1__0
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
                    // InternalSim.g:1132:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1132:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    // InternalSim.g:1133:3: ( rule__SRootType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1134:3: ( rule__SRootType__Group_0_2__0 )
                    // InternalSim.g:1134:4: rule__SRootType__Group_0_2__0
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
                    // InternalSim.g:1138:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1138:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    // InternalSim.g:1139:3: ( rule__SRootType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1140:3: ( rule__SRootType__Group_0_3__0 )
                    // InternalSim.g:1140:4: rule__SRootType__Group_0_3__0
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
                    // InternalSim.g:1144:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1144:2: ( ( rule__SRootType__Group_0_4__0 ) )
                    // InternalSim.g:1145:3: ( rule__SRootType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1146:3: ( rule__SRootType__Group_0_4__0 )
                    // InternalSim.g:1146:4: rule__SRootType__Group_0_4__0
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
    // InternalSim.g:1154:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1158:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) | ( ( rule__SDetailType__Group_0_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 41:
            case 50:
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
                    // InternalSim.g:1159:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSim.g:1159:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSim.g:1160:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSim.g:1161:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSim.g:1161:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSim.g:1165:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSim.g:1165:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSim.g:1166:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSim.g:1167:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSim.g:1167:4: rule__SDetailType__Group_0_1__0
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
                    // InternalSim.g:1171:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSim.g:1171:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSim.g:1172:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSim.g:1173:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSim.g:1173:4: rule__SDetailType__Group_0_2__0
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
                    // InternalSim.g:1177:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSim.g:1177:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSim.g:1178:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSim.g:1179:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSim.g:1179:4: rule__SDetailType__Group_0_3__0
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
                    // InternalSim.g:1183:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    {
                    // InternalSim.g:1183:2: ( ( rule__SDetailType__Group_0_4__0 ) )
                    // InternalSim.g:1184:3: ( rule__SDetailType__Group_0_4__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_4()); 
                    // InternalSim.g:1185:3: ( rule__SDetailType__Group_0_4__0 )
                    // InternalSim.g:1185:4: rule__SDetailType__Group_0_4__0
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
    // InternalSim.g:1193:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1197:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==11||(LA10_0>=13 && LA10_0<=14)||LA10_0==30||LA10_0==36||LA10_0==39||LA10_0==41||LA10_0==51) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSim.g:1198:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSim.g:1198:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSim.g:1199:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSim.g:1200:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSim.g:1200:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
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
                    // InternalSim.g:1204:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSim.g:1204:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSim.g:1205:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSim.g:1206:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSim.g:1206:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
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
    // InternalSim.g:1214:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1218:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                switch ( input.LA(2) ) {
                case 44:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 41:
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
            case 39:
                {
                switch ( input.LA(2) ) {
                case 13:
                case 14:
                    {
                    alt11=1;
                    }
                    break;
                case 44:
                    {
                    alt11=3;
                    }
                    break;
                case RULE_ID:
                case 15:
                case 41:
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
            case 36:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 15:
                case 41:
                    {
                    alt11=2;
                    }
                    break;
                case 44:
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
            case 51:
                {
                alt11=1;
                }
                break;
            case 41:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                int LA11_6 = input.LA(2);

                if ( (LA11_6==27) ) {
                    alt11=2;
                }
                else if ( (LA11_6==42) ) {
                    alt11=3;
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
                    // InternalSim.g:1219:2: ( ruleSAssociation )
                    {
                    // InternalSim.g:1219:2: ( ruleSAssociation )
                    // InternalSim.g:1220:3: ruleSAssociation
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
                    // InternalSim.g:1225:2: ( ruleSAttribute )
                    {
                    // InternalSim.g:1225:2: ( ruleSAttribute )
                    // InternalSim.g:1226:3: ruleSAttribute
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
                    // InternalSim.g:1231:2: ( ruleSQuery )
                    {
                    // InternalSim.g:1231:2: ( ruleSQuery )
                    // InternalSim.g:1232:3: ruleSQuery
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
    // InternalSim.g:1241:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1245:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 39:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 11:
            case 13:
            case 14:
            case 51:
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
                    // InternalSim.g:1246:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSim.g:1246:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSim.g:1247:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSim.g:1248:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSim.g:1248:4: rule__SAssociation__Group_0__0
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
                    // InternalSim.g:1252:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSim.g:1252:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSim.g:1253:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSim.g:1254:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSim.g:1254:4: rule__SAssociation__Group_1__0
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
                    // InternalSim.g:1258:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSim.g:1258:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSim.g:1259:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSim.g:1260:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSim.g:1260:4: rule__SAssociation__Group_2__0
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
                    // InternalSim.g:1264:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSim.g:1264:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSim.g:1265:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSim.g:1266:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSim.g:1266:4: rule__SAssociation__Group_3__0
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
    // InternalSim.g:1274:1: rule__SAssociation__Alternatives_0_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1278:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1279:2: ( 'reference' )
                    {
                    // InternalSim.g:1279:2: ( 'reference' )
                    // InternalSim.g:1280:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1285:2: ( 'composite' )
                    {
                    // InternalSim.g:1285:2: ( 'composite' )
                    // InternalSim.g:1286:3: 'composite'
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
    // InternalSim.g:1295:1: rule__SAssociation__Alternatives_1_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1299:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1300:2: ( 'reference' )
                    {
                    // InternalSim.g:1300:2: ( 'reference' )
                    // InternalSim.g:1301:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1306:2: ( 'composite' )
                    {
                    // InternalSim.g:1306:2: ( 'composite' )
                    // InternalSim.g:1307:3: 'composite'
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
    // InternalSim.g:1316:1: rule__SAssociation__Alternatives_2_2 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1320:1: ( ( 'reference' ) | ( 'composite' ) )
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
                    // InternalSim.g:1321:2: ( 'reference' )
                    {
                    // InternalSim.g:1321:2: ( 'reference' )
                    // InternalSim.g:1322:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1327:2: ( 'composite' )
                    {
                    // InternalSim.g:1327:2: ( 'composite' )
                    // InternalSim.g:1328:3: 'composite'
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
    // InternalSim.g:1337:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1341:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
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
                    // InternalSim.g:1342:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSim.g:1342:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSim.g:1343:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSim.g:1344:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSim.g:1344:4: rule__SAssociation__KindAssignment_3_1_0
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
                    // InternalSim.g:1348:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSim.g:1348:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSim.g:1349:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSim.g:1350:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSim.g:1350:4: rule__SAssociation__Group_3_1_1__0
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
    // InternalSim.g:1358:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1362:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 39:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
            case 41:
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
                    // InternalSim.g:1363:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSim.g:1363:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSim.g:1364:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSim.g:1365:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSim.g:1365:4: rule__SAttribute__Group_0__0
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
                    // InternalSim.g:1369:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSim.g:1369:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSim.g:1370:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSim.g:1371:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSim.g:1371:4: rule__SAttribute__Group_1__0
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
                    // InternalSim.g:1375:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSim.g:1375:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSim.g:1376:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSim.g:1377:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSim.g:1377:4: rule__SAttribute__Group_2__0
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
                    // InternalSim.g:1381:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSim.g:1381:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSim.g:1382:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSim.g:1383:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSim.g:1383:4: rule__SAttribute__Group_3__0
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
    // InternalSim.g:1391:1: rule__SAttribute__Alternatives_0_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1395:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_0_2_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSim.g:1396:2: ( 'attribute' )
                    {
                    // InternalSim.g:1396:2: ( 'attribute' )
                    // InternalSim.g:1397:3: 'attribute'
                    {
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1402:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    {
                    // InternalSim.g:1402:2: ( ( rule__SAttribute__DetailAssignment_0_2_1 ) )
                    // InternalSim.g:1403:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_2_1()); 
                    // InternalSim.g:1404:3: ( rule__SAttribute__DetailAssignment_0_2_1 )
                    // InternalSim.g:1404:4: rule__SAttribute__DetailAssignment_0_2_1
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
    // InternalSim.g:1412:1: rule__SAttribute__Alternatives_1_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1416:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_1_2_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            else if ( (LA19_0==41) ) {
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
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1423:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    {
                    // InternalSim.g:1423:2: ( ( rule__SAttribute__DetailAssignment_1_2_1 ) )
                    // InternalSim.g:1424:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_2_1()); 
                    // InternalSim.g:1425:3: ( rule__SAttribute__DetailAssignment_1_2_1 )
                    // InternalSim.g:1425:4: rule__SAttribute__DetailAssignment_1_2_1
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
    // InternalSim.g:1433:1: rule__SAttribute__Alternatives_2_2 : ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) );
    public final void rule__SAttribute__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1437:1: ( ( 'attribute' ) | ( ( rule__SAttribute__DetailAssignment_2_2_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
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
                     before(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAttributeAccess().getAttributeKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1444:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    {
                    // InternalSim.g:1444:2: ( ( rule__SAttribute__DetailAssignment_2_2_1 ) )
                    // InternalSim.g:1445:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    {
                     before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_2_1()); 
                    // InternalSim.g:1446:3: ( rule__SAttribute__DetailAssignment_2_2_1 )
                    // InternalSim.g:1446:4: rule__SAttribute__DetailAssignment_2_2_1
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
    // InternalSim.g:1454:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1458:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 30:
            case 39:
                {
                alt21=1;
                }
                break;
            case 36:
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
                    // InternalSim.g:1459:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSim.g:1459:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSim.g:1460:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSim.g:1461:3: ( rule__SQuery__Group_0__0 )
                    // InternalSim.g:1461:4: rule__SQuery__Group_0__0
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
                    // InternalSim.g:1465:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSim.g:1465:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSim.g:1466:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSim.g:1467:3: ( rule__SQuery__Group_1__0 )
                    // InternalSim.g:1467:4: rule__SQuery__Group_1__0
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
                    // InternalSim.g:1471:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSim.g:1471:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSim.g:1472:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSim.g:1473:3: ( rule__SQuery__Group_2__0 )
                    // InternalSim.g:1473:4: rule__SQuery__Group_2__0
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
    // InternalSim.g:1481:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1485:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==39) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSim.g:1486:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSim.g:1486:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSim.g:1487:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSim.g:1488:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSim.g:1488:4: rule__SQuery__Group_0_0_0__0
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
                    // InternalSim.g:1492:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSim.g:1492:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSim.g:1493:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSim.g:1494:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSim.g:1494:4: rule__SQuery__Group_0_0_1__0
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
    // InternalSim.g:1502:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1506:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==30||LA24_0==36||LA24_0==39||LA24_0==43) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSim.g:1507:2: ( '*' )
                    {
                    // InternalSim.g:1507:2: ( '*' )
                    // InternalSim.g:1508:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1513:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSim.g:1513:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSim.g:1514:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSim.g:1515:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==30||LA23_0==36||LA23_0==39) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalSim.g:1515:4: rule__SQuery__Group_0_2_1__0
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
    // InternalSim.g:1523:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1527:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) | ( ( rule__SQueryParameter__Group_3__0 ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 36:
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
                    // InternalSim.g:1528:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSim.g:1528:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSim.g:1529:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSim.g:1530:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSim.g:1530:4: rule__SQueryParameter__Group_0__0
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
                    // InternalSim.g:1534:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSim.g:1534:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSim.g:1535:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSim.g:1536:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSim.g:1536:4: rule__SQueryParameter__Group_1__0
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
                    // InternalSim.g:1540:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSim.g:1540:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSim.g:1541:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSim.g:1542:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSim.g:1542:4: rule__SQueryParameter__Group_2__0
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
                    // InternalSim.g:1546:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    {
                    // InternalSim.g:1546:2: ( ( rule__SQueryParameter__Group_3__0 ) )
                    // InternalSim.g:1547:3: ( rule__SQueryParameter__Group_3__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_3()); 
                    // InternalSim.g:1548:3: ( rule__SQueryParameter__Group_3__0 )
                    // InternalSim.g:1548:4: rule__SQueryParameter__Group_3__0
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
    // InternalSim.g:1556:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1560:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalSim.g:1561:2: ( RULE_INT )
                    {
                    // InternalSim.g:1561:2: ( RULE_INT )
                    // InternalSim.g:1562:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1567:2: ( '*' )
                    {
                    // InternalSim.g:1567:2: ( '*' )
                    // InternalSim.g:1568:3: '*'
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
    // InternalSim.g:1577:1: rule__SInformationModelKind__Alternatives : ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) );
    public final void rule__SInformationModelKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1581:1: ( ( ( 'base' ) ) | ( ( 'interface' ) ) | ( ( 'core' ) ) )
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
                    // InternalSim.g:1582:2: ( ( 'base' ) )
                    {
                    // InternalSim.g:1582:2: ( ( 'base' ) )
                    // InternalSim.g:1583:3: ( 'base' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1584:3: ( 'base' )
                    // InternalSim.g:1584:4: 'base'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getBASEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1588:2: ( ( 'interface' ) )
                    {
                    // InternalSim.g:1588:2: ( ( 'interface' ) )
                    // InternalSim.g:1589:3: ( 'interface' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1590:3: ( 'interface' )
                    // InternalSim.g:1590:4: 'interface'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSInformationModelKindAccess().getINTERFACEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSim.g:1594:2: ( ( 'core' ) )
                    {
                    // InternalSim.g:1594:2: ( ( 'core' ) )
                    // InternalSim.g:1595:3: ( 'core' )
                    {
                     before(grammarAccess.getSInformationModelKindAccess().getCOREEnumLiteralDeclaration_2()); 
                    // InternalSim.g:1596:3: ( 'core' )
                    // InternalSim.g:1596:4: 'core'
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
    // InternalSim.g:1604:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1608:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
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
                    // InternalSim.g:1609:2: ( ( 'reference' ) )
                    {
                    // InternalSim.g:1609:2: ( ( 'reference' ) )
                    // InternalSim.g:1610:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSim.g:1611:3: ( 'reference' )
                    // InternalSim.g:1611:4: 'reference'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSim.g:1615:2: ( ( 'composite' ) )
                    {
                    // InternalSim.g:1615:2: ( ( 'composite' ) )
                    // InternalSim.g:1616:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSim.g:1617:3: ( 'composite' )
                    // InternalSim.g:1617:4: 'composite'
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
    // InternalSim.g:1625:1: rule__SInformationModel__Group__0 : rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 ;
    public final void rule__SInformationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1629:1: ( rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1 )
            // InternalSim.g:1630:2: rule__SInformationModel__Group__0__Impl rule__SInformationModel__Group__1
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
    // InternalSim.g:1637:1: rule__SInformationModel__Group__0__Impl : ( ( rule__SInformationModel__KindAssignment_0 ) ) ;
    public final void rule__SInformationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1641:1: ( ( ( rule__SInformationModel__KindAssignment_0 ) ) )
            // InternalSim.g:1642:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            {
            // InternalSim.g:1642:1: ( ( rule__SInformationModel__KindAssignment_0 ) )
            // InternalSim.g:1643:2: ( rule__SInformationModel__KindAssignment_0 )
            {
             before(grammarAccess.getSInformationModelAccess().getKindAssignment_0()); 
            // InternalSim.g:1644:2: ( rule__SInformationModel__KindAssignment_0 )
            // InternalSim.g:1644:3: rule__SInformationModel__KindAssignment_0
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
    // InternalSim.g:1652:1: rule__SInformationModel__Group__1 : rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 ;
    public final void rule__SInformationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1656:1: ( rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2 )
            // InternalSim.g:1657:2: rule__SInformationModel__Group__1__Impl rule__SInformationModel__Group__2
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
    // InternalSim.g:1664:1: rule__SInformationModel__Group__1__Impl : ( 'information' ) ;
    public final void rule__SInformationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1668:1: ( ( 'information' ) )
            // InternalSim.g:1669:1: ( 'information' )
            {
            // InternalSim.g:1669:1: ( 'information' )
            // InternalSim.g:1670:2: 'information'
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
    // InternalSim.g:1679:1: rule__SInformationModel__Group__2 : rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 ;
    public final void rule__SInformationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1683:1: ( rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3 )
            // InternalSim.g:1684:2: rule__SInformationModel__Group__2__Impl rule__SInformationModel__Group__3
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
    // InternalSim.g:1691:1: rule__SInformationModel__Group__2__Impl : ( 'model' ) ;
    public final void rule__SInformationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1695:1: ( ( 'model' ) )
            // InternalSim.g:1696:1: ( 'model' )
            {
            // InternalSim.g:1696:1: ( 'model' )
            // InternalSim.g:1697:2: 'model'
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
    // InternalSim.g:1706:1: rule__SInformationModel__Group__3 : rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 ;
    public final void rule__SInformationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1710:1: ( rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4 )
            // InternalSim.g:1711:2: rule__SInformationModel__Group__3__Impl rule__SInformationModel__Group__4
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
    // InternalSim.g:1718:1: rule__SInformationModel__Group__3__Impl : ( ( rule__SInformationModel__NameAssignment_3 ) ) ;
    public final void rule__SInformationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1722:1: ( ( ( rule__SInformationModel__NameAssignment_3 ) ) )
            // InternalSim.g:1723:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            {
            // InternalSim.g:1723:1: ( ( rule__SInformationModel__NameAssignment_3 ) )
            // InternalSim.g:1724:2: ( rule__SInformationModel__NameAssignment_3 )
            {
             before(grammarAccess.getSInformationModelAccess().getNameAssignment_3()); 
            // InternalSim.g:1725:2: ( rule__SInformationModel__NameAssignment_3 )
            // InternalSim.g:1725:3: rule__SInformationModel__NameAssignment_3
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
    // InternalSim.g:1733:1: rule__SInformationModel__Group__4 : rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 ;
    public final void rule__SInformationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1737:1: ( rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5 )
            // InternalSim.g:1738:2: rule__SInformationModel__Group__4__Impl rule__SInformationModel__Group__5
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
    // InternalSim.g:1745:1: rule__SInformationModel__Group__4__Impl : ( ( rule__SInformationModel__GenerateAssignment_4 )? ) ;
    public final void rule__SInformationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1749:1: ( ( ( rule__SInformationModel__GenerateAssignment_4 )? ) )
            // InternalSim.g:1750:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            {
            // InternalSim.g:1750:1: ( ( rule__SInformationModel__GenerateAssignment_4 )? )
            // InternalSim.g:1751:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateAssignment_4()); 
            // InternalSim.g:1752:2: ( rule__SInformationModel__GenerateAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSim.g:1752:3: rule__SInformationModel__GenerateAssignment_4
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
    // InternalSim.g:1760:1: rule__SInformationModel__Group__5 : rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 ;
    public final void rule__SInformationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1764:1: ( rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6 )
            // InternalSim.g:1765:2: rule__SInformationModel__Group__5__Impl rule__SInformationModel__Group__6
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
    // InternalSim.g:1772:1: rule__SInformationModel__Group__5__Impl : ( ( rule__SInformationModel__ImportsAssignment_5 )* ) ;
    public final void rule__SInformationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1776:1: ( ( ( rule__SInformationModel__ImportsAssignment_5 )* ) )
            // InternalSim.g:1777:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            {
            // InternalSim.g:1777:1: ( ( rule__SInformationModel__ImportsAssignment_5 )* )
            // InternalSim.g:1778:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            {
             before(grammarAccess.getSInformationModelAccess().getImportsAssignment_5()); 
            // InternalSim.g:1779:2: ( rule__SInformationModel__ImportsAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==22) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSim.g:1779:3: rule__SInformationModel__ImportsAssignment_5
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
    // InternalSim.g:1787:1: rule__SInformationModel__Group__6 : rule__SInformationModel__Group__6__Impl ;
    public final void rule__SInformationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1791:1: ( rule__SInformationModel__Group__6__Impl )
            // InternalSim.g:1792:2: rule__SInformationModel__Group__6__Impl
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
    // InternalSim.g:1798:1: rule__SInformationModel__Group__6__Impl : ( ( rule__SInformationModel__Alternatives_6 )* ) ;
    public final void rule__SInformationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1802:1: ( ( ( rule__SInformationModel__Alternatives_6 )* ) )
            // InternalSim.g:1803:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            {
            // InternalSim.g:1803:1: ( ( rule__SInformationModel__Alternatives_6 )* )
            // InternalSim.g:1804:2: ( rule__SInformationModel__Alternatives_6 )*
            {
             before(grammarAccess.getSInformationModelAccess().getAlternatives_6()); 
            // InternalSim.g:1805:2: ( rule__SInformationModel__Alternatives_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==12||LA31_0==30||(LA31_0>=32 && LA31_0<=33)||(LA31_0>=35 && LA31_0<=36)||(LA31_0>=38 && LA31_0<=41)||LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSim.g:1805:3: rule__SInformationModel__Alternatives_6
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
    // InternalSim.g:1814:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1818:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSim.g:1819:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
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
    // InternalSim.g:1826:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1830:1: ( ( 'import' ) )
            // InternalSim.g:1831:1: ( 'import' )
            {
            // InternalSim.g:1831:1: ( 'import' )
            // InternalSim.g:1832:2: 'import'
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
    // InternalSim.g:1841:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1845:1: ( rule__SImport__Group__1__Impl )
            // InternalSim.g:1846:2: rule__SImport__Group__1__Impl
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
    // InternalSim.g:1852:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1856:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSim.g:1857:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSim.g:1857:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSim.g:1858:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSim.g:1859:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSim.g:1859:3: rule__SImport__ImportedNamespaceAssignment_1
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
    // InternalSim.g:1868:1: rule__SGrabPrimitiveRule__Group__0 : rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 ;
    public final void rule__SGrabPrimitiveRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1872:1: ( rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1 )
            // InternalSim.g:1873:2: rule__SGrabPrimitiveRule__Group__0__Impl rule__SGrabPrimitiveRule__Group__1
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
    // InternalSim.g:1880:1: rule__SGrabPrimitiveRule__Group__0__Impl : ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1884:1: ( ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1885:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1885:1: ( ( rule__SGrabPrimitiveRule__SourceAssignment_0 ) )
            // InternalSim.g:1886:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1887:2: ( rule__SGrabPrimitiveRule__SourceAssignment_0 )
            // InternalSim.g:1887:3: rule__SGrabPrimitiveRule__SourceAssignment_0
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
    // InternalSim.g:1895:1: rule__SGrabPrimitiveRule__Group__1 : rule__SGrabPrimitiveRule__Group__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1899:1: ( rule__SGrabPrimitiveRule__Group__1__Impl )
            // InternalSim.g:1900:2: rule__SGrabPrimitiveRule__Group__1__Impl
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
    // InternalSim.g:1906:1: rule__SGrabPrimitiveRule__Group__1__Impl : ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) ;
    public final void rule__SGrabPrimitiveRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1910:1: ( ( ( rule__SGrabPrimitiveRule__Group_1__0 )? ) )
            // InternalSim.g:1911:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            {
            // InternalSim.g:1911:1: ( ( rule__SGrabPrimitiveRule__Group_1__0 )? )
            // InternalSim.g:1912:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getGroup_1()); 
            // InternalSim.g:1913:2: ( rule__SGrabPrimitiveRule__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSim.g:1913:3: rule__SGrabPrimitiveRule__Group_1__0
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
    // InternalSim.g:1922:1: rule__SGrabPrimitiveRule__Group_1__0 : rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 ;
    public final void rule__SGrabPrimitiveRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1926:1: ( rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1 )
            // InternalSim.g:1927:2: rule__SGrabPrimitiveRule__Group_1__0__Impl rule__SGrabPrimitiveRule__Group_1__1
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
    // InternalSim.g:1934:1: rule__SGrabPrimitiveRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1938:1: ( ( 'as' ) )
            // InternalSim.g:1939:1: ( 'as' )
            {
            // InternalSim.g:1939:1: ( 'as' )
            // InternalSim.g:1940:2: 'as'
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:1949:1: rule__SGrabPrimitiveRule__Group_1__1 : rule__SGrabPrimitiveRule__Group_1__1__Impl ;
    public final void rule__SGrabPrimitiveRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1953:1: ( rule__SGrabPrimitiveRule__Group_1__1__Impl )
            // InternalSim.g:1954:2: rule__SGrabPrimitiveRule__Group_1__1__Impl
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
    // InternalSim.g:1960:1: rule__SGrabPrimitiveRule__Group_1__1__Impl : ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabPrimitiveRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1964:1: ( ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:1965:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:1965:1: ( ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:1966:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:1967:2: ( rule__SGrabPrimitiveRule__RenameToAssignment_1_1 )
            // InternalSim.g:1967:3: rule__SGrabPrimitiveRule__RenameToAssignment_1_1
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
    // InternalSim.g:1976:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1980:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSim.g:1981:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
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
    // InternalSim.g:1988:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:1992:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSim.g:1993:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:1993:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSim.g:1994:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:1995:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSim.g:1995:3: rule__SGrabEnumerationRule__SourceAssignment_0
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
    // InternalSim.g:2003:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2007:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSim.g:2008:2: rule__SGrabEnumerationRule__Group__1__Impl
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
    // InternalSim.g:2014:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2018:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSim.g:2019:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSim.g:2019:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSim.g:2020:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSim.g:2021:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSim.g:2021:3: rule__SGrabEnumerationRule__Group_1__0
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
    // InternalSim.g:2030:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2034:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSim.g:2035:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
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
    // InternalSim.g:2042:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2046:1: ( ( 'as' ) )
            // InternalSim.g:2047:1: ( 'as' )
            {
            // InternalSim.g:2047:1: ( 'as' )
            // InternalSim.g:2048:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2057:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2061:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl )
            // InternalSim.g:2062:2: rule__SGrabEnumerationRule__Group_1__1__Impl
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
    // InternalSim.g:2068:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2072:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2073:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2073:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2074:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2075:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_1 )
            // InternalSim.g:2075:3: rule__SGrabEnumerationRule__RenameToAssignment_1_1
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
    // InternalSim.g:2084:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2088:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSim.g:2089:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
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
    // InternalSim.g:2096:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2100:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2101:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2101:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSim.g:2102:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2103:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSim.g:2103:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
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
    // InternalSim.g:2111:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2115:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSim.g:2116:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
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
    // InternalSim.g:2122:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2126:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSim.g:2127:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSim.g:2127:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSim.g:2128:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSim.g:2129:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSim.g:2129:3: rule__SGrabEnumerationLiteralRule__Group_1__0
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
    // InternalSim.g:2138:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2142:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSim.g:2143:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
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
    // InternalSim.g:2150:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2154:1: ( ( 'as' ) )
            // InternalSim.g:2155:1: ( 'as' )
            {
            // InternalSim.g:2155:1: ( 'as' )
            // InternalSim.g:2156:2: 'as'
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2165:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2169:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl )
            // InternalSim.g:2170:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl
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
    // InternalSim.g:2176:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2180:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2181:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2181:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2182:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2183:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 )
            // InternalSim.g:2183:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1
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
    // InternalSim.g:2192:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2196:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSim.g:2197:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
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
    // InternalSim.g:2204:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2208:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2209:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2209:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2210:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2211:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2211:3: rule__SGrabComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2219:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2223:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSim.g:2224:2: rule__SGrabComplexTypeRule__Group__1__Impl
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
    // InternalSim.g:2230:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2234:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2235:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2235:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2236:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2237:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSim.g:2237:3: rule__SGrabComplexTypeRule__Group_1__0
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
    // InternalSim.g:2246:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2250:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSim.g:2251:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
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
    // InternalSim.g:2258:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2262:1: ( ( 'as' ) )
            // InternalSim.g:2263:1: ( 'as' )
            {
            // InternalSim.g:2263:1: ( 'as' )
            // InternalSim.g:2264:2: 'as'
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2273:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2277:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2278:2: rule__SGrabComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2284:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2288:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2289:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2289:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2290:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2291:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2291:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2300:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2304:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSim.g:2305:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
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
    // InternalSim.g:2312:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2316:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2317:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2317:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2318:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2319:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2319:3: rule__SMorphComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2327:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2331:1: ( rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 )
            // InternalSim.g:2332:2: rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2339:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2343:1: ( ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) )
            // InternalSim.g:2344:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            {
            // InternalSim.g:2344:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            // InternalSim.g:2345:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 
            // InternalSim.g:2346:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSim.g:2346:3: rule__SMorphComplexTypeRule__Group_1__0
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
    // InternalSim.g:2354:1: rule__SMorphComplexTypeRule__Group__2 : rule__SMorphComplexTypeRule__Group__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2358:1: ( rule__SMorphComplexTypeRule__Group__2__Impl )
            // InternalSim.g:2359:2: rule__SMorphComplexTypeRule__Group__2__Impl
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
    // InternalSim.g:2365:1: rule__SMorphComplexTypeRule__Group__2__Impl : ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2369:1: ( ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) )
            // InternalSim.g:2370:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            {
            // InternalSim.g:2370:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            // InternalSim.g:2371:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 
            // InternalSim.g:2372:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSim.g:2372:3: rule__SMorphComplexTypeRule__Group_2__0
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
    // InternalSim.g:2381:1: rule__SMorphComplexTypeRule__Group_1__0 : rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 ;
    public final void rule__SMorphComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2385:1: ( rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 )
            // InternalSim.g:2386:2: rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1
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
    // InternalSim.g:2393:1: rule__SMorphComplexTypeRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2397:1: ( ( 'as' ) )
            // InternalSim.g:2398:1: ( 'as' )
            {
            // InternalSim.g:2398:1: ( 'as' )
            // InternalSim.g:2399:2: 'as'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2408:1: rule__SMorphComplexTypeRule__Group_1__1 : rule__SMorphComplexTypeRule__Group_1__1__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2412:1: ( rule__SMorphComplexTypeRule__Group_1__1__Impl )
            // InternalSim.g:2413:2: rule__SMorphComplexTypeRule__Group_1__1__Impl
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
    // InternalSim.g:2419:1: rule__SMorphComplexTypeRule__Group_1__1__Impl : ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2423:1: ( ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2424:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2424:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2425:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2426:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_1 )
            // InternalSim.g:2426:3: rule__SMorphComplexTypeRule__RenameToAssignment_1_1
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
    // InternalSim.g:2435:1: rule__SMorphComplexTypeRule__Group_2__0 : rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 ;
    public final void rule__SMorphComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2439:1: ( rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 )
            // InternalSim.g:2440:2: rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSim.g:2447:1: rule__SMorphComplexTypeRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2451:1: ( ( 'extends' ) )
            // InternalSim.g:2452:1: ( 'extends' )
            {
            // InternalSim.g:2452:1: ( 'extends' )
            // InternalSim.g:2453:2: 'extends'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSim.g:2462:1: rule__SMorphComplexTypeRule__Group_2__1 : rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 ;
    public final void rule__SMorphComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2466:1: ( rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 )
            // InternalSim.g:2467:2: rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2
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
    // InternalSim.g:2474:1: rule__SMorphComplexTypeRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2478:1: ( ( '=' ) )
            // InternalSim.g:2479:1: ( '=' )
            {
            // InternalSim.g:2479:1: ( '=' )
            // InternalSim.g:2480:2: '='
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSim.g:2489:1: rule__SMorphComplexTypeRule__Group_2__2 : rule__SMorphComplexTypeRule__Group_2__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2493:1: ( rule__SMorphComplexTypeRule__Group_2__2__Impl )
            // InternalSim.g:2494:2: rule__SMorphComplexTypeRule__Group_2__2__Impl
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
    // InternalSim.g:2500:1: rule__SMorphComplexTypeRule__Group_2__2__Impl : ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2504:1: ( ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) )
            // InternalSim.g:2505:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSim.g:2505:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            // InternalSim.g:2506:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSim.g:2507:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            // InternalSim.g:2507:3: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2
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
    // InternalSim.g:2516:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2520:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSim.g:2521:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSim.g:2528:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2532:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2533:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2533:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSim.g:2534:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2535:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSim.g:2535:3: rule__SFuseComplexTypeRule__SourceAssignment_0
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
    // InternalSim.g:2543:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2547:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSim.g:2548:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2555:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2559:1: ( ( 'and' ) )
            // InternalSim.g:2560:1: ( 'and' )
            {
            // InternalSim.g:2560:1: ( 'and' )
            // InternalSim.g:2561:2: 'and'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSim.g:2570:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2574:1: ( rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 )
            // InternalSim.g:2575:2: rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2582:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2586:1: ( ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) )
            // InternalSim.g:2587:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            {
            // InternalSim.g:2587:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            // InternalSim.g:2588:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2Assignment_2()); 
            // InternalSim.g:2589:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            // InternalSim.g:2589:3: rule__SFuseComplexTypeRule__Source2Assignment_2
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
    // InternalSim.g:2597:1: rule__SFuseComplexTypeRule__Group__3 : rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 ;
    public final void rule__SFuseComplexTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2601:1: ( rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 )
            // InternalSim.g:2602:2: rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSim.g:2609:1: rule__SFuseComplexTypeRule__Group__3__Impl : ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2613:1: ( ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) )
            // InternalSim.g:2614:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            {
            // InternalSim.g:2614:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            // InternalSim.g:2615:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 
            // InternalSim.g:2616:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSim.g:2616:3: rule__SFuseComplexTypeRule__Group_3__0
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
    // InternalSim.g:2624:1: rule__SFuseComplexTypeRule__Group__4 : rule__SFuseComplexTypeRule__Group__4__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2628:1: ( rule__SFuseComplexTypeRule__Group__4__Impl )
            // InternalSim.g:2629:2: rule__SFuseComplexTypeRule__Group__4__Impl
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
    // InternalSim.g:2635:1: rule__SFuseComplexTypeRule__Group__4__Impl : ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2639:1: ( ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) )
            // InternalSim.g:2640:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            {
            // InternalSim.g:2640:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            // InternalSim.g:2641:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_4()); 
            // InternalSim.g:2642:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSim.g:2642:3: rule__SFuseComplexTypeRule__Group_4__0
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
    // InternalSim.g:2651:1: rule__SFuseComplexTypeRule__Group_3__0 : rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 ;
    public final void rule__SFuseComplexTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2655:1: ( rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 )
            // InternalSim.g:2656:2: rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1
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
    // InternalSim.g:2663:1: rule__SFuseComplexTypeRule__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2667:1: ( ( 'as' ) )
            // InternalSim.g:2668:1: ( 'as' )
            {
            // InternalSim.g:2668:1: ( 'as' )
            // InternalSim.g:2669:2: 'as'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2678:1: rule__SFuseComplexTypeRule__Group_3__1 : rule__SFuseComplexTypeRule__Group_3__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2682:1: ( rule__SFuseComplexTypeRule__Group_3__1__Impl )
            // InternalSim.g:2683:2: rule__SFuseComplexTypeRule__Group_3__1__Impl
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
    // InternalSim.g:2689:1: rule__SFuseComplexTypeRule__Group_3__1__Impl : ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2693:1: ( ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) ) )
            // InternalSim.g:2694:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            {
            // InternalSim.g:2694:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 ) )
            // InternalSim.g:2695:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_1()); 
            // InternalSim.g:2696:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_1 )
            // InternalSim.g:2696:3: rule__SFuseComplexTypeRule__RenameToAssignment_3_1
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
    // InternalSim.g:2705:1: rule__SFuseComplexTypeRule__Group_4__0 : rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 ;
    public final void rule__SFuseComplexTypeRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2709:1: ( rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 )
            // InternalSim.g:2710:2: rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalSim.g:2717:1: rule__SFuseComplexTypeRule__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2721:1: ( ( 'extends' ) )
            // InternalSim.g:2722:1: ( 'extends' )
            {
            // InternalSim.g:2722:1: ( 'extends' )
            // InternalSim.g:2723:2: 'extends'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSim.g:2732:1: rule__SFuseComplexTypeRule__Group_4__1 : rule__SFuseComplexTypeRule__Group_4__1__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2736:1: ( rule__SFuseComplexTypeRule__Group_4__1__Impl )
            // InternalSim.g:2737:2: rule__SFuseComplexTypeRule__Group_4__1__Impl
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
    // InternalSim.g:2743:1: rule__SFuseComplexTypeRule__Group_4__1__Impl : ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2747:1: ( ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) ) )
            // InternalSim.g:2748:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            {
            // InternalSim.g:2748:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 ) )
            // InternalSim.g:2749:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_1()); 
            // InternalSim.g:2750:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 )
            // InternalSim.g:2750:3: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1
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
    // InternalSim.g:2759:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2763:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSim.g:2764:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
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
    // InternalSim.g:2771:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2775:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2776:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2776:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2777:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2778:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2778:3: rule__SGrabFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2786:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2790:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSim.g:2791:2: rule__SGrabFeatureRule__Group__1__Impl
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
    // InternalSim.g:2797:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2801:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2802:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2802:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSim.g:2803:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2804:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSim.g:2804:3: rule__SGrabFeatureRule__Group_1__0
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
    // InternalSim.g:2813:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2817:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSim.g:2818:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
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
    // InternalSim.g:2825:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2829:1: ( ( 'as' ) )
            // InternalSim.g:2830:1: ( 'as' )
            {
            // InternalSim.g:2830:1: ( 'as' )
            // InternalSim.g:2831:2: 'as'
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2840:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2844:1: ( rule__SGrabFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2845:2: rule__SGrabFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2851:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2855:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2856:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2856:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2857:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2858:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2858:3: rule__SGrabFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:2867:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2871:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSim.g:2872:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSim.g:2879:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2883:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSim.g:2884:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSim.g:2884:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSim.g:2885:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSim.g:2886:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSim.g:2886:3: rule__SMorphFeatureRule__SourceAssignment_0
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
    // InternalSim.g:2894:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2898:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSim.g:2899:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSim.g:2906:1: rule__SMorphFeatureRule__Group__1__Impl : ( ( rule__SMorphFeatureRule__Group_1__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2910:1: ( ( ( rule__SMorphFeatureRule__Group_1__0 )? ) )
            // InternalSim.g:2911:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            {
            // InternalSim.g:2911:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            // InternalSim.g:2912:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 
            // InternalSim.g:2913:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSim.g:2913:3: rule__SMorphFeatureRule__Group_1__0
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
    // InternalSim.g:2921:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2925:1: ( rule__SMorphFeatureRule__Group__2__Impl )
            // InternalSim.g:2926:2: rule__SMorphFeatureRule__Group__2__Impl
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
    // InternalSim.g:2932:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2936:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSim.g:2937:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSim.g:2937:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSim.g:2938:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSim.g:2939:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSim.g:2939:3: rule__SMorphFeatureRule__Group_2__0
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
    // InternalSim.g:2948:1: rule__SMorphFeatureRule__Group_1__0 : rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 ;
    public final void rule__SMorphFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2952:1: ( rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 )
            // InternalSim.g:2953:2: rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1
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
    // InternalSim.g:2960:1: rule__SMorphFeatureRule__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__SMorphFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2964:1: ( ( 'as' ) )
            // InternalSim.g:2965:1: ( 'as' )
            {
            // InternalSim.g:2965:1: ( 'as' )
            // InternalSim.g:2966:2: 'as'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getAsKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSim.g:2975:1: rule__SMorphFeatureRule__Group_1__1 : rule__SMorphFeatureRule__Group_1__1__Impl ;
    public final void rule__SMorphFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2979:1: ( rule__SMorphFeatureRule__Group_1__1__Impl )
            // InternalSim.g:2980:2: rule__SMorphFeatureRule__Group_1__1__Impl
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
    // InternalSim.g:2986:1: rule__SMorphFeatureRule__Group_1__1__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:2990:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) ) )
            // InternalSim.g:2991:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            {
            // InternalSim.g:2991:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_1 ) )
            // InternalSim.g:2992:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_1()); 
            // InternalSim.g:2993:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_1 )
            // InternalSim.g:2993:3: rule__SMorphFeatureRule__RenameToAssignment_1_1
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
    // InternalSim.g:3002:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3006:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSim.g:3007:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
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
    // InternalSim.g:3014:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3018:1: ( ( ':' ) )
            // InternalSim.g:3019:1: ( ':' )
            {
            // InternalSim.g:3019:1: ( ':' )
            // InternalSim.g:3020:2: ':'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getColonKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:3029:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3033:1: ( rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 )
            // InternalSim.g:3034:2: rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalSim.g:3041:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3045:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) ) )
            // InternalSim.g:3046:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            {
            // InternalSim.g:3046:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 ) )
            // InternalSim.g:3047:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_1()); 
            // InternalSim.g:3048:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_1 )
            // InternalSim.g:3048:3: rule__SMorphFeatureRule__RetypeToAssignment_2_1
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
    // InternalSim.g:3056:1: rule__SMorphFeatureRule__Group_2__2 : rule__SMorphFeatureRule__Group_2__2__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3060:1: ( rule__SMorphFeatureRule__Group_2__2__Impl )
            // InternalSim.g:3061:2: rule__SMorphFeatureRule__Group_2__2__Impl
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
    // InternalSim.g:3067:1: rule__SMorphFeatureRule__Group_2__2__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) ;
    public final void rule__SMorphFeatureRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3071:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? ) )
            // InternalSim.g:3072:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            {
            // InternalSim.g:3072:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )? )
            // InternalSim.g:3073:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_2()); 
            // InternalSim.g:3074:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_INT) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalSim.g:3074:3: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2
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
    // InternalSim.g:3083:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3087:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSim.g:3088:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSim.g:3095:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3099:1: ( ( () ) )
            // InternalSim.g:3100:1: ( () )
            {
            // InternalSim.g:3100:1: ( () )
            // InternalSim.g:3101:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSim.g:3102:2: ()
            // InternalSim.g:3102:3: 
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
    // InternalSim.g:3110:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3114:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSim.g:3115:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:3122:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3126:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSim.g:3127:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSim.g:3127:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSim.g:3128:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSim.g:3129:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSim.g:3129:3: rule__SAggregate__Alternatives_1
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
    // InternalSim.g:3137:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3141:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSim.g:3142:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3149:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3153:1: ( ( '{' ) )
            // InternalSim.g:3154:1: ( '{' )
            {
            // InternalSim.g:3154:1: ( '{' )
            // InternalSim.g:3155:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSim.g:3164:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3168:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSim.g:3169:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalSim.g:3176:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3180:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSim.g:3181:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSim.g:3181:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSim.g:3182:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSim.g:3183:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30||(LA44_0>=32 && LA44_0<=33)||(LA44_0>=35 && LA44_0<=36)||(LA44_0>=38 && LA44_0<=41)||LA44_0==50) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSim.g:3183:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalSim.g:3191:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3195:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSim.g:3196:2: rule__SAggregate__Group__4__Impl
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
    // InternalSim.g:3202:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3206:1: ( ( '}' ) )
            // InternalSim.g:3207:1: ( '}' )
            {
            // InternalSim.g:3207:1: ( '}' )
            // InternalSim.g:3208:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:3218:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3222:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSim.g:3223:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSim.g:3230:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3234:1: ( ( 'grab' ) )
            // InternalSim.g:3235:1: ( 'grab' )
            {
            // InternalSim.g:3235:1: ( 'grab' )
            // InternalSim.g:3236:2: 'grab'
            {
             before(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3245:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3249:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSim.g:3250:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
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
    // InternalSim.g:3257:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3261:1: ( ( 'aggregate' ) )
            // InternalSim.g:3262:1: ( 'aggregate' )
            {
            // InternalSim.g:3262:1: ( 'aggregate' )
            // InternalSim.g:3263:2: 'aggregate'
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
    // InternalSim.g:3272:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3276:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSim.g:3277:2: rule__SAggregate__Group_1_0__2__Impl
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
    // InternalSim.g:3283:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3287:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSim.g:3288:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSim.g:3288:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSim.g:3289:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSim.g:3290:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSim.g:3290:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
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
    // InternalSim.g:3299:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3303:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSim.g:3304:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
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
    // InternalSim.g:3311:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3315:1: ( ( 'constraint' ) )
            // InternalSim.g:3316:1: ( 'constraint' )
            {
            // InternalSim.g:3316:1: ( 'constraint' )
            // InternalSim.g:3317:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSim.g:3326:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3330:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSim.g:3331:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:3338:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3342:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSim.g:3343:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSim.g:3343:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSim.g:3344:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSim.g:3345:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSim.g:3345:3: rule__SConstraint__NameAssignment_1
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
    // InternalSim.g:3353:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3357:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSim.g:3358:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:3365:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3369:1: ( ( ':' ) )
            // InternalSim.g:3370:1: ( ':' )
            {
            // InternalSim.g:3370:1: ( ':' )
            // InternalSim.g:3371:2: ':'
            {
             before(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:3380:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3384:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSim.g:3385:2: rule__SConstraint__Group__3__Impl
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
    // InternalSim.g:3391:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3395:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSim.g:3396:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSim.g:3396:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSim.g:3397:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSim.g:3398:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSim.g:3398:3: rule__SConstraint__ConditionAssignment_3
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
    // InternalSim.g:3407:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3411:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSim.g:3412:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:3419:1: rule__SPrimitive__Group__0__Impl : ( ( rule__SPrimitive__Alternatives_0 ) ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3423:1: ( ( ( rule__SPrimitive__Alternatives_0 ) ) )
            // InternalSim.g:3424:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            {
            // InternalSim.g:3424:1: ( ( rule__SPrimitive__Alternatives_0 ) )
            // InternalSim.g:3425:2: ( rule__SPrimitive__Alternatives_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_0()); 
            // InternalSim.g:3426:2: ( rule__SPrimitive__Alternatives_0 )
            // InternalSim.g:3426:3: rule__SPrimitive__Alternatives_0
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
    // InternalSim.g:3434:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3438:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSim.g:3439:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:3446:1: rule__SPrimitive__Group__1__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3450:1: ( ( '{' ) )
            // InternalSim.g:3451:1: ( '{' )
            {
            // InternalSim.g:3451:1: ( '{' )
            // InternalSim.g:3452:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSim.g:3461:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3465:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSim.g:3466:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSim.g:3473:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3477:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_2 )* ) )
            // InternalSim.g:3478:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            {
            // InternalSim.g:3478:1: ( ( rule__SPrimitive__ConstraintsAssignment_2 )* )
            // InternalSim.g:3479:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_2()); 
            // InternalSim.g:3480:2: ( rule__SPrimitive__ConstraintsAssignment_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalSim.g:3480:3: rule__SPrimitive__ConstraintsAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SPrimitive__ConstraintsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalSim.g:3488:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3492:1: ( rule__SPrimitive__Group__3__Impl )
            // InternalSim.g:3493:2: rule__SPrimitive__Group__3__Impl
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
    // InternalSim.g:3499:1: rule__SPrimitive__Group__3__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3503:1: ( ( '}' ) )
            // InternalSim.g:3504:1: ( '}' )
            {
            // InternalSim.g:3504:1: ( '}' )
            // InternalSim.g:3505:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:3515:1: rule__SPrimitive__Group_0_0__0 : rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 ;
    public final void rule__SPrimitive__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3519:1: ( rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1 )
            // InternalSim.g:3520:2: rule__SPrimitive__Group_0_0__0__Impl rule__SPrimitive__Group_0_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSim.g:3527:1: rule__SPrimitive__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SPrimitive__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3531:1: ( ( () ) )
            // InternalSim.g:3532:1: ( () )
            {
            // InternalSim.g:3532:1: ( () )
            // InternalSim.g:3533:2: ()
            {
             before(grammarAccess.getSPrimitiveAccess().getSPrimitiveAction_0_0_0()); 
            // InternalSim.g:3534:2: ()
            // InternalSim.g:3534:3: 
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
    // InternalSim.g:3542:1: rule__SPrimitive__Group_0_0__1 : rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 ;
    public final void rule__SPrimitive__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3546:1: ( rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2 )
            // InternalSim.g:3547:2: rule__SPrimitive__Group_0_0__1__Impl rule__SPrimitive__Group_0_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSim.g:3554:1: rule__SPrimitive__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SPrimitive__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3558:1: ( ( 'grab' ) )
            // InternalSim.g:3559:1: ( 'grab' )
            {
            // InternalSim.g:3559:1: ( 'grab' )
            // InternalSim.g:3560:2: 'grab'
            {
             before(grammarAccess.getSPrimitiveAccess().getGrabKeyword_0_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3569:1: rule__SPrimitive__Group_0_0__2 : rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 ;
    public final void rule__SPrimitive__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3573:1: ( rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3 )
            // InternalSim.g:3574:2: rule__SPrimitive__Group_0_0__2__Impl rule__SPrimitive__Group_0_0__3
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
    // InternalSim.g:3581:1: rule__SPrimitive__Group_0_0__2__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3585:1: ( ( 'primitive' ) )
            // InternalSim.g:3586:1: ( 'primitive' )
            {
            // InternalSim.g:3586:1: ( 'primitive' )
            // InternalSim.g:3587:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_0_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:3596:1: rule__SPrimitive__Group_0_0__3 : rule__SPrimitive__Group_0_0__3__Impl ;
    public final void rule__SPrimitive__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3600:1: ( rule__SPrimitive__Group_0_0__3__Impl )
            // InternalSim.g:3601:2: rule__SPrimitive__Group_0_0__3__Impl
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
    // InternalSim.g:3607:1: rule__SPrimitive__Group_0_0__3__Impl : ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SPrimitive__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3611:1: ( ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:3612:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:3612:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:3613:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:3614:2: ( rule__SPrimitive__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:3614:3: rule__SPrimitive__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:3623:1: rule__SPrimitive__Group_0_1__0 : rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 ;
    public final void rule__SPrimitive__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3627:1: ( rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1 )
            // InternalSim.g:3628:2: rule__SPrimitive__Group_0_1__0__Impl rule__SPrimitive__Group_0_1__1
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
    // InternalSim.g:3635:1: rule__SPrimitive__Group_0_1__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitive__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3639:1: ( ( 'archetype' ) )
            // InternalSim.g:3640:1: ( 'archetype' )
            {
            // InternalSim.g:3640:1: ( 'archetype' )
            // InternalSim.g:3641:2: 'archetype'
            {
             before(grammarAccess.getSPrimitiveAccess().getArchetypeKeyword_0_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSim.g:3650:1: rule__SPrimitive__Group_0_1__1 : rule__SPrimitive__Group_0_1__1__Impl ;
    public final void rule__SPrimitive__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3654:1: ( rule__SPrimitive__Group_0_1__1__Impl )
            // InternalSim.g:3655:2: rule__SPrimitive__Group_0_1__1__Impl
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
    // InternalSim.g:3661:1: rule__SPrimitive__Group_0_1__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) ;
    public final void rule__SPrimitive__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3665:1: ( ( ( rule__SPrimitive__NameAssignment_0_1_1 ) ) )
            // InternalSim.g:3666:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            {
            // InternalSim.g:3666:1: ( ( rule__SPrimitive__NameAssignment_0_1_1 ) )
            // InternalSim.g:3667:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_1_1()); 
            // InternalSim.g:3668:2: ( rule__SPrimitive__NameAssignment_0_1_1 )
            // InternalSim.g:3668:3: rule__SPrimitive__NameAssignment_0_1_1
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
    // InternalSim.g:3677:1: rule__SPrimitive__Group_0_2__0 : rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 ;
    public final void rule__SPrimitive__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3681:1: ( rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1 )
            // InternalSim.g:3682:2: rule__SPrimitive__Group_0_2__0__Impl rule__SPrimitive__Group_0_2__1
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
    // InternalSim.g:3689:1: rule__SPrimitive__Group_0_2__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3693:1: ( ( 'primitive' ) )
            // InternalSim.g:3694:1: ( 'primitive' )
            {
            // InternalSim.g:3694:1: ( 'primitive' )
            // InternalSim.g:3695:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSim.g:3704:1: rule__SPrimitive__Group_0_2__1 : rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 ;
    public final void rule__SPrimitive__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3708:1: ( rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2 )
            // InternalSim.g:3709:2: rule__SPrimitive__Group_0_2__1__Impl rule__SPrimitive__Group_0_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSim.g:3716:1: rule__SPrimitive__Group_0_2__1__Impl : ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) ;
    public final void rule__SPrimitive__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3720:1: ( ( ( rule__SPrimitive__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:3721:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:3721:1: ( ( rule__SPrimitive__NameAssignment_0_2_1 ) )
            // InternalSim.g:3722:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:3723:2: ( rule__SPrimitive__NameAssignment_0_2_1 )
            // InternalSim.g:3723:3: rule__SPrimitive__NameAssignment_0_2_1
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
    // InternalSim.g:3731:1: rule__SPrimitive__Group_0_2__2 : rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 ;
    public final void rule__SPrimitive__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3735:1: ( rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3 )
            // InternalSim.g:3736:2: rule__SPrimitive__Group_0_2__2__Impl rule__SPrimitive__Group_0_2__3
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
    // InternalSim.g:3743:1: rule__SPrimitive__Group_0_2__2__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3747:1: ( ( 'redefines' ) )
            // InternalSim.g:3748:1: ( 'redefines' )
            {
            // InternalSim.g:3748:1: ( 'redefines' )
            // InternalSim.g:3749:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_0_2_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSim.g:3758:1: rule__SPrimitive__Group_0_2__3 : rule__SPrimitive__Group_0_2__3__Impl ;
    public final void rule__SPrimitive__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3762:1: ( rule__SPrimitive__Group_0_2__3__Impl )
            // InternalSim.g:3763:2: rule__SPrimitive__Group_0_2__3__Impl
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
    // InternalSim.g:3769:1: rule__SPrimitive__Group_0_2__3__Impl : ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) ;
    public final void rule__SPrimitive__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3773:1: ( ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) ) )
            // InternalSim.g:3774:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            {
            // InternalSim.g:3774:1: ( ( rule__SPrimitive__RedefinesAssignment_0_2_3 ) )
            // InternalSim.g:3775:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_0_2_3()); 
            // InternalSim.g:3776:2: ( rule__SPrimitive__RedefinesAssignment_0_2_3 )
            // InternalSim.g:3776:3: rule__SPrimitive__RedefinesAssignment_0_2_3
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
    // InternalSim.g:3785:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3789:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSim.g:3790:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:3797:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3801:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSim.g:3802:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSim.g:3802:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSim.g:3803:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSim.g:3804:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSim.g:3804:3: rule__SEnumeration__Alternatives_0
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
    // InternalSim.g:3812:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3816:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSim.g:3817:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:3824:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3828:1: ( ( '{' ) )
            // InternalSim.g:3829:1: ( '{' )
            {
            // InternalSim.g:3829:1: ( '{' )
            // InternalSim.g:3830:2: '{'
            {
             before(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSim.g:3839:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3843:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSim.g:3844:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:3851:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3855:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSim.g:3856:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSim.g:3856:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSim.g:3857:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSim.g:3858:2: ( rule__SEnumeration__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==30||LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSim.g:3858:3: rule__SEnumeration__Group_2__0
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
    // InternalSim.g:3866:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3870:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSim.g:3871:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSim.g:3878:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3882:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSim.g:3883:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSim.g:3883:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSim.g:3884:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSim.g:3885:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==31) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalSim.g:3885:3: rule__SEnumeration__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SEnumeration__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalSim.g:3893:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3897:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSim.g:3898:2: rule__SEnumeration__Group__4__Impl
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
    // InternalSim.g:3904:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3908:1: ( ( '}' ) )
            // InternalSim.g:3909:1: ( '}' )
            {
            // InternalSim.g:3909:1: ( '}' )
            // InternalSim.g:3910:2: '}'
            {
             before(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:3920:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3924:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSim.g:3925:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
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
    // InternalSim.g:3932:1: rule__SEnumeration__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3936:1: ( ( () ) )
            // InternalSim.g:3937:1: ( () )
            {
            // InternalSim.g:3937:1: ( () )
            // InternalSim.g:3938:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_0_0()); 
            // InternalSim.g:3939:2: ()
            // InternalSim.g:3939:3: 
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
    // InternalSim.g:3947:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3951:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSim.g:3952:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
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
    // InternalSim.g:3959:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3963:1: ( ( 'grab' ) )
            // InternalSim.g:3964:1: ( 'grab' )
            {
            // InternalSim.g:3964:1: ( 'grab' )
            // InternalSim.g:3965:2: 'grab'
            {
             before(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:3974:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3978:1: ( rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3 )
            // InternalSim.g:3979:2: rule__SEnumeration__Group_0_0__2__Impl rule__SEnumeration__Group_0_0__3
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
    // InternalSim.g:3986:1: rule__SEnumeration__Group_0_0__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:3990:1: ( ( 'enumeration' ) )
            // InternalSim.g:3991:1: ( 'enumeration' )
            {
            // InternalSim.g:3991:1: ( 'enumeration' )
            // InternalSim.g:3992:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:4001:1: rule__SEnumeration__Group_0_0__3 : rule__SEnumeration__Group_0_0__3__Impl ;
    public final void rule__SEnumeration__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4005:1: ( rule__SEnumeration__Group_0_0__3__Impl )
            // InternalSim.g:4006:2: rule__SEnumeration__Group_0_0__3__Impl
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
    // InternalSim.g:4012:1: rule__SEnumeration__Group_0_0__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SEnumeration__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4016:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSim.g:4017:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSim.g:4017:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 ) )
            // InternalSim.g:4018:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSim.g:4019:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_3 )
            // InternalSim.g:4019:3: rule__SEnumeration__DeductionRuleAssignment_0_0_3
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
    // InternalSim.g:4028:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4032:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSim.g:4033:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
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
    // InternalSim.g:4040:1: rule__SEnumeration__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4044:1: ( ( () ) )
            // InternalSim.g:4045:1: ( () )
            {
            // InternalSim.g:4045:1: ( () )
            // InternalSim.g:4046:2: ()
            {
             before(grammarAccess.getSEnumerationAccess().getSEnumerationAction_0_1_0()); 
            // InternalSim.g:4047:2: ()
            // InternalSim.g:4047:3: 
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
    // InternalSim.g:4055:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4059:1: ( rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2 )
            // InternalSim.g:4060:2: rule__SEnumeration__Group_0_1__1__Impl rule__SEnumeration__Group_0_1__2
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
    // InternalSim.g:4067:1: rule__SEnumeration__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4071:1: ( ( 'ditch' ) )
            // InternalSim.g:4072:1: ( 'ditch' )
            {
            // InternalSim.g:4072:1: ( 'ditch' )
            // InternalSim.g:4073:2: 'ditch'
            {
             before(grammarAccess.getSEnumerationAccess().getDitchKeyword_0_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4082:1: rule__SEnumeration__Group_0_1__2 : rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 ;
    public final void rule__SEnumeration__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4086:1: ( rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3 )
            // InternalSim.g:4087:2: rule__SEnumeration__Group_0_1__2__Impl rule__SEnumeration__Group_0_1__3
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
    // InternalSim.g:4094:1: rule__SEnumeration__Group_0_1__2__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4098:1: ( ( 'enumeration' ) )
            // InternalSim.g:4099:1: ( 'enumeration' )
            {
            // InternalSim.g:4099:1: ( 'enumeration' )
            // InternalSim.g:4100:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:4109:1: rule__SEnumeration__Group_0_1__3 : rule__SEnumeration__Group_0_1__3__Impl ;
    public final void rule__SEnumeration__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4113:1: ( rule__SEnumeration__Group_0_1__3__Impl )
            // InternalSim.g:4114:2: rule__SEnumeration__Group_0_1__3__Impl
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
    // InternalSim.g:4120:1: rule__SEnumeration__Group_0_1__3__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SEnumeration__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4124:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSim.g:4125:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSim.g:4125:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 ) )
            // InternalSim.g:4126:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSim.g:4127:2: ( rule__SEnumeration__DeductionRuleAssignment_0_1_3 )
            // InternalSim.g:4127:3: rule__SEnumeration__DeductionRuleAssignment_0_1_3
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
    // InternalSim.g:4136:1: rule__SEnumeration__Group_0_2__0 : rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 ;
    public final void rule__SEnumeration__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4140:1: ( rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1 )
            // InternalSim.g:4141:2: rule__SEnumeration__Group_0_2__0__Impl rule__SEnumeration__Group_0_2__1
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
    // InternalSim.g:4148:1: rule__SEnumeration__Group_0_2__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4152:1: ( ( 'enumeration' ) )
            // InternalSim.g:4153:1: ( 'enumeration' )
            {
            // InternalSim.g:4153:1: ( 'enumeration' )
            // InternalSim.g:4154:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSim.g:4163:1: rule__SEnumeration__Group_0_2__1 : rule__SEnumeration__Group_0_2__1__Impl ;
    public final void rule__SEnumeration__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4167:1: ( rule__SEnumeration__Group_0_2__1__Impl )
            // InternalSim.g:4168:2: rule__SEnumeration__Group_0_2__1__Impl
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
    // InternalSim.g:4174:1: rule__SEnumeration__Group_0_2__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) ;
    public final void rule__SEnumeration__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4178:1: ( ( ( rule__SEnumeration__NameAssignment_0_2_1 ) ) )
            // InternalSim.g:4179:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            {
            // InternalSim.g:4179:1: ( ( rule__SEnumeration__NameAssignment_0_2_1 ) )
            // InternalSim.g:4180:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_2_1()); 
            // InternalSim.g:4181:2: ( rule__SEnumeration__NameAssignment_0_2_1 )
            // InternalSim.g:4181:3: rule__SEnumeration__NameAssignment_0_2_1
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
    // InternalSim.g:4190:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4194:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSim.g:4195:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
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
    // InternalSim.g:4202:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4206:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSim.g:4207:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSim.g:4207:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSim.g:4208:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSim.g:4209:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSim.g:4209:3: rule__SEnumeration__LiteralsAssignment_2_0
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
    // InternalSim.g:4217:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4221:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSim.g:4222:2: rule__SEnumeration__Group_2__1__Impl
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
    // InternalSim.g:4228:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4232:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSim.g:4233:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSim.g:4233:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSim.g:4234:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSim.g:4235:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==37) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalSim.g:4235:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SEnumeration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalSim.g:4244:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4248:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSim.g:4249:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
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
    // InternalSim.g:4256:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4260:1: ( ( ',' ) )
            // InternalSim.g:4261:1: ( ',' )
            {
            // InternalSim.g:4261:1: ( ',' )
            // InternalSim.g:4262:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:4271:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4275:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSim.g:4276:2: rule__SEnumeration__Group_2_1__1__Impl
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
    // InternalSim.g:4282:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4286:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSim.g:4287:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSim.g:4287:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSim.g:4288:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSim.g:4289:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSim.g:4289:3: rule__SEnumeration__LiteralsAssignment_2_1_1
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
    // InternalSim.g:4298:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4302:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSim.g:4303:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
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
    // InternalSim.g:4310:1: rule__SLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4314:1: ( ( () ) )
            // InternalSim.g:4315:1: ( () )
            {
            // InternalSim.g:4315:1: ( () )
            // InternalSim.g:4316:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_0_0()); 
            // InternalSim.g:4317:2: ()
            // InternalSim.g:4317:3: 
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
    // InternalSim.g:4325:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4329:1: ( rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2 )
            // InternalSim.g:4330:2: rule__SLiteral__Group_0__1__Impl rule__SLiteral__Group_0__2
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
    // InternalSim.g:4337:1: rule__SLiteral__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4341:1: ( ( 'grab' ) )
            // InternalSim.g:4342:1: ( 'grab' )
            {
            // InternalSim.g:4342:1: ( 'grab' )
            // InternalSim.g:4343:2: 'grab'
            {
             before(grammarAccess.getSLiteralAccess().getGrabKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:4352:1: rule__SLiteral__Group_0__2 : rule__SLiteral__Group_0__2__Impl ;
    public final void rule__SLiteral__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4356:1: ( rule__SLiteral__Group_0__2__Impl )
            // InternalSim.g:4357:2: rule__SLiteral__Group_0__2__Impl
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
    // InternalSim.g:4363:1: rule__SLiteral__Group_0__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SLiteral__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4367:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:4368:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:4368:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:4369:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:4370:2: ( rule__SLiteral__DeductionRuleAssignment_0_2 )
            // InternalSim.g:4370:3: rule__SLiteral__DeductionRuleAssignment_0_2
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
    // InternalSim.g:4379:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4383:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSim.g:4384:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
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
    // InternalSim.g:4391:1: rule__SLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4395:1: ( ( () ) )
            // InternalSim.g:4396:1: ( () )
            {
            // InternalSim.g:4396:1: ( () )
            // InternalSim.g:4397:2: ()
            {
             before(grammarAccess.getSLiteralAccess().getSLiteralAction_1_0()); 
            // InternalSim.g:4398:2: ()
            // InternalSim.g:4398:3: 
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
    // InternalSim.g:4406:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4410:1: ( rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2 )
            // InternalSim.g:4411:2: rule__SLiteral__Group_1__1__Impl rule__SLiteral__Group_1__2
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
    // InternalSim.g:4418:1: rule__SLiteral__Group_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4422:1: ( ( 'ditch' ) )
            // InternalSim.g:4423:1: ( 'ditch' )
            {
            // InternalSim.g:4423:1: ( 'ditch' )
            // InternalSim.g:4424:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4433:1: rule__SLiteral__Group_1__2 : rule__SLiteral__Group_1__2__Impl ;
    public final void rule__SLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4437:1: ( rule__SLiteral__Group_1__2__Impl )
            // InternalSim.g:4438:2: rule__SLiteral__Group_1__2__Impl
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
    // InternalSim.g:4444:1: rule__SLiteral__Group_1__2__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4448:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:4449:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:4449:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:4450:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:4451:2: ( rule__SLiteral__DeductionRuleAssignment_1_2 )
            // InternalSim.g:4451:3: rule__SLiteral__DeductionRuleAssignment_1_2
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
    // InternalSim.g:4460:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4464:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSim.g:4465:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:4472:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4476:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSim.g:4477:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSim.g:4477:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSim.g:4478:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSim.g:4479:2: ( rule__SRootType__Alternatives_0 )
            // InternalSim.g:4479:3: rule__SRootType__Alternatives_0
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
    // InternalSim.g:4487:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4491:1: ( rule__SRootType__Group__1__Impl )
            // InternalSim.g:4492:2: rule__SRootType__Group__1__Impl
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
    // InternalSim.g:4498:1: rule__SRootType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4502:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:4503:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:4503:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:4504:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:4514:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4518:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSim.g:4519:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
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
    // InternalSim.g:4526:1: rule__SRootType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4530:1: ( ( () ) )
            // InternalSim.g:4531:1: ( () )
            {
            // InternalSim.g:4531:1: ( () )
            // InternalSim.g:4532:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_0_0()); 
            // InternalSim.g:4533:2: ()
            // InternalSim.g:4533:3: 
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
    // InternalSim.g:4541:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4545:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSim.g:4546:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
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
    // InternalSim.g:4553:1: rule__SRootType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4557:1: ( ( 'grab' ) )
            // InternalSim.g:4558:1: ( 'grab' )
            {
            // InternalSim.g:4558:1: ( 'grab' )
            // InternalSim.g:4559:2: 'grab'
            {
             before(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:4568:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4572:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSim.g:4573:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
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
    // InternalSim.g:4580:1: rule__SRootType__Group_0_0__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4584:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:4585:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:4585:1: ( ( rule__SRootType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:4586:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:4587:2: ( rule__SRootType__AbstractAssignment_0_0_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSim.g:4587:3: rule__SRootType__AbstractAssignment_0_0_2
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
    // InternalSim.g:4595:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4599:1: ( rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4 )
            // InternalSim.g:4600:2: rule__SRootType__Group_0_0__3__Impl rule__SRootType__Group_0_0__4
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
    // InternalSim.g:4607:1: rule__SRootType__Group_0_0__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4611:1: ( ( 'root' ) )
            // InternalSim.g:4612:1: ( 'root' )
            {
            // InternalSim.g:4612:1: ( 'root' )
            // InternalSim.g:4613:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4622:1: rule__SRootType__Group_0_0__4 : rule__SRootType__Group_0_0__4__Impl ;
    public final void rule__SRootType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4626:1: ( rule__SRootType__Group_0_0__4__Impl )
            // InternalSim.g:4627:2: rule__SRootType__Group_0_0__4__Impl
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
    // InternalSim.g:4633:1: rule__SRootType__Group_0_0__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SRootType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4637:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:4638:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:4638:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:4639:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:4640:2: ( rule__SRootType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:4640:3: rule__SRootType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:4649:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4653:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSim.g:4654:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
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
    // InternalSim.g:4661:1: rule__SRootType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4665:1: ( ( () ) )
            // InternalSim.g:4666:1: ( () )
            {
            // InternalSim.g:4666:1: ( () )
            // InternalSim.g:4667:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_1_0()); 
            // InternalSim.g:4668:2: ()
            // InternalSim.g:4668:3: 
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
    // InternalSim.g:4676:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4680:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSim.g:4681:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
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
    // InternalSim.g:4688:1: rule__SRootType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4692:1: ( ( 'ditch' ) )
            // InternalSim.g:4693:1: ( 'ditch' )
            {
            // InternalSim.g:4693:1: ( 'ditch' )
            // InternalSim.g:4694:2: 'ditch'
            {
             before(grammarAccess.getSRootTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:4703:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4707:1: ( rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 )
            // InternalSim.g:4708:2: rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3
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
    // InternalSim.g:4715:1: rule__SRootType__Group_0_1__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4719:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:4720:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:4720:1: ( ( rule__SRootType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:4721:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:4722:2: ( rule__SRootType__AbstractAssignment_0_1_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSim.g:4722:3: rule__SRootType__AbstractAssignment_0_1_2
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
    // InternalSim.g:4730:1: rule__SRootType__Group_0_1__3 : rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 ;
    public final void rule__SRootType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4734:1: ( rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4 )
            // InternalSim.g:4735:2: rule__SRootType__Group_0_1__3__Impl rule__SRootType__Group_0_1__4
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
    // InternalSim.g:4742:1: rule__SRootType__Group_0_1__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4746:1: ( ( 'root' ) )
            // InternalSim.g:4747:1: ( 'root' )
            {
            // InternalSim.g:4747:1: ( 'root' )
            // InternalSim.g:4748:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4757:1: rule__SRootType__Group_0_1__4 : rule__SRootType__Group_0_1__4__Impl ;
    public final void rule__SRootType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4761:1: ( rule__SRootType__Group_0_1__4__Impl )
            // InternalSim.g:4762:2: rule__SRootType__Group_0_1__4__Impl
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
    // InternalSim.g:4768:1: rule__SRootType__Group_0_1__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SRootType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4772:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:4773:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:4773:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:4774:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:4775:2: ( rule__SRootType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:4775:3: rule__SRootType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:4784:1: rule__SRootType__Group_0_2__0 : rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 ;
    public final void rule__SRootType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4788:1: ( rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 )
            // InternalSim.g:4789:2: rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1
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
    // InternalSim.g:4796:1: rule__SRootType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4800:1: ( ( () ) )
            // InternalSim.g:4801:1: ( () )
            {
            // InternalSim.g:4801:1: ( () )
            // InternalSim.g:4802:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_2_0()); 
            // InternalSim.g:4803:2: ()
            // InternalSim.g:4803:3: 
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
    // InternalSim.g:4811:1: rule__SRootType__Group_0_2__1 : rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 ;
    public final void rule__SRootType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4815:1: ( rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 )
            // InternalSim.g:4816:2: rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2
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
    // InternalSim.g:4823:1: rule__SRootType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SRootType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4827:1: ( ( 'morph' ) )
            // InternalSim.g:4828:1: ( 'morph' )
            {
            // InternalSim.g:4828:1: ( 'morph' )
            // InternalSim.g:4829:2: 'morph'
            {
             before(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:4838:1: rule__SRootType__Group_0_2__2 : rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 ;
    public final void rule__SRootType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4842:1: ( rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 )
            // InternalSim.g:4843:2: rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3
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
    // InternalSim.g:4850:1: rule__SRootType__Group_0_2__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SRootType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4854:1: ( ( ( rule__SRootType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:4855:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:4855:1: ( ( rule__SRootType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:4856:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:4857:2: ( rule__SRootType__AbstractAssignment_0_2_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSim.g:4857:3: rule__SRootType__AbstractAssignment_0_2_2
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
    // InternalSim.g:4865:1: rule__SRootType__Group_0_2__3 : rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 ;
    public final void rule__SRootType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4869:1: ( rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4 )
            // InternalSim.g:4870:2: rule__SRootType__Group_0_2__3__Impl rule__SRootType__Group_0_2__4
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
    // InternalSim.g:4877:1: rule__SRootType__Group_0_2__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4881:1: ( ( 'root' ) )
            // InternalSim.g:4882:1: ( 'root' )
            {
            // InternalSim.g:4882:1: ( 'root' )
            // InternalSim.g:4883:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:4892:1: rule__SRootType__Group_0_2__4 : rule__SRootType__Group_0_2__4__Impl ;
    public final void rule__SRootType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4896:1: ( rule__SRootType__Group_0_2__4__Impl )
            // InternalSim.g:4897:2: rule__SRootType__Group_0_2__4__Impl
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
    // InternalSim.g:4903:1: rule__SRootType__Group_0_2__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SRootType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4907:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:4908:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:4908:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:4909:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:4910:2: ( rule__SRootType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:4910:3: rule__SRootType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:4919:1: rule__SRootType__Group_0_3__0 : rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 ;
    public final void rule__SRootType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4923:1: ( rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 )
            // InternalSim.g:4924:2: rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1
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
    // InternalSim.g:4931:1: rule__SRootType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SRootType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4935:1: ( ( () ) )
            // InternalSim.g:4936:1: ( () )
            {
            // InternalSim.g:4936:1: ( () )
            // InternalSim.g:4937:2: ()
            {
             before(grammarAccess.getSRootTypeAccess().getSRootTypeAction_0_3_0()); 
            // InternalSim.g:4938:2: ()
            // InternalSim.g:4938:3: 
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
    // InternalSim.g:4946:1: rule__SRootType__Group_0_3__1 : rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 ;
    public final void rule__SRootType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4950:1: ( rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 )
            // InternalSim.g:4951:2: rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2
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
    // InternalSim.g:4958:1: rule__SRootType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SRootType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4962:1: ( ( 'fuse' ) )
            // InternalSim.g:4963:1: ( 'fuse' )
            {
            // InternalSim.g:4963:1: ( 'fuse' )
            // InternalSim.g:4964:2: 'fuse'
            {
             before(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:4973:1: rule__SRootType__Group_0_3__2 : rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 ;
    public final void rule__SRootType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4977:1: ( rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 )
            // InternalSim.g:4978:2: rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3
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
    // InternalSim.g:4985:1: rule__SRootType__Group_0_3__2__Impl : ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SRootType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:4989:1: ( ( ( rule__SRootType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:4990:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:4990:1: ( ( rule__SRootType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:4991:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:4992:2: ( rule__SRootType__AbstractAssignment_0_3_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSim.g:4992:3: rule__SRootType__AbstractAssignment_0_3_2
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
    // InternalSim.g:5000:1: rule__SRootType__Group_0_3__3 : rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 ;
    public final void rule__SRootType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5004:1: ( rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4 )
            // InternalSim.g:5005:2: rule__SRootType__Group_0_3__3__Impl rule__SRootType__Group_0_3__4
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
    // InternalSim.g:5012:1: rule__SRootType__Group_0_3__3__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5016:1: ( ( 'root' ) )
            // InternalSim.g:5017:1: ( 'root' )
            {
            // InternalSim.g:5017:1: ( 'root' )
            // InternalSim.g:5018:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:5027:1: rule__SRootType__Group_0_3__4 : rule__SRootType__Group_0_3__4__Impl ;
    public final void rule__SRootType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5031:1: ( rule__SRootType__Group_0_3__4__Impl )
            // InternalSim.g:5032:2: rule__SRootType__Group_0_3__4__Impl
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
    // InternalSim.g:5038:1: rule__SRootType__Group_0_3__4__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SRootType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5042:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5043:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5043:1: ( ( rule__SRootType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5044:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5045:2: ( rule__SRootType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5045:3: rule__SRootType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:5054:1: rule__SRootType__Group_0_4__0 : rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 ;
    public final void rule__SRootType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5058:1: ( rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1 )
            // InternalSim.g:5059:2: rule__SRootType__Group_0_4__0__Impl rule__SRootType__Group_0_4__1
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
    // InternalSim.g:5066:1: rule__SRootType__Group_0_4__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SRootType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5070:1: ( ( ( rule__SRootType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5071:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5071:1: ( ( rule__SRootType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5072:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5073:2: ( rule__SRootType__AbstractAssignment_0_4_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSim.g:5073:3: rule__SRootType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5081:1: rule__SRootType__Group_0_4__1 : rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 ;
    public final void rule__SRootType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5085:1: ( rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2 )
            // InternalSim.g:5086:2: rule__SRootType__Group_0_4__1__Impl rule__SRootType__Group_0_4__2
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
    // InternalSim.g:5093:1: rule__SRootType__Group_0_4__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5097:1: ( ( 'root' ) )
            // InternalSim.g:5098:1: ( 'root' )
            {
            // InternalSim.g:5098:1: ( 'root' )
            // InternalSim.g:5099:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_4_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSim.g:5108:1: rule__SRootType__Group_0_4__2 : rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 ;
    public final void rule__SRootType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5112:1: ( rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3 )
            // InternalSim.g:5113:2: rule__SRootType__Group_0_4__2__Impl rule__SRootType__Group_0_4__3
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
    // InternalSim.g:5120:1: rule__SRootType__Group_0_4__2__Impl : ( ( rule__SRootType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SRootType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5124:1: ( ( ( rule__SRootType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5125:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5125:1: ( ( rule__SRootType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5126:2: ( rule__SRootType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5127:2: ( rule__SRootType__NameAssignment_0_4_2 )
            // InternalSim.g:5127:3: rule__SRootType__NameAssignment_0_4_2
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
    // InternalSim.g:5135:1: rule__SRootType__Group_0_4__3 : rule__SRootType__Group_0_4__3__Impl ;
    public final void rule__SRootType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5139:1: ( rule__SRootType__Group_0_4__3__Impl )
            // InternalSim.g:5140:2: rule__SRootType__Group_0_4__3__Impl
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
    // InternalSim.g:5146:1: rule__SRootType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SRootType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5150:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5151:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5151:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5152:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5162:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5166:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSim.g:5167:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSim.g:5174:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5178:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSim.g:5179:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSim.g:5179:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSim.g:5180:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSim.g:5181:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSim.g:5181:3: rule__SDetailType__Alternatives_0
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
    // InternalSim.g:5189:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5193:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSim.g:5194:2: rule__SDetailType__Group__1__Impl
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
    // InternalSim.g:5200:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5204:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSim.g:5205:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSim.g:5205:1: ( ruleSComplexTypeFeatures )
            // InternalSim.g:5206:2: ruleSComplexTypeFeatures
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
    // InternalSim.g:5216:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5220:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSim.g:5221:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
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
    // InternalSim.g:5228:1: rule__SDetailType__Group_0_0__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5232:1: ( ( () ) )
            // InternalSim.g:5233:1: ( () )
            {
            // InternalSim.g:5233:1: ( () )
            // InternalSim.g:5234:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_0_0()); 
            // InternalSim.g:5235:2: ()
            // InternalSim.g:5235:3: 
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
    // InternalSim.g:5243:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5247:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSim.g:5248:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
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
    // InternalSim.g:5255:1: rule__SDetailType__Group_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5259:1: ( ( 'grab' ) )
            // InternalSim.g:5260:1: ( 'grab' )
            {
            // InternalSim.g:5260:1: ( 'grab' )
            // InternalSim.g:5261:2: 'grab'
            {
             before(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:5270:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5274:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSim.g:5275:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
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
    // InternalSim.g:5282:1: rule__SDetailType__Group_0_0__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5286:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? ) )
            // InternalSim.g:5287:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            {
            // InternalSim.g:5287:1: ( ( rule__SDetailType__AbstractAssignment_0_0_2 )? )
            // InternalSim.g:5288:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_2()); 
            // InternalSim.g:5289:2: ( rule__SDetailType__AbstractAssignment_0_0_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==50) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSim.g:5289:3: rule__SDetailType__AbstractAssignment_0_0_2
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
    // InternalSim.g:5297:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5301:1: ( rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4 )
            // InternalSim.g:5302:2: rule__SDetailType__Group_0_0__3__Impl rule__SDetailType__Group_0_0__4
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
    // InternalSim.g:5309:1: rule__SDetailType__Group_0_0__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5313:1: ( ( 'detail' ) )
            // InternalSim.g:5314:1: ( 'detail' )
            {
            // InternalSim.g:5314:1: ( 'detail' )
            // InternalSim.g:5315:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5324:1: rule__SDetailType__Group_0_0__4 : rule__SDetailType__Group_0_0__4__Impl ;
    public final void rule__SDetailType__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5328:1: ( rule__SDetailType__Group_0_0__4__Impl )
            // InternalSim.g:5329:2: rule__SDetailType__Group_0_0__4__Impl
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
    // InternalSim.g:5335:1: rule__SDetailType__Group_0_0__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) ;
    public final void rule__SDetailType__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5339:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) ) )
            // InternalSim.g:5340:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            {
            // InternalSim.g:5340:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_4 ) )
            // InternalSim.g:5341:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_4()); 
            // InternalSim.g:5342:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_4 )
            // InternalSim.g:5342:3: rule__SDetailType__DeductionRuleAssignment_0_0_4
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
    // InternalSim.g:5351:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5355:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSim.g:5356:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
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
    // InternalSim.g:5363:1: rule__SDetailType__Group_0_1__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5367:1: ( ( () ) )
            // InternalSim.g:5368:1: ( () )
            {
            // InternalSim.g:5368:1: ( () )
            // InternalSim.g:5369:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_1_0()); 
            // InternalSim.g:5370:2: ()
            // InternalSim.g:5370:3: 
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
    // InternalSim.g:5378:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5382:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSim.g:5383:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
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
    // InternalSim.g:5390:1: rule__SDetailType__Group_0_1__1__Impl : ( 'ditch' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5394:1: ( ( 'ditch' ) )
            // InternalSim.g:5395:1: ( 'ditch' )
            {
            // InternalSim.g:5395:1: ( 'ditch' )
            // InternalSim.g:5396:2: 'ditch'
            {
             before(grammarAccess.getSDetailTypeAccess().getDitchKeyword_0_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:5405:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5409:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSim.g:5410:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
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
    // InternalSim.g:5417:1: rule__SDetailType__Group_0_1__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5421:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? ) )
            // InternalSim.g:5422:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            {
            // InternalSim.g:5422:1: ( ( rule__SDetailType__AbstractAssignment_0_1_2 )? )
            // InternalSim.g:5423:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_2()); 
            // InternalSim.g:5424:2: ( rule__SDetailType__AbstractAssignment_0_1_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSim.g:5424:3: rule__SDetailType__AbstractAssignment_0_1_2
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
    // InternalSim.g:5432:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5436:1: ( rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4 )
            // InternalSim.g:5437:2: rule__SDetailType__Group_0_1__3__Impl rule__SDetailType__Group_0_1__4
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
    // InternalSim.g:5444:1: rule__SDetailType__Group_0_1__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5448:1: ( ( 'detail' ) )
            // InternalSim.g:5449:1: ( 'detail' )
            {
            // InternalSim.g:5449:1: ( 'detail' )
            // InternalSim.g:5450:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5459:1: rule__SDetailType__Group_0_1__4 : rule__SDetailType__Group_0_1__4__Impl ;
    public final void rule__SDetailType__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5463:1: ( rule__SDetailType__Group_0_1__4__Impl )
            // InternalSim.g:5464:2: rule__SDetailType__Group_0_1__4__Impl
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
    // InternalSim.g:5470:1: rule__SDetailType__Group_0_1__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) ;
    public final void rule__SDetailType__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5474:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) ) )
            // InternalSim.g:5475:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            {
            // InternalSim.g:5475:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_4 ) )
            // InternalSim.g:5476:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_4()); 
            // InternalSim.g:5477:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_4 )
            // InternalSim.g:5477:3: rule__SDetailType__DeductionRuleAssignment_0_1_4
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
    // InternalSim.g:5486:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5490:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSim.g:5491:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
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
    // InternalSim.g:5498:1: rule__SDetailType__Group_0_2__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5502:1: ( ( () ) )
            // InternalSim.g:5503:1: ( () )
            {
            // InternalSim.g:5503:1: ( () )
            // InternalSim.g:5504:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_2_0()); 
            // InternalSim.g:5505:2: ()
            // InternalSim.g:5505:3: 
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
    // InternalSim.g:5513:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5517:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSim.g:5518:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
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
    // InternalSim.g:5525:1: rule__SDetailType__Group_0_2__1__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5529:1: ( ( 'morph' ) )
            // InternalSim.g:5530:1: ( 'morph' )
            {
            // InternalSim.g:5530:1: ( 'morph' )
            // InternalSim.g:5531:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:5540:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5544:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSim.g:5545:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
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
    // InternalSim.g:5552:1: rule__SDetailType__Group_0_2__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5556:1: ( ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? ) )
            // InternalSim.g:5557:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            {
            // InternalSim.g:5557:1: ( ( rule__SDetailType__AbstractAssignment_0_2_2 )? )
            // InternalSim.g:5558:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_2()); 
            // InternalSim.g:5559:2: ( rule__SDetailType__AbstractAssignment_0_2_2 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSim.g:5559:3: rule__SDetailType__AbstractAssignment_0_2_2
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
    // InternalSim.g:5567:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5571:1: ( rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4 )
            // InternalSim.g:5572:2: rule__SDetailType__Group_0_2__3__Impl rule__SDetailType__Group_0_2__4
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
    // InternalSim.g:5579:1: rule__SDetailType__Group_0_2__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5583:1: ( ( 'detail' ) )
            // InternalSim.g:5584:1: ( 'detail' )
            {
            // InternalSim.g:5584:1: ( 'detail' )
            // InternalSim.g:5585:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5594:1: rule__SDetailType__Group_0_2__4 : rule__SDetailType__Group_0_2__4__Impl ;
    public final void rule__SDetailType__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5598:1: ( rule__SDetailType__Group_0_2__4__Impl )
            // InternalSim.g:5599:2: rule__SDetailType__Group_0_2__4__Impl
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
    // InternalSim.g:5605:1: rule__SDetailType__Group_0_2__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) ;
    public final void rule__SDetailType__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5609:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) ) )
            // InternalSim.g:5610:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            {
            // InternalSim.g:5610:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_4 ) )
            // InternalSim.g:5611:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_4()); 
            // InternalSim.g:5612:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_4 )
            // InternalSim.g:5612:3: rule__SDetailType__DeductionRuleAssignment_0_2_4
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
    // InternalSim.g:5621:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5625:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSim.g:5626:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
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
    // InternalSim.g:5633:1: rule__SDetailType__Group_0_3__0__Impl : ( () ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5637:1: ( ( () ) )
            // InternalSim.g:5638:1: ( () )
            {
            // InternalSim.g:5638:1: ( () )
            // InternalSim.g:5639:2: ()
            {
             before(grammarAccess.getSDetailTypeAccess().getSDetailTypeAction_0_3_0()); 
            // InternalSim.g:5640:2: ()
            // InternalSim.g:5640:3: 
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
    // InternalSim.g:5648:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5652:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSim.g:5653:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
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
    // InternalSim.g:5660:1: rule__SDetailType__Group_0_3__1__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5664:1: ( ( 'fuse' ) )
            // InternalSim.g:5665:1: ( 'fuse' )
            {
            // InternalSim.g:5665:1: ( 'fuse' )
            // InternalSim.g:5666:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_3_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSim.g:5675:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5679:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSim.g:5680:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
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
    // InternalSim.g:5687:1: rule__SDetailType__Group_0_3__2__Impl : ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5691:1: ( ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? ) )
            // InternalSim.g:5692:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            {
            // InternalSim.g:5692:1: ( ( rule__SDetailType__AbstractAssignment_0_3_2 )? )
            // InternalSim.g:5693:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_2()); 
            // InternalSim.g:5694:2: ( rule__SDetailType__AbstractAssignment_0_3_2 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSim.g:5694:3: rule__SDetailType__AbstractAssignment_0_3_2
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
    // InternalSim.g:5702:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5706:1: ( rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4 )
            // InternalSim.g:5707:2: rule__SDetailType__Group_0_3__3__Impl rule__SDetailType__Group_0_3__4
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
    // InternalSim.g:5714:1: rule__SDetailType__Group_0_3__3__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5718:1: ( ( 'detail' ) )
            // InternalSim.g:5719:1: ( 'detail' )
            {
            // InternalSim.g:5719:1: ( 'detail' )
            // InternalSim.g:5720:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5729:1: rule__SDetailType__Group_0_3__4 : rule__SDetailType__Group_0_3__4__Impl ;
    public final void rule__SDetailType__Group_0_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5733:1: ( rule__SDetailType__Group_0_3__4__Impl )
            // InternalSim.g:5734:2: rule__SDetailType__Group_0_3__4__Impl
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
    // InternalSim.g:5740:1: rule__SDetailType__Group_0_3__4__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) ;
    public final void rule__SDetailType__Group_0_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5744:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) ) )
            // InternalSim.g:5745:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            {
            // InternalSim.g:5745:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_3_4 ) )
            // InternalSim.g:5746:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_3_4()); 
            // InternalSim.g:5747:2: ( rule__SDetailType__DeductionRuleAssignment_0_3_4 )
            // InternalSim.g:5747:3: rule__SDetailType__DeductionRuleAssignment_0_3_4
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
    // InternalSim.g:5756:1: rule__SDetailType__Group_0_4__0 : rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 ;
    public final void rule__SDetailType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5760:1: ( rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1 )
            // InternalSim.g:5761:2: rule__SDetailType__Group_0_4__0__Impl rule__SDetailType__Group_0_4__1
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
    // InternalSim.g:5768:1: rule__SDetailType__Group_0_4__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) ;
    public final void rule__SDetailType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5772:1: ( ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? ) )
            // InternalSim.g:5773:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            {
            // InternalSim.g:5773:1: ( ( rule__SDetailType__AbstractAssignment_0_4_0 )? )
            // InternalSim.g:5774:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_4_0()); 
            // InternalSim.g:5775:2: ( rule__SDetailType__AbstractAssignment_0_4_0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSim.g:5775:3: rule__SDetailType__AbstractAssignment_0_4_0
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
    // InternalSim.g:5783:1: rule__SDetailType__Group_0_4__1 : rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 ;
    public final void rule__SDetailType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5787:1: ( rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2 )
            // InternalSim.g:5788:2: rule__SDetailType__Group_0_4__1__Impl rule__SDetailType__Group_0_4__2
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
    // InternalSim.g:5795:1: rule__SDetailType__Group_0_4__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5799:1: ( ( 'detail' ) )
            // InternalSim.g:5800:1: ( 'detail' )
            {
            // InternalSim.g:5800:1: ( 'detail' )
            // InternalSim.g:5801:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_4_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:5810:1: rule__SDetailType__Group_0_4__2 : rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 ;
    public final void rule__SDetailType__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5814:1: ( rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3 )
            // InternalSim.g:5815:2: rule__SDetailType__Group_0_4__2__Impl rule__SDetailType__Group_0_4__3
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
    // InternalSim.g:5822:1: rule__SDetailType__Group_0_4__2__Impl : ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) ;
    public final void rule__SDetailType__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5826:1: ( ( ( rule__SDetailType__NameAssignment_0_4_2 ) ) )
            // InternalSim.g:5827:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            {
            // InternalSim.g:5827:1: ( ( rule__SDetailType__NameAssignment_0_4_2 ) )
            // InternalSim.g:5828:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_4_2()); 
            // InternalSim.g:5829:2: ( rule__SDetailType__NameAssignment_0_4_2 )
            // InternalSim.g:5829:3: rule__SDetailType__NameAssignment_0_4_2
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
    // InternalSim.g:5837:1: rule__SDetailType__Group_0_4__3 : rule__SDetailType__Group_0_4__3__Impl ;
    public final void rule__SDetailType__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5841:1: ( rule__SDetailType__Group_0_4__3__Impl )
            // InternalSim.g:5842:2: rule__SDetailType__Group_0_4__3__Impl
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
    // InternalSim.g:5848:1: rule__SDetailType__Group_0_4__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5852:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSim.g:5853:1: ( ruleSComplexTypeExtends )
            {
            // InternalSim.g:5853:1: ( ruleSComplexTypeExtends )
            // InternalSim.g:5854:2: ruleSComplexTypeExtends
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
    // InternalSim.g:5864:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5868:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSim.g:5869:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
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
    // InternalSim.g:5876:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5880:1: ( ( 'extends' ) )
            // InternalSim.g:5881:1: ( 'extends' )
            {
            // InternalSim.g:5881:1: ( 'extends' )
            // InternalSim.g:5882:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSim.g:5891:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5895:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSim.g:5896:2: rule__SComplexTypeExtends__Group__1__Impl
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
    // InternalSim.g:5902:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5906:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSim.g:5907:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSim.g:5907:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSim.g:5908:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSim.g:5909:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSim.g:5909:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
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
    // InternalSim.g:5918:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5922:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSim.g:5923:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
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
    // InternalSim.g:5930:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5934:1: ( ( '{' ) )
            // InternalSim.g:5935:1: ( '{' )
            {
            // InternalSim.g:5935:1: ( '{' )
            // InternalSim.g:5936:2: '{'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSim.g:5945:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5949:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSim.g:5950:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
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
    // InternalSim.g:5957:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5961:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSim.g:5962:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSim.g:5962:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSim.g:5963:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSim.g:5964:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID||LA59_0==11||(LA59_0>=13 && LA59_0<=14)||(LA59_0>=30 && LA59_0<=31)||LA59_0==36||LA59_0==39||LA59_0==41||LA59_0==51) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalSim.g:5964:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__SComplexTypeFeatures__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalSim.g:5972:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5976:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSim.g:5977:2: rule__SComplexTypeFeatures__Group__2__Impl
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
    // InternalSim.g:5983:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:5987:1: ( ( '}' ) )
            // InternalSim.g:5988:1: ( '}' )
            {
            // InternalSim.g:5988:1: ( '}' )
            // InternalSim.g:5989:2: '}'
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getRightCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSim.g:5999:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6003:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSim.g:6004:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
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
    // InternalSim.g:6011:1: rule__SAssociation__Group_0__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6015:1: ( ( () ) )
            // InternalSim.g:6016:1: ( () )
            {
            // InternalSim.g:6016:1: ( () )
            // InternalSim.g:6017:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_0_0()); 
            // InternalSim.g:6018:2: ()
            // InternalSim.g:6018:3: 
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
    // InternalSim.g:6026:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6030:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSim.g:6031:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
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
    // InternalSim.g:6038:1: rule__SAssociation__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6042:1: ( ( 'grab' ) )
            // InternalSim.g:6043:1: ( 'grab' )
            {
            // InternalSim.g:6043:1: ( 'grab' )
            // InternalSim.g:6044:2: 'grab'
            {
             before(grammarAccess.getSAssociationAccess().getGrabKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:6053:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6057:1: ( rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3 )
            // InternalSim.g:6058:2: rule__SAssociation__Group_0__2__Impl rule__SAssociation__Group_0__3
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
    // InternalSim.g:6065:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__Alternatives_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6069:1: ( ( ( rule__SAssociation__Alternatives_0_2 ) ) )
            // InternalSim.g:6070:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            {
            // InternalSim.g:6070:1: ( ( rule__SAssociation__Alternatives_0_2 ) )
            // InternalSim.g:6071:2: ( rule__SAssociation__Alternatives_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_2()); 
            // InternalSim.g:6072:2: ( rule__SAssociation__Alternatives_0_2 )
            // InternalSim.g:6072:3: rule__SAssociation__Alternatives_0_2
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
    // InternalSim.g:6080:1: rule__SAssociation__Group_0__3 : rule__SAssociation__Group_0__3__Impl ;
    public final void rule__SAssociation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6084:1: ( rule__SAssociation__Group_0__3__Impl )
            // InternalSim.g:6085:2: rule__SAssociation__Group_0__3__Impl
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
    // InternalSim.g:6091:1: rule__SAssociation__Group_0__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAssociation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6095:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6096:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6096:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6097:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6098:2: ( rule__SAssociation__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6098:3: rule__SAssociation__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6107:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6111:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSim.g:6112:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
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
    // InternalSim.g:6119:1: rule__SAssociation__Group_1__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6123:1: ( ( () ) )
            // InternalSim.g:6124:1: ( () )
            {
            // InternalSim.g:6124:1: ( () )
            // InternalSim.g:6125:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_1_0()); 
            // InternalSim.g:6126:2: ()
            // InternalSim.g:6126:3: 
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
    // InternalSim.g:6134:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6138:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSim.g:6139:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
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
    // InternalSim.g:6146:1: rule__SAssociation__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6150:1: ( ( 'morph' ) )
            // InternalSim.g:6151:1: ( 'morph' )
            {
            // InternalSim.g:6151:1: ( 'morph' )
            // InternalSim.g:6152:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:6161:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6165:1: ( rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3 )
            // InternalSim.g:6166:2: rule__SAssociation__Group_1__2__Impl rule__SAssociation__Group_1__3
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
    // InternalSim.g:6173:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__Alternatives_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6177:1: ( ( ( rule__SAssociation__Alternatives_1_2 ) ) )
            // InternalSim.g:6178:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            {
            // InternalSim.g:6178:1: ( ( rule__SAssociation__Alternatives_1_2 ) )
            // InternalSim.g:6179:2: ( rule__SAssociation__Alternatives_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_2()); 
            // InternalSim.g:6180:2: ( rule__SAssociation__Alternatives_1_2 )
            // InternalSim.g:6180:3: rule__SAssociation__Alternatives_1_2
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
    // InternalSim.g:6188:1: rule__SAssociation__Group_1__3 : rule__SAssociation__Group_1__3__Impl ;
    public final void rule__SAssociation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6192:1: ( rule__SAssociation__Group_1__3__Impl )
            // InternalSim.g:6193:2: rule__SAssociation__Group_1__3__Impl
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
    // InternalSim.g:6199:1: rule__SAssociation__Group_1__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAssociation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6203:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6204:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6204:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6205:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6206:2: ( rule__SAssociation__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6206:3: rule__SAssociation__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6215:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6219:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSim.g:6220:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
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
    // InternalSim.g:6227:1: rule__SAssociation__Group_2__0__Impl : ( () ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6231:1: ( ( () ) )
            // InternalSim.g:6232:1: ( () )
            {
            // InternalSim.g:6232:1: ( () )
            // InternalSim.g:6233:2: ()
            {
             before(grammarAccess.getSAssociationAccess().getSAssociationAction_2_0()); 
            // InternalSim.g:6234:2: ()
            // InternalSim.g:6234:3: 
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
    // InternalSim.g:6242:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6246:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSim.g:6247:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
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
    // InternalSim.g:6254:1: rule__SAssociation__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6258:1: ( ( 'ditch' ) )
            // InternalSim.g:6259:1: ( 'ditch' )
            {
            // InternalSim.g:6259:1: ( 'ditch' )
            // InternalSim.g:6260:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:6269:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6273:1: ( rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3 )
            // InternalSim.g:6274:2: rule__SAssociation__Group_2__2__Impl rule__SAssociation__Group_2__3
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
    // InternalSim.g:6281:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__Alternatives_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6285:1: ( ( ( rule__SAssociation__Alternatives_2_2 ) ) )
            // InternalSim.g:6286:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            {
            // InternalSim.g:6286:1: ( ( rule__SAssociation__Alternatives_2_2 ) )
            // InternalSim.g:6287:2: ( rule__SAssociation__Alternatives_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_2()); 
            // InternalSim.g:6288:2: ( rule__SAssociation__Alternatives_2_2 )
            // InternalSim.g:6288:3: rule__SAssociation__Alternatives_2_2
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
    // InternalSim.g:6296:1: rule__SAssociation__Group_2__3 : rule__SAssociation__Group_2__3__Impl ;
    public final void rule__SAssociation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6300:1: ( rule__SAssociation__Group_2__3__Impl )
            // InternalSim.g:6301:2: rule__SAssociation__Group_2__3__Impl
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
    // InternalSim.g:6307:1: rule__SAssociation__Group_2__3__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAssociation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6311:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6312:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6312:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6313:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6314:2: ( rule__SAssociation__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6314:3: rule__SAssociation__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6323:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6327:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSim.g:6328:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
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
    // InternalSim.g:6335:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6339:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSim.g:6340:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSim.g:6340:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSim.g:6341:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSim.g:6342:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==51) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSim.g:6342:3: rule__SAssociation__DerivedAssignment_3_0
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
    // InternalSim.g:6350:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6354:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSim.g:6355:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
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
    // InternalSim.g:6362:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6366:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSim.g:6367:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSim.g:6367:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSim.g:6368:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSim.g:6369:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSim.g:6369:3: rule__SAssociation__Alternatives_3_1
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
    // InternalSim.g:6377:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6381:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSim.g:6382:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:6389:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6393:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSim.g:6394:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSim.g:6394:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSim.g:6395:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSim.g:6396:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSim.g:6396:3: rule__SAssociation__NameAssignment_3_2
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
    // InternalSim.g:6404:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6408:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSim.g:6409:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
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
    // InternalSim.g:6416:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6420:1: ( ( ':' ) )
            // InternalSim.g:6421:1: ( ':' )
            {
            // InternalSim.g:6421:1: ( ':' )
            // InternalSim.g:6422:2: ':'
            {
             before(grammarAccess.getSAssociationAccess().getColonKeyword_3_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:6431:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6435:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSim.g:6436:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
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
    // InternalSim.g:6443:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6447:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSim.g:6448:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSim.g:6448:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSim.g:6449:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSim.g:6450:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSim.g:6450:3: rule__SAssociation__TypeAssignment_3_4
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
    // InternalSim.g:6458:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6462:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSim.g:6463:2: rule__SAssociation__Group_3__5__Impl
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
    // InternalSim.g:6469:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6473:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSim.g:6474:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSim.g:6474:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSim.g:6475:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSim.g:6476:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==42) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSim.g:6476:3: rule__SAssociation__MultiplicityAssignment_3_5
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
    // InternalSim.g:6485:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6489:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSim.g:6490:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
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
    // InternalSim.g:6497:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6501:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSim.g:6502:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSim.g:6502:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSim.g:6503:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSim.g:6504:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSim.g:6504:3: rule__SAssociation__KindAssignment_3_1_1_0
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
    // InternalSim.g:6512:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6516:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSim.g:6517:2: rule__SAssociation__Group_3_1_1__1__Impl
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
    // InternalSim.g:6523:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6527:1: ( ( 'composite' ) )
            // InternalSim.g:6528:1: ( 'composite' )
            {
            // InternalSim.g:6528:1: ( 'composite' )
            // InternalSim.g:6529:2: 'composite'
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
    // InternalSim.g:6539:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6543:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSim.g:6544:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
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
    // InternalSim.g:6551:1: rule__SAttribute__Group_0__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6555:1: ( ( () ) )
            // InternalSim.g:6556:1: ( () )
            {
            // InternalSim.g:6556:1: ( () )
            // InternalSim.g:6557:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_0_0()); 
            // InternalSim.g:6558:2: ()
            // InternalSim.g:6558:3: 
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
    // InternalSim.g:6566:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6570:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSim.g:6571:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
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
    // InternalSim.g:6578:1: rule__SAttribute__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6582:1: ( ( 'grab' ) )
            // InternalSim.g:6583:1: ( 'grab' )
            {
            // InternalSim.g:6583:1: ( 'grab' )
            // InternalSim.g:6584:2: 'grab'
            {
             before(grammarAccess.getSAttributeAccess().getGrabKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:6593:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6597:1: ( rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3 )
            // InternalSim.g:6598:2: rule__SAttribute__Group_0__2__Impl rule__SAttribute__Group_0__3
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
    // InternalSim.g:6605:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__Alternatives_0_2 )? ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6609:1: ( ( ( rule__SAttribute__Alternatives_0_2 )? ) )
            // InternalSim.g:6610:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            {
            // InternalSim.g:6610:1: ( ( rule__SAttribute__Alternatives_0_2 )? )
            // InternalSim.g:6611:2: ( rule__SAttribute__Alternatives_0_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_0_2()); 
            // InternalSim.g:6612:2: ( rule__SAttribute__Alternatives_0_2 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==15||LA62_0==41) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSim.g:6612:3: rule__SAttribute__Alternatives_0_2
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
    // InternalSim.g:6620:1: rule__SAttribute__Group_0__3 : rule__SAttribute__Group_0__3__Impl ;
    public final void rule__SAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6624:1: ( rule__SAttribute__Group_0__3__Impl )
            // InternalSim.g:6625:2: rule__SAttribute__Group_0__3__Impl
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
    // InternalSim.g:6631:1: rule__SAttribute__Group_0__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) ;
    public final void rule__SAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6635:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) ) )
            // InternalSim.g:6636:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            {
            // InternalSim.g:6636:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_3 ) )
            // InternalSim.g:6637:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_3()); 
            // InternalSim.g:6638:2: ( rule__SAttribute__DeductionRuleAssignment_0_3 )
            // InternalSim.g:6638:3: rule__SAttribute__DeductionRuleAssignment_0_3
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
    // InternalSim.g:6647:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6651:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSim.g:6652:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
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
    // InternalSim.g:6659:1: rule__SAttribute__Group_1__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6663:1: ( ( () ) )
            // InternalSim.g:6664:1: ( () )
            {
            // InternalSim.g:6664:1: ( () )
            // InternalSim.g:6665:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_1_0()); 
            // InternalSim.g:6666:2: ()
            // InternalSim.g:6666:3: 
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
    // InternalSim.g:6674:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6678:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSim.g:6679:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
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
    // InternalSim.g:6686:1: rule__SAttribute__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6690:1: ( ( 'morph' ) )
            // InternalSim.g:6691:1: ( 'morph' )
            {
            // InternalSim.g:6691:1: ( 'morph' )
            // InternalSim.g:6692:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:6701:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6705:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSim.g:6706:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
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
    // InternalSim.g:6713:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__Alternatives_1_2 )? ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6717:1: ( ( ( rule__SAttribute__Alternatives_1_2 )? ) )
            // InternalSim.g:6718:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            {
            // InternalSim.g:6718:1: ( ( rule__SAttribute__Alternatives_1_2 )? )
            // InternalSim.g:6719:2: ( rule__SAttribute__Alternatives_1_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_1_2()); 
            // InternalSim.g:6720:2: ( rule__SAttribute__Alternatives_1_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==15||LA63_0==41) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSim.g:6720:3: rule__SAttribute__Alternatives_1_2
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
    // InternalSim.g:6728:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6732:1: ( rule__SAttribute__Group_1__3__Impl )
            // InternalSim.g:6733:2: rule__SAttribute__Group_1__3__Impl
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
    // InternalSim.g:6739:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6743:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) ) )
            // InternalSim.g:6744:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            {
            // InternalSim.g:6744:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_3 ) )
            // InternalSim.g:6745:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_3()); 
            // InternalSim.g:6746:2: ( rule__SAttribute__DeductionRuleAssignment_1_3 )
            // InternalSim.g:6746:3: rule__SAttribute__DeductionRuleAssignment_1_3
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
    // InternalSim.g:6755:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6759:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSim.g:6760:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
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
    // InternalSim.g:6767:1: rule__SAttribute__Group_2__0__Impl : ( () ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6771:1: ( ( () ) )
            // InternalSim.g:6772:1: ( () )
            {
            // InternalSim.g:6772:1: ( () )
            // InternalSim.g:6773:2: ()
            {
             before(grammarAccess.getSAttributeAccess().getSAttributeAction_2_0()); 
            // InternalSim.g:6774:2: ()
            // InternalSim.g:6774:3: 
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
    // InternalSim.g:6782:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6786:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSim.g:6787:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
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
    // InternalSim.g:6794:1: rule__SAttribute__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6798:1: ( ( 'ditch' ) )
            // InternalSim.g:6799:1: ( 'ditch' )
            {
            // InternalSim.g:6799:1: ( 'ditch' )
            // InternalSim.g:6800:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:6809:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6813:1: ( rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3 )
            // InternalSim.g:6814:2: rule__SAttribute__Group_2__2__Impl rule__SAttribute__Group_2__3
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
    // InternalSim.g:6821:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__Alternatives_2_2 )? ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6825:1: ( ( ( rule__SAttribute__Alternatives_2_2 )? ) )
            // InternalSim.g:6826:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            {
            // InternalSim.g:6826:1: ( ( rule__SAttribute__Alternatives_2_2 )? )
            // InternalSim.g:6827:2: ( rule__SAttribute__Alternatives_2_2 )?
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives_2_2()); 
            // InternalSim.g:6828:2: ( rule__SAttribute__Alternatives_2_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==15||LA64_0==41) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSim.g:6828:3: rule__SAttribute__Alternatives_2_2
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
    // InternalSim.g:6836:1: rule__SAttribute__Group_2__3 : rule__SAttribute__Group_2__3__Impl ;
    public final void rule__SAttribute__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6840:1: ( rule__SAttribute__Group_2__3__Impl )
            // InternalSim.g:6841:2: rule__SAttribute__Group_2__3__Impl
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
    // InternalSim.g:6847:1: rule__SAttribute__Group_2__3__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) ;
    public final void rule__SAttribute__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6851:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) ) )
            // InternalSim.g:6852:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            {
            // InternalSim.g:6852:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_3 ) )
            // InternalSim.g:6853:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_3()); 
            // InternalSim.g:6854:2: ( rule__SAttribute__DeductionRuleAssignment_2_3 )
            // InternalSim.g:6854:3: rule__SAttribute__DeductionRuleAssignment_2_3
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
    // InternalSim.g:6863:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6867:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSim.g:6868:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
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
    // InternalSim.g:6875:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6879:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSim.g:6880:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSim.g:6880:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSim.g:6881:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSim.g:6882:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSim.g:6882:3: rule__SAttribute__DetailAssignment_3_0
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
    // InternalSim.g:6890:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6894:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSim.g:6895:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:6902:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6906:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSim.g:6907:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSim.g:6907:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSim.g:6908:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSim.g:6909:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSim.g:6909:3: rule__SAttribute__NameAssignment_3_1
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
    // InternalSim.g:6917:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6921:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSim.g:6922:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
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
    // InternalSim.g:6929:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6933:1: ( ( ':' ) )
            // InternalSim.g:6934:1: ( ':' )
            {
            // InternalSim.g:6934:1: ( ':' )
            // InternalSim.g:6935:2: ':'
            {
             before(grammarAccess.getSAttributeAccess().getColonKeyword_3_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:6944:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6948:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSim.g:6949:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
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
    // InternalSim.g:6956:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6960:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSim.g:6961:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSim.g:6961:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSim.g:6962:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSim.g:6963:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSim.g:6963:3: rule__SAttribute__TypeAssignment_3_3
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
    // InternalSim.g:6971:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6975:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSim.g:6976:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
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
    // InternalSim.g:6983:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:6987:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSim.g:6988:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSim.g:6988:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSim.g:6989:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSim.g:6990:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==42) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSim.g:6990:3: rule__SAttribute__MultiplicityAssignment_3_4
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
    // InternalSim.g:6998:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7002:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSim.g:7003:2: rule__SAttribute__Group_3__5__Impl
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
    // InternalSim.g:7009:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7013:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSim.g:7014:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSim.g:7014:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSim.g:7015:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSim.g:7016:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==52) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSim.g:7016:3: rule__SAttribute__KeyAssignment_3_5
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
    // InternalSim.g:7025:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7029:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSim.g:7030:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
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
    // InternalSim.g:7037:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7041:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSim.g:7042:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSim.g:7042:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSim.g:7043:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSim.g:7044:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSim.g:7044:3: rule__SQuery__Alternatives_0_0
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
    // InternalSim.g:7052:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7056:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSim.g:7057:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
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
    // InternalSim.g:7064:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7068:1: ( ( '(' ) )
            // InternalSim.g:7069:1: ( '(' )
            {
            // InternalSim.g:7069:1: ( '(' )
            // InternalSim.g:7070:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:7079:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7083:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSim.g:7084:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
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
    // InternalSim.g:7091:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7095:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSim.g:7096:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSim.g:7096:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSim.g:7097:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSim.g:7098:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSim.g:7098:3: rule__SQuery__Alternatives_0_2
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
    // InternalSim.g:7106:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7110:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSim.g:7111:2: rule__SQuery__Group_0__3__Impl
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
    // InternalSim.g:7117:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7121:1: ( ( ')' ) )
            // InternalSim.g:7122:1: ( ')' )
            {
            // InternalSim.g:7122:1: ( ')' )
            // InternalSim.g:7123:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_0_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:7133:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7137:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSim.g:7138:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
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
    // InternalSim.g:7145:1: rule__SQuery__Group_0_0_0__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7149:1: ( ( () ) )
            // InternalSim.g:7150:1: ( () )
            {
            // InternalSim.g:7150:1: ( () )
            // InternalSim.g:7151:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_0_0()); 
            // InternalSim.g:7152:2: ()
            // InternalSim.g:7152:3: 
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
    // InternalSim.g:7160:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7164:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSim.g:7165:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
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
    // InternalSim.g:7172:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7176:1: ( ( 'grab' ) )
            // InternalSim.g:7177:1: ( 'grab' )
            {
            // InternalSim.g:7177:1: ( 'grab' )
            // InternalSim.g:7178:2: 'grab'
            {
             before(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:7187:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7191:1: ( rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3 )
            // InternalSim.g:7192:2: rule__SQuery__Group_0_0_0__2__Impl rule__SQuery__Group_0_0_0__3
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
    // InternalSim.g:7199:1: rule__SQuery__Group_0_0_0__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7203:1: ( ( 'query' ) )
            // InternalSim.g:7204:1: ( 'query' )
            {
            // InternalSim.g:7204:1: ( 'query' )
            // InternalSim.g:7205:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7214:1: rule__SQuery__Group_0_0_0__3 : rule__SQuery__Group_0_0_0__3__Impl ;
    public final void rule__SQuery__Group_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7218:1: ( rule__SQuery__Group_0_0_0__3__Impl )
            // InternalSim.g:7219:2: rule__SQuery__Group_0_0_0__3__Impl
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
    // InternalSim.g:7225:1: rule__SQuery__Group_0_0_0__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) ;
    public final void rule__SQuery__Group_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7229:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) ) )
            // InternalSim.g:7230:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            {
            // InternalSim.g:7230:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 ) )
            // InternalSim.g:7231:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_3()); 
            // InternalSim.g:7232:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_3 )
            // InternalSim.g:7232:3: rule__SQuery__DeductionRuleAssignment_0_0_0_3
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
    // InternalSim.g:7241:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7245:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSim.g:7246:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
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
    // InternalSim.g:7253:1: rule__SQuery__Group_0_0_1__0__Impl : ( () ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7257:1: ( ( () ) )
            // InternalSim.g:7258:1: ( () )
            {
            // InternalSim.g:7258:1: ( () )
            // InternalSim.g:7259:2: ()
            {
             before(grammarAccess.getSQueryAccess().getSQueryAction_0_0_1_0()); 
            // InternalSim.g:7260:2: ()
            // InternalSim.g:7260:3: 
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
    // InternalSim.g:7268:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7272:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSim.g:7273:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
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
    // InternalSim.g:7280:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7284:1: ( ( 'morph' ) )
            // InternalSim.g:7285:1: ( 'morph' )
            {
            // InternalSim.g:7285:1: ( 'morph' )
            // InternalSim.g:7286:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:7295:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7299:1: ( rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3 )
            // InternalSim.g:7300:2: rule__SQuery__Group_0_0_1__2__Impl rule__SQuery__Group_0_0_1__3
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
    // InternalSim.g:7307:1: rule__SQuery__Group_0_0_1__2__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7311:1: ( ( 'query' ) )
            // InternalSim.g:7312:1: ( 'query' )
            {
            // InternalSim.g:7312:1: ( 'query' )
            // InternalSim.g:7313:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7322:1: rule__SQuery__Group_0_0_1__3 : rule__SQuery__Group_0_0_1__3__Impl ;
    public final void rule__SQuery__Group_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7326:1: ( rule__SQuery__Group_0_0_1__3__Impl )
            // InternalSim.g:7327:2: rule__SQuery__Group_0_0_1__3__Impl
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
    // InternalSim.g:7333:1: rule__SQuery__Group_0_0_1__3__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) ;
    public final void rule__SQuery__Group_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7337:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) ) )
            // InternalSim.g:7338:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            {
            // InternalSim.g:7338:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 ) )
            // InternalSim.g:7339:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_3()); 
            // InternalSim.g:7340:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_3 )
            // InternalSim.g:7340:3: rule__SQuery__DeductionRuleAssignment_0_0_1_3
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
    // InternalSim.g:7349:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7353:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSim.g:7354:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
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
    // InternalSim.g:7361:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7365:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSim.g:7366:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSim.g:7366:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSim.g:7367:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSim.g:7368:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSim.g:7368:3: rule__SQuery__ParametersAssignment_0_2_1_0
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
    // InternalSim.g:7376:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7380:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSim.g:7381:2: rule__SQuery__Group_0_2_1__1__Impl
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
    // InternalSim.g:7387:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7391:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSim.g:7392:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSim.g:7392:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSim.g:7393:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSim.g:7394:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==37) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSim.g:7394:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SQuery__Group_0_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
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
    // InternalSim.g:7403:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7407:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSim.g:7408:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
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
    // InternalSim.g:7415:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7419:1: ( ( ',' ) )
            // InternalSim.g:7420:1: ( ',' )
            {
            // InternalSim.g:7420:1: ( ',' )
            // InternalSim.g:7421:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:7430:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7434:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSim.g:7435:2: rule__SQuery__Group_0_2_1_1__1__Impl
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
    // InternalSim.g:7441:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7445:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSim.g:7446:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSim.g:7446:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSim.g:7447:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSim.g:7448:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSim.g:7448:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
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
    // InternalSim.g:7457:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7461:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSim.g:7462:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
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
    // InternalSim.g:7469:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7473:1: ( ( 'ditch' ) )
            // InternalSim.g:7474:1: ( 'ditch' )
            {
            // InternalSim.g:7474:1: ( 'ditch' )
            // InternalSim.g:7475:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:7484:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7488:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSim.g:7489:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
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
    // InternalSim.g:7496:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7500:1: ( ( 'query' ) )
            // InternalSim.g:7501:1: ( 'query' )
            {
            // InternalSim.g:7501:1: ( 'query' )
            // InternalSim.g:7502:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSim.g:7511:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7515:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSim.g:7516:2: rule__SQuery__Group_1__2__Impl
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
    // InternalSim.g:7522:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7526:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:7527:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:7527:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:7528:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:7529:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSim.g:7529:3: rule__SQuery__DeductionRuleAssignment_1_2
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
    // InternalSim.g:7538:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7542:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSim.g:7543:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
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
    // InternalSim.g:7550:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7554:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSim.g:7555:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSim.g:7555:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSim.g:7556:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSim.g:7557:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSim.g:7557:3: rule__SQuery__NameAssignment_2_0
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
    // InternalSim.g:7565:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7569:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSim.g:7570:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
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
    // InternalSim.g:7577:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7581:1: ( ( '(' ) )
            // InternalSim.g:7582:1: ( '(' )
            {
            // InternalSim.g:7582:1: ( '(' )
            // InternalSim.g:7583:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:7592:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7596:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSim.g:7597:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
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
    // InternalSim.g:7604:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7608:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSim.g:7609:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSim.g:7609:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSim.g:7610:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSim.g:7611:2: ( rule__SQuery__Group_2_2__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||LA69_0==30||LA69_0==36||LA69_0==39) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalSim.g:7611:3: rule__SQuery__Group_2_2__0
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
    // InternalSim.g:7619:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7623:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSim.g:7624:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:7631:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7635:1: ( ( ')' ) )
            // InternalSim.g:7636:1: ( ')' )
            {
            // InternalSim.g:7636:1: ( ')' )
            // InternalSim.g:7637:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_2_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:7646:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7650:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSim.g:7651:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
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
    // InternalSim.g:7658:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7662:1: ( ( ':' ) )
            // InternalSim.g:7663:1: ( ':' )
            {
            // InternalSim.g:7663:1: ( ':' )
            // InternalSim.g:7664:2: ':'
            {
             before(grammarAccess.getSQueryAccess().getColonKeyword_2_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:7673:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7677:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSim.g:7678:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
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
    // InternalSim.g:7685:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7689:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSim.g:7690:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSim.g:7690:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSim.g:7691:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSim.g:7692:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSim.g:7692:3: rule__SQuery__TypeAssignment_2_5
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
    // InternalSim.g:7700:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7704:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSim.g:7705:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
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
    // InternalSim.g:7712:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7716:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSim.g:7717:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSim.g:7717:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSim.g:7718:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSim.g:7719:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSim.g:7719:3: rule__SQuery__MultiplicityAssignment_2_6
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
    // InternalSim.g:7727:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7731:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSim.g:7732:2: rule__SQuery__Group_2__7__Impl
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
    // InternalSim.g:7738:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7742:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSim.g:7743:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSim.g:7743:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSim.g:7744:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSim.g:7745:2: ( rule__SQuery__Group_2_7__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==45) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSim.g:7745:3: rule__SQuery__Group_2_7__0
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
    // InternalSim.g:7754:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7758:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSim.g:7759:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
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
    // InternalSim.g:7766:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7770:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSim.g:7771:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSim.g:7771:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSim.g:7772:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSim.g:7773:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSim.g:7773:3: rule__SQuery__ParametersAssignment_2_2_0
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
    // InternalSim.g:7781:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7785:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSim.g:7786:2: rule__SQuery__Group_2_2__1__Impl
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
    // InternalSim.g:7792:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7796:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSim.g:7797:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSim.g:7797:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSim.g:7798:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSim.g:7799:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==37) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSim.g:7799:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SQuery__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalSim.g:7808:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7812:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSim.g:7813:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
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
    // InternalSim.g:7820:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7824:1: ( ( ',' ) )
            // InternalSim.g:7825:1: ( ',' )
            {
            // InternalSim.g:7825:1: ( ',' )
            // InternalSim.g:7826:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSim.g:7835:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7839:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSim.g:7840:2: rule__SQuery__Group_2_2_1__1__Impl
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
    // InternalSim.g:7846:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7850:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSim.g:7851:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSim.g:7851:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSim.g:7852:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSim.g:7853:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSim.g:7853:3: rule__SQuery__ParametersAssignment_2_2_1_1
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
    // InternalSim.g:7862:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7866:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSim.g:7867:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSim.g:7874:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7878:1: ( ( 'returns' ) )
            // InternalSim.g:7879:1: ( 'returns' )
            {
            // InternalSim.g:7879:1: ( 'returns' )
            // InternalSim.g:7880:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_2_7_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSim.g:7889:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7893:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSim.g:7894:2: rule__SQuery__Group_2_7__1__Impl
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
    // InternalSim.g:7900:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7904:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSim.g:7905:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSim.g:7905:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSim.g:7906:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSim.g:7907:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSim.g:7907:3: rule__SQuery__ReturnsAssignment_2_7_1
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
    // InternalSim.g:7916:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7920:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSim.g:7921:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
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
    // InternalSim.g:7928:1: rule__SQueryParameter__Group_0__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7932:1: ( ( () ) )
            // InternalSim.g:7933:1: ( () )
            {
            // InternalSim.g:7933:1: ( () )
            // InternalSim.g:7934:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_0_0()); 
            // InternalSim.g:7935:2: ()
            // InternalSim.g:7935:3: 
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
    // InternalSim.g:7943:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7947:1: ( rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2 )
            // InternalSim.g:7948:2: rule__SQueryParameter__Group_0__1__Impl rule__SQueryParameter__Group_0__2
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
    // InternalSim.g:7955:1: rule__SQueryParameter__Group_0__1__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7959:1: ( ( 'grab' ) )
            // InternalSim.g:7960:1: ( 'grab' )
            {
            // InternalSim.g:7960:1: ( 'grab' )
            // InternalSim.g:7961:2: 'grab'
            {
             before(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSim.g:7970:1: rule__SQueryParameter__Group_0__2 : rule__SQueryParameter__Group_0__2__Impl ;
    public final void rule__SQueryParameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7974:1: ( rule__SQueryParameter__Group_0__2__Impl )
            // InternalSim.g:7975:2: rule__SQueryParameter__Group_0__2__Impl
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
    // InternalSim.g:7981:1: rule__SQueryParameter__Group_0__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SQueryParameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:7985:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) ) )
            // InternalSim.g:7986:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSim.g:7986:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_2 ) )
            // InternalSim.g:7987:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSim.g:7988:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_2 )
            // InternalSim.g:7988:3: rule__SQueryParameter__DeductionRuleAssignment_0_2
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
    // InternalSim.g:7997:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8001:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSim.g:8002:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
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
    // InternalSim.g:8009:1: rule__SQueryParameter__Group_1__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8013:1: ( ( () ) )
            // InternalSim.g:8014:1: ( () )
            {
            // InternalSim.g:8014:1: ( () )
            // InternalSim.g:8015:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_1_0()); 
            // InternalSim.g:8016:2: ()
            // InternalSim.g:8016:3: 
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
    // InternalSim.g:8024:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8028:1: ( rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2 )
            // InternalSim.g:8029:2: rule__SQueryParameter__Group_1__1__Impl rule__SQueryParameter__Group_1__2
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
    // InternalSim.g:8036:1: rule__SQueryParameter__Group_1__1__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8040:1: ( ( 'morph' ) )
            // InternalSim.g:8041:1: ( 'morph' )
            {
            // InternalSim.g:8041:1: ( 'morph' )
            // InternalSim.g:8042:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSim.g:8051:1: rule__SQueryParameter__Group_1__2 : rule__SQueryParameter__Group_1__2__Impl ;
    public final void rule__SQueryParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8055:1: ( rule__SQueryParameter__Group_1__2__Impl )
            // InternalSim.g:8056:2: rule__SQueryParameter__Group_1__2__Impl
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
    // InternalSim.g:8062:1: rule__SQueryParameter__Group_1__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQueryParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8066:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) ) )
            // InternalSim.g:8067:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSim.g:8067:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_2 ) )
            // InternalSim.g:8068:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSim.g:8069:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_2 )
            // InternalSim.g:8069:3: rule__SQueryParameter__DeductionRuleAssignment_1_2
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
    // InternalSim.g:8078:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8082:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSim.g:8083:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
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
    // InternalSim.g:8090:1: rule__SQueryParameter__Group_2__0__Impl : ( () ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8094:1: ( ( () ) )
            // InternalSim.g:8095:1: ( () )
            {
            // InternalSim.g:8095:1: ( () )
            // InternalSim.g:8096:2: ()
            {
             before(grammarAccess.getSQueryParameterAccess().getSQueryParameterAction_2_0()); 
            // InternalSim.g:8097:2: ()
            // InternalSim.g:8097:3: 
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
    // InternalSim.g:8105:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8109:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSim.g:8110:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
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
    // InternalSim.g:8117:1: rule__SQueryParameter__Group_2__1__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8121:1: ( ( 'ditch' ) )
            // InternalSim.g:8122:1: ( 'ditch' )
            {
            // InternalSim.g:8122:1: ( 'ditch' )
            // InternalSim.g:8123:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSim.g:8132:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8136:1: ( rule__SQueryParameter__Group_2__2__Impl )
            // InternalSim.g:8137:2: rule__SQueryParameter__Group_2__2__Impl
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
    // InternalSim.g:8143:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8147:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) ) )
            // InternalSim.g:8148:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSim.g:8148:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_2 ) )
            // InternalSim.g:8149:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSim.g:8150:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_2 )
            // InternalSim.g:8150:3: rule__SQueryParameter__DeductionRuleAssignment_2_2
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
    // InternalSim.g:8159:1: rule__SQueryParameter__Group_3__0 : rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 ;
    public final void rule__SQueryParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8163:1: ( rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1 )
            // InternalSim.g:8164:2: rule__SQueryParameter__Group_3__0__Impl rule__SQueryParameter__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSim.g:8171:1: rule__SQueryParameter__Group_3__0__Impl : ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) ;
    public final void rule__SQueryParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8175:1: ( ( ( rule__SQueryParameter__NameAssignment_3_0 ) ) )
            // InternalSim.g:8176:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            {
            // InternalSim.g:8176:1: ( ( rule__SQueryParameter__NameAssignment_3_0 ) )
            // InternalSim.g:8177:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_3_0()); 
            // InternalSim.g:8178:2: ( rule__SQueryParameter__NameAssignment_3_0 )
            // InternalSim.g:8178:3: rule__SQueryParameter__NameAssignment_3_0
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
    // InternalSim.g:8186:1: rule__SQueryParameter__Group_3__1 : rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 ;
    public final void rule__SQueryParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8190:1: ( rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2 )
            // InternalSim.g:8191:2: rule__SQueryParameter__Group_3__1__Impl rule__SQueryParameter__Group_3__2
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
    // InternalSim.g:8198:1: rule__SQueryParameter__Group_3__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8202:1: ( ( ':' ) )
            // InternalSim.g:8203:1: ( ':' )
            {
            // InternalSim.g:8203:1: ( ':' )
            // InternalSim.g:8204:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_3_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSim.g:8213:1: rule__SQueryParameter__Group_3__2 : rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 ;
    public final void rule__SQueryParameter__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8217:1: ( rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3 )
            // InternalSim.g:8218:2: rule__SQueryParameter__Group_3__2__Impl rule__SQueryParameter__Group_3__3
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
    // InternalSim.g:8225:1: rule__SQueryParameter__Group_3__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) ;
    public final void rule__SQueryParameter__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8229:1: ( ( ( rule__SQueryParameter__TypeAssignment_3_2 ) ) )
            // InternalSim.g:8230:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            {
            // InternalSim.g:8230:1: ( ( rule__SQueryParameter__TypeAssignment_3_2 ) )
            // InternalSim.g:8231:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_3_2()); 
            // InternalSim.g:8232:2: ( rule__SQueryParameter__TypeAssignment_3_2 )
            // InternalSim.g:8232:3: rule__SQueryParameter__TypeAssignment_3_2
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
    // InternalSim.g:8240:1: rule__SQueryParameter__Group_3__3 : rule__SQueryParameter__Group_3__3__Impl ;
    public final void rule__SQueryParameter__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8244:1: ( rule__SQueryParameter__Group_3__3__Impl )
            // InternalSim.g:8245:2: rule__SQueryParameter__Group_3__3__Impl
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
    // InternalSim.g:8251:1: rule__SQueryParameter__Group_3__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) ;
    public final void rule__SQueryParameter__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8255:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? ) )
            // InternalSim.g:8256:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            {
            // InternalSim.g:8256:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3_3 )? )
            // InternalSim.g:8257:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3_3()); 
            // InternalSim.g:8258:2: ( rule__SQueryParameter__MultiplicityAssignment_3_3 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==42) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSim.g:8258:3: rule__SQueryParameter__MultiplicityAssignment_3_3
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
    // InternalSim.g:8267:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8271:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSim.g:8272:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
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
    // InternalSim.g:8279:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8283:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8284:1: ( ruleSQualifiedName )
            {
            // InternalSim.g:8284:1: ( ruleSQualifiedName )
            // InternalSim.g:8285:2: ruleSQualifiedName
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
    // InternalSim.g:8294:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8298:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSim.g:8299:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSim.g:8305:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8309:1: ( ( ( '.*' )? ) )
            // InternalSim.g:8310:1: ( ( '.*' )? )
            {
            // InternalSim.g:8310:1: ( ( '.*' )? )
            // InternalSim.g:8311:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSim.g:8312:2: ( '.*' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==46) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalSim.g:8312:3: '.*'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalSim.g:8321:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8325:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSim.g:8326:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
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
    // InternalSim.g:8333:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8337:1: ( ( RULE_ID ) )
            // InternalSim.g:8338:1: ( RULE_ID )
            {
            // InternalSim.g:8338:1: ( RULE_ID )
            // InternalSim.g:8339:2: RULE_ID
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
    // InternalSim.g:8348:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8352:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSim.g:8353:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSim.g:8359:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8363:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSim.g:8364:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSim.g:8364:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSim.g:8365:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSim.g:8366:2: ( rule__SQualifiedName__Group_1__0 )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==47) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalSim.g:8366:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__SQualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
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
    // InternalSim.g:8375:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8379:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSim.g:8380:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
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
    // InternalSim.g:8387:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8391:1: ( ( '.' ) )
            // InternalSim.g:8392:1: ( '.' )
            {
            // InternalSim.g:8392:1: ( '.' )
            // InternalSim.g:8393:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSim.g:8402:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8406:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSim.g:8407:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSim.g:8413:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8417:1: ( ( RULE_ID ) )
            // InternalSim.g:8418:1: ( RULE_ID )
            {
            // InternalSim.g:8418:1: ( RULE_ID )
            // InternalSim.g:8419:2: RULE_ID
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
    // InternalSim.g:8429:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8433:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSim.g:8434:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
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
    // InternalSim.g:8441:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8445:1: ( ( '(' ) )
            // InternalSim.g:8446:1: ( '(' )
            {
            // InternalSim.g:8446:1: ( '(' )
            // InternalSim.g:8447:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSim.g:8456:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8460:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSim.g:8461:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
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
    // InternalSim.g:8468:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8472:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSim.g:8473:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSim.g:8473:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSim.g:8474:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSim.g:8475:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSim.g:8475:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSim.g:8483:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8487:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSim.g:8488:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
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
    // InternalSim.g:8495:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8499:1: ( ( '..' ) )
            // InternalSim.g:8500:1: ( '..' )
            {
            // InternalSim.g:8500:1: ( '..' )
            // InternalSim.g:8501:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSim.g:8510:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8514:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSim.g:8515:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
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
    // InternalSim.g:8522:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8526:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSim.g:8527:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSim.g:8527:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSim.g:8528:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSim.g:8529:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSim.g:8529:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSim.g:8537:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8541:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSim.g:8542:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSim.g:8548:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8552:1: ( ( ')' ) )
            // InternalSim.g:8553:1: ( ')' )
            {
            // InternalSim.g:8553:1: ( ')' )
            // InternalSim.g:8554:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSim.g:8564:1: rule__SInformationModel__KindAssignment_0 : ( ruleSInformationModelKind ) ;
    public final void rule__SInformationModel__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8568:1: ( ( ruleSInformationModelKind ) )
            // InternalSim.g:8569:2: ( ruleSInformationModelKind )
            {
            // InternalSim.g:8569:2: ( ruleSInformationModelKind )
            // InternalSim.g:8570:3: ruleSInformationModelKind
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
    // InternalSim.g:8579:1: rule__SInformationModel__NameAssignment_3 : ( ruleSQualifiedName ) ;
    public final void rule__SInformationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8583:1: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8584:2: ( ruleSQualifiedName )
            {
            // InternalSim.g:8584:2: ( ruleSQualifiedName )
            // InternalSim.g:8585:3: ruleSQualifiedName
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
    // InternalSim.g:8594:1: rule__SInformationModel__GenerateAssignment_4 : ( ( 'generate' ) ) ;
    public final void rule__SInformationModel__GenerateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8598:1: ( ( ( 'generate' ) ) )
            // InternalSim.g:8599:2: ( ( 'generate' ) )
            {
            // InternalSim.g:8599:2: ( ( 'generate' ) )
            // InternalSim.g:8600:3: ( 'generate' )
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            // InternalSim.g:8601:3: ( 'generate' )
            // InternalSim.g:8602:4: 'generate'
            {
             before(grammarAccess.getSInformationModelAccess().getGenerateGenerateKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSim.g:8613:1: rule__SInformationModel__ImportsAssignment_5 : ( ruleSImport ) ;
    public final void rule__SInformationModel__ImportsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8617:1: ( ( ruleSImport ) )
            // InternalSim.g:8618:2: ( ruleSImport )
            {
            // InternalSim.g:8618:2: ( ruleSImport )
            // InternalSim.g:8619:3: ruleSImport
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
    // InternalSim.g:8628:1: rule__SInformationModel__TypesAssignment_6_0 : ( ruleSType ) ;
    public final void rule__SInformationModel__TypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8632:1: ( ( ruleSType ) )
            // InternalSim.g:8633:2: ( ruleSType )
            {
            // InternalSim.g:8633:2: ( ruleSType )
            // InternalSim.g:8634:3: ruleSType
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
    // InternalSim.g:8643:1: rule__SInformationModel__AggregatesAssignment_6_1 : ( ruleSAggregate ) ;
    public final void rule__SInformationModel__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8647:1: ( ( ruleSAggregate ) )
            // InternalSim.g:8648:2: ( ruleSAggregate )
            {
            // InternalSim.g:8648:2: ( ruleSAggregate )
            // InternalSim.g:8649:3: ruleSAggregate
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
    // InternalSim.g:8658:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8662:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSim.g:8663:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSim.g:8663:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSim.g:8664:3: ruleSQualifiedNameWithWildcard
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
    // InternalSim.g:8673:1: rule__SGrabAggregateRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8677:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8678:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8678:2: ( ( RULE_ID ) )
            // InternalSim.g:8679:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSim.g:8680:3: ( RULE_ID )
            // InternalSim.g:8681:4: RULE_ID
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


    // $ANTLR start "rule__SGrabPrimitiveRule__SourceAssignment_0"
    // InternalSim.g:8692:1: rule__SGrabPrimitiveRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabPrimitiveRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8696:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8697:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8697:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8698:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabPrimitiveRuleAccess().getSourceDPrimitiveCrossReference_0_0()); 
            // InternalSim.g:8699:3: ( ruleSQualifiedName )
            // InternalSim.g:8700:4: ruleSQualifiedName
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
    // InternalSim.g:8711:1: rule__SGrabPrimitiveRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabPrimitiveRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8715:1: ( ( RULE_ID ) )
            // InternalSim.g:8716:2: ( RULE_ID )
            {
            // InternalSim.g:8716:2: ( RULE_ID )
            // InternalSim.g:8717:3: RULE_ID
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
    // InternalSim.g:8726:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8730:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8731:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8731:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8732:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSim.g:8733:3: ( ruleSQualifiedName )
            // InternalSim.g:8734:4: ruleSQualifiedName
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
    // InternalSim.g:8745:1: rule__SGrabEnumerationRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8749:1: ( ( RULE_ID ) )
            // InternalSim.g:8750:2: ( RULE_ID )
            {
            // InternalSim.g:8750:2: ( RULE_ID )
            // InternalSim.g:8751:3: RULE_ID
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
    // InternalSim.g:8760:1: rule__SDitchEnumerationRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8764:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8765:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8765:2: ( ( RULE_ID ) )
            // InternalSim.g:8766:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8767:3: ( RULE_ID )
            // InternalSim.g:8768:4: RULE_ID
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
    // InternalSim.g:8779:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8783:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8784:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8784:2: ( ( RULE_ID ) )
            // InternalSim.g:8785:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSim.g:8786:3: ( RULE_ID )
            // InternalSim.g:8787:4: RULE_ID
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
    // InternalSim.g:8798:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8802:1: ( ( RULE_ID ) )
            // InternalSim.g:8803:2: ( RULE_ID )
            {
            // InternalSim.g:8803:2: ( RULE_ID )
            // InternalSim.g:8804:3: RULE_ID
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
    // InternalSim.g:8813:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8817:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8818:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8818:2: ( ( RULE_ID ) )
            // InternalSim.g:8819:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSim.g:8820:3: ( RULE_ID )
            // InternalSim.g:8821:4: RULE_ID
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
    // InternalSim.g:8832:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8836:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8837:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8837:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8838:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8839:3: ( ruleSQualifiedName )
            // InternalSim.g:8840:4: ruleSQualifiedName
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
    // InternalSim.g:8851:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8855:1: ( ( RULE_ID ) )
            // InternalSim.g:8856:2: ( RULE_ID )
            {
            // InternalSim.g:8856:2: ( RULE_ID )
            // InternalSim.g:8857:3: RULE_ID
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
    // InternalSim.g:8866:1: rule__SDitchComplexTypeRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchComplexTypeRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8870:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8871:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8871:2: ( ( RULE_ID ) )
            // InternalSim.g:8872:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchComplexTypeRuleAccess().getSourceDEnumerationCrossReference_0()); 
            // InternalSim.g:8873:3: ( RULE_ID )
            // InternalSim.g:8874:4: RULE_ID
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
    // InternalSim.g:8885:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8889:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8890:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8890:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8891:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8892:3: ( ruleSQualifiedName )
            // InternalSim.g:8893:4: ruleSQualifiedName
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
    // InternalSim.g:8904:1: rule__SMorphComplexTypeRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphComplexTypeRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8908:1: ( ( RULE_ID ) )
            // InternalSim.g:8909:2: ( RULE_ID )
            {
            // InternalSim.g:8909:2: ( RULE_ID )
            // InternalSim.g:8910:3: RULE_ID
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
    // InternalSim.g:8919:1: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphComplexTypeRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8923:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8924:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8924:2: ( ( RULE_ID ) )
            // InternalSim.g:8925:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 
            // InternalSim.g:8926:3: ( RULE_ID )
            // InternalSim.g:8927:4: RULE_ID
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
    // InternalSim.g:8938:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8942:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8943:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8943:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8944:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSim.g:8945:3: ( ruleSQualifiedName )
            // InternalSim.g:8946:4: ruleSQualifiedName
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
    // InternalSim.g:8957:1: rule__SFuseComplexTypeRule__Source2Assignment_2 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__Source2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8961:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSim.g:8962:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSim.g:8962:2: ( ( ruleSQualifiedName ) )
            // InternalSim.g:8963:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0()); 
            // InternalSim.g:8964:3: ( ruleSQualifiedName )
            // InternalSim.g:8965:4: ruleSQualifiedName
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
    // InternalSim.g:8976:1: rule__SFuseComplexTypeRule__RenameToAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SFuseComplexTypeRule__RenameToAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8980:1: ( ( RULE_ID ) )
            // InternalSim.g:8981:2: ( RULE_ID )
            {
            // InternalSim.g:8981:2: ( RULE_ID )
            // InternalSim.g:8982:3: RULE_ID
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
    // InternalSim.g:8991:1: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SFuseComplexTypeRule__ExtendFromAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:8995:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:8996:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:8996:2: ( ( RULE_ID ) )
            // InternalSim.g:8997:3: ( RULE_ID )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_1_0()); 
            // InternalSim.g:8998:3: ( RULE_ID )
            // InternalSim.g:8999:4: RULE_ID
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
    // InternalSim.g:9010:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9014:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9015:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9015:2: ( ( RULE_ID ) )
            // InternalSim.g:9016:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9017:3: ( RULE_ID )
            // InternalSim.g:9018:4: RULE_ID
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
    // InternalSim.g:9029:1: rule__SGrabFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9033:1: ( ( RULE_ID ) )
            // InternalSim.g:9034:2: ( RULE_ID )
            {
            // InternalSim.g:9034:2: ( RULE_ID )
            // InternalSim.g:9035:3: RULE_ID
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
    // InternalSim.g:9044:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9048:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9049:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9049:2: ( ( RULE_ID ) )
            // InternalSim.g:9050:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSim.g:9051:3: ( RULE_ID )
            // InternalSim.g:9052:4: RULE_ID
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
    // InternalSim.g:9063:1: rule__SMorphFeatureRule__RenameToAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9067:1: ( ( RULE_ID ) )
            // InternalSim.g:9068:2: ( RULE_ID )
            {
            // InternalSim.g:9068:2: ( RULE_ID )
            // InternalSim.g:9069:3: RULE_ID
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
    // InternalSim.g:9078:1: rule__SMorphFeatureRule__RetypeToAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9082:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9083:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9083:2: ( ( RULE_ID ) )
            // InternalSim.g:9084:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_1_0()); 
            // InternalSim.g:9085:3: ( RULE_ID )
            // InternalSim.g:9086:4: RULE_ID
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
    // InternalSim.g:9097:1: rule__SMorphFeatureRule__RemultiplyToAssignment_2_2 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9101:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9102:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9102:2: ( ruleSMultiplicity )
            // InternalSim.g:9103:3: ruleSMultiplicity
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
    // InternalSim.g:9112:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9116:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9117:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9117:2: ( ( RULE_ID ) )
            // InternalSim.g:9118:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSim.g:9119:3: ( RULE_ID )
            // InternalSim.g:9120:4: RULE_ID
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
    // InternalSim.g:9131:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9135:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSim.g:9136:2: ( ruleSGrabAggregateRule )
            {
            // InternalSim.g:9136:2: ( ruleSGrabAggregateRule )
            // InternalSim.g:9137:3: ruleSGrabAggregateRule
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
    // InternalSim.g:9146:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9150:1: ( ( ruleSType ) )
            // InternalSim.g:9151:2: ( ruleSType )
            {
            // InternalSim.g:9151:2: ( ruleSType )
            // InternalSim.g:9152:3: ruleSType
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
    // InternalSim.g:9161:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9165:1: ( ( RULE_ID ) )
            // InternalSim.g:9166:2: ( RULE_ID )
            {
            // InternalSim.g:9166:2: ( RULE_ID )
            // InternalSim.g:9167:3: RULE_ID
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
    // InternalSim.g:9176:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9180:1: ( ( ruleSExpression ) )
            // InternalSim.g:9181:2: ( ruleSExpression )
            {
            // InternalSim.g:9181:2: ( ruleSExpression )
            // InternalSim.g:9182:3: ruleSExpression
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
    // InternalSim.g:9191:1: rule__SPrimitive__DeductionRuleAssignment_0_0_3 : ( ruleSGrabPrimitiveRule ) ;
    public final void rule__SPrimitive__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9195:1: ( ( ruleSGrabPrimitiveRule ) )
            // InternalSim.g:9196:2: ( ruleSGrabPrimitiveRule )
            {
            // InternalSim.g:9196:2: ( ruleSGrabPrimitiveRule )
            // InternalSim.g:9197:3: ruleSGrabPrimitiveRule
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
    // InternalSim.g:9206:1: rule__SPrimitive__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9210:1: ( ( RULE_ID ) )
            // InternalSim.g:9211:2: ( RULE_ID )
            {
            // InternalSim.g:9211:2: ( RULE_ID )
            // InternalSim.g:9212:3: RULE_ID
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
    // InternalSim.g:9221:1: rule__SPrimitive__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9225:1: ( ( RULE_ID ) )
            // InternalSim.g:9226:2: ( RULE_ID )
            {
            // InternalSim.g:9226:2: ( RULE_ID )
            // InternalSim.g:9227:3: RULE_ID
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
    // InternalSim.g:9236:1: rule__SPrimitive__RedefinesAssignment_0_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9240:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9241:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9241:2: ( ( RULE_ID ) )
            // InternalSim.g:9242:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_0_2_3_0()); 
            // InternalSim.g:9243:3: ( RULE_ID )
            // InternalSim.g:9244:4: RULE_ID
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
    // InternalSim.g:9255:1: rule__SPrimitive__ConstraintsAssignment_2 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9259:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9260:2: ( ruleSConstraint )
            {
            // InternalSim.g:9260:2: ( ruleSConstraint )
            // InternalSim.g:9261:3: ruleSConstraint
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
    // InternalSim.g:9270:1: rule__SEnumeration__DeductionRuleAssignment_0_0_3 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9274:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSim.g:9275:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSim.g:9275:2: ( ruleSGrabEnumerationRule )
            // InternalSim.g:9276:3: ruleSGrabEnumerationRule
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
    // InternalSim.g:9285:1: rule__SEnumeration__DeductionRuleAssignment_0_1_3 : ( ruleSDitchEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9289:1: ( ( ruleSDitchEnumerationRule ) )
            // InternalSim.g:9290:2: ( ruleSDitchEnumerationRule )
            {
            // InternalSim.g:9290:2: ( ruleSDitchEnumerationRule )
            // InternalSim.g:9291:3: ruleSDitchEnumerationRule
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
    // InternalSim.g:9300:1: rule__SEnumeration__NameAssignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9304:1: ( ( RULE_ID ) )
            // InternalSim.g:9305:2: ( RULE_ID )
            {
            // InternalSim.g:9305:2: ( RULE_ID )
            // InternalSim.g:9306:3: RULE_ID
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
    // InternalSim.g:9315:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9319:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9320:2: ( ruleSLiteral )
            {
            // InternalSim.g:9320:2: ( ruleSLiteral )
            // InternalSim.g:9321:3: ruleSLiteral
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
    // InternalSim.g:9330:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9334:1: ( ( ruleSLiteral ) )
            // InternalSim.g:9335:2: ( ruleSLiteral )
            {
            // InternalSim.g:9335:2: ( ruleSLiteral )
            // InternalSim.g:9336:3: ruleSLiteral
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
    // InternalSim.g:9345:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9349:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9350:2: ( ruleSConstraint )
            {
            // InternalSim.g:9350:2: ( ruleSConstraint )
            // InternalSim.g:9351:3: ruleSConstraint
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
    // InternalSim.g:9360:1: rule__SLiteral__DeductionRuleAssignment_0_2 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9364:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSim.g:9365:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSim.g:9365:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSim.g:9366:3: ruleSGrabEnumerationLiteralRule
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
    // InternalSim.g:9375:1: rule__SLiteral__DeductionRuleAssignment_1_2 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9379:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSim.g:9380:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSim.g:9380:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSim.g:9381:3: ruleSDitchEnumerationLiteralRule
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
    // InternalSim.g:9390:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9394:1: ( ( RULE_ID ) )
            // InternalSim.g:9395:2: ( RULE_ID )
            {
            // InternalSim.g:9395:2: ( RULE_ID )
            // InternalSim.g:9396:3: RULE_ID
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
    // InternalSim.g:9405:1: rule__SRootType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9409:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9410:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9410:2: ( ( 'abstract' ) )
            // InternalSim.g:9411:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9412:3: ( 'abstract' )
            // InternalSim.g:9413:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9424:1: rule__SRootType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9428:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9429:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9429:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9430:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9439:1: rule__SRootType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9443:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9444:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9444:2: ( ( 'abstract' ) )
            // InternalSim.g:9445:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9446:3: ( 'abstract' )
            // InternalSim.g:9447:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9458:1: rule__SRootType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9462:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9463:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9463:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9464:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9473:1: rule__SRootType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9477:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9478:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9478:2: ( ( 'abstract' ) )
            // InternalSim.g:9479:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9480:3: ( 'abstract' )
            // InternalSim.g:9481:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9492:1: rule__SRootType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9496:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9497:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9497:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9498:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9507:1: rule__SRootType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9511:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9512:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9512:2: ( ( 'abstract' ) )
            // InternalSim.g:9513:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9514:3: ( 'abstract' )
            // InternalSim.g:9515:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9526:1: rule__SRootType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9530:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9531:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9531:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9532:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9541:1: rule__SRootType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9545:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9546:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9546:2: ( ( 'abstract' ) )
            // InternalSim.g:9547:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9548:3: ( 'abstract' )
            // InternalSim.g:9549:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9560:1: rule__SRootType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9564:1: ( ( RULE_ID ) )
            // InternalSim.g:9565:2: ( RULE_ID )
            {
            // InternalSim.g:9565:2: ( RULE_ID )
            // InternalSim.g:9566:3: RULE_ID
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
    // InternalSim.g:9575:1: rule__SDetailType__AbstractAssignment_0_0_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9579:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9580:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9580:2: ( ( 'abstract' ) )
            // InternalSim.g:9581:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            // InternalSim.g:9582:3: ( 'abstract' )
            // InternalSim.g:9583:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9594:1: rule__SDetailType__DeductionRuleAssignment_0_0_4 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9598:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSim.g:9599:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSim.g:9599:2: ( ruleSGrabComplexTypeRule )
            // InternalSim.g:9600:3: ruleSGrabComplexTypeRule
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
    // InternalSim.g:9609:1: rule__SDetailType__AbstractAssignment_0_1_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9613:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9614:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9614:2: ( ( 'abstract' ) )
            // InternalSim.g:9615:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            // InternalSim.g:9616:3: ( 'abstract' )
            // InternalSim.g:9617:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9628:1: rule__SDetailType__DeductionRuleAssignment_0_1_4 : ( ruleSDitchComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9632:1: ( ( ruleSDitchComplexTypeRule ) )
            // InternalSim.g:9633:2: ( ruleSDitchComplexTypeRule )
            {
            // InternalSim.g:9633:2: ( ruleSDitchComplexTypeRule )
            // InternalSim.g:9634:3: ruleSDitchComplexTypeRule
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
    // InternalSim.g:9643:1: rule__SDetailType__AbstractAssignment_0_2_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9647:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9648:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9648:2: ( ( 'abstract' ) )
            // InternalSim.g:9649:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            // InternalSim.g:9650:3: ( 'abstract' )
            // InternalSim.g:9651:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9662:1: rule__SDetailType__DeductionRuleAssignment_0_2_4 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9666:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSim.g:9667:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSim.g:9667:2: ( ruleSMorphComplexTypeRule )
            // InternalSim.g:9668:3: ruleSMorphComplexTypeRule
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
    // InternalSim.g:9677:1: rule__SDetailType__AbstractAssignment_0_3_2 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9681:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9682:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9682:2: ( ( 'abstract' ) )
            // InternalSim.g:9683:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            // InternalSim.g:9684:3: ( 'abstract' )
            // InternalSim.g:9685:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9696:1: rule__SDetailType__DeductionRuleAssignment_0_3_4 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9700:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSim.g:9701:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSim.g:9701:2: ( ruleSFuseComplexTypeRule )
            // InternalSim.g:9702:3: ruleSFuseComplexTypeRule
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
    // InternalSim.g:9711:1: rule__SDetailType__AbstractAssignment_0_4_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9715:1: ( ( ( 'abstract' ) ) )
            // InternalSim.g:9716:2: ( ( 'abstract' ) )
            {
            // InternalSim.g:9716:2: ( ( 'abstract' ) )
            // InternalSim.g:9717:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            // InternalSim.g:9718:3: ( 'abstract' )
            // InternalSim.g:9719:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_4_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSim.g:9730:1: rule__SDetailType__NameAssignment_0_4_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9734:1: ( ( RULE_ID ) )
            // InternalSim.g:9735:2: ( RULE_ID )
            {
            // InternalSim.g:9735:2: ( RULE_ID )
            // InternalSim.g:9736:3: RULE_ID
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
    // InternalSim.g:9745:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9749:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9750:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9750:2: ( ( RULE_ID ) )
            // InternalSim.g:9751:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSim.g:9752:3: ( RULE_ID )
            // InternalSim.g:9753:4: RULE_ID
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
    // InternalSim.g:9764:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9768:1: ( ( ruleSFeature ) )
            // InternalSim.g:9769:2: ( ruleSFeature )
            {
            // InternalSim.g:9769:2: ( ruleSFeature )
            // InternalSim.g:9770:3: ruleSFeature
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
    // InternalSim.g:9779:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9783:1: ( ( ruleSConstraint ) )
            // InternalSim.g:9784:2: ( ruleSConstraint )
            {
            // InternalSim.g:9784:2: ( ruleSConstraint )
            // InternalSim.g:9785:3: ruleSConstraint
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
    // InternalSim.g:9794:1: rule__SAssociation__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9798:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9799:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9799:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9800:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9809:1: rule__SAssociation__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9813:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9814:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9814:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9815:3: ruleSMorphFeatureRule
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
    // InternalSim.g:9824:1: rule__SAssociation__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9828:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:9829:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:9829:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:9830:3: ruleSDitchFeatureRule
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
    // InternalSim.g:9839:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9843:1: ( ( ( 'derived' ) ) )
            // InternalSim.g:9844:2: ( ( 'derived' ) )
            {
            // InternalSim.g:9844:2: ( ( 'derived' ) )
            // InternalSim.g:9845:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSim.g:9846:3: ( 'derived' )
            // InternalSim.g:9847:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalSim.g:9858:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9862:1: ( ( ruleSAssociationKind ) )
            // InternalSim.g:9863:2: ( ruleSAssociationKind )
            {
            // InternalSim.g:9863:2: ( ruleSAssociationKind )
            // InternalSim.g:9864:3: ruleSAssociationKind
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
    // InternalSim.g:9873:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9877:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSim.g:9878:2: ( ruleSAssociationKindInverse )
            {
            // InternalSim.g:9878:2: ( ruleSAssociationKindInverse )
            // InternalSim.g:9879:3: ruleSAssociationKindInverse
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
    // InternalSim.g:9888:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9892:1: ( ( RULE_ID ) )
            // InternalSim.g:9893:2: ( RULE_ID )
            {
            // InternalSim.g:9893:2: ( RULE_ID )
            // InternalSim.g:9894:3: RULE_ID
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
    // InternalSim.g:9903:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9907:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:9908:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:9908:2: ( ( RULE_ID ) )
            // InternalSim.g:9909:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 
            // InternalSim.g:9910:3: ( RULE_ID )
            // InternalSim.g:9911:4: RULE_ID
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
    // InternalSim.g:9922:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9926:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:9927:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:9927:2: ( ruleSMultiplicity )
            // InternalSim.g:9928:3: ruleSMultiplicity
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
    // InternalSim.g:9937:1: rule__SAttribute__DetailAssignment_0_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9941:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9942:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9942:2: ( ( 'detail' ) )
            // InternalSim.g:9943:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            // InternalSim.g:9944:3: ( 'detail' )
            // InternalSim.g:9945:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_2_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:9956:1: rule__SAttribute__DeductionRuleAssignment_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9960:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:9961:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:9961:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:9962:3: ruleSGrabFeatureRule
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
    // InternalSim.g:9971:1: rule__SAttribute__DetailAssignment_1_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9975:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:9976:2: ( ( 'detail' ) )
            {
            // InternalSim.g:9976:2: ( ( 'detail' ) )
            // InternalSim.g:9977:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            // InternalSim.g:9978:3: ( 'detail' )
            // InternalSim.g:9979:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_2_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:9990:1: rule__SAttribute__DeductionRuleAssignment_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:9994:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:9995:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:9995:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:9996:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10005:1: rule__SAttribute__DetailAssignment_2_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10009:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10010:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10010:2: ( ( 'detail' ) )
            // InternalSim.g:10011:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            // InternalSim.g:10012:3: ( 'detail' )
            // InternalSim.g:10013:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_2_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:10024:1: rule__SAttribute__DeductionRuleAssignment_2_3 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10028:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10029:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10029:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10030:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10039:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10043:1: ( ( ( 'detail' ) ) )
            // InternalSim.g:10044:2: ( ( 'detail' ) )
            {
            // InternalSim.g:10044:2: ( ( 'detail' ) )
            // InternalSim.g:10045:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSim.g:10046:3: ( 'detail' )
            // InternalSim.g:10047:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSim.g:10058:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10062:1: ( ( RULE_ID ) )
            // InternalSim.g:10063:2: ( RULE_ID )
            {
            // InternalSim.g:10063:2: ( RULE_ID )
            // InternalSim.g:10064:3: RULE_ID
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
    // InternalSim.g:10073:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10077:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10078:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10078:2: ( ( RULE_ID ) )
            // InternalSim.g:10079:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSim.g:10080:3: ( RULE_ID )
            // InternalSim.g:10081:4: RULE_ID
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
    // InternalSim.g:10092:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10096:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10097:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10097:2: ( ruleSMultiplicity )
            // InternalSim.g:10098:3: ruleSMultiplicity
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
    // InternalSim.g:10107:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10111:1: ( ( ( 'key' ) ) )
            // InternalSim.g:10112:2: ( ( 'key' ) )
            {
            // InternalSim.g:10112:2: ( ( 'key' ) )
            // InternalSim.g:10113:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSim.g:10114:3: ( 'key' )
            // InternalSim.g:10115:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalSim.g:10126:1: rule__SQuery__DeductionRuleAssignment_0_0_0_3 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10130:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10131:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10131:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10132:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10141:1: rule__SQuery__DeductionRuleAssignment_0_0_1_3 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10145:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10146:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10146:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10147:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10156:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10160:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10161:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10161:2: ( ruleSQueryParameter )
            // InternalSim.g:10162:3: ruleSQueryParameter
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
    // InternalSim.g:10171:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10175:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10176:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10176:2: ( ruleSQueryParameter )
            // InternalSim.g:10177:3: ruleSQueryParameter
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
    // InternalSim.g:10186:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10190:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10191:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10191:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10192:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10201:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10205:1: ( ( RULE_ID ) )
            // InternalSim.g:10206:2: ( RULE_ID )
            {
            // InternalSim.g:10206:2: ( RULE_ID )
            // InternalSim.g:10207:3: RULE_ID
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
    // InternalSim.g:10216:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10220:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10221:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10221:2: ( ruleSQueryParameter )
            // InternalSim.g:10222:3: ruleSQueryParameter
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
    // InternalSim.g:10231:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10235:1: ( ( ruleSQueryParameter ) )
            // InternalSim.g:10236:2: ( ruleSQueryParameter )
            {
            // InternalSim.g:10236:2: ( ruleSQueryParameter )
            // InternalSim.g:10237:3: ruleSQueryParameter
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
    // InternalSim.g:10246:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10250:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10251:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10251:2: ( ( RULE_ID ) )
            // InternalSim.g:10252:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSim.g:10253:3: ( RULE_ID )
            // InternalSim.g:10254:4: RULE_ID
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
    // InternalSim.g:10265:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10269:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10270:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10270:2: ( ruleSMultiplicity )
            // InternalSim.g:10271:3: ruleSMultiplicity
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
    // InternalSim.g:10280:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10284:1: ( ( ruleSExpression ) )
            // InternalSim.g:10285:2: ( ruleSExpression )
            {
            // InternalSim.g:10285:2: ( ruleSExpression )
            // InternalSim.g:10286:3: ruleSExpression
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
    // InternalSim.g:10295:1: rule__SQueryParameter__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10299:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSim.g:10300:2: ( ruleSGrabFeatureRule )
            {
            // InternalSim.g:10300:2: ( ruleSGrabFeatureRule )
            // InternalSim.g:10301:3: ruleSGrabFeatureRule
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
    // InternalSim.g:10310:1: rule__SQueryParameter__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10314:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSim.g:10315:2: ( ruleSMorphFeatureRule )
            {
            // InternalSim.g:10315:2: ( ruleSMorphFeatureRule )
            // InternalSim.g:10316:3: ruleSMorphFeatureRule
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
    // InternalSim.g:10325:1: rule__SQueryParameter__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10329:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSim.g:10330:2: ( ruleSDitchFeatureRule )
            {
            // InternalSim.g:10330:2: ( ruleSDitchFeatureRule )
            // InternalSim.g:10331:3: ruleSDitchFeatureRule
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
    // InternalSim.g:10340:1: rule__SQueryParameter__NameAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10344:1: ( ( RULE_ID ) )
            // InternalSim.g:10345:2: ( RULE_ID )
            {
            // InternalSim.g:10345:2: ( RULE_ID )
            // InternalSim.g:10346:3: RULE_ID
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
    // InternalSim.g:10355:1: rule__SQueryParameter__TypeAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10359:1: ( ( ( RULE_ID ) ) )
            // InternalSim.g:10360:2: ( ( RULE_ID ) )
            {
            // InternalSim.g:10360:2: ( ( RULE_ID ) )
            // InternalSim.g:10361:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_3_2_0()); 
            // InternalSim.g:10362:3: ( RULE_ID )
            // InternalSim.g:10363:4: RULE_ID
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
    // InternalSim.g:10374:1: rule__SQueryParameter__MultiplicityAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10378:1: ( ( ruleSMultiplicity ) )
            // InternalSim.g:10379:2: ( ruleSMultiplicity )
            {
            // InternalSim.g:10379:2: ( ruleSMultiplicity )
            // InternalSim.g:10380:3: ruleSMultiplicity
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
    // InternalSim.g:10389:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10393:1: ( ( RULE_STRING ) )
            // InternalSim.g:10394:2: ( RULE_STRING )
            {
            // InternalSim.g:10394:2: ( RULE_STRING )
            // InternalSim.g:10395:3: RULE_STRING
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
    // InternalSim.g:10404:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10408:1: ( ( RULE_INT ) )
            // InternalSim.g:10409:2: ( RULE_INT )
            {
            // InternalSim.g:10409:2: ( RULE_INT )
            // InternalSim.g:10410:3: RULE_INT
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
    // InternalSim.g:10419:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSim.g:10423:1: ( ( ruleMULTIPLICITY ) )
            // InternalSim.g:10424:2: ( ruleMULTIPLICITY )
            {
            // InternalSim.g:10424:2: ( ruleMULTIPLICITY )
            // InternalSim.g:10425:3: ruleMULTIPLICITY
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
    static final String dfa_2s = "\1\36\1\40\1\uffff\1\43\1\uffff\3\46\2\uffff\4\46";
    static final String dfa_3s = "\2\62\1\uffff\1\62\1\uffff\2\62\1\51\2\uffff\4\51";
    static final String dfa_4s = "\2\uffff\1\1\1\uffff\1\2\3\uffff\1\3\1\4\4\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\2\2\1\uffff\1\4\1\3\1\uffff\1\10\1\5\1\6\1\11\10\uffff\1\7",
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
            return "1001:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000603DB40401000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000403DB40001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000403DB40001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000403DB60000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000403DB40000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000010E0000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001040000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000401D040000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000403DB40000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00080290E0006820L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00080290C0006822L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008009040006800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000008020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000029040000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000009040010020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000009040000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000089040000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000010010L});

}