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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inverse'", "'*'", "'reference'", "'composite'", "'domain'", "'import'", "'spoof'", "'morph'", "'name'", "'='", "'type'", "'aggregate'", "'{'", "'}'", "'constraint'", "':'", "'deduced'", "'primitive'", "'redefines'", "'realizes'", "'enumeration'", "','", "'root'", "'detail'", "'extends'", "'('", "')'", "'returns'", "'.*'", "'.'", "'..'", "'abstract'", "'derived'", "'key'"
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
    public static final int T__44=44;
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


    // $ANTLR start "entryRuleSDeductionRule"
    // InternalSms.g:103:1: entryRuleSDeductionRule : ruleSDeductionRule EOF ;
    public final void entryRuleSDeductionRule() throws RecognitionException {
        try {
            // InternalSms.g:104:1: ( ruleSDeductionRule EOF )
            // InternalSms.g:105:1: ruleSDeductionRule EOF
            {
             before(grammarAccess.getSDeductionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSDeductionRule();

            state._fsp--;

             after(grammarAccess.getSDeductionRuleRule()); 
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
    // $ANTLR end "entryRuleSDeductionRule"


    // $ANTLR start "ruleSDeductionRule"
    // InternalSms.g:112:1: ruleSDeductionRule : ( ( rule__SDeductionRule__Group__0 ) ) ;
    public final void ruleSDeductionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:116:2: ( ( ( rule__SDeductionRule__Group__0 ) ) )
            // InternalSms.g:117:2: ( ( rule__SDeductionRule__Group__0 ) )
            {
            // InternalSms.g:117:2: ( ( rule__SDeductionRule__Group__0 ) )
            // InternalSms.g:118:3: ( rule__SDeductionRule__Group__0 )
            {
             before(grammarAccess.getSDeductionRuleAccess().getGroup()); 
            // InternalSms.g:119:3: ( rule__SDeductionRule__Group__0 )
            // InternalSms.g:119:4: rule__SDeductionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SDeductionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDeductionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDeductionRule"


    // $ANTLR start "entryRuleSMemberDeductionRule"
    // InternalSms.g:128:1: entryRuleSMemberDeductionRule : ruleSMemberDeductionRule EOF ;
    public final void entryRuleSMemberDeductionRule() throws RecognitionException {
        try {
            // InternalSms.g:129:1: ( ruleSMemberDeductionRule EOF )
            // InternalSms.g:130:1: ruleSMemberDeductionRule EOF
            {
             before(grammarAccess.getSMemberDeductionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSMemberDeductionRule();

            state._fsp--;

             after(grammarAccess.getSMemberDeductionRuleRule()); 
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
    // $ANTLR end "entryRuleSMemberDeductionRule"


    // $ANTLR start "ruleSMemberDeductionRule"
    // InternalSms.g:137:1: ruleSMemberDeductionRule : ( ( rule__SMemberDeductionRule__Group__0 ) ) ;
    public final void ruleSMemberDeductionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:141:2: ( ( ( rule__SMemberDeductionRule__Group__0 ) ) )
            // InternalSms.g:142:2: ( ( rule__SMemberDeductionRule__Group__0 ) )
            {
            // InternalSms.g:142:2: ( ( rule__SMemberDeductionRule__Group__0 ) )
            // InternalSms.g:143:3: ( rule__SMemberDeductionRule__Group__0 )
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getGroup()); 
            // InternalSms.g:144:3: ( rule__SMemberDeductionRule__Group__0 )
            // InternalSms.g:144:4: rule__SMemberDeductionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMemberDeductionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMemberDeductionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMemberDeductionRule"


    // $ANTLR start "entryRuleSTransform"
    // InternalSms.g:153:1: entryRuleSTransform : ruleSTransform EOF ;
    public final void entryRuleSTransform() throws RecognitionException {
        try {
            // InternalSms.g:154:1: ( ruleSTransform EOF )
            // InternalSms.g:155:1: ruleSTransform EOF
            {
             before(grammarAccess.getSTransformRule()); 
            pushFollow(FOLLOW_1);
            ruleSTransform();

            state._fsp--;

             after(grammarAccess.getSTransformRule()); 
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
    // $ANTLR end "entryRuleSTransform"


    // $ANTLR start "ruleSTransform"
    // InternalSms.g:162:1: ruleSTransform : ( ( rule__STransform__Alternatives ) ) ;
    public final void ruleSTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:166:2: ( ( ( rule__STransform__Alternatives ) ) )
            // InternalSms.g:167:2: ( ( rule__STransform__Alternatives ) )
            {
            // InternalSms.g:167:2: ( ( rule__STransform__Alternatives ) )
            // InternalSms.g:168:3: ( rule__STransform__Alternatives )
            {
             before(grammarAccess.getSTransformAccess().getAlternatives()); 
            // InternalSms.g:169:3: ( rule__STransform__Alternatives )
            // InternalSms.g:169:4: rule__STransform__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__STransform__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSTransformAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSTransform"


    // $ANTLR start "entryRuleSSpoofTransform"
    // InternalSms.g:178:1: entryRuleSSpoofTransform : ruleSSpoofTransform EOF ;
    public final void entryRuleSSpoofTransform() throws RecognitionException {
        try {
            // InternalSms.g:179:1: ( ruleSSpoofTransform EOF )
            // InternalSms.g:180:1: ruleSSpoofTransform EOF
            {
             before(grammarAccess.getSSpoofTransformRule()); 
            pushFollow(FOLLOW_1);
            ruleSSpoofTransform();

            state._fsp--;

             after(grammarAccess.getSSpoofTransformRule()); 
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
    // $ANTLR end "entryRuleSSpoofTransform"


    // $ANTLR start "ruleSSpoofTransform"
    // InternalSms.g:187:1: ruleSSpoofTransform : ( ( rule__SSpoofTransform__Group__0 ) ) ;
    public final void ruleSSpoofTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:191:2: ( ( ( rule__SSpoofTransform__Group__0 ) ) )
            // InternalSms.g:192:2: ( ( rule__SSpoofTransform__Group__0 ) )
            {
            // InternalSms.g:192:2: ( ( rule__SSpoofTransform__Group__0 ) )
            // InternalSms.g:193:3: ( rule__SSpoofTransform__Group__0 )
            {
             before(grammarAccess.getSSpoofTransformAccess().getGroup()); 
            // InternalSms.g:194:3: ( rule__SSpoofTransform__Group__0 )
            // InternalSms.g:194:4: rule__SSpoofTransform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SSpoofTransform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSSpoofTransformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSSpoofTransform"


    // $ANTLR start "entryRuleSMorphTransform"
    // InternalSms.g:203:1: entryRuleSMorphTransform : ruleSMorphTransform EOF ;
    public final void entryRuleSMorphTransform() throws RecognitionException {
        try {
            // InternalSms.g:204:1: ( ruleSMorphTransform EOF )
            // InternalSms.g:205:1: ruleSMorphTransform EOF
            {
             before(grammarAccess.getSMorphTransformRule()); 
            pushFollow(FOLLOW_1);
            ruleSMorphTransform();

            state._fsp--;

             after(grammarAccess.getSMorphTransformRule()); 
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
    // $ANTLR end "entryRuleSMorphTransform"


    // $ANTLR start "ruleSMorphTransform"
    // InternalSms.g:212:1: ruleSMorphTransform : ( ( rule__SMorphTransform__Group__0 ) ) ;
    public final void ruleSMorphTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:216:2: ( ( ( rule__SMorphTransform__Group__0 ) ) )
            // InternalSms.g:217:2: ( ( rule__SMorphTransform__Group__0 ) )
            {
            // InternalSms.g:217:2: ( ( rule__SMorphTransform__Group__0 ) )
            // InternalSms.g:218:3: ( rule__SMorphTransform__Group__0 )
            {
             before(grammarAccess.getSMorphTransformAccess().getGroup()); 
            // InternalSms.g:219:3: ( rule__SMorphTransform__Group__0 )
            // InternalSms.g:219:4: rule__SMorphTransform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSMorphTransformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSMorphTransform"


    // $ANTLR start "entryRuleSAggregate"
    // InternalSms.g:228:1: entryRuleSAggregate : ruleSAggregate EOF ;
    public final void entryRuleSAggregate() throws RecognitionException {
        try {
            // InternalSms.g:229:1: ( ruleSAggregate EOF )
            // InternalSms.g:230:1: ruleSAggregate EOF
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
    // InternalSms.g:237:1: ruleSAggregate : ( ( rule__SAggregate__Group__0 ) ) ;
    public final void ruleSAggregate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:241:2: ( ( ( rule__SAggregate__Group__0 ) ) )
            // InternalSms.g:242:2: ( ( rule__SAggregate__Group__0 ) )
            {
            // InternalSms.g:242:2: ( ( rule__SAggregate__Group__0 ) )
            // InternalSms.g:243:3: ( rule__SAggregate__Group__0 )
            {
             before(grammarAccess.getSAggregateAccess().getGroup()); 
            // InternalSms.g:244:3: ( rule__SAggregate__Group__0 )
            // InternalSms.g:244:4: rule__SAggregate__Group__0
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
    // InternalSms.g:253:1: entryRuleSType : ruleSType EOF ;
    public final void entryRuleSType() throws RecognitionException {
        try {
            // InternalSms.g:254:1: ( ruleSType EOF )
            // InternalSms.g:255:1: ruleSType EOF
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
    // InternalSms.g:262:1: ruleSType : ( ( rule__SType__Alternatives ) ) ;
    public final void ruleSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:266:2: ( ( ( rule__SType__Alternatives ) ) )
            // InternalSms.g:267:2: ( ( rule__SType__Alternatives ) )
            {
            // InternalSms.g:267:2: ( ( rule__SType__Alternatives ) )
            // InternalSms.g:268:3: ( rule__SType__Alternatives )
            {
             before(grammarAccess.getSTypeAccess().getAlternatives()); 
            // InternalSms.g:269:3: ( rule__SType__Alternatives )
            // InternalSms.g:269:4: rule__SType__Alternatives
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
    // InternalSms.g:278:1: entryRuleSConstraint : ruleSConstraint EOF ;
    public final void entryRuleSConstraint() throws RecognitionException {
        try {
            // InternalSms.g:279:1: ( ruleSConstraint EOF )
            // InternalSms.g:280:1: ruleSConstraint EOF
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
    // InternalSms.g:287:1: ruleSConstraint : ( ( rule__SConstraint__Group__0 ) ) ;
    public final void ruleSConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:291:2: ( ( ( rule__SConstraint__Group__0 ) ) )
            // InternalSms.g:292:2: ( ( rule__SConstraint__Group__0 ) )
            {
            // InternalSms.g:292:2: ( ( rule__SConstraint__Group__0 ) )
            // InternalSms.g:293:3: ( rule__SConstraint__Group__0 )
            {
             before(grammarAccess.getSConstraintAccess().getGroup()); 
            // InternalSms.g:294:3: ( rule__SConstraint__Group__0 )
            // InternalSms.g:294:4: rule__SConstraint__Group__0
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
    // InternalSms.g:303:1: entryRuleSPrimitive : ruleSPrimitive EOF ;
    public final void entryRuleSPrimitive() throws RecognitionException {
        try {
            // InternalSms.g:304:1: ( ruleSPrimitive EOF )
            // InternalSms.g:305:1: ruleSPrimitive EOF
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
    // InternalSms.g:312:1: ruleSPrimitive : ( ( rule__SPrimitive__Alternatives ) ) ;
    public final void ruleSPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:316:2: ( ( ( rule__SPrimitive__Alternatives ) ) )
            // InternalSms.g:317:2: ( ( rule__SPrimitive__Alternatives ) )
            {
            // InternalSms.g:317:2: ( ( rule__SPrimitive__Alternatives ) )
            // InternalSms.g:318:3: ( rule__SPrimitive__Alternatives )
            {
             before(grammarAccess.getSPrimitiveAccess().getAlternatives()); 
            // InternalSms.g:319:3: ( rule__SPrimitive__Alternatives )
            // InternalSms.g:319:4: rule__SPrimitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalSms.g:328:1: entryRuleSEnumeration : ruleSEnumeration EOF ;
    public final void entryRuleSEnumeration() throws RecognitionException {
        try {
            // InternalSms.g:329:1: ( ruleSEnumeration EOF )
            // InternalSms.g:330:1: ruleSEnumeration EOF
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
    // InternalSms.g:337:1: ruleSEnumeration : ( ( rule__SEnumeration__Group__0 ) ) ;
    public final void ruleSEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:341:2: ( ( ( rule__SEnumeration__Group__0 ) ) )
            // InternalSms.g:342:2: ( ( rule__SEnumeration__Group__0 ) )
            {
            // InternalSms.g:342:2: ( ( rule__SEnumeration__Group__0 ) )
            // InternalSms.g:343:3: ( rule__SEnumeration__Group__0 )
            {
             before(grammarAccess.getSEnumerationAccess().getGroup()); 
            // InternalSms.g:344:3: ( rule__SEnumeration__Group__0 )
            // InternalSms.g:344:4: rule__SEnumeration__Group__0
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
    // InternalSms.g:353:1: entryRuleSLiteral : ruleSLiteral EOF ;
    public final void entryRuleSLiteral() throws RecognitionException {
        try {
            // InternalSms.g:354:1: ( ruleSLiteral EOF )
            // InternalSms.g:355:1: ruleSLiteral EOF
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
    // InternalSms.g:362:1: ruleSLiteral : ( ( rule__SLiteral__NameAssignment ) ) ;
    public final void ruleSLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:366:2: ( ( ( rule__SLiteral__NameAssignment ) ) )
            // InternalSms.g:367:2: ( ( rule__SLiteral__NameAssignment ) )
            {
            // InternalSms.g:367:2: ( ( rule__SLiteral__NameAssignment ) )
            // InternalSms.g:368:3: ( rule__SLiteral__NameAssignment )
            {
             before(grammarAccess.getSLiteralAccess().getNameAssignment()); 
            // InternalSms.g:369:3: ( rule__SLiteral__NameAssignment )
            // InternalSms.g:369:4: rule__SLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSLiteralAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalSms.g:378:1: entryRuleSRootType : ruleSRootType EOF ;
    public final void entryRuleSRootType() throws RecognitionException {
        try {
            // InternalSms.g:379:1: ( ruleSRootType EOF )
            // InternalSms.g:380:1: ruleSRootType EOF
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
    // InternalSms.g:387:1: ruleSRootType : ( ( rule__SRootType__Group__0 ) ) ;
    public final void ruleSRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:391:2: ( ( ( rule__SRootType__Group__0 ) ) )
            // InternalSms.g:392:2: ( ( rule__SRootType__Group__0 ) )
            {
            // InternalSms.g:392:2: ( ( rule__SRootType__Group__0 ) )
            // InternalSms.g:393:3: ( rule__SRootType__Group__0 )
            {
             before(grammarAccess.getSRootTypeAccess().getGroup()); 
            // InternalSms.g:394:3: ( rule__SRootType__Group__0 )
            // InternalSms.g:394:4: rule__SRootType__Group__0
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
    // InternalSms.g:403:1: entryRuleSDetailType : ruleSDetailType EOF ;
    public final void entryRuleSDetailType() throws RecognitionException {
        try {
            // InternalSms.g:404:1: ( ruleSDetailType EOF )
            // InternalSms.g:405:1: ruleSDetailType EOF
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
    // InternalSms.g:412:1: ruleSDetailType : ( ( rule__SDetailType__Group__0 ) ) ;
    public final void ruleSDetailType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:416:2: ( ( ( rule__SDetailType__Group__0 ) ) )
            // InternalSms.g:417:2: ( ( rule__SDetailType__Group__0 ) )
            {
            // InternalSms.g:417:2: ( ( rule__SDetailType__Group__0 ) )
            // InternalSms.g:418:3: ( rule__SDetailType__Group__0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getGroup()); 
            // InternalSms.g:419:3: ( rule__SDetailType__Group__0 )
            // InternalSms.g:419:4: rule__SDetailType__Group__0
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


    // $ANTLR start "ruleSComplexType"
    // InternalSms.g:429:1: ruleSComplexType : ( ( rule__SComplexType__Group__0 ) ) ;
    public final void ruleSComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:433:2: ( ( ( rule__SComplexType__Group__0 ) ) )
            // InternalSms.g:434:2: ( ( rule__SComplexType__Group__0 ) )
            {
            // InternalSms.g:434:2: ( ( rule__SComplexType__Group__0 ) )
            // InternalSms.g:435:3: ( rule__SComplexType__Group__0 )
            {
             before(grammarAccess.getSComplexTypeAccess().getGroup()); 
            // InternalSms.g:436:3: ( rule__SComplexType__Group__0 )
            // InternalSms.g:436:4: rule__SComplexType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSComplexTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSComplexType"


    // $ANTLR start "entryRuleSFeature"
    // InternalSms.g:445:1: entryRuleSFeature : ruleSFeature EOF ;
    public final void entryRuleSFeature() throws RecognitionException {
        try {
            // InternalSms.g:446:1: ( ruleSFeature EOF )
            // InternalSms.g:447:1: ruleSFeature EOF
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
    // InternalSms.g:454:1: ruleSFeature : ( ( rule__SFeature__Alternatives ) ) ;
    public final void ruleSFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:458:2: ( ( ( rule__SFeature__Alternatives ) ) )
            // InternalSms.g:459:2: ( ( rule__SFeature__Alternatives ) )
            {
            // InternalSms.g:459:2: ( ( rule__SFeature__Alternatives ) )
            // InternalSms.g:460:3: ( rule__SFeature__Alternatives )
            {
             before(grammarAccess.getSFeatureAccess().getAlternatives()); 
            // InternalSms.g:461:3: ( rule__SFeature__Alternatives )
            // InternalSms.g:461:4: rule__SFeature__Alternatives
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
    // InternalSms.g:470:1: entryRuleSAssociation : ruleSAssociation EOF ;
    public final void entryRuleSAssociation() throws RecognitionException {
        try {
            // InternalSms.g:471:1: ( ruleSAssociation EOF )
            // InternalSms.g:472:1: ruleSAssociation EOF
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
    // InternalSms.g:479:1: ruleSAssociation : ( ( rule__SAssociation__Group__0 ) ) ;
    public final void ruleSAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:483:2: ( ( ( rule__SAssociation__Group__0 ) ) )
            // InternalSms.g:484:2: ( ( rule__SAssociation__Group__0 ) )
            {
            // InternalSms.g:484:2: ( ( rule__SAssociation__Group__0 ) )
            // InternalSms.g:485:3: ( rule__SAssociation__Group__0 )
            {
             before(grammarAccess.getSAssociationAccess().getGroup()); 
            // InternalSms.g:486:3: ( rule__SAssociation__Group__0 )
            // InternalSms.g:486:4: rule__SAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getGroup()); 

            }


            }

        }
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
    // InternalSms.g:495:1: entryRuleSAttribute : ruleSAttribute EOF ;
    public final void entryRuleSAttribute() throws RecognitionException {
        try {
            // InternalSms.g:496:1: ( ruleSAttribute EOF )
            // InternalSms.g:497:1: ruleSAttribute EOF
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
    // InternalSms.g:504:1: ruleSAttribute : ( ( rule__SAttribute__Alternatives ) ) ;
    public final void ruleSAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:508:2: ( ( ( rule__SAttribute__Alternatives ) ) )
            // InternalSms.g:509:2: ( ( rule__SAttribute__Alternatives ) )
            {
            // InternalSms.g:509:2: ( ( rule__SAttribute__Alternatives ) )
            // InternalSms.g:510:3: ( rule__SAttribute__Alternatives )
            {
             before(grammarAccess.getSAttributeAccess().getAlternatives()); 
            // InternalSms.g:511:3: ( rule__SAttribute__Alternatives )
            // InternalSms.g:511:4: rule__SAttribute__Alternatives
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
    // InternalSms.g:520:1: entryRuleSQuery : ruleSQuery EOF ;
    public final void entryRuleSQuery() throws RecognitionException {
        try {
            // InternalSms.g:521:1: ( ruleSQuery EOF )
            // InternalSms.g:522:1: ruleSQuery EOF
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
    // InternalSms.g:529:1: ruleSQuery : ( ( rule__SQuery__Group__0 ) ) ;
    public final void ruleSQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:533:2: ( ( ( rule__SQuery__Group__0 ) ) )
            // InternalSms.g:534:2: ( ( rule__SQuery__Group__0 ) )
            {
            // InternalSms.g:534:2: ( ( rule__SQuery__Group__0 ) )
            // InternalSms.g:535:3: ( rule__SQuery__Group__0 )
            {
             before(grammarAccess.getSQueryAccess().getGroup()); 
            // InternalSms.g:536:3: ( rule__SQuery__Group__0 )
            // InternalSms.g:536:4: rule__SQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getGroup()); 

            }


            }

        }
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
    // InternalSms.g:545:1: entryRuleSQueryParameter : ruleSQueryParameter EOF ;
    public final void entryRuleSQueryParameter() throws RecognitionException {
        try {
            // InternalSms.g:546:1: ( ruleSQueryParameter EOF )
            // InternalSms.g:547:1: ruleSQueryParameter EOF
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
    // InternalSms.g:554:1: ruleSQueryParameter : ( ( rule__SQueryParameter__Group__0 ) ) ;
    public final void ruleSQueryParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:558:2: ( ( ( rule__SQueryParameter__Group__0 ) ) )
            // InternalSms.g:559:2: ( ( rule__SQueryParameter__Group__0 ) )
            {
            // InternalSms.g:559:2: ( ( rule__SQueryParameter__Group__0 ) )
            // InternalSms.g:560:3: ( rule__SQueryParameter__Group__0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getGroup()); 
            // InternalSms.g:561:3: ( rule__SQueryParameter__Group__0 )
            // InternalSms.g:561:4: rule__SQueryParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getGroup()); 

            }


            }

        }
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
    // InternalSms.g:570:1: entryRuleSExpression : ruleSExpression EOF ;
    public final void entryRuleSExpression() throws RecognitionException {
        try {
            // InternalSms.g:571:1: ( ruleSExpression EOF )
            // InternalSms.g:572:1: ruleSExpression EOF
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
    // InternalSms.g:579:1: ruleSExpression : ( ( rule__SExpression__ExprAssignment ) ) ;
    public final void ruleSExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:583:2: ( ( ( rule__SExpression__ExprAssignment ) ) )
            // InternalSms.g:584:2: ( ( rule__SExpression__ExprAssignment ) )
            {
            // InternalSms.g:584:2: ( ( rule__SExpression__ExprAssignment ) )
            // InternalSms.g:585:3: ( rule__SExpression__ExprAssignment )
            {
             before(grammarAccess.getSExpressionAccess().getExprAssignment()); 
            // InternalSms.g:586:3: ( rule__SExpression__ExprAssignment )
            // InternalSms.g:586:4: rule__SExpression__ExprAssignment
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
    // InternalSms.g:595:1: entryRuleSQualifiedNameWithWildcard : ruleSQualifiedNameWithWildcard EOF ;
    public final void entryRuleSQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalSms.g:596:1: ( ruleSQualifiedNameWithWildcard EOF )
            // InternalSms.g:597:1: ruleSQualifiedNameWithWildcard EOF
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
    // InternalSms.g:604:1: ruleSQualifiedNameWithWildcard : ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleSQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:608:2: ( ( ( rule__SQualifiedNameWithWildcard__Group__0 ) ) )
            // InternalSms.g:609:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalSms.g:609:2: ( ( rule__SQualifiedNameWithWildcard__Group__0 ) )
            // InternalSms.g:610:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalSms.g:611:3: ( rule__SQualifiedNameWithWildcard__Group__0 )
            // InternalSms.g:611:4: rule__SQualifiedNameWithWildcard__Group__0
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
    // InternalSms.g:620:1: entryRuleSQualifiedName : ruleSQualifiedName EOF ;
    public final void entryRuleSQualifiedName() throws RecognitionException {
        try {
            // InternalSms.g:621:1: ( ruleSQualifiedName EOF )
            // InternalSms.g:622:1: ruleSQualifiedName EOF
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
    // InternalSms.g:629:1: ruleSQualifiedName : ( ( rule__SQualifiedName__Group__0 ) ) ;
    public final void ruleSQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:633:2: ( ( ( rule__SQualifiedName__Group__0 ) ) )
            // InternalSms.g:634:2: ( ( rule__SQualifiedName__Group__0 ) )
            {
            // InternalSms.g:634:2: ( ( rule__SQualifiedName__Group__0 ) )
            // InternalSms.g:635:3: ( rule__SQualifiedName__Group__0 )
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup()); 
            // InternalSms.g:636:3: ( rule__SQualifiedName__Group__0 )
            // InternalSms.g:636:4: rule__SQualifiedName__Group__0
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
    // InternalSms.g:645:1: entryRuleSMultiplicity : ruleSMultiplicity EOF ;
    public final void entryRuleSMultiplicity() throws RecognitionException {
        try {
            // InternalSms.g:646:1: ( ruleSMultiplicity EOF )
            // InternalSms.g:647:1: ruleSMultiplicity EOF
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
    // InternalSms.g:654:1: ruleSMultiplicity : ( ( rule__SMultiplicity__Group__0 ) ) ;
    public final void ruleSMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:658:2: ( ( ( rule__SMultiplicity__Group__0 ) ) )
            // InternalSms.g:659:2: ( ( rule__SMultiplicity__Group__0 ) )
            {
            // InternalSms.g:659:2: ( ( rule__SMultiplicity__Group__0 ) )
            // InternalSms.g:660:3: ( rule__SMultiplicity__Group__0 )
            {
             before(grammarAccess.getSMultiplicityAccess().getGroup()); 
            // InternalSms.g:661:3: ( rule__SMultiplicity__Group__0 )
            // InternalSms.g:661:4: rule__SMultiplicity__Group__0
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
    // InternalSms.g:670:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalSms.g:671:1: ( ruleMULTIPLICITY EOF )
            // InternalSms.g:672:1: ruleMULTIPLICITY EOF
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
    // InternalSms.g:679:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:683:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalSms.g:684:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalSms.g:684:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalSms.g:685:3: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // InternalSms.g:686:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalSms.g:686:4: rule__MULTIPLICITY__Alternatives
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
    // InternalSms.g:695:1: ruleSAssociationKind : ( ( rule__SAssociationKind__Alternatives ) ) ;
    public final void ruleSAssociationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:699:1: ( ( ( rule__SAssociationKind__Alternatives ) ) )
            // InternalSms.g:700:2: ( ( rule__SAssociationKind__Alternatives ) )
            {
            // InternalSms.g:700:2: ( ( rule__SAssociationKind__Alternatives ) )
            // InternalSms.g:701:3: ( rule__SAssociationKind__Alternatives )
            {
             before(grammarAccess.getSAssociationKindAccess().getAlternatives()); 
            // InternalSms.g:702:3: ( rule__SAssociationKind__Alternatives )
            // InternalSms.g:702:4: rule__SAssociationKind__Alternatives
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
    // InternalSms.g:711:1: ruleSAssociationKindInverse : ( ( 'inverse' ) ) ;
    public final void ruleSAssociationKindInverse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:715:1: ( ( ( 'inverse' ) ) )
            // InternalSms.g:716:2: ( ( 'inverse' ) )
            {
            // InternalSms.g:716:2: ( ( 'inverse' ) )
            // InternalSms.g:717:3: ( 'inverse' )
            {
             before(grammarAccess.getSAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration()); 
            // InternalSms.g:718:3: ( 'inverse' )
            // InternalSms.g:718:4: 'inverse'
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
    // InternalSms.g:726:1: rule__SDomain__Alternatives_3 : ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) );
    public final void rule__SDomain__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:730:1: ( ( ( rule__SDomain__TypesAssignment_3_0 ) ) | ( ( rule__SDomain__AggregatesAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=27 && LA1_0<=28)||LA1_0==31||(LA1_0>=33 && LA1_0<=34)||LA1_0==42) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSms.g:731:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    {
                    // InternalSms.g:731:2: ( ( rule__SDomain__TypesAssignment_3_0 ) )
                    // InternalSms.g:732:3: ( rule__SDomain__TypesAssignment_3_0 )
                    {
                     before(grammarAccess.getSDomainAccess().getTypesAssignment_3_0()); 
                    // InternalSms.g:733:3: ( rule__SDomain__TypesAssignment_3_0 )
                    // InternalSms.g:733:4: rule__SDomain__TypesAssignment_3_0
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
                    // InternalSms.g:737:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    {
                    // InternalSms.g:737:2: ( ( rule__SDomain__AggregatesAssignment_3_1 ) )
                    // InternalSms.g:738:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    {
                     before(grammarAccess.getSDomainAccess().getAggregatesAssignment_3_1()); 
                    // InternalSms.g:739:3: ( rule__SDomain__AggregatesAssignment_3_1 )
                    // InternalSms.g:739:4: rule__SDomain__AggregatesAssignment_3_1
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


    // $ANTLR start "rule__STransform__Alternatives"
    // InternalSms.g:747:1: rule__STransform__Alternatives : ( ( ruleSSpoofTransform ) | ( ruleSMorphTransform ) );
    public final void rule__STransform__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:751:1: ( ( ruleSSpoofTransform ) | ( ruleSMorphTransform ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSms.g:752:2: ( ruleSSpoofTransform )
                    {
                    // InternalSms.g:752:2: ( ruleSSpoofTransform )
                    // InternalSms.g:753:3: ruleSSpoofTransform
                    {
                     before(grammarAccess.getSTransformAccess().getSSpoofTransformParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSSpoofTransform();

                    state._fsp--;

                     after(grammarAccess.getSTransformAccess().getSSpoofTransformParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:758:2: ( ruleSMorphTransform )
                    {
                    // InternalSms.g:758:2: ( ruleSMorphTransform )
                    // InternalSms.g:759:3: ruleSMorphTransform
                    {
                     before(grammarAccess.getSTransformAccess().getSMorphTransformParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSMorphTransform();

                    state._fsp--;

                     after(grammarAccess.getSTransformAccess().getSMorphTransformParserRuleCall_1()); 

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
    // $ANTLR end "rule__STransform__Alternatives"


    // $ANTLR start "rule__SType__Alternatives"
    // InternalSms.g:768:1: rule__SType__Alternatives : ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) );
    public final void rule__SType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:772:1: ( ( ruleSPrimitive ) | ( ruleSEnumeration ) | ( ruleSRootType ) | ( ruleSDetailType ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt3=1;
                    }
                    break;
                case 42:
                    {
                    int LA3_7 = input.LA(3);

                    if ( (LA3_7==33) ) {
                        alt3=3;
                    }
                    else if ( (LA3_7==34) ) {
                        alt3=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 33:
                    {
                    alt3=3;
                    }
                    break;
                case 34:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==33) ) {
                    alt3=3;
                }
                else if ( (LA3_4==34) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSms.g:773:2: ( ruleSPrimitive )
                    {
                    // InternalSms.g:773:2: ( ruleSPrimitive )
                    // InternalSms.g:774:3: ruleSPrimitive
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
                    // InternalSms.g:779:2: ( ruleSEnumeration )
                    {
                    // InternalSms.g:779:2: ( ruleSEnumeration )
                    // InternalSms.g:780:3: ruleSEnumeration
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
                    // InternalSms.g:785:2: ( ruleSRootType )
                    {
                    // InternalSms.g:785:2: ( ruleSRootType )
                    // InternalSms.g:786:3: ruleSRootType
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
                    // InternalSms.g:791:2: ( ruleSDetailType )
                    {
                    // InternalSms.g:791:2: ( ruleSDetailType )
                    // InternalSms.g:792:3: ruleSDetailType
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


    // $ANTLR start "rule__SPrimitive__Alternatives"
    // InternalSms.g:801:1: rule__SPrimitive__Alternatives : ( ( ( rule__SPrimitive__Group_0__0 ) ) | ( ( rule__SPrimitive__Group_1__0 ) ) );
    public final void rule__SPrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:805:1: ( ( ( rule__SPrimitive__Group_0__0 ) ) | ( ( rule__SPrimitive__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSms.g:806:2: ( ( rule__SPrimitive__Group_0__0 ) )
                    {
                    // InternalSms.g:806:2: ( ( rule__SPrimitive__Group_0__0 ) )
                    // InternalSms.g:807:3: ( rule__SPrimitive__Group_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_0()); 
                    // InternalSms.g:808:3: ( rule__SPrimitive__Group_0__0 )
                    // InternalSms.g:808:4: rule__SPrimitive__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:812:2: ( ( rule__SPrimitive__Group_1__0 ) )
                    {
                    // InternalSms.g:812:2: ( ( rule__SPrimitive__Group_1__0 ) )
                    // InternalSms.g:813:3: ( rule__SPrimitive__Group_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_1()); 
                    // InternalSms.g:814:3: ( rule__SPrimitive__Group_1__0 )
                    // InternalSms.g:814:4: rule__SPrimitive__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SPrimitive__Alternatives"


    // $ANTLR start "rule__SRootType__Alternatives_0"
    // InternalSms.g:822:1: rule__SRootType__Alternatives_0 : ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) );
    public final void rule__SRootType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:826:1: ( ( ( rule__SRootType__Group_0_0__0 ) ) | ( ( rule__SRootType__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==33||LA5_0==42) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSms.g:827:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    {
                    // InternalSms.g:827:2: ( ( rule__SRootType__Group_0_0__0 ) )
                    // InternalSms.g:828:3: ( rule__SRootType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_0()); 
                    // InternalSms.g:829:3: ( rule__SRootType__Group_0_0__0 )
                    // InternalSms.g:829:4: rule__SRootType__Group_0_0__0
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
                    // InternalSms.g:833:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    {
                    // InternalSms.g:833:2: ( ( rule__SRootType__Group_0_1__0 ) )
                    // InternalSms.g:834:3: ( rule__SRootType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 
                    // InternalSms.g:835:3: ( rule__SRootType__Group_0_1__0 )
                    // InternalSms.g:835:4: rule__SRootType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSRootTypeAccess().getGroup_0_1()); 

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
    // InternalSms.g:843:1: rule__SDetailType__Alternatives_0 : ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) );
    public final void rule__SDetailType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:847:1: ( ( ( rule__SDetailType__Group_0_0__0 ) ) | ( ( rule__SDetailType__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==34||LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSms.g:848:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    {
                    // InternalSms.g:848:2: ( ( rule__SDetailType__Group_0_0__0 ) )
                    // InternalSms.g:849:3: ( rule__SDetailType__Group_0_0__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_0()); 
                    // InternalSms.g:850:3: ( rule__SDetailType__Group_0_0__0 )
                    // InternalSms.g:850:4: rule__SDetailType__Group_0_0__0
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
                    // InternalSms.g:854:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    {
                    // InternalSms.g:854:2: ( ( rule__SDetailType__Group_0_1__0 ) )
                    // InternalSms.g:855:3: ( rule__SDetailType__Group_0_1__0 )
                    {
                     before(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 
                    // InternalSms.g:856:3: ( rule__SDetailType__Group_0_1__0 )
                    // InternalSms.g:856:4: rule__SDetailType__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDetailTypeAccess().getGroup_0_1()); 

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


    // $ANTLR start "rule__SComplexType__Alternatives_2"
    // InternalSms.g:864:1: rule__SComplexType__Alternatives_2 : ( ( ( rule__SComplexType__FeaturesAssignment_2_0 ) ) | ( ( rule__SComplexType__ConstraintsAssignment_2_1 ) ) );
    public final void rule__SComplexType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:868:1: ( ( ( rule__SComplexType__FeaturesAssignment_2_0 ) ) | ( ( rule__SComplexType__ConstraintsAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==11||(LA7_0>=13 && LA7_0<=14)||LA7_0==27||LA7_0==34||LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSms.g:869:2: ( ( rule__SComplexType__FeaturesAssignment_2_0 ) )
                    {
                    // InternalSms.g:869:2: ( ( rule__SComplexType__FeaturesAssignment_2_0 ) )
                    // InternalSms.g:870:3: ( rule__SComplexType__FeaturesAssignment_2_0 )
                    {
                     before(grammarAccess.getSComplexTypeAccess().getFeaturesAssignment_2_0()); 
                    // InternalSms.g:871:3: ( rule__SComplexType__FeaturesAssignment_2_0 )
                    // InternalSms.g:871:4: rule__SComplexType__FeaturesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexType__FeaturesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSComplexTypeAccess().getFeaturesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:875:2: ( ( rule__SComplexType__ConstraintsAssignment_2_1 ) )
                    {
                    // InternalSms.g:875:2: ( ( rule__SComplexType__ConstraintsAssignment_2_1 ) )
                    // InternalSms.g:876:3: ( rule__SComplexType__ConstraintsAssignment_2_1 )
                    {
                     before(grammarAccess.getSComplexTypeAccess().getConstraintsAssignment_2_1()); 
                    // InternalSms.g:877:3: ( rule__SComplexType__ConstraintsAssignment_2_1 )
                    // InternalSms.g:877:4: rule__SComplexType__ConstraintsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexType__ConstraintsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSComplexTypeAccess().getConstraintsAssignment_2_1()); 

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
    // $ANTLR end "rule__SComplexType__Alternatives_2"


    // $ANTLR start "rule__SFeature__Alternatives"
    // InternalSms.g:885:1: rule__SFeature__Alternatives : ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) );
    public final void rule__SFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:889:1: ( ( ruleSAssociation ) | ( ruleSAttribute ) | ( ruleSQuery ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 11:
            case 13:
            case 14:
            case 43:
                {
                alt8=1;
                }
                break;
            case 27:
            case 34:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==26) ) {
                    alt8=2;
                }
                else if ( (LA8_3==36) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSms.g:890:2: ( ruleSAssociation )
                    {
                    // InternalSms.g:890:2: ( ruleSAssociation )
                    // InternalSms.g:891:3: ruleSAssociation
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
                    // InternalSms.g:896:2: ( ruleSAttribute )
                    {
                    // InternalSms.g:896:2: ( ruleSAttribute )
                    // InternalSms.g:897:3: ruleSAttribute
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
                    // InternalSms.g:902:2: ( ruleSQuery )
                    {
                    // InternalSms.g:902:2: ( ruleSQuery )
                    // InternalSms.g:903:3: ruleSQuery
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


    // $ANTLR start "rule__SAssociation__Alternatives_1"
    // InternalSms.g:912:1: rule__SAssociation__Alternatives_1 : ( ( ( rule__SAssociation__KindAssignment_1_0 ) ) | ( ( rule__SAssociation__Group_1_1__0 ) ) );
    public final void rule__SAssociation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:916:1: ( ( ( rule__SAssociation__KindAssignment_1_0 ) ) | ( ( rule__SAssociation__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSms.g:917:2: ( ( rule__SAssociation__KindAssignment_1_0 ) )
                    {
                    // InternalSms.g:917:2: ( ( rule__SAssociation__KindAssignment_1_0 ) )
                    // InternalSms.g:918:3: ( rule__SAssociation__KindAssignment_1_0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getKindAssignment_1_0()); 
                    // InternalSms.g:919:3: ( rule__SAssociation__KindAssignment_1_0 )
                    // InternalSms.g:919:4: rule__SAssociation__KindAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__KindAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getKindAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:923:2: ( ( rule__SAssociation__Group_1_1__0 ) )
                    {
                    // InternalSms.g:923:2: ( ( rule__SAssociation__Group_1_1__0 ) )
                    // InternalSms.g:924:3: ( rule__SAssociation__Group_1_1__0 )
                    {
                     before(grammarAccess.getSAssociationAccess().getGroup_1_1()); 
                    // InternalSms.g:925:3: ( rule__SAssociation__Group_1_1__0 )
                    // InternalSms.g:925:4: rule__SAssociation__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAssociationAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__SAssociation__Alternatives_1"


    // $ANTLR start "rule__SAttribute__Alternatives"
    // InternalSms.g:933:1: rule__SAttribute__Alternatives : ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) );
    public final void rule__SAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:937:1: ( ( ( rule__SAttribute__Group_0__0 ) ) | ( ( rule__SAttribute__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==34) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSms.g:938:2: ( ( rule__SAttribute__Group_0__0 ) )
                    {
                    // InternalSms.g:938:2: ( ( rule__SAttribute__Group_0__0 ) )
                    // InternalSms.g:939:3: ( rule__SAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_0()); 
                    // InternalSms.g:940:3: ( rule__SAttribute__Group_0__0 )
                    // InternalSms.g:940:4: rule__SAttribute__Group_0__0
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
                    // InternalSms.g:944:2: ( ( rule__SAttribute__Group_1__0 ) )
                    {
                    // InternalSms.g:944:2: ( ( rule__SAttribute__Group_1__0 ) )
                    // InternalSms.g:945:3: ( rule__SAttribute__Group_1__0 )
                    {
                     before(grammarAccess.getSAttributeAccess().getGroup_1()); 
                    // InternalSms.g:946:3: ( rule__SAttribute__Group_1__0 )
                    // InternalSms.g:946:4: rule__SAttribute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSAttributeAccess().getGroup_1()); 

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


    // $ANTLR start "rule__MULTIPLICITY__Alternatives"
    // InternalSms.g:954:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:958:1: ( ( RULE_INT ) | ( '*' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSms.g:959:2: ( RULE_INT )
                    {
                    // InternalSms.g:959:2: ( RULE_INT )
                    // InternalSms.g:960:3: RULE_INT
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMULTIPLICITYAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:965:2: ( '*' )
                    {
                    // InternalSms.g:965:2: ( '*' )
                    // InternalSms.g:966:3: '*'
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalSms.g:975:1: rule__SAssociationKind__Alternatives : ( ( ( 'reference' ) ) | ( ( 'composite' ) ) );
    public final void rule__SAssociationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:979:1: ( ( ( 'reference' ) ) | ( ( 'composite' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSms.g:980:2: ( ( 'reference' ) )
                    {
                    // InternalSms.g:980:2: ( ( 'reference' ) )
                    // InternalSms.g:981:3: ( 'reference' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 
                    // InternalSms.g:982:3: ( 'reference' )
                    // InternalSms.g:982:4: 'reference'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:986:2: ( ( 'composite' ) )
                    {
                    // InternalSms.g:986:2: ( ( 'composite' ) )
                    // InternalSms.g:987:3: ( 'composite' )
                    {
                     before(grammarAccess.getSAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1()); 
                    // InternalSms.g:988:3: ( 'composite' )
                    // InternalSms.g:988:4: 'composite'
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


    // $ANTLR start "rule__SDomain__Group__0"
    // InternalSms.g:996:1: rule__SDomain__Group__0 : rule__SDomain__Group__0__Impl rule__SDomain__Group__1 ;
    public final void rule__SDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1000:1: ( rule__SDomain__Group__0__Impl rule__SDomain__Group__1 )
            // InternalSms.g:1001:2: rule__SDomain__Group__0__Impl rule__SDomain__Group__1
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
    // InternalSms.g:1008:1: rule__SDomain__Group__0__Impl : ( 'domain' ) ;
    public final void rule__SDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1012:1: ( ( 'domain' ) )
            // InternalSms.g:1013:1: ( 'domain' )
            {
            // InternalSms.g:1013:1: ( 'domain' )
            // InternalSms.g:1014:2: 'domain'
            {
             before(grammarAccess.getSDomainAccess().getDomainKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSms.g:1023:1: rule__SDomain__Group__1 : rule__SDomain__Group__1__Impl rule__SDomain__Group__2 ;
    public final void rule__SDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1027:1: ( rule__SDomain__Group__1__Impl rule__SDomain__Group__2 )
            // InternalSms.g:1028:2: rule__SDomain__Group__1__Impl rule__SDomain__Group__2
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
    // InternalSms.g:1035:1: rule__SDomain__Group__1__Impl : ( ( rule__SDomain__NameAssignment_1 ) ) ;
    public final void rule__SDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1039:1: ( ( ( rule__SDomain__NameAssignment_1 ) ) )
            // InternalSms.g:1040:1: ( ( rule__SDomain__NameAssignment_1 ) )
            {
            // InternalSms.g:1040:1: ( ( rule__SDomain__NameAssignment_1 ) )
            // InternalSms.g:1041:2: ( rule__SDomain__NameAssignment_1 )
            {
             before(grammarAccess.getSDomainAccess().getNameAssignment_1()); 
            // InternalSms.g:1042:2: ( rule__SDomain__NameAssignment_1 )
            // InternalSms.g:1042:3: rule__SDomain__NameAssignment_1
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
    // InternalSms.g:1050:1: rule__SDomain__Group__2 : rule__SDomain__Group__2__Impl rule__SDomain__Group__3 ;
    public final void rule__SDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1054:1: ( rule__SDomain__Group__2__Impl rule__SDomain__Group__3 )
            // InternalSms.g:1055:2: rule__SDomain__Group__2__Impl rule__SDomain__Group__3
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
    // InternalSms.g:1062:1: rule__SDomain__Group__2__Impl : ( ( rule__SDomain__ImportsAssignment_2 )* ) ;
    public final void rule__SDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1066:1: ( ( ( rule__SDomain__ImportsAssignment_2 )* ) )
            // InternalSms.g:1067:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            {
            // InternalSms.g:1067:1: ( ( rule__SDomain__ImportsAssignment_2 )* )
            // InternalSms.g:1068:2: ( rule__SDomain__ImportsAssignment_2 )*
            {
             before(grammarAccess.getSDomainAccess().getImportsAssignment_2()); 
            // InternalSms.g:1069:2: ( rule__SDomain__ImportsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSms.g:1069:3: rule__SDomain__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SDomain__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSms.g:1077:1: rule__SDomain__Group__3 : rule__SDomain__Group__3__Impl ;
    public final void rule__SDomain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1081:1: ( rule__SDomain__Group__3__Impl )
            // InternalSms.g:1082:2: rule__SDomain__Group__3__Impl
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
    // InternalSms.g:1088:1: rule__SDomain__Group__3__Impl : ( ( rule__SDomain__Alternatives_3 )* ) ;
    public final void rule__SDomain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1092:1: ( ( ( rule__SDomain__Alternatives_3 )* ) )
            // InternalSms.g:1093:1: ( ( rule__SDomain__Alternatives_3 )* )
            {
            // InternalSms.g:1093:1: ( ( rule__SDomain__Alternatives_3 )* )
            // InternalSms.g:1094:2: ( rule__SDomain__Alternatives_3 )*
            {
             before(grammarAccess.getSDomainAccess().getAlternatives_3()); 
            // InternalSms.g:1095:2: ( rule__SDomain__Alternatives_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22||(LA14_0>=27 && LA14_0<=28)||LA14_0==31||(LA14_0>=33 && LA14_0<=34)||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSms.g:1095:3: rule__SDomain__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SDomain__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalSms.g:1104:1: rule__SImport__Group__0 : rule__SImport__Group__0__Impl rule__SImport__Group__1 ;
    public final void rule__SImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1108:1: ( rule__SImport__Group__0__Impl rule__SImport__Group__1 )
            // InternalSms.g:1109:2: rule__SImport__Group__0__Impl rule__SImport__Group__1
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
    // InternalSms.g:1116:1: rule__SImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1120:1: ( ( 'import' ) )
            // InternalSms.g:1121:1: ( 'import' )
            {
            // InternalSms.g:1121:1: ( 'import' )
            // InternalSms.g:1122:2: 'import'
            {
             before(grammarAccess.getSImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalSms.g:1131:1: rule__SImport__Group__1 : rule__SImport__Group__1__Impl ;
    public final void rule__SImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1135:1: ( rule__SImport__Group__1__Impl )
            // InternalSms.g:1136:2: rule__SImport__Group__1__Impl
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
    // InternalSms.g:1142:1: rule__SImport__Group__1__Impl : ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1146:1: ( ( ( rule__SImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalSms.g:1147:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalSms.g:1147:1: ( ( rule__SImport__ImportedNamespaceAssignment_1 ) )
            // InternalSms.g:1148:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getSImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalSms.g:1149:2: ( rule__SImport__ImportedNamespaceAssignment_1 )
            // InternalSms.g:1149:3: rule__SImport__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__SDeductionRule__Group__0"
    // InternalSms.g:1158:1: rule__SDeductionRule__Group__0 : rule__SDeductionRule__Group__0__Impl rule__SDeductionRule__Group__1 ;
    public final void rule__SDeductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1162:1: ( rule__SDeductionRule__Group__0__Impl rule__SDeductionRule__Group__1 )
            // InternalSms.g:1163:2: rule__SDeductionRule__Group__0__Impl rule__SDeductionRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SDeductionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SDeductionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__Group__0"


    // $ANTLR start "rule__SDeductionRule__Group__0__Impl"
    // InternalSms.g:1170:1: rule__SDeductionRule__Group__0__Impl : ( ( rule__SDeductionRule__SourceAssignment_0 ) ) ;
    public final void rule__SDeductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1174:1: ( ( ( rule__SDeductionRule__SourceAssignment_0 ) ) )
            // InternalSms.g:1175:1: ( ( rule__SDeductionRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:1175:1: ( ( rule__SDeductionRule__SourceAssignment_0 ) )
            // InternalSms.g:1176:2: ( rule__SDeductionRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSDeductionRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:1177:2: ( rule__SDeductionRule__SourceAssignment_0 )
            // InternalSms.g:1177:3: rule__SDeductionRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SDeductionRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSDeductionRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__Group__0__Impl"


    // $ANTLR start "rule__SDeductionRule__Group__1"
    // InternalSms.g:1185:1: rule__SDeductionRule__Group__1 : rule__SDeductionRule__Group__1__Impl ;
    public final void rule__SDeductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1189:1: ( rule__SDeductionRule__Group__1__Impl )
            // InternalSms.g:1190:2: rule__SDeductionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDeductionRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__Group__1"


    // $ANTLR start "rule__SDeductionRule__Group__1__Impl"
    // InternalSms.g:1196:1: rule__SDeductionRule__Group__1__Impl : ( ( rule__SDeductionRule__TransformAssignment_1 ) ) ;
    public final void rule__SDeductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1200:1: ( ( ( rule__SDeductionRule__TransformAssignment_1 ) ) )
            // InternalSms.g:1201:1: ( ( rule__SDeductionRule__TransformAssignment_1 ) )
            {
            // InternalSms.g:1201:1: ( ( rule__SDeductionRule__TransformAssignment_1 ) )
            // InternalSms.g:1202:2: ( rule__SDeductionRule__TransformAssignment_1 )
            {
             before(grammarAccess.getSDeductionRuleAccess().getTransformAssignment_1()); 
            // InternalSms.g:1203:2: ( rule__SDeductionRule__TransformAssignment_1 )
            // InternalSms.g:1203:3: rule__SDeductionRule__TransformAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SDeductionRule__TransformAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSDeductionRuleAccess().getTransformAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__Group__1__Impl"


    // $ANTLR start "rule__SMemberDeductionRule__Group__0"
    // InternalSms.g:1212:1: rule__SMemberDeductionRule__Group__0 : rule__SMemberDeductionRule__Group__0__Impl rule__SMemberDeductionRule__Group__1 ;
    public final void rule__SMemberDeductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1216:1: ( rule__SMemberDeductionRule__Group__0__Impl rule__SMemberDeductionRule__Group__1 )
            // InternalSms.g:1217:2: rule__SMemberDeductionRule__Group__0__Impl rule__SMemberDeductionRule__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SMemberDeductionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMemberDeductionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__Group__0"


    // $ANTLR start "rule__SMemberDeductionRule__Group__0__Impl"
    // InternalSms.g:1224:1: rule__SMemberDeductionRule__Group__0__Impl : ( ( rule__SMemberDeductionRule__SourceAssignment_0 ) ) ;
    public final void rule__SMemberDeductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1228:1: ( ( ( rule__SMemberDeductionRule__SourceAssignment_0 ) ) )
            // InternalSms.g:1229:1: ( ( rule__SMemberDeductionRule__SourceAssignment_0 ) )
            {
            // InternalSms.g:1229:1: ( ( rule__SMemberDeductionRule__SourceAssignment_0 ) )
            // InternalSms.g:1230:2: ( rule__SMemberDeductionRule__SourceAssignment_0 )
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getSourceAssignment_0()); 
            // InternalSms.g:1231:2: ( rule__SMemberDeductionRule__SourceAssignment_0 )
            // InternalSms.g:1231:3: rule__SMemberDeductionRule__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SMemberDeductionRule__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSMemberDeductionRuleAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__Group__0__Impl"


    // $ANTLR start "rule__SMemberDeductionRule__Group__1"
    // InternalSms.g:1239:1: rule__SMemberDeductionRule__Group__1 : rule__SMemberDeductionRule__Group__1__Impl ;
    public final void rule__SMemberDeductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1243:1: ( rule__SMemberDeductionRule__Group__1__Impl )
            // InternalSms.g:1244:2: rule__SMemberDeductionRule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMemberDeductionRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__Group__1"


    // $ANTLR start "rule__SMemberDeductionRule__Group__1__Impl"
    // InternalSms.g:1250:1: rule__SMemberDeductionRule__Group__1__Impl : ( ( rule__SMemberDeductionRule__TransformAssignment_1 ) ) ;
    public final void rule__SMemberDeductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1254:1: ( ( ( rule__SMemberDeductionRule__TransformAssignment_1 ) ) )
            // InternalSms.g:1255:1: ( ( rule__SMemberDeductionRule__TransformAssignment_1 ) )
            {
            // InternalSms.g:1255:1: ( ( rule__SMemberDeductionRule__TransformAssignment_1 ) )
            // InternalSms.g:1256:2: ( rule__SMemberDeductionRule__TransformAssignment_1 )
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getTransformAssignment_1()); 
            // InternalSms.g:1257:2: ( rule__SMemberDeductionRule__TransformAssignment_1 )
            // InternalSms.g:1257:3: rule__SMemberDeductionRule__TransformAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SMemberDeductionRule__TransformAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSMemberDeductionRuleAccess().getTransformAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__Group__1__Impl"


    // $ANTLR start "rule__SSpoofTransform__Group__0"
    // InternalSms.g:1266:1: rule__SSpoofTransform__Group__0 : rule__SSpoofTransform__Group__0__Impl rule__SSpoofTransform__Group__1 ;
    public final void rule__SSpoofTransform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1270:1: ( rule__SSpoofTransform__Group__0__Impl rule__SSpoofTransform__Group__1 )
            // InternalSms.g:1271:2: rule__SSpoofTransform__Group__0__Impl rule__SSpoofTransform__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SSpoofTransform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SSpoofTransform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSpoofTransform__Group__0"


    // $ANTLR start "rule__SSpoofTransform__Group__0__Impl"
    // InternalSms.g:1278:1: rule__SSpoofTransform__Group__0__Impl : ( () ) ;
    public final void rule__SSpoofTransform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1282:1: ( ( () ) )
            // InternalSms.g:1283:1: ( () )
            {
            // InternalSms.g:1283:1: ( () )
            // InternalSms.g:1284:2: ()
            {
             before(grammarAccess.getSSpoofTransformAccess().getSSpoofTransformAction_0()); 
            // InternalSms.g:1285:2: ()
            // InternalSms.g:1285:3: 
            {
            }

             after(grammarAccess.getSSpoofTransformAccess().getSSpoofTransformAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSpoofTransform__Group__0__Impl"


    // $ANTLR start "rule__SSpoofTransform__Group__1"
    // InternalSms.g:1293:1: rule__SSpoofTransform__Group__1 : rule__SSpoofTransform__Group__1__Impl ;
    public final void rule__SSpoofTransform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1297:1: ( rule__SSpoofTransform__Group__1__Impl )
            // InternalSms.g:1298:2: rule__SSpoofTransform__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SSpoofTransform__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSpoofTransform__Group__1"


    // $ANTLR start "rule__SSpoofTransform__Group__1__Impl"
    // InternalSms.g:1304:1: rule__SSpoofTransform__Group__1__Impl : ( 'spoof' ) ;
    public final void rule__SSpoofTransform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1308:1: ( ( 'spoof' ) )
            // InternalSms.g:1309:1: ( 'spoof' )
            {
            // InternalSms.g:1309:1: ( 'spoof' )
            // InternalSms.g:1310:2: 'spoof'
            {
             before(grammarAccess.getSSpoofTransformAccess().getSpoofKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSSpoofTransformAccess().getSpoofKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SSpoofTransform__Group__1__Impl"


    // $ANTLR start "rule__SMorphTransform__Group__0"
    // InternalSms.g:1320:1: rule__SMorphTransform__Group__0 : rule__SMorphTransform__Group__0__Impl rule__SMorphTransform__Group__1 ;
    public final void rule__SMorphTransform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1324:1: ( rule__SMorphTransform__Group__0__Impl rule__SMorphTransform__Group__1 )
            // InternalSms.g:1325:2: rule__SMorphTransform__Group__0__Impl rule__SMorphTransform__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SMorphTransform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__0"


    // $ANTLR start "rule__SMorphTransform__Group__0__Impl"
    // InternalSms.g:1332:1: rule__SMorphTransform__Group__0__Impl : ( () ) ;
    public final void rule__SMorphTransform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1336:1: ( ( () ) )
            // InternalSms.g:1337:1: ( () )
            {
            // InternalSms.g:1337:1: ( () )
            // InternalSms.g:1338:2: ()
            {
             before(grammarAccess.getSMorphTransformAccess().getSMorphTransformAction_0()); 
            // InternalSms.g:1339:2: ()
            // InternalSms.g:1339:3: 
            {
            }

             after(grammarAccess.getSMorphTransformAccess().getSMorphTransformAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__0__Impl"


    // $ANTLR start "rule__SMorphTransform__Group__1"
    // InternalSms.g:1347:1: rule__SMorphTransform__Group__1 : rule__SMorphTransform__Group__1__Impl rule__SMorphTransform__Group__2 ;
    public final void rule__SMorphTransform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1351:1: ( rule__SMorphTransform__Group__1__Impl rule__SMorphTransform__Group__2 )
            // InternalSms.g:1352:2: rule__SMorphTransform__Group__1__Impl rule__SMorphTransform__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SMorphTransform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__1"


    // $ANTLR start "rule__SMorphTransform__Group__1__Impl"
    // InternalSms.g:1359:1: rule__SMorphTransform__Group__1__Impl : ( 'morph' ) ;
    public final void rule__SMorphTransform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1363:1: ( ( 'morph' ) )
            // InternalSms.g:1364:1: ( 'morph' )
            {
            // InternalSms.g:1364:1: ( 'morph' )
            // InternalSms.g:1365:2: 'morph'
            {
             before(grammarAccess.getSMorphTransformAccess().getMorphKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getMorphKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__1__Impl"


    // $ANTLR start "rule__SMorphTransform__Group__2"
    // InternalSms.g:1374:1: rule__SMorphTransform__Group__2 : rule__SMorphTransform__Group__2__Impl rule__SMorphTransform__Group__3 ;
    public final void rule__SMorphTransform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1378:1: ( rule__SMorphTransform__Group__2__Impl rule__SMorphTransform__Group__3 )
            // InternalSms.g:1379:2: rule__SMorphTransform__Group__2__Impl rule__SMorphTransform__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SMorphTransform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__2"


    // $ANTLR start "rule__SMorphTransform__Group__2__Impl"
    // InternalSms.g:1386:1: rule__SMorphTransform__Group__2__Impl : ( ( rule__SMorphTransform__Group_2__0 )? ) ;
    public final void rule__SMorphTransform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1390:1: ( ( ( rule__SMorphTransform__Group_2__0 )? ) )
            // InternalSms.g:1391:1: ( ( rule__SMorphTransform__Group_2__0 )? )
            {
            // InternalSms.g:1391:1: ( ( rule__SMorphTransform__Group_2__0 )? )
            // InternalSms.g:1392:2: ( rule__SMorphTransform__Group_2__0 )?
            {
             before(grammarAccess.getSMorphTransformAccess().getGroup_2()); 
            // InternalSms.g:1393:2: ( rule__SMorphTransform__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSms.g:1393:3: rule__SMorphTransform__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphTransform__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphTransformAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__2__Impl"


    // $ANTLR start "rule__SMorphTransform__Group__3"
    // InternalSms.g:1401:1: rule__SMorphTransform__Group__3 : rule__SMorphTransform__Group__3__Impl ;
    public final void rule__SMorphTransform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1405:1: ( rule__SMorphTransform__Group__3__Impl )
            // InternalSms.g:1406:2: rule__SMorphTransform__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__3"


    // $ANTLR start "rule__SMorphTransform__Group__3__Impl"
    // InternalSms.g:1412:1: rule__SMorphTransform__Group__3__Impl : ( ( rule__SMorphTransform__Group_3__0 )? ) ;
    public final void rule__SMorphTransform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1416:1: ( ( ( rule__SMorphTransform__Group_3__0 )? ) )
            // InternalSms.g:1417:1: ( ( rule__SMorphTransform__Group_3__0 )? )
            {
            // InternalSms.g:1417:1: ( ( rule__SMorphTransform__Group_3__0 )? )
            // InternalSms.g:1418:2: ( rule__SMorphTransform__Group_3__0 )?
            {
             before(grammarAccess.getSMorphTransformAccess().getGroup_3()); 
            // InternalSms.g:1419:2: ( rule__SMorphTransform__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSms.g:1419:3: rule__SMorphTransform__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphTransform__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphTransformAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group__3__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_2__0"
    // InternalSms.g:1428:1: rule__SMorphTransform__Group_2__0 : rule__SMorphTransform__Group_2__0__Impl rule__SMorphTransform__Group_2__1 ;
    public final void rule__SMorphTransform__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1432:1: ( rule__SMorphTransform__Group_2__0__Impl rule__SMorphTransform__Group_2__1 )
            // InternalSms.g:1433:2: rule__SMorphTransform__Group_2__0__Impl rule__SMorphTransform__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__SMorphTransform__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__0"


    // $ANTLR start "rule__SMorphTransform__Group_2__0__Impl"
    // InternalSms.g:1440:1: rule__SMorphTransform__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__SMorphTransform__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1444:1: ( ( 'name' ) )
            // InternalSms.g:1445:1: ( 'name' )
            {
            // InternalSms.g:1445:1: ( 'name' )
            // InternalSms.g:1446:2: 'name'
            {
             before(grammarAccess.getSMorphTransformAccess().getNameKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__0__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_2__1"
    // InternalSms.g:1455:1: rule__SMorphTransform__Group_2__1 : rule__SMorphTransform__Group_2__1__Impl rule__SMorphTransform__Group_2__2 ;
    public final void rule__SMorphTransform__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1459:1: ( rule__SMorphTransform__Group_2__1__Impl rule__SMorphTransform__Group_2__2 )
            // InternalSms.g:1460:2: rule__SMorphTransform__Group_2__1__Impl rule__SMorphTransform__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__SMorphTransform__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__1"


    // $ANTLR start "rule__SMorphTransform__Group_2__1__Impl"
    // InternalSms.g:1467:1: rule__SMorphTransform__Group_2__1__Impl : ( '=' ) ;
    public final void rule__SMorphTransform__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1471:1: ( ( '=' ) )
            // InternalSms.g:1472:1: ( '=' )
            {
            // InternalSms.g:1472:1: ( '=' )
            // InternalSms.g:1473:2: '='
            {
             before(grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__1__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_2__2"
    // InternalSms.g:1482:1: rule__SMorphTransform__Group_2__2 : rule__SMorphTransform__Group_2__2__Impl ;
    public final void rule__SMorphTransform__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1486:1: ( rule__SMorphTransform__Group_2__2__Impl )
            // InternalSms.g:1487:2: rule__SMorphTransform__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__2"


    // $ANTLR start "rule__SMorphTransform__Group_2__2__Impl"
    // InternalSms.g:1493:1: rule__SMorphTransform__Group_2__2__Impl : ( ( rule__SMorphTransform__RenameToAssignment_2_2 ) ) ;
    public final void rule__SMorphTransform__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1497:1: ( ( ( rule__SMorphTransform__RenameToAssignment_2_2 ) ) )
            // InternalSms.g:1498:1: ( ( rule__SMorphTransform__RenameToAssignment_2_2 ) )
            {
            // InternalSms.g:1498:1: ( ( rule__SMorphTransform__RenameToAssignment_2_2 ) )
            // InternalSms.g:1499:2: ( rule__SMorphTransform__RenameToAssignment_2_2 )
            {
             before(grammarAccess.getSMorphTransformAccess().getRenameToAssignment_2_2()); 
            // InternalSms.g:1500:2: ( rule__SMorphTransform__RenameToAssignment_2_2 )
            // InternalSms.g:1500:3: rule__SMorphTransform__RenameToAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__RenameToAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphTransformAccess().getRenameToAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_2__2__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_3__0"
    // InternalSms.g:1509:1: rule__SMorphTransform__Group_3__0 : rule__SMorphTransform__Group_3__0__Impl rule__SMorphTransform__Group_3__1 ;
    public final void rule__SMorphTransform__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1513:1: ( rule__SMorphTransform__Group_3__0__Impl rule__SMorphTransform__Group_3__1 )
            // InternalSms.g:1514:2: rule__SMorphTransform__Group_3__0__Impl rule__SMorphTransform__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__SMorphTransform__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__0"


    // $ANTLR start "rule__SMorphTransform__Group_3__0__Impl"
    // InternalSms.g:1521:1: rule__SMorphTransform__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__SMorphTransform__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1525:1: ( ( 'type' ) )
            // InternalSms.g:1526:1: ( 'type' )
            {
            // InternalSms.g:1526:1: ( 'type' )
            // InternalSms.g:1527:2: 'type'
            {
             before(grammarAccess.getSMorphTransformAccess().getTypeKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__0__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_3__1"
    // InternalSms.g:1536:1: rule__SMorphTransform__Group_3__1 : rule__SMorphTransform__Group_3__1__Impl rule__SMorphTransform__Group_3__2 ;
    public final void rule__SMorphTransform__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1540:1: ( rule__SMorphTransform__Group_3__1__Impl rule__SMorphTransform__Group_3__2 )
            // InternalSms.g:1541:2: rule__SMorphTransform__Group_3__1__Impl rule__SMorphTransform__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__SMorphTransform__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__1"


    // $ANTLR start "rule__SMorphTransform__Group_3__1__Impl"
    // InternalSms.g:1548:1: rule__SMorphTransform__Group_3__1__Impl : ( '=' ) ;
    public final void rule__SMorphTransform__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1552:1: ( ( '=' ) )
            // InternalSms.g:1553:1: ( '=' )
            {
            // InternalSms.g:1553:1: ( '=' )
            // InternalSms.g:1554:2: '='
            {
             before(grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__1__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_3__2"
    // InternalSms.g:1563:1: rule__SMorphTransform__Group_3__2 : rule__SMorphTransform__Group_3__2__Impl rule__SMorphTransform__Group_3__3 ;
    public final void rule__SMorphTransform__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1567:1: ( rule__SMorphTransform__Group_3__2__Impl rule__SMorphTransform__Group_3__3 )
            // InternalSms.g:1568:2: rule__SMorphTransform__Group_3__2__Impl rule__SMorphTransform__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__SMorphTransform__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__2"


    // $ANTLR start "rule__SMorphTransform__Group_3__2__Impl"
    // InternalSms.g:1575:1: rule__SMorphTransform__Group_3__2__Impl : ( ( rule__SMorphTransform__RetypeToAssignment_3_2 ) ) ;
    public final void rule__SMorphTransform__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1579:1: ( ( ( rule__SMorphTransform__RetypeToAssignment_3_2 ) ) )
            // InternalSms.g:1580:1: ( ( rule__SMorphTransform__RetypeToAssignment_3_2 ) )
            {
            // InternalSms.g:1580:1: ( ( rule__SMorphTransform__RetypeToAssignment_3_2 ) )
            // InternalSms.g:1581:2: ( rule__SMorphTransform__RetypeToAssignment_3_2 )
            {
             before(grammarAccess.getSMorphTransformAccess().getRetypeToAssignment_3_2()); 
            // InternalSms.g:1582:2: ( rule__SMorphTransform__RetypeToAssignment_3_2 )
            // InternalSms.g:1582:3: rule__SMorphTransform__RetypeToAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__RetypeToAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSMorphTransformAccess().getRetypeToAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__2__Impl"


    // $ANTLR start "rule__SMorphTransform__Group_3__3"
    // InternalSms.g:1590:1: rule__SMorphTransform__Group_3__3 : rule__SMorphTransform__Group_3__3__Impl ;
    public final void rule__SMorphTransform__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1594:1: ( rule__SMorphTransform__Group_3__3__Impl )
            // InternalSms.g:1595:2: rule__SMorphTransform__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SMorphTransform__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__3"


    // $ANTLR start "rule__SMorphTransform__Group_3__3__Impl"
    // InternalSms.g:1601:1: rule__SMorphTransform__Group_3__3__Impl : ( ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )? ) ;
    public final void rule__SMorphTransform__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1605:1: ( ( ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )? ) )
            // InternalSms.g:1606:1: ( ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )? )
            {
            // InternalSms.g:1606:1: ( ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )? )
            // InternalSms.g:1607:2: ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )?
            {
             before(grammarAccess.getSMorphTransformAccess().getRemultiplyToAssignment_3_3()); 
            // InternalSms.g:1608:2: ( rule__SMorphTransform__RemultiplyToAssignment_3_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSms.g:1608:3: rule__SMorphTransform__RemultiplyToAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SMorphTransform__RemultiplyToAssignment_3_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSMorphTransformAccess().getRemultiplyToAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__Group_3__3__Impl"


    // $ANTLR start "rule__SAggregate__Group__0"
    // InternalSms.g:1617:1: rule__SAggregate__Group__0 : rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 ;
    public final void rule__SAggregate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1621:1: ( rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1 )
            // InternalSms.g:1622:2: rule__SAggregate__Group__0__Impl rule__SAggregate__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSms.g:1629:1: rule__SAggregate__Group__0__Impl : ( () ) ;
    public final void rule__SAggregate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1633:1: ( ( () ) )
            // InternalSms.g:1634:1: ( () )
            {
            // InternalSms.g:1634:1: ( () )
            // InternalSms.g:1635:2: ()
            {
             before(grammarAccess.getSAggregateAccess().getSAggregateAction_0()); 
            // InternalSms.g:1636:2: ()
            // InternalSms.g:1636:3: 
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
    // InternalSms.g:1644:1: rule__SAggregate__Group__1 : rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 ;
    public final void rule__SAggregate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1648:1: ( rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2 )
            // InternalSms.g:1649:2: rule__SAggregate__Group__1__Impl rule__SAggregate__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSms.g:1656:1: rule__SAggregate__Group__1__Impl : ( 'aggregate' ) ;
    public final void rule__SAggregate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1660:1: ( ( 'aggregate' ) )
            // InternalSms.g:1661:1: ( 'aggregate' )
            {
            // InternalSms.g:1661:1: ( 'aggregate' )
            // InternalSms.g:1662:2: 'aggregate'
            {
             before(grammarAccess.getSAggregateAccess().getAggregateKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSAggregateAccess().getAggregateKeyword_1()); 

            }


            }

        }
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
    // InternalSms.g:1671:1: rule__SAggregate__Group__2 : rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 ;
    public final void rule__SAggregate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1675:1: ( rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3 )
            // InternalSms.g:1676:2: rule__SAggregate__Group__2__Impl rule__SAggregate__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalSms.g:1683:1: rule__SAggregate__Group__2__Impl : ( '{' ) ;
    public final void rule__SAggregate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1687:1: ( ( '{' ) )
            // InternalSms.g:1688:1: ( '{' )
            {
            // InternalSms.g:1688:1: ( '{' )
            // InternalSms.g:1689:2: '{'
            {
             before(grammarAccess.getSAggregateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSms.g:1698:1: rule__SAggregate__Group__3 : rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 ;
    public final void rule__SAggregate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1702:1: ( rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4 )
            // InternalSms.g:1703:2: rule__SAggregate__Group__3__Impl rule__SAggregate__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalSms.g:1710:1: rule__SAggregate__Group__3__Impl : ( ( rule__SAggregate__TypesAssignment_3 )* ) ;
    public final void rule__SAggregate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1714:1: ( ( ( rule__SAggregate__TypesAssignment_3 )* ) )
            // InternalSms.g:1715:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            {
            // InternalSms.g:1715:1: ( ( rule__SAggregate__TypesAssignment_3 )* )
            // InternalSms.g:1716:2: ( rule__SAggregate__TypesAssignment_3 )*
            {
             before(grammarAccess.getSAggregateAccess().getTypesAssignment_3()); 
            // InternalSms.g:1717:2: ( rule__SAggregate__TypesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=27 && LA18_0<=28)||LA18_0==31||(LA18_0>=33 && LA18_0<=34)||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSms.g:1717:3: rule__SAggregate__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SAggregate__TypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSms.g:1725:1: rule__SAggregate__Group__4 : rule__SAggregate__Group__4__Impl ;
    public final void rule__SAggregate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1729:1: ( rule__SAggregate__Group__4__Impl )
            // InternalSms.g:1730:2: rule__SAggregate__Group__4__Impl
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
    // InternalSms.g:1736:1: rule__SAggregate__Group__4__Impl : ( '}' ) ;
    public final void rule__SAggregate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1740:1: ( ( '}' ) )
            // InternalSms.g:1741:1: ( '}' )
            {
            // InternalSms.g:1741:1: ( '}' )
            // InternalSms.g:1742:2: '}'
            {
             before(grammarAccess.getSAggregateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__SConstraint__Group__0"
    // InternalSms.g:1752:1: rule__SConstraint__Group__0 : rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 ;
    public final void rule__SConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1756:1: ( rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1 )
            // InternalSms.g:1757:2: rule__SConstraint__Group__0__Impl rule__SConstraint__Group__1
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
    // InternalSms.g:1764:1: rule__SConstraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__SConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1768:1: ( ( 'constraint' ) )
            // InternalSms.g:1769:1: ( 'constraint' )
            {
            // InternalSms.g:1769:1: ( 'constraint' )
            // InternalSms.g:1770:2: 'constraint'
            {
             before(grammarAccess.getSConstraintAccess().getConstraintKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSms.g:1779:1: rule__SConstraint__Group__1 : rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 ;
    public final void rule__SConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1783:1: ( rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2 )
            // InternalSms.g:1784:2: rule__SConstraint__Group__1__Impl rule__SConstraint__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSms.g:1791:1: rule__SConstraint__Group__1__Impl : ( ( rule__SConstraint__NameAssignment_1 ) ) ;
    public final void rule__SConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1795:1: ( ( ( rule__SConstraint__NameAssignment_1 ) ) )
            // InternalSms.g:1796:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            {
            // InternalSms.g:1796:1: ( ( rule__SConstraint__NameAssignment_1 ) )
            // InternalSms.g:1797:2: ( rule__SConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getSConstraintAccess().getNameAssignment_1()); 
            // InternalSms.g:1798:2: ( rule__SConstraint__NameAssignment_1 )
            // InternalSms.g:1798:3: rule__SConstraint__NameAssignment_1
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
    // InternalSms.g:1806:1: rule__SConstraint__Group__2 : rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 ;
    public final void rule__SConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1810:1: ( rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3 )
            // InternalSms.g:1811:2: rule__SConstraint__Group__2__Impl rule__SConstraint__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSms.g:1818:1: rule__SConstraint__Group__2__Impl : ( ':' ) ;
    public final void rule__SConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1822:1: ( ( ':' ) )
            // InternalSms.g:1823:1: ( ':' )
            {
            // InternalSms.g:1823:1: ( ':' )
            // InternalSms.g:1824:2: ':'
            {
             before(grammarAccess.getSConstraintAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSms.g:1833:1: rule__SConstraint__Group__3 : rule__SConstraint__Group__3__Impl ;
    public final void rule__SConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1837:1: ( rule__SConstraint__Group__3__Impl )
            // InternalSms.g:1838:2: rule__SConstraint__Group__3__Impl
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
    // InternalSms.g:1844:1: rule__SConstraint__Group__3__Impl : ( ( rule__SConstraint__ConditionAssignment_3 ) ) ;
    public final void rule__SConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1848:1: ( ( ( rule__SConstraint__ConditionAssignment_3 ) ) )
            // InternalSms.g:1849:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            {
            // InternalSms.g:1849:1: ( ( rule__SConstraint__ConditionAssignment_3 ) )
            // InternalSms.g:1850:2: ( rule__SConstraint__ConditionAssignment_3 )
            {
             before(grammarAccess.getSConstraintAccess().getConditionAssignment_3()); 
            // InternalSms.g:1851:2: ( rule__SConstraint__ConditionAssignment_3 )
            // InternalSms.g:1851:3: rule__SConstraint__ConditionAssignment_3
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


    // $ANTLR start "rule__SPrimitive__Group_0__0"
    // InternalSms.g:1860:1: rule__SPrimitive__Group_0__0 : rule__SPrimitive__Group_0__0__Impl rule__SPrimitive__Group_0__1 ;
    public final void rule__SPrimitive__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1864:1: ( rule__SPrimitive__Group_0__0__Impl rule__SPrimitive__Group_0__1 )
            // InternalSms.g:1865:2: rule__SPrimitive__Group_0__0__Impl rule__SPrimitive__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__SPrimitive__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__0"


    // $ANTLR start "rule__SPrimitive__Group_0__0__Impl"
    // InternalSms.g:1872:1: rule__SPrimitive__Group_0__0__Impl : ( 'deduced' ) ;
    public final void rule__SPrimitive__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1876:1: ( ( 'deduced' ) )
            // InternalSms.g:1877:1: ( 'deduced' )
            {
            // InternalSms.g:1877:1: ( 'deduced' )
            // InternalSms.g:1878:2: 'deduced'
            {
             before(grammarAccess.getSPrimitiveAccess().getDeducedKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getDeducedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0__1"
    // InternalSms.g:1887:1: rule__SPrimitive__Group_0__1 : rule__SPrimitive__Group_0__1__Impl rule__SPrimitive__Group_0__2 ;
    public final void rule__SPrimitive__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1891:1: ( rule__SPrimitive__Group_0__1__Impl rule__SPrimitive__Group_0__2 )
            // InternalSms.g:1892:2: rule__SPrimitive__Group_0__1__Impl rule__SPrimitive__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__1"


    // $ANTLR start "rule__SPrimitive__Group_0__1__Impl"
    // InternalSms.g:1899:1: rule__SPrimitive__Group_0__1__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1903:1: ( ( 'primitive' ) )
            // InternalSms.g:1904:1: ( 'primitive' )
            {
            // InternalSms.g:1904:1: ( 'primitive' )
            // InternalSms.g:1905:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_0__2"
    // InternalSms.g:1914:1: rule__SPrimitive__Group_0__2 : rule__SPrimitive__Group_0__2__Impl ;
    public final void rule__SPrimitive__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1918:1: ( rule__SPrimitive__Group_0__2__Impl )
            // InternalSms.g:1919:2: rule__SPrimitive__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__2"


    // $ANTLR start "rule__SPrimitive__Group_0__2__Impl"
    // InternalSms.g:1925:1: rule__SPrimitive__Group_0__2__Impl : ( ( rule__SPrimitive__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SPrimitive__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1929:1: ( ( ( rule__SPrimitive__DeductionRuleAssignment_0_2 ) ) )
            // InternalSms.g:1930:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSms.g:1930:1: ( ( rule__SPrimitive__DeductionRuleAssignment_0_2 ) )
            // InternalSms.g:1931:2: ( rule__SPrimitive__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSms.g:1932:2: ( rule__SPrimitive__DeductionRuleAssignment_0_2 )
            // InternalSms.g:1932:3: rule__SPrimitive__DeductionRuleAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__DeductionRuleAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getDeductionRuleAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_0__2__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__0"
    // InternalSms.g:1941:1: rule__SPrimitive__Group_1__0 : rule__SPrimitive__Group_1__0__Impl rule__SPrimitive__Group_1__1 ;
    public final void rule__SPrimitive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1945:1: ( rule__SPrimitive__Group_1__0__Impl rule__SPrimitive__Group_1__1 )
            // InternalSms.g:1946:2: rule__SPrimitive__Group_1__0__Impl rule__SPrimitive__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__0"


    // $ANTLR start "rule__SPrimitive__Group_1__0__Impl"
    // InternalSms.g:1953:1: rule__SPrimitive__Group_1__0__Impl : ( 'primitive' ) ;
    public final void rule__SPrimitive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1957:1: ( ( 'primitive' ) )
            // InternalSms.g:1958:1: ( 'primitive' )
            {
            // InternalSms.g:1958:1: ( 'primitive' )
            // InternalSms.g:1959:2: 'primitive'
            {
             before(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getPrimitiveKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__1"
    // InternalSms.g:1968:1: rule__SPrimitive__Group_1__1 : rule__SPrimitive__Group_1__1__Impl rule__SPrimitive__Group_1__2 ;
    public final void rule__SPrimitive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1972:1: ( rule__SPrimitive__Group_1__1__Impl rule__SPrimitive__Group_1__2 )
            // InternalSms.g:1973:2: rule__SPrimitive__Group_1__1__Impl rule__SPrimitive__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__SPrimitive__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__1"


    // $ANTLR start "rule__SPrimitive__Group_1__1__Impl"
    // InternalSms.g:1980:1: rule__SPrimitive__Group_1__1__Impl : ( ( rule__SPrimitive__NameAssignment_1_1 ) ) ;
    public final void rule__SPrimitive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1984:1: ( ( ( rule__SPrimitive__NameAssignment_1_1 ) ) )
            // InternalSms.g:1985:1: ( ( rule__SPrimitive__NameAssignment_1_1 ) )
            {
            // InternalSms.g:1985:1: ( ( rule__SPrimitive__NameAssignment_1_1 ) )
            // InternalSms.g:1986:2: ( rule__SPrimitive__NameAssignment_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getNameAssignment_1_1()); 
            // InternalSms.g:1987:2: ( rule__SPrimitive__NameAssignment_1_1 )
            // InternalSms.g:1987:3: rule__SPrimitive__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__2"
    // InternalSms.g:1995:1: rule__SPrimitive__Group_1__2 : rule__SPrimitive__Group_1__2__Impl rule__SPrimitive__Group_1__3 ;
    public final void rule__SPrimitive__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:1999:1: ( rule__SPrimitive__Group_1__2__Impl rule__SPrimitive__Group_1__3 )
            // InternalSms.g:2000:2: rule__SPrimitive__Group_1__2__Impl rule__SPrimitive__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__SPrimitive__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__2"


    // $ANTLR start "rule__SPrimitive__Group_1__2__Impl"
    // InternalSms.g:2007:1: rule__SPrimitive__Group_1__2__Impl : ( '{' ) ;
    public final void rule__SPrimitive__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2011:1: ( ( '{' ) )
            // InternalSms.g:2012:1: ( '{' )
            {
            // InternalSms.g:2012:1: ( '{' )
            // InternalSms.g:2013:2: '{'
            {
             before(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__2__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__3"
    // InternalSms.g:2022:1: rule__SPrimitive__Group_1__3 : rule__SPrimitive__Group_1__3__Impl rule__SPrimitive__Group_1__4 ;
    public final void rule__SPrimitive__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2026:1: ( rule__SPrimitive__Group_1__3__Impl rule__SPrimitive__Group_1__4 )
            // InternalSms.g:2027:2: rule__SPrimitive__Group_1__3__Impl rule__SPrimitive__Group_1__4
            {
            pushFollow(FOLLOW_20);
            rule__SPrimitive__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__3"


    // $ANTLR start "rule__SPrimitive__Group_1__3__Impl"
    // InternalSms.g:2034:1: rule__SPrimitive__Group_1__3__Impl : ( ( rule__SPrimitive__UnorderedGroup_1_3 ) ) ;
    public final void rule__SPrimitive__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2038:1: ( ( ( rule__SPrimitive__UnorderedGroup_1_3 ) ) )
            // InternalSms.g:2039:1: ( ( rule__SPrimitive__UnorderedGroup_1_3 ) )
            {
            // InternalSms.g:2039:1: ( ( rule__SPrimitive__UnorderedGroup_1_3 ) )
            // InternalSms.g:2040:2: ( rule__SPrimitive__UnorderedGroup_1_3 )
            {
             before(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3()); 
            // InternalSms.g:2041:2: ( rule__SPrimitive__UnorderedGroup_1_3 )
            // InternalSms.g:2041:3: rule__SPrimitive__UnorderedGroup_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__UnorderedGroup_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__3__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__4"
    // InternalSms.g:2049:1: rule__SPrimitive__Group_1__4 : rule__SPrimitive__Group_1__4__Impl rule__SPrimitive__Group_1__5 ;
    public final void rule__SPrimitive__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2053:1: ( rule__SPrimitive__Group_1__4__Impl rule__SPrimitive__Group_1__5 )
            // InternalSms.g:2054:2: rule__SPrimitive__Group_1__4__Impl rule__SPrimitive__Group_1__5
            {
            pushFollow(FOLLOW_20);
            rule__SPrimitive__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__4"


    // $ANTLR start "rule__SPrimitive__Group_1__4__Impl"
    // InternalSms.g:2061:1: rule__SPrimitive__Group_1__4__Impl : ( ( rule__SPrimitive__ConstraintsAssignment_1_4 )* ) ;
    public final void rule__SPrimitive__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2065:1: ( ( ( rule__SPrimitive__ConstraintsAssignment_1_4 )* ) )
            // InternalSms.g:2066:1: ( ( rule__SPrimitive__ConstraintsAssignment_1_4 )* )
            {
            // InternalSms.g:2066:1: ( ( rule__SPrimitive__ConstraintsAssignment_1_4 )* )
            // InternalSms.g:2067:2: ( rule__SPrimitive__ConstraintsAssignment_1_4 )*
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_1_4()); 
            // InternalSms.g:2068:2: ( rule__SPrimitive__ConstraintsAssignment_1_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSms.g:2068:3: rule__SPrimitive__ConstraintsAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SPrimitive__ConstraintsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSPrimitiveAccess().getConstraintsAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__4__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1__5"
    // InternalSms.g:2076:1: rule__SPrimitive__Group_1__5 : rule__SPrimitive__Group_1__5__Impl ;
    public final void rule__SPrimitive__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2080:1: ( rule__SPrimitive__Group_1__5__Impl )
            // InternalSms.g:2081:2: rule__SPrimitive__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__5"


    // $ANTLR start "rule__SPrimitive__Group_1__5__Impl"
    // InternalSms.g:2087:1: rule__SPrimitive__Group_1__5__Impl : ( '}' ) ;
    public final void rule__SPrimitive__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2091:1: ( ( '}' ) )
            // InternalSms.g:2092:1: ( '}' )
            {
            // InternalSms.g:2092:1: ( '}' )
            // InternalSms.g:2093:2: '}'
            {
             before(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1__5__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1_3_0__0"
    // InternalSms.g:2103:1: rule__SPrimitive__Group_1_3_0__0 : rule__SPrimitive__Group_1_3_0__0__Impl rule__SPrimitive__Group_1_3_0__1 ;
    public final void rule__SPrimitive__Group_1_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2107:1: ( rule__SPrimitive__Group_1_3_0__0__Impl rule__SPrimitive__Group_1_3_0__1 )
            // InternalSms.g:2108:2: rule__SPrimitive__Group_1_3_0__0__Impl rule__SPrimitive__Group_1_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_1_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_0__0"


    // $ANTLR start "rule__SPrimitive__Group_1_3_0__0__Impl"
    // InternalSms.g:2115:1: rule__SPrimitive__Group_1_3_0__0__Impl : ( 'redefines' ) ;
    public final void rule__SPrimitive__Group_1_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2119:1: ( ( 'redefines' ) )
            // InternalSms.g:2120:1: ( 'redefines' )
            {
            // InternalSms.g:2120:1: ( 'redefines' )
            // InternalSms.g:2121:2: 'redefines'
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_1_3_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesKeyword_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_0__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1_3_0__1"
    // InternalSms.g:2130:1: rule__SPrimitive__Group_1_3_0__1 : rule__SPrimitive__Group_1_3_0__1__Impl ;
    public final void rule__SPrimitive__Group_1_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2134:1: ( rule__SPrimitive__Group_1_3_0__1__Impl )
            // InternalSms.g:2135:2: rule__SPrimitive__Group_1_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_0__1"


    // $ANTLR start "rule__SPrimitive__Group_1_3_0__1__Impl"
    // InternalSms.g:2141:1: rule__SPrimitive__Group_1_3_0__1__Impl : ( ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 ) ) ;
    public final void rule__SPrimitive__Group_1_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2145:1: ( ( ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 ) ) )
            // InternalSms.g:2146:1: ( ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 ) )
            {
            // InternalSms.g:2146:1: ( ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 ) )
            // InternalSms.g:2147:2: ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_1_3_0_1()); 
            // InternalSms.g:2148:2: ( rule__SPrimitive__RedefinesAssignment_1_3_0_1 )
            // InternalSms.g:2148:3: rule__SPrimitive__RedefinesAssignment_1_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__RedefinesAssignment_1_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesAssignment_1_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_0__1__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1_3_1__0"
    // InternalSms.g:2157:1: rule__SPrimitive__Group_1_3_1__0 : rule__SPrimitive__Group_1_3_1__0__Impl rule__SPrimitive__Group_1_3_1__1 ;
    public final void rule__SPrimitive__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2161:1: ( rule__SPrimitive__Group_1_3_1__0__Impl rule__SPrimitive__Group_1_3_1__1 )
            // InternalSms.g:2162:2: rule__SPrimitive__Group_1_3_1__0__Impl rule__SPrimitive__Group_1_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SPrimitive__Group_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_1__0"


    // $ANTLR start "rule__SPrimitive__Group_1_3_1__0__Impl"
    // InternalSms.g:2169:1: rule__SPrimitive__Group_1_3_1__0__Impl : ( 'realizes' ) ;
    public final void rule__SPrimitive__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2173:1: ( ( 'realizes' ) )
            // InternalSms.g:2174:1: ( 'realizes' )
            {
            // InternalSms.g:2174:1: ( 'realizes' )
            // InternalSms.g:2175:2: 'realizes'
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_1_3_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRealizesKeyword_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__SPrimitive__Group_1_3_1__1"
    // InternalSms.g:2184:1: rule__SPrimitive__Group_1_3_1__1 : rule__SPrimitive__Group_1_3_1__1__Impl ;
    public final void rule__SPrimitive__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2188:1: ( rule__SPrimitive__Group_1_3_1__1__Impl )
            // InternalSms.g:2189:2: rule__SPrimitive__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__Group_1_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_1__1"


    // $ANTLR start "rule__SPrimitive__Group_1_3_1__1__Impl"
    // InternalSms.g:2195:1: rule__SPrimitive__Group_1_3_1__1__Impl : ( ( rule__SPrimitive__RealizesAssignment_1_3_1_1 ) ) ;
    public final void rule__SPrimitive__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2199:1: ( ( ( rule__SPrimitive__RealizesAssignment_1_3_1_1 ) ) )
            // InternalSms.g:2200:1: ( ( rule__SPrimitive__RealizesAssignment_1_3_1_1 ) )
            {
            // InternalSms.g:2200:1: ( ( rule__SPrimitive__RealizesAssignment_1_3_1_1 ) )
            // InternalSms.g:2201:2: ( rule__SPrimitive__RealizesAssignment_1_3_1_1 )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_1_3_1_1()); 
            // InternalSms.g:2202:2: ( rule__SPrimitive__RealizesAssignment_1_3_1_1 )
            // InternalSms.g:2202:3: rule__SPrimitive__RealizesAssignment_1_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__RealizesAssignment_1_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSPrimitiveAccess().getRealizesAssignment_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group__0"
    // InternalSms.g:2211:1: rule__SEnumeration__Group__0 : rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 ;
    public final void rule__SEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2215:1: ( rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1 )
            // InternalSms.g:2216:2: rule__SEnumeration__Group__0__Impl rule__SEnumeration__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:2223:1: rule__SEnumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__SEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2227:1: ( ( 'enumeration' ) )
            // InternalSms.g:2228:1: ( 'enumeration' )
            {
            // InternalSms.g:2228:1: ( 'enumeration' )
            // InternalSms.g:2229:2: 'enumeration'
            {
             before(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
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
    // InternalSms.g:2238:1: rule__SEnumeration__Group__1 : rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 ;
    public final void rule__SEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2242:1: ( rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2 )
            // InternalSms.g:2243:2: rule__SEnumeration__Group__1__Impl rule__SEnumeration__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalSms.g:2250:1: rule__SEnumeration__Group__1__Impl : ( ( rule__SEnumeration__NameAssignment_1 ) ) ;
    public final void rule__SEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2254:1: ( ( ( rule__SEnumeration__NameAssignment_1 ) ) )
            // InternalSms.g:2255:1: ( ( rule__SEnumeration__NameAssignment_1 ) )
            {
            // InternalSms.g:2255:1: ( ( rule__SEnumeration__NameAssignment_1 ) )
            // InternalSms.g:2256:2: ( rule__SEnumeration__NameAssignment_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getNameAssignment_1()); 
            // InternalSms.g:2257:2: ( rule__SEnumeration__NameAssignment_1 )
            // InternalSms.g:2257:3: rule__SEnumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalSms.g:2265:1: rule__SEnumeration__Group__2 : rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 ;
    public final void rule__SEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2269:1: ( rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3 )
            // InternalSms.g:2270:2: rule__SEnumeration__Group__2__Impl rule__SEnumeration__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSms.g:2277:1: rule__SEnumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__SEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2281:1: ( ( '{' ) )
            // InternalSms.g:2282:1: ( '{' )
            {
            // InternalSms.g:2282:1: ( '{' )
            // InternalSms.g:2283:2: '{'
            {
             before(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalSms.g:2292:1: rule__SEnumeration__Group__3 : rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 ;
    public final void rule__SEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2296:1: ( rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4 )
            // InternalSms.g:2297:2: rule__SEnumeration__Group__3__Impl rule__SEnumeration__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSms.g:2304:1: rule__SEnumeration__Group__3__Impl : ( ( rule__SEnumeration__Group_3__0 )? ) ;
    public final void rule__SEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2308:1: ( ( ( rule__SEnumeration__Group_3__0 )? ) )
            // InternalSms.g:2309:1: ( ( rule__SEnumeration__Group_3__0 )? )
            {
            // InternalSms.g:2309:1: ( ( rule__SEnumeration__Group_3__0 )? )
            // InternalSms.g:2310:2: ( rule__SEnumeration__Group_3__0 )?
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_3()); 
            // InternalSms.g:2311:2: ( rule__SEnumeration__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSms.g:2311:3: rule__SEnumeration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SEnumeration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSEnumerationAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalSms.g:2319:1: rule__SEnumeration__Group__4 : rule__SEnumeration__Group__4__Impl rule__SEnumeration__Group__5 ;
    public final void rule__SEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2323:1: ( rule__SEnumeration__Group__4__Impl rule__SEnumeration__Group__5 )
            // InternalSms.g:2324:2: rule__SEnumeration__Group__4__Impl rule__SEnumeration__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SEnumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__5();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2331:1: rule__SEnumeration__Group__4__Impl : ( ( rule__SEnumeration__ConstraintsAssignment_4 )* ) ;
    public final void rule__SEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2335:1: ( ( ( rule__SEnumeration__ConstraintsAssignment_4 )* ) )
            // InternalSms.g:2336:1: ( ( rule__SEnumeration__ConstraintsAssignment_4 )* )
            {
            // InternalSms.g:2336:1: ( ( rule__SEnumeration__ConstraintsAssignment_4 )* )
            // InternalSms.g:2337:2: ( rule__SEnumeration__ConstraintsAssignment_4 )*
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_4()); 
            // InternalSms.g:2338:2: ( rule__SEnumeration__ConstraintsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSms.g:2338:3: rule__SEnumeration__ConstraintsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SEnumeration__ConstraintsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSEnumerationAccess().getConstraintsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__SEnumeration__Group__5"
    // InternalSms.g:2346:1: rule__SEnumeration__Group__5 : rule__SEnumeration__Group__5__Impl ;
    public final void rule__SEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2350:1: ( rule__SEnumeration__Group__5__Impl )
            // InternalSms.g:2351:2: rule__SEnumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__5"


    // $ANTLR start "rule__SEnumeration__Group__5__Impl"
    // InternalSms.g:2357:1: rule__SEnumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__SEnumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2361:1: ( ( '}' ) )
            // InternalSms.g:2362:1: ( '}' )
            {
            // InternalSms.g:2362:1: ( '}' )
            // InternalSms.g:2363:2: '}'
            {
             before(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group__5__Impl"


    // $ANTLR start "rule__SEnumeration__Group_3__0"
    // InternalSms.g:2373:1: rule__SEnumeration__Group_3__0 : rule__SEnumeration__Group_3__0__Impl rule__SEnumeration__Group_3__1 ;
    public final void rule__SEnumeration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2377:1: ( rule__SEnumeration__Group_3__0__Impl rule__SEnumeration__Group_3__1 )
            // InternalSms.g:2378:2: rule__SEnumeration__Group_3__0__Impl rule__SEnumeration__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__SEnumeration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3__0"


    // $ANTLR start "rule__SEnumeration__Group_3__0__Impl"
    // InternalSms.g:2385:1: rule__SEnumeration__Group_3__0__Impl : ( ( rule__SEnumeration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__SEnumeration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2389:1: ( ( ( rule__SEnumeration__LiteralsAssignment_3_0 ) ) )
            // InternalSms.g:2390:1: ( ( rule__SEnumeration__LiteralsAssignment_3_0 ) )
            {
            // InternalSms.g:2390:1: ( ( rule__SEnumeration__LiteralsAssignment_3_0 ) )
            // InternalSms.g:2391:2: ( rule__SEnumeration__LiteralsAssignment_3_0 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_3_0()); 
            // InternalSms.g:2392:2: ( rule__SEnumeration__LiteralsAssignment_3_0 )
            // InternalSms.g:2392:3: rule__SEnumeration__LiteralsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__LiteralsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_3__1"
    // InternalSms.g:2400:1: rule__SEnumeration__Group_3__1 : rule__SEnumeration__Group_3__1__Impl ;
    public final void rule__SEnumeration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2404:1: ( rule__SEnumeration__Group_3__1__Impl )
            // InternalSms.g:2405:2: rule__SEnumeration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3__1"


    // $ANTLR start "rule__SEnumeration__Group_3__1__Impl"
    // InternalSms.g:2411:1: rule__SEnumeration__Group_3__1__Impl : ( ( rule__SEnumeration__Group_3_1__0 )* ) ;
    public final void rule__SEnumeration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2415:1: ( ( ( rule__SEnumeration__Group_3_1__0 )* ) )
            // InternalSms.g:2416:1: ( ( rule__SEnumeration__Group_3_1__0 )* )
            {
            // InternalSms.g:2416:1: ( ( rule__SEnumeration__Group_3_1__0 )* )
            // InternalSms.g:2417:2: ( rule__SEnumeration__Group_3_1__0 )*
            {
             before(grammarAccess.getSEnumerationAccess().getGroup_3_1()); 
            // InternalSms.g:2418:2: ( rule__SEnumeration__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSms.g:2418:3: rule__SEnumeration__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SEnumeration__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSEnumerationAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3__1__Impl"


    // $ANTLR start "rule__SEnumeration__Group_3_1__0"
    // InternalSms.g:2427:1: rule__SEnumeration__Group_3_1__0 : rule__SEnumeration__Group_3_1__0__Impl rule__SEnumeration__Group_3_1__1 ;
    public final void rule__SEnumeration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2431:1: ( rule__SEnumeration__Group_3_1__0__Impl rule__SEnumeration__Group_3_1__1 )
            // InternalSms.g:2432:2: rule__SEnumeration__Group_3_1__0__Impl rule__SEnumeration__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SEnumeration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3_1__0"


    // $ANTLR start "rule__SEnumeration__Group_3_1__0__Impl"
    // InternalSms.g:2439:1: rule__SEnumeration__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__SEnumeration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2443:1: ( ( ',' ) )
            // InternalSms.g:2444:1: ( ',' )
            {
            // InternalSms.g:2444:1: ( ',' )
            // InternalSms.g:2445:2: ','
            {
             before(grammarAccess.getSEnumerationAccess().getCommaKeyword_3_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3_1__0__Impl"


    // $ANTLR start "rule__SEnumeration__Group_3_1__1"
    // InternalSms.g:2454:1: rule__SEnumeration__Group_3_1__1 : rule__SEnumeration__Group_3_1__1__Impl ;
    public final void rule__SEnumeration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2458:1: ( rule__SEnumeration__Group_3_1__1__Impl )
            // InternalSms.g:2459:2: rule__SEnumeration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3_1__1"


    // $ANTLR start "rule__SEnumeration__Group_3_1__1__Impl"
    // InternalSms.g:2465:1: rule__SEnumeration__Group_3_1__1__Impl : ( ( rule__SEnumeration__LiteralsAssignment_3_1_1 ) ) ;
    public final void rule__SEnumeration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2469:1: ( ( ( rule__SEnumeration__LiteralsAssignment_3_1_1 ) ) )
            // InternalSms.g:2470:1: ( ( rule__SEnumeration__LiteralsAssignment_3_1_1 ) )
            {
            // InternalSms.g:2470:1: ( ( rule__SEnumeration__LiteralsAssignment_3_1_1 ) )
            // InternalSms.g:2471:2: ( rule__SEnumeration__LiteralsAssignment_3_1_1 )
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_3_1_1()); 
            // InternalSms.g:2472:2: ( rule__SEnumeration__LiteralsAssignment_3_1_1 )
            // InternalSms.g:2472:3: rule__SEnumeration__LiteralsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SEnumeration__LiteralsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSEnumerationAccess().getLiteralsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__Group_3_1__1__Impl"


    // $ANTLR start "rule__SRootType__Group__0"
    // InternalSms.g:2481:1: rule__SRootType__Group__0 : rule__SRootType__Group__0__Impl rule__SRootType__Group__1 ;
    public final void rule__SRootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2485:1: ( rule__SRootType__Group__0__Impl rule__SRootType__Group__1 )
            // InternalSms.g:2486:2: rule__SRootType__Group__0__Impl rule__SRootType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSms.g:2493:1: rule__SRootType__Group__0__Impl : ( ( rule__SRootType__Alternatives_0 ) ) ;
    public final void rule__SRootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2497:1: ( ( ( rule__SRootType__Alternatives_0 ) ) )
            // InternalSms.g:2498:1: ( ( rule__SRootType__Alternatives_0 ) )
            {
            // InternalSms.g:2498:1: ( ( rule__SRootType__Alternatives_0 ) )
            // InternalSms.g:2499:2: ( rule__SRootType__Alternatives_0 )
            {
             before(grammarAccess.getSRootTypeAccess().getAlternatives_0()); 
            // InternalSms.g:2500:2: ( rule__SRootType__Alternatives_0 )
            // InternalSms.g:2500:3: rule__SRootType__Alternatives_0
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
    // InternalSms.g:2508:1: rule__SRootType__Group__1 : rule__SRootType__Group__1__Impl ;
    public final void rule__SRootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2512:1: ( rule__SRootType__Group__1__Impl )
            // InternalSms.g:2513:2: rule__SRootType__Group__1__Impl
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
    // InternalSms.g:2519:1: rule__SRootType__Group__1__Impl : ( ruleSComplexType ) ;
    public final void rule__SRootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2523:1: ( ( ruleSComplexType ) )
            // InternalSms.g:2524:1: ( ruleSComplexType )
            {
            // InternalSms.g:2524:1: ( ruleSComplexType )
            // InternalSms.g:2525:2: ruleSComplexType
            {
             before(grammarAccess.getSRootTypeAccess().getSComplexTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSComplexType();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getSComplexTypeParserRuleCall_1()); 

            }


            }

        }
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
    // InternalSms.g:2535:1: rule__SRootType__Group_0_0__0 : rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 ;
    public final void rule__SRootType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2539:1: ( rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1 )
            // InternalSms.g:2540:2: rule__SRootType__Group_0_0__0__Impl rule__SRootType__Group_0_0__1
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
    // InternalSms.g:2547:1: rule__SRootType__Group_0_0__0__Impl : ( 'deduced' ) ;
    public final void rule__SRootType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2551:1: ( ( 'deduced' ) )
            // InternalSms.g:2552:1: ( 'deduced' )
            {
            // InternalSms.g:2552:1: ( 'deduced' )
            // InternalSms.g:2553:2: 'deduced'
            {
             before(grammarAccess.getSRootTypeAccess().getDeducedKeyword_0_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getDeducedKeyword_0_0_0()); 

            }


            }

        }
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
    // InternalSms.g:2562:1: rule__SRootType__Group_0_0__1 : rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 ;
    public final void rule__SRootType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2566:1: ( rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2 )
            // InternalSms.g:2567:2: rule__SRootType__Group_0_0__1__Impl rule__SRootType__Group_0_0__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSms.g:2574:1: rule__SRootType__Group_0_0__1__Impl : ( ( rule__SRootType__AbstractAssignment_0_0_1 )? ) ;
    public final void rule__SRootType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2578:1: ( ( ( rule__SRootType__AbstractAssignment_0_0_1 )? ) )
            // InternalSms.g:2579:1: ( ( rule__SRootType__AbstractAssignment_0_0_1 )? )
            {
            // InternalSms.g:2579:1: ( ( rule__SRootType__AbstractAssignment_0_0_1 )? )
            // InternalSms.g:2580:2: ( rule__SRootType__AbstractAssignment_0_0_1 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_0_1()); 
            // InternalSms.g:2581:2: ( rule__SRootType__AbstractAssignment_0_0_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSms.g:2581:3: rule__SRootType__AbstractAssignment_0_0_1
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
    // InternalSms.g:2589:1: rule__SRootType__Group_0_0__2 : rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 ;
    public final void rule__SRootType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2593:1: ( rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3 )
            // InternalSms.g:2594:2: rule__SRootType__Group_0_0__2__Impl rule__SRootType__Group_0_0__3
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
    // InternalSms.g:2601:1: rule__SRootType__Group_0_0__2__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2605:1: ( ( 'root' ) )
            // InternalSms.g:2606:1: ( 'root' )
            {
            // InternalSms.g:2606:1: ( 'root' )
            // InternalSms.g:2607:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_0_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSms.g:2616:1: rule__SRootType__Group_0_0__3 : rule__SRootType__Group_0_0__3__Impl ;
    public final void rule__SRootType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2620:1: ( rule__SRootType__Group_0_0__3__Impl )
            // InternalSms.g:2621:2: rule__SRootType__Group_0_0__3__Impl
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
    // InternalSms.g:2627:1: rule__SRootType__Group_0_0__3__Impl : ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SRootType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2631:1: ( ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSms.g:2632:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSms.g:2632:1: ( ( rule__SRootType__DeductionRuleAssignment_0_0_3 ) )
            // InternalSms.g:2633:2: ( rule__SRootType__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSms.g:2634:2: ( rule__SRootType__DeductionRuleAssignment_0_0_3 )
            // InternalSms.g:2634:3: rule__SRootType__DeductionRuleAssignment_0_0_3
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
    // InternalSms.g:2643:1: rule__SRootType__Group_0_1__0 : rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 ;
    public final void rule__SRootType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2647:1: ( rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1 )
            // InternalSms.g:2648:2: rule__SRootType__Group_0_1__0__Impl rule__SRootType__Group_0_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSms.g:2655:1: rule__SRootType__Group_0_1__0__Impl : ( ( rule__SRootType__AbstractAssignment_0_1_0 )? ) ;
    public final void rule__SRootType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2659:1: ( ( ( rule__SRootType__AbstractAssignment_0_1_0 )? ) )
            // InternalSms.g:2660:1: ( ( rule__SRootType__AbstractAssignment_0_1_0 )? )
            {
            // InternalSms.g:2660:1: ( ( rule__SRootType__AbstractAssignment_0_1_0 )? )
            // InternalSms.g:2661:2: ( rule__SRootType__AbstractAssignment_0_1_0 )?
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_0()); 
            // InternalSms.g:2662:2: ( rule__SRootType__AbstractAssignment_0_1_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSms.g:2662:3: rule__SRootType__AbstractAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRootType__AbstractAssignment_0_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAssignment_0_1_0()); 

            }


            }

        }
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
    // InternalSms.g:2670:1: rule__SRootType__Group_0_1__1 : rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 ;
    public final void rule__SRootType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2674:1: ( rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2 )
            // InternalSms.g:2675:2: rule__SRootType__Group_0_1__1__Impl rule__SRootType__Group_0_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:2682:1: rule__SRootType__Group_0_1__1__Impl : ( 'root' ) ;
    public final void rule__SRootType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2686:1: ( ( 'root' ) )
            // InternalSms.g:2687:1: ( 'root' )
            {
            // InternalSms.g:2687:1: ( 'root' )
            // InternalSms.g:2688:2: 'root'
            {
             before(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getRootKeyword_0_1_1()); 

            }


            }

        }
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
    // InternalSms.g:2697:1: rule__SRootType__Group_0_1__2 : rule__SRootType__Group_0_1__2__Impl ;
    public final void rule__SRootType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2701:1: ( rule__SRootType__Group_0_1__2__Impl )
            // InternalSms.g:2702:2: rule__SRootType__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2708:1: rule__SRootType__Group_0_1__2__Impl : ( ( rule__SRootType__NameAssignment_0_1_2 ) ) ;
    public final void rule__SRootType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2712:1: ( ( ( rule__SRootType__NameAssignment_0_1_2 ) ) )
            // InternalSms.g:2713:1: ( ( rule__SRootType__NameAssignment_0_1_2 ) )
            {
            // InternalSms.g:2713:1: ( ( rule__SRootType__NameAssignment_0_1_2 ) )
            // InternalSms.g:2714:2: ( rule__SRootType__NameAssignment_0_1_2 )
            {
             before(grammarAccess.getSRootTypeAccess().getNameAssignment_0_1_2()); 
            // InternalSms.g:2715:2: ( rule__SRootType__NameAssignment_0_1_2 )
            // InternalSms.g:2715:3: rule__SRootType__NameAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SRootType__NameAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSRootTypeAccess().getNameAssignment_0_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__Group__0"
    // InternalSms.g:2724:1: rule__SDetailType__Group__0 : rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 ;
    public final void rule__SDetailType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2728:1: ( rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1 )
            // InternalSms.g:2729:2: rule__SDetailType__Group__0__Impl rule__SDetailType__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSms.g:2736:1: rule__SDetailType__Group__0__Impl : ( ( rule__SDetailType__Alternatives_0 ) ) ;
    public final void rule__SDetailType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2740:1: ( ( ( rule__SDetailType__Alternatives_0 ) ) )
            // InternalSms.g:2741:1: ( ( rule__SDetailType__Alternatives_0 ) )
            {
            // InternalSms.g:2741:1: ( ( rule__SDetailType__Alternatives_0 ) )
            // InternalSms.g:2742:2: ( rule__SDetailType__Alternatives_0 )
            {
             before(grammarAccess.getSDetailTypeAccess().getAlternatives_0()); 
            // InternalSms.g:2743:2: ( rule__SDetailType__Alternatives_0 )
            // InternalSms.g:2743:3: rule__SDetailType__Alternatives_0
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
    // InternalSms.g:2751:1: rule__SDetailType__Group__1 : rule__SDetailType__Group__1__Impl ;
    public final void rule__SDetailType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2755:1: ( rule__SDetailType__Group__1__Impl )
            // InternalSms.g:2756:2: rule__SDetailType__Group__1__Impl
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
    // InternalSms.g:2762:1: rule__SDetailType__Group__1__Impl : ( ruleSComplexType ) ;
    public final void rule__SDetailType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2766:1: ( ( ruleSComplexType ) )
            // InternalSms.g:2767:1: ( ruleSComplexType )
            {
            // InternalSms.g:2767:1: ( ruleSComplexType )
            // InternalSms.g:2768:2: ruleSComplexType
            {
             before(grammarAccess.getSDetailTypeAccess().getSComplexTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleSComplexType();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getSComplexTypeParserRuleCall_1()); 

            }


            }

        }
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
    // InternalSms.g:2778:1: rule__SDetailType__Group_0_0__0 : rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 ;
    public final void rule__SDetailType__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2782:1: ( rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1 )
            // InternalSms.g:2783:2: rule__SDetailType__Group_0_0__0__Impl rule__SDetailType__Group_0_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:2790:1: rule__SDetailType__Group_0_0__0__Impl : ( 'deduced' ) ;
    public final void rule__SDetailType__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2794:1: ( ( 'deduced' ) )
            // InternalSms.g:2795:1: ( 'deduced' )
            {
            // InternalSms.g:2795:1: ( 'deduced' )
            // InternalSms.g:2796:2: 'deduced'
            {
             before(grammarAccess.getSDetailTypeAccess().getDeducedKeyword_0_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDeducedKeyword_0_0_0()); 

            }


            }

        }
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
    // InternalSms.g:2805:1: rule__SDetailType__Group_0_0__1 : rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 ;
    public final void rule__SDetailType__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2809:1: ( rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2 )
            // InternalSms.g:2810:2: rule__SDetailType__Group_0_0__1__Impl rule__SDetailType__Group_0_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSms.g:2817:1: rule__SDetailType__Group_0_0__1__Impl : ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? ) ;
    public final void rule__SDetailType__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2821:1: ( ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? ) )
            // InternalSms.g:2822:1: ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? )
            {
            // InternalSms.g:2822:1: ( ( rule__SDetailType__AbstractAssignment_0_0_1 )? )
            // InternalSms.g:2823:2: ( rule__SDetailType__AbstractAssignment_0_0_1 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_0_1()); 
            // InternalSms.g:2824:2: ( rule__SDetailType__AbstractAssignment_0_0_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSms.g:2824:3: rule__SDetailType__AbstractAssignment_0_0_1
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
    // InternalSms.g:2832:1: rule__SDetailType__Group_0_0__2 : rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 ;
    public final void rule__SDetailType__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2836:1: ( rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3 )
            // InternalSms.g:2837:2: rule__SDetailType__Group_0_0__2__Impl rule__SDetailType__Group_0_0__3
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
    // InternalSms.g:2844:1: rule__SDetailType__Group_0_0__2__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2848:1: ( ( 'detail' ) )
            // InternalSms.g:2849:1: ( 'detail' )
            {
            // InternalSms.g:2849:1: ( 'detail' )
            // InternalSms.g:2850:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_0_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSms.g:2859:1: rule__SDetailType__Group_0_0__3 : rule__SDetailType__Group_0_0__3__Impl ;
    public final void rule__SDetailType__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2863:1: ( rule__SDetailType__Group_0_0__3__Impl )
            // InternalSms.g:2864:2: rule__SDetailType__Group_0_0__3__Impl
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
    // InternalSms.g:2870:1: rule__SDetailType__Group_0_0__3__Impl : ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) ;
    public final void rule__SDetailType__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2874:1: ( ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) ) )
            // InternalSms.g:2875:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            {
            // InternalSms.g:2875:1: ( ( rule__SDetailType__DeductionRuleAssignment_0_0_3 ) )
            // InternalSms.g:2876:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleAssignment_0_0_3()); 
            // InternalSms.g:2877:2: ( rule__SDetailType__DeductionRuleAssignment_0_0_3 )
            // InternalSms.g:2877:3: rule__SDetailType__DeductionRuleAssignment_0_0_3
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
    // InternalSms.g:2886:1: rule__SDetailType__Group_0_1__0 : rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 ;
    public final void rule__SDetailType__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2890:1: ( rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1 )
            // InternalSms.g:2891:2: rule__SDetailType__Group_0_1__0__Impl rule__SDetailType__Group_0_1__1
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
    // InternalSms.g:2898:1: rule__SDetailType__Group_0_1__0__Impl : ( ( rule__SDetailType__AbstractAssignment_0_1_0 )? ) ;
    public final void rule__SDetailType__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2902:1: ( ( ( rule__SDetailType__AbstractAssignment_0_1_0 )? ) )
            // InternalSms.g:2903:1: ( ( rule__SDetailType__AbstractAssignment_0_1_0 )? )
            {
            // InternalSms.g:2903:1: ( ( rule__SDetailType__AbstractAssignment_0_1_0 )? )
            // InternalSms.g:2904:2: ( rule__SDetailType__AbstractAssignment_0_1_0 )?
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_0()); 
            // InternalSms.g:2905:2: ( rule__SDetailType__AbstractAssignment_0_1_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSms.g:2905:3: rule__SDetailType__AbstractAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SDetailType__AbstractAssignment_0_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAssignment_0_1_0()); 

            }


            }

        }
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
    // InternalSms.g:2913:1: rule__SDetailType__Group_0_1__1 : rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 ;
    public final void rule__SDetailType__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2917:1: ( rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2 )
            // InternalSms.g:2918:2: rule__SDetailType__Group_0_1__1__Impl rule__SDetailType__Group_0_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:2925:1: rule__SDetailType__Group_0_1__1__Impl : ( 'detail' ) ;
    public final void rule__SDetailType__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2929:1: ( ( 'detail' ) )
            // InternalSms.g:2930:1: ( 'detail' )
            {
            // InternalSms.g:2930:1: ( 'detail' )
            // InternalSms.g:2931:2: 'detail'
            {
             before(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getDetailKeyword_0_1_1()); 

            }


            }

        }
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
    // InternalSms.g:2940:1: rule__SDetailType__Group_0_1__2 : rule__SDetailType__Group_0_1__2__Impl ;
    public final void rule__SDetailType__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2944:1: ( rule__SDetailType__Group_0_1__2__Impl )
            // InternalSms.g:2945:2: rule__SDetailType__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:2951:1: rule__SDetailType__Group_0_1__2__Impl : ( ( rule__SDetailType__NameAssignment_0_1_2 ) ) ;
    public final void rule__SDetailType__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2955:1: ( ( ( rule__SDetailType__NameAssignment_0_1_2 ) ) )
            // InternalSms.g:2956:1: ( ( rule__SDetailType__NameAssignment_0_1_2 ) )
            {
            // InternalSms.g:2956:1: ( ( rule__SDetailType__NameAssignment_0_1_2 ) )
            // InternalSms.g:2957:2: ( rule__SDetailType__NameAssignment_0_1_2 )
            {
             before(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_1_2()); 
            // InternalSms.g:2958:2: ( rule__SDetailType__NameAssignment_0_1_2 )
            // InternalSms.g:2958:3: rule__SDetailType__NameAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SDetailType__NameAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSDetailTypeAccess().getNameAssignment_0_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SComplexType__Group__0"
    // InternalSms.g:2967:1: rule__SComplexType__Group__0 : rule__SComplexType__Group__0__Impl rule__SComplexType__Group__1 ;
    public final void rule__SComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2971:1: ( rule__SComplexType__Group__0__Impl rule__SComplexType__Group__1 )
            // InternalSms.g:2972:2: rule__SComplexType__Group__0__Impl rule__SComplexType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__0"


    // $ANTLR start "rule__SComplexType__Group__0__Impl"
    // InternalSms.g:2979:1: rule__SComplexType__Group__0__Impl : ( ( rule__SComplexType__Group_0__0 )? ) ;
    public final void rule__SComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2983:1: ( ( ( rule__SComplexType__Group_0__0 )? ) )
            // InternalSms.g:2984:1: ( ( rule__SComplexType__Group_0__0 )? )
            {
            // InternalSms.g:2984:1: ( ( rule__SComplexType__Group_0__0 )? )
            // InternalSms.g:2985:2: ( rule__SComplexType__Group_0__0 )?
            {
             before(grammarAccess.getSComplexTypeAccess().getGroup_0()); 
            // InternalSms.g:2986:2: ( rule__SComplexType__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSms.g:2986:3: rule__SComplexType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SComplexType__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSComplexTypeAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__0__Impl"


    // $ANTLR start "rule__SComplexType__Group__1"
    // InternalSms.g:2994:1: rule__SComplexType__Group__1 : rule__SComplexType__Group__1__Impl rule__SComplexType__Group__2 ;
    public final void rule__SComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:2998:1: ( rule__SComplexType__Group__1__Impl rule__SComplexType__Group__2 )
            // InternalSms.g:2999:2: rule__SComplexType__Group__1__Impl rule__SComplexType__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__SComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__1"


    // $ANTLR start "rule__SComplexType__Group__1__Impl"
    // InternalSms.g:3006:1: rule__SComplexType__Group__1__Impl : ( '{' ) ;
    public final void rule__SComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3010:1: ( ( '{' ) )
            // InternalSms.g:3011:1: ( '{' )
            {
            // InternalSms.g:3011:1: ( '{' )
            // InternalSms.g:3012:2: '{'
            {
             before(grammarAccess.getSComplexTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__1__Impl"


    // $ANTLR start "rule__SComplexType__Group__2"
    // InternalSms.g:3021:1: rule__SComplexType__Group__2 : rule__SComplexType__Group__2__Impl rule__SComplexType__Group__3 ;
    public final void rule__SComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3025:1: ( rule__SComplexType__Group__2__Impl rule__SComplexType__Group__3 )
            // InternalSms.g:3026:2: rule__SComplexType__Group__2__Impl rule__SComplexType__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SComplexType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__2"


    // $ANTLR start "rule__SComplexType__Group__2__Impl"
    // InternalSms.g:3033:1: rule__SComplexType__Group__2__Impl : ( ( rule__SComplexType__Alternatives_2 )* ) ;
    public final void rule__SComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3037:1: ( ( ( rule__SComplexType__Alternatives_2 )* ) )
            // InternalSms.g:3038:1: ( ( rule__SComplexType__Alternatives_2 )* )
            {
            // InternalSms.g:3038:1: ( ( rule__SComplexType__Alternatives_2 )* )
            // InternalSms.g:3039:2: ( rule__SComplexType__Alternatives_2 )*
            {
             before(grammarAccess.getSComplexTypeAccess().getAlternatives_2()); 
            // InternalSms.g:3040:2: ( rule__SComplexType__Alternatives_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==11||(LA28_0>=13 && LA28_0<=14)||LA28_0==25||LA28_0==27||LA28_0==34||LA28_0==43) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSms.g:3040:3: rule__SComplexType__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__SComplexType__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSComplexTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__2__Impl"


    // $ANTLR start "rule__SComplexType__Group__3"
    // InternalSms.g:3048:1: rule__SComplexType__Group__3 : rule__SComplexType__Group__3__Impl ;
    public final void rule__SComplexType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3052:1: ( rule__SComplexType__Group__3__Impl )
            // InternalSms.g:3053:2: rule__SComplexType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SComplexType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__3"


    // $ANTLR start "rule__SComplexType__Group__3__Impl"
    // InternalSms.g:3059:1: rule__SComplexType__Group__3__Impl : ( '}' ) ;
    public final void rule__SComplexType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3063:1: ( ( '}' ) )
            // InternalSms.g:3064:1: ( '}' )
            {
            // InternalSms.g:3064:1: ( '}' )
            // InternalSms.g:3065:2: '}'
            {
             before(grammarAccess.getSComplexTypeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group__3__Impl"


    // $ANTLR start "rule__SComplexType__Group_0__0"
    // InternalSms.g:3075:1: rule__SComplexType__Group_0__0 : rule__SComplexType__Group_0__0__Impl rule__SComplexType__Group_0__1 ;
    public final void rule__SComplexType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3079:1: ( rule__SComplexType__Group_0__0__Impl rule__SComplexType__Group_0__1 )
            // InternalSms.g:3080:2: rule__SComplexType__Group_0__0__Impl rule__SComplexType__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__SComplexType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SComplexType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group_0__0"


    // $ANTLR start "rule__SComplexType__Group_0__0__Impl"
    // InternalSms.g:3087:1: rule__SComplexType__Group_0__0__Impl : ( 'extends' ) ;
    public final void rule__SComplexType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3091:1: ( ( 'extends' ) )
            // InternalSms.g:3092:1: ( 'extends' )
            {
            // InternalSms.g:3092:1: ( 'extends' )
            // InternalSms.g:3093:2: 'extends'
            {
             before(grammarAccess.getSComplexTypeAccess().getExtendsKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeAccess().getExtendsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group_0__0__Impl"


    // $ANTLR start "rule__SComplexType__Group_0__1"
    // InternalSms.g:3102:1: rule__SComplexType__Group_0__1 : rule__SComplexType__Group_0__1__Impl ;
    public final void rule__SComplexType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3106:1: ( rule__SComplexType__Group_0__1__Impl )
            // InternalSms.g:3107:2: rule__SComplexType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SComplexType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group_0__1"


    // $ANTLR start "rule__SComplexType__Group_0__1__Impl"
    // InternalSms.g:3113:1: rule__SComplexType__Group_0__1__Impl : ( ( rule__SComplexType__SuperTypeAssignment_0_1 ) ) ;
    public final void rule__SComplexType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3117:1: ( ( ( rule__SComplexType__SuperTypeAssignment_0_1 ) ) )
            // InternalSms.g:3118:1: ( ( rule__SComplexType__SuperTypeAssignment_0_1 ) )
            {
            // InternalSms.g:3118:1: ( ( rule__SComplexType__SuperTypeAssignment_0_1 ) )
            // InternalSms.g:3119:2: ( rule__SComplexType__SuperTypeAssignment_0_1 )
            {
             before(grammarAccess.getSComplexTypeAccess().getSuperTypeAssignment_0_1()); 
            // InternalSms.g:3120:2: ( rule__SComplexType__SuperTypeAssignment_0_1 )
            // InternalSms.g:3120:3: rule__SComplexType__SuperTypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SComplexType__SuperTypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSComplexTypeAccess().getSuperTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__Group_0__1__Impl"


    // $ANTLR start "rule__SAssociation__Group__0"
    // InternalSms.g:3129:1: rule__SAssociation__Group__0 : rule__SAssociation__Group__0__Impl rule__SAssociation__Group__1 ;
    public final void rule__SAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3133:1: ( rule__SAssociation__Group__0__Impl rule__SAssociation__Group__1 )
            // InternalSms.g:3134:2: rule__SAssociation__Group__0__Impl rule__SAssociation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__0"


    // $ANTLR start "rule__SAssociation__Group__0__Impl"
    // InternalSms.g:3141:1: rule__SAssociation__Group__0__Impl : ( ( rule__SAssociation__DerivedAssignment_0 )? ) ;
    public final void rule__SAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3145:1: ( ( ( rule__SAssociation__DerivedAssignment_0 )? ) )
            // InternalSms.g:3146:1: ( ( rule__SAssociation__DerivedAssignment_0 )? )
            {
            // InternalSms.g:3146:1: ( ( rule__SAssociation__DerivedAssignment_0 )? )
            // InternalSms.g:3147:2: ( rule__SAssociation__DerivedAssignment_0 )?
            {
             before(grammarAccess.getSAssociationAccess().getDerivedAssignment_0()); 
            // InternalSms.g:3148:2: ( rule__SAssociation__DerivedAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSms.g:3148:3: rule__SAssociation__DerivedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__DerivedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAssociationAccess().getDerivedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__0__Impl"


    // $ANTLR start "rule__SAssociation__Group__1"
    // InternalSms.g:3156:1: rule__SAssociation__Group__1 : rule__SAssociation__Group__1__Impl rule__SAssociation__Group__2 ;
    public final void rule__SAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3160:1: ( rule__SAssociation__Group__1__Impl rule__SAssociation__Group__2 )
            // InternalSms.g:3161:2: rule__SAssociation__Group__1__Impl rule__SAssociation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__1"


    // $ANTLR start "rule__SAssociation__Group__1__Impl"
    // InternalSms.g:3168:1: rule__SAssociation__Group__1__Impl : ( ( rule__SAssociation__Alternatives_1 ) ) ;
    public final void rule__SAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3172:1: ( ( ( rule__SAssociation__Alternatives_1 ) ) )
            // InternalSms.g:3173:1: ( ( rule__SAssociation__Alternatives_1 ) )
            {
            // InternalSms.g:3173:1: ( ( rule__SAssociation__Alternatives_1 ) )
            // InternalSms.g:3174:2: ( rule__SAssociation__Alternatives_1 )
            {
             before(grammarAccess.getSAssociationAccess().getAlternatives_1()); 
            // InternalSms.g:3175:2: ( rule__SAssociation__Alternatives_1 )
            // InternalSms.g:3175:3: rule__SAssociation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__1__Impl"


    // $ANTLR start "rule__SAssociation__Group__2"
    // InternalSms.g:3183:1: rule__SAssociation__Group__2 : rule__SAssociation__Group__2__Impl rule__SAssociation__Group__3 ;
    public final void rule__SAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3187:1: ( rule__SAssociation__Group__2__Impl rule__SAssociation__Group__3 )
            // InternalSms.g:3188:2: rule__SAssociation__Group__2__Impl rule__SAssociation__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__2"


    // $ANTLR start "rule__SAssociation__Group__2__Impl"
    // InternalSms.g:3195:1: rule__SAssociation__Group__2__Impl : ( ( rule__SAssociation__NameAssignment_2 ) ) ;
    public final void rule__SAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3199:1: ( ( ( rule__SAssociation__NameAssignment_2 ) ) )
            // InternalSms.g:3200:1: ( ( rule__SAssociation__NameAssignment_2 ) )
            {
            // InternalSms.g:3200:1: ( ( rule__SAssociation__NameAssignment_2 ) )
            // InternalSms.g:3201:2: ( rule__SAssociation__NameAssignment_2 )
            {
             before(grammarAccess.getSAssociationAccess().getNameAssignment_2()); 
            // InternalSms.g:3202:2: ( rule__SAssociation__NameAssignment_2 )
            // InternalSms.g:3202:3: rule__SAssociation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__2__Impl"


    // $ANTLR start "rule__SAssociation__Group__3"
    // InternalSms.g:3210:1: rule__SAssociation__Group__3 : rule__SAssociation__Group__3__Impl rule__SAssociation__Group__4 ;
    public final void rule__SAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3214:1: ( rule__SAssociation__Group__3__Impl rule__SAssociation__Group__4 )
            // InternalSms.g:3215:2: rule__SAssociation__Group__3__Impl rule__SAssociation__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__SAssociation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__3"


    // $ANTLR start "rule__SAssociation__Group__3__Impl"
    // InternalSms.g:3222:1: rule__SAssociation__Group__3__Impl : ( ':' ) ;
    public final void rule__SAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3226:1: ( ( ':' ) )
            // InternalSms.g:3227:1: ( ':' )
            {
            // InternalSms.g:3227:1: ( ':' )
            // InternalSms.g:3228:2: ':'
            {
             before(grammarAccess.getSAssociationAccess().getColonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__3__Impl"


    // $ANTLR start "rule__SAssociation__Group__4"
    // InternalSms.g:3237:1: rule__SAssociation__Group__4 : rule__SAssociation__Group__4__Impl rule__SAssociation__Group__5 ;
    public final void rule__SAssociation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3241:1: ( rule__SAssociation__Group__4__Impl rule__SAssociation__Group__5 )
            // InternalSms.g:3242:2: rule__SAssociation__Group__4__Impl rule__SAssociation__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SAssociation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__4"


    // $ANTLR start "rule__SAssociation__Group__4__Impl"
    // InternalSms.g:3249:1: rule__SAssociation__Group__4__Impl : ( ( rule__SAssociation__TypeAssignment_4 ) ) ;
    public final void rule__SAssociation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3253:1: ( ( ( rule__SAssociation__TypeAssignment_4 ) ) )
            // InternalSms.g:3254:1: ( ( rule__SAssociation__TypeAssignment_4 ) )
            {
            // InternalSms.g:3254:1: ( ( rule__SAssociation__TypeAssignment_4 ) )
            // InternalSms.g:3255:2: ( rule__SAssociation__TypeAssignment_4 )
            {
             before(grammarAccess.getSAssociationAccess().getTypeAssignment_4()); 
            // InternalSms.g:3256:2: ( rule__SAssociation__TypeAssignment_4 )
            // InternalSms.g:3256:3: rule__SAssociation__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__4__Impl"


    // $ANTLR start "rule__SAssociation__Group__5"
    // InternalSms.g:3264:1: rule__SAssociation__Group__5 : rule__SAssociation__Group__5__Impl ;
    public final void rule__SAssociation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3268:1: ( rule__SAssociation__Group__5__Impl )
            // InternalSms.g:3269:2: rule__SAssociation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__5"


    // $ANTLR start "rule__SAssociation__Group__5__Impl"
    // InternalSms.g:3275:1: rule__SAssociation__Group__5__Impl : ( ( rule__SAssociation__MultiplicityAssignment_5 )? ) ;
    public final void rule__SAssociation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3279:1: ( ( ( rule__SAssociation__MultiplicityAssignment_5 )? ) )
            // InternalSms.g:3280:1: ( ( rule__SAssociation__MultiplicityAssignment_5 )? )
            {
            // InternalSms.g:3280:1: ( ( rule__SAssociation__MultiplicityAssignment_5 )? )
            // InternalSms.g:3281:2: ( rule__SAssociation__MultiplicityAssignment_5 )?
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_5()); 
            // InternalSms.g:3282:2: ( rule__SAssociation__MultiplicityAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSms.g:3282:3: rule__SAssociation__MultiplicityAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAssociation__MultiplicityAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAssociationAccess().getMultiplicityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group__5__Impl"


    // $ANTLR start "rule__SAssociation__Group_1_1__0"
    // InternalSms.g:3291:1: rule__SAssociation__Group_1_1__0 : rule__SAssociation__Group_1_1__0__Impl rule__SAssociation__Group_1_1__1 ;
    public final void rule__SAssociation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3295:1: ( rule__SAssociation__Group_1_1__0__Impl rule__SAssociation__Group_1_1__1 )
            // InternalSms.g:3296:2: rule__SAssociation__Group_1_1__0__Impl rule__SAssociation__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
            rule__SAssociation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1_1__0"


    // $ANTLR start "rule__SAssociation__Group_1_1__0__Impl"
    // InternalSms.g:3303:1: rule__SAssociation__Group_1_1__0__Impl : ( ( rule__SAssociation__KindAssignment_1_1_0 ) ) ;
    public final void rule__SAssociation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3307:1: ( ( ( rule__SAssociation__KindAssignment_1_1_0 ) ) )
            // InternalSms.g:3308:1: ( ( rule__SAssociation__KindAssignment_1_1_0 ) )
            {
            // InternalSms.g:3308:1: ( ( rule__SAssociation__KindAssignment_1_1_0 ) )
            // InternalSms.g:3309:2: ( rule__SAssociation__KindAssignment_1_1_0 )
            {
             before(grammarAccess.getSAssociationAccess().getKindAssignment_1_1_0()); 
            // InternalSms.g:3310:2: ( rule__SAssociation__KindAssignment_1_1_0 )
            // InternalSms.g:3310:3: rule__SAssociation__KindAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__KindAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSAssociationAccess().getKindAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1_1__0__Impl"


    // $ANTLR start "rule__SAssociation__Group_1_1__1"
    // InternalSms.g:3318:1: rule__SAssociation__Group_1_1__1 : rule__SAssociation__Group_1_1__1__Impl ;
    public final void rule__SAssociation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3322:1: ( rule__SAssociation__Group_1_1__1__Impl )
            // InternalSms.g:3323:2: rule__SAssociation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAssociation__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1_1__1"


    // $ANTLR start "rule__SAssociation__Group_1_1__1__Impl"
    // InternalSms.g:3329:1: rule__SAssociation__Group_1_1__1__Impl : ( 'composite' ) ;
    public final void rule__SAssociation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3333:1: ( ( 'composite' ) )
            // InternalSms.g:3334:1: ( 'composite' )
            {
            // InternalSms.g:3334:1: ( 'composite' )
            // InternalSms.g:3335:2: 'composite'
            {
             before(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getCompositeKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__Group_1_1__1__Impl"


    // $ANTLR start "rule__SAttribute__Group_0__0"
    // InternalSms.g:3345:1: rule__SAttribute__Group_0__0 : rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 ;
    public final void rule__SAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3349:1: ( rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1 )
            // InternalSms.g:3350:2: rule__SAttribute__Group_0__0__Impl rule__SAttribute__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSms.g:3357:1: rule__SAttribute__Group_0__0__Impl : ( 'deduced' ) ;
    public final void rule__SAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3361:1: ( ( 'deduced' ) )
            // InternalSms.g:3362:1: ( 'deduced' )
            {
            // InternalSms.g:3362:1: ( 'deduced' )
            // InternalSms.g:3363:2: 'deduced'
            {
             before(grammarAccess.getSAttributeAccess().getDeducedKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDeducedKeyword_0_0()); 

            }


            }

        }
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
    // InternalSms.g:3372:1: rule__SAttribute__Group_0__1 : rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 ;
    public final void rule__SAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3376:1: ( rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2 )
            // InternalSms.g:3377:2: rule__SAttribute__Group_0__1__Impl rule__SAttribute__Group_0__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSms.g:3384:1: rule__SAttribute__Group_0__1__Impl : ( ( rule__SAttribute__DetailAssignment_0_1 )? ) ;
    public final void rule__SAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3388:1: ( ( ( rule__SAttribute__DetailAssignment_0_1 )? ) )
            // InternalSms.g:3389:1: ( ( rule__SAttribute__DetailAssignment_0_1 )? )
            {
            // InternalSms.g:3389:1: ( ( rule__SAttribute__DetailAssignment_0_1 )? )
            // InternalSms.g:3390:2: ( rule__SAttribute__DetailAssignment_0_1 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_0_1()); 
            // InternalSms.g:3391:2: ( rule__SAttribute__DetailAssignment_0_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSms.g:3391:3: rule__SAttribute__DetailAssignment_0_1
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
    // InternalSms.g:3399:1: rule__SAttribute__Group_0__2 : rule__SAttribute__Group_0__2__Impl ;
    public final void rule__SAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3403:1: ( rule__SAttribute__Group_0__2__Impl )
            // InternalSms.g:3404:2: rule__SAttribute__Group_0__2__Impl
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
    // InternalSms.g:3410:1: rule__SAttribute__Group_0__2__Impl : ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) ) ;
    public final void rule__SAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3414:1: ( ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) ) )
            // InternalSms.g:3415:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) )
            {
            // InternalSms.g:3415:1: ( ( rule__SAttribute__DeductionRuleAssignment_0_2 ) )
            // InternalSms.g:3416:2: ( rule__SAttribute__DeductionRuleAssignment_0_2 )
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleAssignment_0_2()); 
            // InternalSms.g:3417:2: ( rule__SAttribute__DeductionRuleAssignment_0_2 )
            // InternalSms.g:3417:3: rule__SAttribute__DeductionRuleAssignment_0_2
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
    // InternalSms.g:3426:1: rule__SAttribute__Group_1__0 : rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 ;
    public final void rule__SAttribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3430:1: ( rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1 )
            // InternalSms.g:3431:2: rule__SAttribute__Group_1__0__Impl rule__SAttribute__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSms.g:3438:1: rule__SAttribute__Group_1__0__Impl : ( ( rule__SAttribute__DetailAssignment_1_0 )? ) ;
    public final void rule__SAttribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3442:1: ( ( ( rule__SAttribute__DetailAssignment_1_0 )? ) )
            // InternalSms.g:3443:1: ( ( rule__SAttribute__DetailAssignment_1_0 )? )
            {
            // InternalSms.g:3443:1: ( ( rule__SAttribute__DetailAssignment_1_0 )? )
            // InternalSms.g:3444:2: ( rule__SAttribute__DetailAssignment_1_0 )?
            {
             before(grammarAccess.getSAttributeAccess().getDetailAssignment_1_0()); 
            // InternalSms.g:3445:2: ( rule__SAttribute__DetailAssignment_1_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSms.g:3445:3: rule__SAttribute__DetailAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__DetailAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getDetailAssignment_1_0()); 

            }


            }

        }
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
    // InternalSms.g:3453:1: rule__SAttribute__Group_1__1 : rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 ;
    public final void rule__SAttribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3457:1: ( rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2 )
            // InternalSms.g:3458:2: rule__SAttribute__Group_1__1__Impl rule__SAttribute__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSms.g:3465:1: rule__SAttribute__Group_1__1__Impl : ( ( rule__SAttribute__NameAssignment_1_1 ) ) ;
    public final void rule__SAttribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3469:1: ( ( ( rule__SAttribute__NameAssignment_1_1 ) ) )
            // InternalSms.g:3470:1: ( ( rule__SAttribute__NameAssignment_1_1 ) )
            {
            // InternalSms.g:3470:1: ( ( rule__SAttribute__NameAssignment_1_1 ) )
            // InternalSms.g:3471:2: ( rule__SAttribute__NameAssignment_1_1 )
            {
             before(grammarAccess.getSAttributeAccess().getNameAssignment_1_1()); 
            // InternalSms.g:3472:2: ( rule__SAttribute__NameAssignment_1_1 )
            // InternalSms.g:3472:3: rule__SAttribute__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getNameAssignment_1_1()); 

            }


            }

        }
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
    // InternalSms.g:3480:1: rule__SAttribute__Group_1__2 : rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 ;
    public final void rule__SAttribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3484:1: ( rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3 )
            // InternalSms.g:3485:2: rule__SAttribute__Group_1__2__Impl rule__SAttribute__Group_1__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSms.g:3492:1: rule__SAttribute__Group_1__2__Impl : ( ':' ) ;
    public final void rule__SAttribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3496:1: ( ( ':' ) )
            // InternalSms.g:3497:1: ( ':' )
            {
            // InternalSms.g:3497:1: ( ':' )
            // InternalSms.g:3498:2: ':'
            {
             before(grammarAccess.getSAttributeAccess().getColonKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getColonKeyword_1_2()); 

            }


            }

        }
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
    // InternalSms.g:3507:1: rule__SAttribute__Group_1__3 : rule__SAttribute__Group_1__3__Impl rule__SAttribute__Group_1__4 ;
    public final void rule__SAttribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3511:1: ( rule__SAttribute__Group_1__3__Impl rule__SAttribute__Group_1__4 )
            // InternalSms.g:3512:2: rule__SAttribute__Group_1__3__Impl rule__SAttribute__Group_1__4
            {
            pushFollow(FOLLOW_36);
            rule__SAttribute__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__4();

            state._fsp--;


            }

        }
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
    // InternalSms.g:3519:1: rule__SAttribute__Group_1__3__Impl : ( ( rule__SAttribute__TypeAssignment_1_3 ) ) ;
    public final void rule__SAttribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3523:1: ( ( ( rule__SAttribute__TypeAssignment_1_3 ) ) )
            // InternalSms.g:3524:1: ( ( rule__SAttribute__TypeAssignment_1_3 ) )
            {
            // InternalSms.g:3524:1: ( ( rule__SAttribute__TypeAssignment_1_3 ) )
            // InternalSms.g:3525:2: ( rule__SAttribute__TypeAssignment_1_3 )
            {
             before(grammarAccess.getSAttributeAccess().getTypeAssignment_1_3()); 
            // InternalSms.g:3526:2: ( rule__SAttribute__TypeAssignment_1_3 )
            // InternalSms.g:3526:3: rule__SAttribute__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSAttributeAccess().getTypeAssignment_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAttribute__Group_1__4"
    // InternalSms.g:3534:1: rule__SAttribute__Group_1__4 : rule__SAttribute__Group_1__4__Impl rule__SAttribute__Group_1__5 ;
    public final void rule__SAttribute__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3538:1: ( rule__SAttribute__Group_1__4__Impl rule__SAttribute__Group_1__5 )
            // InternalSms.g:3539:2: rule__SAttribute__Group_1__4__Impl rule__SAttribute__Group_1__5
            {
            pushFollow(FOLLOW_36);
            rule__SAttribute__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__4"


    // $ANTLR start "rule__SAttribute__Group_1__4__Impl"
    // InternalSms.g:3546:1: rule__SAttribute__Group_1__4__Impl : ( ( rule__SAttribute__MultiplicityAssignment_1_4 )? ) ;
    public final void rule__SAttribute__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3550:1: ( ( ( rule__SAttribute__MultiplicityAssignment_1_4 )? ) )
            // InternalSms.g:3551:1: ( ( rule__SAttribute__MultiplicityAssignment_1_4 )? )
            {
            // InternalSms.g:3551:1: ( ( rule__SAttribute__MultiplicityAssignment_1_4 )? )
            // InternalSms.g:3552:2: ( rule__SAttribute__MultiplicityAssignment_1_4 )?
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_1_4()); 
            // InternalSms.g:3553:2: ( rule__SAttribute__MultiplicityAssignment_1_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSms.g:3553:3: rule__SAttribute__MultiplicityAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__MultiplicityAssignment_1_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getMultiplicityAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__4__Impl"


    // $ANTLR start "rule__SAttribute__Group_1__5"
    // InternalSms.g:3561:1: rule__SAttribute__Group_1__5 : rule__SAttribute__Group_1__5__Impl ;
    public final void rule__SAttribute__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3565:1: ( rule__SAttribute__Group_1__5__Impl )
            // InternalSms.g:3566:2: rule__SAttribute__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SAttribute__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__5"


    // $ANTLR start "rule__SAttribute__Group_1__5__Impl"
    // InternalSms.g:3572:1: rule__SAttribute__Group_1__5__Impl : ( ( rule__SAttribute__KeyAssignment_1_5 )? ) ;
    public final void rule__SAttribute__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3576:1: ( ( ( rule__SAttribute__KeyAssignment_1_5 )? ) )
            // InternalSms.g:3577:1: ( ( rule__SAttribute__KeyAssignment_1_5 )? )
            {
            // InternalSms.g:3577:1: ( ( rule__SAttribute__KeyAssignment_1_5 )? )
            // InternalSms.g:3578:2: ( rule__SAttribute__KeyAssignment_1_5 )?
            {
             before(grammarAccess.getSAttributeAccess().getKeyAssignment_1_5()); 
            // InternalSms.g:3579:2: ( rule__SAttribute__KeyAssignment_1_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSms.g:3579:3: rule__SAttribute__KeyAssignment_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SAttribute__KeyAssignment_1_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSAttributeAccess().getKeyAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__Group_1__5__Impl"


    // $ANTLR start "rule__SQuery__Group__0"
    // InternalSms.g:3588:1: rule__SQuery__Group__0 : rule__SQuery__Group__0__Impl rule__SQuery__Group__1 ;
    public final void rule__SQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3592:1: ( rule__SQuery__Group__0__Impl rule__SQuery__Group__1 )
            // InternalSms.g:3593:2: rule__SQuery__Group__0__Impl rule__SQuery__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__0"


    // $ANTLR start "rule__SQuery__Group__0__Impl"
    // InternalSms.g:3600:1: rule__SQuery__Group__0__Impl : ( ( rule__SQuery__NameAssignment_0 ) ) ;
    public final void rule__SQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3604:1: ( ( ( rule__SQuery__NameAssignment_0 ) ) )
            // InternalSms.g:3605:1: ( ( rule__SQuery__NameAssignment_0 ) )
            {
            // InternalSms.g:3605:1: ( ( rule__SQuery__NameAssignment_0 ) )
            // InternalSms.g:3606:2: ( rule__SQuery__NameAssignment_0 )
            {
             before(grammarAccess.getSQueryAccess().getNameAssignment_0()); 
            // InternalSms.g:3607:2: ( rule__SQuery__NameAssignment_0 )
            // InternalSms.g:3607:3: rule__SQuery__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__0__Impl"


    // $ANTLR start "rule__SQuery__Group__1"
    // InternalSms.g:3615:1: rule__SQuery__Group__1 : rule__SQuery__Group__1__Impl rule__SQuery__Group__2 ;
    public final void rule__SQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3619:1: ( rule__SQuery__Group__1__Impl rule__SQuery__Group__2 )
            // InternalSms.g:3620:2: rule__SQuery__Group__1__Impl rule__SQuery__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__SQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__1"


    // $ANTLR start "rule__SQuery__Group__1__Impl"
    // InternalSms.g:3627:1: rule__SQuery__Group__1__Impl : ( '(' ) ;
    public final void rule__SQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3631:1: ( ( '(' ) )
            // InternalSms.g:3632:1: ( '(' )
            {
            // InternalSms.g:3632:1: ( '(' )
            // InternalSms.g:3633:2: '('
            {
             before(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__1__Impl"


    // $ANTLR start "rule__SQuery__Group__2"
    // InternalSms.g:3642:1: rule__SQuery__Group__2 : rule__SQuery__Group__2__Impl rule__SQuery__Group__3 ;
    public final void rule__SQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3646:1: ( rule__SQuery__Group__2__Impl rule__SQuery__Group__3 )
            // InternalSms.g:3647:2: rule__SQuery__Group__2__Impl rule__SQuery__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__SQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__2"


    // $ANTLR start "rule__SQuery__Group__2__Impl"
    // InternalSms.g:3654:1: rule__SQuery__Group__2__Impl : ( ( rule__SQuery__Group_2__0 )? ) ;
    public final void rule__SQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3658:1: ( ( ( rule__SQuery__Group_2__0 )? ) )
            // InternalSms.g:3659:1: ( ( rule__SQuery__Group_2__0 )? )
            {
            // InternalSms.g:3659:1: ( ( rule__SQuery__Group_2__0 )? )
            // InternalSms.g:3660:2: ( rule__SQuery__Group_2__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_2()); 
            // InternalSms.g:3661:2: ( rule__SQuery__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSms.g:3661:3: rule__SQuery__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__2__Impl"


    // $ANTLR start "rule__SQuery__Group__3"
    // InternalSms.g:3669:1: rule__SQuery__Group__3 : rule__SQuery__Group__3__Impl rule__SQuery__Group__4 ;
    public final void rule__SQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3673:1: ( rule__SQuery__Group__3__Impl rule__SQuery__Group__4 )
            // InternalSms.g:3674:2: rule__SQuery__Group__3__Impl rule__SQuery__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__3"


    // $ANTLR start "rule__SQuery__Group__3__Impl"
    // InternalSms.g:3681:1: rule__SQuery__Group__3__Impl : ( ')' ) ;
    public final void rule__SQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3685:1: ( ( ')' ) )
            // InternalSms.g:3686:1: ( ')' )
            {
            // InternalSms.g:3686:1: ( ')' )
            // InternalSms.g:3687:2: ')'
            {
             before(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__3__Impl"


    // $ANTLR start "rule__SQuery__Group__4"
    // InternalSms.g:3696:1: rule__SQuery__Group__4 : rule__SQuery__Group__4__Impl rule__SQuery__Group__5 ;
    public final void rule__SQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3700:1: ( rule__SQuery__Group__4__Impl rule__SQuery__Group__5 )
            // InternalSms.g:3701:2: rule__SQuery__Group__4__Impl rule__SQuery__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__4"


    // $ANTLR start "rule__SQuery__Group__4__Impl"
    // InternalSms.g:3708:1: rule__SQuery__Group__4__Impl : ( ':' ) ;
    public final void rule__SQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3712:1: ( ( ':' ) )
            // InternalSms.g:3713:1: ( ':' )
            {
            // InternalSms.g:3713:1: ( ':' )
            // InternalSms.g:3714:2: ':'
            {
             before(grammarAccess.getSQueryAccess().getColonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__4__Impl"


    // $ANTLR start "rule__SQuery__Group__5"
    // InternalSms.g:3723:1: rule__SQuery__Group__5 : rule__SQuery__Group__5__Impl rule__SQuery__Group__6 ;
    public final void rule__SQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3727:1: ( rule__SQuery__Group__5__Impl rule__SQuery__Group__6 )
            // InternalSms.g:3728:2: rule__SQuery__Group__5__Impl rule__SQuery__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__SQuery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__5"


    // $ANTLR start "rule__SQuery__Group__5__Impl"
    // InternalSms.g:3735:1: rule__SQuery__Group__5__Impl : ( ( rule__SQuery__TypeAssignment_5 ) ) ;
    public final void rule__SQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3739:1: ( ( ( rule__SQuery__TypeAssignment_5 ) ) )
            // InternalSms.g:3740:1: ( ( rule__SQuery__TypeAssignment_5 ) )
            {
            // InternalSms.g:3740:1: ( ( rule__SQuery__TypeAssignment_5 ) )
            // InternalSms.g:3741:2: ( rule__SQuery__TypeAssignment_5 )
            {
             before(grammarAccess.getSQueryAccess().getTypeAssignment_5()); 
            // InternalSms.g:3742:2: ( rule__SQuery__TypeAssignment_5 )
            // InternalSms.g:3742:3: rule__SQuery__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__5__Impl"


    // $ANTLR start "rule__SQuery__Group__6"
    // InternalSms.g:3750:1: rule__SQuery__Group__6 : rule__SQuery__Group__6__Impl rule__SQuery__Group__7 ;
    public final void rule__SQuery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3754:1: ( rule__SQuery__Group__6__Impl rule__SQuery__Group__7 )
            // InternalSms.g:3755:2: rule__SQuery__Group__6__Impl rule__SQuery__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__SQuery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__6"


    // $ANTLR start "rule__SQuery__Group__6__Impl"
    // InternalSms.g:3762:1: rule__SQuery__Group__6__Impl : ( ( rule__SQuery__MultiplicityAssignment_6 )? ) ;
    public final void rule__SQuery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3766:1: ( ( ( rule__SQuery__MultiplicityAssignment_6 )? ) )
            // InternalSms.g:3767:1: ( ( rule__SQuery__MultiplicityAssignment_6 )? )
            {
            // InternalSms.g:3767:1: ( ( rule__SQuery__MultiplicityAssignment_6 )? )
            // InternalSms.g:3768:2: ( rule__SQuery__MultiplicityAssignment_6 )?
            {
             before(grammarAccess.getSQueryAccess().getMultiplicityAssignment_6()); 
            // InternalSms.g:3769:2: ( rule__SQuery__MultiplicityAssignment_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSms.g:3769:3: rule__SQuery__MultiplicityAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__MultiplicityAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getMultiplicityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__6__Impl"


    // $ANTLR start "rule__SQuery__Group__7"
    // InternalSms.g:3777:1: rule__SQuery__Group__7 : rule__SQuery__Group__7__Impl ;
    public final void rule__SQuery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3781:1: ( rule__SQuery__Group__7__Impl )
            // InternalSms.g:3782:2: rule__SQuery__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__7"


    // $ANTLR start "rule__SQuery__Group__7__Impl"
    // InternalSms.g:3788:1: rule__SQuery__Group__7__Impl : ( ( rule__SQuery__Group_7__0 )? ) ;
    public final void rule__SQuery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3792:1: ( ( ( rule__SQuery__Group_7__0 )? ) )
            // InternalSms.g:3793:1: ( ( rule__SQuery__Group_7__0 )? )
            {
            // InternalSms.g:3793:1: ( ( rule__SQuery__Group_7__0 )? )
            // InternalSms.g:3794:2: ( rule__SQuery__Group_7__0 )?
            {
             before(grammarAccess.getSQueryAccess().getGroup_7()); 
            // InternalSms.g:3795:2: ( rule__SQuery__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSms.g:3795:3: rule__SQuery__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQuery__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group__7__Impl"


    // $ANTLR start "rule__SQuery__Group_2__0"
    // InternalSms.g:3804:1: rule__SQuery__Group_2__0 : rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 ;
    public final void rule__SQuery__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3808:1: ( rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1 )
            // InternalSms.g:3809:2: rule__SQuery__Group_2__0__Impl rule__SQuery__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSms.g:3816:1: rule__SQuery__Group_2__0__Impl : ( ( rule__SQuery__ParametersAssignment_2_0 ) ) ;
    public final void rule__SQuery__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3820:1: ( ( ( rule__SQuery__ParametersAssignment_2_0 ) ) )
            // InternalSms.g:3821:1: ( ( rule__SQuery__ParametersAssignment_2_0 ) )
            {
            // InternalSms.g:3821:1: ( ( rule__SQuery__ParametersAssignment_2_0 ) )
            // InternalSms.g:3822:2: ( rule__SQuery__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_0()); 
            // InternalSms.g:3823:2: ( rule__SQuery__ParametersAssignment_2_0 )
            // InternalSms.g:3823:3: rule__SQuery__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_2_0()); 

            }


            }

        }
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
    // InternalSms.g:3831:1: rule__SQuery__Group_2__1 : rule__SQuery__Group_2__1__Impl ;
    public final void rule__SQuery__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3835:1: ( rule__SQuery__Group_2__1__Impl )
            // InternalSms.g:3836:2: rule__SQuery__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalSms.g:3842:1: rule__SQuery__Group_2__1__Impl : ( ( rule__SQuery__Group_2_1__0 )* ) ;
    public final void rule__SQuery__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3846:1: ( ( ( rule__SQuery__Group_2_1__0 )* ) )
            // InternalSms.g:3847:1: ( ( rule__SQuery__Group_2_1__0 )* )
            {
            // InternalSms.g:3847:1: ( ( rule__SQuery__Group_2_1__0 )* )
            // InternalSms.g:3848:2: ( rule__SQuery__Group_2_1__0 )*
            {
             before(grammarAccess.getSQueryAccess().getGroup_2_1()); 
            // InternalSms.g:3849:2: ( rule__SQuery__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==32) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSms.g:3849:3: rule__SQuery__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SQuery__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSQueryAccess().getGroup_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SQuery__Group_2_1__0"
    // InternalSms.g:3858:1: rule__SQuery__Group_2_1__0 : rule__SQuery__Group_2_1__0__Impl rule__SQuery__Group_2_1__1 ;
    public final void rule__SQuery__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3862:1: ( rule__SQuery__Group_2_1__0__Impl rule__SQuery__Group_2_1__1 )
            // InternalSms.g:3863:2: rule__SQuery__Group_2_1__0__Impl rule__SQuery__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SQuery__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_1__0"


    // $ANTLR start "rule__SQuery__Group_2_1__0__Impl"
    // InternalSms.g:3870:1: rule__SQuery__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SQuery__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3874:1: ( ( ',' ) )
            // InternalSms.g:3875:1: ( ',' )
            {
            // InternalSms.g:3875:1: ( ',' )
            // InternalSms.g:3876:2: ','
            {
             before(grammarAccess.getSQueryAccess().getCommaKeyword_2_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_1__0__Impl"


    // $ANTLR start "rule__SQuery__Group_2_1__1"
    // InternalSms.g:3885:1: rule__SQuery__Group_2_1__1 : rule__SQuery__Group_2_1__1__Impl ;
    public final void rule__SQuery__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3889:1: ( rule__SQuery__Group_2_1__1__Impl )
            // InternalSms.g:3890:2: rule__SQuery__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_1__1"


    // $ANTLR start "rule__SQuery__Group_2_1__1__Impl"
    // InternalSms.g:3896:1: rule__SQuery__Group_2_1__1__Impl : ( ( rule__SQuery__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__SQuery__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3900:1: ( ( ( rule__SQuery__ParametersAssignment_2_1_1 ) ) )
            // InternalSms.g:3901:1: ( ( rule__SQuery__ParametersAssignment_2_1_1 ) )
            {
            // InternalSms.g:3901:1: ( ( rule__SQuery__ParametersAssignment_2_1_1 ) )
            // InternalSms.g:3902:2: ( rule__SQuery__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getSQueryAccess().getParametersAssignment_2_1_1()); 
            // InternalSms.g:3903:2: ( rule__SQuery__ParametersAssignment_2_1_1 )
            // InternalSms.g:3903:3: rule__SQuery__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_2_1__1__Impl"


    // $ANTLR start "rule__SQuery__Group_7__0"
    // InternalSms.g:3912:1: rule__SQuery__Group_7__0 : rule__SQuery__Group_7__0__Impl rule__SQuery__Group_7__1 ;
    public final void rule__SQuery__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3916:1: ( rule__SQuery__Group_7__0__Impl rule__SQuery__Group_7__1 )
            // InternalSms.g:3917:2: rule__SQuery__Group_7__0__Impl rule__SQuery__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__SQuery__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQuery__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_7__0"


    // $ANTLR start "rule__SQuery__Group_7__0__Impl"
    // InternalSms.g:3924:1: rule__SQuery__Group_7__0__Impl : ( 'returns' ) ;
    public final void rule__SQuery__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3928:1: ( ( 'returns' ) )
            // InternalSms.g:3929:1: ( 'returns' )
            {
            // InternalSms.g:3929:1: ( 'returns' )
            // InternalSms.g:3930:2: 'returns'
            {
             before(grammarAccess.getSQueryAccess().getReturnsKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getReturnsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_7__0__Impl"


    // $ANTLR start "rule__SQuery__Group_7__1"
    // InternalSms.g:3939:1: rule__SQuery__Group_7__1 : rule__SQuery__Group_7__1__Impl ;
    public final void rule__SQuery__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3943:1: ( rule__SQuery__Group_7__1__Impl )
            // InternalSms.g:3944:2: rule__SQuery__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_7__1"


    // $ANTLR start "rule__SQuery__Group_7__1__Impl"
    // InternalSms.g:3950:1: rule__SQuery__Group_7__1__Impl : ( ( rule__SQuery__ReturnsAssignment_7_1 ) ) ;
    public final void rule__SQuery__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3954:1: ( ( ( rule__SQuery__ReturnsAssignment_7_1 ) ) )
            // InternalSms.g:3955:1: ( ( rule__SQuery__ReturnsAssignment_7_1 ) )
            {
            // InternalSms.g:3955:1: ( ( rule__SQuery__ReturnsAssignment_7_1 ) )
            // InternalSms.g:3956:2: ( rule__SQuery__ReturnsAssignment_7_1 )
            {
             before(grammarAccess.getSQueryAccess().getReturnsAssignment_7_1()); 
            // InternalSms.g:3957:2: ( rule__SQuery__ReturnsAssignment_7_1 )
            // InternalSms.g:3957:3: rule__SQuery__ReturnsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SQuery__ReturnsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSQueryAccess().getReturnsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__Group_7__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group__0"
    // InternalSms.g:3966:1: rule__SQueryParameter__Group__0 : rule__SQueryParameter__Group__0__Impl rule__SQueryParameter__Group__1 ;
    public final void rule__SQueryParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3970:1: ( rule__SQueryParameter__Group__0__Impl rule__SQueryParameter__Group__1 )
            // InternalSms.g:3971:2: rule__SQueryParameter__Group__0__Impl rule__SQueryParameter__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SQueryParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__0"


    // $ANTLR start "rule__SQueryParameter__Group__0__Impl"
    // InternalSms.g:3978:1: rule__SQueryParameter__Group__0__Impl : ( ( rule__SQueryParameter__NameAssignment_0 ) ) ;
    public final void rule__SQueryParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3982:1: ( ( ( rule__SQueryParameter__NameAssignment_0 ) ) )
            // InternalSms.g:3983:1: ( ( rule__SQueryParameter__NameAssignment_0 ) )
            {
            // InternalSms.g:3983:1: ( ( rule__SQueryParameter__NameAssignment_0 ) )
            // InternalSms.g:3984:2: ( rule__SQueryParameter__NameAssignment_0 )
            {
             before(grammarAccess.getSQueryParameterAccess().getNameAssignment_0()); 
            // InternalSms.g:3985:2: ( rule__SQueryParameter__NameAssignment_0 )
            // InternalSms.g:3985:3: rule__SQueryParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__0__Impl"


    // $ANTLR start "rule__SQueryParameter__Group__1"
    // InternalSms.g:3993:1: rule__SQueryParameter__Group__1 : rule__SQueryParameter__Group__1__Impl rule__SQueryParameter__Group__2 ;
    public final void rule__SQueryParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:3997:1: ( rule__SQueryParameter__Group__1__Impl rule__SQueryParameter__Group__2 )
            // InternalSms.g:3998:2: rule__SQueryParameter__Group__1__Impl rule__SQueryParameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SQueryParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__1"


    // $ANTLR start "rule__SQueryParameter__Group__1__Impl"
    // InternalSms.g:4005:1: rule__SQueryParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__SQueryParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4009:1: ( ( ':' ) )
            // InternalSms.g:4010:1: ( ':' )
            {
            // InternalSms.g:4010:1: ( ':' )
            // InternalSms.g:4011:2: ':'
            {
             before(grammarAccess.getSQueryParameterAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__1__Impl"


    // $ANTLR start "rule__SQueryParameter__Group__2"
    // InternalSms.g:4020:1: rule__SQueryParameter__Group__2 : rule__SQueryParameter__Group__2__Impl rule__SQueryParameter__Group__3 ;
    public final void rule__SQueryParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4024:1: ( rule__SQueryParameter__Group__2__Impl rule__SQueryParameter__Group__3 )
            // InternalSms.g:4025:2: rule__SQueryParameter__Group__2__Impl rule__SQueryParameter__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SQueryParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__2"


    // $ANTLR start "rule__SQueryParameter__Group__2__Impl"
    // InternalSms.g:4032:1: rule__SQueryParameter__Group__2__Impl : ( ( rule__SQueryParameter__TypeAssignment_2 ) ) ;
    public final void rule__SQueryParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4036:1: ( ( ( rule__SQueryParameter__TypeAssignment_2 ) ) )
            // InternalSms.g:4037:1: ( ( rule__SQueryParameter__TypeAssignment_2 ) )
            {
            // InternalSms.g:4037:1: ( ( rule__SQueryParameter__TypeAssignment_2 ) )
            // InternalSms.g:4038:2: ( rule__SQueryParameter__TypeAssignment_2 )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeAssignment_2()); 
            // InternalSms.g:4039:2: ( rule__SQueryParameter__TypeAssignment_2 )
            // InternalSms.g:4039:3: rule__SQueryParameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSQueryParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__2__Impl"


    // $ANTLR start "rule__SQueryParameter__Group__3"
    // InternalSms.g:4047:1: rule__SQueryParameter__Group__3 : rule__SQueryParameter__Group__3__Impl ;
    public final void rule__SQueryParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4051:1: ( rule__SQueryParameter__Group__3__Impl )
            // InternalSms.g:4052:2: rule__SQueryParameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SQueryParameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__3"


    // $ANTLR start "rule__SQueryParameter__Group__3__Impl"
    // InternalSms.g:4058:1: rule__SQueryParameter__Group__3__Impl : ( ( rule__SQueryParameter__MultiplicityAssignment_3 )? ) ;
    public final void rule__SQueryParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4062:1: ( ( ( rule__SQueryParameter__MultiplicityAssignment_3 )? ) )
            // InternalSms.g:4063:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3 )? )
            {
            // InternalSms.g:4063:1: ( ( rule__SQueryParameter__MultiplicityAssignment_3 )? )
            // InternalSms.g:4064:2: ( rule__SQueryParameter__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3()); 
            // InternalSms.g:4065:2: ( rule__SQueryParameter__MultiplicityAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSms.g:4065:3: rule__SQueryParameter__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SQueryParameter__MultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSQueryParameterAccess().getMultiplicityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__Group__3__Impl"


    // $ANTLR start "rule__SQualifiedNameWithWildcard__Group__0"
    // InternalSms.g:4074:1: rule__SQualifiedNameWithWildcard__Group__0 : rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 ;
    public final void rule__SQualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4078:1: ( rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1 )
            // InternalSms.g:4079:2: rule__SQualifiedNameWithWildcard__Group__0__Impl rule__SQualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalSms.g:4086:1: rule__SQualifiedNameWithWildcard__Group__0__Impl : ( ruleSQualifiedName ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4090:1: ( ( ruleSQualifiedName ) )
            // InternalSms.g:4091:1: ( ruleSQualifiedName )
            {
            // InternalSms.g:4091:1: ( ruleSQualifiedName )
            // InternalSms.g:4092:2: ruleSQualifiedName
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
    // InternalSms.g:4101:1: rule__SQualifiedNameWithWildcard__Group__1 : rule__SQualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__SQualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4105:1: ( rule__SQualifiedNameWithWildcard__Group__1__Impl )
            // InternalSms.g:4106:2: rule__SQualifiedNameWithWildcard__Group__1__Impl
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
    // InternalSms.g:4112:1: rule__SQualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__SQualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4116:1: ( ( ( '.*' )? ) )
            // InternalSms.g:4117:1: ( ( '.*' )? )
            {
            // InternalSms.g:4117:1: ( ( '.*' )? )
            // InternalSms.g:4118:2: ( '.*' )?
            {
             before(grammarAccess.getSQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalSms.g:4119:2: ( '.*' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSms.g:4119:3: '.*'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalSms.g:4128:1: rule__SQualifiedName__Group__0 : rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 ;
    public final void rule__SQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4132:1: ( rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1 )
            // InternalSms.g:4133:2: rule__SQualifiedName__Group__0__Impl rule__SQualifiedName__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalSms.g:4140:1: rule__SQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4144:1: ( ( RULE_ID ) )
            // InternalSms.g:4145:1: ( RULE_ID )
            {
            // InternalSms.g:4145:1: ( RULE_ID )
            // InternalSms.g:4146:2: RULE_ID
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
    // InternalSms.g:4155:1: rule__SQualifiedName__Group__1 : rule__SQualifiedName__Group__1__Impl ;
    public final void rule__SQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4159:1: ( rule__SQualifiedName__Group__1__Impl )
            // InternalSms.g:4160:2: rule__SQualifiedName__Group__1__Impl
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
    // InternalSms.g:4166:1: rule__SQualifiedName__Group__1__Impl : ( ( rule__SQualifiedName__Group_1__0 )* ) ;
    public final void rule__SQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4170:1: ( ( ( rule__SQualifiedName__Group_1__0 )* ) )
            // InternalSms.g:4171:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            {
            // InternalSms.g:4171:1: ( ( rule__SQualifiedName__Group_1__0 )* )
            // InternalSms.g:4172:2: ( rule__SQualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getSQualifiedNameAccess().getGroup_1()); 
            // InternalSms.g:4173:2: ( rule__SQualifiedName__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalSms.g:4173:3: rule__SQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__SQualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalSms.g:4182:1: rule__SQualifiedName__Group_1__0 : rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 ;
    public final void rule__SQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4186:1: ( rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1 )
            // InternalSms.g:4187:2: rule__SQualifiedName__Group_1__0__Impl rule__SQualifiedName__Group_1__1
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
    // InternalSms.g:4194:1: rule__SQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4198:1: ( ( '.' ) )
            // InternalSms.g:4199:1: ( '.' )
            {
            // InternalSms.g:4199:1: ( '.' )
            // InternalSms.g:4200:2: '.'
            {
             before(grammarAccess.getSQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSms.g:4209:1: rule__SQualifiedName__Group_1__1 : rule__SQualifiedName__Group_1__1__Impl ;
    public final void rule__SQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4213:1: ( rule__SQualifiedName__Group_1__1__Impl )
            // InternalSms.g:4214:2: rule__SQualifiedName__Group_1__1__Impl
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
    // InternalSms.g:4220:1: rule__SQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4224:1: ( ( RULE_ID ) )
            // InternalSms.g:4225:1: ( RULE_ID )
            {
            // InternalSms.g:4225:1: ( RULE_ID )
            // InternalSms.g:4226:2: RULE_ID
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
    // InternalSms.g:4236:1: rule__SMultiplicity__Group__0 : rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 ;
    public final void rule__SMultiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4240:1: ( rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1 )
            // InternalSms.g:4241:2: rule__SMultiplicity__Group__0__Impl rule__SMultiplicity__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalSms.g:4248:1: rule__SMultiplicity__Group__0__Impl : ( '(' ) ;
    public final void rule__SMultiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4252:1: ( ( '(' ) )
            // InternalSms.g:4253:1: ( '(' )
            {
            // InternalSms.g:4253:1: ( '(' )
            // InternalSms.g:4254:2: '('
            {
             before(grammarAccess.getSMultiplicityAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSms.g:4263:1: rule__SMultiplicity__Group__1 : rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 ;
    public final void rule__SMultiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4267:1: ( rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2 )
            // InternalSms.g:4268:2: rule__SMultiplicity__Group__1__Impl rule__SMultiplicity__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalSms.g:4275:1: rule__SMultiplicity__Group__1__Impl : ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) ;
    public final void rule__SMultiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4279:1: ( ( ( rule__SMultiplicity__MinOccursAssignment_1 ) ) )
            // InternalSms.g:4280:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            {
            // InternalSms.g:4280:1: ( ( rule__SMultiplicity__MinOccursAssignment_1 ) )
            // InternalSms.g:4281:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMinOccursAssignment_1()); 
            // InternalSms.g:4282:2: ( rule__SMultiplicity__MinOccursAssignment_1 )
            // InternalSms.g:4282:3: rule__SMultiplicity__MinOccursAssignment_1
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
    // InternalSms.g:4290:1: rule__SMultiplicity__Group__2 : rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 ;
    public final void rule__SMultiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4294:1: ( rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3 )
            // InternalSms.g:4295:2: rule__SMultiplicity__Group__2__Impl rule__SMultiplicity__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalSms.g:4302:1: rule__SMultiplicity__Group__2__Impl : ( '..' ) ;
    public final void rule__SMultiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4306:1: ( ( '..' ) )
            // InternalSms.g:4307:1: ( '..' )
            {
            // InternalSms.g:4307:1: ( '..' )
            // InternalSms.g:4308:2: '..'
            {
             before(grammarAccess.getSMultiplicityAccess().getFullStopFullStopKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSms.g:4317:1: rule__SMultiplicity__Group__3 : rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 ;
    public final void rule__SMultiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4321:1: ( rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4 )
            // InternalSms.g:4322:2: rule__SMultiplicity__Group__3__Impl rule__SMultiplicity__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalSms.g:4329:1: rule__SMultiplicity__Group__3__Impl : ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) ;
    public final void rule__SMultiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4333:1: ( ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) ) )
            // InternalSms.g:4334:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            {
            // InternalSms.g:4334:1: ( ( rule__SMultiplicity__MaxOccursAssignment_3 ) )
            // InternalSms.g:4335:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            {
             before(grammarAccess.getSMultiplicityAccess().getMaxOccursAssignment_3()); 
            // InternalSms.g:4336:2: ( rule__SMultiplicity__MaxOccursAssignment_3 )
            // InternalSms.g:4336:3: rule__SMultiplicity__MaxOccursAssignment_3
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
    // InternalSms.g:4344:1: rule__SMultiplicity__Group__4 : rule__SMultiplicity__Group__4__Impl ;
    public final void rule__SMultiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4348:1: ( rule__SMultiplicity__Group__4__Impl )
            // InternalSms.g:4349:2: rule__SMultiplicity__Group__4__Impl
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
    // InternalSms.g:4355:1: rule__SMultiplicity__Group__4__Impl : ( ')' ) ;
    public final void rule__SMultiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4359:1: ( ( ')' ) )
            // InternalSms.g:4360:1: ( ')' )
            {
            // InternalSms.g:4360:1: ( ')' )
            // InternalSms.g:4361:2: ')'
            {
             before(grammarAccess.getSMultiplicityAccess().getRightParenthesisKeyword_4()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__SPrimitive__UnorderedGroup_1_3"
    // InternalSms.g:4371:1: rule__SPrimitive__UnorderedGroup_1_3 : ( rule__SPrimitive__UnorderedGroup_1_3__0 )? ;
    public final void rule__SPrimitive__UnorderedGroup_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
        	
        try {
            // InternalSms.g:4376:1: ( ( rule__SPrimitive__UnorderedGroup_1_3__0 )? )
            // InternalSms.g:4377:2: ( rule__SPrimitive__UnorderedGroup_1_3__0 )?
            {
            // InternalSms.g:4377:2: ( rule__SPrimitive__UnorderedGroup_1_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSms.g:4377:2: rule__SPrimitive__UnorderedGroup_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__UnorderedGroup_1_3__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__UnorderedGroup_1_3"


    // $ANTLR start "rule__SPrimitive__UnorderedGroup_1_3__Impl"
    // InternalSms.g:4385:1: rule__SPrimitive__UnorderedGroup_1_3__Impl : ( ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) ) ) ;
    public final void rule__SPrimitive__UnorderedGroup_1_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalSms.g:4390:1: ( ( ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) ) ) )
            // InternalSms.g:4391:3: ( ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) ) )
            {
            // InternalSms.g:4391:3: ( ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalSms.g:4392:3: ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) )
                    {
                    // InternalSms.g:4392:3: ({...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) ) )
                    // InternalSms.g:4393:4: {...}? => ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SPrimitive__UnorderedGroup_1_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0)");
                    }
                    // InternalSms.g:4393:108: ( ( ( rule__SPrimitive__Group_1_3_0__0 ) ) )
                    // InternalSms.g:4394:5: ( ( rule__SPrimitive__Group_1_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalSms.g:4400:5: ( ( rule__SPrimitive__Group_1_3_0__0 ) )
                    // InternalSms.g:4401:6: ( rule__SPrimitive__Group_1_3_0__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_1_3_0()); 
                    // InternalSms.g:4402:6: ( rule__SPrimitive__Group_1_3_0__0 )
                    // InternalSms.g:4402:7: rule__SPrimitive__Group_1_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_1_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_1_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSms.g:4407:3: ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) )
                    {
                    // InternalSms.g:4407:3: ({...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) ) )
                    // InternalSms.g:4408:4: {...}? => ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SPrimitive__UnorderedGroup_1_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1)");
                    }
                    // InternalSms.g:4408:108: ( ( ( rule__SPrimitive__Group_1_3_1__0 ) ) )
                    // InternalSms.g:4409:5: ( ( rule__SPrimitive__Group_1_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalSms.g:4415:5: ( ( rule__SPrimitive__Group_1_3_1__0 ) )
                    // InternalSms.g:4416:6: ( rule__SPrimitive__Group_1_3_1__0 )
                    {
                     before(grammarAccess.getSPrimitiveAccess().getGroup_1_3_1()); 
                    // InternalSms.g:4417:6: ( rule__SPrimitive__Group_1_3_1__0 )
                    // InternalSms.g:4417:7: rule__SPrimitive__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__Group_1_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSPrimitiveAccess().getGroup_1_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__UnorderedGroup_1_3__Impl"


    // $ANTLR start "rule__SPrimitive__UnorderedGroup_1_3__0"
    // InternalSms.g:4430:1: rule__SPrimitive__UnorderedGroup_1_3__0 : rule__SPrimitive__UnorderedGroup_1_3__Impl ( rule__SPrimitive__UnorderedGroup_1_3__1 )? ;
    public final void rule__SPrimitive__UnorderedGroup_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4434:1: ( rule__SPrimitive__UnorderedGroup_1_3__Impl ( rule__SPrimitive__UnorderedGroup_1_3__1 )? )
            // InternalSms.g:4435:2: rule__SPrimitive__UnorderedGroup_1_3__Impl ( rule__SPrimitive__UnorderedGroup_1_3__1 )?
            {
            pushFollow(FOLLOW_46);
            rule__SPrimitive__UnorderedGroup_1_3__Impl();

            state._fsp--;

            // InternalSms.g:4436:2: ( rule__SPrimitive__UnorderedGroup_1_3__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSPrimitiveAccess().getUnorderedGroup_1_3(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSms.g:4436:2: rule__SPrimitive__UnorderedGroup_1_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SPrimitive__UnorderedGroup_1_3__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__UnorderedGroup_1_3__0"


    // $ANTLR start "rule__SPrimitive__UnorderedGroup_1_3__1"
    // InternalSms.g:4442:1: rule__SPrimitive__UnorderedGroup_1_3__1 : rule__SPrimitive__UnorderedGroup_1_3__Impl ;
    public final void rule__SPrimitive__UnorderedGroup_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4446:1: ( rule__SPrimitive__UnorderedGroup_1_3__Impl )
            // InternalSms.g:4447:2: rule__SPrimitive__UnorderedGroup_1_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SPrimitive__UnorderedGroup_1_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__UnorderedGroup_1_3__1"


    // $ANTLR start "rule__SDomain__NameAssignment_1"
    // InternalSms.g:4454:1: rule__SDomain__NameAssignment_1 : ( ruleSQualifiedName ) ;
    public final void rule__SDomain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4458:1: ( ( ruleSQualifiedName ) )
            // InternalSms.g:4459:2: ( ruleSQualifiedName )
            {
            // InternalSms.g:4459:2: ( ruleSQualifiedName )
            // InternalSms.g:4460:3: ruleSQualifiedName
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
    // InternalSms.g:4469:1: rule__SDomain__ImportsAssignment_2 : ( ruleSImport ) ;
    public final void rule__SDomain__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4473:1: ( ( ruleSImport ) )
            // InternalSms.g:4474:2: ( ruleSImport )
            {
            // InternalSms.g:4474:2: ( ruleSImport )
            // InternalSms.g:4475:3: ruleSImport
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
    // InternalSms.g:4484:1: rule__SDomain__TypesAssignment_3_0 : ( ruleSType ) ;
    public final void rule__SDomain__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4488:1: ( ( ruleSType ) )
            // InternalSms.g:4489:2: ( ruleSType )
            {
            // InternalSms.g:4489:2: ( ruleSType )
            // InternalSms.g:4490:3: ruleSType
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
    // InternalSms.g:4499:1: rule__SDomain__AggregatesAssignment_3_1 : ( ruleSAggregate ) ;
    public final void rule__SDomain__AggregatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4503:1: ( ( ruleSAggregate ) )
            // InternalSms.g:4504:2: ( ruleSAggregate )
            {
            // InternalSms.g:4504:2: ( ruleSAggregate )
            // InternalSms.g:4505:3: ruleSAggregate
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
    // InternalSms.g:4514:1: rule__SImport__ImportedNamespaceAssignment_1 : ( ruleSQualifiedNameWithWildcard ) ;
    public final void rule__SImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4518:1: ( ( ruleSQualifiedNameWithWildcard ) )
            // InternalSms.g:4519:2: ( ruleSQualifiedNameWithWildcard )
            {
            // InternalSms.g:4519:2: ( ruleSQualifiedNameWithWildcard )
            // InternalSms.g:4520:3: ruleSQualifiedNameWithWildcard
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


    // $ANTLR start "rule__SDeductionRule__SourceAssignment_0"
    // InternalSms.g:4529:1: rule__SDeductionRule__SourceAssignment_0 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SDeductionRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4533:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:4534:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:4534:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:4535:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0()); 
            // InternalSms.g:4536:3: ( ruleSQualifiedName )
            // InternalSms.g:4537:4: ruleSQualifiedName
            {
             before(grammarAccess.getSDeductionRuleAccess().getSourceDNamedElementSQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSDeductionRuleAccess().getSourceDNamedElementSQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__SourceAssignment_0"


    // $ANTLR start "rule__SDeductionRule__TransformAssignment_1"
    // InternalSms.g:4548:1: rule__SDeductionRule__TransformAssignment_1 : ( ruleSTransform ) ;
    public final void rule__SDeductionRule__TransformAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4552:1: ( ( ruleSTransform ) )
            // InternalSms.g:4553:2: ( ruleSTransform )
            {
            // InternalSms.g:4553:2: ( ruleSTransform )
            // InternalSms.g:4554:3: ruleSTransform
            {
             before(grammarAccess.getSDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSTransform();

            state._fsp--;

             after(grammarAccess.getSDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDeductionRule__TransformAssignment_1"


    // $ANTLR start "rule__SMemberDeductionRule__SourceAssignment_0"
    // InternalSms.g:4563:1: rule__SMemberDeductionRule__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SMemberDeductionRule__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4567:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:4568:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:4568:2: ( ( RULE_ID ) )
            // InternalSms.g:4569:3: ( RULE_ID )
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0()); 
            // InternalSms.g:4570:3: ( RULE_ID )
            // InternalSms.g:4571:4: RULE_ID
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getSourceDNamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMemberDeductionRuleAccess().getSourceDNamedElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSMemberDeductionRuleAccess().getSourceDNamedElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__SourceAssignment_0"


    // $ANTLR start "rule__SMemberDeductionRule__TransformAssignment_1"
    // InternalSms.g:4582:1: rule__SMemberDeductionRule__TransformAssignment_1 : ( ruleSTransform ) ;
    public final void rule__SMemberDeductionRule__TransformAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4586:1: ( ( ruleSTransform ) )
            // InternalSms.g:4587:2: ( ruleSTransform )
            {
            // InternalSms.g:4587:2: ( ruleSTransform )
            // InternalSms.g:4588:3: ruleSTransform
            {
             before(grammarAccess.getSMemberDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSTransform();

            state._fsp--;

             after(grammarAccess.getSMemberDeductionRuleAccess().getTransformSTransformParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMemberDeductionRule__TransformAssignment_1"


    // $ANTLR start "rule__SMorphTransform__RenameToAssignment_2_2"
    // InternalSms.g:4597:1: rule__SMorphTransform__RenameToAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__SMorphTransform__RenameToAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4601:1: ( ( RULE_ID ) )
            // InternalSms.g:4602:2: ( RULE_ID )
            {
            // InternalSms.g:4602:2: ( RULE_ID )
            // InternalSms.g:4603:3: RULE_ID
            {
             before(grammarAccess.getSMorphTransformAccess().getRenameToIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getRenameToIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__RenameToAssignment_2_2"


    // $ANTLR start "rule__SMorphTransform__RetypeToAssignment_3_2"
    // InternalSms.g:4612:1: rule__SMorphTransform__RetypeToAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__SMorphTransform__RetypeToAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4616:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:4617:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:4617:2: ( ( RULE_ID ) )
            // InternalSms.g:4618:3: ( RULE_ID )
            {
             before(grammarAccess.getSMorphTransformAccess().getRetypeToSTypeCrossReference_3_2_0()); 
            // InternalSms.g:4619:3: ( RULE_ID )
            // InternalSms.g:4620:4: RULE_ID
            {
             before(grammarAccess.getSMorphTransformAccess().getRetypeToSTypeIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSMorphTransformAccess().getRetypeToSTypeIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getSMorphTransformAccess().getRetypeToSTypeCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__RetypeToAssignment_3_2"


    // $ANTLR start "rule__SMorphTransform__RemultiplyToAssignment_3_3"
    // InternalSms.g:4631:1: rule__SMorphTransform__RemultiplyToAssignment_3_3 : ( ruleSMultiplicity ) ;
    public final void rule__SMorphTransform__RemultiplyToAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4635:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:4636:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:4636:2: ( ruleSMultiplicity )
            // InternalSms.g:4637:3: ruleSMultiplicity
            {
             before(grammarAccess.getSMorphTransformAccess().getRemultiplyToSMultiplicityParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSMorphTransformAccess().getRemultiplyToSMultiplicityParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SMorphTransform__RemultiplyToAssignment_3_3"


    // $ANTLR start "rule__SAggregate__TypesAssignment_3"
    // InternalSms.g:4646:1: rule__SAggregate__TypesAssignment_3 : ( ruleSType ) ;
    public final void rule__SAggregate__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4650:1: ( ( ruleSType ) )
            // InternalSms.g:4651:2: ( ruleSType )
            {
            // InternalSms.g:4651:2: ( ruleSType )
            // InternalSms.g:4652:3: ruleSType
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
    // InternalSms.g:4661:1: rule__SConstraint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4665:1: ( ( RULE_ID ) )
            // InternalSms.g:4666:2: ( RULE_ID )
            {
            // InternalSms.g:4666:2: ( RULE_ID )
            // InternalSms.g:4667:3: RULE_ID
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
    // InternalSms.g:4676:1: rule__SConstraint__ConditionAssignment_3 : ( ruleSExpression ) ;
    public final void rule__SConstraint__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4680:1: ( ( ruleSExpression ) )
            // InternalSms.g:4681:2: ( ruleSExpression )
            {
            // InternalSms.g:4681:2: ( ruleSExpression )
            // InternalSms.g:4682:3: ruleSExpression
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


    // $ANTLR start "rule__SPrimitive__DeductionRuleAssignment_0_2"
    // InternalSms.g:4691:1: rule__SPrimitive__DeductionRuleAssignment_0_2 : ( ruleSDeductionRule ) ;
    public final void rule__SPrimitive__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4695:1: ( ( ruleSDeductionRule ) )
            // InternalSms.g:4696:2: ( ruleSDeductionRule )
            {
            // InternalSms.g:4696:2: ( ruleSDeductionRule )
            // InternalSms.g:4697:3: ruleSDeductionRule
            {
             before(grammarAccess.getSPrimitiveAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSDeductionRule();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__DeductionRuleAssignment_0_2"


    // $ANTLR start "rule__SPrimitive__NameAssignment_1_1"
    // InternalSms.g:4706:1: rule__SPrimitive__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SPrimitive__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4710:1: ( ( RULE_ID ) )
            // InternalSms.g:4711:2: ( RULE_ID )
            {
            // InternalSms.g:4711:2: ( RULE_ID )
            // InternalSms.g:4712:3: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__NameAssignment_1_1"


    // $ANTLR start "rule__SPrimitive__RedefinesAssignment_1_3_0_1"
    // InternalSms.g:4721:1: rule__SPrimitive__RedefinesAssignment_1_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SPrimitive__RedefinesAssignment_1_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4725:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:4726:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:4726:2: ( ( RULE_ID ) )
            // InternalSms.g:4727:3: ( RULE_ID )
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_1_3_0_1_0()); 
            // InternalSms.g:4728:3: ( RULE_ID )
            // InternalSms.g:4729:4: RULE_ID
            {
             before(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_1_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveIDTerminalRuleCall_1_3_0_1_0_1()); 

            }

             after(grammarAccess.getSPrimitiveAccess().getRedefinesSPrimitiveCrossReference_1_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__RedefinesAssignment_1_3_0_1"


    // $ANTLR start "rule__SPrimitive__RealizesAssignment_1_3_1_1"
    // InternalSms.g:4740:1: rule__SPrimitive__RealizesAssignment_1_3_1_1 : ( ( ruleSQualifiedName ) ) ;
    public final void rule__SPrimitive__RealizesAssignment_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4744:1: ( ( ( ruleSQualifiedName ) ) )
            // InternalSms.g:4745:2: ( ( ruleSQualifiedName ) )
            {
            // InternalSms.g:4745:2: ( ( ruleSQualifiedName ) )
            // InternalSms.g:4746:3: ( ruleSQualifiedName )
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_1_3_1_1_0()); 
            // InternalSms.g:4747:3: ( ruleSQualifiedName )
            // InternalSms.g:4748:4: ruleSQualifiedName
            {
             before(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveSQualifiedNameParserRuleCall_1_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSQualifiedName();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveSQualifiedNameParserRuleCall_1_3_1_1_0_1()); 

            }

             after(grammarAccess.getSPrimitiveAccess().getRealizesDPrimitiveCrossReference_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__RealizesAssignment_1_3_1_1"


    // $ANTLR start "rule__SPrimitive__ConstraintsAssignment_1_4"
    // InternalSms.g:4759:1: rule__SPrimitive__ConstraintsAssignment_1_4 : ( ruleSConstraint ) ;
    public final void rule__SPrimitive__ConstraintsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4763:1: ( ( ruleSConstraint ) )
            // InternalSms.g:4764:2: ( ruleSConstraint )
            {
            // InternalSms.g:4764:2: ( ruleSConstraint )
            // InternalSms.g:4765:3: ruleSConstraint
            {
             before(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSPrimitiveAccess().getConstraintsSConstraintParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPrimitive__ConstraintsAssignment_1_4"


    // $ANTLR start "rule__SEnumeration__NameAssignment_1"
    // InternalSms.g:4774:1: rule__SEnumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SEnumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4778:1: ( ( RULE_ID ) )
            // InternalSms.g:4779:2: ( RULE_ID )
            {
            // InternalSms.g:4779:2: ( RULE_ID )
            // InternalSms.g:4780:3: RULE_ID
            {
             before(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__NameAssignment_1"


    // $ANTLR start "rule__SEnumeration__LiteralsAssignment_3_0"
    // InternalSms.g:4789:1: rule__SEnumeration__LiteralsAssignment_3_0 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4793:1: ( ( ruleSLiteral ) )
            // InternalSms.g:4794:2: ( ruleSLiteral )
            {
            // InternalSms.g:4794:2: ( ruleSLiteral )
            // InternalSms.g:4795:3: ruleSLiteral
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__LiteralsAssignment_3_0"


    // $ANTLR start "rule__SEnumeration__LiteralsAssignment_3_1_1"
    // InternalSms.g:4804:1: rule__SEnumeration__LiteralsAssignment_3_1_1 : ( ruleSLiteral ) ;
    public final void rule__SEnumeration__LiteralsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4808:1: ( ( ruleSLiteral ) )
            // InternalSms.g:4809:2: ( ruleSLiteral )
            {
            // InternalSms.g:4809:2: ( ruleSLiteral )
            // InternalSms.g:4810:3: ruleSLiteral
            {
             before(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSLiteral();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getLiteralsSLiteralParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__LiteralsAssignment_3_1_1"


    // $ANTLR start "rule__SEnumeration__ConstraintsAssignment_4"
    // InternalSms.g:4819:1: rule__SEnumeration__ConstraintsAssignment_4 : ( ruleSConstraint ) ;
    public final void rule__SEnumeration__ConstraintsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4823:1: ( ( ruleSConstraint ) )
            // InternalSms.g:4824:2: ( ruleSConstraint )
            {
            // InternalSms.g:4824:2: ( ruleSConstraint )
            // InternalSms.g:4825:3: ruleSConstraint
            {
             before(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSEnumerationAccess().getConstraintsSConstraintParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SEnumeration__ConstraintsAssignment_4"


    // $ANTLR start "rule__SLiteral__NameAssignment"
    // InternalSms.g:4834:1: rule__SLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__SLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4838:1: ( ( RULE_ID ) )
            // InternalSms.g:4839:2: ( RULE_ID )
            {
            // InternalSms.g:4839:2: ( RULE_ID )
            // InternalSms.g:4840:3: RULE_ID
            {
             before(grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSLiteralAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SLiteral__NameAssignment"


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_0_1"
    // InternalSms.g:4849:1: rule__SRootType__AbstractAssignment_0_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4853:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:4854:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:4854:2: ( ( 'abstract' ) )
            // InternalSms.g:4855:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            // InternalSms.g:4856:3: ( 'abstract' )
            // InternalSms.g:4857:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSms.g:4868:1: rule__SRootType__DeductionRuleAssignment_0_0_3 : ( ruleSDeductionRule ) ;
    public final void rule__SRootType__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4872:1: ( ( ruleSDeductionRule ) )
            // InternalSms.g:4873:2: ( ruleSDeductionRule )
            {
            // InternalSms.g:4873:2: ( ruleSDeductionRule )
            // InternalSms.g:4874:3: ruleSDeductionRule
            {
             before(grammarAccess.getSRootTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDeductionRule();

            state._fsp--;

             after(grammarAccess.getSRootTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRootType__AbstractAssignment_0_1_0"
    // InternalSms.g:4883:1: rule__SRootType__AbstractAssignment_0_1_0 : ( ( 'abstract' ) ) ;
    public final void rule__SRootType__AbstractAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4887:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:4888:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:4888:2: ( ( 'abstract' ) )
            // InternalSms.g:4889:3: ( 'abstract' )
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 
            // InternalSms.g:4890:3: ( 'abstract' )
            // InternalSms.g:4891:4: 'abstract'
            {
             before(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getSRootTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__AbstractAssignment_0_1_0"


    // $ANTLR start "rule__SRootType__NameAssignment_0_1_2"
    // InternalSms.g:4902:1: rule__SRootType__NameAssignment_0_1_2 : ( RULE_ID ) ;
    public final void rule__SRootType__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4906:1: ( ( RULE_ID ) )
            // InternalSms.g:4907:2: ( RULE_ID )
            {
            // InternalSms.g:4907:2: ( RULE_ID )
            // InternalSms.g:4908:3: RULE_ID
            {
             before(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSRootTypeAccess().getNameIDTerminalRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRootType__NameAssignment_0_1_2"


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_0_1"
    // InternalSms.g:4917:1: rule__SDetailType__AbstractAssignment_0_0_1 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4921:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:4922:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:4922:2: ( ( 'abstract' ) )
            // InternalSms.g:4923:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            // InternalSms.g:4924:3: ( 'abstract' )
            // InternalSms.g:4925:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_0_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSms.g:4936:1: rule__SDetailType__DeductionRuleAssignment_0_0_3 : ( ruleSDeductionRule ) ;
    public final void rule__SDetailType__DeductionRuleAssignment_0_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4940:1: ( ( ruleSDeductionRule ) )
            // InternalSms.g:4941:2: ( ruleSDeductionRule )
            {
            // InternalSms.g:4941:2: ( ruleSDeductionRule )
            // InternalSms.g:4942:3: ruleSDeductionRule
            {
             before(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSDeductionRule();

            state._fsp--;

             after(grammarAccess.getSDetailTypeAccess().getDeductionRuleSDeductionRuleParserRuleCall_0_0_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SDetailType__AbstractAssignment_0_1_0"
    // InternalSms.g:4951:1: rule__SDetailType__AbstractAssignment_0_1_0 : ( ( 'abstract' ) ) ;
    public final void rule__SDetailType__AbstractAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4955:1: ( ( ( 'abstract' ) ) )
            // InternalSms.g:4956:2: ( ( 'abstract' ) )
            {
            // InternalSms.g:4956:2: ( ( 'abstract' ) )
            // InternalSms.g:4957:3: ( 'abstract' )
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 
            // InternalSms.g:4958:3: ( 'abstract' )
            // InternalSms.g:4959:4: 'abstract'
            {
             before(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getSDetailTypeAccess().getAbstractAbstractKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__AbstractAssignment_0_1_0"


    // $ANTLR start "rule__SDetailType__NameAssignment_0_1_2"
    // InternalSms.g:4970:1: rule__SDetailType__NameAssignment_0_1_2 : ( RULE_ID ) ;
    public final void rule__SDetailType__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4974:1: ( ( RULE_ID ) )
            // InternalSms.g:4975:2: ( RULE_ID )
            {
            // InternalSms.g:4975:2: ( RULE_ID )
            // InternalSms.g:4976:3: RULE_ID
            {
             before(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSDetailTypeAccess().getNameIDTerminalRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDetailType__NameAssignment_0_1_2"


    // $ANTLR start "rule__SComplexType__SuperTypeAssignment_0_1"
    // InternalSms.g:4985:1: rule__SComplexType__SuperTypeAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__SComplexType__SuperTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:4989:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:4990:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:4990:2: ( ( RULE_ID ) )
            // InternalSms.g:4991:3: ( RULE_ID )
            {
             before(grammarAccess.getSComplexTypeAccess().getSuperTypeSComplexTypeCrossReference_0_1_0()); 
            // InternalSms.g:4992:3: ( RULE_ID )
            // InternalSms.g:4993:4: RULE_ID
            {
             before(grammarAccess.getSComplexTypeAccess().getSuperTypeSComplexTypeIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSComplexTypeAccess().getSuperTypeSComplexTypeIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getSComplexTypeAccess().getSuperTypeSComplexTypeCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__SuperTypeAssignment_0_1"


    // $ANTLR start "rule__SComplexType__FeaturesAssignment_2_0"
    // InternalSms.g:5004:1: rule__SComplexType__FeaturesAssignment_2_0 : ( ruleSFeature ) ;
    public final void rule__SComplexType__FeaturesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5008:1: ( ( ruleSFeature ) )
            // InternalSms.g:5009:2: ( ruleSFeature )
            {
            // InternalSms.g:5009:2: ( ruleSFeature )
            // InternalSms.g:5010:3: ruleSFeature
            {
             before(grammarAccess.getSComplexTypeAccess().getFeaturesSFeatureParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSFeature();

            state._fsp--;

             after(grammarAccess.getSComplexTypeAccess().getFeaturesSFeatureParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__FeaturesAssignment_2_0"


    // $ANTLR start "rule__SComplexType__ConstraintsAssignment_2_1"
    // InternalSms.g:5019:1: rule__SComplexType__ConstraintsAssignment_2_1 : ( ruleSConstraint ) ;
    public final void rule__SComplexType__ConstraintsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5023:1: ( ( ruleSConstraint ) )
            // InternalSms.g:5024:2: ( ruleSConstraint )
            {
            // InternalSms.g:5024:2: ( ruleSConstraint )
            // InternalSms.g:5025:3: ruleSConstraint
            {
             before(grammarAccess.getSComplexTypeAccess().getConstraintsSConstraintParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSConstraint();

            state._fsp--;

             after(grammarAccess.getSComplexTypeAccess().getConstraintsSConstraintParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SComplexType__ConstraintsAssignment_2_1"


    // $ANTLR start "rule__SAssociation__DerivedAssignment_0"
    // InternalSms.g:5034:1: rule__SAssociation__DerivedAssignment_0 : ( ( 'derived' ) ) ;
    public final void rule__SAssociation__DerivedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5038:1: ( ( ( 'derived' ) ) )
            // InternalSms.g:5039:2: ( ( 'derived' ) )
            {
            // InternalSms.g:5039:2: ( ( 'derived' ) )
            // InternalSms.g:5040:3: ( 'derived' )
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_0_0()); 
            // InternalSms.g:5041:3: ( 'derived' )
            // InternalSms.g:5042:4: 'derived'
            {
             before(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_0_0()); 

            }

             after(grammarAccess.getSAssociationAccess().getDerivedDerivedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__DerivedAssignment_0"


    // $ANTLR start "rule__SAssociation__KindAssignment_1_0"
    // InternalSms.g:5053:1: rule__SAssociation__KindAssignment_1_0 : ( ruleSAssociationKind ) ;
    public final void rule__SAssociation__KindAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5057:1: ( ( ruleSAssociationKind ) )
            // InternalSms.g:5058:2: ( ruleSAssociationKind )
            {
            // InternalSms.g:5058:2: ( ruleSAssociationKind )
            // InternalSms.g:5059:3: ruleSAssociationKind
            {
             before(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAssociationKind();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getKindSAssociationKindEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__KindAssignment_1_0"


    // $ANTLR start "rule__SAssociation__KindAssignment_1_1_0"
    // InternalSms.g:5068:1: rule__SAssociation__KindAssignment_1_1_0 : ( ruleSAssociationKindInverse ) ;
    public final void rule__SAssociation__KindAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5072:1: ( ( ruleSAssociationKindInverse ) )
            // InternalSms.g:5073:2: ( ruleSAssociationKindInverse )
            {
            // InternalSms.g:5073:2: ( ruleSAssociationKindInverse )
            // InternalSms.g:5074:3: ruleSAssociationKindInverse
            {
             before(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSAssociationKindInverse();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getKindSAssociationKindInverseEnumRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__KindAssignment_1_1_0"


    // $ANTLR start "rule__SAssociation__NameAssignment_2"
    // InternalSms.g:5083:1: rule__SAssociation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SAssociation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5087:1: ( ( RULE_ID ) )
            // InternalSms.g:5088:2: ( RULE_ID )
            {
            // InternalSms.g:5088:2: ( RULE_ID )
            // InternalSms.g:5089:3: RULE_ID
            {
             before(grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__NameAssignment_2"


    // $ANTLR start "rule__SAssociation__TypeAssignment_4"
    // InternalSms.g:5098:1: rule__SAssociation__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SAssociation__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5102:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:5103:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:5103:2: ( ( RULE_ID ) )
            // InternalSms.g:5104:3: ( RULE_ID )
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_4_0()); 
            // InternalSms.g:5105:3: ( RULE_ID )
            // InternalSms.g:5106:4: RULE_ID
            {
             before(grammarAccess.getSAssociationAccess().getTypeSRootTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAssociationAccess().getTypeSRootTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSAssociationAccess().getTypeSRootTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__TypeAssignment_4"


    // $ANTLR start "rule__SAssociation__MultiplicityAssignment_5"
    // InternalSms.g:5117:1: rule__SAssociation__MultiplicityAssignment_5 : ( ruleSMultiplicity ) ;
    public final void rule__SAssociation__MultiplicityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5121:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:5122:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:5122:2: ( ruleSMultiplicity )
            // InternalSms.g:5123:3: ruleSMultiplicity
            {
             before(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSAssociationAccess().getMultiplicitySMultiplicityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAssociation__MultiplicityAssignment_5"


    // $ANTLR start "rule__SAttribute__DetailAssignment_0_1"
    // InternalSms.g:5132:1: rule__SAttribute__DetailAssignment_0_1 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5136:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:5137:2: ( ( 'detail' ) )
            {
            // InternalSms.g:5137:2: ( ( 'detail' ) )
            // InternalSms.g:5138:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 
            // InternalSms.g:5139:3: ( 'detail' )
            // InternalSms.g:5140:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_0_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSms.g:5151:1: rule__SAttribute__DeductionRuleAssignment_0_2 : ( ruleSMemberDeductionRule ) ;
    public final void rule__SAttribute__DeductionRuleAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5155:1: ( ( ruleSMemberDeductionRule ) )
            // InternalSms.g:5156:2: ( ruleSMemberDeductionRule )
            {
            // InternalSms.g:5156:2: ( ruleSMemberDeductionRule )
            // InternalSms.g:5157:3: ruleSMemberDeductionRule
            {
             before(grammarAccess.getSAttributeAccess().getDeductionRuleSMemberDeductionRuleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSMemberDeductionRule();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getDeductionRuleSMemberDeductionRuleParserRuleCall_0_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SAttribute__DetailAssignment_1_0"
    // InternalSms.g:5166:1: rule__SAttribute__DetailAssignment_1_0 : ( ( 'detail' ) ) ;
    public final void rule__SAttribute__DetailAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5170:1: ( ( ( 'detail' ) ) )
            // InternalSms.g:5171:2: ( ( 'detail' ) )
            {
            // InternalSms.g:5171:2: ( ( 'detail' ) )
            // InternalSms.g:5172:3: ( 'detail' )
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_0_0()); 
            // InternalSms.g:5173:3: ( 'detail' )
            // InternalSms.g:5174:4: 'detail'
            {
             before(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_0_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getDetailDetailKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__DetailAssignment_1_0"


    // $ANTLR start "rule__SAttribute__NameAssignment_1_1"
    // InternalSms.g:5185:1: rule__SAttribute__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__SAttribute__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5189:1: ( ( RULE_ID ) )
            // InternalSms.g:5190:2: ( RULE_ID )
            {
            // InternalSms.g:5190:2: ( RULE_ID )
            // InternalSms.g:5191:3: RULE_ID
            {
             before(grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__NameAssignment_1_1"


    // $ANTLR start "rule__SAttribute__TypeAssignment_1_3"
    // InternalSms.g:5200:1: rule__SAttribute__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__SAttribute__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5204:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:5205:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:5205:2: ( ( RULE_ID ) )
            // InternalSms.g:5206:3: ( RULE_ID )
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_1_3_0()); 
            // InternalSms.g:5207:3: ( RULE_ID )
            // InternalSms.g:5208:4: RULE_ID
            {
             before(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getSAttributeAccess().getTypeSSimpleTypeCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__TypeAssignment_1_3"


    // $ANTLR start "rule__SAttribute__MultiplicityAssignment_1_4"
    // InternalSms.g:5219:1: rule__SAttribute__MultiplicityAssignment_1_4 : ( ruleSMultiplicity ) ;
    public final void rule__SAttribute__MultiplicityAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5223:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:5224:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:5224:2: ( ruleSMultiplicity )
            // InternalSms.g:5225:3: ruleSMultiplicity
            {
             before(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSAttributeAccess().getMultiplicitySMultiplicityParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__MultiplicityAssignment_1_4"


    // $ANTLR start "rule__SAttribute__KeyAssignment_1_5"
    // InternalSms.g:5234:1: rule__SAttribute__KeyAssignment_1_5 : ( ( 'key' ) ) ;
    public final void rule__SAttribute__KeyAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5238:1: ( ( ( 'key' ) ) )
            // InternalSms.g:5239:2: ( ( 'key' ) )
            {
            // InternalSms.g:5239:2: ( ( 'key' ) )
            // InternalSms.g:5240:3: ( 'key' )
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_1_5_0()); 
            // InternalSms.g:5241:3: ( 'key' )
            // InternalSms.g:5242:4: 'key'
            {
             before(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_1_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_1_5_0()); 

            }

             after(grammarAccess.getSAttributeAccess().getKeyKeyKeyword_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SAttribute__KeyAssignment_1_5"


    // $ANTLR start "rule__SQuery__NameAssignment_0"
    // InternalSms.g:5253:1: rule__SQuery__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SQuery__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5257:1: ( ( RULE_ID ) )
            // InternalSms.g:5258:2: ( RULE_ID )
            {
            // InternalSms.g:5258:2: ( RULE_ID )
            // InternalSms.g:5259:3: RULE_ID
            {
             before(grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__NameAssignment_0"


    // $ANTLR start "rule__SQuery__ParametersAssignment_2_0"
    // InternalSms.g:5268:1: rule__SQuery__ParametersAssignment_2_0 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5272:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:5273:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:5273:2: ( ruleSQueryParameter )
            // InternalSms.g:5274:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_2_0"


    // $ANTLR start "rule__SQuery__ParametersAssignment_2_1_1"
    // InternalSms.g:5283:1: rule__SQuery__ParametersAssignment_2_1_1 : ( ruleSQueryParameter ) ;
    public final void rule__SQuery__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5287:1: ( ( ruleSQueryParameter ) )
            // InternalSms.g:5288:2: ( ruleSQueryParameter )
            {
            // InternalSms.g:5288:2: ( ruleSQueryParameter )
            // InternalSms.g:5289:3: ruleSQueryParameter
            {
             before(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSQueryParameter();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getParametersSQueryParameterParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__SQuery__TypeAssignment_5"
    // InternalSms.g:5298:1: rule__SQuery__TypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__SQuery__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5302:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:5303:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:5303:2: ( ( RULE_ID ) )
            // InternalSms.g:5304:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_5_0()); 
            // InternalSms.g:5305:3: ( RULE_ID )
            // InternalSms.g:5306:4: RULE_ID
            {
             before(grammarAccess.getSQueryAccess().getTypeSTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryAccess().getTypeSTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSQueryAccess().getTypeSTypeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__TypeAssignment_5"


    // $ANTLR start "rule__SQuery__MultiplicityAssignment_6"
    // InternalSms.g:5317:1: rule__SQuery__MultiplicityAssignment_6 : ( ruleSMultiplicity ) ;
    public final void rule__SQuery__MultiplicityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5321:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:5322:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:5322:2: ( ruleSMultiplicity )
            // InternalSms.g:5323:3: ruleSMultiplicity
            {
             before(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getMultiplicitySMultiplicityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__MultiplicityAssignment_6"


    // $ANTLR start "rule__SQuery__ReturnsAssignment_7_1"
    // InternalSms.g:5332:1: rule__SQuery__ReturnsAssignment_7_1 : ( ruleSExpression ) ;
    public final void rule__SQuery__ReturnsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5336:1: ( ( ruleSExpression ) )
            // InternalSms.g:5337:2: ( ruleSExpression )
            {
            // InternalSms.g:5337:2: ( ruleSExpression )
            // InternalSms.g:5338:3: ruleSExpression
            {
             before(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSExpression();

            state._fsp--;

             after(grammarAccess.getSQueryAccess().getReturnsSExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQuery__ReturnsAssignment_7_1"


    // $ANTLR start "rule__SQueryParameter__NameAssignment_0"
    // InternalSms.g:5347:1: rule__SQueryParameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SQueryParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5351:1: ( ( RULE_ID ) )
            // InternalSms.g:5352:2: ( RULE_ID )
            {
            // InternalSms.g:5352:2: ( RULE_ID )
            // InternalSms.g:5353:3: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__NameAssignment_0"


    // $ANTLR start "rule__SQueryParameter__TypeAssignment_2"
    // InternalSms.g:5362:1: rule__SQueryParameter__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SQueryParameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5366:1: ( ( ( RULE_ID ) ) )
            // InternalSms.g:5367:2: ( ( RULE_ID ) )
            {
            // InternalSms.g:5367:2: ( ( RULE_ID ) )
            // InternalSms.g:5368:3: ( RULE_ID )
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_0()); 
            // InternalSms.g:5369:3: ( RULE_ID )
            // InternalSms.g:5370:4: RULE_ID
            {
             before(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSQueryParameterAccess().getTypeSTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__TypeAssignment_2"


    // $ANTLR start "rule__SQueryParameter__MultiplicityAssignment_3"
    // InternalSms.g:5381:1: rule__SQueryParameter__MultiplicityAssignment_3 : ( ruleSMultiplicity ) ;
    public final void rule__SQueryParameter__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5385:1: ( ( ruleSMultiplicity ) )
            // InternalSms.g:5386:2: ( ruleSMultiplicity )
            {
            // InternalSms.g:5386:2: ( ruleSMultiplicity )
            // InternalSms.g:5387:3: ruleSMultiplicity
            {
             before(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSMultiplicity();

            state._fsp--;

             after(grammarAccess.getSQueryParameterAccess().getMultiplicitySMultiplicityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SQueryParameter__MultiplicityAssignment_3"


    // $ANTLR start "rule__SExpression__ExprAssignment"
    // InternalSms.g:5396:1: rule__SExpression__ExprAssignment : ( RULE_STRING ) ;
    public final void rule__SExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5400:1: ( ( RULE_STRING ) )
            // InternalSms.g:5401:2: ( RULE_STRING )
            {
            // InternalSms.g:5401:2: ( RULE_STRING )
            // InternalSms.g:5402:3: RULE_STRING
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
    // InternalSms.g:5411:1: rule__SMultiplicity__MinOccursAssignment_1 : ( RULE_INT ) ;
    public final void rule__SMultiplicity__MinOccursAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5415:1: ( ( RULE_INT ) )
            // InternalSms.g:5416:2: ( RULE_INT )
            {
            // InternalSms.g:5416:2: ( RULE_INT )
            // InternalSms.g:5417:3: RULE_INT
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
    // InternalSms.g:5426:1: rule__SMultiplicity__MaxOccursAssignment_3 : ( ruleMULTIPLICITY ) ;
    public final void rule__SMultiplicity__MaxOccursAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSms.g:5430:1: ( ( ruleMULTIPLICITY ) )
            // InternalSms.g:5431:2: ( ruleMULTIPLICITY )
            {
            // InternalSms.g:5431:2: ( ruleMULTIPLICITY )
            // InternalSms.g:5432:3: ruleMULTIPLICITY
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040698410000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040698400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040698400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040699000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040698000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040208000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040698000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000008040B006820L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000008040A006822L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000006800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000408000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000060000002L});

}
