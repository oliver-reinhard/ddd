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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_STRING", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'*'", "'FALSE'", "'false'", "'NIL'", "'nil'", "'E'", "'e'", "'+'", "'-'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'..'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'text'", "':'", "';'", "'expr'", "'.'", "')'", "','", "'('", "'if'", "'then'", "'end'", "'else'", "'do'", "'for'", "'TRUE'", "'true'"
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDmx.g:1054:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDmx.g:1055:1: ( ruleQualifiedName EOF )
            // InternalDmx.g:1056:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDmx.g:1063:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1067:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDmx.g:1068:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDmx.g:1068:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDmx.g:1069:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalDmx.g:1070:3: ( rule__QualifiedName__Group__0 )
            // InternalDmx.g:1070:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


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

                if ( (LA2_1==16) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_PLAIN_TEXT_MIDDLE && LA2_1<=RULE_PLAIN_TEXT_END)||(LA2_1>=17 && LA2_1<=20)||LA2_1==29||(LA2_1>=36 && LA2_1<=58)||LA2_1==64||(LA2_1>=66 && LA2_1<=69)||(LA2_1>=71 && LA2_1<=74)) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_NATURAL||LA2_0==RULE_STRING||(LA2_0>=21 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=33)||(LA2_0>=36 && LA2_0<=37)||(LA2_0>=59 && LA2_0<=61)||(LA2_0>=69 && LA2_0<=70)||(LA2_0>=75 && LA2_0<=77)) ) {
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
            else if ( ((LA5_0>=RULE_NATURAL && LA5_0<=RULE_ID)||LA5_0==RULE_STRING||(LA5_0>=21 && LA5_0<=28)||(LA5_0>=30 && LA5_0<=33)||(LA5_0>=69 && LA5_0<=70)||(LA5_0>=75 && LA5_0<=77)) ) {
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

                    if ( (LA7_2==16) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==EOF||(LA7_2>=RULE_PLAIN_TEXT_MIDDLE && LA7_2<=RULE_PLAIN_TEXT_END)||(LA7_2>=17 && LA7_2<=20)||LA7_2==29||(LA7_2>=36 && LA7_2<=58)||LA7_2==64||(LA7_2>=66 && LA7_2<=69)||(LA7_2>=71 && LA7_2<=74)) ) {
                        alt7=2;
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


    // $ANTLR start "rule__DPrimaryExpression__Alternatives"
    // InternalDmx.g:1353:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );
    public final void rule__DPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1357:1: ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDmx.g:1358:2: ( ruleDLiteralExpression )
                    {
                    // InternalDmx.g:1358:2: ( ruleDLiteralExpression )
                    // InternalDmx.g:1359:3: ruleDLiteralExpression
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
                    // InternalDmx.g:1364:2: ( ruleDSelfExpression )
                    {
                    // InternalDmx.g:1364:2: ( ruleDSelfExpression )
                    // InternalDmx.g:1365:3: ruleDSelfExpression
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
                    // InternalDmx.g:1370:2: ( ruleDReturnExpression )
                    {
                    // InternalDmx.g:1370:2: ( ruleDReturnExpression )
                    // InternalDmx.g:1371:3: ruleDReturnExpression
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
                    // InternalDmx.g:1376:2: ( ruleDRaiseExpression )
                    {
                    // InternalDmx.g:1376:2: ( ruleDRaiseExpression )
                    // InternalDmx.g:1377:3: ruleDRaiseExpression
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
                    // InternalDmx.g:1382:2: ( ruleDParenthesizedExpression )
                    {
                    // InternalDmx.g:1382:2: ( ruleDParenthesizedExpression )
                    // InternalDmx.g:1383:3: ruleDParenthesizedExpression
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
                    // InternalDmx.g:1388:2: ( ruleDFunctionCall )
                    {
                    // InternalDmx.g:1388:2: ( ruleDFunctionCall )
                    // InternalDmx.g:1389:3: ruleDFunctionCall
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
                    // InternalDmx.g:1394:2: ( ruleDConstructorCall )
                    {
                    // InternalDmx.g:1394:2: ( ruleDConstructorCall )
                    // InternalDmx.g:1395:3: ruleDConstructorCall
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
                    // InternalDmx.g:1400:2: ( ruleDContextReference )
                    {
                    // InternalDmx.g:1400:2: ( ruleDContextReference )
                    // InternalDmx.g:1401:3: ruleDContextReference
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
                    // InternalDmx.g:1406:2: ( ruleDIfExpression )
                    {
                    // InternalDmx.g:1406:2: ( ruleDIfExpression )
                    // InternalDmx.g:1407:3: ruleDIfExpression
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
                    // InternalDmx.g:1412:2: ( ( ruleDForLoopExpression ) )
                    {
                    // InternalDmx.g:1412:2: ( ( ruleDForLoopExpression ) )
                    // InternalDmx.g:1413:3: ( ruleDForLoopExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9()); 
                    }
                    // InternalDmx.g:1414:3: ( ruleDForLoopExpression )
                    // InternalDmx.g:1414:4: ruleDForLoopExpression
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
    // InternalDmx.g:1422:1: rule__DLiteralExpression__Alternatives : ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) );
    public final void rule__DLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1426:1: ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 76:
            case 77:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==66) ) {
                    int LA9_5 = input.LA(3);

                    if ( (LA9_5==RULE_ID) ) {
                        alt9=3;
                    }
                    else if ( (LA9_5==RULE_NATURAL) ) {
                        alt9=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_3==EOF||(LA9_3>=RULE_PLAIN_TEXT_MIDDLE && LA9_3<=RULE_PLAIN_TEXT_END)||(LA9_3>=17 && LA9_3<=20)||LA9_3==29||(LA9_3>=36 && LA9_3<=58)||LA9_3==64||(LA9_3>=67 && LA9_3<=68)||(LA9_3>=71 && LA9_3<=74)) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDmx.g:1427:2: ( ruleDBooleanLiteral )
                    {
                    // InternalDmx.g:1427:2: ( ruleDBooleanLiteral )
                    // InternalDmx.g:1428:3: ruleDBooleanLiteral
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
                    // InternalDmx.g:1433:2: ( ruleDStringLiteral )
                    {
                    // InternalDmx.g:1433:2: ( ruleDStringLiteral )
                    // InternalDmx.g:1434:3: ruleDStringLiteral
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
                    // InternalDmx.g:1439:2: ( ruleDNaturalLiteral )
                    {
                    // InternalDmx.g:1439:2: ( ruleDNaturalLiteral )
                    // InternalDmx.g:1440:3: ruleDNaturalLiteral
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
                    // InternalDmx.g:1445:2: ( ruleDDecimalLiteral )
                    {
                    // InternalDmx.g:1445:2: ( ruleDDecimalLiteral )
                    // InternalDmx.g:1446:3: ruleDDecimalLiteral
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
                    // InternalDmx.g:1451:2: ( ruleDNilLiteral )
                    {
                    // InternalDmx.g:1451:2: ( ruleDNilLiteral )
                    // InternalDmx.g:1452:3: ruleDNilLiteral
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
    // InternalDmx.g:1461:1: rule__DSelfExpression__Alternatives_1 : ( ( 'SELF' ) | ( 'self' ) );
    public final void rule__DSelfExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1465:1: ( ( 'SELF' ) | ( 'self' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDmx.g:1466:2: ( 'SELF' )
                    {
                    // InternalDmx.g:1466:2: ( 'SELF' )
                    // InternalDmx.g:1467:3: 'SELF'
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
                    // InternalDmx.g:1472:2: ( 'self' )
                    {
                    // InternalDmx.g:1472:2: ( 'self' )
                    // InternalDmx.g:1473:3: 'self'
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
    // InternalDmx.g:1482:1: rule__DReturnExpression__Alternatives_1 : ( ( 'RETURN' ) | ( 'return' ) );
    public final void rule__DReturnExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1486:1: ( ( 'RETURN' ) | ( 'return' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
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
                    // InternalDmx.g:1487:2: ( 'RETURN' )
                    {
                    // InternalDmx.g:1487:2: ( 'RETURN' )
                    // InternalDmx.g:1488:3: 'RETURN'
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
                    // InternalDmx.g:1493:2: ( 'return' )
                    {
                    // InternalDmx.g:1493:2: ( 'return' )
                    // InternalDmx.g:1494:3: 'return'
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
    // InternalDmx.g:1503:1: rule__DRaiseExpression__Alternatives_1 : ( ( 'RAISE' ) | ( 'raise' ) );
    public final void rule__DRaiseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1507:1: ( ( 'RAISE' ) | ( 'raise' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
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
                    // InternalDmx.g:1508:2: ( 'RAISE' )
                    {
                    // InternalDmx.g:1508:2: ( 'RAISE' )
                    // InternalDmx.g:1509:3: 'RAISE'
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
                    // InternalDmx.g:1514:2: ( 'raise' )
                    {
                    // InternalDmx.g:1514:2: ( 'raise' )
                    // InternalDmx.g:1515:3: 'raise'
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
    // InternalDmx.g:1524:1: rule__OpConstructor__Alternatives : ( ( 'NEW' ) | ( 'new' ) );
    public final void rule__OpConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1528:1: ( ( 'NEW' ) | ( 'new' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
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
                    // InternalDmx.g:1529:2: ( 'NEW' )
                    {
                    // InternalDmx.g:1529:2: ( 'NEW' )
                    // InternalDmx.g:1530:3: 'NEW'
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
                    // InternalDmx.g:1535:2: ( 'new' )
                    {
                    // InternalDmx.g:1535:2: ( 'new' )
                    // InternalDmx.g:1536:3: 'new'
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
    // InternalDmx.g:1545:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_NATURAL ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1549:1: ( ( RULE_NATURAL ) | ( '*' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_NATURAL) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
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
                    // InternalDmx.g:1550:2: ( RULE_NATURAL )
                    {
                    // InternalDmx.g:1550:2: ( RULE_NATURAL )
                    // InternalDmx.g:1551:3: RULE_NATURAL
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
                    // InternalDmx.g:1556:2: ( '*' )
                    {
                    // InternalDmx.g:1556:2: ( '*' )
                    // InternalDmx.g:1557:3: '*'
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
    // InternalDmx.g:1566:1: rule__DBooleanLiteral__Alternatives_1 : ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) );
    public final void rule__DBooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1570:1: ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt15=1;
                }
                break;
            case 77:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDmx.g:1571:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    {
                    // InternalDmx.g:1571:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    // InternalDmx.g:1572:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0()); 
                    }
                    // InternalDmx.g:1573:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    // InternalDmx.g:1573:4: rule__DBooleanLiteral__ValueAssignment_1_0
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
                    // InternalDmx.g:1577:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    {
                    // InternalDmx.g:1577:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    // InternalDmx.g:1578:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1()); 
                    }
                    // InternalDmx.g:1579:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    // InternalDmx.g:1579:4: rule__DBooleanLiteral__ValueAssignment_1_1
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
                    // InternalDmx.g:1583:2: ( 'FALSE' )
                    {
                    // InternalDmx.g:1583:2: ( 'FALSE' )
                    // InternalDmx.g:1584:3: 'FALSE'
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
                    // InternalDmx.g:1589:2: ( 'false' )
                    {
                    // InternalDmx.g:1589:2: ( 'false' )
                    // InternalDmx.g:1590:3: 'false'
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
    // InternalDmx.g:1599:1: rule__DNilLiteral__Alternatives_1 : ( ( 'NIL' ) | ( 'nil' ) );
    public final void rule__DNilLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1603:1: ( ( 'NIL' ) | ( 'nil' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDmx.g:1604:2: ( 'NIL' )
                    {
                    // InternalDmx.g:1604:2: ( 'NIL' )
                    // InternalDmx.g:1605:3: 'NIL'
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
                    // InternalDmx.g:1610:2: ( 'nil' )
                    {
                    // InternalDmx.g:1610:2: ( 'nil' )
                    // InternalDmx.g:1611:3: 'nil'
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
    // InternalDmx.g:1620:1: rule__DECIMAL__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__DECIMAL__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1624:1: ( ( 'E' ) | ( 'e' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
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
                    // InternalDmx.g:1625:2: ( 'E' )
                    {
                    // InternalDmx.g:1625:2: ( 'E' )
                    // InternalDmx.g:1626:3: 'E'
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
                    // InternalDmx.g:1631:2: ( 'e' )
                    {
                    // InternalDmx.g:1631:2: ( 'e' )
                    // InternalDmx.g:1632:3: 'e'
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
    // InternalDmx.g:1641:1: rule__DECIMAL__Alternatives_3_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__DECIMAL__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1645:1: ( ( '+' ) | ( '-' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
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
                    // InternalDmx.g:1646:2: ( '+' )
                    {
                    // InternalDmx.g:1646:2: ( '+' )
                    // InternalDmx.g:1647:3: '+'
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
                    // InternalDmx.g:1652:2: ( '-' )
                    {
                    // InternalDmx.g:1652:2: ( '-' )
                    // InternalDmx.g:1653:3: '-'
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
    // InternalDmx.g:1662:1: rule__OpOr__Alternatives : ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1666:1: ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            case 41:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDmx.g:1667:2: ( ( 'OR' ) )
                    {
                    // InternalDmx.g:1667:2: ( ( 'OR' ) )
                    // InternalDmx.g:1668:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1669:3: ( 'OR' )
                    // InternalDmx.g:1669:4: 'OR'
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
                    // InternalDmx.g:1673:2: ( ( 'or' ) )
                    {
                    // InternalDmx.g:1673:2: ( ( 'or' ) )
                    // InternalDmx.g:1674:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1675:3: ( 'or' )
                    // InternalDmx.g:1675:4: 'or'
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
                    // InternalDmx.g:1679:2: ( ( 'XOR' ) )
                    {
                    // InternalDmx.g:1679:2: ( ( 'XOR' ) )
                    // InternalDmx.g:1680:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1681:3: ( 'XOR' )
                    // InternalDmx.g:1681:4: 'XOR'
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
                    // InternalDmx.g:1685:2: ( ( 'xor' ) )
                    {
                    // InternalDmx.g:1685:2: ( ( 'xor' ) )
                    // InternalDmx.g:1686:3: ( 'xor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1687:3: ( 'xor' )
                    // InternalDmx.g:1687:4: 'xor'
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
    // InternalDmx.g:1695:1: rule__OpAnd__Alternatives : ( ( ( 'AND' ) ) | ( ( 'and' ) ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1699:1: ( ( ( 'AND' ) ) | ( ( 'and' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            else if ( (LA20_0==43) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDmx.g:1700:2: ( ( 'AND' ) )
                    {
                    // InternalDmx.g:1700:2: ( ( 'AND' ) )
                    // InternalDmx.g:1701:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1702:3: ( 'AND' )
                    // InternalDmx.g:1702:4: 'AND'
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
                    // InternalDmx.g:1706:2: ( ( 'and' ) )
                    {
                    // InternalDmx.g:1706:2: ( ( 'and' ) )
                    // InternalDmx.g:1707:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1708:3: ( 'and' )
                    // InternalDmx.g:1708:4: 'and'
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
    // InternalDmx.g:1716:1: rule__OpEquality__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1720:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDmx.g:1721:2: ( ( '=' ) )
                    {
                    // InternalDmx.g:1721:2: ( ( '=' ) )
                    // InternalDmx.g:1722:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1723:3: ( '=' )
                    // InternalDmx.g:1723:4: '='
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
                    // InternalDmx.g:1727:2: ( ( '!=' ) )
                    {
                    // InternalDmx.g:1727:2: ( ( '!=' ) )
                    // InternalDmx.g:1728:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1729:3: ( '!=' )
                    // InternalDmx.g:1729:4: '!='
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
                    // InternalDmx.g:1733:2: ( ( '<>' ) )
                    {
                    // InternalDmx.g:1733:2: ( ( '<>' ) )
                    // InternalDmx.g:1734:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1735:3: ( '<>' )
                    // InternalDmx.g:1735:4: '<>'
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
    // InternalDmx.g:1743:1: rule__OpCompare__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1747:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 49:
                {
                alt22=3;
                }
                break;
            case 50:
                {
                alt22=4;
                }
                break;
            case 51:
                {
                alt22=5;
                }
                break;
            case 52:
                {
                alt22=6;
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
                    // InternalDmx.g:1748:2: ( ( '<' ) )
                    {
                    // InternalDmx.g:1748:2: ( ( '<' ) )
                    // InternalDmx.g:1749:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1750:3: ( '<' )
                    // InternalDmx.g:1750:4: '<'
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
                    // InternalDmx.g:1754:2: ( ( '<=' ) )
                    {
                    // InternalDmx.g:1754:2: ( ( '<=' ) )
                    // InternalDmx.g:1755:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1756:3: ( '<=' )
                    // InternalDmx.g:1756:4: '<='
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
                    // InternalDmx.g:1760:2: ( ( '\\u2264' ) )
                    {
                    // InternalDmx.g:1760:2: ( ( '\\u2264' ) )
                    // InternalDmx.g:1761:3: ( '\\u2264' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1762:3: ( '\\u2264' )
                    // InternalDmx.g:1762:4: '\\u2264'
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
                    // InternalDmx.g:1766:2: ( ( '>=' ) )
                    {
                    // InternalDmx.g:1766:2: ( ( '>=' ) )
                    // InternalDmx.g:1767:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1768:3: ( '>=' )
                    // InternalDmx.g:1768:4: '>='
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
                    // InternalDmx.g:1772:2: ( ( '\\u2265' ) )
                    {
                    // InternalDmx.g:1772:2: ( ( '\\u2265' ) )
                    // InternalDmx.g:1773:3: ( '\\u2265' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1774:3: ( '\\u2265' )
                    // InternalDmx.g:1774:4: '\\u2265'
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
                    // InternalDmx.g:1778:2: ( ( '>' ) )
                    {
                    // InternalDmx.g:1778:2: ( ( '>' ) )
                    // InternalDmx.g:1779:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5()); 
                    }
                    // InternalDmx.g:1780:3: ( '>' )
                    // InternalDmx.g:1780:4: '>'
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
    // InternalDmx.g:1788:1: rule__OpOther__Alternatives : ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__OpOther__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1792:1: ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt23=1;
                }
                break;
            case 54:
                {
                alt23=2;
                }
                break;
            case 55:
                {
                alt23=3;
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
                    // InternalDmx.g:1793:2: ( ( '..' ) )
                    {
                    // InternalDmx.g:1793:2: ( ( '..' ) )
                    // InternalDmx.g:1794:3: ( '..' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1795:3: ( '..' )
                    // InternalDmx.g:1795:4: '..'
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
                    // InternalDmx.g:1799:2: ( ( '->' ) )
                    {
                    // InternalDmx.g:1799:2: ( ( '->' ) )
                    // InternalDmx.g:1800:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1801:3: ( '->' )
                    // InternalDmx.g:1801:4: '->'
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
                    // InternalDmx.g:1805:2: ( ( '=>' ) )
                    {
                    // InternalDmx.g:1805:2: ( ( '=>' ) )
                    // InternalDmx.g:1806:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1807:3: ( '=>' )
                    // InternalDmx.g:1807:4: '=>'
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
    // InternalDmx.g:1815:1: rule__OpAdd__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1819:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            else if ( (LA24_0==37) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDmx.g:1820:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1820:2: ( ( '+' ) )
                    // InternalDmx.g:1821:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1822:3: ( '+' )
                    // InternalDmx.g:1822:4: '+'
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
                    // InternalDmx.g:1826:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1826:2: ( ( '-' ) )
                    // InternalDmx.g:1827:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1828:3: ( '-' )
                    // InternalDmx.g:1828:4: '-'
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
    // InternalDmx.g:1836:1: rule__OpMulti__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1840:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt25=1;
                }
                break;
            case 56:
                {
                alt25=2;
                }
                break;
            case 57:
                {
                alt25=3;
                }
                break;
            case 58:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalDmx.g:1841:2: ( ( '*' ) )
                    {
                    // InternalDmx.g:1841:2: ( ( '*' ) )
                    // InternalDmx.g:1842:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1843:3: ( '*' )
                    // InternalDmx.g:1843:4: '*'
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
                    // InternalDmx.g:1847:2: ( ( '/' ) )
                    {
                    // InternalDmx.g:1847:2: ( ( '/' ) )
                    // InternalDmx.g:1848:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1849:3: ( '/' )
                    // InternalDmx.g:1849:4: '/'
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
                    // InternalDmx.g:1853:2: ( ( '**' ) )
                    {
                    // InternalDmx.g:1853:2: ( ( '**' ) )
                    // InternalDmx.g:1854:3: ( '**' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1855:3: ( '**' )
                    // InternalDmx.g:1855:4: '**'
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
                    // InternalDmx.g:1859:2: ( ( '%' ) )
                    {
                    // InternalDmx.g:1859:2: ( ( '%' ) )
                    // InternalDmx.g:1860:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1861:3: ( '%' )
                    // InternalDmx.g:1861:4: '%'
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
    // InternalDmx.g:1869:1: rule__OpUnary__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1873:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 59:
                {
                alt26=3;
                }
                break;
            case 60:
                {
                alt26=4;
                }
                break;
            case 61:
                {
                alt26=5;
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
                    // InternalDmx.g:1874:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1874:2: ( ( '+' ) )
                    // InternalDmx.g:1875:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1876:3: ( '+' )
                    // InternalDmx.g:1876:4: '+'
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
                    // InternalDmx.g:1880:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1880:2: ( ( '-' ) )
                    // InternalDmx.g:1881:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1882:3: ( '-' )
                    // InternalDmx.g:1882:4: '-'
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
                    // InternalDmx.g:1886:2: ( ( '!' ) )
                    {
                    // InternalDmx.g:1886:2: ( ( '!' ) )
                    // InternalDmx.g:1887:3: ( '!' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1888:3: ( '!' )
                    // InternalDmx.g:1888:4: '!'
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
                    // InternalDmx.g:1892:2: ( ( 'NOT' ) )
                    {
                    // InternalDmx.g:1892:2: ( ( 'NOT' ) )
                    // InternalDmx.g:1893:3: ( 'NOT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1894:3: ( 'NOT' )
                    // InternalDmx.g:1894:4: 'NOT'
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
                    // InternalDmx.g:1898:2: ( ( 'not' ) )
                    {
                    // InternalDmx.g:1898:2: ( ( 'not' ) )
                    // InternalDmx.g:1899:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1900:3: ( 'not' )
                    // InternalDmx.g:1900:4: 'not'
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
    // InternalDmx.g:1908:1: rule__DmxModel__Group__0 : rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 ;
    public final void rule__DmxModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1912:1: ( rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 )
            // InternalDmx.g:1913:2: rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1
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
    // InternalDmx.g:1920:1: rule__DmxModel__Group__0__Impl : ( () ) ;
    public final void rule__DmxModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1924:1: ( ( () ) )
            // InternalDmx.g:1925:1: ( () )
            {
            // InternalDmx.g:1925:1: ( () )
            // InternalDmx.g:1926:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getDmxModelAction_0()); 
            }
            // InternalDmx.g:1927:2: ()
            // InternalDmx.g:1927:3: 
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
    // InternalDmx.g:1935:1: rule__DmxModel__Group__1 : rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 ;
    public final void rule__DmxModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1939:1: ( rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 )
            // InternalDmx.g:1940:2: rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2
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
    // InternalDmx.g:1947:1: rule__DmxModel__Group__1__Impl : ( ( rule__DmxModel__Group_1__0 )* ) ;
    public final void rule__DmxModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1951:1: ( ( ( rule__DmxModel__Group_1__0 )* ) )
            // InternalDmx.g:1952:1: ( ( rule__DmxModel__Group_1__0 )* )
            {
            // InternalDmx.g:1952:1: ( ( rule__DmxModel__Group_1__0 )* )
            // InternalDmx.g:1953:2: ( rule__DmxModel__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_1()); 
            }
            // InternalDmx.g:1954:2: ( rule__DmxModel__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==62) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDmx.g:1954:3: rule__DmxModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DmxModel__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalDmx.g:1962:1: rule__DmxModel__Group__2 : rule__DmxModel__Group__2__Impl ;
    public final void rule__DmxModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1966:1: ( rule__DmxModel__Group__2__Impl )
            // InternalDmx.g:1967:2: rule__DmxModel__Group__2__Impl
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
    // InternalDmx.g:1973:1: rule__DmxModel__Group__2__Impl : ( ( rule__DmxModel__Group_2__0 )* ) ;
    public final void rule__DmxModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1977:1: ( ( ( rule__DmxModel__Group_2__0 )* ) )
            // InternalDmx.g:1978:1: ( ( rule__DmxModel__Group_2__0 )* )
            {
            // InternalDmx.g:1978:1: ( ( rule__DmxModel__Group_2__0 )* )
            // InternalDmx.g:1979:2: ( rule__DmxModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_2()); 
            }
            // InternalDmx.g:1980:2: ( rule__DmxModel__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==65) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDmx.g:1980:3: rule__DmxModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DmxModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalDmx.g:1989:1: rule__DmxModel__Group_1__0 : rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 ;
    public final void rule__DmxModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1993:1: ( rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 )
            // InternalDmx.g:1994:2: rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1
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
    // InternalDmx.g:2001:1: rule__DmxModel__Group_1__0__Impl : ( 'text' ) ;
    public final void rule__DmxModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2005:1: ( ( 'text' ) )
            // InternalDmx.g:2006:1: ( 'text' )
            {
            // InternalDmx.g:2006:1: ( 'text' )
            // InternalDmx.g:2007:2: 'text'
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
    // InternalDmx.g:2016:1: rule__DmxModel__Group_1__1 : rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 ;
    public final void rule__DmxModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2020:1: ( rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 )
            // InternalDmx.g:2021:2: rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2
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
    // InternalDmx.g:2028:1: rule__DmxModel__Group_1__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2032:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2033:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2033:1: ( RULE_NATURAL )
            // InternalDmx.g:2034:2: RULE_NATURAL
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
    // InternalDmx.g:2043:1: rule__DmxModel__Group_1__2 : rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 ;
    public final void rule__DmxModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2047:1: ( rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 )
            // InternalDmx.g:2048:2: rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3
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
    // InternalDmx.g:2055:1: rule__DmxModel__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2059:1: ( ( ':' ) )
            // InternalDmx.g:2060:1: ( ':' )
            {
            // InternalDmx.g:2060:1: ( ':' )
            // InternalDmx.g:2061:2: ':'
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
    // InternalDmx.g:2070:1: rule__DmxModel__Group_1__3 : rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 ;
    public final void rule__DmxModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2074:1: ( rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 )
            // InternalDmx.g:2075:2: rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4
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
    // InternalDmx.g:2082:1: rule__DmxModel__Group_1__3__Impl : ( ( rule__DmxModel__TextsAssignment_1_3 ) ) ;
    public final void rule__DmxModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2086:1: ( ( ( rule__DmxModel__TextsAssignment_1_3 ) ) )
            // InternalDmx.g:2087:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            {
            // InternalDmx.g:2087:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            // InternalDmx.g:2088:2: ( rule__DmxModel__TextsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextsAssignment_1_3()); 
            }
            // InternalDmx.g:2089:2: ( rule__DmxModel__TextsAssignment_1_3 )
            // InternalDmx.g:2089:3: rule__DmxModel__TextsAssignment_1_3
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
    // InternalDmx.g:2097:1: rule__DmxModel__Group_1__4 : rule__DmxModel__Group_1__4__Impl ;
    public final void rule__DmxModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2101:1: ( rule__DmxModel__Group_1__4__Impl )
            // InternalDmx.g:2102:2: rule__DmxModel__Group_1__4__Impl
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
    // InternalDmx.g:2108:1: rule__DmxModel__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2112:1: ( ( ';' ) )
            // InternalDmx.g:2113:1: ( ';' )
            {
            // InternalDmx.g:2113:1: ( ';' )
            // InternalDmx.g:2114:2: ';'
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
    // InternalDmx.g:2124:1: rule__DmxModel__Group_2__0 : rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 ;
    public final void rule__DmxModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2128:1: ( rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 )
            // InternalDmx.g:2129:2: rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1
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
    // InternalDmx.g:2136:1: rule__DmxModel__Group_2__0__Impl : ( 'expr' ) ;
    public final void rule__DmxModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2140:1: ( ( 'expr' ) )
            // InternalDmx.g:2141:1: ( 'expr' )
            {
            // InternalDmx.g:2141:1: ( 'expr' )
            // InternalDmx.g:2142:2: 'expr'
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
    // InternalDmx.g:2151:1: rule__DmxModel__Group_2__1 : rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 ;
    public final void rule__DmxModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2155:1: ( rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 )
            // InternalDmx.g:2156:2: rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2
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
    // InternalDmx.g:2163:1: rule__DmxModel__Group_2__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2167:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2168:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2168:1: ( RULE_NATURAL )
            // InternalDmx.g:2169:2: RULE_NATURAL
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
    // InternalDmx.g:2178:1: rule__DmxModel__Group_2__2 : rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 ;
    public final void rule__DmxModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2182:1: ( rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 )
            // InternalDmx.g:2183:2: rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3
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
    // InternalDmx.g:2190:1: rule__DmxModel__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2194:1: ( ( ':' ) )
            // InternalDmx.g:2195:1: ( ':' )
            {
            // InternalDmx.g:2195:1: ( ':' )
            // InternalDmx.g:2196:2: ':'
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
    // InternalDmx.g:2205:1: rule__DmxModel__Group_2__3 : rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 ;
    public final void rule__DmxModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2209:1: ( rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 )
            // InternalDmx.g:2210:2: rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4
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
    // InternalDmx.g:2217:1: rule__DmxModel__Group_2__3__Impl : ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) ;
    public final void rule__DmxModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2221:1: ( ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) )
            // InternalDmx.g:2222:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            {
            // InternalDmx.g:2222:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            // InternalDmx.g:2223:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExpressionsAssignment_2_3()); 
            }
            // InternalDmx.g:2224:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            // InternalDmx.g:2224:3: rule__DmxModel__ExpressionsAssignment_2_3
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
    // InternalDmx.g:2232:1: rule__DmxModel__Group_2__4 : rule__DmxModel__Group_2__4__Impl ;
    public final void rule__DmxModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2236:1: ( rule__DmxModel__Group_2__4__Impl )
            // InternalDmx.g:2237:2: rule__DmxModel__Group_2__4__Impl
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
    // InternalDmx.g:2243:1: rule__DmxModel__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2247:1: ( ( ';' ) )
            // InternalDmx.g:2248:1: ( ';' )
            {
            // InternalDmx.g:2248:1: ( ';' )
            // InternalDmx.g:2249:2: ';'
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
    // InternalDmx.g:2259:1: rule__DRichText__Group_1__0 : rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 ;
    public final void rule__DRichText__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2263:1: ( rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 )
            // InternalDmx.g:2264:2: rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1
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
    // InternalDmx.g:2271:1: rule__DRichText__Group_1__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_0 ) ) ;
    public final void rule__DRichText__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2275:1: ( ( ( rule__DRichText__ElementsAssignment_1_0 ) ) )
            // InternalDmx.g:2276:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            {
            // InternalDmx.g:2276:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            // InternalDmx.g:2277:2: ( rule__DRichText__ElementsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_0()); 
            }
            // InternalDmx.g:2278:2: ( rule__DRichText__ElementsAssignment_1_0 )
            // InternalDmx.g:2278:3: rule__DRichText__ElementsAssignment_1_0
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
    // InternalDmx.g:2286:1: rule__DRichText__Group_1__1 : rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 ;
    public final void rule__DRichText__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2290:1: ( rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 )
            // InternalDmx.g:2291:2: rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2
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
    // InternalDmx.g:2298:1: rule__DRichText__Group_1__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_1 ) ) ;
    public final void rule__DRichText__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2302:1: ( ( ( rule__DRichText__ElementsAssignment_1_1 ) ) )
            // InternalDmx.g:2303:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            {
            // InternalDmx.g:2303:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            // InternalDmx.g:2304:2: ( rule__DRichText__ElementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_1()); 
            }
            // InternalDmx.g:2305:2: ( rule__DRichText__ElementsAssignment_1_1 )
            // InternalDmx.g:2305:3: rule__DRichText__ElementsAssignment_1_1
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
    // InternalDmx.g:2313:1: rule__DRichText__Group_1__2 : rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 ;
    public final void rule__DRichText__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2317:1: ( rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 )
            // InternalDmx.g:2318:2: rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3
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
    // InternalDmx.g:2325:1: rule__DRichText__Group_1__2__Impl : ( ( rule__DRichText__Group_1_2__0 )* ) ;
    public final void rule__DRichText__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2329:1: ( ( ( rule__DRichText__Group_1_2__0 )* ) )
            // InternalDmx.g:2330:1: ( ( rule__DRichText__Group_1_2__0 )* )
            {
            // InternalDmx.g:2330:1: ( ( rule__DRichText__Group_1_2__0 )* )
            // InternalDmx.g:2331:2: ( rule__DRichText__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getGroup_1_2()); 
            }
            // InternalDmx.g:2332:2: ( rule__DRichText__Group_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDmx.g:2332:3: rule__DRichText__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DRichText__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDmx.g:2340:1: rule__DRichText__Group_1__3 : rule__DRichText__Group_1__3__Impl ;
    public final void rule__DRichText__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2344:1: ( rule__DRichText__Group_1__3__Impl )
            // InternalDmx.g:2345:2: rule__DRichText__Group_1__3__Impl
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
    // InternalDmx.g:2351:1: rule__DRichText__Group_1__3__Impl : ( ( rule__DRichText__ElementsAssignment_1_3 ) ) ;
    public final void rule__DRichText__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2355:1: ( ( ( rule__DRichText__ElementsAssignment_1_3 ) ) )
            // InternalDmx.g:2356:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            {
            // InternalDmx.g:2356:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            // InternalDmx.g:2357:2: ( rule__DRichText__ElementsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_3()); 
            }
            // InternalDmx.g:2358:2: ( rule__DRichText__ElementsAssignment_1_3 )
            // InternalDmx.g:2358:3: rule__DRichText__ElementsAssignment_1_3
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
    // InternalDmx.g:2367:1: rule__DRichText__Group_1_2__0 : rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 ;
    public final void rule__DRichText__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2371:1: ( rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 )
            // InternalDmx.g:2372:2: rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1
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
    // InternalDmx.g:2379:1: rule__DRichText__Group_1_2__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) ;
    public final void rule__DRichText__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2383:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) )
            // InternalDmx.g:2384:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            {
            // InternalDmx.g:2384:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            // InternalDmx.g:2385:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_0()); 
            }
            // InternalDmx.g:2386:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            // InternalDmx.g:2386:3: rule__DRichText__ElementsAssignment_1_2_0
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
    // InternalDmx.g:2394:1: rule__DRichText__Group_1_2__1 : rule__DRichText__Group_1_2__1__Impl ;
    public final void rule__DRichText__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2398:1: ( rule__DRichText__Group_1_2__1__Impl )
            // InternalDmx.g:2399:2: rule__DRichText__Group_1_2__1__Impl
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
    // InternalDmx.g:2405:1: rule__DRichText__Group_1_2__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__DRichText__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2409:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) )
            // InternalDmx.g:2410:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            {
            // InternalDmx.g:2410:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            // InternalDmx.g:2411:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_1()); 
            }
            // InternalDmx.g:2412:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            // InternalDmx.g:2412:3: rule__DRichText__ElementsAssignment_1_2_1
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
    // InternalDmx.g:2421:1: rule__DAssignment__Group_0__0 : rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 ;
    public final void rule__DAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2425:1: ( rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 )
            // InternalDmx.g:2426:2: rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1
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
    // InternalDmx.g:2433:1: rule__DAssignment__Group_0__0__Impl : ( () ) ;
    public final void rule__DAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2437:1: ( ( () ) )
            // InternalDmx.g:2438:1: ( () )
            {
            // InternalDmx.g:2438:1: ( () )
            // InternalDmx.g:2439:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0()); 
            }
            // InternalDmx.g:2440:2: ()
            // InternalDmx.g:2440:3: 
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
    // InternalDmx.g:2448:1: rule__DAssignment__Group_0__1 : rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 ;
    public final void rule__DAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2452:1: ( rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 )
            // InternalDmx.g:2453:2: rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2
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
    // InternalDmx.g:2460:1: rule__DAssignment__Group_0__1__Impl : ( ( rule__DAssignment__MemberAssignment_0_1 ) ) ;
    public final void rule__DAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2464:1: ( ( ( rule__DAssignment__MemberAssignment_0_1 ) ) )
            // InternalDmx.g:2465:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            {
            // InternalDmx.g:2465:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            // InternalDmx.g:2466:2: ( rule__DAssignment__MemberAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberAssignment_0_1()); 
            }
            // InternalDmx.g:2467:2: ( rule__DAssignment__MemberAssignment_0_1 )
            // InternalDmx.g:2467:3: rule__DAssignment__MemberAssignment_0_1
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
    // InternalDmx.g:2475:1: rule__DAssignment__Group_0__2 : rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 ;
    public final void rule__DAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2479:1: ( rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 )
            // InternalDmx.g:2480:2: rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3
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
    // InternalDmx.g:2487:1: rule__DAssignment__Group_0__2__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2491:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:2492:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:2492:1: ( ruleOpSingleAssign )
            // InternalDmx.g:2493:2: ruleOpSingleAssign
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
    // InternalDmx.g:2502:1: rule__DAssignment__Group_0__3 : rule__DAssignment__Group_0__3__Impl ;
    public final void rule__DAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2506:1: ( rule__DAssignment__Group_0__3__Impl )
            // InternalDmx.g:2507:2: rule__DAssignment__Group_0__3__Impl
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
    // InternalDmx.g:2513:1: rule__DAssignment__Group_0__3__Impl : ( ( rule__DAssignment__ValueAssignment_0_3 ) ) ;
    public final void rule__DAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2517:1: ( ( ( rule__DAssignment__ValueAssignment_0_3 ) ) )
            // InternalDmx.g:2518:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            {
            // InternalDmx.g:2518:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            // InternalDmx.g:2519:2: ( rule__DAssignment__ValueAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3()); 
            }
            // InternalDmx.g:2520:2: ( rule__DAssignment__ValueAssignment_0_3 )
            // InternalDmx.g:2520:3: rule__DAssignment__ValueAssignment_0_3
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
    // InternalDmx.g:2529:1: rule__DOrExpression__Group__0 : rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 ;
    public final void rule__DOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2533:1: ( rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 )
            // InternalDmx.g:2534:2: rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1
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
    // InternalDmx.g:2541:1: rule__DOrExpression__Group__0__Impl : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2545:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:2546:1: ( ruleDAndExpression )
            {
            // InternalDmx.g:2546:1: ( ruleDAndExpression )
            // InternalDmx.g:2547:2: ruleDAndExpression
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
    // InternalDmx.g:2556:1: rule__DOrExpression__Group__1 : rule__DOrExpression__Group__1__Impl ;
    public final void rule__DOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2560:1: ( rule__DOrExpression__Group__1__Impl )
            // InternalDmx.g:2561:2: rule__DOrExpression__Group__1__Impl
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
    // InternalDmx.g:2567:1: rule__DOrExpression__Group__1__Impl : ( ( rule__DOrExpression__Group_1__0 )* ) ;
    public final void rule__DOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2571:1: ( ( ( rule__DOrExpression__Group_1__0 )* ) )
            // InternalDmx.g:2572:1: ( ( rule__DOrExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2572:1: ( ( rule__DOrExpression__Group_1__0 )* )
            // InternalDmx.g:2573:2: ( rule__DOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2574:2: ( rule__DOrExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA30_5 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalDmx.g:2574:3: rule__DOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalDmx.g:2583:1: rule__DOrExpression__Group_1__0 : rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 ;
    public final void rule__DOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2587:1: ( rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 )
            // InternalDmx.g:2588:2: rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1
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
    // InternalDmx.g:2595:1: rule__DOrExpression__Group_1__0__Impl : ( ( rule__DOrExpression__Group_1_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2599:1: ( ( ( rule__DOrExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2600:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2600:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            // InternalDmx.g:2601:2: ( rule__DOrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2602:2: ( rule__DOrExpression__Group_1_0__0 )
            // InternalDmx.g:2602:3: rule__DOrExpression__Group_1_0__0
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
    // InternalDmx.g:2610:1: rule__DOrExpression__Group_1__1 : rule__DOrExpression__Group_1__1__Impl ;
    public final void rule__DOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2614:1: ( rule__DOrExpression__Group_1__1__Impl )
            // InternalDmx.g:2615:2: rule__DOrExpression__Group_1__1__Impl
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
    // InternalDmx.g:2621:1: rule__DOrExpression__Group_1__1__Impl : ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2625:1: ( ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2626:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2626:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2627:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2628:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2628:3: rule__DOrExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2637:1: rule__DOrExpression__Group_1_0__0 : rule__DOrExpression__Group_1_0__0__Impl ;
    public final void rule__DOrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2641:1: ( rule__DOrExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2642:2: rule__DOrExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2648:1: rule__DOrExpression__Group_1_0__0__Impl : ( ( rule__DOrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2652:1: ( ( ( rule__DOrExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2653:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2653:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2654:2: ( rule__DOrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2655:2: ( rule__DOrExpression__Group_1_0_0__0 )
            // InternalDmx.g:2655:3: rule__DOrExpression__Group_1_0_0__0
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
    // InternalDmx.g:2664:1: rule__DOrExpression__Group_1_0_0__0 : rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 ;
    public final void rule__DOrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2668:1: ( rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 )
            // InternalDmx.g:2669:2: rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1
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
    // InternalDmx.g:2676:1: rule__DOrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2680:1: ( ( () ) )
            // InternalDmx.g:2681:1: ( () )
            {
            // InternalDmx.g:2681:1: ( () )
            // InternalDmx.g:2682:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2683:2: ()
            // InternalDmx.g:2683:3: 
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
    // InternalDmx.g:2691:1: rule__DOrExpression__Group_1_0_0__1 : rule__DOrExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2695:1: ( rule__DOrExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2696:2: rule__DOrExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2702:1: rule__DOrExpression__Group_1_0_0__1__Impl : ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2706:1: ( ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2707:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2707:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2708:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2709:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2709:3: rule__DOrExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2718:1: rule__DAndExpression__Group__0 : rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 ;
    public final void rule__DAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2722:1: ( rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 )
            // InternalDmx.g:2723:2: rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1
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
    // InternalDmx.g:2730:1: rule__DAndExpression__Group__0__Impl : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2734:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:2735:1: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:2735:1: ( ruleDEqualityExpression )
            // InternalDmx.g:2736:2: ruleDEqualityExpression
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
    // InternalDmx.g:2745:1: rule__DAndExpression__Group__1 : rule__DAndExpression__Group__1__Impl ;
    public final void rule__DAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2749:1: ( rule__DAndExpression__Group__1__Impl )
            // InternalDmx.g:2750:2: rule__DAndExpression__Group__1__Impl
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
    // InternalDmx.g:2756:1: rule__DAndExpression__Group__1__Impl : ( ( rule__DAndExpression__Group_1__0 )* ) ;
    public final void rule__DAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2760:1: ( ( ( rule__DAndExpression__Group_1__0 )* ) )
            // InternalDmx.g:2761:1: ( ( rule__DAndExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2761:1: ( ( rule__DAndExpression__Group_1__0 )* )
            // InternalDmx.g:2762:2: ( rule__DAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2763:2: ( rule__DAndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==43) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalDmx.g:2763:3: rule__DAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalDmx.g:2772:1: rule__DAndExpression__Group_1__0 : rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 ;
    public final void rule__DAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2776:1: ( rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 )
            // InternalDmx.g:2777:2: rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1
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
    // InternalDmx.g:2784:1: rule__DAndExpression__Group_1__0__Impl : ( ( rule__DAndExpression__Group_1_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2788:1: ( ( ( rule__DAndExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2789:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2789:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            // InternalDmx.g:2790:2: ( rule__DAndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2791:2: ( rule__DAndExpression__Group_1_0__0 )
            // InternalDmx.g:2791:3: rule__DAndExpression__Group_1_0__0
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
    // InternalDmx.g:2799:1: rule__DAndExpression__Group_1__1 : rule__DAndExpression__Group_1__1__Impl ;
    public final void rule__DAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2803:1: ( rule__DAndExpression__Group_1__1__Impl )
            // InternalDmx.g:2804:2: rule__DAndExpression__Group_1__1__Impl
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
    // InternalDmx.g:2810:1: rule__DAndExpression__Group_1__1__Impl : ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2814:1: ( ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2815:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2815:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2816:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2817:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2817:3: rule__DAndExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2826:1: rule__DAndExpression__Group_1_0__0 : rule__DAndExpression__Group_1_0__0__Impl ;
    public final void rule__DAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2830:1: ( rule__DAndExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2831:2: rule__DAndExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2837:1: rule__DAndExpression__Group_1_0__0__Impl : ( ( rule__DAndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2841:1: ( ( ( rule__DAndExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2842:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2842:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2843:2: ( rule__DAndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2844:2: ( rule__DAndExpression__Group_1_0_0__0 )
            // InternalDmx.g:2844:3: rule__DAndExpression__Group_1_0_0__0
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
    // InternalDmx.g:2853:1: rule__DAndExpression__Group_1_0_0__0 : rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 ;
    public final void rule__DAndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2857:1: ( rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 )
            // InternalDmx.g:2858:2: rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1
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
    // InternalDmx.g:2865:1: rule__DAndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2869:1: ( ( () ) )
            // InternalDmx.g:2870:1: ( () )
            {
            // InternalDmx.g:2870:1: ( () )
            // InternalDmx.g:2871:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2872:2: ()
            // InternalDmx.g:2872:3: 
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
    // InternalDmx.g:2880:1: rule__DAndExpression__Group_1_0_0__1 : rule__DAndExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2884:1: ( rule__DAndExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2885:2: rule__DAndExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2891:1: rule__DAndExpression__Group_1_0_0__1__Impl : ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2895:1: ( ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2896:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2896:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2897:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2898:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2898:3: rule__DAndExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2907:1: rule__DEqualityExpression__Group__0 : rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 ;
    public final void rule__DEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2911:1: ( rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 )
            // InternalDmx.g:2912:2: rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1
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
    // InternalDmx.g:2919:1: rule__DEqualityExpression__Group__0__Impl : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2923:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:2924:1: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:2924:1: ( ruleDRelationalExpression )
            // InternalDmx.g:2925:2: ruleDRelationalExpression
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
    // InternalDmx.g:2934:1: rule__DEqualityExpression__Group__1 : rule__DEqualityExpression__Group__1__Impl ;
    public final void rule__DEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2938:1: ( rule__DEqualityExpression__Group__1__Impl )
            // InternalDmx.g:2939:2: rule__DEqualityExpression__Group__1__Impl
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
    // InternalDmx.g:2945:1: rule__DEqualityExpression__Group__1__Impl : ( ( rule__DEqualityExpression__Group_1__0 )* ) ;
    public final void rule__DEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2949:1: ( ( ( rule__DEqualityExpression__Group_1__0 )* ) )
            // InternalDmx.g:2950:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2950:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            // InternalDmx.g:2951:2: ( rule__DEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2952:2: ( rule__DEqualityExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalDmx.g:2952:3: rule__DEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalDmx.g:2961:1: rule__DEqualityExpression__Group_1__0 : rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 ;
    public final void rule__DEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2965:1: ( rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 )
            // InternalDmx.g:2966:2: rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1
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
    // InternalDmx.g:2973:1: rule__DEqualityExpression__Group_1__0__Impl : ( ( rule__DEqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2977:1: ( ( ( rule__DEqualityExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2978:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2978:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            // InternalDmx.g:2979:2: ( rule__DEqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2980:2: ( rule__DEqualityExpression__Group_1_0__0 )
            // InternalDmx.g:2980:3: rule__DEqualityExpression__Group_1_0__0
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
    // InternalDmx.g:2988:1: rule__DEqualityExpression__Group_1__1 : rule__DEqualityExpression__Group_1__1__Impl ;
    public final void rule__DEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2992:1: ( rule__DEqualityExpression__Group_1__1__Impl )
            // InternalDmx.g:2993:2: rule__DEqualityExpression__Group_1__1__Impl
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
    // InternalDmx.g:2999:1: rule__DEqualityExpression__Group_1__1__Impl : ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3003:1: ( ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3004:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3004:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3005:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3006:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3006:3: rule__DEqualityExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3015:1: rule__DEqualityExpression__Group_1_0__0 : rule__DEqualityExpression__Group_1_0__0__Impl ;
    public final void rule__DEqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3019:1: ( rule__DEqualityExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3020:2: rule__DEqualityExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3026:1: rule__DEqualityExpression__Group_1_0__0__Impl : ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3030:1: ( ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3031:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3031:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3032:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3033:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            // InternalDmx.g:3033:3: rule__DEqualityExpression__Group_1_0_0__0
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
    // InternalDmx.g:3042:1: rule__DEqualityExpression__Group_1_0_0__0 : rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 ;
    public final void rule__DEqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3046:1: ( rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 )
            // InternalDmx.g:3047:2: rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1
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
    // InternalDmx.g:3054:1: rule__DEqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3058:1: ( ( () ) )
            // InternalDmx.g:3059:1: ( () )
            {
            // InternalDmx.g:3059:1: ( () )
            // InternalDmx.g:3060:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3061:2: ()
            // InternalDmx.g:3061:3: 
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
    // InternalDmx.g:3069:1: rule__DEqualityExpression__Group_1_0_0__1 : rule__DEqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__DEqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3073:1: ( rule__DEqualityExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3074:2: rule__DEqualityExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3080:1: rule__DEqualityExpression__Group_1_0_0__1__Impl : ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3084:1: ( ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3085:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3085:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3086:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3087:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3087:3: rule__DEqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3096:1: rule__DRelationalExpression__Group__0 : rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 ;
    public final void rule__DRelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3100:1: ( rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 )
            // InternalDmx.g:3101:2: rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1
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
    // InternalDmx.g:3108:1: rule__DRelationalExpression__Group__0__Impl : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3112:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:3113:1: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:3113:1: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:3114:2: ruleDOtherOperatorExpression
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
    // InternalDmx.g:3123:1: rule__DRelationalExpression__Group__1 : rule__DRelationalExpression__Group__1__Impl ;
    public final void rule__DRelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3127:1: ( rule__DRelationalExpression__Group__1__Impl )
            // InternalDmx.g:3128:2: rule__DRelationalExpression__Group__1__Impl
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
    // InternalDmx.g:3134:1: rule__DRelationalExpression__Group__1__Impl : ( ( rule__DRelationalExpression__Alternatives_1 )* ) ;
    public final void rule__DRelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3138:1: ( ( ( rule__DRelationalExpression__Alternatives_1 )* ) )
            // InternalDmx.g:3139:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            {
            // InternalDmx.g:3139:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            // InternalDmx.g:3140:2: ( rule__DRelationalExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:3141:2: ( rule__DRelationalExpression__Alternatives_1 )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalDmx.g:3141:3: rule__DRelationalExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DRelationalExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalDmx.g:3150:1: rule__DRelationalExpression__Group_1_0__0 : rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3154:1: ( rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 )
            // InternalDmx.g:3155:2: rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1
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
    // InternalDmx.g:3162:1: rule__DRelationalExpression__Group_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3166:1: ( ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3167:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3167:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3168:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3169:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            // InternalDmx.g:3169:3: rule__DRelationalExpression__Group_1_0_0__0
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
    // InternalDmx.g:3177:1: rule__DRelationalExpression__Group_1_0__1 : rule__DRelationalExpression__Group_1_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3181:1: ( rule__DRelationalExpression__Group_1_0__1__Impl )
            // InternalDmx.g:3182:2: rule__DRelationalExpression__Group_1_0__1__Impl
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
    // InternalDmx.g:3188:1: rule__DRelationalExpression__Group_1_0__1__Impl : ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3192:1: ( ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) )
            // InternalDmx.g:3193:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            {
            // InternalDmx.g:3193:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            // InternalDmx.g:3194:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1()); 
            }
            // InternalDmx.g:3195:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            // InternalDmx.g:3195:3: rule__DRelationalExpression__TypeAssignment_1_0_1
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
    // InternalDmx.g:3204:1: rule__DRelationalExpression__Group_1_0_0__0 : rule__DRelationalExpression__Group_1_0_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3208:1: ( rule__DRelationalExpression__Group_1_0_0__0__Impl )
            // InternalDmx.g:3209:2: rule__DRelationalExpression__Group_1_0_0__0__Impl
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
    // InternalDmx.g:3215:1: rule__DRelationalExpression__Group_1_0_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3219:1: ( ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:3220:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:3220:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            // InternalDmx.g:3221:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:3222:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            // InternalDmx.g:3222:3: rule__DRelationalExpression__Group_1_0_0_0__0
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
    // InternalDmx.g:3231:1: rule__DRelationalExpression__Group_1_0_0_0__0 : rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3235:1: ( rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 )
            // InternalDmx.g:3236:2: rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1
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
    // InternalDmx.g:3243:1: rule__DRelationalExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3247:1: ( ( () ) )
            // InternalDmx.g:3248:1: ( () )
            {
            // InternalDmx.g:3248:1: ( () )
            // InternalDmx.g:3249:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:3250:2: ()
            // InternalDmx.g:3250:3: 
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
    // InternalDmx.g:3258:1: rule__DRelationalExpression__Group_1_0_0_0__1 : rule__DRelationalExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3262:1: ( rule__DRelationalExpression__Group_1_0_0_0__1__Impl )
            // InternalDmx.g:3263:2: rule__DRelationalExpression__Group_1_0_0_0__1__Impl
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
    // InternalDmx.g:3269:1: rule__DRelationalExpression__Group_1_0_0_0__1__Impl : ( ruleOpInstanceOf ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3273:1: ( ( ruleOpInstanceOf ) )
            // InternalDmx.g:3274:1: ( ruleOpInstanceOf )
            {
            // InternalDmx.g:3274:1: ( ruleOpInstanceOf )
            // InternalDmx.g:3275:2: ruleOpInstanceOf
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
    // InternalDmx.g:3285:1: rule__DRelationalExpression__Group_1_1__0 : rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 ;
    public final void rule__DRelationalExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3289:1: ( rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 )
            // InternalDmx.g:3290:2: rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1
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
    // InternalDmx.g:3297:1: rule__DRelationalExpression__Group_1_1__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3301:1: ( ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) )
            // InternalDmx.g:3302:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:3302:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            // InternalDmx.g:3303:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:3304:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            // InternalDmx.g:3304:3: rule__DRelationalExpression__Group_1_1_0__0
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
    // InternalDmx.g:3312:1: rule__DRelationalExpression__Group_1_1__1 : rule__DRelationalExpression__Group_1_1__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3316:1: ( rule__DRelationalExpression__Group_1_1__1__Impl )
            // InternalDmx.g:3317:2: rule__DRelationalExpression__Group_1_1__1__Impl
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
    // InternalDmx.g:3323:1: rule__DRelationalExpression__Group_1_1__1__Impl : ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3327:1: ( ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) )
            // InternalDmx.g:3328:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            {
            // InternalDmx.g:3328:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            // InternalDmx.g:3329:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1()); 
            }
            // InternalDmx.g:3330:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            // InternalDmx.g:3330:3: rule__DRelationalExpression__RightOperandAssignment_1_1_1
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
    // InternalDmx.g:3339:1: rule__DRelationalExpression__Group_1_1_0__0 : rule__DRelationalExpression__Group_1_1_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3343:1: ( rule__DRelationalExpression__Group_1_1_0__0__Impl )
            // InternalDmx.g:3344:2: rule__DRelationalExpression__Group_1_1_0__0__Impl
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
    // InternalDmx.g:3350:1: rule__DRelationalExpression__Group_1_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3354:1: ( ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:3355:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:3355:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            // InternalDmx.g:3356:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:3357:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            // InternalDmx.g:3357:3: rule__DRelationalExpression__Group_1_1_0_0__0
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
    // InternalDmx.g:3366:1: rule__DRelationalExpression__Group_1_1_0_0__0 : rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3370:1: ( rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 )
            // InternalDmx.g:3371:2: rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1
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
    // InternalDmx.g:3378:1: rule__DRelationalExpression__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3382:1: ( ( () ) )
            // InternalDmx.g:3383:1: ( () )
            {
            // InternalDmx.g:3383:1: ( () )
            // InternalDmx.g:3384:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:3385:2: ()
            // InternalDmx.g:3385:3: 
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
    // InternalDmx.g:3393:1: rule__DRelationalExpression__Group_1_1_0_0__1 : rule__DRelationalExpression__Group_1_1_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3397:1: ( rule__DRelationalExpression__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:3398:2: rule__DRelationalExpression__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:3404:1: rule__DRelationalExpression__Group_1_1_0_0__1__Impl : ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3408:1: ( ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) )
            // InternalDmx.g:3409:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            {
            // InternalDmx.g:3409:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            // InternalDmx.g:3410:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1()); 
            }
            // InternalDmx.g:3411:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            // InternalDmx.g:3411:3: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1
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
    // InternalDmx.g:3420:1: rule__DOtherOperatorExpression__Group__0 : rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 ;
    public final void rule__DOtherOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3424:1: ( rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 )
            // InternalDmx.g:3425:2: rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1
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
    // InternalDmx.g:3432:1: rule__DOtherOperatorExpression__Group__0__Impl : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3436:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:3437:1: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:3437:1: ( ruleDAdditiveExpression )
            // InternalDmx.g:3438:2: ruleDAdditiveExpression
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
    // InternalDmx.g:3447:1: rule__DOtherOperatorExpression__Group__1 : rule__DOtherOperatorExpression__Group__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3451:1: ( rule__DOtherOperatorExpression__Group__1__Impl )
            // InternalDmx.g:3452:2: rule__DOtherOperatorExpression__Group__1__Impl
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
    // InternalDmx.g:3458:1: rule__DOtherOperatorExpression__Group__1__Impl : ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) ;
    public final void rule__DOtherOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3462:1: ( ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) )
            // InternalDmx.g:3463:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3463:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            // InternalDmx.g:3464:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3465:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case 53:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA34_4 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // InternalDmx.g:3465:3: rule__DOtherOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DOtherOperatorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalDmx.g:3474:1: rule__DOtherOperatorExpression__Group_1__0 : rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 ;
    public final void rule__DOtherOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3478:1: ( rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 )
            // InternalDmx.g:3479:2: rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1
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
    // InternalDmx.g:3486:1: rule__DOtherOperatorExpression__Group_1__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3490:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3491:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3491:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            // InternalDmx.g:3492:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3493:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            // InternalDmx.g:3493:3: rule__DOtherOperatorExpression__Group_1_0__0
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
    // InternalDmx.g:3501:1: rule__DOtherOperatorExpression__Group_1__1 : rule__DOtherOperatorExpression__Group_1__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3505:1: ( rule__DOtherOperatorExpression__Group_1__1__Impl )
            // InternalDmx.g:3506:2: rule__DOtherOperatorExpression__Group_1__1__Impl
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
    // InternalDmx.g:3512:1: rule__DOtherOperatorExpression__Group_1__1__Impl : ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3516:1: ( ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3517:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3517:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3518:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3519:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3519:3: rule__DOtherOperatorExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3528:1: rule__DOtherOperatorExpression__Group_1_0__0 : rule__DOtherOperatorExpression__Group_1_0__0__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3532:1: ( rule__DOtherOperatorExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3533:2: rule__DOtherOperatorExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3539:1: rule__DOtherOperatorExpression__Group_1_0__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3543:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3544:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3544:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3545:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3546:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            // InternalDmx.g:3546:3: rule__DOtherOperatorExpression__Group_1_0_0__0
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
    // InternalDmx.g:3555:1: rule__DOtherOperatorExpression__Group_1_0_0__0 : rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3559:1: ( rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 )
            // InternalDmx.g:3560:2: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1
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
    // InternalDmx.g:3567:1: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3571:1: ( ( () ) )
            // InternalDmx.g:3572:1: ( () )
            {
            // InternalDmx.g:3572:1: ( () )
            // InternalDmx.g:3573:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3574:2: ()
            // InternalDmx.g:3574:3: 
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
    // InternalDmx.g:3582:1: rule__DOtherOperatorExpression__Group_1_0_0__1 : rule__DOtherOperatorExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3586:1: ( rule__DOtherOperatorExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3587:2: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3593:1: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl : ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3597:1: ( ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3598:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3598:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3599:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3600:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3600:3: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3609:1: rule__DAdditiveExpression__Group__0 : rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 ;
    public final void rule__DAdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3613:1: ( rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 )
            // InternalDmx.g:3614:2: rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1
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
    // InternalDmx.g:3621:1: rule__DAdditiveExpression__Group__0__Impl : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3625:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:3626:1: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:3626:1: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:3627:2: ruleDMultiplicativeExpression
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
    // InternalDmx.g:3636:1: rule__DAdditiveExpression__Group__1 : rule__DAdditiveExpression__Group__1__Impl ;
    public final void rule__DAdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3640:1: ( rule__DAdditiveExpression__Group__1__Impl )
            // InternalDmx.g:3641:2: rule__DAdditiveExpression__Group__1__Impl
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
    // InternalDmx.g:3647:1: rule__DAdditiveExpression__Group__1__Impl : ( ( rule__DAdditiveExpression__Group_1__0 )* ) ;
    public final void rule__DAdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3651:1: ( ( ( rule__DAdditiveExpression__Group_1__0 )* ) )
            // InternalDmx.g:3652:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3652:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            // InternalDmx.g:3653:2: ( rule__DAdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3654:2: ( rule__DAdditiveExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==36) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==37) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalDmx.g:3654:3: rule__DAdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DAdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalDmx.g:3663:1: rule__DAdditiveExpression__Group_1__0 : rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 ;
    public final void rule__DAdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3667:1: ( rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 )
            // InternalDmx.g:3668:2: rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1
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
    // InternalDmx.g:3675:1: rule__DAdditiveExpression__Group_1__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3679:1: ( ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3680:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3680:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            // InternalDmx.g:3681:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3682:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            // InternalDmx.g:3682:3: rule__DAdditiveExpression__Group_1_0__0
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
    // InternalDmx.g:3690:1: rule__DAdditiveExpression__Group_1__1 : rule__DAdditiveExpression__Group_1__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3694:1: ( rule__DAdditiveExpression__Group_1__1__Impl )
            // InternalDmx.g:3695:2: rule__DAdditiveExpression__Group_1__1__Impl
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
    // InternalDmx.g:3701:1: rule__DAdditiveExpression__Group_1__1__Impl : ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3705:1: ( ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3706:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3706:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3707:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3708:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3708:3: rule__DAdditiveExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3717:1: rule__DAdditiveExpression__Group_1_0__0 : rule__DAdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3721:1: ( rule__DAdditiveExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3722:2: rule__DAdditiveExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3728:1: rule__DAdditiveExpression__Group_1_0__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3732:1: ( ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3733:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3733:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3734:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3735:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            // InternalDmx.g:3735:3: rule__DAdditiveExpression__Group_1_0_0__0
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
    // InternalDmx.g:3744:1: rule__DAdditiveExpression__Group_1_0_0__0 : rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3748:1: ( rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 )
            // InternalDmx.g:3749:2: rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1
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
    // InternalDmx.g:3756:1: rule__DAdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3760:1: ( ( () ) )
            // InternalDmx.g:3761:1: ( () )
            {
            // InternalDmx.g:3761:1: ( () )
            // InternalDmx.g:3762:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3763:2: ()
            // InternalDmx.g:3763:3: 
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
    // InternalDmx.g:3771:1: rule__DAdditiveExpression__Group_1_0_0__1 : rule__DAdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3775:1: ( rule__DAdditiveExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3776:2: rule__DAdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3782:1: rule__DAdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3786:1: ( ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3787:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3787:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3788:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3789:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3789:3: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3798:1: rule__DMultiplicativeExpression__Group__0 : rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 ;
    public final void rule__DMultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3802:1: ( rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 )
            // InternalDmx.g:3803:2: rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1
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
    // InternalDmx.g:3810:1: rule__DMultiplicativeExpression__Group__0__Impl : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3814:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:3815:1: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:3815:1: ( ruleDUnaryOperation )
            // InternalDmx.g:3816:2: ruleDUnaryOperation
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
    // InternalDmx.g:3825:1: rule__DMultiplicativeExpression__Group__1 : rule__DMultiplicativeExpression__Group__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3829:1: ( rule__DMultiplicativeExpression__Group__1__Impl )
            // InternalDmx.g:3830:2: rule__DMultiplicativeExpression__Group__1__Impl
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
    // InternalDmx.g:3836:1: rule__DMultiplicativeExpression__Group__1__Impl : ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__DMultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3840:1: ( ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) )
            // InternalDmx.g:3841:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3841:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            // InternalDmx.g:3842:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3843:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA36_5 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalDmx.g:3843:3: rule__DMultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__DMultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalDmx.g:3852:1: rule__DMultiplicativeExpression__Group_1__0 : rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 ;
    public final void rule__DMultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3856:1: ( rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 )
            // InternalDmx.g:3857:2: rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1
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
    // InternalDmx.g:3864:1: rule__DMultiplicativeExpression__Group_1__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3868:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3869:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3869:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            // InternalDmx.g:3870:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3871:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            // InternalDmx.g:3871:3: rule__DMultiplicativeExpression__Group_1_0__0
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
    // InternalDmx.g:3879:1: rule__DMultiplicativeExpression__Group_1__1 : rule__DMultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3883:1: ( rule__DMultiplicativeExpression__Group_1__1__Impl )
            // InternalDmx.g:3884:2: rule__DMultiplicativeExpression__Group_1__1__Impl
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
    // InternalDmx.g:3890:1: rule__DMultiplicativeExpression__Group_1__1__Impl : ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3894:1: ( ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3895:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3895:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3896:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3897:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3897:3: rule__DMultiplicativeExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3906:1: rule__DMultiplicativeExpression__Group_1_0__0 : rule__DMultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3910:1: ( rule__DMultiplicativeExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3911:2: rule__DMultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3917:1: rule__DMultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3921:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3922:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3922:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3923:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3924:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            // InternalDmx.g:3924:3: rule__DMultiplicativeExpression__Group_1_0_0__0
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
    // InternalDmx.g:3933:1: rule__DMultiplicativeExpression__Group_1_0_0__0 : rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3937:1: ( rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 )
            // InternalDmx.g:3938:2: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1
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
    // InternalDmx.g:3945:1: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3949:1: ( ( () ) )
            // InternalDmx.g:3950:1: ( () )
            {
            // InternalDmx.g:3950:1: ( () )
            // InternalDmx.g:3951:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3952:2: ()
            // InternalDmx.g:3952:3: 
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
    // InternalDmx.g:3960:1: rule__DMultiplicativeExpression__Group_1_0_0__1 : rule__DMultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3964:1: ( rule__DMultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3965:2: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3971:1: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3975:1: ( ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3976:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3976:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3977:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3978:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3978:3: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3987:1: rule__DUnaryOperation__Group_0__0 : rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 ;
    public final void rule__DUnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3991:1: ( rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 )
            // InternalDmx.g:3992:2: rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1
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
    // InternalDmx.g:3999:1: rule__DUnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__DUnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4003:1: ( ( () ) )
            // InternalDmx.g:4004:1: ( () )
            {
            // InternalDmx.g:4004:1: ( () )
            // InternalDmx.g:4005:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0()); 
            }
            // InternalDmx.g:4006:2: ()
            // InternalDmx.g:4006:3: 
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
    // InternalDmx.g:4014:1: rule__DUnaryOperation__Group_0__1 : rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 ;
    public final void rule__DUnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4018:1: ( rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 )
            // InternalDmx.g:4019:2: rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2
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
    // InternalDmx.g:4026:1: rule__DUnaryOperation__Group_0__1__Impl : ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__DUnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4030:1: ( ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalDmx.g:4031:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalDmx.g:4031:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            // InternalDmx.g:4032:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalDmx.g:4033:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            // InternalDmx.g:4033:3: rule__DUnaryOperation__OperatorAssignment_0_1
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
    // InternalDmx.g:4041:1: rule__DUnaryOperation__Group_0__2 : rule__DUnaryOperation__Group_0__2__Impl ;
    public final void rule__DUnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4045:1: ( rule__DUnaryOperation__Group_0__2__Impl )
            // InternalDmx.g:4046:2: rule__DUnaryOperation__Group_0__2__Impl
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
    // InternalDmx.g:4052:1: rule__DUnaryOperation__Group_0__2__Impl : ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__DUnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4056:1: ( ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalDmx.g:4057:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalDmx.g:4057:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            // InternalDmx.g:4058:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalDmx.g:4059:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            // InternalDmx.g:4059:3: rule__DUnaryOperation__OperandAssignment_0_2
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
    // InternalDmx.g:4068:1: rule__DCastExpression__Group__0 : rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 ;
    public final void rule__DCastExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4072:1: ( rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 )
            // InternalDmx.g:4073:2: rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1
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
    // InternalDmx.g:4080:1: rule__DCastExpression__Group__0__Impl : ( ruleDTypedMemberReference ) ;
    public final void rule__DCastExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4084:1: ( ( ruleDTypedMemberReference ) )
            // InternalDmx.g:4085:1: ( ruleDTypedMemberReference )
            {
            // InternalDmx.g:4085:1: ( ruleDTypedMemberReference )
            // InternalDmx.g:4086:2: ruleDTypedMemberReference
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
    // InternalDmx.g:4095:1: rule__DCastExpression__Group__1 : rule__DCastExpression__Group__1__Impl ;
    public final void rule__DCastExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4099:1: ( rule__DCastExpression__Group__1__Impl )
            // InternalDmx.g:4100:2: rule__DCastExpression__Group__1__Impl
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
    // InternalDmx.g:4106:1: rule__DCastExpression__Group__1__Impl : ( ( rule__DCastExpression__Group_1__0 )? ) ;
    public final void rule__DCastExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4110:1: ( ( ( rule__DCastExpression__Group_1__0 )? ) )
            // InternalDmx.g:4111:1: ( ( rule__DCastExpression__Group_1__0 )? )
            {
            // InternalDmx.g:4111:1: ( ( rule__DCastExpression__Group_1__0 )? )
            // InternalDmx.g:4112:2: ( rule__DCastExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:4113:2: ( rule__DCastExpression__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred63_InternalDmx()) ) {
                    alt37=1;
                }
            }
            else if ( (LA37_0==20) ) {
                int LA37_2 = input.LA(2);

                if ( (synpred63_InternalDmx()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalDmx.g:4113:3: rule__DCastExpression__Group_1__0
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
    // InternalDmx.g:4122:1: rule__DCastExpression__Group_1__0 : rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 ;
    public final void rule__DCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4126:1: ( rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 )
            // InternalDmx.g:4127:2: rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1
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
    // InternalDmx.g:4134:1: rule__DCastExpression__Group_1__0__Impl : ( ( rule__DCastExpression__Group_1_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4138:1: ( ( ( rule__DCastExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:4139:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:4139:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            // InternalDmx.g:4140:2: ( rule__DCastExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:4141:2: ( rule__DCastExpression__Group_1_0__0 )
            // InternalDmx.g:4141:3: rule__DCastExpression__Group_1_0__0
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
    // InternalDmx.g:4149:1: rule__DCastExpression__Group_1__1 : rule__DCastExpression__Group_1__1__Impl ;
    public final void rule__DCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4153:1: ( rule__DCastExpression__Group_1__1__Impl )
            // InternalDmx.g:4154:2: rule__DCastExpression__Group_1__1__Impl
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
    // InternalDmx.g:4160:1: rule__DCastExpression__Group_1__1__Impl : ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__DCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4164:1: ( ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) )
            // InternalDmx.g:4165:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            {
            // InternalDmx.g:4165:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            // InternalDmx.g:4166:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalDmx.g:4167:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            // InternalDmx.g:4167:3: rule__DCastExpression__TypeAssignment_1_1
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
    // InternalDmx.g:4176:1: rule__DCastExpression__Group_1_0__0 : rule__DCastExpression__Group_1_0__0__Impl ;
    public final void rule__DCastExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4180:1: ( rule__DCastExpression__Group_1_0__0__Impl )
            // InternalDmx.g:4181:2: rule__DCastExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:4187:1: rule__DCastExpression__Group_1_0__0__Impl : ( ( rule__DCastExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4191:1: ( ( ( rule__DCastExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4192:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4192:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:4193:2: ( rule__DCastExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4194:2: ( rule__DCastExpression__Group_1_0_0__0 )
            // InternalDmx.g:4194:3: rule__DCastExpression__Group_1_0_0__0
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
    // InternalDmx.g:4203:1: rule__DCastExpression__Group_1_0_0__0 : rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 ;
    public final void rule__DCastExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4207:1: ( rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 )
            // InternalDmx.g:4208:2: rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1
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
    // InternalDmx.g:4215:1: rule__DCastExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DCastExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4219:1: ( ( () ) )
            // InternalDmx.g:4220:1: ( () )
            {
            // InternalDmx.g:4220:1: ( () )
            // InternalDmx.g:4221:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()); 
            }
            // InternalDmx.g:4222:2: ()
            // InternalDmx.g:4222:3: 
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
    // InternalDmx.g:4230:1: rule__DCastExpression__Group_1_0_0__1 : rule__DCastExpression__Group_1_0_0__1__Impl ;
    public final void rule__DCastExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4234:1: ( rule__DCastExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:4235:2: rule__DCastExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:4241:1: rule__DCastExpression__Group_1_0_0__1__Impl : ( ruleOpCast ) ;
    public final void rule__DCastExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4245:1: ( ( ruleOpCast ) )
            // InternalDmx.g:4246:1: ( ruleOpCast )
            {
            // InternalDmx.g:4246:1: ( ruleOpCast )
            // InternalDmx.g:4247:2: ruleOpCast
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
    // InternalDmx.g:4257:1: rule__DTypedMemberReference__Group__0 : rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 ;
    public final void rule__DTypedMemberReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4261:1: ( rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 )
            // InternalDmx.g:4262:2: rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1
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
    // InternalDmx.g:4269:1: rule__DTypedMemberReference__Group__0__Impl : ( ruleDPrimaryExpression ) ;
    public final void rule__DTypedMemberReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4273:1: ( ( ruleDPrimaryExpression ) )
            // InternalDmx.g:4274:1: ( ruleDPrimaryExpression )
            {
            // InternalDmx.g:4274:1: ( ruleDPrimaryExpression )
            // InternalDmx.g:4275:2: ruleDPrimaryExpression
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
    // InternalDmx.g:4284:1: rule__DTypedMemberReference__Group__1 : rule__DTypedMemberReference__Group__1__Impl ;
    public final void rule__DTypedMemberReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4288:1: ( rule__DTypedMemberReference__Group__1__Impl )
            // InternalDmx.g:4289:2: rule__DTypedMemberReference__Group__1__Impl
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
    // InternalDmx.g:4295:1: rule__DTypedMemberReference__Group__1__Impl : ( ( rule__DTypedMemberReference__Alternatives_1 )* ) ;
    public final void rule__DTypedMemberReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4299:1: ( ( ( rule__DTypedMemberReference__Alternatives_1 )* ) )
            // InternalDmx.g:4300:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            {
            // InternalDmx.g:4300:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            // InternalDmx.g:4301:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4302:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==66) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred64_InternalDmx()) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalDmx.g:4302:3: rule__DTypedMemberReference__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DTypedMemberReference__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalDmx.g:4311:1: rule__DTypedMemberReference__Group_1_0__0 : rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4315:1: ( rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 )
            // InternalDmx.g:4316:2: rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1
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
    // InternalDmx.g:4323:1: rule__DTypedMemberReference__Group_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4327:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4328:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4328:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            // InternalDmx.g:4329:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4330:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            // InternalDmx.g:4330:3: rule__DTypedMemberReference__Group_1_0_0__0
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
    // InternalDmx.g:4338:1: rule__DTypedMemberReference__Group_1_0__1 : rule__DTypedMemberReference__Group_1_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4342:1: ( rule__DTypedMemberReference__Group_1_0__1__Impl )
            // InternalDmx.g:4343:2: rule__DTypedMemberReference__Group_1_0__1__Impl
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
    // InternalDmx.g:4349:1: rule__DTypedMemberReference__Group_1_0__1__Impl : ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4353:1: ( ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) )
            // InternalDmx.g:4354:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            {
            // InternalDmx.g:4354:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            // InternalDmx.g:4355:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getValueAssignment_1_0_1()); 
            }
            // InternalDmx.g:4356:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            // InternalDmx.g:4356:3: rule__DTypedMemberReference__ValueAssignment_1_0_1
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
    // InternalDmx.g:4365:1: rule__DTypedMemberReference__Group_1_0_0__0 : rule__DTypedMemberReference__Group_1_0_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4369:1: ( rule__DTypedMemberReference__Group_1_0_0__0__Impl )
            // InternalDmx.g:4370:2: rule__DTypedMemberReference__Group_1_0_0__0__Impl
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
    // InternalDmx.g:4376:1: rule__DTypedMemberReference__Group_1_0_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4380:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:4381:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:4381:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            // InternalDmx.g:4382:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:4383:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            // InternalDmx.g:4383:3: rule__DTypedMemberReference__Group_1_0_0_0__0
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
    // InternalDmx.g:4392:1: rule__DTypedMemberReference__Group_1_0_0_0__0 : rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4396:1: ( rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 )
            // InternalDmx.g:4397:2: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1
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
    // InternalDmx.g:4404:1: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4408:1: ( ( () ) )
            // InternalDmx.g:4409:1: ( () )
            {
            // InternalDmx.g:4409:1: ( () )
            // InternalDmx.g:4410:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:4411:2: ()
            // InternalDmx.g:4411:3: 
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
    // InternalDmx.g:4419:1: rule__DTypedMemberReference__Group_1_0_0_0__1 : rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4423:1: ( rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 )
            // InternalDmx.g:4424:2: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2
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
    // InternalDmx.g:4431:1: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4435:1: ( ( '.' ) )
            // InternalDmx.g:4436:1: ( '.' )
            {
            // InternalDmx.g:4436:1: ( '.' )
            // InternalDmx.g:4437:2: '.'
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
    // InternalDmx.g:4446:1: rule__DTypedMemberReference__Group_1_0_0_0__2 : rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4450:1: ( rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 )
            // InternalDmx.g:4451:2: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3
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
    // InternalDmx.g:4458:1: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4462:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) )
            // InternalDmx.g:4463:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            {
            // InternalDmx.g:4463:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            // InternalDmx.g:4464:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_0_0_0_2()); 
            }
            // InternalDmx.g:4465:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            // InternalDmx.g:4465:3: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2
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
    // InternalDmx.g:4473:1: rule__DTypedMemberReference__Group_1_0_0_0__3 : rule__DTypedMemberReference__Group_1_0_0_0__3__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4477:1: ( rule__DTypedMemberReference__Group_1_0_0_0__3__Impl )
            // InternalDmx.g:4478:2: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl
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
    // InternalDmx.g:4484:1: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4488:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:4489:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:4489:1: ( ruleOpSingleAssign )
            // InternalDmx.g:4490:2: ruleOpSingleAssign
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
    // InternalDmx.g:4500:1: rule__DTypedMemberReference__Group_1_1__0 : rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4504:1: ( rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 )
            // InternalDmx.g:4505:2: rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1
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
    // InternalDmx.g:4512:1: rule__DTypedMemberReference__Group_1_1__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4516:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) )
            // InternalDmx.g:4517:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:4517:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            // InternalDmx.g:4518:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:4519:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            // InternalDmx.g:4519:3: rule__DTypedMemberReference__Group_1_1_0__0
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
    // InternalDmx.g:4527:1: rule__DTypedMemberReference__Group_1_1__1 : rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 ;
    public final void rule__DTypedMemberReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4531:1: ( rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 )
            // InternalDmx.g:4532:2: rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2
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
    // InternalDmx.g:4539:1: rule__DTypedMemberReference__Group_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4543:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) )
            // InternalDmx.g:4544:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            {
            // InternalDmx.g:4544:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            // InternalDmx.g:4545:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_1_1()); 
            }
            // InternalDmx.g:4546:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            // InternalDmx.g:4546:3: rule__DTypedMemberReference__MemberAssignment_1_1_1
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
    // InternalDmx.g:4554:1: rule__DTypedMemberReference__Group_1_1__2 : rule__DTypedMemberReference__Group_1_1__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4558:1: ( rule__DTypedMemberReference__Group_1_1__2__Impl )
            // InternalDmx.g:4559:2: rule__DTypedMemberReference__Group_1_1__2__Impl
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
    // InternalDmx.g:4565:1: rule__DTypedMemberReference__Group_1_1__2__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4569:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? ) )
            // InternalDmx.g:4570:1: ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? )
            {
            // InternalDmx.g:4570:1: ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? )
            // InternalDmx.g:4571:2: ( rule__DTypedMemberReference__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2()); 
            }
            // InternalDmx.g:4572:2: ( rule__DTypedMemberReference__Group_1_1_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmx.g:4572:3: rule__DTypedMemberReference__Group_1_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2()); 
            }

            }


            }

        }
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
    // InternalDmx.g:4581:1: rule__DTypedMemberReference__Group_1_1_0__0 : rule__DTypedMemberReference__Group_1_1_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4585:1: ( rule__DTypedMemberReference__Group_1_1_0__0__Impl )
            // InternalDmx.g:4586:2: rule__DTypedMemberReference__Group_1_1_0__0__Impl
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
    // InternalDmx.g:4592:1: rule__DTypedMemberReference__Group_1_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4596:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:4597:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:4597:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            // InternalDmx.g:4598:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:4599:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            // InternalDmx.g:4599:3: rule__DTypedMemberReference__Group_1_1_0_0__0
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
    // InternalDmx.g:4608:1: rule__DTypedMemberReference__Group_1_1_0_0__0 : rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4612:1: ( rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 )
            // InternalDmx.g:4613:2: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1
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
    // InternalDmx.g:4620:1: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4624:1: ( ( () ) )
            // InternalDmx.g:4625:1: ( () )
            {
            // InternalDmx.g:4625:1: ( () )
            // InternalDmx.g:4626:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:4627:2: ()
            // InternalDmx.g:4627:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerAction_1_1_0_0_0()); 
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
    // InternalDmx.g:4635:1: rule__DTypedMemberReference__Group_1_1_0_0__1 : rule__DTypedMemberReference__Group_1_1_0_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4639:1: ( rule__DTypedMemberReference__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:4640:2: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:4646:1: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4650:1: ( ( '.' ) )
            // InternalDmx.g:4651:1: ( '.' )
            {
            // InternalDmx.g:4651:1: ( '.' )
            // InternalDmx.g:4652:2: '.'
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


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__0"
    // InternalDmx.g:4662:1: rule__DTypedMemberReference__Group_1_1_2__0 : rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4666:1: ( rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1 )
            // InternalDmx.g:4667:2: rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1
            {
            pushFollow(FOLLOW_35);
            rule__DTypedMemberReference__Group_1_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2__1();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__0__Impl"
    // InternalDmx.g:4674:1: rule__DTypedMemberReference__Group_1_1_2__0__Impl : ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4678:1: ( ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) ) )
            // InternalDmx.g:4679:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) )
            {
            // InternalDmx.g:4679:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) )
            // InternalDmx.g:4680:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0()); 
            }
            // InternalDmx.g:4681:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 )
            // InternalDmx.g:4681:3: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__1"
    // InternalDmx.g:4689:1: rule__DTypedMemberReference__Group_1_1_2__1 : rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2 ;
    public final void rule__DTypedMemberReference__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4693:1: ( rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2 )
            // InternalDmx.g:4694:2: rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2
            {
            pushFollow(FOLLOW_35);
            rule__DTypedMemberReference__Group_1_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2__2();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__1__Impl"
    // InternalDmx.g:4701:1: rule__DTypedMemberReference__Group_1_1_2__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4705:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? ) )
            // InternalDmx.g:4706:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? )
            {
            // InternalDmx.g:4706:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? )
            // InternalDmx.g:4707:2: ( rule__DTypedMemberReference__Group_1_1_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1()); 
            }
            // InternalDmx.g:4708:2: ( rule__DTypedMemberReference__Group_1_1_2_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_NATURAL && LA40_0<=RULE_ID)||LA40_0==RULE_STRING||(LA40_0>=21 && LA40_0<=28)||(LA40_0>=30 && LA40_0<=33)||(LA40_0>=36 && LA40_0<=37)||(LA40_0>=59 && LA40_0<=61)||(LA40_0>=69 && LA40_0<=70)||(LA40_0>=75 && LA40_0<=77)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDmx.g:4708:3: rule__DTypedMemberReference__Group_1_1_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTypedMemberReference__Group_1_1_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__2"
    // InternalDmx.g:4716:1: rule__DTypedMemberReference__Group_1_1_2__2 : rule__DTypedMemberReference__Group_1_1_2__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4720:1: ( rule__DTypedMemberReference__Group_1_1_2__2__Impl )
            // InternalDmx.g:4721:2: rule__DTypedMemberReference__Group_1_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2__2__Impl();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__2"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2__2__Impl"
    // InternalDmx.g:4727:1: rule__DTypedMemberReference__Group_1_1_2__2__Impl : ( ')' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4731:1: ( ( ')' ) )
            // InternalDmx.g:4732:1: ( ')' )
            {
            // InternalDmx.g:4732:1: ( ')' )
            // InternalDmx.g:4733:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2__2__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1__0"
    // InternalDmx.g:4743:1: rule__DTypedMemberReference__Group_1_1_2_1__0 : rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4747:1: ( rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1 )
            // InternalDmx.g:4748:2: rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1
            {
            pushFollow(FOLLOW_36);
            rule__DTypedMemberReference__Group_1_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_1__1();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1__0__Impl"
    // InternalDmx.g:4755:1: rule__DTypedMemberReference__Group_1_1_2_1__0__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4759:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) ) )
            // InternalDmx.g:4760:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) )
            {
            // InternalDmx.g:4760:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) )
            // InternalDmx.g:4761:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_0()); 
            }
            // InternalDmx.g:4762:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 )
            // InternalDmx.g:4762:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1__1"
    // InternalDmx.g:4770:1: rule__DTypedMemberReference__Group_1_1_2_1__1 : rule__DTypedMemberReference__Group_1_1_2_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4774:1: ( rule__DTypedMemberReference__Group_1_1_2_1__1__Impl )
            // InternalDmx.g:4775:2: rule__DTypedMemberReference__Group_1_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_1__1__Impl();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1__1__Impl"
    // InternalDmx.g:4781:1: rule__DTypedMemberReference__Group_1_1_2_1__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4785:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* ) )
            // InternalDmx.g:4786:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* )
            {
            // InternalDmx.g:4786:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* )
            // InternalDmx.g:4787:2: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1_1()); 
            }
            // InternalDmx.g:4788:2: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==68) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDmx.g:4788:3: rule__DTypedMemberReference__Group_1_1_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DTypedMemberReference__Group_1_1_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1__1__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1_1__0"
    // InternalDmx.g:4797:1: rule__DTypedMemberReference__Group_1_1_2_1_1__0 : rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4801:1: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1 )
            // InternalDmx.g:4802:2: rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_1_1__1();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1_1__0"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl"
    // InternalDmx.g:4809:1: rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4813:1: ( ( ',' ) )
            // InternalDmx.g:4814:1: ( ',' )
            {
            // InternalDmx.g:4814:1: ( ',' )
            // InternalDmx.g:4815:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_1_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1_1__1"
    // InternalDmx.g:4824:1: rule__DTypedMemberReference__Group_1_1_2_1_1__1 : rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4828:1: ( rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl )
            // InternalDmx.g:4829:2: rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl();

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
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1_1__1"


    // $ANTLR start "rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl"
    // InternalDmx.g:4835:1: rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4839:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) ) )
            // InternalDmx.g:4840:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) )
            {
            // InternalDmx.g:4840:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) )
            // InternalDmx.g:4841:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_1_1()); 
            }
            // InternalDmx.g:4842:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 )
            // InternalDmx.g:4842:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl"


    // $ANTLR start "rule__DSelfExpression__Group__0"
    // InternalDmx.g:4851:1: rule__DSelfExpression__Group__0 : rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 ;
    public final void rule__DSelfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4855:1: ( rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 )
            // InternalDmx.g:4856:2: rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1
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
    // InternalDmx.g:4863:1: rule__DSelfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DSelfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4867:1: ( ( () ) )
            // InternalDmx.g:4868:1: ( () )
            {
            // InternalDmx.g:4868:1: ( () )
            // InternalDmx.g:4869:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0()); 
            }
            // InternalDmx.g:4870:2: ()
            // InternalDmx.g:4870:3: 
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
    // InternalDmx.g:4878:1: rule__DSelfExpression__Group__1 : rule__DSelfExpression__Group__1__Impl ;
    public final void rule__DSelfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4882:1: ( rule__DSelfExpression__Group__1__Impl )
            // InternalDmx.g:4883:2: rule__DSelfExpression__Group__1__Impl
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
    // InternalDmx.g:4889:1: rule__DSelfExpression__Group__1__Impl : ( ( rule__DSelfExpression__Alternatives_1 ) ) ;
    public final void rule__DSelfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4893:1: ( ( ( rule__DSelfExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4894:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4894:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            // InternalDmx.g:4895:2: ( rule__DSelfExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4896:2: ( rule__DSelfExpression__Alternatives_1 )
            // InternalDmx.g:4896:3: rule__DSelfExpression__Alternatives_1
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
    // InternalDmx.g:4905:1: rule__DReturnExpression__Group__0 : rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 ;
    public final void rule__DReturnExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4909:1: ( rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 )
            // InternalDmx.g:4910:2: rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1
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
    // InternalDmx.g:4917:1: rule__DReturnExpression__Group__0__Impl : ( () ) ;
    public final void rule__DReturnExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4921:1: ( ( () ) )
            // InternalDmx.g:4922:1: ( () )
            {
            // InternalDmx.g:4922:1: ( () )
            // InternalDmx.g:4923:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0()); 
            }
            // InternalDmx.g:4924:2: ()
            // InternalDmx.g:4924:3: 
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
    // InternalDmx.g:4932:1: rule__DReturnExpression__Group__1 : rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 ;
    public final void rule__DReturnExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4936:1: ( rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 )
            // InternalDmx.g:4937:2: rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2
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
    // InternalDmx.g:4944:1: rule__DReturnExpression__Group__1__Impl : ( ( rule__DReturnExpression__Alternatives_1 ) ) ;
    public final void rule__DReturnExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4948:1: ( ( ( rule__DReturnExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4949:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4949:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            // InternalDmx.g:4950:2: ( rule__DReturnExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4951:2: ( rule__DReturnExpression__Alternatives_1 )
            // InternalDmx.g:4951:3: rule__DReturnExpression__Alternatives_1
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
    // InternalDmx.g:4959:1: rule__DReturnExpression__Group__2 : rule__DReturnExpression__Group__2__Impl ;
    public final void rule__DReturnExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4963:1: ( rule__DReturnExpression__Group__2__Impl )
            // InternalDmx.g:4964:2: rule__DReturnExpression__Group__2__Impl
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
    // InternalDmx.g:4970:1: rule__DReturnExpression__Group__2__Impl : ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) ;
    public final void rule__DReturnExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4974:1: ( ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) )
            // InternalDmx.g:4975:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            {
            // InternalDmx.g:4975:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            // InternalDmx.g:4976:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:4977:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalDmx.g:4977:3: rule__DReturnExpression__ExpressionAssignment_2
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
    // InternalDmx.g:4986:1: rule__DRaiseExpression__Group__0 : rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 ;
    public final void rule__DRaiseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4990:1: ( rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 )
            // InternalDmx.g:4991:2: rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1
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
    // InternalDmx.g:4998:1: rule__DRaiseExpression__Group__0__Impl : ( () ) ;
    public final void rule__DRaiseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5002:1: ( ( () ) )
            // InternalDmx.g:5003:1: ( () )
            {
            // InternalDmx.g:5003:1: ( () )
            // InternalDmx.g:5004:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0()); 
            }
            // InternalDmx.g:5005:2: ()
            // InternalDmx.g:5005:3: 
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
    // InternalDmx.g:5013:1: rule__DRaiseExpression__Group__1 : rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 ;
    public final void rule__DRaiseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5017:1: ( rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 )
            // InternalDmx.g:5018:2: rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2
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
    // InternalDmx.g:5025:1: rule__DRaiseExpression__Group__1__Impl : ( ( rule__DRaiseExpression__Alternatives_1 ) ) ;
    public final void rule__DRaiseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5029:1: ( ( ( rule__DRaiseExpression__Alternatives_1 ) ) )
            // InternalDmx.g:5030:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:5030:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            // InternalDmx.g:5031:2: ( rule__DRaiseExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:5032:2: ( rule__DRaiseExpression__Alternatives_1 )
            // InternalDmx.g:5032:3: rule__DRaiseExpression__Alternatives_1
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
    // InternalDmx.g:5040:1: rule__DRaiseExpression__Group__2 : rule__DRaiseExpression__Group__2__Impl ;
    public final void rule__DRaiseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5044:1: ( rule__DRaiseExpression__Group__2__Impl )
            // InternalDmx.g:5045:2: rule__DRaiseExpression__Group__2__Impl
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
    // InternalDmx.g:5051:1: rule__DRaiseExpression__Group__2__Impl : ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__DRaiseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5055:1: ( ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) )
            // InternalDmx.g:5056:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            {
            // InternalDmx.g:5056:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            // InternalDmx.g:5057:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:5058:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            // InternalDmx.g:5058:3: rule__DRaiseExpression__ExpressionAssignment_2
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
    // InternalDmx.g:5067:1: rule__DParenthesizedExpression__Group__0 : rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 ;
    public final void rule__DParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5071:1: ( rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 )
            // InternalDmx.g:5072:2: rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1
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
    // InternalDmx.g:5079:1: rule__DParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__DParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5083:1: ( ( '(' ) )
            // InternalDmx.g:5084:1: ( '(' )
            {
            // InternalDmx.g:5084:1: ( '(' )
            // InternalDmx.g:5085:2: '('
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
    // InternalDmx.g:5094:1: rule__DParenthesizedExpression__Group__1 : rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 ;
    public final void rule__DParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5098:1: ( rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 )
            // InternalDmx.g:5099:2: rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2
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
    // InternalDmx.g:5106:1: rule__DParenthesizedExpression__Group__1__Impl : ( ruleDExpression ) ;
    public final void rule__DParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5110:1: ( ( ruleDExpression ) )
            // InternalDmx.g:5111:1: ( ruleDExpression )
            {
            // InternalDmx.g:5111:1: ( ruleDExpression )
            // InternalDmx.g:5112:2: ruleDExpression
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
    // InternalDmx.g:5121:1: rule__DParenthesizedExpression__Group__2 : rule__DParenthesizedExpression__Group__2__Impl ;
    public final void rule__DParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5125:1: ( rule__DParenthesizedExpression__Group__2__Impl )
            // InternalDmx.g:5126:2: rule__DParenthesizedExpression__Group__2__Impl
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
    // InternalDmx.g:5132:1: rule__DParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__DParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5136:1: ( ( ')' ) )
            // InternalDmx.g:5137:1: ( ')' )
            {
            // InternalDmx.g:5137:1: ( ')' )
            // InternalDmx.g:5138:2: ')'
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
    // InternalDmx.g:5148:1: rule__DFunctionCall__Group__0 : rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 ;
    public final void rule__DFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5152:1: ( rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 )
            // InternalDmx.g:5153:2: rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1
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
    // InternalDmx.g:5160:1: rule__DFunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__DFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5164:1: ( ( () ) )
            // InternalDmx.g:5165:1: ( () )
            {
            // InternalDmx.g:5165:1: ( () )
            // InternalDmx.g:5166:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0()); 
            }
            // InternalDmx.g:5167:2: ()
            // InternalDmx.g:5167:3: 
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
    // InternalDmx.g:5175:1: rule__DFunctionCall__Group__1 : rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 ;
    public final void rule__DFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5179:1: ( rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 )
            // InternalDmx.g:5180:2: rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalDmx.g:5187:1: rule__DFunctionCall__Group__1__Impl : ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__DFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5191:1: ( ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) )
            // InternalDmx.g:5192:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            {
            // InternalDmx.g:5192:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            // InternalDmx.g:5193:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // InternalDmx.g:5194:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            // InternalDmx.g:5194:3: rule__DFunctionCall__FunctionAssignment_1
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
    // InternalDmx.g:5202:1: rule__DFunctionCall__Group__2 : rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 ;
    public final void rule__DFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5206:1: ( rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 )
            // InternalDmx.g:5207:2: rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3
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
    // InternalDmx.g:5214:1: rule__DFunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__DFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5218:1: ( ( '(' ) )
            // InternalDmx.g:5219:1: ( '(' )
            {
            // InternalDmx.g:5219:1: ( '(' )
            // InternalDmx.g:5220:2: '('
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
    // InternalDmx.g:5229:1: rule__DFunctionCall__Group__3 : rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 ;
    public final void rule__DFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5233:1: ( rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 )
            // InternalDmx.g:5234:2: rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4
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
    // InternalDmx.g:5241:1: rule__DFunctionCall__Group__3__Impl : ( ( rule__DFunctionCall__Group_3__0 )? ) ;
    public final void rule__DFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5245:1: ( ( ( rule__DFunctionCall__Group_3__0 )? ) )
            // InternalDmx.g:5246:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            {
            // InternalDmx.g:5246:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            // InternalDmx.g:5247:2: ( rule__DFunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5248:2: ( rule__DFunctionCall__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_NATURAL && LA43_0<=RULE_ID)||LA43_0==RULE_STRING||(LA43_0>=21 && LA43_0<=28)||(LA43_0>=30 && LA43_0<=33)||(LA43_0>=36 && LA43_0<=37)||(LA43_0>=59 && LA43_0<=61)||(LA43_0>=69 && LA43_0<=70)||(LA43_0>=75 && LA43_0<=77)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDmx.g:5248:3: rule__DFunctionCall__Group_3__0
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
    // InternalDmx.g:5256:1: rule__DFunctionCall__Group__4 : rule__DFunctionCall__Group__4__Impl ;
    public final void rule__DFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5260:1: ( rule__DFunctionCall__Group__4__Impl )
            // InternalDmx.g:5261:2: rule__DFunctionCall__Group__4__Impl
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
    // InternalDmx.g:5267:1: rule__DFunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__DFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5271:1: ( ( ')' ) )
            // InternalDmx.g:5272:1: ( ')' )
            {
            // InternalDmx.g:5272:1: ( ')' )
            // InternalDmx.g:5273:2: ')'
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
    // InternalDmx.g:5283:1: rule__DFunctionCall__Group_3__0 : rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 ;
    public final void rule__DFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5287:1: ( rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 )
            // InternalDmx.g:5288:2: rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1
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
    // InternalDmx.g:5295:1: rule__DFunctionCall__Group_3__0__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) ;
    public final void rule__DFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5299:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) )
            // InternalDmx.g:5300:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            {
            // InternalDmx.g:5300:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            // InternalDmx.g:5301:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0()); 
            }
            // InternalDmx.g:5302:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            // InternalDmx.g:5302:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0
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
    // InternalDmx.g:5310:1: rule__DFunctionCall__Group_3__1 : rule__DFunctionCall__Group_3__1__Impl ;
    public final void rule__DFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5314:1: ( rule__DFunctionCall__Group_3__1__Impl )
            // InternalDmx.g:5315:2: rule__DFunctionCall__Group_3__1__Impl
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
    // InternalDmx.g:5321:1: rule__DFunctionCall__Group_3__1__Impl : ( ( rule__DFunctionCall__Group_3_1__0 )* ) ;
    public final void rule__DFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5325:1: ( ( ( rule__DFunctionCall__Group_3_1__0 )* ) )
            // InternalDmx.g:5326:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            {
            // InternalDmx.g:5326:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            // InternalDmx.g:5327:2: ( rule__DFunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5328:2: ( rule__DFunctionCall__Group_3_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==68) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDmx.g:5328:3: rule__DFunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DFunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalDmx.g:5337:1: rule__DFunctionCall__Group_3_1__0 : rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 ;
    public final void rule__DFunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5341:1: ( rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 )
            // InternalDmx.g:5342:2: rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1
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
    // InternalDmx.g:5349:1: rule__DFunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DFunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5353:1: ( ( ',' ) )
            // InternalDmx.g:5354:1: ( ',' )
            {
            // InternalDmx.g:5354:1: ( ',' )
            // InternalDmx.g:5355:2: ','
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
    // InternalDmx.g:5364:1: rule__DFunctionCall__Group_3_1__1 : rule__DFunctionCall__Group_3_1__1__Impl ;
    public final void rule__DFunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5368:1: ( rule__DFunctionCall__Group_3_1__1__Impl )
            // InternalDmx.g:5369:2: rule__DFunctionCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5375:1: rule__DFunctionCall__Group_3_1__1__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__DFunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5379:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) )
            // InternalDmx.g:5380:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            {
            // InternalDmx.g:5380:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            // InternalDmx.g:5381:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1()); 
            }
            // InternalDmx.g:5382:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            // InternalDmx.g:5382:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1
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
    // InternalDmx.g:5391:1: rule__DConstructorCall__Group__0 : rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 ;
    public final void rule__DConstructorCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5395:1: ( rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 )
            // InternalDmx.g:5396:2: rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDmx.g:5403:1: rule__DConstructorCall__Group__0__Impl : ( () ) ;
    public final void rule__DConstructorCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5407:1: ( ( () ) )
            // InternalDmx.g:5408:1: ( () )
            {
            // InternalDmx.g:5408:1: ( () )
            // InternalDmx.g:5409:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0()); 
            }
            // InternalDmx.g:5410:2: ()
            // InternalDmx.g:5410:3: 
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
    // InternalDmx.g:5418:1: rule__DConstructorCall__Group__1 : rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 ;
    public final void rule__DConstructorCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5422:1: ( rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 )
            // InternalDmx.g:5423:2: rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2
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
    // InternalDmx.g:5430:1: rule__DConstructorCall__Group__1__Impl : ( ruleOpConstructor ) ;
    public final void rule__DConstructorCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5434:1: ( ( ruleOpConstructor ) )
            // InternalDmx.g:5435:1: ( ruleOpConstructor )
            {
            // InternalDmx.g:5435:1: ( ruleOpConstructor )
            // InternalDmx.g:5436:2: ruleOpConstructor
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
    // InternalDmx.g:5445:1: rule__DConstructorCall__Group__2 : rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 ;
    public final void rule__DConstructorCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5449:1: ( rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 )
            // InternalDmx.g:5450:2: rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalDmx.g:5457:1: rule__DConstructorCall__Group__2__Impl : ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) ;
    public final void rule__DConstructorCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5461:1: ( ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) )
            // InternalDmx.g:5462:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            {
            // InternalDmx.g:5462:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            // InternalDmx.g:5463:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2()); 
            }
            // InternalDmx.g:5464:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            // InternalDmx.g:5464:3: rule__DConstructorCall__ConstructorAssignment_2
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
    // InternalDmx.g:5472:1: rule__DConstructorCall__Group__3 : rule__DConstructorCall__Group__3__Impl ;
    public final void rule__DConstructorCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5476:1: ( rule__DConstructorCall__Group__3__Impl )
            // InternalDmx.g:5477:2: rule__DConstructorCall__Group__3__Impl
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
    // InternalDmx.g:5483:1: rule__DConstructorCall__Group__3__Impl : ( ( rule__DConstructorCall__Group_3__0 )? ) ;
    public final void rule__DConstructorCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5487:1: ( ( ( rule__DConstructorCall__Group_3__0 )? ) )
            // InternalDmx.g:5488:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            {
            // InternalDmx.g:5488:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            // InternalDmx.g:5489:2: ( rule__DConstructorCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5490:2: ( rule__DConstructorCall__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmx.g:5490:3: rule__DConstructorCall__Group_3__0
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
    // InternalDmx.g:5499:1: rule__DConstructorCall__Group_3__0 : rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 ;
    public final void rule__DConstructorCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5503:1: ( rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 )
            // InternalDmx.g:5504:2: rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1
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
    // InternalDmx.g:5511:1: rule__DConstructorCall__Group_3__0__Impl : ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) ;
    public final void rule__DConstructorCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5515:1: ( ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) )
            // InternalDmx.g:5516:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            {
            // InternalDmx.g:5516:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            // InternalDmx.g:5517:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0()); 
            }
            // InternalDmx.g:5518:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            // InternalDmx.g:5518:3: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0
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
    // InternalDmx.g:5526:1: rule__DConstructorCall__Group_3__1 : rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 ;
    public final void rule__DConstructorCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5530:1: ( rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 )
            // InternalDmx.g:5531:2: rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2
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
    // InternalDmx.g:5538:1: rule__DConstructorCall__Group_3__1__Impl : ( ( rule__DConstructorCall__Group_3_1__0 )? ) ;
    public final void rule__DConstructorCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5542:1: ( ( ( rule__DConstructorCall__Group_3_1__0 )? ) )
            // InternalDmx.g:5543:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            {
            // InternalDmx.g:5543:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            // InternalDmx.g:5544:2: ( rule__DConstructorCall__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5545:2: ( rule__DConstructorCall__Group_3_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_NATURAL && LA46_0<=RULE_ID)||LA46_0==RULE_STRING||(LA46_0>=21 && LA46_0<=28)||(LA46_0>=30 && LA46_0<=33)||(LA46_0>=36 && LA46_0<=37)||(LA46_0>=59 && LA46_0<=61)||(LA46_0>=69 && LA46_0<=70)||(LA46_0>=75 && LA46_0<=77)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDmx.g:5545:3: rule__DConstructorCall__Group_3_1__0
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
    // InternalDmx.g:5553:1: rule__DConstructorCall__Group_3__2 : rule__DConstructorCall__Group_3__2__Impl ;
    public final void rule__DConstructorCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5557:1: ( rule__DConstructorCall__Group_3__2__Impl )
            // InternalDmx.g:5558:2: rule__DConstructorCall__Group_3__2__Impl
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
    // InternalDmx.g:5564:1: rule__DConstructorCall__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DConstructorCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5568:1: ( ( ')' ) )
            // InternalDmx.g:5569:1: ( ')' )
            {
            // InternalDmx.g:5569:1: ( ')' )
            // InternalDmx.g:5570:2: ')'
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
    // InternalDmx.g:5580:1: rule__DConstructorCall__Group_3_1__0 : rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 ;
    public final void rule__DConstructorCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5584:1: ( rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 )
            // InternalDmx.g:5585:2: rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1
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
    // InternalDmx.g:5592:1: rule__DConstructorCall__Group_3_1__0__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) ;
    public final void rule__DConstructorCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5596:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) )
            // InternalDmx.g:5597:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            {
            // InternalDmx.g:5597:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            // InternalDmx.g:5598:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0()); 
            }
            // InternalDmx.g:5599:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            // InternalDmx.g:5599:3: rule__DConstructorCall__ArgumentsAssignment_3_1_0
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
    // InternalDmx.g:5607:1: rule__DConstructorCall__Group_3_1__1 : rule__DConstructorCall__Group_3_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5611:1: ( rule__DConstructorCall__Group_3_1__1__Impl )
            // InternalDmx.g:5612:2: rule__DConstructorCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5618:1: rule__DConstructorCall__Group_3_1__1__Impl : ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) ;
    public final void rule__DConstructorCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5622:1: ( ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) )
            // InternalDmx.g:5623:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            {
            // InternalDmx.g:5623:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            // InternalDmx.g:5624:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1()); 
            }
            // InternalDmx.g:5625:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==68) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDmx.g:5625:3: rule__DConstructorCall__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DConstructorCall__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalDmx.g:5634:1: rule__DConstructorCall__Group_3_1_1__0 : rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 ;
    public final void rule__DConstructorCall__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5638:1: ( rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 )
            // InternalDmx.g:5639:2: rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1
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
    // InternalDmx.g:5646:1: rule__DConstructorCall__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DConstructorCall__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5650:1: ( ( ',' ) )
            // InternalDmx.g:5651:1: ( ',' )
            {
            // InternalDmx.g:5651:1: ( ',' )
            // InternalDmx.g:5652:2: ','
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
    // InternalDmx.g:5661:1: rule__DConstructorCall__Group_3_1_1__1 : rule__DConstructorCall__Group_3_1_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5665:1: ( rule__DConstructorCall__Group_3_1_1__1__Impl )
            // InternalDmx.g:5666:2: rule__DConstructorCall__Group_3_1_1__1__Impl
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
    // InternalDmx.g:5672:1: rule__DConstructorCall__Group_3_1_1__1__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) ;
    public final void rule__DConstructorCall__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5676:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) )
            // InternalDmx.g:5677:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            {
            // InternalDmx.g:5677:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            // InternalDmx.g:5678:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1()); 
            }
            // InternalDmx.g:5679:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            // InternalDmx.g:5679:3: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1
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
    // InternalDmx.g:5688:1: rule__DContextReference__Group__0 : rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 ;
    public final void rule__DContextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5692:1: ( rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 )
            // InternalDmx.g:5693:2: rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1
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
    // InternalDmx.g:5700:1: rule__DContextReference__Group__0__Impl : ( () ) ;
    public final void rule__DContextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5704:1: ( ( () ) )
            // InternalDmx.g:5705:1: ( () )
            {
            // InternalDmx.g:5705:1: ( () )
            // InternalDmx.g:5706:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0()); 
            }
            // InternalDmx.g:5707:2: ()
            // InternalDmx.g:5707:3: 
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
    // InternalDmx.g:5715:1: rule__DContextReference__Group__1 : rule__DContextReference__Group__1__Impl ;
    public final void rule__DContextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5719:1: ( rule__DContextReference__Group__1__Impl )
            // InternalDmx.g:5720:2: rule__DContextReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DContextReference__Group__1__Impl();

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
    // InternalDmx.g:5726:1: rule__DContextReference__Group__1__Impl : ( ( rule__DContextReference__ContextElementAssignment_1 ) ) ;
    public final void rule__DContextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5730:1: ( ( ( rule__DContextReference__ContextElementAssignment_1 ) ) )
            // InternalDmx.g:5731:1: ( ( rule__DContextReference__ContextElementAssignment_1 ) )
            {
            // InternalDmx.g:5731:1: ( ( rule__DContextReference__ContextElementAssignment_1 ) )
            // InternalDmx.g:5732:2: ( rule__DContextReference__ContextElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getContextElementAssignment_1()); 
            }
            // InternalDmx.g:5733:2: ( rule__DContextReference__ContextElementAssignment_1 )
            // InternalDmx.g:5733:3: rule__DContextReference__ContextElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DContextReference__ContextElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getContextElementAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__DIfExpression__Group__0"
    // InternalDmx.g:5742:1: rule__DIfExpression__Group__0 : rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 ;
    public final void rule__DIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5746:1: ( rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 )
            // InternalDmx.g:5747:2: rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDmx.g:5754:1: rule__DIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5758:1: ( ( () ) )
            // InternalDmx.g:5759:1: ( () )
            {
            // InternalDmx.g:5759:1: ( () )
            // InternalDmx.g:5760:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0()); 
            }
            // InternalDmx.g:5761:2: ()
            // InternalDmx.g:5761:3: 
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
    // InternalDmx.g:5769:1: rule__DIfExpression__Group__1 : rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 ;
    public final void rule__DIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5773:1: ( rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 )
            // InternalDmx.g:5774:2: rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2
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
    // InternalDmx.g:5781:1: rule__DIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__DIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5785:1: ( ( 'if' ) )
            // InternalDmx.g:5786:1: ( 'if' )
            {
            // InternalDmx.g:5786:1: ( 'if' )
            // InternalDmx.g:5787:2: 'if'
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
    // InternalDmx.g:5796:1: rule__DIfExpression__Group__2 : rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 ;
    public final void rule__DIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5800:1: ( rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 )
            // InternalDmx.g:5801:2: rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalDmx.g:5808:1: rule__DIfExpression__Group__2__Impl : ( ( rule__DIfExpression__IfAssignment_2 ) ) ;
    public final void rule__DIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5812:1: ( ( ( rule__DIfExpression__IfAssignment_2 ) ) )
            // InternalDmx.g:5813:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            {
            // InternalDmx.g:5813:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            // InternalDmx.g:5814:2: ( rule__DIfExpression__IfAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfAssignment_2()); 
            }
            // InternalDmx.g:5815:2: ( rule__DIfExpression__IfAssignment_2 )
            // InternalDmx.g:5815:3: rule__DIfExpression__IfAssignment_2
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
    // InternalDmx.g:5823:1: rule__DIfExpression__Group__3 : rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 ;
    public final void rule__DIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5827:1: ( rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 )
            // InternalDmx.g:5828:2: rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4
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
    // InternalDmx.g:5835:1: rule__DIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__DIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5839:1: ( ( 'then' ) )
            // InternalDmx.g:5840:1: ( 'then' )
            {
            // InternalDmx.g:5840:1: ( 'then' )
            // InternalDmx.g:5841:2: 'then'
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
    // InternalDmx.g:5850:1: rule__DIfExpression__Group__4 : rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 ;
    public final void rule__DIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5854:1: ( rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 )
            // InternalDmx.g:5855:2: rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalDmx.g:5862:1: rule__DIfExpression__Group__4__Impl : ( ( rule__DIfExpression__ThenAssignment_4 ) ) ;
    public final void rule__DIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5866:1: ( ( ( rule__DIfExpression__ThenAssignment_4 ) ) )
            // InternalDmx.g:5867:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            {
            // InternalDmx.g:5867:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            // InternalDmx.g:5868:2: ( rule__DIfExpression__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenAssignment_4()); 
            }
            // InternalDmx.g:5869:2: ( rule__DIfExpression__ThenAssignment_4 )
            // InternalDmx.g:5869:3: rule__DIfExpression__ThenAssignment_4
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
    // InternalDmx.g:5877:1: rule__DIfExpression__Group__5 : rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 ;
    public final void rule__DIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5881:1: ( rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 )
            // InternalDmx.g:5882:2: rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalDmx.g:5889:1: rule__DIfExpression__Group__5__Impl : ( ( rule__DIfExpression__Group_5__0 )? ) ;
    public final void rule__DIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5893:1: ( ( ( rule__DIfExpression__Group_5__0 )? ) )
            // InternalDmx.g:5894:1: ( ( rule__DIfExpression__Group_5__0 )? )
            {
            // InternalDmx.g:5894:1: ( ( rule__DIfExpression__Group_5__0 )? )
            // InternalDmx.g:5895:2: ( rule__DIfExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getGroup_5()); 
            }
            // InternalDmx.g:5896:2: ( rule__DIfExpression__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==73) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmx.g:5896:3: rule__DIfExpression__Group_5__0
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
    // InternalDmx.g:5904:1: rule__DIfExpression__Group__6 : rule__DIfExpression__Group__6__Impl ;
    public final void rule__DIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5908:1: ( rule__DIfExpression__Group__6__Impl )
            // InternalDmx.g:5909:2: rule__DIfExpression__Group__6__Impl
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
    // InternalDmx.g:5915:1: rule__DIfExpression__Group__6__Impl : ( 'end' ) ;
    public final void rule__DIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5919:1: ( ( 'end' ) )
            // InternalDmx.g:5920:1: ( 'end' )
            {
            // InternalDmx.g:5920:1: ( 'end' )
            // InternalDmx.g:5921:2: 'end'
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
    // InternalDmx.g:5931:1: rule__DIfExpression__Group_5__0 : rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 ;
    public final void rule__DIfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5935:1: ( rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 )
            // InternalDmx.g:5936:2: rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1
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
    // InternalDmx.g:5943:1: rule__DIfExpression__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__DIfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5947:1: ( ( ( 'else' ) ) )
            // InternalDmx.g:5948:1: ( ( 'else' ) )
            {
            // InternalDmx.g:5948:1: ( ( 'else' ) )
            // InternalDmx.g:5949:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0()); 
            }
            // InternalDmx.g:5950:2: ( 'else' )
            // InternalDmx.g:5950:3: 'else'
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
    // InternalDmx.g:5958:1: rule__DIfExpression__Group_5__1 : rule__DIfExpression__Group_5__1__Impl ;
    public final void rule__DIfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5962:1: ( rule__DIfExpression__Group_5__1__Impl )
            // InternalDmx.g:5963:2: rule__DIfExpression__Group_5__1__Impl
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
    // InternalDmx.g:5969:1: rule__DIfExpression__Group_5__1__Impl : ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) ;
    public final void rule__DIfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5973:1: ( ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) )
            // InternalDmx.g:5974:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            {
            // InternalDmx.g:5974:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            // InternalDmx.g:5975:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1()); 
            }
            // InternalDmx.g:5976:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            // InternalDmx.g:5976:3: rule__DIfExpression__ElseAssignment_5_1
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
    // InternalDmx.g:5985:1: rule__DForLoopExpression__Group__0 : rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 ;
    public final void rule__DForLoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5989:1: ( rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 )
            // InternalDmx.g:5990:2: rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1
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
    // InternalDmx.g:5997:1: rule__DForLoopExpression__Group__0__Impl : ( ( rule__DForLoopExpression__Group_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6001:1: ( ( ( rule__DForLoopExpression__Group_0__0 ) ) )
            // InternalDmx.g:6002:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            {
            // InternalDmx.g:6002:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            // InternalDmx.g:6003:2: ( rule__DForLoopExpression__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0()); 
            }
            // InternalDmx.g:6004:2: ( rule__DForLoopExpression__Group_0__0 )
            // InternalDmx.g:6004:3: rule__DForLoopExpression__Group_0__0
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
    // InternalDmx.g:6012:1: rule__DForLoopExpression__Group__1 : rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 ;
    public final void rule__DForLoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6016:1: ( rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 )
            // InternalDmx.g:6017:2: rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalDmx.g:6024:1: rule__DForLoopExpression__Group__1__Impl : ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) ;
    public final void rule__DForLoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6028:1: ( ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) )
            // InternalDmx.g:6029:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            {
            // InternalDmx.g:6029:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            // InternalDmx.g:6030:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1()); 
            }
            // InternalDmx.g:6031:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            // InternalDmx.g:6031:3: rule__DForLoopExpression__ForExpressionAssignment_1
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
    // InternalDmx.g:6039:1: rule__DForLoopExpression__Group__2 : rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 ;
    public final void rule__DForLoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6043:1: ( rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 )
            // InternalDmx.g:6044:2: rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3
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
    // InternalDmx.g:6051:1: rule__DForLoopExpression__Group__2__Impl : ( 'do' ) ;
    public final void rule__DForLoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6055:1: ( ( 'do' ) )
            // InternalDmx.g:6056:1: ( 'do' )
            {
            // InternalDmx.g:6056:1: ( 'do' )
            // InternalDmx.g:6057:2: 'do'
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
    // InternalDmx.g:6066:1: rule__DForLoopExpression__Group__3 : rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 ;
    public final void rule__DForLoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6070:1: ( rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 )
            // InternalDmx.g:6071:2: rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalDmx.g:6078:1: rule__DForLoopExpression__Group__3__Impl : ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) ;
    public final void rule__DForLoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6082:1: ( ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) )
            // InternalDmx.g:6083:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            {
            // InternalDmx.g:6083:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            // InternalDmx.g:6084:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3()); 
            }
            // InternalDmx.g:6085:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            // InternalDmx.g:6085:3: rule__DForLoopExpression__EachExpressionAssignment_3
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
    // InternalDmx.g:6093:1: rule__DForLoopExpression__Group__4 : rule__DForLoopExpression__Group__4__Impl ;
    public final void rule__DForLoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6097:1: ( rule__DForLoopExpression__Group__4__Impl )
            // InternalDmx.g:6098:2: rule__DForLoopExpression__Group__4__Impl
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
    // InternalDmx.g:6104:1: rule__DForLoopExpression__Group__4__Impl : ( 'end' ) ;
    public final void rule__DForLoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6108:1: ( ( 'end' ) )
            // InternalDmx.g:6109:1: ( 'end' )
            {
            // InternalDmx.g:6109:1: ( 'end' )
            // InternalDmx.g:6110:2: 'end'
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
    // InternalDmx.g:6120:1: rule__DForLoopExpression__Group_0__0 : rule__DForLoopExpression__Group_0__0__Impl ;
    public final void rule__DForLoopExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6124:1: ( rule__DForLoopExpression__Group_0__0__Impl )
            // InternalDmx.g:6125:2: rule__DForLoopExpression__Group_0__0__Impl
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
    // InternalDmx.g:6131:1: rule__DForLoopExpression__Group_0__0__Impl : ( ( rule__DForLoopExpression__Group_0_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6135:1: ( ( ( rule__DForLoopExpression__Group_0_0__0 ) ) )
            // InternalDmx.g:6136:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            {
            // InternalDmx.g:6136:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            // InternalDmx.g:6137:2: ( rule__DForLoopExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0()); 
            }
            // InternalDmx.g:6138:2: ( rule__DForLoopExpression__Group_0_0__0 )
            // InternalDmx.g:6138:3: rule__DForLoopExpression__Group_0_0__0
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
    // InternalDmx.g:6147:1: rule__DForLoopExpression__Group_0_0__0 : rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 ;
    public final void rule__DForLoopExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6151:1: ( rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 )
            // InternalDmx.g:6152:2: rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1
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
    // InternalDmx.g:6159:1: rule__DForLoopExpression__Group_0_0__0__Impl : ( () ) ;
    public final void rule__DForLoopExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6163:1: ( ( () ) )
            // InternalDmx.g:6164:1: ( () )
            {
            // InternalDmx.g:6164:1: ( () )
            // InternalDmx.g:6165:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0()); 
            }
            // InternalDmx.g:6166:2: ()
            // InternalDmx.g:6166:3: 
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
    // InternalDmx.g:6174:1: rule__DForLoopExpression__Group_0_0__1 : rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 ;
    public final void rule__DForLoopExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6178:1: ( rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 )
            // InternalDmx.g:6179:2: rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2
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
    // InternalDmx.g:6186:1: rule__DForLoopExpression__Group_0_0__1__Impl : ( 'for' ) ;
    public final void rule__DForLoopExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6190:1: ( ( 'for' ) )
            // InternalDmx.g:6191:1: ( 'for' )
            {
            // InternalDmx.g:6191:1: ( 'for' )
            // InternalDmx.g:6192:2: 'for'
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
    // InternalDmx.g:6201:1: rule__DForLoopExpression__Group_0_0__2 : rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 ;
    public final void rule__DForLoopExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6205:1: ( rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 )
            // InternalDmx.g:6206:2: rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3
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
    // InternalDmx.g:6213:1: rule__DForLoopExpression__Group_0_0__2__Impl : ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) ;
    public final void rule__DForLoopExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6217:1: ( ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) )
            // InternalDmx.g:6218:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            {
            // InternalDmx.g:6218:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            // InternalDmx.g:6219:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2()); 
            }
            // InternalDmx.g:6220:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            // InternalDmx.g:6220:3: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2
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
    // InternalDmx.g:6228:1: rule__DForLoopExpression__Group_0_0__3 : rule__DForLoopExpression__Group_0_0__3__Impl ;
    public final void rule__DForLoopExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6232:1: ( rule__DForLoopExpression__Group_0_0__3__Impl )
            // InternalDmx.g:6233:2: rule__DForLoopExpression__Group_0_0__3__Impl
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
    // InternalDmx.g:6239:1: rule__DForLoopExpression__Group_0_0__3__Impl : ( ':' ) ;
    public final void rule__DForLoopExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6243:1: ( ( ':' ) )
            // InternalDmx.g:6244:1: ( ':' )
            {
            // InternalDmx.g:6244:1: ( ':' )
            // InternalDmx.g:6245:2: ':'
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
    // InternalDmx.g:6255:1: rule__DBooleanLiteral__Group__0 : rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 ;
    public final void rule__DBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6259:1: ( rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 )
            // InternalDmx.g:6260:2: rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalDmx.g:6267:1: rule__DBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6271:1: ( ( () ) )
            // InternalDmx.g:6272:1: ( () )
            {
            // InternalDmx.g:6272:1: ( () )
            // InternalDmx.g:6273:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0()); 
            }
            // InternalDmx.g:6274:2: ()
            // InternalDmx.g:6274:3: 
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
    // InternalDmx.g:6282:1: rule__DBooleanLiteral__Group__1 : rule__DBooleanLiteral__Group__1__Impl ;
    public final void rule__DBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6286:1: ( rule__DBooleanLiteral__Group__1__Impl )
            // InternalDmx.g:6287:2: rule__DBooleanLiteral__Group__1__Impl
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
    // InternalDmx.g:6293:1: rule__DBooleanLiteral__Group__1__Impl : ( ( rule__DBooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__DBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6297:1: ( ( ( rule__DBooleanLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6298:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6298:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            // InternalDmx.g:6299:2: ( rule__DBooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6300:2: ( rule__DBooleanLiteral__Alternatives_1 )
            // InternalDmx.g:6300:3: rule__DBooleanLiteral__Alternatives_1
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
    // InternalDmx.g:6309:1: rule__DStringLiteral__Group__0 : rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 ;
    public final void rule__DStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6313:1: ( rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 )
            // InternalDmx.g:6314:2: rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalDmx.g:6321:1: rule__DStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6325:1: ( ( () ) )
            // InternalDmx.g:6326:1: ( () )
            {
            // InternalDmx.g:6326:1: ( () )
            // InternalDmx.g:6327:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0()); 
            }
            // InternalDmx.g:6328:2: ()
            // InternalDmx.g:6328:3: 
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
    // InternalDmx.g:6336:1: rule__DStringLiteral__Group__1 : rule__DStringLiteral__Group__1__Impl ;
    public final void rule__DStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6340:1: ( rule__DStringLiteral__Group__1__Impl )
            // InternalDmx.g:6341:2: rule__DStringLiteral__Group__1__Impl
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
    // InternalDmx.g:6347:1: rule__DStringLiteral__Group__1__Impl : ( ( rule__DStringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6351:1: ( ( ( rule__DStringLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6352:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6352:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6353:2: ( rule__DStringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6354:2: ( rule__DStringLiteral__ValueAssignment_1 )
            // InternalDmx.g:6354:3: rule__DStringLiteral__ValueAssignment_1
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
    // InternalDmx.g:6363:1: rule__DNaturalLiteral__Group__0 : rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 ;
    public final void rule__DNaturalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6367:1: ( rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 )
            // InternalDmx.g:6368:2: rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1
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
    // InternalDmx.g:6375:1: rule__DNaturalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNaturalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6379:1: ( ( () ) )
            // InternalDmx.g:6380:1: ( () )
            {
            // InternalDmx.g:6380:1: ( () )
            // InternalDmx.g:6381:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0()); 
            }
            // InternalDmx.g:6382:2: ()
            // InternalDmx.g:6382:3: 
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
    // InternalDmx.g:6390:1: rule__DNaturalLiteral__Group__1 : rule__DNaturalLiteral__Group__1__Impl ;
    public final void rule__DNaturalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6394:1: ( rule__DNaturalLiteral__Group__1__Impl )
            // InternalDmx.g:6395:2: rule__DNaturalLiteral__Group__1__Impl
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
    // InternalDmx.g:6401:1: rule__DNaturalLiteral__Group__1__Impl : ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DNaturalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6405:1: ( ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6406:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6406:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6407:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6408:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6408:3: rule__DNaturalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6417:1: rule__DDecimalLiteral__Group__0 : rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 ;
    public final void rule__DDecimalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6421:1: ( rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 )
            // InternalDmx.g:6422:2: rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1
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
    // InternalDmx.g:6429:1: rule__DDecimalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DDecimalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6433:1: ( ( () ) )
            // InternalDmx.g:6434:1: ( () )
            {
            // InternalDmx.g:6434:1: ( () )
            // InternalDmx.g:6435:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0()); 
            }
            // InternalDmx.g:6436:2: ()
            // InternalDmx.g:6436:3: 
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
    // InternalDmx.g:6444:1: rule__DDecimalLiteral__Group__1 : rule__DDecimalLiteral__Group__1__Impl ;
    public final void rule__DDecimalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6448:1: ( rule__DDecimalLiteral__Group__1__Impl )
            // InternalDmx.g:6449:2: rule__DDecimalLiteral__Group__1__Impl
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
    // InternalDmx.g:6455:1: rule__DDecimalLiteral__Group__1__Impl : ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DDecimalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6459:1: ( ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6460:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6460:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6461:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6462:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6462:3: rule__DDecimalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6471:1: rule__DNilLiteral__Group__0 : rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 ;
    public final void rule__DNilLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6475:1: ( rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 )
            // InternalDmx.g:6476:2: rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalDmx.g:6483:1: rule__DNilLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNilLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6487:1: ( ( () ) )
            // InternalDmx.g:6488:1: ( () )
            {
            // InternalDmx.g:6488:1: ( () )
            // InternalDmx.g:6489:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0()); 
            }
            // InternalDmx.g:6490:2: ()
            // InternalDmx.g:6490:3: 
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
    // InternalDmx.g:6498:1: rule__DNilLiteral__Group__1 : rule__DNilLiteral__Group__1__Impl ;
    public final void rule__DNilLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6502:1: ( rule__DNilLiteral__Group__1__Impl )
            // InternalDmx.g:6503:2: rule__DNilLiteral__Group__1__Impl
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
    // InternalDmx.g:6509:1: rule__DNilLiteral__Group__1__Impl : ( ( rule__DNilLiteral__Alternatives_1 ) ) ;
    public final void rule__DNilLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6513:1: ( ( ( rule__DNilLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6514:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6514:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            // InternalDmx.g:6515:2: ( rule__DNilLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6516:2: ( rule__DNilLiteral__Alternatives_1 )
            // InternalDmx.g:6516:3: rule__DNilLiteral__Alternatives_1
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
    // InternalDmx.g:6525:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6529:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalDmx.g:6530:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
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
    // InternalDmx.g:6537:1: rule__DECIMAL__Group__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6541:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6542:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6542:1: ( RULE_NATURAL )
            // InternalDmx.g:6543:2: RULE_NATURAL
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
    // InternalDmx.g:6552:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6556:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalDmx.g:6557:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalDmx.g:6564:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6568:1: ( ( '.' ) )
            // InternalDmx.g:6569:1: ( '.' )
            {
            // InternalDmx.g:6569:1: ( '.' )
            // InternalDmx.g:6570:2: '.'
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
    // InternalDmx.g:6579:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6583:1: ( rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 )
            // InternalDmx.g:6584:2: rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalDmx.g:6591:1: rule__DECIMAL__Group__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6595:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6596:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6596:1: ( RULE_NATURAL )
            // InternalDmx.g:6597:2: RULE_NATURAL
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
    // InternalDmx.g:6606:1: rule__DECIMAL__Group__3 : rule__DECIMAL__Group__3__Impl ;
    public final void rule__DECIMAL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6610:1: ( rule__DECIMAL__Group__3__Impl )
            // InternalDmx.g:6611:2: rule__DECIMAL__Group__3__Impl
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
    // InternalDmx.g:6617:1: rule__DECIMAL__Group__3__Impl : ( ( rule__DECIMAL__Group_3__0 )? ) ;
    public final void rule__DECIMAL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6621:1: ( ( ( rule__DECIMAL__Group_3__0 )? ) )
            // InternalDmx.g:6622:1: ( ( rule__DECIMAL__Group_3__0 )? )
            {
            // InternalDmx.g:6622:1: ( ( rule__DECIMAL__Group_3__0 )? )
            // InternalDmx.g:6623:2: ( rule__DECIMAL__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup_3()); 
            }
            // InternalDmx.g:6624:2: ( rule__DECIMAL__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=34 && LA49_0<=35)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDmx.g:6624:3: rule__DECIMAL__Group_3__0
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
    // InternalDmx.g:6633:1: rule__DECIMAL__Group_3__0 : rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 ;
    public final void rule__DECIMAL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6637:1: ( rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 )
            // InternalDmx.g:6638:2: rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalDmx.g:6645:1: rule__DECIMAL__Group_3__0__Impl : ( ( rule__DECIMAL__Alternatives_3_0 ) ) ;
    public final void rule__DECIMAL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6649:1: ( ( ( rule__DECIMAL__Alternatives_3_0 ) ) )
            // InternalDmx.g:6650:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            {
            // InternalDmx.g:6650:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            // InternalDmx.g:6651:2: ( rule__DECIMAL__Alternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_0()); 
            }
            // InternalDmx.g:6652:2: ( rule__DECIMAL__Alternatives_3_0 )
            // InternalDmx.g:6652:3: rule__DECIMAL__Alternatives_3_0
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
    // InternalDmx.g:6660:1: rule__DECIMAL__Group_3__1 : rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 ;
    public final void rule__DECIMAL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6664:1: ( rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 )
            // InternalDmx.g:6665:2: rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalDmx.g:6672:1: rule__DECIMAL__Group_3__1__Impl : ( ( rule__DECIMAL__Alternatives_3_1 )? ) ;
    public final void rule__DECIMAL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6676:1: ( ( ( rule__DECIMAL__Alternatives_3_1 )? ) )
            // InternalDmx.g:6677:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            {
            // InternalDmx.g:6677:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            // InternalDmx.g:6678:2: ( rule__DECIMAL__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_1()); 
            }
            // InternalDmx.g:6679:2: ( rule__DECIMAL__Alternatives_3_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=36 && LA50_0<=37)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDmx.g:6679:3: rule__DECIMAL__Alternatives_3_1
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
    // InternalDmx.g:6687:1: rule__DECIMAL__Group_3__2 : rule__DECIMAL__Group_3__2__Impl ;
    public final void rule__DECIMAL__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6691:1: ( rule__DECIMAL__Group_3__2__Impl )
            // InternalDmx.g:6692:2: rule__DECIMAL__Group_3__2__Impl
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
    // InternalDmx.g:6698:1: rule__DECIMAL__Group_3__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6702:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6703:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6703:1: ( RULE_NATURAL )
            // InternalDmx.g:6704:2: RULE_NATURAL
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDmx.g:6714:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6718:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDmx.g:6719:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDmx.g:6726:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6730:1: ( ( RULE_ID ) )
            // InternalDmx.g:6731:1: ( RULE_ID )
            {
            // InternalDmx.g:6731:1: ( RULE_ID )
            // InternalDmx.g:6732:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDmx.g:6741:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6745:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDmx.g:6746:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDmx.g:6752:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6756:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDmx.g:6757:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDmx.g:6757:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDmx.g:6758:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalDmx.g:6759:2: ( rule__QualifiedName__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==66) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDmx.g:6759:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDmx.g:6768:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6772:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDmx.g:6773:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDmx.g:6780:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6784:1: ( ( '.' ) )
            // InternalDmx.g:6785:1: ( '.' )
            {
            // InternalDmx.g:6785:1: ( '.' )
            // InternalDmx.g:6786:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDmx.g:6795:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6799:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDmx.g:6800:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDmx.g:6806:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6810:1: ( ( RULE_ID ) )
            // InternalDmx.g:6811:1: ( RULE_ID )
            {
            // InternalDmx.g:6811:1: ( RULE_ID )
            // InternalDmx.g:6812:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DmxModel__TextsAssignment_1_3"
    // InternalDmx.g:6822:1: rule__DmxModel__TextsAssignment_1_3 : ( ruleDRichText ) ;
    public final void rule__DmxModel__TextsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6826:1: ( ( ruleDRichText ) )
            // InternalDmx.g:6827:2: ( ruleDRichText )
            {
            // InternalDmx.g:6827:2: ( ruleDRichText )
            // InternalDmx.g:6828:3: ruleDRichText
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
    // InternalDmx.g:6837:1: rule__DmxModel__ExpressionsAssignment_2_3 : ( ruleDExpression ) ;
    public final void rule__DmxModel__ExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6841:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6842:2: ( ruleDExpression )
            {
            // InternalDmx.g:6842:2: ( ruleDExpression )
            // InternalDmx.g:6843:3: ruleDExpression
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
    // InternalDmx.g:6852:1: rule__DRichText__ElementsAssignment_0 : ( ruleDTextOnly ) ;
    public final void rule__DRichText__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6856:1: ( ( ruleDTextOnly ) )
            // InternalDmx.g:6857:2: ( ruleDTextOnly )
            {
            // InternalDmx.g:6857:2: ( ruleDTextOnly )
            // InternalDmx.g:6858:3: ruleDTextOnly
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
    // InternalDmx.g:6867:1: rule__DRichText__ElementsAssignment_1_0 : ( ruleDTextStart ) ;
    public final void rule__DRichText__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6871:1: ( ( ruleDTextStart ) )
            // InternalDmx.g:6872:2: ( ruleDTextStart )
            {
            // InternalDmx.g:6872:2: ( ruleDTextStart )
            // InternalDmx.g:6873:3: ruleDTextStart
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
    // InternalDmx.g:6882:1: rule__DRichText__ElementsAssignment_1_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6886:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6887:2: ( ruleDExpression )
            {
            // InternalDmx.g:6887:2: ( ruleDExpression )
            // InternalDmx.g:6888:3: ruleDExpression
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
    // InternalDmx.g:6897:1: rule__DRichText__ElementsAssignment_1_2_0 : ( ruleDTextMiddle ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6901:1: ( ( ruleDTextMiddle ) )
            // InternalDmx.g:6902:2: ( ruleDTextMiddle )
            {
            // InternalDmx.g:6902:2: ( ruleDTextMiddle )
            // InternalDmx.g:6903:3: ruleDTextMiddle
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
    // InternalDmx.g:6912:1: rule__DRichText__ElementsAssignment_1_2_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6916:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6917:2: ( ruleDExpression )
            {
            // InternalDmx.g:6917:2: ( ruleDExpression )
            // InternalDmx.g:6918:3: ruleDExpression
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
    // InternalDmx.g:6927:1: rule__DRichText__ElementsAssignment_1_3 : ( ruleDTextEnd ) ;
    public final void rule__DRichText__ElementsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6931:1: ( ( ruleDTextEnd ) )
            // InternalDmx.g:6932:2: ( ruleDTextEnd )
            {
            // InternalDmx.g:6932:2: ( ruleDTextEnd )
            // InternalDmx.g:6933:3: ruleDTextEnd
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
    // InternalDmx.g:6942:1: rule__DTextOnly__ValueAssignment : ( RULE_PLAIN_TEXT_ONLY ) ;
    public final void rule__DTextOnly__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6946:1: ( ( RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:6947:2: ( RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:6947:2: ( RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:6948:3: RULE_PLAIN_TEXT_ONLY
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
    // InternalDmx.g:6957:1: rule__DTextStart__ValueAssignment : ( RULE_PLAIN_TEXT_START ) ;
    public final void rule__DTextStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6961:1: ( ( RULE_PLAIN_TEXT_START ) )
            // InternalDmx.g:6962:2: ( RULE_PLAIN_TEXT_START )
            {
            // InternalDmx.g:6962:2: ( RULE_PLAIN_TEXT_START )
            // InternalDmx.g:6963:3: RULE_PLAIN_TEXT_START
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
    // InternalDmx.g:6972:1: rule__DTextMiddle__ValueAssignment : ( RULE_PLAIN_TEXT_MIDDLE ) ;
    public final void rule__DTextMiddle__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6976:1: ( ( RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDmx.g:6977:2: ( RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDmx.g:6977:2: ( RULE_PLAIN_TEXT_MIDDLE )
            // InternalDmx.g:6978:3: RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDmx.g:6987:1: rule__DTextEnd__ValueAssignment : ( RULE_PLAIN_TEXT_END ) ;
    public final void rule__DTextEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6991:1: ( ( RULE_PLAIN_TEXT_END ) )
            // InternalDmx.g:6992:2: ( RULE_PLAIN_TEXT_END )
            {
            // InternalDmx.g:6992:2: ( RULE_PLAIN_TEXT_END )
            // InternalDmx.g:6993:3: RULE_PLAIN_TEXT_END
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
    // InternalDmx.g:7002:1: rule__DAssignment__MemberAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DAssignment__MemberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7006:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7007:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7007:2: ( ( RULE_ID ) )
            // InternalDmx.g:7008:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0()); 
            }
            // InternalDmx.g:7009:3: ( RULE_ID )
            // InternalDmx.g:7010:4: RULE_ID
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
    // InternalDmx.g:7021:1: rule__DAssignment__ValueAssignment_0_3 : ( ruleDAssignment ) ;
    public final void rule__DAssignment__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7025:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7026:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7026:2: ( ruleDAssignment )
            // InternalDmx.g:7027:3: ruleDAssignment
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
    // InternalDmx.g:7036:1: rule__DOrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__DOrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7040:1: ( ( ruleOpOr ) )
            // InternalDmx.g:7041:2: ( ruleOpOr )
            {
            // InternalDmx.g:7041:2: ( ruleOpOr )
            // InternalDmx.g:7042:3: ruleOpOr
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
    // InternalDmx.g:7051:1: rule__DOrExpression__RightOperandAssignment_1_1 : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7055:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:7056:2: ( ruleDAndExpression )
            {
            // InternalDmx.g:7056:2: ( ruleDAndExpression )
            // InternalDmx.g:7057:3: ruleDAndExpression
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
    // InternalDmx.g:7066:1: rule__DAndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__DAndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7070:1: ( ( ruleOpAnd ) )
            // InternalDmx.g:7071:2: ( ruleOpAnd )
            {
            // InternalDmx.g:7071:2: ( ruleOpAnd )
            // InternalDmx.g:7072:3: ruleOpAnd
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
    // InternalDmx.g:7081:1: rule__DAndExpression__RightOperandAssignment_1_1 : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7085:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:7086:2: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:7086:2: ( ruleDEqualityExpression )
            // InternalDmx.g:7087:3: ruleDEqualityExpression
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
    // InternalDmx.g:7096:1: rule__DEqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__DEqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7100:1: ( ( ruleOpEquality ) )
            // InternalDmx.g:7101:2: ( ruleOpEquality )
            {
            // InternalDmx.g:7101:2: ( ruleOpEquality )
            // InternalDmx.g:7102:3: ruleOpEquality
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
    // InternalDmx.g:7111:1: rule__DEqualityExpression__RightOperandAssignment_1_1 : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7115:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:7116:2: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:7116:2: ( ruleDRelationalExpression )
            // InternalDmx.g:7117:3: ruleDRelationalExpression
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
    // InternalDmx.g:7126:1: rule__DRelationalExpression__TypeAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DRelationalExpression__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7130:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7131:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7131:2: ( ( RULE_ID ) )
            // InternalDmx.g:7132:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0()); 
            }
            // InternalDmx.g:7133:3: ( RULE_ID )
            // InternalDmx.g:7134:4: RULE_ID
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
    // InternalDmx.g:7145:1: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7149:1: ( ( ruleOpCompare ) )
            // InternalDmx.g:7150:2: ( ruleOpCompare )
            {
            // InternalDmx.g:7150:2: ( ruleOpCompare )
            // InternalDmx.g:7151:3: ruleOpCompare
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
    // InternalDmx.g:7160:1: rule__DRelationalExpression__RightOperandAssignment_1_1_1 : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__RightOperandAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7164:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:7165:2: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:7165:2: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:7166:3: ruleDOtherOperatorExpression
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
    // InternalDmx.g:7175:1: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOther ) ;
    public final void rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7179:1: ( ( ruleOpOther ) )
            // InternalDmx.g:7180:2: ( ruleOpOther )
            {
            // InternalDmx.g:7180:2: ( ruleOpOther )
            // InternalDmx.g:7181:3: ruleOpOther
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
    // InternalDmx.g:7190:1: rule__DOtherOperatorExpression__RightOperandAssignment_1_1 : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7194:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:7195:2: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:7195:2: ( ruleDAdditiveExpression )
            // InternalDmx.g:7196:3: ruleDAdditiveExpression
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
    // InternalDmx.g:7205:1: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__DAdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7209:1: ( ( ruleOpAdd ) )
            // InternalDmx.g:7210:2: ( ruleOpAdd )
            {
            // InternalDmx.g:7210:2: ( ruleOpAdd )
            // InternalDmx.g:7211:3: ruleOpAdd
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
    // InternalDmx.g:7220:1: rule__DAdditiveExpression__RightOperandAssignment_1_1 : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7224:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:7225:2: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:7225:2: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:7226:3: ruleDMultiplicativeExpression
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
    // InternalDmx.g:7235:1: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7239:1: ( ( ruleOpMulti ) )
            // InternalDmx.g:7240:2: ( ruleOpMulti )
            {
            // InternalDmx.g:7240:2: ( ruleOpMulti )
            // InternalDmx.g:7241:3: ruleOpMulti
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
    // InternalDmx.g:7250:1: rule__DMultiplicativeExpression__RightOperandAssignment_1_1 : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7254:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7255:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7255:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7256:3: ruleDUnaryOperation
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
    // InternalDmx.g:7265:1: rule__DUnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__DUnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7269:1: ( ( ruleOpUnary ) )
            // InternalDmx.g:7270:2: ( ruleOpUnary )
            {
            // InternalDmx.g:7270:2: ( ruleOpUnary )
            // InternalDmx.g:7271:3: ruleOpUnary
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
    // InternalDmx.g:7280:1: rule__DUnaryOperation__OperandAssignment_0_2 : ( ruleDUnaryOperation ) ;
    public final void rule__DUnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7284:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7285:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7285:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7286:3: ruleDUnaryOperation
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
    // InternalDmx.g:7295:1: rule__DCastExpression__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCastExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7299:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7300:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7300:2: ( ( RULE_ID ) )
            // InternalDmx.g:7301:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0()); 
            }
            // InternalDmx.g:7302:3: ( RULE_ID )
            // InternalDmx.g:7303:4: RULE_ID
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
    // InternalDmx.g:7314:1: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7318:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7319:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7319:2: ( ( RULE_ID ) )
            // InternalDmx.g:7320:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0()); 
            }
            // InternalDmx.g:7321:3: ( RULE_ID )
            // InternalDmx.g:7322:4: RULE_ID
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
    // InternalDmx.g:7333:1: rule__DTypedMemberReference__ValueAssignment_1_0_1 : ( ruleDAssignment ) ;
    public final void rule__DTypedMemberReference__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7337:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7338:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7338:2: ( ruleDAssignment )
            // InternalDmx.g:7339:3: ruleDAssignment
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
    // InternalDmx.g:7348:1: rule__DTypedMemberReference__MemberAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7352:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7353:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7353:2: ( ( RULE_ID ) )
            // InternalDmx.g:7354:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0()); 
            }
            // InternalDmx.g:7355:3: ( RULE_ID )
            // InternalDmx.g:7356:4: RULE_ID
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


    // $ANTLR start "rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0"
    // InternalDmx.g:7367:1: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 : ( ( '(' ) ) ;
    public final void rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7371:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7372:2: ( ( '(' ) )
            {
            // InternalDmx.g:7372:2: ( ( '(' ) )
            // InternalDmx.g:7373:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0()); 
            }
            // InternalDmx.g:7374:3: ( '(' )
            // InternalDmx.g:7375:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0"


    // $ANTLR start "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0"
    // InternalDmx.g:7386:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7390:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7391:2: ( ruleDExpression )
            {
            // InternalDmx.g:7391:2: ( ruleDExpression )
            // InternalDmx.g:7392:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0"


    // $ANTLR start "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1"
    // InternalDmx.g:7401:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7405:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7406:2: ( ruleDExpression )
            {
            // InternalDmx.g:7406:2: ( ruleDExpression )
            // InternalDmx.g:7407:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1"


    // $ANTLR start "rule__DReturnExpression__ExpressionAssignment_2"
    // InternalDmx.g:7416:1: rule__DReturnExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DReturnExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7420:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7421:2: ( ruleDExpression )
            {
            // InternalDmx.g:7421:2: ( ruleDExpression )
            // InternalDmx.g:7422:3: ruleDExpression
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
    // InternalDmx.g:7431:1: rule__DRaiseExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DRaiseExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7435:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7436:2: ( ruleDExpression )
            {
            // InternalDmx.g:7436:2: ( ruleDExpression )
            // InternalDmx.g:7437:3: ruleDExpression
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
    // InternalDmx.g:7446:1: rule__DFunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DFunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7450:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7451:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7451:2: ( ( RULE_ID ) )
            // InternalDmx.g:7452:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0()); 
            }
            // InternalDmx.g:7453:3: ( RULE_ID )
            // InternalDmx.g:7454:4: RULE_ID
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
    // InternalDmx.g:7465:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7469:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7470:2: ( ruleDExpression )
            {
            // InternalDmx.g:7470:2: ( ruleDExpression )
            // InternalDmx.g:7471:3: ruleDExpression
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
    // InternalDmx.g:7480:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7484:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7485:2: ( ruleDExpression )
            {
            // InternalDmx.g:7485:2: ( ruleDExpression )
            // InternalDmx.g:7486:3: ruleDExpression
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
    // InternalDmx.g:7495:1: rule__DConstructorCall__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DConstructorCall__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7499:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7500:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7500:2: ( ( RULE_ID ) )
            // InternalDmx.g:7501:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0()); 
            }
            // InternalDmx.g:7502:3: ( RULE_ID )
            // InternalDmx.g:7503:4: RULE_ID
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
    // InternalDmx.g:7514:1: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 : ( ( '(' ) ) ;
    public final void rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7518:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7519:2: ( ( '(' ) )
            {
            // InternalDmx.g:7519:2: ( ( '(' ) )
            // InternalDmx.g:7520:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            // InternalDmx.g:7521:3: ( '(' )
            // InternalDmx.g:7522:4: '('
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
    // InternalDmx.g:7533:1: rule__DConstructorCall__ArgumentsAssignment_3_1_0 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7537:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7538:2: ( ruleDExpression )
            {
            // InternalDmx.g:7538:2: ( ruleDExpression )
            // InternalDmx.g:7539:3: ruleDExpression
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
    // InternalDmx.g:7548:1: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7552:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7553:2: ( ruleDExpression )
            {
            // InternalDmx.g:7553:2: ( ruleDExpression )
            // InternalDmx.g:7554:3: ruleDExpression
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


    // $ANTLR start "rule__DContextReference__ContextElementAssignment_1"
    // InternalDmx.g:7563:1: rule__DContextReference__ContextElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DContextReference__ContextElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7567:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7568:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7568:2: ( ( RULE_ID ) )
            // InternalDmx.g:7569:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementCrossReference_1_0()); 
            }
            // InternalDmx.g:7570:3: ( RULE_ID )
            // InternalDmx.g:7571:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DContextReference__ContextElementAssignment_1"


    // $ANTLR start "rule__DIfExpression__IfAssignment_2"
    // InternalDmx.g:7582:1: rule__DIfExpression__IfAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7586:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7587:2: ( ruleDExpression )
            {
            // InternalDmx.g:7587:2: ( ruleDExpression )
            // InternalDmx.g:7588:3: ruleDExpression
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
    // InternalDmx.g:7597:1: rule__DIfExpression__ThenAssignment_4 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7601:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7602:2: ( ruleDExpression )
            {
            // InternalDmx.g:7602:2: ( ruleDExpression )
            // InternalDmx.g:7603:3: ruleDExpression
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
    // InternalDmx.g:7612:1: rule__DIfExpression__ElseAssignment_5_1 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7616:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7617:2: ( ruleDExpression )
            {
            // InternalDmx.g:7617:2: ( ruleDExpression )
            // InternalDmx.g:7618:3: ruleDExpression
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
    // InternalDmx.g:7627:1: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__DForLoopExpression__DeclaredParamAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7631:1: ( ( RULE_ID ) )
            // InternalDmx.g:7632:2: ( RULE_ID )
            {
            // InternalDmx.g:7632:2: ( RULE_ID )
            // InternalDmx.g:7633:3: RULE_ID
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
    // InternalDmx.g:7642:1: rule__DForLoopExpression__ForExpressionAssignment_1 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__ForExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7646:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7647:2: ( ruleDExpression )
            {
            // InternalDmx.g:7647:2: ( ruleDExpression )
            // InternalDmx.g:7648:3: ruleDExpression
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
    // InternalDmx.g:7657:1: rule__DForLoopExpression__EachExpressionAssignment_3 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__EachExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7661:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7662:2: ( ruleDExpression )
            {
            // InternalDmx.g:7662:2: ( ruleDExpression )
            // InternalDmx.g:7663:3: ruleDExpression
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
    // InternalDmx.g:7672:1: rule__DBooleanLiteral__ValueAssignment_1_0 : ( ( 'TRUE' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7676:1: ( ( ( 'TRUE' ) ) )
            // InternalDmx.g:7677:2: ( ( 'TRUE' ) )
            {
            // InternalDmx.g:7677:2: ( ( 'TRUE' ) )
            // InternalDmx.g:7678:3: ( 'TRUE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            // InternalDmx.g:7679:3: ( 'TRUE' )
            // InternalDmx.g:7680:4: 'TRUE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7691:1: rule__DBooleanLiteral__ValueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7695:1: ( ( ( 'true' ) ) )
            // InternalDmx.g:7696:2: ( ( 'true' ) )
            {
            // InternalDmx.g:7696:2: ( ( 'true' ) )
            // InternalDmx.g:7697:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            // InternalDmx.g:7698:3: ( 'true' )
            // InternalDmx.g:7699:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7710:1: rule__DStringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DStringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7714:1: ( ( RULE_STRING ) )
            // InternalDmx.g:7715:2: ( RULE_STRING )
            {
            // InternalDmx.g:7715:2: ( RULE_STRING )
            // InternalDmx.g:7716:3: RULE_STRING
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
    // InternalDmx.g:7725:1: rule__DNaturalLiteral__ValueAssignment_1 : ( RULE_NATURAL ) ;
    public final void rule__DNaturalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7729:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:7730:2: ( RULE_NATURAL )
            {
            // InternalDmx.g:7730:2: ( RULE_NATURAL )
            // InternalDmx.g:7731:3: RULE_NATURAL
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
    // InternalDmx.g:7740:1: rule__DDecimalLiteral__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__DDecimalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7744:1: ( ( ruleDECIMAL ) )
            // InternalDmx.g:7745:2: ( ruleDECIMAL )
            {
            // InternalDmx.g:7745:2: ( ruleDECIMAL )
            // InternalDmx.g:7746:3: ruleDECIMAL
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

    // $ANTLR start synpred56_InternalDmx
    public final void synpred56_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2574:3: ( rule__DOrExpression__Group_1__0 )
        // InternalDmx.g:2574:3: rule__DOrExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOrExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalDmx

    // $ANTLR start synpred57_InternalDmx
    public final void synpred57_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2763:3: ( rule__DAndExpression__Group_1__0 )
        // InternalDmx.g:2763:3: rule__DAndExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAndExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalDmx

    // $ANTLR start synpred58_InternalDmx
    public final void synpred58_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2952:3: ( rule__DEqualityExpression__Group_1__0 )
        // InternalDmx.g:2952:3: rule__DEqualityExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DEqualityExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalDmx

    // $ANTLR start synpred59_InternalDmx
    public final void synpred59_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3141:3: ( rule__DRelationalExpression__Alternatives_1 )
        // InternalDmx.g:3141:3: rule__DRelationalExpression__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DRelationalExpression__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalDmx

    // $ANTLR start synpred60_InternalDmx
    public final void synpred60_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3465:3: ( rule__DOtherOperatorExpression__Group_1__0 )
        // InternalDmx.g:3465:3: rule__DOtherOperatorExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOtherOperatorExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalDmx

    // $ANTLR start synpred61_InternalDmx
    public final void synpred61_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3654:3: ( rule__DAdditiveExpression__Group_1__0 )
        // InternalDmx.g:3654:3: rule__DAdditiveExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAdditiveExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalDmx

    // $ANTLR start synpred62_InternalDmx
    public final void synpred62_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3843:3: ( rule__DMultiplicativeExpression__Group_1__0 )
        // InternalDmx.g:3843:3: rule__DMultiplicativeExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DMultiplicativeExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalDmx

    // $ANTLR start synpred63_InternalDmx
    public final void synpred63_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4113:3: ( rule__DCastExpression__Group_1__0 )
        // InternalDmx.g:4113:3: rule__DCastExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DCastExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalDmx

    // $ANTLR start synpred64_InternalDmx
    public final void synpred64_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4302:3: ( rule__DTypedMemberReference__Alternatives_1 )
        // InternalDmx.g:4302:3: rule__DTypedMemberReference__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DTypedMemberReference__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalDmx

    // $ANTLR start synpred68_InternalDmx
    public final void synpred68_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4977:3: ( rule__DReturnExpression__ExpressionAssignment_2 )
        // InternalDmx.g:4977:3: rule__DReturnExpression__ExpressionAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__DReturnExpression__ExpressionAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalDmx

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
    public final boolean synpred68_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalDmx_fragment(); // can never throw exception
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\13\5\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\115\5\uffff\1\112\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\6\4\uffff\1\1\12\uffff\2\2\2\3\2\4\2\7\1\uffff\4\1\43\uffff\1\5\1\10\4\uffff\1\11\2\1",
            "",
            "",
            "",
            "",
            "",
            "\2\13\7\uffff\4\13\10\uffff\1\13\6\uffff\27\13\5\uffff\1\13\1\uffff\3\13\1\12\1\uffff\4\13",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1353:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\10\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\112\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\5\1\0\1\2\1\6\1\7\1\1\1\3\1\4\1\uffff}>";
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3141:2: ( rule__DRelationalExpression__Alternatives_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\77\uffff";
    static final String dfa_16s = "\1\32\76\uffff";
    static final String dfa_17s = "\1\4\1\uffff\2\0\73\uffff";
    static final String dfa_18s = "\1\115\1\uffff\2\0\73\uffff";
    static final String dfa_19s = "\1\uffff\1\1\30\uffff\1\2\44\uffff";
    static final String dfa_20s = "\2\uffff\1\0\1\1\73\uffff}>";
    static final String[] dfa_21s = {
            "\2\1\2\uffff\2\32\1\1\6\uffff\4\32\10\1\1\32\4\1\2\uffff\1\2\1\3\25\32\3\1\2\uffff\1\32\1\uffff\3\32\2\1\4\32\3\1",
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "4977:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x38000033DFE00430L,0x0000000000003860L});
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
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x38000033DFE00430L,0x0000000000003868L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000C0000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000003C0000410L,0x0000000000003000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000003000000010L});

}