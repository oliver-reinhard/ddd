package com.mimacom.ddd.dm.dmx.ide.contentassist.antlr.internal;

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
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDmxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_STRING", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'*'", "'FALSE'", "'false'", "'NIL'", "'nil'", "'E'", "'e'", "'+'", "'-'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'..'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'text'", "':'", "';'", "'expr'", "'.'", "')'", "','", "'('", "'if'", "'then'", "'end'", "'else'", "'do'", "'for'", "'@before'", "'TRUE'", "'true'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=6;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_PLAIN_TEXT_END=9;
    public static final int RULE_ID=5;
    public static final int RULE_PLAIN_TEXT_START=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_NATURAL=4;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_PLAIN_TEXT=11;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_PLAIN_TEXT_MIDDLE=8;
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


        public InternalDmxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDmxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDmxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDmx.g"; }


    	private DmxGrammarAccess grammarAccess;

    	public void setGrammarAccess(DmxGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDmxModel"
    // InternalDmx.g:54:1: entryRuleDmxModel : ruleDmxModel EOF ;
    public final void entryRuleDmxModel() throws RecognitionException {
        try {
            // InternalDmx.g:55:1: ( ruleDmxModel EOF )
            // InternalDmx.g:56:1: ruleDmxModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDmxModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDmxModel"


    // $ANTLR start "ruleDmxModel"
    // InternalDmx.g:63:1: ruleDmxModel : ( ( rule__DmxModel__Group__0 ) ) ;
    public final void ruleDmxModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:67:2: ( ( ( rule__DmxModel__Group__0 ) ) )
            // InternalDmx.g:68:2: ( ( rule__DmxModel__Group__0 ) )
            {
            // InternalDmx.g:68:2: ( ( rule__DmxModel__Group__0 ) )
            // InternalDmx.g:69:3: ( rule__DmxModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup()); 
            }
            // InternalDmx.g:70:3: ( rule__DmxModel__Group__0 )
            // InternalDmx.g:70:4: rule__DmxModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getGroup()); 
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
    // $ANTLR end "ruleDmxModel"


    // $ANTLR start "entryRuleDRichText"
    // InternalDmx.g:79:1: entryRuleDRichText : ruleDRichText EOF ;
    public final void entryRuleDRichText() throws RecognitionException {
        try {
            // InternalDmx.g:80:1: ( ruleDRichText EOF )
            // InternalDmx.g:81:1: ruleDRichText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDRichText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDRichText"


    // $ANTLR start "ruleDRichText"
    // InternalDmx.g:88:1: ruleDRichText : ( ( rule__DRichText__Alternatives ) ) ;
    public final void ruleDRichText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:92:2: ( ( ( rule__DRichText__Alternatives ) ) )
            // InternalDmx.g:93:2: ( ( rule__DRichText__Alternatives ) )
            {
            // InternalDmx.g:93:2: ( ( rule__DRichText__Alternatives ) )
            // InternalDmx.g:94:3: ( rule__DRichText__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getAlternatives()); 
            }
            // InternalDmx.g:95:3: ( rule__DRichText__Alternatives )
            // InternalDmx.g:95:4: rule__DRichText__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDRichText"


    // $ANTLR start "entryRuleDTextOnly"
    // InternalDmx.g:104:1: entryRuleDTextOnly : ruleDTextOnly EOF ;
    public final void entryRuleDTextOnly() throws RecognitionException {
        try {
            // InternalDmx.g:105:1: ( ruleDTextOnly EOF )
            // InternalDmx.g:106:1: ruleDTextOnly EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextOnlyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDTextOnly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextOnlyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDTextOnly"


    // $ANTLR start "ruleDTextOnly"
    // InternalDmx.g:113:1: ruleDTextOnly : ( ( rule__DTextOnly__ValueAssignment ) ) ;
    public final void ruleDTextOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:117:2: ( ( ( rule__DTextOnly__ValueAssignment ) ) )
            // InternalDmx.g:118:2: ( ( rule__DTextOnly__ValueAssignment ) )
            {
            // InternalDmx.g:118:2: ( ( rule__DTextOnly__ValueAssignment ) )
            // InternalDmx.g:119:3: ( rule__DTextOnly__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextOnlyAccess().getValueAssignment()); 
            }
            // InternalDmx.g:120:3: ( rule__DTextOnly__ValueAssignment )
            // InternalDmx.g:120:4: rule__DTextOnly__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DTextOnly__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextOnlyAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDTextOnly"


    // $ANTLR start "entryRuleDTextStart"
    // InternalDmx.g:129:1: entryRuleDTextStart : ruleDTextStart EOF ;
    public final void entryRuleDTextStart() throws RecognitionException {
        try {
            // InternalDmx.g:130:1: ( ruleDTextStart EOF )
            // InternalDmx.g:131:1: ruleDTextStart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextStartRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDTextStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextStartRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDTextStart"


    // $ANTLR start "ruleDTextStart"
    // InternalDmx.g:138:1: ruleDTextStart : ( ( rule__DTextStart__ValueAssignment ) ) ;
    public final void ruleDTextStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:142:2: ( ( ( rule__DTextStart__ValueAssignment ) ) )
            // InternalDmx.g:143:2: ( ( rule__DTextStart__ValueAssignment ) )
            {
            // InternalDmx.g:143:2: ( ( rule__DTextStart__ValueAssignment ) )
            // InternalDmx.g:144:3: ( rule__DTextStart__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextStartAccess().getValueAssignment()); 
            }
            // InternalDmx.g:145:3: ( rule__DTextStart__ValueAssignment )
            // InternalDmx.g:145:4: rule__DTextStart__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DTextStart__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextStartAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDTextStart"


    // $ANTLR start "entryRuleDTextMiddle"
    // InternalDmx.g:154:1: entryRuleDTextMiddle : ruleDTextMiddle EOF ;
    public final void entryRuleDTextMiddle() throws RecognitionException {
        try {
            // InternalDmx.g:155:1: ( ruleDTextMiddle EOF )
            // InternalDmx.g:156:1: ruleDTextMiddle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextMiddleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDTextMiddle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextMiddleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDTextMiddle"


    // $ANTLR start "ruleDTextMiddle"
    // InternalDmx.g:163:1: ruleDTextMiddle : ( ( rule__DTextMiddle__ValueAssignment ) ) ;
    public final void ruleDTextMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:167:2: ( ( ( rule__DTextMiddle__ValueAssignment ) ) )
            // InternalDmx.g:168:2: ( ( rule__DTextMiddle__ValueAssignment ) )
            {
            // InternalDmx.g:168:2: ( ( rule__DTextMiddle__ValueAssignment ) )
            // InternalDmx.g:169:3: ( rule__DTextMiddle__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextMiddleAccess().getValueAssignment()); 
            }
            // InternalDmx.g:170:3: ( rule__DTextMiddle__ValueAssignment )
            // InternalDmx.g:170:4: rule__DTextMiddle__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DTextMiddle__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextMiddleAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDTextMiddle"


    // $ANTLR start "entryRuleDTextEnd"
    // InternalDmx.g:179:1: entryRuleDTextEnd : ruleDTextEnd EOF ;
    public final void entryRuleDTextEnd() throws RecognitionException {
        try {
            // InternalDmx.g:180:1: ( ruleDTextEnd EOF )
            // InternalDmx.g:181:1: ruleDTextEnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextEndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDTextEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextEndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDTextEnd"


    // $ANTLR start "ruleDTextEnd"
    // InternalDmx.g:188:1: ruleDTextEnd : ( ( rule__DTextEnd__ValueAssignment ) ) ;
    public final void ruleDTextEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:192:2: ( ( ( rule__DTextEnd__ValueAssignment ) ) )
            // InternalDmx.g:193:2: ( ( rule__DTextEnd__ValueAssignment ) )
            {
            // InternalDmx.g:193:2: ( ( rule__DTextEnd__ValueAssignment ) )
            // InternalDmx.g:194:3: ( rule__DTextEnd__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextEndAccess().getValueAssignment()); 
            }
            // InternalDmx.g:195:3: ( rule__DTextEnd__ValueAssignment )
            // InternalDmx.g:195:4: rule__DTextEnd__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DTextEnd__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextEndAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleDTextEnd"


    // $ANTLR start "entryRuleDExpression"
    // InternalDmx.g:204:1: entryRuleDExpression : ruleDExpression EOF ;
    public final void entryRuleDExpression() throws RecognitionException {
        try {
            // InternalDmx.g:205:1: ( ruleDExpression EOF )
            // InternalDmx.g:206:1: ruleDExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDExpression"


    // $ANTLR start "ruleDExpression"
    // InternalDmx.g:213:1: ruleDExpression : ( ruleDAssignment ) ;
    public final void ruleDExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:217:2: ( ( ruleDAssignment ) )
            // InternalDmx.g:218:2: ( ruleDAssignment )
            {
            // InternalDmx.g:218:2: ( ruleDAssignment )
            // InternalDmx.g:219:3: ruleDAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall()); 
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
    // $ANTLR end "ruleDExpression"


    // $ANTLR start "entryRuleDAssignment"
    // InternalDmx.g:229:1: entryRuleDAssignment : ruleDAssignment EOF ;
    public final void entryRuleDAssignment() throws RecognitionException {
        try {
            // InternalDmx.g:230:1: ( ruleDAssignment EOF )
            // InternalDmx.g:231:1: ruleDAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDAssignment"


    // $ANTLR start "ruleDAssignment"
    // InternalDmx.g:238:1: ruleDAssignment : ( ( rule__DAssignment__Alternatives ) ) ;
    public final void ruleDAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:242:2: ( ( ( rule__DAssignment__Alternatives ) ) )
            // InternalDmx.g:243:2: ( ( rule__DAssignment__Alternatives ) )
            {
            // InternalDmx.g:243:2: ( ( rule__DAssignment__Alternatives ) )
            // InternalDmx.g:244:3: ( rule__DAssignment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getAlternatives()); 
            }
            // InternalDmx.g:245:3: ( rule__DAssignment__Alternatives )
            // InternalDmx.g:245:4: rule__DAssignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DAssignment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalDmx.g:254:1: entryRuleOpSingleAssign : ruleOpSingleAssign EOF ;
    public final void entryRuleOpSingleAssign() throws RecognitionException {
        try {
            // InternalDmx.g:255:1: ( ruleOpSingleAssign EOF )
            // InternalDmx.g:256:1: ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpSingleAssignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalDmx.g:263:1: ruleOpSingleAssign : ( ':=' ) ;
    public final void ruleOpSingleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:267:2: ( ( ':=' ) )
            // InternalDmx.g:268:2: ( ':=' )
            {
            // InternalDmx.g:268:2: ( ':=' )
            // InternalDmx.g:269:3: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpSingleAssignAccess().getColonEqualsSignKeyword()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpSingleAssignAccess().getColonEqualsSignKeyword()); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleDOrExpression"
    // InternalDmx.g:279:1: entryRuleDOrExpression : ruleDOrExpression EOF ;
    public final void entryRuleDOrExpression() throws RecognitionException {
        try {
            // InternalDmx.g:280:1: ( ruleDOrExpression EOF )
            // InternalDmx.g:281:1: ruleDOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDOrExpression"


    // $ANTLR start "ruleDOrExpression"
    // InternalDmx.g:288:1: ruleDOrExpression : ( ( rule__DOrExpression__Group__0 ) ) ;
    public final void ruleDOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:292:2: ( ( ( rule__DOrExpression__Group__0 ) ) )
            // InternalDmx.g:293:2: ( ( rule__DOrExpression__Group__0 ) )
            {
            // InternalDmx.g:293:2: ( ( rule__DOrExpression__Group__0 ) )
            // InternalDmx.g:294:3: ( rule__DOrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:295:3: ( rule__DOrExpression__Group__0 )
            // InternalDmx.g:295:4: rule__DOrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDOrExpression"


    // $ANTLR start "entryRuleDAndExpression"
    // InternalDmx.g:304:1: entryRuleDAndExpression : ruleDAndExpression EOF ;
    public final void entryRuleDAndExpression() throws RecognitionException {
        try {
            // InternalDmx.g:305:1: ( ruleDAndExpression EOF )
            // InternalDmx.g:306:1: ruleDAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDAndExpression"


    // $ANTLR start "ruleDAndExpression"
    // InternalDmx.g:313:1: ruleDAndExpression : ( ( rule__DAndExpression__Group__0 ) ) ;
    public final void ruleDAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:317:2: ( ( ( rule__DAndExpression__Group__0 ) ) )
            // InternalDmx.g:318:2: ( ( rule__DAndExpression__Group__0 ) )
            {
            // InternalDmx.g:318:2: ( ( rule__DAndExpression__Group__0 ) )
            // InternalDmx.g:319:3: ( rule__DAndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:320:3: ( rule__DAndExpression__Group__0 )
            // InternalDmx.g:320:4: rule__DAndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDAndExpression"


    // $ANTLR start "entryRuleDEqualityExpression"
    // InternalDmx.g:329:1: entryRuleDEqualityExpression : ruleDEqualityExpression EOF ;
    public final void entryRuleDEqualityExpression() throws RecognitionException {
        try {
            // InternalDmx.g:330:1: ( ruleDEqualityExpression EOF )
            // InternalDmx.g:331:1: ruleDEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDEqualityExpression"


    // $ANTLR start "ruleDEqualityExpression"
    // InternalDmx.g:338:1: ruleDEqualityExpression : ( ( rule__DEqualityExpression__Group__0 ) ) ;
    public final void ruleDEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:342:2: ( ( ( rule__DEqualityExpression__Group__0 ) ) )
            // InternalDmx.g:343:2: ( ( rule__DEqualityExpression__Group__0 ) )
            {
            // InternalDmx.g:343:2: ( ( rule__DEqualityExpression__Group__0 ) )
            // InternalDmx.g:344:3: ( rule__DEqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:345:3: ( rule__DEqualityExpression__Group__0 )
            // InternalDmx.g:345:4: rule__DEqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDEqualityExpression"


    // $ANTLR start "entryRuleDRelationalExpression"
    // InternalDmx.g:354:1: entryRuleDRelationalExpression : ruleDRelationalExpression EOF ;
    public final void entryRuleDRelationalExpression() throws RecognitionException {
        try {
            // InternalDmx.g:355:1: ( ruleDRelationalExpression EOF )
            // InternalDmx.g:356:1: ruleDRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDRelationalExpression"


    // $ANTLR start "ruleDRelationalExpression"
    // InternalDmx.g:363:1: ruleDRelationalExpression : ( ( rule__DRelationalExpression__Group__0 ) ) ;
    public final void ruleDRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:367:2: ( ( ( rule__DRelationalExpression__Group__0 ) ) )
            // InternalDmx.g:368:2: ( ( rule__DRelationalExpression__Group__0 ) )
            {
            // InternalDmx.g:368:2: ( ( rule__DRelationalExpression__Group__0 ) )
            // InternalDmx.g:369:3: ( rule__DRelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:370:3: ( rule__DRelationalExpression__Group__0 )
            // InternalDmx.g:370:4: rule__DRelationalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalDmx.g:379:1: entryRuleOpInstanceOf : ruleOpInstanceOf EOF ;
    public final void entryRuleOpInstanceOf() throws RecognitionException {
        try {
            // InternalDmx.g:380:1: ( ruleOpInstanceOf EOF )
            // InternalDmx.g:381:1: ruleOpInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpInstanceOfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpInstanceOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpInstanceOfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpInstanceOf"


    // $ANTLR start "ruleOpInstanceOf"
    // InternalDmx.g:388:1: ruleOpInstanceOf : ( ( rule__OpInstanceOf__Alternatives ) ) ;
    public final void ruleOpInstanceOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:392:2: ( ( ( rule__OpInstanceOf__Alternatives ) ) )
            // InternalDmx.g:393:2: ( ( rule__OpInstanceOf__Alternatives ) )
            {
            // InternalDmx.g:393:2: ( ( rule__OpInstanceOf__Alternatives ) )
            // InternalDmx.g:394:3: ( rule__OpInstanceOf__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpInstanceOfAccess().getAlternatives()); 
            }
            // InternalDmx.g:395:3: ( rule__OpInstanceOf__Alternatives )
            // InternalDmx.g:395:4: rule__OpInstanceOf__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpInstanceOf__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpInstanceOfAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpInstanceOf"


    // $ANTLR start "entryRuleDOtherOperatorExpression"
    // InternalDmx.g:404:1: entryRuleDOtherOperatorExpression : ruleDOtherOperatorExpression EOF ;
    public final void entryRuleDOtherOperatorExpression() throws RecognitionException {
        try {
            // InternalDmx.g:405:1: ( ruleDOtherOperatorExpression EOF )
            // InternalDmx.g:406:1: ruleDOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDOtherOperatorExpression"


    // $ANTLR start "ruleDOtherOperatorExpression"
    // InternalDmx.g:413:1: ruleDOtherOperatorExpression : ( ( rule__DOtherOperatorExpression__Group__0 ) ) ;
    public final void ruleDOtherOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:417:2: ( ( ( rule__DOtherOperatorExpression__Group__0 ) ) )
            // InternalDmx.g:418:2: ( ( rule__DOtherOperatorExpression__Group__0 ) )
            {
            // InternalDmx.g:418:2: ( ( rule__DOtherOperatorExpression__Group__0 ) )
            // InternalDmx.g:419:3: ( rule__DOtherOperatorExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:420:3: ( rule__DOtherOperatorExpression__Group__0 )
            // InternalDmx.g:420:4: rule__DOtherOperatorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDOtherOperatorExpression"


    // $ANTLR start "entryRuleDAdditiveExpression"
    // InternalDmx.g:429:1: entryRuleDAdditiveExpression : ruleDAdditiveExpression EOF ;
    public final void entryRuleDAdditiveExpression() throws RecognitionException {
        try {
            // InternalDmx.g:430:1: ( ruleDAdditiveExpression EOF )
            // InternalDmx.g:431:1: ruleDAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDAdditiveExpression"


    // $ANTLR start "ruleDAdditiveExpression"
    // InternalDmx.g:438:1: ruleDAdditiveExpression : ( ( rule__DAdditiveExpression__Group__0 ) ) ;
    public final void ruleDAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:442:2: ( ( ( rule__DAdditiveExpression__Group__0 ) ) )
            // InternalDmx.g:443:2: ( ( rule__DAdditiveExpression__Group__0 ) )
            {
            // InternalDmx.g:443:2: ( ( rule__DAdditiveExpression__Group__0 ) )
            // InternalDmx.g:444:3: ( rule__DAdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:445:3: ( rule__DAdditiveExpression__Group__0 )
            // InternalDmx.g:445:4: rule__DAdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDAdditiveExpression"


    // $ANTLR start "entryRuleDMultiplicativeExpression"
    // InternalDmx.g:454:1: entryRuleDMultiplicativeExpression : ruleDMultiplicativeExpression EOF ;
    public final void entryRuleDMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalDmx.g:455:1: ( ruleDMultiplicativeExpression EOF )
            // InternalDmx.g:456:1: ruleDMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDMultiplicativeExpression"


    // $ANTLR start "ruleDMultiplicativeExpression"
    // InternalDmx.g:463:1: ruleDMultiplicativeExpression : ( ( rule__DMultiplicativeExpression__Group__0 ) ) ;
    public final void ruleDMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:467:2: ( ( ( rule__DMultiplicativeExpression__Group__0 ) ) )
            // InternalDmx.g:468:2: ( ( rule__DMultiplicativeExpression__Group__0 ) )
            {
            // InternalDmx.g:468:2: ( ( rule__DMultiplicativeExpression__Group__0 ) )
            // InternalDmx.g:469:3: ( rule__DMultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:470:3: ( rule__DMultiplicativeExpression__Group__0 )
            // InternalDmx.g:470:4: rule__DMultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDMultiplicativeExpression"


    // $ANTLR start "entryRuleDUnaryOperation"
    // InternalDmx.g:479:1: entryRuleDUnaryOperation : ruleDUnaryOperation EOF ;
    public final void entryRuleDUnaryOperation() throws RecognitionException {
        try {
            // InternalDmx.g:480:1: ( ruleDUnaryOperation EOF )
            // InternalDmx.g:481:1: ruleDUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDUnaryOperation"


    // $ANTLR start "ruleDUnaryOperation"
    // InternalDmx.g:488:1: ruleDUnaryOperation : ( ( rule__DUnaryOperation__Alternatives ) ) ;
    public final void ruleDUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:492:2: ( ( ( rule__DUnaryOperation__Alternatives ) ) )
            // InternalDmx.g:493:2: ( ( rule__DUnaryOperation__Alternatives ) )
            {
            // InternalDmx.g:493:2: ( ( rule__DUnaryOperation__Alternatives ) )
            // InternalDmx.g:494:3: ( rule__DUnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getAlternatives()); 
            }
            // InternalDmx.g:495:3: ( rule__DUnaryOperation__Alternatives )
            // InternalDmx.g:495:4: rule__DUnaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDUnaryOperation"


    // $ANTLR start "entryRuleDCastExpression"
    // InternalDmx.g:504:1: entryRuleDCastExpression : ruleDCastExpression EOF ;
    public final void entryRuleDCastExpression() throws RecognitionException {
        try {
            // InternalDmx.g:505:1: ( ruleDCastExpression EOF )
            // InternalDmx.g:506:1: ruleDCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDCastExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDCastExpression"


    // $ANTLR start "ruleDCastExpression"
    // InternalDmx.g:513:1: ruleDCastExpression : ( ( rule__DCastExpression__Group__0 ) ) ;
    public final void ruleDCastExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:517:2: ( ( ( rule__DCastExpression__Group__0 ) ) )
            // InternalDmx.g:518:2: ( ( rule__DCastExpression__Group__0 ) )
            {
            // InternalDmx.g:518:2: ( ( rule__DCastExpression__Group__0 ) )
            // InternalDmx.g:519:3: ( rule__DCastExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:520:3: ( rule__DCastExpression__Group__0 )
            // InternalDmx.g:520:4: rule__DCastExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDCastExpression"


    // $ANTLR start "entryRuleOpCast"
    // InternalDmx.g:529:1: entryRuleOpCast : ruleOpCast EOF ;
    public final void entryRuleOpCast() throws RecognitionException {
        try {
            // InternalDmx.g:530:1: ( ruleOpCast EOF )
            // InternalDmx.g:531:1: ruleOpCast EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCastRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpCast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCastRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpCast"


    // $ANTLR start "ruleOpCast"
    // InternalDmx.g:538:1: ruleOpCast : ( ( rule__OpCast__Alternatives ) ) ;
    public final void ruleOpCast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:542:2: ( ( ( rule__OpCast__Alternatives ) ) )
            // InternalDmx.g:543:2: ( ( rule__OpCast__Alternatives ) )
            {
            // InternalDmx.g:543:2: ( ( rule__OpCast__Alternatives ) )
            // InternalDmx.g:544:3: ( rule__OpCast__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCastAccess().getAlternatives()); 
            }
            // InternalDmx.g:545:3: ( rule__OpCast__Alternatives )
            // InternalDmx.g:545:4: rule__OpCast__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpCast__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCastAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpCast"


    // $ANTLR start "entryRuleDTypedMemberReference"
    // InternalDmx.g:554:1: entryRuleDTypedMemberReference : ruleDTypedMemberReference EOF ;
    public final void entryRuleDTypedMemberReference() throws RecognitionException {
        try {
            // InternalDmx.g:555:1: ( ruleDTypedMemberReference EOF )
            // InternalDmx.g:556:1: ruleDTypedMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDTypedMemberReference"


    // $ANTLR start "ruleDTypedMemberReference"
    // InternalDmx.g:563:1: ruleDTypedMemberReference : ( ( rule__DTypedMemberReference__Group__0 ) ) ;
    public final void ruleDTypedMemberReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:567:2: ( ( ( rule__DTypedMemberReference__Group__0 ) ) )
            // InternalDmx.g:568:2: ( ( rule__DTypedMemberReference__Group__0 ) )
            {
            // InternalDmx.g:568:2: ( ( rule__DTypedMemberReference__Group__0 ) )
            // InternalDmx.g:569:3: ( rule__DTypedMemberReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup()); 
            }
            // InternalDmx.g:570:3: ( rule__DTypedMemberReference__Group__0 )
            // InternalDmx.g:570:4: rule__DTypedMemberReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleDTypedMemberReference"


    // $ANTLR start "entryRuleDPrimaryExpression"
    // InternalDmx.g:579:1: entryRuleDPrimaryExpression : ruleDPrimaryExpression EOF ;
    public final void entryRuleDPrimaryExpression() throws RecognitionException {
        try {
            // InternalDmx.g:580:1: ( ruleDPrimaryExpression EOF )
            // InternalDmx.g:581:1: ruleDPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDPrimaryExpression"


    // $ANTLR start "ruleDPrimaryExpression"
    // InternalDmx.g:588:1: ruleDPrimaryExpression : ( ( rule__DPrimaryExpression__Alternatives ) ) ;
    public final void ruleDPrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:592:2: ( ( ( rule__DPrimaryExpression__Alternatives ) ) )
            // InternalDmx.g:593:2: ( ( rule__DPrimaryExpression__Alternatives ) )
            {
            // InternalDmx.g:593:2: ( ( rule__DPrimaryExpression__Alternatives ) )
            // InternalDmx.g:594:3: ( rule__DPrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalDmx.g:595:3: ( rule__DPrimaryExpression__Alternatives )
            // InternalDmx.g:595:4: rule__DPrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DPrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDPrimaryExpression"


    // $ANTLR start "entryRuleDLiteralExpression"
    // InternalDmx.g:604:1: entryRuleDLiteralExpression : ruleDLiteralExpression EOF ;
    public final void entryRuleDLiteralExpression() throws RecognitionException {
        try {
            // InternalDmx.g:605:1: ( ruleDLiteralExpression EOF )
            // InternalDmx.g:606:1: ruleDLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDLiteralExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDLiteralExpression"


    // $ANTLR start "ruleDLiteralExpression"
    // InternalDmx.g:613:1: ruleDLiteralExpression : ( ( rule__DLiteralExpression__Alternatives ) ) ;
    public final void ruleDLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:617:2: ( ( ( rule__DLiteralExpression__Alternatives ) ) )
            // InternalDmx.g:618:2: ( ( rule__DLiteralExpression__Alternatives ) )
            {
            // InternalDmx.g:618:2: ( ( rule__DLiteralExpression__Alternatives ) )
            // InternalDmx.g:619:3: ( rule__DLiteralExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDLiteralExpressionAccess().getAlternatives()); 
            }
            // InternalDmx.g:620:3: ( rule__DLiteralExpression__Alternatives )
            // InternalDmx.g:620:4: rule__DLiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DLiteralExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDLiteralExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDLiteralExpression"


    // $ANTLR start "entryRuleDSelfExpression"
    // InternalDmx.g:629:1: entryRuleDSelfExpression : ruleDSelfExpression EOF ;
    public final void entryRuleDSelfExpression() throws RecognitionException {
        try {
            // InternalDmx.g:630:1: ( ruleDSelfExpression EOF )
            // InternalDmx.g:631:1: ruleDSelfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDSelfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDSelfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDSelfExpression"


    // $ANTLR start "ruleDSelfExpression"
    // InternalDmx.g:638:1: ruleDSelfExpression : ( ( rule__DSelfExpression__Group__0 ) ) ;
    public final void ruleDSelfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:642:2: ( ( ( rule__DSelfExpression__Group__0 ) ) )
            // InternalDmx.g:643:2: ( ( rule__DSelfExpression__Group__0 ) )
            {
            // InternalDmx.g:643:2: ( ( rule__DSelfExpression__Group__0 ) )
            // InternalDmx.g:644:3: ( rule__DSelfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:645:3: ( rule__DSelfExpression__Group__0 )
            // InternalDmx.g:645:4: rule__DSelfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSelfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDSelfExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDSelfExpression"


    // $ANTLR start "entryRuleDReturnExpression"
    // InternalDmx.g:654:1: entryRuleDReturnExpression : ruleDReturnExpression EOF ;
    public final void entryRuleDReturnExpression() throws RecognitionException {
        try {
            // InternalDmx.g:655:1: ( ruleDReturnExpression EOF )
            // InternalDmx.g:656:1: ruleDReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDReturnExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDReturnExpression"


    // $ANTLR start "ruleDReturnExpression"
    // InternalDmx.g:663:1: ruleDReturnExpression : ( ( rule__DReturnExpression__Group__0 ) ) ;
    public final void ruleDReturnExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:667:2: ( ( ( rule__DReturnExpression__Group__0 ) ) )
            // InternalDmx.g:668:2: ( ( rule__DReturnExpression__Group__0 ) )
            {
            // InternalDmx.g:668:2: ( ( rule__DReturnExpression__Group__0 ) )
            // InternalDmx.g:669:3: ( rule__DReturnExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:670:3: ( rule__DReturnExpression__Group__0 )
            // InternalDmx.g:670:4: rule__DReturnExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DReturnExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDReturnExpression"


    // $ANTLR start "entryRuleDRaiseExpression"
    // InternalDmx.g:679:1: entryRuleDRaiseExpression : ruleDRaiseExpression EOF ;
    public final void entryRuleDRaiseExpression() throws RecognitionException {
        try {
            // InternalDmx.g:680:1: ( ruleDRaiseExpression EOF )
            // InternalDmx.g:681:1: ruleDRaiseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDRaiseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDRaiseExpression"


    // $ANTLR start "ruleDRaiseExpression"
    // InternalDmx.g:688:1: ruleDRaiseExpression : ( ( rule__DRaiseExpression__Group__0 ) ) ;
    public final void ruleDRaiseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:692:2: ( ( ( rule__DRaiseExpression__Group__0 ) ) )
            // InternalDmx.g:693:2: ( ( rule__DRaiseExpression__Group__0 ) )
            {
            // InternalDmx.g:693:2: ( ( rule__DRaiseExpression__Group__0 ) )
            // InternalDmx.g:694:3: ( rule__DRaiseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:695:3: ( rule__DRaiseExpression__Group__0 )
            // InternalDmx.g:695:4: rule__DRaiseExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDRaiseExpression"


    // $ANTLR start "entryRuleDParenthesizedExpression"
    // InternalDmx.g:704:1: entryRuleDParenthesizedExpression : ruleDParenthesizedExpression EOF ;
    public final void entryRuleDParenthesizedExpression() throws RecognitionException {
        try {
            // InternalDmx.g:705:1: ( ruleDParenthesizedExpression EOF )
            // InternalDmx.g:706:1: ruleDParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDParenthesizedExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDParenthesizedExpression"


    // $ANTLR start "ruleDParenthesizedExpression"
    // InternalDmx.g:713:1: ruleDParenthesizedExpression : ( ( rule__DParenthesizedExpression__Group__0 ) ) ;
    public final void ruleDParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:717:2: ( ( ( rule__DParenthesizedExpression__Group__0 ) ) )
            // InternalDmx.g:718:2: ( ( rule__DParenthesizedExpression__Group__0 ) )
            {
            // InternalDmx.g:718:2: ( ( rule__DParenthesizedExpression__Group__0 ) )
            // InternalDmx.g:719:3: ( rule__DParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:720:3: ( rule__DParenthesizedExpression__Group__0 )
            // InternalDmx.g:720:4: rule__DParenthesizedExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DParenthesizedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDParenthesizedExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDParenthesizedExpression"


    // $ANTLR start "entryRuleDFunctionCall"
    // InternalDmx.g:729:1: entryRuleDFunctionCall : ruleDFunctionCall EOF ;
    public final void entryRuleDFunctionCall() throws RecognitionException {
        try {
            // InternalDmx.g:730:1: ( ruleDFunctionCall EOF )
            // InternalDmx.g:731:1: ruleDFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDFunctionCall"


    // $ANTLR start "ruleDFunctionCall"
    // InternalDmx.g:738:1: ruleDFunctionCall : ( ( rule__DFunctionCall__Group__0 ) ) ;
    public final void ruleDFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:742:2: ( ( ( rule__DFunctionCall__Group__0 ) ) )
            // InternalDmx.g:743:2: ( ( rule__DFunctionCall__Group__0 ) )
            {
            // InternalDmx.g:743:2: ( ( rule__DFunctionCall__Group__0 ) )
            // InternalDmx.g:744:3: ( rule__DFunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup()); 
            }
            // InternalDmx.g:745:3: ( rule__DFunctionCall__Group__0 )
            // InternalDmx.g:745:4: rule__DFunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getGroup()); 
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
    // $ANTLR end "ruleDFunctionCall"


    // $ANTLR start "entryRuleDConstructorCall"
    // InternalDmx.g:754:1: entryRuleDConstructorCall : ruleDConstructorCall EOF ;
    public final void entryRuleDConstructorCall() throws RecognitionException {
        try {
            // InternalDmx.g:755:1: ( ruleDConstructorCall EOF )
            // InternalDmx.g:756:1: ruleDConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDConstructorCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDConstructorCall"


    // $ANTLR start "ruleDConstructorCall"
    // InternalDmx.g:763:1: ruleDConstructorCall : ( ( rule__DConstructorCall__Group__0 ) ) ;
    public final void ruleDConstructorCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:767:2: ( ( ( rule__DConstructorCall__Group__0 ) ) )
            // InternalDmx.g:768:2: ( ( rule__DConstructorCall__Group__0 ) )
            {
            // InternalDmx.g:768:2: ( ( rule__DConstructorCall__Group__0 ) )
            // InternalDmx.g:769:3: ( rule__DConstructorCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup()); 
            }
            // InternalDmx.g:770:3: ( rule__DConstructorCall__Group__0 )
            // InternalDmx.g:770:4: rule__DConstructorCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getGroup()); 
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
    // $ANTLR end "ruleDConstructorCall"


    // $ANTLR start "entryRuleOpConstructor"
    // InternalDmx.g:779:1: entryRuleOpConstructor : ruleOpConstructor EOF ;
    public final void entryRuleOpConstructor() throws RecognitionException {
        try {
            // InternalDmx.g:780:1: ( ruleOpConstructor EOF )
            // InternalDmx.g:781:1: ruleOpConstructor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpConstructorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOpConstructor"


    // $ANTLR start "ruleOpConstructor"
    // InternalDmx.g:788:1: ruleOpConstructor : ( ( rule__OpConstructor__Alternatives ) ) ;
    public final void ruleOpConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:792:2: ( ( ( rule__OpConstructor__Alternatives ) ) )
            // InternalDmx.g:793:2: ( ( rule__OpConstructor__Alternatives ) )
            {
            // InternalDmx.g:793:2: ( ( rule__OpConstructor__Alternatives ) )
            // InternalDmx.g:794:3: ( rule__OpConstructor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpConstructorAccess().getAlternatives()); 
            }
            // InternalDmx.g:795:3: ( rule__OpConstructor__Alternatives )
            // InternalDmx.g:795:4: rule__OpConstructor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpConstructor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpConstructorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpConstructor"


    // $ANTLR start "entryRuleDContextReference"
    // InternalDmx.g:804:1: entryRuleDContextReference : ruleDContextReference EOF ;
    public final void entryRuleDContextReference() throws RecognitionException {
        try {
            // InternalDmx.g:805:1: ( ruleDContextReference EOF )
            // InternalDmx.g:806:1: ruleDContextReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDContextReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDContextReference"


    // $ANTLR start "ruleDContextReference"
    // InternalDmx.g:813:1: ruleDContextReference : ( ( rule__DContextReference__Group__0 ) ) ;
    public final void ruleDContextReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:817:2: ( ( ( rule__DContextReference__Group__0 ) ) )
            // InternalDmx.g:818:2: ( ( rule__DContextReference__Group__0 ) )
            {
            // InternalDmx.g:818:2: ( ( rule__DContextReference__Group__0 ) )
            // InternalDmx.g:819:3: ( rule__DContextReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getGroup()); 
            }
            // InternalDmx.g:820:3: ( rule__DContextReference__Group__0 )
            // InternalDmx.g:820:4: rule__DContextReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DContextReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleDContextReference"


    // $ANTLR start "entryRuleDIfExpression"
    // InternalDmx.g:829:1: entryRuleDIfExpression : ruleDIfExpression EOF ;
    public final void entryRuleDIfExpression() throws RecognitionException {
        try {
            // InternalDmx.g:830:1: ( ruleDIfExpression EOF )
            // InternalDmx.g:831:1: ruleDIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDIfExpression"


    // $ANTLR start "ruleDIfExpression"
    // InternalDmx.g:838:1: ruleDIfExpression : ( ( rule__DIfExpression__Group__0 ) ) ;
    public final void ruleDIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:842:2: ( ( ( rule__DIfExpression__Group__0 ) ) )
            // InternalDmx.g:843:2: ( ( rule__DIfExpression__Group__0 ) )
            {
            // InternalDmx.g:843:2: ( ( rule__DIfExpression__Group__0 ) )
            // InternalDmx.g:844:3: ( rule__DIfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:845:3: ( rule__DIfExpression__Group__0 )
            // InternalDmx.g:845:4: rule__DIfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDIfExpression"


    // $ANTLR start "entryRuleDForLoopExpression"
    // InternalDmx.g:854:1: entryRuleDForLoopExpression : ruleDForLoopExpression EOF ;
    public final void entryRuleDForLoopExpression() throws RecognitionException {
        try {
            // InternalDmx.g:855:1: ( ruleDForLoopExpression EOF )
            // InternalDmx.g:856:1: ruleDForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDForLoopExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDForLoopExpression"


    // $ANTLR start "ruleDForLoopExpression"
    // InternalDmx.g:863:1: ruleDForLoopExpression : ( ( rule__DForLoopExpression__Group__0 ) ) ;
    public final void ruleDForLoopExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:867:2: ( ( ( rule__DForLoopExpression__Group__0 ) ) )
            // InternalDmx.g:868:2: ( ( rule__DForLoopExpression__Group__0 ) )
            {
            // InternalDmx.g:868:2: ( ( rule__DForLoopExpression__Group__0 ) )
            // InternalDmx.g:869:3: ( rule__DForLoopExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup()); 
            }
            // InternalDmx.g:870:3: ( rule__DForLoopExpression__Group__0 )
            // InternalDmx.g:870:4: rule__DForLoopExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDForLoopExpression"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalDmx.g:879:1: entryRuleMULTIPLICITY : ruleMULTIPLICITY EOF ;
    public final void entryRuleMULTIPLICITY() throws RecognitionException {
        try {
            // InternalDmx.g:880:1: ( ruleMULTIPLICITY EOF )
            // InternalDmx.g:881:1: ruleMULTIPLICITY EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTIPLICITYRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMULTIPLICITY();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTIPLICITYRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:888:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:892:2: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // InternalDmx.g:893:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // InternalDmx.g:893:2: ( ( rule__MULTIPLICITY__Alternatives ) )
            // InternalDmx.g:894:3: ( rule__MULTIPLICITY__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            }
            // InternalDmx.g:895:3: ( rule__MULTIPLICITY__Alternatives )
            // InternalDmx.g:895:4: rule__MULTIPLICITY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MULTIPLICITY__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMULTIPLICITY"


    // $ANTLR start "entryRuleDBooleanLiteral"
    // InternalDmx.g:904:1: entryRuleDBooleanLiteral : ruleDBooleanLiteral EOF ;
    public final void entryRuleDBooleanLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:905:1: ( ruleDBooleanLiteral EOF )
            // InternalDmx.g:906:1: ruleDBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDBooleanLiteral"


    // $ANTLR start "ruleDBooleanLiteral"
    // InternalDmx.g:913:1: ruleDBooleanLiteral : ( ( rule__DBooleanLiteral__Group__0 ) ) ;
    public final void ruleDBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:917:2: ( ( ( rule__DBooleanLiteral__Group__0 ) ) )
            // InternalDmx.g:918:2: ( ( rule__DBooleanLiteral__Group__0 ) )
            {
            // InternalDmx.g:918:2: ( ( rule__DBooleanLiteral__Group__0 ) )
            // InternalDmx.g:919:3: ( rule__DBooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:920:3: ( rule__DBooleanLiteral__Group__0 )
            // InternalDmx.g:920:4: rule__DBooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DBooleanLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleDBooleanLiteral"


    // $ANTLR start "entryRuleDStringLiteral"
    // InternalDmx.g:929:1: entryRuleDStringLiteral : ruleDStringLiteral EOF ;
    public final void entryRuleDStringLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:930:1: ( ruleDStringLiteral EOF )
            // InternalDmx.g:931:1: ruleDStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDStringLiteral"


    // $ANTLR start "ruleDStringLiteral"
    // InternalDmx.g:938:1: ruleDStringLiteral : ( ( rule__DStringLiteral__Group__0 ) ) ;
    public final void ruleDStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:942:2: ( ( ( rule__DStringLiteral__Group__0 ) ) )
            // InternalDmx.g:943:2: ( ( rule__DStringLiteral__Group__0 ) )
            {
            // InternalDmx.g:943:2: ( ( rule__DStringLiteral__Group__0 ) )
            // InternalDmx.g:944:3: ( rule__DStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:945:3: ( rule__DStringLiteral__Group__0 )
            // InternalDmx.g:945:4: rule__DStringLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DStringLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDStringLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleDStringLiteral"


    // $ANTLR start "entryRuleDNaturalLiteral"
    // InternalDmx.g:954:1: entryRuleDNaturalLiteral : ruleDNaturalLiteral EOF ;
    public final void entryRuleDNaturalLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:955:1: ( ruleDNaturalLiteral EOF )
            // InternalDmx.g:956:1: ruleDNaturalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDNaturalLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNaturalLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDNaturalLiteral"


    // $ANTLR start "ruleDNaturalLiteral"
    // InternalDmx.g:963:1: ruleDNaturalLiteral : ( ( rule__DNaturalLiteral__Group__0 ) ) ;
    public final void ruleDNaturalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:967:2: ( ( ( rule__DNaturalLiteral__Group__0 ) ) )
            // InternalDmx.g:968:2: ( ( rule__DNaturalLiteral__Group__0 ) )
            {
            // InternalDmx.g:968:2: ( ( rule__DNaturalLiteral__Group__0 ) )
            // InternalDmx.g:969:3: ( rule__DNaturalLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:970:3: ( rule__DNaturalLiteral__Group__0 )
            // InternalDmx.g:970:4: rule__DNaturalLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DNaturalLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNaturalLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleDNaturalLiteral"


    // $ANTLR start "entryRuleDDecimalLiteral"
    // InternalDmx.g:979:1: entryRuleDDecimalLiteral : ruleDDecimalLiteral EOF ;
    public final void entryRuleDDecimalLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:980:1: ( ruleDDecimalLiteral EOF )
            // InternalDmx.g:981:1: ruleDDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDDecimalLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDDecimalLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDDecimalLiteral"


    // $ANTLR start "ruleDDecimalLiteral"
    // InternalDmx.g:988:1: ruleDDecimalLiteral : ( ( rule__DDecimalLiteral__Group__0 ) ) ;
    public final void ruleDDecimalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:992:2: ( ( ( rule__DDecimalLiteral__Group__0 ) ) )
            // InternalDmx.g:993:2: ( ( rule__DDecimalLiteral__Group__0 ) )
            {
            // InternalDmx.g:993:2: ( ( rule__DDecimalLiteral__Group__0 ) )
            // InternalDmx.g:994:3: ( rule__DDecimalLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:995:3: ( rule__DDecimalLiteral__Group__0 )
            // InternalDmx.g:995:4: rule__DDecimalLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DDecimalLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDDecimalLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleDDecimalLiteral"


    // $ANTLR start "entryRuleDNilLiteral"
    // InternalDmx.g:1004:1: entryRuleDNilLiteral : ruleDNilLiteral EOF ;
    public final void entryRuleDNilLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:1005:1: ( ruleDNilLiteral EOF )
            // InternalDmx.g:1006:1: ruleDNilLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDNilLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNilLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDNilLiteral"


    // $ANTLR start "ruleDNilLiteral"
    // InternalDmx.g:1013:1: ruleDNilLiteral : ( ( rule__DNilLiteral__Group__0 ) ) ;
    public final void ruleDNilLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1017:2: ( ( ( rule__DNilLiteral__Group__0 ) ) )
            // InternalDmx.g:1018:2: ( ( rule__DNilLiteral__Group__0 ) )
            {
            // InternalDmx.g:1018:2: ( ( rule__DNilLiteral__Group__0 ) )
            // InternalDmx.g:1019:3: ( rule__DNilLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:1020:3: ( rule__DNilLiteral__Group__0 )
            // InternalDmx.g:1020:4: rule__DNilLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DNilLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNilLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleDNilLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalDmx.g:1029:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalDmx.g:1030:1: ( ruleDECIMAL EOF )
            // InternalDmx.g:1031:1: ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalDmx.g:1038:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1042:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalDmx.g:1043:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalDmx.g:1043:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalDmx.g:1044:3: ( rule__DECIMAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup()); 
            }
            // InternalDmx.g:1045:3: ( rule__DECIMAL__Group__0 )
            // InternalDmx.g:1045:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getGroup()); 
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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleDQualifiedName"
    // InternalDmx.g:1054:1: entryRuleDQualifiedName : ruleDQualifiedName EOF ;
    public final void entryRuleDQualifiedName() throws RecognitionException {
        try {
            // InternalDmx.g:1055:1: ( ruleDQualifiedName EOF )
            // InternalDmx.g:1056:1: ruleDQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDQualifiedName"


    // $ANTLR start "ruleDQualifiedName"
    // InternalDmx.g:1063:1: ruleDQualifiedName : ( ( rule__DQualifiedName__Group__0 ) ) ;
    public final void ruleDQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1067:2: ( ( ( rule__DQualifiedName__Group__0 ) ) )
            // InternalDmx.g:1068:2: ( ( rule__DQualifiedName__Group__0 ) )
            {
            // InternalDmx.g:1068:2: ( ( rule__DQualifiedName__Group__0 ) )
            // InternalDmx.g:1069:3: ( rule__DQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getGroup()); 
            }
            // InternalDmx.g:1070:3: ( rule__DQualifiedName__Group__0 )
            // InternalDmx.g:1070:4: rule__DQualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleOpOr"
    // InternalDmx.g:1079:1: ruleOpOr : ( ( rule__OpOr__Alternatives ) ) ;
    public final void ruleOpOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1083:1: ( ( ( rule__OpOr__Alternatives ) ) )
            // InternalDmx.g:1084:2: ( ( rule__OpOr__Alternatives ) )
            {
            // InternalDmx.g:1084:2: ( ( rule__OpOr__Alternatives ) )
            // InternalDmx.g:1085:3: ( rule__OpOr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOrAccess().getAlternatives()); 
            }
            // InternalDmx.g:1086:3: ( rule__OpOr__Alternatives )
            // InternalDmx.g:1086:4: rule__OpOr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpOr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpOrAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "ruleOpAnd"
    // InternalDmx.g:1095:1: ruleOpAnd : ( ( rule__OpAnd__Alternatives ) ) ;
    public final void ruleOpAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1099:1: ( ( ( rule__OpAnd__Alternatives ) ) )
            // InternalDmx.g:1100:2: ( ( rule__OpAnd__Alternatives ) )
            {
            // InternalDmx.g:1100:2: ( ( rule__OpAnd__Alternatives ) )
            // InternalDmx.g:1101:3: ( rule__OpAnd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAndAccess().getAlternatives()); 
            }
            // InternalDmx.g:1102:3: ( rule__OpAnd__Alternatives )
            // InternalDmx.g:1102:4: rule__OpAnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpAnd__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAndAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "ruleOpEquality"
    // InternalDmx.g:1111:1: ruleOpEquality : ( ( rule__OpEquality__Alternatives ) ) ;
    public final void ruleOpEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1115:1: ( ( ( rule__OpEquality__Alternatives ) ) )
            // InternalDmx.g:1116:2: ( ( rule__OpEquality__Alternatives ) )
            {
            // InternalDmx.g:1116:2: ( ( rule__OpEquality__Alternatives ) )
            // InternalDmx.g:1117:3: ( rule__OpEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpEqualityAccess().getAlternatives()); 
            }
            // InternalDmx.g:1118:3: ( rule__OpEquality__Alternatives )
            // InternalDmx.g:1118:4: rule__OpEquality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpEquality__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpEqualityAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "ruleOpCompare"
    // InternalDmx.g:1127:1: ruleOpCompare : ( ( rule__OpCompare__Alternatives ) ) ;
    public final void ruleOpCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1131:1: ( ( ( rule__OpCompare__Alternatives ) ) )
            // InternalDmx.g:1132:2: ( ( rule__OpCompare__Alternatives ) )
            {
            // InternalDmx.g:1132:2: ( ( rule__OpCompare__Alternatives ) )
            // InternalDmx.g:1133:3: ( rule__OpCompare__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getAlternatives()); 
            }
            // InternalDmx.g:1134:3: ( rule__OpCompare__Alternatives )
            // InternalDmx.g:1134:4: rule__OpCompare__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpCompare__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpCompareAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "ruleOpOther"
    // InternalDmx.g:1143:1: ruleOpOther : ( ( rule__OpOther__Alternatives ) ) ;
    public final void ruleOpOther() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1147:1: ( ( ( rule__OpOther__Alternatives ) ) )
            // InternalDmx.g:1148:2: ( ( rule__OpOther__Alternatives ) )
            {
            // InternalDmx.g:1148:2: ( ( rule__OpOther__Alternatives ) )
            // InternalDmx.g:1149:3: ( rule__OpOther__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOtherAccess().getAlternatives()); 
            }
            // InternalDmx.g:1150:3: ( rule__OpOther__Alternatives )
            // InternalDmx.g:1150:4: rule__OpOther__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpOther__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpOtherAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "ruleOpAdd"
    // InternalDmx.g:1159:1: ruleOpAdd : ( ( rule__OpAdd__Alternatives ) ) ;
    public final void ruleOpAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1163:1: ( ( ( rule__OpAdd__Alternatives ) ) )
            // InternalDmx.g:1164:2: ( ( rule__OpAdd__Alternatives ) )
            {
            // InternalDmx.g:1164:2: ( ( rule__OpAdd__Alternatives ) )
            // InternalDmx.g:1165:3: ( rule__OpAdd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAddAccess().getAlternatives()); 
            }
            // InternalDmx.g:1166:3: ( rule__OpAdd__Alternatives )
            // InternalDmx.g:1166:4: rule__OpAdd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpAdd__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpAddAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "ruleOpMulti"
    // InternalDmx.g:1175:1: ruleOpMulti : ( ( rule__OpMulti__Alternatives ) ) ;
    public final void ruleOpMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1179:1: ( ( ( rule__OpMulti__Alternatives ) ) )
            // InternalDmx.g:1180:2: ( ( rule__OpMulti__Alternatives ) )
            {
            // InternalDmx.g:1180:2: ( ( rule__OpMulti__Alternatives ) )
            // InternalDmx.g:1181:3: ( rule__OpMulti__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpMultiAccess().getAlternatives()); 
            }
            // InternalDmx.g:1182:3: ( rule__OpMulti__Alternatives )
            // InternalDmx.g:1182:4: rule__OpMulti__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpMulti__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpMultiAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "ruleOpUnary"
    // InternalDmx.g:1191:1: ruleOpUnary : ( ( rule__OpUnary__Alternatives ) ) ;
    public final void ruleOpUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1195:1: ( ( ( rule__OpUnary__Alternatives ) ) )
            // InternalDmx.g:1196:2: ( ( rule__OpUnary__Alternatives ) )
            {
            // InternalDmx.g:1196:2: ( ( rule__OpUnary__Alternatives ) )
            // InternalDmx.g:1197:3: ( rule__OpUnary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpUnaryAccess().getAlternatives()); 
            }
            // InternalDmx.g:1198:3: ( rule__OpUnary__Alternatives )
            // InternalDmx.g:1198:4: rule__OpUnary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpUnary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOpUnaryAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "rule__DRichText__Alternatives"
    // InternalDmx.g:1206:1: rule__DRichText__Alternatives : ( ( ( rule__DRichText__ElementsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) );
    public final void rule__DRichText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1210:1: ( ( ( rule__DRichText__ElementsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_PLAIN_TEXT_START) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDmx.g:1211:2: ( ( rule__DRichText__ElementsAssignment_0 ) )
                    {
                    // InternalDmx.g:1211:2: ( ( rule__DRichText__ElementsAssignment_0 ) )
                    // InternalDmx.g:1212:3: ( rule__DRichText__ElementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getElementsAssignment_0()); 
                    }
                    // InternalDmx.g:1213:3: ( rule__DRichText__ElementsAssignment_0 )
                    // InternalDmx.g:1213:4: rule__DRichText__ElementsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DRichText__ElementsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRichTextAccess().getElementsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1217:2: ( ( rule__DRichText__Group_1__0 ) )
                    {
                    // InternalDmx.g:1217:2: ( ( rule__DRichText__Group_1__0 ) )
                    // InternalDmx.g:1218:3: ( rule__DRichText__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getGroup_1()); 
                    }
                    // InternalDmx.g:1219:3: ( rule__DRichText__Group_1__0 )
                    // InternalDmx.g:1219:4: rule__DRichText__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DRichText__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRichTextAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__DRichText__Alternatives"


    // $ANTLR start "rule__DAssignment__Alternatives"
    // InternalDmx.g:1227:1: rule__DAssignment__Alternatives : ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) );
    public final void rule__DAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1231:1: ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_PLAIN_TEXT_MIDDLE && LA2_1<=RULE_PLAIN_TEXT_END)||(LA2_1>=17 && LA2_1<=20)||LA2_1==29||(LA2_1>=36 && LA2_1<=58)||LA2_1==64||(LA2_1>=66 && LA2_1<=69)||(LA2_1>=71 && LA2_1<=74)||LA2_1==76) ) {
                    alt2=2;
                }
                else if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_NATURAL||LA2_0==RULE_STRING||(LA2_0>=21 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=33)||(LA2_0>=36 && LA2_0<=37)||(LA2_0>=59 && LA2_0<=61)||(LA2_0>=69 && LA2_0<=70)||LA2_0==75||(LA2_0>=77 && LA2_0<=78)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDmx.g:1232:2: ( ( rule__DAssignment__Group_0__0 ) )
                    {
                    // InternalDmx.g:1232:2: ( ( rule__DAssignment__Group_0__0 ) )
                    // InternalDmx.g:1233:3: ( rule__DAssignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDAssignmentAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1234:3: ( rule__DAssignment__Group_0__0 )
                    // InternalDmx.g:1234:4: rule__DAssignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DAssignment__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDAssignmentAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1238:2: ( ruleDOrExpression )
                    {
                    // InternalDmx.g:1238:2: ( ruleDOrExpression )
                    // InternalDmx.g:1239:3: ruleDOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDAssignmentAccess().getDOrExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDOrExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDAssignmentAccess().getDOrExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__DAssignment__Alternatives"


    // $ANTLR start "rule__DRelationalExpression__Alternatives_1"
    // InternalDmx.g:1248:1: rule__DRelationalExpression__Alternatives_1 : ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) );
    public final void rule__DRelationalExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1252:1: ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=47 && LA3_0<=52)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDmx.g:1253:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1253:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    // InternalDmx.g:1254:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1255:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    // InternalDmx.g:1255:4: rule__DRelationalExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DRelationalExpression__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1259:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1259:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    // InternalDmx.g:1260:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1261:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    // InternalDmx.g:1261:4: rule__DRelationalExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DRelationalExpression__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__DRelationalExpression__Alternatives_1"


    // $ANTLR start "rule__OpInstanceOf__Alternatives"
    // InternalDmx.g:1269:1: rule__OpInstanceOf__Alternatives : ( ( 'ISA' ) | ( 'isa' ) );
    public final void rule__OpInstanceOf__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1273:1: ( ( 'ISA' ) | ( 'isa' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDmx.g:1274:2: ( 'ISA' )
                    {
                    // InternalDmx.g:1274:2: ( 'ISA' )
                    // InternalDmx.g:1275:3: 'ISA'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpInstanceOfAccess().getISAKeyword_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpInstanceOfAccess().getISAKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1280:2: ( 'isa' )
                    {
                    // InternalDmx.g:1280:2: ( 'isa' )
                    // InternalDmx.g:1281:3: 'isa'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpInstanceOfAccess().getIsaKeyword_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpInstanceOfAccess().getIsaKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpInstanceOf__Alternatives"


    // $ANTLR start "rule__DUnaryOperation__Alternatives"
    // InternalDmx.g:1290:1: rule__DUnaryOperation__Alternatives : ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) );
    public final void rule__DUnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1294:1: ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=36 && LA5_0<=37)||(LA5_0>=59 && LA5_0<=61)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_NATURAL && LA5_0<=RULE_ID)||LA5_0==RULE_STRING||(LA5_0>=21 && LA5_0<=28)||(LA5_0>=30 && LA5_0<=33)||(LA5_0>=69 && LA5_0<=70)||LA5_0==75||(LA5_0>=77 && LA5_0<=78)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDmx.g:1295:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    {
                    // InternalDmx.g:1295:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    // InternalDmx.g:1296:3: ( rule__DUnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1297:3: ( rule__DUnaryOperation__Group_0__0 )
                    // InternalDmx.g:1297:4: rule__DUnaryOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DUnaryOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDUnaryOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1301:2: ( ruleDCastExpression )
                    {
                    // InternalDmx.g:1301:2: ( ruleDCastExpression )
                    // InternalDmx.g:1302:3: ruleDCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDUnaryOperationAccess().getDCastExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDCastExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDUnaryOperationAccess().getDCastExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__DUnaryOperation__Alternatives"


    // $ANTLR start "rule__OpCast__Alternatives"
    // InternalDmx.g:1311:1: rule__OpCast__Alternatives : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__OpCast__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1315:1: ( ( 'AS' ) | ( 'as' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDmx.g:1316:2: ( 'AS' )
                    {
                    // InternalDmx.g:1316:2: ( 'AS' )
                    // InternalDmx.g:1317:3: 'AS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCastAccess().getASKeyword_0()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCastAccess().getASKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1322:2: ( 'as' )
                    {
                    // InternalDmx.g:1322:2: ( 'as' )
                    // InternalDmx.g:1323:3: 'as'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCastAccess().getAsKeyword_1()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCastAccess().getAsKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpCast__Alternatives"


    // $ANTLR start "rule__DTypedMemberReference__Alternatives_1"
    // InternalDmx.g:1332:1: rule__DTypedMemberReference__Alternatives_1 : ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) );
    public final void rule__DTypedMemberReference__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1336:1: ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||(LA7_2>=RULE_PLAIN_TEXT_MIDDLE && LA7_2<=RULE_PLAIN_TEXT_END)||(LA7_2>=17 && LA7_2<=20)||LA7_2==29||(LA7_2>=36 && LA7_2<=58)||LA7_2==64||(LA7_2>=66 && LA7_2<=69)||(LA7_2>=71 && LA7_2<=74)||LA7_2==76) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==16) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDmx.g:1337:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1337:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    // InternalDmx.g:1338:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1339:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    // InternalDmx.g:1339:4: rule__DTypedMemberReference__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1343:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1343:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    // InternalDmx.g:1344:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1345:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    // InternalDmx.g:1345:4: rule__DTypedMemberReference__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__DTypedMemberReference__Alternatives_1"


    // $ANTLR start "rule__DTypedMemberReference__Alternatives_1_1_2"
    // InternalDmx.g:1353:1: rule__DTypedMemberReference__Alternatives_1_1_2 : ( ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) ) | ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) ) );
    public final void rule__DTypedMemberReference__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1357:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) ) | ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==69) ) {
                alt8=1;
            }
            else if ( (LA8_0==76) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDmx.g:1358:2: ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) )
                    {
                    // InternalDmx.g:1358:2: ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) )
                    // InternalDmx.g:1359:3: ( rule__DTypedMemberReference__Group_1_1_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0()); 
                    }
                    // InternalDmx.g:1360:3: ( rule__DTypedMemberReference__Group_1_1_2_0__0 )
                    // InternalDmx.g:1360:4: rule__DTypedMemberReference__Group_1_1_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_1_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1364:2: ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) )
                    {
                    // InternalDmx.g:1364:2: ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) )
                    // InternalDmx.g:1365:3: ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeAssignment_1_1_2_1()); 
                    }
                    // InternalDmx.g:1366:3: ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 )
                    // InternalDmx.g:1366:4: rule__DTypedMemberReference__BeforeAssignment_1_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__BeforeAssignment_1_1_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDTypedMemberReferenceAccess().getBeforeAssignment_1_1_2_1()); 
                    }

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
    // $ANTLR end "rule__DTypedMemberReference__Alternatives_1_1_2"


    // $ANTLR start "rule__DPrimaryExpression__Alternatives"
    // InternalDmx.g:1374:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );
    public final void rule__DPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1378:1: ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) )
            int alt9=10;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalDmx.g:1379:2: ( ruleDLiteralExpression )
                    {
                    // InternalDmx.g:1379:2: ( ruleDLiteralExpression )
                    // InternalDmx.g:1380:3: ruleDLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDLiteralExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDLiteralExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1385:2: ( ruleDSelfExpression )
                    {
                    // InternalDmx.g:1385:2: ( ruleDSelfExpression )
                    // InternalDmx.g:1386:3: ruleDSelfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDSelfExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDSelfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDSelfExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1391:2: ( ruleDReturnExpression )
                    {
                    // InternalDmx.g:1391:2: ( ruleDReturnExpression )
                    // InternalDmx.g:1392:3: ruleDReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDReturnExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDReturnExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDReturnExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1397:2: ( ruleDRaiseExpression )
                    {
                    // InternalDmx.g:1397:2: ( ruleDRaiseExpression )
                    // InternalDmx.g:1398:3: ruleDRaiseExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDRaiseExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDRaiseExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDRaiseExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1403:2: ( ruleDParenthesizedExpression )
                    {
                    // InternalDmx.g:1403:2: ( ruleDParenthesizedExpression )
                    // InternalDmx.g:1404:3: ruleDParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDParenthesizedExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDParenthesizedExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:1409:2: ( ruleDFunctionCall )
                    {
                    // InternalDmx.g:1409:2: ( ruleDFunctionCall )
                    // InternalDmx.g:1410:3: ruleDFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDFunctionCallParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDFunctionCallParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDmx.g:1415:2: ( ruleDConstructorCall )
                    {
                    // InternalDmx.g:1415:2: ( ruleDConstructorCall )
                    // InternalDmx.g:1416:3: ruleDConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDConstructorCallParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDConstructorCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDConstructorCallParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDmx.g:1421:2: ( ruleDContextReference )
                    {
                    // InternalDmx.g:1421:2: ( ruleDContextReference )
                    // InternalDmx.g:1422:3: ruleDContextReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDContextReferenceParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDContextReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDContextReferenceParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDmx.g:1427:2: ( ruleDIfExpression )
                    {
                    // InternalDmx.g:1427:2: ( ruleDIfExpression )
                    // InternalDmx.g:1428:3: ruleDIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDIfExpressionParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDIfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDIfExpressionParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDmx.g:1433:2: ( ( ruleDForLoopExpression ) )
                    {
                    // InternalDmx.g:1433:2: ( ( ruleDForLoopExpression ) )
                    // InternalDmx.g:1434:3: ( ruleDForLoopExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9()); 
                    }
                    // InternalDmx.g:1435:3: ( ruleDForLoopExpression )
                    // InternalDmx.g:1435:4: ruleDForLoopExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleDForLoopExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9()); 
                    }

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
    // $ANTLR end "rule__DPrimaryExpression__Alternatives"


    // $ANTLR start "rule__DLiteralExpression__Alternatives"
    // InternalDmx.g:1443:1: rule__DLiteralExpression__Alternatives : ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) );
    public final void rule__DLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1447:1: ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 77:
            case 78:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==66) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==RULE_ID) ) {
                        alt10=3;
                    }
                    else if ( (LA10_5==RULE_NATURAL) ) {
                        alt10=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA10_3==EOF||(LA10_3>=RULE_PLAIN_TEXT_MIDDLE && LA10_3<=RULE_PLAIN_TEXT_END)||(LA10_3>=17 && LA10_3<=20)||LA10_3==29||(LA10_3>=36 && LA10_3<=58)||LA10_3==64||(LA10_3>=67 && LA10_3<=68)||(LA10_3>=71 && LA10_3<=74)) ) {
                    alt10=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDmx.g:1448:2: ( ruleDBooleanLiteral )
                    {
                    // InternalDmx.g:1448:2: ( ruleDBooleanLiteral )
                    // InternalDmx.g:1449:3: ruleDBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDLiteralExpressionAccess().getDBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDLiteralExpressionAccess().getDBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1454:2: ( ruleDStringLiteral )
                    {
                    // InternalDmx.g:1454:2: ( ruleDStringLiteral )
                    // InternalDmx.g:1455:3: ruleDStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDLiteralExpressionAccess().getDStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDLiteralExpressionAccess().getDStringLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1460:2: ( ruleDNaturalLiteral )
                    {
                    // InternalDmx.g:1460:2: ( ruleDNaturalLiteral )
                    // InternalDmx.g:1461:3: ruleDNaturalLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDLiteralExpressionAccess().getDNaturalLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDNaturalLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDLiteralExpressionAccess().getDNaturalLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1466:2: ( ruleDDecimalLiteral )
                    {
                    // InternalDmx.g:1466:2: ( ruleDDecimalLiteral )
                    // InternalDmx.g:1467:3: ruleDDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDLiteralExpressionAccess().getDDecimalLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDLiteralExpressionAccess().getDDecimalLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1472:2: ( ruleDNilLiteral )
                    {
                    // InternalDmx.g:1472:2: ( ruleDNilLiteral )
                    // InternalDmx.g:1473:3: ruleDNilLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDLiteralExpressionAccess().getDNilLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDNilLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDLiteralExpressionAccess().getDNilLiteralParserRuleCall_4()); 
                    }

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
    // $ANTLR end "rule__DLiteralExpression__Alternatives"


    // $ANTLR start "rule__DSelfExpression__Alternatives_1"
    // InternalDmx.g:1482:1: rule__DSelfExpression__Alternatives_1 : ( ( 'SELF' ) | ( 'self' ) );
    public final void rule__DSelfExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1486:1: ( ( 'SELF' ) | ( 'self' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDmx.g:1487:2: ( 'SELF' )
                    {
                    // InternalDmx.g:1487:2: ( 'SELF' )
                    // InternalDmx.g:1488:3: 'SELF'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1493:2: ( 'self' )
                    {
                    // InternalDmx.g:1493:2: ( 'self' )
                    // InternalDmx.g:1494:3: 'self'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__DSelfExpression__Alternatives_1"


    // $ANTLR start "rule__DReturnExpression__Alternatives_1"
    // InternalDmx.g:1503:1: rule__DReturnExpression__Alternatives_1 : ( ( 'RETURN' ) | ( 'return' ) );
    public final void rule__DReturnExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1507:1: ( ( 'RETURN' ) | ( 'return' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDmx.g:1508:2: ( 'RETURN' )
                    {
                    // InternalDmx.g:1508:2: ( 'RETURN' )
                    // InternalDmx.g:1509:3: 'RETURN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1514:2: ( 'return' )
                    {
                    // InternalDmx.g:1514:2: ( 'return' )
                    // InternalDmx.g:1515:3: 'return'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__DReturnExpression__Alternatives_1"


    // $ANTLR start "rule__DRaiseExpression__Alternatives_1"
    // InternalDmx.g:1524:1: rule__DRaiseExpression__Alternatives_1 : ( ( 'RAISE' ) | ( 'raise' ) );
    public final void rule__DRaiseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1528:1: ( ( 'RAISE' ) | ( 'raise' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDmx.g:1529:2: ( 'RAISE' )
                    {
                    // InternalDmx.g:1529:2: ( 'RAISE' )
                    // InternalDmx.g:1530:3: 'RAISE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1535:2: ( 'raise' )
                    {
                    // InternalDmx.g:1535:2: ( 'raise' )
                    // InternalDmx.g:1536:3: 'raise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__DRaiseExpression__Alternatives_1"


    // $ANTLR start "rule__OpConstructor__Alternatives"
    // InternalDmx.g:1545:1: rule__OpConstructor__Alternatives : ( ( 'NEW' ) | ( 'new' ) );
    public final void rule__OpConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1549:1: ( ( 'NEW' ) | ( 'new' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDmx.g:1550:2: ( 'NEW' )
                    {
                    // InternalDmx.g:1550:2: ( 'NEW' )
                    // InternalDmx.g:1551:3: 'NEW'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpConstructorAccess().getNEWKeyword_0()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpConstructorAccess().getNEWKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1556:2: ( 'new' )
                    {
                    // InternalDmx.g:1556:2: ( 'new' )
                    // InternalDmx.g:1557:3: 'new'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpConstructorAccess().getNewKeyword_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpConstructorAccess().getNewKeyword_1()); 
                    }

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
    // $ANTLR end "rule__OpConstructor__Alternatives"


    // $ANTLR start "rule__MULTIPLICITY__Alternatives"
    // InternalDmx.g:1566:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_NATURAL ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1570:1: ( ( RULE_NATURAL ) | ( '*' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_NATURAL) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDmx.g:1571:2: ( RULE_NATURAL )
                    {
                    // InternalDmx.g:1571:2: ( RULE_NATURAL )
                    // InternalDmx.g:1572:3: RULE_NATURAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMULTIPLICITYAccess().getNATURALTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMULTIPLICITYAccess().getNATURALTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1577:2: ( '*' )
                    {
                    // InternalDmx.g:1577:2: ( '*' )
                    // InternalDmx.g:1578:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    }

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


    // $ANTLR start "rule__DBooleanLiteral__Alternatives_1"
    // InternalDmx.g:1587:1: rule__DBooleanLiteral__Alternatives_1 : ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) );
    public final void rule__DBooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1591:1: ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt16=1;
                }
                break;
            case 78:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 31:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDmx.g:1592:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    {
                    // InternalDmx.g:1592:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    // InternalDmx.g:1593:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0()); 
                    }
                    // InternalDmx.g:1594:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    // InternalDmx.g:1594:4: rule__DBooleanLiteral__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBooleanLiteral__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1598:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    {
                    // InternalDmx.g:1598:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    // InternalDmx.g:1599:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1()); 
                    }
                    // InternalDmx.g:1600:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    // InternalDmx.g:1600:4: rule__DBooleanLiteral__ValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DBooleanLiteral__ValueAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1604:2: ( 'FALSE' )
                    {
                    // InternalDmx.g:1604:2: ( 'FALSE' )
                    // InternalDmx.g:1605:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1610:2: ( 'false' )
                    {
                    // InternalDmx.g:1610:2: ( 'false' )
                    // InternalDmx.g:1611:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3()); 
                    }

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
    // $ANTLR end "rule__DBooleanLiteral__Alternatives_1"


    // $ANTLR start "rule__DNilLiteral__Alternatives_1"
    // InternalDmx.g:1620:1: rule__DNilLiteral__Alternatives_1 : ( ( 'NIL' ) | ( 'nil' ) );
    public final void rule__DNilLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1624:1: ( ( 'NIL' ) | ( 'nil' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDmx.g:1625:2: ( 'NIL' )
                    {
                    // InternalDmx.g:1625:2: ( 'NIL' )
                    // InternalDmx.g:1626:3: 'NIL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1631:2: ( 'nil' )
                    {
                    // InternalDmx.g:1631:2: ( 'nil' )
                    // InternalDmx.g:1632:3: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getNilKeyword_1_1()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDNilLiteralAccess().getNilKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__DNilLiteral__Alternatives_1"


    // $ANTLR start "rule__DECIMAL__Alternatives_3_0"
    // InternalDmx.g:1641:1: rule__DECIMAL__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__DECIMAL__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1645:1: ( ( 'E' ) | ( 'e' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDmx.g:1646:2: ( 'E' )
                    {
                    // InternalDmx.g:1646:2: ( 'E' )
                    // InternalDmx.g:1647:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1652:2: ( 'e' )
                    {
                    // InternalDmx.g:1652:2: ( 'e' )
                    // InternalDmx.g:1653:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_1()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getEKeyword_3_0_1()); 
                    }

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
    // $ANTLR end "rule__DECIMAL__Alternatives_3_0"


    // $ANTLR start "rule__DECIMAL__Alternatives_3_1"
    // InternalDmx.g:1662:1: rule__DECIMAL__Alternatives_3_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__DECIMAL__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1666:1: ( ( '+' ) | ( '-' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDmx.g:1667:2: ( '+' )
                    {
                    // InternalDmx.g:1667:2: ( '+' )
                    // InternalDmx.g:1668:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1673:2: ( '-' )
                    {
                    // InternalDmx.g:1673:2: ( '-' )
                    // InternalDmx.g:1674:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_3_1_1()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_3_1_1()); 
                    }

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
    // $ANTLR end "rule__DECIMAL__Alternatives_3_1"


    // $ANTLR start "rule__OpOr__Alternatives"
    // InternalDmx.g:1683:1: rule__OpOr__Alternatives : ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1687:1: ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDmx.g:1688:2: ( ( 'OR' ) )
                    {
                    // InternalDmx.g:1688:2: ( ( 'OR' ) )
                    // InternalDmx.g:1689:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1690:3: ( 'OR' )
                    // InternalDmx.g:1690:4: 'OR'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1694:2: ( ( 'or' ) )
                    {
                    // InternalDmx.g:1694:2: ( ( 'or' ) )
                    // InternalDmx.g:1695:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1696:3: ( 'or' )
                    // InternalDmx.g:1696:4: 'or'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1700:2: ( ( 'XOR' ) )
                    {
                    // InternalDmx.g:1700:2: ( ( 'XOR' ) )
                    // InternalDmx.g:1701:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1702:3: ( 'XOR' )
                    // InternalDmx.g:1702:4: 'XOR'
                    {
                    match(input,40,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1706:2: ( ( 'xor' ) )
                    {
                    // InternalDmx.g:1706:2: ( ( 'xor' ) )
                    // InternalDmx.g:1707:3: ( 'xor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1708:3: ( 'xor' )
                    // InternalDmx.g:1708:4: 'xor'
                    {
                    match(input,41,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__OpOr__Alternatives"


    // $ANTLR start "rule__OpAnd__Alternatives"
    // InternalDmx.g:1716:1: rule__OpAnd__Alternatives : ( ( ( 'AND' ) ) | ( ( 'and' ) ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1720:1: ( ( ( 'AND' ) ) | ( ( 'and' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            else if ( (LA21_0==43) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDmx.g:1721:2: ( ( 'AND' ) )
                    {
                    // InternalDmx.g:1721:2: ( ( 'AND' ) )
                    // InternalDmx.g:1722:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1723:3: ( 'AND' )
                    // InternalDmx.g:1723:4: 'AND'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1727:2: ( ( 'and' ) )
                    {
                    // InternalDmx.g:1727:2: ( ( 'and' ) )
                    // InternalDmx.g:1728:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1729:3: ( 'and' )
                    // InternalDmx.g:1729:4: 'and'
                    {
                    match(input,43,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__OpAnd__Alternatives"


    // $ANTLR start "rule__OpEquality__Alternatives"
    // InternalDmx.g:1737:1: rule__OpEquality__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1741:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt22=1;
                }
                break;
            case 45:
                {
                alt22=2;
                }
                break;
            case 46:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDmx.g:1742:2: ( ( '=' ) )
                    {
                    // InternalDmx.g:1742:2: ( ( '=' ) )
                    // InternalDmx.g:1743:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1744:3: ( '=' )
                    // InternalDmx.g:1744:4: '='
                    {
                    match(input,44,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1748:2: ( ( '!=' ) )
                    {
                    // InternalDmx.g:1748:2: ( ( '!=' ) )
                    // InternalDmx.g:1749:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1750:3: ( '!=' )
                    // InternalDmx.g:1750:4: '!='
                    {
                    match(input,45,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1754:2: ( ( '<>' ) )
                    {
                    // InternalDmx.g:1754:2: ( ( '<>' ) )
                    // InternalDmx.g:1755:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1756:3: ( '<>' )
                    // InternalDmx.g:1756:4: '<>'
                    {
                    match(input,46,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__OpEquality__Alternatives"


    // $ANTLR start "rule__OpCompare__Alternatives"
    // InternalDmx.g:1764:1: rule__OpCompare__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1768:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 49:
                {
                alt23=3;
                }
                break;
            case 50:
                {
                alt23=4;
                }
                break;
            case 51:
                {
                alt23=5;
                }
                break;
            case 52:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDmx.g:1769:2: ( ( '<' ) )
                    {
                    // InternalDmx.g:1769:2: ( ( '<' ) )
                    // InternalDmx.g:1770:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1771:3: ( '<' )
                    // InternalDmx.g:1771:4: '<'
                    {
                    match(input,47,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1775:2: ( ( '<=' ) )
                    {
                    // InternalDmx.g:1775:2: ( ( '<=' ) )
                    // InternalDmx.g:1776:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1777:3: ( '<=' )
                    // InternalDmx.g:1777:4: '<='
                    {
                    match(input,48,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1781:2: ( ( '\\u2264' ) )
                    {
                    // InternalDmx.g:1781:2: ( ( '\\u2264' ) )
                    // InternalDmx.g:1782:3: ( '\\u2264' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1783:3: ( '\\u2264' )
                    // InternalDmx.g:1783:4: '\\u2264'
                    {
                    match(input,49,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1787:2: ( ( '>=' ) )
                    {
                    // InternalDmx.g:1787:2: ( ( '>=' ) )
                    // InternalDmx.g:1788:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1789:3: ( '>=' )
                    // InternalDmx.g:1789:4: '>='
                    {
                    match(input,50,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1793:2: ( ( '\\u2265' ) )
                    {
                    // InternalDmx.g:1793:2: ( ( '\\u2265' ) )
                    // InternalDmx.g:1794:3: ( '\\u2265' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1795:3: ( '\\u2265' )
                    // InternalDmx.g:1795:4: '\\u2265'
                    {
                    match(input,51,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:1799:2: ( ( '>' ) )
                    {
                    // InternalDmx.g:1799:2: ( ( '>' ) )
                    // InternalDmx.g:1800:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5()); 
                    }
                    // InternalDmx.g:1801:3: ( '>' )
                    // InternalDmx.g:1801:4: '>'
                    {
                    match(input,52,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5()); 
                    }

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
    // $ANTLR end "rule__OpCompare__Alternatives"


    // $ANTLR start "rule__OpOther__Alternatives"
    // InternalDmx.g:1809:1: rule__OpOther__Alternatives : ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__OpOther__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1813:1: ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case 55:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDmx.g:1814:2: ( ( '..' ) )
                    {
                    // InternalDmx.g:1814:2: ( ( '..' ) )
                    // InternalDmx.g:1815:3: ( '..' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1816:3: ( '..' )
                    // InternalDmx.g:1816:4: '..'
                    {
                    match(input,53,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1820:2: ( ( '->' ) )
                    {
                    // InternalDmx.g:1820:2: ( ( '->' ) )
                    // InternalDmx.g:1821:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1822:3: ( '->' )
                    // InternalDmx.g:1822:4: '->'
                    {
                    match(input,54,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1826:2: ( ( '=>' ) )
                    {
                    // InternalDmx.g:1826:2: ( ( '=>' ) )
                    // InternalDmx.g:1827:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1828:3: ( '=>' )
                    // InternalDmx.g:1828:4: '=>'
                    {
                    match(input,55,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__OpOther__Alternatives"


    // $ANTLR start "rule__OpAdd__Alternatives"
    // InternalDmx.g:1836:1: rule__OpAdd__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1840:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDmx.g:1841:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1841:2: ( ( '+' ) )
                    // InternalDmx.g:1842:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1843:3: ( '+' )
                    // InternalDmx.g:1843:4: '+'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1847:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1847:2: ( ( '-' ) )
                    // InternalDmx.g:1848:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1849:3: ( '-' )
                    // InternalDmx.g:1849:4: '-'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__OpAdd__Alternatives"


    // $ANTLR start "rule__OpMulti__Alternatives"
    // InternalDmx.g:1857:1: rule__OpMulti__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1861:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt26=1;
                }
                break;
            case 56:
                {
                alt26=2;
                }
                break;
            case 57:
                {
                alt26=3;
                }
                break;
            case 58:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDmx.g:1862:2: ( ( '*' ) )
                    {
                    // InternalDmx.g:1862:2: ( ( '*' ) )
                    // InternalDmx.g:1863:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1864:3: ( '*' )
                    // InternalDmx.g:1864:4: '*'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1868:2: ( ( '/' ) )
                    {
                    // InternalDmx.g:1868:2: ( ( '/' ) )
                    // InternalDmx.g:1869:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1870:3: ( '/' )
                    // InternalDmx.g:1870:4: '/'
                    {
                    match(input,56,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1874:2: ( ( '**' ) )
                    {
                    // InternalDmx.g:1874:2: ( ( '**' ) )
                    // InternalDmx.g:1875:3: ( '**' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1876:3: ( '**' )
                    // InternalDmx.g:1876:4: '**'
                    {
                    match(input,57,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1880:2: ( ( '%' ) )
                    {
                    // InternalDmx.g:1880:2: ( ( '%' ) )
                    // InternalDmx.g:1881:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1882:3: ( '%' )
                    // InternalDmx.g:1882:4: '%'
                    {
                    match(input,58,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3()); 
                    }

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
    // $ANTLR end "rule__OpMulti__Alternatives"


    // $ANTLR start "rule__OpUnary__Alternatives"
    // InternalDmx.g:1890:1: rule__OpUnary__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1894:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt27=1;
                }
                break;
            case 37:
                {
                alt27=2;
                }
                break;
            case 59:
                {
                alt27=3;
                }
                break;
            case 60:
                {
                alt27=4;
                }
                break;
            case 61:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDmx.g:1895:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1895:2: ( ( '+' ) )
                    // InternalDmx.g:1896:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1897:3: ( '+' )
                    // InternalDmx.g:1897:4: '+'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1901:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1901:2: ( ( '-' ) )
                    // InternalDmx.g:1902:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1903:3: ( '-' )
                    // InternalDmx.g:1903:4: '-'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1907:2: ( ( '!' ) )
                    {
                    // InternalDmx.g:1907:2: ( ( '!' ) )
                    // InternalDmx.g:1908:3: ( '!' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1909:3: ( '!' )
                    // InternalDmx.g:1909:4: '!'
                    {
                    match(input,59,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1913:2: ( ( 'NOT' ) )
                    {
                    // InternalDmx.g:1913:2: ( ( 'NOT' ) )
                    // InternalDmx.g:1914:3: ( 'NOT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1915:3: ( 'NOT' )
                    // InternalDmx.g:1915:4: 'NOT'
                    {
                    match(input,60,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1919:2: ( ( 'not' ) )
                    {
                    // InternalDmx.g:1919:2: ( ( 'not' ) )
                    // InternalDmx.g:1920:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1921:3: ( 'not' )
                    // InternalDmx.g:1921:4: 'not'
                    {
                    match(input,61,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__OpUnary__Alternatives"


    // $ANTLR start "rule__DmxModel__Group__0"
    // InternalDmx.g:1929:1: rule__DmxModel__Group__0 : rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 ;
    public final void rule__DmxModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1933:1: ( rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 )
            // InternalDmx.g:1934:2: rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DmxModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group__0"


    // $ANTLR start "rule__DmxModel__Group__0__Impl"
    // InternalDmx.g:1941:1: rule__DmxModel__Group__0__Impl : ( () ) ;
    public final void rule__DmxModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1945:1: ( ( () ) )
            // InternalDmx.g:1946:1: ( () )
            {
            // InternalDmx.g:1946:1: ( () )
            // InternalDmx.g:1947:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getDmxModelAction_0()); 
            }
            // InternalDmx.g:1948:2: ()
            // InternalDmx.g:1948:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getDmxModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group__0__Impl"


    // $ANTLR start "rule__DmxModel__Group__1"
    // InternalDmx.g:1956:1: rule__DmxModel__Group__1 : rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 ;
    public final void rule__DmxModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1960:1: ( rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 )
            // InternalDmx.g:1961:2: rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DmxModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group__1"


    // $ANTLR start "rule__DmxModel__Group__1__Impl"
    // InternalDmx.g:1968:1: rule__DmxModel__Group__1__Impl : ( ( rule__DmxModel__Group_1__0 )* ) ;
    public final void rule__DmxModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1972:1: ( ( ( rule__DmxModel__Group_1__0 )* ) )
            // InternalDmx.g:1973:1: ( ( rule__DmxModel__Group_1__0 )* )
            {
            // InternalDmx.g:1973:1: ( ( rule__DmxModel__Group_1__0 )* )
            // InternalDmx.g:1974:2: ( rule__DmxModel__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_1()); 
            }
            // InternalDmx.g:1975:2: ( rule__DmxModel__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==62) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDmx.g:1975:3: rule__DmxModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DmxModel__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DmxModel__Group__1__Impl"


    // $ANTLR start "rule__DmxModel__Group__2"
    // InternalDmx.g:1983:1: rule__DmxModel__Group__2 : rule__DmxModel__Group__2__Impl ;
    public final void rule__DmxModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1987:1: ( rule__DmxModel__Group__2__Impl )
            // InternalDmx.g:1988:2: rule__DmxModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group__2"


    // $ANTLR start "rule__DmxModel__Group__2__Impl"
    // InternalDmx.g:1994:1: rule__DmxModel__Group__2__Impl : ( ( rule__DmxModel__Group_2__0 )* ) ;
    public final void rule__DmxModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1998:1: ( ( ( rule__DmxModel__Group_2__0 )* ) )
            // InternalDmx.g:1999:1: ( ( rule__DmxModel__Group_2__0 )* )
            {
            // InternalDmx.g:1999:1: ( ( rule__DmxModel__Group_2__0 )* )
            // InternalDmx.g:2000:2: ( rule__DmxModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_2()); 
            }
            // InternalDmx.g:2001:2: ( rule__DmxModel__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==65) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDmx.g:2001:3: rule__DmxModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DmxModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DmxModel__Group__2__Impl"


    // $ANTLR start "rule__DmxModel__Group_1__0"
    // InternalDmx.g:2010:1: rule__DmxModel__Group_1__0 : rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 ;
    public final void rule__DmxModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2014:1: ( rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 )
            // InternalDmx.g:2015:2: rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DmxModel__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_1__0"


    // $ANTLR start "rule__DmxModel__Group_1__0__Impl"
    // InternalDmx.g:2022:1: rule__DmxModel__Group_1__0__Impl : ( 'text' ) ;
    public final void rule__DmxModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2026:1: ( ( 'text' ) )
            // InternalDmx.g:2027:1: ( 'text' )
            {
            // InternalDmx.g:2027:1: ( 'text' )
            // InternalDmx.g:2028:2: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextKeyword_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getTextKeyword_1_0()); 
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
    // $ANTLR end "rule__DmxModel__Group_1__0__Impl"


    // $ANTLR start "rule__DmxModel__Group_1__1"
    // InternalDmx.g:2037:1: rule__DmxModel__Group_1__1 : rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 ;
    public final void rule__DmxModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2041:1: ( rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 )
            // InternalDmx.g:2042:2: rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__DmxModel__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_1__1"


    // $ANTLR start "rule__DmxModel__Group_1__1__Impl"
    // InternalDmx.g:2049:1: rule__DmxModel__Group_1__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2053:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2054:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2054:1: ( RULE_NATURAL )
            // InternalDmx.g:2055:2: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_1_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__DmxModel__Group_1__1__Impl"


    // $ANTLR start "rule__DmxModel__Group_1__2"
    // InternalDmx.g:2064:1: rule__DmxModel__Group_1__2 : rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 ;
    public final void rule__DmxModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2068:1: ( rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 )
            // InternalDmx.g:2069:2: rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__DmxModel__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_1__2"


    // $ANTLR start "rule__DmxModel__Group_1__2__Impl"
    // InternalDmx.g:2076:1: rule__DmxModel__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2080:1: ( ( ':' ) )
            // InternalDmx.g:2081:1: ( ':' )
            {
            // InternalDmx.g:2081:1: ( ':' )
            // InternalDmx.g:2082:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getColonKeyword_1_2()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getColonKeyword_1_2()); 
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
    // $ANTLR end "rule__DmxModel__Group_1__2__Impl"


    // $ANTLR start "rule__DmxModel__Group_1__3"
    // InternalDmx.g:2091:1: rule__DmxModel__Group_1__3 : rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 ;
    public final void rule__DmxModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2095:1: ( rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 )
            // InternalDmx.g:2096:2: rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4
            {
            pushFollow(FOLLOW_9);
            rule__DmxModel__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_1__3"


    // $ANTLR start "rule__DmxModel__Group_1__3__Impl"
    // InternalDmx.g:2103:1: rule__DmxModel__Group_1__3__Impl : ( ( rule__DmxModel__TextsAssignment_1_3 ) ) ;
    public final void rule__DmxModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2107:1: ( ( ( rule__DmxModel__TextsAssignment_1_3 ) ) )
            // InternalDmx.g:2108:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            {
            // InternalDmx.g:2108:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            // InternalDmx.g:2109:2: ( rule__DmxModel__TextsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextsAssignment_1_3()); 
            }
            // InternalDmx.g:2110:2: ( rule__DmxModel__TextsAssignment_1_3 )
            // InternalDmx.g:2110:3: rule__DmxModel__TextsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__TextsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getTextsAssignment_1_3()); 
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
    // $ANTLR end "rule__DmxModel__Group_1__3__Impl"


    // $ANTLR start "rule__DmxModel__Group_1__4"
    // InternalDmx.g:2118:1: rule__DmxModel__Group_1__4 : rule__DmxModel__Group_1__4__Impl ;
    public final void rule__DmxModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2122:1: ( rule__DmxModel__Group_1__4__Impl )
            // InternalDmx.g:2123:2: rule__DmxModel__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_1__4"


    // $ANTLR start "rule__DmxModel__Group_1__4__Impl"
    // InternalDmx.g:2129:1: rule__DmxModel__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2133:1: ( ( ';' ) )
            // InternalDmx.g:2134:1: ( ';' )
            {
            // InternalDmx.g:2134:1: ( ';' )
            // InternalDmx.g:2135:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getSemicolonKeyword_1_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getSemicolonKeyword_1_4()); 
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
    // $ANTLR end "rule__DmxModel__Group_1__4__Impl"


    // $ANTLR start "rule__DmxModel__Group_2__0"
    // InternalDmx.g:2145:1: rule__DmxModel__Group_2__0 : rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 ;
    public final void rule__DmxModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2149:1: ( rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 )
            // InternalDmx.g:2150:2: rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__DmxModel__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_2__0"


    // $ANTLR start "rule__DmxModel__Group_2__0__Impl"
    // InternalDmx.g:2157:1: rule__DmxModel__Group_2__0__Impl : ( 'expr' ) ;
    public final void rule__DmxModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2161:1: ( ( 'expr' ) )
            // InternalDmx.g:2162:1: ( 'expr' )
            {
            // InternalDmx.g:2162:1: ( 'expr' )
            // InternalDmx.g:2163:2: 'expr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExprKeyword_2_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getExprKeyword_2_0()); 
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
    // $ANTLR end "rule__DmxModel__Group_2__0__Impl"


    // $ANTLR start "rule__DmxModel__Group_2__1"
    // InternalDmx.g:2172:1: rule__DmxModel__Group_2__1 : rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 ;
    public final void rule__DmxModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2176:1: ( rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 )
            // InternalDmx.g:2177:2: rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__DmxModel__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_2__1"


    // $ANTLR start "rule__DmxModel__Group_2__1__Impl"
    // InternalDmx.g:2184:1: rule__DmxModel__Group_2__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2188:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2189:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2189:1: ( RULE_NATURAL )
            // InternalDmx.g:2190:2: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_2_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__DmxModel__Group_2__1__Impl"


    // $ANTLR start "rule__DmxModel__Group_2__2"
    // InternalDmx.g:2199:1: rule__DmxModel__Group_2__2 : rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 ;
    public final void rule__DmxModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2203:1: ( rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 )
            // InternalDmx.g:2204:2: rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3
            {
            pushFollow(FOLLOW_10);
            rule__DmxModel__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_2__2"


    // $ANTLR start "rule__DmxModel__Group_2__2__Impl"
    // InternalDmx.g:2211:1: rule__DmxModel__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2215:1: ( ( ':' ) )
            // InternalDmx.g:2216:1: ( ':' )
            {
            // InternalDmx.g:2216:1: ( ':' )
            // InternalDmx.g:2217:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getColonKeyword_2_2()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getColonKeyword_2_2()); 
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
    // $ANTLR end "rule__DmxModel__Group_2__2__Impl"


    // $ANTLR start "rule__DmxModel__Group_2__3"
    // InternalDmx.g:2226:1: rule__DmxModel__Group_2__3 : rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 ;
    public final void rule__DmxModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2230:1: ( rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 )
            // InternalDmx.g:2231:2: rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4
            {
            pushFollow(FOLLOW_9);
            rule__DmxModel__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_2__3"


    // $ANTLR start "rule__DmxModel__Group_2__3__Impl"
    // InternalDmx.g:2238:1: rule__DmxModel__Group_2__3__Impl : ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) ;
    public final void rule__DmxModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2242:1: ( ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) )
            // InternalDmx.g:2243:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            {
            // InternalDmx.g:2243:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            // InternalDmx.g:2244:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExpressionsAssignment_2_3()); 
            }
            // InternalDmx.g:2245:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            // InternalDmx.g:2245:3: rule__DmxModel__ExpressionsAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__ExpressionsAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getExpressionsAssignment_2_3()); 
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
    // $ANTLR end "rule__DmxModel__Group_2__3__Impl"


    // $ANTLR start "rule__DmxModel__Group_2__4"
    // InternalDmx.g:2253:1: rule__DmxModel__Group_2__4 : rule__DmxModel__Group_2__4__Impl ;
    public final void rule__DmxModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2257:1: ( rule__DmxModel__Group_2__4__Impl )
            // InternalDmx.g:2258:2: rule__DmxModel__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DmxModel__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DmxModel__Group_2__4"


    // $ANTLR start "rule__DmxModel__Group_2__4__Impl"
    // InternalDmx.g:2264:1: rule__DmxModel__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2268:1: ( ( ';' ) )
            // InternalDmx.g:2269:1: ( ';' )
            {
            // InternalDmx.g:2269:1: ( ';' )
            // InternalDmx.g:2270:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getSemicolonKeyword_2_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getSemicolonKeyword_2_4()); 
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
    // $ANTLR end "rule__DmxModel__Group_2__4__Impl"


    // $ANTLR start "rule__DRichText__Group_1__0"
    // InternalDmx.g:2280:1: rule__DRichText__Group_1__0 : rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 ;
    public final void rule__DRichText__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2284:1: ( rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 )
            // InternalDmx.g:2285:2: rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DRichText__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1__0"


    // $ANTLR start "rule__DRichText__Group_1__0__Impl"
    // InternalDmx.g:2292:1: rule__DRichText__Group_1__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_0 ) ) ;
    public final void rule__DRichText__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2296:1: ( ( ( rule__DRichText__ElementsAssignment_1_0 ) ) )
            // InternalDmx.g:2297:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            {
            // InternalDmx.g:2297:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            // InternalDmx.g:2298:2: ( rule__DRichText__ElementsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_0()); 
            }
            // InternalDmx.g:2299:2: ( rule__DRichText__ElementsAssignment_1_0 )
            // InternalDmx.g:2299:3: rule__DRichText__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__ElementsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsAssignment_1_0()); 
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
    // $ANTLR end "rule__DRichText__Group_1__0__Impl"


    // $ANTLR start "rule__DRichText__Group_1__1"
    // InternalDmx.g:2307:1: rule__DRichText__Group_1__1 : rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 ;
    public final void rule__DRichText__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2311:1: ( rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 )
            // InternalDmx.g:2312:2: rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__DRichText__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1__1"


    // $ANTLR start "rule__DRichText__Group_1__1__Impl"
    // InternalDmx.g:2319:1: rule__DRichText__Group_1__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_1 ) ) ;
    public final void rule__DRichText__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2323:1: ( ( ( rule__DRichText__ElementsAssignment_1_1 ) ) )
            // InternalDmx.g:2324:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            {
            // InternalDmx.g:2324:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            // InternalDmx.g:2325:2: ( rule__DRichText__ElementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_1()); 
            }
            // InternalDmx.g:2326:2: ( rule__DRichText__ElementsAssignment_1_1 )
            // InternalDmx.g:2326:3: rule__DRichText__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__ElementsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsAssignment_1_1()); 
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
    // $ANTLR end "rule__DRichText__Group_1__1__Impl"


    // $ANTLR start "rule__DRichText__Group_1__2"
    // InternalDmx.g:2334:1: rule__DRichText__Group_1__2 : rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 ;
    public final void rule__DRichText__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2338:1: ( rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 )
            // InternalDmx.g:2339:2: rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DRichText__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1__2"


    // $ANTLR start "rule__DRichText__Group_1__2__Impl"
    // InternalDmx.g:2346:1: rule__DRichText__Group_1__2__Impl : ( ( rule__DRichText__Group_1_2__0 )* ) ;
    public final void rule__DRichText__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2350:1: ( ( ( rule__DRichText__Group_1_2__0 )* ) )
            // InternalDmx.g:2351:1: ( ( rule__DRichText__Group_1_2__0 )* )
            {
            // InternalDmx.g:2351:1: ( ( rule__DRichText__Group_1_2__0 )* )
            // InternalDmx.g:2352:2: ( rule__DRichText__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getGroup_1_2()); 
            }
            // InternalDmx.g:2353:2: ( rule__DRichText__Group_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDmx.g:2353:3: rule__DRichText__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DRichText__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__DRichText__Group_1__2__Impl"


    // $ANTLR start "rule__DRichText__Group_1__3"
    // InternalDmx.g:2361:1: rule__DRichText__Group_1__3 : rule__DRichText__Group_1__3__Impl ;
    public final void rule__DRichText__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2365:1: ( rule__DRichText__Group_1__3__Impl )
            // InternalDmx.g:2366:2: rule__DRichText__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1__3"


    // $ANTLR start "rule__DRichText__Group_1__3__Impl"
    // InternalDmx.g:2372:1: rule__DRichText__Group_1__3__Impl : ( ( rule__DRichText__ElementsAssignment_1_3 ) ) ;
    public final void rule__DRichText__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2376:1: ( ( ( rule__DRichText__ElementsAssignment_1_3 ) ) )
            // InternalDmx.g:2377:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            {
            // InternalDmx.g:2377:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            // InternalDmx.g:2378:2: ( rule__DRichText__ElementsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_3()); 
            }
            // InternalDmx.g:2379:2: ( rule__DRichText__ElementsAssignment_1_3 )
            // InternalDmx.g:2379:3: rule__DRichText__ElementsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__ElementsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsAssignment_1_3()); 
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
    // $ANTLR end "rule__DRichText__Group_1__3__Impl"


    // $ANTLR start "rule__DRichText__Group_1_2__0"
    // InternalDmx.g:2388:1: rule__DRichText__Group_1_2__0 : rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 ;
    public final void rule__DRichText__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2392:1: ( rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 )
            // InternalDmx.g:2393:2: rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DRichText__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1_2__0"


    // $ANTLR start "rule__DRichText__Group_1_2__0__Impl"
    // InternalDmx.g:2400:1: rule__DRichText__Group_1_2__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) ;
    public final void rule__DRichText__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2404:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) )
            // InternalDmx.g:2405:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            {
            // InternalDmx.g:2405:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            // InternalDmx.g:2406:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_0()); 
            }
            // InternalDmx.g:2407:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            // InternalDmx.g:2407:3: rule__DRichText__ElementsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__ElementsAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_0()); 
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
    // $ANTLR end "rule__DRichText__Group_1_2__0__Impl"


    // $ANTLR start "rule__DRichText__Group_1_2__1"
    // InternalDmx.g:2415:1: rule__DRichText__Group_1_2__1 : rule__DRichText__Group_1_2__1__Impl ;
    public final void rule__DRichText__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2419:1: ( rule__DRichText__Group_1_2__1__Impl )
            // InternalDmx.g:2420:2: rule__DRichText__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__Group_1_2__1"


    // $ANTLR start "rule__DRichText__Group_1_2__1__Impl"
    // InternalDmx.g:2426:1: rule__DRichText__Group_1_2__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__DRichText__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2430:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) )
            // InternalDmx.g:2431:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            {
            // InternalDmx.g:2431:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            // InternalDmx.g:2432:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_1()); 
            }
            // InternalDmx.g:2433:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            // InternalDmx.g:2433:3: rule__DRichText__ElementsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__ElementsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_1()); 
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
    // $ANTLR end "rule__DRichText__Group_1_2__1__Impl"


    // $ANTLR start "rule__DAssignment__Group_0__0"
    // InternalDmx.g:2442:1: rule__DAssignment__Group_0__0 : rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 ;
    public final void rule__DAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2446:1: ( rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 )
            // InternalDmx.g:2447:2: rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__DAssignment__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAssignment__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAssignment__Group_0__0"


    // $ANTLR start "rule__DAssignment__Group_0__0__Impl"
    // InternalDmx.g:2454:1: rule__DAssignment__Group_0__0__Impl : ( () ) ;
    public final void rule__DAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2458:1: ( ( () ) )
            // InternalDmx.g:2459:1: ( () )
            {
            // InternalDmx.g:2459:1: ( () )
            // InternalDmx.g:2460:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0()); 
            }
            // InternalDmx.g:2461:2: ()
            // InternalDmx.g:2461:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAssignment__Group_0__0__Impl"


    // $ANTLR start "rule__DAssignment__Group_0__1"
    // InternalDmx.g:2469:1: rule__DAssignment__Group_0__1 : rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 ;
    public final void rule__DAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2473:1: ( rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 )
            // InternalDmx.g:2474:2: rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__DAssignment__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAssignment__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAssignment__Group_0__1"


    // $ANTLR start "rule__DAssignment__Group_0__1__Impl"
    // InternalDmx.g:2481:1: rule__DAssignment__Group_0__1__Impl : ( ( rule__DAssignment__MemberAssignment_0_1 ) ) ;
    public final void rule__DAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2485:1: ( ( ( rule__DAssignment__MemberAssignment_0_1 ) ) )
            // InternalDmx.g:2486:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            {
            // InternalDmx.g:2486:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            // InternalDmx.g:2487:2: ( rule__DAssignment__MemberAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberAssignment_0_1()); 
            }
            // InternalDmx.g:2488:2: ( rule__DAssignment__MemberAssignment_0_1 )
            // InternalDmx.g:2488:3: rule__DAssignment__MemberAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DAssignment__MemberAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getMemberAssignment_0_1()); 
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
    // $ANTLR end "rule__DAssignment__Group_0__1__Impl"


    // $ANTLR start "rule__DAssignment__Group_0__2"
    // InternalDmx.g:2496:1: rule__DAssignment__Group_0__2 : rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 ;
    public final void rule__DAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2500:1: ( rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 )
            // InternalDmx.g:2501:2: rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__DAssignment__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAssignment__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAssignment__Group_0__2"


    // $ANTLR start "rule__DAssignment__Group_0__2__Impl"
    // InternalDmx.g:2508:1: rule__DAssignment__Group_0__2__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2512:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:2513:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:2513:1: ( ruleOpSingleAssign )
            // InternalDmx.g:2514:2: ruleOpSingleAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
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
    // $ANTLR end "rule__DAssignment__Group_0__2__Impl"


    // $ANTLR start "rule__DAssignment__Group_0__3"
    // InternalDmx.g:2523:1: rule__DAssignment__Group_0__3 : rule__DAssignment__Group_0__3__Impl ;
    public final void rule__DAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2527:1: ( rule__DAssignment__Group_0__3__Impl )
            // InternalDmx.g:2528:2: rule__DAssignment__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAssignment__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAssignment__Group_0__3"


    // $ANTLR start "rule__DAssignment__Group_0__3__Impl"
    // InternalDmx.g:2534:1: rule__DAssignment__Group_0__3__Impl : ( ( rule__DAssignment__ValueAssignment_0_3 ) ) ;
    public final void rule__DAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2538:1: ( ( ( rule__DAssignment__ValueAssignment_0_3 ) ) )
            // InternalDmx.g:2539:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            {
            // InternalDmx.g:2539:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            // InternalDmx.g:2540:2: ( rule__DAssignment__ValueAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3()); 
            }
            // InternalDmx.g:2541:2: ( rule__DAssignment__ValueAssignment_0_3 )
            // InternalDmx.g:2541:3: rule__DAssignment__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__DAssignment__ValueAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3()); 
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
    // $ANTLR end "rule__DAssignment__Group_0__3__Impl"


    // $ANTLR start "rule__DOrExpression__Group__0"
    // InternalDmx.g:2550:1: rule__DOrExpression__Group__0 : rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 ;
    public final void rule__DOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2554:1: ( rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 )
            // InternalDmx.g:2555:2: rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DOrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group__0"


    // $ANTLR start "rule__DOrExpression__Group__0__Impl"
    // InternalDmx.g:2562:1: rule__DOrExpression__Group__0__Impl : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2566:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:2567:1: ( ruleDAndExpression )
            {
            // InternalDmx.g:2567:1: ( ruleDAndExpression )
            // InternalDmx.g:2568:2: ruleDAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DOrExpression__Group__0__Impl"


    // $ANTLR start "rule__DOrExpression__Group__1"
    // InternalDmx.g:2577:1: rule__DOrExpression__Group__1 : rule__DOrExpression__Group__1__Impl ;
    public final void rule__DOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2581:1: ( rule__DOrExpression__Group__1__Impl )
            // InternalDmx.g:2582:2: rule__DOrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group__1"


    // $ANTLR start "rule__DOrExpression__Group__1__Impl"
    // InternalDmx.g:2588:1: rule__DOrExpression__Group__1__Impl : ( ( rule__DOrExpression__Group_1__0 )* ) ;
    public final void rule__DOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2592:1: ( ( ( rule__DOrExpression__Group_1__0 )* ) )
            // InternalDmx.g:2593:1: ( ( rule__DOrExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2593:1: ( ( rule__DOrExpression__Group_1__0 )* )
            // InternalDmx.g:2594:2: ( rule__DOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2595:2: ( rule__DOrExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA31_5 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalDmx.g:2595:3: rule__DOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DOrExpression__Group__1__Impl"


    // $ANTLR start "rule__DOrExpression__Group_1__0"
    // InternalDmx.g:2604:1: rule__DOrExpression__Group_1__0 : rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 ;
    public final void rule__DOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2608:1: ( rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 )
            // InternalDmx.g:2609:2: rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DOrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1__0"


    // $ANTLR start "rule__DOrExpression__Group_1__0__Impl"
    // InternalDmx.g:2616:1: rule__DOrExpression__Group_1__0__Impl : ( ( rule__DOrExpression__Group_1_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2620:1: ( ( ( rule__DOrExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2621:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2621:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            // InternalDmx.g:2622:2: ( rule__DOrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2623:2: ( rule__DOrExpression__Group_1_0__0 )
            // InternalDmx.g:2623:3: rule__DOrExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DOrExpression__Group_1__1"
    // InternalDmx.g:2631:1: rule__DOrExpression__Group_1__1 : rule__DOrExpression__Group_1__1__Impl ;
    public final void rule__DOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2635:1: ( rule__DOrExpression__Group_1__1__Impl )
            // InternalDmx.g:2636:2: rule__DOrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1__1"


    // $ANTLR start "rule__DOrExpression__Group_1__1__Impl"
    // InternalDmx.g:2642:1: rule__DOrExpression__Group_1__1__Impl : ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2646:1: ( ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2647:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2647:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2648:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2649:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2649:3: rule__DOrExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DOrExpression__Group_1_0__0"
    // InternalDmx.g:2658:1: rule__DOrExpression__Group_1_0__0 : rule__DOrExpression__Group_1_0__0__Impl ;
    public final void rule__DOrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2662:1: ( rule__DOrExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2663:2: rule__DOrExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1_0__0"


    // $ANTLR start "rule__DOrExpression__Group_1_0__0__Impl"
    // InternalDmx.g:2669:1: rule__DOrExpression__Group_1_0__0__Impl : ( ( rule__DOrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2673:1: ( ( ( rule__DOrExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2674:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2674:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2675:2: ( rule__DOrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2676:2: ( rule__DOrExpression__Group_1_0_0__0 )
            // InternalDmx.g:2676:3: rule__DOrExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DOrExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DOrExpression__Group_1_0_0__0"
    // InternalDmx.g:2685:1: rule__DOrExpression__Group_1_0_0__0 : rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 ;
    public final void rule__DOrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2689:1: ( rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 )
            // InternalDmx.g:2690:2: rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_15);
            rule__DOrExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DOrExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:2697:1: rule__DOrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2701:1: ( ( () ) )
            // InternalDmx.g:2702:1: ( () )
            {
            // InternalDmx.g:2702:1: ( () )
            // InternalDmx.g:2703:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2704:2: ()
            // InternalDmx.g:2704:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DOrExpression__Group_1_0_0__1"
    // InternalDmx.g:2712:1: rule__DOrExpression__Group_1_0_0__1 : rule__DOrExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2716:1: ( rule__DOrExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2717:2: rule__DOrExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOrExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DOrExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:2723:1: rule__DOrExpression__Group_1_0_0__1__Impl : ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2727:1: ( ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2728:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2728:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2729:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2730:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2730:3: rule__DOrExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DOrExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DOrExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DAndExpression__Group__0"
    // InternalDmx.g:2739:1: rule__DAndExpression__Group__0 : rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 ;
    public final void rule__DAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2743:1: ( rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 )
            // InternalDmx.g:2744:2: rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DAndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group__0"


    // $ANTLR start "rule__DAndExpression__Group__0__Impl"
    // InternalDmx.g:2751:1: rule__DAndExpression__Group__0__Impl : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2755:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:2756:1: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:2756:1: ( ruleDEqualityExpression )
            // InternalDmx.g:2757:2: ruleDEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DAndExpression__Group__0__Impl"


    // $ANTLR start "rule__DAndExpression__Group__1"
    // InternalDmx.g:2766:1: rule__DAndExpression__Group__1 : rule__DAndExpression__Group__1__Impl ;
    public final void rule__DAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2770:1: ( rule__DAndExpression__Group__1__Impl )
            // InternalDmx.g:2771:2: rule__DAndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group__1"


    // $ANTLR start "rule__DAndExpression__Group__1__Impl"
    // InternalDmx.g:2777:1: rule__DAndExpression__Group__1__Impl : ( ( rule__DAndExpression__Group_1__0 )* ) ;
    public final void rule__DAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2781:1: ( ( ( rule__DAndExpression__Group_1__0 )* ) )
            // InternalDmx.g:2782:1: ( ( rule__DAndExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2782:1: ( ( rule__DAndExpression__Group_1__0 )* )
            // InternalDmx.g:2783:2: ( rule__DAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2784:2: ( rule__DAndExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==43) ) {
                    int LA32_3 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalDmx.g:2784:3: rule__DAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DAndExpression__Group__1__Impl"


    // $ANTLR start "rule__DAndExpression__Group_1__0"
    // InternalDmx.g:2793:1: rule__DAndExpression__Group_1__0 : rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 ;
    public final void rule__DAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2797:1: ( rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 )
            // InternalDmx.g:2798:2: rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DAndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1__0"


    // $ANTLR start "rule__DAndExpression__Group_1__0__Impl"
    // InternalDmx.g:2805:1: rule__DAndExpression__Group_1__0__Impl : ( ( rule__DAndExpression__Group_1_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2809:1: ( ( ( rule__DAndExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2810:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2810:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            // InternalDmx.g:2811:2: ( rule__DAndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2812:2: ( rule__DAndExpression__Group_1_0__0 )
            // InternalDmx.g:2812:3: rule__DAndExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DAndExpression__Group_1__1"
    // InternalDmx.g:2820:1: rule__DAndExpression__Group_1__1 : rule__DAndExpression__Group_1__1__Impl ;
    public final void rule__DAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2824:1: ( rule__DAndExpression__Group_1__1__Impl )
            // InternalDmx.g:2825:2: rule__DAndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1__1"


    // $ANTLR start "rule__DAndExpression__Group_1__1__Impl"
    // InternalDmx.g:2831:1: rule__DAndExpression__Group_1__1__Impl : ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2835:1: ( ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2836:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2836:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2837:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2838:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2838:3: rule__DAndExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DAndExpression__Group_1_0__0"
    // InternalDmx.g:2847:1: rule__DAndExpression__Group_1_0__0 : rule__DAndExpression__Group_1_0__0__Impl ;
    public final void rule__DAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2851:1: ( rule__DAndExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2852:2: rule__DAndExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1_0__0"


    // $ANTLR start "rule__DAndExpression__Group_1_0__0__Impl"
    // InternalDmx.g:2858:1: rule__DAndExpression__Group_1_0__0__Impl : ( ( rule__DAndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2862:1: ( ( ( rule__DAndExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2863:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2863:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2864:2: ( rule__DAndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2865:2: ( rule__DAndExpression__Group_1_0_0__0 )
            // InternalDmx.g:2865:3: rule__DAndExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DAndExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DAndExpression__Group_1_0_0__0"
    // InternalDmx.g:2874:1: rule__DAndExpression__Group_1_0_0__0 : rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 ;
    public final void rule__DAndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2878:1: ( rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 )
            // InternalDmx.g:2879:2: rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__DAndExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DAndExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:2886:1: rule__DAndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2890:1: ( ( () ) )
            // InternalDmx.g:2891:1: ( () )
            {
            // InternalDmx.g:2891:1: ( () )
            // InternalDmx.g:2892:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2893:2: ()
            // InternalDmx.g:2893:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DAndExpression__Group_1_0_0__1"
    // InternalDmx.g:2901:1: rule__DAndExpression__Group_1_0_0__1 : rule__DAndExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2905:1: ( rule__DAndExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2906:2: rule__DAndExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAndExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DAndExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:2912:1: rule__DAndExpression__Group_1_0_0__1__Impl : ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2916:1: ( ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2917:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2917:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2918:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2919:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2919:3: rule__DAndExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DAndExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DAndExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group__0"
    // InternalDmx.g:2928:1: rule__DEqualityExpression__Group__0 : rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 ;
    public final void rule__DEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2932:1: ( rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 )
            // InternalDmx.g:2933:2: rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DEqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group__0"


    // $ANTLR start "rule__DEqualityExpression__Group__0__Impl"
    // InternalDmx.g:2940:1: rule__DEqualityExpression__Group__0__Impl : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2944:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:2945:1: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:2945:1: ( ruleDRelationalExpression )
            // InternalDmx.g:2946:2: ruleDRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group__1"
    // InternalDmx.g:2955:1: rule__DEqualityExpression__Group__1 : rule__DEqualityExpression__Group__1__Impl ;
    public final void rule__DEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2959:1: ( rule__DEqualityExpression__Group__1__Impl )
            // InternalDmx.g:2960:2: rule__DEqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group__1"


    // $ANTLR start "rule__DEqualityExpression__Group__1__Impl"
    // InternalDmx.g:2966:1: rule__DEqualityExpression__Group__1__Impl : ( ( rule__DEqualityExpression__Group_1__0 )* ) ;
    public final void rule__DEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2970:1: ( ( ( rule__DEqualityExpression__Group_1__0 )* ) )
            // InternalDmx.g:2971:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2971:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            // InternalDmx.g:2972:2: ( rule__DEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2973:2: ( rule__DEqualityExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // InternalDmx.g:2973:3: rule__DEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group_1__0"
    // InternalDmx.g:2982:1: rule__DEqualityExpression__Group_1__0 : rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 ;
    public final void rule__DEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2986:1: ( rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 )
            // InternalDmx.g:2987:2: rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DEqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1__0"


    // $ANTLR start "rule__DEqualityExpression__Group_1__0__Impl"
    // InternalDmx.g:2994:1: rule__DEqualityExpression__Group_1__0__Impl : ( ( rule__DEqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2998:1: ( ( ( rule__DEqualityExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2999:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2999:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            // InternalDmx.g:3000:2: ( rule__DEqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3001:2: ( rule__DEqualityExpression__Group_1_0__0 )
            // InternalDmx.g:3001:3: rule__DEqualityExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group_1__1"
    // InternalDmx.g:3009:1: rule__DEqualityExpression__Group_1__1 : rule__DEqualityExpression__Group_1__1__Impl ;
    public final void rule__DEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3013:1: ( rule__DEqualityExpression__Group_1__1__Impl )
            // InternalDmx.g:3014:2: rule__DEqualityExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1__1"


    // $ANTLR start "rule__DEqualityExpression__Group_1__1__Impl"
    // InternalDmx.g:3020:1: rule__DEqualityExpression__Group_1__1__Impl : ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3024:1: ( ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3025:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3025:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3026:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3027:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3027:3: rule__DEqualityExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0__0"
    // InternalDmx.g:3036:1: rule__DEqualityExpression__Group_1_0__0 : rule__DEqualityExpression__Group_1_0__0__Impl ;
    public final void rule__DEqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3040:1: ( rule__DEqualityExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3041:2: rule__DEqualityExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1_0__0"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0__0__Impl"
    // InternalDmx.g:3047:1: rule__DEqualityExpression__Group_1_0__0__Impl : ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3051:1: ( ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3052:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3052:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3053:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3054:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            // InternalDmx.g:3054:3: rule__DEqualityExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0_0__0"
    // InternalDmx.g:3063:1: rule__DEqualityExpression__Group_1_0_0__0 : rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 ;
    public final void rule__DEqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3067:1: ( rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 )
            // InternalDmx.g:3068:2: rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_19);
            rule__DEqualityExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:3075:1: rule__DEqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3079:1: ( ( () ) )
            // InternalDmx.g:3080:1: ( () )
            {
            // InternalDmx.g:3080:1: ( () )
            // InternalDmx.g:3081:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3082:2: ()
            // InternalDmx.g:3082:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0_0__1"
    // InternalDmx.g:3090:1: rule__DEqualityExpression__Group_1_0_0__1 : rule__DEqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__DEqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3094:1: ( rule__DEqualityExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3095:2: rule__DEqualityExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DEqualityExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DEqualityExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:3101:1: rule__DEqualityExpression__Group_1_0_0__1__Impl : ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3105:1: ( ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3106:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3106:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3107:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3108:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3108:3: rule__DEqualityExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DEqualityExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DEqualityExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group__0"
    // InternalDmx.g:3117:1: rule__DRelationalExpression__Group__0 : rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 ;
    public final void rule__DRelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3121:1: ( rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 )
            // InternalDmx.g:3122:2: rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__DRelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group__0"


    // $ANTLR start "rule__DRelationalExpression__Group__0__Impl"
    // InternalDmx.g:3129:1: rule__DRelationalExpression__Group__0__Impl : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3133:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:3134:1: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:3134:1: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:3135:2: ruleDOtherOperatorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group__1"
    // InternalDmx.g:3144:1: rule__DRelationalExpression__Group__1 : rule__DRelationalExpression__Group__1__Impl ;
    public final void rule__DRelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3148:1: ( rule__DRelationalExpression__Group__1__Impl )
            // InternalDmx.g:3149:2: rule__DRelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group__1"


    // $ANTLR start "rule__DRelationalExpression__Group__1__Impl"
    // InternalDmx.g:3155:1: rule__DRelationalExpression__Group__1__Impl : ( ( rule__DRelationalExpression__Alternatives_1 )* ) ;
    public final void rule__DRelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3159:1: ( ( ( rule__DRelationalExpression__Alternatives_1 )* ) )
            // InternalDmx.g:3160:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            {
            // InternalDmx.g:3160:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            // InternalDmx.g:3161:2: ( rule__DRelationalExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:3162:2: ( rule__DRelationalExpression__Alternatives_1 )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalDmx.g:3162:3: rule__DRelationalExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DRelationalExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0__0"
    // InternalDmx.g:3171:1: rule__DRelationalExpression__Group_1_0__0 : rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3175:1: ( rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 )
            // InternalDmx.g:3176:2: rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__DRelationalExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0__0__Impl"
    // InternalDmx.g:3183:1: rule__DRelationalExpression__Group_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3187:1: ( ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3188:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3188:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3189:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3190:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            // InternalDmx.g:3190:3: rule__DRelationalExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0__1"
    // InternalDmx.g:3198:1: rule__DRelationalExpression__Group_1_0__1 : rule__DRelationalExpression__Group_1_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3202:1: ( rule__DRelationalExpression__Group_1_0__1__Impl )
            // InternalDmx.g:3203:2: rule__DRelationalExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0__1"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0__1__Impl"
    // InternalDmx.g:3209:1: rule__DRelationalExpression__Group_1_0__1__Impl : ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3213:1: ( ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) )
            // InternalDmx.g:3214:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            {
            // InternalDmx.g:3214:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            // InternalDmx.g:3215:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1()); 
            }
            // InternalDmx.g:3216:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            // InternalDmx.g:3216:3: rule__DRelationalExpression__TypeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__TypeAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0__0"
    // InternalDmx.g:3225:1: rule__DRelationalExpression__Group_1_0_0__0 : rule__DRelationalExpression__Group_1_0_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3229:1: ( rule__DRelationalExpression__Group_1_0_0__0__Impl )
            // InternalDmx.g:3230:2: rule__DRelationalExpression__Group_1_0_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:3236:1: rule__DRelationalExpression__Group_1_0_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3240:1: ( ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:3241:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:3241:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            // InternalDmx.g:3242:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:3243:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            // InternalDmx.g:3243:3: rule__DRelationalExpression__Group_1_0_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0_0__0"
    // InternalDmx.g:3252:1: rule__DRelationalExpression__Group_1_0_0_0__0 : rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3256:1: ( rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 )
            // InternalDmx.g:3257:2: rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_23);
            rule__DRelationalExpression__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0_0__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0_0__0__Impl"
    // InternalDmx.g:3264:1: rule__DRelationalExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3268:1: ( ( () ) )
            // InternalDmx.g:3269:1: ( () )
            {
            // InternalDmx.g:3269:1: ( () )
            // InternalDmx.g:3270:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:3271:2: ()
            // InternalDmx.g:3271:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0_0__1"
    // InternalDmx.g:3279:1: rule__DRelationalExpression__Group_1_0_0_0__1 : rule__DRelationalExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3283:1: ( rule__DRelationalExpression__Group_1_0_0_0__1__Impl )
            // InternalDmx.g:3284:2: rule__DRelationalExpression__Group_1_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0_0__1"


    // $ANTLR start "rule__DRelationalExpression__Group_1_0_0_0__1__Impl"
    // InternalDmx.g:3290:1: rule__DRelationalExpression__Group_1_0_0_0__1__Impl : ( ruleOpInstanceOf ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3294:1: ( ( ruleOpInstanceOf ) )
            // InternalDmx.g:3295:1: ( ruleOpInstanceOf )
            {
            // InternalDmx.g:3295:1: ( ruleOpInstanceOf )
            // InternalDmx.g:3296:2: ruleOpInstanceOf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOpInstanceOfParserRuleCall_1_0_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpInstanceOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getOpInstanceOfParserRuleCall_1_0_0_0_1()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1__0"
    // InternalDmx.g:3306:1: rule__DRelationalExpression__Group_1_1__0 : rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 ;
    public final void rule__DRelationalExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3310:1: ( rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 )
            // InternalDmx.g:3311:2: rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DRelationalExpression__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1__0__Impl"
    // InternalDmx.g:3318:1: rule__DRelationalExpression__Group_1_1__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3322:1: ( ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) )
            // InternalDmx.g:3323:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:3323:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            // InternalDmx.g:3324:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:3325:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            // InternalDmx.g:3325:3: rule__DRelationalExpression__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1__1"
    // InternalDmx.g:3333:1: rule__DRelationalExpression__Group_1_1__1 : rule__DRelationalExpression__Group_1_1__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3337:1: ( rule__DRelationalExpression__Group_1_1__1__Impl )
            // InternalDmx.g:3338:2: rule__DRelationalExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1__1"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1__1__Impl"
    // InternalDmx.g:3344:1: rule__DRelationalExpression__Group_1_1__1__Impl : ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3348:1: ( ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) )
            // InternalDmx.g:3349:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            {
            // InternalDmx.g:3349:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            // InternalDmx.g:3350:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1()); 
            }
            // InternalDmx.g:3351:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            // InternalDmx.g:3351:3: rule__DRelationalExpression__RightOperandAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__RightOperandAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0__0"
    // InternalDmx.g:3360:1: rule__DRelationalExpression__Group_1_1_0__0 : rule__DRelationalExpression__Group_1_1_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3364:1: ( rule__DRelationalExpression__Group_1_1_0__0__Impl )
            // InternalDmx.g:3365:2: rule__DRelationalExpression__Group_1_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0__0__Impl"
    // InternalDmx.g:3371:1: rule__DRelationalExpression__Group_1_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3375:1: ( ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:3376:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:3376:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            // InternalDmx.g:3377:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:3378:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            // InternalDmx.g:3378:3: rule__DRelationalExpression__Group_1_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0_0__0"
    // InternalDmx.g:3387:1: rule__DRelationalExpression__Group_1_1_0_0__0 : rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3391:1: ( rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 )
            // InternalDmx.g:3392:2: rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_21);
            rule__DRelationalExpression__Group_1_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0_0__0"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0_0__0__Impl"
    // InternalDmx.g:3399:1: rule__DRelationalExpression__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3403:1: ( ( () ) )
            // InternalDmx.g:3404:1: ( () )
            {
            // InternalDmx.g:3404:1: ( () )
            // InternalDmx.g:3405:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:3406:2: ()
            // InternalDmx.g:3406:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0_0__0__Impl"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0_0__1"
    // InternalDmx.g:3414:1: rule__DRelationalExpression__Group_1_1_0_0__1 : rule__DRelationalExpression__Group_1_1_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3418:1: ( rule__DRelationalExpression__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:3419:2: rule__DRelationalExpression__Group_1_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__Group_1_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0_0__1"


    // $ANTLR start "rule__DRelationalExpression__Group_1_1_0_0__1__Impl"
    // InternalDmx.g:3425:1: rule__DRelationalExpression__Group_1_1_0_0__1__Impl : ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3429:1: ( ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) )
            // InternalDmx.g:3430:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            {
            // InternalDmx.g:3430:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            // InternalDmx.g:3431:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1()); 
            }
            // InternalDmx.g:3432:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            // InternalDmx.g:3432:3: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1()); 
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
    // $ANTLR end "rule__DRelationalExpression__Group_1_1_0_0__1__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group__0"
    // InternalDmx.g:3441:1: rule__DOtherOperatorExpression__Group__0 : rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 ;
    public final void rule__DOtherOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3445:1: ( rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 )
            // InternalDmx.g:3446:2: rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DOtherOperatorExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group__0"


    // $ANTLR start "rule__DOtherOperatorExpression__Group__0__Impl"
    // InternalDmx.g:3453:1: rule__DOtherOperatorExpression__Group__0__Impl : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3457:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:3458:1: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:3458:1: ( ruleDAdditiveExpression )
            // InternalDmx.g:3459:2: ruleDAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group__0__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group__1"
    // InternalDmx.g:3468:1: rule__DOtherOperatorExpression__Group__1 : rule__DOtherOperatorExpression__Group__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3472:1: ( rule__DOtherOperatorExpression__Group__1__Impl )
            // InternalDmx.g:3473:2: rule__DOtherOperatorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group__1"


    // $ANTLR start "rule__DOtherOperatorExpression__Group__1__Impl"
    // InternalDmx.g:3479:1: rule__DOtherOperatorExpression__Group__1__Impl : ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) ;
    public final void rule__DOtherOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3483:1: ( ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) )
            // InternalDmx.g:3484:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3484:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            // InternalDmx.g:3485:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3486:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalDmx.g:3486:3: rule__DOtherOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DOtherOperatorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group__1__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1__0"
    // InternalDmx.g:3495:1: rule__DOtherOperatorExpression__Group_1__0 : rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 ;
    public final void rule__DOtherOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3499:1: ( rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 )
            // InternalDmx.g:3500:2: rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DOtherOperatorExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1__0"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1__0__Impl"
    // InternalDmx.g:3507:1: rule__DOtherOperatorExpression__Group_1__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3511:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3512:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3512:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            // InternalDmx.g:3513:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3514:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            // InternalDmx.g:3514:3: rule__DOtherOperatorExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1__1"
    // InternalDmx.g:3522:1: rule__DOtherOperatorExpression__Group_1__1 : rule__DOtherOperatorExpression__Group_1__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3526:1: ( rule__DOtherOperatorExpression__Group_1__1__Impl )
            // InternalDmx.g:3527:2: rule__DOtherOperatorExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1__1"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1__1__Impl"
    // InternalDmx.g:3533:1: rule__DOtherOperatorExpression__Group_1__1__Impl : ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3537:1: ( ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3538:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3538:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3539:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3540:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3540:3: rule__DOtherOperatorExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0__0"
    // InternalDmx.g:3549:1: rule__DOtherOperatorExpression__Group_1_0__0 : rule__DOtherOperatorExpression__Group_1_0__0__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3553:1: ( rule__DOtherOperatorExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3554:2: rule__DOtherOperatorExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0__0"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0__0__Impl"
    // InternalDmx.g:3560:1: rule__DOtherOperatorExpression__Group_1_0__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3564:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3565:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3565:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3566:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3567:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            // InternalDmx.g:3567:3: rule__DOtherOperatorExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0_0__0"
    // InternalDmx.g:3576:1: rule__DOtherOperatorExpression__Group_1_0_0__0 : rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3580:1: ( rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 )
            // InternalDmx.g:3581:2: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__DOtherOperatorExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:3588:1: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3592:1: ( ( () ) )
            // InternalDmx.g:3593:1: ( () )
            {
            // InternalDmx.g:3593:1: ( () )
            // InternalDmx.g:3594:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3595:2: ()
            // InternalDmx.g:3595:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0_0__1"
    // InternalDmx.g:3603:1: rule__DOtherOperatorExpression__Group_1_0_0__1 : rule__DOtherOperatorExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3607:1: ( rule__DOtherOperatorExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3608:2: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DOtherOperatorExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:3614:1: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl : ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3618:1: ( ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3619:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3619:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3620:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3621:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3621:3: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group__0"
    // InternalDmx.g:3630:1: rule__DAdditiveExpression__Group__0 : rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 ;
    public final void rule__DAdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3634:1: ( rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 )
            // InternalDmx.g:3635:2: rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DAdditiveExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group__0"


    // $ANTLR start "rule__DAdditiveExpression__Group__0__Impl"
    // InternalDmx.g:3642:1: rule__DAdditiveExpression__Group__0__Impl : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3646:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:3647:1: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:3647:1: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:3648:2: ruleDMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group__1"
    // InternalDmx.g:3657:1: rule__DAdditiveExpression__Group__1 : rule__DAdditiveExpression__Group__1__Impl ;
    public final void rule__DAdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3661:1: ( rule__DAdditiveExpression__Group__1__Impl )
            // InternalDmx.g:3662:2: rule__DAdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group__1"


    // $ANTLR start "rule__DAdditiveExpression__Group__1__Impl"
    // InternalDmx.g:3668:1: rule__DAdditiveExpression__Group__1__Impl : ( ( rule__DAdditiveExpression__Group_1__0 )* ) ;
    public final void rule__DAdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3672:1: ( ( ( rule__DAdditiveExpression__Group_1__0 )* ) )
            // InternalDmx.g:3673:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3673:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            // InternalDmx.g:3674:2: ( rule__DAdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3675:2: ( rule__DAdditiveExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==37) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // InternalDmx.g:3675:3: rule__DAdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DAdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group_1__0"
    // InternalDmx.g:3684:1: rule__DAdditiveExpression__Group_1__0 : rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 ;
    public final void rule__DAdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3688:1: ( rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 )
            // InternalDmx.g:3689:2: rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DAdditiveExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1__0"


    // $ANTLR start "rule__DAdditiveExpression__Group_1__0__Impl"
    // InternalDmx.g:3696:1: rule__DAdditiveExpression__Group_1__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3700:1: ( ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3701:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3701:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            // InternalDmx.g:3702:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3703:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            // InternalDmx.g:3703:3: rule__DAdditiveExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group_1__1"
    // InternalDmx.g:3711:1: rule__DAdditiveExpression__Group_1__1 : rule__DAdditiveExpression__Group_1__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3715:1: ( rule__DAdditiveExpression__Group_1__1__Impl )
            // InternalDmx.g:3716:2: rule__DAdditiveExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1__1"


    // $ANTLR start "rule__DAdditiveExpression__Group_1__1__Impl"
    // InternalDmx.g:3722:1: rule__DAdditiveExpression__Group_1__1__Impl : ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3726:1: ( ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3727:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3727:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3728:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3729:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3729:3: rule__DAdditiveExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0__0"
    // InternalDmx.g:3738:1: rule__DAdditiveExpression__Group_1_0__0 : rule__DAdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3742:1: ( rule__DAdditiveExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3743:2: rule__DAdditiveExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0__0"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0__0__Impl"
    // InternalDmx.g:3749:1: rule__DAdditiveExpression__Group_1_0__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3753:1: ( ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3754:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3754:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3755:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3756:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            // InternalDmx.g:3756:3: rule__DAdditiveExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0_0__0"
    // InternalDmx.g:3765:1: rule__DAdditiveExpression__Group_1_0_0__0 : rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3769:1: ( rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 )
            // InternalDmx.g:3770:2: rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_26);
            rule__DAdditiveExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:3777:1: rule__DAdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3781:1: ( ( () ) )
            // InternalDmx.g:3782:1: ( () )
            {
            // InternalDmx.g:3782:1: ( () )
            // InternalDmx.g:3783:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3784:2: ()
            // InternalDmx.g:3784:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0_0__1"
    // InternalDmx.g:3792:1: rule__DAdditiveExpression__Group_1_0_0__1 : rule__DAdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3796:1: ( rule__DAdditiveExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3797:2: rule__DAdditiveExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DAdditiveExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:3803:1: rule__DAdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3807:1: ( ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3808:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3808:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3809:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3810:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3810:3: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DAdditiveExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DAdditiveExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group__0"
    // InternalDmx.g:3819:1: rule__DMultiplicativeExpression__Group__0 : rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 ;
    public final void rule__DMultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3823:1: ( rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 )
            // InternalDmx.g:3824:2: rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__DMultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group__0"


    // $ANTLR start "rule__DMultiplicativeExpression__Group__0__Impl"
    // InternalDmx.g:3831:1: rule__DMultiplicativeExpression__Group__0__Impl : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3835:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:3836:1: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:3836:1: ( ruleDUnaryOperation )
            // InternalDmx.g:3837:2: ruleDUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group__1"
    // InternalDmx.g:3846:1: rule__DMultiplicativeExpression__Group__1 : rule__DMultiplicativeExpression__Group__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3850:1: ( rule__DMultiplicativeExpression__Group__1__Impl )
            // InternalDmx.g:3851:2: rule__DMultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group__1"


    // $ANTLR start "rule__DMultiplicativeExpression__Group__1__Impl"
    // InternalDmx.g:3857:1: rule__DMultiplicativeExpression__Group__1__Impl : ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__DMultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3861:1: ( ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) )
            // InternalDmx.g:3862:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3862:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            // InternalDmx.g:3863:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3864:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA37_2 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA37_3 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA37_4 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA37_5 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // InternalDmx.g:3864:3: rule__DMultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__DMultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1__0"
    // InternalDmx.g:3873:1: rule__DMultiplicativeExpression__Group_1__0 : rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 ;
    public final void rule__DMultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3877:1: ( rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 )
            // InternalDmx.g:3878:2: rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DMultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1__0__Impl"
    // InternalDmx.g:3885:1: rule__DMultiplicativeExpression__Group_1__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3889:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3890:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3890:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            // InternalDmx.g:3891:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3892:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            // InternalDmx.g:3892:3: rule__DMultiplicativeExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1__1"
    // InternalDmx.g:3900:1: rule__DMultiplicativeExpression__Group_1__1 : rule__DMultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3904:1: ( rule__DMultiplicativeExpression__Group_1__1__Impl )
            // InternalDmx.g:3905:2: rule__DMultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1__1__Impl"
    // InternalDmx.g:3911:1: rule__DMultiplicativeExpression__Group_1__1__Impl : ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3915:1: ( ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3916:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3916:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3917:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3918:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3918:3: rule__DMultiplicativeExpression__RightOperandAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__RightOperandAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0__0"
    // InternalDmx.g:3927:1: rule__DMultiplicativeExpression__Group_1_0__0 : rule__DMultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3931:1: ( rule__DMultiplicativeExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3932:2: rule__DMultiplicativeExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0__0"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0__0__Impl"
    // InternalDmx.g:3938:1: rule__DMultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3942:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3943:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3943:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3944:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3945:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            // InternalDmx.g:3945:3: rule__DMultiplicativeExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0_0__0"
    // InternalDmx.g:3954:1: rule__DMultiplicativeExpression__Group_1_0_0__0 : rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3958:1: ( rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 )
            // InternalDmx.g:3959:2: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_28);
            rule__DMultiplicativeExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:3966:1: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3970:1: ( ( () ) )
            // InternalDmx.g:3971:1: ( () )
            {
            // InternalDmx.g:3971:1: ( () )
            // InternalDmx.g:3972:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3973:2: ()
            // InternalDmx.g:3973:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0_0__1"
    // InternalDmx.g:3981:1: rule__DMultiplicativeExpression__Group_1_0_0__1 : rule__DMultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3985:1: ( rule__DMultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3986:2: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DMultiplicativeExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:3992:1: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3996:1: ( ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3997:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3997:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3998:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3999:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3999:3: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DUnaryOperation__Group_0__0"
    // InternalDmx.g:4008:1: rule__DUnaryOperation__Group_0__0 : rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 ;
    public final void rule__DUnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4012:1: ( rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 )
            // InternalDmx.g:4013:2: rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__DUnaryOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DUnaryOperation__Group_0__0"


    // $ANTLR start "rule__DUnaryOperation__Group_0__0__Impl"
    // InternalDmx.g:4020:1: rule__DUnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__DUnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4024:1: ( ( () ) )
            // InternalDmx.g:4025:1: ( () )
            {
            // InternalDmx.g:4025:1: ( () )
            // InternalDmx.g:4026:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0()); 
            }
            // InternalDmx.g:4027:2: ()
            // InternalDmx.g:4027:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DUnaryOperation__Group_0__0__Impl"


    // $ANTLR start "rule__DUnaryOperation__Group_0__1"
    // InternalDmx.g:4035:1: rule__DUnaryOperation__Group_0__1 : rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 ;
    public final void rule__DUnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4039:1: ( rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 )
            // InternalDmx.g:4040:2: rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DUnaryOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DUnaryOperation__Group_0__1"


    // $ANTLR start "rule__DUnaryOperation__Group_0__1__Impl"
    // InternalDmx.g:4047:1: rule__DUnaryOperation__Group_0__1__Impl : ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__DUnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4051:1: ( ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalDmx.g:4052:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalDmx.g:4052:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            // InternalDmx.g:4053:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalDmx.g:4054:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            // InternalDmx.g:4054:3: rule__DUnaryOperation__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__OperatorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1()); 
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
    // $ANTLR end "rule__DUnaryOperation__Group_0__1__Impl"


    // $ANTLR start "rule__DUnaryOperation__Group_0__2"
    // InternalDmx.g:4062:1: rule__DUnaryOperation__Group_0__2 : rule__DUnaryOperation__Group_0__2__Impl ;
    public final void rule__DUnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4066:1: ( rule__DUnaryOperation__Group_0__2__Impl )
            // InternalDmx.g:4067:2: rule__DUnaryOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DUnaryOperation__Group_0__2"


    // $ANTLR start "rule__DUnaryOperation__Group_0__2__Impl"
    // InternalDmx.g:4073:1: rule__DUnaryOperation__Group_0__2__Impl : ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__DUnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4077:1: ( ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalDmx.g:4078:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalDmx.g:4078:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            // InternalDmx.g:4079:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalDmx.g:4080:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            // InternalDmx.g:4080:3: rule__DUnaryOperation__OperandAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DUnaryOperation__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2()); 
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
    // $ANTLR end "rule__DUnaryOperation__Group_0__2__Impl"


    // $ANTLR start "rule__DCastExpression__Group__0"
    // InternalDmx.g:4089:1: rule__DCastExpression__Group__0 : rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 ;
    public final void rule__DCastExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4093:1: ( rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 )
            // InternalDmx.g:4094:2: rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__DCastExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group__0"


    // $ANTLR start "rule__DCastExpression__Group__0__Impl"
    // InternalDmx.g:4101:1: rule__DCastExpression__Group__0__Impl : ( ruleDTypedMemberReference ) ;
    public final void rule__DCastExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4105:1: ( ( ruleDTypedMemberReference ) )
            // InternalDmx.g:4106:1: ( ruleDTypedMemberReference )
            {
            // InternalDmx.g:4106:1: ( ruleDTypedMemberReference )
            // InternalDmx.g:4107:2: ruleDTypedMemberReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0()); 
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
    // $ANTLR end "rule__DCastExpression__Group__0__Impl"


    // $ANTLR start "rule__DCastExpression__Group__1"
    // InternalDmx.g:4116:1: rule__DCastExpression__Group__1 : rule__DCastExpression__Group__1__Impl ;
    public final void rule__DCastExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4120:1: ( rule__DCastExpression__Group__1__Impl )
            // InternalDmx.g:4121:2: rule__DCastExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group__1"


    // $ANTLR start "rule__DCastExpression__Group__1__Impl"
    // InternalDmx.g:4127:1: rule__DCastExpression__Group__1__Impl : ( ( rule__DCastExpression__Group_1__0 )? ) ;
    public final void rule__DCastExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4131:1: ( ( ( rule__DCastExpression__Group_1__0 )? ) )
            // InternalDmx.g:4132:1: ( ( rule__DCastExpression__Group_1__0 )? )
            {
            // InternalDmx.g:4132:1: ( ( rule__DCastExpression__Group_1__0 )? )
            // InternalDmx.g:4133:2: ( rule__DCastExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:4134:2: ( rule__DCastExpression__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred64_InternalDmx()) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==20) ) {
                int LA38_2 = input.LA(2);

                if ( (synpred64_InternalDmx()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalDmx.g:4134:3: rule__DCastExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DCastExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DCastExpression__Group__1__Impl"


    // $ANTLR start "rule__DCastExpression__Group_1__0"
    // InternalDmx.g:4143:1: rule__DCastExpression__Group_1__0 : rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 ;
    public final void rule__DCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4147:1: ( rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 )
            // InternalDmx.g:4148:2: rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DCastExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1__0"


    // $ANTLR start "rule__DCastExpression__Group_1__0__Impl"
    // InternalDmx.g:4155:1: rule__DCastExpression__Group_1__0__Impl : ( ( rule__DCastExpression__Group_1_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4159:1: ( ( ( rule__DCastExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:4160:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:4160:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            // InternalDmx.g:4161:2: ( rule__DCastExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:4162:2: ( rule__DCastExpression__Group_1_0__0 )
            // InternalDmx.g:4162:3: rule__DCastExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__DCastExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DCastExpression__Group_1__1"
    // InternalDmx.g:4170:1: rule__DCastExpression__Group_1__1 : rule__DCastExpression__Group_1__1__Impl ;
    public final void rule__DCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4174:1: ( rule__DCastExpression__Group_1__1__Impl )
            // InternalDmx.g:4175:2: rule__DCastExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1__1"


    // $ANTLR start "rule__DCastExpression__Group_1__1__Impl"
    // InternalDmx.g:4181:1: rule__DCastExpression__Group_1__1__Impl : ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__DCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4185:1: ( ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) )
            // InternalDmx.g:4186:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            {
            // InternalDmx.g:4186:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            // InternalDmx.g:4187:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalDmx.g:4188:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            // InternalDmx.g:4188:3: rule__DCastExpression__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__DCastExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DCastExpression__Group_1_0__0"
    // InternalDmx.g:4197:1: rule__DCastExpression__Group_1_0__0 : rule__DCastExpression__Group_1_0__0__Impl ;
    public final void rule__DCastExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4201:1: ( rule__DCastExpression__Group_1_0__0__Impl )
            // InternalDmx.g:4202:2: rule__DCastExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1_0__0"


    // $ANTLR start "rule__DCastExpression__Group_1_0__0__Impl"
    // InternalDmx.g:4208:1: rule__DCastExpression__Group_1_0__0__Impl : ( ( rule__DCastExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4212:1: ( ( ( rule__DCastExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4213:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4213:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:4214:2: ( rule__DCastExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4215:2: ( rule__DCastExpression__Group_1_0_0__0 )
            // InternalDmx.g:4215:3: rule__DCastExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DCastExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__DCastExpression__Group_1_0_0__0"
    // InternalDmx.g:4224:1: rule__DCastExpression__Group_1_0_0__0 : rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 ;
    public final void rule__DCastExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4228:1: ( rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 )
            // InternalDmx.g:4229:2: rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_31);
            rule__DCastExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1_0_0__0"


    // $ANTLR start "rule__DCastExpression__Group_1_0_0__0__Impl"
    // InternalDmx.g:4236:1: rule__DCastExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DCastExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4240:1: ( ( () ) )
            // InternalDmx.g:4241:1: ( () )
            {
            // InternalDmx.g:4241:1: ( () )
            // InternalDmx.g:4242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()); 
            }
            // InternalDmx.g:4243:2: ()
            // InternalDmx.g:4243:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DCastExpression__Group_1_0_0__1"
    // InternalDmx.g:4251:1: rule__DCastExpression__Group_1_0_0__1 : rule__DCastExpression__Group_1_0_0__1__Impl ;
    public final void rule__DCastExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4255:1: ( rule__DCastExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:4256:2: rule__DCastExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DCastExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DCastExpression__Group_1_0_0__1"


    // $ANTLR start "rule__DCastExpression__Group_1_0_0__1__Impl"
    // InternalDmx.g:4262:1: rule__DCastExpression__Group_1_0_0__1__Impl : ( ruleOpCast ) ;
    public final void rule__DCastExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4266:1: ( ( ruleOpCast ) )
            // InternalDmx.g:4267:1: ( ruleOpCast )
            {
            // InternalDmx.g:4267:1: ( ruleOpCast )
            // InternalDmx.g:4268:2: ruleOpCast
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getOpCastParserRuleCall_1_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpCast();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getOpCastParserRuleCall_1_0_0_1()); 
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
    // $ANTLR end "rule__DCastExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group__0"
    // InternalDmx.g:4278:1: rule__DTypedMemberReference__Group__0 : rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 ;
    public final void rule__DTypedMemberReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4282:1: ( rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 )
            // InternalDmx.g:4283:2: rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DTypedMemberReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group__0"


    // $ANTLR start "rule__DTypedMemberReference__Group__0__Impl"
    // InternalDmx.g:4290:1: rule__DTypedMemberReference__Group__0__Impl : ( ruleDPrimaryExpression ) ;
    public final void rule__DTypedMemberReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4294:1: ( ( ruleDPrimaryExpression ) )
            // InternalDmx.g:4295:1: ( ruleDPrimaryExpression )
            {
            // InternalDmx.g:4295:1: ( ruleDPrimaryExpression )
            // InternalDmx.g:4296:2: ruleDPrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group__1"
    // InternalDmx.g:4305:1: rule__DTypedMemberReference__Group__1 : rule__DTypedMemberReference__Group__1__Impl ;
    public final void rule__DTypedMemberReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4309:1: ( rule__DTypedMemberReference__Group__1__Impl )
            // InternalDmx.g:4310:2: rule__DTypedMemberReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group__1"


    // $ANTLR start "rule__DTypedMemberReference__Group__1__Impl"
    // InternalDmx.g:4316:1: rule__DTypedMemberReference__Group__1__Impl : ( ( rule__DTypedMemberReference__Alternatives_1 )* ) ;
    public final void rule__DTypedMemberReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4320:1: ( ( ( rule__DTypedMemberReference__Alternatives_1 )* ) )
            // InternalDmx.g:4321:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            {
            // InternalDmx.g:4321:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            // InternalDmx.g:4322:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4323:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==66) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred65_InternalDmx()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalDmx.g:4323:3: rule__DTypedMemberReference__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DTypedMemberReference__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0__0"
    // InternalDmx.g:4332:1: rule__DTypedMemberReference__Group_1_0__0 : rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4336:1: ( rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 )
            // InternalDmx.g:4337:2: rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DTypedMemberReference__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0__0__Impl"
    // InternalDmx.g:4344:1: rule__DTypedMemberReference__Group_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4348:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4349:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4349:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            // InternalDmx.g:4350:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4351:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            // InternalDmx.g:4351:3: rule__DTypedMemberReference__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0__1"
    // InternalDmx.g:4359:1: rule__DTypedMemberReference__Group_1_0__1 : rule__DTypedMemberReference__Group_1_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4363:1: ( rule__DTypedMemberReference__Group_1_0__1__Impl )
            // InternalDmx.g:4364:2: rule__DTypedMemberReference__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0__1__Impl"
    // InternalDmx.g:4370:1: rule__DTypedMemberReference__Group_1_0__1__Impl : ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4374:1: ( ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) )
            // InternalDmx.g:4375:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            {
            // InternalDmx.g:4375:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            // InternalDmx.g:4376:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getValueAssignment_1_0_1()); 
            }
            // InternalDmx.g:4377:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            // InternalDmx.g:4377:3: rule__DTypedMemberReference__ValueAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__ValueAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getValueAssignment_1_0_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0__0"
    // InternalDmx.g:4386:1: rule__DTypedMemberReference__Group_1_0_0__0 : rule__DTypedMemberReference__Group_1_0_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4390:1: ( rule__DTypedMemberReference__Group_1_0_0__0__Impl )
            // InternalDmx.g:4391:2: rule__DTypedMemberReference__Group_1_0_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0__0__Impl"
    // InternalDmx.g:4397:1: rule__DTypedMemberReference__Group_1_0_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4401:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:4402:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:4402:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            // InternalDmx.g:4403:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:4404:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            // InternalDmx.g:4404:3: rule__DTypedMemberReference__Group_1_0_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__0"
    // InternalDmx.g:4413:1: rule__DTypedMemberReference__Group_1_0_0_0__0 : rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4417:1: ( rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 )
            // InternalDmx.g:4418:2: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__DTypedMemberReference__Group_1_0_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__0__Impl"
    // InternalDmx.g:4425:1: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4429:1: ( ( () ) )
            // InternalDmx.g:4430:1: ( () )
            {
            // InternalDmx.g:4430:1: ( () )
            // InternalDmx.g:4431:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:4432:2: ()
            // InternalDmx.g:4432:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__1"
    // InternalDmx.g:4440:1: rule__DTypedMemberReference__Group_1_0_0_0__1 : rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4444:1: ( rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 )
            // InternalDmx.g:4445:2: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2
            {
            pushFollow(FOLLOW_13);
            rule__DTypedMemberReference__Group_1_0_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__1__Impl"
    // InternalDmx.g:4452:1: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4456:1: ( ( '.' ) )
            // InternalDmx.g:4457:1: ( '.' )
            {
            // InternalDmx.g:4457:1: ( '.' )
            // InternalDmx.g:4458:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__2"
    // InternalDmx.g:4467:1: rule__DTypedMemberReference__Group_1_0_0_0__2 : rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4471:1: ( rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 )
            // InternalDmx.g:4472:2: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3
            {
            pushFollow(FOLLOW_14);
            rule__DTypedMemberReference__Group_1_0_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__2"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__2__Impl"
    // InternalDmx.g:4479:1: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4483:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) )
            // InternalDmx.g:4484:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            {
            // InternalDmx.g:4484:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            // InternalDmx.g:4485:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_0_0_0_2()); 
            }
            // InternalDmx.g:4486:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            // InternalDmx.g:4486:3: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_0_0_0_2()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__2__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__3"
    // InternalDmx.g:4494:1: rule__DTypedMemberReference__Group_1_0_0_0__3 : rule__DTypedMemberReference__Group_1_0_0_0__3__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4498:1: ( rule__DTypedMemberReference__Group_1_0_0_0__3__Impl )
            // InternalDmx.g:4499:2: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_0_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__3"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_0_0_0__3__Impl"
    // InternalDmx.g:4505:1: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4509:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:4510:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:4510:1: ( ruleOpSingleAssign )
            // InternalDmx.g:4511:2: ruleOpSingleAssign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_0_0_0__3__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__0"
    // InternalDmx.g:4521:1: rule__DTypedMemberReference__Group_1_1__0 : rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4525:1: ( rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 )
            // InternalDmx.g:4526:2: rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DTypedMemberReference__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__0__Impl"
    // InternalDmx.g:4533:1: rule__DTypedMemberReference__Group_1_1__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4537:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) )
            // InternalDmx.g:4538:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:4538:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            // InternalDmx.g:4539:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:4540:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            // InternalDmx.g:4540:3: rule__DTypedMemberReference__Group_1_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__1"
    // InternalDmx.g:4548:1: rule__DTypedMemberReference__Group_1_1__1 : rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 ;
    public final void rule__DTypedMemberReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4552:1: ( rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 )
            // InternalDmx.g:4553:2: rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2
            {
            pushFollow(FOLLOW_34);
            rule__DTypedMemberReference__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__1__Impl"
    // InternalDmx.g:4560:1: rule__DTypedMemberReference__Group_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4564:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) )
            // InternalDmx.g:4565:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            {
            // InternalDmx.g:4565:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            // InternalDmx.g:4566:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_1_1()); 
            }
            // InternalDmx.g:4567:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            // InternalDmx.g:4567:3: rule__DTypedMemberReference__MemberAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_1_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__2"
    // InternalDmx.g:4575:1: rule__DTypedMemberReference__Group_1_1__2 : rule__DTypedMemberReference__Group_1_1__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4579:1: ( rule__DTypedMemberReference__Group_1_1__2__Impl )
            // InternalDmx.g:4580:2: rule__DTypedMemberReference__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__2"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1__2__Impl"
    // InternalDmx.g:4586:1: rule__DTypedMemberReference__Group_1_1__2__Impl : ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4590:1: ( ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? ) )
            // InternalDmx.g:4591:1: ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? )
            {
            // InternalDmx.g:4591:1: ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? )
            // InternalDmx.g:4592:2: ( rule__DTypedMemberReference__Alternatives_1_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1_1_2()); 
            }
            // InternalDmx.g:4593:2: ( rule__DTypedMemberReference__Alternatives_1_1_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==69||LA40_0==76) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDmx.g:4593:3: rule__DTypedMemberReference__Alternatives_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Alternatives_1_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1_1_2()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1__2__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0__0"
    // InternalDmx.g:4602:1: rule__DTypedMemberReference__Group_1_1_0__0 : rule__DTypedMemberReference__Group_1_1_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4606:1: ( rule__DTypedMemberReference__Group_1_1_0__0__Impl )
            // InternalDmx.g:4607:2: rule__DTypedMemberReference__Group_1_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0__0__Impl"
    // InternalDmx.g:4613:1: rule__DTypedMemberReference__Group_1_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4617:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:4618:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:4618:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            // InternalDmx.g:4619:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:4620:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            // InternalDmx.g:4620:3: rule__DTypedMemberReference__Group_1_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0_0__0"
    // InternalDmx.g:4629:1: rule__DTypedMemberReference__Group_1_1_0_0__0 : rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4633:1: ( rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 )
            // InternalDmx.g:4634:2: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__DTypedMemberReference__Group_1_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0_0__0__Impl"
    // InternalDmx.g:4641:1: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4645:1: ( ( () ) )
            // InternalDmx.g:4646:1: ( () )
            {
            // InternalDmx.g:4646:1: ( () )
            // InternalDmx.g:4647:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:4648:2: ()
            // InternalDmx.g:4648:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0_0__1"
    // InternalDmx.g:4656:1: rule__DTypedMemberReference__Group_1_1_0_0__1 : rule__DTypedMemberReference__Group_1_1_0_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4660:1: ( rule__DTypedMemberReference__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:4661:2: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0_0__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_0_0__1__Impl"
    // InternalDmx.g:4667:1: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4671:1: ( ( '.' ) )
            // InternalDmx.g:4672:1: ( '.' )
            {
            // InternalDmx.g:4672:1: ( '.' )
            // InternalDmx.g:4673:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_0_0__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__0"
    // InternalDmx.g:4683:1: rule__DTypedMemberReference__Group_1_1_2_0__0 : rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4687:1: ( rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1 )
            // InternalDmx.g:4688:2: rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1
            {
            pushFollow(FOLLOW_35);
            rule__DTypedMemberReference__Group_1_1_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__0__Impl"
    // InternalDmx.g:4695:1: rule__DTypedMemberReference__Group_1_1_2_0__0__Impl : ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4699:1: ( ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) ) )
            // InternalDmx.g:4700:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) )
            {
            // InternalDmx.g:4700:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) )
            // InternalDmx.g:4701:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0_0()); 
            }
            // InternalDmx.g:4702:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 )
            // InternalDmx.g:4702:3: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__1"
    // InternalDmx.g:4710:1: rule__DTypedMemberReference__Group_1_1_2_0__1 : rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4714:1: ( rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2 )
            // InternalDmx.g:4715:2: rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2
            {
            pushFollow(FOLLOW_35);
            rule__DTypedMemberReference__Group_1_1_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__1__Impl"
    // InternalDmx.g:4722:1: rule__DTypedMemberReference__Group_1_1_2_0__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4726:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? ) )
            // InternalDmx.g:4727:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? )
            {
            // InternalDmx.g:4727:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? )
            // InternalDmx.g:4728:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1()); 
            }
            // InternalDmx.g:4729:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_NATURAL && LA41_0<=RULE_ID)||LA41_0==RULE_STRING||(LA41_0>=21 && LA41_0<=28)||(LA41_0>=30 && LA41_0<=33)||(LA41_0>=36 && LA41_0<=37)||(LA41_0>=59 && LA41_0<=61)||(LA41_0>=69 && LA41_0<=70)||LA41_0==75||(LA41_0>=77 && LA41_0<=78)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmx.g:4729:3: rule__DTypedMemberReference__Group_1_1_2_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_1_2_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__2"
    // InternalDmx.g:4737:1: rule__DTypedMemberReference__Group_1_1_2_0__2 : rule__DTypedMemberReference__Group_1_1_2_0__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4741:1: ( rule__DTypedMemberReference__Group_1_1_2_0__2__Impl )
            // InternalDmx.g:4742:2: rule__DTypedMemberReference__Group_1_1_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__2"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0__2__Impl"
    // InternalDmx.g:4748:1: rule__DTypedMemberReference__Group_1_1_2_0__2__Impl : ( ')' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4752:1: ( ( ')' ) )
            // InternalDmx.g:4753:1: ( ')' )
            {
            // InternalDmx.g:4753:1: ( ')' )
            // InternalDmx.g:4754:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0__2__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1__0"
    // InternalDmx.g:4764:1: rule__DTypedMemberReference__Group_1_1_2_0_1__0 : rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4768:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1 )
            // InternalDmx.g:4769:2: rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1
            {
            pushFollow(FOLLOW_36);
            rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl"
    // InternalDmx.g:4776:1: rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4780:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) ) )
            // InternalDmx.g:4781:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) )
            {
            // InternalDmx.g:4781:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) )
            // InternalDmx.g:4782:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_0()); 
            }
            // InternalDmx.g:4783:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 )
            // InternalDmx.g:4783:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1__1"
    // InternalDmx.g:4791:1: rule__DTypedMemberReference__Group_1_1_2_0_1__1 : rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4795:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl )
            // InternalDmx.g:4796:2: rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl"
    // InternalDmx.g:4802:1: rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4806:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* ) )
            // InternalDmx.g:4807:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* )
            {
            // InternalDmx.g:4807:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* )
            // InternalDmx.g:4808:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1_1()); 
            }
            // InternalDmx.g:4809:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==68) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDmx.g:4809:3: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DTypedMemberReference__Group_1_1_2_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1_1__0"
    // InternalDmx.g:4818:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 : rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4822:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 )
            // InternalDmx.g:4823:2: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1_1__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl"
    // InternalDmx.g:4830:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4834:1: ( ( ',' ) )
            // InternalDmx.g:4835:1: ( ',' )
            {
            // InternalDmx.g:4835:1: ( ',' )
            // InternalDmx.g:4836:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1_1__1"
    // InternalDmx.g:4845:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 : rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4849:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl )
            // InternalDmx.g:4850:2: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1_1__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl"
    // InternalDmx.g:4856:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4860:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) ) )
            // InternalDmx.g:4861:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) )
            {
            // InternalDmx.g:4861:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) )
            // InternalDmx.g:4862:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_1_1()); 
            }
            // InternalDmx.g:4863:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 )
            // InternalDmx.g:4863:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_1_1()); 
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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl"


    // $ANTLR start "rule__DSelfExpression__Group__0"
    // InternalDmx.g:4872:1: rule__DSelfExpression__Group__0 : rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 ;
    public final void rule__DSelfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4876:1: ( rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 )
            // InternalDmx.g:4877:2: rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__DSelfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DSelfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSelfExpression__Group__0"


    // $ANTLR start "rule__DSelfExpression__Group__0__Impl"
    // InternalDmx.g:4884:1: rule__DSelfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DSelfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4888:1: ( ( () ) )
            // InternalDmx.g:4889:1: ( () )
            {
            // InternalDmx.g:4889:1: ( () )
            // InternalDmx.g:4890:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0()); 
            }
            // InternalDmx.g:4891:2: ()
            // InternalDmx.g:4891:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSelfExpression__Group__0__Impl"


    // $ANTLR start "rule__DSelfExpression__Group__1"
    // InternalDmx.g:4899:1: rule__DSelfExpression__Group__1 : rule__DSelfExpression__Group__1__Impl ;
    public final void rule__DSelfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4903:1: ( rule__DSelfExpression__Group__1__Impl )
            // InternalDmx.g:4904:2: rule__DSelfExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSelfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSelfExpression__Group__1"


    // $ANTLR start "rule__DSelfExpression__Group__1__Impl"
    // InternalDmx.g:4910:1: rule__DSelfExpression__Group__1__Impl : ( ( rule__DSelfExpression__Alternatives_1 ) ) ;
    public final void rule__DSelfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4914:1: ( ( ( rule__DSelfExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4915:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4915:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            // InternalDmx.g:4916:2: ( rule__DSelfExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4917:2: ( rule__DSelfExpression__Alternatives_1 )
            // InternalDmx.g:4917:3: rule__DSelfExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DSelfExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDSelfExpressionAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DSelfExpression__Group__1__Impl"


    // $ANTLR start "rule__DReturnExpression__Group__0"
    // InternalDmx.g:4926:1: rule__DReturnExpression__Group__0 : rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 ;
    public final void rule__DReturnExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4930:1: ( rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 )
            // InternalDmx.g:4931:2: rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__DReturnExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DReturnExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DReturnExpression__Group__0"


    // $ANTLR start "rule__DReturnExpression__Group__0__Impl"
    // InternalDmx.g:4938:1: rule__DReturnExpression__Group__0__Impl : ( () ) ;
    public final void rule__DReturnExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4942:1: ( ( () ) )
            // InternalDmx.g:4943:1: ( () )
            {
            // InternalDmx.g:4943:1: ( () )
            // InternalDmx.g:4944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0()); 
            }
            // InternalDmx.g:4945:2: ()
            // InternalDmx.g:4945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DReturnExpression__Group__0__Impl"


    // $ANTLR start "rule__DReturnExpression__Group__1"
    // InternalDmx.g:4953:1: rule__DReturnExpression__Group__1 : rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 ;
    public final void rule__DReturnExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4957:1: ( rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 )
            // InternalDmx.g:4958:2: rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DReturnExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DReturnExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DReturnExpression__Group__1"


    // $ANTLR start "rule__DReturnExpression__Group__1__Impl"
    // InternalDmx.g:4965:1: rule__DReturnExpression__Group__1__Impl : ( ( rule__DReturnExpression__Alternatives_1 ) ) ;
    public final void rule__DReturnExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4969:1: ( ( ( rule__DReturnExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4970:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4970:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            // InternalDmx.g:4971:2: ( rule__DReturnExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4972:2: ( rule__DReturnExpression__Alternatives_1 )
            // InternalDmx.g:4972:3: rule__DReturnExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DReturnExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DReturnExpression__Group__1__Impl"


    // $ANTLR start "rule__DReturnExpression__Group__2"
    // InternalDmx.g:4980:1: rule__DReturnExpression__Group__2 : rule__DReturnExpression__Group__2__Impl ;
    public final void rule__DReturnExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4984:1: ( rule__DReturnExpression__Group__2__Impl )
            // InternalDmx.g:4985:2: rule__DReturnExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DReturnExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DReturnExpression__Group__2"


    // $ANTLR start "rule__DReturnExpression__Group__2__Impl"
    // InternalDmx.g:4991:1: rule__DReturnExpression__Group__2__Impl : ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) ;
    public final void rule__DReturnExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4995:1: ( ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) )
            // InternalDmx.g:4996:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            {
            // InternalDmx.g:4996:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            // InternalDmx.g:4997:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:4998:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalDmx.g:4998:3: rule__DReturnExpression__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DReturnExpression__ExpressionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__DReturnExpression__Group__2__Impl"


    // $ANTLR start "rule__DRaiseExpression__Group__0"
    // InternalDmx.g:5007:1: rule__DRaiseExpression__Group__0 : rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 ;
    public final void rule__DRaiseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5011:1: ( rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 )
            // InternalDmx.g:5012:2: rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__DRaiseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRaiseExpression__Group__0"


    // $ANTLR start "rule__DRaiseExpression__Group__0__Impl"
    // InternalDmx.g:5019:1: rule__DRaiseExpression__Group__0__Impl : ( () ) ;
    public final void rule__DRaiseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5023:1: ( ( () ) )
            // InternalDmx.g:5024:1: ( () )
            {
            // InternalDmx.g:5024:1: ( () )
            // InternalDmx.g:5025:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0()); 
            }
            // InternalDmx.g:5026:2: ()
            // InternalDmx.g:5026:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRaiseExpression__Group__0__Impl"


    // $ANTLR start "rule__DRaiseExpression__Group__1"
    // InternalDmx.g:5034:1: rule__DRaiseExpression__Group__1 : rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 ;
    public final void rule__DRaiseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5038:1: ( rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 )
            // InternalDmx.g:5039:2: rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DRaiseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRaiseExpression__Group__1"


    // $ANTLR start "rule__DRaiseExpression__Group__1__Impl"
    // InternalDmx.g:5046:1: rule__DRaiseExpression__Group__1__Impl : ( ( rule__DRaiseExpression__Alternatives_1 ) ) ;
    public final void rule__DRaiseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5050:1: ( ( ( rule__DRaiseExpression__Alternatives_1 ) ) )
            // InternalDmx.g:5051:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:5051:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            // InternalDmx.g:5052:2: ( rule__DRaiseExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:5053:2: ( rule__DRaiseExpression__Alternatives_1 )
            // InternalDmx.g:5053:3: rule__DRaiseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DRaiseExpression__Group__1__Impl"


    // $ANTLR start "rule__DRaiseExpression__Group__2"
    // InternalDmx.g:5061:1: rule__DRaiseExpression__Group__2 : rule__DRaiseExpression__Group__2__Impl ;
    public final void rule__DRaiseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5065:1: ( rule__DRaiseExpression__Group__2__Impl )
            // InternalDmx.g:5066:2: rule__DRaiseExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRaiseExpression__Group__2"


    // $ANTLR start "rule__DRaiseExpression__Group__2__Impl"
    // InternalDmx.g:5072:1: rule__DRaiseExpression__Group__2__Impl : ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__DRaiseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5076:1: ( ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) )
            // InternalDmx.g:5077:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            {
            // InternalDmx.g:5077:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            // InternalDmx.g:5078:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:5079:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            // InternalDmx.g:5079:3: rule__DRaiseExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DRaiseExpression__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__DRaiseExpression__Group__2__Impl"


    // $ANTLR start "rule__DParenthesizedExpression__Group__0"
    // InternalDmx.g:5088:1: rule__DParenthesizedExpression__Group__0 : rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 ;
    public final void rule__DParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5092:1: ( rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 )
            // InternalDmx.g:5093:2: rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DParenthesizedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DParenthesizedExpression__Group__0"


    // $ANTLR start "rule__DParenthesizedExpression__Group__0__Impl"
    // InternalDmx.g:5100:1: rule__DParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__DParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5104:1: ( ( '(' ) )
            // InternalDmx.g:5105:1: ( '(' )
            {
            // InternalDmx.g:5105:1: ( '(' )
            // InternalDmx.g:5106:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__DParenthesizedExpression__Group__0__Impl"


    // $ANTLR start "rule__DParenthesizedExpression__Group__1"
    // InternalDmx.g:5115:1: rule__DParenthesizedExpression__Group__1 : rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 ;
    public final void rule__DParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5119:1: ( rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 )
            // InternalDmx.g:5120:2: rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__DParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DParenthesizedExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DParenthesizedExpression__Group__1"


    // $ANTLR start "rule__DParenthesizedExpression__Group__1__Impl"
    // InternalDmx.g:5127:1: rule__DParenthesizedExpression__Group__1__Impl : ( ruleDExpression ) ;
    public final void rule__DParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5131:1: ( ( ruleDExpression ) )
            // InternalDmx.g:5132:1: ( ruleDExpression )
            {
            // InternalDmx.g:5132:1: ( ruleDExpression )
            // InternalDmx.g:5133:2: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__DParenthesizedExpression__Group__1__Impl"


    // $ANTLR start "rule__DParenthesizedExpression__Group__2"
    // InternalDmx.g:5142:1: rule__DParenthesizedExpression__Group__2 : rule__DParenthesizedExpression__Group__2__Impl ;
    public final void rule__DParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5146:1: ( rule__DParenthesizedExpression__Group__2__Impl )
            // InternalDmx.g:5147:2: rule__DParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DParenthesizedExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DParenthesizedExpression__Group__2"


    // $ANTLR start "rule__DParenthesizedExpression__Group__2__Impl"
    // InternalDmx.g:5153:1: rule__DParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__DParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5157:1: ( ( ')' ) )
            // InternalDmx.g:5158:1: ( ')' )
            {
            // InternalDmx.g:5158:1: ( ')' )
            // InternalDmx.g:5159:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__DParenthesizedExpression__Group__2__Impl"


    // $ANTLR start "rule__DFunctionCall__Group__0"
    // InternalDmx.g:5169:1: rule__DFunctionCall__Group__0 : rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 ;
    public final void rule__DFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5173:1: ( rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 )
            // InternalDmx.g:5174:2: rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DFunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__0"


    // $ANTLR start "rule__DFunctionCall__Group__0__Impl"
    // InternalDmx.g:5181:1: rule__DFunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__DFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5185:1: ( ( () ) )
            // InternalDmx.g:5186:1: ( () )
            {
            // InternalDmx.g:5186:1: ( () )
            // InternalDmx.g:5187:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0()); 
            }
            // InternalDmx.g:5188:2: ()
            // InternalDmx.g:5188:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__0__Impl"


    // $ANTLR start "rule__DFunctionCall__Group__1"
    // InternalDmx.g:5196:1: rule__DFunctionCall__Group__1 : rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 ;
    public final void rule__DFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5200:1: ( rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 )
            // InternalDmx.g:5201:2: rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__DFunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__1"


    // $ANTLR start "rule__DFunctionCall__Group__1__Impl"
    // InternalDmx.g:5208:1: rule__DFunctionCall__Group__1__Impl : ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__DFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5212:1: ( ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) )
            // InternalDmx.g:5213:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            {
            // InternalDmx.g:5213:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            // InternalDmx.g:5214:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // InternalDmx.g:5215:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            // InternalDmx.g:5215:3: rule__DFunctionCall__FunctionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__FunctionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1()); 
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
    // $ANTLR end "rule__DFunctionCall__Group__1__Impl"


    // $ANTLR start "rule__DFunctionCall__Group__2"
    // InternalDmx.g:5223:1: rule__DFunctionCall__Group__2 : rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 ;
    public final void rule__DFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5227:1: ( rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 )
            // InternalDmx.g:5228:2: rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__DFunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__2"


    // $ANTLR start "rule__DFunctionCall__Group__2__Impl"
    // InternalDmx.g:5235:1: rule__DFunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__DFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5239:1: ( ( '(' ) )
            // InternalDmx.g:5240:1: ( '(' )
            {
            // InternalDmx.g:5240:1: ( '(' )
            // InternalDmx.g:5241:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__DFunctionCall__Group__2__Impl"


    // $ANTLR start "rule__DFunctionCall__Group__3"
    // InternalDmx.g:5250:1: rule__DFunctionCall__Group__3 : rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 ;
    public final void rule__DFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5254:1: ( rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 )
            // InternalDmx.g:5255:2: rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__DFunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__3"


    // $ANTLR start "rule__DFunctionCall__Group__3__Impl"
    // InternalDmx.g:5262:1: rule__DFunctionCall__Group__3__Impl : ( ( rule__DFunctionCall__Group_3__0 )? ) ;
    public final void rule__DFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5266:1: ( ( ( rule__DFunctionCall__Group_3__0 )? ) )
            // InternalDmx.g:5267:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            {
            // InternalDmx.g:5267:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            // InternalDmx.g:5268:2: ( rule__DFunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5269:2: ( rule__DFunctionCall__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_NATURAL && LA44_0<=RULE_ID)||LA44_0==RULE_STRING||(LA44_0>=21 && LA44_0<=28)||(LA44_0>=30 && LA44_0<=33)||(LA44_0>=36 && LA44_0<=37)||(LA44_0>=59 && LA44_0<=61)||(LA44_0>=69 && LA44_0<=70)||LA44_0==75||(LA44_0>=77 && LA44_0<=78)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDmx.g:5269:3: rule__DFunctionCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DFunctionCall__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DFunctionCall__Group__3__Impl"


    // $ANTLR start "rule__DFunctionCall__Group__4"
    // InternalDmx.g:5277:1: rule__DFunctionCall__Group__4 : rule__DFunctionCall__Group__4__Impl ;
    public final void rule__DFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5281:1: ( rule__DFunctionCall__Group__4__Impl )
            // InternalDmx.g:5282:2: rule__DFunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group__4"


    // $ANTLR start "rule__DFunctionCall__Group__4__Impl"
    // InternalDmx.g:5288:1: rule__DFunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__DFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5292:1: ( ( ')' ) )
            // InternalDmx.g:5293:1: ( ')' )
            {
            // InternalDmx.g:5293:1: ( ')' )
            // InternalDmx.g:5294:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__DFunctionCall__Group__4__Impl"


    // $ANTLR start "rule__DFunctionCall__Group_3__0"
    // InternalDmx.g:5304:1: rule__DFunctionCall__Group_3__0 : rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 ;
    public final void rule__DFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5308:1: ( rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 )
            // InternalDmx.g:5309:2: rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__DFunctionCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group_3__0"


    // $ANTLR start "rule__DFunctionCall__Group_3__0__Impl"
    // InternalDmx.g:5316:1: rule__DFunctionCall__Group_3__0__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) ;
    public final void rule__DFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5320:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) )
            // InternalDmx.g:5321:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            {
            // InternalDmx.g:5321:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            // InternalDmx.g:5322:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0()); 
            }
            // InternalDmx.g:5323:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            // InternalDmx.g:5323:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0()); 
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
    // $ANTLR end "rule__DFunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__DFunctionCall__Group_3__1"
    // InternalDmx.g:5331:1: rule__DFunctionCall__Group_3__1 : rule__DFunctionCall__Group_3__1__Impl ;
    public final void rule__DFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5335:1: ( rule__DFunctionCall__Group_3__1__Impl )
            // InternalDmx.g:5336:2: rule__DFunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group_3__1"


    // $ANTLR start "rule__DFunctionCall__Group_3__1__Impl"
    // InternalDmx.g:5342:1: rule__DFunctionCall__Group_3__1__Impl : ( ( rule__DFunctionCall__Group_3_1__0 )* ) ;
    public final void rule__DFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5346:1: ( ( ( rule__DFunctionCall__Group_3_1__0 )* ) )
            // InternalDmx.g:5347:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            {
            // InternalDmx.g:5347:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            // InternalDmx.g:5348:2: ( rule__DFunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5349:2: ( rule__DFunctionCall__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==68) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDmx.g:5349:3: rule__DFunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DFunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__DFunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__DFunctionCall__Group_3_1__0"
    // InternalDmx.g:5358:1: rule__DFunctionCall__Group_3_1__0 : rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 ;
    public final void rule__DFunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5362:1: ( rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 )
            // InternalDmx.g:5363:2: rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DFunctionCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group_3_1__0"


    // $ANTLR start "rule__DFunctionCall__Group_3_1__0__Impl"
    // InternalDmx.g:5370:1: rule__DFunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DFunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5374:1: ( ( ',' ) )
            // InternalDmx.g:5375:1: ( ',' )
            {
            // InternalDmx.g:5375:1: ( ',' )
            // InternalDmx.g:5376:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__DFunctionCall__Group_3_1__0__Impl"


    // $ANTLR start "rule__DFunctionCall__Group_3_1__1"
    // InternalDmx.g:5385:1: rule__DFunctionCall__Group_3_1__1 : rule__DFunctionCall__Group_3_1__1__Impl ;
    public final void rule__DFunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5389:1: ( rule__DFunctionCall__Group_3_1__1__Impl )
            // InternalDmx.g:5390:2: rule__DFunctionCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DFunctionCall__Group_3_1__1"


    // $ANTLR start "rule__DFunctionCall__Group_3_1__1__Impl"
    // InternalDmx.g:5396:1: rule__DFunctionCall__Group_3_1__1__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__DFunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5400:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) )
            // InternalDmx.g:5401:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            {
            // InternalDmx.g:5401:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            // InternalDmx.g:5402:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1()); 
            }
            // InternalDmx.g:5403:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            // InternalDmx.g:5403:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1()); 
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
    // $ANTLR end "rule__DFunctionCall__Group_3_1__1__Impl"


    // $ANTLR start "rule__DConstructorCall__Group__0"
    // InternalDmx.g:5412:1: rule__DConstructorCall__Group__0 : rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 ;
    public final void rule__DConstructorCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5416:1: ( rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 )
            // InternalDmx.g:5417:2: rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__DConstructorCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group__0"


    // $ANTLR start "rule__DConstructorCall__Group__0__Impl"
    // InternalDmx.g:5424:1: rule__DConstructorCall__Group__0__Impl : ( () ) ;
    public final void rule__DConstructorCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5428:1: ( ( () ) )
            // InternalDmx.g:5429:1: ( () )
            {
            // InternalDmx.g:5429:1: ( () )
            // InternalDmx.g:5430:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0()); 
            }
            // InternalDmx.g:5431:2: ()
            // InternalDmx.g:5431:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group__0__Impl"


    // $ANTLR start "rule__DConstructorCall__Group__1"
    // InternalDmx.g:5439:1: rule__DConstructorCall__Group__1 : rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 ;
    public final void rule__DConstructorCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5443:1: ( rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 )
            // InternalDmx.g:5444:2: rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DConstructorCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group__1"


    // $ANTLR start "rule__DConstructorCall__Group__1__Impl"
    // InternalDmx.g:5451:1: rule__DConstructorCall__Group__1__Impl : ( ruleOpConstructor ) ;
    public final void rule__DConstructorCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5455:1: ( ( ruleOpConstructor ) )
            // InternalDmx.g:5456:1: ( ruleOpConstructor )
            {
            // InternalDmx.g:5456:1: ( ruleOpConstructor )
            // InternalDmx.g:5457:2: ruleOpConstructor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getOpConstructorParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getOpConstructorParserRuleCall_1()); 
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
    // $ANTLR end "rule__DConstructorCall__Group__1__Impl"


    // $ANTLR start "rule__DConstructorCall__Group__2"
    // InternalDmx.g:5466:1: rule__DConstructorCall__Group__2 : rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 ;
    public final void rule__DConstructorCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5470:1: ( rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 )
            // InternalDmx.g:5471:2: rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__DConstructorCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group__2"


    // $ANTLR start "rule__DConstructorCall__Group__2__Impl"
    // InternalDmx.g:5478:1: rule__DConstructorCall__Group__2__Impl : ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) ;
    public final void rule__DConstructorCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5482:1: ( ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) )
            // InternalDmx.g:5483:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            {
            // InternalDmx.g:5483:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            // InternalDmx.g:5484:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2()); 
            }
            // InternalDmx.g:5485:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            // InternalDmx.g:5485:3: rule__DConstructorCall__ConstructorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__ConstructorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2()); 
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
    // $ANTLR end "rule__DConstructorCall__Group__2__Impl"


    // $ANTLR start "rule__DConstructorCall__Group__3"
    // InternalDmx.g:5493:1: rule__DConstructorCall__Group__3 : rule__DConstructorCall__Group__3__Impl ;
    public final void rule__DConstructorCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5497:1: ( rule__DConstructorCall__Group__3__Impl )
            // InternalDmx.g:5498:2: rule__DConstructorCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group__3"


    // $ANTLR start "rule__DConstructorCall__Group__3__Impl"
    // InternalDmx.g:5504:1: rule__DConstructorCall__Group__3__Impl : ( ( rule__DConstructorCall__Group_3__0 )? ) ;
    public final void rule__DConstructorCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5508:1: ( ( ( rule__DConstructorCall__Group_3__0 )? ) )
            // InternalDmx.g:5509:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            {
            // InternalDmx.g:5509:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            // InternalDmx.g:5510:2: ( rule__DConstructorCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5511:2: ( rule__DConstructorCall__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDmx.g:5511:3: rule__DConstructorCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DConstructorCall__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DConstructorCall__Group__3__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3__0"
    // InternalDmx.g:5520:1: rule__DConstructorCall__Group_3__0 : rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 ;
    public final void rule__DConstructorCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5524:1: ( rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 )
            // InternalDmx.g:5525:2: rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__DConstructorCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3__0"


    // $ANTLR start "rule__DConstructorCall__Group_3__0__Impl"
    // InternalDmx.g:5532:1: rule__DConstructorCall__Group_3__0__Impl : ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) ;
    public final void rule__DConstructorCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5536:1: ( ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) )
            // InternalDmx.g:5537:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            {
            // InternalDmx.g:5537:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            // InternalDmx.g:5538:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0()); 
            }
            // InternalDmx.g:5539:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            // InternalDmx.g:5539:3: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3__0__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3__1"
    // InternalDmx.g:5547:1: rule__DConstructorCall__Group_3__1 : rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 ;
    public final void rule__DConstructorCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5551:1: ( rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 )
            // InternalDmx.g:5552:2: rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__DConstructorCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3__1"


    // $ANTLR start "rule__DConstructorCall__Group_3__1__Impl"
    // InternalDmx.g:5559:1: rule__DConstructorCall__Group_3__1__Impl : ( ( rule__DConstructorCall__Group_3_1__0 )? ) ;
    public final void rule__DConstructorCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5563:1: ( ( ( rule__DConstructorCall__Group_3_1__0 )? ) )
            // InternalDmx.g:5564:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            {
            // InternalDmx.g:5564:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            // InternalDmx.g:5565:2: ( rule__DConstructorCall__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5566:2: ( rule__DConstructorCall__Group_3_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_NATURAL && LA47_0<=RULE_ID)||LA47_0==RULE_STRING||(LA47_0>=21 && LA47_0<=28)||(LA47_0>=30 && LA47_0<=33)||(LA47_0>=36 && LA47_0<=37)||(LA47_0>=59 && LA47_0<=61)||(LA47_0>=69 && LA47_0<=70)||LA47_0==75||(LA47_0>=77 && LA47_0<=78)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmx.g:5566:3: rule__DConstructorCall__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DConstructorCall__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3__1__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3__2"
    // InternalDmx.g:5574:1: rule__DConstructorCall__Group_3__2 : rule__DConstructorCall__Group_3__2__Impl ;
    public final void rule__DConstructorCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5578:1: ( rule__DConstructorCall__Group_3__2__Impl )
            // InternalDmx.g:5579:2: rule__DConstructorCall__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3__2"


    // $ANTLR start "rule__DConstructorCall__Group_3__2__Impl"
    // InternalDmx.g:5585:1: rule__DConstructorCall__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DConstructorCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5589:1: ( ( ')' ) )
            // InternalDmx.g:5590:1: ( ')' )
            {
            // InternalDmx.g:5590:1: ( ')' )
            // InternalDmx.g:5591:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3__2__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3_1__0"
    // InternalDmx.g:5601:1: rule__DConstructorCall__Group_3_1__0 : rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 ;
    public final void rule__DConstructorCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5605:1: ( rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 )
            // InternalDmx.g:5606:2: rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1
            {
            pushFollow(FOLLOW_36);
            rule__DConstructorCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3_1__0"


    // $ANTLR start "rule__DConstructorCall__Group_3_1__0__Impl"
    // InternalDmx.g:5613:1: rule__DConstructorCall__Group_3_1__0__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) ;
    public final void rule__DConstructorCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5617:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) )
            // InternalDmx.g:5618:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            {
            // InternalDmx.g:5618:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            // InternalDmx.g:5619:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0()); 
            }
            // InternalDmx.g:5620:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            // InternalDmx.g:5620:3: rule__DConstructorCall__ArgumentsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__ArgumentsAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3_1__0__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3_1__1"
    // InternalDmx.g:5628:1: rule__DConstructorCall__Group_3_1__1 : rule__DConstructorCall__Group_3_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5632:1: ( rule__DConstructorCall__Group_3_1__1__Impl )
            // InternalDmx.g:5633:2: rule__DConstructorCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3_1__1"


    // $ANTLR start "rule__DConstructorCall__Group_3_1__1__Impl"
    // InternalDmx.g:5639:1: rule__DConstructorCall__Group_3_1__1__Impl : ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) ;
    public final void rule__DConstructorCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5643:1: ( ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) )
            // InternalDmx.g:5644:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            {
            // InternalDmx.g:5644:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            // InternalDmx.g:5645:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1()); 
            }
            // InternalDmx.g:5646:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==68) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDmx.g:5646:3: rule__DConstructorCall__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DConstructorCall__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3_1__1__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3_1_1__0"
    // InternalDmx.g:5655:1: rule__DConstructorCall__Group_3_1_1__0 : rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 ;
    public final void rule__DConstructorCall__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5659:1: ( rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 )
            // InternalDmx.g:5660:2: rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DConstructorCall__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3_1_1__0"


    // $ANTLR start "rule__DConstructorCall__Group_3_1_1__0__Impl"
    // InternalDmx.g:5667:1: rule__DConstructorCall__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DConstructorCall__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5671:1: ( ( ',' ) )
            // InternalDmx.g:5672:1: ( ',' )
            {
            // InternalDmx.g:5672:1: ( ',' )
            // InternalDmx.g:5673:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__DConstructorCall__Group_3_1_1__1"
    // InternalDmx.g:5682:1: rule__DConstructorCall__Group_3_1_1__1 : rule__DConstructorCall__Group_3_1_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5686:1: ( rule__DConstructorCall__Group_3_1_1__1__Impl )
            // InternalDmx.g:5687:2: rule__DConstructorCall__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DConstructorCall__Group_3_1_1__1"


    // $ANTLR start "rule__DConstructorCall__Group_3_1_1__1__Impl"
    // InternalDmx.g:5693:1: rule__DConstructorCall__Group_3_1_1__1__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) ;
    public final void rule__DConstructorCall__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5697:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) )
            // InternalDmx.g:5698:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            {
            // InternalDmx.g:5698:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            // InternalDmx.g:5699:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1()); 
            }
            // InternalDmx.g:5700:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            // InternalDmx.g:5700:3: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DConstructorCall__ArgumentsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1()); 
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
    // $ANTLR end "rule__DConstructorCall__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__DContextReference__Group__0"
    // InternalDmx.g:5709:1: rule__DContextReference__Group__0 : rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 ;
    public final void rule__DContextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5713:1: ( rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 )
            // InternalDmx.g:5714:2: rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DContextReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DContextReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DContextReference__Group__0"


    // $ANTLR start "rule__DContextReference__Group__0__Impl"
    // InternalDmx.g:5721:1: rule__DContextReference__Group__0__Impl : ( () ) ;
    public final void rule__DContextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5725:1: ( ( () ) )
            // InternalDmx.g:5726:1: ( () )
            {
            // InternalDmx.g:5726:1: ( () )
            // InternalDmx.g:5727:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0()); 
            }
            // InternalDmx.g:5728:2: ()
            // InternalDmx.g:5728:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DContextReference__Group__0__Impl"


    // $ANTLR start "rule__DContextReference__Group__1"
    // InternalDmx.g:5736:1: rule__DContextReference__Group__1 : rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2 ;
    public final void rule__DContextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5740:1: ( rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2 )
            // InternalDmx.g:5741:2: rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__DContextReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DContextReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DContextReference__Group__1"


    // $ANTLR start "rule__DContextReference__Group__1__Impl"
    // InternalDmx.g:5748:1: rule__DContextReference__Group__1__Impl : ( ( rule__DContextReference__TargetAssignment_1 ) ) ;
    public final void rule__DContextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5752:1: ( ( ( rule__DContextReference__TargetAssignment_1 ) ) )
            // InternalDmx.g:5753:1: ( ( rule__DContextReference__TargetAssignment_1 ) )
            {
            // InternalDmx.g:5753:1: ( ( rule__DContextReference__TargetAssignment_1 ) )
            // InternalDmx.g:5754:2: ( rule__DContextReference__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getTargetAssignment_1()); 
            }
            // InternalDmx.g:5755:2: ( rule__DContextReference__TargetAssignment_1 )
            // InternalDmx.g:5755:3: rule__DContextReference__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DContextReference__TargetAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getTargetAssignment_1()); 
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
    // $ANTLR end "rule__DContextReference__Group__1__Impl"


    // $ANTLR start "rule__DContextReference__Group__2"
    // InternalDmx.g:5763:1: rule__DContextReference__Group__2 : rule__DContextReference__Group__2__Impl ;
    public final void rule__DContextReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5767:1: ( rule__DContextReference__Group__2__Impl )
            // InternalDmx.g:5768:2: rule__DContextReference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DContextReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DContextReference__Group__2"


    // $ANTLR start "rule__DContextReference__Group__2__Impl"
    // InternalDmx.g:5774:1: rule__DContextReference__Group__2__Impl : ( ( rule__DContextReference__BeforeAssignment_2 )? ) ;
    public final void rule__DContextReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5778:1: ( ( ( rule__DContextReference__BeforeAssignment_2 )? ) )
            // InternalDmx.g:5779:1: ( ( rule__DContextReference__BeforeAssignment_2 )? )
            {
            // InternalDmx.g:5779:1: ( ( rule__DContextReference__BeforeAssignment_2 )? )
            // InternalDmx.g:5780:2: ( rule__DContextReference__BeforeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeAssignment_2()); 
            }
            // InternalDmx.g:5781:2: ( rule__DContextReference__BeforeAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDmx.g:5781:3: rule__DContextReference__BeforeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DContextReference__BeforeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getBeforeAssignment_2()); 
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
    // $ANTLR end "rule__DContextReference__Group__2__Impl"


    // $ANTLR start "rule__DIfExpression__Group__0"
    // InternalDmx.g:5790:1: rule__DIfExpression__Group__0 : rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 ;
    public final void rule__DIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5794:1: ( rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 )
            // InternalDmx.g:5795:2: rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__DIfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__0"


    // $ANTLR start "rule__DIfExpression__Group__0__Impl"
    // InternalDmx.g:5802:1: rule__DIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5806:1: ( ( () ) )
            // InternalDmx.g:5807:1: ( () )
            {
            // InternalDmx.g:5807:1: ( () )
            // InternalDmx.g:5808:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0()); 
            }
            // InternalDmx.g:5809:2: ()
            // InternalDmx.g:5809:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__0__Impl"


    // $ANTLR start "rule__DIfExpression__Group__1"
    // InternalDmx.g:5817:1: rule__DIfExpression__Group__1 : rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 ;
    public final void rule__DIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5821:1: ( rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 )
            // InternalDmx.g:5822:2: rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DIfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__1"


    // $ANTLR start "rule__DIfExpression__Group__1__Impl"
    // InternalDmx.g:5829:1: rule__DIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__DIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5833:1: ( ( 'if' ) )
            // InternalDmx.g:5834:1: ( 'if' )
            {
            // InternalDmx.g:5834:1: ( 'if' )
            // InternalDmx.g:5835:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getIfKeyword_1()); 
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
    // $ANTLR end "rule__DIfExpression__Group__1__Impl"


    // $ANTLR start "rule__DIfExpression__Group__2"
    // InternalDmx.g:5844:1: rule__DIfExpression__Group__2 : rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 ;
    public final void rule__DIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5848:1: ( rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 )
            // InternalDmx.g:5849:2: rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__DIfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__2"


    // $ANTLR start "rule__DIfExpression__Group__2__Impl"
    // InternalDmx.g:5856:1: rule__DIfExpression__Group__2__Impl : ( ( rule__DIfExpression__IfAssignment_2 ) ) ;
    public final void rule__DIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5860:1: ( ( ( rule__DIfExpression__IfAssignment_2 ) ) )
            // InternalDmx.g:5861:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            {
            // InternalDmx.g:5861:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            // InternalDmx.g:5862:2: ( rule__DIfExpression__IfAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfAssignment_2()); 
            }
            // InternalDmx.g:5863:2: ( rule__DIfExpression__IfAssignment_2 )
            // InternalDmx.g:5863:3: rule__DIfExpression__IfAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__IfAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getIfAssignment_2()); 
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
    // $ANTLR end "rule__DIfExpression__Group__2__Impl"


    // $ANTLR start "rule__DIfExpression__Group__3"
    // InternalDmx.g:5871:1: rule__DIfExpression__Group__3 : rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 ;
    public final void rule__DIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5875:1: ( rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 )
            // InternalDmx.g:5876:2: rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__DIfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__3"


    // $ANTLR start "rule__DIfExpression__Group__3__Impl"
    // InternalDmx.g:5883:1: rule__DIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__DIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5887:1: ( ( 'then' ) )
            // InternalDmx.g:5888:1: ( 'then' )
            {
            // InternalDmx.g:5888:1: ( 'then' )
            // InternalDmx.g:5889:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getThenKeyword_3()); 
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
    // $ANTLR end "rule__DIfExpression__Group__3__Impl"


    // $ANTLR start "rule__DIfExpression__Group__4"
    // InternalDmx.g:5898:1: rule__DIfExpression__Group__4 : rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 ;
    public final void rule__DIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5902:1: ( rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 )
            // InternalDmx.g:5903:2: rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__DIfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__4"


    // $ANTLR start "rule__DIfExpression__Group__4__Impl"
    // InternalDmx.g:5910:1: rule__DIfExpression__Group__4__Impl : ( ( rule__DIfExpression__ThenAssignment_4 ) ) ;
    public final void rule__DIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5914:1: ( ( ( rule__DIfExpression__ThenAssignment_4 ) ) )
            // InternalDmx.g:5915:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            {
            // InternalDmx.g:5915:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            // InternalDmx.g:5916:2: ( rule__DIfExpression__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenAssignment_4()); 
            }
            // InternalDmx.g:5917:2: ( rule__DIfExpression__ThenAssignment_4 )
            // InternalDmx.g:5917:3: rule__DIfExpression__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__ThenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getThenAssignment_4()); 
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
    // $ANTLR end "rule__DIfExpression__Group__4__Impl"


    // $ANTLR start "rule__DIfExpression__Group__5"
    // InternalDmx.g:5925:1: rule__DIfExpression__Group__5 : rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 ;
    public final void rule__DIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5929:1: ( rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 )
            // InternalDmx.g:5930:2: rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__DIfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__5"


    // $ANTLR start "rule__DIfExpression__Group__5__Impl"
    // InternalDmx.g:5937:1: rule__DIfExpression__Group__5__Impl : ( ( rule__DIfExpression__Group_5__0 )? ) ;
    public final void rule__DIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5941:1: ( ( ( rule__DIfExpression__Group_5__0 )? ) )
            // InternalDmx.g:5942:1: ( ( rule__DIfExpression__Group_5__0 )? )
            {
            // InternalDmx.g:5942:1: ( ( rule__DIfExpression__Group_5__0 )? )
            // InternalDmx.g:5943:2: ( rule__DIfExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getGroup_5()); 
            }
            // InternalDmx.g:5944:2: ( rule__DIfExpression__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDmx.g:5944:3: rule__DIfExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DIfExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getGroup_5()); 
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
    // $ANTLR end "rule__DIfExpression__Group__5__Impl"


    // $ANTLR start "rule__DIfExpression__Group__6"
    // InternalDmx.g:5952:1: rule__DIfExpression__Group__6 : rule__DIfExpression__Group__6__Impl ;
    public final void rule__DIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5956:1: ( rule__DIfExpression__Group__6__Impl )
            // InternalDmx.g:5957:2: rule__DIfExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group__6"


    // $ANTLR start "rule__DIfExpression__Group__6__Impl"
    // InternalDmx.g:5963:1: rule__DIfExpression__Group__6__Impl : ( 'end' ) ;
    public final void rule__DIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5967:1: ( ( 'end' ) )
            // InternalDmx.g:5968:1: ( 'end' )
            {
            // InternalDmx.g:5968:1: ( 'end' )
            // InternalDmx.g:5969:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getEndKeyword_6()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getEndKeyword_6()); 
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
    // $ANTLR end "rule__DIfExpression__Group__6__Impl"


    // $ANTLR start "rule__DIfExpression__Group_5__0"
    // InternalDmx.g:5979:1: rule__DIfExpression__Group_5__0 : rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 ;
    public final void rule__DIfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5983:1: ( rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 )
            // InternalDmx.g:5984:2: rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__DIfExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group_5__0"


    // $ANTLR start "rule__DIfExpression__Group_5__0__Impl"
    // InternalDmx.g:5991:1: rule__DIfExpression__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__DIfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5995:1: ( ( ( 'else' ) ) )
            // InternalDmx.g:5996:1: ( ( 'else' ) )
            {
            // InternalDmx.g:5996:1: ( ( 'else' ) )
            // InternalDmx.g:5997:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0()); 
            }
            // InternalDmx.g:5998:2: ( 'else' )
            // InternalDmx.g:5998:3: 'else'
            {
            match(input,73,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__DIfExpression__Group_5__0__Impl"


    // $ANTLR start "rule__DIfExpression__Group_5__1"
    // InternalDmx.g:6006:1: rule__DIfExpression__Group_5__1 : rule__DIfExpression__Group_5__1__Impl ;
    public final void rule__DIfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6010:1: ( rule__DIfExpression__Group_5__1__Impl )
            // InternalDmx.g:6011:2: rule__DIfExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIfExpression__Group_5__1"


    // $ANTLR start "rule__DIfExpression__Group_5__1__Impl"
    // InternalDmx.g:6017:1: rule__DIfExpression__Group_5__1__Impl : ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) ;
    public final void rule__DIfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6021:1: ( ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) )
            // InternalDmx.g:6022:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            {
            // InternalDmx.g:6022:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            // InternalDmx.g:6023:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1()); 
            }
            // InternalDmx.g:6024:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            // InternalDmx.g:6024:3: rule__DIfExpression__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DIfExpression__ElseAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1()); 
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
    // $ANTLR end "rule__DIfExpression__Group_5__1__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group__0"
    // InternalDmx.g:6033:1: rule__DForLoopExpression__Group__0 : rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 ;
    public final void rule__DForLoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6037:1: ( rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 )
            // InternalDmx.g:6038:2: rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DForLoopExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group__0"


    // $ANTLR start "rule__DForLoopExpression__Group__0__Impl"
    // InternalDmx.g:6045:1: rule__DForLoopExpression__Group__0__Impl : ( ( rule__DForLoopExpression__Group_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6049:1: ( ( ( rule__DForLoopExpression__Group_0__0 ) ) )
            // InternalDmx.g:6050:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            {
            // InternalDmx.g:6050:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            // InternalDmx.g:6051:2: ( rule__DForLoopExpression__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0()); 
            }
            // InternalDmx.g:6052:2: ( rule__DForLoopExpression__Group_0__0 )
            // InternalDmx.g:6052:3: rule__DForLoopExpression__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getGroup_0()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group__0__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group__1"
    // InternalDmx.g:6060:1: rule__DForLoopExpression__Group__1 : rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 ;
    public final void rule__DForLoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6064:1: ( rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 )
            // InternalDmx.g:6065:2: rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__DForLoopExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group__1"


    // $ANTLR start "rule__DForLoopExpression__Group__1__Impl"
    // InternalDmx.g:6072:1: rule__DForLoopExpression__Group__1__Impl : ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) ;
    public final void rule__DForLoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6076:1: ( ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) )
            // InternalDmx.g:6077:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            {
            // InternalDmx.g:6077:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            // InternalDmx.g:6078:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1()); 
            }
            // InternalDmx.g:6079:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            // InternalDmx.g:6079:3: rule__DForLoopExpression__ForExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__ForExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group__1__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group__2"
    // InternalDmx.g:6087:1: rule__DForLoopExpression__Group__2 : rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 ;
    public final void rule__DForLoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6091:1: ( rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 )
            // InternalDmx.g:6092:2: rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DForLoopExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group__2"


    // $ANTLR start "rule__DForLoopExpression__Group__2__Impl"
    // InternalDmx.g:6099:1: rule__DForLoopExpression__Group__2__Impl : ( 'do' ) ;
    public final void rule__DForLoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6103:1: ( ( 'do' ) )
            // InternalDmx.g:6104:1: ( 'do' )
            {
            // InternalDmx.g:6104:1: ( 'do' )
            // InternalDmx.g:6105:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group__2__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group__3"
    // InternalDmx.g:6114:1: rule__DForLoopExpression__Group__3 : rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 ;
    public final void rule__DForLoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6118:1: ( rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 )
            // InternalDmx.g:6119:2: rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__DForLoopExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group__3"


    // $ANTLR start "rule__DForLoopExpression__Group__3__Impl"
    // InternalDmx.g:6126:1: rule__DForLoopExpression__Group__3__Impl : ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) ;
    public final void rule__DForLoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6130:1: ( ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) )
            // InternalDmx.g:6131:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            {
            // InternalDmx.g:6131:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            // InternalDmx.g:6132:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3()); 
            }
            // InternalDmx.g:6133:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            // InternalDmx.g:6133:3: rule__DForLoopExpression__EachExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__EachExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group__3__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group__4"
    // InternalDmx.g:6141:1: rule__DForLoopExpression__Group__4 : rule__DForLoopExpression__Group__4__Impl ;
    public final void rule__DForLoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6145:1: ( rule__DForLoopExpression__Group__4__Impl )
            // InternalDmx.g:6146:2: rule__DForLoopExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group__4"


    // $ANTLR start "rule__DForLoopExpression__Group__4__Impl"
    // InternalDmx.g:6152:1: rule__DForLoopExpression__Group__4__Impl : ( 'end' ) ;
    public final void rule__DForLoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6156:1: ( ( 'end' ) )
            // InternalDmx.g:6157:1: ( 'end' )
            {
            // InternalDmx.g:6157:1: ( 'end' )
            // InternalDmx.g:6158:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEndKeyword_4()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group__4__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group_0__0"
    // InternalDmx.g:6168:1: rule__DForLoopExpression__Group_0__0 : rule__DForLoopExpression__Group_0__0__Impl ;
    public final void rule__DForLoopExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6172:1: ( rule__DForLoopExpression__Group_0__0__Impl )
            // InternalDmx.g:6173:2: rule__DForLoopExpression__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0__0"


    // $ANTLR start "rule__DForLoopExpression__Group_0__0__Impl"
    // InternalDmx.g:6179:1: rule__DForLoopExpression__Group_0__0__Impl : ( ( rule__DForLoopExpression__Group_0_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6183:1: ( ( ( rule__DForLoopExpression__Group_0_0__0 ) ) )
            // InternalDmx.g:6184:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            {
            // InternalDmx.g:6184:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            // InternalDmx.g:6185:2: ( rule__DForLoopExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0()); 
            }
            // InternalDmx.g:6186:2: ( rule__DForLoopExpression__Group_0_0__0 )
            // InternalDmx.g:6186:3: rule__DForLoopExpression__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group_0__0__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__0"
    // InternalDmx.g:6195:1: rule__DForLoopExpression__Group_0_0__0 : rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 ;
    public final void rule__DForLoopExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6199:1: ( rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 )
            // InternalDmx.g:6200:2: rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DForLoopExpression__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__0"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__0__Impl"
    // InternalDmx.g:6207:1: rule__DForLoopExpression__Group_0_0__0__Impl : ( () ) ;
    public final void rule__DForLoopExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6211:1: ( ( () ) )
            // InternalDmx.g:6212:1: ( () )
            {
            // InternalDmx.g:6212:1: ( () )
            // InternalDmx.g:6213:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0()); 
            }
            // InternalDmx.g:6214:2: ()
            // InternalDmx.g:6214:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__0__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__1"
    // InternalDmx.g:6222:1: rule__DForLoopExpression__Group_0_0__1 : rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 ;
    public final void rule__DForLoopExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6226:1: ( rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 )
            // InternalDmx.g:6227:2: rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2
            {
            pushFollow(FOLLOW_13);
            rule__DForLoopExpression__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__1"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__1__Impl"
    // InternalDmx.g:6234:1: rule__DForLoopExpression__Group_0_0__1__Impl : ( 'for' ) ;
    public final void rule__DForLoopExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6238:1: ( ( 'for' ) )
            // InternalDmx.g:6239:1: ( 'for' )
            {
            // InternalDmx.g:6239:1: ( 'for' )
            // InternalDmx.g:6240:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__1__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__2"
    // InternalDmx.g:6249:1: rule__DForLoopExpression__Group_0_0__2 : rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 ;
    public final void rule__DForLoopExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6253:1: ( rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 )
            // InternalDmx.g:6254:2: rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3
            {
            pushFollow(FOLLOW_7);
            rule__DForLoopExpression__Group_0_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__2"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__2__Impl"
    // InternalDmx.g:6261:1: rule__DForLoopExpression__Group_0_0__2__Impl : ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) ;
    public final void rule__DForLoopExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6265:1: ( ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) )
            // InternalDmx.g:6266:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            {
            // InternalDmx.g:6266:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            // InternalDmx.g:6267:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2()); 
            }
            // InternalDmx.g:6268:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            // InternalDmx.g:6268:3: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__DeclaredParamAssignment_0_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__2__Impl"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__3"
    // InternalDmx.g:6276:1: rule__DForLoopExpression__Group_0_0__3 : rule__DForLoopExpression__Group_0_0__3__Impl ;
    public final void rule__DForLoopExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6280:1: ( rule__DForLoopExpression__Group_0_0__3__Impl )
            // InternalDmx.g:6281:2: rule__DForLoopExpression__Group_0_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DForLoopExpression__Group_0_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__3"


    // $ANTLR start "rule__DForLoopExpression__Group_0_0__3__Impl"
    // InternalDmx.g:6287:1: rule__DForLoopExpression__Group_0_0__3__Impl : ( ':' ) ;
    public final void rule__DForLoopExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6291:1: ( ( ':' ) )
            // InternalDmx.g:6292:1: ( ':' )
            {
            // InternalDmx.g:6292:1: ( ':' )
            // InternalDmx.g:6293:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3()); 
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
    // $ANTLR end "rule__DForLoopExpression__Group_0_0__3__Impl"


    // $ANTLR start "rule__DBooleanLiteral__Group__0"
    // InternalDmx.g:6303:1: rule__DBooleanLiteral__Group__0 : rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 ;
    public final void rule__DBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6307:1: ( rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 )
            // InternalDmx.g:6308:2: rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__DBooleanLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DBooleanLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBooleanLiteral__Group__0"


    // $ANTLR start "rule__DBooleanLiteral__Group__0__Impl"
    // InternalDmx.g:6315:1: rule__DBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6319:1: ( ( () ) )
            // InternalDmx.g:6320:1: ( () )
            {
            // InternalDmx.g:6320:1: ( () )
            // InternalDmx.g:6321:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0()); 
            }
            // InternalDmx.g:6322:2: ()
            // InternalDmx.g:6322:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__DBooleanLiteral__Group__1"
    // InternalDmx.g:6330:1: rule__DBooleanLiteral__Group__1 : rule__DBooleanLiteral__Group__1__Impl ;
    public final void rule__DBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6334:1: ( rule__DBooleanLiteral__Group__1__Impl )
            // InternalDmx.g:6335:2: rule__DBooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DBooleanLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DBooleanLiteral__Group__1"


    // $ANTLR start "rule__DBooleanLiteral__Group__1__Impl"
    // InternalDmx.g:6341:1: rule__DBooleanLiteral__Group__1__Impl : ( ( rule__DBooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__DBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6345:1: ( ( ( rule__DBooleanLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6346:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6346:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            // InternalDmx.g:6347:2: ( rule__DBooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6348:2: ( rule__DBooleanLiteral__Alternatives_1 )
            // InternalDmx.g:6348:3: rule__DBooleanLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DBooleanLiteral__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DBooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__DStringLiteral__Group__0"
    // InternalDmx.g:6357:1: rule__DStringLiteral__Group__0 : rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 ;
    public final void rule__DStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6361:1: ( rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 )
            // InternalDmx.g:6362:2: rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__DStringLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DStringLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DStringLiteral__Group__0"


    // $ANTLR start "rule__DStringLiteral__Group__0__Impl"
    // InternalDmx.g:6369:1: rule__DStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6373:1: ( ( () ) )
            // InternalDmx.g:6374:1: ( () )
            {
            // InternalDmx.g:6374:1: ( () )
            // InternalDmx.g:6375:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0()); 
            }
            // InternalDmx.g:6376:2: ()
            // InternalDmx.g:6376:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DStringLiteral__Group__0__Impl"


    // $ANTLR start "rule__DStringLiteral__Group__1"
    // InternalDmx.g:6384:1: rule__DStringLiteral__Group__1 : rule__DStringLiteral__Group__1__Impl ;
    public final void rule__DStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6388:1: ( rule__DStringLiteral__Group__1__Impl )
            // InternalDmx.g:6389:2: rule__DStringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DStringLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DStringLiteral__Group__1"


    // $ANTLR start "rule__DStringLiteral__Group__1__Impl"
    // InternalDmx.g:6395:1: rule__DStringLiteral__Group__1__Impl : ( ( rule__DStringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6399:1: ( ( ( rule__DStringLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6400:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6400:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6401:2: ( rule__DStringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6402:2: ( rule__DStringLiteral__ValueAssignment_1 )
            // InternalDmx.g:6402:3: rule__DStringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DStringLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDStringLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__DStringLiteral__Group__1__Impl"


    // $ANTLR start "rule__DNaturalLiteral__Group__0"
    // InternalDmx.g:6411:1: rule__DNaturalLiteral__Group__0 : rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 ;
    public final void rule__DNaturalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6415:1: ( rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 )
            // InternalDmx.g:6416:2: rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DNaturalLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DNaturalLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNaturalLiteral__Group__0"


    // $ANTLR start "rule__DNaturalLiteral__Group__0__Impl"
    // InternalDmx.g:6423:1: rule__DNaturalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNaturalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6427:1: ( ( () ) )
            // InternalDmx.g:6428:1: ( () )
            {
            // InternalDmx.g:6428:1: ( () )
            // InternalDmx.g:6429:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0()); 
            }
            // InternalDmx.g:6430:2: ()
            // InternalDmx.g:6430:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNaturalLiteral__Group__0__Impl"


    // $ANTLR start "rule__DNaturalLiteral__Group__1"
    // InternalDmx.g:6438:1: rule__DNaturalLiteral__Group__1 : rule__DNaturalLiteral__Group__1__Impl ;
    public final void rule__DNaturalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6442:1: ( rule__DNaturalLiteral__Group__1__Impl )
            // InternalDmx.g:6443:2: rule__DNaturalLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DNaturalLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNaturalLiteral__Group__1"


    // $ANTLR start "rule__DNaturalLiteral__Group__1__Impl"
    // InternalDmx.g:6449:1: rule__DNaturalLiteral__Group__1__Impl : ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DNaturalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6453:1: ( ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6454:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6454:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6455:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6456:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6456:3: rule__DNaturalLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DNaturalLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__DNaturalLiteral__Group__1__Impl"


    // $ANTLR start "rule__DDecimalLiteral__Group__0"
    // InternalDmx.g:6465:1: rule__DDecimalLiteral__Group__0 : rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 ;
    public final void rule__DDecimalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6469:1: ( rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 )
            // InternalDmx.g:6470:2: rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DDecimalLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DDecimalLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDecimalLiteral__Group__0"


    // $ANTLR start "rule__DDecimalLiteral__Group__0__Impl"
    // InternalDmx.g:6477:1: rule__DDecimalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DDecimalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6481:1: ( ( () ) )
            // InternalDmx.g:6482:1: ( () )
            {
            // InternalDmx.g:6482:1: ( () )
            // InternalDmx.g:6483:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0()); 
            }
            // InternalDmx.g:6484:2: ()
            // InternalDmx.g:6484:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDecimalLiteral__Group__0__Impl"


    // $ANTLR start "rule__DDecimalLiteral__Group__1"
    // InternalDmx.g:6492:1: rule__DDecimalLiteral__Group__1 : rule__DDecimalLiteral__Group__1__Impl ;
    public final void rule__DDecimalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6496:1: ( rule__DDecimalLiteral__Group__1__Impl )
            // InternalDmx.g:6497:2: rule__DDecimalLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DDecimalLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDecimalLiteral__Group__1"


    // $ANTLR start "rule__DDecimalLiteral__Group__1__Impl"
    // InternalDmx.g:6503:1: rule__DDecimalLiteral__Group__1__Impl : ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DDecimalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6507:1: ( ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6508:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6508:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6509:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6510:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6510:3: rule__DDecimalLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DDecimalLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__DDecimalLiteral__Group__1__Impl"


    // $ANTLR start "rule__DNilLiteral__Group__0"
    // InternalDmx.g:6519:1: rule__DNilLiteral__Group__0 : rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 ;
    public final void rule__DNilLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6523:1: ( rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 )
            // InternalDmx.g:6524:2: rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__DNilLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DNilLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNilLiteral__Group__0"


    // $ANTLR start "rule__DNilLiteral__Group__0__Impl"
    // InternalDmx.g:6531:1: rule__DNilLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNilLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6535:1: ( ( () ) )
            // InternalDmx.g:6536:1: ( () )
            {
            // InternalDmx.g:6536:1: ( () )
            // InternalDmx.g:6537:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0()); 
            }
            // InternalDmx.g:6538:2: ()
            // InternalDmx.g:6538:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNilLiteral__Group__0__Impl"


    // $ANTLR start "rule__DNilLiteral__Group__1"
    // InternalDmx.g:6546:1: rule__DNilLiteral__Group__1 : rule__DNilLiteral__Group__1__Impl ;
    public final void rule__DNilLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6550:1: ( rule__DNilLiteral__Group__1__Impl )
            // InternalDmx.g:6551:2: rule__DNilLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DNilLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DNilLiteral__Group__1"


    // $ANTLR start "rule__DNilLiteral__Group__1__Impl"
    // InternalDmx.g:6557:1: rule__DNilLiteral__Group__1__Impl : ( ( rule__DNilLiteral__Alternatives_1 ) ) ;
    public final void rule__DNilLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6561:1: ( ( ( rule__DNilLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6562:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6562:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            // InternalDmx.g:6563:2: ( rule__DNilLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6564:2: ( rule__DNilLiteral__Alternatives_1 )
            // InternalDmx.g:6564:3: rule__DNilLiteral__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DNilLiteral__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNilLiteralAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__DNilLiteral__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalDmx.g:6573:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6577:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalDmx.g:6578:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalDmx.g:6585:1: rule__DECIMAL__Group__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6589:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6590:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6590:1: ( RULE_NATURAL )
            // InternalDmx.g:6591:2: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalDmx.g:6600:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6604:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalDmx.g:6605:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalDmx.g:6612:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6616:1: ( ( '.' ) )
            // InternalDmx.g:6617:1: ( '.' )
            {
            // InternalDmx.g:6617:1: ( '.' )
            // InternalDmx.g:6618:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalDmx.g:6627:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6631:1: ( rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 )
            // InternalDmx.g:6632:2: rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__DECIMAL__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalDmx.g:6639:1: rule__DECIMAL__Group__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6643:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6644:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6644:1: ( RULE_NATURAL )
            // InternalDmx.g:6645:2: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__DECIMAL__Group__3"
    // InternalDmx.g:6654:1: rule__DECIMAL__Group__3 : rule__DECIMAL__Group__3__Impl ;
    public final void rule__DECIMAL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6658:1: ( rule__DECIMAL__Group__3__Impl )
            // InternalDmx.g:6659:2: rule__DECIMAL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__3"


    // $ANTLR start "rule__DECIMAL__Group__3__Impl"
    // InternalDmx.g:6665:1: rule__DECIMAL__Group__3__Impl : ( ( rule__DECIMAL__Group_3__0 )? ) ;
    public final void rule__DECIMAL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6669:1: ( ( ( rule__DECIMAL__Group_3__0 )? ) )
            // InternalDmx.g:6670:1: ( ( rule__DECIMAL__Group_3__0 )? )
            {
            // InternalDmx.g:6670:1: ( ( rule__DECIMAL__Group_3__0 )? )
            // InternalDmx.g:6671:2: ( rule__DECIMAL__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup_3()); 
            }
            // InternalDmx.g:6672:2: ( rule__DECIMAL__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=34 && LA51_0<=35)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmx.g:6672:3: rule__DECIMAL__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DECIMAL__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getGroup_3()); 
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
    // $ANTLR end "rule__DECIMAL__Group__3__Impl"


    // $ANTLR start "rule__DECIMAL__Group_3__0"
    // InternalDmx.g:6681:1: rule__DECIMAL__Group_3__0 : rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 ;
    public final void rule__DECIMAL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6685:1: ( rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 )
            // InternalDmx.g:6686:2: rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1
            {
            pushFollow(FOLLOW_54);
            rule__DECIMAL__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_3__0"


    // $ANTLR start "rule__DECIMAL__Group_3__0__Impl"
    // InternalDmx.g:6693:1: rule__DECIMAL__Group_3__0__Impl : ( ( rule__DECIMAL__Alternatives_3_0 ) ) ;
    public final void rule__DECIMAL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6697:1: ( ( ( rule__DECIMAL__Alternatives_3_0 ) ) )
            // InternalDmx.g:6698:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            {
            // InternalDmx.g:6698:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            // InternalDmx.g:6699:2: ( rule__DECIMAL__Alternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_0()); 
            }
            // InternalDmx.g:6700:2: ( rule__DECIMAL__Alternatives_3_0 )
            // InternalDmx.g:6700:3: rule__DECIMAL__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Alternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getAlternatives_3_0()); 
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
    // $ANTLR end "rule__DECIMAL__Group_3__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group_3__1"
    // InternalDmx.g:6708:1: rule__DECIMAL__Group_3__1 : rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 ;
    public final void rule__DECIMAL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6712:1: ( rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 )
            // InternalDmx.g:6713:2: rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2
            {
            pushFollow(FOLLOW_54);
            rule__DECIMAL__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_3__1"


    // $ANTLR start "rule__DECIMAL__Group_3__1__Impl"
    // InternalDmx.g:6720:1: rule__DECIMAL__Group_3__1__Impl : ( ( rule__DECIMAL__Alternatives_3_1 )? ) ;
    public final void rule__DECIMAL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6724:1: ( ( ( rule__DECIMAL__Alternatives_3_1 )? ) )
            // InternalDmx.g:6725:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            {
            // InternalDmx.g:6725:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            // InternalDmx.g:6726:2: ( rule__DECIMAL__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_1()); 
            }
            // InternalDmx.g:6727:2: ( rule__DECIMAL__Alternatives_3_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=36 && LA52_0<=37)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDmx.g:6727:3: rule__DECIMAL__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DECIMAL__Alternatives_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getAlternatives_3_1()); 
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
    // $ANTLR end "rule__DECIMAL__Group_3__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group_3__2"
    // InternalDmx.g:6735:1: rule__DECIMAL__Group_3__2 : rule__DECIMAL__Group_3__2__Impl ;
    public final void rule__DECIMAL__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6739:1: ( rule__DECIMAL__Group_3__2__Impl )
            // InternalDmx.g:6740:2: rule__DECIMAL__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_3__2"


    // $ANTLR start "rule__DECIMAL__Group_3__2__Impl"
    // InternalDmx.g:6746:1: rule__DECIMAL__Group_3__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6750:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6751:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6751:1: ( RULE_NATURAL )
            // InternalDmx.g:6752:2: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_3_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_3_2()); 
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
    // $ANTLR end "rule__DECIMAL__Group_3__2__Impl"


    // $ANTLR start "rule__DQualifiedName__Group__0"
    // InternalDmx.g:6762:1: rule__DQualifiedName__Group__0 : rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1 ;
    public final void rule__DQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6766:1: ( rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1 )
            // InternalDmx.g:6767:2: rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DQualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DQualifiedName__Group__0"


    // $ANTLR start "rule__DQualifiedName__Group__0__Impl"
    // InternalDmx.g:6774:1: rule__DQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6778:1: ( ( RULE_ID ) )
            // InternalDmx.g:6779:1: ( RULE_ID )
            {
            // InternalDmx.g:6779:1: ( RULE_ID )
            // InternalDmx.g:6780:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__DQualifiedName__Group__1"
    // InternalDmx.g:6789:1: rule__DQualifiedName__Group__1 : rule__DQualifiedName__Group__1__Impl ;
    public final void rule__DQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6793:1: ( rule__DQualifiedName__Group__1__Impl )
            // InternalDmx.g:6794:2: rule__DQualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DQualifiedName__Group__1"


    // $ANTLR start "rule__DQualifiedName__Group__1__Impl"
    // InternalDmx.g:6800:1: rule__DQualifiedName__Group__1__Impl : ( ( rule__DQualifiedName__Group_1__0 )* ) ;
    public final void rule__DQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6804:1: ( ( ( rule__DQualifiedName__Group_1__0 )* ) )
            // InternalDmx.g:6805:1: ( ( rule__DQualifiedName__Group_1__0 )* )
            {
            // InternalDmx.g:6805:1: ( ( rule__DQualifiedName__Group_1__0 )* )
            // InternalDmx.g:6806:2: ( rule__DQualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getGroup_1()); 
            }
            // InternalDmx.g:6807:2: ( rule__DQualifiedName__Group_1__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==66) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalDmx.g:6807:3: rule__DQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DQualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__DQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__DQualifiedName__Group_1__0"
    // InternalDmx.g:6816:1: rule__DQualifiedName__Group_1__0 : rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1 ;
    public final void rule__DQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6820:1: ( rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1 )
            // InternalDmx.g:6821:2: rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__DQualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DQualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DQualifiedName__Group_1__0"


    // $ANTLR start "rule__DQualifiedName__Group_1__0__Impl"
    // InternalDmx.g:6828:1: rule__DQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6832:1: ( ( '.' ) )
            // InternalDmx.g:6833:1: ( '.' )
            {
            // InternalDmx.g:6833:1: ( '.' )
            // InternalDmx.g:6834:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__DQualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__DQualifiedName__Group_1__1"
    // InternalDmx.g:6843:1: rule__DQualifiedName__Group_1__1 : rule__DQualifiedName__Group_1__1__Impl ;
    public final void rule__DQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6847:1: ( rule__DQualifiedName__Group_1__1__Impl )
            // InternalDmx.g:6848:2: rule__DQualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DQualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DQualifiedName__Group_1__1"


    // $ANTLR start "rule__DQualifiedName__Group_1__1__Impl"
    // InternalDmx.g:6854:1: rule__DQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__DQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6858:1: ( ( RULE_ID ) )
            // InternalDmx.g:6859:1: ( RULE_ID )
            {
            // InternalDmx.g:6859:1: ( RULE_ID )
            // InternalDmx.g:6860:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__DQualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DmxModel__TextsAssignment_1_3"
    // InternalDmx.g:6870:1: rule__DmxModel__TextsAssignment_1_3 : ( ruleDRichText ) ;
    public final void rule__DmxModel__TextsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6874:1: ( ( ruleDRichText ) )
            // InternalDmx.g:6875:2: ( ruleDRichText )
            {
            // InternalDmx.g:6875:2: ( ruleDRichText )
            // InternalDmx.g:6876:3: ruleDRichText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextsDRichTextParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDRichText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getTextsDRichTextParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__DmxModel__TextsAssignment_1_3"


    // $ANTLR start "rule__DmxModel__ExpressionsAssignment_2_3"
    // InternalDmx.g:6885:1: rule__DmxModel__ExpressionsAssignment_2_3 : ( ruleDExpression ) ;
    public final void rule__DmxModel__ExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6889:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6890:2: ( ruleDExpression )
            {
            // InternalDmx.g:6890:2: ( ruleDExpression )
            // InternalDmx.g:6891:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExpressionsDExpressionParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDmxModelAccess().getExpressionsDExpressionParserRuleCall_2_3_0()); 
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
    // $ANTLR end "rule__DmxModel__ExpressionsAssignment_2_3"


    // $ANTLR start "rule__DRichText__ElementsAssignment_0"
    // InternalDmx.g:6900:1: rule__DRichText__ElementsAssignment_0 : ( ruleDTextOnly ) ;
    public final void rule__DRichText__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6904:1: ( ( ruleDTextOnly ) )
            // InternalDmx.g:6905:2: ( ruleDTextOnly )
            {
            // InternalDmx.g:6905:2: ( ruleDTextOnly )
            // InternalDmx.g:6906:3: ruleDTextOnly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDTextOnlyParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextOnly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDTextOnlyParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_0"


    // $ANTLR start "rule__DRichText__ElementsAssignment_1_0"
    // InternalDmx.g:6915:1: rule__DRichText__ElementsAssignment_1_0 : ( ruleDTextStart ) ;
    public final void rule__DRichText__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6919:1: ( ( ruleDTextStart ) )
            // InternalDmx.g:6920:2: ( ruleDTextStart )
            {
            // InternalDmx.g:6920:2: ( ruleDTextStart )
            // InternalDmx.g:6921:3: ruleDTextStart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDTextStartParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDTextStartParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_1_0"


    // $ANTLR start "rule__DRichText__ElementsAssignment_1_1"
    // InternalDmx.g:6930:1: rule__DRichText__ElementsAssignment_1_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6934:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6935:2: ( ruleDExpression )
            {
            // InternalDmx.g:6935:2: ( ruleDExpression )
            // InternalDmx.g:6936:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_1_1"


    // $ANTLR start "rule__DRichText__ElementsAssignment_1_2_0"
    // InternalDmx.g:6945:1: rule__DRichText__ElementsAssignment_1_2_0 : ( ruleDTextMiddle ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6949:1: ( ( ruleDTextMiddle ) )
            // InternalDmx.g:6950:2: ( ruleDTextMiddle )
            {
            // InternalDmx.g:6950:2: ( ruleDTextMiddle )
            // InternalDmx.g:6951:3: ruleDTextMiddle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDTextMiddleParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextMiddle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDTextMiddleParserRuleCall_1_2_0_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_1_2_0"


    // $ANTLR start "rule__DRichText__ElementsAssignment_1_2_1"
    // InternalDmx.g:6960:1: rule__DRichText__ElementsAssignment_1_2_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6964:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6965:2: ( ruleDExpression )
            {
            // InternalDmx.g:6965:2: ( ruleDExpression )
            // InternalDmx.g:6966:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_1_2_1"


    // $ANTLR start "rule__DRichText__ElementsAssignment_1_3"
    // InternalDmx.g:6975:1: rule__DRichText__ElementsAssignment_1_3 : ( ruleDTextEnd ) ;
    public final void rule__DRichText__ElementsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6979:1: ( ( ruleDTextEnd ) )
            // InternalDmx.g:6980:2: ( ruleDTextEnd )
            {
            // InternalDmx.g:6980:2: ( ruleDTextEnd )
            // InternalDmx.g:6981:3: ruleDTextEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsDTextEndParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getElementsDTextEndParserRuleCall_1_3_0()); 
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
    // $ANTLR end "rule__DRichText__ElementsAssignment_1_3"


    // $ANTLR start "rule__DTextOnly__ValueAssignment"
    // InternalDmx.g:6990:1: rule__DTextOnly__ValueAssignment : ( RULE_PLAIN_TEXT_ONLY ) ;
    public final void rule__DTextOnly__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6994:1: ( ( RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:6995:2: ( RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:6995:2: ( RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:6996:3: RULE_PLAIN_TEXT_ONLY
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextOnlyAccess().getValuePLAIN_TEXT_ONLYTerminalRuleCall_0()); 
            }
            match(input,RULE_PLAIN_TEXT_ONLY,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextOnlyAccess().getValuePLAIN_TEXT_ONLYTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DTextOnly__ValueAssignment"


    // $ANTLR start "rule__DTextStart__ValueAssignment"
    // InternalDmx.g:7005:1: rule__DTextStart__ValueAssignment : ( RULE_PLAIN_TEXT_START ) ;
    public final void rule__DTextStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7009:1: ( ( RULE_PLAIN_TEXT_START ) )
            // InternalDmx.g:7010:2: ( RULE_PLAIN_TEXT_START )
            {
            // InternalDmx.g:7010:2: ( RULE_PLAIN_TEXT_START )
            // InternalDmx.g:7011:3: RULE_PLAIN_TEXT_START
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextStartAccess().getValuePLAIN_TEXT_STARTTerminalRuleCall_0()); 
            }
            match(input,RULE_PLAIN_TEXT_START,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextStartAccess().getValuePLAIN_TEXT_STARTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DTextStart__ValueAssignment"


    // $ANTLR start "rule__DTextMiddle__ValueAssignment"
    // InternalDmx.g:7020:1: rule__DTextMiddle__ValueAssignment : ( RULE_PLAIN_TEXT_MIDDLE ) ;
    public final void rule__DTextMiddle__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7024:1: ( ( RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDmx.g:7025:2: ( RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDmx.g:7025:2: ( RULE_PLAIN_TEXT_MIDDLE )
            // InternalDmx.g:7026:3: RULE_PLAIN_TEXT_MIDDLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextMiddleAccess().getValuePLAIN_TEXT_MIDDLETerminalRuleCall_0()); 
            }
            match(input,RULE_PLAIN_TEXT_MIDDLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextMiddleAccess().getValuePLAIN_TEXT_MIDDLETerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DTextMiddle__ValueAssignment"


    // $ANTLR start "rule__DTextEnd__ValueAssignment"
    // InternalDmx.g:7035:1: rule__DTextEnd__ValueAssignment : ( RULE_PLAIN_TEXT_END ) ;
    public final void rule__DTextEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7039:1: ( ( RULE_PLAIN_TEXT_END ) )
            // InternalDmx.g:7040:2: ( RULE_PLAIN_TEXT_END )
            {
            // InternalDmx.g:7040:2: ( RULE_PLAIN_TEXT_END )
            // InternalDmx.g:7041:3: RULE_PLAIN_TEXT_END
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextEndAccess().getValuePLAIN_TEXT_ENDTerminalRuleCall_0()); 
            }
            match(input,RULE_PLAIN_TEXT_END,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTextEndAccess().getValuePLAIN_TEXT_ENDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DTextEnd__ValueAssignment"


    // $ANTLR start "rule__DAssignment__MemberAssignment_0_1"
    // InternalDmx.g:7050:1: rule__DAssignment__MemberAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DAssignment__MemberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7054:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7055:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7055:2: ( ( RULE_ID ) )
            // InternalDmx.g:7056:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0()); 
            }
            // InternalDmx.g:7057:3: ( RULE_ID )
            // InternalDmx.g:7058:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0()); 
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
    // $ANTLR end "rule__DAssignment__MemberAssignment_0_1"


    // $ANTLR start "rule__DAssignment__ValueAssignment_0_3"
    // InternalDmx.g:7069:1: rule__DAssignment__ValueAssignment_0_3 : ( ruleDAssignment ) ;
    public final void rule__DAssignment__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7073:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7074:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7074:2: ( ruleDAssignment )
            // InternalDmx.g:7075:3: ruleDAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getValueDAssignmentParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAssignmentAccess().getValueDAssignmentParserRuleCall_0_3_0()); 
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
    // $ANTLR end "rule__DAssignment__ValueAssignment_0_3"


    // $ANTLR start "rule__DOrExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7084:1: rule__DOrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__DOrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7088:1: ( ( ruleOpOr ) )
            // InternalDmx.g:7089:2: ( ruleOpOr )
            {
            // InternalDmx.g:7089:2: ( ruleOpOr )
            // InternalDmx.g:7090:3: ruleOpOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DOrExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DOrExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7099:1: rule__DOrExpression__RightOperandAssignment_1_1 : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7103:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:7104:2: ( ruleDAndExpression )
            {
            // InternalDmx.g:7104:2: ( ruleDAndExpression )
            // InternalDmx.g:7105:3: ruleDAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DOrExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DAndExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7114:1: rule__DAndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__DAndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7118:1: ( ( ruleOpAnd ) )
            // InternalDmx.g:7119:2: ( ruleOpAnd )
            {
            // InternalDmx.g:7119:2: ( ruleOpAnd )
            // InternalDmx.g:7120:3: ruleOpAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DAndExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DAndExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7129:1: rule__DAndExpression__RightOperandAssignment_1_1 : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7133:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:7134:2: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:7134:2: ( ruleDEqualityExpression )
            // InternalDmx.g:7135:3: ruleDEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DAndExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DEqualityExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7144:1: rule__DEqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__DEqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7148:1: ( ( ruleOpEquality ) )
            // InternalDmx.g:7149:2: ( ruleOpEquality )
            {
            // InternalDmx.g:7149:2: ( ruleOpEquality )
            // InternalDmx.g:7150:3: ruleOpEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DEqualityExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DEqualityExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7159:1: rule__DEqualityExpression__RightOperandAssignment_1_1 : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7163:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:7164:2: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:7164:2: ( ruleDRelationalExpression )
            // InternalDmx.g:7165:3: ruleDRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DEqualityExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DRelationalExpression__TypeAssignment_1_0_1"
    // InternalDmx.g:7174:1: rule__DRelationalExpression__TypeAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DRelationalExpression__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7178:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7179:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7179:2: ( ( RULE_ID ) )
            // InternalDmx.g:7180:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0()); 
            }
            // InternalDmx.g:7181:3: ( RULE_ID )
            // InternalDmx.g:7182:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeIDTerminalRuleCall_1_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeIDTerminalRuleCall_1_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__TypeAssignment_1_0_1"


    // $ANTLR start "rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1"
    // InternalDmx.g:7193:1: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7197:1: ( ( ruleOpCompare ) )
            // InternalDmx.g:7198:2: ( ruleOpCompare )
            {
            // InternalDmx.g:7198:2: ( ruleOpCompare )
            // InternalDmx.g:7199:3: ruleOpCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1"


    // $ANTLR start "rule__DRelationalExpression__RightOperandAssignment_1_1_1"
    // InternalDmx.g:7208:1: rule__DRelationalExpression__RightOperandAssignment_1_1_1 : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__RightOperandAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7212:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:7213:2: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:7213:2: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:7214:3: ruleDOtherOperatorExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__DRelationalExpression__RightOperandAssignment_1_1_1"


    // $ANTLR start "rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7223:1: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOther ) ;
    public final void rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7227:1: ( ( ruleOpOther ) )
            // InternalDmx.g:7228:2: ( ruleOpOther )
            {
            // InternalDmx.g:7228:2: ( ruleOpOther )
            // InternalDmx.g:7229:3: ruleOpOther
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpOther();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DOtherOperatorExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7238:1: rule__DOtherOperatorExpression__RightOperandAssignment_1_1 : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7242:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:7243:2: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:7243:2: ( ruleDAdditiveExpression )
            // InternalDmx.g:7244:3: ruleDAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DOtherOperatorExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DAdditiveExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7253:1: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__DAdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7257:1: ( ( ruleOpAdd ) )
            // InternalDmx.g:7258:2: ( ruleOpAdd )
            {
            // InternalDmx.g:7258:2: ( ruleOpAdd )
            // InternalDmx.g:7259:3: ruleOpAdd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpAdd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DAdditiveExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DAdditiveExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7268:1: rule__DAdditiveExpression__RightOperandAssignment_1_1 : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7272:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:7273:2: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:7273:2: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:7274:3: ruleDMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DAdditiveExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1"
    // InternalDmx.g:7283:1: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7287:1: ( ( ruleOpMulti ) )
            // InternalDmx.g:7288:2: ( ruleOpMulti )
            {
            // InternalDmx.g:7288:2: ( ruleOpMulti )
            // InternalDmx.g:7289:3: ruleOpMulti
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpMulti();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__DMultiplicativeExpression__RightOperandAssignment_1_1"
    // InternalDmx.g:7298:1: rule__DMultiplicativeExpression__RightOperandAssignment_1_1 : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7302:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7303:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7303:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7304:3: ruleDUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__DMultiplicativeExpression__RightOperandAssignment_1_1"


    // $ANTLR start "rule__DUnaryOperation__OperatorAssignment_0_1"
    // InternalDmx.g:7313:1: rule__DUnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__DUnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7317:1: ( ( ruleOpUnary ) )
            // InternalDmx.g:7318:2: ( ruleOpUnary )
            {
            // InternalDmx.g:7318:2: ( ruleOpUnary )
            // InternalDmx.g:7319:3: ruleOpUnary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOpUnary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__DUnaryOperation__OperatorAssignment_0_1"


    // $ANTLR start "rule__DUnaryOperation__OperandAssignment_0_2"
    // InternalDmx.g:7328:1: rule__DUnaryOperation__OperandAssignment_0_2 : ( ruleDUnaryOperation ) ;
    public final void rule__DUnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7332:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7333:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7333:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7334:3: ruleDUnaryOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperandDUnaryOperationParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDUnaryOperationAccess().getOperandDUnaryOperationParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__DUnaryOperation__OperandAssignment_0_2"


    // $ANTLR start "rule__DCastExpression__TypeAssignment_1_1"
    // InternalDmx.g:7343:1: rule__DCastExpression__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCastExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7347:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7348:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7348:2: ( ( RULE_ID ) )
            // InternalDmx.g:7349:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0()); 
            }
            // InternalDmx.g:7350:3: ( RULE_ID )
            // InternalDmx.g:7351:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeDTypeIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getTypeDTypeIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0()); 
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
    // $ANTLR end "rule__DCastExpression__TypeAssignment_1_1"


    // $ANTLR start "rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2"
    // InternalDmx.g:7362:1: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7366:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7367:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7367:2: ( ( RULE_ID ) )
            // InternalDmx.g:7368:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0()); 
            }
            // InternalDmx.g:7369:3: ( RULE_ID )
            // InternalDmx.g:7370:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberIDTerminalRuleCall_1_0_0_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberIDTerminalRuleCall_1_0_0_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2"


    // $ANTLR start "rule__DTypedMemberReference__ValueAssignment_1_0_1"
    // InternalDmx.g:7381:1: rule__DTypedMemberReference__ValueAssignment_1_0_1 : ( ruleDAssignment ) ;
    public final void rule__DTypedMemberReference__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7385:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7386:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7386:2: ( ruleDAssignment )
            // InternalDmx.g:7387:3: ruleDAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__ValueAssignment_1_0_1"


    // $ANTLR start "rule__DTypedMemberReference__MemberAssignment_1_1_1"
    // InternalDmx.g:7396:1: rule__DTypedMemberReference__MemberAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7400:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7401:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7401:2: ( ( RULE_ID ) )
            // InternalDmx.g:7402:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0()); 
            }
            // InternalDmx.g:7403:3: ( RULE_ID )
            // InternalDmx.g:7404:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberIDTerminalRuleCall_1_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberIDTerminalRuleCall_1_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__MemberAssignment_1_1_1"


    // $ANTLR start "rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0"
    // InternalDmx.g:7415:1: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 : ( ( '(' ) ) ;
    public final void rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7419:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7420:2: ( ( '(' ) )
            {
            // InternalDmx.g:7420:2: ( ( '(' ) )
            // InternalDmx.g:7421:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
            }
            // InternalDmx.g:7422:3: ( '(' )
            // InternalDmx.g:7423:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0"


    // $ANTLR start "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0"
    // InternalDmx.g:7434:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7438:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7439:2: ( ruleDExpression )
            {
            // InternalDmx.g:7439:2: ( ruleDExpression )
            // InternalDmx.g:7440:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0"


    // $ANTLR start "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1"
    // InternalDmx.g:7449:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7453:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7454:2: ( ruleDExpression )
            {
            // InternalDmx.g:7454:2: ( ruleDExpression )
            // InternalDmx.g:7455:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1"


    // $ANTLR start "rule__DTypedMemberReference__BeforeAssignment_1_1_2_1"
    // InternalDmx.g:7464:1: rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 : ( ( '@before' ) ) ;
    public final void rule__DTypedMemberReference__BeforeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7468:1: ( ( ( '@before' ) ) )
            // InternalDmx.g:7469:2: ( ( '@before' ) )
            {
            // InternalDmx.g:7469:2: ( ( '@before' ) )
            // InternalDmx.g:7470:3: ( '@before' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
            }
            // InternalDmx.g:7471:3: ( '@before' )
            // InternalDmx.g:7472:4: '@before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
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
    // $ANTLR end "rule__DTypedMemberReference__BeforeAssignment_1_1_2_1"


    // $ANTLR start "rule__DReturnExpression__ExpressionAssignment_2"
    // InternalDmx.g:7483:1: rule__DReturnExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DReturnExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7487:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7488:2: ( ruleDExpression )
            {
            // InternalDmx.g:7488:2: ( ruleDExpression )
            // InternalDmx.g:7489:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getExpressionDExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDReturnExpressionAccess().getExpressionDExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__DReturnExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__DRaiseExpression__ExpressionAssignment_2"
    // InternalDmx.g:7498:1: rule__DRaiseExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DRaiseExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7502:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7503:2: ( ruleDExpression )
            {
            // InternalDmx.g:7503:2: ( ruleDExpression )
            // InternalDmx.g:7504:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getExpressionDExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRaiseExpressionAccess().getExpressionDExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__DRaiseExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__DFunctionCall__FunctionAssignment_1"
    // InternalDmx.g:7513:1: rule__DFunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DFunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7517:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7518:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7518:2: ( ( RULE_ID ) )
            // InternalDmx.g:7519:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0()); 
            }
            // InternalDmx.g:7520:3: ( RULE_ID )
            // InternalDmx.g:7521:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0()); 
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
    // $ANTLR end "rule__DFunctionCall__FunctionAssignment_1"


    // $ANTLR start "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0"
    // InternalDmx.g:7532:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7536:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7537:2: ( ruleDExpression )
            {
            // InternalDmx.g:7537:2: ( ruleDExpression )
            // InternalDmx.g:7538:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0"


    // $ANTLR start "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1"
    // InternalDmx.g:7547:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7551:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7552:2: ( ruleDExpression )
            {
            // InternalDmx.g:7552:2: ( ruleDExpression )
            // InternalDmx.g:7553:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1"


    // $ANTLR start "rule__DConstructorCall__ConstructorAssignment_2"
    // InternalDmx.g:7562:1: rule__DConstructorCall__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DConstructorCall__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7566:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7567:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7567:2: ( ( RULE_ID ) )
            // InternalDmx.g:7568:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0()); 
            }
            // InternalDmx.g:7569:3: ( RULE_ID )
            // InternalDmx.g:7570:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__DConstructorCall__ConstructorAssignment_2"


    // $ANTLR start "rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0"
    // InternalDmx.g:7581:1: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 : ( ( '(' ) ) ;
    public final void rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7585:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7586:2: ( ( '(' ) )
            {
            // InternalDmx.g:7586:2: ( ( '(' ) )
            // InternalDmx.g:7587:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            // InternalDmx.g:7588:3: ( '(' )
            // InternalDmx.g:7589:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
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
    // $ANTLR end "rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0"


    // $ANTLR start "rule__DConstructorCall__ArgumentsAssignment_3_1_0"
    // InternalDmx.g:7600:1: rule__DConstructorCall__ArgumentsAssignment_3_1_0 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7604:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7605:2: ( ruleDExpression )
            {
            // InternalDmx.g:7605:2: ( ruleDExpression )
            // InternalDmx.g:7606:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0()); 
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
    // $ANTLR end "rule__DConstructorCall__ArgumentsAssignment_3_1_0"


    // $ANTLR start "rule__DConstructorCall__ArgumentsAssignment_3_1_1_1"
    // InternalDmx.g:7615:1: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7619:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7620:2: ( ruleDExpression )
            {
            // InternalDmx.g:7620:2: ( ruleDExpression )
            // InternalDmx.g:7621:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0()); 
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
    // $ANTLR end "rule__DConstructorCall__ArgumentsAssignment_3_1_1_1"


    // $ANTLR start "rule__DContextReference__TargetAssignment_1"
    // InternalDmx.g:7630:1: rule__DContextReference__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DContextReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7634:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7635:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7635:2: ( ( RULE_ID ) )
            // InternalDmx.g:7636:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0()); 
            }
            // InternalDmx.g:7637:3: ( RULE_ID )
            // InternalDmx.g:7638:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getTargetDNamedElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getTargetDNamedElementIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0()); 
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
    // $ANTLR end "rule__DContextReference__TargetAssignment_1"


    // $ANTLR start "rule__DContextReference__BeforeAssignment_2"
    // InternalDmx.g:7649:1: rule__DContextReference__BeforeAssignment_2 : ( ( '@before' ) ) ;
    public final void rule__DContextReference__BeforeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7653:1: ( ( ( '@before' ) ) )
            // InternalDmx.g:7654:2: ( ( '@before' ) )
            {
            // InternalDmx.g:7654:2: ( ( '@before' ) )
            // InternalDmx.g:7655:3: ( '@before' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
            }
            // InternalDmx.g:7656:3: ( '@before' )
            // InternalDmx.g:7657:4: '@before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
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
    // $ANTLR end "rule__DContextReference__BeforeAssignment_2"


    // $ANTLR start "rule__DIfExpression__IfAssignment_2"
    // InternalDmx.g:7668:1: rule__DIfExpression__IfAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7672:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7673:2: ( ruleDExpression )
            {
            // InternalDmx.g:7673:2: ( ruleDExpression )
            // InternalDmx.g:7674:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__DIfExpression__IfAssignment_2"


    // $ANTLR start "rule__DIfExpression__ThenAssignment_4"
    // InternalDmx.g:7683:1: rule__DIfExpression__ThenAssignment_4 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7687:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7688:2: ( ruleDExpression )
            {
            // InternalDmx.g:7688:2: ( ruleDExpression )
            // InternalDmx.g:7689:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__DIfExpression__ThenAssignment_4"


    // $ANTLR start "rule__DIfExpression__ElseAssignment_5_1"
    // InternalDmx.g:7698:1: rule__DIfExpression__ElseAssignment_5_1 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7702:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7703:2: ( ruleDExpression )
            {
            // InternalDmx.g:7703:2: ( ruleDExpression )
            // InternalDmx.g:7704:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__DIfExpression__ElseAssignment_5_1"


    // $ANTLR start "rule__DForLoopExpression__DeclaredParamAssignment_0_0_2"
    // InternalDmx.g:7713:1: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__DForLoopExpression__DeclaredParamAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7717:1: ( ( RULE_ID ) )
            // InternalDmx.g:7718:2: ( RULE_ID )
            {
            // InternalDmx.g:7718:2: ( RULE_ID )
            // InternalDmx.g:7719:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamIDTerminalRuleCall_0_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamIDTerminalRuleCall_0_0_2_0()); 
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
    // $ANTLR end "rule__DForLoopExpression__DeclaredParamAssignment_0_0_2"


    // $ANTLR start "rule__DForLoopExpression__ForExpressionAssignment_1"
    // InternalDmx.g:7728:1: rule__DForLoopExpression__ForExpressionAssignment_1 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__ForExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7732:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7733:2: ( ruleDExpression )
            {
            // InternalDmx.g:7733:2: ( ruleDExpression )
            // InternalDmx.g:7734:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__DForLoopExpression__ForExpressionAssignment_1"


    // $ANTLR start "rule__DForLoopExpression__EachExpressionAssignment_3"
    // InternalDmx.g:7743:1: rule__DForLoopExpression__EachExpressionAssignment_3 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__EachExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7747:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7748:2: ( ruleDExpression )
            {
            // InternalDmx.g:7748:2: ( ruleDExpression )
            // InternalDmx.g:7749:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__DForLoopExpression__EachExpressionAssignment_3"


    // $ANTLR start "rule__DBooleanLiteral__ValueAssignment_1_0"
    // InternalDmx.g:7758:1: rule__DBooleanLiteral__ValueAssignment_1_0 : ( ( 'TRUE' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7762:1: ( ( ( 'TRUE' ) ) )
            // InternalDmx.g:7763:2: ( ( 'TRUE' ) )
            {
            // InternalDmx.g:7763:2: ( ( 'TRUE' ) )
            // InternalDmx.g:7764:3: ( 'TRUE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            // InternalDmx.g:7765:3: ( 'TRUE' )
            // InternalDmx.g:7766:4: 'TRUE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
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
    // $ANTLR end "rule__DBooleanLiteral__ValueAssignment_1_0"


    // $ANTLR start "rule__DBooleanLiteral__ValueAssignment_1_1"
    // InternalDmx.g:7777:1: rule__DBooleanLiteral__ValueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7781:1: ( ( ( 'true' ) ) )
            // InternalDmx.g:7782:2: ( ( 'true' ) )
            {
            // InternalDmx.g:7782:2: ( ( 'true' ) )
            // InternalDmx.g:7783:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            // InternalDmx.g:7784:3: ( 'true' )
            // InternalDmx.g:7785:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
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
    // $ANTLR end "rule__DBooleanLiteral__ValueAssignment_1_1"


    // $ANTLR start "rule__DStringLiteral__ValueAssignment_1"
    // InternalDmx.g:7796:1: rule__DStringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DStringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7800:1: ( ( RULE_STRING ) )
            // InternalDmx.g:7801:2: ( RULE_STRING )
            {
            // InternalDmx.g:7801:2: ( RULE_STRING )
            // InternalDmx.g:7802:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DStringLiteral__ValueAssignment_1"


    // $ANTLR start "rule__DNaturalLiteral__ValueAssignment_1"
    // InternalDmx.g:7811:1: rule__DNaturalLiteral__ValueAssignment_1 : ( RULE_NATURAL ) ;
    public final void rule__DNaturalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7815:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:7816:2: ( RULE_NATURAL )
            {
            // InternalDmx.g:7816:2: ( RULE_NATURAL )
            // InternalDmx.g:7817:3: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getValueNATURALTerminalRuleCall_1_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNaturalLiteralAccess().getValueNATURALTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DNaturalLiteral__ValueAssignment_1"


    // $ANTLR start "rule__DDecimalLiteral__ValueAssignment_1"
    // InternalDmx.g:7826:1: rule__DDecimalLiteral__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__DDecimalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7830:1: ( ( ruleDECIMAL ) )
            // InternalDmx.g:7831:2: ( ruleDECIMAL )
            {
            // InternalDmx.g:7831:2: ( ruleDECIMAL )
            // InternalDmx.g:7832:3: ruleDECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getValueDECIMALParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDDecimalLiteralAccess().getValueDECIMALParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__DDecimalLiteral__ValueAssignment_1"

    // $ANTLR start synpred57_InternalDmx
    public final void synpred57_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2595:3: ( rule__DOrExpression__Group_1__0 )
        // InternalDmx.g:2595:3: rule__DOrExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOrExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalDmx

    // $ANTLR start synpred58_InternalDmx
    public final void synpred58_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2784:3: ( rule__DAndExpression__Group_1__0 )
        // InternalDmx.g:2784:3: rule__DAndExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAndExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalDmx

    // $ANTLR start synpred59_InternalDmx
    public final void synpred59_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2973:3: ( rule__DEqualityExpression__Group_1__0 )
        // InternalDmx.g:2973:3: rule__DEqualityExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DEqualityExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalDmx

    // $ANTLR start synpred60_InternalDmx
    public final void synpred60_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3162:3: ( rule__DRelationalExpression__Alternatives_1 )
        // InternalDmx.g:3162:3: rule__DRelationalExpression__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DRelationalExpression__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalDmx

    // $ANTLR start synpred61_InternalDmx
    public final void synpred61_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3486:3: ( rule__DOtherOperatorExpression__Group_1__0 )
        // InternalDmx.g:3486:3: rule__DOtherOperatorExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOtherOperatorExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalDmx

    // $ANTLR start synpred62_InternalDmx
    public final void synpred62_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3675:3: ( rule__DAdditiveExpression__Group_1__0 )
        // InternalDmx.g:3675:3: rule__DAdditiveExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAdditiveExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalDmx

    // $ANTLR start synpred63_InternalDmx
    public final void synpred63_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3864:3: ( rule__DMultiplicativeExpression__Group_1__0 )
        // InternalDmx.g:3864:3: rule__DMultiplicativeExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DMultiplicativeExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalDmx

    // $ANTLR start synpred64_InternalDmx
    public final void synpred64_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4134:3: ( rule__DCastExpression__Group_1__0 )
        // InternalDmx.g:4134:3: rule__DCastExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DCastExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalDmx

    // $ANTLR start synpred65_InternalDmx
    public final void synpred65_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4323:3: ( rule__DTypedMemberReference__Alternatives_1 )
        // InternalDmx.g:4323:3: rule__DTypedMemberReference__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DTypedMemberReference__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalDmx

    // $ANTLR start synpred69_InternalDmx
    public final void synpred69_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4998:3: ( rule__DReturnExpression__ExpressionAssignment_2 )
        // InternalDmx.g:4998:3: rule__DReturnExpression__ExpressionAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__DReturnExpression__ExpressionAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalDmx

    // Delegated rules

    public final boolean synpred64_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\12\5\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\116\5\uffff\1\114\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\10\1\6";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\6\4\uffff\1\1\12\uffff\2\2\2\3\2\4\2\7\1\uffff\4\1\43\uffff\1\5\1\10\4\uffff\1\11\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\2\12\7\uffff\4\12\10\uffff\1\12\6\uffff\27\12\5\uffff\1\12\1\uffff\3\12\1\13\1\uffff\4\12\1\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1374:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\10\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\112\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\2\1\3\1\5\1\4\1\1\1\0\1\6\1\7\1\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\7\uffff\1\2\1\3\2\1\10\uffff\1\1\6\uffff\13\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1\5\uffff\1\1\1\uffff\3\1\2\uffff\4\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3162:2: ( rule__DRelationalExpression__Alternatives_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\77\uffff";
    static final String dfa_16s = "\1\32\76\uffff";
    static final String dfa_17s = "\1\4\1\uffff\2\0\73\uffff";
    static final String dfa_18s = "\1\116\1\uffff\2\0\73\uffff";
    static final String dfa_19s = "\1\uffff\1\1\30\uffff\1\2\44\uffff";
    static final String dfa_20s = "\2\uffff\1\0\1\1\73\uffff}>";
    static final String[] dfa_21s = {
            "\2\1\2\uffff\2\32\1\1\6\uffff\4\32\10\1\1\32\4\1\2\uffff\1\2\1\3\25\32\3\1\2\uffff\1\32\1\uffff\3\32\2\1\4\32\1\1\1\uffff\2\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "4998:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_3 = input.LA(1);

                         
                        int index43_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index43_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x38000033DFE00430L,0x0000000000006860L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000003C000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001F800000060000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x001F800000060002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00E0000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0700000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0700000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3800003000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x38000033DFE00430L,0x0000000000006868L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000C0000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000003C0000410L,0x0000000000006000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000003000000010L});

}