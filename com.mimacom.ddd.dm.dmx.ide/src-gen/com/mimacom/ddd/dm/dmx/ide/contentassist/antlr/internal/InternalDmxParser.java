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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'*'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'..'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'text'", "':'", "';'", "'expr'", "'.'", "')'", "','", "'('", "'if'", "'then'", "'end'", "'else'", "'do'", "'for'", "'@before'", "'TRUE'", "'true'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=6;
    public static final int T__19=19;
    public static final int T__59=59;
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
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_PLAIN_TEXT_MIDDLE=8;
    public static final int RULE_LETTER=11;
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


    // $ANTLR start "entryRuleDExpression"
    // InternalDmx.g:79:1: entryRuleDExpression : ruleDExpression EOF ;
    public final void entryRuleDExpression() throws RecognitionException {
        try {
            // InternalDmx.g:80:1: ( ruleDExpression EOF )
            // InternalDmx.g:81:1: ruleDExpression EOF
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
    // InternalDmx.g:88:1: ruleDExpression : ( ( rule__DExpression__Alternatives ) ) ;
    public final void ruleDExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:92:2: ( ( ( rule__DExpression__Alternatives ) ) )
            // InternalDmx.g:93:2: ( ( rule__DExpression__Alternatives ) )
            {
            // InternalDmx.g:93:2: ( ( rule__DExpression__Alternatives ) )
            // InternalDmx.g:94:3: ( rule__DExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDExpressionAccess().getAlternatives()); 
            }
            // InternalDmx.g:95:3: ( rule__DExpression__Alternatives )
            // InternalDmx.g:95:4: rule__DExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleDRichText"
    // InternalDmx.g:104:1: entryRuleDRichText : ruleDRichText EOF ;
    public final void entryRuleDRichText() throws RecognitionException {
        try {
            // InternalDmx.g:105:1: ( ruleDRichText EOF )
            // InternalDmx.g:106:1: ruleDRichText EOF
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
    // InternalDmx.g:113:1: ruleDRichText : ( ( rule__DRichText__Alternatives ) ) ;
    public final void ruleDRichText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:117:2: ( ( ( rule__DRichText__Alternatives ) ) )
            // InternalDmx.g:118:2: ( ( rule__DRichText__Alternatives ) )
            {
            // InternalDmx.g:118:2: ( ( rule__DRichText__Alternatives ) )
            // InternalDmx.g:119:3: ( rule__DRichText__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getAlternatives()); 
            }
            // InternalDmx.g:120:3: ( rule__DRichText__Alternatives )
            // InternalDmx.g:120:4: rule__DRichText__Alternatives
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
    // InternalDmx.g:129:1: entryRuleDTextOnly : ruleDTextOnly EOF ;
    public final void entryRuleDTextOnly() throws RecognitionException {
        try {
            // InternalDmx.g:130:1: ( ruleDTextOnly EOF )
            // InternalDmx.g:131:1: ruleDTextOnly EOF
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
    // InternalDmx.g:138:1: ruleDTextOnly : ( ( rule__DTextOnly__ValueAssignment ) ) ;
    public final void ruleDTextOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:142:2: ( ( ( rule__DTextOnly__ValueAssignment ) ) )
            // InternalDmx.g:143:2: ( ( rule__DTextOnly__ValueAssignment ) )
            {
            // InternalDmx.g:143:2: ( ( rule__DTextOnly__ValueAssignment ) )
            // InternalDmx.g:144:3: ( rule__DTextOnly__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextOnlyAccess().getValueAssignment()); 
            }
            // InternalDmx.g:145:3: ( rule__DTextOnly__ValueAssignment )
            // InternalDmx.g:145:4: rule__DTextOnly__ValueAssignment
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
    // InternalDmx.g:154:1: entryRuleDTextStart : ruleDTextStart EOF ;
    public final void entryRuleDTextStart() throws RecognitionException {
        try {
            // InternalDmx.g:155:1: ( ruleDTextStart EOF )
            // InternalDmx.g:156:1: ruleDTextStart EOF
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
    // InternalDmx.g:163:1: ruleDTextStart : ( ( rule__DTextStart__ValueAssignment ) ) ;
    public final void ruleDTextStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:167:2: ( ( ( rule__DTextStart__ValueAssignment ) ) )
            // InternalDmx.g:168:2: ( ( rule__DTextStart__ValueAssignment ) )
            {
            // InternalDmx.g:168:2: ( ( rule__DTextStart__ValueAssignment ) )
            // InternalDmx.g:169:3: ( rule__DTextStart__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextStartAccess().getValueAssignment()); 
            }
            // InternalDmx.g:170:3: ( rule__DTextStart__ValueAssignment )
            // InternalDmx.g:170:4: rule__DTextStart__ValueAssignment
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
    // InternalDmx.g:179:1: entryRuleDTextMiddle : ruleDTextMiddle EOF ;
    public final void entryRuleDTextMiddle() throws RecognitionException {
        try {
            // InternalDmx.g:180:1: ( ruleDTextMiddle EOF )
            // InternalDmx.g:181:1: ruleDTextMiddle EOF
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
    // InternalDmx.g:188:1: ruleDTextMiddle : ( ( rule__DTextMiddle__ValueAssignment ) ) ;
    public final void ruleDTextMiddle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:192:2: ( ( ( rule__DTextMiddle__ValueAssignment ) ) )
            // InternalDmx.g:193:2: ( ( rule__DTextMiddle__ValueAssignment ) )
            {
            // InternalDmx.g:193:2: ( ( rule__DTextMiddle__ValueAssignment ) )
            // InternalDmx.g:194:3: ( rule__DTextMiddle__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextMiddleAccess().getValueAssignment()); 
            }
            // InternalDmx.g:195:3: ( rule__DTextMiddle__ValueAssignment )
            // InternalDmx.g:195:4: rule__DTextMiddle__ValueAssignment
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
    // InternalDmx.g:204:1: entryRuleDTextEnd : ruleDTextEnd EOF ;
    public final void entryRuleDTextEnd() throws RecognitionException {
        try {
            // InternalDmx.g:205:1: ( ruleDTextEnd EOF )
            // InternalDmx.g:206:1: ruleDTextEnd EOF
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
    // InternalDmx.g:213:1: ruleDTextEnd : ( ( rule__DTextEnd__ValueAssignment ) ) ;
    public final void ruleDTextEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:217:2: ( ( ( rule__DTextEnd__ValueAssignment ) ) )
            // InternalDmx.g:218:2: ( ( rule__DTextEnd__ValueAssignment ) )
            {
            // InternalDmx.g:218:2: ( ( rule__DTextEnd__ValueAssignment ) )
            // InternalDmx.g:219:3: ( rule__DTextEnd__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTextEndAccess().getValueAssignment()); 
            }
            // InternalDmx.g:220:3: ( rule__DTextEnd__ValueAssignment )
            // InternalDmx.g:220:4: rule__DTextEnd__ValueAssignment
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
            match(input,17,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__DExpression__Alternatives"
    // InternalDmx.g:1206:1: rule__DExpression__Alternatives : ( ( ruleDAssignment ) | ( ruleDRichText ) );
    public final void rule__DExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1210:1: ( ( ruleDAssignment ) | ( ruleDRichText ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_NATURAL && LA1_0<=RULE_ID)||LA1_0==RULE_STRING||(LA1_0>=22 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=34)||(LA1_0>=37 && LA1_0<=38)||(LA1_0>=60 && LA1_0<=62)||(LA1_0>=70 && LA1_0<=71)||LA1_0==76||(LA1_0>=78 && LA1_0<=79)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_PLAIN_TEXT_ONLY && LA1_0<=RULE_PLAIN_TEXT_START)) ) {
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
                    // InternalDmx.g:1211:2: ( ruleDAssignment )
                    {
                    // InternalDmx.g:1211:2: ( ruleDAssignment )
                    // InternalDmx.g:1212:3: ruleDAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1217:2: ( ruleDRichText )
                    {
                    // InternalDmx.g:1217:2: ( ruleDRichText )
                    // InternalDmx.g:1218:3: ruleDRichText
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDRichText();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_1()); 
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
    // $ANTLR end "rule__DExpression__Alternatives"


    // $ANTLR start "rule__DRichText__Alternatives"
    // InternalDmx.g:1227:1: rule__DRichText__Alternatives : ( ( ( rule__DRichText__SegmentsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) );
    public final void rule__DRichText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1231:1: ( ( ( rule__DRichText__SegmentsAssignment_0 ) ) | ( ( rule__DRichText__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_PLAIN_TEXT_START) ) {
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
                    // InternalDmx.g:1232:2: ( ( rule__DRichText__SegmentsAssignment_0 ) )
                    {
                    // InternalDmx.g:1232:2: ( ( rule__DRichText__SegmentsAssignment_0 ) )
                    // InternalDmx.g:1233:3: ( rule__DRichText__SegmentsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_0()); 
                    }
                    // InternalDmx.g:1234:3: ( rule__DRichText__SegmentsAssignment_0 )
                    // InternalDmx.g:1234:4: rule__DRichText__SegmentsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DRichText__SegmentsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1238:2: ( ( rule__DRichText__Group_1__0 ) )
                    {
                    // InternalDmx.g:1238:2: ( ( rule__DRichText__Group_1__0 ) )
                    // InternalDmx.g:1239:3: ( rule__DRichText__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRichTextAccess().getGroup_1()); 
                    }
                    // InternalDmx.g:1240:3: ( rule__DRichText__Group_1__0 )
                    // InternalDmx.g:1240:4: rule__DRichText__Group_1__0
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
    // InternalDmx.g:1248:1: rule__DAssignment__Alternatives : ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) );
    public final void rule__DAssignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1252:1: ( ( ( rule__DAssignment__Group_0__0 ) ) | ( ruleDOrExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_PLAIN_TEXT_MIDDLE && LA3_1<=RULE_PLAIN_TEXT_END)||(LA3_1>=18 && LA3_1<=21)||LA3_1==30||(LA3_1>=37 && LA3_1<=59)||LA3_1==65||(LA3_1>=67 && LA3_1<=70)||(LA3_1>=72 && LA3_1<=75)||LA3_1==77) ) {
                    alt3=2;
                }
                else if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_NATURAL||LA3_0==RULE_STRING||(LA3_0>=22 && LA3_0<=29)||(LA3_0>=31 && LA3_0<=34)||(LA3_0>=37 && LA3_0<=38)||(LA3_0>=60 && LA3_0<=62)||(LA3_0>=70 && LA3_0<=71)||LA3_0==76||(LA3_0>=78 && LA3_0<=79)) ) {
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
                    // InternalDmx.g:1253:2: ( ( rule__DAssignment__Group_0__0 ) )
                    {
                    // InternalDmx.g:1253:2: ( ( rule__DAssignment__Group_0__0 ) )
                    // InternalDmx.g:1254:3: ( rule__DAssignment__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDAssignmentAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1255:3: ( rule__DAssignment__Group_0__0 )
                    // InternalDmx.g:1255:4: rule__DAssignment__Group_0__0
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
                    // InternalDmx.g:1259:2: ( ruleDOrExpression )
                    {
                    // InternalDmx.g:1259:2: ( ruleDOrExpression )
                    // InternalDmx.g:1260:3: ruleDOrExpression
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
    // InternalDmx.g:1269:1: rule__DRelationalExpression__Alternatives_1 : ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) );
    public final void rule__DRelationalExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1273:1: ( ( ( rule__DRelationalExpression__Group_1_0__0 ) ) | ( ( rule__DRelationalExpression__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=48 && LA4_0<=53)) ) {
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
                    // InternalDmx.g:1274:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1274:2: ( ( rule__DRelationalExpression__Group_1_0__0 ) )
                    // InternalDmx.g:1275:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1276:3: ( rule__DRelationalExpression__Group_1_0__0 )
                    // InternalDmx.g:1276:4: rule__DRelationalExpression__Group_1_0__0
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
                    // InternalDmx.g:1280:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1280:2: ( ( rule__DRelationalExpression__Group_1_1__0 ) )
                    // InternalDmx.g:1281:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1282:3: ( rule__DRelationalExpression__Group_1_1__0 )
                    // InternalDmx.g:1282:4: rule__DRelationalExpression__Group_1_1__0
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
    // InternalDmx.g:1290:1: rule__OpInstanceOf__Alternatives : ( ( 'ISA' ) | ( 'isa' ) );
    public final void rule__OpInstanceOf__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1294:1: ( ( 'ISA' ) | ( 'isa' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
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
                    // InternalDmx.g:1295:2: ( 'ISA' )
                    {
                    // InternalDmx.g:1295:2: ( 'ISA' )
                    // InternalDmx.g:1296:3: 'ISA'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpInstanceOfAccess().getISAKeyword_0()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpInstanceOfAccess().getISAKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1301:2: ( 'isa' )
                    {
                    // InternalDmx.g:1301:2: ( 'isa' )
                    // InternalDmx.g:1302:3: 'isa'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpInstanceOfAccess().getIsaKeyword_1()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1311:1: rule__DUnaryOperation__Alternatives : ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) );
    public final void rule__DUnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1315:1: ( ( ( rule__DUnaryOperation__Group_0__0 ) ) | ( ruleDCastExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=38)||(LA6_0>=60 && LA6_0<=62)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_NATURAL && LA6_0<=RULE_ID)||LA6_0==RULE_STRING||(LA6_0>=22 && LA6_0<=29)||(LA6_0>=31 && LA6_0<=34)||(LA6_0>=70 && LA6_0<=71)||LA6_0==76||(LA6_0>=78 && LA6_0<=79)) ) {
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
                    // InternalDmx.g:1316:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    {
                    // InternalDmx.g:1316:2: ( ( rule__DUnaryOperation__Group_0__0 ) )
                    // InternalDmx.g:1317:3: ( rule__DUnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalDmx.g:1318:3: ( rule__DUnaryOperation__Group_0__0 )
                    // InternalDmx.g:1318:4: rule__DUnaryOperation__Group_0__0
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
                    // InternalDmx.g:1322:2: ( ruleDCastExpression )
                    {
                    // InternalDmx.g:1322:2: ( ruleDCastExpression )
                    // InternalDmx.g:1323:3: ruleDCastExpression
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
    // InternalDmx.g:1332:1: rule__OpCast__Alternatives : ( ( 'AS' ) | ( 'as' ) );
    public final void rule__OpCast__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1336:1: ( ( 'AS' ) | ( 'as' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDmx.g:1337:2: ( 'AS' )
                    {
                    // InternalDmx.g:1337:2: ( 'AS' )
                    // InternalDmx.g:1338:3: 'AS'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCastAccess().getASKeyword_0()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCastAccess().getASKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1343:2: ( 'as' )
                    {
                    // InternalDmx.g:1343:2: ( 'as' )
                    // InternalDmx.g:1344:3: 'as'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCastAccess().getAsKeyword_1()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1353:1: rule__DTypedMemberReference__Alternatives_1 : ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) );
    public final void rule__DTypedMemberReference__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1357:1: ( ( ( rule__DTypedMemberReference__Group_1_0__0 ) ) | ( ( rule__DTypedMemberReference__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==67) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==EOF||(LA8_2>=RULE_PLAIN_TEXT_MIDDLE && LA8_2<=RULE_PLAIN_TEXT_END)||(LA8_2>=18 && LA8_2<=21)||LA8_2==30||(LA8_2>=37 && LA8_2<=59)||LA8_2==65||(LA8_2>=67 && LA8_2<=70)||(LA8_2>=72 && LA8_2<=75)||LA8_2==77) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==17) ) {
                        alt8=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDmx.g:1358:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    {
                    // InternalDmx.g:1358:2: ( ( rule__DTypedMemberReference__Group_1_0__0 ) )
                    // InternalDmx.g:1359:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0()); 
                    }
                    // InternalDmx.g:1360:3: ( rule__DTypedMemberReference__Group_1_0__0 )
                    // InternalDmx.g:1360:4: rule__DTypedMemberReference__Group_1_0__0
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
                    // InternalDmx.g:1364:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    {
                    // InternalDmx.g:1364:2: ( ( rule__DTypedMemberReference__Group_1_1__0 ) )
                    // InternalDmx.g:1365:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1()); 
                    }
                    // InternalDmx.g:1366:3: ( rule__DTypedMemberReference__Group_1_1__0 )
                    // InternalDmx.g:1366:4: rule__DTypedMemberReference__Group_1_1__0
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
    // InternalDmx.g:1374:1: rule__DTypedMemberReference__Alternatives_1_1_2 : ( ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) ) | ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) ) );
    public final void rule__DTypedMemberReference__Alternatives_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1378:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) ) | ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==70) ) {
                alt9=1;
            }
            else if ( (LA9_0==77) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDmx.g:1379:2: ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) )
                    {
                    // InternalDmx.g:1379:2: ( ( rule__DTypedMemberReference__Group_1_1_2_0__0 ) )
                    // InternalDmx.g:1380:3: ( rule__DTypedMemberReference__Group_1_1_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0()); 
                    }
                    // InternalDmx.g:1381:3: ( rule__DTypedMemberReference__Group_1_1_2_0__0 )
                    // InternalDmx.g:1381:4: rule__DTypedMemberReference__Group_1_1_2_0__0
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
                    // InternalDmx.g:1385:2: ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) )
                    {
                    // InternalDmx.g:1385:2: ( ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 ) )
                    // InternalDmx.g:1386:3: ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeAssignment_1_1_2_1()); 
                    }
                    // InternalDmx.g:1387:3: ( rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 )
                    // InternalDmx.g:1387:4: rule__DTypedMemberReference__BeforeAssignment_1_1_2_1
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
    // InternalDmx.g:1395:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );
    public final void rule__DPrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1399:1: ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) )
            int alt10=10;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDmx.g:1400:2: ( ruleDLiteralExpression )
                    {
                    // InternalDmx.g:1400:2: ( ruleDLiteralExpression )
                    // InternalDmx.g:1401:3: ruleDLiteralExpression
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
                    // InternalDmx.g:1406:2: ( ruleDSelfExpression )
                    {
                    // InternalDmx.g:1406:2: ( ruleDSelfExpression )
                    // InternalDmx.g:1407:3: ruleDSelfExpression
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
                    // InternalDmx.g:1412:2: ( ruleDReturnExpression )
                    {
                    // InternalDmx.g:1412:2: ( ruleDReturnExpression )
                    // InternalDmx.g:1413:3: ruleDReturnExpression
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
                    // InternalDmx.g:1418:2: ( ruleDRaiseExpression )
                    {
                    // InternalDmx.g:1418:2: ( ruleDRaiseExpression )
                    // InternalDmx.g:1419:3: ruleDRaiseExpression
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
                    // InternalDmx.g:1424:2: ( ruleDParenthesizedExpression )
                    {
                    // InternalDmx.g:1424:2: ( ruleDParenthesizedExpression )
                    // InternalDmx.g:1425:3: ruleDParenthesizedExpression
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
                    // InternalDmx.g:1430:2: ( ruleDFunctionCall )
                    {
                    // InternalDmx.g:1430:2: ( ruleDFunctionCall )
                    // InternalDmx.g:1431:3: ruleDFunctionCall
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
                    // InternalDmx.g:1436:2: ( ruleDConstructorCall )
                    {
                    // InternalDmx.g:1436:2: ( ruleDConstructorCall )
                    // InternalDmx.g:1437:3: ruleDConstructorCall
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
                    // InternalDmx.g:1442:2: ( ruleDContextReference )
                    {
                    // InternalDmx.g:1442:2: ( ruleDContextReference )
                    // InternalDmx.g:1443:3: ruleDContextReference
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
                    // InternalDmx.g:1448:2: ( ruleDIfExpression )
                    {
                    // InternalDmx.g:1448:2: ( ruleDIfExpression )
                    // InternalDmx.g:1449:3: ruleDIfExpression
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
                    // InternalDmx.g:1454:2: ( ( ruleDForLoopExpression ) )
                    {
                    // InternalDmx.g:1454:2: ( ( ruleDForLoopExpression ) )
                    // InternalDmx.g:1455:3: ( ruleDForLoopExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9()); 
                    }
                    // InternalDmx.g:1456:3: ( ruleDForLoopExpression )
                    // InternalDmx.g:1456:4: ruleDForLoopExpression
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
    // InternalDmx.g:1464:1: rule__DLiteralExpression__Alternatives : ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) );
    public final void rule__DLiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1468:1: ( ( ruleDBooleanLiteral ) | ( ruleDStringLiteral ) | ( ruleDNaturalLiteral ) | ( ruleDDecimalLiteral ) | ( ruleDNilLiteral ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 78:
            case 79:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==67) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==RULE_ID) ) {
                        alt11=3;
                    }
                    else if ( (LA11_5==RULE_NATURAL) ) {
                        alt11=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_3==EOF||(LA11_3>=RULE_PLAIN_TEXT_MIDDLE && LA11_3<=RULE_PLAIN_TEXT_END)||(LA11_3>=18 && LA11_3<=21)||LA11_3==30||(LA11_3>=37 && LA11_3<=59)||LA11_3==65||(LA11_3>=68 && LA11_3<=69)||(LA11_3>=72 && LA11_3<=75)) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 34:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDmx.g:1469:2: ( ruleDBooleanLiteral )
                    {
                    // InternalDmx.g:1469:2: ( ruleDBooleanLiteral )
                    // InternalDmx.g:1470:3: ruleDBooleanLiteral
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
                    // InternalDmx.g:1475:2: ( ruleDStringLiteral )
                    {
                    // InternalDmx.g:1475:2: ( ruleDStringLiteral )
                    // InternalDmx.g:1476:3: ruleDStringLiteral
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
                    // InternalDmx.g:1481:2: ( ruleDNaturalLiteral )
                    {
                    // InternalDmx.g:1481:2: ( ruleDNaturalLiteral )
                    // InternalDmx.g:1482:3: ruleDNaturalLiteral
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
                    // InternalDmx.g:1487:2: ( ruleDDecimalLiteral )
                    {
                    // InternalDmx.g:1487:2: ( ruleDDecimalLiteral )
                    // InternalDmx.g:1488:3: ruleDDecimalLiteral
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
                    // InternalDmx.g:1493:2: ( ruleDNilLiteral )
                    {
                    // InternalDmx.g:1493:2: ( ruleDNilLiteral )
                    // InternalDmx.g:1494:3: ruleDNilLiteral
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
    // InternalDmx.g:1503:1: rule__DSelfExpression__Alternatives_1 : ( ( 'SELF' ) | ( 'self' ) );
    public final void rule__DSelfExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1507:1: ( ( 'SELF' ) | ( 'self' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
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
                    // InternalDmx.g:1508:2: ( 'SELF' )
                    {
                    // InternalDmx.g:1508:2: ( 'SELF' )
                    // InternalDmx.g:1509:3: 'SELF'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1514:2: ( 'self' )
                    {
                    // InternalDmx.g:1514:2: ( 'self' )
                    // InternalDmx.g:1515:3: 'self'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1524:1: rule__DReturnExpression__Alternatives_1 : ( ( 'RETURN' ) | ( 'return' ) );
    public final void rule__DReturnExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1528:1: ( ( 'RETURN' ) | ( 'return' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
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
                    // InternalDmx.g:1529:2: ( 'RETURN' )
                    {
                    // InternalDmx.g:1529:2: ( 'RETURN' )
                    // InternalDmx.g:1530:3: 'RETURN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1535:2: ( 'return' )
                    {
                    // InternalDmx.g:1535:2: ( 'return' )
                    // InternalDmx.g:1536:3: 'return'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1545:1: rule__DRaiseExpression__Alternatives_1 : ( ( 'RAISE' ) | ( 'raise' ) );
    public final void rule__DRaiseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1549:1: ( ( 'RAISE' ) | ( 'raise' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
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
                    // InternalDmx.g:1550:2: ( 'RAISE' )
                    {
                    // InternalDmx.g:1550:2: ( 'RAISE' )
                    // InternalDmx.g:1551:3: 'RAISE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1556:2: ( 'raise' )
                    {
                    // InternalDmx.g:1556:2: ( 'raise' )
                    // InternalDmx.g:1557:3: 'raise'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1566:1: rule__OpConstructor__Alternatives : ( ( 'NEW' ) | ( 'new' ) );
    public final void rule__OpConstructor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1570:1: ( ( 'NEW' ) | ( 'new' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
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
                    // InternalDmx.g:1571:2: ( 'NEW' )
                    {
                    // InternalDmx.g:1571:2: ( 'NEW' )
                    // InternalDmx.g:1572:3: 'NEW'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpConstructorAccess().getNEWKeyword_0()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpConstructorAccess().getNEWKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1577:2: ( 'new' )
                    {
                    // InternalDmx.g:1577:2: ( 'new' )
                    // InternalDmx.g:1578:3: 'new'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpConstructorAccess().getNewKeyword_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1587:1: rule__MULTIPLICITY__Alternatives : ( ( RULE_NATURAL ) | ( '*' ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1591:1: ( ( RULE_NATURAL ) | ( '*' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_NATURAL) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
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
                    // InternalDmx.g:1592:2: ( RULE_NATURAL )
                    {
                    // InternalDmx.g:1592:2: ( RULE_NATURAL )
                    // InternalDmx.g:1593:3: RULE_NATURAL
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
                    // InternalDmx.g:1598:2: ( '*' )
                    {
                    // InternalDmx.g:1598:2: ( '*' )
                    // InternalDmx.g:1599:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1608:1: rule__DBooleanLiteral__Alternatives_1 : ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) );
    public final void rule__DBooleanLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1612:1: ( ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) ) | ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) ) | ( 'FALSE' ) | ( 'false' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt17=1;
                }
                break;
            case 79:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalDmx.g:1613:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    {
                    // InternalDmx.g:1613:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_0 ) )
                    // InternalDmx.g:1614:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0()); 
                    }
                    // InternalDmx.g:1615:3: ( rule__DBooleanLiteral__ValueAssignment_1_0 )
                    // InternalDmx.g:1615:4: rule__DBooleanLiteral__ValueAssignment_1_0
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
                    // InternalDmx.g:1619:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    {
                    // InternalDmx.g:1619:2: ( ( rule__DBooleanLiteral__ValueAssignment_1_1 ) )
                    // InternalDmx.g:1620:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1()); 
                    }
                    // InternalDmx.g:1621:3: ( rule__DBooleanLiteral__ValueAssignment_1_1 )
                    // InternalDmx.g:1621:4: rule__DBooleanLiteral__ValueAssignment_1_1
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
                    // InternalDmx.g:1625:2: ( 'FALSE' )
                    {
                    // InternalDmx.g:1625:2: ( 'FALSE' )
                    // InternalDmx.g:1626:3: 'FALSE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1631:2: ( 'false' )
                    {
                    // InternalDmx.g:1631:2: ( 'false' )
                    // InternalDmx.g:1632:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1641:1: rule__DNilLiteral__Alternatives_1 : ( ( 'UNDEFINED' ) | ( 'undefined' ) );
    public final void rule__DNilLiteral__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1645:1: ( ( 'UNDEFINED' ) | ( 'undefined' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
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
                    // InternalDmx.g:1646:2: ( 'UNDEFINED' )
                    {
                    // InternalDmx.g:1646:2: ( 'UNDEFINED' )
                    // InternalDmx.g:1647:3: 'UNDEFINED'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1652:2: ( 'undefined' )
                    {
                    // InternalDmx.g:1652:2: ( 'undefined' )
                    // InternalDmx.g:1653:3: 'undefined'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDNilLiteralAccess().getUndefinedKeyword_1_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDNilLiteralAccess().getUndefinedKeyword_1_1()); 
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
    // InternalDmx.g:1662:1: rule__DECIMAL__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__DECIMAL__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1666:1: ( ( 'E' ) | ( 'e' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
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
                    // InternalDmx.g:1667:2: ( 'E' )
                    {
                    // InternalDmx.g:1667:2: ( 'E' )
                    // InternalDmx.g:1668:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getEKeyword_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1673:2: ( 'e' )
                    {
                    // InternalDmx.g:1673:2: ( 'e' )
                    // InternalDmx.g:1674:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getEKeyword_3_0_1()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1683:1: rule__DECIMAL__Alternatives_3_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__DECIMAL__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1687:1: ( ( '+' ) | ( '-' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
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
                    // InternalDmx.g:1688:2: ( '+' )
                    {
                    // InternalDmx.g:1688:2: ( '+' )
                    // InternalDmx.g:1689:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }
                    match(input,37,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1694:2: ( '-' )
                    {
                    // InternalDmx.g:1694:2: ( '-' )
                    // InternalDmx.g:1695:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_3_1_1()); 
                    }
                    match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:1704:1: rule__OpOr__Alternatives : ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) );
    public final void rule__OpOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1708:1: ( ( ( 'OR' ) ) | ( ( 'or' ) ) | ( ( 'XOR' ) ) | ( ( 'xor' ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 40:
                {
                alt21=2;
                }
                break;
            case 41:
                {
                alt21=3;
                }
                break;
            case 42:
                {
                alt21=4;
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
                    // InternalDmx.g:1709:2: ( ( 'OR' ) )
                    {
                    // InternalDmx.g:1709:2: ( ( 'OR' ) )
                    // InternalDmx.g:1710:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1711:3: ( 'OR' )
                    // InternalDmx.g:1711:4: 'OR'
                    {
                    match(input,39,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1715:2: ( ( 'or' ) )
                    {
                    // InternalDmx.g:1715:2: ( ( 'or' ) )
                    // InternalDmx.g:1716:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1717:3: ( 'or' )
                    // InternalDmx.g:1717:4: 'or'
                    {
                    match(input,40,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1721:2: ( ( 'XOR' ) )
                    {
                    // InternalDmx.g:1721:2: ( ( 'XOR' ) )
                    // InternalDmx.g:1722:3: ( 'XOR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1723:3: ( 'XOR' )
                    // InternalDmx.g:1723:4: 'XOR'
                    {
                    match(input,41,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1727:2: ( ( 'xor' ) )
                    {
                    // InternalDmx.g:1727:2: ( ( 'xor' ) )
                    // InternalDmx.g:1728:3: ( 'xor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1729:3: ( 'xor' )
                    // InternalDmx.g:1729:4: 'xor'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1737:1: rule__OpAnd__Alternatives : ( ( ( 'AND' ) ) | ( ( 'and' ) ) );
    public final void rule__OpAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1741:1: ( ( ( 'AND' ) ) | ( ( 'and' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDmx.g:1742:2: ( ( 'AND' ) )
                    {
                    // InternalDmx.g:1742:2: ( ( 'AND' ) )
                    // InternalDmx.g:1743:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1744:3: ( 'AND' )
                    // InternalDmx.g:1744:4: 'AND'
                    {
                    match(input,43,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1748:2: ( ( 'and' ) )
                    {
                    // InternalDmx.g:1748:2: ( ( 'and' ) )
                    // InternalDmx.g:1749:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1750:3: ( 'and' )
                    // InternalDmx.g:1750:4: 'and'
                    {
                    match(input,44,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1758:1: rule__OpEquality__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) );
    public final void rule__OpEquality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1762:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<>' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
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
                    // InternalDmx.g:1763:2: ( ( '=' ) )
                    {
                    // InternalDmx.g:1763:2: ( ( '=' ) )
                    // InternalDmx.g:1764:3: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1765:3: ( '=' )
                    // InternalDmx.g:1765:4: '='
                    {
                    match(input,45,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1769:2: ( ( '!=' ) )
                    {
                    // InternalDmx.g:1769:2: ( ( '!=' ) )
                    // InternalDmx.g:1770:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1771:3: ( '!=' )
                    // InternalDmx.g:1771:4: '!='
                    {
                    match(input,46,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1775:2: ( ( '<>' ) )
                    {
                    // InternalDmx.g:1775:2: ( ( '<>' ) )
                    // InternalDmx.g:1776:3: ( '<>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1777:3: ( '<>' )
                    // InternalDmx.g:1777:4: '<>'
                    {
                    match(input,47,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1785:1: rule__OpCompare__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) );
    public final void rule__OpCompare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1789:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '\\u2264' ) ) | ( ( '>=' ) ) | ( ( '\\u2265' ) ) | ( ( '>' ) ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt24=1;
                }
                break;
            case 49:
                {
                alt24=2;
                }
                break;
            case 50:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            case 52:
                {
                alt24=5;
                }
                break;
            case 53:
                {
                alt24=6;
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
                    // InternalDmx.g:1790:2: ( ( '<' ) )
                    {
                    // InternalDmx.g:1790:2: ( ( '<' ) )
                    // InternalDmx.g:1791:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1792:3: ( '<' )
                    // InternalDmx.g:1792:4: '<'
                    {
                    match(input,48,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1796:2: ( ( '<=' ) )
                    {
                    // InternalDmx.g:1796:2: ( ( '<=' ) )
                    // InternalDmx.g:1797:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1798:3: ( '<=' )
                    // InternalDmx.g:1798:4: '<='
                    {
                    match(input,49,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1802:2: ( ( '\\u2264' ) )
                    {
                    // InternalDmx.g:1802:2: ( ( '\\u2264' ) )
                    // InternalDmx.g:1803:3: ( '\\u2264' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1804:3: ( '\\u2264' )
                    // InternalDmx.g:1804:4: '\\u2264'
                    {
                    match(input,50,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1808:2: ( ( '>=' ) )
                    {
                    // InternalDmx.g:1808:2: ( ( '>=' ) )
                    // InternalDmx.g:1809:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1810:3: ( '>=' )
                    // InternalDmx.g:1810:4: '>='
                    {
                    match(input,51,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1814:2: ( ( '\\u2265' ) )
                    {
                    // InternalDmx.g:1814:2: ( ( '\\u2265' ) )
                    // InternalDmx.g:1815:3: ( '\\u2265' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1816:3: ( '\\u2265' )
                    // InternalDmx.g:1816:4: '\\u2265'
                    {
                    match(input,52,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:1820:2: ( ( '>' ) )
                    {
                    // InternalDmx.g:1820:2: ( ( '>' ) )
                    // InternalDmx.g:1821:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5()); 
                    }
                    // InternalDmx.g:1822:3: ( '>' )
                    // InternalDmx.g:1822:4: '>'
                    {
                    match(input,53,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1830:1: rule__OpOther__Alternatives : ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) );
    public final void rule__OpOther__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1834:1: ( ( ( '..' ) ) | ( ( '->' ) ) | ( ( '=>' ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt25=1;
                }
                break;
            case 55:
                {
                alt25=2;
                }
                break;
            case 56:
                {
                alt25=3;
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
                    // InternalDmx.g:1835:2: ( ( '..' ) )
                    {
                    // InternalDmx.g:1835:2: ( ( '..' ) )
                    // InternalDmx.g:1836:3: ( '..' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1837:3: ( '..' )
                    // InternalDmx.g:1837:4: '..'
                    {
                    match(input,54,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1841:2: ( ( '->' ) )
                    {
                    // InternalDmx.g:1841:2: ( ( '->' ) )
                    // InternalDmx.g:1842:3: ( '->' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1843:3: ( '->' )
                    // InternalDmx.g:1843:4: '->'
                    {
                    match(input,55,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1847:2: ( ( '=>' ) )
                    {
                    // InternalDmx.g:1847:2: ( ( '=>' ) )
                    // InternalDmx.g:1848:3: ( '=>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1849:3: ( '=>' )
                    // InternalDmx.g:1849:4: '=>'
                    {
                    match(input,56,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1857:1: rule__OpAdd__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OpAdd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1861:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDmx.g:1862:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1862:2: ( ( '+' ) )
                    // InternalDmx.g:1863:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1864:3: ( '+' )
                    // InternalDmx.g:1864:4: '+'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1868:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1868:2: ( ( '-' ) )
                    // InternalDmx.g:1869:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1870:3: ( '-' )
                    // InternalDmx.g:1870:4: '-'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1878:1: rule__OpMulti__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) );
    public final void rule__OpMulti__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1882:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '**' ) ) | ( ( '%' ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 57:
                {
                alt27=2;
                }
                break;
            case 58:
                {
                alt27=3;
                }
                break;
            case 59:
                {
                alt27=4;
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
                    // InternalDmx.g:1883:2: ( ( '*' ) )
                    {
                    // InternalDmx.g:1883:2: ( ( '*' ) )
                    // InternalDmx.g:1884:3: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1885:3: ( '*' )
                    // InternalDmx.g:1885:4: '*'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1889:2: ( ( '/' ) )
                    {
                    // InternalDmx.g:1889:2: ( ( '/' ) )
                    // InternalDmx.g:1890:3: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1891:3: ( '/' )
                    // InternalDmx.g:1891:4: '/'
                    {
                    match(input,57,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1895:2: ( ( '**' ) )
                    {
                    // InternalDmx.g:1895:2: ( ( '**' ) )
                    // InternalDmx.g:1896:3: ( '**' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1897:3: ( '**' )
                    // InternalDmx.g:1897:4: '**'
                    {
                    match(input,58,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1901:2: ( ( '%' ) )
                    {
                    // InternalDmx.g:1901:2: ( ( '%' ) )
                    // InternalDmx.g:1902:3: ( '%' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1903:3: ( '%' )
                    // InternalDmx.g:1903:4: '%'
                    {
                    match(input,59,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1911:1: rule__OpUnary__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) );
    public final void rule__OpUnary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1915:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '!' ) ) | ( ( 'NOT' ) ) | ( ( 'not' ) ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt28=1;
                }
                break;
            case 38:
                {
                alt28=2;
                }
                break;
            case 60:
                {
                alt28=3;
                }
                break;
            case 61:
                {
                alt28=4;
                }
                break;
            case 62:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDmx.g:1916:2: ( ( '+' ) )
                    {
                    // InternalDmx.g:1916:2: ( ( '+' ) )
                    // InternalDmx.g:1917:3: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }
                    // InternalDmx.g:1918:3: ( '+' )
                    // InternalDmx.g:1918:4: '+'
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1922:2: ( ( '-' ) )
                    {
                    // InternalDmx.g:1922:2: ( ( '-' ) )
                    // InternalDmx.g:1923:3: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }
                    // InternalDmx.g:1924:3: ( '-' )
                    // InternalDmx.g:1924:4: '-'
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:1928:2: ( ( '!' ) )
                    {
                    // InternalDmx.g:1928:2: ( ( '!' ) )
                    // InternalDmx.g:1929:3: ( '!' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }
                    // InternalDmx.g:1930:3: ( '!' )
                    // InternalDmx.g:1930:4: '!'
                    {
                    match(input,60,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:1934:2: ( ( 'NOT' ) )
                    {
                    // InternalDmx.g:1934:2: ( ( 'NOT' ) )
                    // InternalDmx.g:1935:3: ( 'NOT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }
                    // InternalDmx.g:1936:3: ( 'NOT' )
                    // InternalDmx.g:1936:4: 'NOT'
                    {
                    match(input,61,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:1940:2: ( ( 'not' ) )
                    {
                    // InternalDmx.g:1940:2: ( ( 'not' ) )
                    // InternalDmx.g:1941:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4()); 
                    }
                    // InternalDmx.g:1942:3: ( 'not' )
                    // InternalDmx.g:1942:4: 'not'
                    {
                    match(input,62,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:1950:1: rule__DmxModel__Group__0 : rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 ;
    public final void rule__DmxModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1954:1: ( rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1 )
            // InternalDmx.g:1955:2: rule__DmxModel__Group__0__Impl rule__DmxModel__Group__1
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
    // InternalDmx.g:1962:1: rule__DmxModel__Group__0__Impl : ( () ) ;
    public final void rule__DmxModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1966:1: ( ( () ) )
            // InternalDmx.g:1967:1: ( () )
            {
            // InternalDmx.g:1967:1: ( () )
            // InternalDmx.g:1968:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getDmxModelAction_0()); 
            }
            // InternalDmx.g:1969:2: ()
            // InternalDmx.g:1969:3: 
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
    // InternalDmx.g:1977:1: rule__DmxModel__Group__1 : rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 ;
    public final void rule__DmxModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1981:1: ( rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2 )
            // InternalDmx.g:1982:2: rule__DmxModel__Group__1__Impl rule__DmxModel__Group__2
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
    // InternalDmx.g:1989:1: rule__DmxModel__Group__1__Impl : ( ( rule__DmxModel__Group_1__0 )* ) ;
    public final void rule__DmxModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:1993:1: ( ( ( rule__DmxModel__Group_1__0 )* ) )
            // InternalDmx.g:1994:1: ( ( rule__DmxModel__Group_1__0 )* )
            {
            // InternalDmx.g:1994:1: ( ( rule__DmxModel__Group_1__0 )* )
            // InternalDmx.g:1995:2: ( rule__DmxModel__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_1()); 
            }
            // InternalDmx.g:1996:2: ( rule__DmxModel__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==63) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDmx.g:1996:3: rule__DmxModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DmxModel__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDmx.g:2004:1: rule__DmxModel__Group__2 : rule__DmxModel__Group__2__Impl ;
    public final void rule__DmxModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2008:1: ( rule__DmxModel__Group__2__Impl )
            // InternalDmx.g:2009:2: rule__DmxModel__Group__2__Impl
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
    // InternalDmx.g:2015:1: rule__DmxModel__Group__2__Impl : ( ( rule__DmxModel__Group_2__0 )* ) ;
    public final void rule__DmxModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2019:1: ( ( ( rule__DmxModel__Group_2__0 )* ) )
            // InternalDmx.g:2020:1: ( ( rule__DmxModel__Group_2__0 )* )
            {
            // InternalDmx.g:2020:1: ( ( rule__DmxModel__Group_2__0 )* )
            // InternalDmx.g:2021:2: ( rule__DmxModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getGroup_2()); 
            }
            // InternalDmx.g:2022:2: ( rule__DmxModel__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==66) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDmx.g:2022:3: rule__DmxModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DmxModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalDmx.g:2031:1: rule__DmxModel__Group_1__0 : rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 ;
    public final void rule__DmxModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2035:1: ( rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1 )
            // InternalDmx.g:2036:2: rule__DmxModel__Group_1__0__Impl rule__DmxModel__Group_1__1
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
    // InternalDmx.g:2043:1: rule__DmxModel__Group_1__0__Impl : ( 'text' ) ;
    public final void rule__DmxModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2047:1: ( ( 'text' ) )
            // InternalDmx.g:2048:1: ( 'text' )
            {
            // InternalDmx.g:2048:1: ( 'text' )
            // InternalDmx.g:2049:2: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextKeyword_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2058:1: rule__DmxModel__Group_1__1 : rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 ;
    public final void rule__DmxModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2062:1: ( rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2 )
            // InternalDmx.g:2063:2: rule__DmxModel__Group_1__1__Impl rule__DmxModel__Group_1__2
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
    // InternalDmx.g:2070:1: rule__DmxModel__Group_1__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2074:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2075:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2075:1: ( RULE_NATURAL )
            // InternalDmx.g:2076:2: RULE_NATURAL
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
    // InternalDmx.g:2085:1: rule__DmxModel__Group_1__2 : rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 ;
    public final void rule__DmxModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2089:1: ( rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3 )
            // InternalDmx.g:2090:2: rule__DmxModel__Group_1__2__Impl rule__DmxModel__Group_1__3
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
    // InternalDmx.g:2097:1: rule__DmxModel__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2101:1: ( ( ':' ) )
            // InternalDmx.g:2102:1: ( ':' )
            {
            // InternalDmx.g:2102:1: ( ':' )
            // InternalDmx.g:2103:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getColonKeyword_1_2()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2112:1: rule__DmxModel__Group_1__3 : rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 ;
    public final void rule__DmxModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2116:1: ( rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4 )
            // InternalDmx.g:2117:2: rule__DmxModel__Group_1__3__Impl rule__DmxModel__Group_1__4
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
    // InternalDmx.g:2124:1: rule__DmxModel__Group_1__3__Impl : ( ( rule__DmxModel__TextsAssignment_1_3 ) ) ;
    public final void rule__DmxModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2128:1: ( ( ( rule__DmxModel__TextsAssignment_1_3 ) ) )
            // InternalDmx.g:2129:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            {
            // InternalDmx.g:2129:1: ( ( rule__DmxModel__TextsAssignment_1_3 ) )
            // InternalDmx.g:2130:2: ( rule__DmxModel__TextsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getTextsAssignment_1_3()); 
            }
            // InternalDmx.g:2131:2: ( rule__DmxModel__TextsAssignment_1_3 )
            // InternalDmx.g:2131:3: rule__DmxModel__TextsAssignment_1_3
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
    // InternalDmx.g:2139:1: rule__DmxModel__Group_1__4 : rule__DmxModel__Group_1__4__Impl ;
    public final void rule__DmxModel__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2143:1: ( rule__DmxModel__Group_1__4__Impl )
            // InternalDmx.g:2144:2: rule__DmxModel__Group_1__4__Impl
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
    // InternalDmx.g:2150:1: rule__DmxModel__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2154:1: ( ( ';' ) )
            // InternalDmx.g:2155:1: ( ';' )
            {
            // InternalDmx.g:2155:1: ( ';' )
            // InternalDmx.g:2156:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getSemicolonKeyword_1_4()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2166:1: rule__DmxModel__Group_2__0 : rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 ;
    public final void rule__DmxModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2170:1: ( rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1 )
            // InternalDmx.g:2171:2: rule__DmxModel__Group_2__0__Impl rule__DmxModel__Group_2__1
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
    // InternalDmx.g:2178:1: rule__DmxModel__Group_2__0__Impl : ( 'expr' ) ;
    public final void rule__DmxModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2182:1: ( ( 'expr' ) )
            // InternalDmx.g:2183:1: ( 'expr' )
            {
            // InternalDmx.g:2183:1: ( 'expr' )
            // InternalDmx.g:2184:2: 'expr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExprKeyword_2_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2193:1: rule__DmxModel__Group_2__1 : rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 ;
    public final void rule__DmxModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2197:1: ( rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2 )
            // InternalDmx.g:2198:2: rule__DmxModel__Group_2__1__Impl rule__DmxModel__Group_2__2
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
    // InternalDmx.g:2205:1: rule__DmxModel__Group_2__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__DmxModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2209:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:2210:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:2210:1: ( RULE_NATURAL )
            // InternalDmx.g:2211:2: RULE_NATURAL
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
    // InternalDmx.g:2220:1: rule__DmxModel__Group_2__2 : rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 ;
    public final void rule__DmxModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2224:1: ( rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3 )
            // InternalDmx.g:2225:2: rule__DmxModel__Group_2__2__Impl rule__DmxModel__Group_2__3
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
    // InternalDmx.g:2232:1: rule__DmxModel__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DmxModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2236:1: ( ( ':' ) )
            // InternalDmx.g:2237:1: ( ':' )
            {
            // InternalDmx.g:2237:1: ( ':' )
            // InternalDmx.g:2238:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getColonKeyword_2_2()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2247:1: rule__DmxModel__Group_2__3 : rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 ;
    public final void rule__DmxModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2251:1: ( rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4 )
            // InternalDmx.g:2252:2: rule__DmxModel__Group_2__3__Impl rule__DmxModel__Group_2__4
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
    // InternalDmx.g:2259:1: rule__DmxModel__Group_2__3__Impl : ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) ;
    public final void rule__DmxModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2263:1: ( ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) ) )
            // InternalDmx.g:2264:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            {
            // InternalDmx.g:2264:1: ( ( rule__DmxModel__ExpressionsAssignment_2_3 ) )
            // InternalDmx.g:2265:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getExpressionsAssignment_2_3()); 
            }
            // InternalDmx.g:2266:2: ( rule__DmxModel__ExpressionsAssignment_2_3 )
            // InternalDmx.g:2266:3: rule__DmxModel__ExpressionsAssignment_2_3
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
    // InternalDmx.g:2274:1: rule__DmxModel__Group_2__4 : rule__DmxModel__Group_2__4__Impl ;
    public final void rule__DmxModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2278:1: ( rule__DmxModel__Group_2__4__Impl )
            // InternalDmx.g:2279:2: rule__DmxModel__Group_2__4__Impl
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
    // InternalDmx.g:2285:1: rule__DmxModel__Group_2__4__Impl : ( ';' ) ;
    public final void rule__DmxModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2289:1: ( ( ';' ) )
            // InternalDmx.g:2290:1: ( ';' )
            {
            // InternalDmx.g:2290:1: ( ';' )
            // InternalDmx.g:2291:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDmxModelAccess().getSemicolonKeyword_2_4()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:2301:1: rule__DRichText__Group_1__0 : rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 ;
    public final void rule__DRichText__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2305:1: ( rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1 )
            // InternalDmx.g:2306:2: rule__DRichText__Group_1__0__Impl rule__DRichText__Group_1__1
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
    // InternalDmx.g:2313:1: rule__DRichText__Group_1__0__Impl : ( ( rule__DRichText__SegmentsAssignment_1_0 ) ) ;
    public final void rule__DRichText__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2317:1: ( ( ( rule__DRichText__SegmentsAssignment_1_0 ) ) )
            // InternalDmx.g:2318:1: ( ( rule__DRichText__SegmentsAssignment_1_0 ) )
            {
            // InternalDmx.g:2318:1: ( ( rule__DRichText__SegmentsAssignment_1_0 ) )
            // InternalDmx.g:2319:2: ( rule__DRichText__SegmentsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_0()); 
            }
            // InternalDmx.g:2320:2: ( rule__DRichText__SegmentsAssignment_1_0 )
            // InternalDmx.g:2320:3: rule__DRichText__SegmentsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__SegmentsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_0()); 
            }

            }


            }

        }
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
    // InternalDmx.g:2328:1: rule__DRichText__Group_1__1 : rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 ;
    public final void rule__DRichText__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2332:1: ( rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2 )
            // InternalDmx.g:2333:2: rule__DRichText__Group_1__1__Impl rule__DRichText__Group_1__2
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
    // InternalDmx.g:2340:1: rule__DRichText__Group_1__1__Impl : ( ( rule__DRichText__SegmentsAssignment_1_1 ) ) ;
    public final void rule__DRichText__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2344:1: ( ( ( rule__DRichText__SegmentsAssignment_1_1 ) ) )
            // InternalDmx.g:2345:1: ( ( rule__DRichText__SegmentsAssignment_1_1 ) )
            {
            // InternalDmx.g:2345:1: ( ( rule__DRichText__SegmentsAssignment_1_1 ) )
            // InternalDmx.g:2346:2: ( rule__DRichText__SegmentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_1()); 
            }
            // InternalDmx.g:2347:2: ( rule__DRichText__SegmentsAssignment_1_1 )
            // InternalDmx.g:2347:3: rule__DRichText__SegmentsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__SegmentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_1()); 
            }

            }


            }

        }
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
    // InternalDmx.g:2355:1: rule__DRichText__Group_1__2 : rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 ;
    public final void rule__DRichText__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2359:1: ( rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3 )
            // InternalDmx.g:2360:2: rule__DRichText__Group_1__2__Impl rule__DRichText__Group_1__3
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
    // InternalDmx.g:2367:1: rule__DRichText__Group_1__2__Impl : ( ( rule__DRichText__Group_1_2__0 )* ) ;
    public final void rule__DRichText__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2371:1: ( ( ( rule__DRichText__Group_1_2__0 )* ) )
            // InternalDmx.g:2372:1: ( ( rule__DRichText__Group_1_2__0 )* )
            {
            // InternalDmx.g:2372:1: ( ( rule__DRichText__Group_1_2__0 )* )
            // InternalDmx.g:2373:2: ( rule__DRichText__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getGroup_1_2()); 
            }
            // InternalDmx.g:2374:2: ( rule__DRichText__Group_1_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDmx.g:2374:3: rule__DRichText__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DRichText__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalDmx.g:2382:1: rule__DRichText__Group_1__3 : rule__DRichText__Group_1__3__Impl ;
    public final void rule__DRichText__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2386:1: ( rule__DRichText__Group_1__3__Impl )
            // InternalDmx.g:2387:2: rule__DRichText__Group_1__3__Impl
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
    // InternalDmx.g:2393:1: rule__DRichText__Group_1__3__Impl : ( ( rule__DRichText__SegmentsAssignment_1_3 ) ) ;
    public final void rule__DRichText__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2397:1: ( ( ( rule__DRichText__SegmentsAssignment_1_3 ) ) )
            // InternalDmx.g:2398:1: ( ( rule__DRichText__SegmentsAssignment_1_3 ) )
            {
            // InternalDmx.g:2398:1: ( ( rule__DRichText__SegmentsAssignment_1_3 ) )
            // InternalDmx.g:2399:2: ( rule__DRichText__SegmentsAssignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_3()); 
            }
            // InternalDmx.g:2400:2: ( rule__DRichText__SegmentsAssignment_1_3 )
            // InternalDmx.g:2400:3: rule__DRichText__SegmentsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__SegmentsAssignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_3()); 
            }

            }


            }

        }
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
    // InternalDmx.g:2409:1: rule__DRichText__Group_1_2__0 : rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 ;
    public final void rule__DRichText__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2413:1: ( rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1 )
            // InternalDmx.g:2414:2: rule__DRichText__Group_1_2__0__Impl rule__DRichText__Group_1_2__1
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
    // InternalDmx.g:2421:1: rule__DRichText__Group_1_2__0__Impl : ( ( rule__DRichText__SegmentsAssignment_1_2_0 ) ) ;
    public final void rule__DRichText__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2425:1: ( ( ( rule__DRichText__SegmentsAssignment_1_2_0 ) ) )
            // InternalDmx.g:2426:1: ( ( rule__DRichText__SegmentsAssignment_1_2_0 ) )
            {
            // InternalDmx.g:2426:1: ( ( rule__DRichText__SegmentsAssignment_1_2_0 ) )
            // InternalDmx.g:2427:2: ( rule__DRichText__SegmentsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_0()); 
            }
            // InternalDmx.g:2428:2: ( rule__DRichText__SegmentsAssignment_1_2_0 )
            // InternalDmx.g:2428:3: rule__DRichText__SegmentsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__SegmentsAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_0()); 
            }

            }


            }

        }
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
    // InternalDmx.g:2436:1: rule__DRichText__Group_1_2__1 : rule__DRichText__Group_1_2__1__Impl ;
    public final void rule__DRichText__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2440:1: ( rule__DRichText__Group_1_2__1__Impl )
            // InternalDmx.g:2441:2: rule__DRichText__Group_1_2__1__Impl
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
    // InternalDmx.g:2447:1: rule__DRichText__Group_1_2__1__Impl : ( ( rule__DRichText__SegmentsAssignment_1_2_1 ) ) ;
    public final void rule__DRichText__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2451:1: ( ( ( rule__DRichText__SegmentsAssignment_1_2_1 ) ) )
            // InternalDmx.g:2452:1: ( ( rule__DRichText__SegmentsAssignment_1_2_1 ) )
            {
            // InternalDmx.g:2452:1: ( ( rule__DRichText__SegmentsAssignment_1_2_1 ) )
            // InternalDmx.g:2453:2: ( rule__DRichText__SegmentsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_1()); 
            }
            // InternalDmx.g:2454:2: ( rule__DRichText__SegmentsAssignment_1_2_1 )
            // InternalDmx.g:2454:3: rule__DRichText__SegmentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DRichText__SegmentsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_1()); 
            }

            }


            }

        }
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
    // InternalDmx.g:2463:1: rule__DAssignment__Group_0__0 : rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 ;
    public final void rule__DAssignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2467:1: ( rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1 )
            // InternalDmx.g:2468:2: rule__DAssignment__Group_0__0__Impl rule__DAssignment__Group_0__1
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
    // InternalDmx.g:2475:1: rule__DAssignment__Group_0__0__Impl : ( () ) ;
    public final void rule__DAssignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2479:1: ( ( () ) )
            // InternalDmx.g:2480:1: ( () )
            {
            // InternalDmx.g:2480:1: ( () )
            // InternalDmx.g:2481:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0()); 
            }
            // InternalDmx.g:2482:2: ()
            // InternalDmx.g:2482:3: 
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
    // InternalDmx.g:2490:1: rule__DAssignment__Group_0__1 : rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 ;
    public final void rule__DAssignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2494:1: ( rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2 )
            // InternalDmx.g:2495:2: rule__DAssignment__Group_0__1__Impl rule__DAssignment__Group_0__2
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
    // InternalDmx.g:2502:1: rule__DAssignment__Group_0__1__Impl : ( ( rule__DAssignment__MemberAssignment_0_1 ) ) ;
    public final void rule__DAssignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2506:1: ( ( ( rule__DAssignment__MemberAssignment_0_1 ) ) )
            // InternalDmx.g:2507:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            {
            // InternalDmx.g:2507:1: ( ( rule__DAssignment__MemberAssignment_0_1 ) )
            // InternalDmx.g:2508:2: ( rule__DAssignment__MemberAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberAssignment_0_1()); 
            }
            // InternalDmx.g:2509:2: ( rule__DAssignment__MemberAssignment_0_1 )
            // InternalDmx.g:2509:3: rule__DAssignment__MemberAssignment_0_1
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
    // InternalDmx.g:2517:1: rule__DAssignment__Group_0__2 : rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 ;
    public final void rule__DAssignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2521:1: ( rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3 )
            // InternalDmx.g:2522:2: rule__DAssignment__Group_0__2__Impl rule__DAssignment__Group_0__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:2529:1: rule__DAssignment__Group_0__2__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DAssignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2533:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:2534:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:2534:1: ( ruleOpSingleAssign )
            // InternalDmx.g:2535:2: ruleOpSingleAssign
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
    // InternalDmx.g:2544:1: rule__DAssignment__Group_0__3 : rule__DAssignment__Group_0__3__Impl ;
    public final void rule__DAssignment__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2548:1: ( rule__DAssignment__Group_0__3__Impl )
            // InternalDmx.g:2549:2: rule__DAssignment__Group_0__3__Impl
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
    // InternalDmx.g:2555:1: rule__DAssignment__Group_0__3__Impl : ( ( rule__DAssignment__ValueAssignment_0_3 ) ) ;
    public final void rule__DAssignment__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2559:1: ( ( ( rule__DAssignment__ValueAssignment_0_3 ) ) )
            // InternalDmx.g:2560:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            {
            // InternalDmx.g:2560:1: ( ( rule__DAssignment__ValueAssignment_0_3 ) )
            // InternalDmx.g:2561:2: ( rule__DAssignment__ValueAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3()); 
            }
            // InternalDmx.g:2562:2: ( rule__DAssignment__ValueAssignment_0_3 )
            // InternalDmx.g:2562:3: rule__DAssignment__ValueAssignment_0_3
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
    // InternalDmx.g:2571:1: rule__DOrExpression__Group__0 : rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 ;
    public final void rule__DOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2575:1: ( rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1 )
            // InternalDmx.g:2576:2: rule__DOrExpression__Group__0__Impl rule__DOrExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDmx.g:2583:1: rule__DOrExpression__Group__0__Impl : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2587:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:2588:1: ( ruleDAndExpression )
            {
            // InternalDmx.g:2588:1: ( ruleDAndExpression )
            // InternalDmx.g:2589:2: ruleDAndExpression
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
    // InternalDmx.g:2598:1: rule__DOrExpression__Group__1 : rule__DOrExpression__Group__1__Impl ;
    public final void rule__DOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2602:1: ( rule__DOrExpression__Group__1__Impl )
            // InternalDmx.g:2603:2: rule__DOrExpression__Group__1__Impl
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
    // InternalDmx.g:2609:1: rule__DOrExpression__Group__1__Impl : ( ( rule__DOrExpression__Group_1__0 )* ) ;
    public final void rule__DOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2613:1: ( ( ( rule__DOrExpression__Group_1__0 )* ) )
            // InternalDmx.g:2614:1: ( ( rule__DOrExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2614:1: ( ( rule__DOrExpression__Group_1__0 )* )
            // InternalDmx.g:2615:2: ( rule__DOrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2616:2: ( rule__DOrExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA32_5 = input.LA(2);

                    if ( (synpred58_InternalDmx()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // InternalDmx.g:2616:3: rule__DOrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DOrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalDmx.g:2625:1: rule__DOrExpression__Group_1__0 : rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 ;
    public final void rule__DOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2629:1: ( rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1 )
            // InternalDmx.g:2630:2: rule__DOrExpression__Group_1__0__Impl rule__DOrExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:2637:1: rule__DOrExpression__Group_1__0__Impl : ( ( rule__DOrExpression__Group_1_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2641:1: ( ( ( rule__DOrExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2642:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2642:1: ( ( rule__DOrExpression__Group_1_0__0 ) )
            // InternalDmx.g:2643:2: ( rule__DOrExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2644:2: ( rule__DOrExpression__Group_1_0__0 )
            // InternalDmx.g:2644:3: rule__DOrExpression__Group_1_0__0
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
    // InternalDmx.g:2652:1: rule__DOrExpression__Group_1__1 : rule__DOrExpression__Group_1__1__Impl ;
    public final void rule__DOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2656:1: ( rule__DOrExpression__Group_1__1__Impl )
            // InternalDmx.g:2657:2: rule__DOrExpression__Group_1__1__Impl
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
    // InternalDmx.g:2663:1: rule__DOrExpression__Group_1__1__Impl : ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2667:1: ( ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2668:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2668:1: ( ( rule__DOrExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2669:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2670:2: ( rule__DOrExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2670:3: rule__DOrExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2679:1: rule__DOrExpression__Group_1_0__0 : rule__DOrExpression__Group_1_0__0__Impl ;
    public final void rule__DOrExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2683:1: ( rule__DOrExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2684:2: rule__DOrExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2690:1: rule__DOrExpression__Group_1_0__0__Impl : ( ( rule__DOrExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOrExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2694:1: ( ( ( rule__DOrExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2695:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2695:1: ( ( rule__DOrExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2696:2: ( rule__DOrExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2697:2: ( rule__DOrExpression__Group_1_0_0__0 )
            // InternalDmx.g:2697:3: rule__DOrExpression__Group_1_0_0__0
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
    // InternalDmx.g:2706:1: rule__DOrExpression__Group_1_0_0__0 : rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 ;
    public final void rule__DOrExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2710:1: ( rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1 )
            // InternalDmx.g:2711:2: rule__DOrExpression__Group_1_0_0__0__Impl rule__DOrExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDmx.g:2718:1: rule__DOrExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOrExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2722:1: ( ( () ) )
            // InternalDmx.g:2723:1: ( () )
            {
            // InternalDmx.g:2723:1: ( () )
            // InternalDmx.g:2724:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2725:2: ()
            // InternalDmx.g:2725:3: 
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
    // InternalDmx.g:2733:1: rule__DOrExpression__Group_1_0_0__1 : rule__DOrExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOrExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2737:1: ( rule__DOrExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2738:2: rule__DOrExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2744:1: rule__DOrExpression__Group_1_0_0__1__Impl : ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOrExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2748:1: ( ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2749:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2749:1: ( ( rule__DOrExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2750:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2751:2: ( rule__DOrExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2751:3: rule__DOrExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2760:1: rule__DAndExpression__Group__0 : rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 ;
    public final void rule__DAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2764:1: ( rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1 )
            // InternalDmx.g:2765:2: rule__DAndExpression__Group__0__Impl rule__DAndExpression__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDmx.g:2772:1: rule__DAndExpression__Group__0__Impl : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2776:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:2777:1: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:2777:1: ( ruleDEqualityExpression )
            // InternalDmx.g:2778:2: ruleDEqualityExpression
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
    // InternalDmx.g:2787:1: rule__DAndExpression__Group__1 : rule__DAndExpression__Group__1__Impl ;
    public final void rule__DAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2791:1: ( rule__DAndExpression__Group__1__Impl )
            // InternalDmx.g:2792:2: rule__DAndExpression__Group__1__Impl
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
    // InternalDmx.g:2798:1: rule__DAndExpression__Group__1__Impl : ( ( rule__DAndExpression__Group_1__0 )* ) ;
    public final void rule__DAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2802:1: ( ( ( rule__DAndExpression__Group_1__0 )* ) )
            // InternalDmx.g:2803:1: ( ( rule__DAndExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2803:1: ( ( rule__DAndExpression__Group_1__0 )* )
            // InternalDmx.g:2804:2: ( rule__DAndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2805:2: ( rule__DAndExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==44) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred59_InternalDmx()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalDmx.g:2805:3: rule__DAndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DAndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalDmx.g:2814:1: rule__DAndExpression__Group_1__0 : rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 ;
    public final void rule__DAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2818:1: ( rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1 )
            // InternalDmx.g:2819:2: rule__DAndExpression__Group_1__0__Impl rule__DAndExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:2826:1: rule__DAndExpression__Group_1__0__Impl : ( ( rule__DAndExpression__Group_1_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2830:1: ( ( ( rule__DAndExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:2831:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:2831:1: ( ( rule__DAndExpression__Group_1_0__0 ) )
            // InternalDmx.g:2832:2: ( rule__DAndExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:2833:2: ( rule__DAndExpression__Group_1_0__0 )
            // InternalDmx.g:2833:3: rule__DAndExpression__Group_1_0__0
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
    // InternalDmx.g:2841:1: rule__DAndExpression__Group_1__1 : rule__DAndExpression__Group_1__1__Impl ;
    public final void rule__DAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2845:1: ( rule__DAndExpression__Group_1__1__Impl )
            // InternalDmx.g:2846:2: rule__DAndExpression__Group_1__1__Impl
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
    // InternalDmx.g:2852:1: rule__DAndExpression__Group_1__1__Impl : ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2856:1: ( ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:2857:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:2857:1: ( ( rule__DAndExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:2858:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:2859:2: ( rule__DAndExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:2859:3: rule__DAndExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:2868:1: rule__DAndExpression__Group_1_0__0 : rule__DAndExpression__Group_1_0__0__Impl ;
    public final void rule__DAndExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2872:1: ( rule__DAndExpression__Group_1_0__0__Impl )
            // InternalDmx.g:2873:2: rule__DAndExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:2879:1: rule__DAndExpression__Group_1_0__0__Impl : ( ( rule__DAndExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAndExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2883:1: ( ( ( rule__DAndExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:2884:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:2884:1: ( ( rule__DAndExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:2885:2: ( rule__DAndExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:2886:2: ( rule__DAndExpression__Group_1_0_0__0 )
            // InternalDmx.g:2886:3: rule__DAndExpression__Group_1_0_0__0
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
    // InternalDmx.g:2895:1: rule__DAndExpression__Group_1_0_0__0 : rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 ;
    public final void rule__DAndExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2899:1: ( rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1 )
            // InternalDmx.g:2900:2: rule__DAndExpression__Group_1_0_0__0__Impl rule__DAndExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDmx.g:2907:1: rule__DAndExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAndExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2911:1: ( ( () ) )
            // InternalDmx.g:2912:1: ( () )
            {
            // InternalDmx.g:2912:1: ( () )
            // InternalDmx.g:2913:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:2914:2: ()
            // InternalDmx.g:2914:3: 
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
    // InternalDmx.g:2922:1: rule__DAndExpression__Group_1_0_0__1 : rule__DAndExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAndExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2926:1: ( rule__DAndExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:2927:2: rule__DAndExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:2933:1: rule__DAndExpression__Group_1_0_0__1__Impl : ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAndExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2937:1: ( ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:2938:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:2938:1: ( ( rule__DAndExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:2939:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:2940:2: ( rule__DAndExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:2940:3: rule__DAndExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:2949:1: rule__DEqualityExpression__Group__0 : rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 ;
    public final void rule__DEqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2953:1: ( rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1 )
            // InternalDmx.g:2954:2: rule__DEqualityExpression__Group__0__Impl rule__DEqualityExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDmx.g:2961:1: rule__DEqualityExpression__Group__0__Impl : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2965:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:2966:1: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:2966:1: ( ruleDRelationalExpression )
            // InternalDmx.g:2967:2: ruleDRelationalExpression
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
    // InternalDmx.g:2976:1: rule__DEqualityExpression__Group__1 : rule__DEqualityExpression__Group__1__Impl ;
    public final void rule__DEqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2980:1: ( rule__DEqualityExpression__Group__1__Impl )
            // InternalDmx.g:2981:2: rule__DEqualityExpression__Group__1__Impl
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
    // InternalDmx.g:2987:1: rule__DEqualityExpression__Group__1__Impl : ( ( rule__DEqualityExpression__Group_1__0 )* ) ;
    public final void rule__DEqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:2991:1: ( ( ( rule__DEqualityExpression__Group_1__0 )* ) )
            // InternalDmx.g:2992:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            {
            // InternalDmx.g:2992:1: ( ( rule__DEqualityExpression__Group_1__0 )* )
            // InternalDmx.g:2993:2: ( rule__DEqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:2994:2: ( rule__DEqualityExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA34_2 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA34_3 = input.LA(2);

                    if ( (synpred60_InternalDmx()) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 47:
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
            	    // InternalDmx.g:2994:3: rule__DEqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DEqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalDmx.g:3003:1: rule__DEqualityExpression__Group_1__0 : rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 ;
    public final void rule__DEqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3007:1: ( rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1 )
            // InternalDmx.g:3008:2: rule__DEqualityExpression__Group_1__0__Impl rule__DEqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:3015:1: rule__DEqualityExpression__Group_1__0__Impl : ( ( rule__DEqualityExpression__Group_1_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3019:1: ( ( ( rule__DEqualityExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3020:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3020:1: ( ( rule__DEqualityExpression__Group_1_0__0 ) )
            // InternalDmx.g:3021:2: ( rule__DEqualityExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3022:2: ( rule__DEqualityExpression__Group_1_0__0 )
            // InternalDmx.g:3022:3: rule__DEqualityExpression__Group_1_0__0
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
    // InternalDmx.g:3030:1: rule__DEqualityExpression__Group_1__1 : rule__DEqualityExpression__Group_1__1__Impl ;
    public final void rule__DEqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3034:1: ( rule__DEqualityExpression__Group_1__1__Impl )
            // InternalDmx.g:3035:2: rule__DEqualityExpression__Group_1__1__Impl
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
    // InternalDmx.g:3041:1: rule__DEqualityExpression__Group_1__1__Impl : ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3045:1: ( ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3046:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3046:1: ( ( rule__DEqualityExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3047:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3048:2: ( rule__DEqualityExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3048:3: rule__DEqualityExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3057:1: rule__DEqualityExpression__Group_1_0__0 : rule__DEqualityExpression__Group_1_0__0__Impl ;
    public final void rule__DEqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3061:1: ( rule__DEqualityExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3062:2: rule__DEqualityExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3068:1: rule__DEqualityExpression__Group_1_0__0__Impl : ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3072:1: ( ( ( rule__DEqualityExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3073:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3073:1: ( ( rule__DEqualityExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3074:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3075:2: ( rule__DEqualityExpression__Group_1_0_0__0 )
            // InternalDmx.g:3075:3: rule__DEqualityExpression__Group_1_0_0__0
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
    // InternalDmx.g:3084:1: rule__DEqualityExpression__Group_1_0_0__0 : rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 ;
    public final void rule__DEqualityExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3088:1: ( rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1 )
            // InternalDmx.g:3089:2: rule__DEqualityExpression__Group_1_0_0__0__Impl rule__DEqualityExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDmx.g:3096:1: rule__DEqualityExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3100:1: ( ( () ) )
            // InternalDmx.g:3101:1: ( () )
            {
            // InternalDmx.g:3101:1: ( () )
            // InternalDmx.g:3102:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3103:2: ()
            // InternalDmx.g:3103:3: 
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
    // InternalDmx.g:3111:1: rule__DEqualityExpression__Group_1_0_0__1 : rule__DEqualityExpression__Group_1_0_0__1__Impl ;
    public final void rule__DEqualityExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3115:1: ( rule__DEqualityExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3116:2: rule__DEqualityExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3122:1: rule__DEqualityExpression__Group_1_0_0__1__Impl : ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DEqualityExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3126:1: ( ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3127:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3127:1: ( ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3128:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3129:2: ( rule__DEqualityExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3129:3: rule__DEqualityExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3138:1: rule__DRelationalExpression__Group__0 : rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 ;
    public final void rule__DRelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3142:1: ( rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1 )
            // InternalDmx.g:3143:2: rule__DRelationalExpression__Group__0__Impl rule__DRelationalExpression__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDmx.g:3150:1: rule__DRelationalExpression__Group__0__Impl : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3154:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:3155:1: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:3155:1: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:3156:2: ruleDOtherOperatorExpression
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
    // InternalDmx.g:3165:1: rule__DRelationalExpression__Group__1 : rule__DRelationalExpression__Group__1__Impl ;
    public final void rule__DRelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3169:1: ( rule__DRelationalExpression__Group__1__Impl )
            // InternalDmx.g:3170:2: rule__DRelationalExpression__Group__1__Impl
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
    // InternalDmx.g:3176:1: rule__DRelationalExpression__Group__1__Impl : ( ( rule__DRelationalExpression__Alternatives_1 )* ) ;
    public final void rule__DRelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3180:1: ( ( ( rule__DRelationalExpression__Alternatives_1 )* ) )
            // InternalDmx.g:3181:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            {
            // InternalDmx.g:3181:1: ( ( rule__DRelationalExpression__Alternatives_1 )* )
            // InternalDmx.g:3182:2: ( rule__DRelationalExpression__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:3183:2: ( rule__DRelationalExpression__Alternatives_1 )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // InternalDmx.g:3183:3: rule__DRelationalExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DRelationalExpression__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalDmx.g:3192:1: rule__DRelationalExpression__Group_1_0__0 : rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3196:1: ( rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1 )
            // InternalDmx.g:3197:2: rule__DRelationalExpression__Group_1_0__0__Impl rule__DRelationalExpression__Group_1_0__1
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
    // InternalDmx.g:3204:1: rule__DRelationalExpression__Group_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3208:1: ( ( ( rule__DRelationalExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3209:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3209:1: ( ( rule__DRelationalExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3210:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3211:2: ( rule__DRelationalExpression__Group_1_0_0__0 )
            // InternalDmx.g:3211:3: rule__DRelationalExpression__Group_1_0_0__0
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
    // InternalDmx.g:3219:1: rule__DRelationalExpression__Group_1_0__1 : rule__DRelationalExpression__Group_1_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3223:1: ( rule__DRelationalExpression__Group_1_0__1__Impl )
            // InternalDmx.g:3224:2: rule__DRelationalExpression__Group_1_0__1__Impl
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
    // InternalDmx.g:3230:1: rule__DRelationalExpression__Group_1_0__1__Impl : ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3234:1: ( ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) ) )
            // InternalDmx.g:3235:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            {
            // InternalDmx.g:3235:1: ( ( rule__DRelationalExpression__TypeAssignment_1_0_1 ) )
            // InternalDmx.g:3236:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1()); 
            }
            // InternalDmx.g:3237:2: ( rule__DRelationalExpression__TypeAssignment_1_0_1 )
            // InternalDmx.g:3237:3: rule__DRelationalExpression__TypeAssignment_1_0_1
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
    // InternalDmx.g:3246:1: rule__DRelationalExpression__Group_1_0_0__0 : rule__DRelationalExpression__Group_1_0_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3250:1: ( rule__DRelationalExpression__Group_1_0_0__0__Impl )
            // InternalDmx.g:3251:2: rule__DRelationalExpression__Group_1_0_0__0__Impl
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
    // InternalDmx.g:3257:1: rule__DRelationalExpression__Group_1_0_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3261:1: ( ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:3262:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:3262:1: ( ( rule__DRelationalExpression__Group_1_0_0_0__0 ) )
            // InternalDmx.g:3263:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:3264:2: ( rule__DRelationalExpression__Group_1_0_0_0__0 )
            // InternalDmx.g:3264:3: rule__DRelationalExpression__Group_1_0_0_0__0
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
    // InternalDmx.g:3273:1: rule__DRelationalExpression__Group_1_0_0_0__0 : rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3277:1: ( rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1 )
            // InternalDmx.g:3278:2: rule__DRelationalExpression__Group_1_0_0_0__0__Impl rule__DRelationalExpression__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDmx.g:3285:1: rule__DRelationalExpression__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3289:1: ( ( () ) )
            // InternalDmx.g:3290:1: ( () )
            {
            // InternalDmx.g:3290:1: ( () )
            // InternalDmx.g:3291:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:3292:2: ()
            // InternalDmx.g:3292:3: 
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
    // InternalDmx.g:3300:1: rule__DRelationalExpression__Group_1_0_0_0__1 : rule__DRelationalExpression__Group_1_0_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3304:1: ( rule__DRelationalExpression__Group_1_0_0_0__1__Impl )
            // InternalDmx.g:3305:2: rule__DRelationalExpression__Group_1_0_0_0__1__Impl
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
    // InternalDmx.g:3311:1: rule__DRelationalExpression__Group_1_0_0_0__1__Impl : ( ruleOpInstanceOf ) ;
    public final void rule__DRelationalExpression__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3315:1: ( ( ruleOpInstanceOf ) )
            // InternalDmx.g:3316:1: ( ruleOpInstanceOf )
            {
            // InternalDmx.g:3316:1: ( ruleOpInstanceOf )
            // InternalDmx.g:3317:2: ruleOpInstanceOf
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
    // InternalDmx.g:3327:1: rule__DRelationalExpression__Group_1_1__0 : rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 ;
    public final void rule__DRelationalExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3331:1: ( rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1 )
            // InternalDmx.g:3332:2: rule__DRelationalExpression__Group_1_1__0__Impl rule__DRelationalExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:3339:1: rule__DRelationalExpression__Group_1_1__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3343:1: ( ( ( rule__DRelationalExpression__Group_1_1_0__0 ) ) )
            // InternalDmx.g:3344:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:3344:1: ( ( rule__DRelationalExpression__Group_1_1_0__0 ) )
            // InternalDmx.g:3345:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:3346:2: ( rule__DRelationalExpression__Group_1_1_0__0 )
            // InternalDmx.g:3346:3: rule__DRelationalExpression__Group_1_1_0__0
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
    // InternalDmx.g:3354:1: rule__DRelationalExpression__Group_1_1__1 : rule__DRelationalExpression__Group_1_1__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3358:1: ( rule__DRelationalExpression__Group_1_1__1__Impl )
            // InternalDmx.g:3359:2: rule__DRelationalExpression__Group_1_1__1__Impl
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
    // InternalDmx.g:3365:1: rule__DRelationalExpression__Group_1_1__1__Impl : ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3369:1: ( ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) ) )
            // InternalDmx.g:3370:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            {
            // InternalDmx.g:3370:1: ( ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 ) )
            // InternalDmx.g:3371:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1()); 
            }
            // InternalDmx.g:3372:2: ( rule__DRelationalExpression__RightOperandAssignment_1_1_1 )
            // InternalDmx.g:3372:3: rule__DRelationalExpression__RightOperandAssignment_1_1_1
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
    // InternalDmx.g:3381:1: rule__DRelationalExpression__Group_1_1_0__0 : rule__DRelationalExpression__Group_1_1_0__0__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3385:1: ( rule__DRelationalExpression__Group_1_1_0__0__Impl )
            // InternalDmx.g:3386:2: rule__DRelationalExpression__Group_1_1_0__0__Impl
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
    // InternalDmx.g:3392:1: rule__DRelationalExpression__Group_1_1_0__0__Impl : ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3396:1: ( ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:3397:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:3397:1: ( ( rule__DRelationalExpression__Group_1_1_0_0__0 ) )
            // InternalDmx.g:3398:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:3399:2: ( rule__DRelationalExpression__Group_1_1_0_0__0 )
            // InternalDmx.g:3399:3: rule__DRelationalExpression__Group_1_1_0_0__0
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
    // InternalDmx.g:3408:1: rule__DRelationalExpression__Group_1_1_0_0__0 : rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3412:1: ( rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1 )
            // InternalDmx.g:3413:2: rule__DRelationalExpression__Group_1_1_0_0__0__Impl rule__DRelationalExpression__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDmx.g:3420:1: rule__DRelationalExpression__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3424:1: ( ( () ) )
            // InternalDmx.g:3425:1: ( () )
            {
            // InternalDmx.g:3425:1: ( () )
            // InternalDmx.g:3426:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:3427:2: ()
            // InternalDmx.g:3427:3: 
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
    // InternalDmx.g:3435:1: rule__DRelationalExpression__Group_1_1_0_0__1 : rule__DRelationalExpression__Group_1_1_0_0__1__Impl ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3439:1: ( rule__DRelationalExpression__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:3440:2: rule__DRelationalExpression__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:3446:1: rule__DRelationalExpression__Group_1_1_0_0__1__Impl : ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) ;
    public final void rule__DRelationalExpression__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3450:1: ( ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) ) )
            // InternalDmx.g:3451:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            {
            // InternalDmx.g:3451:1: ( ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 ) )
            // InternalDmx.g:3452:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1()); 
            }
            // InternalDmx.g:3453:2: ( rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 )
            // InternalDmx.g:3453:3: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1
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
    // InternalDmx.g:3462:1: rule__DOtherOperatorExpression__Group__0 : rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 ;
    public final void rule__DOtherOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3466:1: ( rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1 )
            // InternalDmx.g:3467:2: rule__DOtherOperatorExpression__Group__0__Impl rule__DOtherOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDmx.g:3474:1: rule__DOtherOperatorExpression__Group__0__Impl : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3478:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:3479:1: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:3479:1: ( ruleDAdditiveExpression )
            // InternalDmx.g:3480:2: ruleDAdditiveExpression
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
    // InternalDmx.g:3489:1: rule__DOtherOperatorExpression__Group__1 : rule__DOtherOperatorExpression__Group__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3493:1: ( rule__DOtherOperatorExpression__Group__1__Impl )
            // InternalDmx.g:3494:2: rule__DOtherOperatorExpression__Group__1__Impl
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
    // InternalDmx.g:3500:1: rule__DOtherOperatorExpression__Group__1__Impl : ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) ;
    public final void rule__DOtherOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3504:1: ( ( ( rule__DOtherOperatorExpression__Group_1__0 )* ) )
            // InternalDmx.g:3505:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3505:1: ( ( rule__DOtherOperatorExpression__Group_1__0 )* )
            // InternalDmx.g:3506:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3507:2: ( rule__DOtherOperatorExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case 54:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 55:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;
                case 56:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred62_InternalDmx()) ) {
                        alt36=1;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalDmx.g:3507:3: rule__DOtherOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__DOtherOperatorExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalDmx.g:3516:1: rule__DOtherOperatorExpression__Group_1__0 : rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 ;
    public final void rule__DOtherOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3520:1: ( rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1 )
            // InternalDmx.g:3521:2: rule__DOtherOperatorExpression__Group_1__0__Impl rule__DOtherOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:3528:1: rule__DOtherOperatorExpression__Group_1__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3532:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3533:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3533:1: ( ( rule__DOtherOperatorExpression__Group_1_0__0 ) )
            // InternalDmx.g:3534:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3535:2: ( rule__DOtherOperatorExpression__Group_1_0__0 )
            // InternalDmx.g:3535:3: rule__DOtherOperatorExpression__Group_1_0__0
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
    // InternalDmx.g:3543:1: rule__DOtherOperatorExpression__Group_1__1 : rule__DOtherOperatorExpression__Group_1__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3547:1: ( rule__DOtherOperatorExpression__Group_1__1__Impl )
            // InternalDmx.g:3548:2: rule__DOtherOperatorExpression__Group_1__1__Impl
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
    // InternalDmx.g:3554:1: rule__DOtherOperatorExpression__Group_1__1__Impl : ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3558:1: ( ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3559:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3559:1: ( ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3560:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3561:2: ( rule__DOtherOperatorExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3561:3: rule__DOtherOperatorExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3570:1: rule__DOtherOperatorExpression__Group_1_0__0 : rule__DOtherOperatorExpression__Group_1_0__0__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3574:1: ( rule__DOtherOperatorExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3575:2: rule__DOtherOperatorExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3581:1: rule__DOtherOperatorExpression__Group_1_0__0__Impl : ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3585:1: ( ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3586:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3586:1: ( ( rule__DOtherOperatorExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3587:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3588:2: ( rule__DOtherOperatorExpression__Group_1_0_0__0 )
            // InternalDmx.g:3588:3: rule__DOtherOperatorExpression__Group_1_0_0__0
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
    // InternalDmx.g:3597:1: rule__DOtherOperatorExpression__Group_1_0_0__0 : rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3601:1: ( rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1 )
            // InternalDmx.g:3602:2: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl rule__DOtherOperatorExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDmx.g:3609:1: rule__DOtherOperatorExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3613:1: ( ( () ) )
            // InternalDmx.g:3614:1: ( () )
            {
            // InternalDmx.g:3614:1: ( () )
            // InternalDmx.g:3615:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3616:2: ()
            // InternalDmx.g:3616:3: 
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
    // InternalDmx.g:3624:1: rule__DOtherOperatorExpression__Group_1_0_0__1 : rule__DOtherOperatorExpression__Group_1_0_0__1__Impl ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3628:1: ( rule__DOtherOperatorExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3629:2: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3635:1: rule__DOtherOperatorExpression__Group_1_0_0__1__Impl : ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DOtherOperatorExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3639:1: ( ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3640:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3640:1: ( ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3641:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3642:2: ( rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3642:3: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3651:1: rule__DAdditiveExpression__Group__0 : rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 ;
    public final void rule__DAdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3655:1: ( rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1 )
            // InternalDmx.g:3656:2: rule__DAdditiveExpression__Group__0__Impl rule__DAdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDmx.g:3663:1: rule__DAdditiveExpression__Group__0__Impl : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3667:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:3668:1: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:3668:1: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:3669:2: ruleDMultiplicativeExpression
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
    // InternalDmx.g:3678:1: rule__DAdditiveExpression__Group__1 : rule__DAdditiveExpression__Group__1__Impl ;
    public final void rule__DAdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3682:1: ( rule__DAdditiveExpression__Group__1__Impl )
            // InternalDmx.g:3683:2: rule__DAdditiveExpression__Group__1__Impl
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
    // InternalDmx.g:3689:1: rule__DAdditiveExpression__Group__1__Impl : ( ( rule__DAdditiveExpression__Group_1__0 )* ) ;
    public final void rule__DAdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3693:1: ( ( ( rule__DAdditiveExpression__Group_1__0 )* ) )
            // InternalDmx.g:3694:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3694:1: ( ( rule__DAdditiveExpression__Group_1__0 )* )
            // InternalDmx.g:3695:2: ( rule__DAdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3696:2: ( rule__DAdditiveExpression__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==37) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                }
                else if ( (LA37_0==38) ) {
                    int LA37_3 = input.LA(2);

                    if ( (synpred63_InternalDmx()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // InternalDmx.g:3696:3: rule__DAdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__DAdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalDmx.g:3705:1: rule__DAdditiveExpression__Group_1__0 : rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 ;
    public final void rule__DAdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3709:1: ( rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1 )
            // InternalDmx.g:3710:2: rule__DAdditiveExpression__Group_1__0__Impl rule__DAdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:3717:1: rule__DAdditiveExpression__Group_1__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3721:1: ( ( ( rule__DAdditiveExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3722:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3722:1: ( ( rule__DAdditiveExpression__Group_1_0__0 ) )
            // InternalDmx.g:3723:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3724:2: ( rule__DAdditiveExpression__Group_1_0__0 )
            // InternalDmx.g:3724:3: rule__DAdditiveExpression__Group_1_0__0
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
    // InternalDmx.g:3732:1: rule__DAdditiveExpression__Group_1__1 : rule__DAdditiveExpression__Group_1__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3736:1: ( rule__DAdditiveExpression__Group_1__1__Impl )
            // InternalDmx.g:3737:2: rule__DAdditiveExpression__Group_1__1__Impl
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
    // InternalDmx.g:3743:1: rule__DAdditiveExpression__Group_1__1__Impl : ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3747:1: ( ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3748:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3748:1: ( ( rule__DAdditiveExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3749:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3750:2: ( rule__DAdditiveExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3750:3: rule__DAdditiveExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3759:1: rule__DAdditiveExpression__Group_1_0__0 : rule__DAdditiveExpression__Group_1_0__0__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3763:1: ( rule__DAdditiveExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3764:2: rule__DAdditiveExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3770:1: rule__DAdditiveExpression__Group_1_0__0__Impl : ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3774:1: ( ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3775:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3775:1: ( ( rule__DAdditiveExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3776:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3777:2: ( rule__DAdditiveExpression__Group_1_0_0__0 )
            // InternalDmx.g:3777:3: rule__DAdditiveExpression__Group_1_0_0__0
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
    // InternalDmx.g:3786:1: rule__DAdditiveExpression__Group_1_0_0__0 : rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3790:1: ( rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1 )
            // InternalDmx.g:3791:2: rule__DAdditiveExpression__Group_1_0_0__0__Impl rule__DAdditiveExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDmx.g:3798:1: rule__DAdditiveExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3802:1: ( ( () ) )
            // InternalDmx.g:3803:1: ( () )
            {
            // InternalDmx.g:3803:1: ( () )
            // InternalDmx.g:3804:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3805:2: ()
            // InternalDmx.g:3805:3: 
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
    // InternalDmx.g:3813:1: rule__DAdditiveExpression__Group_1_0_0__1 : rule__DAdditiveExpression__Group_1_0_0__1__Impl ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3817:1: ( rule__DAdditiveExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:3818:2: rule__DAdditiveExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:3824:1: rule__DAdditiveExpression__Group_1_0_0__1__Impl : ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DAdditiveExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3828:1: ( ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:3829:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:3829:1: ( ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:3830:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:3831:2: ( rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:3831:3: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:3840:1: rule__DMultiplicativeExpression__Group__0 : rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 ;
    public final void rule__DMultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3844:1: ( rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1 )
            // InternalDmx.g:3845:2: rule__DMultiplicativeExpression__Group__0__Impl rule__DMultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDmx.g:3852:1: rule__DMultiplicativeExpression__Group__0__Impl : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3856:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:3857:1: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:3857:1: ( ruleDUnaryOperation )
            // InternalDmx.g:3858:2: ruleDUnaryOperation
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
    // InternalDmx.g:3867:1: rule__DMultiplicativeExpression__Group__1 : rule__DMultiplicativeExpression__Group__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3871:1: ( rule__DMultiplicativeExpression__Group__1__Impl )
            // InternalDmx.g:3872:2: rule__DMultiplicativeExpression__Group__1__Impl
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
    // InternalDmx.g:3878:1: rule__DMultiplicativeExpression__Group__1__Impl : ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__DMultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3882:1: ( ( ( rule__DMultiplicativeExpression__Group_1__0 )* ) )
            // InternalDmx.g:3883:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            {
            // InternalDmx.g:3883:1: ( ( rule__DMultiplicativeExpression__Group_1__0 )* )
            // InternalDmx.g:3884:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:3885:2: ( rule__DMultiplicativeExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred64_InternalDmx()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 57:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred64_InternalDmx()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 58:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred64_InternalDmx()) ) {
                        alt38=1;
                    }


                    }
                    break;
                case 59:
                    {
                    int LA38_5 = input.LA(2);

                    if ( (synpred64_InternalDmx()) ) {
                        alt38=1;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // InternalDmx.g:3885:3: rule__DMultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__DMultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalDmx.g:3894:1: rule__DMultiplicativeExpression__Group_1__0 : rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 ;
    public final void rule__DMultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3898:1: ( rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1 )
            // InternalDmx.g:3899:2: rule__DMultiplicativeExpression__Group_1__0__Impl rule__DMultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:3906:1: rule__DMultiplicativeExpression__Group_1__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3910:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:3911:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:3911:1: ( ( rule__DMultiplicativeExpression__Group_1_0__0 ) )
            // InternalDmx.g:3912:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:3913:2: ( rule__DMultiplicativeExpression__Group_1_0__0 )
            // InternalDmx.g:3913:3: rule__DMultiplicativeExpression__Group_1_0__0
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
    // InternalDmx.g:3921:1: rule__DMultiplicativeExpression__Group_1__1 : rule__DMultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3925:1: ( rule__DMultiplicativeExpression__Group_1__1__Impl )
            // InternalDmx.g:3926:2: rule__DMultiplicativeExpression__Group_1__1__Impl
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
    // InternalDmx.g:3932:1: rule__DMultiplicativeExpression__Group_1__1__Impl : ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3936:1: ( ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) ) )
            // InternalDmx.g:3937:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            {
            // InternalDmx.g:3937:1: ( ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 ) )
            // InternalDmx.g:3938:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1()); 
            }
            // InternalDmx.g:3939:2: ( rule__DMultiplicativeExpression__RightOperandAssignment_1_1 )
            // InternalDmx.g:3939:3: rule__DMultiplicativeExpression__RightOperandAssignment_1_1
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
    // InternalDmx.g:3948:1: rule__DMultiplicativeExpression__Group_1_0__0 : rule__DMultiplicativeExpression__Group_1_0__0__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3952:1: ( rule__DMultiplicativeExpression__Group_1_0__0__Impl )
            // InternalDmx.g:3953:2: rule__DMultiplicativeExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:3959:1: rule__DMultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3963:1: ( ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:3964:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:3964:1: ( ( rule__DMultiplicativeExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:3965:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:3966:2: ( rule__DMultiplicativeExpression__Group_1_0_0__0 )
            // InternalDmx.g:3966:3: rule__DMultiplicativeExpression__Group_1_0_0__0
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
    // InternalDmx.g:3975:1: rule__DMultiplicativeExpression__Group_1_0_0__0 : rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3979:1: ( rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1 )
            // InternalDmx.g:3980:2: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl rule__DMultiplicativeExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDmx.g:3987:1: rule__DMultiplicativeExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:3991:1: ( ( () ) )
            // InternalDmx.g:3992:1: ( () )
            {
            // InternalDmx.g:3992:1: ( () )
            // InternalDmx.g:3993:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0()); 
            }
            // InternalDmx.g:3994:2: ()
            // InternalDmx.g:3994:3: 
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
    // InternalDmx.g:4002:1: rule__DMultiplicativeExpression__Group_1_0_0__1 : rule__DMultiplicativeExpression__Group_1_0_0__1__Impl ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4006:1: ( rule__DMultiplicativeExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:4007:2: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:4013:1: rule__DMultiplicativeExpression__Group_1_0_0__1__Impl : ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__DMultiplicativeExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4017:1: ( ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) ) )
            // InternalDmx.g:4018:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // InternalDmx.g:4018:1: ( ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 ) )
            // InternalDmx.g:4019:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // InternalDmx.g:4020:2: ( rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 )
            // InternalDmx.g:4020:3: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1
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
    // InternalDmx.g:4029:1: rule__DUnaryOperation__Group_0__0 : rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 ;
    public final void rule__DUnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4033:1: ( rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1 )
            // InternalDmx.g:4034:2: rule__DUnaryOperation__Group_0__0__Impl rule__DUnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDmx.g:4041:1: rule__DUnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__DUnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4045:1: ( ( () ) )
            // InternalDmx.g:4046:1: ( () )
            {
            // InternalDmx.g:4046:1: ( () )
            // InternalDmx.g:4047:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0()); 
            }
            // InternalDmx.g:4048:2: ()
            // InternalDmx.g:4048:3: 
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
    // InternalDmx.g:4056:1: rule__DUnaryOperation__Group_0__1 : rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 ;
    public final void rule__DUnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4060:1: ( rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2 )
            // InternalDmx.g:4061:2: rule__DUnaryOperation__Group_0__1__Impl rule__DUnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:4068:1: rule__DUnaryOperation__Group_0__1__Impl : ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) ;
    public final void rule__DUnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4072:1: ( ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) ) )
            // InternalDmx.g:4073:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            {
            // InternalDmx.g:4073:1: ( ( rule__DUnaryOperation__OperatorAssignment_0_1 ) )
            // InternalDmx.g:4074:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1()); 
            }
            // InternalDmx.g:4075:2: ( rule__DUnaryOperation__OperatorAssignment_0_1 )
            // InternalDmx.g:4075:3: rule__DUnaryOperation__OperatorAssignment_0_1
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
    // InternalDmx.g:4083:1: rule__DUnaryOperation__Group_0__2 : rule__DUnaryOperation__Group_0__2__Impl ;
    public final void rule__DUnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4087:1: ( rule__DUnaryOperation__Group_0__2__Impl )
            // InternalDmx.g:4088:2: rule__DUnaryOperation__Group_0__2__Impl
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
    // InternalDmx.g:4094:1: rule__DUnaryOperation__Group_0__2__Impl : ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) ;
    public final void rule__DUnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4098:1: ( ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) ) )
            // InternalDmx.g:4099:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            {
            // InternalDmx.g:4099:1: ( ( rule__DUnaryOperation__OperandAssignment_0_2 ) )
            // InternalDmx.g:4100:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2()); 
            }
            // InternalDmx.g:4101:2: ( rule__DUnaryOperation__OperandAssignment_0_2 )
            // InternalDmx.g:4101:3: rule__DUnaryOperation__OperandAssignment_0_2
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
    // InternalDmx.g:4110:1: rule__DCastExpression__Group__0 : rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 ;
    public final void rule__DCastExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4114:1: ( rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1 )
            // InternalDmx.g:4115:2: rule__DCastExpression__Group__0__Impl rule__DCastExpression__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDmx.g:4122:1: rule__DCastExpression__Group__0__Impl : ( ruleDTypedMemberReference ) ;
    public final void rule__DCastExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4126:1: ( ( ruleDTypedMemberReference ) )
            // InternalDmx.g:4127:1: ( ruleDTypedMemberReference )
            {
            // InternalDmx.g:4127:1: ( ruleDTypedMemberReference )
            // InternalDmx.g:4128:2: ruleDTypedMemberReference
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
    // InternalDmx.g:4137:1: rule__DCastExpression__Group__1 : rule__DCastExpression__Group__1__Impl ;
    public final void rule__DCastExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4141:1: ( rule__DCastExpression__Group__1__Impl )
            // InternalDmx.g:4142:2: rule__DCastExpression__Group__1__Impl
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
    // InternalDmx.g:4148:1: rule__DCastExpression__Group__1__Impl : ( ( rule__DCastExpression__Group_1__0 )? ) ;
    public final void rule__DCastExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4152:1: ( ( ( rule__DCastExpression__Group_1__0 )? ) )
            // InternalDmx.g:4153:1: ( ( rule__DCastExpression__Group_1__0 )? )
            {
            // InternalDmx.g:4153:1: ( ( rule__DCastExpression__Group_1__0 )? )
            // InternalDmx.g:4154:2: ( rule__DCastExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1()); 
            }
            // InternalDmx.g:4155:2: ( rule__DCastExpression__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred65_InternalDmx()) ) {
                    alt39=1;
                }
            }
            else if ( (LA39_0==21) ) {
                int LA39_2 = input.LA(2);

                if ( (synpred65_InternalDmx()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalDmx.g:4155:3: rule__DCastExpression__Group_1__0
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
    // InternalDmx.g:4164:1: rule__DCastExpression__Group_1__0 : rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 ;
    public final void rule__DCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4168:1: ( rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1 )
            // InternalDmx.g:4169:2: rule__DCastExpression__Group_1__0__Impl rule__DCastExpression__Group_1__1
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
    // InternalDmx.g:4176:1: rule__DCastExpression__Group_1__0__Impl : ( ( rule__DCastExpression__Group_1_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4180:1: ( ( ( rule__DCastExpression__Group_1_0__0 ) ) )
            // InternalDmx.g:4181:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            {
            // InternalDmx.g:4181:1: ( ( rule__DCastExpression__Group_1_0__0 ) )
            // InternalDmx.g:4182:2: ( rule__DCastExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0()); 
            }
            // InternalDmx.g:4183:2: ( rule__DCastExpression__Group_1_0__0 )
            // InternalDmx.g:4183:3: rule__DCastExpression__Group_1_0__0
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
    // InternalDmx.g:4191:1: rule__DCastExpression__Group_1__1 : rule__DCastExpression__Group_1__1__Impl ;
    public final void rule__DCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4195:1: ( rule__DCastExpression__Group_1__1__Impl )
            // InternalDmx.g:4196:2: rule__DCastExpression__Group_1__1__Impl
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
    // InternalDmx.g:4202:1: rule__DCastExpression__Group_1__1__Impl : ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) ;
    public final void rule__DCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4206:1: ( ( ( rule__DCastExpression__TypeAssignment_1_1 ) ) )
            // InternalDmx.g:4207:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            {
            // InternalDmx.g:4207:1: ( ( rule__DCastExpression__TypeAssignment_1_1 ) )
            // InternalDmx.g:4208:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1()); 
            }
            // InternalDmx.g:4209:2: ( rule__DCastExpression__TypeAssignment_1_1 )
            // InternalDmx.g:4209:3: rule__DCastExpression__TypeAssignment_1_1
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
    // InternalDmx.g:4218:1: rule__DCastExpression__Group_1_0__0 : rule__DCastExpression__Group_1_0__0__Impl ;
    public final void rule__DCastExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4222:1: ( rule__DCastExpression__Group_1_0__0__Impl )
            // InternalDmx.g:4223:2: rule__DCastExpression__Group_1_0__0__Impl
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
    // InternalDmx.g:4229:1: rule__DCastExpression__Group_1_0__0__Impl : ( ( rule__DCastExpression__Group_1_0_0__0 ) ) ;
    public final void rule__DCastExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4233:1: ( ( ( rule__DCastExpression__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4234:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4234:1: ( ( rule__DCastExpression__Group_1_0_0__0 ) )
            // InternalDmx.g:4235:2: ( rule__DCastExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4236:2: ( rule__DCastExpression__Group_1_0_0__0 )
            // InternalDmx.g:4236:3: rule__DCastExpression__Group_1_0_0__0
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
    // InternalDmx.g:4245:1: rule__DCastExpression__Group_1_0_0__0 : rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 ;
    public final void rule__DCastExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4249:1: ( rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1 )
            // InternalDmx.g:4250:2: rule__DCastExpression__Group_1_0_0__0__Impl rule__DCastExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDmx.g:4257:1: rule__DCastExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__DCastExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4261:1: ( ( () ) )
            // InternalDmx.g:4262:1: ( () )
            {
            // InternalDmx.g:4262:1: ( () )
            // InternalDmx.g:4263:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0()); 
            }
            // InternalDmx.g:4264:2: ()
            // InternalDmx.g:4264:3: 
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
    // InternalDmx.g:4272:1: rule__DCastExpression__Group_1_0_0__1 : rule__DCastExpression__Group_1_0_0__1__Impl ;
    public final void rule__DCastExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4276:1: ( rule__DCastExpression__Group_1_0_0__1__Impl )
            // InternalDmx.g:4277:2: rule__DCastExpression__Group_1_0_0__1__Impl
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
    // InternalDmx.g:4283:1: rule__DCastExpression__Group_1_0_0__1__Impl : ( ruleOpCast ) ;
    public final void rule__DCastExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4287:1: ( ( ruleOpCast ) )
            // InternalDmx.g:4288:1: ( ruleOpCast )
            {
            // InternalDmx.g:4288:1: ( ruleOpCast )
            // InternalDmx.g:4289:2: ruleOpCast
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
    // InternalDmx.g:4299:1: rule__DTypedMemberReference__Group__0 : rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 ;
    public final void rule__DTypedMemberReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4303:1: ( rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1 )
            // InternalDmx.g:4304:2: rule__DTypedMemberReference__Group__0__Impl rule__DTypedMemberReference__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDmx.g:4311:1: rule__DTypedMemberReference__Group__0__Impl : ( ruleDPrimaryExpression ) ;
    public final void rule__DTypedMemberReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4315:1: ( ( ruleDPrimaryExpression ) )
            // InternalDmx.g:4316:1: ( ruleDPrimaryExpression )
            {
            // InternalDmx.g:4316:1: ( ruleDPrimaryExpression )
            // InternalDmx.g:4317:2: ruleDPrimaryExpression
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
    // InternalDmx.g:4326:1: rule__DTypedMemberReference__Group__1 : rule__DTypedMemberReference__Group__1__Impl ;
    public final void rule__DTypedMemberReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4330:1: ( rule__DTypedMemberReference__Group__1__Impl )
            // InternalDmx.g:4331:2: rule__DTypedMemberReference__Group__1__Impl
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
    // InternalDmx.g:4337:1: rule__DTypedMemberReference__Group__1__Impl : ( ( rule__DTypedMemberReference__Alternatives_1 )* ) ;
    public final void rule__DTypedMemberReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4341:1: ( ( ( rule__DTypedMemberReference__Alternatives_1 )* ) )
            // InternalDmx.g:4342:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            {
            // InternalDmx.g:4342:1: ( ( rule__DTypedMemberReference__Alternatives_1 )* )
            // InternalDmx.g:4343:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4344:2: ( rule__DTypedMemberReference__Alternatives_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==67) ) {
                    int LA40_2 = input.LA(2);

                    if ( (synpred66_InternalDmx()) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalDmx.g:4344:3: rule__DTypedMemberReference__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DTypedMemberReference__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalDmx.g:4353:1: rule__DTypedMemberReference__Group_1_0__0 : rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4357:1: ( rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1 )
            // InternalDmx.g:4358:2: rule__DTypedMemberReference__Group_1_0__0__Impl rule__DTypedMemberReference__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:4365:1: rule__DTypedMemberReference__Group_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4369:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) ) )
            // InternalDmx.g:4370:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            {
            // InternalDmx.g:4370:1: ( ( rule__DTypedMemberReference__Group_1_0_0__0 ) )
            // InternalDmx.g:4371:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0()); 
            }
            // InternalDmx.g:4372:2: ( rule__DTypedMemberReference__Group_1_0_0__0 )
            // InternalDmx.g:4372:3: rule__DTypedMemberReference__Group_1_0_0__0
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
    // InternalDmx.g:4380:1: rule__DTypedMemberReference__Group_1_0__1 : rule__DTypedMemberReference__Group_1_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4384:1: ( rule__DTypedMemberReference__Group_1_0__1__Impl )
            // InternalDmx.g:4385:2: rule__DTypedMemberReference__Group_1_0__1__Impl
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
    // InternalDmx.g:4391:1: rule__DTypedMemberReference__Group_1_0__1__Impl : ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4395:1: ( ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) ) )
            // InternalDmx.g:4396:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            {
            // InternalDmx.g:4396:1: ( ( rule__DTypedMemberReference__ValueAssignment_1_0_1 ) )
            // InternalDmx.g:4397:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getValueAssignment_1_0_1()); 
            }
            // InternalDmx.g:4398:2: ( rule__DTypedMemberReference__ValueAssignment_1_0_1 )
            // InternalDmx.g:4398:3: rule__DTypedMemberReference__ValueAssignment_1_0_1
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
    // InternalDmx.g:4407:1: rule__DTypedMemberReference__Group_1_0_0__0 : rule__DTypedMemberReference__Group_1_0_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4411:1: ( rule__DTypedMemberReference__Group_1_0_0__0__Impl )
            // InternalDmx.g:4412:2: rule__DTypedMemberReference__Group_1_0_0__0__Impl
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
    // InternalDmx.g:4418:1: rule__DTypedMemberReference__Group_1_0_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4422:1: ( ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) ) )
            // InternalDmx.g:4423:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            {
            // InternalDmx.g:4423:1: ( ( rule__DTypedMemberReference__Group_1_0_0_0__0 ) )
            // InternalDmx.g:4424:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_0_0_0()); 
            }
            // InternalDmx.g:4425:2: ( rule__DTypedMemberReference__Group_1_0_0_0__0 )
            // InternalDmx.g:4425:3: rule__DTypedMemberReference__Group_1_0_0_0__0
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
    // InternalDmx.g:4434:1: rule__DTypedMemberReference__Group_1_0_0_0__0 : rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4438:1: ( rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1 )
            // InternalDmx.g:4439:2: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl rule__DTypedMemberReference__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDmx.g:4446:1: rule__DTypedMemberReference__Group_1_0_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4450:1: ( ( () ) )
            // InternalDmx.g:4451:1: ( () )
            {
            // InternalDmx.g:4451:1: ( () )
            // InternalDmx.g:4452:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0()); 
            }
            // InternalDmx.g:4453:2: ()
            // InternalDmx.g:4453:3: 
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
    // InternalDmx.g:4461:1: rule__DTypedMemberReference__Group_1_0_0_0__1 : rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4465:1: ( rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2 )
            // InternalDmx.g:4466:2: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl rule__DTypedMemberReference__Group_1_0_0_0__2
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
    // InternalDmx.g:4473:1: rule__DTypedMemberReference__Group_1_0_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4477:1: ( ( '.' ) )
            // InternalDmx.g:4478:1: ( '.' )
            {
            // InternalDmx.g:4478:1: ( '.' )
            // InternalDmx.g:4479:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:4488:1: rule__DTypedMemberReference__Group_1_0_0_0__2 : rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4492:1: ( rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3 )
            // InternalDmx.g:4493:2: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl rule__DTypedMemberReference__Group_1_0_0_0__3
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
    // InternalDmx.g:4500:1: rule__DTypedMemberReference__Group_1_0_0_0__2__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4504:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) ) )
            // InternalDmx.g:4505:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            {
            // InternalDmx.g:4505:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 ) )
            // InternalDmx.g:4506:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_0_0_0_2()); 
            }
            // InternalDmx.g:4507:2: ( rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 )
            // InternalDmx.g:4507:3: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2
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
    // InternalDmx.g:4515:1: rule__DTypedMemberReference__Group_1_0_0_0__3 : rule__DTypedMemberReference__Group_1_0_0_0__3__Impl ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4519:1: ( rule__DTypedMemberReference__Group_1_0_0_0__3__Impl )
            // InternalDmx.g:4520:2: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl
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
    // InternalDmx.g:4526:1: rule__DTypedMemberReference__Group_1_0_0_0__3__Impl : ( ruleOpSingleAssign ) ;
    public final void rule__DTypedMemberReference__Group_1_0_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4530:1: ( ( ruleOpSingleAssign ) )
            // InternalDmx.g:4531:1: ( ruleOpSingleAssign )
            {
            // InternalDmx.g:4531:1: ( ruleOpSingleAssign )
            // InternalDmx.g:4532:2: ruleOpSingleAssign
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
    // InternalDmx.g:4542:1: rule__DTypedMemberReference__Group_1_1__0 : rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4546:1: ( rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1 )
            // InternalDmx.g:4547:2: rule__DTypedMemberReference__Group_1_1__0__Impl rule__DTypedMemberReference__Group_1_1__1
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
    // InternalDmx.g:4554:1: rule__DTypedMemberReference__Group_1_1__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4558:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) ) )
            // InternalDmx.g:4559:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            {
            // InternalDmx.g:4559:1: ( ( rule__DTypedMemberReference__Group_1_1_0__0 ) )
            // InternalDmx.g:4560:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0()); 
            }
            // InternalDmx.g:4561:2: ( rule__DTypedMemberReference__Group_1_1_0__0 )
            // InternalDmx.g:4561:3: rule__DTypedMemberReference__Group_1_1_0__0
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
    // InternalDmx.g:4569:1: rule__DTypedMemberReference__Group_1_1__1 : rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 ;
    public final void rule__DTypedMemberReference__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4573:1: ( rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2 )
            // InternalDmx.g:4574:2: rule__DTypedMemberReference__Group_1_1__1__Impl rule__DTypedMemberReference__Group_1_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalDmx.g:4581:1: rule__DTypedMemberReference__Group_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4585:1: ( ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) ) )
            // InternalDmx.g:4586:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            {
            // InternalDmx.g:4586:1: ( ( rule__DTypedMemberReference__MemberAssignment_1_1_1 ) )
            // InternalDmx.g:4587:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberAssignment_1_1_1()); 
            }
            // InternalDmx.g:4588:2: ( rule__DTypedMemberReference__MemberAssignment_1_1_1 )
            // InternalDmx.g:4588:3: rule__DTypedMemberReference__MemberAssignment_1_1_1
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
    // InternalDmx.g:4596:1: rule__DTypedMemberReference__Group_1_1__2 : rule__DTypedMemberReference__Group_1_1__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4600:1: ( rule__DTypedMemberReference__Group_1_1__2__Impl )
            // InternalDmx.g:4601:2: rule__DTypedMemberReference__Group_1_1__2__Impl
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
    // InternalDmx.g:4607:1: rule__DTypedMemberReference__Group_1_1__2__Impl : ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4611:1: ( ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? ) )
            // InternalDmx.g:4612:1: ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? )
            {
            // InternalDmx.g:4612:1: ( ( rule__DTypedMemberReference__Alternatives_1_1_2 )? )
            // InternalDmx.g:4613:2: ( rule__DTypedMemberReference__Alternatives_1_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getAlternatives_1_1_2()); 
            }
            // InternalDmx.g:4614:2: ( rule__DTypedMemberReference__Alternatives_1_1_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==70||LA41_0==77) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDmx.g:4614:3: rule__DTypedMemberReference__Alternatives_1_1_2
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
    // InternalDmx.g:4623:1: rule__DTypedMemberReference__Group_1_1_0__0 : rule__DTypedMemberReference__Group_1_1_0__0__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4627:1: ( rule__DTypedMemberReference__Group_1_1_0__0__Impl )
            // InternalDmx.g:4628:2: rule__DTypedMemberReference__Group_1_1_0__0__Impl
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
    // InternalDmx.g:4634:1: rule__DTypedMemberReference__Group_1_1_0__0__Impl : ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4638:1: ( ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) ) )
            // InternalDmx.g:4639:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            {
            // InternalDmx.g:4639:1: ( ( rule__DTypedMemberReference__Group_1_1_0_0__0 ) )
            // InternalDmx.g:4640:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_0_0()); 
            }
            // InternalDmx.g:4641:2: ( rule__DTypedMemberReference__Group_1_1_0_0__0 )
            // InternalDmx.g:4641:3: rule__DTypedMemberReference__Group_1_1_0_0__0
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
    // InternalDmx.g:4650:1: rule__DTypedMemberReference__Group_1_1_0_0__0 : rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4654:1: ( rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1 )
            // InternalDmx.g:4655:2: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl rule__DTypedMemberReference__Group_1_1_0_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDmx.g:4662:1: rule__DTypedMemberReference__Group_1_1_0_0__0__Impl : ( () ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4666:1: ( ( () ) )
            // InternalDmx.g:4667:1: ( () )
            {
            // InternalDmx.g:4667:1: ( () )
            // InternalDmx.g:4668:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerReferenceAction_1_1_0_0_0()); 
            }
            // InternalDmx.g:4669:2: ()
            // InternalDmx.g:4669:3: 
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
    // InternalDmx.g:4677:1: rule__DTypedMemberReference__Group_1_1_0_0__1 : rule__DTypedMemberReference__Group_1_1_0_0__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4681:1: ( rule__DTypedMemberReference__Group_1_1_0_0__1__Impl )
            // InternalDmx.g:4682:2: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl
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
    // InternalDmx.g:4688:1: rule__DTypedMemberReference__Group_1_1_0_0__1__Impl : ( '.' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4692:1: ( ( '.' ) )
            // InternalDmx.g:4693:1: ( '.' )
            {
            // InternalDmx.g:4693:1: ( '.' )
            // InternalDmx.g:4694:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:4704:1: rule__DTypedMemberReference__Group_1_1_2_0__0 : rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4708:1: ( rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1 )
            // InternalDmx.g:4709:2: rule__DTypedMemberReference__Group_1_1_2_0__0__Impl rule__DTypedMemberReference__Group_1_1_2_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:4716:1: rule__DTypedMemberReference__Group_1_1_2_0__0__Impl : ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4720:1: ( ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) ) )
            // InternalDmx.g:4721:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) )
            {
            // InternalDmx.g:4721:1: ( ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 ) )
            // InternalDmx.g:4722:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0_0()); 
            }
            // InternalDmx.g:4723:2: ( rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 )
            // InternalDmx.g:4723:3: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0
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
    // InternalDmx.g:4731:1: rule__DTypedMemberReference__Group_1_1_2_0__1 : rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4735:1: ( rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2 )
            // InternalDmx.g:4736:2: rule__DTypedMemberReference__Group_1_1_2_0__1__Impl rule__DTypedMemberReference__Group_1_1_2_0__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:4743:1: rule__DTypedMemberReference__Group_1_1_2_0__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4747:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? ) )
            // InternalDmx.g:4748:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? )
            {
            // InternalDmx.g:4748:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )? )
            // InternalDmx.g:4749:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1()); 
            }
            // InternalDmx.g:4750:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_NATURAL && LA42_0<=RULE_PLAIN_TEXT_START)||LA42_0==RULE_STRING||(LA42_0>=22 && LA42_0<=29)||(LA42_0>=31 && LA42_0<=34)||(LA42_0>=37 && LA42_0<=38)||(LA42_0>=60 && LA42_0<=62)||(LA42_0>=70 && LA42_0<=71)||LA42_0==76||(LA42_0>=78 && LA42_0<=79)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDmx.g:4750:3: rule__DTypedMemberReference__Group_1_1_2_0_1__0
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
    // InternalDmx.g:4758:1: rule__DTypedMemberReference__Group_1_1_2_0__2 : rule__DTypedMemberReference__Group_1_1_2_0__2__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4762:1: ( rule__DTypedMemberReference__Group_1_1_2_0__2__Impl )
            // InternalDmx.g:4763:2: rule__DTypedMemberReference__Group_1_1_2_0__2__Impl
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
    // InternalDmx.g:4769:1: rule__DTypedMemberReference__Group_1_1_2_0__2__Impl : ( ')' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4773:1: ( ( ')' ) )
            // InternalDmx.g:4774:1: ( ')' )
            {
            // InternalDmx.g:4774:1: ( ')' )
            // InternalDmx.g:4775:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:4785:1: rule__DTypedMemberReference__Group_1_1_2_0_1__0 : rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4789:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1 )
            // InternalDmx.g:4790:2: rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDmx.g:4797:1: rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4801:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) ) )
            // InternalDmx.g:4802:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) )
            {
            // InternalDmx.g:4802:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 ) )
            // InternalDmx.g:4803:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_0()); 
            }
            // InternalDmx.g:4804:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 )
            // InternalDmx.g:4804:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0
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
    // InternalDmx.g:4812:1: rule__DTypedMemberReference__Group_1_1_2_0_1__1 : rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4816:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl )
            // InternalDmx.g:4817:2: rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl
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
    // InternalDmx.g:4823:1: rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl : ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4827:1: ( ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* ) )
            // InternalDmx.g:4828:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* )
            {
            // InternalDmx.g:4828:1: ( ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )* )
            // InternalDmx.g:4829:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getGroup_1_1_2_0_1_1()); 
            }
            // InternalDmx.g:4830:2: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==69) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDmx.g:4830:3: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__DTypedMemberReference__Group_1_1_2_0_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalDmx.g:4839:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0 : rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4843:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 )
            // InternalDmx.g:4844:2: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl rule__DTypedMemberReference__Group_1_1_2_0_1_1__1
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
    // InternalDmx.g:4851:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl : ( ',' ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4855:1: ( ( ',' ) )
            // InternalDmx.g:4856:1: ( ',' )
            {
            // InternalDmx.g:4856:1: ( ',' )
            // InternalDmx.g:4857:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:4866:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1 : rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4870:1: ( rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl )
            // InternalDmx.g:4871:2: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl
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
    // InternalDmx.g:4877:1: rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl : ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) ) ;
    public final void rule__DTypedMemberReference__Group_1_1_2_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4881:1: ( ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) ) )
            // InternalDmx.g:4882:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) )
            {
            // InternalDmx.g:4882:1: ( ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 ) )
            // InternalDmx.g:4883:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_1_1()); 
            }
            // InternalDmx.g:4884:2: ( rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 )
            // InternalDmx.g:4884:3: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1
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
    // InternalDmx.g:4893:1: rule__DSelfExpression__Group__0 : rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 ;
    public final void rule__DSelfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4897:1: ( rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1 )
            // InternalDmx.g:4898:2: rule__DSelfExpression__Group__0__Impl rule__DSelfExpression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDmx.g:4905:1: rule__DSelfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DSelfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4909:1: ( ( () ) )
            // InternalDmx.g:4910:1: ( () )
            {
            // InternalDmx.g:4910:1: ( () )
            // InternalDmx.g:4911:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0()); 
            }
            // InternalDmx.g:4912:2: ()
            // InternalDmx.g:4912:3: 
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
    // InternalDmx.g:4920:1: rule__DSelfExpression__Group__1 : rule__DSelfExpression__Group__1__Impl ;
    public final void rule__DSelfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4924:1: ( rule__DSelfExpression__Group__1__Impl )
            // InternalDmx.g:4925:2: rule__DSelfExpression__Group__1__Impl
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
    // InternalDmx.g:4931:1: rule__DSelfExpression__Group__1__Impl : ( ( rule__DSelfExpression__Alternatives_1 ) ) ;
    public final void rule__DSelfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4935:1: ( ( ( rule__DSelfExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4936:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4936:1: ( ( rule__DSelfExpression__Alternatives_1 ) )
            // InternalDmx.g:4937:2: ( rule__DSelfExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDSelfExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4938:2: ( rule__DSelfExpression__Alternatives_1 )
            // InternalDmx.g:4938:3: rule__DSelfExpression__Alternatives_1
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
    // InternalDmx.g:4947:1: rule__DReturnExpression__Group__0 : rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 ;
    public final void rule__DReturnExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4951:1: ( rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1 )
            // InternalDmx.g:4952:2: rule__DReturnExpression__Group__0__Impl rule__DReturnExpression__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDmx.g:4959:1: rule__DReturnExpression__Group__0__Impl : ( () ) ;
    public final void rule__DReturnExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4963:1: ( ( () ) )
            // InternalDmx.g:4964:1: ( () )
            {
            // InternalDmx.g:4964:1: ( () )
            // InternalDmx.g:4965:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0()); 
            }
            // InternalDmx.g:4966:2: ()
            // InternalDmx.g:4966:3: 
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
    // InternalDmx.g:4974:1: rule__DReturnExpression__Group__1 : rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 ;
    public final void rule__DReturnExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4978:1: ( rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2 )
            // InternalDmx.g:4979:2: rule__DReturnExpression__Group__1__Impl rule__DReturnExpression__Group__2
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
    // InternalDmx.g:4986:1: rule__DReturnExpression__Group__1__Impl : ( ( rule__DReturnExpression__Alternatives_1 ) ) ;
    public final void rule__DReturnExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:4990:1: ( ( ( rule__DReturnExpression__Alternatives_1 ) ) )
            // InternalDmx.g:4991:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:4991:1: ( ( rule__DReturnExpression__Alternatives_1 ) )
            // InternalDmx.g:4992:2: ( rule__DReturnExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:4993:2: ( rule__DReturnExpression__Alternatives_1 )
            // InternalDmx.g:4993:3: rule__DReturnExpression__Alternatives_1
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
    // InternalDmx.g:5001:1: rule__DReturnExpression__Group__2 : rule__DReturnExpression__Group__2__Impl ;
    public final void rule__DReturnExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5005:1: ( rule__DReturnExpression__Group__2__Impl )
            // InternalDmx.g:5006:2: rule__DReturnExpression__Group__2__Impl
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
    // InternalDmx.g:5012:1: rule__DReturnExpression__Group__2__Impl : ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) ;
    public final void rule__DReturnExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5016:1: ( ( ( rule__DReturnExpression__ExpressionAssignment_2 )? ) )
            // InternalDmx.g:5017:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            {
            // InternalDmx.g:5017:1: ( ( rule__DReturnExpression__ExpressionAssignment_2 )? )
            // InternalDmx.g:5018:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:5019:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalDmx.g:5019:3: rule__DReturnExpression__ExpressionAssignment_2
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
    // InternalDmx.g:5028:1: rule__DRaiseExpression__Group__0 : rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 ;
    public final void rule__DRaiseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5032:1: ( rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1 )
            // InternalDmx.g:5033:2: rule__DRaiseExpression__Group__0__Impl rule__DRaiseExpression__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDmx.g:5040:1: rule__DRaiseExpression__Group__0__Impl : ( () ) ;
    public final void rule__DRaiseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5044:1: ( ( () ) )
            // InternalDmx.g:5045:1: ( () )
            {
            // InternalDmx.g:5045:1: ( () )
            // InternalDmx.g:5046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0()); 
            }
            // InternalDmx.g:5047:2: ()
            // InternalDmx.g:5047:3: 
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
    // InternalDmx.g:5055:1: rule__DRaiseExpression__Group__1 : rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 ;
    public final void rule__DRaiseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5059:1: ( rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2 )
            // InternalDmx.g:5060:2: rule__DRaiseExpression__Group__1__Impl rule__DRaiseExpression__Group__2
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
    // InternalDmx.g:5067:1: rule__DRaiseExpression__Group__1__Impl : ( ( rule__DRaiseExpression__Alternatives_1 ) ) ;
    public final void rule__DRaiseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5071:1: ( ( ( rule__DRaiseExpression__Alternatives_1 ) ) )
            // InternalDmx.g:5072:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            {
            // InternalDmx.g:5072:1: ( ( rule__DRaiseExpression__Alternatives_1 ) )
            // InternalDmx.g:5073:2: ( rule__DRaiseExpression__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:5074:2: ( rule__DRaiseExpression__Alternatives_1 )
            // InternalDmx.g:5074:3: rule__DRaiseExpression__Alternatives_1
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
    // InternalDmx.g:5082:1: rule__DRaiseExpression__Group__2 : rule__DRaiseExpression__Group__2__Impl ;
    public final void rule__DRaiseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5086:1: ( rule__DRaiseExpression__Group__2__Impl )
            // InternalDmx.g:5087:2: rule__DRaiseExpression__Group__2__Impl
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
    // InternalDmx.g:5093:1: rule__DRaiseExpression__Group__2__Impl : ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__DRaiseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5097:1: ( ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) ) )
            // InternalDmx.g:5098:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            {
            // InternalDmx.g:5098:1: ( ( rule__DRaiseExpression__ExpressionAssignment_2 ) )
            // InternalDmx.g:5099:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalDmx.g:5100:2: ( rule__DRaiseExpression__ExpressionAssignment_2 )
            // InternalDmx.g:5100:3: rule__DRaiseExpression__ExpressionAssignment_2
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
    // InternalDmx.g:5109:1: rule__DParenthesizedExpression__Group__0 : rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 ;
    public final void rule__DParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5113:1: ( rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1 )
            // InternalDmx.g:5114:2: rule__DParenthesizedExpression__Group__0__Impl rule__DParenthesizedExpression__Group__1
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
    // InternalDmx.g:5121:1: rule__DParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__DParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5125:1: ( ( '(' ) )
            // InternalDmx.g:5126:1: ( '(' )
            {
            // InternalDmx.g:5126:1: ( '(' )
            // InternalDmx.g:5127:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5136:1: rule__DParenthesizedExpression__Group__1 : rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 ;
    public final void rule__DParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5140:1: ( rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2 )
            // InternalDmx.g:5141:2: rule__DParenthesizedExpression__Group__1__Impl rule__DParenthesizedExpression__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalDmx.g:5148:1: rule__DParenthesizedExpression__Group__1__Impl : ( ruleDExpression ) ;
    public final void rule__DParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5152:1: ( ( ruleDExpression ) )
            // InternalDmx.g:5153:1: ( ruleDExpression )
            {
            // InternalDmx.g:5153:1: ( ruleDExpression )
            // InternalDmx.g:5154:2: ruleDExpression
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
    // InternalDmx.g:5163:1: rule__DParenthesizedExpression__Group__2 : rule__DParenthesizedExpression__Group__2__Impl ;
    public final void rule__DParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5167:1: ( rule__DParenthesizedExpression__Group__2__Impl )
            // InternalDmx.g:5168:2: rule__DParenthesizedExpression__Group__2__Impl
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
    // InternalDmx.g:5174:1: rule__DParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__DParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5178:1: ( ( ')' ) )
            // InternalDmx.g:5179:1: ( ')' )
            {
            // InternalDmx.g:5179:1: ( ')' )
            // InternalDmx.g:5180:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5190:1: rule__DFunctionCall__Group__0 : rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 ;
    public final void rule__DFunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5194:1: ( rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1 )
            // InternalDmx.g:5195:2: rule__DFunctionCall__Group__0__Impl rule__DFunctionCall__Group__1
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
    // InternalDmx.g:5202:1: rule__DFunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__DFunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5206:1: ( ( () ) )
            // InternalDmx.g:5207:1: ( () )
            {
            // InternalDmx.g:5207:1: ( () )
            // InternalDmx.g:5208:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0()); 
            }
            // InternalDmx.g:5209:2: ()
            // InternalDmx.g:5209:3: 
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
    // InternalDmx.g:5217:1: rule__DFunctionCall__Group__1 : rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 ;
    public final void rule__DFunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5221:1: ( rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2 )
            // InternalDmx.g:5222:2: rule__DFunctionCall__Group__1__Impl rule__DFunctionCall__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalDmx.g:5229:1: rule__DFunctionCall__Group__1__Impl : ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) ;
    public final void rule__DFunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5233:1: ( ( ( rule__DFunctionCall__FunctionAssignment_1 ) ) )
            // InternalDmx.g:5234:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            {
            // InternalDmx.g:5234:1: ( ( rule__DFunctionCall__FunctionAssignment_1 ) )
            // InternalDmx.g:5235:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1()); 
            }
            // InternalDmx.g:5236:2: ( rule__DFunctionCall__FunctionAssignment_1 )
            // InternalDmx.g:5236:3: rule__DFunctionCall__FunctionAssignment_1
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
    // InternalDmx.g:5244:1: rule__DFunctionCall__Group__2 : rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 ;
    public final void rule__DFunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5248:1: ( rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3 )
            // InternalDmx.g:5249:2: rule__DFunctionCall__Group__2__Impl rule__DFunctionCall__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:5256:1: rule__DFunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__DFunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5260:1: ( ( '(' ) )
            // InternalDmx.g:5261:1: ( '(' )
            {
            // InternalDmx.g:5261:1: ( '(' )
            // InternalDmx.g:5262:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5271:1: rule__DFunctionCall__Group__3 : rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 ;
    public final void rule__DFunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5275:1: ( rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4 )
            // InternalDmx.g:5276:2: rule__DFunctionCall__Group__3__Impl rule__DFunctionCall__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:5283:1: rule__DFunctionCall__Group__3__Impl : ( ( rule__DFunctionCall__Group_3__0 )? ) ;
    public final void rule__DFunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5287:1: ( ( ( rule__DFunctionCall__Group_3__0 )? ) )
            // InternalDmx.g:5288:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            {
            // InternalDmx.g:5288:1: ( ( rule__DFunctionCall__Group_3__0 )? )
            // InternalDmx.g:5289:2: ( rule__DFunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5290:2: ( rule__DFunctionCall__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_NATURAL && LA45_0<=RULE_PLAIN_TEXT_START)||LA45_0==RULE_STRING||(LA45_0>=22 && LA45_0<=29)||(LA45_0>=31 && LA45_0<=34)||(LA45_0>=37 && LA45_0<=38)||(LA45_0>=60 && LA45_0<=62)||(LA45_0>=70 && LA45_0<=71)||LA45_0==76||(LA45_0>=78 && LA45_0<=79)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmx.g:5290:3: rule__DFunctionCall__Group_3__0
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
    // InternalDmx.g:5298:1: rule__DFunctionCall__Group__4 : rule__DFunctionCall__Group__4__Impl ;
    public final void rule__DFunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5302:1: ( rule__DFunctionCall__Group__4__Impl )
            // InternalDmx.g:5303:2: rule__DFunctionCall__Group__4__Impl
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
    // InternalDmx.g:5309:1: rule__DFunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__DFunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5313:1: ( ( ')' ) )
            // InternalDmx.g:5314:1: ( ')' )
            {
            // InternalDmx.g:5314:1: ( ')' )
            // InternalDmx.g:5315:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5325:1: rule__DFunctionCall__Group_3__0 : rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 ;
    public final void rule__DFunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5329:1: ( rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1 )
            // InternalDmx.g:5330:2: rule__DFunctionCall__Group_3__0__Impl rule__DFunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDmx.g:5337:1: rule__DFunctionCall__Group_3__0__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) ;
    public final void rule__DFunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5341:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) ) )
            // InternalDmx.g:5342:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            {
            // InternalDmx.g:5342:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 ) )
            // InternalDmx.g:5343:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0()); 
            }
            // InternalDmx.g:5344:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 )
            // InternalDmx.g:5344:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0
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
    // InternalDmx.g:5352:1: rule__DFunctionCall__Group_3__1 : rule__DFunctionCall__Group_3__1__Impl ;
    public final void rule__DFunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5356:1: ( rule__DFunctionCall__Group_3__1__Impl )
            // InternalDmx.g:5357:2: rule__DFunctionCall__Group_3__1__Impl
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
    // InternalDmx.g:5363:1: rule__DFunctionCall__Group_3__1__Impl : ( ( rule__DFunctionCall__Group_3_1__0 )* ) ;
    public final void rule__DFunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5367:1: ( ( ( rule__DFunctionCall__Group_3_1__0 )* ) )
            // InternalDmx.g:5368:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            {
            // InternalDmx.g:5368:1: ( ( rule__DFunctionCall__Group_3_1__0 )* )
            // InternalDmx.g:5369:2: ( rule__DFunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5370:2: ( rule__DFunctionCall__Group_3_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==69) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDmx.g:5370:3: rule__DFunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__DFunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalDmx.g:5379:1: rule__DFunctionCall__Group_3_1__0 : rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 ;
    public final void rule__DFunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5383:1: ( rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1 )
            // InternalDmx.g:5384:2: rule__DFunctionCall__Group_3_1__0__Impl rule__DFunctionCall__Group_3_1__1
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
    // InternalDmx.g:5391:1: rule__DFunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DFunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5395:1: ( ( ',' ) )
            // InternalDmx.g:5396:1: ( ',' )
            {
            // InternalDmx.g:5396:1: ( ',' )
            // InternalDmx.g:5397:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5406:1: rule__DFunctionCall__Group_3_1__1 : rule__DFunctionCall__Group_3_1__1__Impl ;
    public final void rule__DFunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5410:1: ( rule__DFunctionCall__Group_3_1__1__Impl )
            // InternalDmx.g:5411:2: rule__DFunctionCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5417:1: rule__DFunctionCall__Group_3_1__1__Impl : ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) ;
    public final void rule__DFunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5421:1: ( ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) ) )
            // InternalDmx.g:5422:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            {
            // InternalDmx.g:5422:1: ( ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 ) )
            // InternalDmx.g:5423:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1()); 
            }
            // InternalDmx.g:5424:2: ( rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 )
            // InternalDmx.g:5424:3: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1
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
    // InternalDmx.g:5433:1: rule__DConstructorCall__Group__0 : rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 ;
    public final void rule__DConstructorCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5437:1: ( rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1 )
            // InternalDmx.g:5438:2: rule__DConstructorCall__Group__0__Impl rule__DConstructorCall__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalDmx.g:5445:1: rule__DConstructorCall__Group__0__Impl : ( () ) ;
    public final void rule__DConstructorCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5449:1: ( ( () ) )
            // InternalDmx.g:5450:1: ( () )
            {
            // InternalDmx.g:5450:1: ( () )
            // InternalDmx.g:5451:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0()); 
            }
            // InternalDmx.g:5452:2: ()
            // InternalDmx.g:5452:3: 
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
    // InternalDmx.g:5460:1: rule__DConstructorCall__Group__1 : rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 ;
    public final void rule__DConstructorCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5464:1: ( rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2 )
            // InternalDmx.g:5465:2: rule__DConstructorCall__Group__1__Impl rule__DConstructorCall__Group__2
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
    // InternalDmx.g:5472:1: rule__DConstructorCall__Group__1__Impl : ( ruleOpConstructor ) ;
    public final void rule__DConstructorCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5476:1: ( ( ruleOpConstructor ) )
            // InternalDmx.g:5477:1: ( ruleOpConstructor )
            {
            // InternalDmx.g:5477:1: ( ruleOpConstructor )
            // InternalDmx.g:5478:2: ruleOpConstructor
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
    // InternalDmx.g:5487:1: rule__DConstructorCall__Group__2 : rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 ;
    public final void rule__DConstructorCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5491:1: ( rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3 )
            // InternalDmx.g:5492:2: rule__DConstructorCall__Group__2__Impl rule__DConstructorCall__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalDmx.g:5499:1: rule__DConstructorCall__Group__2__Impl : ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) ;
    public final void rule__DConstructorCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5503:1: ( ( ( rule__DConstructorCall__ConstructorAssignment_2 ) ) )
            // InternalDmx.g:5504:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            {
            // InternalDmx.g:5504:1: ( ( rule__DConstructorCall__ConstructorAssignment_2 ) )
            // InternalDmx.g:5505:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2()); 
            }
            // InternalDmx.g:5506:2: ( rule__DConstructorCall__ConstructorAssignment_2 )
            // InternalDmx.g:5506:3: rule__DConstructorCall__ConstructorAssignment_2
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
    // InternalDmx.g:5514:1: rule__DConstructorCall__Group__3 : rule__DConstructorCall__Group__3__Impl ;
    public final void rule__DConstructorCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5518:1: ( rule__DConstructorCall__Group__3__Impl )
            // InternalDmx.g:5519:2: rule__DConstructorCall__Group__3__Impl
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
    // InternalDmx.g:5525:1: rule__DConstructorCall__Group__3__Impl : ( ( rule__DConstructorCall__Group_3__0 )? ) ;
    public final void rule__DConstructorCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5529:1: ( ( ( rule__DConstructorCall__Group_3__0 )? ) )
            // InternalDmx.g:5530:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            {
            // InternalDmx.g:5530:1: ( ( rule__DConstructorCall__Group_3__0 )? )
            // InternalDmx.g:5531:2: ( rule__DConstructorCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3()); 
            }
            // InternalDmx.g:5532:2: ( rule__DConstructorCall__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDmx.g:5532:3: rule__DConstructorCall__Group_3__0
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
    // InternalDmx.g:5541:1: rule__DConstructorCall__Group_3__0 : rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 ;
    public final void rule__DConstructorCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5545:1: ( rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1 )
            // InternalDmx.g:5546:2: rule__DConstructorCall__Group_3__0__Impl rule__DConstructorCall__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:5553:1: rule__DConstructorCall__Group_3__0__Impl : ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) ;
    public final void rule__DConstructorCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5557:1: ( ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) ) )
            // InternalDmx.g:5558:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            {
            // InternalDmx.g:5558:1: ( ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 ) )
            // InternalDmx.g:5559:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0()); 
            }
            // InternalDmx.g:5560:2: ( rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 )
            // InternalDmx.g:5560:3: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0
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
    // InternalDmx.g:5568:1: rule__DConstructorCall__Group_3__1 : rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 ;
    public final void rule__DConstructorCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5572:1: ( rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2 )
            // InternalDmx.g:5573:2: rule__DConstructorCall__Group_3__1__Impl rule__DConstructorCall__Group_3__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalDmx.g:5580:1: rule__DConstructorCall__Group_3__1__Impl : ( ( rule__DConstructorCall__Group_3_1__0 )? ) ;
    public final void rule__DConstructorCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5584:1: ( ( ( rule__DConstructorCall__Group_3_1__0 )? ) )
            // InternalDmx.g:5585:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            {
            // InternalDmx.g:5585:1: ( ( rule__DConstructorCall__Group_3_1__0 )? )
            // InternalDmx.g:5586:2: ( rule__DConstructorCall__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1()); 
            }
            // InternalDmx.g:5587:2: ( rule__DConstructorCall__Group_3_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_NATURAL && LA48_0<=RULE_PLAIN_TEXT_START)||LA48_0==RULE_STRING||(LA48_0>=22 && LA48_0<=29)||(LA48_0>=31 && LA48_0<=34)||(LA48_0>=37 && LA48_0<=38)||(LA48_0>=60 && LA48_0<=62)||(LA48_0>=70 && LA48_0<=71)||LA48_0==76||(LA48_0>=78 && LA48_0<=79)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmx.g:5587:3: rule__DConstructorCall__Group_3_1__0
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
    // InternalDmx.g:5595:1: rule__DConstructorCall__Group_3__2 : rule__DConstructorCall__Group_3__2__Impl ;
    public final void rule__DConstructorCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5599:1: ( rule__DConstructorCall__Group_3__2__Impl )
            // InternalDmx.g:5600:2: rule__DConstructorCall__Group_3__2__Impl
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
    // InternalDmx.g:5606:1: rule__DConstructorCall__Group_3__2__Impl : ( ')' ) ;
    public final void rule__DConstructorCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5610:1: ( ( ')' ) )
            // InternalDmx.g:5611:1: ( ')' )
            {
            // InternalDmx.g:5611:1: ( ')' )
            // InternalDmx.g:5612:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5622:1: rule__DConstructorCall__Group_3_1__0 : rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 ;
    public final void rule__DConstructorCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5626:1: ( rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1 )
            // InternalDmx.g:5627:2: rule__DConstructorCall__Group_3_1__0__Impl rule__DConstructorCall__Group_3_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDmx.g:5634:1: rule__DConstructorCall__Group_3_1__0__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) ;
    public final void rule__DConstructorCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5638:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) ) )
            // InternalDmx.g:5639:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            {
            // InternalDmx.g:5639:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 ) )
            // InternalDmx.g:5640:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0()); 
            }
            // InternalDmx.g:5641:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_0 )
            // InternalDmx.g:5641:3: rule__DConstructorCall__ArgumentsAssignment_3_1_0
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
    // InternalDmx.g:5649:1: rule__DConstructorCall__Group_3_1__1 : rule__DConstructorCall__Group_3_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5653:1: ( rule__DConstructorCall__Group_3_1__1__Impl )
            // InternalDmx.g:5654:2: rule__DConstructorCall__Group_3_1__1__Impl
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
    // InternalDmx.g:5660:1: rule__DConstructorCall__Group_3_1__1__Impl : ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) ;
    public final void rule__DConstructorCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5664:1: ( ( ( rule__DConstructorCall__Group_3_1_1__0 )* ) )
            // InternalDmx.g:5665:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            {
            // InternalDmx.g:5665:1: ( ( rule__DConstructorCall__Group_3_1_1__0 )* )
            // InternalDmx.g:5666:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1()); 
            }
            // InternalDmx.g:5667:2: ( rule__DConstructorCall__Group_3_1_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==69) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDmx.g:5667:3: rule__DConstructorCall__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__DConstructorCall__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalDmx.g:5676:1: rule__DConstructorCall__Group_3_1_1__0 : rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 ;
    public final void rule__DConstructorCall__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5680:1: ( rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1 )
            // InternalDmx.g:5681:2: rule__DConstructorCall__Group_3_1_1__0__Impl rule__DConstructorCall__Group_3_1_1__1
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
    // InternalDmx.g:5688:1: rule__DConstructorCall__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__DConstructorCall__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5692:1: ( ( ',' ) )
            // InternalDmx.g:5693:1: ( ',' )
            {
            // InternalDmx.g:5693:1: ( ',' )
            // InternalDmx.g:5694:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5703:1: rule__DConstructorCall__Group_3_1_1__1 : rule__DConstructorCall__Group_3_1_1__1__Impl ;
    public final void rule__DConstructorCall__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5707:1: ( rule__DConstructorCall__Group_3_1_1__1__Impl )
            // InternalDmx.g:5708:2: rule__DConstructorCall__Group_3_1_1__1__Impl
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
    // InternalDmx.g:5714:1: rule__DConstructorCall__Group_3_1_1__1__Impl : ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) ;
    public final void rule__DConstructorCall__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5718:1: ( ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) ) )
            // InternalDmx.g:5719:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            {
            // InternalDmx.g:5719:1: ( ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 ) )
            // InternalDmx.g:5720:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1()); 
            }
            // InternalDmx.g:5721:2: ( rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 )
            // InternalDmx.g:5721:3: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1
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
    // InternalDmx.g:5730:1: rule__DContextReference__Group__0 : rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 ;
    public final void rule__DContextReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5734:1: ( rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1 )
            // InternalDmx.g:5735:2: rule__DContextReference__Group__0__Impl rule__DContextReference__Group__1
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
    // InternalDmx.g:5742:1: rule__DContextReference__Group__0__Impl : ( () ) ;
    public final void rule__DContextReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5746:1: ( ( () ) )
            // InternalDmx.g:5747:1: ( () )
            {
            // InternalDmx.g:5747:1: ( () )
            // InternalDmx.g:5748:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0()); 
            }
            // InternalDmx.g:5749:2: ()
            // InternalDmx.g:5749:3: 
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
    // InternalDmx.g:5757:1: rule__DContextReference__Group__1 : rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2 ;
    public final void rule__DContextReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5761:1: ( rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2 )
            // InternalDmx.g:5762:2: rule__DContextReference__Group__1__Impl rule__DContextReference__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalDmx.g:5769:1: rule__DContextReference__Group__1__Impl : ( ( rule__DContextReference__TargetAssignment_1 ) ) ;
    public final void rule__DContextReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5773:1: ( ( ( rule__DContextReference__TargetAssignment_1 ) ) )
            // InternalDmx.g:5774:1: ( ( rule__DContextReference__TargetAssignment_1 ) )
            {
            // InternalDmx.g:5774:1: ( ( rule__DContextReference__TargetAssignment_1 ) )
            // InternalDmx.g:5775:2: ( rule__DContextReference__TargetAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getTargetAssignment_1()); 
            }
            // InternalDmx.g:5776:2: ( rule__DContextReference__TargetAssignment_1 )
            // InternalDmx.g:5776:3: rule__DContextReference__TargetAssignment_1
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
    // InternalDmx.g:5784:1: rule__DContextReference__Group__2 : rule__DContextReference__Group__2__Impl ;
    public final void rule__DContextReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5788:1: ( rule__DContextReference__Group__2__Impl )
            // InternalDmx.g:5789:2: rule__DContextReference__Group__2__Impl
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
    // InternalDmx.g:5795:1: rule__DContextReference__Group__2__Impl : ( ( rule__DContextReference__BeforeAssignment_2 )? ) ;
    public final void rule__DContextReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5799:1: ( ( ( rule__DContextReference__BeforeAssignment_2 )? ) )
            // InternalDmx.g:5800:1: ( ( rule__DContextReference__BeforeAssignment_2 )? )
            {
            // InternalDmx.g:5800:1: ( ( rule__DContextReference__BeforeAssignment_2 )? )
            // InternalDmx.g:5801:2: ( rule__DContextReference__BeforeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeAssignment_2()); 
            }
            // InternalDmx.g:5802:2: ( rule__DContextReference__BeforeAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDmx.g:5802:3: rule__DContextReference__BeforeAssignment_2
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
    // InternalDmx.g:5811:1: rule__DIfExpression__Group__0 : rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 ;
    public final void rule__DIfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5815:1: ( rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1 )
            // InternalDmx.g:5816:2: rule__DIfExpression__Group__0__Impl rule__DIfExpression__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalDmx.g:5823:1: rule__DIfExpression__Group__0__Impl : ( () ) ;
    public final void rule__DIfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5827:1: ( ( () ) )
            // InternalDmx.g:5828:1: ( () )
            {
            // InternalDmx.g:5828:1: ( () )
            // InternalDmx.g:5829:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0()); 
            }
            // InternalDmx.g:5830:2: ()
            // InternalDmx.g:5830:3: 
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
    // InternalDmx.g:5838:1: rule__DIfExpression__Group__1 : rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 ;
    public final void rule__DIfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5842:1: ( rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2 )
            // InternalDmx.g:5843:2: rule__DIfExpression__Group__1__Impl rule__DIfExpression__Group__2
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
    // InternalDmx.g:5850:1: rule__DIfExpression__Group__1__Impl : ( 'if' ) ;
    public final void rule__DIfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5854:1: ( ( 'if' ) )
            // InternalDmx.g:5855:1: ( 'if' )
            {
            // InternalDmx.g:5855:1: ( 'if' )
            // InternalDmx.g:5856:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfKeyword_1()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5865:1: rule__DIfExpression__Group__2 : rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 ;
    public final void rule__DIfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5869:1: ( rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3 )
            // InternalDmx.g:5870:2: rule__DIfExpression__Group__2__Impl rule__DIfExpression__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalDmx.g:5877:1: rule__DIfExpression__Group__2__Impl : ( ( rule__DIfExpression__IfAssignment_2 ) ) ;
    public final void rule__DIfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5881:1: ( ( ( rule__DIfExpression__IfAssignment_2 ) ) )
            // InternalDmx.g:5882:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            {
            // InternalDmx.g:5882:1: ( ( rule__DIfExpression__IfAssignment_2 ) )
            // InternalDmx.g:5883:2: ( rule__DIfExpression__IfAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getIfAssignment_2()); 
            }
            // InternalDmx.g:5884:2: ( rule__DIfExpression__IfAssignment_2 )
            // InternalDmx.g:5884:3: rule__DIfExpression__IfAssignment_2
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
    // InternalDmx.g:5892:1: rule__DIfExpression__Group__3 : rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 ;
    public final void rule__DIfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5896:1: ( rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4 )
            // InternalDmx.g:5897:2: rule__DIfExpression__Group__3__Impl rule__DIfExpression__Group__4
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
    // InternalDmx.g:5904:1: rule__DIfExpression__Group__3__Impl : ( 'then' ) ;
    public final void rule__DIfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5908:1: ( ( 'then' ) )
            // InternalDmx.g:5909:1: ( 'then' )
            {
            // InternalDmx.g:5909:1: ( 'then' )
            // InternalDmx.g:5910:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenKeyword_3()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:5919:1: rule__DIfExpression__Group__4 : rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 ;
    public final void rule__DIfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5923:1: ( rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5 )
            // InternalDmx.g:5924:2: rule__DIfExpression__Group__4__Impl rule__DIfExpression__Group__5
            {
            pushFollow(FOLLOW_48);
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
    // InternalDmx.g:5931:1: rule__DIfExpression__Group__4__Impl : ( ( rule__DIfExpression__ThenAssignment_4 ) ) ;
    public final void rule__DIfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5935:1: ( ( ( rule__DIfExpression__ThenAssignment_4 ) ) )
            // InternalDmx.g:5936:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            {
            // InternalDmx.g:5936:1: ( ( rule__DIfExpression__ThenAssignment_4 ) )
            // InternalDmx.g:5937:2: ( rule__DIfExpression__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getThenAssignment_4()); 
            }
            // InternalDmx.g:5938:2: ( rule__DIfExpression__ThenAssignment_4 )
            // InternalDmx.g:5938:3: rule__DIfExpression__ThenAssignment_4
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
    // InternalDmx.g:5946:1: rule__DIfExpression__Group__5 : rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 ;
    public final void rule__DIfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5950:1: ( rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6 )
            // InternalDmx.g:5951:2: rule__DIfExpression__Group__5__Impl rule__DIfExpression__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalDmx.g:5958:1: rule__DIfExpression__Group__5__Impl : ( ( rule__DIfExpression__Group_5__0 )? ) ;
    public final void rule__DIfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5962:1: ( ( ( rule__DIfExpression__Group_5__0 )? ) )
            // InternalDmx.g:5963:1: ( ( rule__DIfExpression__Group_5__0 )? )
            {
            // InternalDmx.g:5963:1: ( ( rule__DIfExpression__Group_5__0 )? )
            // InternalDmx.g:5964:2: ( rule__DIfExpression__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getGroup_5()); 
            }
            // InternalDmx.g:5965:2: ( rule__DIfExpression__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==74) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDmx.g:5965:3: rule__DIfExpression__Group_5__0
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
    // InternalDmx.g:5973:1: rule__DIfExpression__Group__6 : rule__DIfExpression__Group__6__Impl ;
    public final void rule__DIfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5977:1: ( rule__DIfExpression__Group__6__Impl )
            // InternalDmx.g:5978:2: rule__DIfExpression__Group__6__Impl
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
    // InternalDmx.g:5984:1: rule__DIfExpression__Group__6__Impl : ( 'end' ) ;
    public final void rule__DIfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:5988:1: ( ( 'end' ) )
            // InternalDmx.g:5989:1: ( 'end' )
            {
            // InternalDmx.g:5989:1: ( 'end' )
            // InternalDmx.g:5990:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getEndKeyword_6()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6000:1: rule__DIfExpression__Group_5__0 : rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 ;
    public final void rule__DIfExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6004:1: ( rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1 )
            // InternalDmx.g:6005:2: rule__DIfExpression__Group_5__0__Impl rule__DIfExpression__Group_5__1
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
    // InternalDmx.g:6012:1: rule__DIfExpression__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__DIfExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6016:1: ( ( ( 'else' ) ) )
            // InternalDmx.g:6017:1: ( ( 'else' ) )
            {
            // InternalDmx.g:6017:1: ( ( 'else' ) )
            // InternalDmx.g:6018:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0()); 
            }
            // InternalDmx.g:6019:2: ( 'else' )
            // InternalDmx.g:6019:3: 'else'
            {
            match(input,74,FOLLOW_2); if (state.failed) return ;

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
    // InternalDmx.g:6027:1: rule__DIfExpression__Group_5__1 : rule__DIfExpression__Group_5__1__Impl ;
    public final void rule__DIfExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6031:1: ( rule__DIfExpression__Group_5__1__Impl )
            // InternalDmx.g:6032:2: rule__DIfExpression__Group_5__1__Impl
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
    // InternalDmx.g:6038:1: rule__DIfExpression__Group_5__1__Impl : ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) ;
    public final void rule__DIfExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6042:1: ( ( ( rule__DIfExpression__ElseAssignment_5_1 ) ) )
            // InternalDmx.g:6043:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            {
            // InternalDmx.g:6043:1: ( ( rule__DIfExpression__ElseAssignment_5_1 ) )
            // InternalDmx.g:6044:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1()); 
            }
            // InternalDmx.g:6045:2: ( rule__DIfExpression__ElseAssignment_5_1 )
            // InternalDmx.g:6045:3: rule__DIfExpression__ElseAssignment_5_1
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
    // InternalDmx.g:6054:1: rule__DForLoopExpression__Group__0 : rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 ;
    public final void rule__DForLoopExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6058:1: ( rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1 )
            // InternalDmx.g:6059:2: rule__DForLoopExpression__Group__0__Impl rule__DForLoopExpression__Group__1
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
    // InternalDmx.g:6066:1: rule__DForLoopExpression__Group__0__Impl : ( ( rule__DForLoopExpression__Group_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6070:1: ( ( ( rule__DForLoopExpression__Group_0__0 ) ) )
            // InternalDmx.g:6071:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            {
            // InternalDmx.g:6071:1: ( ( rule__DForLoopExpression__Group_0__0 ) )
            // InternalDmx.g:6072:2: ( rule__DForLoopExpression__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0()); 
            }
            // InternalDmx.g:6073:2: ( rule__DForLoopExpression__Group_0__0 )
            // InternalDmx.g:6073:3: rule__DForLoopExpression__Group_0__0
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
    // InternalDmx.g:6081:1: rule__DForLoopExpression__Group__1 : rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 ;
    public final void rule__DForLoopExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6085:1: ( rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2 )
            // InternalDmx.g:6086:2: rule__DForLoopExpression__Group__1__Impl rule__DForLoopExpression__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalDmx.g:6093:1: rule__DForLoopExpression__Group__1__Impl : ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) ;
    public final void rule__DForLoopExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6097:1: ( ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) ) )
            // InternalDmx.g:6098:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            {
            // InternalDmx.g:6098:1: ( ( rule__DForLoopExpression__ForExpressionAssignment_1 ) )
            // InternalDmx.g:6099:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1()); 
            }
            // InternalDmx.g:6100:2: ( rule__DForLoopExpression__ForExpressionAssignment_1 )
            // InternalDmx.g:6100:3: rule__DForLoopExpression__ForExpressionAssignment_1
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
    // InternalDmx.g:6108:1: rule__DForLoopExpression__Group__2 : rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 ;
    public final void rule__DForLoopExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6112:1: ( rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3 )
            // InternalDmx.g:6113:2: rule__DForLoopExpression__Group__2__Impl rule__DForLoopExpression__Group__3
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
    // InternalDmx.g:6120:1: rule__DForLoopExpression__Group__2__Impl : ( 'do' ) ;
    public final void rule__DForLoopExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6124:1: ( ( 'do' ) )
            // InternalDmx.g:6125:1: ( 'do' )
            {
            // InternalDmx.g:6125:1: ( 'do' )
            // InternalDmx.g:6126:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6135:1: rule__DForLoopExpression__Group__3 : rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 ;
    public final void rule__DForLoopExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6139:1: ( rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4 )
            // InternalDmx.g:6140:2: rule__DForLoopExpression__Group__3__Impl rule__DForLoopExpression__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalDmx.g:6147:1: rule__DForLoopExpression__Group__3__Impl : ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) ;
    public final void rule__DForLoopExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6151:1: ( ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) ) )
            // InternalDmx.g:6152:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            {
            // InternalDmx.g:6152:1: ( ( rule__DForLoopExpression__EachExpressionAssignment_3 ) )
            // InternalDmx.g:6153:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3()); 
            }
            // InternalDmx.g:6154:2: ( rule__DForLoopExpression__EachExpressionAssignment_3 )
            // InternalDmx.g:6154:3: rule__DForLoopExpression__EachExpressionAssignment_3
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
    // InternalDmx.g:6162:1: rule__DForLoopExpression__Group__4 : rule__DForLoopExpression__Group__4__Impl ;
    public final void rule__DForLoopExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6166:1: ( rule__DForLoopExpression__Group__4__Impl )
            // InternalDmx.g:6167:2: rule__DForLoopExpression__Group__4__Impl
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
    // InternalDmx.g:6173:1: rule__DForLoopExpression__Group__4__Impl : ( 'end' ) ;
    public final void rule__DForLoopExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6177:1: ( ( 'end' ) )
            // InternalDmx.g:6178:1: ( 'end' )
            {
            // InternalDmx.g:6178:1: ( 'end' )
            // InternalDmx.g:6179:2: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getEndKeyword_4()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6189:1: rule__DForLoopExpression__Group_0__0 : rule__DForLoopExpression__Group_0__0__Impl ;
    public final void rule__DForLoopExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6193:1: ( rule__DForLoopExpression__Group_0__0__Impl )
            // InternalDmx.g:6194:2: rule__DForLoopExpression__Group_0__0__Impl
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
    // InternalDmx.g:6200:1: rule__DForLoopExpression__Group_0__0__Impl : ( ( rule__DForLoopExpression__Group_0_0__0 ) ) ;
    public final void rule__DForLoopExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6204:1: ( ( ( rule__DForLoopExpression__Group_0_0__0 ) ) )
            // InternalDmx.g:6205:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            {
            // InternalDmx.g:6205:1: ( ( rule__DForLoopExpression__Group_0_0__0 ) )
            // InternalDmx.g:6206:2: ( rule__DForLoopExpression__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0()); 
            }
            // InternalDmx.g:6207:2: ( rule__DForLoopExpression__Group_0_0__0 )
            // InternalDmx.g:6207:3: rule__DForLoopExpression__Group_0_0__0
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
    // InternalDmx.g:6216:1: rule__DForLoopExpression__Group_0_0__0 : rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 ;
    public final void rule__DForLoopExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6220:1: ( rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1 )
            // InternalDmx.g:6221:2: rule__DForLoopExpression__Group_0_0__0__Impl rule__DForLoopExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDmx.g:6228:1: rule__DForLoopExpression__Group_0_0__0__Impl : ( () ) ;
    public final void rule__DForLoopExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6232:1: ( ( () ) )
            // InternalDmx.g:6233:1: ( () )
            {
            // InternalDmx.g:6233:1: ( () )
            // InternalDmx.g:6234:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0()); 
            }
            // InternalDmx.g:6235:2: ()
            // InternalDmx.g:6235:3: 
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
    // InternalDmx.g:6243:1: rule__DForLoopExpression__Group_0_0__1 : rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 ;
    public final void rule__DForLoopExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6247:1: ( rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2 )
            // InternalDmx.g:6248:2: rule__DForLoopExpression__Group_0_0__1__Impl rule__DForLoopExpression__Group_0_0__2
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
    // InternalDmx.g:6255:1: rule__DForLoopExpression__Group_0_0__1__Impl : ( 'for' ) ;
    public final void rule__DForLoopExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6259:1: ( ( 'for' ) )
            // InternalDmx.g:6260:1: ( 'for' )
            {
            // InternalDmx.g:6260:1: ( 'for' )
            // InternalDmx.g:6261:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6270:1: rule__DForLoopExpression__Group_0_0__2 : rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 ;
    public final void rule__DForLoopExpression__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6274:1: ( rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3 )
            // InternalDmx.g:6275:2: rule__DForLoopExpression__Group_0_0__2__Impl rule__DForLoopExpression__Group_0_0__3
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
    // InternalDmx.g:6282:1: rule__DForLoopExpression__Group_0_0__2__Impl : ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) ;
    public final void rule__DForLoopExpression__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6286:1: ( ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) ) )
            // InternalDmx.g:6287:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            {
            // InternalDmx.g:6287:1: ( ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 ) )
            // InternalDmx.g:6288:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2()); 
            }
            // InternalDmx.g:6289:2: ( rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 )
            // InternalDmx.g:6289:3: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2
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
    // InternalDmx.g:6297:1: rule__DForLoopExpression__Group_0_0__3 : rule__DForLoopExpression__Group_0_0__3__Impl ;
    public final void rule__DForLoopExpression__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6301:1: ( rule__DForLoopExpression__Group_0_0__3__Impl )
            // InternalDmx.g:6302:2: rule__DForLoopExpression__Group_0_0__3__Impl
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
    // InternalDmx.g:6308:1: rule__DForLoopExpression__Group_0_0__3__Impl : ( ':' ) ;
    public final void rule__DForLoopExpression__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6312:1: ( ( ':' ) )
            // InternalDmx.g:6313:1: ( ':' )
            {
            // InternalDmx.g:6313:1: ( ':' )
            // InternalDmx.g:6314:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6324:1: rule__DBooleanLiteral__Group__0 : rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 ;
    public final void rule__DBooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6328:1: ( rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1 )
            // InternalDmx.g:6329:2: rule__DBooleanLiteral__Group__0__Impl rule__DBooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalDmx.g:6336:1: rule__DBooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DBooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6340:1: ( ( () ) )
            // InternalDmx.g:6341:1: ( () )
            {
            // InternalDmx.g:6341:1: ( () )
            // InternalDmx.g:6342:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0()); 
            }
            // InternalDmx.g:6343:2: ()
            // InternalDmx.g:6343:3: 
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
    // InternalDmx.g:6351:1: rule__DBooleanLiteral__Group__1 : rule__DBooleanLiteral__Group__1__Impl ;
    public final void rule__DBooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6355:1: ( rule__DBooleanLiteral__Group__1__Impl )
            // InternalDmx.g:6356:2: rule__DBooleanLiteral__Group__1__Impl
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
    // InternalDmx.g:6362:1: rule__DBooleanLiteral__Group__1__Impl : ( ( rule__DBooleanLiteral__Alternatives_1 ) ) ;
    public final void rule__DBooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6366:1: ( ( ( rule__DBooleanLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6367:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6367:1: ( ( rule__DBooleanLiteral__Alternatives_1 ) )
            // InternalDmx.g:6368:2: ( rule__DBooleanLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6369:2: ( rule__DBooleanLiteral__Alternatives_1 )
            // InternalDmx.g:6369:3: rule__DBooleanLiteral__Alternatives_1
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
    // InternalDmx.g:6378:1: rule__DStringLiteral__Group__0 : rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 ;
    public final void rule__DStringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6382:1: ( rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1 )
            // InternalDmx.g:6383:2: rule__DStringLiteral__Group__0__Impl rule__DStringLiteral__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalDmx.g:6390:1: rule__DStringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DStringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6394:1: ( ( () ) )
            // InternalDmx.g:6395:1: ( () )
            {
            // InternalDmx.g:6395:1: ( () )
            // InternalDmx.g:6396:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0()); 
            }
            // InternalDmx.g:6397:2: ()
            // InternalDmx.g:6397:3: 
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
    // InternalDmx.g:6405:1: rule__DStringLiteral__Group__1 : rule__DStringLiteral__Group__1__Impl ;
    public final void rule__DStringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6409:1: ( rule__DStringLiteral__Group__1__Impl )
            // InternalDmx.g:6410:2: rule__DStringLiteral__Group__1__Impl
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
    // InternalDmx.g:6416:1: rule__DStringLiteral__Group__1__Impl : ( ( rule__DStringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DStringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6420:1: ( ( ( rule__DStringLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6421:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6421:1: ( ( rule__DStringLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6422:2: ( rule__DStringLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDStringLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6423:2: ( rule__DStringLiteral__ValueAssignment_1 )
            // InternalDmx.g:6423:3: rule__DStringLiteral__ValueAssignment_1
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
    // InternalDmx.g:6432:1: rule__DNaturalLiteral__Group__0 : rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 ;
    public final void rule__DNaturalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6436:1: ( rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1 )
            // InternalDmx.g:6437:2: rule__DNaturalLiteral__Group__0__Impl rule__DNaturalLiteral__Group__1
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
    // InternalDmx.g:6444:1: rule__DNaturalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNaturalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6448:1: ( ( () ) )
            // InternalDmx.g:6449:1: ( () )
            {
            // InternalDmx.g:6449:1: ( () )
            // InternalDmx.g:6450:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0()); 
            }
            // InternalDmx.g:6451:2: ()
            // InternalDmx.g:6451:3: 
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
    // InternalDmx.g:6459:1: rule__DNaturalLiteral__Group__1 : rule__DNaturalLiteral__Group__1__Impl ;
    public final void rule__DNaturalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6463:1: ( rule__DNaturalLiteral__Group__1__Impl )
            // InternalDmx.g:6464:2: rule__DNaturalLiteral__Group__1__Impl
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
    // InternalDmx.g:6470:1: rule__DNaturalLiteral__Group__1__Impl : ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DNaturalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6474:1: ( ( ( rule__DNaturalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6475:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6475:1: ( ( rule__DNaturalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6476:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6477:2: ( rule__DNaturalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6477:3: rule__DNaturalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6486:1: rule__DDecimalLiteral__Group__0 : rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 ;
    public final void rule__DDecimalLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6490:1: ( rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1 )
            // InternalDmx.g:6491:2: rule__DDecimalLiteral__Group__0__Impl rule__DDecimalLiteral__Group__1
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
    // InternalDmx.g:6498:1: rule__DDecimalLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DDecimalLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6502:1: ( ( () ) )
            // InternalDmx.g:6503:1: ( () )
            {
            // InternalDmx.g:6503:1: ( () )
            // InternalDmx.g:6504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0()); 
            }
            // InternalDmx.g:6505:2: ()
            // InternalDmx.g:6505:3: 
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
    // InternalDmx.g:6513:1: rule__DDecimalLiteral__Group__1 : rule__DDecimalLiteral__Group__1__Impl ;
    public final void rule__DDecimalLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6517:1: ( rule__DDecimalLiteral__Group__1__Impl )
            // InternalDmx.g:6518:2: rule__DDecimalLiteral__Group__1__Impl
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
    // InternalDmx.g:6524:1: rule__DDecimalLiteral__Group__1__Impl : ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) ;
    public final void rule__DDecimalLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6528:1: ( ( ( rule__DDecimalLiteral__ValueAssignment_1 ) ) )
            // InternalDmx.g:6529:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            {
            // InternalDmx.g:6529:1: ( ( rule__DDecimalLiteral__ValueAssignment_1 ) )
            // InternalDmx.g:6530:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1()); 
            }
            // InternalDmx.g:6531:2: ( rule__DDecimalLiteral__ValueAssignment_1 )
            // InternalDmx.g:6531:3: rule__DDecimalLiteral__ValueAssignment_1
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
    // InternalDmx.g:6540:1: rule__DNilLiteral__Group__0 : rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 ;
    public final void rule__DNilLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6544:1: ( rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1 )
            // InternalDmx.g:6545:2: rule__DNilLiteral__Group__0__Impl rule__DNilLiteral__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalDmx.g:6552:1: rule__DNilLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DNilLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6556:1: ( ( () ) )
            // InternalDmx.g:6557:1: ( () )
            {
            // InternalDmx.g:6557:1: ( () )
            // InternalDmx.g:6558:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0()); 
            }
            // InternalDmx.g:6559:2: ()
            // InternalDmx.g:6559:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0()); 
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
    // InternalDmx.g:6567:1: rule__DNilLiteral__Group__1 : rule__DNilLiteral__Group__1__Impl ;
    public final void rule__DNilLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6571:1: ( rule__DNilLiteral__Group__1__Impl )
            // InternalDmx.g:6572:2: rule__DNilLiteral__Group__1__Impl
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
    // InternalDmx.g:6578:1: rule__DNilLiteral__Group__1__Impl : ( ( rule__DNilLiteral__Alternatives_1 ) ) ;
    public final void rule__DNilLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6582:1: ( ( ( rule__DNilLiteral__Alternatives_1 ) ) )
            // InternalDmx.g:6583:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            {
            // InternalDmx.g:6583:1: ( ( rule__DNilLiteral__Alternatives_1 ) )
            // InternalDmx.g:6584:2: ( rule__DNilLiteral__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDNilLiteralAccess().getAlternatives_1()); 
            }
            // InternalDmx.g:6585:2: ( rule__DNilLiteral__Alternatives_1 )
            // InternalDmx.g:6585:3: rule__DNilLiteral__Alternatives_1
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
    // InternalDmx.g:6594:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6598:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalDmx.g:6599:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDmx.g:6606:1: rule__DECIMAL__Group__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6610:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6611:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6611:1: ( RULE_NATURAL )
            // InternalDmx.g:6612:2: RULE_NATURAL
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
    // InternalDmx.g:6621:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6625:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalDmx.g:6626:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
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
    // InternalDmx.g:6633:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6637:1: ( ( '.' ) )
            // InternalDmx.g:6638:1: ( '.' )
            {
            // InternalDmx.g:6638:1: ( '.' )
            // InternalDmx.g:6639:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6648:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6652:1: ( rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3 )
            // InternalDmx.g:6653:2: rule__DECIMAL__Group__2__Impl rule__DECIMAL__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalDmx.g:6660:1: rule__DECIMAL__Group__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6664:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6665:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6665:1: ( RULE_NATURAL )
            // InternalDmx.g:6666:2: RULE_NATURAL
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
    // InternalDmx.g:6675:1: rule__DECIMAL__Group__3 : rule__DECIMAL__Group__3__Impl ;
    public final void rule__DECIMAL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6679:1: ( rule__DECIMAL__Group__3__Impl )
            // InternalDmx.g:6680:2: rule__DECIMAL__Group__3__Impl
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
    // InternalDmx.g:6686:1: rule__DECIMAL__Group__3__Impl : ( ( rule__DECIMAL__Group_3__0 )? ) ;
    public final void rule__DECIMAL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6690:1: ( ( ( rule__DECIMAL__Group_3__0 )? ) )
            // InternalDmx.g:6691:1: ( ( rule__DECIMAL__Group_3__0 )? )
            {
            // InternalDmx.g:6691:1: ( ( rule__DECIMAL__Group_3__0 )? )
            // InternalDmx.g:6692:2: ( rule__DECIMAL__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getGroup_3()); 
            }
            // InternalDmx.g:6693:2: ( rule__DECIMAL__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=35 && LA52_0<=36)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDmx.g:6693:3: rule__DECIMAL__Group_3__0
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
    // InternalDmx.g:6702:1: rule__DECIMAL__Group_3__0 : rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 ;
    public final void rule__DECIMAL__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6706:1: ( rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1 )
            // InternalDmx.g:6707:2: rule__DECIMAL__Group_3__0__Impl rule__DECIMAL__Group_3__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalDmx.g:6714:1: rule__DECIMAL__Group_3__0__Impl : ( ( rule__DECIMAL__Alternatives_3_0 ) ) ;
    public final void rule__DECIMAL__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6718:1: ( ( ( rule__DECIMAL__Alternatives_3_0 ) ) )
            // InternalDmx.g:6719:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            {
            // InternalDmx.g:6719:1: ( ( rule__DECIMAL__Alternatives_3_0 ) )
            // InternalDmx.g:6720:2: ( rule__DECIMAL__Alternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_0()); 
            }
            // InternalDmx.g:6721:2: ( rule__DECIMAL__Alternatives_3_0 )
            // InternalDmx.g:6721:3: rule__DECIMAL__Alternatives_3_0
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
    // InternalDmx.g:6729:1: rule__DECIMAL__Group_3__1 : rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 ;
    public final void rule__DECIMAL__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6733:1: ( rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2 )
            // InternalDmx.g:6734:2: rule__DECIMAL__Group_3__1__Impl rule__DECIMAL__Group_3__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalDmx.g:6741:1: rule__DECIMAL__Group_3__1__Impl : ( ( rule__DECIMAL__Alternatives_3_1 )? ) ;
    public final void rule__DECIMAL__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6745:1: ( ( ( rule__DECIMAL__Alternatives_3_1 )? ) )
            // InternalDmx.g:6746:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            {
            // InternalDmx.g:6746:1: ( ( rule__DECIMAL__Alternatives_3_1 )? )
            // InternalDmx.g:6747:2: ( rule__DECIMAL__Alternatives_3_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDECIMALAccess().getAlternatives_3_1()); 
            }
            // InternalDmx.g:6748:2: ( rule__DECIMAL__Alternatives_3_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=37 && LA53_0<=38)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDmx.g:6748:3: rule__DECIMAL__Alternatives_3_1
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
    // InternalDmx.g:6756:1: rule__DECIMAL__Group_3__2 : rule__DECIMAL__Group_3__2__Impl ;
    public final void rule__DECIMAL__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6760:1: ( rule__DECIMAL__Group_3__2__Impl )
            // InternalDmx.g:6761:2: rule__DECIMAL__Group_3__2__Impl
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
    // InternalDmx.g:6767:1: rule__DECIMAL__Group_3__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__DECIMAL__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6771:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:6772:1: ( RULE_NATURAL )
            {
            // InternalDmx.g:6772:1: ( RULE_NATURAL )
            // InternalDmx.g:6773:2: RULE_NATURAL
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
    // InternalDmx.g:6783:1: rule__DQualifiedName__Group__0 : rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1 ;
    public final void rule__DQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6787:1: ( rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1 )
            // InternalDmx.g:6788:2: rule__DQualifiedName__Group__0__Impl rule__DQualifiedName__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDmx.g:6795:1: rule__DQualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6799:1: ( ( RULE_ID ) )
            // InternalDmx.g:6800:1: ( RULE_ID )
            {
            // InternalDmx.g:6800:1: ( RULE_ID )
            // InternalDmx.g:6801:2: RULE_ID
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
    // InternalDmx.g:6810:1: rule__DQualifiedName__Group__1 : rule__DQualifiedName__Group__1__Impl ;
    public final void rule__DQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6814:1: ( rule__DQualifiedName__Group__1__Impl )
            // InternalDmx.g:6815:2: rule__DQualifiedName__Group__1__Impl
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
    // InternalDmx.g:6821:1: rule__DQualifiedName__Group__1__Impl : ( ( rule__DQualifiedName__Group_1__0 )* ) ;
    public final void rule__DQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6825:1: ( ( ( rule__DQualifiedName__Group_1__0 )* ) )
            // InternalDmx.g:6826:1: ( ( rule__DQualifiedName__Group_1__0 )* )
            {
            // InternalDmx.g:6826:1: ( ( rule__DQualifiedName__Group_1__0 )* )
            // InternalDmx.g:6827:2: ( rule__DQualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getGroup_1()); 
            }
            // InternalDmx.g:6828:2: ( rule__DQualifiedName__Group_1__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==67) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalDmx.g:6828:3: rule__DQualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DQualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalDmx.g:6837:1: rule__DQualifiedName__Group_1__0 : rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1 ;
    public final void rule__DQualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6841:1: ( rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1 )
            // InternalDmx.g:6842:2: rule__DQualifiedName__Group_1__0__Impl rule__DQualifiedName__Group_1__1
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
    // InternalDmx.g:6849:1: rule__DQualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DQualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6853:1: ( ( '.' ) )
            // InternalDmx.g:6854:1: ( '.' )
            {
            // InternalDmx.g:6854:1: ( '.' )
            // InternalDmx.g:6855:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:6864:1: rule__DQualifiedName__Group_1__1 : rule__DQualifiedName__Group_1__1__Impl ;
    public final void rule__DQualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6868:1: ( rule__DQualifiedName__Group_1__1__Impl )
            // InternalDmx.g:6869:2: rule__DQualifiedName__Group_1__1__Impl
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
    // InternalDmx.g:6875:1: rule__DQualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__DQualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6879:1: ( ( RULE_ID ) )
            // InternalDmx.g:6880:1: ( RULE_ID )
            {
            // InternalDmx.g:6880:1: ( RULE_ID )
            // InternalDmx.g:6881:2: RULE_ID
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
    // InternalDmx.g:6891:1: rule__DmxModel__TextsAssignment_1_3 : ( ruleDRichText ) ;
    public final void rule__DmxModel__TextsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6895:1: ( ( ruleDRichText ) )
            // InternalDmx.g:6896:2: ( ruleDRichText )
            {
            // InternalDmx.g:6896:2: ( ruleDRichText )
            // InternalDmx.g:6897:3: ruleDRichText
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
    // InternalDmx.g:6906:1: rule__DmxModel__ExpressionsAssignment_2_3 : ( ruleDExpression ) ;
    public final void rule__DmxModel__ExpressionsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6910:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6911:2: ( ruleDExpression )
            {
            // InternalDmx.g:6911:2: ( ruleDExpression )
            // InternalDmx.g:6912:3: ruleDExpression
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


    // $ANTLR start "rule__DRichText__SegmentsAssignment_0"
    // InternalDmx.g:6921:1: rule__DRichText__SegmentsAssignment_0 : ( ruleDTextOnly ) ;
    public final void rule__DRichText__SegmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6925:1: ( ( ruleDTextOnly ) )
            // InternalDmx.g:6926:2: ( ruleDTextOnly )
            {
            // InternalDmx.g:6926:2: ( ruleDTextOnly )
            // InternalDmx.g:6927:3: ruleDTextOnly
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDTextOnlyParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextOnly();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDTextOnlyParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_0"


    // $ANTLR start "rule__DRichText__SegmentsAssignment_1_0"
    // InternalDmx.g:6936:1: rule__DRichText__SegmentsAssignment_1_0 : ( ruleDTextStart ) ;
    public final void rule__DRichText__SegmentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6940:1: ( ( ruleDTextStart ) )
            // InternalDmx.g:6941:2: ( ruleDTextStart )
            {
            // InternalDmx.g:6941:2: ( ruleDTextStart )
            // InternalDmx.g:6942:3: ruleDTextStart
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_1_0"


    // $ANTLR start "rule__DRichText__SegmentsAssignment_1_1"
    // InternalDmx.g:6951:1: rule__DRichText__SegmentsAssignment_1_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__SegmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6955:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6956:2: ( ruleDExpression )
            {
            // InternalDmx.g:6956:2: ( ruleDExpression )
            // InternalDmx.g:6957:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_1_1"


    // $ANTLR start "rule__DRichText__SegmentsAssignment_1_2_0"
    // InternalDmx.g:6966:1: rule__DRichText__SegmentsAssignment_1_2_0 : ( ruleDTextMiddle ) ;
    public final void rule__DRichText__SegmentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6970:1: ( ( ruleDTextMiddle ) )
            // InternalDmx.g:6971:2: ( ruleDTextMiddle )
            {
            // InternalDmx.g:6971:2: ( ruleDTextMiddle )
            // InternalDmx.g:6972:3: ruleDTextMiddle
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextMiddle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_1_2_0"


    // $ANTLR start "rule__DRichText__SegmentsAssignment_1_2_1"
    // InternalDmx.g:6981:1: rule__DRichText__SegmentsAssignment_1_2_1 : ( ruleDExpression ) ;
    public final void rule__DRichText__SegmentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:6985:1: ( ( ruleDExpression ) )
            // InternalDmx.g:6986:2: ( ruleDExpression )
            {
            // InternalDmx.g:6986:2: ( ruleDExpression )
            // InternalDmx.g:6987:3: ruleDExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_1_2_1"


    // $ANTLR start "rule__DRichText__SegmentsAssignment_1_3"
    // InternalDmx.g:6996:1: rule__DRichText__SegmentsAssignment_1_3 : ( ruleDTextEnd ) ;
    public final void rule__DRichText__SegmentsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7000:1: ( ( ruleDTextEnd ) )
            // InternalDmx.g:7001:2: ( ruleDTextEnd )
            {
            // InternalDmx.g:7001:2: ( ruleDTextEnd )
            // InternalDmx.g:7002:3: ruleDTextEnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRichTextAccess().getSegmentsDTextEndParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDTextEnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDRichTextAccess().getSegmentsDTextEndParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRichText__SegmentsAssignment_1_3"


    // $ANTLR start "rule__DTextOnly__ValueAssignment"
    // InternalDmx.g:7011:1: rule__DTextOnly__ValueAssignment : ( RULE_PLAIN_TEXT_ONLY ) ;
    public final void rule__DTextOnly__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7015:1: ( ( RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:7016:2: ( RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:7016:2: ( RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:7017:3: RULE_PLAIN_TEXT_ONLY
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
    // InternalDmx.g:7026:1: rule__DTextStart__ValueAssignment : ( RULE_PLAIN_TEXT_START ) ;
    public final void rule__DTextStart__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7030:1: ( ( RULE_PLAIN_TEXT_START ) )
            // InternalDmx.g:7031:2: ( RULE_PLAIN_TEXT_START )
            {
            // InternalDmx.g:7031:2: ( RULE_PLAIN_TEXT_START )
            // InternalDmx.g:7032:3: RULE_PLAIN_TEXT_START
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
    // InternalDmx.g:7041:1: rule__DTextMiddle__ValueAssignment : ( RULE_PLAIN_TEXT_MIDDLE ) ;
    public final void rule__DTextMiddle__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7045:1: ( ( RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDmx.g:7046:2: ( RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDmx.g:7046:2: ( RULE_PLAIN_TEXT_MIDDLE )
            // InternalDmx.g:7047:3: RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDmx.g:7056:1: rule__DTextEnd__ValueAssignment : ( RULE_PLAIN_TEXT_END ) ;
    public final void rule__DTextEnd__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7060:1: ( ( RULE_PLAIN_TEXT_END ) )
            // InternalDmx.g:7061:2: ( RULE_PLAIN_TEXT_END )
            {
            // InternalDmx.g:7061:2: ( RULE_PLAIN_TEXT_END )
            // InternalDmx.g:7062:3: RULE_PLAIN_TEXT_END
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
    // InternalDmx.g:7071:1: rule__DAssignment__MemberAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DAssignment__MemberAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7075:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7076:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7076:2: ( ( RULE_ID ) )
            // InternalDmx.g:7077:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0()); 
            }
            // InternalDmx.g:7078:3: ( RULE_ID )
            // InternalDmx.g:7079:4: RULE_ID
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
    // InternalDmx.g:7090:1: rule__DAssignment__ValueAssignment_0_3 : ( ruleDAssignment ) ;
    public final void rule__DAssignment__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7094:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7095:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7095:2: ( ruleDAssignment )
            // InternalDmx.g:7096:3: ruleDAssignment
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
    // InternalDmx.g:7105:1: rule__DOrExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOr ) ;
    public final void rule__DOrExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7109:1: ( ( ruleOpOr ) )
            // InternalDmx.g:7110:2: ( ruleOpOr )
            {
            // InternalDmx.g:7110:2: ( ruleOpOr )
            // InternalDmx.g:7111:3: ruleOpOr
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
    // InternalDmx.g:7120:1: rule__DOrExpression__RightOperandAssignment_1_1 : ( ruleDAndExpression ) ;
    public final void rule__DOrExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7124:1: ( ( ruleDAndExpression ) )
            // InternalDmx.g:7125:2: ( ruleDAndExpression )
            {
            // InternalDmx.g:7125:2: ( ruleDAndExpression )
            // InternalDmx.g:7126:3: ruleDAndExpression
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
    // InternalDmx.g:7135:1: rule__DAndExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAnd ) ;
    public final void rule__DAndExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7139:1: ( ( ruleOpAnd ) )
            // InternalDmx.g:7140:2: ( ruleOpAnd )
            {
            // InternalDmx.g:7140:2: ( ruleOpAnd )
            // InternalDmx.g:7141:3: ruleOpAnd
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
    // InternalDmx.g:7150:1: rule__DAndExpression__RightOperandAssignment_1_1 : ( ruleDEqualityExpression ) ;
    public final void rule__DAndExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7154:1: ( ( ruleDEqualityExpression ) )
            // InternalDmx.g:7155:2: ( ruleDEqualityExpression )
            {
            // InternalDmx.g:7155:2: ( ruleDEqualityExpression )
            // InternalDmx.g:7156:3: ruleDEqualityExpression
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
    // InternalDmx.g:7165:1: rule__DEqualityExpression__OperatorAssignment_1_0_0_1 : ( ruleOpEquality ) ;
    public final void rule__DEqualityExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7169:1: ( ( ruleOpEquality ) )
            // InternalDmx.g:7170:2: ( ruleOpEquality )
            {
            // InternalDmx.g:7170:2: ( ruleOpEquality )
            // InternalDmx.g:7171:3: ruleOpEquality
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
    // InternalDmx.g:7180:1: rule__DEqualityExpression__RightOperandAssignment_1_1 : ( ruleDRelationalExpression ) ;
    public final void rule__DEqualityExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7184:1: ( ( ruleDRelationalExpression ) )
            // InternalDmx.g:7185:2: ( ruleDRelationalExpression )
            {
            // InternalDmx.g:7185:2: ( ruleDRelationalExpression )
            // InternalDmx.g:7186:3: ruleDRelationalExpression
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
    // InternalDmx.g:7195:1: rule__DRelationalExpression__TypeAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DRelationalExpression__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7199:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7200:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7200:2: ( ( RULE_ID ) )
            // InternalDmx.g:7201:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0()); 
            }
            // InternalDmx.g:7202:3: ( RULE_ID )
            // InternalDmx.g:7203:4: RULE_ID
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
    // InternalDmx.g:7214:1: rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1 : ( ruleOpCompare ) ;
    public final void rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7218:1: ( ( ruleOpCompare ) )
            // InternalDmx.g:7219:2: ( ruleOpCompare )
            {
            // InternalDmx.g:7219:2: ( ruleOpCompare )
            // InternalDmx.g:7220:3: ruleOpCompare
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
    // InternalDmx.g:7229:1: rule__DRelationalExpression__RightOperandAssignment_1_1_1 : ( ruleDOtherOperatorExpression ) ;
    public final void rule__DRelationalExpression__RightOperandAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7233:1: ( ( ruleDOtherOperatorExpression ) )
            // InternalDmx.g:7234:2: ( ruleDOtherOperatorExpression )
            {
            // InternalDmx.g:7234:2: ( ruleDOtherOperatorExpression )
            // InternalDmx.g:7235:3: ruleDOtherOperatorExpression
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
    // InternalDmx.g:7244:1: rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1 : ( ruleOpOther ) ;
    public final void rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7248:1: ( ( ruleOpOther ) )
            // InternalDmx.g:7249:2: ( ruleOpOther )
            {
            // InternalDmx.g:7249:2: ( ruleOpOther )
            // InternalDmx.g:7250:3: ruleOpOther
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
    // InternalDmx.g:7259:1: rule__DOtherOperatorExpression__RightOperandAssignment_1_1 : ( ruleDAdditiveExpression ) ;
    public final void rule__DOtherOperatorExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7263:1: ( ( ruleDAdditiveExpression ) )
            // InternalDmx.g:7264:2: ( ruleDAdditiveExpression )
            {
            // InternalDmx.g:7264:2: ( ruleDAdditiveExpression )
            // InternalDmx.g:7265:3: ruleDAdditiveExpression
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
    // InternalDmx.g:7274:1: rule__DAdditiveExpression__OperatorAssignment_1_0_0_1 : ( ruleOpAdd ) ;
    public final void rule__DAdditiveExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7278:1: ( ( ruleOpAdd ) )
            // InternalDmx.g:7279:2: ( ruleOpAdd )
            {
            // InternalDmx.g:7279:2: ( ruleOpAdd )
            // InternalDmx.g:7280:3: ruleOpAdd
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
    // InternalDmx.g:7289:1: rule__DAdditiveExpression__RightOperandAssignment_1_1 : ( ruleDMultiplicativeExpression ) ;
    public final void rule__DAdditiveExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7293:1: ( ( ruleDMultiplicativeExpression ) )
            // InternalDmx.g:7294:2: ( ruleDMultiplicativeExpression )
            {
            // InternalDmx.g:7294:2: ( ruleDMultiplicativeExpression )
            // InternalDmx.g:7295:3: ruleDMultiplicativeExpression
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
    // InternalDmx.g:7304:1: rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1 : ( ruleOpMulti ) ;
    public final void rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7308:1: ( ( ruleOpMulti ) )
            // InternalDmx.g:7309:2: ( ruleOpMulti )
            {
            // InternalDmx.g:7309:2: ( ruleOpMulti )
            // InternalDmx.g:7310:3: ruleOpMulti
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
    // InternalDmx.g:7319:1: rule__DMultiplicativeExpression__RightOperandAssignment_1_1 : ( ruleDUnaryOperation ) ;
    public final void rule__DMultiplicativeExpression__RightOperandAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7323:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7324:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7324:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7325:3: ruleDUnaryOperation
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
    // InternalDmx.g:7334:1: rule__DUnaryOperation__OperatorAssignment_0_1 : ( ruleOpUnary ) ;
    public final void rule__DUnaryOperation__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7338:1: ( ( ruleOpUnary ) )
            // InternalDmx.g:7339:2: ( ruleOpUnary )
            {
            // InternalDmx.g:7339:2: ( ruleOpUnary )
            // InternalDmx.g:7340:3: ruleOpUnary
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
    // InternalDmx.g:7349:1: rule__DUnaryOperation__OperandAssignment_0_2 : ( ruleDUnaryOperation ) ;
    public final void rule__DUnaryOperation__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7353:1: ( ( ruleDUnaryOperation ) )
            // InternalDmx.g:7354:2: ( ruleDUnaryOperation )
            {
            // InternalDmx.g:7354:2: ( ruleDUnaryOperation )
            // InternalDmx.g:7355:3: ruleDUnaryOperation
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
    // InternalDmx.g:7364:1: rule__DCastExpression__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCastExpression__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7368:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7369:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7369:2: ( ( RULE_ID ) )
            // InternalDmx.g:7370:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0()); 
            }
            // InternalDmx.g:7371:3: ( RULE_ID )
            // InternalDmx.g:7372:4: RULE_ID
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
    // InternalDmx.g:7383:1: rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_0_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7387:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7388:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7388:2: ( ( RULE_ID ) )
            // InternalDmx.g:7389:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0()); 
            }
            // InternalDmx.g:7390:3: ( RULE_ID )
            // InternalDmx.g:7391:4: RULE_ID
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
    // InternalDmx.g:7402:1: rule__DTypedMemberReference__ValueAssignment_1_0_1 : ( ruleDAssignment ) ;
    public final void rule__DTypedMemberReference__ValueAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7406:1: ( ( ruleDAssignment ) )
            // InternalDmx.g:7407:2: ( ruleDAssignment )
            {
            // InternalDmx.g:7407:2: ( ruleDAssignment )
            // InternalDmx.g:7408:3: ruleDAssignment
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
    // InternalDmx.g:7417:1: rule__DTypedMemberReference__MemberAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTypedMemberReference__MemberAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7421:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7422:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7422:2: ( ( RULE_ID ) )
            // InternalDmx.g:7423:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0()); 
            }
            // InternalDmx.g:7424:3: ( RULE_ID )
            // InternalDmx.g:7425:4: RULE_ID
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
    // InternalDmx.g:7436:1: rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0 : ( ( '(' ) ) ;
    public final void rule__DTypedMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7440:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7441:2: ( ( '(' ) )
            {
            // InternalDmx.g:7441:2: ( ( '(' ) )
            // InternalDmx.g:7442:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
            }
            // InternalDmx.g:7443:3: ( '(' )
            // InternalDmx.g:7444:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7455:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7459:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7460:2: ( ruleDExpression )
            {
            // InternalDmx.g:7460:2: ( ruleDExpression )
            // InternalDmx.g:7461:3: ruleDExpression
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
    // InternalDmx.g:7470:1: rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DTypedMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7474:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7475:2: ( ruleDExpression )
            {
            // InternalDmx.g:7475:2: ( ruleDExpression )
            // InternalDmx.g:7476:3: ruleDExpression
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
    // InternalDmx.g:7485:1: rule__DTypedMemberReference__BeforeAssignment_1_1_2_1 : ( ( '@before' ) ) ;
    public final void rule__DTypedMemberReference__BeforeAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7489:1: ( ( ( '@before' ) ) )
            // InternalDmx.g:7490:2: ( ( '@before' ) )
            {
            // InternalDmx.g:7490:2: ( ( '@before' ) )
            // InternalDmx.g:7491:3: ( '@before' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
            }
            // InternalDmx.g:7492:3: ( '@before' )
            // InternalDmx.g:7493:4: '@before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDTypedMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7504:1: rule__DReturnExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DReturnExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7508:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7509:2: ( ruleDExpression )
            {
            // InternalDmx.g:7509:2: ( ruleDExpression )
            // InternalDmx.g:7510:3: ruleDExpression
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
    // InternalDmx.g:7519:1: rule__DRaiseExpression__ExpressionAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DRaiseExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7523:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7524:2: ( ruleDExpression )
            {
            // InternalDmx.g:7524:2: ( ruleDExpression )
            // InternalDmx.g:7525:3: ruleDExpression
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
    // InternalDmx.g:7534:1: rule__DFunctionCall__FunctionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DFunctionCall__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7538:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7539:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7539:2: ( ( RULE_ID ) )
            // InternalDmx.g:7540:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0()); 
            }
            // InternalDmx.g:7541:3: ( RULE_ID )
            // InternalDmx.g:7542:4: RULE_ID
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
    // InternalDmx.g:7553:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7557:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7558:2: ( ruleDExpression )
            {
            // InternalDmx.g:7558:2: ( ruleDExpression )
            // InternalDmx.g:7559:3: ruleDExpression
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
    // InternalDmx.g:7568:1: rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1 : ( ruleDExpression ) ;
    public final void rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7572:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7573:2: ( ruleDExpression )
            {
            // InternalDmx.g:7573:2: ( ruleDExpression )
            // InternalDmx.g:7574:3: ruleDExpression
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
    // InternalDmx.g:7583:1: rule__DConstructorCall__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DConstructorCall__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7587:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7588:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7588:2: ( ( RULE_ID ) )
            // InternalDmx.g:7589:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0()); 
            }
            // InternalDmx.g:7590:3: ( RULE_ID )
            // InternalDmx.g:7591:4: RULE_ID
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
    // InternalDmx.g:7602:1: rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0 : ( ( '(' ) ) ;
    public final void rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7606:1: ( ( ( '(' ) ) )
            // InternalDmx.g:7607:2: ( ( '(' ) )
            {
            // InternalDmx.g:7607:2: ( ( '(' ) )
            // InternalDmx.g:7608:3: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            // InternalDmx.g:7609:3: ( '(' )
            // InternalDmx.g:7610:4: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7621:1: rule__DConstructorCall__ArgumentsAssignment_3_1_0 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7625:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7626:2: ( ruleDExpression )
            {
            // InternalDmx.g:7626:2: ( ruleDExpression )
            // InternalDmx.g:7627:3: ruleDExpression
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
    // InternalDmx.g:7636:1: rule__DConstructorCall__ArgumentsAssignment_3_1_1_1 : ( ruleDExpression ) ;
    public final void rule__DConstructorCall__ArgumentsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7640:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7641:2: ( ruleDExpression )
            {
            // InternalDmx.g:7641:2: ( ruleDExpression )
            // InternalDmx.g:7642:3: ruleDExpression
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
    // InternalDmx.g:7651:1: rule__DContextReference__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DContextReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7655:1: ( ( ( RULE_ID ) ) )
            // InternalDmx.g:7656:2: ( ( RULE_ID ) )
            {
            // InternalDmx.g:7656:2: ( ( RULE_ID ) )
            // InternalDmx.g:7657:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0()); 
            }
            // InternalDmx.g:7658:3: ( RULE_ID )
            // InternalDmx.g:7659:4: RULE_ID
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
    // InternalDmx.g:7670:1: rule__DContextReference__BeforeAssignment_2 : ( ( '@before' ) ) ;
    public final void rule__DContextReference__BeforeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7674:1: ( ( ( '@before' ) ) )
            // InternalDmx.g:7675:2: ( ( '@before' ) )
            {
            // InternalDmx.g:7675:2: ( ( '@before' ) )
            // InternalDmx.g:7676:3: ( '@before' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
            }
            // InternalDmx.g:7677:3: ( '@before' )
            // InternalDmx.g:7678:4: '@before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_2_0()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7689:1: rule__DIfExpression__IfAssignment_2 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__IfAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7693:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7694:2: ( ruleDExpression )
            {
            // InternalDmx.g:7694:2: ( ruleDExpression )
            // InternalDmx.g:7695:3: ruleDExpression
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
    // InternalDmx.g:7704:1: rule__DIfExpression__ThenAssignment_4 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7708:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7709:2: ( ruleDExpression )
            {
            // InternalDmx.g:7709:2: ( ruleDExpression )
            // InternalDmx.g:7710:3: ruleDExpression
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
    // InternalDmx.g:7719:1: rule__DIfExpression__ElseAssignment_5_1 : ( ruleDExpression ) ;
    public final void rule__DIfExpression__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7723:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7724:2: ( ruleDExpression )
            {
            // InternalDmx.g:7724:2: ( ruleDExpression )
            // InternalDmx.g:7725:3: ruleDExpression
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
    // InternalDmx.g:7734:1: rule__DForLoopExpression__DeclaredParamAssignment_0_0_2 : ( RULE_ID ) ;
    public final void rule__DForLoopExpression__DeclaredParamAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7738:1: ( ( RULE_ID ) )
            // InternalDmx.g:7739:2: ( RULE_ID )
            {
            // InternalDmx.g:7739:2: ( RULE_ID )
            // InternalDmx.g:7740:3: RULE_ID
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
    // InternalDmx.g:7749:1: rule__DForLoopExpression__ForExpressionAssignment_1 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__ForExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7753:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7754:2: ( ruleDExpression )
            {
            // InternalDmx.g:7754:2: ( ruleDExpression )
            // InternalDmx.g:7755:3: ruleDExpression
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
    // InternalDmx.g:7764:1: rule__DForLoopExpression__EachExpressionAssignment_3 : ( ruleDExpression ) ;
    public final void rule__DForLoopExpression__EachExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7768:1: ( ( ruleDExpression ) )
            // InternalDmx.g:7769:2: ( ruleDExpression )
            {
            // InternalDmx.g:7769:2: ( ruleDExpression )
            // InternalDmx.g:7770:3: ruleDExpression
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
    // InternalDmx.g:7779:1: rule__DBooleanLiteral__ValueAssignment_1_0 : ( ( 'TRUE' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7783:1: ( ( ( 'TRUE' ) ) )
            // InternalDmx.g:7784:2: ( ( 'TRUE' ) )
            {
            // InternalDmx.g:7784:2: ( ( 'TRUE' ) )
            // InternalDmx.g:7785:3: ( 'TRUE' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            // InternalDmx.g:7786:3: ( 'TRUE' )
            // InternalDmx.g:7787:4: 'TRUE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7798:1: rule__DBooleanLiteral__ValueAssignment_1_1 : ( ( 'true' ) ) ;
    public final void rule__DBooleanLiteral__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7802:1: ( ( ( 'true' ) ) )
            // InternalDmx.g:7803:2: ( ( 'true' ) )
            {
            // InternalDmx.g:7803:2: ( ( 'true' ) )
            // InternalDmx.g:7804:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            // InternalDmx.g:7805:3: ( 'true' )
            // InternalDmx.g:7806:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0()); 
            }
            match(input,79,FOLLOW_2); if (state.failed) return ;
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
    // InternalDmx.g:7817:1: rule__DStringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DStringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7821:1: ( ( RULE_STRING ) )
            // InternalDmx.g:7822:2: ( RULE_STRING )
            {
            // InternalDmx.g:7822:2: ( RULE_STRING )
            // InternalDmx.g:7823:3: RULE_STRING
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
    // InternalDmx.g:7832:1: rule__DNaturalLiteral__ValueAssignment_1 : ( RULE_NATURAL ) ;
    public final void rule__DNaturalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7836:1: ( ( RULE_NATURAL ) )
            // InternalDmx.g:7837:2: ( RULE_NATURAL )
            {
            // InternalDmx.g:7837:2: ( RULE_NATURAL )
            // InternalDmx.g:7838:3: RULE_NATURAL
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
    // InternalDmx.g:7847:1: rule__DDecimalLiteral__ValueAssignment_1 : ( ruleDECIMAL ) ;
    public final void rule__DDecimalLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDmx.g:7851:1: ( ( ruleDECIMAL ) )
            // InternalDmx.g:7852:2: ( ruleDECIMAL )
            {
            // InternalDmx.g:7852:2: ( ruleDECIMAL )
            // InternalDmx.g:7853:3: ruleDECIMAL
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

    // $ANTLR start synpred58_InternalDmx
    public final void synpred58_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2616:3: ( rule__DOrExpression__Group_1__0 )
        // InternalDmx.g:2616:3: rule__DOrExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOrExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalDmx

    // $ANTLR start synpred59_InternalDmx
    public final void synpred59_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2805:3: ( rule__DAndExpression__Group_1__0 )
        // InternalDmx.g:2805:3: rule__DAndExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAndExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalDmx

    // $ANTLR start synpred60_InternalDmx
    public final void synpred60_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2994:3: ( rule__DEqualityExpression__Group_1__0 )
        // InternalDmx.g:2994:3: rule__DEqualityExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DEqualityExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalDmx

    // $ANTLR start synpred61_InternalDmx
    public final void synpred61_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3183:3: ( rule__DRelationalExpression__Alternatives_1 )
        // InternalDmx.g:3183:3: rule__DRelationalExpression__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DRelationalExpression__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalDmx

    // $ANTLR start synpred62_InternalDmx
    public final void synpred62_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3507:3: ( rule__DOtherOperatorExpression__Group_1__0 )
        // InternalDmx.g:3507:3: rule__DOtherOperatorExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DOtherOperatorExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalDmx

    // $ANTLR start synpred63_InternalDmx
    public final void synpred63_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3696:3: ( rule__DAdditiveExpression__Group_1__0 )
        // InternalDmx.g:3696:3: rule__DAdditiveExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DAdditiveExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalDmx

    // $ANTLR start synpred64_InternalDmx
    public final void synpred64_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:3885:3: ( rule__DMultiplicativeExpression__Group_1__0 )
        // InternalDmx.g:3885:3: rule__DMultiplicativeExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DMultiplicativeExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalDmx

    // $ANTLR start synpred65_InternalDmx
    public final void synpred65_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4155:3: ( rule__DCastExpression__Group_1__0 )
        // InternalDmx.g:4155:3: rule__DCastExpression__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__DCastExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalDmx

    // $ANTLR start synpred66_InternalDmx
    public final void synpred66_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:4344:3: ( rule__DTypedMemberReference__Alternatives_1 )
        // InternalDmx.g:4344:3: rule__DTypedMemberReference__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__DTypedMemberReference__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalDmx

    // $ANTLR start synpred70_InternalDmx
    public final void synpred70_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:5019:3: ( rule__DReturnExpression__ExpressionAssignment_2 )
        // InternalDmx.g:5019:3: rule__DReturnExpression__ExpressionAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__DReturnExpression__ExpressionAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalDmx

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
    public final boolean synpred66_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalDmx_fragment(); // can never throw exception
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
    public final boolean synpred70_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalDmx_fragment(); // can never throw exception
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\12\5\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\10\5\uffff";
    static final String dfa_4s = "\1\117\5\uffff\1\115\5\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\10\1\6";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\6\4\uffff\1\1\13\uffff\2\2\2\3\2\4\2\7\1\uffff\4\1\43\uffff\1\5\1\10\4\uffff\1\11\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\2\12\10\uffff\4\12\10\uffff\1\12\6\uffff\27\12\5\uffff\1\12\1\uffff\3\12\1\13\1\uffff\4\12\1\uffff\1\12",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1395:1: rule__DPrimaryExpression__Alternatives : ( ( ruleDLiteralExpression ) | ( ruleDSelfExpression ) | ( ruleDReturnExpression ) | ( ruleDRaiseExpression ) | ( ruleDParenthesizedExpression ) | ( ruleDFunctionCall ) | ( ruleDConstructorCall ) | ( ruleDContextReference ) | ( ruleDIfExpression ) | ( ( ruleDForLoopExpression ) ) );";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\1\12\uffff";
    static final String dfa_10s = "\1\10\1\uffff\10\0\1\uffff";
    static final String dfa_11s = "\1\113\1\uffff\10\0\1\uffff";
    static final String dfa_12s = "\1\uffff\1\2\10\uffff\1\1";
    static final String dfa_13s = "\2\uffff\1\6\1\2\1\3\1\1\1\0\1\7\1\4\1\5\1\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\10\uffff\1\2\1\3\2\1\10\uffff\1\1\6\uffff\13\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1\5\uffff\1\1\1\uffff\3\1\2\uffff\4\1",
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

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 3183:2: ( rule__DRelationalExpression__Alternatives_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_6 = input.LA(1);

                         
                        int index35_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_5 = input.LA(1);

                         
                        int index35_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_3 = input.LA(1);

                         
                        int index35_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA35_4 = input.LA(1);

                         
                        int index35_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA35_8 = input.LA(1);

                         
                        int index35_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA35_9 = input.LA(1);

                         
                        int index35_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA35_7 = input.LA(1);

                         
                        int index35_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index35_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\101\uffff";
    static final String dfa_16s = "\1\34\100\uffff";
    static final String dfa_17s = "\1\4\1\uffff\2\0\75\uffff";
    static final String dfa_18s = "\1\117\1\uffff\2\0\75\uffff";
    static final String dfa_19s = "\1\uffff\1\1\32\uffff\1\2\44\uffff";
    static final String dfa_20s = "\2\uffff\1\0\1\1\75\uffff}>";
    static final String[] dfa_21s = {
            "\4\1\2\34\1\1\7\uffff\4\34\10\1\1\34\4\1\2\uffff\1\2\1\3\25\34\3\1\2\uffff\1\34\1\uffff\3\34\2\1\4\34\1\1\1\uffff\2\1",
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

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "5019:2: ( rule__DReturnExpression__ExpressionAssignment_2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalDmx()) ) {s = 1;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x70000067BFC004F0L,0x000000000000D0C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x70000067BFC00430L,0x000000000000D0C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x003F0000000C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x003F0000000C0002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0E00000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0E00000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x7000006000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x70000067BFC004F0L,0x000000000000D0D0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000180000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000780000410L,0x000000000000C000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000006000000010L});

}