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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_ID", "RULE_STRING", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'FALSE'", "'false'", "'NIL'", "'nil'", "'E'", "'e'", "'+'", "'-'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'..'", "'->'", "'=>'", "'*'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'text'", "':'", "';'", "'expr'", "'.'", "')'", "','", "'('", "'if'", "'then'", "'end'", "'else'", "'do'", "'for'", "'TRUE'", "'true'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=5;
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
    public static final int RULE_PLAIN_TEXT_END=8;
    public static final int RULE_ID=9;
    public static final int RULE_PLAIN_TEXT_START=6;
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
    public static final int RULE_PLAIN_TEXT_MIDDLE=7;
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


    // $ANTLR start "entryRuleDBooleanLiteral"
    // InternalDmx.g:879:1: entryRuleDBooleanLiteral : ruleDBooleanLiteral EOF ;
    public final void entryRuleDBooleanLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:880:1: ( ruleDBooleanLiteral EOF )
            // InternalDmx.g:881:1: ruleDBooleanLiteral EOF
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
    // InternalDmx.g:888:1: ruleDBooleanLiteral : ( ( rule__DBooleanLiteral__Group__0 ) ) ;
    public final void ruleDBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:892:2: ( ( ( rule__DBooleanLiteral__Group__0 ) ) )
            // InternalDmx.g:893:2: ( ( rule__DBooleanLiteral__Group__0 ) )
            {
            // InternalDmx.g:893:2: ( ( rule__DBooleanLiteral__Group__0 ) )
            // InternalDmx.g:894:3: ( rule__DBooleanLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:895:3: ( rule__DBooleanLiteral__Group__0 )
            // InternalDmx.g:895:4: rule__DBooleanLiteral__Group__0
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
    // InternalDmx.g:904:1: entryRuleDStringLiteral : ruleDStringLiteral EOF ;
    public final void entryRuleDStringLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:905:1: ( ruleDStringLiteral EOF )
            // InternalDmx.g:906:1: ruleDStringLiteral EOF
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
    // InternalDmx.g:913:1: ruleDStringLiteral : ( ( rule__DStringLiteral__Group__0 ) ) ;
    public final void ruleDStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:917:2: ( ( ( rule__DStringLiteral__Group__0 ) ) )
            // InternalDmx.g:918:2: ( ( rule__DStringLiteral__Group__0 ) )
            {
            // InternalDmx.g:918:2: ( ( rule__DStringLiteral__Group__0 ) )
            // InternalDmx.g:919:3: ( rule__DStringLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:920:3: ( rule__DStringLiteral__Group__0 )
            // InternalDmx.g:920:4: rule__DStringLiteral__Group__0
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
    // InternalDmx.g:929:1: entryRuleDNaturalLiteral : ruleDNaturalLiteral EOF ;
    public final void entryRuleDNaturalLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:930:1: ( ruleDNaturalLiteral EOF )
            // InternalDmx.g:931:1: ruleDNaturalLiteral EOF
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
    // InternalDmx.g:938:1: ruleDNaturalLiteral : ( ( rule__DNaturalLiteral__Group__0 ) ) ;
    public final void ruleDNaturalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:942:2: ( ( ( rule__DNaturalLiteral__Group__0 ) ) )
            // InternalDmx.g:943:2: ( ( rule__DNaturalLiteral__Group__0 ) )
            {
            // InternalDmx.g:943:2: ( ( rule__DNaturalLiteral__Group__0 ) )
            // InternalDmx.g:944:3: ( rule__DNaturalLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:945:3: ( rule__DNaturalLiteral__Group__0 )
            // InternalDmx.g:945:4: rule__DNaturalLiteral__Group__0
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
    // InternalDmx.g:954:1: entryRuleDDecimalLiteral : ruleDDecimalLiteral EOF ;
    public final void entryRuleDDecimalLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:955:1: ( ruleDDecimalLiteral EOF )
            // InternalDmx.g:956:1: ruleDDecimalLiteral EOF
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
    // InternalDmx.g:963:1: ruleDDecimalLiteral : ( ( rule__DDecimalLiteral__Group__0 ) ) ;
    public final void ruleDDecimalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:967:2: ( ( ( rule__DDecimalLiteral__Group__0 ) ) )
            // InternalDmx.g:968:2: ( ( rule__DDecimalLiteral__Group__0 ) )
            {
            // InternalDmx.g:968:2: ( ( rule__DDecimalLiteral__Group__0 ) )
            // InternalDmx.g:969:3: ( rule__DDecimalLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:970:3: ( rule__DDecimalLiteral__Group__0 )
            // InternalDmx.g:970:4: rule__DDecimalLiteral__Group__0
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
    // InternalDmx.g:979:1: entryRuleDNilLiteral : ruleDNilLiteral EOF ;
    public final void entryRuleDNilLiteral() throws RecognitionException {
        try {
            // InternalDmx.g:980:1: ( ruleDNilLiteral EOF )
            // InternalDmx.g:981:1: ruleDNilLiteral EOF
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
    // InternalDmx.g:988:1: ruleDNilLiteral : ( ( rule__DNilLiteral__Group__0 ) ) ;
    public final void ruleDNilLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:992:2: ( ( ( rule__DNilLiteral__Group__0 ) ) )
            // InternalDmx.g:993:2: ( ( rule__DNilLiteral__Group__0 ) )
            {
            // InternalDmx.g:993:2: ( ( rule__DNilLiteral__Group__0 ) )
            // InternalDmx.g:994:3: ( rule__DNilLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getGroup()); 
            }
            // InternalDmx.g:995:3: ( rule__DNilLiteral__Group__0 )
            // InternalDmx.g:995:4: rule__DNilLiteral__Group__0
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
    // InternalDmx.g:1004:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalDmx.g:1005:1: ( ruleDECIMAL EOF )
            // InternalDmx.g:1006:1: ruleDECIMAL EOF
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
    // InternalDmx.g:1013:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1017:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalDmx.g:1018:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalDmx.g:1018:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalDmx.g:1019:3: ( rule__DECIMAL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup()); 
            }
            // InternalDmx.g:1020:3: ( rule__DECIMAL__Group__0 )
            // InternalDmx.g:1020:4: rule__DECIMAL__Group__0
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


    // $ANTLR start "ruleOpOr"
    // InternalDmx.g:1029:1: ruleOpOr : ( ( rule__OpOr__Alternatives ) ) ;
    public final void ruleOpOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1033:1: ( ( ( rule__OpOr__Alternatives ) ) )
            // InternalDmx.g:1034:2: ( ( rule__OpOr__Alternatives ) )
            {
            // InternalDmx.g:1034:2: ( ( rule__OpOr__Alternatives ) )
            // InternalDmx.g:1035:3: ( rule__OpOr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOrAccess().getAlternatives()); 
            }
            // InternalDmx.g:1036:3: ( rule__OpOr__Alternatives )
            // InternalDmx.g:1036:4: rule__OpOr__Alternatives
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
    // InternalDmx.g:1045:1: ruleOpAnd : ( ( rule__OpAnd__Alternatives ) ) ;
    public final void ruleOpAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1049:1: ( ( ( rule__OpAnd__Alternatives ) ) )
            // InternalDmx.g:1050:2: ( ( rule__OpAnd__Alternatives ) )
            {
            // InternalDmx.g:1050:2: ( ( rule__OpAnd__Alternatives ) )
            // InternalDmx.g:1051:3: ( rule__OpAnd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAndAccess().getAlternatives()); 
            }
            // InternalDmx.g:1052:3: ( rule__OpAnd__Alternatives )
            // InternalDmx.g:1052:4: rule__OpAnd__Alternatives
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
    // InternalDmx.g:1061:1: ruleOpEquality : ( ( rule__OpEquality__Alternatives ) ) ;
    public final void ruleOpEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1065:1: ( ( ( rule__OpEquality__Alternatives ) ) )
            // InternalDmx.g:1066:2: ( ( rule__OpEquality__Alternatives ) )
            {
            // InternalDmx.g:1066:2: ( ( rule__OpEquality__Alternatives ) )
            // InternalDmx.g:1067:3: ( rule__OpEquality__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpEqualityAccess().getAlternatives()); 
            }
            // InternalDmx.g:1068:3: ( rule__OpEquality__Alternatives )
            // InternalDmx.g:1068:4: rule__OpEquality__Alternatives
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
    // InternalDmx.g:1077:1: ruleOpCompare : ( ( rule__OpCompare__Alternatives ) ) ;
    public final void ruleOpCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1081:1: ( ( ( rule__OpCompare__Alternatives ) ) )
            // InternalDmx.g:1082:2: ( ( rule__OpCompare__Alternatives ) )
            {
            // InternalDmx.g:1082:2: ( ( rule__OpCompare__Alternatives ) )
            // InternalDmx.g:1083:3: ( rule__OpCompare__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpCompareAccess().getAlternatives()); 
            }
            // InternalDmx.g:1084:3: ( rule__OpCompare__Alternatives )
            // InternalDmx.g:1084:4: rule__OpCompare__Alternatives
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
    // InternalDmx.g:1093:1: ruleOpOther : ( ( rule__OpOther__Alternatives ) ) ;
    public final void ruleOpOther() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1097:1: ( ( ( rule__OpOther__Alternatives ) ) )
            // InternalDmx.g:1098:2: ( ( rule__OpOther__Alternatives ) )
            {
            // InternalDmx.g:1098:2: ( ( rule__OpOther__Alternatives ) )
            // InternalDmx.g:1099:3: ( rule__OpOther__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpOtherAccess().getAlternatives()); 
            }
            // InternalDmx.g:1100:3: ( rule__OpOther__Alternatives )
            // InternalDmx.g:1100:4: rule__OpOther__Alternatives
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
    // InternalDmx.g:1109:1: ruleOpAdd : ( ( rule__OpAdd__Alternatives ) ) ;
    public final void ruleOpAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1113:1: ( ( ( rule__OpAdd__Alternatives ) ) )
            // InternalDmx.g:1114:2: ( ( rule__OpAdd__Alternatives ) )
            {
            // InternalDmx.g:1114:2: ( ( rule__OpAdd__Alternatives ) )
            // InternalDmx.g:1115:3: ( rule__OpAdd__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpAddAccess().getAlternatives()); 
            }
            // InternalDmx.g:1116:3: ( rule__OpAdd__Alternatives )
            // InternalDmx.g:1116:4: rule__OpAdd__Alternatives
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
    // InternalDmx.g:1125:1: ruleOpMulti : ( ( rule__OpMulti__Alternatives ) ) ;
    public final void ruleOpMulti() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1129:1: ( ( ( rule__OpMulti__Alternatives ) ) )
            // InternalDmx.g:1130:2: ( ( rule__OpMulti__Alternatives ) )
            {
            // InternalDmx.g:1130:2: ( ( rule__OpMulti__Alternatives ) )
            // InternalDmx.g:1131:3: ( rule__OpMulti__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpMultiAccess().getAlternatives()); 
            }
            // InternalDmx.g:1132:3: ( rule__OpMulti__Alternatives )
            // InternalDmx.g:1132:4: rule__OpMulti__Alternatives
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
    // InternalDmx.g:1141:1: ruleOpUnary : ( ( rule__OpUnary__Alternatives ) ) ;
    public final void ruleOpUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1145:1: ( ( ( rule__OpUnary__Alternatives ) ) )
            // InternalDmx.g:1146:2: ( ( rule__OpUnary__Alternatives ) )
            {
            // InternalDmx.g:1146:2: ( ( rule__OpUnary__Alternatives ) )
            // InternalDmx.g:1147:3: ( rule__OpUnary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOpUnaryAccess().getAlternatives()); 
            }
            // InternalDmx.g:1148:3: ( rule__OpUnary__Alternatives )
            // InternalDmx.g:1148:4: rule__OpUnary__Alternatives
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
    // InternalDmx.g:1156:1: rule__DRichText__Alternatives : ( ( ( rule__DRichText__ElementsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) );
    public final void rule__DRichText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1160:1: ( ( ( rule__DRichText__ElementsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) )
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
                    // InternalDmx.g:1161:2: ( ( rule__DRichText__ElementsAssignment_0 ) )
                    {
                    // InternalDmx.g:1161:2: ( ( rule__DRichText__ElementsAssignment_0 ) )
                    // InternalDmx.g:1162:3: ( rule__DRichText__ElementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getElementsAssignment_0()); 
                    }
                    // InternalDmx.g:1163:3: ( rule__DRichText__ElementsAssignment_0 )
                    // InternalDmx.g:1163:4: rule__DRichText__ElementsAssignment_0
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
                    // InternalDmx.g:1167:2: ( ( rule__DRichText__Group_1__0 ) )
                    {
                    // InternalDmx.g:1167:2: ( ( rule__DRichText__Group_1__0 ) )
                    // InternalDmx.g:1168:3: ( rule__DRichText__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getGroup_1()); 
                    }
                    // InternalDmx.g:1169:3: ( rule__DRichText__Group_1__0 )
                    // InternalDmx.g:1169:4: rule__DRichText__Group_1__0
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
    // InternalDmx.g:1177:1: rule__DAssignment__Alternatives : ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) );
    public final void rule__DAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1181:1: ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_PLAIN_TEXT_MIDDLE && LA2_1<=RULE_PLAIN_TEXT_END)||(LA2_1>=17 && LA2_1<=20)||(LA2_1>=35 && LA2_1<=58)||LA2_1==64||(LA2_1>=66 && LA2_1<=69)||(LA2_1>=71 && LA2_1<=74)) ) {
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
            else if ( (LA2_0==RULE_NATURAL||LA2_0==RULE_STRING||(LA2_0>=21 && LA2_0<=32)||(LA2_0>=35 && LA2_0<=36)||(LA2_0>=59 && LA2_0<=61)||(LA2_0>=69 && LA2_0<=70)||(LA2_0>=75 && LA2_0<=77)) ) {
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
                    // InternalDmx.g:1182:2: ( ( rule__DAssignment__Group_0__0 ) )
                    {
                    // InternalDmx.g:1182:2: ( ( rule__DAssignment__Group_0__0 ) )
                    // InternalDmx.g:1183:3: ( rule__DAssignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDAssignmentAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1184:3: ( rule__DAssignment__Group_0__0 )
                    // InternalDmx.g:1184:4: rule__DAssignment__Group_0__0
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
                    // InternalDmx.g:1188:2: ( ruleDOrExpression )
                    {
                    // InternalDmx.g:1188:2: ( ruleDOrExpression )
                    // InternalDmx.g:1189:3: ruleDOrExpression
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
    // InternalDmx.g:1198:1: rule__DRelationalExpression__Alternatives_1 : ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) );
    public final void rule__DRelationalExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1202:1: ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=46 && LA3_0<=51)) ) {
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
                    // InternalDmx.g:1203:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1203:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    // InternalDmx.g:1204:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1205:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    // InternalDmx.g:1205:4: rule__DRelationalExpression__Group_1_0__0
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
                    // InternalDmx.g:1209:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1209:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    // InternalDmx.g:1210:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1211:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    // InternalDmx.g:1211:4: rule__DRelationalExpression__Group_1_1__0
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
    // InternalDmx.g:1219:1: rule__OpInstanceOf__Alternatives : ( ( 'ISA' ) | ( 'isa' ) );
    public final void rule__OpInstanceOf__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1223:1: ( ( 'ISA' ) | ( 'isa' ) )
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
                    // InternalDmx.g:1224:2: ( 'ISA' )
                    {
                    // InternalDmx.g:1224:2: ( 'ISA' )
                    // InternalDmx.g:1225:3: 'ISA'
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
                    // InternalDmx.g:1230:2: ( 'isa' )
                    {
                    // InternalDmx.g:1230:2: ( 'isa' )
                    // InternalDmx.g:1231:3: 'isa'
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
    // InternalDmx.g:1240:1: rule__DUnaryOperation__Alternatives : ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) );
    public final void rule__DUnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1244:1: ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=35 && LA5_0<=36)||(LA5_0>=59 && LA5_0<=61)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NATURAL||(LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=21 && LA5_0<=32)||(LA5_0>=69 && LA5_0<=70)||(LA5_0>=75 && LA5_0<=77)) ) {
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
                    // InternalDmx.g:1245:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    {
                    // InternalDmx.g:1245:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    // InternalDmx.g:1246:3: ( rule__DUnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1247:3: ( rule__DUnaryOperation__Group_0__0 )
                    // InternalDmx.g:1247:4: rule__DUnaryOperation__Group_0__0
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
                    // InternalDmx.g:1251:2: ( ruleDCastExpression )
                    {
                    // InternalDmx.g:1251:2: ( ruleDCastExpression )
                    // InternalDmx.g:1252:3: ruleDCastExpression
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
    // InternalDmx.g:1261:1: rule__OpCast__Alternatives : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__OpCast__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1265:1: ( ( 'AS' ) | ( 'as' ) )
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
                    // InternalDmx.g:1266:2: ( 'AS' )
                    {
                    // InternalDmx.g:1266:2: ( 'AS' )
                    // InternalDmx.g:1267:3: 'AS'
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
                    // InternalDmx.g:1272:2: ( 'as' )
                    {
                    // InternalDmx.g:1272:2: ( 'as' )
                    // InternalDmx.g:1273:3: 'as'
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
    // InternalDmx.g:1282:1: rule__DTypedMemberReference__Alternatives_1 : ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) );
    public final void rule__DTypedMemberReference__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1286:1: ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==66) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||(LA7_2>=RULE_PLAIN_TEXT_MIDDLE && LA7_2<=RULE_PLAIN_TEXT_END)||(LA7_2>=17 && LA7_2<=20)||(LA7_2>=35 && LA7_2<=58)||LA7_2==64||(LA7_2>=66 && LA7_2<=69)||(LA7_2>=71 && LA7_2<=74)) ) {
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
                    // InternalDmx.g:1287:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1287:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    // InternalDmx.g:1288:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1289:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    // InternalDmx.g:1289:4: rule__DTypedMemberReference__Group_1_0__0
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
                    // InternalDmx.g:1293:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1293:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    // InternalDmx.g:1294:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1295:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    // InternalDmx.g:1295:4: rule__DTypedMemberReference__Group_1_1__0
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
    // InternalDmx.g:1303:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );
    public final void rule__DPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1307:1: ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalDmx.g:1308:2: ( ruleDLiteralExpression )
                    {
                    // InternalDmx.g:1308:2: ( ruleDLiteralExpression )
                    // InternalDmx.g:1309:3: ruleDLiteralExpression
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
                    // InternalDmx.g:1314:2: ( ruleDSelfExpression )
                    {
                    // InternalDmx.g:1314:2: ( ruleDSelfExpression )
                    // InternalDmx.g:1315:3: ruleDSelfExpression
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
                    // InternalDmx.g:1320:2: ( ruleDReturnExpression )
                    {
                    // InternalDmx.g:1320:2: ( ruleDReturnExpression )
                    // InternalDmx.g:1321:3: ruleDReturnExpression
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
                    // InternalDmx.g:1326:2: ( ruleDRaiseExpression )
                    {
                    // InternalDmx.g:1326:2: ( ruleDRaiseExpression )
                    // InternalDmx.g:1327:3: ruleDRaiseExpression
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
                    // InternalDmx.g:1332:2: ( ruleDParenthesizedExpression )
                    {
                    // InternalDmx.g:1332:2: ( ruleDParenthesizedExpression )
                    // InternalDmx.g:1333:3: ruleDParenthesizedExpression
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
                    // InternalDmx.g:1338:2: ( ruleDFunctionCall )
                    {
                    // InternalDmx.g:1338:2: ( ruleDFunctionCall )
                    // InternalDmx.g:1339:3: ruleDFunctionCall
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
                    // InternalDmx.g:1344:2: ( ruleDConstructorCall )
                    {
                    // InternalDmx.g:1344:2: ( ruleDConstructorCall )
                    // InternalDmx.g:1345:3: ruleDConstructorCall
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
                    // InternalDmx.g:1350:2: ( ruleDContextReference )
                    {
                    // InternalDmx.g:1350:2: ( ruleDContextReference )
                    // InternalDmx.g:1351:3: ruleDContextReference
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
                    // InternalDmx.g:1356:2: ( ruleDIfExpression )
                    {
                    // InternalDmx.g:1356:2: ( ruleDIfExpression )
                    // InternalDmx.g:1357:3: ruleDIfExpression
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
                    // InternalDmx.g:1362:2: ( ( ruleDForLoopExpression ) )
                    {
                    // InternalDmx.g:1362:2: ( ( ruleDForLoopExpression ) )
                    // InternalDmx.g:1363:3: ( ruleDForLoopExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9()); 
                    }
                    // InternalDmx.g:1364:3: ( ruleDForLoopExpression )
                    // InternalDmx.g:1364:4: ruleDForLoopExpression
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
    // InternalDmx.g:1372:1: rule__DLiteralExpression__Alternatives : ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) );
    public final void rule__DLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1376:1: ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
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

                if ( (LA9_3==EOF||(LA9_3>=RULE_PLAIN_TEXT_MIDDLE && LA9_3<=RULE_PLAIN_TEXT_END)||(LA9_3>=17 && LA9_3<=20)||(LA9_3>=35 && LA9_3<=58)||LA9_3==64||(LA9_3>=67 && LA9_3<=68)||(LA9_3>=71 && LA9_3<=74)) ) {
                    alt9=3;
                }
                else if ( (LA9_3==66) ) {
                    int LA9_6 = input.LA(3);

                    if ( (LA9_6==RULE_NATURAL) ) {
                        alt9=4;
                    }
                    else if ( (LA9_6==RULE_ID) ) {
                        alt9=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
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
                    // InternalDmx.g:1377:2: ( ruleDBooleanLiteral )
                    {
                    // InternalDmx.g:1377:2: ( ruleDBooleanLiteral )
                    // InternalDmx.g:1378:3: ruleDBooleanLiteral
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
                    // InternalDmx.g:1383:2: ( ruleDStringLiteral )
                    {
                    // InternalDmx.g:1383:2: ( ruleDStringLiteral )
                    // InternalDmx.g:1384:3: ruleDStringLiteral
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
                    // InternalDmx.g:1389:2: ( ruleDNaturalLiteral )
                    {
                    // InternalDmx.g:1389:2: ( ruleDNaturalLiteral )
                    // InternalDmx.g:1390:3: ruleDNaturalLiteral
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
                    // InternalDmx.g:1395:2: ( ruleDDecimalLiteral )
                    {
                    // InternalDmx.g:1395:2: ( ruleDDecimalLiteral )
                    // InternalDmx.g:1396:3: ruleDDecimalLiteral
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
                    // InternalDmx.g:1401:2: ( ruleDNilLiteral )
                    {
                    // InternalDmx.g:1401:2: ( ruleDNilLiteral )
                    // InternalDmx.g:1402:3: ruleDNilLiteral
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
    // InternalDmx.g:1411:1: rule__DSelfExpression__Alternatives_1 : ( ( 'SELF' ) | ( 'self' ) );
    public final void rule__DSelfExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1415:1: ( ( 'SELF' ) | ( 'self' ) )
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
                    // InternalDmx.g:1416:2: ( 'SELF' )
                    {
                    // InternalDmx.g:1416:2: ( 'SELF' )
                    // InternalDmx.g:1417:3: 'SELF'
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
                    // InternalDmx.g:1422:2: ( 'self' )
                    {
                    // InternalDmx.g:1422:2: ( 'self' )
                    // InternalDmx.g:1423:3: 'self'
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
    // InternalDmx.g:1432:1: rule__DReturnExpression__Alternatives_1 : ( ( 'RETURN' ) | ( 'return' ) );
    public final void rule__DReturnExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1436:1: ( ( 'RETURN' ) | ( 'return' ) )
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
                    // InternalDmx.g:1437:2: ( 'RETURN' )
                    {
                    // InternalDmx.g:1437:2: ( 'RETURN' )
                    // InternalDmx.g:1438:3: 'RETURN'
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
                    // InternalDmx.g:1443:2: ( 'return' )
                    {
                    // InternalDmx.g:1443:2: ( 'return' )
                    // InternalDmx.g:1444:3: 'return'
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
    // InternalDmx.g:1453:1: rule__DRaiseExpression__Alternatives_1 : ( ( 'RAISE' ) | ( 'raise' ) );
    public final void rule__DRaiseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1457:1: ( ( 'RAISE' ) | ( 'raise' ) )
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
                    // InternalDmx.g:1458:2: ( 'RAISE' )
                    {
                    // InternalDmx.g:1458:2: ( 'RAISE' )
                    // InternalDmx.g:1459:3: 'RAISE'
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
                    // InternalDmx.g:1464:2: ( 'raise' )
                    {
                    // InternalDmx.g:1464:2: ( 'raise' )
                    // InternalDmx.g:1465:3: 'raise'
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
    // InternalDmx.g:1474:1: rule__OpConstructor__Alternatives : ( ( 'NEW' ) | ( 'new' ) );
    public final void rule__OpConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1478:1: ( ( 'NEW' ) | ( 'new' ) )
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
                    // InternalDmx.g:1479:2: ( 'NEW' )
                    {
                    // InternalDmx.g:1479:2: ( 'NEW' )
                    // InternalDmx.g:1480:3: 'NEW'
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
                    // InternalDmx.g:1485:2: ( 'new' )
                    {
                    // InternalDmx.g:1485:2: ( 'new' )
                    // InternalDmx.g:1486:3: 'new'
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


    // $ANTLR start "rule__DBooleanLiteral__Alternatives_1"
    // InternalDmx.g:1495:1: rule__DBooleanLiteral__Alternatives_1 : ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) );
    public final void rule__DBooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1499:1: ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt14=1;
                }
                break;
            case 77:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDmx.g:1500:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    {
                    // InternalDmx.g:1500:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    // InternalDmx.g:1501:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0()); 
                    }
                    // InternalDmx.g:1502:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    // InternalDmx.g:1502:4: rule__DBooleanLiteral__ValueAssignment_1_0
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
                    // InternalDmx.g:1506:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    {
                    // InternalDmx.g:1506:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    // InternalDmx.g:1507:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1()); 
                    }
                    // InternalDmx.g:1508:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    // InternalDmx.g:1508:4: rule__DBooleanLiteral__ValueAssignment_1_1
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
                    // InternalDmx.g:1512:2: ( 'FALSE' )
                    {
                    // InternalDmx.g:1512:2: ( 'FALSE' )
                    // InternalDmx.g:1513:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1518:2: ( 'false' )
                    {
                    // InternalDmx.g:1518:2: ( 'false' )
                    // InternalDmx.g:1519:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1528:1: rule__DNilLiteral__Alternatives_1 : ( ( 'NIL' ) | ( 'nil' ) );
    public final void rule__DNilLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1532:1: ( ( 'NIL' ) | ( 'nil' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
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
                    // InternalDmx.g:1533:2: ( 'NIL' )
                    {
                    // InternalDmx.g:1533:2: ( 'NIL' )
                    // InternalDmx.g:1534:3: 'NIL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1539:2: ( 'nil' )
                    {
                    // InternalDmx.g:1539:2: ( 'nil' )
                    // InternalDmx.g:1540:3: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getNilKeyword_1_1()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1549:1: rule__DECIMAL__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__DECIMAL__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1553:1: ( ( 'E' ) | ( 'e' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
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
                    // InternalDmx.g:1554:2: ( 'E' )
                    {
                    // InternalDmx.g:1554:2: ( 'E' )
                    // InternalDmx.g:1555:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1560:2: ( 'e' )
                    {
                    // InternalDmx.g:1560:2: ( 'e' )
                    // InternalDmx.g:1561:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1570:1: rule__DECIMAL__Alternatives_3_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__DECIMAL__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1574:1: ( ( '+' ) | ( '-' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
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
                    // InternalDmx.g:1575:2: ( '+' )
                    {
                    // InternalDmx.g:1575:2: ( '+' )
                    // InternalDmx.g:1576:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1581:2: ( '-' )
                    {
                    // InternalDmx.g:1581:2: ( '-' )
                    // InternalDmx.g:1582:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_3_1_1()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1591:1: rule__OpOr__Alternatives : ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1595:1: ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDmx.g:1596:2: ( ( 'OR' ) )
                    {
                    // InternalDmx.g:1596:2: ( ( 'OR' ) )
                    // InternalDmx.g:1597:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1598:3: ( 'OR' )
                    // InternalDmx.g:1598:4: 'OR'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1602:2: ( ( 'or' ) )
                    {
                    // InternalDmx.g:1602:2: ( ( 'or' ) )
                    // InternalDmx.g:1603:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1604:3: ( 'or' )
                    // InternalDmx.g:1604:4: 'or'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1608:2: ( ( 'XOR' ) )
                    {
                    // InternalDmx.g:1608:2: ( ( 'XOR' ) )
                    // InternalDmx.g:1609:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1610:3: ( 'XOR' )
                    // InternalDmx.g:1610:4: 'XOR'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1614:2: ( ( 'xor' ) )
                    {
                    // InternalDmx.g:1614:2: ( ( 'xor' ) )
                    // InternalDmx.g:1615:3: ( 'xor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1616:3: ( 'xor' )
                    // InternalDmx.g:1616:4: 'xor'
                    {
                    match(input,40,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1624:1: rule__OpAnd__Alternatives : ( ( ( 'AND' ) ) | ( ( 'and' ) ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1628:1: ( ( ( 'AND' ) ) | ( ( 'and' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            else if ( (LA19_0==42) ) {
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
                    // InternalDmx.g:1629:2: ( ( 'AND' ) )
                    {
                    // InternalDmx.g:1629:2: ( ( 'AND' ) )
                    // InternalDmx.g:1630:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1631:3: ( 'AND' )
                    // InternalDmx.g:1631:4: 'AND'
                    {
                    match(input,41,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1635:2: ( ( 'and' ) )
                    {
                    // InternalDmx.g:1635:2: ( ( 'and' ) )
                    // InternalDmx.g:1636:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1637:3: ( 'and' )
                    // InternalDmx.g:1637:4: 'and'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1645:1: rule__OpEquality__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1649:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case 45:
                {
                alt20=3;
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
                    // InternalDmx.g:1650:2: ( ( '=' ) )
                    {
                    // InternalDmx.g:1650:2: ( ( '=' ) )
                    // InternalDmx.g:1651:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1652:3: ( '=' )
                    // InternalDmx.g:1652:4: '='
                    {
                    match(input,43,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1656:2: ( ( '!=' ) )
                    {
                    // InternalDmx.g:1656:2: ( ( '!=' ) )
                    // InternalDmx.g:1657:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1658:3: ( '!=' )
                    // InternalDmx.g:1658:4: '!='
                    {
                    match(input,44,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1662:2: ( ( '<>' ) )
                    {
                    // InternalDmx.g:1662:2: ( ( '<>' ) )
                    // InternalDmx.g:1663:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1664:3: ( '<>' )
                    // InternalDmx.g:1664:4: '<>'
                    {
                    match(input,45,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1672:1: rule__OpCompare__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1676:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            case 49:
                {
                alt21=4;
                }
                break;
            case 50:
                {
                alt21=5;
                }
                break;
            case 51:
                {
                alt21=6;
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
                    // InternalDmx.g:1677:2: ( ( '<' ) )
                    {
                    // InternalDmx.g:1677:2: ( ( '<' ) )
                    // InternalDmx.g:1678:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1679:3: ( '<' )
                    // InternalDmx.g:1679:4: '<'
                    {
                    match(input,46,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1683:2: ( ( '<=' ) )
                    {
                    // InternalDmx.g:1683:2: ( ( '<=' ) )
                    // InternalDmx.g:1684:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1685:3: ( '<=' )
                    // InternalDmx.g:1685:4: '<='
                    {
                    match(input,47,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1689:2: ( ( '\\u2264' ) )
                    {
                    // InternalDmx.g:1689:2: ( ( '\\u2264' ) )
                    // InternalDmx.g:1690:3: ( '\\u2264' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1691:3: ( '\\u2264' )
                    // InternalDmx.g:1691:4: '\\u2264'
                    {
                    match(input,48,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1695:2: ( ( '>=' ) )
                    {
                    // InternalDmx.g:1695:2: ( ( '>=' ) )
                    // InternalDmx.g:1696:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1697:3: ( '>=' )
                    // InternalDmx.g:1697:4: '>='
                    {
                    match(input,49,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1701:2: ( ( '\\u2265' ) )
                    {
                    // InternalDmx.g:1701:2: ( ( '\\u2265' ) )
                    // InternalDmx.g:1702:3: ( '\\u2265' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1703:3: ( '\\u2265' )
                    // InternalDmx.g:1703:4: '\\u2265'
                    {
                    match(input,50,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:1707:2: ( ( '>' ) )
                    {
                    // InternalDmx.g:1707:2: ( ( '>' ) )
                    // InternalDmx.g:1708:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5()); 
                    }
                    // InternalDmx.g:1709:3: ( '>' )
                    // InternalDmx.g:1709:4: '>'
                    {
                    match(input,51,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1717:1: rule__OpOther__Alternatives : ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__OpOther__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1721:1: ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt22=1;
                }
                break;
            case 53:
                {
                alt22=2;
                }
                break;
            case 54:
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
                    // InternalDmx.g:1722:2: ( ( '..' ) )
                    {
                    // InternalDmx.g:1722:2: ( ( '..' ) )
                    // InternalDmx.g:1723:3: ( '..' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1724:3: ( '..' )
                    // InternalDmx.g:1724:4: '..'
                    {
                    match(input,52,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1728:2: ( ( '->' ) )
                    {
                    // InternalDmx.g:1728:2: ( ( '->' ) )
                    // InternalDmx.g:1729:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1730:3: ( '->' )
                    // InternalDmx.g:1730:4: '->'
                    {
                    match(input,53,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1734:2: ( ( '=>' ) )
                    {
                    // InternalDmx.g:1734:2: ( ( '=>' ) )
                    // InternalDmx.g:1735:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1736:3: ( '=>' )
                    // InternalDmx.g:1736:4: '=>'
                    {
                    match(input,54,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1744:1: rule__OpAdd__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1748:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDmx.g:1749:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1749:2: ( ( '+' ) )
                    // InternalDmx.g:1750:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1751:3: ( '+' )
                    // InternalDmx.g:1751:4: '+'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1755:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1755:2: ( ( '-' ) )
                    // InternalDmx.g:1756:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1757:3: ( '-' )
                    // InternalDmx.g:1757:4: '-'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1765:1: rule__OpMulti__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1769:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt24=1;
                }
                break;
            case 56:
                {
                alt24=2;
                }
                break;
            case 57:
                {
                alt24=3;
                }
                break;
            case 58:
                {
                alt24=4;
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
                    // InternalDmx.g:1770:2: ( ( '*' ) )
                    {
                    // InternalDmx.g:1770:2: ( ( '*' ) )
                    // InternalDmx.g:1771:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1772:3: ( '*' )
                    // InternalDmx.g:1772:4: '*'
                    {
                    match(input,55,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1776:2: ( ( '/' ) )
                    {
                    // InternalDmx.g:1776:2: ( ( '/' ) )
                    // InternalDmx.g:1777:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1778:3: ( '/' )
                    // InternalDmx.g:1778:4: '/'
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
                    // InternalDmx.g:1782:2: ( ( '**' ) )
                    {
                    // InternalDmx.g:1782:2: ( ( '**' ) )
                    // InternalDmx.g:1783:3: ( '**' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1784:3: ( '**' )
                    // InternalDmx.g:1784:4: '**'
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
                    // InternalDmx.g:1788:2: ( ( '%' ) )
                    {
                    // InternalDmx.g:1788:2: ( ( '%' ) )
                    // InternalDmx.g:1789:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1790:3: ( '%' )
                    // InternalDmx.g:1790:4: '%'
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
    // InternalDmx.g:1798:1: rule__OpUnary__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1802:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 59:
                {
                alt25=3;
                }
                break;
            case 60:
                {
                alt25=4;
                }
                break;
            case 61:
                {
                alt25=5;
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
                    // InternalDmx.g:1803:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1803:2: ( ( '+' ) )
                    // InternalDmx.g:1804:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1805:3: ( '+' )
                    // InternalDmx.g:1805:4: '+'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1809:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1809:2: ( ( '-' ) )
                    // InternalDmx.g:1810:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1811:3: ( '-' )
                    // InternalDmx.g:1811:4: '-'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1815:2: ( ( '!' ) )
                    {
                    // InternalDmx.g:1815:2: ( ( '!' ) )
                    // InternalDmx.g:1816:3: ( '!' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1817:3: ( '!' )
                    // InternalDmx.g:1817:4: '!'
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
                    // InternalDmx.g:1821:2: ( ( 'NOT' ) )
                    {
                    // InternalDmx.g:1821:2: ( ( 'NOT' ) )
                    // InternalDmx.g:1822:3: ( 'NOT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1823:3: ( 'NOT' )
                    // InternalDmx.g:1823:4: 'NOT'
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
                    // InternalDmx.g:1827:2: ( ( 'not' ) )
                    {
                    // InternalDmx.g:1827:2: ( ( 'not' ) )
                    // InternalDmx.g:1828:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1829:3: ( 'not' )
                    // InternalDmx.g:1829:4: 'not'
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
    // InternalDmx.g:1837:1: rule__DmxModel__Group__0 : rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 ;
    public final void rule__DmxModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1841:1: ( rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 )
            // InternalDmx.g:1842:2: rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1
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
    // InternalDmx.g:1849:1: rule__DmxModel__Group__0__Impl : ( () ) ;
    public final void rule__DmxModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1853:1: ( ( () ) )
            // InternalDmx.g:1854:1: ( () )
            {
            // InternalDmx.g:1854:1: ( () )
            // InternalDmx.g:1855:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getDmxModelAction_0()); 
            }
            // InternalDmx.g:1856:2: ()
            // InternalDmx.g:1856:3: 
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
    // InternalDmx.g:1864:1: rule__DmxModel__Group__1 : rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 ;
    public final void rule__DmxModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1868:1: ( rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 )
            // InternalDmx.g:1869:2: rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2
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
    // InternalDmx.g:1876:1: rule__DmxModel__Group__1__Impl : ( ( rule__DmxModel__Group_1__0 )* ) ;
    public final void rule__DmxModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1880:1: ( ( ( rule__DmxModel__Group_1__0 )* ) )
            // InternalDmx.g:1881:1: ( ( rule__DmxModel__Group_1__0 )* )
            {
            // InternalDmx.g:1881:1: ( ( rule__DmxModel__Group_1__0 )* )
            // InternalDmx.g:1882:2: ( rule__DmxModel__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_1()); 
            }
            // InternalDmx.g:1883:2: ( rule__DmxModel__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==62) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDmx.g:1883:3: rule__DmxModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DmxModel__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalDmx.g:1891:1: rule__DmxModel__Group__2 : rule__DmxModel__Group__2__Impl ;
    public final void rule__DmxModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1895:1: ( rule__DmxModel__Group__2__Impl )
            // InternalDmx.g:1896:2: rule__DmxModel__Group__2__Impl
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
    // InternalDmx.g:1902:1: rule__DmxModel__Group__2__Impl : ( ( rule__DmxModel__Group_2__0 )* ) ;
    public final void rule__DmxModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1906:1: ( ( ( rule__DmxModel__Group_2__0 )* ) )
            // InternalDmx.g:1907:1: ( ( rule__DmxModel__Group_2__0 )* )
            {
            // InternalDmx.g:1907:1: ( ( rule__DmxModel__Group_2__0 )* )
            // InternalDmx.g:1908:2: ( rule__DmxModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_2()); 
            }
            // InternalDmx.g:1909:2: ( rule__DmxModel__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==65) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDmx.g:1909:3: rule__DmxModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DmxModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalDmx.g:1918:1: rule__DmxModel__Group_1__0 : rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 ;
    public final void rule__DmxModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1922:1: ( rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 )
            // InternalDmx.g:1923:2: rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1
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
    // InternalDmx.g:1930:1: rule__DmxModel__Group_1__0__Impl : ( 'text' ) ;
    public final void rule__DmxModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1934:1: ( ( 'text' ) )
            // InternalDmx.g:1935:1: ( 'text' )
            {
            // InternalDmx.g:1935:1: ( 'text' )
            // InternalDmx.g:1936:2: 'text'
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
    // InternalDmx.g:1945:1: rule__DmxModel__Group_1__1 : rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 ;
    public final void rule__DmxModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1949:1: ( rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 )
            // InternalDmx.g:1950:2: rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2
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
    // InternalDmx.g:1957:1: rule__DmxModel__Group_1__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1961:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:1962:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:1962:1: ( RULE_NATURAL )
            // InternalDmx.g:1963:2: RULE_NATURAL
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
    // InternalDmx.g:1972:1: rule__DmxModel__Group_1__2 : rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 ;
    public final void rule__DmxModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1976:1: ( rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 )
            // InternalDmx.g:1977:2: rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3
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
    // InternalDmx.g:1984:1: rule__DmxModel__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1988:1: ( ( ':' ) )
            // InternalDmx.g:1989:1: ( ':' )
            {
            // InternalDmx.g:1989:1: ( ':' )
            // InternalDmx.g:1990:2: ':'
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
    // InternalDmx.g:1999:1: rule__DmxModel__Group_1__3 : rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 ;
    public final void rule__DmxModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2003:1: ( rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 )
            // InternalDmx.g:2004:2: rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4
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
    // InternalDmx.g:2011:1: rule__DmxModel__Group_1__3__Impl : ( ( rule__DmxModel__TextsAssignment_1_3 ) ) ;
    public final void rule__DmxModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2015:1: ( ( ( rule__DmxModel__TextsAssignment_1_3 ) ) )
            // InternalDmx.g:2016:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            {
            // InternalDmx.g:2016:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            // InternalDmx.g:2017:2: ( rule__DmxModel__TextsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextsAssignment_1_3()); 
            }
            // InternalDmx.g:2018:2: ( rule__DmxModel__TextsAssignment_1_3 )
            // InternalDmx.g:2018:3: rule__DmxModel__TextsAssignment_1_3
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
    // InternalDmx.g:2026:1: rule__DmxModel__Group_1__4 : rule__DmxModel__Group_1__4__Impl ;
    public final void rule__DmxModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2030:1: ( rule__DmxModel__Group_1__4__Impl )
            // InternalDmx.g:2031:2: rule__DmxModel__Group_1__4__Impl
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
    // InternalDmx.g:2037:1: rule__DmxModel__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2041:1: ( ( ';' ) )
            // InternalDmx.g:2042:1: ( ';' )
            {
            // InternalDmx.g:2042:1: ( ';' )
            // InternalDmx.g:2043:2: ';'
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
    // InternalDmx.g:2053:1: rule__DmxModel__Group_2__0 : rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 ;
    public final void rule__DmxModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2057:1: ( rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 )
            // InternalDmx.g:2058:2: rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1
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
    // InternalDmx.g:2065:1: rule__DmxModel__Group_2__0__Impl : ( 'expr' ) ;
    public final void rule__DmxModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2069:1: ( ( 'expr' ) )
            // InternalDmx.g:2070:1: ( 'expr' )
            {
            // InternalDmx.g:2070:1: ( 'expr' )
            // InternalDmx.g:2071:2: 'expr'
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
    // InternalDmx.g:2080:1: rule__DmxModel__Group_2__1 : rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 ;
    public final void rule__DmxModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2084:1: ( rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 )
            // InternalDmx.g:2085:2: rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2
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
    // InternalDmx.g:2092:1: rule__DmxModel__Group_2__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2096:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2097:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2097:1: ( RULE_NATURAL )
            // InternalDmx.g:2098:2: RULE_NATURAL
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
    // InternalDmx.g:2107:1: rule__DmxModel__Group_2__2 : rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 ;
    public final void rule__DmxModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2111:1: ( rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 )
            // InternalDmx.g:2112:2: rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3
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
    // InternalDmx.g:2119:1: rule__DmxModel__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2123:1: ( ( ':' ) )
            // InternalDmx.g:2124:1: ( ':' )
            {
            // InternalDmx.g:2124:1: ( ':' )
            // InternalDmx.g:2125:2: ':'
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
    // InternalDmx.g:2134:1: rule__DmxModel__Group_2__3 : rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 ;
    public final void rule__DmxModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2138:1: ( rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 )
            // InternalDmx.g:2139:2: rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4
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
    // InternalDmx.g:2146:1: rule__DmxModel__Group_2__3__Impl : ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) ;
    public final void rule__DmxModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2150:1: ( ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) )
            // InternalDmx.g:2151:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            {
            // InternalDmx.g:2151:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            // InternalDmx.g:2152:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExpressionsAssignment_2_3()); 
            }
            // InternalDmx.g:2153:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            // InternalDmx.g:2153:3: rule__DmxModel__ExpressionsAssignment_2_3
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
    // InternalDmx.g:2161:1: rule__DmxModel__Group_2__4 : rule__DmxModel__Group_2__4__Impl ;
    public final void rule__DmxModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2165:1: ( rule__DmxModel__Group_2__4__Impl )
            // InternalDmx.g:2166:2: rule__DmxModel__Group_2__4__Impl
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
    // InternalDmx.g:2172:1: rule__DmxModel__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2176:1: ( ( ';' ) )
            // InternalDmx.g:2177:1: ( ';' )
            {
            // InternalDmx.g:2177:1: ( ';' )
            // InternalDmx.g:2178:2: ';'
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
    // InternalDmx.g:2188:1: rule__DRichText__Group_1__0 : rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 ;
    public final void rule__DRichText__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2192:1: ( rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 )
            // InternalDmx.g:2193:2: rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1
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
    // InternalDmx.g:2200:1: rule__DRichText__Group_1__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_0 ) ) ;
    public final void rule__DRichText__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2204:1: ( ( ( rule__DRichText__ElementsAssignment_1_0 ) ) )
            // InternalDmx.g:2205:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            {
            // InternalDmx.g:2205:1: ( ( rule__DRichText__ElementsAssignment_1_0 ) )
            // InternalDmx.g:2206:2: ( rule__DRichText__ElementsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_0()); 
            }
            // InternalDmx.g:2207:2: ( rule__DRichText__ElementsAssignment_1_0 )
            // InternalDmx.g:2207:3: rule__DRichText__ElementsAssignment_1_0
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
    // InternalDmx.g:2215:1: rule__DRichText__Group_1__1 : rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 ;
    public final void rule__DRichText__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2219:1: ( rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 )
            // InternalDmx.g:2220:2: rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2
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
    // InternalDmx.g:2227:1: rule__DRichText__Group_1__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_1 ) ) ;
    public final void rule__DRichText__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2231:1: ( ( ( rule__DRichText__ElementsAssignment_1_1 ) ) )
            // InternalDmx.g:2232:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            {
            // InternalDmx.g:2232:1: ( ( rule__DRichText__ElementsAssignment_1_1 ) )
            // InternalDmx.g:2233:2: ( rule__DRichText__ElementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_1()); 
            }
            // InternalDmx.g:2234:2: ( rule__DRichText__ElementsAssignment_1_1 )
            // InternalDmx.g:2234:3: rule__DRichText__ElementsAssignment_1_1
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
    // InternalDmx.g:2242:1: rule__DRichText__Group_1__2 : rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 ;
    public final void rule__DRichText__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2246:1: ( rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 )
            // InternalDmx.g:2247:2: rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3
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
    // InternalDmx.g:2254:1: rule__DRichText__Group_1__2__Impl : ( ( rule__DRichText__Group_1_2__0 )* ) ;
    public final void rule__DRichText__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2258:1: ( ( ( rule__DRichText__Group_1_2__0 )* ) )
            // InternalDmx.g:2259:1: ( ( rule__DRichText__Group_1_2__0 )* )
            {
            // InternalDmx.g:2259:1: ( ( rule__DRichText__Group_1_2__0 )* )
            // InternalDmx.g:2260:2: ( rule__DRichText__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getGroup_1_2()); 
            }
            // InternalDmx.g:2261:2: ( rule__DRichText__Group_1_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDmx.g:2261:3: rule__DRichText__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DRichText__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalDmx.g:2269:1: rule__DRichText__Group_1__3 : rule__DRichText__Group_1__3__Impl ;
    public final void rule__DRichText__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2273:1: ( rule__DRichText__Group_1__3__Impl )
            // InternalDmx.g:2274:2: rule__DRichText__Group_1__3__Impl
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
    // InternalDmx.g:2280:1: rule__DRichText__Group_1__3__Impl : ( ( rule__DRichText__ElementsAssignment_1_3 ) ) ;
    public final void rule__DRichText__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2284:1: ( ( ( rule__DRichText__ElementsAssignment_1_3 ) ) )
            // InternalDmx.g:2285:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            {
            // InternalDmx.g:2285:1: ( ( rule__DRichText__ElementsAssignment_1_3 ) )
            // InternalDmx.g:2286:2: ( rule__DRichText__ElementsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_3()); 
            }
            // InternalDmx.g:2287:2: ( rule__DRichText__ElementsAssignment_1_3 )
            // InternalDmx.g:2287:3: rule__DRichText__ElementsAssignment_1_3
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
    // InternalDmx.g:2296:1: rule__DRichText__Group_1_2__0 : rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 ;
    public final void rule__DRichText__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2300:1: ( rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 )
            // InternalDmx.g:2301:2: rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1
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
    // InternalDmx.g:2308:1: rule__DRichText__Group_1_2__0__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) ;
    public final void rule__DRichText__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2312:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_0 ) ) )
            // InternalDmx.g:2313:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            {
            // InternalDmx.g:2313:1: ( ( rule__DRichText__ElementsAssignment_1_2_0 ) )
            // InternalDmx.g:2314:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_0()); 
            }
            // InternalDmx.g:2315:2: ( rule__DRichText__ElementsAssignment_1_2_0 )
            // InternalDmx.g:2315:3: rule__DRichText__ElementsAssignment_1_2_0
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
    // InternalDmx.g:2323:1: rule__DRichText__Group_1_2__1 : rule__DRichText__Group_1_2__1__Impl ;
    public final void rule__DRichText__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2327:1: ( rule__DRichText__Group_1_2__1__Impl )
            // InternalDmx.g:2328:2: rule__DRichText__Group_1_2__1__Impl
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
    // InternalDmx.g:2334:1: rule__DRichText__Group_1_2__1__Impl : ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__DRichText__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2338:1: ( ( ( rule__DRichText__ElementsAssignment_1_2_1 ) ) )
            // InternalDmx.g:2339:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            {
            // InternalDmx.g:2339:1: ( ( rule__DRichText__ElementsAssignment_1_2_1 ) )
            // InternalDmx.g:2340:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getElementsAssignment_1_2_1()); 
            }
            // InternalDmx.g:2341:2: ( rule__DRichText__ElementsAssignment_1_2_1 )
            // InternalDmx.g:2341:3: rule__DRichText__ElementsAssignment_1_2_1
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
    // InternalDmx.g:2350:1: rule__DAssignment__Group_0__0 : rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 ;
    public final void rule__DAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2354:1: ( rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 )
            // InternalDmx.g:2355:2: rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1
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
    // InternalDmx.g:2362:1: rule__DAssignment__Group_0__0__Impl : ( () ) ;
    public final void rule__DAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2366:1: ( ( () ) )
            // InternalDmx.g:2367:1: ( () )
            {
            // InternalDmx.g:2367:1: ( () )
            // InternalDmx.g:2368:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0()); 
            }
            // InternalDmx.g:2369:2: ()
            // InternalDmx.g:2369:3: 
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
    // InternalDmx.g:2377:1: rule__DAssignment__Group_0__1 : rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 ;
    public final void rule__DAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2381:1: ( rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 )
            // InternalDmx.g:2382:2: rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2
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
    // InternalDmx.g:2389:1: rule__DAssignment__Group_0__1__Impl : ( ( rule__DAssignment__MemberAssignment_0_1 ) ) ;
    public final void rule__DAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2393:1: ( ( ( rule__DAssignment__MemberAssignment_0_1 ) ) )
            // InternalDmx.g:2394:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            {
            // InternalDmx.g:2394:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            // InternalDmx.g:2395:2: ( rule__DAssignment__MemberAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberAssignment_0_1()); 
            }
            // InternalDmx.g:2396:2: ( rule__DAssignment__MemberAssignment_0_1 )
            // InternalDmx.g:2396:3: rule__DAssignment__MemberAssignment_0_1
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
    // InternalDmx.g:2404:1: rule__DAssignment__Group_0__2 : rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 ;
    public final void rule__DAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2408:1: ( rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 )
            // InternalDmx.g:2409:2: rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3
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
    // InternalDmx.g:2416:1: rule__DAssignment__Group_0__2__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2420:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:2421:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:2421:1: ( ruleOpSingleAssign )
            // InternalDmx.g:2422:2: ruleOpSingleAssign
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
    // InternalDmx.g:2431:1: rule__DAssignment__Group_0__3 : rule__DAssignment__Group_0__3__Impl ;
    public final void rule__DAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2435:1: ( rule__DAssignment__Group_0__3__Impl )
            // InternalDmx.g:2436:2: rule__DAssignment__Group_0__3__Impl
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
    // InternalDmx.g:2442:1: rule__DAssignment__Group_0__3__Impl : ( ( rule__DAssignment__ValueAssignment_0_3 ) ) ;
    public final void rule__DAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2446:1: ( ( ( rule__DAssignment__ValueAssignment_0_3 ) ) )
            // InternalDmx.g:2447:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            {
            // InternalDmx.g:2447:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            // InternalDmx.g:2448:2: ( rule__DAssignment__ValueAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3()); 
            }
            // InternalDmx.g:2449:2: ( rule__DAssignment__ValueAssignment_0_3 )
            // InternalDmx.g:2449:3: rule__DAssignment__ValueAssignment_0_3
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
    // InternalDmx.g:2458:1: rule__DOrExpression__Group__0 : rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 ;
    public final void rule__DOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2462:1: ( rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 )
            // InternalDmx.g:2463:2: rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1
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
    // InternalDmx.g:2470:1: rule__DOrExpression__Group__0__Impl : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2474:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:2475:1: ( ruleDAndExpression )
            {
            // InternalDmx.g:2475:1: ( ruleDAndExpression )
            // InternalDmx.g:2476:2: ruleDAndExpression
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
    // InternalDmx.g:2485:1: rule__DOrExpression__Group__1 : rule__DOrExpression__Group__1__Impl ;
    public final void rule__DOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2489:1: ( rule__DOrExpression__Group__1__Impl )
            // InternalDmx.g:2490:2: rule__DOrExpression__Group__1__Impl
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
    // InternalDmx.g:2496:1: rule__DOrExpression__Group__1__Impl : ( ( rule__DOrExpression__Group_1__0 )* ) ;
    public final void rule__DOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2500:1: ( ( ( rule__DOrExpression__Group_1__0 )* ) )
            // InternalDmx.g:2501:1: ( ( rule__DOrExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2501:1: ( ( rule__DOrExpression__Group_1__0 )* )
            // InternalDmx.g:2502:2: ( rule__DOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2503:2: ( rule__DOrExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred55_InternalDmx()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred55_InternalDmx()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred55_InternalDmx()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA29_5 = input.LA(2);

                    if ( (synpred55_InternalDmx()) ) {
                        alt29=1;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalDmx.g:2503:3: rule__DOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDmx.g:2512:1: rule__DOrExpression__Group_1__0 : rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 ;
    public final void rule__DOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2516:1: ( rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 )
            // InternalDmx.g:2517:2: rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1
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
    // InternalDmx.g:2524:1: rule__DOrExpression__Group_1__0__Impl : ( ( rule__DOrExpression__Group_1_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2528:1: ( ( ( rule__DOrExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2529:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2529:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            // InternalDmx.g:2530:2: ( rule__DOrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2531:2: ( rule__DOrExpression__Group_1_0__0 )
            // InternalDmx.g:2531:3: rule__DOrExpression__Group_1_0__0
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
    // InternalDmx.g:2539:1: rule__DOrExpression__Group_1__1 : rule__DOrExpression__Group_1__1__Impl ;
    public final void rule__DOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2543:1: ( rule__DOrExpression__Group_1__1__Impl )
            // InternalDmx.g:2544:2: rule__DOrExpression__Group_1__1__Impl
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
    // InternalDmx.g:2550:1: rule__DOrExpression__Group_1__1__Impl : ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2554:1: ( ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2555:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2555:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2556:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2557:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2557:3: rule__DOrExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2566:1: rule__DOrExpression__Group_1_0__0 : rule__DOrExpression__Group_1_0__0__Impl ;
    public final void rule__DOrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2570:1: ( rule__DOrExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2571:2: rule__DOrExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2577:1: rule__DOrExpression__Group_1_0__0__Impl : ( ( rule__DOrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2581:1: ( ( ( rule__DOrExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2582:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2582:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2583:2: ( rule__DOrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2584:2: ( rule__DOrExpression__Group_1_0_0__0 )
            // InternalDmx.g:2584:3: rule__DOrExpression__Group_1_0_0__0
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
    // InternalDmx.g:2593:1: rule__DOrExpression__Group_1_0_0__0 : rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 ;
    public final void rule__DOrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2597:1: ( rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 )
            // InternalDmx.g:2598:2: rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1
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
    // InternalDmx.g:2605:1: rule__DOrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2609:1: ( ( () ) )
            // InternalDmx.g:2610:1: ( () )
            {
            // InternalDmx.g:2610:1: ( () )
            // InternalDmx.g:2611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2612:2: ()
            // InternalDmx.g:2612:3: 
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
    // InternalDmx.g:2620:1: rule__DOrExpression__Group_1_0_0__1 : rule__DOrExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2624:1: ( rule__DOrExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2625:2: rule__DOrExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2631:1: rule__DOrExpression__Group_1_0_0__1__Impl : ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2635:1: ( ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2636:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2636:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2637:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2638:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2638:3: rule__DOrExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2647:1: rule__DAndExpression__Group__0 : rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 ;
    public final void rule__DAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2651:1: ( rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 )
            // InternalDmx.g:2652:2: rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1
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
    // InternalDmx.g:2659:1: rule__DAndExpression__Group__0__Impl : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2663:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:2664:1: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:2664:1: ( ruleDEqualityExpression )
            // InternalDmx.g:2665:2: ruleDEqualityExpression
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
    // InternalDmx.g:2674:1: rule__DAndExpression__Group__1 : rule__DAndExpression__Group__1__Impl ;
    public final void rule__DAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2678:1: ( rule__DAndExpression__Group__1__Impl )
            // InternalDmx.g:2679:2: rule__DAndExpression__Group__1__Impl
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
    // InternalDmx.g:2685:1: rule__DAndExpression__Group__1__Impl : ( ( rule__DAndExpression__Group_1__0 )* ) ;
    public final void rule__DAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2689:1: ( ( ( rule__DAndExpression__Group_1__0 )* ) )
            // InternalDmx.g:2690:1: ( ( rule__DAndExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2690:1: ( ( rule__DAndExpression__Group_1__0 )* )
            // InternalDmx.g:2691:2: ( rule__DAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2692:2: ( rule__DAndExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==42) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred56_InternalDmx()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalDmx.g:2692:3: rule__DAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__DAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalDmx.g:2701:1: rule__DAndExpression__Group_1__0 : rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 ;
    public final void rule__DAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2705:1: ( rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 )
            // InternalDmx.g:2706:2: rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1
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
    // InternalDmx.g:2713:1: rule__DAndExpression__Group_1__0__Impl : ( ( rule__DAndExpression__Group_1_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2717:1: ( ( ( rule__DAndExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2718:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2718:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            // InternalDmx.g:2719:2: ( rule__DAndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2720:2: ( rule__DAndExpression__Group_1_0__0 )
            // InternalDmx.g:2720:3: rule__DAndExpression__Group_1_0__0
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
    // InternalDmx.g:2728:1: rule__DAndExpression__Group_1__1 : rule__DAndExpression__Group_1__1__Impl ;
    public final void rule__DAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2732:1: ( rule__DAndExpression__Group_1__1__Impl )
            // InternalDmx.g:2733:2: rule__DAndExpression__Group_1__1__Impl
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
    // InternalDmx.g:2739:1: rule__DAndExpression__Group_1__1__Impl : ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2743:1: ( ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2744:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2744:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2745:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2746:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2746:3: rule__DAndExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2755:1: rule__DAndExpression__Group_1_0__0 : rule__DAndExpression__Group_1_0__0__Impl ;
    public final void rule__DAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2759:1: ( rule__DAndExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2760:2: rule__DAndExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2766:1: rule__DAndExpression__Group_1_0__0__Impl : ( ( rule__DAndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2770:1: ( ( ( rule__DAndExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2771:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2771:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2772:2: ( rule__DAndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2773:2: ( rule__DAndExpression__Group_1_0_0__0 )
            // InternalDmx.g:2773:3: rule__DAndExpression__Group_1_0_0__0
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
    // InternalDmx.g:2782:1: rule__DAndExpression__Group_1_0_0__0 : rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 ;
    public final void rule__DAndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2786:1: ( rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 )
            // InternalDmx.g:2787:2: rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1
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
    // InternalDmx.g:2794:1: rule__DAndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2798:1: ( ( () ) )
            // InternalDmx.g:2799:1: ( () )
            {
            // InternalDmx.g:2799:1: ( () )
            // InternalDmx.g:2800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2801:2: ()
            // InternalDmx.g:2801:3: 
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
    // InternalDmx.g:2809:1: rule__DAndExpression__Group_1_0_0__1 : rule__DAndExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2813:1: ( rule__DAndExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2814:2: rule__DAndExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2820:1: rule__DAndExpression__Group_1_0_0__1__Impl : ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2824:1: ( ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2825:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2825:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2826:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2827:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2827:3: rule__DAndExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2836:1: rule__DEqualityExpression__Group__0 : rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 ;
    public final void rule__DEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2840:1: ( rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 )
            // InternalDmx.g:2841:2: rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1
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
    // InternalDmx.g:2848:1: rule__DEqualityExpression__Group__0__Impl : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2852:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:2853:1: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:2853:1: ( ruleDRelationalExpression )
            // InternalDmx.g:2854:2: ruleDRelationalExpression
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
    // InternalDmx.g:2863:1: rule__DEqualityExpression__Group__1 : rule__DEqualityExpression__Group__1__Impl ;
    public final void rule__DEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2867:1: ( rule__DEqualityExpression__Group__1__Impl )
            // InternalDmx.g:2868:2: rule__DEqualityExpression__Group__1__Impl
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
    // InternalDmx.g:2874:1: rule__DEqualityExpression__Group__1__Impl : ( ( rule__DEqualityExpression__Group_1__0 )* ) ;
    public final void rule__DEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2878:1: ( ( ( rule__DEqualityExpression__Group_1__0 )* ) )
            // InternalDmx.g:2879:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2879:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            // InternalDmx.g:2880:2: ( rule__DEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2881:2: ( rule__DEqualityExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred57_InternalDmx()) ) {
                        alt31=1;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalDmx.g:2881:3: rule__DEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalDmx.g:2890:1: rule__DEqualityExpression__Group_1__0 : rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 ;
    public final void rule__DEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2894:1: ( rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 )
            // InternalDmx.g:2895:2: rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1
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
    // InternalDmx.g:2902:1: rule__DEqualityExpression__Group_1__0__Impl : ( ( rule__DEqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2906:1: ( ( ( rule__DEqualityExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2907:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2907:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            // InternalDmx.g:2908:2: ( rule__DEqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2909:2: ( rule__DEqualityExpression__Group_1_0__0 )
            // InternalDmx.g:2909:3: rule__DEqualityExpression__Group_1_0__0
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
    // InternalDmx.g:2917:1: rule__DEqualityExpression__Group_1__1 : rule__DEqualityExpression__Group_1__1__Impl ;
    public final void rule__DEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2921:1: ( rule__DEqualityExpression__Group_1__1__Impl )
            // InternalDmx.g:2922:2: rule__DEqualityExpression__Group_1__1__Impl
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
    // InternalDmx.g:2928:1: rule__DEqualityExpression__Group_1__1__Impl : ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2932:1: ( ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2933:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2933:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2934:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2935:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2935:3: rule__DEqualityExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2944:1: rule__DEqualityExpression__Group_1_0__0 : rule__DEqualityExpression__Group_1_0__0__Impl ;
    public final void rule__DEqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2948:1: ( rule__DEqualityExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2949:2: rule__DEqualityExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2955:1: rule__DEqualityExpression__Group_1_0__0__Impl : ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2959:1: ( ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2960:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2960:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2961:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2962:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            // InternalDmx.g:2962:3: rule__DEqualityExpression__Group_1_0_0__0
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
    // InternalDmx.g:2971:1: rule__DEqualityExpression__Group_1_0_0__0 : rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 ;
    public final void rule__DEqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2975:1: ( rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 )
            // InternalDmx.g:2976:2: rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1
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
    // InternalDmx.g:2983:1: rule__DEqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2987:1: ( ( () ) )
            // InternalDmx.g:2988:1: ( () )
            {
            // InternalDmx.g:2988:1: ( () )
            // InternalDmx.g:2989:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2990:2: ()
            // InternalDmx.g:2990:3: 
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
    // InternalDmx.g:2998:1: rule__DEqualityExpression__Group_1_0_0__1 : rule__DEqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__DEqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3002:1: ( rule__DEqualityExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3003:2: rule__DEqualityExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3009:1: rule__DEqualityExpression__Group_1_0_0__1__Impl : ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3013:1: ( ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3014:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3014:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3015:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3016:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3016:3: rule__DEqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3025:1: rule__DRelationalExpression__Group__0 : rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 ;
    public final void rule__DRelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3029:1: ( rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 )
            // InternalDmx.g:3030:2: rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1
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
    // InternalDmx.g:3037:1: rule__DRelationalExpression__Group__0__Impl : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3041:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:3042:1: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:3042:1: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:3043:2: ruleDOtherOperatorExpression
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
    // InternalDmx.g:3052:1: rule__DRelationalExpression__Group__1 : rule__DRelationalExpression__Group__1__Impl ;
    public final void rule__DRelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3056:1: ( rule__DRelationalExpression__Group__1__Impl )
            // InternalDmx.g:3057:2: rule__DRelationalExpression__Group__1__Impl
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
    // InternalDmx.g:3063:1: rule__DRelationalExpression__Group__1__Impl : ( ( rule__DRelationalExpression__Alternatives_1 )* ) ;
    public final void rule__DRelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3067:1: ( ( ( rule__DRelationalExpression__Alternatives_1 )* ) )
            // InternalDmx.g:3068:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            {
            // InternalDmx.g:3068:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            // InternalDmx.g:3069:2: ( rule__DRelationalExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:3070:2: ( rule__DRelationalExpression__Alternatives_1 )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // InternalDmx.g:3070:3: rule__DRelationalExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__DRelationalExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalDmx.g:3079:1: rule__DRelationalExpression__Group_1_0__0 : rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3083:1: ( rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 )
            // InternalDmx.g:3084:2: rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1
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
    // InternalDmx.g:3091:1: rule__DRelationalExpression__Group_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3095:1: ( ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3096:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3096:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3097:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3098:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            // InternalDmx.g:3098:3: rule__DRelationalExpression__Group_1_0_0__0
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
    // InternalDmx.g:3106:1: rule__DRelationalExpression__Group_1_0__1 : rule__DRelationalExpression__Group_1_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3110:1: ( rule__DRelationalExpression__Group_1_0__1__Impl )
            // InternalDmx.g:3111:2: rule__DRelationalExpression__Group_1_0__1__Impl
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
    // InternalDmx.g:3117:1: rule__DRelationalExpression__Group_1_0__1__Impl : ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3121:1: ( ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) )
            // InternalDmx.g:3122:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            {
            // InternalDmx.g:3122:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            // InternalDmx.g:3123:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1()); 
            }
            // InternalDmx.g:3124:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            // InternalDmx.g:3124:3: rule__DRelationalExpression__TypeAssignment_1_0_1
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
    // InternalDmx.g:3133:1: rule__DRelationalExpression__Group_1_0_0__0 : rule__DRelationalExpression__Group_1_0_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3137:1: ( rule__DRelationalExpression__Group_1_0_0__0__Impl )
            // InternalDmx.g:3138:2: rule__DRelationalExpression__Group_1_0_0__0__Impl
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
    // InternalDmx.g:3144:1: rule__DRelationalExpression__Group_1_0_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3148:1: ( ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:3149:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:3149:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            // InternalDmx.g:3150:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:3151:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            // InternalDmx.g:3151:3: rule__DRelationalExpression__Group_1_0_0_0__0
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
    // InternalDmx.g:3160:1: rule__DRelationalExpression__Group_1_0_0_0__0 : rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3164:1: ( rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 )
            // InternalDmx.g:3165:2: rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1
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
    // InternalDmx.g:3172:1: rule__DRelationalExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3176:1: ( ( () ) )
            // InternalDmx.g:3177:1: ( () )
            {
            // InternalDmx.g:3177:1: ( () )
            // InternalDmx.g:3178:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:3179:2: ()
            // InternalDmx.g:3179:3: 
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
    // InternalDmx.g:3187:1: rule__DRelationalExpression__Group_1_0_0_0__1 : rule__DRelationalExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3191:1: ( rule__DRelationalExpression__Group_1_0_0_0__1__Impl )
            // InternalDmx.g:3192:2: rule__DRelationalExpression__Group_1_0_0_0__1__Impl
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
    // InternalDmx.g:3198:1: rule__DRelationalExpression__Group_1_0_0_0__1__Impl : ( ruleOpInstanceOf ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3202:1: ( ( ruleOpInstanceOf ) )
            // InternalDmx.g:3203:1: ( ruleOpInstanceOf )
            {
            // InternalDmx.g:3203:1: ( ruleOpInstanceOf )
            // InternalDmx.g:3204:2: ruleOpInstanceOf
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
    // InternalDmx.g:3214:1: rule__DRelationalExpression__Group_1_1__0 : rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 ;
    public final void rule__DRelationalExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3218:1: ( rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 )
            // InternalDmx.g:3219:2: rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1
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
    // InternalDmx.g:3226:1: rule__DRelationalExpression__Group_1_1__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3230:1: ( ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) )
            // InternalDmx.g:3231:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:3231:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            // InternalDmx.g:3232:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:3233:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            // InternalDmx.g:3233:3: rule__DRelationalExpression__Group_1_1_0__0
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
    // InternalDmx.g:3241:1: rule__DRelationalExpression__Group_1_1__1 : rule__DRelationalExpression__Group_1_1__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3245:1: ( rule__DRelationalExpression__Group_1_1__1__Impl )
            // InternalDmx.g:3246:2: rule__DRelationalExpression__Group_1_1__1__Impl
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
    // InternalDmx.g:3252:1: rule__DRelationalExpression__Group_1_1__1__Impl : ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3256:1: ( ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) )
            // InternalDmx.g:3257:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            {
            // InternalDmx.g:3257:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            // InternalDmx.g:3258:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1()); 
            }
            // InternalDmx.g:3259:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            // InternalDmx.g:3259:3: rule__DRelationalExpression__RightOperandAssignment_1_1_1
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
    // InternalDmx.g:3268:1: rule__DRelationalExpression__Group_1_1_0__0 : rule__DRelationalExpression__Group_1_1_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3272:1: ( rule__DRelationalExpression__Group_1_1_0__0__Impl )
            // InternalDmx.g:3273:2: rule__DRelationalExpression__Group_1_1_0__0__Impl
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
    // InternalDmx.g:3279:1: rule__DRelationalExpression__Group_1_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3283:1: ( ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:3284:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:3284:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            // InternalDmx.g:3285:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:3286:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            // InternalDmx.g:3286:3: rule__DRelationalExpression__Group_1_1_0_0__0
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
    // InternalDmx.g:3295:1: rule__DRelationalExpression__Group_1_1_0_0__0 : rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3299:1: ( rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 )
            // InternalDmx.g:3300:2: rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1
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
    // InternalDmx.g:3307:1: rule__DRelationalExpression__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3311:1: ( ( () ) )
            // InternalDmx.g:3312:1: ( () )
            {
            // InternalDmx.g:3312:1: ( () )
            // InternalDmx.g:3313:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:3314:2: ()
            // InternalDmx.g:3314:3: 
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
    // InternalDmx.g:3322:1: rule__DRelationalExpression__Group_1_1_0_0__1 : rule__DRelationalExpression__Group_1_1_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3326:1: ( rule__DRelationalExpression__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:3327:2: rule__DRelationalExpression__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:3333:1: rule__DRelationalExpression__Group_1_1_0_0__1__Impl : ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3337:1: ( ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) )
            // InternalDmx.g:3338:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            {
            // InternalDmx.g:3338:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            // InternalDmx.g:3339:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1()); 
            }
            // InternalDmx.g:3340:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            // InternalDmx.g:3340:3: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1
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
    // InternalDmx.g:3349:1: rule__DOtherOperatorExpression__Group__0 : rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 ;
    public final void rule__DOtherOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3353:1: ( rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 )
            // InternalDmx.g:3354:2: rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1
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
    // InternalDmx.g:3361:1: rule__DOtherOperatorExpression__Group__0__Impl : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3365:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:3366:1: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:3366:1: ( ruleDAdditiveExpression )
            // InternalDmx.g:3367:2: ruleDAdditiveExpression
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
    // InternalDmx.g:3376:1: rule__DOtherOperatorExpression__Group__1 : rule__DOtherOperatorExpression__Group__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3380:1: ( rule__DOtherOperatorExpression__Group__1__Impl )
            // InternalDmx.g:3381:2: rule__DOtherOperatorExpression__Group__1__Impl
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
    // InternalDmx.g:3387:1: rule__DOtherOperatorExpression__Group__1__Impl : ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) ;
    public final void rule__DOtherOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3391:1: ( ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) )
            // InternalDmx.g:3392:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3392:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            // InternalDmx.g:3393:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3394:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 54:
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
            	    // InternalDmx.g:3394:3: rule__DOtherOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__DOtherOperatorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalDmx.g:3403:1: rule__DOtherOperatorExpression__Group_1__0 : rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 ;
    public final void rule__DOtherOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3407:1: ( rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 )
            // InternalDmx.g:3408:2: rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1
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
    // InternalDmx.g:3415:1: rule__DOtherOperatorExpression__Group_1__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3419:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3420:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3420:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            // InternalDmx.g:3421:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3422:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            // InternalDmx.g:3422:3: rule__DOtherOperatorExpression__Group_1_0__0
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
    // InternalDmx.g:3430:1: rule__DOtherOperatorExpression__Group_1__1 : rule__DOtherOperatorExpression__Group_1__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3434:1: ( rule__DOtherOperatorExpression__Group_1__1__Impl )
            // InternalDmx.g:3435:2: rule__DOtherOperatorExpression__Group_1__1__Impl
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
    // InternalDmx.g:3441:1: rule__DOtherOperatorExpression__Group_1__1__Impl : ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3445:1: ( ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3446:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3446:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3447:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3448:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3448:3: rule__DOtherOperatorExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3457:1: rule__DOtherOperatorExpression__Group_1_0__0 : rule__DOtherOperatorExpression__Group_1_0__0__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3461:1: ( rule__DOtherOperatorExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3462:2: rule__DOtherOperatorExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3468:1: rule__DOtherOperatorExpression__Group_1_0__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3472:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3473:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3473:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3474:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3475:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            // InternalDmx.g:3475:3: rule__DOtherOperatorExpression__Group_1_0_0__0
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
    // InternalDmx.g:3484:1: rule__DOtherOperatorExpression__Group_1_0_0__0 : rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3488:1: ( rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 )
            // InternalDmx.g:3489:2: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1
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
    // InternalDmx.g:3496:1: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3500:1: ( ( () ) )
            // InternalDmx.g:3501:1: ( () )
            {
            // InternalDmx.g:3501:1: ( () )
            // InternalDmx.g:3502:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3503:2: ()
            // InternalDmx.g:3503:3: 
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
    // InternalDmx.g:3511:1: rule__DOtherOperatorExpression__Group_1_0_0__1 : rule__DOtherOperatorExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3515:1: ( rule__DOtherOperatorExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3516:2: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3522:1: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl : ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3526:1: ( ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3527:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3527:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3528:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3529:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3529:3: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3538:1: rule__DAdditiveExpression__Group__0 : rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 ;
    public final void rule__DAdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3542:1: ( rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 )
            // InternalDmx.g:3543:2: rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1
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
    // InternalDmx.g:3550:1: rule__DAdditiveExpression__Group__0__Impl : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3554:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:3555:1: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:3555:1: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:3556:2: ruleDMultiplicativeExpression
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
    // InternalDmx.g:3565:1: rule__DAdditiveExpression__Group__1 : rule__DAdditiveExpression__Group__1__Impl ;
    public final void rule__DAdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3569:1: ( rule__DAdditiveExpression__Group__1__Impl )
            // InternalDmx.g:3570:2: rule__DAdditiveExpression__Group__1__Impl
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
    // InternalDmx.g:3576:1: rule__DAdditiveExpression__Group__1__Impl : ( ( rule__DAdditiveExpression__Group_1__0 )* ) ;
    public final void rule__DAdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3580:1: ( ( ( rule__DAdditiveExpression__Group_1__0 )* ) )
            // InternalDmx.g:3581:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3581:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            // InternalDmx.g:3582:2: ( rule__DAdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3583:2: ( rule__DAdditiveExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==35) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==36) ) {
                    int LA34_3 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalDmx.g:3583:3: rule__DAdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DAdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalDmx.g:3592:1: rule__DAdditiveExpression__Group_1__0 : rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 ;
    public final void rule__DAdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3596:1: ( rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 )
            // InternalDmx.g:3597:2: rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1
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
    // InternalDmx.g:3604:1: rule__DAdditiveExpression__Group_1__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3608:1: ( ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3609:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3609:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            // InternalDmx.g:3610:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3611:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            // InternalDmx.g:3611:3: rule__DAdditiveExpression__Group_1_0__0
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
    // InternalDmx.g:3619:1: rule__DAdditiveExpression__Group_1__1 : rule__DAdditiveExpression__Group_1__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3623:1: ( rule__DAdditiveExpression__Group_1__1__Impl )
            // InternalDmx.g:3624:2: rule__DAdditiveExpression__Group_1__1__Impl
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
    // InternalDmx.g:3630:1: rule__DAdditiveExpression__Group_1__1__Impl : ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3634:1: ( ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3635:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3635:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3636:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3637:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3637:3: rule__DAdditiveExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3646:1: rule__DAdditiveExpression__Group_1_0__0 : rule__DAdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3650:1: ( rule__DAdditiveExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3651:2: rule__DAdditiveExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3657:1: rule__DAdditiveExpression__Group_1_0__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3661:1: ( ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3662:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3662:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3663:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3664:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            // InternalDmx.g:3664:3: rule__DAdditiveExpression__Group_1_0_0__0
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
    // InternalDmx.g:3673:1: rule__DAdditiveExpression__Group_1_0_0__0 : rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3677:1: ( rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 )
            // InternalDmx.g:3678:2: rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1
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
    // InternalDmx.g:3685:1: rule__DAdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3689:1: ( ( () ) )
            // InternalDmx.g:3690:1: ( () )
            {
            // InternalDmx.g:3690:1: ( () )
            // InternalDmx.g:3691:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3692:2: ()
            // InternalDmx.g:3692:3: 
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
    // InternalDmx.g:3700:1: rule__DAdditiveExpression__Group_1_0_0__1 : rule__DAdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3704:1: ( rule__DAdditiveExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3705:2: rule__DAdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3711:1: rule__DAdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3715:1: ( ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3716:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3716:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3717:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3718:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3718:3: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3727:1: rule__DMultiplicativeExpression__Group__0 : rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 ;
    public final void rule__DMultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3731:1: ( rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 )
            // InternalDmx.g:3732:2: rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1
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
    // InternalDmx.g:3739:1: rule__DMultiplicativeExpression__Group__0__Impl : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3743:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:3744:1: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:3744:1: ( ruleDUnaryOperation )
            // InternalDmx.g:3745:2: ruleDUnaryOperation
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
    // InternalDmx.g:3754:1: rule__DMultiplicativeExpression__Group__1 : rule__DMultiplicativeExpression__Group__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3758:1: ( rule__DMultiplicativeExpression__Group__1__Impl )
            // InternalDmx.g:3759:2: rule__DMultiplicativeExpression__Group__1__Impl
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
    // InternalDmx.g:3765:1: rule__DMultiplicativeExpression__Group__1__Impl : ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__DMultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3769:1: ( ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) )
            // InternalDmx.g:3770:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3770:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            // InternalDmx.g:3771:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3772:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 55:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred61_InternalDmx()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalDmx.g:3772:3: rule__DMultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__DMultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalDmx.g:3781:1: rule__DMultiplicativeExpression__Group_1__0 : rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 ;
    public final void rule__DMultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3785:1: ( rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 )
            // InternalDmx.g:3786:2: rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1
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
    // InternalDmx.g:3793:1: rule__DMultiplicativeExpression__Group_1__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3797:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3798:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3798:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            // InternalDmx.g:3799:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3800:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            // InternalDmx.g:3800:3: rule__DMultiplicativeExpression__Group_1_0__0
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
    // InternalDmx.g:3808:1: rule__DMultiplicativeExpression__Group_1__1 : rule__DMultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3812:1: ( rule__DMultiplicativeExpression__Group_1__1__Impl )
            // InternalDmx.g:3813:2: rule__DMultiplicativeExpression__Group_1__1__Impl
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
    // InternalDmx.g:3819:1: rule__DMultiplicativeExpression__Group_1__1__Impl : ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3823:1: ( ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3824:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3824:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3825:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3826:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3826:3: rule__DMultiplicativeExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3835:1: rule__DMultiplicativeExpression__Group_1_0__0 : rule__DMultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3839:1: ( rule__DMultiplicativeExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3840:2: rule__DMultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3846:1: rule__DMultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3850:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3851:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3851:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3852:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3853:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            // InternalDmx.g:3853:3: rule__DMultiplicativeExpression__Group_1_0_0__0
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
    // InternalDmx.g:3862:1: rule__DMultiplicativeExpression__Group_1_0_0__0 : rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3866:1: ( rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 )
            // InternalDmx.g:3867:2: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1
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
    // InternalDmx.g:3874:1: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3878:1: ( ( () ) )
            // InternalDmx.g:3879:1: ( () )
            {
            // InternalDmx.g:3879:1: ( () )
            // InternalDmx.g:3880:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3881:2: ()
            // InternalDmx.g:3881:3: 
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
    // InternalDmx.g:3889:1: rule__DMultiplicativeExpression__Group_1_0_0__1 : rule__DMultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3893:1: ( rule__DMultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3894:2: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3900:1: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3904:1: ( ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3905:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3905:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3906:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3907:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3907:3: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3916:1: rule__DUnaryOperation__Group_0__0 : rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 ;
    public final void rule__DUnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3920:1: ( rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 )
            // InternalDmx.g:3921:2: rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1
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
    // InternalDmx.g:3928:1: rule__DUnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__DUnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3932:1: ( ( () ) )
            // InternalDmx.g:3933:1: ( () )
            {
            // InternalDmx.g:3933:1: ( () )
            // InternalDmx.g:3934:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0()); 
            }
            // InternalDmx.g:3935:2: ()
            // InternalDmx.g:3935:3: 
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
    // InternalDmx.g:3943:1: rule__DUnaryOperation__Group_0__1 : rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 ;
    public final void rule__DUnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3947:1: ( rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 )
            // InternalDmx.g:3948:2: rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2
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
    // InternalDmx.g:3955:1: rule__DUnaryOperation__Group_0__1__Impl : ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__DUnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3959:1: ( ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalDmx.g:3960:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalDmx.g:3960:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            // InternalDmx.g:3961:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalDmx.g:3962:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            // InternalDmx.g:3962:3: rule__DUnaryOperation__OperatorAssignment_0_1
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
    // InternalDmx.g:3970:1: rule__DUnaryOperation__Group_0__2 : rule__DUnaryOperation__Group_0__2__Impl ;
    public final void rule__DUnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3974:1: ( rule__DUnaryOperation__Group_0__2__Impl )
            // InternalDmx.g:3975:2: rule__DUnaryOperation__Group_0__2__Impl
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
    // InternalDmx.g:3981:1: rule__DUnaryOperation__Group_0__2__Impl : ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__DUnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3985:1: ( ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalDmx.g:3986:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalDmx.g:3986:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            // InternalDmx.g:3987:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalDmx.g:3988:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            // InternalDmx.g:3988:3: rule__DUnaryOperation__OperandAssignment_0_2
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
    // InternalDmx.g:3997:1: rule__DCastExpression__Group__0 : rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 ;
    public final void rule__DCastExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4001:1: ( rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 )
            // InternalDmx.g:4002:2: rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1
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
    // InternalDmx.g:4009:1: rule__DCastExpression__Group__0__Impl : ( ruleDTypedMemberReference ) ;
    public final void rule__DCastExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4013:1: ( ( ruleDTypedMemberReference ) )
            // InternalDmx.g:4014:1: ( ruleDTypedMemberReference )
            {
            // InternalDmx.g:4014:1: ( ruleDTypedMemberReference )
            // InternalDmx.g:4015:2: ruleDTypedMemberReference
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
    // InternalDmx.g:4024:1: rule__DCastExpression__Group__1 : rule__DCastExpression__Group__1__Impl ;
    public final void rule__DCastExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4028:1: ( rule__DCastExpression__Group__1__Impl )
            // InternalDmx.g:4029:2: rule__DCastExpression__Group__1__Impl
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
    // InternalDmx.g:4035:1: rule__DCastExpression__Group__1__Impl : ( ( rule__DCastExpression__Group_1__0 )? ) ;
    public final void rule__DCastExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4039:1: ( ( ( rule__DCastExpression__Group_1__0 )? ) )
            // InternalDmx.g:4040:1: ( ( rule__DCastExpression__Group_1__0 )? )
            {
            // InternalDmx.g:4040:1: ( ( rule__DCastExpression__Group_1__0 )? )
            // InternalDmx.g:4041:2: ( rule__DCastExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:4042:2: ( rule__DCastExpression__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred62_InternalDmx()) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==20) ) {
                int LA36_2 = input.LA(2);

                if ( (synpred62_InternalDmx()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalDmx.g:4042:3: rule__DCastExpression__Group_1__0
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
    // InternalDmx.g:4051:1: rule__DCastExpression__Group_1__0 : rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 ;
    public final void rule__DCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4055:1: ( rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 )
            // InternalDmx.g:4056:2: rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1
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
    // InternalDmx.g:4063:1: rule__DCastExpression__Group_1__0__Impl : ( ( rule__DCastExpression__Group_1_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4067:1: ( ( ( rule__DCastExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:4068:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:4068:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            // InternalDmx.g:4069:2: ( rule__DCastExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:4070:2: ( rule__DCastExpression__Group_1_0__0 )
            // InternalDmx.g:4070:3: rule__DCastExpression__Group_1_0__0
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
    // InternalDmx.g:4078:1: rule__DCastExpression__Group_1__1 : rule__DCastExpression__Group_1__1__Impl ;
    public final void rule__DCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4082:1: ( rule__DCastExpression__Group_1__1__Impl )
            // InternalDmx.g:4083:2: rule__DCastExpression__Group_1__1__Impl
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
    // InternalDmx.g:4089:1: rule__DCastExpression__Group_1__1__Impl : ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__DCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4093:1: ( ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) )
            // InternalDmx.g:4094:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            {
            // InternalDmx.g:4094:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            // InternalDmx.g:4095:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalDmx.g:4096:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            // InternalDmx.g:4096:3: rule__DCastExpression__TypeAssignment_1_1
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
    // InternalDmx.g:4105:1: rule__DCastExpression__Group_1_0__0 : rule__DCastExpression__Group_1_0__0__Impl ;
    public final void rule__DCastExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4109:1: ( rule__DCastExpression__Group_1_0__0__Impl )
            // InternalDmx.g:4110:2: rule__DCastExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:4116:1: rule__DCastExpression__Group_1_0__0__Impl : ( ( rule__DCastExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4120:1: ( ( ( rule__DCastExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4121:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4121:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:4122:2: ( rule__DCastExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4123:2: ( rule__DCastExpression__Group_1_0_0__0 )
            // InternalDmx.g:4123:3: rule__DCastExpression__Group_1_0_0__0
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
    // InternalDmx.g:4132:1: rule__DCastExpression__Group_1_0_0__0 : rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 ;
    public final void rule__DCastExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4136:1: ( rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 )
            // InternalDmx.g:4137:2: rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1
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
    // InternalDmx.g:4144:1: rule__DCastExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DCastExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4148:1: ( ( () ) )
            // InternalDmx.g:4149:1: ( () )
            {
            // InternalDmx.g:4149:1: ( () )
            // InternalDmx.g:4150:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()); 
            }
            // InternalDmx.g:4151:2: ()
            // InternalDmx.g:4151:3: 
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
    // InternalDmx.g:4159:1: rule__DCastExpression__Group_1_0_0__1 : rule__DCastExpression__Group_1_0_0__1__Impl ;
    public final void rule__DCastExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4163:1: ( rule__DCastExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:4164:2: rule__DCastExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:4170:1: rule__DCastExpression__Group_1_0_0__1__Impl : ( ruleOpCast ) ;
    public final void rule__DCastExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4174:1: ( ( ruleOpCast ) )
            // InternalDmx.g:4175:1: ( ruleOpCast )
            {
            // InternalDmx.g:4175:1: ( ruleOpCast )
            // InternalDmx.g:4176:2: ruleOpCast
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
    // InternalDmx.g:4186:1: rule__DTypedMemberReference__Group__0 : rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 ;
    public final void rule__DTypedMemberReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4190:1: ( rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 )
            // InternalDmx.g:4191:2: rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1
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
    // InternalDmx.g:4198:1: rule__DTypedMemberReference__Group__0__Impl : ( ruleDPrimaryExpression ) ;
    public final void rule__DTypedMemberReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4202:1: ( ( ruleDPrimaryExpression ) )
            // InternalDmx.g:4203:1: ( ruleDPrimaryExpression )
            {
            // InternalDmx.g:4203:1: ( ruleDPrimaryExpression )
            // InternalDmx.g:4204:2: ruleDPrimaryExpression
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
    // InternalDmx.g:4213:1: rule__DTypedMemberReference__Group__1 : rule__DTypedMemberReference__Group__1__Impl ;
    public final void rule__DTypedMemberReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4217:1: ( rule__DTypedMemberReference__Group__1__Impl )
            // InternalDmx.g:4218:2: rule__DTypedMemberReference__Group__1__Impl
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
    // InternalDmx.g:4224:1: rule__DTypedMemberReference__Group__1__Impl : ( ( rule__DTypedMemberReference__Alternatives_1 )* ) ;
    public final void rule__DTypedMemberReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4228:1: ( ( ( rule__DTypedMemberReference__Alternatives_1 )* ) )
            // InternalDmx.g:4229:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            {
            // InternalDmx.g:4229:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            // InternalDmx.g:4230:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4231:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==66) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalDmx.g:4231:3: rule__DTypedMemberReference__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__DTypedMemberReference__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalDmx.g:4240:1: rule__DTypedMemberReference__Group_1_0__0 : rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4244:1: ( rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 )
            // InternalDmx.g:4245:2: rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1
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
    // InternalDmx.g:4252:1: rule__DTypedMemberReference__Group_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4256:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4257:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4257:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            // InternalDmx.g:4258:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4259:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            // InternalDmx.g:4259:3: rule__DTypedMemberReference__Group_1_0_0__0
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
    // InternalDmx.g:4267:1: rule__DTypedMemberReference__Group_1_0__1 : rule__DTypedMemberReference__Group_1_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4271:1: ( rule__DTypedMemberReference__Group_1_0__1__Impl )
            // InternalDmx.g:4272:2: rule__DTypedMemberReference__Group_1_0__1__Impl
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
    // InternalDmx.g:4278:1: rule__DTypedMemberReference__Group_1_0__1__Impl : ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4282:1: ( ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) )
            // InternalDmx.g:4283:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            {
            // InternalDmx.g:4283:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            // InternalDmx.g:4284:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getValueAssignment_1_0_1()); 
            }
            // InternalDmx.g:4285:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            // InternalDmx.g:4285:3: rule__DTypedMemberReference__ValueAssignment_1_0_1
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
    // InternalDmx.g:4294:1: rule__DTypedMemberReference__Group_1_0_0__0 : rule__DTypedMemberReference__Group_1_0_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4298:1: ( rule__DTypedMemberReference__Group_1_0_0__0__Impl )
            // InternalDmx.g:4299:2: rule__DTypedMemberReference__Group_1_0_0__0__Impl
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
    // InternalDmx.g:4305:1: rule__DTypedMemberReference__Group_1_0_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4309:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:4310:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:4310:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            // InternalDmx.g:4311:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:4312:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            // InternalDmx.g:4312:3: rule__DTypedMemberReference__Group_1_0_0_0__0
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
    // InternalDmx.g:4321:1: rule__DTypedMemberReference__Group_1_0_0_0__0 : rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4325:1: ( rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 )
            // InternalDmx.g:4326:2: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1
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
    // InternalDmx.g:4333:1: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4337:1: ( ( () ) )
            // InternalDmx.g:4338:1: ( () )
            {
            // InternalDmx.g:4338:1: ( () )
            // InternalDmx.g:4339:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:4340:2: ()
            // InternalDmx.g:4340:3: 
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
    // InternalDmx.g:4348:1: rule__DTypedMemberReference__Group_1_0_0_0__1 : rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4352:1: ( rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 )
            // InternalDmx.g:4353:2: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2
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
    // InternalDmx.g:4360:1: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4364:1: ( ( '.' ) )
            // InternalDmx.g:4365:1: ( '.' )
            {
            // InternalDmx.g:4365:1: ( '.' )
            // InternalDmx.g:4366:2: '.'
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
    // InternalDmx.g:4375:1: rule__DTypedMemberReference__Group_1_0_0_0__2 : rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4379:1: ( rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 )
            // InternalDmx.g:4380:2: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3
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
    // InternalDmx.g:4387:1: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4391:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) )
            // InternalDmx.g:4392:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            {
            // InternalDmx.g:4392:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            // InternalDmx.g:4393:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_0_0_0_2()); 
            }
            // InternalDmx.g:4394:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            // InternalDmx.g:4394:3: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2
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
    // InternalDmx.g:4402:1: rule__DTypedMemberReference__Group_1_0_0_0__3 : rule__DTypedMemberReference__Group_1_0_0_0__3__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4406:1: ( rule__DTypedMemberReference__Group_1_0_0_0__3__Impl )
            // InternalDmx.g:4407:2: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl
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
    // InternalDmx.g:4413:1: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4417:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:4418:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:4418:1: ( ruleOpSingleAssign )
            // InternalDmx.g:4419:2: ruleOpSingleAssign
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
    // InternalDmx.g:4429:1: rule__DTypedMemberReference__Group_1_1__0 : rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4433:1: ( rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 )
            // InternalDmx.g:4434:2: rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1
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
    // InternalDmx.g:4441:1: rule__DTypedMemberReference__Group_1_1__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4445:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) )
            // InternalDmx.g:4446:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:4446:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            // InternalDmx.g:4447:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:4448:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            // InternalDmx.g:4448:3: rule__DTypedMemberReference__Group_1_1_0__0
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
    // InternalDmx.g:4456:1: rule__DTypedMemberReference__Group_1_1__1 : rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 ;
    public final void rule__DTypedMemberReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4460:1: ( rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 )
            // InternalDmx.g:4461:2: rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2
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
    // InternalDmx.g:4468:1: rule__DTypedMemberReference__Group_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4472:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) )
            // InternalDmx.g:4473:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            {
            // InternalDmx.g:4473:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            // InternalDmx.g:4474:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_1_1()); 
            }
            // InternalDmx.g:4475:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            // InternalDmx.g:4475:3: rule__DTypedMemberReference__MemberAssignment_1_1_1
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
    // InternalDmx.g:4483:1: rule__DTypedMemberReference__Group_1_1__2 : rule__DTypedMemberReference__Group_1_1__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4487:1: ( rule__DTypedMemberReference__Group_1_1__2__Impl )
            // InternalDmx.g:4488:2: rule__DTypedMemberReference__Group_1_1__2__Impl
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
    // InternalDmx.g:4494:1: rule__DTypedMemberReference__Group_1_1__2__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4498:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? ) )
            // InternalDmx.g:4499:1: ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? )
            {
            // InternalDmx.g:4499:1: ( ( rule__DTypedMemberReference__Group_1_1_2__0 )? )
            // InternalDmx.g:4500:2: ( rule__DTypedMemberReference__Group_1_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2()); 
            }
            // InternalDmx.g:4501:2: ( rule__DTypedMemberReference__Group_1_1_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDmx.g:4501:3: rule__DTypedMemberReference__Group_1_1_2__0
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
    // InternalDmx.g:4510:1: rule__DTypedMemberReference__Group_1_1_0__0 : rule__DTypedMemberReference__Group_1_1_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4514:1: ( rule__DTypedMemberReference__Group_1_1_0__0__Impl )
            // InternalDmx.g:4515:2: rule__DTypedMemberReference__Group_1_1_0__0__Impl
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
    // InternalDmx.g:4521:1: rule__DTypedMemberReference__Group_1_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4525:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:4526:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:4526:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            // InternalDmx.g:4527:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:4528:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            // InternalDmx.g:4528:3: rule__DTypedMemberReference__Group_1_1_0_0__0
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
    // InternalDmx.g:4537:1: rule__DTypedMemberReference__Group_1_1_0_0__0 : rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4541:1: ( rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 )
            // InternalDmx.g:4542:2: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1
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
    // InternalDmx.g:4549:1: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4553:1: ( ( () ) )
            // InternalDmx.g:4554:1: ( () )
            {
            // InternalDmx.g:4554:1: ( () )
            // InternalDmx.g:4555:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:4556:2: ()
            // InternalDmx.g:4556:3: 
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
    // InternalDmx.g:4564:1: rule__DTypedMemberReference__Group_1_1_0_0__1 : rule__DTypedMemberReference__Group_1_1_0_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4568:1: ( rule__DTypedMemberReference__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:4569:2: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:4575:1: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4579:1: ( ( '.' ) )
            // InternalDmx.g:4580:1: ( '.' )
            {
            // InternalDmx.g:4580:1: ( '.' )
            // InternalDmx.g:4581:2: '.'
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
    // InternalDmx.g:4591:1: rule__DTypedMemberReference__Group_1_1_2__0 : rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4595:1: ( rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1 )
            // InternalDmx.g:4596:2: rule__DTypedMemberReference__Group_1_1_2__0__Impl rule__DTypedMemberReference__Group_1_1_2__1
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
    // InternalDmx.g:4603:1: rule__DTypedMemberReference__Group_1_1_2__0__Impl : ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4607:1: ( ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) ) )
            // InternalDmx.g:4608:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) )
            {
            // InternalDmx.g:4608:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 ) )
            // InternalDmx.g:4609:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0()); 
            }
            // InternalDmx.g:4610:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 )
            // InternalDmx.g:4610:3: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0
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
    // InternalDmx.g:4618:1: rule__DTypedMemberReference__Group_1_1_2__1 : rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2 ;
    public final void rule__DTypedMemberReference__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4622:1: ( rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2 )
            // InternalDmx.g:4623:2: rule__DTypedMemberReference__Group_1_1_2__1__Impl rule__DTypedMemberReference__Group_1_1_2__2
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
    // InternalDmx.g:4630:1: rule__DTypedMemberReference__Group_1_1_2__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4634:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? ) )
            // InternalDmx.g:4635:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? )
            {
            // InternalDmx.g:4635:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1__0 )? )
            // InternalDmx.g:4636:2: ( rule__DTypedMemberReference__Group_1_1_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1()); 
            }
            // InternalDmx.g:4637:2: ( rule__DTypedMemberReference__Group_1_1_2_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_NATURAL||(LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||(LA39_0>=21 && LA39_0<=32)||(LA39_0>=35 && LA39_0<=36)||(LA39_0>=59 && LA39_0<=61)||(LA39_0>=69 && LA39_0<=70)||(LA39_0>=75 && LA39_0<=77)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmx.g:4637:3: rule__DTypedMemberReference__Group_1_1_2_1__0
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
    // InternalDmx.g:4645:1: rule__DTypedMemberReference__Group_1_1_2__2 : rule__DTypedMemberReference__Group_1_1_2__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4649:1: ( rule__DTypedMemberReference__Group_1_1_2__2__Impl )
            // InternalDmx.g:4650:2: rule__DTypedMemberReference__Group_1_1_2__2__Impl
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
    // InternalDmx.g:4656:1: rule__DTypedMemberReference__Group_1_1_2__2__Impl : ( ')' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4660:1: ( ( ')' ) )
            // InternalDmx.g:4661:1: ( ')' )
            {
            // InternalDmx.g:4661:1: ( ')' )
            // InternalDmx.g:4662:2: ')'
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
    // InternalDmx.g:4672:1: rule__DTypedMemberReference__Group_1_1_2_1__0 : rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4676:1: ( rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1 )
            // InternalDmx.g:4677:2: rule__DTypedMemberReference__Group_1_1_2_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1__1
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
    // InternalDmx.g:4684:1: rule__DTypedMemberReference__Group_1_1_2_1__0__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4688:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) ) )
            // InternalDmx.g:4689:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) )
            {
            // InternalDmx.g:4689:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 ) )
            // InternalDmx.g:4690:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_0()); 
            }
            // InternalDmx.g:4691:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 )
            // InternalDmx.g:4691:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0
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
    // InternalDmx.g:4699:1: rule__DTypedMemberReference__Group_1_1_2_1__1 : rule__DTypedMemberReference__Group_1_1_2_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4703:1: ( rule__DTypedMemberReference__Group_1_1_2_1__1__Impl )
            // InternalDmx.g:4704:2: rule__DTypedMemberReference__Group_1_1_2_1__1__Impl
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
    // InternalDmx.g:4710:1: rule__DTypedMemberReference__Group_1_1_2_1__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4714:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* ) )
            // InternalDmx.g:4715:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* )
            {
            // InternalDmx.g:4715:1: ( ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )* )
            // InternalDmx.g:4716:2: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_1_1()); 
            }
            // InternalDmx.g:4717:2: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==68) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDmx.g:4717:3: rule__DTypedMemberReference__Group_1_1_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DTypedMemberReference__Group_1_1_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalDmx.g:4726:1: rule__DTypedMemberReference__Group_1_1_2_1_1__0 : rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4730:1: ( rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1 )
            // InternalDmx.g:4731:2: rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_1_1__1
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
    // InternalDmx.g:4738:1: rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4742:1: ( ( ',' ) )
            // InternalDmx.g:4743:1: ( ',' )
            {
            // InternalDmx.g:4743:1: ( ',' )
            // InternalDmx.g:4744:2: ','
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
    // InternalDmx.g:4753:1: rule__DTypedMemberReference__Group_1_1_2_1_1__1 : rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4757:1: ( rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl )
            // InternalDmx.g:4758:2: rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl
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
    // InternalDmx.g:4764:1: rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4768:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) ) )
            // InternalDmx.g:4769:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) )
            {
            // InternalDmx.g:4769:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 ) )
            // InternalDmx.g:4770:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_1_1_1()); 
            }
            // InternalDmx.g:4771:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 )
            // InternalDmx.g:4771:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1
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
    // InternalDmx.g:4780:1: rule__DSelfExpression__Group__0 : rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 ;
    public final void rule__DSelfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4784:1: ( rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 )
            // InternalDmx.g:4785:2: rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1
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
    // InternalDmx.g:4792:1: rule__DSelfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DSelfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4796:1: ( ( () ) )
            // InternalDmx.g:4797:1: ( () )
            {
            // InternalDmx.g:4797:1: ( () )
            // InternalDmx.g:4798:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0()); 
            }
            // InternalDmx.g:4799:2: ()
            // InternalDmx.g:4799:3: 
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
    // InternalDmx.g:4807:1: rule__DSelfExpression__Group__1 : rule__DSelfExpression__Group__1__Impl ;
    public final void rule__DSelfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4811:1: ( rule__DSelfExpression__Group__1__Impl )
            // InternalDmx.g:4812:2: rule__DSelfExpression__Group__1__Impl
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
    // InternalDmx.g:4818:1: rule__DSelfExpression__Group__1__Impl : ( ( rule__DSelfExpression__Alternatives_1 ) ) ;
    public final void rule__DSelfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4822:1: ( ( ( rule__DSelfExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4823:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4823:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            // InternalDmx.g:4824:2: ( rule__DSelfExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4825:2: ( rule__DSelfExpression__Alternatives_1 )
            // InternalDmx.g:4825:3: rule__DSelfExpression__Alternatives_1
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
    // InternalDmx.g:4834:1: rule__DReturnExpression__Group__0 : rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 ;
    public final void rule__DReturnExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4838:1: ( rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 )
            // InternalDmx.g:4839:2: rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1
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
    // InternalDmx.g:4846:1: rule__DReturnExpression__Group__0__Impl : ( () ) ;
    public final void rule__DReturnExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4850:1: ( ( () ) )
            // InternalDmx.g:4851:1: ( () )
            {
            // InternalDmx.g:4851:1: ( () )
            // InternalDmx.g:4852:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0()); 
            }
            // InternalDmx.g:4853:2: ()
            // InternalDmx.g:4853:3: 
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
    // InternalDmx.g:4861:1: rule__DReturnExpression__Group__1 : rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 ;
    public final void rule__DReturnExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4865:1: ( rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 )
            // InternalDmx.g:4866:2: rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2
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
    // InternalDmx.g:4873:1: rule__DReturnExpression__Group__1__Impl : ( ( rule__DReturnExpression__Alternatives_1 ) ) ;
    public final void rule__DReturnExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4877:1: ( ( ( rule__DReturnExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4878:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4878:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            // InternalDmx.g:4879:2: ( rule__DReturnExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4880:2: ( rule__DReturnExpression__Alternatives_1 )
            // InternalDmx.g:4880:3: rule__DReturnExpression__Alternatives_1
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
    // InternalDmx.g:4888:1: rule__DReturnExpression__Group__2 : rule__DReturnExpression__Group__2__Impl ;
    public final void rule__DReturnExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4892:1: ( rule__DReturnExpression__Group__2__Impl )
            // InternalDmx.g:4893:2: rule__DReturnExpression__Group__2__Impl
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
    // InternalDmx.g:4899:1: rule__DReturnExpression__Group__2__Impl : ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) ;
    public final void rule__DReturnExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4903:1: ( ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) )
            // InternalDmx.g:4904:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            {
            // InternalDmx.g:4904:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            // InternalDmx.g:4905:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:4906:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalDmx.g:4906:3: rule__DReturnExpression__ExpressionAssignment_2
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
    // InternalDmx.g:4915:1: rule__DRaiseExpression__Group__0 : rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 ;
    public final void rule__DRaiseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4919:1: ( rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 )
            // InternalDmx.g:4920:2: rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1
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
    // InternalDmx.g:4927:1: rule__DRaiseExpression__Group__0__Impl : ( () ) ;
    public final void rule__DRaiseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4931:1: ( ( () ) )
            // InternalDmx.g:4932:1: ( () )
            {
            // InternalDmx.g:4932:1: ( () )
            // InternalDmx.g:4933:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0()); 
            }
            // InternalDmx.g:4934:2: ()
            // InternalDmx.g:4934:3: 
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
    // InternalDmx.g:4942:1: rule__DRaiseExpression__Group__1 : rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 ;
    public final void rule__DRaiseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4946:1: ( rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 )
            // InternalDmx.g:4947:2: rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2
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
    // InternalDmx.g:4954:1: rule__DRaiseExpression__Group__1__Impl : ( ( rule__DRaiseExpression__Alternatives_1 ) ) ;
    public final void rule__DRaiseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4958:1: ( ( ( rule__DRaiseExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4959:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4959:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            // InternalDmx.g:4960:2: ( rule__DRaiseExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4961:2: ( rule__DRaiseExpression__Alternatives_1 )
            // InternalDmx.g:4961:3: rule__DRaiseExpression__Alternatives_1
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
    // InternalDmx.g:4969:1: rule__DRaiseExpression__Group__2 : rule__DRaiseExpression__Group__2__Impl ;
    public final void rule__DRaiseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4973:1: ( rule__DRaiseExpression__Group__2__Impl )
            // InternalDmx.g:4974:2: rule__DRaiseExpression__Group__2__Impl
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
    // InternalDmx.g:4980:1: rule__DRaiseExpression__Group__2__Impl : ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__DRaiseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4984:1: ( ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) )
            // InternalDmx.g:4985:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            {
            // InternalDmx.g:4985:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            // InternalDmx.g:4986:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:4987:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            // InternalDmx.g:4987:3: rule__DRaiseExpression__ExpressionAssignment_2
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
    // InternalDmx.g:4996:1: rule__DParenthesizedExpression__Group__0 : rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 ;
    public final void rule__DParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5000:1: ( rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 )
            // InternalDmx.g:5001:2: rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1
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
    // InternalDmx.g:5008:1: rule__DParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__DParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5012:1: ( ( '(' ) )
            // InternalDmx.g:5013:1: ( '(' )
            {
            // InternalDmx.g:5013:1: ( '(' )
            // InternalDmx.g:5014:2: '('
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
    // InternalDmx.g:5023:1: rule__DParenthesizedExpression__Group__1 : rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 ;
    public final void rule__DParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5027:1: ( rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 )
            // InternalDmx.g:5028:2: rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2
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
    // InternalDmx.g:5035:1: rule__DParenthesizedExpression__Group__1__Impl : ( ruleDExpression ) ;
    public final void rule__DParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5039:1: ( ( ruleDExpression ) )
            // InternalDmx.g:5040:1: ( ruleDExpression )
            {
            // InternalDmx.g:5040:1: ( ruleDExpression )
            // InternalDmx.g:5041:2: ruleDExpression
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
    // InternalDmx.g:5050:1: rule__DParenthesizedExpression__Group__2 : rule__DParenthesizedExpression__Group__2__Impl ;
    public final void rule__DParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5054:1: ( rule__DParenthesizedExpression__Group__2__Impl )
            // InternalDmx.g:5055:2: rule__DParenthesizedExpression__Group__2__Impl
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
    // InternalDmx.g:5061:1: rule__DParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__DParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5065:1: ( ( ')' ) )
            // InternalDmx.g:5066:1: ( ')' )
            {
            // InternalDmx.g:5066:1: ( ')' )
            // InternalDmx.g:5067:2: ')'
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
    // InternalDmx.g:5077:1: rule__DFunctionCall__Group__0 : rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 ;
    public final void rule__DFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5081:1: ( rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 )
            // InternalDmx.g:5082:2: rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1
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
    // InternalDmx.g:5089:1: rule__DFunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__DFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5093:1: ( ( () ) )
            // InternalDmx.g:5094:1: ( () )
            {
            // InternalDmx.g:5094:1: ( () )
            // InternalDmx.g:5095:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0()); 
            }
            // InternalDmx.g:5096:2: ()
            // InternalDmx.g:5096:3: 
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
    // InternalDmx.g:5104:1: rule__DFunctionCall__Group__1 : rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 ;
    public final void rule__DFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5108:1: ( rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 )
            // InternalDmx.g:5109:2: rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2
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
    // InternalDmx.g:5116:1: rule__DFunctionCall__Group__1__Impl : ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__DFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5120:1: ( ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) )
            // InternalDmx.g:5121:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            {
            // InternalDmx.g:5121:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            // InternalDmx.g:5122:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // InternalDmx.g:5123:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            // InternalDmx.g:5123:3: rule__DFunctionCall__FunctionAssignment_1
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
    // InternalDmx.g:5131:1: rule__DFunctionCall__Group__2 : rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 ;
    public final void rule__DFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5135:1: ( rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 )
            // InternalDmx.g:5136:2: rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3
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
    // InternalDmx.g:5143:1: rule__DFunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__DFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5147:1: ( ( '(' ) )
            // InternalDmx.g:5148:1: ( '(' )
            {
            // InternalDmx.g:5148:1: ( '(' )
            // InternalDmx.g:5149:2: '('
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
    // InternalDmx.g:5158:1: rule__DFunctionCall__Group__3 : rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 ;
    public final void rule__DFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5162:1: ( rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 )
            // InternalDmx.g:5163:2: rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4
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
    // InternalDmx.g:5170:1: rule__DFunctionCall__Group__3__Impl : ( ( rule__DFunctionCall__Group_3__0 )? ) ;
    public final void rule__DFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5174:1: ( ( ( rule__DFunctionCall__Group_3__0 )? ) )
            // InternalDmx.g:5175:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            {
            // InternalDmx.g:5175:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            // InternalDmx.g:5176:2: ( rule__DFunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5177:2: ( rule__DFunctionCall__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_NATURAL||(LA42_0>=RULE_ID && LA42_0<=RULE_STRING)||(LA42_0>=21 && LA42_0<=32)||(LA42_0>=35 && LA42_0<=36)||(LA42_0>=59 && LA42_0<=61)||(LA42_0>=69 && LA42_0<=70)||(LA42_0>=75 && LA42_0<=77)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDmx.g:5177:3: rule__DFunctionCall__Group_3__0
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
    // InternalDmx.g:5185:1: rule__DFunctionCall__Group__4 : rule__DFunctionCall__Group__4__Impl ;
    public final void rule__DFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5189:1: ( rule__DFunctionCall__Group__4__Impl )
            // InternalDmx.g:5190:2: rule__DFunctionCall__Group__4__Impl
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
    // InternalDmx.g:5196:1: rule__DFunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__DFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5200:1: ( ( ')' ) )
            // InternalDmx.g:5201:1: ( ')' )
            {
            // InternalDmx.g:5201:1: ( ')' )
            // InternalDmx.g:5202:2: ')'
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
    // InternalDmx.g:5212:1: rule__DFunctionCall__Group_3__0 : rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 ;
    public final void rule__DFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5216:1: ( rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 )
            // InternalDmx.g:5217:2: rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1
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
    // InternalDmx.g:5224:1: rule__DFunctionCall__Group_3__0__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) ;
    public final void rule__DFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5228:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) )
            // InternalDmx.g:5229:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            {
            // InternalDmx.g:5229:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            // InternalDmx.g:5230:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0()); 
            }
            // InternalDmx.g:5231:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            // InternalDmx.g:5231:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0
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
    // InternalDmx.g:5239:1: rule__DFunctionCall__Group_3__1 : rule__DFunctionCall__Group_3__1__Impl ;
    public final void rule__DFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5243:1: ( rule__DFunctionCall__Group_3__1__Impl )
            // InternalDmx.g:5244:2: rule__DFunctionCall__Group_3__1__Impl
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
    // InternalDmx.g:5250:1: rule__DFunctionCall__Group_3__1__Impl : ( ( rule__DFunctionCall__Group_3_1__0 )* ) ;
    public final void rule__DFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5254:1: ( ( ( rule__DFunctionCall__Group_3_1__0 )* ) )
            // InternalDmx.g:5255:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            {
            // InternalDmx.g:5255:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            // InternalDmx.g:5256:2: ( rule__DFunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5257:2: ( rule__DFunctionCall__Group_3_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==68) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDmx.g:5257:3: rule__DFunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DFunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalDmx.g:5266:1: rule__DFunctionCall__Group_3_1__0 : rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 ;
    public final void rule__DFunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5270:1: ( rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 )
            // InternalDmx.g:5271:2: rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1
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
    // InternalDmx.g:5278:1: rule__DFunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DFunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5282:1: ( ( ',' ) )
            // InternalDmx.g:5283:1: ( ',' )
            {
            // InternalDmx.g:5283:1: ( ',' )
            // InternalDmx.g:5284:2: ','
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
    // InternalDmx.g:5293:1: rule__DFunctionCall__Group_3_1__1 : rule__DFunctionCall__Group_3_1__1__Impl ;
    public final void rule__DFunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5297:1: ( rule__DFunctionCall__Group_3_1__1__Impl )
            // InternalDmx.g:5298:2: rule__DFunctionCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5304:1: rule__DFunctionCall__Group_3_1__1__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__DFunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5308:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) )
            // InternalDmx.g:5309:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            {
            // InternalDmx.g:5309:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            // InternalDmx.g:5310:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1()); 
            }
            // InternalDmx.g:5311:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            // InternalDmx.g:5311:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1
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
    // InternalDmx.g:5320:1: rule__DConstructorCall__Group__0 : rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 ;
    public final void rule__DConstructorCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5324:1: ( rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 )
            // InternalDmx.g:5325:2: rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1
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
    // InternalDmx.g:5332:1: rule__DConstructorCall__Group__0__Impl : ( () ) ;
    public final void rule__DConstructorCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5336:1: ( ( () ) )
            // InternalDmx.g:5337:1: ( () )
            {
            // InternalDmx.g:5337:1: ( () )
            // InternalDmx.g:5338:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0()); 
            }
            // InternalDmx.g:5339:2: ()
            // InternalDmx.g:5339:3: 
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
    // InternalDmx.g:5347:1: rule__DConstructorCall__Group__1 : rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 ;
    public final void rule__DConstructorCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5351:1: ( rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 )
            // InternalDmx.g:5352:2: rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2
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
    // InternalDmx.g:5359:1: rule__DConstructorCall__Group__1__Impl : ( ruleOpConstructor ) ;
    public final void rule__DConstructorCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5363:1: ( ( ruleOpConstructor ) )
            // InternalDmx.g:5364:1: ( ruleOpConstructor )
            {
            // InternalDmx.g:5364:1: ( ruleOpConstructor )
            // InternalDmx.g:5365:2: ruleOpConstructor
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
    // InternalDmx.g:5374:1: rule__DConstructorCall__Group__2 : rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 ;
    public final void rule__DConstructorCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5378:1: ( rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 )
            // InternalDmx.g:5379:2: rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3
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
    // InternalDmx.g:5386:1: rule__DConstructorCall__Group__2__Impl : ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) ;
    public final void rule__DConstructorCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5390:1: ( ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) )
            // InternalDmx.g:5391:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            {
            // InternalDmx.g:5391:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            // InternalDmx.g:5392:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2()); 
            }
            // InternalDmx.g:5393:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            // InternalDmx.g:5393:3: rule__DConstructorCall__ConstructorAssignment_2
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
    // InternalDmx.g:5401:1: rule__DConstructorCall__Group__3 : rule__DConstructorCall__Group__3__Impl ;
    public final void rule__DConstructorCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5405:1: ( rule__DConstructorCall__Group__3__Impl )
            // InternalDmx.g:5406:2: rule__DConstructorCall__Group__3__Impl
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
    // InternalDmx.g:5412:1: rule__DConstructorCall__Group__3__Impl : ( ( rule__DConstructorCall__Group_3__0 )? ) ;
    public final void rule__DConstructorCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5416:1: ( ( ( rule__DConstructorCall__Group_3__0 )? ) )
            // InternalDmx.g:5417:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            {
            // InternalDmx.g:5417:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            // InternalDmx.g:5418:2: ( rule__DConstructorCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5419:2: ( rule__DConstructorCall__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDmx.g:5419:3: rule__DConstructorCall__Group_3__0
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
    // InternalDmx.g:5428:1: rule__DConstructorCall__Group_3__0 : rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 ;
    public final void rule__DConstructorCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5432:1: ( rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 )
            // InternalDmx.g:5433:2: rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1
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
    // InternalDmx.g:5440:1: rule__DConstructorCall__Group_3__0__Impl : ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) ;
    public final void rule__DConstructorCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5444:1: ( ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) )
            // InternalDmx.g:5445:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            {
            // InternalDmx.g:5445:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            // InternalDmx.g:5446:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0()); 
            }
            // InternalDmx.g:5447:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            // InternalDmx.g:5447:3: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0
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
    // InternalDmx.g:5455:1: rule__DConstructorCall__Group_3__1 : rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 ;
    public final void rule__DConstructorCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5459:1: ( rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 )
            // InternalDmx.g:5460:2: rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2
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
    // InternalDmx.g:5467:1: rule__DConstructorCall__Group_3__1__Impl : ( ( rule__DConstructorCall__Group_3_1__0 )? ) ;
    public final void rule__DConstructorCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5471:1: ( ( ( rule__DConstructorCall__Group_3_1__0 )? ) )
            // InternalDmx.g:5472:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            {
            // InternalDmx.g:5472:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            // InternalDmx.g:5473:2: ( rule__DConstructorCall__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5474:2: ( rule__DConstructorCall__Group_3_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_NATURAL||(LA45_0>=RULE_ID && LA45_0<=RULE_STRING)||(LA45_0>=21 && LA45_0<=32)||(LA45_0>=35 && LA45_0<=36)||(LA45_0>=59 && LA45_0<=61)||(LA45_0>=69 && LA45_0<=70)||(LA45_0>=75 && LA45_0<=77)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmx.g:5474:3: rule__DConstructorCall__Group_3_1__0
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
    // InternalDmx.g:5482:1: rule__DConstructorCall__Group_3__2 : rule__DConstructorCall__Group_3__2__Impl ;
    public final void rule__DConstructorCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5486:1: ( rule__DConstructorCall__Group_3__2__Impl )
            // InternalDmx.g:5487:2: rule__DConstructorCall__Group_3__2__Impl
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
    // InternalDmx.g:5493:1: rule__DConstructorCall__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DConstructorCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5497:1: ( ( ')' ) )
            // InternalDmx.g:5498:1: ( ')' )
            {
            // InternalDmx.g:5498:1: ( ')' )
            // InternalDmx.g:5499:2: ')'
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
    // InternalDmx.g:5509:1: rule__DConstructorCall__Group_3_1__0 : rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 ;
    public final void rule__DConstructorCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5513:1: ( rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 )
            // InternalDmx.g:5514:2: rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1
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
    // InternalDmx.g:5521:1: rule__DConstructorCall__Group_3_1__0__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) ;
    public final void rule__DConstructorCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5525:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) )
            // InternalDmx.g:5526:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            {
            // InternalDmx.g:5526:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            // InternalDmx.g:5527:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0()); 
            }
            // InternalDmx.g:5528:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            // InternalDmx.g:5528:3: rule__DConstructorCall__ArgumentsAssignment_3_1_0
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
    // InternalDmx.g:5536:1: rule__DConstructorCall__Group_3_1__1 : rule__DConstructorCall__Group_3_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5540:1: ( rule__DConstructorCall__Group_3_1__1__Impl )
            // InternalDmx.g:5541:2: rule__DConstructorCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5547:1: rule__DConstructorCall__Group_3_1__1__Impl : ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) ;
    public final void rule__DConstructorCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5551:1: ( ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) )
            // InternalDmx.g:5552:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            {
            // InternalDmx.g:5552:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            // InternalDmx.g:5553:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1()); 
            }
            // InternalDmx.g:5554:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==68) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDmx.g:5554:3: rule__DConstructorCall__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__DConstructorCall__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalDmx.g:5563:1: rule__DConstructorCall__Group_3_1_1__0 : rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 ;
    public final void rule__DConstructorCall__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5567:1: ( rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 )
            // InternalDmx.g:5568:2: rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1
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
    // InternalDmx.g:5575:1: rule__DConstructorCall__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DConstructorCall__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5579:1: ( ( ',' ) )
            // InternalDmx.g:5580:1: ( ',' )
            {
            // InternalDmx.g:5580:1: ( ',' )
            // InternalDmx.g:5581:2: ','
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
    // InternalDmx.g:5590:1: rule__DConstructorCall__Group_3_1_1__1 : rule__DConstructorCall__Group_3_1_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5594:1: ( rule__DConstructorCall__Group_3_1_1__1__Impl )
            // InternalDmx.g:5595:2: rule__DConstructorCall__Group_3_1_1__1__Impl
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
    // InternalDmx.g:5601:1: rule__DConstructorCall__Group_3_1_1__1__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) ;
    public final void rule__DConstructorCall__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5605:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) )
            // InternalDmx.g:5606:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            {
            // InternalDmx.g:5606:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            // InternalDmx.g:5607:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1()); 
            }
            // InternalDmx.g:5608:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            // InternalDmx.g:5608:3: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1
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
    // InternalDmx.g:5617:1: rule__DContextReference__Group__0 : rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 ;
    public final void rule__DContextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5621:1: ( rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 )
            // InternalDmx.g:5622:2: rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1
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
    // InternalDmx.g:5629:1: rule__DContextReference__Group__0__Impl : ( () ) ;
    public final void rule__DContextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5633:1: ( ( () ) )
            // InternalDmx.g:5634:1: ( () )
            {
            // InternalDmx.g:5634:1: ( () )
            // InternalDmx.g:5635:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0()); 
            }
            // InternalDmx.g:5636:2: ()
            // InternalDmx.g:5636:3: 
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
    // InternalDmx.g:5644:1: rule__DContextReference__Group__1 : rule__DContextReference__Group__1__Impl ;
    public final void rule__DContextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5648:1: ( rule__DContextReference__Group__1__Impl )
            // InternalDmx.g:5649:2: rule__DContextReference__Group__1__Impl
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
    // InternalDmx.g:5655:1: rule__DContextReference__Group__1__Impl : ( ( rule__DContextReference__ContextElementAssignment_1 ) ) ;
    public final void rule__DContextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5659:1: ( ( ( rule__DContextReference__ContextElementAssignment_1 ) ) )
            // InternalDmx.g:5660:1: ( ( rule__DContextReference__ContextElementAssignment_1 ) )
            {
            // InternalDmx.g:5660:1: ( ( rule__DContextReference__ContextElementAssignment_1 ) )
            // InternalDmx.g:5661:2: ( rule__DContextReference__ContextElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getContextElementAssignment_1()); 
            }
            // InternalDmx.g:5662:2: ( rule__DContextReference__ContextElementAssignment_1 )
            // InternalDmx.g:5662:3: rule__DContextReference__ContextElementAssignment_1
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
    // InternalDmx.g:5671:1: rule__DIfExpression__Group__0 : rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 ;
    public final void rule__DIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5675:1: ( rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 )
            // InternalDmx.g:5676:2: rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1
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
    // InternalDmx.g:5683:1: rule__DIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5687:1: ( ( () ) )
            // InternalDmx.g:5688:1: ( () )
            {
            // InternalDmx.g:5688:1: ( () )
            // InternalDmx.g:5689:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0()); 
            }
            // InternalDmx.g:5690:2: ()
            // InternalDmx.g:5690:3: 
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
    // InternalDmx.g:5698:1: rule__DIfExpression__Group__1 : rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 ;
    public final void rule__DIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5702:1: ( rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 )
            // InternalDmx.g:5703:2: rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2
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
    // InternalDmx.g:5710:1: rule__DIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__DIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5714:1: ( ( 'if' ) )
            // InternalDmx.g:5715:1: ( 'if' )
            {
            // InternalDmx.g:5715:1: ( 'if' )
            // InternalDmx.g:5716:2: 'if'
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
    // InternalDmx.g:5725:1: rule__DIfExpression__Group__2 : rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 ;
    public final void rule__DIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5729:1: ( rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 )
            // InternalDmx.g:5730:2: rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3
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
    // InternalDmx.g:5737:1: rule__DIfExpression__Group__2__Impl : ( ( rule__DIfExpression__IfAssignment_2 ) ) ;
    public final void rule__DIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5741:1: ( ( ( rule__DIfExpression__IfAssignment_2 ) ) )
            // InternalDmx.g:5742:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            {
            // InternalDmx.g:5742:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            // InternalDmx.g:5743:2: ( rule__DIfExpression__IfAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfAssignment_2()); 
            }
            // InternalDmx.g:5744:2: ( rule__DIfExpression__IfAssignment_2 )
            // InternalDmx.g:5744:3: rule__DIfExpression__IfAssignment_2
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
    // InternalDmx.g:5752:1: rule__DIfExpression__Group__3 : rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 ;
    public final void rule__DIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5756:1: ( rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 )
            // InternalDmx.g:5757:2: rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4
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
    // InternalDmx.g:5764:1: rule__DIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__DIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5768:1: ( ( 'then' ) )
            // InternalDmx.g:5769:1: ( 'then' )
            {
            // InternalDmx.g:5769:1: ( 'then' )
            // InternalDmx.g:5770:2: 'then'
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
    // InternalDmx.g:5779:1: rule__DIfExpression__Group__4 : rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 ;
    public final void rule__DIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5783:1: ( rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 )
            // InternalDmx.g:5784:2: rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5
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
    // InternalDmx.g:5791:1: rule__DIfExpression__Group__4__Impl : ( ( rule__DIfExpression__ThenAssignment_4 ) ) ;
    public final void rule__DIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5795:1: ( ( ( rule__DIfExpression__ThenAssignment_4 ) ) )
            // InternalDmx.g:5796:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            {
            // InternalDmx.g:5796:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            // InternalDmx.g:5797:2: ( rule__DIfExpression__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenAssignment_4()); 
            }
            // InternalDmx.g:5798:2: ( rule__DIfExpression__ThenAssignment_4 )
            // InternalDmx.g:5798:3: rule__DIfExpression__ThenAssignment_4
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
    // InternalDmx.g:5806:1: rule__DIfExpression__Group__5 : rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 ;
    public final void rule__DIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5810:1: ( rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 )
            // InternalDmx.g:5811:2: rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6
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
    // InternalDmx.g:5818:1: rule__DIfExpression__Group__5__Impl : ( ( rule__DIfExpression__Group_5__0 )? ) ;
    public final void rule__DIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5822:1: ( ( ( rule__DIfExpression__Group_5__0 )? ) )
            // InternalDmx.g:5823:1: ( ( rule__DIfExpression__Group_5__0 )? )
            {
            // InternalDmx.g:5823:1: ( ( rule__DIfExpression__Group_5__0 )? )
            // InternalDmx.g:5824:2: ( rule__DIfExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getGroup_5()); 
            }
            // InternalDmx.g:5825:2: ( rule__DIfExpression__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmx.g:5825:3: rule__DIfExpression__Group_5__0
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
    // InternalDmx.g:5833:1: rule__DIfExpression__Group__6 : rule__DIfExpression__Group__6__Impl ;
    public final void rule__DIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5837:1: ( rule__DIfExpression__Group__6__Impl )
            // InternalDmx.g:5838:2: rule__DIfExpression__Group__6__Impl
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
    // InternalDmx.g:5844:1: rule__DIfExpression__Group__6__Impl : ( 'end' ) ;
    public final void rule__DIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5848:1: ( ( 'end' ) )
            // InternalDmx.g:5849:1: ( 'end' )
            {
            // InternalDmx.g:5849:1: ( 'end' )
            // InternalDmx.g:5850:2: 'end'
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
    // InternalDmx.g:5860:1: rule__DIfExpression__Group_5__0 : rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 ;
    public final void rule__DIfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5864:1: ( rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 )
            // InternalDmx.g:5865:2: rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1
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
    // InternalDmx.g:5872:1: rule__DIfExpression__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__DIfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5876:1: ( ( ( 'else' ) ) )
            // InternalDmx.g:5877:1: ( ( 'else' ) )
            {
            // InternalDmx.g:5877:1: ( ( 'else' ) )
            // InternalDmx.g:5878:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0()); 
            }
            // InternalDmx.g:5879:2: ( 'else' )
            // InternalDmx.g:5879:3: 'else'
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
    // InternalDmx.g:5887:1: rule__DIfExpression__Group_5__1 : rule__DIfExpression__Group_5__1__Impl ;
    public final void rule__DIfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5891:1: ( rule__DIfExpression__Group_5__1__Impl )
            // InternalDmx.g:5892:2: rule__DIfExpression__Group_5__1__Impl
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
    // InternalDmx.g:5898:1: rule__DIfExpression__Group_5__1__Impl : ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) ;
    public final void rule__DIfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5902:1: ( ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) )
            // InternalDmx.g:5903:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            {
            // InternalDmx.g:5903:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            // InternalDmx.g:5904:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1()); 
            }
            // InternalDmx.g:5905:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            // InternalDmx.g:5905:3: rule__DIfExpression__ElseAssignment_5_1
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
    // InternalDmx.g:5914:1: rule__DForLoopExpression__Group__0 : rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 ;
    public final void rule__DForLoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5918:1: ( rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 )
            // InternalDmx.g:5919:2: rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1
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
    // InternalDmx.g:5926:1: rule__DForLoopExpression__Group__0__Impl : ( ( rule__DForLoopExpression__Group_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5930:1: ( ( ( rule__DForLoopExpression__Group_0__0 ) ) )
            // InternalDmx.g:5931:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            {
            // InternalDmx.g:5931:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            // InternalDmx.g:5932:2: ( rule__DForLoopExpression__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0()); 
            }
            // InternalDmx.g:5933:2: ( rule__DForLoopExpression__Group_0__0 )
            // InternalDmx.g:5933:3: rule__DForLoopExpression__Group_0__0
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
    // InternalDmx.g:5941:1: rule__DForLoopExpression__Group__1 : rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 ;
    public final void rule__DForLoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5945:1: ( rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 )
            // InternalDmx.g:5946:2: rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2
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
    // InternalDmx.g:5953:1: rule__DForLoopExpression__Group__1__Impl : ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) ;
    public final void rule__DForLoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5957:1: ( ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) )
            // InternalDmx.g:5958:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            {
            // InternalDmx.g:5958:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            // InternalDmx.g:5959:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1()); 
            }
            // InternalDmx.g:5960:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            // InternalDmx.g:5960:3: rule__DForLoopExpression__ForExpressionAssignment_1
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
    // InternalDmx.g:5968:1: rule__DForLoopExpression__Group__2 : rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 ;
    public final void rule__DForLoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5972:1: ( rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 )
            // InternalDmx.g:5973:2: rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3
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
    // InternalDmx.g:5980:1: rule__DForLoopExpression__Group__2__Impl : ( 'do' ) ;
    public final void rule__DForLoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5984:1: ( ( 'do' ) )
            // InternalDmx.g:5985:1: ( 'do' )
            {
            // InternalDmx.g:5985:1: ( 'do' )
            // InternalDmx.g:5986:2: 'do'
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
    // InternalDmx.g:5995:1: rule__DForLoopExpression__Group__3 : rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 ;
    public final void rule__DForLoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5999:1: ( rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 )
            // InternalDmx.g:6000:2: rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4
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
    // InternalDmx.g:6007:1: rule__DForLoopExpression__Group__3__Impl : ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) ;
    public final void rule__DForLoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6011:1: ( ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) )
            // InternalDmx.g:6012:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            {
            // InternalDmx.g:6012:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            // InternalDmx.g:6013:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3()); 
            }
            // InternalDmx.g:6014:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            // InternalDmx.g:6014:3: rule__DForLoopExpression__EachExpressionAssignment_3
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
    // InternalDmx.g:6022:1: rule__DForLoopExpression__Group__4 : rule__DForLoopExpression__Group__4__Impl ;
    public final void rule__DForLoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6026:1: ( rule__DForLoopExpression__Group__4__Impl )
            // InternalDmx.g:6027:2: rule__DForLoopExpression__Group__4__Impl
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
    // InternalDmx.g:6033:1: rule__DForLoopExpression__Group__4__Impl : ( 'end' ) ;
    public final void rule__DForLoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6037:1: ( ( 'end' ) )
            // InternalDmx.g:6038:1: ( 'end' )
            {
            // InternalDmx.g:6038:1: ( 'end' )
            // InternalDmx.g:6039:2: 'end'
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
    // InternalDmx.g:6049:1: rule__DForLoopExpression__Group_0__0 : rule__DForLoopExpression__Group_0__0__Impl ;
    public final void rule__DForLoopExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6053:1: ( rule__DForLoopExpression__Group_0__0__Impl )
            // InternalDmx.g:6054:2: rule__DForLoopExpression__Group_0__0__Impl
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
    // InternalDmx.g:6060:1: rule__DForLoopExpression__Group_0__0__Impl : ( ( rule__DForLoopExpression__Group_0_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6064:1: ( ( ( rule__DForLoopExpression__Group_0_0__0 ) ) )
            // InternalDmx.g:6065:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            {
            // InternalDmx.g:6065:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            // InternalDmx.g:6066:2: ( rule__DForLoopExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0()); 
            }
            // InternalDmx.g:6067:2: ( rule__DForLoopExpression__Group_0_0__0 )
            // InternalDmx.g:6067:3: rule__DForLoopExpression__Group_0_0__0
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
    // InternalDmx.g:6076:1: rule__DForLoopExpression__Group_0_0__0 : rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 ;
    public final void rule__DForLoopExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6080:1: ( rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 )
            // InternalDmx.g:6081:2: rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1
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
    // InternalDmx.g:6088:1: rule__DForLoopExpression__Group_0_0__0__Impl : ( () ) ;
    public final void rule__DForLoopExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6092:1: ( ( () ) )
            // InternalDmx.g:6093:1: ( () )
            {
            // InternalDmx.g:6093:1: ( () )
            // InternalDmx.g:6094:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0()); 
            }
            // InternalDmx.g:6095:2: ()
            // InternalDmx.g:6095:3: 
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
    // InternalDmx.g:6103:1: rule__DForLoopExpression__Group_0_0__1 : rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 ;
    public final void rule__DForLoopExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6107:1: ( rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 )
            // InternalDmx.g:6108:2: rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2
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
    // InternalDmx.g:6115:1: rule__DForLoopExpression__Group_0_0__1__Impl : ( 'for' ) ;
    public final void rule__DForLoopExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6119:1: ( ( 'for' ) )
            // InternalDmx.g:6120:1: ( 'for' )
            {
            // InternalDmx.g:6120:1: ( 'for' )
            // InternalDmx.g:6121:2: 'for'
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
    // InternalDmx.g:6130:1: rule__DForLoopExpression__Group_0_0__2 : rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 ;
    public final void rule__DForLoopExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6134:1: ( rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 )
            // InternalDmx.g:6135:2: rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3
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
    // InternalDmx.g:6142:1: rule__DForLoopExpression__Group_0_0__2__Impl : ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) ;
    public final void rule__DForLoopExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6146:1: ( ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) )
            // InternalDmx.g:6147:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            {
            // InternalDmx.g:6147:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            // InternalDmx.g:6148:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2()); 
            }
            // InternalDmx.g:6149:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            // InternalDmx.g:6149:3: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2
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
    // InternalDmx.g:6157:1: rule__DForLoopExpression__Group_0_0__3 : rule__DForLoopExpression__Group_0_0__3__Impl ;
    public final void rule__DForLoopExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6161:1: ( rule__DForLoopExpression__Group_0_0__3__Impl )
            // InternalDmx.g:6162:2: rule__DForLoopExpression__Group_0_0__3__Impl
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
    // InternalDmx.g:6168:1: rule__DForLoopExpression__Group_0_0__3__Impl : ( ':' ) ;
    public final void rule__DForLoopExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6172:1: ( ( ':' ) )
            // InternalDmx.g:6173:1: ( ':' )
            {
            // InternalDmx.g:6173:1: ( ':' )
            // InternalDmx.g:6174:2: ':'
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
    // InternalDmx.g:6184:1: rule__DBooleanLiteral__Group__0 : rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 ;
    public final void rule__DBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6188:1: ( rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 )
            // InternalDmx.g:6189:2: rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1
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
    // InternalDmx.g:6196:1: rule__DBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6200:1: ( ( () ) )
            // InternalDmx.g:6201:1: ( () )
            {
            // InternalDmx.g:6201:1: ( () )
            // InternalDmx.g:6202:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0()); 
            }
            // InternalDmx.g:6203:2: ()
            // InternalDmx.g:6203:3: 
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
    // InternalDmx.g:6211:1: rule__DBooleanLiteral__Group__1 : rule__DBooleanLiteral__Group__1__Impl ;
    public final void rule__DBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6215:1: ( rule__DBooleanLiteral__Group__1__Impl )
            // InternalDmx.g:6216:2: rule__DBooleanLiteral__Group__1__Impl
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
    // InternalDmx.g:6222:1: rule__DBooleanLiteral__Group__1__Impl : ( ( rule__DBooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__DBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6226:1: ( ( ( rule__DBooleanLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6227:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6227:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            // InternalDmx.g:6228:2: ( rule__DBooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6229:2: ( rule__DBooleanLiteral__Alternatives_1 )
            // InternalDmx.g:6229:3: rule__DBooleanLiteral__Alternatives_1
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
    // InternalDmx.g:6238:1: rule__DStringLiteral__Group__0 : rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 ;
    public final void rule__DStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6242:1: ( rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 )
            // InternalDmx.g:6243:2: rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1
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
    // InternalDmx.g:6250:1: rule__DStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6254:1: ( ( () ) )
            // InternalDmx.g:6255:1: ( () )
            {
            // InternalDmx.g:6255:1: ( () )
            // InternalDmx.g:6256:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0()); 
            }
            // InternalDmx.g:6257:2: ()
            // InternalDmx.g:6257:3: 
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
    // InternalDmx.g:6265:1: rule__DStringLiteral__Group__1 : rule__DStringLiteral__Group__1__Impl ;
    public final void rule__DStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6269:1: ( rule__DStringLiteral__Group__1__Impl )
            // InternalDmx.g:6270:2: rule__DStringLiteral__Group__1__Impl
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
    // InternalDmx.g:6276:1: rule__DStringLiteral__Group__1__Impl : ( ( rule__DStringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6280:1: ( ( ( rule__DStringLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6281:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6281:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6282:2: ( rule__DStringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6283:2: ( rule__DStringLiteral__ValueAssignment_1 )
            // InternalDmx.g:6283:3: rule__DStringLiteral__ValueAssignment_1
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
    // InternalDmx.g:6292:1: rule__DNaturalLiteral__Group__0 : rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 ;
    public final void rule__DNaturalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6296:1: ( rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 )
            // InternalDmx.g:6297:2: rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1
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
    // InternalDmx.g:6304:1: rule__DNaturalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNaturalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6308:1: ( ( () ) )
            // InternalDmx.g:6309:1: ( () )
            {
            // InternalDmx.g:6309:1: ( () )
            // InternalDmx.g:6310:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0()); 
            }
            // InternalDmx.g:6311:2: ()
            // InternalDmx.g:6311:3: 
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
    // InternalDmx.g:6319:1: rule__DNaturalLiteral__Group__1 : rule__DNaturalLiteral__Group__1__Impl ;
    public final void rule__DNaturalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6323:1: ( rule__DNaturalLiteral__Group__1__Impl )
            // InternalDmx.g:6324:2: rule__DNaturalLiteral__Group__1__Impl
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
    // InternalDmx.g:6330:1: rule__DNaturalLiteral__Group__1__Impl : ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DNaturalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6334:1: ( ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6335:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6335:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6336:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6337:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6337:3: rule__DNaturalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6346:1: rule__DDecimalLiteral__Group__0 : rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 ;
    public final void rule__DDecimalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6350:1: ( rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 )
            // InternalDmx.g:6351:2: rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1
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
    // InternalDmx.g:6358:1: rule__DDecimalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DDecimalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6362:1: ( ( () ) )
            // InternalDmx.g:6363:1: ( () )
            {
            // InternalDmx.g:6363:1: ( () )
            // InternalDmx.g:6364:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0()); 
            }
            // InternalDmx.g:6365:2: ()
            // InternalDmx.g:6365:3: 
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
    // InternalDmx.g:6373:1: rule__DDecimalLiteral__Group__1 : rule__DDecimalLiteral__Group__1__Impl ;
    public final void rule__DDecimalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6377:1: ( rule__DDecimalLiteral__Group__1__Impl )
            // InternalDmx.g:6378:2: rule__DDecimalLiteral__Group__1__Impl
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
    // InternalDmx.g:6384:1: rule__DDecimalLiteral__Group__1__Impl : ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DDecimalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6388:1: ( ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6389:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6389:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6390:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6391:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6391:3: rule__DDecimalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6400:1: rule__DNilLiteral__Group__0 : rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 ;
    public final void rule__DNilLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6404:1: ( rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 )
            // InternalDmx.g:6405:2: rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1
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
    // InternalDmx.g:6412:1: rule__DNilLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNilLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6416:1: ( ( () ) )
            // InternalDmx.g:6417:1: ( () )
            {
            // InternalDmx.g:6417:1: ( () )
            // InternalDmx.g:6418:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0()); 
            }
            // InternalDmx.g:6419:2: ()
            // InternalDmx.g:6419:3: 
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
    // InternalDmx.g:6427:1: rule__DNilLiteral__Group__1 : rule__DNilLiteral__Group__1__Impl ;
    public final void rule__DNilLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6431:1: ( rule__DNilLiteral__Group__1__Impl )
            // InternalDmx.g:6432:2: rule__DNilLiteral__Group__1__Impl
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
    // InternalDmx.g:6438:1: rule__DNilLiteral__Group__1__Impl : ( ( rule__DNilLiteral__Alternatives_1 ) ) ;
    public final void rule__DNilLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6442:1: ( ( ( rule__DNilLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6443:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6443:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            // InternalDmx.g:6444:2: ( rule__DNilLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6445:2: ( rule__DNilLiteral__Alternatives_1 )
            // InternalDmx.g:6445:3: rule__DNilLiteral__Alternatives_1
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
    // InternalDmx.g:6454:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6458:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalDmx.g:6459:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
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
    // InternalDmx.g:6466:1: rule__DECIMAL__Group__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6470:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6471:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6471:1: ( RULE_NATURAL )
            // InternalDmx.g:6472:2: RULE_NATURAL
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
    // InternalDmx.g:6481:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6485:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalDmx.g:6486:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalDmx.g:6493:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6497:1: ( ( '.' ) )
            // InternalDmx.g:6498:1: ( '.' )
            {
            // InternalDmx.g:6498:1: ( '.' )
            // InternalDmx.g:6499:2: '.'
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
    // InternalDmx.g:6508:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6512:1: ( rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 )
            // InternalDmx.g:6513:2: rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3
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
    // InternalDmx.g:6520:1: rule__DECIMAL__Group__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6524:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6525:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6525:1: ( RULE_NATURAL )
            // InternalDmx.g:6526:2: RULE_NATURAL
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
    // InternalDmx.g:6535:1: rule__DECIMAL__Group__3 : rule__DECIMAL__Group__3__Impl ;
    public final void rule__DECIMAL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6539:1: ( rule__DECIMAL__Group__3__Impl )
            // InternalDmx.g:6540:2: rule__DECIMAL__Group__3__Impl
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
    // InternalDmx.g:6546:1: rule__DECIMAL__Group__3__Impl : ( ( rule__DECIMAL__Group_3__0 )? ) ;
    public final void rule__DECIMAL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6550:1: ( ( ( rule__DECIMAL__Group_3__0 )? ) )
            // InternalDmx.g:6551:1: ( ( rule__DECIMAL__Group_3__0 )? )
            {
            // InternalDmx.g:6551:1: ( ( rule__DECIMAL__Group_3__0 )? )
            // InternalDmx.g:6552:2: ( rule__DECIMAL__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup_3()); 
            }
            // InternalDmx.g:6553:2: ( rule__DECIMAL__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=33 && LA48_0<=34)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmx.g:6553:3: rule__DECIMAL__Group_3__0
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
    // InternalDmx.g:6562:1: rule__DECIMAL__Group_3__0 : rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 ;
    public final void rule__DECIMAL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6566:1: ( rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 )
            // InternalDmx.g:6567:2: rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1
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
    // InternalDmx.g:6574:1: rule__DECIMAL__Group_3__0__Impl : ( ( rule__DECIMAL__Alternatives_3_0 ) ) ;
    public final void rule__DECIMAL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6578:1: ( ( ( rule__DECIMAL__Alternatives_3_0 ) ) )
            // InternalDmx.g:6579:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            {
            // InternalDmx.g:6579:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            // InternalDmx.g:6580:2: ( rule__DECIMAL__Alternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_0()); 
            }
            // InternalDmx.g:6581:2: ( rule__DECIMAL__Alternatives_3_0 )
            // InternalDmx.g:6581:3: rule__DECIMAL__Alternatives_3_0
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
    // InternalDmx.g:6589:1: rule__DECIMAL__Group_3__1 : rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 ;
    public final void rule__DECIMAL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6593:1: ( rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 )
            // InternalDmx.g:6594:2: rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2
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
    // InternalDmx.g:6601:1: rule__DECIMAL__Group_3__1__Impl : ( ( rule__DECIMAL__Alternatives_3_1 )? ) ;
    public final void rule__DECIMAL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6605:1: ( ( ( rule__DECIMAL__Alternatives_3_1 )? ) )
            // InternalDmx.g:6606:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            {
            // InternalDmx.g:6606:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            // InternalDmx.g:6607:2: ( rule__DECIMAL__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_1()); 
            }
            // InternalDmx.g:6608:2: ( rule__DECIMAL__Alternatives_3_1 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=35 && LA49_0<=36)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDmx.g:6608:3: rule__DECIMAL__Alternatives_3_1
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
    // InternalDmx.g:6616:1: rule__DECIMAL__Group_3__2 : rule__DECIMAL__Group_3__2__Impl ;
    public final void rule__DECIMAL__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6620:1: ( rule__DECIMAL__Group_3__2__Impl )
            // InternalDmx.g:6621:2: rule__DECIMAL__Group_3__2__Impl
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
    // InternalDmx.g:6627:1: rule__DECIMAL__Group_3__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6631:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6632:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6632:1: ( RULE_NATURAL )
            // InternalDmx.g:6633:2: RULE_NATURAL
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


    // $ANTLR start "rule__DmxModel__TextsAssignment_1_3"
    // InternalDmx.g:6643:1: rule__DmxModel__TextsAssignment_1_3 : ( ruleDRichText ) ;
    public final void rule__DmxModel__TextsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6647:1: ( ( ruleDRichText ) )
            // InternalDmx.g:6648:2: ( ruleDRichText )
            {
            // InternalDmx.g:6648:2: ( ruleDRichText )
            // InternalDmx.g:6649:3: ruleDRichText
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
    // InternalDmx.g:6658:1: rule__DmxModel__ExpressionsAssignment_2_3 : ( ruleDExpression ) ;
    public final void rule__DmxModel__ExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6662:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6663:2: ( ruleDExpression )
            {
            // InternalDmx.g:6663:2: ( ruleDExpression )
            // InternalDmx.g:6664:3: ruleDExpression
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
    // InternalDmx.g:6673:1: rule__DRichText__ElementsAssignment_0 : ( ruleDTextOnly ) ;
    public final void rule__DRichText__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6677:1: ( ( ruleDTextOnly ) )
            // InternalDmx.g:6678:2: ( ruleDTextOnly )
            {
            // InternalDmx.g:6678:2: ( ruleDTextOnly )
            // InternalDmx.g:6679:3: ruleDTextOnly
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
    // InternalDmx.g:6688:1: rule__DRichText__ElementsAssignment_1_0 : ( ruleDTextStart ) ;
    public final void rule__DRichText__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6692:1: ( ( ruleDTextStart ) )
            // InternalDmx.g:6693:2: ( ruleDTextStart )
            {
            // InternalDmx.g:6693:2: ( ruleDTextStart )
            // InternalDmx.g:6694:3: ruleDTextStart
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
    // InternalDmx.g:6703:1: rule__DRichText__ElementsAssignment_1_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6707:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6708:2: ( ruleDExpression )
            {
            // InternalDmx.g:6708:2: ( ruleDExpression )
            // InternalDmx.g:6709:3: ruleDExpression
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
    // InternalDmx.g:6718:1: rule__DRichText__ElementsAssignment_1_2_0 : ( ruleDTextMiddle ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6722:1: ( ( ruleDTextMiddle ) )
            // InternalDmx.g:6723:2: ( ruleDTextMiddle )
            {
            // InternalDmx.g:6723:2: ( ruleDTextMiddle )
            // InternalDmx.g:6724:3: ruleDTextMiddle
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
    // InternalDmx.g:6733:1: rule__DRichText__ElementsAssignment_1_2_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6737:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6738:2: ( ruleDExpression )
            {
            // InternalDmx.g:6738:2: ( ruleDExpression )
            // InternalDmx.g:6739:3: ruleDExpression
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
    // InternalDmx.g:6748:1: rule__DRichText__ElementsAssignment_1_3 : ( ruleDTextEnd ) ;
    public final void rule__DRichText__ElementsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6752:1: ( ( ruleDTextEnd ) )
            // InternalDmx.g:6753:2: ( ruleDTextEnd )
            {
            // InternalDmx.g:6753:2: ( ruleDTextEnd )
            // InternalDmx.g:6754:3: ruleDTextEnd
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
    // InternalDmx.g:6763:1: rule__DTextOnly__ValueAssignment : ( RULE_PLAIN_TEXT_ONLY ) ;
    public final void rule__DTextOnly__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6767:1: ( ( RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:6768:2: ( RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:6768:2: ( RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:6769:3: RULE_PLAIN_TEXT_ONLY
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
    // InternalDmx.g:6778:1: rule__DTextStart__ValueAssignment : ( RULE_PLAIN_TEXT_START ) ;
    public final void rule__DTextStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6782:1: ( ( RULE_PLAIN_TEXT_START ) )
            // InternalDmx.g:6783:2: ( RULE_PLAIN_TEXT_START )
            {
            // InternalDmx.g:6783:2: ( RULE_PLAIN_TEXT_START )
            // InternalDmx.g:6784:3: RULE_PLAIN_TEXT_START
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
    // InternalDmx.g:6793:1: rule__DTextMiddle__ValueAssignment : ( RULE_PLAIN_TEXT_MIDDLE ) ;
    public final void rule__DTextMiddle__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6797:1: ( ( RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDmx.g:6798:2: ( RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDmx.g:6798:2: ( RULE_PLAIN_TEXT_MIDDLE )
            // InternalDmx.g:6799:3: RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDmx.g:6808:1: rule__DTextEnd__ValueAssignment : ( RULE_PLAIN_TEXT_END ) ;
    public final void rule__DTextEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6812:1: ( ( RULE_PLAIN_TEXT_END ) )
            // InternalDmx.g:6813:2: ( RULE_PLAIN_TEXT_END )
            {
            // InternalDmx.g:6813:2: ( RULE_PLAIN_TEXT_END )
            // InternalDmx.g:6814:3: RULE_PLAIN_TEXT_END
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
    // InternalDmx.g:6823:1: rule__DAssignment__MemberAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DAssignment__MemberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6827:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:6828:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:6828:2: ( ( RULE_ID ) )
            // InternalDmx.g:6829:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0()); 
            }
            // InternalDmx.g:6830:3: ( RULE_ID )
            // InternalDmx.g:6831:4: RULE_ID
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
    // InternalDmx.g:6842:1: rule__DAssignment__ValueAssignment_0_3 : ( ruleDAssignment ) ;
    public final void rule__DAssignment__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6846:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:6847:2: ( ruleDAssignment )
            {
            // InternalDmx.g:6847:2: ( ruleDAssignment )
            // InternalDmx.g:6848:3: ruleDAssignment
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
    // InternalDmx.g:6857:1: rule__DOrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__DOrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6861:1: ( ( ruleOpOr ) )
            // InternalDmx.g:6862:2: ( ruleOpOr )
            {
            // InternalDmx.g:6862:2: ( ruleOpOr )
            // InternalDmx.g:6863:3: ruleOpOr
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
    // InternalDmx.g:6872:1: rule__DOrExpression__RightOperandAssignment_1_1 : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6876:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:6877:2: ( ruleDAndExpression )
            {
            // InternalDmx.g:6877:2: ( ruleDAndExpression )
            // InternalDmx.g:6878:3: ruleDAndExpression
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
    // InternalDmx.g:6887:1: rule__DAndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__DAndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6891:1: ( ( ruleOpAnd ) )
            // InternalDmx.g:6892:2: ( ruleOpAnd )
            {
            // InternalDmx.g:6892:2: ( ruleOpAnd )
            // InternalDmx.g:6893:3: ruleOpAnd
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
    // InternalDmx.g:6902:1: rule__DAndExpression__RightOperandAssignment_1_1 : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6906:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:6907:2: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:6907:2: ( ruleDEqualityExpression )
            // InternalDmx.g:6908:3: ruleDEqualityExpression
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
    // InternalDmx.g:6917:1: rule__DEqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__DEqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6921:1: ( ( ruleOpEquality ) )
            // InternalDmx.g:6922:2: ( ruleOpEquality )
            {
            // InternalDmx.g:6922:2: ( ruleOpEquality )
            // InternalDmx.g:6923:3: ruleOpEquality
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
    // InternalDmx.g:6932:1: rule__DEqualityExpression__RightOperandAssignment_1_1 : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6936:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:6937:2: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:6937:2: ( ruleDRelationalExpression )
            // InternalDmx.g:6938:3: ruleDRelationalExpression
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
    // InternalDmx.g:6947:1: rule__DRelationalExpression__TypeAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DRelationalExpression__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6951:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:6952:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:6952:2: ( ( RULE_ID ) )
            // InternalDmx.g:6953:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0()); 
            }
            // InternalDmx.g:6954:3: ( RULE_ID )
            // InternalDmx.g:6955:4: RULE_ID
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
    // InternalDmx.g:6966:1: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6970:1: ( ( ruleOpCompare ) )
            // InternalDmx.g:6971:2: ( ruleOpCompare )
            {
            // InternalDmx.g:6971:2: ( ruleOpCompare )
            // InternalDmx.g:6972:3: ruleOpCompare
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
    // InternalDmx.g:6981:1: rule__DRelationalExpression__RightOperandAssignment_1_1_1 : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__RightOperandAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6985:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:6986:2: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:6986:2: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:6987:3: ruleDOtherOperatorExpression
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
    // InternalDmx.g:6996:1: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOther ) ;
    public final void rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7000:1: ( ( ruleOpOther ) )
            // InternalDmx.g:7001:2: ( ruleOpOther )
            {
            // InternalDmx.g:7001:2: ( ruleOpOther )
            // InternalDmx.g:7002:3: ruleOpOther
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
    // InternalDmx.g:7011:1: rule__DOtherOperatorExpression__RightOperandAssignment_1_1 : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7015:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:7016:2: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:7016:2: ( ruleDAdditiveExpression )
            // InternalDmx.g:7017:3: ruleDAdditiveExpression
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
    // InternalDmx.g:7026:1: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__DAdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7030:1: ( ( ruleOpAdd ) )
            // InternalDmx.g:7031:2: ( ruleOpAdd )
            {
            // InternalDmx.g:7031:2: ( ruleOpAdd )
            // InternalDmx.g:7032:3: ruleOpAdd
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
    // InternalDmx.g:7041:1: rule__DAdditiveExpression__RightOperandAssignment_1_1 : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7045:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:7046:2: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:7046:2: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:7047:3: ruleDMultiplicativeExpression
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
    // InternalDmx.g:7056:1: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7060:1: ( ( ruleOpMulti ) )
            // InternalDmx.g:7061:2: ( ruleOpMulti )
            {
            // InternalDmx.g:7061:2: ( ruleOpMulti )
            // InternalDmx.g:7062:3: ruleOpMulti
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
    // InternalDmx.g:7071:1: rule__DMultiplicativeExpression__RightOperandAssignment_1_1 : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7075:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7076:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7076:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7077:3: ruleDUnaryOperation
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
    // InternalDmx.g:7086:1: rule__DUnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__DUnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7090:1: ( ( ruleOpUnary ) )
            // InternalDmx.g:7091:2: ( ruleOpUnary )
            {
            // InternalDmx.g:7091:2: ( ruleOpUnary )
            // InternalDmx.g:7092:3: ruleOpUnary
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
    // InternalDmx.g:7101:1: rule__DUnaryOperation__OperandAssignment_0_2 : ( ruleDUnaryOperation ) ;
    public final void rule__DUnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7105:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7106:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7106:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7107:3: ruleDUnaryOperation
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
    // InternalDmx.g:7116:1: rule__DCastExpression__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCastExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7120:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7121:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7121:2: ( ( RULE_ID ) )
            // InternalDmx.g:7122:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0()); 
            }
            // InternalDmx.g:7123:3: ( RULE_ID )
            // InternalDmx.g:7124:4: RULE_ID
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
    // InternalDmx.g:7135:1: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7139:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7140:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7140:2: ( ( RULE_ID ) )
            // InternalDmx.g:7141:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0()); 
            }
            // InternalDmx.g:7142:3: ( RULE_ID )
            // InternalDmx.g:7143:4: RULE_ID
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
    // InternalDmx.g:7154:1: rule__DTypedMemberReference__ValueAssignment_1_0_1 : ( ruleDAssignment ) ;
    public final void rule__DTypedMemberReference__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7158:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7159:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7159:2: ( ruleDAssignment )
            // InternalDmx.g:7160:3: ruleDAssignment
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
    // InternalDmx.g:7169:1: rule__DTypedMemberReference__MemberAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7173:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7174:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7174:2: ( ( RULE_ID ) )
            // InternalDmx.g:7175:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0()); 
            }
            // InternalDmx.g:7176:3: ( RULE_ID )
            // InternalDmx.g:7177:4: RULE_ID
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
    // InternalDmx.g:7188:1: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0 : ( ( '(' ) ) ;
    public final void rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7192:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7193:2: ( ( '(' ) )
            {
            // InternalDmx.g:7193:2: ( ( '(' ) )
            // InternalDmx.g:7194:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0()); 
            }
            // InternalDmx.g:7195:3: ( '(' )
            // InternalDmx.g:7196:4: '('
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
    // InternalDmx.g:7207:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7211:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7212:2: ( ruleDExpression )
            {
            // InternalDmx.g:7212:2: ( ruleDExpression )
            // InternalDmx.g:7213:3: ruleDExpression
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
    // InternalDmx.g:7222:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7226:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7227:2: ( ruleDExpression )
            {
            // InternalDmx.g:7227:2: ( ruleDExpression )
            // InternalDmx.g:7228:3: ruleDExpression
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
    // InternalDmx.g:7237:1: rule__DReturnExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DReturnExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7241:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7242:2: ( ruleDExpression )
            {
            // InternalDmx.g:7242:2: ( ruleDExpression )
            // InternalDmx.g:7243:3: ruleDExpression
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
    // InternalDmx.g:7252:1: rule__DRaiseExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DRaiseExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7256:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7257:2: ( ruleDExpression )
            {
            // InternalDmx.g:7257:2: ( ruleDExpression )
            // InternalDmx.g:7258:3: ruleDExpression
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
    // InternalDmx.g:7267:1: rule__DFunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DFunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7271:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7272:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7272:2: ( ( RULE_ID ) )
            // InternalDmx.g:7273:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0()); 
            }
            // InternalDmx.g:7274:3: ( RULE_ID )
            // InternalDmx.g:7275:4: RULE_ID
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
    // InternalDmx.g:7286:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7290:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7291:2: ( ruleDExpression )
            {
            // InternalDmx.g:7291:2: ( ruleDExpression )
            // InternalDmx.g:7292:3: ruleDExpression
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
    // InternalDmx.g:7301:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7305:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7306:2: ( ruleDExpression )
            {
            // InternalDmx.g:7306:2: ( ruleDExpression )
            // InternalDmx.g:7307:3: ruleDExpression
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
    // InternalDmx.g:7316:1: rule__DConstructorCall__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DConstructorCall__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7320:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7321:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7321:2: ( ( RULE_ID ) )
            // InternalDmx.g:7322:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0()); 
            }
            // InternalDmx.g:7323:3: ( RULE_ID )
            // InternalDmx.g:7324:4: RULE_ID
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
    // InternalDmx.g:7335:1: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 : ( ( '(' ) ) ;
    public final void rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7339:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7340:2: ( ( '(' ) )
            {
            // InternalDmx.g:7340:2: ( ( '(' ) )
            // InternalDmx.g:7341:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            // InternalDmx.g:7342:3: ( '(' )
            // InternalDmx.g:7343:4: '('
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
    // InternalDmx.g:7354:1: rule__DConstructorCall__ArgumentsAssignment_3_1_0 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7358:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7359:2: ( ruleDExpression )
            {
            // InternalDmx.g:7359:2: ( ruleDExpression )
            // InternalDmx.g:7360:3: ruleDExpression
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
    // InternalDmx.g:7369:1: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7373:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7374:2: ( ruleDExpression )
            {
            // InternalDmx.g:7374:2: ( ruleDExpression )
            // InternalDmx.g:7375:3: ruleDExpression
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
    // InternalDmx.g:7384:1: rule__DContextReference__ContextElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DContextReference__ContextElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7388:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7389:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7389:2: ( ( RULE_ID ) )
            // InternalDmx.g:7390:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementCrossReference_1_0()); 
            }
            // InternalDmx.g:7391:3: ( RULE_ID )
            // InternalDmx.g:7392:4: RULE_ID
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
    // InternalDmx.g:7403:1: rule__DIfExpression__IfAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7407:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7408:2: ( ruleDExpression )
            {
            // InternalDmx.g:7408:2: ( ruleDExpression )
            // InternalDmx.g:7409:3: ruleDExpression
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
    // InternalDmx.g:7418:1: rule__DIfExpression__ThenAssignment_4 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7422:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7423:2: ( ruleDExpression )
            {
            // InternalDmx.g:7423:2: ( ruleDExpression )
            // InternalDmx.g:7424:3: ruleDExpression
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
    // InternalDmx.g:7433:1: rule__DIfExpression__ElseAssignment_5_1 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7437:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7438:2: ( ruleDExpression )
            {
            // InternalDmx.g:7438:2: ( ruleDExpression )
            // InternalDmx.g:7439:3: ruleDExpression
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
    // InternalDmx.g:7448:1: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__DForLoopExpression__DeclaredParamAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7452:1: ( ( RULE_ID ) )
            // InternalDmx.g:7453:2: ( RULE_ID )
            {
            // InternalDmx.g:7453:2: ( RULE_ID )
            // InternalDmx.g:7454:3: RULE_ID
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
    // InternalDmx.g:7463:1: rule__DForLoopExpression__ForExpressionAssignment_1 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__ForExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7467:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7468:2: ( ruleDExpression )
            {
            // InternalDmx.g:7468:2: ( ruleDExpression )
            // InternalDmx.g:7469:3: ruleDExpression
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
    // InternalDmx.g:7478:1: rule__DForLoopExpression__EachExpressionAssignment_3 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__EachExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7482:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7483:2: ( ruleDExpression )
            {
            // InternalDmx.g:7483:2: ( ruleDExpression )
            // InternalDmx.g:7484:3: ruleDExpression
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
    // InternalDmx.g:7493:1: rule__DBooleanLiteral__ValueAssignment_1_0 : ( ( 'TRUE' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7497:1: ( ( ( 'TRUE' ) ) )
            // InternalDmx.g:7498:2: ( ( 'TRUE' ) )
            {
            // InternalDmx.g:7498:2: ( ( 'TRUE' ) )
            // InternalDmx.g:7499:3: ( 'TRUE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            // InternalDmx.g:7500:3: ( 'TRUE' )
            // InternalDmx.g:7501:4: 'TRUE'
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
    // InternalDmx.g:7512:1: rule__DBooleanLiteral__ValueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7516:1: ( ( ( 'true' ) ) )
            // InternalDmx.g:7517:2: ( ( 'true' ) )
            {
            // InternalDmx.g:7517:2: ( ( 'true' ) )
            // InternalDmx.g:7518:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            // InternalDmx.g:7519:3: ( 'true' )
            // InternalDmx.g:7520:4: 'true'
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
    // InternalDmx.g:7531:1: rule__DStringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DStringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7535:1: ( ( RULE_STRING ) )
            // InternalDmx.g:7536:2: ( RULE_STRING )
            {
            // InternalDmx.g:7536:2: ( RULE_STRING )
            // InternalDmx.g:7537:3: RULE_STRING
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
    // InternalDmx.g:7546:1: rule__DNaturalLiteral__ValueAssignment_1 : ( RULE_NATURAL ) ;
    public final void rule__DNaturalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7550:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:7551:2: ( RULE_NATURAL )
            {
            // InternalDmx.g:7551:2: ( RULE_NATURAL )
            // InternalDmx.g:7552:3: RULE_NATURAL
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
    // InternalDmx.g:7561:1: rule__DDecimalLiteral__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__DDecimalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7565:1: ( ( ruleDECIMAL ) )
            // InternalDmx.g:7566:2: ( ruleDECIMAL )
            {
            // InternalDmx.g:7566:2: ( ruleDECIMAL )
            // InternalDmx.g:7567:3: ruleDECIMAL
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

    // $ANTLR start synpred55_InternalDmx
    public final void synpred55_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2503:3: ( rule__DOrExpression__Group_1__0 )
        // InternalDmx.g:2503:3: rule__DOrExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOrExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalDmx

    // $ANTLR start synpred56_InternalDmx
    public final void synpred56_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2692:3: ( rule__DAndExpression__Group_1__0 )
        // InternalDmx.g:2692:3: rule__DAndExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAndExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalDmx

    // $ANTLR start synpred57_InternalDmx
    public final void synpred57_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2881:3: ( rule__DEqualityExpression__Group_1__0 )
        // InternalDmx.g:2881:3: rule__DEqualityExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DEqualityExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalDmx

    // $ANTLR start synpred58_InternalDmx
    public final void synpred58_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3070:3: ( rule__DRelationalExpression__Alternatives_1 )
        // InternalDmx.g:3070:3: rule__DRelationalExpression__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DRelationalExpression__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalDmx

    // $ANTLR start synpred59_InternalDmx
    public final void synpred59_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3394:3: ( rule__DOtherOperatorExpression__Group_1__0 )
        // InternalDmx.g:3394:3: rule__DOtherOperatorExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOtherOperatorExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalDmx

    // $ANTLR start synpred60_InternalDmx
    public final void synpred60_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3583:3: ( rule__DAdditiveExpression__Group_1__0 )
        // InternalDmx.g:3583:3: rule__DAdditiveExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAdditiveExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalDmx

    // $ANTLR start synpred61_InternalDmx
    public final void synpred61_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3772:3: ( rule__DMultiplicativeExpression__Group_1__0 )
        // InternalDmx.g:3772:3: rule__DMultiplicativeExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DMultiplicativeExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalDmx

    // $ANTLR start synpred62_InternalDmx
    public final void synpred62_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4042:3: ( rule__DCastExpression__Group_1__0 )
        // InternalDmx.g:4042:3: rule__DCastExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DCastExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalDmx

    // $ANTLR start synpred63_InternalDmx
    public final void synpred63_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4231:3: ( rule__DTypedMemberReference__Alternatives_1 )
        // InternalDmx.g:4231:3: rule__DTypedMemberReference__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DTypedMemberReference__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalDmx

    // $ANTLR start synpred67_InternalDmx
    public final void synpred67_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4906:3: ( rule__DReturnExpression__ExpressionAssignment_2 )
        // InternalDmx.g:4906:3: rule__DReturnExpression__ExpressionAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__DReturnExpression__ExpressionAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalDmx

    // Delegated rules

    public final boolean synpred55_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalDmx_fragment(); // can never throw exception
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
    public final boolean synpred67_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalDmx_fragment(); // can never throw exception
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
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\13\5\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\7\5\uffff";
    static final String dfa_4s = "\1\115\5\uffff\1\112\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\6\1\1\12\uffff\2\2\2\3\2\4\2\7\4\1\44\uffff\1\5\1\10\4\uffff\1\11\2\1",
            "",
            "",
            "",
            "",
            "",
            "\2\13\10\uffff\4\13\16\uffff\30\13\5\uffff\1\13\1\uffff\3\13\1\12\1\uffff\4\13",
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
            return "1303:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\7\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\112\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\3\1\1\1\4\1\7\1\0\1\2\1\5\1\6\1\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\10\uffff\1\2\1\3\2\1\16\uffff\13\1\1\4\1\5\1\6\1\7\1\10\1\11\7\1\5\uffff\1\1\1\uffff\3\1\2\uffff\4\1",
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3070:2: ( rule__DRelationalExpression__Alternatives_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
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
            "\1\1\2\uffff\2\32\2\1\6\uffff\4\32\14\1\2\uffff\1\2\1\3\26\32\3\1\2\uffff\1\32\1\uffff\3\32\2\1\4\32\3\1",
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

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "4906:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_3 = input.LA(1);

                         
                        int index41_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index41_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x38000019FFE00610L,0x0000000000003860L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000FC00000060000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000FC00000060002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3800001800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x38000019FFE00610L,0x0000000000003868L});
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
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000060000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000001E0000410L,0x0000000000003000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000001800000010L});

}