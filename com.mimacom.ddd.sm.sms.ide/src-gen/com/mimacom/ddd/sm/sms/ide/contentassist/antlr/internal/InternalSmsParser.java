package com.mimacom.ddd.sm.sms.ide.contentassist.antlr.internal;

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
import com.mimacom.ddd.sm.sms.services.SmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'realizes'", "'realises'", "'reference'", "'composite'", "'*'", "'domain'", "'import'", "'name'", "'='", "'extends'", "'and'", "'type'", "'grab'", "'aggregate'", "'{'", "'}'", "'constraint'", "':'", "'primitive'", "'redefines'", "'archetype'", "'enumeration'", "','", "'ditch'", "'root'", "'morph'", "'fuse'", "'detail'", "'('", "')'", "'query'", "'returns'", "'.*'", "'.'", "'..'", "'abstract'", "'derived'", "'key'"
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


        public InternalSmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSms.g"; }


    	private SmsGrammarAccess grammarAccess;

    	public void setGrammarAccess(SmsGrammarAccess grammarAccess) {
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
    // InternalSms.g:53:1: entryRuleSDomain : ruleSDomain EOF ;
    public final void entryRuleSDomain() throws RecognitionException {
        try {
            // InternalSms.g:54:1: ( ruleSDomain EOF )
            // InternalSms.g:55:1: ruleSDomain EOF
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
    // InternalSms.g:62:1: ruleSDomain : ( ( rule__SDomain__Group__0 ) ) ;
    public final void ruleSDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:66:2: ( ( ( rule__SDomain__Group__0 ) ) )
            // InternalSms.g:67:2: ( ( rule__SDomain__Group__0 ) )
            {
            // InternalSms.g:67:2: ( ( rule__SDomain__Group__0 ) )
            // InternalSms.g:68:3: ( rule__SDomain__Group__0 )
            {
             before(grammarAccess.getSDomainAccess().getGroup()); 
            // InternalSms.g:69:3: ( rule__SDomain__Group__0 )
            // InternalSms.g:69:4: rule__SDomain__Group__0
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
    // InternalSms.g:78:1: entryRuleSImport : ruleSImport EOF ;
    public final void entryRuleSImport() throws RecognitionException {
        try {
            // InternalSms.g:79:1: ( ruleSImport EOF )
            // InternalSms.g:80:1: ruleSImport EOF
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
    // InternalSms.g:87:1: ruleSImport : ( ( rule__SImport__Group__0 ) ) ;
    public final void ruleSImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:91:2: ( ( ( rule__SImport__Group__0 ) ) )
            // InternalSms.g:92:2: ( ( rule__SImport__Group__0 ) )
            {
            // InternalSms.g:92:2: ( ( rule__SImport__Group__0 ) )
            // InternalSms.g:93:3: ( rule__SImport__Group__0 )
            {
             before(grammarAccess.getSImportAccess().getGroup()); 
            // InternalSms.g:94:3: ( rule__SImport__Group__0 )
            // InternalSms.g:94:4: rule__SImport__Group__0
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
    // InternalSms.g:103:1: entryRuleSGrabAggregateRule : ruleSGrabAggregateRule EOF ;
    public final void entryRuleSGrabAggregateRule() throws RecognitionException {
        try {
            // InternalSms.g:104:1: ( ruleSGrabAggregateRule EOF )
            // InternalSms.g:105:1: ruleSGrabAggregateRule EOF
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
    // InternalSms.g:112:1: ruleSGrabAggregateRule : ( ( rule__SGrabAggregateRule__SourceAssignment ) ) ;
    public final void ruleSGrabAggregateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:116:2: ( ( ( rule__SGrabAggregateRule__SourceAssignment ) ) )
            // InternalSms.g:117:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            {
            // InternalSms.g:117:2: ( ( rule__SGrabAggregateRule__SourceAssignment ) )
            // InternalSms.g:118:3: ( rule__SGrabAggregateRule__SourceAssignment )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceAssignment()); 
            // InternalSms.g:119:3: ( rule__SGrabAggregateRule__SourceAssignment )
            // InternalSms.g:119:4: rule__SGrabAggregateRule__SourceAssignment
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
    // InternalSms.g:128:1: entryRuleSGrabEnumerationRule : ruleSGrabEnumerationRule EOF ;
    public final void entryRuleSGrabEnumerationRule() throws RecognitionException {
        try {
            // InternalSms.g:129:1: ( ruleSGrabEnumerationRule EOF )
            // InternalSms.g:130:1: ruleSGrabEnumerationRule EOF
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
    // InternalSms.g:137:1: ruleSGrabEnumerationRule : ( ( rule__SGrabEnumerationRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:141:2: ( ( ( rule__SGrabEnumerationRule__Group__0 ) ) )
            // InternalSms.g:142:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            {
            // InternalSms.g:142:2: ( ( rule__SGrabEnumerationRule__Group__0 ) )
            // InternalSms.g:143:3: ( rule__SGrabEnumerationRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup()); 
            // InternalSms.g:144:3: ( rule__SGrabEnumerationRule__Group__0 )
            // InternalSms.g:144:4: rule__SGrabEnumerationRule__Group__0
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


    // $ANTLR start "entryRuleSGrabEnumerationLiteralRule"
    // InternalSms.g:153:1: entryRuleSGrabEnumerationLiteralRule : ruleSGrabEnumerationLiteralRule EOF ;
    public final void entryRuleSGrabEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSms.g:154:1: ( ruleSGrabEnumerationLiteralRule EOF )
            // InternalSms.g:155:1: ruleSGrabEnumerationLiteralRule EOF
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
    // InternalSms.g:162:1: ruleSGrabEnumerationLiteralRule : ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) ;
    public final void ruleSGrabEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:166:2: ( ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) ) )
            // InternalSms.g:167:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            {
            // InternalSms.g:167:2: ( ( rule__SGrabEnumerationLiteralRule__Group__0 ) )
            // InternalSms.g:168:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup()); 
            // InternalSms.g:169:3: ( rule__SGrabEnumerationLiteralRule__Group__0 )
            // InternalSms.g:169:4: rule__SGrabEnumerationLiteralRule__Group__0
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
    // InternalSms.g:178:1: entryRuleSDitchEnumerationLiteralRule : ruleSDitchEnumerationLiteralRule EOF ;
    public final void entryRuleSDitchEnumerationLiteralRule() throws RecognitionException {
        try {
            // InternalSms.g:179:1: ( ruleSDitchEnumerationLiteralRule EOF )
            // InternalSms.g:180:1: ruleSDitchEnumerationLiteralRule EOF
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
    // InternalSms.g:187:1: ruleSDitchEnumerationLiteralRule : ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) ;
    public final void ruleSDitchEnumerationLiteralRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:191:2: ( ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) ) )
            // InternalSms.g:192:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            {
            // InternalSms.g:192:2: ( ( rule__SDitchEnumerationLiteralRule__SourceAssignment ) )
            // InternalSms.g:193:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceAssignment()); 
            // InternalSms.g:194:3: ( rule__SDitchEnumerationLiteralRule__SourceAssignment )
            // InternalSms.g:194:4: rule__SDitchEnumerationLiteralRule__SourceAssignment
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
    // InternalSms.g:203:1: entryRuleSGrabComplexTypeRule : ruleSGrabComplexTypeRule EOF ;
    public final void entryRuleSGrabComplexTypeRule() throws RecognitionException {
        try {
            // InternalSms.g:204:1: ( ruleSGrabComplexTypeRule EOF )
            // InternalSms.g:205:1: ruleSGrabComplexTypeRule EOF
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
    // InternalSms.g:212:1: ruleSGrabComplexTypeRule : ( ( rule__SGrabComplexTypeRule__Group__0 ) ) ;
    public final void ruleSGrabComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:216:2: ( ( ( rule__SGrabComplexTypeRule__Group__0 ) ) )
            // InternalSms.g:217:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            {
            // InternalSms.g:217:2: ( ( rule__SGrabComplexTypeRule__Group__0 ) )
            // InternalSms.g:218:3: ( rule__SGrabComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup()); 
            // InternalSms.g:219:3: ( rule__SGrabComplexTypeRule__Group__0 )
            // InternalSms.g:219:4: rule__SGrabComplexTypeRule__Group__0
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


    // $ANTLR start "entryRuleSMorphComplexTypeRule"
    // InternalSms.g:228:1: entryRuleSMorphComplexTypeRule : ruleSMorphComplexTypeRule EOF ;
    public final void entryRuleSMorphComplexTypeRule() throws RecognitionException {
        try {
            // InternalSms.g:229:1: ( ruleSMorphComplexTypeRule EOF )
            // InternalSms.g:230:1: ruleSMorphComplexTypeRule EOF
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
    // InternalSms.g:237:1: ruleSMorphComplexTypeRule : ( ( rule__SMorphComplexTypeRule__Group__0 ) ) ;
    public final void ruleSMorphComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:241:2: ( ( ( rule__SMorphComplexTypeRule__Group__0 ) ) )
            // InternalSms.g:242:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            {
            // InternalSms.g:242:2: ( ( rule__SMorphComplexTypeRule__Group__0 ) )
            // InternalSms.g:243:3: ( rule__SMorphComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup()); 
            // InternalSms.g:244:3: ( rule__SMorphComplexTypeRule__Group__0 )
            // InternalSms.g:244:4: rule__SMorphComplexTypeRule__Group__0
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
    // InternalSms.g:253:1: entryRuleSFuseComplexTypeRule : ruleSFuseComplexTypeRule EOF ;
    public final void entryRuleSFuseComplexTypeRule() throws RecognitionException {
        try {
            // InternalSms.g:254:1: ( ruleSFuseComplexTypeRule EOF )
            // InternalSms.g:255:1: ruleSFuseComplexTypeRule EOF
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
    // InternalSms.g:262:1: ruleSFuseComplexTypeRule : ( ( rule__SFuseComplexTypeRule__Group__0 ) ) ;
    public final void ruleSFuseComplexTypeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:266:2: ( ( ( rule__SFuseComplexTypeRule__Group__0 ) ) )
            // InternalSms.g:267:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            {
            // InternalSms.g:267:2: ( ( rule__SFuseComplexTypeRule__Group__0 ) )
            // InternalSms.g:268:3: ( rule__SFuseComplexTypeRule__Group__0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup()); 
            // InternalSms.g:269:3: ( rule__SFuseComplexTypeRule__Group__0 )
            // InternalSms.g:269:4: rule__SFuseComplexTypeRule__Group__0
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
    // InternalSms.g:278:1: entryRuleSGrabFeatureRule : ruleSGrabFeatureRule EOF ;
    public final void entryRuleSGrabFeatureRule() throws RecognitionException {
        try {
            // InternalSms.g:279:1: ( ruleSGrabFeatureRule EOF )
            // InternalSms.g:280:1: ruleSGrabFeatureRule EOF
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
    // InternalSms.g:287:1: ruleSGrabFeatureRule : ( ( rule__SGrabFeatureRule__Group__0 ) ) ;
    public final void ruleSGrabFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:291:2: ( ( ( rule__SGrabFeatureRule__Group__0 ) ) )
            // InternalSms.g:292:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            {
            // InternalSms.g:292:2: ( ( rule__SGrabFeatureRule__Group__0 ) )
            // InternalSms.g:293:3: ( rule__SGrabFeatureRule__Group__0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup()); 
            // InternalSms.g:294:3: ( rule__SGrabFeatureRule__Group__0 )
            // InternalSms.g:294:4: rule__SGrabFeatureRule__Group__0
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
    // InternalSms.g:303:1: entryRuleSMorphFeatureRule : ruleSMorphFeatureRule EOF ;
    public final void entryRuleSMorphFeatureRule() throws RecognitionException {
        try {
            // InternalSms.g:304:1: ( ruleSMorphFeatureRule EOF )
            // InternalSms.g:305:1: ruleSMorphFeatureRule EOF
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
    // InternalSms.g:312:1: ruleSMorphFeatureRule : ( ( rule__SMorphFeatureRule__Group__0 ) ) ;
    public final void ruleSMorphFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:316:2: ( ( ( rule__SMorphFeatureRule__Group__0 ) ) )
            // InternalSms.g:317:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            {
            // InternalSms.g:317:2: ( ( rule__SMorphFeatureRule__Group__0 ) )
            // InternalSms.g:318:3: ( rule__SMorphFeatureRule__Group__0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup()); 
            // InternalSms.g:319:3: ( rule__SMorphFeatureRule__Group__0 )
            // InternalSms.g:319:4: rule__SMorphFeatureRule__Group__0
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
    // InternalSms.g:328:1: entryRuleSDitchFeatureRule : ruleSDitchFeatureRule EOF ;
    public final void entryRuleSDitchFeatureRule() throws RecognitionException {
        try {
            // InternalSms.g:329:1: ( ruleSDitchFeatureRule EOF )
            // InternalSms.g:330:1: ruleSDitchFeatureRule EOF
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
    // InternalSms.g:337:1: ruleSDitchFeatureRule : ( ( rule__SDitchFeatureRule__SourceAssignment ) ) ;
    public final void ruleSDitchFeatureRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:341:2: ( ( ( rule__SDitchFeatureRule__SourceAssignment ) ) )
            // InternalSms.g:342:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            {
            // InternalSms.g:342:2: ( ( rule__SDitchFeatureRule__SourceAssignment ) )
            // InternalSms.g:343:3: ( rule__SDitchFeatureRule__SourceAssignment )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceAssignment()); 
            // InternalSms.g:344:3: ( rule__SDitchFeatureRule__SourceAssignment )
            // InternalSms.g:344:4: rule__SDitchFeatureRule__SourceAssignment
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
    // InternalSms.g:353:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSms.g:354:1: ( ruleSAggregate EOF )
            // InternalSms.g:355:1: ruleSAggregate EOF
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
    // InternalSms.g:362:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:366:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSms.g:367:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSms.g:367:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSms.g:368:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSms.g:369:3: ( rule__SAggregate__Group__0 )
            // InternalSms.g:369:4: rule__SAggregate__Group__0
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
    // InternalSms.g:378:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSms.g:379:1: ( ruleSType EOF )
            // InternalSms.g:380:1: ruleSType EOF
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
    // InternalSms.g:387:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:391:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSms.g:392:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSms.g:392:2: ( ( rule__SType__Alternatives ) )
            // InternalSms.g:393:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSms.g:394:3: ( rule__SType__Alternatives )
            // InternalSms.g:394:4: rule__SType__Alternatives
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
    // InternalSms.g:403:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSms.g:404:1: ( ruleSConstraint EOF )
            // InternalSms.g:405:1: ruleSConstraint EOF
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
    // InternalSms.g:412:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:416:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSms.g:417:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSms.g:417:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSms.g:418:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSms.g:419:3: ( rule__SConstraint__Group__0 )
            // InternalSms.g:419:4: rule__SConstraint__Group__0
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
    // InternalSms.g:428:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSms.g:429:1: ( ruleSPrimitive EOF )
            // InternalSms.g:430:1: ruleSPrimitive EOF
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
    // InternalSms.g:437:1: ruleSPrimitive : ( ( rule__SPrimitive__Group__0 ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:441:2: ( ( ( rule__SPrimitive__Group__0 ) ) )
            // InternalSms.g:442:2: ( ( rule__SPrimitive__Group__0 ) )
            {
            // InternalSms.g:442:2: ( ( rule__SPrimitive__Group__0 ) )
            // InternalSms.g:443:3: ( rule__SPrimitive__Group__0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getGroup()); 
            // InternalSms.g:444:3: ( rule__SPrimitive__Group__0 )
            // InternalSms.g:444:4: rule__SPrimitive__Group__0
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
    // InternalSms.g:453:1: entryRuleSPrimitiveArchetype : ruleSPrimitiveArchetype EOF ;
    public final void entryRuleSPrimitiveArchetype() throws RecognitionException {
        try {
            // InternalSms.g:454:1: ( ruleSPrimitiveArchetype EOF )
            // InternalSms.g:455:1: ruleSPrimitiveArchetype EOF
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
    // InternalSms.g:462:1: ruleSPrimitiveArchetype : ( ( rule__SPrimitiveArchetype__Group__0 ) ) ;
    public final void ruleSPrimitiveArchetype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:466:2: ( ( ( rule__SPrimitiveArchetype__Group__0 ) ) )
            // InternalSms.g:467:2: ( ( rule__SPrimitiveArchetype__Group__0 ) )
            {
            // InternalSms.g:467:2: ( ( rule__SPrimitiveArchetype__Group__0 ) )
            // InternalSms.g:468:3: ( rule__SPrimitiveArchetype__Group__0 )
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getGroup()); 
            // InternalSms.g:469:3: ( rule__SPrimitiveArchetype__Group__0 )
            // InternalSms.g:469:4: rule__SPrimitiveArchetype__Group__0
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
    // InternalSms.g:478:1: entryRuleSEnumeration : ruleSEnumeration EOF ;
    public final void entryRuleSEnumeration() throws RecognitionException {
        try {
            // InternalSms.g:479:1: ( ruleSEnumeration EOF )
            // InternalSms.g:480:1: ruleSEnumeration EOF
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
    // InternalSms.g:487:1: ruleSEnumeration : ( ( rule__SEnumeration__Group__0 ) ) ;
    public final void ruleSEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:491:2: ( ( ( rule__SEnumeration__Group__0 ) ) )
            // InternalSms.g:492:2: ( ( rule__SEnumeration__Group__0 ) )
            {
            // InternalSms.g:492:2: ( ( rule__SEnumeration__Group__0 ) )
            // InternalSms.g:493:3: ( rule__SEnumeration__Group__0 )
            {
             before(grammarAccess.getSEnumerationAccess().getGroup()); 
            // InternalSms.g:494:3: ( rule__SEnumeration__Group__0 )
            // InternalSms.g:494:4: rule__SEnumeration__Group__0
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
    // InternalSms.g:503:1: entryRuleSLiteral : ruleSLiteral EOF ;
    public final void entryRuleSLiteral() throws RecognitionException {
        try {
            // InternalSms.g:504:1: ( ruleSLiteral EOF )
            // InternalSms.g:505:1: ruleSLiteral EOF
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
    // InternalSms.g:512:1: ruleSLiteral : ( ( rule__SLiteral__Alternatives ) ) ;
    public final void ruleSLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:516:2: ( ( ( rule__SLiteral__Alternatives ) ) )
            // InternalSms.g:517:2: ( ( rule__SLiteral__Alternatives ) )
            {
            // InternalSms.g:517:2: ( ( rule__SLiteral__Alternatives ) )
            // InternalSms.g:518:3: ( rule__SLiteral__Alternatives )
            {
             before(grammarAccess.getSLiteralAccess().getAlternatives()); 
            // InternalSms.g:519:3: ( rule__SLiteral__Alternatives )
            // InternalSms.g:519:4: rule__SLiteral__Alternatives
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
    // InternalSms.g:528:1: entryRuleSRootType : ruleSRootType EOF ;
    public final void entryRuleSRootType() throws RecognitionException {
        try {
            // InternalSms.g:529:1: ( ruleSRootType EOF )
            // InternalSms.g:530:1: ruleSRootType EOF
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
    // InternalSms.g:537:1: ruleSRootType : ( ( rule__SRootType__Group__0 ) ) ;
    public final void ruleSRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:541:2: ( ( ( rule__SRootType__Group__0 ) ) )
            // InternalSms.g:542:2: ( ( rule__SRootType__Group__0 ) )
            {
            // InternalSms.g:542:2: ( ( rule__SRootType__Group__0 ) )
            // InternalSms.g:543:3: ( rule__SRootType__Group__0 )
            {
             before(grammarAccess.getSRootTypeAccess().getGroup()); 
            // InternalSms.g:544:3: ( rule__SRootType__Group__0 )
            // InternalSms.g:544:4: rule__SRootType__Group__0
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
    // InternalSms.g:553:1: entryRuleSDetailType : ruleSDetailType EOF ;
    public final void entryRuleSDetailType() throws RecognitionException {
        try {
            // InternalSms.g:554:1: ( ruleSDetailType EOF )
            // InternalSms.g:555:1: ruleSDetailType EOF
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
    // InternalSms.g:562:1: ruleSDetailType : ( ( rule__SDetailType__Group__0 ) ) ;
    public final void ruleSDetailType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:566:2: ( ( ( rule__SDetailType__Group__0 ) ) )
            // InternalSms.g:567:2: ( ( rule__SDetailType__Group__0 ) )
            {
            // InternalSms.g:567:2: ( ( rule__SDetailType__Group__0 ) )
            // InternalSms.g:568:3: ( rule__SDetailType__Group__0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getGroup()); 
            // InternalSms.g:569:3: ( rule__SDetailType__Group__0 )
            // InternalSms.g:569:4: rule__SDetailType__Group__0
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
    // InternalSms.g:579:1: ruleSComplexTypeExtends : ( ( rule__SComplexTypeExtends__Group__0 )? ) ;
    public final void ruleSComplexTypeExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:583:2: ( ( ( rule__SComplexTypeExtends__Group__0 )? ) )
            // InternalSms.g:584:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            {
            // InternalSms.g:584:2: ( ( rule__SComplexTypeExtends__Group__0 )? )
            // InternalSms.g:585:3: ( rule__SComplexTypeExtends__Group__0 )?
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getGroup()); 
            // InternalSms.g:586:3: ( rule__SComplexTypeExtends__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSms.g:586:4: rule__SComplexTypeExtends__Group__0
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
    // InternalSms.g:596:1: ruleSComplexTypeFeatures : ( ( rule__SComplexTypeFeatures__Group__0 ) ) ;
    public final void ruleSComplexTypeFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:600:2: ( ( ( rule__SComplexTypeFeatures__Group__0 ) ) )
            // InternalSms.g:601:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            {
            // InternalSms.g:601:2: ( ( rule__SComplexTypeFeatures__Group__0 ) )
            // InternalSms.g:602:3: ( rule__SComplexTypeFeatures__Group__0 )
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getGroup()); 
            // InternalSms.g:603:3: ( rule__SComplexTypeFeatures__Group__0 )
            // InternalSms.g:603:4: rule__SComplexTypeFeatures__Group__0
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
    // InternalSms.g:612:1: entryRuleSFeature : ruleSFeature EOF ;
    public final void entryRuleSFeature() throws RecognitionException {
        try {
            // InternalSms.g:613:1: ( ruleSFeature EOF )
            // InternalSms.g:614:1: ruleSFeature EOF
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
    // InternalSms.g:621:1: ruleSFeature : ( ( rule__SFeature__Alternatives ) ) ;
    public final void ruleSFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:625:2: ( ( ( rule__SFeature__Alternatives ) ) )
            // InternalSms.g:626:2: ( ( rule__SFeature__Alternatives ) )
            {
            // InternalSms.g:626:2: ( ( rule__SFeature__Alternatives ) )
            // InternalSms.g:627:3: ( rule__SFeature__Alternatives )
            {
             before(grammarAccess.getSFeatureAccess().getAlternatives()); 
            // InternalSms.g:628:3: ( rule__SFeature__Alternatives )
            // InternalSms.g:628:4: rule__SFeature__Alternatives
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
    // InternalSms.g:637:1: entryRuleSAssociation : ruleSAssociation EOF ;
    public final void entryRuleSAssociation() throws RecognitionException {
        try {
            // InternalSms.g:638:1: ( ruleSAssociation EOF )
            // InternalSms.g:639:1: ruleSAssociation EOF
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
    // InternalSms.g:646:1: ruleSAssociation : ( ( rule__SAssociation__Alternatives ) ) ;
    public final void ruleSAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:650:2: ( ( ( rule__SAssociation__Alternatives ) ) )
            // InternalSms.g:651:2: ( ( rule__SAssociation__Alternatives ) )
            {
            // InternalSms.g:651:2: ( ( rule__SAssociation__Alternatives ) )
            // InternalSms.g:652:3: ( rule__SAssociation__Alternatives )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives()); 
            // InternalSms.g:653:3: ( rule__SAssociation__Alternatives )
            // InternalSms.g:653:4: rule__SAssociation__Alternatives
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
    // InternalSms.g:662:1: entryRuleSAttribute : ruleSAttribute EOF ;
    public final void entryRuleSAttribute() throws RecognitionException {
        try {
            // InternalSms.g:663:1: ( ruleSAttribute EOF )
            // InternalSms.g:664:1: ruleSAttribute EOF
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
    // InternalSms.g:671:1: ruleSAttribute : ( ( rule__SAttribute__Alternatives ) ) ;
    public final void ruleSAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:675:2: ( ( ( rule__SAttribute__Alternatives ) ) )
            // InternalSms.g:676:2: ( ( rule__SAttribute__Alternatives ) )
            {
            // InternalSms.g:676:2: ( ( rule__SAttribute__Alternatives ) )
            // InternalSms.g:677:3: ( rule__SAttribute__Alternatives )
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives()); 
            // InternalSms.g:678:3: ( rule__SAttribute__Alternatives )
            // InternalSms.g:678:4: rule__SAttribute__Alternatives
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
    // InternalSms.g:687:1: entryRuleSQuery : ruleSQuery EOF ;
    public final void entryRuleSQuery() throws RecognitionException {
        try {
            // InternalSms.g:688:1: ( ruleSQuery EOF )
            // InternalSms.g:689:1: ruleSQuery EOF
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
    // InternalSms.g:696:1: ruleSQuery : ( ( rule__SQuery__Alternatives ) ) ;
    public final void ruleSQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:700:2: ( ( ( rule__SQuery__Alternatives ) ) )
            // InternalSms.g:701:2: ( ( rule__SQuery__Alternatives ) )
            {
            // InternalSms.g:701:2: ( ( rule__SQuery__Alternatives ) )
            // InternalSms.g:702:3: ( rule__SQuery__Alternatives )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives()); 
            // InternalSms.g:703:3: ( rule__SQuery__Alternatives )
            // InternalSms.g:703:4: rule__SQuery__Alternatives
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
    // InternalSms.g:712:1: entryRuleSQueryParameter : ruleSQueryParameter EOF ;
    public final void entryRuleSQueryParameter() throws RecognitionException {
        try {
            // InternalSms.g:713:1: ( ruleSQueryParameter EOF )
            // InternalSms.g:714:1: ruleSQueryParameter EOF
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
    // InternalSms.g:721:1: ruleSQueryParameter : ( ( rule__SQueryParameter__Alternatives ) ) ;
    public final void ruleSQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:725:2: ( ( ( rule__SQueryParameter__Alternatives ) ) )
            // InternalSms.g:726:2: ( ( rule__SQueryParameter__Alternatives ) )
            {
            // InternalSms.g:726:2: ( ( rule__SQueryParameter__Alternatives ) )
            // InternalSms.g:727:3: ( rule__SQueryParameter__Alternatives )
            {
             before(grammarAccess.getSQueryParameterAccess().getAlternatives()); 
            // InternalSms.g:728:3: ( rule__SQueryParameter__Alternatives )
            // InternalSms.g:728:4: rule__SQueryParameter__Alternatives
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
    // InternalSms.g:737:1: entryRuleSExpression : ruleSExpression EOF ;
    public final void entryRuleSExpression() throws RecognitionException {
        try {
            // InternalSms.g:738:1: ( ruleSExpression EOF )
            // InternalSms.g:739:1: ruleSExpression EOF
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
    // InternalSms.g:746:1: ruleSExpression : ( ( rule__SExpression__ExprAssignment ) ) ;
    public final void ruleSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:750:2: ( ( ( rule__SExpression__ExprAssignment ) ) )
            // InternalSms.g:751:2: ( ( rule__SExpression__ExprAssignment ) )
            {
            // InternalSms.g:751:2: ( ( rule__SExpression__ExprAssignment ) )
            // InternalSms.g:752:3: ( rule__SExpression__ExprAssignment )
            {
             before(grammarAccess.getSExpressionAccess().getExprAssignment()); 
            // InternalSms.g:753:3: ( rule__SExpression__ExprAssignment )
            // InternalSms.g:753:4: rule__SExpression__ExprAssignment
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
    // InternalSms.g:762:1: entryRuleSQualifiedNameWithWildcard : ruleSQualifiedNameWithWildcard EOF ;
    public final void entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSms.g:763:1: ( ruleSQualifiedNameWithWildcard EOF )
            // InternalSms.g:764:1: ruleSQualifiedNameWithWildcard EOF
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
    // InternalSms.g:771:1: ruleSQualifiedNameWithWildcard : ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleSQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:775:2: ( ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSms.g:776:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSms.g:776:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            // InternalSms.g:777:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSms.g:778:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            // InternalSms.g:778:4: rule__SQualifiedNameWithWildcard__Group__0
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
    // InternalSms.g:787:1: entryRuleSQualifiedName : ruleSQualifiedName EOF ;
    public final void entryRuleSQualifiedName() throws RecognitionException {
        try {
            // InternalSms.g:788:1: ( ruleSQualifiedName EOF )
            // InternalSms.g:789:1: ruleSQualifiedName EOF
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
    // InternalSms.g:796:1: ruleSQualifiedName : ( ( rule__SQualifiedName__Group__0 ) ) ;
    public final void ruleSQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:800:2: ( ( ( rule__SQualifiedName__Group__0 ) ) )
            // InternalSms.g:801:2: ( ( rule__SQualifiedName__Group__0 ) )
            {
            // InternalSms.g:801:2: ( ( rule__SQualifiedName__Group__0 ) )
            // InternalSms.g:802:3: ( rule__SQualifiedName__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup()); 
            // InternalSms.g:803:3: ( rule__SQualifiedName__Group__0 )
            // InternalSms.g:803:4: rule__SQualifiedName__Group__0
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
    // InternalSms.g:812:1: entryRuleSMultiplicity : ruleSMultiplicity EOF ;
    public final void entryRuleSMultiplicity() throws RecognitionException {
        try {
            // InternalSms.g:813:1: ( ruleSMultiplicity EOF )
            // InternalSms.g:814:1: ruleSMultiplicity EOF
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
    // InternalSms.g:821:1: ruleSMultiplicity : ( ( rule__SMultiplicity__Group__0 ) ) ;
    public final void ruleSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:825:2: ( ( ( rule__SMultiplicity__Group__0 ) ) )
            // InternalSms.g:826:2: ( ( rule__SMultiplicity__Group__0 ) )
            {
            // InternalSms.g:826:2: ( ( rule__SMultiplicity__Group__0 ) )
            // InternalSms.g:827:3: ( rule__SMultiplicity__Group__0 )
            {
             before(grammarAccess.getSMultiplicityAccess().getGroup()); 
            // InternalSms.g:828:3: ( rule__SMultiplicity__Group__0 )
            // InternalSms.g:828:4: rule__SMultiplicity__Group__0
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
    // InternalSms.g:837:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalSms.g:838:1: ( ruleMULTIPLICITY EOF )
            // InternalSms.g:839:1: ruleMULTIPLICITY EOF
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
    // InternalSms.g:846:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:850:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalSms.g:851:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalSms.g:851:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalSms.g:852:3: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // InternalSms.g:853:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalSms.g:853:4: rule__MULTIPLICITY__Alternatives
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
    // InternalSms.g:862:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:866:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSms.g:867:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSms.g:867:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSms.g:868:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSms.g:869:3: ( rule__SAssociationKind__Alternatives )
            // InternalSms.g:869:4: rule__SAssociationKind__Alternatives
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
    // InternalSms.g:878:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:882:1: ( ( ( 'inverse' ) ) )
            // InternalSms.g:883:2: ( ( 'inverse' ) )
            {
            // InternalSms.g:883:2: ( ( 'inverse' ) )
            // InternalSms.g:884:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSms.g:885:3: ( 'inverse' )
            // InternalSms.g:885:4: 'inverse'
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
    // InternalSms.g:893:1: rule__SDomain__Alternatives_3 : ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) );
    public final void rule__SDomain__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:897:1: ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 30:
            case 32:
            case 33:
            case 36:
            case 37:
            case 38:
            case 39:
            case 47:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==33||LA2_2==36||LA2_2==39||LA2_2==47) ) {
                    alt2=1;
                }
                else if ( (LA2_2==25) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
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
                    // InternalSms.g:898:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    {
                    // InternalSms.g:898:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    // InternalSms.g:899:3: ( rule__SDomain__TypesAssignment_3_0 )
                    {
                     before(grammarAccess.getSDomainAccess().getTypesAssignment_3_0()); 
                    // InternalSms.g:900:3: ( rule__SDomain__TypesAssignment_3_0 )
                    // InternalSms.g:900:4: rule__SDomain__TypesAssignment_3_0
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
                    // InternalSms.g:904:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    {
                    // InternalSms.g:904:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    // InternalSms.g:905:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    {
                     before(grammarAccess.getSDomainAccess().getAggregatesAssignment_3_1()); 
                    // InternalSms.g:906:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    // InternalSms.g:906:4: rule__SDomain__AggregatesAssignment_3_1
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
    // InternalSms.g:914:1: rule__SAggregate__Alternatives_1 : ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( ( rule__SAggregate__Group_1_1__0 ) ) );
    public final void rule__SAggregate__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:918:1: ( ( ( rule__SAggregate__Group_1_0__0 ) ) | ( ( rule__SAggregate__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSms.g:919:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    {
                    // InternalSms.g:919:2: ( ( rule__SAggregate__Group_1_0__0 ) )
                    // InternalSms.g:920:3: ( rule__SAggregate__Group_1_0__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_0()); 
                    // InternalSms.g:921:3: ( rule__SAggregate__Group_1_0__0 )
                    // InternalSms.g:921:4: rule__SAggregate__Group_1_0__0
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
                    // InternalSms.g:925:2: ( ( rule__SAggregate__Group_1_1__0 ) )
                    {
                    // InternalSms.g:925:2: ( ( rule__SAggregate__Group_1_1__0 ) )
                    // InternalSms.g:926:3: ( rule__SAggregate__Group_1_1__0 )
                    {
                     before(grammarAccess.getSAggregateAccess().getGroup_1_1()); 
                    // InternalSms.g:927:3: ( rule__SAggregate__Group_1_1__0 )
                    // InternalSms.g:927:4: rule__SAggregate__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAggregate__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAggregateAccess().getGroup_1_1()); 

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
    // InternalSms.g:935:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:939:1: ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalSms.g:940:2: ( ruleSPrimitive )
                    {
                    // InternalSms.g:940:2: ( ruleSPrimitive )
                    // InternalSms.g:941:3: ruleSPrimitive
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
                    // InternalSms.g:946:2: ( ruleSPrimitiveArchetype )
                    {
                    // InternalSms.g:946:2: ( ruleSPrimitiveArchetype )
                    // InternalSms.g:947:3: ruleSPrimitiveArchetype
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
                    // InternalSms.g:952:2: ( ruleSEnumeration )
                    {
                    // InternalSms.g:952:2: ( ruleSEnumeration )
                    // InternalSms.g:953:3: ruleSEnumeration
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
                    // InternalSms.g:958:2: ( ruleSRootType )
                    {
                    // InternalSms.g:958:2: ( ruleSRootType )
                    // InternalSms.g:959:3: ruleSRootType
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
                    // InternalSms.g:964:2: ( ruleSDetailType )
                    {
                    // InternalSms.g:964:2: ( ruleSDetailType )
                    // InternalSms.g:965:3: ruleSDetailType
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
    // InternalSms.g:974:1: rule__SPrimitive__Alternatives_2 : ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) );
    public final void rule__SPrimitive__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:978:1: ( ( ( rule__SPrimitive__Group_2_0__0 ) ) | ( ( rule__SPrimitive__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSms.g:979:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    {
                    // InternalSms.g:979:2: ( ( rule__SPrimitive__Group_2_0__0 ) )
                    // InternalSms.g:980:3: ( rule__SPrimitive__Group_2_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_0()); 
                    // InternalSms.g:981:3: ( rule__SPrimitive__Group_2_0__0 )
                    // InternalSms.g:981:4: rule__SPrimitive__Group_2_0__0
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
                    // InternalSms.g:985:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    {
                    // InternalSms.g:985:2: ( ( rule__SPrimitive__Group_2_1__0 ) )
                    // InternalSms.g:986:3: ( rule__SPrimitive__Group_2_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_2_1()); 
                    // InternalSms.g:987:3: ( rule__SPrimitive__Group_2_1__0 )
                    // InternalSms.g:987:4: rule__SPrimitive__Group_2_1__0
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
    // InternalSms.g:995:1: rule__SPrimitive__Alternatives_2_1_0 : ( ( 'realizes' ) | ( 'realises' ) );
    public final void rule__SPrimitive__Alternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:999:1: ( ( 'realizes' ) | ( 'realises' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSms.g:1000:2: ( 'realizes' )
                    {
                    // InternalSms.g:1000:2: ( 'realizes' )
                    // InternalSms.g:1001:3: 'realizes'
                    {
                     before(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1006:2: ( 'realises' )
                    {
                    // InternalSms.g:1006:2: ( 'realises' )
                    // InternalSms.g:1007:3: 'realises'
                    {
                     before(grammarAccess.getSPrimitiveAccess().getRealisesKeyword_2_1_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalSms.g:1016:1: rule__SEnumeration__Alternatives_0 : ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) );
    public final void rule__SEnumeration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1020:1: ( ( ( rule__SEnumeration__Group_0_0__0 ) ) | ( ( rule__SEnumeration__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSms.g:1021:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    {
                    // InternalSms.g:1021:2: ( ( rule__SEnumeration__Group_0_0__0 ) )
                    // InternalSms.g:1022:3: ( rule__SEnumeration__Group_0_0__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_0()); 
                    // InternalSms.g:1023:3: ( rule__SEnumeration__Group_0_0__0 )
                    // InternalSms.g:1023:4: rule__SEnumeration__Group_0_0__0
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
                    // InternalSms.g:1027:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    {
                    // InternalSms.g:1027:2: ( ( rule__SEnumeration__Group_0_1__0 ) )
                    // InternalSms.g:1028:3: ( rule__SEnumeration__Group_0_1__0 )
                    {
                     before(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 
                    // InternalSms.g:1029:3: ( rule__SEnumeration__Group_0_1__0 )
                    // InternalSms.g:1029:4: rule__SEnumeration__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSEnumerationAccess().getGroup_0_1()); 

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
    // InternalSms.g:1037:1: rule__SLiteral__Alternatives : ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) );
    public final void rule__SLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1041:1: ( ( ( rule__SLiteral__Group_0__0 ) ) | ( ( rule__SLiteral__Group_1__0 ) ) | ( ( rule__SLiteral__NameAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 35:
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
                    // InternalSms.g:1042:2: ( ( rule__SLiteral__Group_0__0 ) )
                    {
                    // InternalSms.g:1042:2: ( ( rule__SLiteral__Group_0__0 ) )
                    // InternalSms.g:1043:3: ( rule__SLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_0()); 
                    // InternalSms.g:1044:3: ( rule__SLiteral__Group_0__0 )
                    // InternalSms.g:1044:4: rule__SLiteral__Group_0__0
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
                    // InternalSms.g:1048:2: ( ( rule__SLiteral__Group_1__0 ) )
                    {
                    // InternalSms.g:1048:2: ( ( rule__SLiteral__Group_1__0 ) )
                    // InternalSms.g:1049:3: ( rule__SLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSLiteralAccess().getGroup_1()); 
                    // InternalSms.g:1050:3: ( rule__SLiteral__Group_1__0 )
                    // InternalSms.g:1050:4: rule__SLiteral__Group_1__0
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
                    // InternalSms.g:1054:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    {
                    // InternalSms.g:1054:2: ( ( rule__SLiteral__NameAssignment_2 ) )
                    // InternalSms.g:1055:3: ( rule__SLiteral__NameAssignment_2 )
                    {
                     before(grammarAccess.getSLiteralAccess().getNameAssignment_2()); 
                    // InternalSms.g:1056:3: ( rule__SLiteral__NameAssignment_2 )
                    // InternalSms.g:1056:4: rule__SLiteral__NameAssignment_2
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
    // InternalSms.g:1064:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1068:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) | ( ( rule__SRootType__Group_0_2__0 ) ) | ( ( rule__SRootType__Group_0_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 36:
            case 47:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSms.g:1069:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSms.g:1069:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSms.g:1070:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSms.g:1071:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSms.g:1071:4: rule__SRootType__Group_0_0__0
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
                    // InternalSms.g:1075:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSms.g:1075:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSms.g:1076:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSms.g:1077:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSms.g:1077:4: rule__SRootType__Group_0_1__0
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
                    // InternalSms.g:1081:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    {
                    // InternalSms.g:1081:2: ( ( rule__SRootType__Group_0_2__0 ) )
                    // InternalSms.g:1082:3: ( rule__SRootType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_2()); 
                    // InternalSms.g:1083:3: ( rule__SRootType__Group_0_2__0 )
                    // InternalSms.g:1083:4: rule__SRootType__Group_0_2__0
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
                    // InternalSms.g:1087:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    {
                    // InternalSms.g:1087:2: ( ( rule__SRootType__Group_0_3__0 ) )
                    // InternalSms.g:1088:3: ( rule__SRootType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 
                    // InternalSms.g:1089:3: ( rule__SRootType__Group_0_3__0 )
                    // InternalSms.g:1089:4: rule__SRootType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_3()); 

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
    // InternalSms.g:1097:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1101:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) | ( ( rule__SDetailType__Group_0_2__0 ) ) | ( ( rule__SDetailType__Group_0_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
            case 47:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSms.g:1102:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSms.g:1102:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSms.g:1103:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSms.g:1104:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSms.g:1104:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSms.g:1108:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSms.g:1108:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSms.g:1109:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSms.g:1110:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSms.g:1110:4: rule__SDetailType__Group_0_1__0
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
                    // InternalSms.g:1114:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    {
                    // InternalSms.g:1114:2: ( ( rule__SDetailType__Group_0_2__0 ) )
                    // InternalSms.g:1115:3: ( rule__SDetailType__Group_0_2__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_2()); 
                    // InternalSms.g:1116:3: ( rule__SDetailType__Group_0_2__0 )
                    // InternalSms.g:1116:4: rule__SDetailType__Group_0_2__0
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
                    // InternalSms.g:1120:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    {
                    // InternalSms.g:1120:2: ( ( rule__SDetailType__Group_0_3__0 ) )
                    // InternalSms.g:1121:3: ( rule__SDetailType__Group_0_3__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 
                    // InternalSms.g:1122:3: ( rule__SDetailType__Group_0_3__0 )
                    // InternalSms.g:1122:4: rule__SDetailType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_3()); 

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
    // InternalSms.g:1130:1: rule__SComplexTypeFeatures__Alternatives_1 : ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) );
    public final void rule__SComplexTypeFeatures__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1134:1: ( ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) ) | ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==11||(LA11_0>=14 && LA11_0<=15)||LA11_0==24||LA11_0==35||LA11_0==37||LA11_0==39||LA11_0==48) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSms.g:1135:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    {
                    // InternalSms.g:1135:2: ( ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 ) )
                    // InternalSms.g:1136:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getFeaturesAssignment_1_0()); 
                    // InternalSms.g:1137:3: ( rule__SComplexTypeFeatures__FeaturesAssignment_1_0 )
                    // InternalSms.g:1137:4: rule__SComplexTypeFeatures__FeaturesAssignment_1_0
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
                    // InternalSms.g:1141:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    {
                    // InternalSms.g:1141:2: ( ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 ) )
                    // InternalSms.g:1142:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    {
                     before(grammarAccess.getSComplexTypeFeaturesAccess().getConstraintsAssignment_1_1()); 
                    // InternalSms.g:1143:3: ( rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 )
                    // InternalSms.g:1143:4: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1
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
    // InternalSms.g:1151:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1155:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                switch ( input.LA(2) ) {
                case 14:
                case 15:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_ID:
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
                case 42:
                    {
                    alt12=3;
                    }
                    break;
                case 14:
                case 15:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_ID:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
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
                case 14:
                case 15:
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
            case 14:
            case 15:
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

                if ( (LA12_6==40) ) {
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
                    // InternalSms.g:1156:2: ( ruleSAssociation )
                    {
                    // InternalSms.g:1156:2: ( ruleSAssociation )
                    // InternalSms.g:1157:3: ruleSAssociation
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
                    // InternalSms.g:1162:2: ( ruleSAttribute )
                    {
                    // InternalSms.g:1162:2: ( ruleSAttribute )
                    // InternalSms.g:1163:3: ruleSAttribute
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
                    // InternalSms.g:1168:2: ( ruleSQuery )
                    {
                    // InternalSms.g:1168:2: ( ruleSQuery )
                    // InternalSms.g:1169:3: ruleSQuery
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
    // InternalSms.g:1178:1: rule__SAssociation__Alternatives : ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) );
    public final void rule__SAssociation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1182:1: ( ( ( rule__SAssociation__Group_0__0 ) ) | ( ( rule__SAssociation__Group_1__0 ) ) | ( ( rule__SAssociation__Group_2__0 ) ) | ( ( rule__SAssociation__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 37:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            case 11:
            case 14:
            case 15:
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
                    // InternalSms.g:1183:2: ( ( rule__SAssociation__Group_0__0 ) )
                    {
                    // InternalSms.g:1183:2: ( ( rule__SAssociation__Group_0__0 ) )
                    // InternalSms.g:1184:3: ( rule__SAssociation__Group_0__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_0()); 
                    // InternalSms.g:1185:3: ( rule__SAssociation__Group_0__0 )
                    // InternalSms.g:1185:4: rule__SAssociation__Group_0__0
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
                    // InternalSms.g:1189:2: ( ( rule__SAssociation__Group_1__0 ) )
                    {
                    // InternalSms.g:1189:2: ( ( rule__SAssociation__Group_1__0 ) )
                    // InternalSms.g:1190:3: ( rule__SAssociation__Group_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1()); 
                    // InternalSms.g:1191:3: ( rule__SAssociation__Group_1__0 )
                    // InternalSms.g:1191:4: rule__SAssociation__Group_1__0
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
                    // InternalSms.g:1195:2: ( ( rule__SAssociation__Group_2__0 ) )
                    {
                    // InternalSms.g:1195:2: ( ( rule__SAssociation__Group_2__0 ) )
                    // InternalSms.g:1196:3: ( rule__SAssociation__Group_2__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_2()); 
                    // InternalSms.g:1197:3: ( rule__SAssociation__Group_2__0 )
                    // InternalSms.g:1197:4: rule__SAssociation__Group_2__0
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
                    // InternalSms.g:1201:2: ( ( rule__SAssociation__Group_3__0 ) )
                    {
                    // InternalSms.g:1201:2: ( ( rule__SAssociation__Group_3__0 ) )
                    // InternalSms.g:1202:3: ( rule__SAssociation__Group_3__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3()); 
                    // InternalSms.g:1203:3: ( rule__SAssociation__Group_3__0 )
                    // InternalSms.g:1203:4: rule__SAssociation__Group_3__0
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


    // $ANTLR start "rule__SAssociation__Alternatives_0_1"
    // InternalSms.g:1211:1: rule__SAssociation__Alternatives_0_1 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1215:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSms.g:1216:2: ( 'reference' )
                    {
                    // InternalSms.g:1216:2: ( 'reference' )
                    // InternalSms.g:1217:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1222:2: ( 'composite' )
                    {
                    // InternalSms.g:1222:2: ( 'composite' )
                    // InternalSms.g:1223:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_0_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_0_1_1()); 

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
    // $ANTLR end "rule__SAssociation__Alternatives_0_1"


    // $ANTLR start "rule__SAssociation__Alternatives_1_1"
    // InternalSms.g:1232:1: rule__SAssociation__Alternatives_1_1 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1236:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSms.g:1237:2: ( 'reference' )
                    {
                    // InternalSms.g:1237:2: ( 'reference' )
                    // InternalSms.g:1238:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1243:2: ( 'composite' )
                    {
                    // InternalSms.g:1243:2: ( 'composite' )
                    // InternalSms.g:1244:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1()); 

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
    // $ANTLR end "rule__SAssociation__Alternatives_1_1"


    // $ANTLR start "rule__SAssociation__Alternatives_2_1"
    // InternalSms.g:1253:1: rule__SAssociation__Alternatives_2_1 : ( ( 'reference' ) | ( 'composite' ) );
    public final void rule__SAssociation__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1257:1: ( ( 'reference' ) | ( 'composite' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSms.g:1258:2: ( 'reference' )
                    {
                    // InternalSms.g:1258:2: ( 'reference' )
                    // InternalSms.g:1259:3: 'reference'
                    {
                     before(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getReferenceKeyword_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1264:2: ( 'composite' )
                    {
                    // InternalSms.g:1264:2: ( 'composite' )
                    // InternalSms.g:1265:3: 'composite'
                    {
                     before(grammarAccess.getSAssociationAccess().getCompositeKeyword_2_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSAssociationAccess().getCompositeKeyword_2_1_1()); 

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
    // $ANTLR end "rule__SAssociation__Alternatives_2_1"


    // $ANTLR start "rule__SAssociation__Alternatives_3_1"
    // InternalSms.g:1274:1: rule__SAssociation__Alternatives_3_1 : ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1278:1: ( ( ( rule__SAssociation__KindAssignment_3_1_0 ) ) | ( ( rule__SAssociation__Group_3_1_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=14 && LA17_0<=15)) ) {
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
                    // InternalSms.g:1279:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    {
                    // InternalSms.g:1279:2: ( ( rule__SAssociation__KindAssignment_3_1_0 ) )
                    // InternalSms.g:1280:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_0()); 
                    // InternalSms.g:1281:3: ( rule__SAssociation__KindAssignment_3_1_0 )
                    // InternalSms.g:1281:4: rule__SAssociation__KindAssignment_3_1_0
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
                    // InternalSms.g:1285:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    {
                    // InternalSms.g:1285:2: ( ( rule__SAssociation__Group_3_1_1__0 ) )
                    // InternalSms.g:1286:3: ( rule__SAssociation__Group_3_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_3_1_1()); 
                    // InternalSms.g:1287:3: ( rule__SAssociation__Group_3_1_1__0 )
                    // InternalSms.g:1287:4: rule__SAssociation__Group_3_1_1__0
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
    // InternalSms.g:1295:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1299:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) | ( ( rule__SAttribute__Group_2__0 ) ) | ( ( rule__SAttribute__Group_3__0 ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 35:
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
                    // InternalSms.g:1300:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSms.g:1300:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSms.g:1301:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSms.g:1302:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSms.g:1302:4: rule__SAttribute__Group_0__0
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
                    // InternalSms.g:1306:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSms.g:1306:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSms.g:1307:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSms.g:1308:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSms.g:1308:4: rule__SAttribute__Group_1__0
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
                    // InternalSms.g:1312:2: ( ( rule__SAttribute__Group_2__0 ) )
                    {
                    // InternalSms.g:1312:2: ( ( rule__SAttribute__Group_2__0 ) )
                    // InternalSms.g:1313:3: ( rule__SAttribute__Group_2__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_2()); 
                    // InternalSms.g:1314:3: ( rule__SAttribute__Group_2__0 )
                    // InternalSms.g:1314:4: rule__SAttribute__Group_2__0
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
                    // InternalSms.g:1318:2: ( ( rule__SAttribute__Group_3__0 ) )
                    {
                    // InternalSms.g:1318:2: ( ( rule__SAttribute__Group_3__0 ) )
                    // InternalSms.g:1319:3: ( rule__SAttribute__Group_3__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_3()); 
                    // InternalSms.g:1320:3: ( rule__SAttribute__Group_3__0 )
                    // InternalSms.g:1320:4: rule__SAttribute__Group_3__0
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


    // $ANTLR start "rule__SQuery__Alternatives"
    // InternalSms.g:1328:1: rule__SQuery__Alternatives : ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) );
    public final void rule__SQuery__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1332:1: ( ( ( rule__SQuery__Group_0__0 ) ) | ( ( rule__SQuery__Group_1__0 ) ) | ( ( rule__SQuery__Group_2__0 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 24:
            case 37:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalSms.g:1333:2: ( ( rule__SQuery__Group_0__0 ) )
                    {
                    // InternalSms.g:1333:2: ( ( rule__SQuery__Group_0__0 ) )
                    // InternalSms.g:1334:3: ( rule__SQuery__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0()); 
                    // InternalSms.g:1335:3: ( rule__SQuery__Group_0__0 )
                    // InternalSms.g:1335:4: rule__SQuery__Group_0__0
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
                    // InternalSms.g:1339:2: ( ( rule__SQuery__Group_1__0 ) )
                    {
                    // InternalSms.g:1339:2: ( ( rule__SQuery__Group_1__0 ) )
                    // InternalSms.g:1340:3: ( rule__SQuery__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_1()); 
                    // InternalSms.g:1341:3: ( rule__SQuery__Group_1__0 )
                    // InternalSms.g:1341:4: rule__SQuery__Group_1__0
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
                    // InternalSms.g:1345:2: ( ( rule__SQuery__Group_2__0 ) )
                    {
                    // InternalSms.g:1345:2: ( ( rule__SQuery__Group_2__0 ) )
                    // InternalSms.g:1346:3: ( rule__SQuery__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_2()); 
                    // InternalSms.g:1347:3: ( rule__SQuery__Group_2__0 )
                    // InternalSms.g:1347:4: rule__SQuery__Group_2__0
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
    // InternalSms.g:1355:1: rule__SQuery__Alternatives_0_0 : ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) );
    public final void rule__SQuery__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1359:1: ( ( ( rule__SQuery__Group_0_0_0__0 ) ) | ( ( rule__SQuery__Group_0_0_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSms.g:1360:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    {
                    // InternalSms.g:1360:2: ( ( rule__SQuery__Group_0_0_0__0 ) )
                    // InternalSms.g:1361:3: ( rule__SQuery__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_0()); 
                    // InternalSms.g:1362:3: ( rule__SQuery__Group_0_0_0__0 )
                    // InternalSms.g:1362:4: rule__SQuery__Group_0_0_0__0
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
                    // InternalSms.g:1366:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    {
                    // InternalSms.g:1366:2: ( ( rule__SQuery__Group_0_0_1__0 ) )
                    // InternalSms.g:1367:3: ( rule__SQuery__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_0_1()); 
                    // InternalSms.g:1368:3: ( rule__SQuery__Group_0_0_1__0 )
                    // InternalSms.g:1368:4: rule__SQuery__Group_0_0_1__0
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
    // InternalSms.g:1376:1: rule__SQuery__Alternatives_0_2 : ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) );
    public final void rule__SQuery__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1380:1: ( ( '*' ) | ( ( rule__SQuery__Group_0_2_1__0 )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            else if ( (LA22_0==24||LA22_0==35||LA22_0==37||LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSms.g:1381:2: ( '*' )
                    {
                    // InternalSms.g:1381:2: ( '*' )
                    // InternalSms.g:1382:3: '*'
                    {
                     before(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSQueryAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1387:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    {
                    // InternalSms.g:1387:2: ( ( rule__SQuery__Group_0_2_1__0 )? )
                    // InternalSms.g:1388:3: ( rule__SQuery__Group_0_2_1__0 )?
                    {
                     before(grammarAccess.getSQueryAccess().getGroup_0_2_1()); 
                    // InternalSms.g:1389:3: ( rule__SQuery__Group_0_2_1__0 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24||LA21_0==35||LA21_0==37) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalSms.g:1389:4: rule__SQuery__Group_0_2_1__0
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
    // InternalSms.g:1397:1: rule__SQueryParameter__Alternatives : ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) );
    public final void rule__SQueryParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1401:1: ( ( ( rule__SQueryParameter__Group_0__0 ) ) | ( ( rule__SQueryParameter__Group_1__0 ) ) | ( ( rule__SQueryParameter__Group_2__0 ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalSms.g:1402:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    {
                    // InternalSms.g:1402:2: ( ( rule__SQueryParameter__Group_0__0 ) )
                    // InternalSms.g:1403:3: ( rule__SQueryParameter__Group_0__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_0()); 
                    // InternalSms.g:1404:3: ( rule__SQueryParameter__Group_0__0 )
                    // InternalSms.g:1404:4: rule__SQueryParameter__Group_0__0
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
                    // InternalSms.g:1408:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    {
                    // InternalSms.g:1408:2: ( ( rule__SQueryParameter__Group_1__0 ) )
                    // InternalSms.g:1409:3: ( rule__SQueryParameter__Group_1__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_1()); 
                    // InternalSms.g:1410:3: ( rule__SQueryParameter__Group_1__0 )
                    // InternalSms.g:1410:4: rule__SQueryParameter__Group_1__0
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
                    // InternalSms.g:1414:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    {
                    // InternalSms.g:1414:2: ( ( rule__SQueryParameter__Group_2__0 ) )
                    // InternalSms.g:1415:3: ( rule__SQueryParameter__Group_2__0 )
                    {
                     before(grammarAccess.getSQueryParameterAccess().getGroup_2()); 
                    // InternalSms.g:1416:3: ( rule__SQueryParameter__Group_2__0 )
                    // InternalSms.g:1416:4: rule__SQueryParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSQueryParameterAccess().getGroup_2()); 

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
    // InternalSms.g:1424:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1428:1: ( ( RULE_INT ) | ( '*' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==16) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalSms.g:1429:2: ( RULE_INT )
                    {
                    // InternalSms.g:1429:2: ( RULE_INT )
                    // InternalSms.g:1430:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1435:2: ( '*' )
                    {
                    // InternalSms.g:1435:2: ( '*' )
                    // InternalSms.g:1436:3: '*'
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


    // $ANTLR start "rule__SAssociationKind__Alternatives"
    // InternalSms.g:1445:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1449:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            else if ( (LA25_0==15) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSms.g:1450:2: ( ( 'reference' ) )
                    {
                    // InternalSms.g:1450:2: ( ( 'reference' ) )
                    // InternalSms.g:1451:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSms.g:1452:3: ( 'reference' )
                    // InternalSms.g:1452:4: 'reference'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:1456:2: ( ( 'composite' ) )
                    {
                    // InternalSms.g:1456:2: ( ( 'composite' ) )
                    // InternalSms.g:1457:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSms.g:1458:3: ( 'composite' )
                    // InternalSms.g:1458:4: 'composite'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalSms.g:1466:1: rule__SDomain__Group__0 : rule__SDomain__Group__0__Impl rule__SDomain__Group__1 ;
    public final void rule__SDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1470:1: ( rule__SDomain__Group__0__Impl rule__SDomain__Group__1 )
            // InternalSms.g:1471:2: rule__SDomain__Group__0__Impl rule__SDomain__Group__1
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
    // InternalSms.g:1478:1: rule__SDomain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__SDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1482:1: ( ( 'domain' ) )
            // InternalSms.g:1483:1: ( 'domain' )
            {
            // InternalSms.g:1483:1: ( 'domain' )
            // InternalSms.g:1484:2: 'domain'
            {
             before(grammarAccess.getSDomainAccess().getDomainKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSms.g:1493:1: rule__SDomain__Group__1 : rule__SDomain__Group__1__Impl rule__SDomain__Group__2 ;
    public final void rule__SDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1497:1: ( rule__SDomain__Group__1__Impl rule__SDomain__Group__2 )
            // InternalSms.g:1498:2: rule__SDomain__Group__1__Impl rule__SDomain__Group__2
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
    // InternalSms.g:1505:1: rule__SDomain__Group__1__Impl : ( ( rule__SDomain__NameAssignment_1 ) ) ;
    public final void rule__SDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1509:1: ( ( ( rule__SDomain__NameAssignment_1 ) ) )
            // InternalSms.g:1510:1: ( ( rule__SDomain__NameAssignment_1 ) )
            {
            // InternalSms.g:1510:1: ( ( rule__SDomain__NameAssignment_1 ) )
            // InternalSms.g:1511:2: ( rule__SDomain__NameAssignment_1 )
            {
             before(grammarAccess.getSDomainAccess().getNameAssignment_1()); 
            // InternalSms.g:1512:2: ( rule__SDomain__NameAssignment_1 )
            // InternalSms.g:1512:3: rule__SDomain__NameAssignment_1
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
    // InternalSms.g:1520:1: rule__SDomain__Group__2 : rule__SDomain__Group__2__Impl rule__SDomain__Group__3 ;
    public final void rule__SDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1524:1: ( rule__SDomain__Group__2__Impl rule__SDomain__Group__3 )
            // InternalSms.g:1525:2: rule__SDomain__Group__2__Impl rule__SDomain__Group__3
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
    // InternalSms.g:1532:1: rule__SDomain__Group__2__Impl : ( ( rule__SDomain__ImportsAssignment_2 )* ) ;
    public final void rule__SDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1536:1: ( ( ( rule__SDomain__ImportsAssignment_2 )* ) )
            // InternalSms.g:1537:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            {
            // InternalSms.g:1537:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            // InternalSms.g:1538:2: ( rule__SDomain__ImportsAssignment_2 )*
            {
             before(grammarAccess.getSDomainAccess().getImportsAssignment_2()); 
            // InternalSms.g:1539:2: ( rule__SDomain__ImportsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSms.g:1539:3: rule__SDomain__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SDomain__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSms.g:1547:1: rule__SDomain__Group__3 : rule__SDomain__Group__3__Impl ;
    public final void rule__SDomain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1551:1: ( rule__SDomain__Group__3__Impl )
            // InternalSms.g:1552:2: rule__SDomain__Group__3__Impl
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
    // InternalSms.g:1558:1: rule__SDomain__Group__3__Impl : ( ( rule__SDomain__Alternatives_3 )* ) ;
    public final void rule__SDomain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1562:1: ( ( ( rule__SDomain__Alternatives_3 )* ) )
            // InternalSms.g:1563:1: ( ( rule__SDomain__Alternatives_3 )* )
            {
            // InternalSms.g:1563:1: ( ( rule__SDomain__Alternatives_3 )* )
            // InternalSms.g:1564:2: ( rule__SDomain__Alternatives_3 )*
            {
             before(grammarAccess.getSDomainAccess().getAlternatives_3()); 
            // InternalSms.g:1565:2: ( rule__SDomain__Alternatives_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=24 && LA27_0<=25)||LA27_0==30||(LA27_0>=32 && LA27_0<=33)||(LA27_0>=36 && LA27_0<=39)||LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSms.g:1565:3: rule__SDomain__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SDomain__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalSms.g:1574:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1578:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSms.g:1579:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
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
    // InternalSms.g:1586:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1590:1: ( ( 'import' ) )
            // InternalSms.g:1591:1: ( 'import' )
            {
            // InternalSms.g:1591:1: ( 'import' )
            // InternalSms.g:1592:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSms.g:1601:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1605:1: ( rule__SImport__Group__1__Impl )
            // InternalSms.g:1606:2: rule__SImport__Group__1__Impl
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
    // InternalSms.g:1612:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1616:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSms.g:1617:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSms.g:1617:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSms.g:1618:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSms.g:1619:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSms.g:1619:3: rule__SImport__ImportedNamespaceAssignment_1
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
    // InternalSms.g:1628:1: rule__SGrabEnumerationRule__Group__0 : rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 ;
    public final void rule__SGrabEnumerationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1632:1: ( rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1 )
            // InternalSms.g:1633:2: rule__SGrabEnumerationRule__Group__0__Impl rule__SGrabEnumerationRule__Group__1
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
    // InternalSms.g:1640:1: rule__SGrabEnumerationRule__Group__0__Impl : ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1644:1: ( ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) ) )
            // InternalSms.g:1645:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:1645:1: ( ( rule__SGrabEnumerationRule__SourceAssignment_0 ) )
            // InternalSms.g:1646:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:1647:2: ( rule__SGrabEnumerationRule__SourceAssignment_0 )
            // InternalSms.g:1647:3: rule__SGrabEnumerationRule__SourceAssignment_0
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
    // InternalSms.g:1655:1: rule__SGrabEnumerationRule__Group__1 : rule__SGrabEnumerationRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1659:1: ( rule__SGrabEnumerationRule__Group__1__Impl )
            // InternalSms.g:1660:2: rule__SGrabEnumerationRule__Group__1__Impl
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
    // InternalSms.g:1666:1: rule__SGrabEnumerationRule__Group__1__Impl : ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1670:1: ( ( ( rule__SGrabEnumerationRule__Group_1__0 )? ) )
            // InternalSms.g:1671:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            {
            // InternalSms.g:1671:1: ( ( rule__SGrabEnumerationRule__Group_1__0 )? )
            // InternalSms.g:1672:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getGroup_1()); 
            // InternalSms.g:1673:2: ( rule__SGrabEnumerationRule__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSms.g:1673:3: rule__SGrabEnumerationRule__Group_1__0
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
    // InternalSms.g:1682:1: rule__SGrabEnumerationRule__Group_1__0 : rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 ;
    public final void rule__SGrabEnumerationRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1686:1: ( rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1 )
            // InternalSms.g:1687:2: rule__SGrabEnumerationRule__Group_1__0__Impl rule__SGrabEnumerationRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:1694:1: rule__SGrabEnumerationRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1698:1: ( ( 'name' ) )
            // InternalSms.g:1699:1: ( 'name' )
            {
            // InternalSms.g:1699:1: ( 'name' )
            // InternalSms.g:1700:2: 'name'
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:1709:1: rule__SGrabEnumerationRule__Group_1__1 : rule__SGrabEnumerationRule__Group_1__1__Impl rule__SGrabEnumerationRule__Group_1__2 ;
    public final void rule__SGrabEnumerationRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1713:1: ( rule__SGrabEnumerationRule__Group_1__1__Impl rule__SGrabEnumerationRule__Group_1__2 )
            // InternalSms.g:1714:2: rule__SGrabEnumerationRule__Group_1__1__Impl rule__SGrabEnumerationRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SGrabEnumerationRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:1721:1: rule__SGrabEnumerationRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SGrabEnumerationRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1725:1: ( ( '=' ) )
            // InternalSms.g:1726:1: ( '=' )
            {
            // InternalSms.g:1726:1: ( '=' )
            // InternalSms.g:1727:2: '='
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__2"
    // InternalSms.g:1736:1: rule__SGrabEnumerationRule__Group_1__2 : rule__SGrabEnumerationRule__Group_1__2__Impl ;
    public final void rule__SGrabEnumerationRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1740:1: ( rule__SGrabEnumerationRule__Group_1__2__Impl )
            // InternalSms.g:1741:2: rule__SGrabEnumerationRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__2"


    // $ANTLR start "rule__SGrabEnumerationRule__Group_1__2__Impl"
    // InternalSms.g:1747:1: rule__SGrabEnumerationRule__Group_1__2__Impl : ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SGrabEnumerationRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1751:1: ( ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:1752:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:1752:1: ( ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:1753:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:1754:2: ( rule__SGrabEnumerationRule__RenameToAssignment_1_2 )
            // InternalSms.g:1754:3: rule__SGrabEnumerationRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__Group_1__2__Impl"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group__0"
    // InternalSms.g:1763:1: rule__SGrabEnumerationLiteralRule__Group__0 : rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1767:1: ( rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1 )
            // InternalSms.g:1768:2: rule__SGrabEnumerationLiteralRule__Group__0__Impl rule__SGrabEnumerationLiteralRule__Group__1
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
    // InternalSms.g:1775:1: rule__SGrabEnumerationLiteralRule__Group__0__Impl : ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1779:1: ( ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) ) )
            // InternalSms.g:1780:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:1780:1: ( ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 ) )
            // InternalSms.g:1781:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:1782:2: ( rule__SGrabEnumerationLiteralRule__SourceAssignment_0 )
            // InternalSms.g:1782:3: rule__SGrabEnumerationLiteralRule__SourceAssignment_0
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
    // InternalSms.g:1790:1: rule__SGrabEnumerationLiteralRule__Group__1 : rule__SGrabEnumerationLiteralRule__Group__1__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1794:1: ( rule__SGrabEnumerationLiteralRule__Group__1__Impl )
            // InternalSms.g:1795:2: rule__SGrabEnumerationLiteralRule__Group__1__Impl
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
    // InternalSms.g:1801:1: rule__SGrabEnumerationLiteralRule__Group__1__Impl : ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1805:1: ( ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? ) )
            // InternalSms.g:1806:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            {
            // InternalSms.g:1806:1: ( ( rule__SGrabEnumerationLiteralRule__Group_1__0 )? )
            // InternalSms.g:1807:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getGroup_1()); 
            // InternalSms.g:1808:2: ( rule__SGrabEnumerationLiteralRule__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSms.g:1808:3: rule__SGrabEnumerationLiteralRule__Group_1__0
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
    // InternalSms.g:1817:1: rule__SGrabEnumerationLiteralRule__Group_1__0 : rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1821:1: ( rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1 )
            // InternalSms.g:1822:2: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl rule__SGrabEnumerationLiteralRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:1829:1: rule__SGrabEnumerationLiteralRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1833:1: ( ( 'name' ) )
            // InternalSms.g:1834:1: ( 'name' )
            {
            // InternalSms.g:1834:1: ( 'name' )
            // InternalSms.g:1835:2: 'name'
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:1844:1: rule__SGrabEnumerationLiteralRule__Group_1__1 : rule__SGrabEnumerationLiteralRule__Group_1__1__Impl rule__SGrabEnumerationLiteralRule__Group_1__2 ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1848:1: ( rule__SGrabEnumerationLiteralRule__Group_1__1__Impl rule__SGrabEnumerationLiteralRule__Group_1__2 )
            // InternalSms.g:1849:2: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl rule__SGrabEnumerationLiteralRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SGrabEnumerationLiteralRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:1856:1: rule__SGrabEnumerationLiteralRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1860:1: ( ( '=' ) )
            // InternalSms.g:1861:1: ( '=' )
            {
            // InternalSms.g:1861:1: ( '=' )
            // InternalSms.g:1862:2: '='
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__2"
    // InternalSms.g:1871:1: rule__SGrabEnumerationLiteralRule__Group_1__2 : rule__SGrabEnumerationLiteralRule__Group_1__2__Impl ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1875:1: ( rule__SGrabEnumerationLiteralRule__Group_1__2__Impl )
            // InternalSms.g:1876:2: rule__SGrabEnumerationLiteralRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__2"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__Group_1__2__Impl"
    // InternalSms.g:1882:1: rule__SGrabEnumerationLiteralRule__Group_1__2__Impl : ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1886:1: ( ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:1887:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:1887:1: ( ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:1888:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:1889:2: ( rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 )
            // InternalSms.g:1889:3: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__Group_1__2__Impl"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group__0"
    // InternalSms.g:1898:1: rule__SGrabComplexTypeRule__Group__0 : rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 ;
    public final void rule__SGrabComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1902:1: ( rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1 )
            // InternalSms.g:1903:2: rule__SGrabComplexTypeRule__Group__0__Impl rule__SGrabComplexTypeRule__Group__1
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
    // InternalSms.g:1910:1: rule__SGrabComplexTypeRule__Group__0__Impl : ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1914:1: ( ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSms.g:1915:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:1915:1: ( ( rule__SGrabComplexTypeRule__SourceAssignment_0 ) )
            // InternalSms.g:1916:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:1917:2: ( rule__SGrabComplexTypeRule__SourceAssignment_0 )
            // InternalSms.g:1917:3: rule__SGrabComplexTypeRule__SourceAssignment_0
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
    // InternalSms.g:1925:1: rule__SGrabComplexTypeRule__Group__1 : rule__SGrabComplexTypeRule__Group__1__Impl ;
    public final void rule__SGrabComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1929:1: ( rule__SGrabComplexTypeRule__Group__1__Impl )
            // InternalSms.g:1930:2: rule__SGrabComplexTypeRule__Group__1__Impl
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
    // InternalSms.g:1936:1: rule__SGrabComplexTypeRule__Group__1__Impl : ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SGrabComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1940:1: ( ( ( rule__SGrabComplexTypeRule__Group_1__0 )? ) )
            // InternalSms.g:1941:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            {
            // InternalSms.g:1941:1: ( ( rule__SGrabComplexTypeRule__Group_1__0 )? )
            // InternalSms.g:1942:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getGroup_1()); 
            // InternalSms.g:1943:2: ( rule__SGrabComplexTypeRule__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSms.g:1943:3: rule__SGrabComplexTypeRule__Group_1__0
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
    // InternalSms.g:1952:1: rule__SGrabComplexTypeRule__Group_1__0 : rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 ;
    public final void rule__SGrabComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1956:1: ( rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1 )
            // InternalSms.g:1957:2: rule__SGrabComplexTypeRule__Group_1__0__Impl rule__SGrabComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:1964:1: rule__SGrabComplexTypeRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1968:1: ( ( 'name' ) )
            // InternalSms.g:1969:1: ( 'name' )
            {
            // InternalSms.g:1969:1: ( 'name' )
            // InternalSms.g:1970:2: 'name'
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSGrabComplexTypeRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:1979:1: rule__SGrabComplexTypeRule__Group_1__1 : rule__SGrabComplexTypeRule__Group_1__1__Impl rule__SGrabComplexTypeRule__Group_1__2 ;
    public final void rule__SGrabComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1983:1: ( rule__SGrabComplexTypeRule__Group_1__1__Impl rule__SGrabComplexTypeRule__Group_1__2 )
            // InternalSms.g:1984:2: rule__SGrabComplexTypeRule__Group_1__1__Impl rule__SGrabComplexTypeRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SGrabComplexTypeRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:1991:1: rule__SGrabComplexTypeRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1995:1: ( ( '=' ) )
            // InternalSms.g:1996:1: ( '=' )
            {
            // InternalSms.g:1996:1: ( '=' )
            // InternalSms.g:1997:2: '='
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSGrabComplexTypeRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__2"
    // InternalSms.g:2006:1: rule__SGrabComplexTypeRule__Group_1__2 : rule__SGrabComplexTypeRule__Group_1__2__Impl ;
    public final void rule__SGrabComplexTypeRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2010:1: ( rule__SGrabComplexTypeRule__Group_1__2__Impl )
            // InternalSms.g:2011:2: rule__SGrabComplexTypeRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__2"


    // $ANTLR start "rule__SGrabComplexTypeRule__Group_1__2__Impl"
    // InternalSms.g:2017:1: rule__SGrabComplexTypeRule__Group_1__2__Impl : ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SGrabComplexTypeRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2021:1: ( ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:2022:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:2022:1: ( ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:2023:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:2024:2: ( rule__SGrabComplexTypeRule__RenameToAssignment_1_2 )
            // InternalSms.g:2024:3: rule__SGrabComplexTypeRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SGrabComplexTypeRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__Group_1__2__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group__0"
    // InternalSms.g:2033:1: rule__SMorphComplexTypeRule__Group__0 : rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 ;
    public final void rule__SMorphComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2037:1: ( rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1 )
            // InternalSms.g:2038:2: rule__SMorphComplexTypeRule__Group__0__Impl rule__SMorphComplexTypeRule__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSms.g:2045:1: rule__SMorphComplexTypeRule__Group__0__Impl : ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2049:1: ( ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSms.g:2050:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:2050:1: ( ( rule__SMorphComplexTypeRule__SourceAssignment_0 ) )
            // InternalSms.g:2051:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:2052:2: ( rule__SMorphComplexTypeRule__SourceAssignment_0 )
            // InternalSms.g:2052:3: rule__SMorphComplexTypeRule__SourceAssignment_0
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
    // InternalSms.g:2060:1: rule__SMorphComplexTypeRule__Group__1 : rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 ;
    public final void rule__SMorphComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2064:1: ( rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2 )
            // InternalSms.g:2065:2: rule__SMorphComplexTypeRule__Group__1__Impl rule__SMorphComplexTypeRule__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSms.g:2072:1: rule__SMorphComplexTypeRule__Group__1__Impl : ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2076:1: ( ( ( rule__SMorphComplexTypeRule__Group_1__0 )? ) )
            // InternalSms.g:2077:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            {
            // InternalSms.g:2077:1: ( ( rule__SMorphComplexTypeRule__Group_1__0 )? )
            // InternalSms.g:2078:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_1()); 
            // InternalSms.g:2079:2: ( rule__SMorphComplexTypeRule__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSms.g:2079:3: rule__SMorphComplexTypeRule__Group_1__0
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
    // InternalSms.g:2087:1: rule__SMorphComplexTypeRule__Group__2 : rule__SMorphComplexTypeRule__Group__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2091:1: ( rule__SMorphComplexTypeRule__Group__2__Impl )
            // InternalSms.g:2092:2: rule__SMorphComplexTypeRule__Group__2__Impl
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
    // InternalSms.g:2098:1: rule__SMorphComplexTypeRule__Group__2__Impl : ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) ;
    public final void rule__SMorphComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2102:1: ( ( ( rule__SMorphComplexTypeRule__Group_2__0 )? ) )
            // InternalSms.g:2103:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            {
            // InternalSms.g:2103:1: ( ( rule__SMorphComplexTypeRule__Group_2__0 )? )
            // InternalSms.g:2104:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getGroup_2()); 
            // InternalSms.g:2105:2: ( rule__SMorphComplexTypeRule__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSms.g:2105:3: rule__SMorphComplexTypeRule__Group_2__0
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
    // InternalSms.g:2114:1: rule__SMorphComplexTypeRule__Group_1__0 : rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 ;
    public final void rule__SMorphComplexTypeRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2118:1: ( rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1 )
            // InternalSms.g:2119:2: rule__SMorphComplexTypeRule__Group_1__0__Impl rule__SMorphComplexTypeRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2126:1: rule__SMorphComplexTypeRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2130:1: ( ( 'name' ) )
            // InternalSms.g:2131:1: ( 'name' )
            {
            // InternalSms.g:2131:1: ( 'name' )
            // InternalSms.g:2132:2: 'name'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:2141:1: rule__SMorphComplexTypeRule__Group_1__1 : rule__SMorphComplexTypeRule__Group_1__1__Impl rule__SMorphComplexTypeRule__Group_1__2 ;
    public final void rule__SMorphComplexTypeRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2145:1: ( rule__SMorphComplexTypeRule__Group_1__1__Impl rule__SMorphComplexTypeRule__Group_1__2 )
            // InternalSms.g:2146:2: rule__SMorphComplexTypeRule__Group_1__1__Impl rule__SMorphComplexTypeRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SMorphComplexTypeRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2153:1: rule__SMorphComplexTypeRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2157:1: ( ( '=' ) )
            // InternalSms.g:2158:1: ( '=' )
            {
            // InternalSms.g:2158:1: ( '=' )
            // InternalSms.g:2159:2: '='
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__2"
    // InternalSms.g:2168:1: rule__SMorphComplexTypeRule__Group_1__2 : rule__SMorphComplexTypeRule__Group_1__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2172:1: ( rule__SMorphComplexTypeRule__Group_1__2__Impl )
            // InternalSms.g:2173:2: rule__SMorphComplexTypeRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__2"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_1__2__Impl"
    // InternalSms.g:2179:1: rule__SMorphComplexTypeRule__Group_1__2__Impl : ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2183:1: ( ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:2184:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:2184:1: ( ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:2185:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:2186:2: ( rule__SMorphComplexTypeRule__RenameToAssignment_1_2 )
            // InternalSms.g:2186:3: rule__SMorphComplexTypeRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphComplexTypeRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__Group_1__2__Impl"


    // $ANTLR start "rule__SMorphComplexTypeRule__Group_2__0"
    // InternalSms.g:2195:1: rule__SMorphComplexTypeRule__Group_2__0 : rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 ;
    public final void rule__SMorphComplexTypeRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2199:1: ( rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1 )
            // InternalSms.g:2200:2: rule__SMorphComplexTypeRule__Group_2__0__Impl rule__SMorphComplexTypeRule__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2207:1: rule__SMorphComplexTypeRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2211:1: ( ( 'extends' ) )
            // InternalSms.g:2212:1: ( 'extends' )
            {
            // InternalSms.g:2212:1: ( 'extends' )
            // InternalSms.g:2213:2: 'extends'
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSms.g:2222:1: rule__SMorphComplexTypeRule__Group_2__1 : rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 ;
    public final void rule__SMorphComplexTypeRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2226:1: ( rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2 )
            // InternalSms.g:2227:2: rule__SMorphComplexTypeRule__Group_2__1__Impl rule__SMorphComplexTypeRule__Group_2__2
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
    // InternalSms.g:2234:1: rule__SMorphComplexTypeRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2238:1: ( ( '=' ) )
            // InternalSms.g:2239:1: ( '=' )
            {
            // InternalSms.g:2239:1: ( '=' )
            // InternalSms.g:2240:2: '='
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getEqualsSignKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSms.g:2249:1: rule__SMorphComplexTypeRule__Group_2__2 : rule__SMorphComplexTypeRule__Group_2__2__Impl ;
    public final void rule__SMorphComplexTypeRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2253:1: ( rule__SMorphComplexTypeRule__Group_2__2__Impl )
            // InternalSms.g:2254:2: rule__SMorphComplexTypeRule__Group_2__2__Impl
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
    // InternalSms.g:2260:1: rule__SMorphComplexTypeRule__Group_2__2__Impl : ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphComplexTypeRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2264:1: ( ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) ) )
            // InternalSms.g:2265:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSms.g:2265:1: ( ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 ) )
            // InternalSms.g:2266:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSms.g:2267:2: ( rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 )
            // InternalSms.g:2267:3: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2
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
    // InternalSms.g:2276:1: rule__SFuseComplexTypeRule__Group__0 : rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 ;
    public final void rule__SFuseComplexTypeRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2280:1: ( rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1 )
            // InternalSms.g:2281:2: rule__SFuseComplexTypeRule__Group__0__Impl rule__SFuseComplexTypeRule__Group__1
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
    // InternalSms.g:2288:1: rule__SFuseComplexTypeRule__Group__0__Impl : ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2292:1: ( ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) ) )
            // InternalSms.g:2293:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:2293:1: ( ( rule__SFuseComplexTypeRule__SourceAssignment_0 ) )
            // InternalSms.g:2294:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:2295:2: ( rule__SFuseComplexTypeRule__SourceAssignment_0 )
            // InternalSms.g:2295:3: rule__SFuseComplexTypeRule__SourceAssignment_0
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
    // InternalSms.g:2303:1: rule__SFuseComplexTypeRule__Group__1 : rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 ;
    public final void rule__SFuseComplexTypeRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2307:1: ( rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2 )
            // InternalSms.g:2308:2: rule__SFuseComplexTypeRule__Group__1__Impl rule__SFuseComplexTypeRule__Group__2
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
    // InternalSms.g:2315:1: rule__SFuseComplexTypeRule__Group__1__Impl : ( 'and' ) ;
    public final void rule__SFuseComplexTypeRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2319:1: ( ( 'and' ) )
            // InternalSms.g:2320:1: ( 'and' )
            {
            // InternalSms.g:2320:1: ( 'and' )
            // InternalSms.g:2321:2: 'and'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getAndKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSms.g:2330:1: rule__SFuseComplexTypeRule__Group__2 : rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 ;
    public final void rule__SFuseComplexTypeRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2334:1: ( rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3 )
            // InternalSms.g:2335:2: rule__SFuseComplexTypeRule__Group__2__Impl rule__SFuseComplexTypeRule__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSms.g:2342:1: rule__SFuseComplexTypeRule__Group__2__Impl : ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2346:1: ( ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) ) )
            // InternalSms.g:2347:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            {
            // InternalSms.g:2347:1: ( ( rule__SFuseComplexTypeRule__Source2Assignment_2 ) )
            // InternalSms.g:2348:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2Assignment_2()); 
            // InternalSms.g:2349:2: ( rule__SFuseComplexTypeRule__Source2Assignment_2 )
            // InternalSms.g:2349:3: rule__SFuseComplexTypeRule__Source2Assignment_2
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
    // InternalSms.g:2357:1: rule__SFuseComplexTypeRule__Group__3 : rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 ;
    public final void rule__SFuseComplexTypeRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2361:1: ( rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4 )
            // InternalSms.g:2362:2: rule__SFuseComplexTypeRule__Group__3__Impl rule__SFuseComplexTypeRule__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSms.g:2369:1: rule__SFuseComplexTypeRule__Group__3__Impl : ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2373:1: ( ( ( rule__SFuseComplexTypeRule__Group_3__0 )? ) )
            // InternalSms.g:2374:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            {
            // InternalSms.g:2374:1: ( ( rule__SFuseComplexTypeRule__Group_3__0 )? )
            // InternalSms.g:2375:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_3()); 
            // InternalSms.g:2376:2: ( rule__SFuseComplexTypeRule__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==19) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSms.g:2376:3: rule__SFuseComplexTypeRule__Group_3__0
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
    // InternalSms.g:2384:1: rule__SFuseComplexTypeRule__Group__4 : rule__SFuseComplexTypeRule__Group__4__Impl ;
    public final void rule__SFuseComplexTypeRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2388:1: ( rule__SFuseComplexTypeRule__Group__4__Impl )
            // InternalSms.g:2389:2: rule__SFuseComplexTypeRule__Group__4__Impl
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
    // InternalSms.g:2395:1: rule__SFuseComplexTypeRule__Group__4__Impl : ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) ;
    public final void rule__SFuseComplexTypeRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2399:1: ( ( ( rule__SFuseComplexTypeRule__Group_4__0 )? ) )
            // InternalSms.g:2400:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            {
            // InternalSms.g:2400:1: ( ( rule__SFuseComplexTypeRule__Group_4__0 )? )
            // InternalSms.g:2401:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getGroup_4()); 
            // InternalSms.g:2402:2: ( rule__SFuseComplexTypeRule__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSms.g:2402:3: rule__SFuseComplexTypeRule__Group_4__0
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
    // InternalSms.g:2411:1: rule__SFuseComplexTypeRule__Group_3__0 : rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 ;
    public final void rule__SFuseComplexTypeRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2415:1: ( rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1 )
            // InternalSms.g:2416:2: rule__SFuseComplexTypeRule__Group_3__0__Impl rule__SFuseComplexTypeRule__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2423:1: rule__SFuseComplexTypeRule__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2427:1: ( ( 'name' ) )
            // InternalSms.g:2428:1: ( 'name' )
            {
            // InternalSms.g:2428:1: ( 'name' )
            // InternalSms.g:2429:2: 'name'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getNameKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getNameKeyword_3_0()); 

            }


            }

        }
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
    // InternalSms.g:2438:1: rule__SFuseComplexTypeRule__Group_3__1 : rule__SFuseComplexTypeRule__Group_3__1__Impl rule__SFuseComplexTypeRule__Group_3__2 ;
    public final void rule__SFuseComplexTypeRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2442:1: ( rule__SFuseComplexTypeRule__Group_3__1__Impl rule__SFuseComplexTypeRule__Group_3__2 )
            // InternalSms.g:2443:2: rule__SFuseComplexTypeRule__Group_3__1__Impl rule__SFuseComplexTypeRule__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__SFuseComplexTypeRule__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2450:1: rule__SFuseComplexTypeRule__Group_3__1__Impl : ( '=' ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2454:1: ( ( '=' ) )
            // InternalSms.g:2455:1: ( '=' )
            {
            // InternalSms.g:2455:1: ( '=' )
            // InternalSms.g:2456:2: '='
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__2"
    // InternalSms.g:2465:1: rule__SFuseComplexTypeRule__Group_3__2 : rule__SFuseComplexTypeRule__Group_3__2__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2469:1: ( rule__SFuseComplexTypeRule__Group_3__2__Impl )
            // InternalSms.g:2470:2: rule__SFuseComplexTypeRule__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__2"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_3__2__Impl"
    // InternalSms.g:2476:1: rule__SFuseComplexTypeRule__Group_3__2__Impl : ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2480:1: ( ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 ) ) )
            // InternalSms.g:2481:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 ) )
            {
            // InternalSms.g:2481:1: ( ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 ) )
            // InternalSms.g:2482:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_2()); 
            // InternalSms.g:2483:2: ( rule__SFuseComplexTypeRule__RenameToAssignment_3_2 )
            // InternalSms.g:2483:3: rule__SFuseComplexTypeRule__RenameToAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__RenameToAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_3__2__Impl"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__0"
    // InternalSms.g:2492:1: rule__SFuseComplexTypeRule__Group_4__0 : rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 ;
    public final void rule__SFuseComplexTypeRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2496:1: ( rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1 )
            // InternalSms.g:2497:2: rule__SFuseComplexTypeRule__Group_4__0__Impl rule__SFuseComplexTypeRule__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2504:1: rule__SFuseComplexTypeRule__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2508:1: ( ( 'extends' ) )
            // InternalSms.g:2509:1: ( 'extends' )
            {
            // InternalSms.g:2509:1: ( 'extends' )
            // InternalSms.g:2510:2: 'extends'
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendsKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSms.g:2519:1: rule__SFuseComplexTypeRule__Group_4__1 : rule__SFuseComplexTypeRule__Group_4__1__Impl rule__SFuseComplexTypeRule__Group_4__2 ;
    public final void rule__SFuseComplexTypeRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2523:1: ( rule__SFuseComplexTypeRule__Group_4__1__Impl rule__SFuseComplexTypeRule__Group_4__2 )
            // InternalSms.g:2524:2: rule__SFuseComplexTypeRule__Group_4__1__Impl rule__SFuseComplexTypeRule__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SFuseComplexTypeRule__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2531:1: rule__SFuseComplexTypeRule__Group_4__1__Impl : ( '=' ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2535:1: ( ( '=' ) )
            // InternalSms.g:2536:1: ( '=' )
            {
            // InternalSms.g:2536:1: ( '=' )
            // InternalSms.g:2537:2: '='
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__2"
    // InternalSms.g:2546:1: rule__SFuseComplexTypeRule__Group_4__2 : rule__SFuseComplexTypeRule__Group_4__2__Impl ;
    public final void rule__SFuseComplexTypeRule__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2550:1: ( rule__SFuseComplexTypeRule__Group_4__2__Impl )
            // InternalSms.g:2551:2: rule__SFuseComplexTypeRule__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__2"


    // $ANTLR start "rule__SFuseComplexTypeRule__Group_4__2__Impl"
    // InternalSms.g:2557:1: rule__SFuseComplexTypeRule__Group_4__2__Impl : ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 ) ) ;
    public final void rule__SFuseComplexTypeRule__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2561:1: ( ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 ) ) )
            // InternalSms.g:2562:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 ) )
            {
            // InternalSms.g:2562:1: ( ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 ) )
            // InternalSms.g:2563:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_2()); 
            // InternalSms.g:2564:2: ( rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 )
            // InternalSms.g:2564:3: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__Group_4__2__Impl"


    // $ANTLR start "rule__SGrabFeatureRule__Group__0"
    // InternalSms.g:2573:1: rule__SGrabFeatureRule__Group__0 : rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 ;
    public final void rule__SGrabFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2577:1: ( rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1 )
            // InternalSms.g:2578:2: rule__SGrabFeatureRule__Group__0__Impl rule__SGrabFeatureRule__Group__1
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
    // InternalSms.g:2585:1: rule__SGrabFeatureRule__Group__0__Impl : ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SGrabFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2589:1: ( ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) ) )
            // InternalSms.g:2590:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:2590:1: ( ( rule__SGrabFeatureRule__SourceAssignment_0 ) )
            // InternalSms.g:2591:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:2592:2: ( rule__SGrabFeatureRule__SourceAssignment_0 )
            // InternalSms.g:2592:3: rule__SGrabFeatureRule__SourceAssignment_0
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
    // InternalSms.g:2600:1: rule__SGrabFeatureRule__Group__1 : rule__SGrabFeatureRule__Group__1__Impl ;
    public final void rule__SGrabFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2604:1: ( rule__SGrabFeatureRule__Group__1__Impl )
            // InternalSms.g:2605:2: rule__SGrabFeatureRule__Group__1__Impl
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
    // InternalSms.g:2611:1: rule__SGrabFeatureRule__Group__1__Impl : ( ( rule__SGrabFeatureRule__Group_1__0 )? ) ;
    public final void rule__SGrabFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2615:1: ( ( ( rule__SGrabFeatureRule__Group_1__0 )? ) )
            // InternalSms.g:2616:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            {
            // InternalSms.g:2616:1: ( ( rule__SGrabFeatureRule__Group_1__0 )? )
            // InternalSms.g:2617:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getGroup_1()); 
            // InternalSms.g:2618:2: ( rule__SGrabFeatureRule__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==19) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSms.g:2618:3: rule__SGrabFeatureRule__Group_1__0
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
    // InternalSms.g:2627:1: rule__SGrabFeatureRule__Group_1__0 : rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 ;
    public final void rule__SGrabFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2631:1: ( rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1 )
            // InternalSms.g:2632:2: rule__SGrabFeatureRule__Group_1__0__Impl rule__SGrabFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2639:1: rule__SGrabFeatureRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SGrabFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2643:1: ( ( 'name' ) )
            // InternalSms.g:2644:1: ( 'name' )
            {
            // InternalSms.g:2644:1: ( 'name' )
            // InternalSms.g:2645:2: 'name'
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:2654:1: rule__SGrabFeatureRule__Group_1__1 : rule__SGrabFeatureRule__Group_1__1__Impl rule__SGrabFeatureRule__Group_1__2 ;
    public final void rule__SGrabFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2658:1: ( rule__SGrabFeatureRule__Group_1__1__Impl rule__SGrabFeatureRule__Group_1__2 )
            // InternalSms.g:2659:2: rule__SGrabFeatureRule__Group_1__1__Impl rule__SGrabFeatureRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SGrabFeatureRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2666:1: rule__SGrabFeatureRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SGrabFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2670:1: ( ( '=' ) )
            // InternalSms.g:2671:1: ( '=' )
            {
            // InternalSms.g:2671:1: ( '=' )
            // InternalSms.g:2672:2: '='
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__2"
    // InternalSms.g:2681:1: rule__SGrabFeatureRule__Group_1__2 : rule__SGrabFeatureRule__Group_1__2__Impl ;
    public final void rule__SGrabFeatureRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2685:1: ( rule__SGrabFeatureRule__Group_1__2__Impl )
            // InternalSms.g:2686:2: rule__SGrabFeatureRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__2"


    // $ANTLR start "rule__SGrabFeatureRule__Group_1__2__Impl"
    // InternalSms.g:2692:1: rule__SGrabFeatureRule__Group_1__2__Impl : ( ( rule__SGrabFeatureRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SGrabFeatureRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2696:1: ( ( ( rule__SGrabFeatureRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:2697:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:2697:1: ( ( rule__SGrabFeatureRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:2698:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:2699:2: ( rule__SGrabFeatureRule__RenameToAssignment_1_2 )
            // InternalSms.g:2699:3: rule__SGrabFeatureRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SGrabFeatureRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSGrabFeatureRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__Group_1__2__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group__0"
    // InternalSms.g:2708:1: rule__SMorphFeatureRule__Group__0 : rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 ;
    public final void rule__SMorphFeatureRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2712:1: ( rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1 )
            // InternalSms.g:2713:2: rule__SMorphFeatureRule__Group__0__Impl rule__SMorphFeatureRule__Group__1
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
    // InternalSms.g:2720:1: rule__SMorphFeatureRule__Group__0__Impl : ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) ;
    public final void rule__SMorphFeatureRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2724:1: ( ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) ) )
            // InternalSms.g:2725:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:2725:1: ( ( rule__SMorphFeatureRule__SourceAssignment_0 ) )
            // InternalSms.g:2726:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:2727:2: ( rule__SMorphFeatureRule__SourceAssignment_0 )
            // InternalSms.g:2727:3: rule__SMorphFeatureRule__SourceAssignment_0
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
    // InternalSms.g:2735:1: rule__SMorphFeatureRule__Group__1 : rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 ;
    public final void rule__SMorphFeatureRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2739:1: ( rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2 )
            // InternalSms.g:2740:2: rule__SMorphFeatureRule__Group__1__Impl rule__SMorphFeatureRule__Group__2
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
    // InternalSms.g:2747:1: rule__SMorphFeatureRule__Group__1__Impl : ( ( rule__SMorphFeatureRule__Group_1__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2751:1: ( ( ( rule__SMorphFeatureRule__Group_1__0 )? ) )
            // InternalSms.g:2752:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            {
            // InternalSms.g:2752:1: ( ( rule__SMorphFeatureRule__Group_1__0 )? )
            // InternalSms.g:2753:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_1()); 
            // InternalSms.g:2754:2: ( rule__SMorphFeatureRule__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSms.g:2754:3: rule__SMorphFeatureRule__Group_1__0
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
    // InternalSms.g:2762:1: rule__SMorphFeatureRule__Group__2 : rule__SMorphFeatureRule__Group__2__Impl ;
    public final void rule__SMorphFeatureRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2766:1: ( rule__SMorphFeatureRule__Group__2__Impl )
            // InternalSms.g:2767:2: rule__SMorphFeatureRule__Group__2__Impl
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
    // InternalSms.g:2773:1: rule__SMorphFeatureRule__Group__2__Impl : ( ( rule__SMorphFeatureRule__Group_2__0 )? ) ;
    public final void rule__SMorphFeatureRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2777:1: ( ( ( rule__SMorphFeatureRule__Group_2__0 )? ) )
            // InternalSms.g:2778:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            {
            // InternalSms.g:2778:1: ( ( rule__SMorphFeatureRule__Group_2__0 )? )
            // InternalSms.g:2779:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getGroup_2()); 
            // InternalSms.g:2780:2: ( rule__SMorphFeatureRule__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSms.g:2780:3: rule__SMorphFeatureRule__Group_2__0
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
    // InternalSms.g:2789:1: rule__SMorphFeatureRule__Group_1__0 : rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 ;
    public final void rule__SMorphFeatureRule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2793:1: ( rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1 )
            // InternalSms.g:2794:2: rule__SMorphFeatureRule__Group_1__0__Impl rule__SMorphFeatureRule__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2801:1: rule__SMorphFeatureRule__Group_1__0__Impl : ( 'name' ) ;
    public final void rule__SMorphFeatureRule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2805:1: ( ( 'name' ) )
            // InternalSms.g:2806:1: ( 'name' )
            {
            // InternalSms.g:2806:1: ( 'name' )
            // InternalSms.g:2807:2: 'name'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getNameKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getNameKeyword_1_0()); 

            }


            }

        }
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
    // InternalSms.g:2816:1: rule__SMorphFeatureRule__Group_1__1 : rule__SMorphFeatureRule__Group_1__1__Impl rule__SMorphFeatureRule__Group_1__2 ;
    public final void rule__SMorphFeatureRule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2820:1: ( rule__SMorphFeatureRule__Group_1__1__Impl rule__SMorphFeatureRule__Group_1__2 )
            // InternalSms.g:2821:2: rule__SMorphFeatureRule__Group_1__1__Impl rule__SMorphFeatureRule__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__SMorphFeatureRule__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2828:1: rule__SMorphFeatureRule__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SMorphFeatureRule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2832:1: ( ( '=' ) )
            // InternalSms.g:2833:1: ( '=' )
            {
            // InternalSms.g:2833:1: ( '=' )
            // InternalSms.g:2834:2: '='
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__2"
    // InternalSms.g:2843:1: rule__SMorphFeatureRule__Group_1__2 : rule__SMorphFeatureRule__Group_1__2__Impl ;
    public final void rule__SMorphFeatureRule__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2847:1: ( rule__SMorphFeatureRule__Group_1__2__Impl )
            // InternalSms.g:2848:2: rule__SMorphFeatureRule__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__2"


    // $ANTLR start "rule__SMorphFeatureRule__Group_1__2__Impl"
    // InternalSms.g:2854:1: rule__SMorphFeatureRule__Group_1__2__Impl : ( ( rule__SMorphFeatureRule__RenameToAssignment_1_2 ) ) ;
    public final void rule__SMorphFeatureRule__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2858:1: ( ( ( rule__SMorphFeatureRule__RenameToAssignment_1_2 ) ) )
            // InternalSms.g:2859:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_2 ) )
            {
            // InternalSms.g:2859:1: ( ( rule__SMorphFeatureRule__RenameToAssignment_1_2 ) )
            // InternalSms.g:2860:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_2 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_2()); 
            // InternalSms.g:2861:2: ( rule__SMorphFeatureRule__RenameToAssignment_1_2 )
            // InternalSms.g:2861:3: rule__SMorphFeatureRule__RenameToAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RenameToAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_1__2__Impl"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__0"
    // InternalSms.g:2870:1: rule__SMorphFeatureRule__Group_2__0 : rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 ;
    public final void rule__SMorphFeatureRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2874:1: ( rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1 )
            // InternalSms.g:2875:2: rule__SMorphFeatureRule__Group_2__0__Impl rule__SMorphFeatureRule__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSms.g:2882:1: rule__SMorphFeatureRule__Group_2__0__Impl : ( 'type' ) ;
    public final void rule__SMorphFeatureRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2886:1: ( ( 'type' ) )
            // InternalSms.g:2887:1: ( 'type' )
            {
            // InternalSms.g:2887:1: ( 'type' )
            // InternalSms.g:2888:2: 'type'
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getTypeKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getTypeKeyword_2_0()); 

            }


            }

        }
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
    // InternalSms.g:2897:1: rule__SMorphFeatureRule__Group_2__1 : rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 ;
    public final void rule__SMorphFeatureRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2901:1: ( rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2 )
            // InternalSms.g:2902:2: rule__SMorphFeatureRule__Group_2__1__Impl rule__SMorphFeatureRule__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:2909:1: rule__SMorphFeatureRule__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphFeatureRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2913:1: ( ( '=' ) )
            // InternalSms.g:2914:1: ( '=' )
            {
            // InternalSms.g:2914:1: ( '=' )
            // InternalSms.g:2915:2: '='
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
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
    // InternalSms.g:2924:1: rule__SMorphFeatureRule__Group_2__2 : rule__SMorphFeatureRule__Group_2__2__Impl rule__SMorphFeatureRule__Group_2__3 ;
    public final void rule__SMorphFeatureRule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2928:1: ( rule__SMorphFeatureRule__Group_2__2__Impl rule__SMorphFeatureRule__Group_2__3 )
            // InternalSms.g:2929:2: rule__SMorphFeatureRule__Group_2__2__Impl rule__SMorphFeatureRule__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__SMorphFeatureRule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__3();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2936:1: rule__SMorphFeatureRule__Group_2__2__Impl : ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 ) ) ;
    public final void rule__SMorphFeatureRule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2940:1: ( ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 ) ) )
            // InternalSms.g:2941:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 ) )
            {
            // InternalSms.g:2941:1: ( ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 ) )
            // InternalSms.g:2942:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_2()); 
            // InternalSms.g:2943:2: ( rule__SMorphFeatureRule__RetypeToAssignment_2_2 )
            // InternalSms.g:2943:3: rule__SMorphFeatureRule__RetypeToAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__RetypeToAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToAssignment_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__3"
    // InternalSms.g:2951:1: rule__SMorphFeatureRule__Group_2__3 : rule__SMorphFeatureRule__Group_2__3__Impl ;
    public final void rule__SMorphFeatureRule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2955:1: ( rule__SMorphFeatureRule__Group_2__3__Impl )
            // InternalSms.g:2956:2: rule__SMorphFeatureRule__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphFeatureRule__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__3"


    // $ANTLR start "rule__SMorphFeatureRule__Group_2__3__Impl"
    // InternalSms.g:2962:1: rule__SMorphFeatureRule__Group_2__3__Impl : ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )? ) ;
    public final void rule__SMorphFeatureRule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2966:1: ( ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )? ) )
            // InternalSms.g:2967:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )? )
            {
            // InternalSms.g:2967:1: ( ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )? )
            // InternalSms.g:2968:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )?
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_3()); 
            // InternalSms.g:2969:2: ( rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_INT) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalSms.g:2969:3: rule__SMorphFeatureRule__RemultiplyToAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphFeatureRule__RemultiplyToAssignment_2_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__Group_2__3__Impl"


    // $ANTLR start "rule__SAggregate__Group__0"
    // InternalSms.g:2978:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2982:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSms.g:2983:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
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
    // InternalSms.g:2990:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2994:1: ( ( () ) )
            // InternalSms.g:2995:1: ( () )
            {
            // InternalSms.g:2995:1: ( () )
            // InternalSms.g:2996:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSms.g:2997:2: ()
            // InternalSms.g:2997:3: 
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
    // InternalSms.g:3005:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3009:1: ( rule__SAggregate__Group__1__Impl )
            // InternalSms.g:3010:2: rule__SAggregate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:3016:1: rule__SAggregate__Group__1__Impl : ( ( rule__SAggregate__Alternatives_1 ) ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3020:1: ( ( ( rule__SAggregate__Alternatives_1 ) ) )
            // InternalSms.g:3021:1: ( ( rule__SAggregate__Alternatives_1 ) )
            {
            // InternalSms.g:3021:1: ( ( rule__SAggregate__Alternatives_1 ) )
            // InternalSms.g:3022:2: ( rule__SAggregate__Alternatives_1 )
            {
             before(grammarAccess.getSAggregateAccess().getAlternatives_1()); 
            // InternalSms.g:3023:2: ( rule__SAggregate__Alternatives_1 )
            // InternalSms.g:3023:3: rule__SAggregate__Alternatives_1
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


    // $ANTLR start "rule__SAggregate__Group_1_0__0"
    // InternalSms.g:3032:1: rule__SAggregate__Group_1_0__0 : rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 ;
    public final void rule__SAggregate__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3036:1: ( rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1 )
            // InternalSms.g:3037:2: rule__SAggregate__Group_1_0__0__Impl rule__SAggregate__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSms.g:3044:1: rule__SAggregate__Group_1_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAggregate__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3048:1: ( ( 'grab' ) )
            // InternalSms.g:3049:1: ( 'grab' )
            {
            // InternalSms.g:3049:1: ( 'grab' )
            // InternalSms.g:3050:2: 'grab'
            {
             before(grammarAccess.getSAggregateAccess().getGrabKeyword_1_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSms.g:3059:1: rule__SAggregate__Group_1_0__1 : rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 ;
    public final void rule__SAggregate__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3063:1: ( rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2 )
            // InternalSms.g:3064:2: rule__SAggregate__Group_1_0__1__Impl rule__SAggregate__Group_1_0__2
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
    // InternalSms.g:3071:1: rule__SAggregate__Group_1_0__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3075:1: ( ( 'aggregate' ) )
            // InternalSms.g:3076:1: ( 'aggregate' )
            {
            // InternalSms.g:3076:1: ( 'aggregate' )
            // InternalSms.g:3077:2: 'aggregate'
            {
             before(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSms.g:3086:1: rule__SAggregate__Group_1_0__2 : rule__SAggregate__Group_1_0__2__Impl ;
    public final void rule__SAggregate__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3090:1: ( rule__SAggregate__Group_1_0__2__Impl )
            // InternalSms.g:3091:2: rule__SAggregate__Group_1_0__2__Impl
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
    // InternalSms.g:3097:1: rule__SAggregate__Group_1_0__2__Impl : ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) ;
    public final void rule__SAggregate__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3101:1: ( ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) ) )
            // InternalSms.g:3102:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            {
            // InternalSms.g:3102:1: ( ( rule__SAggregate__DeductionRuleAssignment_1_0_2 ) )
            // InternalSms.g:3103:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            {
             before(grammarAccess.getSAggregateAccess().getDeductionRuleAssignment_1_0_2()); 
            // InternalSms.g:3104:2: ( rule__SAggregate__DeductionRuleAssignment_1_0_2 )
            // InternalSms.g:3104:3: rule__SAggregate__DeductionRuleAssignment_1_0_2
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


    // $ANTLR start "rule__SAggregate__Group_1_1__0"
    // InternalSms.g:3113:1: rule__SAggregate__Group_1_1__0 : rule__SAggregate__Group_1_1__0__Impl rule__SAggregate__Group_1_1__1 ;
    public final void rule__SAggregate__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3117:1: ( rule__SAggregate__Group_1_1__0__Impl rule__SAggregate__Group_1_1__1 )
            // InternalSms.g:3118:2: rule__SAggregate__Group_1_1__0__Impl rule__SAggregate__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__SAggregate__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__0"


    // $ANTLR start "rule__SAggregate__Group_1_1__0__Impl"
    // InternalSms.g:3125:1: rule__SAggregate__Group_1_1__0__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3129:1: ( ( 'aggregate' ) )
            // InternalSms.g:3130:1: ( 'aggregate' )
            {
            // InternalSms.g:3130:1: ( 'aggregate' )
            // InternalSms.g:3131:2: 'aggregate'
            {
             before(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getAggregateKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__0__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_1__1"
    // InternalSms.g:3140:1: rule__SAggregate__Group_1_1__1 : rule__SAggregate__Group_1_1__1__Impl rule__SAggregate__Group_1_1__2 ;
    public final void rule__SAggregate__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3144:1: ( rule__SAggregate__Group_1_1__1__Impl rule__SAggregate__Group_1_1__2 )
            // InternalSms.g:3145:2: rule__SAggregate__Group_1_1__1__Impl rule__SAggregate__Group_1_1__2
            {
            pushFollow(FOLLOW_16);
            rule__SAggregate__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__1"


    // $ANTLR start "rule__SAggregate__Group_1_1__1__Impl"
    // InternalSms.g:3152:1: rule__SAggregate__Group_1_1__1__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3156:1: ( ( '{' ) )
            // InternalSms.g:3157:1: ( '{' )
            {
            // InternalSms.g:3157:1: ( '{' )
            // InternalSms.g:3158:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_1_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__1__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_1__2"
    // InternalSms.g:3167:1: rule__SAggregate__Group_1_1__2 : rule__SAggregate__Group_1_1__2__Impl rule__SAggregate__Group_1_1__3 ;
    public final void rule__SAggregate__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3171:1: ( rule__SAggregate__Group_1_1__2__Impl rule__SAggregate__Group_1_1__3 )
            // InternalSms.g:3172:2: rule__SAggregate__Group_1_1__2__Impl rule__SAggregate__Group_1_1__3
            {
            pushFollow(FOLLOW_16);
            rule__SAggregate__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__2"


    // $ANTLR start "rule__SAggregate__Group_1_1__2__Impl"
    // InternalSms.g:3179:1: rule__SAggregate__Group_1_1__2__Impl : ( ( rule__SAggregate__TypesAssignment_1_1_2 )* ) ;
    public final void rule__SAggregate__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3183:1: ( ( ( rule__SAggregate__TypesAssignment_1_1_2 )* ) )
            // InternalSms.g:3184:1: ( ( rule__SAggregate__TypesAssignment_1_1_2 )* )
            {
            // InternalSms.g:3184:1: ( ( rule__SAggregate__TypesAssignment_1_1_2 )* )
            // InternalSms.g:3185:2: ( rule__SAggregate__TypesAssignment_1_1_2 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_1_1_2()); 
            // InternalSms.g:3186:2: ( rule__SAggregate__TypesAssignment_1_1_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==24||LA39_0==30||(LA39_0>=32 && LA39_0<=33)||(LA39_0>=36 && LA39_0<=39)||LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSms.g:3186:3: rule__SAggregate__TypesAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SAggregate__TypesAssignment_1_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSAggregateAccess().getTypesAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__2__Impl"


    // $ANTLR start "rule__SAggregate__Group_1_1__3"
    // InternalSms.g:3194:1: rule__SAggregate__Group_1_1__3 : rule__SAggregate__Group_1_1__3__Impl ;
    public final void rule__SAggregate__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3198:1: ( rule__SAggregate__Group_1_1__3__Impl )
            // InternalSms.g:3199:2: rule__SAggregate__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAggregate__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__3"


    // $ANTLR start "rule__SAggregate__Group_1_1__3__Impl"
    // InternalSms.g:3205:1: rule__SAggregate__Group_1_1__3__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3209:1: ( ( '}' ) )
            // InternalSms.g:3210:1: ( '}' )
            {
            // InternalSms.g:3210:1: ( '}' )
            // InternalSms.g:3211:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_1_1_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__Group_1_1__3__Impl"


    // $ANTLR start "rule__SConstraint__Group__0"
    // InternalSms.g:3221:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3225:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSms.g:3226:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
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
    // InternalSms.g:3233:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3237:1: ( ( 'constraint' ) )
            // InternalSms.g:3238:1: ( 'constraint' )
            {
            // InternalSms.g:3238:1: ( 'constraint' )
            // InternalSms.g:3239:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSms.g:3248:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3252:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSms.g:3253:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
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
    // InternalSms.g:3260:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3264:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSms.g:3265:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSms.g:3265:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSms.g:3266:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSms.g:3267:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSms.g:3267:3: rule__SConstraint__NameAssignment_1
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
    // InternalSms.g:3275:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3279:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSms.g:3280:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
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
    // InternalSms.g:3287:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3291:1: ( ( ':' ) )
            // InternalSms.g:3292:1: ( ':' )
            {
            // InternalSms.g:3292:1: ( ':' )
            // InternalSms.g:3293:2: ':'
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
    // InternalSms.g:3302:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3306:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSms.g:3307:2: rule__SConstraint__Group__3__Impl
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
    // InternalSms.g:3313:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3317:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSms.g:3318:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSms.g:3318:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSms.g:3319:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSms.g:3320:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSms.g:3320:3: rule__SConstraint__ConditionAssignment_3
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
    // InternalSms.g:3329:1: rule__SPrimitive__Group__0 : rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 ;
    public final void rule__SPrimitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3333:1: ( rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1 )
            // InternalSms.g:3334:2: rule__SPrimitive__Group__0__Impl rule__SPrimitive__Group__1
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
    // InternalSms.g:3341:1: rule__SPrimitive__Group__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3345:1: ( ( 'primitive' ) )
            // InternalSms.g:3346:1: ( 'primitive' )
            {
            // InternalSms.g:3346:1: ( 'primitive' )
            // InternalSms.g:3347:2: 'primitive'
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
    // InternalSms.g:3356:1: rule__SPrimitive__Group__1 : rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 ;
    public final void rule__SPrimitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3360:1: ( rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2 )
            // InternalSms.g:3361:2: rule__SPrimitive__Group__1__Impl rule__SPrimitive__Group__2
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
    // InternalSms.g:3368:1: rule__SPrimitive__Group__1__Impl : ( ( rule__SPrimitive__NameAssignment_1 ) ) ;
    public final void rule__SPrimitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3372:1: ( ( ( rule__SPrimitive__NameAssignment_1 ) ) )
            // InternalSms.g:3373:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            {
            // InternalSms.g:3373:1: ( ( rule__SPrimitive__NameAssignment_1 ) )
            // InternalSms.g:3374:2: ( rule__SPrimitive__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_1()); 
            // InternalSms.g:3375:2: ( rule__SPrimitive__NameAssignment_1 )
            // InternalSms.g:3375:3: rule__SPrimitive__NameAssignment_1
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
    // InternalSms.g:3383:1: rule__SPrimitive__Group__2 : rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 ;
    public final void rule__SPrimitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3387:1: ( rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3 )
            // InternalSms.g:3388:2: rule__SPrimitive__Group__2__Impl rule__SPrimitive__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalSms.g:3395:1: rule__SPrimitive__Group__2__Impl : ( ( rule__SPrimitive__Alternatives_2 ) ) ;
    public final void rule__SPrimitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3399:1: ( ( ( rule__SPrimitive__Alternatives_2 ) ) )
            // InternalSms.g:3400:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            {
            // InternalSms.g:3400:1: ( ( rule__SPrimitive__Alternatives_2 ) )
            // InternalSms.g:3401:2: ( rule__SPrimitive__Alternatives_2 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2()); 
            // InternalSms.g:3402:2: ( rule__SPrimitive__Alternatives_2 )
            // InternalSms.g:3402:3: rule__SPrimitive__Alternatives_2
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
    // InternalSms.g:3410:1: rule__SPrimitive__Group__3 : rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 ;
    public final void rule__SPrimitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3414:1: ( rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4 )
            // InternalSms.g:3415:2: rule__SPrimitive__Group__3__Impl rule__SPrimitive__Group__4
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
    // InternalSms.g:3422:1: rule__SPrimitive__Group__3__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3426:1: ( ( '{' ) )
            // InternalSms.g:3427:1: ( '{' )
            {
            // InternalSms.g:3427:1: ( '{' )
            // InternalSms.g:3428:2: '{'
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
    // InternalSms.g:3437:1: rule__SPrimitive__Group__4 : rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 ;
    public final void rule__SPrimitive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3441:1: ( rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5 )
            // InternalSms.g:3442:2: rule__SPrimitive__Group__4__Impl rule__SPrimitive__Group__5
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
    // InternalSms.g:3449:1: rule__SPrimitive__Group__4__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) ;
    public final void rule__SPrimitive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3453:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_4 )* ) )
            // InternalSms.g:3454:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            {
            // InternalSms.g:3454:1: ( ( rule__SPrimitive__ConstraintsAssignment_4 )* )
            // InternalSms.g:3455:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_4()); 
            // InternalSms.g:3456:2: ( rule__SPrimitive__ConstraintsAssignment_4 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==28) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalSms.g:3456:3: rule__SPrimitive__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SPrimitive__ConstraintsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalSms.g:3464:1: rule__SPrimitive__Group__5 : rule__SPrimitive__Group__5__Impl ;
    public final void rule__SPrimitive__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3468:1: ( rule__SPrimitive__Group__5__Impl )
            // InternalSms.g:3469:2: rule__SPrimitive__Group__5__Impl
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
    // InternalSms.g:3475:1: rule__SPrimitive__Group__5__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3479:1: ( ( '}' ) )
            // InternalSms.g:3480:1: ( '}' )
            {
            // InternalSms.g:3480:1: ( '}' )
            // InternalSms.g:3481:2: '}'
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
    // InternalSms.g:3491:1: rule__SPrimitive__Group_2_0__0 : rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 ;
    public final void rule__SPrimitive__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3495:1: ( rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1 )
            // InternalSms.g:3496:2: rule__SPrimitive__Group_2_0__0__Impl rule__SPrimitive__Group_2_0__1
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
    // InternalSms.g:3503:1: rule__SPrimitive__Group_2_0__0__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3507:1: ( ( 'redefines' ) )
            // InternalSms.g:3508:1: ( 'redefines' )
            {
            // InternalSms.g:3508:1: ( 'redefines' )
            // InternalSms.g:3509:2: 'redefines'
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
    // InternalSms.g:3518:1: rule__SPrimitive__Group_2_0__1 : rule__SPrimitive__Group_2_0__1__Impl ;
    public final void rule__SPrimitive__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3522:1: ( rule__SPrimitive__Group_2_0__1__Impl )
            // InternalSms.g:3523:2: rule__SPrimitive__Group_2_0__1__Impl
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
    // InternalSms.g:3529:1: rule__SPrimitive__Group_2_0__1__Impl : ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) ;
    public final void rule__SPrimitive__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3533:1: ( ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) ) )
            // InternalSms.g:3534:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            {
            // InternalSms.g:3534:1: ( ( rule__SPrimitive__RedefinesAssignment_2_0_1 ) )
            // InternalSms.g:3535:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_2_0_1()); 
            // InternalSms.g:3536:2: ( rule__SPrimitive__RedefinesAssignment_2_0_1 )
            // InternalSms.g:3536:3: rule__SPrimitive__RedefinesAssignment_2_0_1
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
    // InternalSms.g:3545:1: rule__SPrimitive__Group_2_1__0 : rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 ;
    public final void rule__SPrimitive__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3549:1: ( rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1 )
            // InternalSms.g:3550:2: rule__SPrimitive__Group_2_1__0__Impl rule__SPrimitive__Group_2_1__1
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
    // InternalSms.g:3557:1: rule__SPrimitive__Group_2_1__0__Impl : ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) ;
    public final void rule__SPrimitive__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3561:1: ( ( ( rule__SPrimitive__Alternatives_2_1_0 ) ) )
            // InternalSms.g:3562:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            {
            // InternalSms.g:3562:1: ( ( rule__SPrimitive__Alternatives_2_1_0 ) )
            // InternalSms.g:3563:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives_2_1_0()); 
            // InternalSms.g:3564:2: ( rule__SPrimitive__Alternatives_2_1_0 )
            // InternalSms.g:3564:3: rule__SPrimitive__Alternatives_2_1_0
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
    // InternalSms.g:3572:1: rule__SPrimitive__Group_2_1__1 : rule__SPrimitive__Group_2_1__1__Impl ;
    public final void rule__SPrimitive__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3576:1: ( rule__SPrimitive__Group_2_1__1__Impl )
            // InternalSms.g:3577:2: rule__SPrimitive__Group_2_1__1__Impl
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
    // InternalSms.g:3583:1: rule__SPrimitive__Group_2_1__1__Impl : ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) ;
    public final void rule__SPrimitive__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3587:1: ( ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) ) )
            // InternalSms.g:3588:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            {
            // InternalSms.g:3588:1: ( ( rule__SPrimitive__RealizesAssignment_2_1_1 ) )
            // InternalSms.g:3589:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_2_1_1()); 
            // InternalSms.g:3590:2: ( rule__SPrimitive__RealizesAssignment_2_1_1 )
            // InternalSms.g:3590:3: rule__SPrimitive__RealizesAssignment_2_1_1
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
    // InternalSms.g:3599:1: rule__SPrimitiveArchetype__Group__0 : rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 ;
    public final void rule__SPrimitiveArchetype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3603:1: ( rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1 )
            // InternalSms.g:3604:2: rule__SPrimitiveArchetype__Group__0__Impl rule__SPrimitiveArchetype__Group__1
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
    // InternalSms.g:3611:1: rule__SPrimitiveArchetype__Group__0__Impl : ( 'archetype' ) ;
    public final void rule__SPrimitiveArchetype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3615:1: ( ( 'archetype' ) )
            // InternalSms.g:3616:1: ( 'archetype' )
            {
            // InternalSms.g:3616:1: ( 'archetype' )
            // InternalSms.g:3617:2: 'archetype'
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
    // InternalSms.g:3626:1: rule__SPrimitiveArchetype__Group__1 : rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 ;
    public final void rule__SPrimitiveArchetype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3630:1: ( rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2 )
            // InternalSms.g:3631:2: rule__SPrimitiveArchetype__Group__1__Impl rule__SPrimitiveArchetype__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSms.g:3638:1: rule__SPrimitiveArchetype__Group__1__Impl : ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) ;
    public final void rule__SPrimitiveArchetype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3642:1: ( ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) ) )
            // InternalSms.g:3643:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            {
            // InternalSms.g:3643:1: ( ( rule__SPrimitiveArchetype__NameAssignment_1 ) )
            // InternalSms.g:3644:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getNameAssignment_1()); 
            // InternalSms.g:3645:2: ( rule__SPrimitiveArchetype__NameAssignment_1 )
            // InternalSms.g:3645:3: rule__SPrimitiveArchetype__NameAssignment_1
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
    // InternalSms.g:3653:1: rule__SPrimitiveArchetype__Group__2 : rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 ;
    public final void rule__SPrimitiveArchetype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3657:1: ( rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3 )
            // InternalSms.g:3658:2: rule__SPrimitiveArchetype__Group__2__Impl rule__SPrimitiveArchetype__Group__3
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
    // InternalSms.g:3665:1: rule__SPrimitiveArchetype__Group__2__Impl : ( '{' ) ;
    public final void rule__SPrimitiveArchetype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3669:1: ( ( '{' ) )
            // InternalSms.g:3670:1: ( '{' )
            {
            // InternalSms.g:3670:1: ( '{' )
            // InternalSms.g:3671:2: '{'
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
    // InternalSms.g:3680:1: rule__SPrimitiveArchetype__Group__3 : rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 ;
    public final void rule__SPrimitiveArchetype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3684:1: ( rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4 )
            // InternalSms.g:3685:2: rule__SPrimitiveArchetype__Group__3__Impl rule__SPrimitiveArchetype__Group__4
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
    // InternalSms.g:3692:1: rule__SPrimitiveArchetype__Group__3__Impl : ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) ;
    public final void rule__SPrimitiveArchetype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3696:1: ( ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* ) )
            // InternalSms.g:3697:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            {
            // InternalSms.g:3697:1: ( ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )* )
            // InternalSms.g:3698:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSPrimitiveArchetypeAccess().getConstraintsAssignment_3()); 
            // InternalSms.g:3699:2: ( rule__SPrimitiveArchetype__ConstraintsAssignment_3 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==28) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSms.g:3699:3: rule__SPrimitiveArchetype__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SPrimitiveArchetype__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSms.g:3707:1: rule__SPrimitiveArchetype__Group__4 : rule__SPrimitiveArchetype__Group__4__Impl ;
    public final void rule__SPrimitiveArchetype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3711:1: ( rule__SPrimitiveArchetype__Group__4__Impl )
            // InternalSms.g:3712:2: rule__SPrimitiveArchetype__Group__4__Impl
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
    // InternalSms.g:3718:1: rule__SPrimitiveArchetype__Group__4__Impl : ( '}' ) ;
    public final void rule__SPrimitiveArchetype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3722:1: ( ( '}' ) )
            // InternalSms.g:3723:1: ( '}' )
            {
            // InternalSms.g:3723:1: ( '}' )
            // InternalSms.g:3724:2: '}'
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
    // InternalSms.g:3734:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3738:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSms.g:3739:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSms.g:3746:1: rule__SEnumeration__Group__0__Impl : ( ( rule__SEnumeration__Alternatives_0 ) ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3750:1: ( ( ( rule__SEnumeration__Alternatives_0 ) ) )
            // InternalSms.g:3751:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            {
            // InternalSms.g:3751:1: ( ( rule__SEnumeration__Alternatives_0 ) )
            // InternalSms.g:3752:2: ( rule__SEnumeration__Alternatives_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getAlternatives_0()); 
            // InternalSms.g:3753:2: ( rule__SEnumeration__Alternatives_0 )
            // InternalSms.g:3753:3: rule__SEnumeration__Alternatives_0
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
    // InternalSms.g:3761:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3765:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSms.g:3766:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
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
    // InternalSms.g:3773:1: rule__SEnumeration__Group__1__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3777:1: ( ( '{' ) )
            // InternalSms.g:3778:1: ( '{' )
            {
            // InternalSms.g:3778:1: ( '{' )
            // InternalSms.g:3779:2: '{'
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
    // InternalSms.g:3788:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3792:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSms.g:3793:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
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
    // InternalSms.g:3800:1: rule__SEnumeration__Group__2__Impl : ( ( rule__SEnumeration__Group_2__0 )? ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3804:1: ( ( ( rule__SEnumeration__Group_2__0 )? ) )
            // InternalSms.g:3805:1: ( ( rule__SEnumeration__Group_2__0 )? )
            {
            // InternalSms.g:3805:1: ( ( rule__SEnumeration__Group_2__0 )? )
            // InternalSms.g:3806:2: ( rule__SEnumeration__Group_2__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2()); 
            // InternalSms.g:3807:2: ( rule__SEnumeration__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==24||LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSms.g:3807:3: rule__SEnumeration__Group_2__0
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
    // InternalSms.g:3815:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3819:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSms.g:3820:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
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
    // InternalSms.g:3827:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3831:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_3 )* ) )
            // InternalSms.g:3832:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            {
            // InternalSms.g:3832:1: ( ( rule__SEnumeration__ConstraintsAssignment_3 )* )
            // InternalSms.g:3833:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_3()); 
            // InternalSms.g:3834:2: ( rule__SEnumeration__ConstraintsAssignment_3 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==28) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSms.g:3834:3: rule__SEnumeration__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__SEnumeration__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalSms.g:3842:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3846:1: ( rule__SEnumeration__Group__4__Impl )
            // InternalSms.g:3847:2: rule__SEnumeration__Group__4__Impl
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
    // InternalSms.g:3853:1: rule__SEnumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3857:1: ( ( '}' ) )
            // InternalSms.g:3858:1: ( '}' )
            {
            // InternalSms.g:3858:1: ( '}' )
            // InternalSms.g:3859:2: '}'
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
    // InternalSms.g:3869:1: rule__SEnumeration__Group_0_0__0 : rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 ;
    public final void rule__SEnumeration__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3873:1: ( rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1 )
            // InternalSms.g:3874:2: rule__SEnumeration__Group_0_0__0__Impl rule__SEnumeration__Group_0_0__1
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
    // InternalSms.g:3881:1: rule__SEnumeration__Group_0_0__0__Impl : ( 'grab' ) ;
    public final void rule__SEnumeration__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3885:1: ( ( 'grab' ) )
            // InternalSms.g:3886:1: ( 'grab' )
            {
            // InternalSms.g:3886:1: ( 'grab' )
            // InternalSms.g:3887:2: 'grab'
            {
             before(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getGrabKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_0__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_0__1"
    // InternalSms.g:3896:1: rule__SEnumeration__Group_0_0__1 : rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 ;
    public final void rule__SEnumeration__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3900:1: ( rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2 )
            // InternalSms.g:3901:2: rule__SEnumeration__Group_0_0__1__Impl rule__SEnumeration__Group_0_0__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:3908:1: rule__SEnumeration__Group_0_0__1__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3912:1: ( ( 'enumeration' ) )
            // InternalSms.g:3913:1: ( 'enumeration' )
            {
            // InternalSms.g:3913:1: ( 'enumeration' )
            // InternalSms.g:3914:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_0_1()); 

            }


            }

        }
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
    // InternalSms.g:3923:1: rule__SEnumeration__Group_0_0__2 : rule__SEnumeration__Group_0_0__2__Impl ;
    public final void rule__SEnumeration__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3927:1: ( rule__SEnumeration__Group_0_0__2__Impl )
            // InternalSms.g:3928:2: rule__SEnumeration__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:3934:1: rule__SEnumeration__Group_0_0__2__Impl : ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 ) ) ;
    public final void rule__SEnumeration__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3938:1: ( ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 ) ) )
            // InternalSms.g:3939:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 ) )
            {
            // InternalSms.g:3939:1: ( ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 ) )
            // InternalSms.g:3940:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 )
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_2()); 
            // InternalSms.g:3941:2: ( rule__SEnumeration__DeductionRuleAssignment_0_0_2 )
            // InternalSms.g:3941:3: rule__SEnumeration__DeductionRuleAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__DeductionRuleAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleAssignment_0_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SEnumeration__Group_0_1__0"
    // InternalSms.g:3950:1: rule__SEnumeration__Group_0_1__0 : rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 ;
    public final void rule__SEnumeration__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3954:1: ( rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1 )
            // InternalSms.g:3955:2: rule__SEnumeration__Group_0_1__0__Impl rule__SEnumeration__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:3962:1: rule__SEnumeration__Group_0_1__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3966:1: ( ( 'enumeration' ) )
            // InternalSms.g:3967:1: ( 'enumeration' )
            {
            // InternalSms.g:3967:1: ( 'enumeration' )
            // InternalSms.g:3968:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_0_1__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_0_1__1"
    // InternalSms.g:3977:1: rule__SEnumeration__Group_0_1__1 : rule__SEnumeration__Group_0_1__1__Impl ;
    public final void rule__SEnumeration__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3981:1: ( rule__SEnumeration__Group_0_1__1__Impl )
            // InternalSms.g:3982:2: rule__SEnumeration__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:3988:1: rule__SEnumeration__Group_0_1__1__Impl : ( ( rule__SEnumeration__NameAssignment_0_1_1 ) ) ;
    public final void rule__SEnumeration__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3992:1: ( ( ( rule__SEnumeration__NameAssignment_0_1_1 ) ) )
            // InternalSms.g:3993:1: ( ( rule__SEnumeration__NameAssignment_0_1_1 ) )
            {
            // InternalSms.g:3993:1: ( ( rule__SEnumeration__NameAssignment_0_1_1 ) )
            // InternalSms.g:3994:2: ( rule__SEnumeration__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_0_1_1()); 
            // InternalSms.g:3995:2: ( rule__SEnumeration__NameAssignment_0_1_1 )
            // InternalSms.g:3995:3: rule__SEnumeration__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getNameAssignment_0_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SEnumeration__Group_2__0"
    // InternalSms.g:4004:1: rule__SEnumeration__Group_2__0 : rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 ;
    public final void rule__SEnumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4008:1: ( rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1 )
            // InternalSms.g:4009:2: rule__SEnumeration__Group_2__0__Impl rule__SEnumeration__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSms.g:4016:1: rule__SEnumeration__Group_2__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) ;
    public final void rule__SEnumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4020:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) ) )
            // InternalSms.g:4021:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            {
            // InternalSms.g:4021:1: ( ( rule__SEnumeration__LiteralsAssignment_2_0 ) )
            // InternalSms.g:4022:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_0()); 
            // InternalSms.g:4023:2: ( rule__SEnumeration__LiteralsAssignment_2_0 )
            // InternalSms.g:4023:3: rule__SEnumeration__LiteralsAssignment_2_0
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
    // InternalSms.g:4031:1: rule__SEnumeration__Group_2__1 : rule__SEnumeration__Group_2__1__Impl ;
    public final void rule__SEnumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4035:1: ( rule__SEnumeration__Group_2__1__Impl )
            // InternalSms.g:4036:2: rule__SEnumeration__Group_2__1__Impl
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
    // InternalSms.g:4042:1: rule__SEnumeration__Group_2__1__Impl : ( ( rule__SEnumeration__Group_2_1__0 )* ) ;
    public final void rule__SEnumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4046:1: ( ( ( rule__SEnumeration__Group_2_1__0 )* ) )
            // InternalSms.g:4047:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            {
            // InternalSms.g:4047:1: ( ( rule__SEnumeration__Group_2_1__0 )* )
            // InternalSms.g:4048:2: ( rule__SEnumeration__Group_2_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_2_1()); 
            // InternalSms.g:4049:2: ( rule__SEnumeration__Group_2_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==34) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalSms.g:4049:3: rule__SEnumeration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SEnumeration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalSms.g:4058:1: rule__SEnumeration__Group_2_1__0 : rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 ;
    public final void rule__SEnumeration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4062:1: ( rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1 )
            // InternalSms.g:4063:2: rule__SEnumeration__Group_2_1__0__Impl rule__SEnumeration__Group_2_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSms.g:4070:1: rule__SEnumeration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4074:1: ( ( ',' ) )
            // InternalSms.g:4075:1: ( ',' )
            {
            // InternalSms.g:4075:1: ( ',' )
            // InternalSms.g:4076:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_2_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSms.g:4085:1: rule__SEnumeration__Group_2_1__1 : rule__SEnumeration__Group_2_1__1__Impl ;
    public final void rule__SEnumeration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4089:1: ( rule__SEnumeration__Group_2_1__1__Impl )
            // InternalSms.g:4090:2: rule__SEnumeration__Group_2_1__1__Impl
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
    // InternalSms.g:4096:1: rule__SEnumeration__Group_2_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) ;
    public final void rule__SEnumeration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4100:1: ( ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) ) )
            // InternalSms.g:4101:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            {
            // InternalSms.g:4101:1: ( ( rule__SEnumeration__LiteralsAssignment_2_1_1 ) )
            // InternalSms.g:4102:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_2_1_1()); 
            // InternalSms.g:4103:2: ( rule__SEnumeration__LiteralsAssignment_2_1_1 )
            // InternalSms.g:4103:3: rule__SEnumeration__LiteralsAssignment_2_1_1
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
    // InternalSms.g:4112:1: rule__SLiteral__Group_0__0 : rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 ;
    public final void rule__SLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4116:1: ( rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1 )
            // InternalSms.g:4117:2: rule__SLiteral__Group_0__0__Impl rule__SLiteral__Group_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4124:1: rule__SLiteral__Group_0__0__Impl : ( 'grab' ) ;
    public final void rule__SLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4128:1: ( ( 'grab' ) )
            // InternalSms.g:4129:1: ( 'grab' )
            {
            // InternalSms.g:4129:1: ( 'grab' )
            // InternalSms.g:4130:2: 'grab'
            {
             before(grammarAccess.getSLiteralAccess().getGrabKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getGrabKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__SLiteral__Group_0__1"
    // InternalSms.g:4139:1: rule__SLiteral__Group_0__1 : rule__SLiteral__Group_0__1__Impl ;
    public final void rule__SLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4143:1: ( rule__SLiteral__Group_0__1__Impl )
            // InternalSms.g:4144:2: rule__SLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4150:1: rule__SLiteral__Group_0__1__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_0_1 ) ) ;
    public final void rule__SLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4154:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_0_1 ) ) )
            // InternalSms.g:4155:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_1 ) )
            {
            // InternalSms.g:4155:1: ( ( rule__SLiteral__DeductionRuleAssignment_0_1 ) )
            // InternalSms.g:4156:2: ( rule__SLiteral__DeductionRuleAssignment_0_1 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_1()); 
            // InternalSms.g:4157:2: ( rule__SLiteral__DeductionRuleAssignment_0_1 )
            // InternalSms.g:4157:3: rule__SLiteral__DeductionRuleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__DeductionRuleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SLiteral__Group_1__0"
    // InternalSms.g:4166:1: rule__SLiteral__Group_1__0 : rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 ;
    public final void rule__SLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4170:1: ( rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1 )
            // InternalSms.g:4171:2: rule__SLiteral__Group_1__0__Impl rule__SLiteral__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4178:1: rule__SLiteral__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4182:1: ( ( 'ditch' ) )
            // InternalSms.g:4183:1: ( 'ditch' )
            {
            // InternalSms.g:4183:1: ( 'ditch' )
            // InternalSms.g:4184:2: 'ditch'
            {
             before(grammarAccess.getSLiteralAccess().getDitchKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getDitchKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__SLiteral__Group_1__1"
    // InternalSms.g:4193:1: rule__SLiteral__Group_1__1 : rule__SLiteral__Group_1__1__Impl ;
    public final void rule__SLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4197:1: ( rule__SLiteral__Group_1__1__Impl )
            // InternalSms.g:4198:2: rule__SLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4204:1: rule__SLiteral__Group_1__1__Impl : ( ( rule__SLiteral__DeductionRuleAssignment_1_1 ) ) ;
    public final void rule__SLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4208:1: ( ( ( rule__SLiteral__DeductionRuleAssignment_1_1 ) ) )
            // InternalSms.g:4209:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_1 ) )
            {
            // InternalSms.g:4209:1: ( ( rule__SLiteral__DeductionRuleAssignment_1_1 ) )
            // InternalSms.g:4210:2: ( rule__SLiteral__DeductionRuleAssignment_1_1 )
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_1()); 
            // InternalSms.g:4211:2: ( rule__SLiteral__DeductionRuleAssignment_1_1 )
            // InternalSms.g:4211:3: rule__SLiteral__DeductionRuleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__DeductionRuleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getDeductionRuleAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRootType__Group__0"
    // InternalSms.g:4220:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4224:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSms.g:4225:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSms.g:4232:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4236:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSms.g:4237:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSms.g:4237:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSms.g:4238:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSms.g:4239:2: ( rule__SRootType__Alternatives_0 )
            // InternalSms.g:4239:3: rule__SRootType__Alternatives_0
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
    // InternalSms.g:4247:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4251:1: ( rule__SRootType__Group__1__Impl )
            // InternalSms.g:4252:2: rule__SRootType__Group__1__Impl
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
    // InternalSms.g:4258:1: rule__SRootType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4262:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSms.g:4263:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSms.g:4263:1: ( ruleSComplexTypeFeatures )
            // InternalSms.g:4264:2: ruleSComplexTypeFeatures
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
    // InternalSms.g:4274:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4278:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSms.g:4279:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4286:1: rule__SRootType__Group_0_0__0__Impl : ( 'grab' ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4290:1: ( ( 'grab' ) )
            // InternalSms.g:4291:1: ( 'grab' )
            {
            // InternalSms.g:4291:1: ( 'grab' )
            // InternalSms.g:4292:2: 'grab'
            {
             before(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getGrabKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_0__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_0__1"
    // InternalSms.g:4301:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4305:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSms.g:4306:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4313:1: rule__SRootType__Group_0_0__1__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_1 )? ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4317:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_1 )? ) )
            // InternalSms.g:4318:1: ( ( rule__SRootType__AbstractAssignment_0_0_1 )? )
            {
            // InternalSms.g:4318:1: ( ( rule__SRootType__AbstractAssignment_0_0_1 )? )
            // InternalSms.g:4319:2: ( rule__SRootType__AbstractAssignment_0_0_1 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_1()); 
            // InternalSms.g:4320:2: ( rule__SRootType__AbstractAssignment_0_0_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSms.g:4320:3: rule__SRootType__AbstractAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_1()); 

            }


            }

        }
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
    // InternalSms.g:4328:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4332:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSms.g:4333:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4340:1: rule__SRootType__Group_0_0__2__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4344:1: ( ( 'root' ) )
            // InternalSms.g:4345:1: ( 'root' )
            {
            // InternalSms.g:4345:1: ( 'root' )
            // InternalSms.g:4346:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_2()); 

            }


            }

        }
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
    // InternalSms.g:4355:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4359:1: ( rule__SRootType__Group_0_0__3__Impl )
            // InternalSms.g:4360:2: rule__SRootType__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_0__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4366:1: rule__SRootType__Group_0_0__3__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4370:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSms.g:4371:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSms.g:4371:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) )
            // InternalSms.g:4372:2: ( rule__SRootType__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSms.g:4373:2: ( rule__SRootType__DeductionRuleAssignment_0_0_3 )
            // InternalSms.g:4373:3: rule__SRootType__DeductionRuleAssignment_0_0_3
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRootType__Group_0_1__0"
    // InternalSms.g:4382:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4386:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSms.g:4387:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4394:1: rule__SRootType__Group_0_1__0__Impl : ( 'morph' ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4398:1: ( ( 'morph' ) )
            // InternalSms.g:4399:1: ( 'morph' )
            {
            // InternalSms.g:4399:1: ( 'morph' )
            // InternalSms.g:4400:2: 'morph'
            {
             before(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getMorphKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_1__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_1__1"
    // InternalSms.g:4409:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4413:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSms.g:4414:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4421:1: rule__SRootType__Group_0_1__1__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_1 )? ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4425:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_1 )? ) )
            // InternalSms.g:4426:1: ( ( rule__SRootType__AbstractAssignment_0_1_1 )? )
            {
            // InternalSms.g:4426:1: ( ( rule__SRootType__AbstractAssignment_0_1_1 )? )
            // InternalSms.g:4427:2: ( rule__SRootType__AbstractAssignment_0_1_1 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_1()); 
            // InternalSms.g:4428:2: ( rule__SRootType__AbstractAssignment_0_1_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSms.g:4428:3: rule__SRootType__AbstractAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_1()); 

            }


            }

        }
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
    // InternalSms.g:4436:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4440:1: ( rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3 )
            // InternalSms.g:4441:2: rule__SRootType__Group_0_1__2__Impl rule__SRootType__Group_0_1__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4448:1: rule__SRootType__Group_0_1__2__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4452:1: ( ( 'root' ) )
            // InternalSms.g:4453:1: ( 'root' )
            {
            // InternalSms.g:4453:1: ( 'root' )
            // InternalSms.g:4454:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_2()); 

            }


            }

        }
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
    // InternalSms.g:4463:1: rule__SRootType__Group_0_1__3 : rule__SRootType__Group_0_1__3__Impl ;
    public final void rule__SRootType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4467:1: ( rule__SRootType__Group_0_1__3__Impl )
            // InternalSms.g:4468:2: rule__SRootType__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4474:1: rule__SRootType__Group_0_1__3__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SRootType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4478:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSms.g:4479:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSms.g:4479:1: ( ( rule__SRootType__DeductionRuleAssignment_0_1_3 ) )
            // InternalSms.g:4480:2: ( rule__SRootType__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSms.g:4481:2: ( rule__SRootType__DeductionRuleAssignment_0_1_3 )
            // InternalSms.g:4481:3: rule__SRootType__DeductionRuleAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRootType__Group_0_2__0"
    // InternalSms.g:4490:1: rule__SRootType__Group_0_2__0 : rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 ;
    public final void rule__SRootType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4494:1: ( rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1 )
            // InternalSms.g:4495:2: rule__SRootType__Group_0_2__0__Impl rule__SRootType__Group_0_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4502:1: rule__SRootType__Group_0_2__0__Impl : ( 'fuse' ) ;
    public final void rule__SRootType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4506:1: ( ( 'fuse' ) )
            // InternalSms.g:4507:1: ( 'fuse' )
            {
            // InternalSms.g:4507:1: ( 'fuse' )
            // InternalSms.g:4508:2: 'fuse'
            {
             before(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getFuseKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_2__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_2__1"
    // InternalSms.g:4517:1: rule__SRootType__Group_0_2__1 : rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 ;
    public final void rule__SRootType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4521:1: ( rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2 )
            // InternalSms.g:4522:2: rule__SRootType__Group_0_2__1__Impl rule__SRootType__Group_0_2__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:4529:1: rule__SRootType__Group_0_2__1__Impl : ( ( rule__SRootType__AbstractAssignment_0_2_1 )? ) ;
    public final void rule__SRootType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4533:1: ( ( ( rule__SRootType__AbstractAssignment_0_2_1 )? ) )
            // InternalSms.g:4534:1: ( ( rule__SRootType__AbstractAssignment_0_2_1 )? )
            {
            // InternalSms.g:4534:1: ( ( rule__SRootType__AbstractAssignment_0_2_1 )? )
            // InternalSms.g:4535:2: ( rule__SRootType__AbstractAssignment_0_2_1 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_1()); 
            // InternalSms.g:4536:2: ( rule__SRootType__AbstractAssignment_0_2_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSms.g:4536:3: rule__SRootType__AbstractAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_2_1()); 

            }


            }

        }
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
    // InternalSms.g:4544:1: rule__SRootType__Group_0_2__2 : rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 ;
    public final void rule__SRootType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4548:1: ( rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3 )
            // InternalSms.g:4549:2: rule__SRootType__Group_0_2__2__Impl rule__SRootType__Group_0_2__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4556:1: rule__SRootType__Group_0_2__2__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4560:1: ( ( 'root' ) )
            // InternalSms.g:4561:1: ( 'root' )
            {
            // InternalSms.g:4561:1: ( 'root' )
            // InternalSms.g:4562:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_2_2()); 

            }


            }

        }
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
    // InternalSms.g:4571:1: rule__SRootType__Group_0_2__3 : rule__SRootType__Group_0_2__3__Impl ;
    public final void rule__SRootType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4575:1: ( rule__SRootType__Group_0_2__3__Impl )
            // InternalSms.g:4576:2: rule__SRootType__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_2__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4582:1: rule__SRootType__Group_0_2__3__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_2_3 ) ) ;
    public final void rule__SRootType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4586:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_2_3 ) ) )
            // InternalSms.g:4587:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_3 ) )
            {
            // InternalSms.g:4587:1: ( ( rule__SRootType__DeductionRuleAssignment_0_2_3 ) )
            // InternalSms.g:4588:2: ( rule__SRootType__DeductionRuleAssignment_0_2_3 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_3()); 
            // InternalSms.g:4589:2: ( rule__SRootType__DeductionRuleAssignment_0_2_3 )
            // InternalSms.g:4589:3: rule__SRootType__DeductionRuleAssignment_0_2_3
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__DeductionRuleAssignment_0_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRootType__Group_0_3__0"
    // InternalSms.g:4598:1: rule__SRootType__Group_0_3__0 : rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 ;
    public final void rule__SRootType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4602:1: ( rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1 )
            // InternalSms.g:4603:2: rule__SRootType__Group_0_3__0__Impl rule__SRootType__Group_0_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSms.g:4610:1: rule__SRootType__Group_0_3__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_3_0 )? ) ;
    public final void rule__SRootType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4614:1: ( ( ( rule__SRootType__AbstractAssignment_0_3_0 )? ) )
            // InternalSms.g:4615:1: ( ( rule__SRootType__AbstractAssignment_0_3_0 )? )
            {
            // InternalSms.g:4615:1: ( ( rule__SRootType__AbstractAssignment_0_3_0 )? )
            // InternalSms.g:4616:2: ( rule__SRootType__AbstractAssignment_0_3_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_0()); 
            // InternalSms.g:4617:2: ( rule__SRootType__AbstractAssignment_0_3_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSms.g:4617:3: rule__SRootType__AbstractAssignment_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__Group_0_3__0__Impl"


    // $ANTLR start "rule__SRootType__Group_0_3__1"
    // InternalSms.g:4625:1: rule__SRootType__Group_0_3__1 : rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 ;
    public final void rule__SRootType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4629:1: ( rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2 )
            // InternalSms.g:4630:2: rule__SRootType__Group_0_3__1__Impl rule__SRootType__Group_0_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4637:1: rule__SRootType__Group_0_3__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4641:1: ( ( 'root' ) )
            // InternalSms.g:4642:1: ( 'root' )
            {
            // InternalSms.g:4642:1: ( 'root' )
            // InternalSms.g:4643:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_3_1()); 

            }


            }

        }
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
    // InternalSms.g:4652:1: rule__SRootType__Group_0_3__2 : rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 ;
    public final void rule__SRootType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4656:1: ( rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3 )
            // InternalSms.g:4657:2: rule__SRootType__Group_0_3__2__Impl rule__SRootType__Group_0_3__3
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
    // InternalSms.g:4664:1: rule__SRootType__Group_0_3__2__Impl : ( ( rule__SRootType__NameAssignment_0_3_2 ) ) ;
    public final void rule__SRootType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4668:1: ( ( ( rule__SRootType__NameAssignment_0_3_2 ) ) )
            // InternalSms.g:4669:1: ( ( rule__SRootType__NameAssignment_0_3_2 ) )
            {
            // InternalSms.g:4669:1: ( ( rule__SRootType__NameAssignment_0_3_2 ) )
            // InternalSms.g:4670:2: ( rule__SRootType__NameAssignment_0_3_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_3_2()); 
            // InternalSms.g:4671:2: ( rule__SRootType__NameAssignment_0_3_2 )
            // InternalSms.g:4671:3: rule__SRootType__NameAssignment_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__NameAssignment_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getNameAssignment_0_3_2()); 

            }


            }

        }
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
    // InternalSms.g:4679:1: rule__SRootType__Group_0_3__3 : rule__SRootType__Group_0_3__3__Impl ;
    public final void rule__SRootType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4683:1: ( rule__SRootType__Group_0_3__3__Impl )
            // InternalSms.g:4684:2: rule__SRootType__Group_0_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_3__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:4690:1: rule__SRootType__Group_0_3__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SRootType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4694:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSms.g:4695:1: ( ruleSComplexTypeExtends )
            {
            // InternalSms.g:4695:1: ( ruleSComplexTypeExtends )
            // InternalSms.g:4696:2: ruleSComplexTypeExtends
            {
             before(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeExtends();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group__0"
    // InternalSms.g:4706:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4710:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSms.g:4711:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSms.g:4718:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4722:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSms.g:4723:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSms.g:4723:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSms.g:4724:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSms.g:4725:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSms.g:4725:3: rule__SDetailType__Alternatives_0
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
    // InternalSms.g:4733:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4737:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSms.g:4738:2: rule__SDetailType__Group__1__Impl
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
    // InternalSms.g:4744:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexTypeFeatures ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4748:1: ( ( ruleSComplexTypeFeatures ) )
            // InternalSms.g:4749:1: ( ruleSComplexTypeFeatures )
            {
            // InternalSms.g:4749:1: ( ruleSComplexTypeFeatures )
            // InternalSms.g:4750:2: ruleSComplexTypeFeatures
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
    // InternalSms.g:4760:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4764:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSms.g:4765:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSms.g:4772:1: rule__SDetailType__Group_0_0__0__Impl : ( 'grab' ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4776:1: ( ( 'grab' ) )
            // InternalSms.g:4777:1: ( 'grab' )
            {
            // InternalSms.g:4777:1: ( 'grab' )
            // InternalSms.g:4778:2: 'grab'
            {
             before(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getGrabKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_0__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_0__1"
    // InternalSms.g:4787:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4791:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSms.g:4792:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSms.g:4799:1: rule__SDetailType__Group_0_0__1__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4803:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? ) )
            // InternalSms.g:4804:1: ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? )
            {
            // InternalSms.g:4804:1: ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? )
            // InternalSms.g:4805:2: ( rule__SDetailType__AbstractAssignment_0_0_1 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_1()); 
            // InternalSms.g:4806:2: ( rule__SDetailType__AbstractAssignment_0_0_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSms.g:4806:3: rule__SDetailType__AbstractAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_1()); 

            }


            }

        }
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
    // InternalSms.g:4814:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4818:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSms.g:4819:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4826:1: rule__SDetailType__Group_0_0__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4830:1: ( ( 'detail' ) )
            // InternalSms.g:4831:1: ( 'detail' )
            {
            // InternalSms.g:4831:1: ( 'detail' )
            // InternalSms.g:4832:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSms.g:4841:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4845:1: ( rule__SDetailType__Group_0_0__3__Impl )
            // InternalSms.g:4846:2: rule__SDetailType__Group_0_0__3__Impl
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
    // InternalSms.g:4852:1: rule__SDetailType__Group_0_0__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4856:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSms.g:4857:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSms.g:4857:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            // InternalSms.g:4858:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSms.g:4859:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            // InternalSms.g:4859:3: rule__SDetailType__DeductionRuleAssignment_0_0_3
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
    // InternalSms.g:4868:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4872:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSms.g:4873:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
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
    // InternalSms.g:4880:1: rule__SDetailType__Group_0_1__0__Impl : ( 'morph' ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4884:1: ( ( 'morph' ) )
            // InternalSms.g:4885:1: ( 'morph' )
            {
            // InternalSms.g:4885:1: ( 'morph' )
            // InternalSms.g:4886:2: 'morph'
            {
             before(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getMorphKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_1__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_1__1"
    // InternalSms.g:4895:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4899:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSms.g:4900:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSms.g:4907:1: rule__SDetailType__Group_0_1__1__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_1 )? ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4911:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_1 )? ) )
            // InternalSms.g:4912:1: ( ( rule__SDetailType__AbstractAssignment_0_1_1 )? )
            {
            // InternalSms.g:4912:1: ( ( rule__SDetailType__AbstractAssignment_0_1_1 )? )
            // InternalSms.g:4913:2: ( rule__SDetailType__AbstractAssignment_0_1_1 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_1()); 
            // InternalSms.g:4914:2: ( rule__SDetailType__AbstractAssignment_0_1_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSms.g:4914:3: rule__SDetailType__AbstractAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_1()); 

            }


            }

        }
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
    // InternalSms.g:4922:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4926:1: ( rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3 )
            // InternalSms.g:4927:2: rule__SDetailType__Group_0_1__2__Impl rule__SDetailType__Group_0_1__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:4934:1: rule__SDetailType__Group_0_1__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4938:1: ( ( 'detail' ) )
            // InternalSms.g:4939:1: ( 'detail' )
            {
            // InternalSms.g:4939:1: ( 'detail' )
            // InternalSms.g:4940:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSms.g:4949:1: rule__SDetailType__Group_0_1__3 : rule__SDetailType__Group_0_1__3__Impl ;
    public final void rule__SDetailType__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4953:1: ( rule__SDetailType__Group_0_1__3__Impl )
            // InternalSms.g:4954:2: rule__SDetailType__Group_0_1__3__Impl
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
    // InternalSms.g:4960:1: rule__SDetailType__Group_0_1__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) ) ;
    public final void rule__SDetailType__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4964:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) ) )
            // InternalSms.g:4965:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) )
            {
            // InternalSms.g:4965:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_1_3 ) )
            // InternalSms.g:4966:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_1_3()); 
            // InternalSms.g:4967:2: ( rule__SDetailType__DeductionRuleAssignment_0_1_3 )
            // InternalSms.g:4967:3: rule__SDetailType__DeductionRuleAssignment_0_1_3
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
    // InternalSms.g:4976:1: rule__SDetailType__Group_0_2__0 : rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 ;
    public final void rule__SDetailType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4980:1: ( rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1 )
            // InternalSms.g:4981:2: rule__SDetailType__Group_0_2__0__Impl rule__SDetailType__Group_0_2__1
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
    // InternalSms.g:4988:1: rule__SDetailType__Group_0_2__0__Impl : ( 'fuse' ) ;
    public final void rule__SDetailType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4992:1: ( ( 'fuse' ) )
            // InternalSms.g:4993:1: ( 'fuse' )
            {
            // InternalSms.g:4993:1: ( 'fuse' )
            // InternalSms.g:4994:2: 'fuse'
            {
             before(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getFuseKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_2__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_2__1"
    // InternalSms.g:5003:1: rule__SDetailType__Group_0_2__1 : rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 ;
    public final void rule__SDetailType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5007:1: ( rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2 )
            // InternalSms.g:5008:2: rule__SDetailType__Group_0_2__1__Impl rule__SDetailType__Group_0_2__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSms.g:5015:1: rule__SDetailType__Group_0_2__1__Impl : ( ( rule__SDetailType__AbstractAssignment_0_2_1 )? ) ;
    public final void rule__SDetailType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5019:1: ( ( ( rule__SDetailType__AbstractAssignment_0_2_1 )? ) )
            // InternalSms.g:5020:1: ( ( rule__SDetailType__AbstractAssignment_0_2_1 )? )
            {
            // InternalSms.g:5020:1: ( ( rule__SDetailType__AbstractAssignment_0_2_1 )? )
            // InternalSms.g:5021:2: ( rule__SDetailType__AbstractAssignment_0_2_1 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_1()); 
            // InternalSms.g:5022:2: ( rule__SDetailType__AbstractAssignment_0_2_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalSms.g:5022:3: rule__SDetailType__AbstractAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_2_1()); 

            }


            }

        }
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
    // InternalSms.g:5030:1: rule__SDetailType__Group_0_2__2 : rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 ;
    public final void rule__SDetailType__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5034:1: ( rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3 )
            // InternalSms.g:5035:2: rule__SDetailType__Group_0_2__2__Impl rule__SDetailType__Group_0_2__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:5042:1: rule__SDetailType__Group_0_2__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5046:1: ( ( 'detail' ) )
            // InternalSms.g:5047:1: ( 'detail' )
            {
            // InternalSms.g:5047:1: ( 'detail' )
            // InternalSms.g:5048:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_2_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSms.g:5057:1: rule__SDetailType__Group_0_2__3 : rule__SDetailType__Group_0_2__3__Impl ;
    public final void rule__SDetailType__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5061:1: ( rule__SDetailType__Group_0_2__3__Impl )
            // InternalSms.g:5062:2: rule__SDetailType__Group_0_2__3__Impl
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
    // InternalSms.g:5068:1: rule__SDetailType__Group_0_2__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) ) ;
    public final void rule__SDetailType__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5072:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) ) )
            // InternalSms.g:5073:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) )
            {
            // InternalSms.g:5073:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_2_3 ) )
            // InternalSms.g:5074:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_2_3()); 
            // InternalSms.g:5075:2: ( rule__SDetailType__DeductionRuleAssignment_0_2_3 )
            // InternalSms.g:5075:3: rule__SDetailType__DeductionRuleAssignment_0_2_3
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
    // InternalSms.g:5084:1: rule__SDetailType__Group_0_3__0 : rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 ;
    public final void rule__SDetailType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5088:1: ( rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1 )
            // InternalSms.g:5089:2: rule__SDetailType__Group_0_3__0__Impl rule__SDetailType__Group_0_3__1
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
    // InternalSms.g:5096:1: rule__SDetailType__Group_0_3__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_3_0 )? ) ;
    public final void rule__SDetailType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5100:1: ( ( ( rule__SDetailType__AbstractAssignment_0_3_0 )? ) )
            // InternalSms.g:5101:1: ( ( rule__SDetailType__AbstractAssignment_0_3_0 )? )
            {
            // InternalSms.g:5101:1: ( ( rule__SDetailType__AbstractAssignment_0_3_0 )? )
            // InternalSms.g:5102:2: ( rule__SDetailType__AbstractAssignment_0_3_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_0()); 
            // InternalSms.g:5103:2: ( rule__SDetailType__AbstractAssignment_0_3_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSms.g:5103:3: rule__SDetailType__AbstractAssignment_0_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_3_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__Group_0_3__0__Impl"


    // $ANTLR start "rule__SDetailType__Group_0_3__1"
    // InternalSms.g:5111:1: rule__SDetailType__Group_0_3__1 : rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 ;
    public final void rule__SDetailType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5115:1: ( rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2 )
            // InternalSms.g:5116:2: rule__SDetailType__Group_0_3__1__Impl rule__SDetailType__Group_0_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:5123:1: rule__SDetailType__Group_0_3__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5127:1: ( ( 'detail' ) )
            // InternalSms.g:5128:1: ( 'detail' )
            {
            // InternalSms.g:5128:1: ( 'detail' )
            // InternalSms.g:5129:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_3_1()); 

            }


            }

        }
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
    // InternalSms.g:5138:1: rule__SDetailType__Group_0_3__2 : rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 ;
    public final void rule__SDetailType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5142:1: ( rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3 )
            // InternalSms.g:5143:2: rule__SDetailType__Group_0_3__2__Impl rule__SDetailType__Group_0_3__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSms.g:5150:1: rule__SDetailType__Group_0_3__2__Impl : ( ( rule__SDetailType__NameAssignment_0_3_2 ) ) ;
    public final void rule__SDetailType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5154:1: ( ( ( rule__SDetailType__NameAssignment_0_3_2 ) ) )
            // InternalSms.g:5155:1: ( ( rule__SDetailType__NameAssignment_0_3_2 ) )
            {
            // InternalSms.g:5155:1: ( ( rule__SDetailType__NameAssignment_0_3_2 ) )
            // InternalSms.g:5156:2: ( rule__SDetailType__NameAssignment_0_3_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_3_2()); 
            // InternalSms.g:5157:2: ( rule__SDetailType__NameAssignment_0_3_2 )
            // InternalSms.g:5157:3: rule__SDetailType__NameAssignment_0_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__NameAssignment_0_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_3_2()); 

            }


            }

        }
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
    // InternalSms.g:5165:1: rule__SDetailType__Group_0_3__3 : rule__SDetailType__Group_0_3__3__Impl ;
    public final void rule__SDetailType__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5169:1: ( rule__SDetailType__Group_0_3__3__Impl )
            // InternalSms.g:5170:2: rule__SDetailType__Group_0_3__3__Impl
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
    // InternalSms.g:5176:1: rule__SDetailType__Group_0_3__3__Impl : ( ruleSComplexTypeExtends ) ;
    public final void rule__SDetailType__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5180:1: ( ( ruleSComplexTypeExtends ) )
            // InternalSms.g:5181:1: ( ruleSComplexTypeExtends )
            {
            // InternalSms.g:5181:1: ( ruleSComplexTypeExtends )
            // InternalSms.g:5182:2: ruleSComplexTypeExtends
            {
             before(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3()); 
            pushFollow(FOLLOW_2);
            ruleSComplexTypeExtends();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getSComplexTypeExtendsParserRuleCall_0_3_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SComplexTypeExtends__Group__0"
    // InternalSms.g:5192:1: rule__SComplexTypeExtends__Group__0 : rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 ;
    public final void rule__SComplexTypeExtends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5196:1: ( rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1 )
            // InternalSms.g:5197:2: rule__SComplexTypeExtends__Group__0__Impl rule__SComplexTypeExtends__Group__1
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
    // InternalSms.g:5204:1: rule__SComplexTypeExtends__Group__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexTypeExtends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5208:1: ( ( 'extends' ) )
            // InternalSms.g:5209:1: ( 'extends' )
            {
            // InternalSms.g:5209:1: ( 'extends' )
            // InternalSms.g:5210:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getExtendsKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSms.g:5219:1: rule__SComplexTypeExtends__Group__1 : rule__SComplexTypeExtends__Group__1__Impl ;
    public final void rule__SComplexTypeExtends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5223:1: ( rule__SComplexTypeExtends__Group__1__Impl )
            // InternalSms.g:5224:2: rule__SComplexTypeExtends__Group__1__Impl
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
    // InternalSms.g:5230:1: rule__SComplexTypeExtends__Group__1__Impl : ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) ;
    public final void rule__SComplexTypeExtends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5234:1: ( ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) ) )
            // InternalSms.g:5235:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            {
            // InternalSms.g:5235:1: ( ( rule__SComplexTypeExtends__SuperTypeAssignment_1 ) )
            // InternalSms.g:5236:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeAssignment_1()); 
            // InternalSms.g:5237:2: ( rule__SComplexTypeExtends__SuperTypeAssignment_1 )
            // InternalSms.g:5237:3: rule__SComplexTypeExtends__SuperTypeAssignment_1
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
    // InternalSms.g:5246:1: rule__SComplexTypeFeatures__Group__0 : rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 ;
    public final void rule__SComplexTypeFeatures__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5250:1: ( rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1 )
            // InternalSms.g:5251:2: rule__SComplexTypeFeatures__Group__0__Impl rule__SComplexTypeFeatures__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSms.g:5258:1: rule__SComplexTypeFeatures__Group__0__Impl : ( '{' ) ;
    public final void rule__SComplexTypeFeatures__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5262:1: ( ( '{' ) )
            // InternalSms.g:5263:1: ( '{' )
            {
            // InternalSms.g:5263:1: ( '{' )
            // InternalSms.g:5264:2: '{'
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
    // InternalSms.g:5273:1: rule__SComplexTypeFeatures__Group__1 : rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 ;
    public final void rule__SComplexTypeFeatures__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5277:1: ( rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2 )
            // InternalSms.g:5278:2: rule__SComplexTypeFeatures__Group__1__Impl rule__SComplexTypeFeatures__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalSms.g:5285:1: rule__SComplexTypeFeatures__Group__1__Impl : ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) ;
    public final void rule__SComplexTypeFeatures__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5289:1: ( ( ( rule__SComplexTypeFeatures__Alternatives_1 )* ) )
            // InternalSms.g:5290:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            {
            // InternalSms.g:5290:1: ( ( rule__SComplexTypeFeatures__Alternatives_1 )* )
            // InternalSms.g:5291:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            {
             before(grammarAccess.getSComplexTypeFeaturesAccess().getAlternatives_1()); 
            // InternalSms.g:5292:2: ( rule__SComplexTypeFeatures__Alternatives_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID||LA53_0==11||(LA53_0>=14 && LA53_0<=15)||LA53_0==24||LA53_0==28||LA53_0==35||LA53_0==37||LA53_0==39||LA53_0==48) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalSms.g:5292:3: rule__SComplexTypeFeatures__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__SComplexTypeFeatures__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalSms.g:5300:1: rule__SComplexTypeFeatures__Group__2 : rule__SComplexTypeFeatures__Group__2__Impl ;
    public final void rule__SComplexTypeFeatures__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5304:1: ( rule__SComplexTypeFeatures__Group__2__Impl )
            // InternalSms.g:5305:2: rule__SComplexTypeFeatures__Group__2__Impl
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
    // InternalSms.g:5311:1: rule__SComplexTypeFeatures__Group__2__Impl : ( '}' ) ;
    public final void rule__SComplexTypeFeatures__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5315:1: ( ( '}' ) )
            // InternalSms.g:5316:1: ( '}' )
            {
            // InternalSms.g:5316:1: ( '}' )
            // InternalSms.g:5317:2: '}'
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
    // InternalSms.g:5327:1: rule__SAssociation__Group_0__0 : rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 ;
    public final void rule__SAssociation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5331:1: ( rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1 )
            // InternalSms.g:5332:2: rule__SAssociation__Group_0__0__Impl rule__SAssociation__Group_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSms.g:5339:1: rule__SAssociation__Group_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAssociation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5343:1: ( ( 'grab' ) )
            // InternalSms.g:5344:1: ( 'grab' )
            {
            // InternalSms.g:5344:1: ( 'grab' )
            // InternalSms.g:5345:2: 'grab'
            {
             before(grammarAccess.getSAssociationAccess().getGrabKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getGrabKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_0__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_0__1"
    // InternalSms.g:5354:1: rule__SAssociation__Group_0__1 : rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 ;
    public final void rule__SAssociation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5358:1: ( rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2 )
            // InternalSms.g:5359:2: rule__SAssociation__Group_0__1__Impl rule__SAssociation__Group_0__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:5366:1: rule__SAssociation__Group_0__1__Impl : ( ( rule__SAssociation__Alternatives_0_1 ) ) ;
    public final void rule__SAssociation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5370:1: ( ( ( rule__SAssociation__Alternatives_0_1 ) ) )
            // InternalSms.g:5371:1: ( ( rule__SAssociation__Alternatives_0_1 ) )
            {
            // InternalSms.g:5371:1: ( ( rule__SAssociation__Alternatives_0_1 ) )
            // InternalSms.g:5372:2: ( rule__SAssociation__Alternatives_0_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_0_1()); 
            // InternalSms.g:5373:2: ( rule__SAssociation__Alternatives_0_1 )
            // InternalSms.g:5373:3: rule__SAssociation__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_0_1()); 

            }


            }

        }
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
    // InternalSms.g:5381:1: rule__SAssociation__Group_0__2 : rule__SAssociation__Group_0__2__Impl ;
    public final void rule__SAssociation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5385:1: ( rule__SAssociation__Group_0__2__Impl )
            // InternalSms.g:5386:2: rule__SAssociation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:5392:1: rule__SAssociation__Group_0__2__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SAssociation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5396:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_0_2 ) ) )
            // InternalSms.g:5397:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSms.g:5397:1: ( ( rule__SAssociation__DeductionRuleAssignment_0_2 ) )
            // InternalSms.g:5398:2: ( rule__SAssociation__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSms.g:5399:2: ( rule__SAssociation__DeductionRuleAssignment_0_2 )
            // InternalSms.g:5399:3: rule__SAssociation__DeductionRuleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAssociation__Group_1__0"
    // InternalSms.g:5408:1: rule__SAssociation__Group_1__0 : rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 ;
    public final void rule__SAssociation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5412:1: ( rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1 )
            // InternalSms.g:5413:2: rule__SAssociation__Group_1__0__Impl rule__SAssociation__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSms.g:5420:1: rule__SAssociation__Group_1__0__Impl : ( 'morph' ) ;
    public final void rule__SAssociation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5424:1: ( ( 'morph' ) )
            // InternalSms.g:5425:1: ( 'morph' )
            {
            // InternalSms.g:5425:1: ( 'morph' )
            // InternalSms.g:5426:2: 'morph'
            {
             before(grammarAccess.getSAssociationAccess().getMorphKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getMorphKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_1__1"
    // InternalSms.g:5435:1: rule__SAssociation__Group_1__1 : rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 ;
    public final void rule__SAssociation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5439:1: ( rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2 )
            // InternalSms.g:5440:2: rule__SAssociation__Group_1__1__Impl rule__SAssociation__Group_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:5447:1: rule__SAssociation__Group_1__1__Impl : ( ( rule__SAssociation__Alternatives_1_1 ) ) ;
    public final void rule__SAssociation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5451:1: ( ( ( rule__SAssociation__Alternatives_1_1 ) ) )
            // InternalSms.g:5452:1: ( ( rule__SAssociation__Alternatives_1_1 ) )
            {
            // InternalSms.g:5452:1: ( ( rule__SAssociation__Alternatives_1_1 ) )
            // InternalSms.g:5453:2: ( rule__SAssociation__Alternatives_1_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1_1()); 
            // InternalSms.g:5454:2: ( rule__SAssociation__Alternatives_1_1 )
            // InternalSms.g:5454:3: rule__SAssociation__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_1_1()); 

            }


            }

        }
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
    // InternalSms.g:5462:1: rule__SAssociation__Group_1__2 : rule__SAssociation__Group_1__2__Impl ;
    public final void rule__SAssociation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5466:1: ( rule__SAssociation__Group_1__2__Impl )
            // InternalSms.g:5467:2: rule__SAssociation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:5473:1: rule__SAssociation__Group_1__2__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SAssociation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5477:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_1_2 ) ) )
            // InternalSms.g:5478:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSms.g:5478:1: ( ( rule__SAssociation__DeductionRuleAssignment_1_2 ) )
            // InternalSms.g:5479:2: ( rule__SAssociation__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSms.g:5480:2: ( rule__SAssociation__DeductionRuleAssignment_1_2 )
            // InternalSms.g:5480:3: rule__SAssociation__DeductionRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAssociation__Group_2__0"
    // InternalSms.g:5489:1: rule__SAssociation__Group_2__0 : rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 ;
    public final void rule__SAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5493:1: ( rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1 )
            // InternalSms.g:5494:2: rule__SAssociation__Group_2__0__Impl rule__SAssociation__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSms.g:5501:1: rule__SAssociation__Group_2__0__Impl : ( 'ditch' ) ;
    public final void rule__SAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5505:1: ( ( 'ditch' ) )
            // InternalSms.g:5506:1: ( 'ditch' )
            {
            // InternalSms.g:5506:1: ( 'ditch' )
            // InternalSms.g:5507:2: 'ditch'
            {
             before(grammarAccess.getSAssociationAccess().getDitchKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getDitchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_2__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_2__1"
    // InternalSms.g:5516:1: rule__SAssociation__Group_2__1 : rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 ;
    public final void rule__SAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5520:1: ( rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2 )
            // InternalSms.g:5521:2: rule__SAssociation__Group_2__1__Impl rule__SAssociation__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:5528:1: rule__SAssociation__Group_2__1__Impl : ( ( rule__SAssociation__Alternatives_2_1 ) ) ;
    public final void rule__SAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5532:1: ( ( ( rule__SAssociation__Alternatives_2_1 ) ) )
            // InternalSms.g:5533:1: ( ( rule__SAssociation__Alternatives_2_1 ) )
            {
            // InternalSms.g:5533:1: ( ( rule__SAssociation__Alternatives_2_1 ) )
            // InternalSms.g:5534:2: ( rule__SAssociation__Alternatives_2_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_2_1()); 
            // InternalSms.g:5535:2: ( rule__SAssociation__Alternatives_2_1 )
            // InternalSms.g:5535:3: rule__SAssociation__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_2_1()); 

            }


            }

        }
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
    // InternalSms.g:5543:1: rule__SAssociation__Group_2__2 : rule__SAssociation__Group_2__2__Impl ;
    public final void rule__SAssociation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5547:1: ( rule__SAssociation__Group_2__2__Impl )
            // InternalSms.g:5548:2: rule__SAssociation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_2__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:5554:1: rule__SAssociation__Group_2__2__Impl : ( ( rule__SAssociation__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SAssociation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5558:1: ( ( ( rule__SAssociation__DeductionRuleAssignment_2_2 ) ) )
            // InternalSms.g:5559:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSms.g:5559:1: ( ( rule__SAssociation__DeductionRuleAssignment_2_2 ) )
            // InternalSms.g:5560:2: ( rule__SAssociation__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSms.g:5561:2: ( rule__SAssociation__DeductionRuleAssignment_2_2 )
            // InternalSms.g:5561:3: rule__SAssociation__DeductionRuleAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__DeductionRuleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getDeductionRuleAssignment_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAssociation__Group_3__0"
    // InternalSms.g:5570:1: rule__SAssociation__Group_3__0 : rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 ;
    public final void rule__SAssociation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5574:1: ( rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1 )
            // InternalSms.g:5575:2: rule__SAssociation__Group_3__0__Impl rule__SAssociation__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSms.g:5582:1: rule__SAssociation__Group_3__0__Impl : ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) ;
    public final void rule__SAssociation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5586:1: ( ( ( rule__SAssociation__DerivedAssignment_3_0 )? ) )
            // InternalSms.g:5587:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            {
            // InternalSms.g:5587:1: ( ( rule__SAssociation__DerivedAssignment_3_0 )? )
            // InternalSms.g:5588:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_3_0()); 
            // InternalSms.g:5589:2: ( rule__SAssociation__DerivedAssignment_3_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSms.g:5589:3: rule__SAssociation__DerivedAssignment_3_0
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
    // InternalSms.g:5597:1: rule__SAssociation__Group_3__1 : rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 ;
    public final void rule__SAssociation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5601:1: ( rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2 )
            // InternalSms.g:5602:2: rule__SAssociation__Group_3__1__Impl rule__SAssociation__Group_3__2
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
    // InternalSms.g:5609:1: rule__SAssociation__Group_3__1__Impl : ( ( rule__SAssociation__Alternatives_3_1 ) ) ;
    public final void rule__SAssociation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5613:1: ( ( ( rule__SAssociation__Alternatives_3_1 ) ) )
            // InternalSms.g:5614:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            {
            // InternalSms.g:5614:1: ( ( rule__SAssociation__Alternatives_3_1 ) )
            // InternalSms.g:5615:2: ( rule__SAssociation__Alternatives_3_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_3_1()); 
            // InternalSms.g:5616:2: ( rule__SAssociation__Alternatives_3_1 )
            // InternalSms.g:5616:3: rule__SAssociation__Alternatives_3_1
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
    // InternalSms.g:5624:1: rule__SAssociation__Group_3__2 : rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 ;
    public final void rule__SAssociation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5628:1: ( rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3 )
            // InternalSms.g:5629:2: rule__SAssociation__Group_3__2__Impl rule__SAssociation__Group_3__3
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
    // InternalSms.g:5636:1: rule__SAssociation__Group_3__2__Impl : ( ( rule__SAssociation__NameAssignment_3_2 ) ) ;
    public final void rule__SAssociation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5640:1: ( ( ( rule__SAssociation__NameAssignment_3_2 ) ) )
            // InternalSms.g:5641:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            {
            // InternalSms.g:5641:1: ( ( rule__SAssociation__NameAssignment_3_2 ) )
            // InternalSms.g:5642:2: ( rule__SAssociation__NameAssignment_3_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_3_2()); 
            // InternalSms.g:5643:2: ( rule__SAssociation__NameAssignment_3_2 )
            // InternalSms.g:5643:3: rule__SAssociation__NameAssignment_3_2
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
    // InternalSms.g:5651:1: rule__SAssociation__Group_3__3 : rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 ;
    public final void rule__SAssociation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5655:1: ( rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4 )
            // InternalSms.g:5656:2: rule__SAssociation__Group_3__3__Impl rule__SAssociation__Group_3__4
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
    // InternalSms.g:5663:1: rule__SAssociation__Group_3__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5667:1: ( ( ':' ) )
            // InternalSms.g:5668:1: ( ':' )
            {
            // InternalSms.g:5668:1: ( ':' )
            // InternalSms.g:5669:2: ':'
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
    // InternalSms.g:5678:1: rule__SAssociation__Group_3__4 : rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 ;
    public final void rule__SAssociation__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5682:1: ( rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5 )
            // InternalSms.g:5683:2: rule__SAssociation__Group_3__4__Impl rule__SAssociation__Group_3__5
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
    // InternalSms.g:5690:1: rule__SAssociation__Group_3__4__Impl : ( ( rule__SAssociation__TypeAssignment_3_4 ) ) ;
    public final void rule__SAssociation__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5694:1: ( ( ( rule__SAssociation__TypeAssignment_3_4 ) ) )
            // InternalSms.g:5695:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            {
            // InternalSms.g:5695:1: ( ( rule__SAssociation__TypeAssignment_3_4 ) )
            // InternalSms.g:5696:2: ( rule__SAssociation__TypeAssignment_3_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_3_4()); 
            // InternalSms.g:5697:2: ( rule__SAssociation__TypeAssignment_3_4 )
            // InternalSms.g:5697:3: rule__SAssociation__TypeAssignment_3_4
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
    // InternalSms.g:5705:1: rule__SAssociation__Group_3__5 : rule__SAssociation__Group_3__5__Impl ;
    public final void rule__SAssociation__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5709:1: ( rule__SAssociation__Group_3__5__Impl )
            // InternalSms.g:5710:2: rule__SAssociation__Group_3__5__Impl
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
    // InternalSms.g:5716:1: rule__SAssociation__Group_3__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) ;
    public final void rule__SAssociation__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5720:1: ( ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? ) )
            // InternalSms.g:5721:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            {
            // InternalSms.g:5721:1: ( ( rule__SAssociation__MultiplicityAssignment_3_5 )? )
            // InternalSms.g:5722:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_3_5()); 
            // InternalSms.g:5723:2: ( rule__SAssociation__MultiplicityAssignment_3_5 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSms.g:5723:3: rule__SAssociation__MultiplicityAssignment_3_5
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
    // InternalSms.g:5732:1: rule__SAssociation__Group_3_1_1__0 : rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 ;
    public final void rule__SAssociation__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5736:1: ( rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1 )
            // InternalSms.g:5737:2: rule__SAssociation__Group_3_1_1__0__Impl rule__SAssociation__Group_3_1_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalSms.g:5744:1: rule__SAssociation__Group_3_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5748:1: ( ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) ) )
            // InternalSms.g:5749:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            {
            // InternalSms.g:5749:1: ( ( rule__SAssociation__KindAssignment_3_1_1_0 ) )
            // InternalSms.g:5750:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_3_1_1_0()); 
            // InternalSms.g:5751:2: ( rule__SAssociation__KindAssignment_3_1_1_0 )
            // InternalSms.g:5751:3: rule__SAssociation__KindAssignment_3_1_1_0
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
    // InternalSms.g:5759:1: rule__SAssociation__Group_3_1_1__1 : rule__SAssociation__Group_3_1_1__1__Impl ;
    public final void rule__SAssociation__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5763:1: ( rule__SAssociation__Group_3_1_1__1__Impl )
            // InternalSms.g:5764:2: rule__SAssociation__Group_3_1_1__1__Impl
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
    // InternalSms.g:5770:1: rule__SAssociation__Group_3_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5774:1: ( ( 'composite' ) )
            // InternalSms.g:5775:1: ( 'composite' )
            {
            // InternalSms.g:5775:1: ( 'composite' )
            // InternalSms.g:5776:2: 'composite'
            {
             before(grammarAccess.getSAssociationAccess().getCompositeKeyword_3_1_1_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSms.g:5786:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5790:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSms.g:5791:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5798:1: rule__SAttribute__Group_0__0__Impl : ( 'grab' ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5802:1: ( ( 'grab' ) )
            // InternalSms.g:5803:1: ( 'grab' )
            {
            // InternalSms.g:5803:1: ( 'grab' )
            // InternalSms.g:5804:2: 'grab'
            {
             before(grammarAccess.getSAttributeAccess().getGrabKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getGrabKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_0__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__1"
    // InternalSms.g:5813:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5817:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSms.g:5818:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5825:1: rule__SAttribute__Group_0__1__Impl : ( ( rule__SAttribute__DetailAssignment_0_1 )? ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5829:1: ( ( ( rule__SAttribute__DetailAssignment_0_1 )? ) )
            // InternalSms.g:5830:1: ( ( rule__SAttribute__DetailAssignment_0_1 )? )
            {
            // InternalSms.g:5830:1: ( ( rule__SAttribute__DetailAssignment_0_1 )? )
            // InternalSms.g:5831:2: ( rule__SAttribute__DetailAssignment_0_1 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_1()); 
            // InternalSms.g:5832:2: ( rule__SAttribute__DetailAssignment_0_1 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSms.g:5832:3: rule__SAttribute__DetailAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getDetailAssignment_0_1()); 

            }


            }

        }
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
    // InternalSms.g:5840:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5844:1: ( rule__SAttribute__Group_0__2__Impl )
            // InternalSms.g:5845:2: rule__SAttribute__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:5851:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5855:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) ) )
            // InternalSms.g:5856:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSms.g:5856:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) )
            // InternalSms.g:5857:2: ( rule__SAttribute__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSms.g:5858:2: ( rule__SAttribute__DeductionRuleAssignment_0_2 )
            // InternalSms.g:5858:3: rule__SAttribute__DeductionRuleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAttribute__Group_1__0"
    // InternalSms.g:5867:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5871:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSms.g:5872:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5879:1: rule__SAttribute__Group_1__0__Impl : ( 'morph' ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5883:1: ( ( 'morph' ) )
            // InternalSms.g:5884:1: ( 'morph' )
            {
            // InternalSms.g:5884:1: ( 'morph' )
            // InternalSms.g:5885:2: 'morph'
            {
             before(grammarAccess.getSAttributeAccess().getMorphKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getMorphKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__1"
    // InternalSms.g:5894:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5898:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSms.g:5899:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5906:1: rule__SAttribute__Group_1__1__Impl : ( ( rule__SAttribute__DetailAssignment_1_1 )? ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5910:1: ( ( ( rule__SAttribute__DetailAssignment_1_1 )? ) )
            // InternalSms.g:5911:1: ( ( rule__SAttribute__DetailAssignment_1_1 )? )
            {
            // InternalSms.g:5911:1: ( ( rule__SAttribute__DetailAssignment_1_1 )? )
            // InternalSms.g:5912:2: ( rule__SAttribute__DetailAssignment_1_1 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_1()); 
            // InternalSms.g:5913:2: ( rule__SAttribute__DetailAssignment_1_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==39) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSms.g:5913:3: rule__SAttribute__DetailAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getDetailAssignment_1_1()); 

            }


            }

        }
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
    // InternalSms.g:5921:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5925:1: ( rule__SAttribute__Group_1__2__Impl )
            // InternalSms.g:5926:2: rule__SAttribute__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:5932:1: rule__SAttribute__Group_1__2__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5936:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_1_2 ) ) )
            // InternalSms.g:5937:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSms.g:5937:1: ( ( rule__SAttribute__DeductionRuleAssignment_1_2 ) )
            // InternalSms.g:5938:2: ( rule__SAttribute__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSms.g:5939:2: ( rule__SAttribute__DeductionRuleAssignment_1_2 )
            // InternalSms.g:5939:3: rule__SAttribute__DeductionRuleAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAttribute__Group_2__0"
    // InternalSms.g:5948:1: rule__SAttribute__Group_2__0 : rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 ;
    public final void rule__SAttribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5952:1: ( rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1 )
            // InternalSms.g:5953:2: rule__SAttribute__Group_2__0__Impl rule__SAttribute__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5960:1: rule__SAttribute__Group_2__0__Impl : ( 'ditch' ) ;
    public final void rule__SAttribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5964:1: ( ( 'ditch' ) )
            // InternalSms.g:5965:1: ( 'ditch' )
            {
            // InternalSms.g:5965:1: ( 'ditch' )
            // InternalSms.g:5966:2: 'ditch'
            {
             before(grammarAccess.getSAttributeAccess().getDitchKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDitchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_2__0__Impl"


    // $ANTLR start "rule__SAttribute__Group_2__1"
    // InternalSms.g:5975:1: rule__SAttribute__Group_2__1 : rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 ;
    public final void rule__SAttribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5979:1: ( rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2 )
            // InternalSms.g:5980:2: rule__SAttribute__Group_2__1__Impl rule__SAttribute__Group_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalSms.g:5987:1: rule__SAttribute__Group_2__1__Impl : ( ( rule__SAttribute__DetailAssignment_2_1 )? ) ;
    public final void rule__SAttribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5991:1: ( ( ( rule__SAttribute__DetailAssignment_2_1 )? ) )
            // InternalSms.g:5992:1: ( ( rule__SAttribute__DetailAssignment_2_1 )? )
            {
            // InternalSms.g:5992:1: ( ( rule__SAttribute__DetailAssignment_2_1 )? )
            // InternalSms.g:5993:2: ( rule__SAttribute__DetailAssignment_2_1 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_2_1()); 
            // InternalSms.g:5994:2: ( rule__SAttribute__DetailAssignment_2_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==39) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalSms.g:5994:3: rule__SAttribute__DetailAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getDetailAssignment_2_1()); 

            }


            }

        }
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
    // InternalSms.g:6002:1: rule__SAttribute__Group_2__2 : rule__SAttribute__Group_2__2__Impl ;
    public final void rule__SAttribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6006:1: ( rule__SAttribute__Group_2__2__Impl )
            // InternalSms.g:6007:2: rule__SAttribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_2__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:6013:1: rule__SAttribute__Group_2__2__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_2_2 ) ) ;
    public final void rule__SAttribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6017:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_2_2 ) ) )
            // InternalSms.g:6018:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_2 ) )
            {
            // InternalSms.g:6018:1: ( ( rule__SAttribute__DeductionRuleAssignment_2_2 ) )
            // InternalSms.g:6019:2: ( rule__SAttribute__DeductionRuleAssignment_2_2 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_2()); 
            // InternalSms.g:6020:2: ( rule__SAttribute__DeductionRuleAssignment_2_2 )
            // InternalSms.g:6020:3: rule__SAttribute__DeductionRuleAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__DeductionRuleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAttribute__Group_3__0"
    // InternalSms.g:6029:1: rule__SAttribute__Group_3__0 : rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 ;
    public final void rule__SAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6033:1: ( rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1 )
            // InternalSms.g:6034:2: rule__SAttribute__Group_3__0__Impl rule__SAttribute__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSms.g:6041:1: rule__SAttribute__Group_3__0__Impl : ( ( rule__SAttribute__DetailAssignment_3_0 )? ) ;
    public final void rule__SAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6045:1: ( ( ( rule__SAttribute__DetailAssignment_3_0 )? ) )
            // InternalSms.g:6046:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            {
            // InternalSms.g:6046:1: ( ( rule__SAttribute__DetailAssignment_3_0 )? )
            // InternalSms.g:6047:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_3_0()); 
            // InternalSms.g:6048:2: ( rule__SAttribute__DetailAssignment_3_0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSms.g:6048:3: rule__SAttribute__DetailAssignment_3_0
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
    // InternalSms.g:6056:1: rule__SAttribute__Group_3__1 : rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 ;
    public final void rule__SAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6060:1: ( rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2 )
            // InternalSms.g:6061:2: rule__SAttribute__Group_3__1__Impl rule__SAttribute__Group_3__2
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
    // InternalSms.g:6068:1: rule__SAttribute__Group_3__1__Impl : ( ( rule__SAttribute__NameAssignment_3_1 ) ) ;
    public final void rule__SAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6072:1: ( ( ( rule__SAttribute__NameAssignment_3_1 ) ) )
            // InternalSms.g:6073:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            {
            // InternalSms.g:6073:1: ( ( rule__SAttribute__NameAssignment_3_1 ) )
            // InternalSms.g:6074:2: ( rule__SAttribute__NameAssignment_3_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_3_1()); 
            // InternalSms.g:6075:2: ( rule__SAttribute__NameAssignment_3_1 )
            // InternalSms.g:6075:3: rule__SAttribute__NameAssignment_3_1
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
    // InternalSms.g:6083:1: rule__SAttribute__Group_3__2 : rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 ;
    public final void rule__SAttribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6087:1: ( rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3 )
            // InternalSms.g:6088:2: rule__SAttribute__Group_3__2__Impl rule__SAttribute__Group_3__3
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
    // InternalSms.g:6095:1: rule__SAttribute__Group_3__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6099:1: ( ( ':' ) )
            // InternalSms.g:6100:1: ( ':' )
            {
            // InternalSms.g:6100:1: ( ':' )
            // InternalSms.g:6101:2: ':'
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
    // InternalSms.g:6110:1: rule__SAttribute__Group_3__3 : rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 ;
    public final void rule__SAttribute__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6114:1: ( rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4 )
            // InternalSms.g:6115:2: rule__SAttribute__Group_3__3__Impl rule__SAttribute__Group_3__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalSms.g:6122:1: rule__SAttribute__Group_3__3__Impl : ( ( rule__SAttribute__TypeAssignment_3_3 ) ) ;
    public final void rule__SAttribute__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6126:1: ( ( ( rule__SAttribute__TypeAssignment_3_3 ) ) )
            // InternalSms.g:6127:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            {
            // InternalSms.g:6127:1: ( ( rule__SAttribute__TypeAssignment_3_3 ) )
            // InternalSms.g:6128:2: ( rule__SAttribute__TypeAssignment_3_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_3_3()); 
            // InternalSms.g:6129:2: ( rule__SAttribute__TypeAssignment_3_3 )
            // InternalSms.g:6129:3: rule__SAttribute__TypeAssignment_3_3
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
    // InternalSms.g:6137:1: rule__SAttribute__Group_3__4 : rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 ;
    public final void rule__SAttribute__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6141:1: ( rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5 )
            // InternalSms.g:6142:2: rule__SAttribute__Group_3__4__Impl rule__SAttribute__Group_3__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalSms.g:6149:1: rule__SAttribute__Group_3__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) ;
    public final void rule__SAttribute__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6153:1: ( ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? ) )
            // InternalSms.g:6154:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            {
            // InternalSms.g:6154:1: ( ( rule__SAttribute__MultiplicityAssignment_3_4 )? )
            // InternalSms.g:6155:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_3_4()); 
            // InternalSms.g:6156:2: ( rule__SAttribute__MultiplicityAssignment_3_4 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalSms.g:6156:3: rule__SAttribute__MultiplicityAssignment_3_4
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
    // InternalSms.g:6164:1: rule__SAttribute__Group_3__5 : rule__SAttribute__Group_3__5__Impl ;
    public final void rule__SAttribute__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6168:1: ( rule__SAttribute__Group_3__5__Impl )
            // InternalSms.g:6169:2: rule__SAttribute__Group_3__5__Impl
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
    // InternalSms.g:6175:1: rule__SAttribute__Group_3__5__Impl : ( ( rule__SAttribute__KeyAssignment_3_5 )? ) ;
    public final void rule__SAttribute__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6179:1: ( ( ( rule__SAttribute__KeyAssignment_3_5 )? ) )
            // InternalSms.g:6180:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            {
            // InternalSms.g:6180:1: ( ( rule__SAttribute__KeyAssignment_3_5 )? )
            // InternalSms.g:6181:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_3_5()); 
            // InternalSms.g:6182:2: ( rule__SAttribute__KeyAssignment_3_5 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalSms.g:6182:3: rule__SAttribute__KeyAssignment_3_5
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
    // InternalSms.g:6191:1: rule__SQuery__Group_0__0 : rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 ;
    public final void rule__SQuery__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6195:1: ( rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1 )
            // InternalSms.g:6196:2: rule__SQuery__Group_0__0__Impl rule__SQuery__Group_0__1
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
    // InternalSms.g:6203:1: rule__SQuery__Group_0__0__Impl : ( ( rule__SQuery__Alternatives_0_0 ) ) ;
    public final void rule__SQuery__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6207:1: ( ( ( rule__SQuery__Alternatives_0_0 ) ) )
            // InternalSms.g:6208:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            {
            // InternalSms.g:6208:1: ( ( rule__SQuery__Alternatives_0_0 ) )
            // InternalSms.g:6209:2: ( rule__SQuery__Alternatives_0_0 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_0()); 
            // InternalSms.g:6210:2: ( rule__SQuery__Alternatives_0_0 )
            // InternalSms.g:6210:3: rule__SQuery__Alternatives_0_0
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
    // InternalSms.g:6218:1: rule__SQuery__Group_0__1 : rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 ;
    public final void rule__SQuery__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6222:1: ( rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2 )
            // InternalSms.g:6223:2: rule__SQuery__Group_0__1__Impl rule__SQuery__Group_0__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalSms.g:6230:1: rule__SQuery__Group_0__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6234:1: ( ( '(' ) )
            // InternalSms.g:6235:1: ( '(' )
            {
            // InternalSms.g:6235:1: ( '(' )
            // InternalSms.g:6236:2: '('
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
    // InternalSms.g:6245:1: rule__SQuery__Group_0__2 : rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 ;
    public final void rule__SQuery__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6249:1: ( rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3 )
            // InternalSms.g:6250:2: rule__SQuery__Group_0__2__Impl rule__SQuery__Group_0__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalSms.g:6257:1: rule__SQuery__Group_0__2__Impl : ( ( rule__SQuery__Alternatives_0_2 ) ) ;
    public final void rule__SQuery__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6261:1: ( ( ( rule__SQuery__Alternatives_0_2 ) ) )
            // InternalSms.g:6262:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            {
            // InternalSms.g:6262:1: ( ( rule__SQuery__Alternatives_0_2 ) )
            // InternalSms.g:6263:2: ( rule__SQuery__Alternatives_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getAlternatives_0_2()); 
            // InternalSms.g:6264:2: ( rule__SQuery__Alternatives_0_2 )
            // InternalSms.g:6264:3: rule__SQuery__Alternatives_0_2
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
    // InternalSms.g:6272:1: rule__SQuery__Group_0__3 : rule__SQuery__Group_0__3__Impl ;
    public final void rule__SQuery__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6276:1: ( rule__SQuery__Group_0__3__Impl )
            // InternalSms.g:6277:2: rule__SQuery__Group_0__3__Impl
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
    // InternalSms.g:6283:1: rule__SQuery__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6287:1: ( ( ')' ) )
            // InternalSms.g:6288:1: ( ')' )
            {
            // InternalSms.g:6288:1: ( ')' )
            // InternalSms.g:6289:2: ')'
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
    // InternalSms.g:6299:1: rule__SQuery__Group_0_0_0__0 : rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 ;
    public final void rule__SQuery__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6303:1: ( rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1 )
            // InternalSms.g:6304:2: rule__SQuery__Group_0_0_0__0__Impl rule__SQuery__Group_0_0_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSms.g:6311:1: rule__SQuery__Group_0_0_0__0__Impl : ( 'grab' ) ;
    public final void rule__SQuery__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6315:1: ( ( 'grab' ) )
            // InternalSms.g:6316:1: ( 'grab' )
            {
            // InternalSms.g:6316:1: ( 'grab' )
            // InternalSms.g:6317:2: 'grab'
            {
             before(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getGrabKeyword_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_0__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_0__1"
    // InternalSms.g:6326:1: rule__SQuery__Group_0_0_0__1 : rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 ;
    public final void rule__SQuery__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6330:1: ( rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2 )
            // InternalSms.g:6331:2: rule__SQuery__Group_0_0_0__1__Impl rule__SQuery__Group_0_0_0__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:6338:1: rule__SQuery__Group_0_0_0__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6342:1: ( ( 'query' ) )
            // InternalSms.g:6343:1: ( 'query' )
            {
            // InternalSms.g:6343:1: ( 'query' )
            // InternalSms.g:6344:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_0_1()); 

            }


            }

        }
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
    // InternalSms.g:6353:1: rule__SQuery__Group_0_0_0__2 : rule__SQuery__Group_0_0_0__2__Impl ;
    public final void rule__SQuery__Group_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6357:1: ( rule__SQuery__Group_0_0_0__2__Impl )
            // InternalSms.g:6358:2: rule__SQuery__Group_0_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:6364:1: rule__SQuery__Group_0_0_0__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 ) ) ;
    public final void rule__SQuery__Group_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6368:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 ) ) )
            // InternalSms.g:6369:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 ) )
            {
            // InternalSms.g:6369:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 ) )
            // InternalSms.g:6370:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_2()); 
            // InternalSms.g:6371:2: ( rule__SQuery__DeductionRuleAssignment_0_0_0_2 )
            // InternalSms.g:6371:3: rule__SQuery__DeductionRuleAssignment_0_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__DeductionRuleAssignment_0_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQuery__Group_0_0_1__0"
    // InternalSms.g:6380:1: rule__SQuery__Group_0_0_1__0 : rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 ;
    public final void rule__SQuery__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6384:1: ( rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1 )
            // InternalSms.g:6385:2: rule__SQuery__Group_0_0_1__0__Impl rule__SQuery__Group_0_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSms.g:6392:1: rule__SQuery__Group_0_0_1__0__Impl : ( 'morph' ) ;
    public final void rule__SQuery__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6396:1: ( ( 'morph' ) )
            // InternalSms.g:6397:1: ( 'morph' )
            {
            // InternalSms.g:6397:1: ( 'morph' )
            // InternalSms.g:6398:2: 'morph'
            {
             before(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getMorphKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_0_0_1__1"
    // InternalSms.g:6407:1: rule__SQuery__Group_0_0_1__1 : rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 ;
    public final void rule__SQuery__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6411:1: ( rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2 )
            // InternalSms.g:6412:2: rule__SQuery__Group_0_0_1__1__Impl rule__SQuery__Group_0_0_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:6419:1: rule__SQuery__Group_0_0_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6423:1: ( ( 'query' ) )
            // InternalSms.g:6424:1: ( 'query' )
            {
            // InternalSms.g:6424:1: ( 'query' )
            // InternalSms.g:6425:2: 'query'
            {
             before(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getQueryKeyword_0_0_1_1()); 

            }


            }

        }
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
    // InternalSms.g:6434:1: rule__SQuery__Group_0_0_1__2 : rule__SQuery__Group_0_0_1__2__Impl ;
    public final void rule__SQuery__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6438:1: ( rule__SQuery__Group_0_0_1__2__Impl )
            // InternalSms.g:6439:2: rule__SQuery__Group_0_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_0_0_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:6445:1: rule__SQuery__Group_0_0_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 ) ) ;
    public final void rule__SQuery__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6449:1: ( ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 ) ) )
            // InternalSms.g:6450:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 ) )
            {
            // InternalSms.g:6450:1: ( ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 ) )
            // InternalSms.g:6451:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_2()); 
            // InternalSms.g:6452:2: ( rule__SQuery__DeductionRuleAssignment_0_0_1_2 )
            // InternalSms.g:6452:3: rule__SQuery__DeductionRuleAssignment_0_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__DeductionRuleAssignment_0_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_0_0_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQuery__Group_0_2_1__0"
    // InternalSms.g:6461:1: rule__SQuery__Group_0_2_1__0 : rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 ;
    public final void rule__SQuery__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6465:1: ( rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1 )
            // InternalSms.g:6466:2: rule__SQuery__Group_0_2_1__0__Impl rule__SQuery__Group_0_2_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSms.g:6473:1: rule__SQuery__Group_0_2_1__0__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) ;
    public final void rule__SQuery__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6477:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) ) )
            // InternalSms.g:6478:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            {
            // InternalSms.g:6478:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_0 ) )
            // InternalSms.g:6479:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_0()); 
            // InternalSms.g:6480:2: ( rule__SQuery__ParametersAssignment_0_2_1_0 )
            // InternalSms.g:6480:3: rule__SQuery__ParametersAssignment_0_2_1_0
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
    // InternalSms.g:6488:1: rule__SQuery__Group_0_2_1__1 : rule__SQuery__Group_0_2_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6492:1: ( rule__SQuery__Group_0_2_1__1__Impl )
            // InternalSms.g:6493:2: rule__SQuery__Group_0_2_1__1__Impl
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
    // InternalSms.g:6499:1: rule__SQuery__Group_0_2_1__1__Impl : ( ( rule__SQuery__Group_0_2_1_1__0 )* ) ;
    public final void rule__SQuery__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6503:1: ( ( ( rule__SQuery__Group_0_2_1_1__0 )* ) )
            // InternalSms.g:6504:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            {
            // InternalSms.g:6504:1: ( ( rule__SQuery__Group_0_2_1_1__0 )* )
            // InternalSms.g:6505:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_0_2_1_1()); 
            // InternalSms.g:6506:2: ( rule__SQuery__Group_0_2_1_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==34) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalSms.g:6506:3: rule__SQuery__Group_0_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SQuery__Group_0_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalSms.g:6515:1: rule__SQuery__Group_0_2_1_1__0 : rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 ;
    public final void rule__SQuery__Group_0_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6519:1: ( rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1 )
            // InternalSms.g:6520:2: rule__SQuery__Group_0_2_1_1__0__Impl rule__SQuery__Group_0_2_1_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSms.g:6527:1: rule__SQuery__Group_0_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_0_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6531:1: ( ( ',' ) )
            // InternalSms.g:6532:1: ( ',' )
            {
            // InternalSms.g:6532:1: ( ',' )
            // InternalSms.g:6533:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_0_2_1_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSms.g:6542:1: rule__SQuery__Group_0_2_1_1__1 : rule__SQuery__Group_0_2_1_1__1__Impl ;
    public final void rule__SQuery__Group_0_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6546:1: ( rule__SQuery__Group_0_2_1_1__1__Impl )
            // InternalSms.g:6547:2: rule__SQuery__Group_0_2_1_1__1__Impl
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
    // InternalSms.g:6553:1: rule__SQuery__Group_0_2_1_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) ;
    public final void rule__SQuery__Group_0_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6557:1: ( ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) ) )
            // InternalSms.g:6558:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            {
            // InternalSms.g:6558:1: ( ( rule__SQuery__ParametersAssignment_0_2_1_1_1 ) )
            // InternalSms.g:6559:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_0_2_1_1_1()); 
            // InternalSms.g:6560:2: ( rule__SQuery__ParametersAssignment_0_2_1_1_1 )
            // InternalSms.g:6560:3: rule__SQuery__ParametersAssignment_0_2_1_1_1
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
    // InternalSms.g:6569:1: rule__SQuery__Group_1__0 : rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 ;
    public final void rule__SQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6573:1: ( rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1 )
            // InternalSms.g:6574:2: rule__SQuery__Group_1__0__Impl rule__SQuery__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalSms.g:6581:1: rule__SQuery__Group_1__0__Impl : ( 'ditch' ) ;
    public final void rule__SQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6585:1: ( ( 'ditch' ) )
            // InternalSms.g:6586:1: ( 'ditch' )
            {
            // InternalSms.g:6586:1: ( 'ditch' )
            // InternalSms.g:6587:2: 'ditch'
            {
             before(grammarAccess.getSQueryAccess().getDitchKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSms.g:6596:1: rule__SQuery__Group_1__1 : rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 ;
    public final void rule__SQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6600:1: ( rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2 )
            // InternalSms.g:6601:2: rule__SQuery__Group_1__1__Impl rule__SQuery__Group_1__2
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
    // InternalSms.g:6608:1: rule__SQuery__Group_1__1__Impl : ( 'query' ) ;
    public final void rule__SQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6612:1: ( ( 'query' ) )
            // InternalSms.g:6613:1: ( 'query' )
            {
            // InternalSms.g:6613:1: ( 'query' )
            // InternalSms.g:6614:2: 'query'
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
    // InternalSms.g:6623:1: rule__SQuery__Group_1__2 : rule__SQuery__Group_1__2__Impl ;
    public final void rule__SQuery__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6627:1: ( rule__SQuery__Group_1__2__Impl )
            // InternalSms.g:6628:2: rule__SQuery__Group_1__2__Impl
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
    // InternalSms.g:6634:1: rule__SQuery__Group_1__2__Impl : ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) ;
    public final void rule__SQuery__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6638:1: ( ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) ) )
            // InternalSms.g:6639:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            {
            // InternalSms.g:6639:1: ( ( rule__SQuery__DeductionRuleAssignment_1_2 ) )
            // InternalSms.g:6640:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleAssignment_1_2()); 
            // InternalSms.g:6641:2: ( rule__SQuery__DeductionRuleAssignment_1_2 )
            // InternalSms.g:6641:3: rule__SQuery__DeductionRuleAssignment_1_2
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
    // InternalSms.g:6650:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6654:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSms.g:6655:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
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
    // InternalSms.g:6662:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__NameAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6666:1: ( ( ( rule__SQuery__NameAssignment_2_0 ) ) )
            // InternalSms.g:6667:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            {
            // InternalSms.g:6667:1: ( ( rule__SQuery__NameAssignment_2_0 ) )
            // InternalSms.g:6668:2: ( rule__SQuery__NameAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_2_0()); 
            // InternalSms.g:6669:2: ( rule__SQuery__NameAssignment_2_0 )
            // InternalSms.g:6669:3: rule__SQuery__NameAssignment_2_0
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
    // InternalSms.g:6677:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6681:1: ( rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2 )
            // InternalSms.g:6682:2: rule__SQuery__Group_2__1__Impl rule__SQuery__Group_2__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalSms.g:6689:1: rule__SQuery__Group_2__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6693:1: ( ( '(' ) )
            // InternalSms.g:6694:1: ( '(' )
            {
            // InternalSms.g:6694:1: ( '(' )
            // InternalSms.g:6695:2: '('
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
    // InternalSms.g:6704:1: rule__SQuery__Group_2__2 : rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 ;
    public final void rule__SQuery__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6708:1: ( rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3 )
            // InternalSms.g:6709:2: rule__SQuery__Group_2__2__Impl rule__SQuery__Group_2__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalSms.g:6716:1: rule__SQuery__Group_2__2__Impl : ( ( rule__SQuery__Group_2_2__0 )? ) ;
    public final void rule__SQuery__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6720:1: ( ( ( rule__SQuery__Group_2_2__0 )? ) )
            // InternalSms.g:6721:1: ( ( rule__SQuery__Group_2_2__0 )? )
            {
            // InternalSms.g:6721:1: ( ( rule__SQuery__Group_2_2__0 )? )
            // InternalSms.g:6722:2: ( rule__SQuery__Group_2_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2()); 
            // InternalSms.g:6723:2: ( rule__SQuery__Group_2_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==24||LA63_0==35||LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSms.g:6723:3: rule__SQuery__Group_2_2__0
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
    // InternalSms.g:6731:1: rule__SQuery__Group_2__3 : rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 ;
    public final void rule__SQuery__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6735:1: ( rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4 )
            // InternalSms.g:6736:2: rule__SQuery__Group_2__3__Impl rule__SQuery__Group_2__4
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
    // InternalSms.g:6743:1: rule__SQuery__Group_2__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6747:1: ( ( ')' ) )
            // InternalSms.g:6748:1: ( ')' )
            {
            // InternalSms.g:6748:1: ( ')' )
            // InternalSms.g:6749:2: ')'
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
    // InternalSms.g:6758:1: rule__SQuery__Group_2__4 : rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 ;
    public final void rule__SQuery__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6762:1: ( rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5 )
            // InternalSms.g:6763:2: rule__SQuery__Group_2__4__Impl rule__SQuery__Group_2__5
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
    // InternalSms.g:6770:1: rule__SQuery__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6774:1: ( ( ':' ) )
            // InternalSms.g:6775:1: ( ':' )
            {
            // InternalSms.g:6775:1: ( ':' )
            // InternalSms.g:6776:2: ':'
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
    // InternalSms.g:6785:1: rule__SQuery__Group_2__5 : rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 ;
    public final void rule__SQuery__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6789:1: ( rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6 )
            // InternalSms.g:6790:2: rule__SQuery__Group_2__5__Impl rule__SQuery__Group_2__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalSms.g:6797:1: rule__SQuery__Group_2__5__Impl : ( ( rule__SQuery__TypeAssignment_2_5 ) ) ;
    public final void rule__SQuery__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6801:1: ( ( ( rule__SQuery__TypeAssignment_2_5 ) ) )
            // InternalSms.g:6802:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            {
            // InternalSms.g:6802:1: ( ( rule__SQuery__TypeAssignment_2_5 ) )
            // InternalSms.g:6803:2: ( rule__SQuery__TypeAssignment_2_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_2_5()); 
            // InternalSms.g:6804:2: ( rule__SQuery__TypeAssignment_2_5 )
            // InternalSms.g:6804:3: rule__SQuery__TypeAssignment_2_5
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
    // InternalSms.g:6812:1: rule__SQuery__Group_2__6 : rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 ;
    public final void rule__SQuery__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6816:1: ( rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7 )
            // InternalSms.g:6817:2: rule__SQuery__Group_2__6__Impl rule__SQuery__Group_2__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalSms.g:6824:1: rule__SQuery__Group_2__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) ;
    public final void rule__SQuery__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6828:1: ( ( ( rule__SQuery__MultiplicityAssignment_2_6 )? ) )
            // InternalSms.g:6829:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            {
            // InternalSms.g:6829:1: ( ( rule__SQuery__MultiplicityAssignment_2_6 )? )
            // InternalSms.g:6830:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_2_6()); 
            // InternalSms.g:6831:2: ( rule__SQuery__MultiplicityAssignment_2_6 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==40) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalSms.g:6831:3: rule__SQuery__MultiplicityAssignment_2_6
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
    // InternalSms.g:6839:1: rule__SQuery__Group_2__7 : rule__SQuery__Group_2__7__Impl ;
    public final void rule__SQuery__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6843:1: ( rule__SQuery__Group_2__7__Impl )
            // InternalSms.g:6844:2: rule__SQuery__Group_2__7__Impl
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
    // InternalSms.g:6850:1: rule__SQuery__Group_2__7__Impl : ( ( rule__SQuery__Group_2_7__0 )? ) ;
    public final void rule__SQuery__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6854:1: ( ( ( rule__SQuery__Group_2_7__0 )? ) )
            // InternalSms.g:6855:1: ( ( rule__SQuery__Group_2_7__0 )? )
            {
            // InternalSms.g:6855:1: ( ( rule__SQuery__Group_2_7__0 )? )
            // InternalSms.g:6856:2: ( rule__SQuery__Group_2_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_7()); 
            // InternalSms.g:6857:2: ( rule__SQuery__Group_2_7__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==43) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalSms.g:6857:3: rule__SQuery__Group_2_7__0
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
    // InternalSms.g:6866:1: rule__SQuery__Group_2_2__0 : rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 ;
    public final void rule__SQuery__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6870:1: ( rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1 )
            // InternalSms.g:6871:2: rule__SQuery__Group_2_2__0__Impl rule__SQuery__Group_2_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSms.g:6878:1: rule__SQuery__Group_2_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) ;
    public final void rule__SQuery__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6882:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_0 ) ) )
            // InternalSms.g:6883:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            {
            // InternalSms.g:6883:1: ( ( rule__SQuery__ParametersAssignment_2_2_0 ) )
            // InternalSms.g:6884:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_0()); 
            // InternalSms.g:6885:2: ( rule__SQuery__ParametersAssignment_2_2_0 )
            // InternalSms.g:6885:3: rule__SQuery__ParametersAssignment_2_2_0
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
    // InternalSms.g:6893:1: rule__SQuery__Group_2_2__1 : rule__SQuery__Group_2_2__1__Impl ;
    public final void rule__SQuery__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6897:1: ( rule__SQuery__Group_2_2__1__Impl )
            // InternalSms.g:6898:2: rule__SQuery__Group_2_2__1__Impl
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
    // InternalSms.g:6904:1: rule__SQuery__Group_2_2__1__Impl : ( ( rule__SQuery__Group_2_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6908:1: ( ( ( rule__SQuery__Group_2_2_1__0 )* ) )
            // InternalSms.g:6909:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            {
            // InternalSms.g:6909:1: ( ( rule__SQuery__Group_2_2_1__0 )* )
            // InternalSms.g:6910:2: ( rule__SQuery__Group_2_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_2_1()); 
            // InternalSms.g:6911:2: ( rule__SQuery__Group_2_2_1__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==34) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSms.g:6911:3: rule__SQuery__Group_2_2_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SQuery__Group_2_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // InternalSms.g:6920:1: rule__SQuery__Group_2_2_1__0 : rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 ;
    public final void rule__SQuery__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6924:1: ( rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1 )
            // InternalSms.g:6925:2: rule__SQuery__Group_2_2_1__0__Impl rule__SQuery__Group_2_2_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalSms.g:6932:1: rule__SQuery__Group_2_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6936:1: ( ( ',' ) )
            // InternalSms.g:6937:1: ( ',' )
            {
            // InternalSms.g:6937:1: ( ',' )
            // InternalSms.g:6938:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_2_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSms.g:6947:1: rule__SQuery__Group_2_2_1__1 : rule__SQuery__Group_2_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6951:1: ( rule__SQuery__Group_2_2_1__1__Impl )
            // InternalSms.g:6952:2: rule__SQuery__Group_2_2_1__1__Impl
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
    // InternalSms.g:6958:1: rule__SQuery__Group_2_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6962:1: ( ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) ) )
            // InternalSms.g:6963:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            {
            // InternalSms.g:6963:1: ( ( rule__SQuery__ParametersAssignment_2_2_1_1 ) )
            // InternalSms.g:6964:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_2_1_1()); 
            // InternalSms.g:6965:2: ( rule__SQuery__ParametersAssignment_2_2_1_1 )
            // InternalSms.g:6965:3: rule__SQuery__ParametersAssignment_2_2_1_1
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
    // InternalSms.g:6974:1: rule__SQuery__Group_2_7__0 : rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 ;
    public final void rule__SQuery__Group_2_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6978:1: ( rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1 )
            // InternalSms.g:6979:2: rule__SQuery__Group_2_7__0__Impl rule__SQuery__Group_2_7__1
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
    // InternalSms.g:6986:1: rule__SQuery__Group_2_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_2_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:6990:1: ( ( 'returns' ) )
            // InternalSms.g:6991:1: ( 'returns' )
            {
            // InternalSms.g:6991:1: ( 'returns' )
            // InternalSms.g:6992:2: 'returns'
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
    // InternalSms.g:7001:1: rule__SQuery__Group_2_7__1 : rule__SQuery__Group_2_7__1__Impl ;
    public final void rule__SQuery__Group_2_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7005:1: ( rule__SQuery__Group_2_7__1__Impl )
            // InternalSms.g:7006:2: rule__SQuery__Group_2_7__1__Impl
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
    // InternalSms.g:7012:1: rule__SQuery__Group_2_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) ;
    public final void rule__SQuery__Group_2_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7016:1: ( ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) ) )
            // InternalSms.g:7017:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            {
            // InternalSms.g:7017:1: ( ( rule__SQuery__ReturnsAssignment_2_7_1 ) )
            // InternalSms.g:7018:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_2_7_1()); 
            // InternalSms.g:7019:2: ( rule__SQuery__ReturnsAssignment_2_7_1 )
            // InternalSms.g:7019:3: rule__SQuery__ReturnsAssignment_2_7_1
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
    // InternalSms.g:7028:1: rule__SQueryParameter__Group_0__0 : rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 ;
    public final void rule__SQueryParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7032:1: ( rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1 )
            // InternalSms.g:7033:2: rule__SQueryParameter__Group_0__0__Impl rule__SQueryParameter__Group_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:7040:1: rule__SQueryParameter__Group_0__0__Impl : ( 'grab' ) ;
    public final void rule__SQueryParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7044:1: ( ( 'grab' ) )
            // InternalSms.g:7045:1: ( 'grab' )
            {
            // InternalSms.g:7045:1: ( 'grab' )
            // InternalSms.g:7046:2: 'grab'
            {
             before(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getGrabKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_0__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_0__1"
    // InternalSms.g:7055:1: rule__SQueryParameter__Group_0__1 : rule__SQueryParameter__Group_0__1__Impl ;
    public final void rule__SQueryParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7059:1: ( rule__SQueryParameter__Group_0__1__Impl )
            // InternalSms.g:7060:2: rule__SQueryParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:7066:1: rule__SQueryParameter__Group_0__1__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_0_1 ) ) ;
    public final void rule__SQueryParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7070:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_0_1 ) ) )
            // InternalSms.g:7071:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_1 ) )
            {
            // InternalSms.g:7071:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_0_1 ) )
            // InternalSms.g:7072:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_1 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_1()); 
            // InternalSms.g:7073:2: ( rule__SQueryParameter__DeductionRuleAssignment_0_1 )
            // InternalSms.g:7073:3: rule__SQueryParameter__DeductionRuleAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQueryParameter__Group_1__0"
    // InternalSms.g:7082:1: rule__SQueryParameter__Group_1__0 : rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 ;
    public final void rule__SQueryParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7086:1: ( rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1 )
            // InternalSms.g:7087:2: rule__SQueryParameter__Group_1__0__Impl rule__SQueryParameter__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:7094:1: rule__SQueryParameter__Group_1__0__Impl : ( 'morph' ) ;
    public final void rule__SQueryParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7098:1: ( ( 'morph' ) )
            // InternalSms.g:7099:1: ( 'morph' )
            {
            // InternalSms.g:7099:1: ( 'morph' )
            // InternalSms.g:7100:2: 'morph'
            {
             before(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getMorphKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_1__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_1__1"
    // InternalSms.g:7109:1: rule__SQueryParameter__Group_1__1 : rule__SQueryParameter__Group_1__1__Impl ;
    public final void rule__SQueryParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7113:1: ( rule__SQueryParameter__Group_1__1__Impl )
            // InternalSms.g:7114:2: rule__SQueryParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:7120:1: rule__SQueryParameter__Group_1__1__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_1_1 ) ) ;
    public final void rule__SQueryParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7124:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_1_1 ) ) )
            // InternalSms.g:7125:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_1 ) )
            {
            // InternalSms.g:7125:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_1_1 ) )
            // InternalSms.g:7126:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_1 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_1()); 
            // InternalSms.g:7127:2: ( rule__SQueryParameter__DeductionRuleAssignment_1_1 )
            // InternalSms.g:7127:3: rule__SQueryParameter__DeductionRuleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQueryParameter__Group_2__0"
    // InternalSms.g:7136:1: rule__SQueryParameter__Group_2__0 : rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 ;
    public final void rule__SQueryParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7140:1: ( rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1 )
            // InternalSms.g:7141:2: rule__SQueryParameter__Group_2__0__Impl rule__SQueryParameter__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:7148:1: rule__SQueryParameter__Group_2__0__Impl : ( 'ditch' ) ;
    public final void rule__SQueryParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7152:1: ( ( 'ditch' ) )
            // InternalSms.g:7153:1: ( 'ditch' )
            {
            // InternalSms.g:7153:1: ( 'ditch' )
            // InternalSms.g:7154:2: 'ditch'
            {
             before(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getDitchKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__1"
    // InternalSms.g:7163:1: rule__SQueryParameter__Group_2__1 : rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 ;
    public final void rule__SQueryParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7167:1: ( rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2 )
            // InternalSms.g:7168:2: rule__SQueryParameter__Group_2__1__Impl rule__SQueryParameter__Group_2__2
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
    // InternalSms.g:7175:1: rule__SQueryParameter__Group_2__1__Impl : ( ( rule__SQueryParameter__DeductionRuleAssignment_2_1 ) ) ;
    public final void rule__SQueryParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7179:1: ( ( ( rule__SQueryParameter__DeductionRuleAssignment_2_1 ) ) )
            // InternalSms.g:7180:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_1 ) )
            {
            // InternalSms.g:7180:1: ( ( rule__SQueryParameter__DeductionRuleAssignment_2_1 ) )
            // InternalSms.g:7181:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_1 )
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_1()); 
            // InternalSms.g:7182:2: ( rule__SQueryParameter__DeductionRuleAssignment_2_1 )
            // InternalSms.g:7182:3: rule__SQueryParameter__DeductionRuleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__DeductionRuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleAssignment_2_1()); 

            }


            }

        }
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
    // InternalSms.g:7190:1: rule__SQueryParameter__Group_2__2 : rule__SQueryParameter__Group_2__2__Impl rule__SQueryParameter__Group_2__3 ;
    public final void rule__SQueryParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7194:1: ( rule__SQueryParameter__Group_2__2__Impl rule__SQueryParameter__Group_2__3 )
            // InternalSms.g:7195:2: rule__SQueryParameter__Group_2__2__Impl rule__SQueryParameter__Group_2__3
            {
            pushFollow(FOLLOW_18);
            rule__SQueryParameter__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__3();

            state._fsp--;


            }

        }
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
    // InternalSms.g:7202:1: rule__SQueryParameter__Group_2__2__Impl : ( ( rule__SQueryParameter__NameAssignment_2_2 ) ) ;
    public final void rule__SQueryParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7206:1: ( ( ( rule__SQueryParameter__NameAssignment_2_2 ) ) )
            // InternalSms.g:7207:1: ( ( rule__SQueryParameter__NameAssignment_2_2 ) )
            {
            // InternalSms.g:7207:1: ( ( rule__SQueryParameter__NameAssignment_2_2 ) )
            // InternalSms.g:7208:2: ( rule__SQueryParameter__NameAssignment_2_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_2_2()); 
            // InternalSms.g:7209:2: ( rule__SQueryParameter__NameAssignment_2_2 )
            // InternalSms.g:7209:3: rule__SQueryParameter__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getNameAssignment_2_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQueryParameter__Group_2__3"
    // InternalSms.g:7217:1: rule__SQueryParameter__Group_2__3 : rule__SQueryParameter__Group_2__3__Impl rule__SQueryParameter__Group_2__4 ;
    public final void rule__SQueryParameter__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7221:1: ( rule__SQueryParameter__Group_2__3__Impl rule__SQueryParameter__Group_2__4 )
            // InternalSms.g:7222:2: rule__SQueryParameter__Group_2__3__Impl rule__SQueryParameter__Group_2__4
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__3"


    // $ANTLR start "rule__SQueryParameter__Group_2__3__Impl"
    // InternalSms.g:7229:1: rule__SQueryParameter__Group_2__3__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7233:1: ( ( ':' ) )
            // InternalSms.g:7234:1: ( ':' )
            {
            // InternalSms.g:7234:1: ( ':' )
            // InternalSms.g:7235:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getColonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__3__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__4"
    // InternalSms.g:7244:1: rule__SQueryParameter__Group_2__4 : rule__SQueryParameter__Group_2__4__Impl rule__SQueryParameter__Group_2__5 ;
    public final void rule__SQueryParameter__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7248:1: ( rule__SQueryParameter__Group_2__4__Impl rule__SQueryParameter__Group_2__5 )
            // InternalSms.g:7249:2: rule__SQueryParameter__Group_2__4__Impl rule__SQueryParameter__Group_2__5
            {
            pushFollow(FOLLOW_12);
            rule__SQueryParameter__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__4"


    // $ANTLR start "rule__SQueryParameter__Group_2__4__Impl"
    // InternalSms.g:7256:1: rule__SQueryParameter__Group_2__4__Impl : ( ( rule__SQueryParameter__TypeAssignment_2_4 ) ) ;
    public final void rule__SQueryParameter__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7260:1: ( ( ( rule__SQueryParameter__TypeAssignment_2_4 ) ) )
            // InternalSms.g:7261:1: ( ( rule__SQueryParameter__TypeAssignment_2_4 ) )
            {
            // InternalSms.g:7261:1: ( ( rule__SQueryParameter__TypeAssignment_2_4 ) )
            // InternalSms.g:7262:2: ( rule__SQueryParameter__TypeAssignment_2_4 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_2_4()); 
            // InternalSms.g:7263:2: ( rule__SQueryParameter__TypeAssignment_2_4 )
            // InternalSms.g:7263:3: rule__SQueryParameter__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__TypeAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getTypeAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__4__Impl"


    // $ANTLR start "rule__SQueryParameter__Group_2__5"
    // InternalSms.g:7271:1: rule__SQueryParameter__Group_2__5 : rule__SQueryParameter__Group_2__5__Impl ;
    public final void rule__SQueryParameter__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7275:1: ( rule__SQueryParameter__Group_2__5__Impl )
            // InternalSms.g:7276:2: rule__SQueryParameter__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__5"


    // $ANTLR start "rule__SQueryParameter__Group_2__5__Impl"
    // InternalSms.g:7282:1: rule__SQueryParameter__Group_2__5__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_2_5 )? ) ;
    public final void rule__SQueryParameter__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7286:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_2_5 )? ) )
            // InternalSms.g:7287:1: ( ( rule__SQueryParameter__MultiplicityAssignment_2_5 )? )
            {
            // InternalSms.g:7287:1: ( ( rule__SQueryParameter__MultiplicityAssignment_2_5 )? )
            // InternalSms.g:7288:2: ( rule__SQueryParameter__MultiplicityAssignment_2_5 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_2_5()); 
            // InternalSms.g:7289:2: ( rule__SQueryParameter__MultiplicityAssignment_2_5 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==40) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalSms.g:7289:3: rule__SQueryParameter__MultiplicityAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__MultiplicityAssignment_2_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group_2__5__Impl"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__0"
    // InternalSms.g:7298:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7302:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSms.g:7303:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalSms.g:7310:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7314:1: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7315:1: ( ruleSQualifiedName )
            {
            // InternalSms.g:7315:1: ( ruleSQualifiedName )
            // InternalSms.g:7316:2: ruleSQualifiedName
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
    // InternalSms.g:7325:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7329:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSms.g:7330:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSms.g:7336:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7340:1: ( ( ( '.*' )? ) )
            // InternalSms.g:7341:1: ( ( '.*' )? )
            {
            // InternalSms.g:7341:1: ( ( '.*' )? )
            // InternalSms.g:7342:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSms.g:7343:2: ( '.*' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalSms.g:7343:3: '.*'
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
    // InternalSms.g:7352:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7356:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSms.g:7357:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalSms.g:7364:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7368:1: ( ( RULE_ID ) )
            // InternalSms.g:7369:1: ( RULE_ID )
            {
            // InternalSms.g:7369:1: ( RULE_ID )
            // InternalSms.g:7370:2: RULE_ID
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
    // InternalSms.g:7379:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7383:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSms.g:7384:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSms.g:7390:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7394:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSms.g:7395:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSms.g:7395:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSms.g:7396:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSms.g:7397:2: ( rule__SQualifiedName__Group_1__0 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==45) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalSms.g:7397:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__SQualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // InternalSms.g:7406:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7410:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSms.g:7411:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
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
    // InternalSms.g:7418:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7422:1: ( ( '.' ) )
            // InternalSms.g:7423:1: ( '.' )
            {
            // InternalSms.g:7423:1: ( '.' )
            // InternalSms.g:7424:2: '.'
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
    // InternalSms.g:7433:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7437:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSms.g:7438:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSms.g:7444:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7448:1: ( ( RULE_ID ) )
            // InternalSms.g:7449:1: ( RULE_ID )
            {
            // InternalSms.g:7449:1: ( RULE_ID )
            // InternalSms.g:7450:2: RULE_ID
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
    // InternalSms.g:7460:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7464:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSms.g:7465:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalSms.g:7472:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7476:1: ( ( '(' ) )
            // InternalSms.g:7477:1: ( '(' )
            {
            // InternalSms.g:7477:1: ( '(' )
            // InternalSms.g:7478:2: '('
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
    // InternalSms.g:7487:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7491:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSms.g:7492:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalSms.g:7499:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7503:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSms.g:7504:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSms.g:7504:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSms.g:7505:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSms.g:7506:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSms.g:7506:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSms.g:7514:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7518:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSms.g:7519:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalSms.g:7526:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7530:1: ( ( '..' ) )
            // InternalSms.g:7531:1: ( '..' )
            {
            // InternalSms.g:7531:1: ( '..' )
            // InternalSms.g:7532:2: '..'
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
    // InternalSms.g:7541:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7545:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSms.g:7546:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalSms.g:7553:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7557:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSms.g:7558:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSms.g:7558:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSms.g:7559:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSms.g:7560:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSms.g:7560:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSms.g:7568:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7572:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSms.g:7573:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSms.g:7579:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7583:1: ( ( ')' ) )
            // InternalSms.g:7584:1: ( ')' )
            {
            // InternalSms.g:7584:1: ( ')' )
            // InternalSms.g:7585:2: ')'
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
    // InternalSms.g:7595:1: rule__SDomain__NameAssignment_1 : ( ruleSQualifiedName ) ;
    public final void rule__SDomain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7599:1: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7600:2: ( ruleSQualifiedName )
            {
            // InternalSms.g:7600:2: ( ruleSQualifiedName )
            // InternalSms.g:7601:3: ruleSQualifiedName
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
    // InternalSms.g:7610:1: rule__SDomain__ImportsAssignment_2 : ( ruleSImport ) ;
    public final void rule__SDomain__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7614:1: ( ( ruleSImport ) )
            // InternalSms.g:7615:2: ( ruleSImport )
            {
            // InternalSms.g:7615:2: ( ruleSImport )
            // InternalSms.g:7616:3: ruleSImport
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
    // InternalSms.g:7625:1: rule__SDomain__TypesAssignment_3_0 : ( ruleSType ) ;
    public final void rule__SDomain__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7629:1: ( ( ruleSType ) )
            // InternalSms.g:7630:2: ( ruleSType )
            {
            // InternalSms.g:7630:2: ( ruleSType )
            // InternalSms.g:7631:3: ruleSType
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
    // InternalSms.g:7640:1: rule__SDomain__AggregatesAssignment_3_1 : ( ruleSAggregate ) ;
    public final void rule__SDomain__AggregatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7644:1: ( ( ruleSAggregate ) )
            // InternalSms.g:7645:2: ( ruleSAggregate )
            {
            // InternalSms.g:7645:2: ( ruleSAggregate )
            // InternalSms.g:7646:3: ruleSAggregate
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
    // InternalSms.g:7655:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7659:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSms.g:7660:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSms.g:7660:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSms.g:7661:3: ruleSQualifiedNameWithWildcard
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
    // InternalSms.g:7670:1: rule__SGrabAggregateRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SGrabAggregateRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7674:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7675:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7675:2: ( ( RULE_ID ) )
            // InternalSms.g:7676:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabAggregateRuleAccess().getSourceDAggregateCrossReference_0()); 
            // InternalSms.g:7677:3: ( RULE_ID )
            // InternalSms.g:7678:4: RULE_ID
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
    // InternalSms.g:7689:1: rule__SGrabEnumerationRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabEnumerationRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7693:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:7694:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:7694:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7695:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getSourceDEnumerationCrossReference_0_0()); 
            // InternalSms.g:7696:3: ( ruleSQualifiedName )
            // InternalSms.g:7697:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SGrabEnumerationRule__RenameToAssignment_1_2"
    // InternalSms.g:7708:1: rule__SGrabEnumerationRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7712:1: ( ( RULE_ID ) )
            // InternalSms.g:7713:2: ( RULE_ID )
            {
            // InternalSms.g:7713:2: ( RULE_ID )
            // InternalSms.g:7714:3: RULE_ID
            {
             before(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__SourceAssignment_0"
    // InternalSms.g:7723:1: rule__SGrabEnumerationLiteralRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabEnumerationLiteralRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7727:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7728:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7728:2: ( ( RULE_ID ) )
            // InternalSms.g:7729:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0_0()); 
            // InternalSms.g:7730:3: ( RULE_ID )
            // InternalSms.g:7731:4: RULE_ID
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


    // $ANTLR start "rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2"
    // InternalSms.g:7742:1: rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7746:1: ( ( RULE_ID ) )
            // InternalSms.g:7747:2: ( RULE_ID )
            {
            // InternalSms.g:7747:2: ( RULE_ID )
            // InternalSms.g:7748:3: RULE_ID
            {
             before(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabEnumerationLiteralRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabEnumerationLiteralRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SDitchEnumerationLiteralRule__SourceAssignment"
    // InternalSms.g:7757:1: rule__SDitchEnumerationLiteralRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchEnumerationLiteralRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7761:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7762:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7762:2: ( ( RULE_ID ) )
            // InternalSms.g:7763:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchEnumerationLiteralRuleAccess().getSourceDLiteralCrossReference_0()); 
            // InternalSms.g:7764:3: ( RULE_ID )
            // InternalSms.g:7765:4: RULE_ID
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
    // InternalSms.g:7776:1: rule__SGrabComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SGrabComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7780:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:7781:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:7781:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7782:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSms.g:7783:3: ( ruleSQualifiedName )
            // InternalSms.g:7784:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SGrabComplexTypeRule__RenameToAssignment_1_2"
    // InternalSms.g:7795:1: rule__SGrabComplexTypeRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SGrabComplexTypeRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7799:1: ( ( RULE_ID ) )
            // InternalSms.g:7800:2: ( RULE_ID )
            {
            // InternalSms.g:7800:2: ( RULE_ID )
            // InternalSms.g:7801:3: RULE_ID
            {
             before(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabComplexTypeRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SMorphComplexTypeRule__SourceAssignment_0"
    // InternalSms.g:7810:1: rule__SMorphComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SMorphComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7814:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:7815:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:7815:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7816:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSms.g:7817:3: ( ruleSQualifiedName )
            // InternalSms.g:7818:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SMorphComplexTypeRule__RenameToAssignment_1_2"
    // InternalSms.g:7829:1: rule__SMorphComplexTypeRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SMorphComplexTypeRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7833:1: ( ( RULE_ID ) )
            // InternalSms.g:7834:2: ( RULE_ID )
            {
            // InternalSms.g:7834:2: ( RULE_ID )
            // InternalSms.g:7835:3: RULE_ID
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphComplexTypeRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SMorphComplexTypeRule__RetypeToAssignment_2_2"
    // InternalSms.g:7844:1: rule__SMorphComplexTypeRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphComplexTypeRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7848:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7849:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7849:2: ( ( RULE_ID ) )
            // InternalSms.g:7850:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphComplexTypeRuleAccess().getRetypeToSComplexTypeCrossReference_2_2_0()); 
            // InternalSms.g:7851:3: ( RULE_ID )
            // InternalSms.g:7852:4: RULE_ID
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
    // InternalSms.g:7863:1: rule__SFuseComplexTypeRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7867:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:7868:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:7868:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7869:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSourceDComplexTypeCrossReference_0_0()); 
            // InternalSms.g:7870:3: ( ruleSQualifiedName )
            // InternalSms.g:7871:4: ruleSQualifiedName
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
    // InternalSms.g:7882:1: rule__SFuseComplexTypeRule__Source2Assignment_2 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SFuseComplexTypeRule__Source2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7886:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:7887:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:7887:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:7888:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getSource2DComplexTypeCrossReference_2_0()); 
            // InternalSms.g:7889:3: ( ruleSQualifiedName )
            // InternalSms.g:7890:4: ruleSQualifiedName
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


    // $ANTLR start "rule__SFuseComplexTypeRule__RenameToAssignment_3_2"
    // InternalSms.g:7901:1: rule__SFuseComplexTypeRule__RenameToAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SFuseComplexTypeRule__RenameToAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7905:1: ( ( RULE_ID ) )
            // InternalSms.g:7906:2: ( RULE_ID )
            {
            // InternalSms.g:7906:2: ( RULE_ID )
            // InternalSms.g:7907:3: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getRenameToIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__RenameToAssignment_3_2"


    // $ANTLR start "rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2"
    // InternalSms.g:7916:1: rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7920:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7921:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7921:2: ( ( RULE_ID ) )
            // InternalSms.g:7922:3: ( RULE_ID )
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_2_0()); 
            // InternalSms.g:7923:3: ( RULE_ID )
            // InternalSms.g:7924:4: RULE_ID
            {
             before(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSFuseComplexTypeRuleAccess().getExtendFromSComplexTypeCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFuseComplexTypeRule__ExtendFromAssignment_4_2"


    // $ANTLR start "rule__SGrabFeatureRule__SourceAssignment_0"
    // InternalSms.g:7935:1: rule__SGrabFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SGrabFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7939:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7940:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7940:2: ( ( RULE_ID ) )
            // InternalSms.g:7941:3: ( RULE_ID )
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSms.g:7942:3: ( RULE_ID )
            // InternalSms.g:7943:4: RULE_ID
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


    // $ANTLR start "rule__SGrabFeatureRule__RenameToAssignment_1_2"
    // InternalSms.g:7954:1: rule__SGrabFeatureRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SGrabFeatureRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7958:1: ( ( RULE_ID ) )
            // InternalSms.g:7959:2: ( RULE_ID )
            {
            // InternalSms.g:7959:2: ( RULE_ID )
            // InternalSms.g:7960:3: RULE_ID
            {
             before(grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSGrabFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGrabFeatureRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SMorphFeatureRule__SourceAssignment_0"
    // InternalSms.g:7969:1: rule__SMorphFeatureRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7973:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:7974:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:7974:2: ( ( RULE_ID ) )
            // InternalSms.g:7975:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getSourceDFeatureCrossReference_0_0()); 
            // InternalSms.g:7976:3: ( RULE_ID )
            // InternalSms.g:7977:4: RULE_ID
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


    // $ANTLR start "rule__SMorphFeatureRule__RenameToAssignment_1_2"
    // InternalSms.g:7988:1: rule__SMorphFeatureRule__RenameToAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__SMorphFeatureRule__RenameToAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:7992:1: ( ( RULE_ID ) )
            // InternalSms.g:7993:2: ( RULE_ID )
            {
            // InternalSms.g:7993:2: ( RULE_ID )
            // InternalSms.g:7994:3: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRenameToIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RenameToAssignment_1_2"


    // $ANTLR start "rule__SMorphFeatureRule__RetypeToAssignment_2_2"
    // InternalSms.g:8003:1: rule__SMorphFeatureRule__RetypeToAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphFeatureRule__RetypeToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8007:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8008:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8008:2: ( ( RULE_ID ) )
            // InternalSms.g:8009:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_2_0()); 
            // InternalSms.g:8010:3: ( RULE_ID )
            // InternalSms.g:8011:4: RULE_ID
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getSMorphFeatureRuleAccess().getRetypeToSTypeCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RetypeToAssignment_2_2"


    // $ANTLR start "rule__SMorphFeatureRule__RemultiplyToAssignment_2_3"
    // InternalSms.g:8022:1: rule__SMorphFeatureRule__RemultiplyToAssignment_2_3 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphFeatureRule__RemultiplyToAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8026:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:8027:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:8027:2: ( ruleSMultiplicity )
            // InternalSms.g:8028:3: ruleSMultiplicity
            {
             before(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSMorphFeatureRuleAccess().getRemultiplyToSMultiplicityParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphFeatureRule__RemultiplyToAssignment_2_3"


    // $ANTLR start "rule__SDitchFeatureRule__SourceAssignment"
    // InternalSms.g:8037:1: rule__SDitchFeatureRule__SourceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SDitchFeatureRule__SourceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8041:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8042:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8042:2: ( ( RULE_ID ) )
            // InternalSms.g:8043:3: ( RULE_ID )
            {
             before(grammarAccess.getSDitchFeatureRuleAccess().getSourceDFeatureCrossReference_0()); 
            // InternalSms.g:8044:3: ( RULE_ID )
            // InternalSms.g:8045:4: RULE_ID
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
    // InternalSms.g:8056:1: rule__SAggregate__DeductionRuleAssignment_1_0_2 : ( ruleSGrabAggregateRule ) ;
    public final void rule__SAggregate__DeductionRuleAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8060:1: ( ( ruleSGrabAggregateRule ) )
            // InternalSms.g:8061:2: ( ruleSGrabAggregateRule )
            {
            // InternalSms.g:8061:2: ( ruleSGrabAggregateRule )
            // InternalSms.g:8062:3: ruleSGrabAggregateRule
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


    // $ANTLR start "rule__SAggregate__TypesAssignment_1_1_2"
    // InternalSms.g:8071:1: rule__SAggregate__TypesAssignment_1_1_2 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8075:1: ( ( ruleSType ) )
            // InternalSms.g:8076:2: ( ruleSType )
            {
            // InternalSms.g:8076:2: ( ruleSType )
            // InternalSms.g:8077:3: ruleSType
            {
             before(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSType();

            state._fsp--;

             after(grammarAccess.getSAggregateAccess().getTypesSTypeParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAggregate__TypesAssignment_1_1_2"


    // $ANTLR start "rule__SConstraint__NameAssignment_1"
    // InternalSms.g:8086:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8090:1: ( ( RULE_ID ) )
            // InternalSms.g:8091:2: ( RULE_ID )
            {
            // InternalSms.g:8091:2: ( RULE_ID )
            // InternalSms.g:8092:3: RULE_ID
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
    // InternalSms.g:8101:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8105:1: ( ( ruleSExpression ) )
            // InternalSms.g:8106:2: ( ruleSExpression )
            {
            // InternalSms.g:8106:2: ( ruleSExpression )
            // InternalSms.g:8107:3: ruleSExpression
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
    // InternalSms.g:8116:1: rule__SPrimitive__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8120:1: ( ( RULE_ID ) )
            // InternalSms.g:8121:2: ( RULE_ID )
            {
            // InternalSms.g:8121:2: ( RULE_ID )
            // InternalSms.g:8122:3: RULE_ID
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
    // InternalSms.g:8131:1: rule__SPrimitive__RedefinesAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8135:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8136:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8136:2: ( ( RULE_ID ) )
            // InternalSms.g:8137:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_2_0_1_0()); 
            // InternalSms.g:8138:3: ( RULE_ID )
            // InternalSms.g:8139:4: RULE_ID
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
    // InternalSms.g:8150:1: rule__SPrimitive__RealizesAssignment_2_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SPrimitive__RealizesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8154:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:8155:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:8155:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:8156:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_2_1_1_0()); 
            // InternalSms.g:8157:3: ( ruleSQualifiedName )
            // InternalSms.g:8158:4: ruleSQualifiedName
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
    // InternalSms.g:8169:1: rule__SPrimitive__ConstraintsAssignment_4 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8173:1: ( ( ruleSConstraint ) )
            // InternalSms.g:8174:2: ( ruleSConstraint )
            {
            // InternalSms.g:8174:2: ( ruleSConstraint )
            // InternalSms.g:8175:3: ruleSConstraint
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
    // InternalSms.g:8184:1: rule__SPrimitiveArchetype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SPrimitiveArchetype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8188:1: ( ( RULE_ID ) )
            // InternalSms.g:8189:2: ( RULE_ID )
            {
            // InternalSms.g:8189:2: ( RULE_ID )
            // InternalSms.g:8190:3: RULE_ID
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
    // InternalSms.g:8199:1: rule__SPrimitiveArchetype__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SPrimitiveArchetype__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8203:1: ( ( ruleSConstraint ) )
            // InternalSms.g:8204:2: ( ruleSConstraint )
            {
            // InternalSms.g:8204:2: ( ruleSConstraint )
            // InternalSms.g:8205:3: ruleSConstraint
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


    // $ANTLR start "rule__SEnumeration__DeductionRuleAssignment_0_0_2"
    // InternalSms.g:8214:1: rule__SEnumeration__DeductionRuleAssignment_0_0_2 : ( ruleSGrabEnumerationRule ) ;
    public final void rule__SEnumeration__DeductionRuleAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8218:1: ( ( ruleSGrabEnumerationRule ) )
            // InternalSms.g:8219:2: ( ruleSGrabEnumerationRule )
            {
            // InternalSms.g:8219:2: ( ruleSGrabEnumerationRule )
            // InternalSms.g:8220:3: ruleSGrabEnumerationRule
            {
             before(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabEnumerationRule();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getDeductionRuleSGrabEnumerationRuleParserRuleCall_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__DeductionRuleAssignment_0_0_2"


    // $ANTLR start "rule__SEnumeration__NameAssignment_0_1_1"
    // InternalSms.g:8229:1: rule__SEnumeration__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8233:1: ( ( RULE_ID ) )
            // InternalSms.g:8234:2: ( RULE_ID )
            {
            // InternalSms.g:8234:2: ( RULE_ID )
            // InternalSms.g:8235:3: RULE_ID
            {
             before(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__NameAssignment_0_1_1"


    // $ANTLR start "rule__SEnumeration__LiteralsAssignment_2_0"
    // InternalSms.g:8244:1: rule__SEnumeration__LiteralsAssignment_2_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8248:1: ( ( ruleSLiteral ) )
            // InternalSms.g:8249:2: ( ruleSLiteral )
            {
            // InternalSms.g:8249:2: ( ruleSLiteral )
            // InternalSms.g:8250:3: ruleSLiteral
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
    // InternalSms.g:8259:1: rule__SEnumeration__LiteralsAssignment_2_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8263:1: ( ( ruleSLiteral ) )
            // InternalSms.g:8264:2: ( ruleSLiteral )
            {
            // InternalSms.g:8264:2: ( ruleSLiteral )
            // InternalSms.g:8265:3: ruleSLiteral
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
    // InternalSms.g:8274:1: rule__SEnumeration__ConstraintsAssignment_3 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8278:1: ( ( ruleSConstraint ) )
            // InternalSms.g:8279:2: ( ruleSConstraint )
            {
            // InternalSms.g:8279:2: ( ruleSConstraint )
            // InternalSms.g:8280:3: ruleSConstraint
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


    // $ANTLR start "rule__SLiteral__DeductionRuleAssignment_0_1"
    // InternalSms.g:8289:1: rule__SLiteral__DeductionRuleAssignment_0_1 : ( ruleSGrabEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8293:1: ( ( ruleSGrabEnumerationLiteralRule ) )
            // InternalSms.g:8294:2: ( ruleSGrabEnumerationLiteralRule )
            {
            // InternalSms.g:8294:2: ( ruleSGrabEnumerationLiteralRule )
            // InternalSms.g:8295:3: ruleSGrabEnumerationLiteralRule
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSLiteralAccess().getDeductionRuleSGrabEnumerationLiteralRuleParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__DeductionRuleAssignment_0_1"


    // $ANTLR start "rule__SLiteral__DeductionRuleAssignment_1_1"
    // InternalSms.g:8304:1: rule__SLiteral__DeductionRuleAssignment_1_1 : ( ruleSDitchEnumerationLiteralRule ) ;
    public final void rule__SLiteral__DeductionRuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8308:1: ( ( ruleSDitchEnumerationLiteralRule ) )
            // InternalSms.g:8309:2: ( ruleSDitchEnumerationLiteralRule )
            {
            // InternalSms.g:8309:2: ( ruleSDitchEnumerationLiteralRule )
            // InternalSms.g:8310:3: ruleSDitchEnumerationLiteralRule
            {
             before(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchEnumerationLiteralRule();

            state._fsp--;

             after(grammarAccess.getSLiteralAccess().getDeductionRuleSDitchEnumerationLiteralRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__DeductionRuleAssignment_1_1"


    // $ANTLR start "rule__SLiteral__NameAssignment_2"
    // InternalSms.g:8319:1: rule__SLiteral__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8323:1: ( ( RULE_ID ) )
            // InternalSms.g:8324:2: ( RULE_ID )
            {
            // InternalSms.g:8324:2: ( RULE_ID )
            // InternalSms.g:8325:3: RULE_ID
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


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_0_1"
    // InternalSms.g:8334:1: rule__SRootType__AbstractAssignment_0_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8338:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8339:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8339:2: ( ( 'abstract' ) )
            // InternalSms.g:8340:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            // InternalSms.g:8341:3: ( 'abstract' )
            // InternalSms.g:8342:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_0_1"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_0_3"
    // InternalSms.g:8353:1: rule__SRootType__DeductionRuleAssignment_0_0_3 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8357:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSms.g:8358:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSms.g:8358:2: ( ruleSGrabComplexTypeRule )
            // InternalSms.g:8359:3: ruleSGrabComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSGrabComplexTypeRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_0_3"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_1_1"
    // InternalSms.g:8368:1: rule__SRootType__AbstractAssignment_0_1_1 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8372:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8373:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8373:2: ( ( 'abstract' ) )
            // InternalSms.g:8374:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 
            // InternalSms.g:8375:3: ( 'abstract' )
            // InternalSms.g:8376:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_1_1"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_1_3"
    // InternalSms.g:8387:1: rule__SRootType__DeductionRuleAssignment_0_1_3 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8391:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSms.g:8392:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSms.g:8392:2: ( ruleSMorphComplexTypeRule )
            // InternalSms.g:8393:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_1_3"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_2_1"
    // InternalSms.g:8402:1: rule__SRootType__AbstractAssignment_0_2_1 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8406:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8407:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8407:2: ( ( 'abstract' ) )
            // InternalSms.g:8408:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 
            // InternalSms.g:8409:3: ( 'abstract' )
            // InternalSms.g:8410:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_2_1"


    // $ANTLR start "rule__SRootType__DeductionRuleAssignment_0_2_3"
    // InternalSms.g:8421:1: rule__SRootType__DeductionRuleAssignment_0_2_3 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8425:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSms.g:8426:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSms.g:8426:2: ( ruleSFuseComplexTypeRule )
            // InternalSms.g:8427:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__DeductionRuleAssignment_0_2_3"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_3_0"
    // InternalSms.g:8436:1: rule__SRootType__AbstractAssignment_0_3_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8440:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8441:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8441:2: ( ( 'abstract' ) )
            // InternalSms.g:8442:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 
            // InternalSms.g:8443:3: ( 'abstract' )
            // InternalSms.g:8444:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_3_0"


    // $ANTLR start "rule__SRootType__NameAssignment_0_3_2"
    // InternalSms.g:8455:1: rule__SRootType__NameAssignment_0_3_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8459:1: ( ( RULE_ID ) )
            // InternalSms.g:8460:2: ( RULE_ID )
            {
            // InternalSms.g:8460:2: ( RULE_ID )
            // InternalSms.g:8461:3: RULE_ID
            {
             before(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__NameAssignment_0_3_2"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_0_1"
    // InternalSms.g:8470:1: rule__SDetailType__AbstractAssignment_0_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8474:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8475:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8475:2: ( ( 'abstract' ) )
            // InternalSms.g:8476:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            // InternalSms.g:8477:3: ( 'abstract' )
            // InternalSms.g:8478:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_0_1"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_0_3"
    // InternalSms.g:8489:1: rule__SDetailType__DeductionRuleAssignment_0_0_3 : ( ruleSGrabComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8493:1: ( ( ruleSGrabComplexTypeRule ) )
            // InternalSms.g:8494:2: ( ruleSGrabComplexTypeRule )
            {
            // InternalSms.g:8494:2: ( ruleSGrabComplexTypeRule )
            // InternalSms.g:8495:3: ruleSGrabComplexTypeRule
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


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_1_1"
    // InternalSms.g:8504:1: rule__SDetailType__AbstractAssignment_0_1_1 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8508:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8509:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8509:2: ( ( 'abstract' ) )
            // InternalSms.g:8510:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 
            // InternalSms.g:8511:3: ( 'abstract' )
            // InternalSms.g:8512:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_1_1"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_1_3"
    // InternalSms.g:8523:1: rule__SDetailType__DeductionRuleAssignment_0_1_3 : ( ruleSMorphComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8527:1: ( ( ruleSMorphComplexTypeRule ) )
            // InternalSms.g:8528:2: ( ruleSMorphComplexTypeRule )
            {
            // InternalSms.g:8528:2: ( ruleSMorphComplexTypeRule )
            // InternalSms.g:8529:3: ruleSMorphComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSMorphComplexTypeRuleParserRuleCall_0_1_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_2_1"
    // InternalSms.g:8538:1: rule__SDetailType__AbstractAssignment_0_2_1 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8542:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8543:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8543:2: ( ( 'abstract' ) )
            // InternalSms.g:8544:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 
            // InternalSms.g:8545:3: ( 'abstract' )
            // InternalSms.g:8546:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_2_1"


    // $ANTLR start "rule__SDetailType__DeductionRuleAssignment_0_2_3"
    // InternalSms.g:8557:1: rule__SDetailType__DeductionRuleAssignment_0_2_3 : ( ruleSFuseComplexTypeRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8561:1: ( ( ruleSFuseComplexTypeRule ) )
            // InternalSms.g:8562:2: ( ruleSFuseComplexTypeRule )
            {
            // InternalSms.g:8562:2: ( ruleSFuseComplexTypeRule )
            // InternalSms.g:8563:3: ruleSFuseComplexTypeRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSFuseComplexTypeRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSFuseComplexTypeRuleParserRuleCall_0_2_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_3_0"
    // InternalSms.g:8572:1: rule__SDetailType__AbstractAssignment_0_3_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8576:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:8577:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:8577:2: ( ( 'abstract' ) )
            // InternalSms.g:8578:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 
            // InternalSms.g:8579:3: ( 'abstract' )
            // InternalSms.g:8580:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_3_0"


    // $ANTLR start "rule__SDetailType__NameAssignment_0_3_2"
    // InternalSms.g:8591:1: rule__SDetailType__NameAssignment_0_3_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8595:1: ( ( RULE_ID ) )
            // InternalSms.g:8596:2: ( RULE_ID )
            {
            // InternalSms.g:8596:2: ( RULE_ID )
            // InternalSms.g:8597:3: RULE_ID
            {
             before(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_3_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__NameAssignment_0_3_2"


    // $ANTLR start "rule__SComplexTypeExtends__SuperTypeAssignment_1"
    // InternalSms.g:8606:1: rule__SComplexTypeExtends__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexTypeExtends__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8610:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8611:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8611:2: ( ( RULE_ID ) )
            // InternalSms.g:8612:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeExtendsAccess().getSuperTypeSComplexTypeCrossReference_1_0()); 
            // InternalSms.g:8613:3: ( RULE_ID )
            // InternalSms.g:8614:4: RULE_ID
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
    // InternalSms.g:8625:1: rule__SComplexTypeFeatures__FeaturesAssignment_1_0 : ( ruleSFeature ) ;
    public final void rule__SComplexTypeFeatures__FeaturesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8629:1: ( ( ruleSFeature ) )
            // InternalSms.g:8630:2: ( ruleSFeature )
            {
            // InternalSms.g:8630:2: ( ruleSFeature )
            // InternalSms.g:8631:3: ruleSFeature
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
    // InternalSms.g:8640:1: rule__SComplexTypeFeatures__ConstraintsAssignment_1_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexTypeFeatures__ConstraintsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8644:1: ( ( ruleSConstraint ) )
            // InternalSms.g:8645:2: ( ruleSConstraint )
            {
            // InternalSms.g:8645:2: ( ruleSConstraint )
            // InternalSms.g:8646:3: ruleSConstraint
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


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_0_2"
    // InternalSms.g:8655:1: rule__SAssociation__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8659:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSms.g:8660:2: ( ruleSGrabFeatureRule )
            {
            // InternalSms.g:8660:2: ( ruleSGrabFeatureRule )
            // InternalSms.g:8661:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_0_2"


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_1_2"
    // InternalSms.g:8670:1: rule__SAssociation__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8674:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSms.g:8675:2: ( ruleSMorphFeatureRule )
            {
            // InternalSms.g:8675:2: ( ruleSMorphFeatureRule )
            // InternalSms.g:8676:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_1_2"


    // $ANTLR start "rule__SAssociation__DeductionRuleAssignment_2_2"
    // InternalSms.g:8685:1: rule__SAssociation__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAssociation__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8689:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSms.g:8690:2: ( ruleSDitchFeatureRule )
            {
            // InternalSms.g:8690:2: ( ruleSDitchFeatureRule )
            // InternalSms.g:8691:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DeductionRuleAssignment_2_2"


    // $ANTLR start "rule__SAssociation__DerivedAssignment_3_0"
    // InternalSms.g:8700:1: rule__SAssociation__DerivedAssignment_3_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8704:1: ( ( ( 'derived' ) ) )
            // InternalSms.g:8705:2: ( ( 'derived' ) )
            {
            // InternalSms.g:8705:2: ( ( 'derived' ) )
            // InternalSms.g:8706:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_3_0_0()); 
            // InternalSms.g:8707:3: ( 'derived' )
            // InternalSms.g:8708:4: 'derived'
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
    // InternalSms.g:8719:1: rule__SAssociation__KindAssignment_3_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8723:1: ( ( ruleSAssociationKind ) )
            // InternalSms.g:8724:2: ( ruleSAssociationKind )
            {
            // InternalSms.g:8724:2: ( ruleSAssociationKind )
            // InternalSms.g:8725:3: ruleSAssociationKind
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
    // InternalSms.g:8734:1: rule__SAssociation__KindAssignment_3_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8738:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSms.g:8739:2: ( ruleSAssociationKindInverse )
            {
            // InternalSms.g:8739:2: ( ruleSAssociationKindInverse )
            // InternalSms.g:8740:3: ruleSAssociationKindInverse
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
    // InternalSms.g:8749:1: rule__SAssociation__NameAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8753:1: ( ( RULE_ID ) )
            // InternalSms.g:8754:2: ( RULE_ID )
            {
            // InternalSms.g:8754:2: ( RULE_ID )
            // InternalSms.g:8755:3: RULE_ID
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
    // InternalSms.g:8764:1: rule__SAssociation__TypeAssignment_3_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8768:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8769:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8769:2: ( ( RULE_ID ) )
            // InternalSms.g:8770:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_3_4_0()); 
            // InternalSms.g:8771:3: ( RULE_ID )
            // InternalSms.g:8772:4: RULE_ID
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
    // InternalSms.g:8783:1: rule__SAssociation__MultiplicityAssignment_3_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8787:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:8788:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:8788:2: ( ruleSMultiplicity )
            // InternalSms.g:8789:3: ruleSMultiplicity
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


    // $ANTLR start "rule__SAttribute__DetailAssignment_0_1"
    // InternalSms.g:8798:1: rule__SAttribute__DetailAssignment_0_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8802:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:8803:2: ( ( 'detail' ) )
            {
            // InternalSms.g:8803:2: ( ( 'detail' ) )
            // InternalSms.g:8804:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 
            // InternalSms.g:8805:3: ( 'detail' )
            // InternalSms.g:8806:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_0_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_0_2"
    // InternalSms.g:8817:1: rule__SAttribute__DeductionRuleAssignment_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8821:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSms.g:8822:2: ( ruleSGrabFeatureRule )
            {
            // InternalSms.g:8822:2: ( ruleSGrabFeatureRule )
            // InternalSms.g:8823:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_0_2"


    // $ANTLR start "rule__SAttribute__DetailAssignment_1_1"
    // InternalSms.g:8832:1: rule__SAttribute__DetailAssignment_1_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8836:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:8837:2: ( ( 'detail' ) )
            {
            // InternalSms.g:8837:2: ( ( 'detail' ) )
            // InternalSms.g:8838:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_1_0()); 
            // InternalSms.g:8839:3: ( 'detail' )
            // InternalSms.g:8840:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_1_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_1_2"
    // InternalSms.g:8851:1: rule__SAttribute__DeductionRuleAssignment_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8855:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSms.g:8856:2: ( ruleSMorphFeatureRule )
            {
            // InternalSms.g:8856:2: ( ruleSMorphFeatureRule )
            // InternalSms.g:8857:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_1_2"


    // $ANTLR start "rule__SAttribute__DetailAssignment_2_1"
    // InternalSms.g:8866:1: rule__SAttribute__DetailAssignment_2_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8870:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:8871:2: ( ( 'detail' ) )
            {
            // InternalSms.g:8871:2: ( ( 'detail' ) )
            // InternalSms.g:8872:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_1_0()); 
            // InternalSms.g:8873:3: ( 'detail' )
            // InternalSms.g:8874:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_1_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_2_1"


    // $ANTLR start "rule__SAttribute__DeductionRuleAssignment_2_2"
    // InternalSms.g:8885:1: rule__SAttribute__DeductionRuleAssignment_2_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8889:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSms.g:8890:2: ( ruleSDitchFeatureRule )
            {
            // InternalSms.g:8890:2: ( ruleSDitchFeatureRule )
            // InternalSms.g:8891:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DeductionRuleAssignment_2_2"


    // $ANTLR start "rule__SAttribute__DetailAssignment_3_0"
    // InternalSms.g:8900:1: rule__SAttribute__DetailAssignment_3_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8904:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:8905:2: ( ( 'detail' ) )
            {
            // InternalSms.g:8905:2: ( ( 'detail' ) )
            // InternalSms.g:8906:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_3_0_0()); 
            // InternalSms.g:8907:3: ( 'detail' )
            // InternalSms.g:8908:4: 'detail'
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
    // InternalSms.g:8919:1: rule__SAttribute__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8923:1: ( ( RULE_ID ) )
            // InternalSms.g:8924:2: ( RULE_ID )
            {
            // InternalSms.g:8924:2: ( RULE_ID )
            // InternalSms.g:8925:3: RULE_ID
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
    // InternalSms.g:8934:1: rule__SAttribute__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8938:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:8939:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:8939:2: ( ( RULE_ID ) )
            // InternalSms.g:8940:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_3_3_0()); 
            // InternalSms.g:8941:3: ( RULE_ID )
            // InternalSms.g:8942:4: RULE_ID
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
    // InternalSms.g:8953:1: rule__SAttribute__MultiplicityAssignment_3_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8957:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:8958:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:8958:2: ( ruleSMultiplicity )
            // InternalSms.g:8959:3: ruleSMultiplicity
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
    // InternalSms.g:8968:1: rule__SAttribute__KeyAssignment_3_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8972:1: ( ( ( 'key' ) ) )
            // InternalSms.g:8973:2: ( ( 'key' ) )
            {
            // InternalSms.g:8973:2: ( ( 'key' ) )
            // InternalSms.g:8974:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_3_5_0()); 
            // InternalSms.g:8975:3: ( 'key' )
            // InternalSms.g:8976:4: 'key'
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


    // $ANTLR start "rule__SQuery__DeductionRuleAssignment_0_0_0_2"
    // InternalSms.g:8987:1: rule__SQuery__DeductionRuleAssignment_0_0_0_2 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:8991:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSms.g:8992:2: ( ruleSGrabFeatureRule )
            {
            // InternalSms.g:8992:2: ( ruleSGrabFeatureRule )
            // InternalSms.g:8993:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__DeductionRuleAssignment_0_0_0_2"


    // $ANTLR start "rule__SQuery__DeductionRuleAssignment_0_0_1_2"
    // InternalSms.g:9002:1: rule__SQuery__DeductionRuleAssignment_0_0_1_2 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_0_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9006:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSms.g:9007:2: ( ruleSMorphFeatureRule )
            {
            // InternalSms.g:9007:2: ( ruleSMorphFeatureRule )
            // InternalSms.g:9008:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_0_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__DeductionRuleAssignment_0_0_1_2"


    // $ANTLR start "rule__SQuery__ParametersAssignment_0_2_1_0"
    // InternalSms.g:9017:1: rule__SQuery__ParametersAssignment_0_2_1_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9021:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:9022:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:9022:2: ( ruleSQueryParameter )
            // InternalSms.g:9023:3: ruleSQueryParameter
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
    // InternalSms.g:9032:1: rule__SQuery__ParametersAssignment_0_2_1_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_0_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9036:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:9037:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:9037:2: ( ruleSQueryParameter )
            // InternalSms.g:9038:3: ruleSQueryParameter
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
    // InternalSms.g:9047:1: rule__SQuery__DeductionRuleAssignment_1_2 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQuery__DeductionRuleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9051:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSms.g:9052:2: ( ruleSDitchFeatureRule )
            {
            // InternalSms.g:9052:2: ( ruleSDitchFeatureRule )
            // InternalSms.g:9053:3: ruleSDitchFeatureRule
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
    // InternalSms.g:9062:1: rule__SQuery__NameAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9066:1: ( ( RULE_ID ) )
            // InternalSms.g:9067:2: ( RULE_ID )
            {
            // InternalSms.g:9067:2: ( RULE_ID )
            // InternalSms.g:9068:3: RULE_ID
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
    // InternalSms.g:9077:1: rule__SQuery__ParametersAssignment_2_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9081:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:9082:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:9082:2: ( ruleSQueryParameter )
            // InternalSms.g:9083:3: ruleSQueryParameter
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
    // InternalSms.g:9092:1: rule__SQuery__ParametersAssignment_2_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9096:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:9097:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:9097:2: ( ruleSQueryParameter )
            // InternalSms.g:9098:3: ruleSQueryParameter
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
    // InternalSms.g:9107:1: rule__SQuery__TypeAssignment_2_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9111:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:9112:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:9112:2: ( ( RULE_ID ) )
            // InternalSms.g:9113:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_2_5_0()); 
            // InternalSms.g:9114:3: ( RULE_ID )
            // InternalSms.g:9115:4: RULE_ID
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
    // InternalSms.g:9126:1: rule__SQuery__MultiplicityAssignment_2_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9130:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:9131:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:9131:2: ( ruleSMultiplicity )
            // InternalSms.g:9132:3: ruleSMultiplicity
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
    // InternalSms.g:9141:1: rule__SQuery__ReturnsAssignment_2_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_2_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9145:1: ( ( ruleSExpression ) )
            // InternalSms.g:9146:2: ( ruleSExpression )
            {
            // InternalSms.g:9146:2: ( ruleSExpression )
            // InternalSms.g:9147:3: ruleSExpression
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


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_0_1"
    // InternalSms.g:9156:1: rule__SQueryParameter__DeductionRuleAssignment_0_1 : ( ruleSGrabFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9160:1: ( ( ruleSGrabFeatureRule ) )
            // InternalSms.g:9161:2: ( ruleSGrabFeatureRule )
            {
            // InternalSms.g:9161:2: ( ruleSGrabFeatureRule )
            // InternalSms.g:9162:3: ruleSGrabFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSGrabFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSGrabFeatureRuleParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_0_1"


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_1_1"
    // InternalSms.g:9171:1: rule__SQueryParameter__DeductionRuleAssignment_1_1 : ( ruleSMorphFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9175:1: ( ( ruleSMorphFeatureRule ) )
            // InternalSms.g:9176:2: ( ruleSMorphFeatureRule )
            {
            // InternalSms.g:9176:2: ( ruleSMorphFeatureRule )
            // InternalSms.g:9177:3: ruleSMorphFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSMorphFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSMorphFeatureRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_1_1"


    // $ANTLR start "rule__SQueryParameter__DeductionRuleAssignment_2_1"
    // InternalSms.g:9186:1: rule__SQueryParameter__DeductionRuleAssignment_2_1 : ( ruleSDitchFeatureRule ) ;
    public final void rule__SQueryParameter__DeductionRuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9190:1: ( ( ruleSDitchFeatureRule ) )
            // InternalSms.g:9191:2: ( ruleSDitchFeatureRule )
            {
            // InternalSms.g:9191:2: ( ruleSDitchFeatureRule )
            // InternalSms.g:9192:3: ruleSDitchFeatureRule
            {
             before(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSDitchFeatureRule();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getDeductionRuleSDitchFeatureRuleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__DeductionRuleAssignment_2_1"


    // $ANTLR start "rule__SQueryParameter__NameAssignment_2_2"
    // InternalSms.g:9201:1: rule__SQueryParameter__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9205:1: ( ( RULE_ID ) )
            // InternalSms.g:9206:2: ( RULE_ID )
            {
            // InternalSms.g:9206:2: ( RULE_ID )
            // InternalSms.g:9207:3: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__NameAssignment_2_2"


    // $ANTLR start "rule__SQueryParameter__TypeAssignment_2_4"
    // InternalSms.g:9216:1: rule__SQueryParameter__TypeAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9220:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:9221:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:9221:2: ( ( RULE_ID ) )
            // InternalSms.g:9222:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_4_0()); 
            // InternalSms.g:9223:3: ( RULE_ID )
            // InternalSms.g:9224:4: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__TypeAssignment_2_4"


    // $ANTLR start "rule__SQueryParameter__MultiplicityAssignment_2_5"
    // InternalSms.g:9235:1: rule__SQueryParameter__MultiplicityAssignment_2_5 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9239:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:9240:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:9240:2: ( ruleSMultiplicity )
            // InternalSms.g:9241:3: ruleSMultiplicity
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__MultiplicityAssignment_2_5"


    // $ANTLR start "rule__SExpression__ExprAssignment"
    // InternalSms.g:9250:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9254:1: ( ( RULE_STRING ) )
            // InternalSms.g:9255:2: ( RULE_STRING )
            {
            // InternalSms.g:9255:2: ( RULE_STRING )
            // InternalSms.g:9256:3: RULE_STRING
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
    // InternalSms.g:9265:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9269:1: ( ( RULE_INT ) )
            // InternalSms.g:9270:2: ( RULE_INT )
            {
            // InternalSms.g:9270:2: ( RULE_INT )
            // InternalSms.g:9271:3: RULE_INT
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
    // InternalSms.g:9280:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:9284:1: ( ( ruleMULTIPLICITY ) )
            // InternalSms.g:9285:2: ( ruleMULTIPLICITY )
            {
            // InternalSms.g:9285:2: ( ruleMULTIPLICITY )
            // InternalSms.g:9286:3: ruleMULTIPLICITY
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\30\2\uffff\1\41\1\uffff\3\44\2\uffff\3\44";
    static final String dfa_3s = "\1\57\2\uffff\1\57\1\uffff\2\57\1\47\2\uffff\3\47";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\3\3\uffff\1\4\1\5\3\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\5\uffff\1\1\1\uffff\1\2\1\4\2\uffff\1\10\1\5\1\6\1\11\7\uffff\1\7",
            "",
            "",
            "\1\4\2\uffff\1\10\2\uffff\1\11\7\uffff\1\12",
            "",
            "\1\10\2\uffff\1\11\7\uffff\1\13",
            "\1\10\2\uffff\1\11\7\uffff\1\14",
            "\1\10\2\uffff\1\11",
            "",
            "",
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
            return "935:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSPrimitiveArchetype ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000080F343040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000080F343000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000080F343000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000080F349000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000080F341000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080003000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000819000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000801000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000807001000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000808000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000080F341000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000100A81900C820L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000100A81100C822L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000100280100C800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000A801000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002801010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002801000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000022801000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000010010L});

}