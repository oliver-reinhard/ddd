package com.mimacom.ddd.dm.dmx.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.mimacom.ddd.dm.dmx.services.DmxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDmxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_ID", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'text'", "':'", "';'", "'expr'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'.'", "'('", "','", "')'", "'@before'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'['", "'#'", "'|'", "'*'", "']'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'..'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=5;
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
    public static final int T__80=80;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_PLAIN_TEXT_MIDDLE=7;
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

        public InternalDmxParser(TokenStream input, DmxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DmxModel";
       	}

       	@Override
       	protected DmxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDmxModel"
    // InternalDmx.g:65:1: entryRuleDmxModel returns [EObject current=null] : iv_ruleDmxModel= ruleDmxModel EOF ;
    public final EObject entryRuleDmxModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxModel = null;


        try {
            // InternalDmx.g:65:49: (iv_ruleDmxModel= ruleDmxModel EOF )
            // InternalDmx.g:66:2: iv_ruleDmxModel= ruleDmxModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxModel=ruleDmxModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDmxModel"


    // $ANTLR start "ruleDmxModel"
    // InternalDmx.g:72:1: ruleDmxModel returns [EObject current=null] : ( () (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )* (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )* ) ;
    public final EObject ruleDmxModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NATURAL_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_NATURAL_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_texts_4_0 = null;

        EObject lv_expressions_9_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:78:2: ( ( () (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )* (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )* ) )
            // InternalDmx.g:79:2: ( () (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )* (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )* )
            {
            // InternalDmx.g:79:2: ( () (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )* (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )* )
            // InternalDmx.g:80:3: () (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )* (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )*
            {
            // InternalDmx.g:80:3: ()
            // InternalDmx.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxModelAccess().getDmxModelAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:87:3: (otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDmx.g:88:4: otherlv_1= 'text' this_NATURAL_2= RULE_NATURAL otherlv_3= ':' ( (lv_texts_4_0= ruleDRichText ) ) otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDmxModelAccess().getTextKeyword_1_0());
            	      			
            	    }
            	    this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_NATURAL_2, grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_1_1());
            	      			
            	    }
            	    otherlv_3=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDmxModelAccess().getColonKeyword_1_2());
            	      			
            	    }
            	    // InternalDmx.g:100:4: ( (lv_texts_4_0= ruleDRichText ) )
            	    // InternalDmx.g:101:5: (lv_texts_4_0= ruleDRichText )
            	    {
            	    // InternalDmx.g:101:5: (lv_texts_4_0= ruleDRichText )
            	    // InternalDmx.g:102:6: lv_texts_4_0= ruleDRichText
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxModelAccess().getTextsDRichTextParserRuleCall_1_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_texts_4_0=ruleDRichText();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"texts",
            	      							lv_texts_4_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getDmxModelAccess().getSemicolonKeyword_1_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDmx.g:124:3: (otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDmx.g:125:4: otherlv_6= 'expr' this_NATURAL_7= RULE_NATURAL otherlv_8= ':' ( (lv_expressions_9_0= ruleDExpression ) ) otherlv_10= ';'
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getDmxModelAccess().getExprKeyword_2_0());
            	      			
            	    }
            	    this_NATURAL_7=(Token)match(input,RULE_NATURAL,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_NATURAL_7, grammarAccess.getDmxModelAccess().getNATURALTerminalRuleCall_2_1());
            	      			
            	    }
            	    otherlv_8=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getDmxModelAccess().getColonKeyword_2_2());
            	      			
            	    }
            	    // InternalDmx.g:137:4: ( (lv_expressions_9_0= ruleDExpression ) )
            	    // InternalDmx.g:138:5: (lv_expressions_9_0= ruleDExpression )
            	    {
            	    // InternalDmx.g:138:5: (lv_expressions_9_0= ruleDExpression )
            	    // InternalDmx.g:139:6: lv_expressions_9_0= ruleDExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxModelAccess().getExpressionsDExpressionParserRuleCall_2_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_expressions_9_0=ruleDExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expressions",
            	      							lv_expressions_9_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_10, grammarAccess.getDmxModelAccess().getSemicolonKeyword_2_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDmxModel"


    // $ANTLR start "entryRuleDExpression"
    // InternalDmx.g:165:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDmx.g:165:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDmx.g:166:2: iv_ruleDExpression= ruleDExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDExpression=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDExpression"


    // $ANTLR start "ruleDExpression"
    // InternalDmx.g:172:1: ruleDExpression returns [EObject current=null] : (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;

        EObject this_DRichText_1 = null;



        	enterRule();

        try {
            // InternalDmx.g:178:2: ( (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText ) )
            // InternalDmx.g:179:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            {
            // InternalDmx.g:179:2: (this_DAssignment_0= ruleDAssignment | this_DRichText_1= ruleDRichText )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NATURAL||(LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==27||(LA3_0>=31 && LA3_0<=39)||LA3_0==44||LA3_0==48||(LA3_0>=50 && LA3_0<=55)||(LA3_0>=58 && LA3_0<=59)||(LA3_0>=81 && LA3_0<=83)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_PLAIN_TEXT_START)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDmx.g:180:3: this_DAssignment_0= ruleDAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAssignment_0=ruleDAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:189:3: this_DRichText_1= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRichText_1=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRichText_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDExpression"


    // $ANTLR start "entryRuleDRichText"
    // InternalDmx.g:201:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDmx.g:201:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDmx.g:202:2: iv_ruleDRichText= ruleDRichText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRichTextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRichText=ruleDRichText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRichText; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDRichText"


    // $ANTLR start "ruleDRichText"
    // InternalDmx.g:208:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) ;
    public final EObject ruleDRichText() throws RecognitionException {
        EObject current = null;

        EObject lv_segments_0_0 = null;

        EObject lv_segments_1_0 = null;

        EObject lv_segments_2_0 = null;

        EObject lv_segments_3_0 = null;

        EObject lv_segments_4_0 = null;

        EObject lv_segments_5_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:214:2: ( ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDmx.g:215:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDmx.g:215:2: ( ( (lv_segments_0_0= ruleDTextOnly ) ) | ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_PLAIN_TEXT_START) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDmx.g:216:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    {
                    // InternalDmx.g:216:3: ( (lv_segments_0_0= ruleDTextOnly ) )
                    // InternalDmx.g:217:4: (lv_segments_0_0= ruleDTextOnly )
                    {
                    // InternalDmx.g:217:4: (lv_segments_0_0= ruleDTextOnly )
                    // InternalDmx.g:218:5: lv_segments_0_0= ruleDTextOnly
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextOnlyParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_0_0=ruleDTextOnly();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      					}
                      					add(
                      						current,
                      						"segments",
                      						lv_segments_0_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DTextOnly");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:236:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDmx.g:236:3: ( ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) ) )
                    // InternalDmx.g:237:4: ( (lv_segments_1_0= ruleDTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDTextEnd ) )
                    {
                    // InternalDmx.g:237:4: ( (lv_segments_1_0= ruleDTextStart ) )
                    // InternalDmx.g:238:5: (lv_segments_1_0= ruleDTextStart )
                    {
                    // InternalDmx.g:238:5: (lv_segments_1_0= ruleDTextStart )
                    // InternalDmx.g:239:6: lv_segments_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_segments_1_0=ruleDTextStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"segments",
                      							lv_segments_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextStart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:256:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDmx.g:257:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDmx.g:257:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDmx.g:258:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_segments_2_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"segments",
                      							lv_segments_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:275:4: ( ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDmx.g:276:5: ( (lv_segments_3_0= ruleDTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDmx.g:276:5: ( (lv_segments_3_0= ruleDTextMiddle ) )
                    	    // InternalDmx.g:277:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDmx.g:277:6: (lv_segments_3_0= ruleDTextMiddle )
                    	    // InternalDmx.g:278:7: lv_segments_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_segments_3_0=ruleDTextMiddle();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"segments",
                    	      								lv_segments_3_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DTextMiddle");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalDmx.g:295:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDmx.g:296:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDmx.g:296:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDmx.g:297:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_segments_4_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"segments",
                    	      								lv_segments_4_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalDmx.g:315:4: ( (lv_segments_5_0= ruleDTextEnd ) )
                    // InternalDmx.g:316:5: (lv_segments_5_0= ruleDTextEnd )
                    {
                    // InternalDmx.g:316:5: (lv_segments_5_0= ruleDTextEnd )
                    // InternalDmx.g:317:6: lv_segments_5_0= ruleDTextEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDTextEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_5_0=ruleDTextEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"segments",
                      							lv_segments_5_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextEnd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDRichText"


    // $ANTLR start "entryRuleDTextOnly"
    // InternalDmx.g:339:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDmx.g:339:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDmx.g:340:2: iv_ruleDTextOnly= ruleDTextOnly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextOnlyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextOnly=ruleDTextOnly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextOnly; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTextOnly"


    // $ANTLR start "ruleDTextOnly"
    // InternalDmx.g:346:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:352:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDmx.g:353:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDmx.g:353:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDmx.g:354:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDmx.g:354:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDmx.g:355:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_ONLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextOnlyAccess().getValuePLAIN_TEXT_ONLYTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextOnlyRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_ONLY");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTextOnly"


    // $ANTLR start "entryRuleDTextStart"
    // InternalDmx.g:374:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDmx.g:374:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDmx.g:375:2: iv_ruleDTextStart= ruleDTextStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextStart=ruleDTextStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextStart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTextStart"


    // $ANTLR start "ruleDTextStart"
    // InternalDmx.g:381:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:387:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDmx.g:388:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDmx.g:388:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDmx.g:389:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDmx.g:389:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDmx.g:390:4: lv_value_0_0= RULE_PLAIN_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_START,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextStartAccess().getValuePLAIN_TEXT_STARTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextStartRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_START");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTextStart"


    // $ANTLR start "entryRuleDTextMiddle"
    // InternalDmx.g:409:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDmx.g:409:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDmx.g:410:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextMiddleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextMiddle=ruleDTextMiddle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextMiddle; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTextMiddle"


    // $ANTLR start "ruleDTextMiddle"
    // InternalDmx.g:416:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:422:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDmx.g:423:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDmx.g:423:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDmx.g:424:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDmx.g:424:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDmx.g:425:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_MIDDLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextMiddleAccess().getValuePLAIN_TEXT_MIDDLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextMiddleRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_MIDDLE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTextMiddle"


    // $ANTLR start "entryRuleDTextEnd"
    // InternalDmx.g:444:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDmx.g:444:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDmx.g:445:2: iv_ruleDTextEnd= ruleDTextEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTextEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTextEnd=ruleDTextEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTextEnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTextEnd"


    // $ANTLR start "ruleDTextEnd"
    // InternalDmx.g:451:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDmx.g:457:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDmx.g:458:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDmx.g:458:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDmx.g:459:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDmx.g:459:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDmx.g:460:4: lv_value_0_0= RULE_PLAIN_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDTextEndAccess().getValuePLAIN_TEXT_ENDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDTextEndRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.PLAIN_TEXT_END");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTextEnd"


    // $ANTLR start "entryRuleDAssignment"
    // InternalDmx.g:479:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDmx.g:479:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDmx.g:480:2: iv_ruleDAssignment= ruleDAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAssignment=ruleDAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDAssignment"


    // $ANTLR start "ruleDAssignment"
    // InternalDmx.g:486:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDmx.g:492:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDmx.g:493:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDmx.g:493:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_PLAIN_TEXT_MIDDLE && LA6_1<=RULE_PLAIN_TEXT_END)||LA6_1==19||(LA6_1>=22 && LA6_1<=30)||LA6_1==42||(LA6_1>=45 && LA6_1<=47)||LA6_1==49||(LA6_1>=58 && LA6_1<=80)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==21) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_NATURAL||LA6_0==RULE_STRING||LA6_0==27||(LA6_0>=31 && LA6_0<=39)||LA6_0==44||LA6_0==48||(LA6_0>=50 && LA6_0<=55)||(LA6_0>=58 && LA6_0<=59)||(LA6_0>=81 && LA6_0<=83)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDmx.g:494:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDmx.g:494:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDmx.g:495:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDmx.g:495:4: ()
                    // InternalDmx.g:496:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDmx.g:502:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDmx.g:503:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDmx.g:503:5: (otherlv_1= RULE_ID )
                    // InternalDmx.g:504:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDNavigableMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDmx.g:522:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDmx.g:523:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDmx.g:523:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDmx.g:524:6: lv_value_3_0= ruleDAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssignmentAccess().getValueDAssignmentParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleDAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:543:3: this_DOrExpression_4= ruleDOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDAssignmentAccess().getDOrExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DOrExpression_4=ruleDOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DOrExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // InternalDmx.g:555:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDmx.g:555:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDmx.g:556:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // InternalDmx.g:562:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:568:2: (kw= ':=' )
            // InternalDmx.g:569:2: kw= ':='
            {
            kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getColonEqualsSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleDOrExpression"
    // InternalDmx.g:577:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDmx.g:577:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDmx.g:578:2: iv_ruleDOrExpression= ruleDOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOrExpression=ruleDOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOrExpression"


    // $ANTLR start "ruleDOrExpression"
    // InternalDmx.g:584:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:590:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDmx.g:591:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDmx.g:591:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDmx.g:592:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:600:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case 60:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred1_InternalDmx()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 61:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred1_InternalDmx()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred1_InternalDmx()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 63:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (synpred1_InternalDmx()) ) {
                        alt7=1;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalDmx.g:601:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDmx.g:601:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDmx.g:602:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDmx.g:612:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDmx.g:613:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDmx.g:613:6: ()
            	    // InternalDmx.g:614:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:620:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDmx.g:621:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDmx.g:621:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDmx.g:622:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDOrExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpOr");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:641:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDmx.g:642:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDmx.g:642:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDmx.g:643:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_rightOperand_3_0=ruleDAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOrExpression"


    // $ANTLR start "entryRuleDAndExpression"
    // InternalDmx.g:665:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDmx.g:665:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDmx.g:666:2: iv_ruleDAndExpression= ruleDAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAndExpression=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDAndExpression"


    // $ANTLR start "ruleDAndExpression"
    // InternalDmx.g:672:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:678:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDmx.g:679:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDmx.g:679:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDmx.g:680:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:688:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==64) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred2_InternalDmx()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==65) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred2_InternalDmx()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalDmx.g:689:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDmx.g:689:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDmx.g:690:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDmx.g:700:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDmx.g:701:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDmx.g:701:6: ()
            	    // InternalDmx.g:702:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:708:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDmx.g:709:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDmx.g:709:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDmx.g:710:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDAndExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpAnd");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:729:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDmx.g:730:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDmx.g:730:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDmx.g:731:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rightOperand_3_0=ruleDEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAndExpression"


    // $ANTLR start "entryRuleDEqualityExpression"
    // InternalDmx.g:753:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDmx.g:753:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDmx.g:754:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEqualityExpression=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEqualityExpression"


    // $ANTLR start "ruleDEqualityExpression"
    // InternalDmx.g:760:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:766:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDmx.g:767:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDmx.g:767:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDmx.g:768:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:776:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 66:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred3_InternalDmx()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 67:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred3_InternalDmx()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred3_InternalDmx()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalDmx.g:777:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDmx.g:777:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDmx.g:778:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDmx.g:788:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDmx.g:789:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDmx.g:789:6: ()
            	    // InternalDmx.g:790:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:796:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDmx.g:797:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDmx.g:797:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDmx.g:798:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDEqualityExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpEquality");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:817:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDmx.g:818:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDmx.g:818:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDmx.g:819:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_rightOperand_3_0=ruleDRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DRelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEqualityExpression"


    // $ANTLR start "entryRuleDRelationalExpression"
    // InternalDmx.g:841:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDmx.g:841:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDmx.g:842:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRelationalExpression=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDRelationalExpression"


    // $ANTLR start "ruleDRelationalExpression"
    // InternalDmx.g:848:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:854:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDmx.g:855:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDmx.g:855:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDmx.g:856:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:864:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalDmx.g:865:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDmx.g:865:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDmx.g:866:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDmx.g:866:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDmx.g:867:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDmx.g:873:6: ( () ruleOpInstanceOf )
            	    // InternalDmx.g:874:7: () ruleOpInstanceOf
            	    {
            	    // InternalDmx.g:874:7: ()
            	    // InternalDmx.g:875:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOpInstanceOfParserRuleCall_1_0_0_0_1());
            	      						
            	    }
            	    pushFollow(FOLLOW_17);
            	    ruleOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:890:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDmx.g:891:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDmx.g:891:6: (otherlv_3= RULE_ID )
            	    // InternalDmx.g:892:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDmx.g:905:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDmx.g:905:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDmx.g:906:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDmx.g:906:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDmx.g:907:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDmx.g:917:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDmx.g:918:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDmx.g:918:7: ()
            	    // InternalDmx.g:919:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDmx.g:925:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDmx.g:926:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDmx.g:926:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDmx.g:927:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_5_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getDRelationalExpressionRule());
            	      									}
            	      									set(
            	      										current,
            	      										"operator",
            	      										lv_operator_5_0,
            	      										"com.mimacom.ddd.dm.dmx.Dmx.OpCompare");
            	      									afterParserOrEnumRuleCall();
            	      								
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:946:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDmx.g:947:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDmx.g:947:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDmx.g:948:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_rightOperand_6_0=ruleDOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightOperand",
            	      								lv_rightOperand_6_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DOtherOperatorExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDRelationalExpression"


    // $ANTLR start "entryRuleOpInstanceOf"
    // InternalDmx.g:971:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDmx.g:971:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDmx.g:972:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpInstanceOfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpInstanceOf=ruleOpInstanceOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpInstanceOf.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpInstanceOf"


    // $ANTLR start "ruleOpInstanceOf"
    // InternalDmx.g:978:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:984:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDmx.g:985:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDmx.g:985:2: (kw= 'ISA' | kw= 'isa' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDmx.g:986:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:992:3: kw= 'isa'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getIsaKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpInstanceOf"


    // $ANTLR start "entryRuleDOtherOperatorExpression"
    // InternalDmx.g:1001:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDmx.g:1001:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDmx.g:1002:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOtherOperatorExpression=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOtherOperatorExpression"


    // $ANTLR start "ruleDOtherOperatorExpression"
    // InternalDmx.g:1008:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1014:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDmx.g:1015:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDmx.g:1015:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDmx.g:1016:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1024:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 75:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 77:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred6_InternalDmx()) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalDmx.g:1025:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDmx.g:1025:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDmx.g:1026:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDmx.g:1036:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDmx.g:1037:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDmx.g:1037:6: ()
            	    // InternalDmx.g:1038:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1044:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDmx.g:1045:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDmx.g:1045:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDmx.g:1046:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDOtherOperatorExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpOther");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:1065:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDmx.g:1066:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDmx.g:1066:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDmx.g:1067:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_rightOperand_3_0=ruleDAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDOtherOperatorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOtherOperatorExpression"


    // $ANTLR start "entryRuleDAdditiveExpression"
    // InternalDmx.g:1089:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDmx.g:1089:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDmx.g:1090:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAdditiveExpression=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDAdditiveExpression"


    // $ANTLR start "ruleDAdditiveExpression"
    // InternalDmx.g:1096:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1102:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDmx.g:1103:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDmx.g:1103:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDmx.g:1104:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1112:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==58) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred7_InternalDmx()) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==59) ) {
                    int LA13_3 = input.LA(2);

                    if ( (synpred7_InternalDmx()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalDmx.g:1113:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDmx.g:1113:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDmx.g:1114:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDmx.g:1124:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDmx.g:1125:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDmx.g:1125:6: ()
            	    // InternalDmx.g:1126:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1132:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDmx.g:1133:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDmx.g:1133:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDmx.g:1134:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDAdditiveExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpAdd");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:1153:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDmx.g:1154:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDmx.g:1154:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDmx.g:1155:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_rightOperand_3_0=ruleDMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAdditiveExpression"


    // $ANTLR start "entryRuleDMultiplicativeExpression"
    // InternalDmx.g:1177:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDmx.g:1177:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDmx.g:1178:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDMultiplicativeExpression=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDMultiplicativeExpression"


    // $ANTLR start "ruleDMultiplicativeExpression"
    // InternalDmx.g:1184:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1190:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDmx.g:1191:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDmx.g:1191:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDmx.g:1192:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1200:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred8_InternalDmx()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 78:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred8_InternalDmx()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 79:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred8_InternalDmx()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 80:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred8_InternalDmx()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalDmx.g:1201:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDmx.g:1201:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDmx.g:1202:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDmx.g:1212:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDmx.g:1213:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDmx.g:1213:6: ()
            	    // InternalDmx.g:1214:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDmx.g:1220:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDmx.g:1221:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDmx.g:1221:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDmx.g:1222:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_operator_2_0=ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDMultiplicativeExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.OpMulti");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDmx.g:1241:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDmx.g:1242:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDmx.g:1242:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDmx.g:1243:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_rightOperand_3_0=ruleDUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DUnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDMultiplicativeExpression"


    // $ANTLR start "entryRuleDUnaryOperation"
    // InternalDmx.g:1265:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDmx.g:1265:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDmx.g:1266:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDUnaryOperation=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDUnaryOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDUnaryOperation"


    // $ANTLR start "ruleDUnaryOperation"
    // InternalDmx.g:1272:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDmx.g:1278:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDmx.g:1279:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDmx.g:1279:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=58 && LA15_0<=59)||(LA15_0>=81 && LA15_0<=83)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_NATURAL||(LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==27||(LA15_0>=31 && LA15_0<=39)||LA15_0==44||LA15_0==48||(LA15_0>=50 && LA15_0<=55)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDmx.g:1280:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDmx.g:1280:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDmx.g:1281:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDmx.g:1281:4: ()
                    // InternalDmx.g:1282:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDmx.g:1288:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDmx.g:1289:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDmx.g:1289:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDmx.g:1290:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_operator_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.OpUnary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:1307:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDmx.g:1308:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDmx.g:1308:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDmx.g:1309:6: lv_operand_2_0= ruleDUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperandDUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleDUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DUnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:1328:3: this_DCastExpression_3= ruleDCastExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDUnaryOperationAccess().getDCastExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DCastExpression_3=ruleDCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DCastExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDUnaryOperation"


    // $ANTLR start "entryRuleDCastExpression"
    // InternalDmx.g:1340:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDmx.g:1340:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDmx.g:1341:2: iv_ruleDCastExpression= ruleDCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDCastExpression=ruleDCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCastExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDCastExpression"


    // $ANTLR start "ruleDCastExpression"
    // InternalDmx.g:1347:1: ruleDCastExpression returns [EObject current=null] : (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1353:2: ( (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDmx.g:1354:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDmx.g:1354:2: (this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDmx.g:1355:3: this_DNavigableMemberReference_0= ruleDNavigableMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_DNavigableMemberReference_0=ruleDNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1363:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred9_InternalDmx()) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==25) ) {
                int LA16_2 = input.LA(2);

                if ( (synpred9_InternalDmx()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalDmx.g:1364:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDmx.g:1364:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDmx.g:1365:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDmx.g:1371:5: ( () ruleOpCast )
                    // InternalDmx.g:1372:6: () ruleOpCast
                    {
                    // InternalDmx.g:1372:6: ()
                    // InternalDmx.g:1373:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getDCastExpressionAccess().getDCastExpressionTargetAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDCastExpressionAccess().getOpCastParserRuleCall_1_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    ruleOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:1388:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDmx.g:1389:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDmx.g:1389:5: (otherlv_3= RULE_ID )
                    // InternalDmx.g:1390:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCastExpressionRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getDCastExpressionAccess().getTypeDTypeCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDCastExpression"


    // $ANTLR start "entryRuleOpCast"
    // InternalDmx.g:1406:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDmx.g:1406:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDmx.g:1407:2: iv_ruleOpCast= ruleOpCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCast=ruleOpCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCast.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCast"


    // $ANTLR start "ruleOpCast"
    // InternalDmx.g:1413:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:1419:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDmx.g:1420:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDmx.g:1420:2: (kw= 'AS' | kw= 'as' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDmx.g:1421:3: kw= 'AS'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1427:3: kw= 'as'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getAsKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCast"


    // $ANTLR start "entryRuleDNavigableMemberReference"
    // InternalDmx.g:1436:1: entryRuleDNavigableMemberReference returns [EObject current=null] : iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF ;
    public final EObject entryRuleDNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNavigableMemberReference = null;


        try {
            // InternalDmx.g:1436:66: (iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF )
            // InternalDmx.g:1437:2: iv_ruleDNavigableMemberReference= ruleDNavigableMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNavigableMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNavigableMemberReference=ruleDNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNavigableMemberReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNavigableMemberReference"


    // $ANTLR start "ruleDNavigableMemberReference"
    // InternalDmx.g:1443:1: ruleDNavigableMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) ;
    public final EObject ruleDNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_before_14_0=null;
        EObject this_DPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_memberCallArguments_10_0 = null;

        EObject lv_memberCallArguments_12_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1449:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* ) )
            // InternalDmx.g:1450:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            {
            // InternalDmx.g:1450:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )* )
            // InternalDmx.g:1451:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:1459:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? ) )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred10_InternalDmx()) ) {
                        alt21=1;
                    }
                    else if ( (synpred11_InternalDmx()) ) {
                        alt21=2;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalDmx.g:1460:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDmx.g:1460:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDmx.g:1461:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDmx.g:1461:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDmx.g:1462:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDmx.g:1474:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDmx.g:1475:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDmx.g:1475:7: ()
            	    // InternalDmx.g:1476:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDmx.g:1486:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDmx.g:1487:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDmx.g:1487:8: (otherlv_3= RULE_ID )
            	    // InternalDmx.g:1488:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_12);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1508:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDmx.g:1509:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDmx.g:1509:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDmx.g:1510:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_value_5_0=ruleDAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
            	      							}
            	      							set(
            	      								current,
            	      								"value",
            	      								lv_value_5_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DAssignment");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDmx.g:1529:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    {
            	    // InternalDmx.g:1529:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )? )
            	    // InternalDmx.g:1530:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    {
            	    // InternalDmx.g:1530:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDmx.g:1531:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDmx.g:1537:6: ( () otherlv_7= '.' )
            	    // InternalDmx.g:1538:7: () otherlv_7= '.'
            	    {
            	    // InternalDmx.g:1538:7: ()
            	    // InternalDmx.g:1539:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDNavigableMemberReferenceAccess().getDNavigableMemberReferenceMemberContainerReferenceAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1551:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDmx.g:1552:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDmx.g:1552:6: (otherlv_8= RULE_ID )
            	    // InternalDmx.g:1553:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDmx.g:1564:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' ) | ( (lv_before_14_0= '@before' ) ) )?
            	    int alt20=3;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==27) && (synpred12_InternalDmx())) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==30) ) {
            	        alt20=2;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDmx.g:1565:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            {
            	            // InternalDmx.g:1565:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )
            	            // InternalDmx.g:1566:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDmx.g:1566:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDmx.g:1567:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDmx.g:1571:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDmx.g:1572:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDNavigableMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	              									}
            	              									setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              								
            	            }

            	            }


            	            }

            	            // InternalDmx.g:1584:7: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( ((LA19_0>=RULE_NATURAL && LA19_0<=RULE_PLAIN_TEXT_START)||(LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==27||(LA19_0>=31 && LA19_0<=39)||LA19_0==44||LA19_0==48||(LA19_0>=50 && LA19_0<=55)||(LA19_0>=58 && LA19_0<=59)||(LA19_0>=81 && LA19_0<=83)) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // InternalDmx.g:1585:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDmx.g:1585:8: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDmx.g:1586:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDmx.g:1586:9: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDmx.g:1587:10: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      										newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_0_0());
            	                      									
            	                    }
            	                    pushFollow(FOLLOW_25);
            	                    lv_memberCallArguments_10_0=ruleDExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      										if (current==null) {
            	                      											current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
            	                      										}
            	                      										add(
            	                      											current,
            	                      											"memberCallArguments",
            	                      											lv_memberCallArguments_10_0,
            	                      											"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	                      										afterParserOrEnumRuleCall();
            	                      									
            	                    }

            	                    }


            	                    }

            	                    // InternalDmx.g:1604:8: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop18:
            	                    do {
            	                        int alt18=2;
            	                        int LA18_0 = input.LA(1);

            	                        if ( (LA18_0==28) ) {
            	                            alt18=1;
            	                        }


            	                        switch (alt18) {
            	                    	case 1 :
            	                    	    // InternalDmx.g:1605:9: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newLeafNode(otherlv_11, grammarAccess.getDNavigableMemberReferenceAccess().getCommaKeyword_1_1_2_0_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    // InternalDmx.g:1609:9: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDmx.g:1610:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDmx.g:1610:10: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDmx.g:1611:11: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											newCompositeNode(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_0_1_1_1_0());
            	                    	      										
            	                    	    }
            	                    	    pushFollow(FOLLOW_25);
            	                    	    lv_memberCallArguments_12_0=ruleDExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      											if (current==null) {
            	                    	      												current = createModelElementForParent(grammarAccess.getDNavigableMemberReferenceRule());
            	                    	      											}
            	                    	      											add(
            	                    	      												current,
            	                    	      												"memberCallArguments",
            	                    	      												lv_memberCallArguments_12_0,
            	                    	      												"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
            	                    	      											afterParserOrEnumRuleCall();
            	                    	      										
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop18;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,29,FOLLOW_22); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_13, grammarAccess.getDNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDmx.g:1636:6: ( (lv_before_14_0= '@before' ) )
            	            {
            	            // InternalDmx.g:1636:6: ( (lv_before_14_0= '@before' ) )
            	            // InternalDmx.g:1637:7: (lv_before_14_0= '@before' )
            	            {
            	            // InternalDmx.g:1637:7: (lv_before_14_0= '@before' )
            	            // InternalDmx.g:1638:8: lv_before_14_0= '@before'
            	            {
            	            lv_before_14_0=(Token)match(input,30,FOLLOW_22); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_before_14_0, grammarAccess.getDNavigableMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDNavigableMemberReferenceRule());
            	              								}
            	              								setWithLastConsumed(current, "before", true, "@before");
            	              							
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNavigableMemberReference"


    // $ANTLR start "entryRuleDPrimaryExpression"
    // InternalDmx.g:1657:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDmx.g:1657:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDmx.g:1658:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimaryExpression=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDPrimaryExpression"


    // $ANTLR start "ruleDPrimaryExpression"
    // InternalDmx.g:1664:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
    public final EObject ruleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DLiteralExpression_0 = null;

        EObject this_DSelfExpression_1 = null;

        EObject this_DReturnExpression_2 = null;

        EObject this_DRaiseExpression_3 = null;

        EObject this_DParenthesizedExpression_4 = null;

        EObject this_DFunctionCall_5 = null;

        EObject this_DConstructorCall_6 = null;

        EObject this_DContextReference_7 = null;

        EObject this_DIfExpression_8 = null;

        EObject this_DForLoopExpression_9 = null;



        	enterRule();

        try {
            // InternalDmx.g:1670:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDmx.g:1671:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDmx.g:1671:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt22=10;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalDmx.g:1672:3: this_DLiteralExpression_0= ruleDLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DLiteralExpression_0=ruleDLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1681:3: this_DSelfExpression_1= ruleDSelfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDSelfExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DSelfExpression_1=ruleDSelfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DSelfExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDmx.g:1690:3: this_DReturnExpression_2= ruleDReturnExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDReturnExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DReturnExpression_2=ruleDReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DReturnExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDmx.g:1699:3: this_DRaiseExpression_3= ruleDRaiseExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDRaiseExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRaiseExpression_3=ruleDRaiseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRaiseExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDmx.g:1708:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDParenthesizedExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DParenthesizedExpression_4=ruleDParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DParenthesizedExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDmx.g:1717:3: this_DFunctionCall_5= ruleDFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDFunctionCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DFunctionCall_5=ruleDFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DFunctionCall_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDmx.g:1726:3: this_DConstructorCall_6= ruleDConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDConstructorCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DConstructorCall_6=ruleDConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DConstructorCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDmx.g:1735:3: this_DContextReference_7= ruleDContextReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDContextReferenceParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DContextReference_7=ruleDContextReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DContextReference_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalDmx.g:1744:3: this_DIfExpression_8= ruleDIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDIfExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DIfExpression_8=ruleDIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DIfExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalDmx.g:1753:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDmx.g:1753:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDmx.g:1754:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDPrimaryExpressionAccess().getDForLoopExpressionParserRuleCall_9());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_DForLoopExpression_9=ruleDForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_DForLoopExpression_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDPrimaryExpression"


    // $ANTLR start "entryRuleDLiteralExpression"
    // InternalDmx.g:1779:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDmx.g:1779:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDmx.g:1780:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDLiteralExpression=ruleDLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDLiteralExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDLiteralExpression"


    // $ANTLR start "ruleDLiteralExpression"
    // InternalDmx.g:1786:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDmx.g:1792:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDmx.g:1793:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDmx.g:1793:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA23_3 = input.LA(2);

                if ( (LA23_3==26) ) {
                    int LA23_5 = input.LA(3);

                    if ( (LA23_5==RULE_NATURAL) ) {
                        alt23=4;
                    }
                    else if ( (LA23_5==RULE_ID) ) {
                        alt23=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_3==EOF||(LA23_3>=RULE_PLAIN_TEXT_MIDDLE && LA23_3<=RULE_PLAIN_TEXT_END)||LA23_3==19||(LA23_3>=22 && LA23_3<=25)||(LA23_3>=28 && LA23_3<=29)||LA23_3==42||(LA23_3>=45 && LA23_3<=47)||LA23_3==49||(LA23_3>=58 && LA23_3<=80)) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 3, input);

                    throw nvae;
                }
                }
                break;
            case 54:
            case 55:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDmx.g:1794:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDBooleanLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DBooleanLiteral_0=ruleDBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DBooleanLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1803:3: this_DStringLiteral_1= ruleDStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDStringLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DStringLiteral_1=ruleDStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DStringLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDmx.g:1812:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDNaturalLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DNaturalLiteral_2=ruleDNaturalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DNaturalLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDmx.g:1821:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDDecimalLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDecimalLiteral_3=ruleDDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDecimalLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDmx.g:1830:3: this_DNilLiteral_4= ruleDNilLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDLiteralExpressionAccess().getDNilLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DNilLiteral_4=ruleDNilLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DNilLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDLiteralExpression"


    // $ANTLR start "entryRuleDSelfExpression"
    // InternalDmx.g:1842:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDmx.g:1842:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDmx.g:1843:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDSelfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDSelfExpression=ruleDSelfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDSelfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDSelfExpression"


    // $ANTLR start "ruleDSelfExpression"
    // InternalDmx.g:1849:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDmx.g:1855:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDmx.g:1856:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDmx.g:1856:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDmx.g:1857:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDmx.g:1857:3: ()
            // InternalDmx.g:1858:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:1864:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDmx.g:1865:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1870:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDSelfExpressionAccess().getSelfKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDSelfExpression"


    // $ANTLR start "entryRuleDReturnExpression"
    // InternalDmx.g:1879:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDmx.g:1879:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDmx.g:1880:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDReturnExpression=ruleDReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDReturnExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDReturnExpression"


    // $ANTLR start "ruleDReturnExpression"
    // InternalDmx.g:1886:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1892:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDmx.g:1893:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDmx.g:1893:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDmx.g:1894:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDmx.g:1894:3: ()
            // InternalDmx.g:1895:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:1901:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            else if ( (LA25_0==34) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDmx.g:1902:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1907:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDmx.g:1912:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalDmx.g:1913:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDmx.g:1914:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDmx.g:1915:5: lv_expression_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDReturnExpressionAccess().getExpressionDExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDReturnExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDReturnExpression"


    // $ANTLR start "entryRuleDRaiseExpression"
    // InternalDmx.g:1936:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDmx.g:1936:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDmx.g:1937:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRaiseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRaiseExpression=ruleDRaiseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRaiseExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDRaiseExpression"


    // $ANTLR start "ruleDRaiseExpression"
    // InternalDmx.g:1943:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:1949:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDmx.g:1950:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDmx.g:1950:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDmx.g:1951:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDmx.g:1951:3: ()
            // InternalDmx.g:1952:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:1958:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            else if ( (LA27_0==36) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDmx.g:1959:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:1964:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDmx.g:1969:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDmx.g:1970:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDmx.g:1970:4: (lv_expression_3_0= ruleDExpression )
            // InternalDmx.g:1971:5: lv_expression_3_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDRaiseExpressionAccess().getExpressionDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDRaiseExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDRaiseExpression"


    // $ANTLR start "entryRuleDParenthesizedExpression"
    // InternalDmx.g:1992:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDmx.g:1992:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDmx.g:1993:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDParenthesizedExpression=ruleDParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDParenthesizedExpression"


    // $ANTLR start "ruleDParenthesizedExpression"
    // InternalDmx.g:1999:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDmx.g:2005:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDmx.g:2006:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDmx.g:2006:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDmx.g:2007:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_27);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDParenthesizedExpression"


    // $ANTLR start "entryRuleDFunctionCall"
    // InternalDmx.g:2027:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDmx.g:2027:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDmx.g:2028:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFunctionCall=ruleDFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDFunctionCall"


    // $ANTLR start "ruleDFunctionCall"
    // InternalDmx.g:2034:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleDFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_functionCallArguments_3_0 = null;

        EObject lv_functionCallArguments_5_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2040:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDmx.g:2041:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDmx.g:2041:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDmx.g:2042:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDmx.g:2042:3: ()
            // InternalDmx.g:2043:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2049:3: ( (otherlv_1= RULE_ID ) )
            // InternalDmx.g:2050:4: (otherlv_1= RULE_ID )
            {
            // InternalDmx.g:2050:4: (otherlv_1= RULE_ID )
            // InternalDmx.g:2051:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDmx.g:2066:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_NATURAL && LA29_0<=RULE_PLAIN_TEXT_START)||(LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==27||(LA29_0>=31 && LA29_0<=39)||LA29_0==44||LA29_0==48||(LA29_0>=50 && LA29_0<=55)||(LA29_0>=58 && LA29_0<=59)||(LA29_0>=81 && LA29_0<=83)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDmx.g:2067:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDmx.g:2067:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDmx.g:2068:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDmx.g:2068:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDmx.g:2069:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_functionCallArguments_3_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDFunctionCallRule());
                      						}
                      						add(
                      							current,
                      							"functionCallArguments",
                      							lv_functionCallArguments_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDmx.g:2086:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==28) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDmx.g:2087:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDmx.g:2091:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDmx.g:2092:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDmx.g:2092:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDmx.g:2093:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_25);
                    	    lv_functionCallArguments_5_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDFunctionCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"functionCallArguments",
                    	      								lv_functionCallArguments_5_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDFunctionCallAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDFunctionCall"


    // $ANTLR start "entryRuleDConstructorCall"
    // InternalDmx.g:2120:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDmx.g:2120:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDmx.g:2121:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDConstructorCall=ruleDConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDConstructorCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDConstructorCall"


    // $ANTLR start "ruleDConstructorCall"
    // InternalDmx.g:2127:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
    public final EObject ruleDConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitConstructorCall_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2133:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDmx.g:2134:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDmx.g:2134:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDmx.g:2135:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDmx.g:2135:3: ()
            // InternalDmx.g:2136:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDConstructorCallAccess().getDConstructorCallAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDConstructorCallAccess().getOpConstructorParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_17);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDmx.g:2149:3: ( (otherlv_2= RULE_ID ) )
            // InternalDmx.g:2150:4: (otherlv_2= RULE_ID )
            {
            // InternalDmx.g:2150:4: (otherlv_2= RULE_ID )
            // InternalDmx.g:2151:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDComplexTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDmx.g:2162:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) && (synpred15_InternalDmx())) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDmx.g:2163:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDmx.g:2163:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDmx.g:2164:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDmx.g:2168:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDmx.g:2169:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,27,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitConstructorCall_3_0, grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDConstructorCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalDmx.g:2181:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( ((LA31_0>=RULE_NATURAL && LA31_0<=RULE_PLAIN_TEXT_START)||(LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==27||(LA31_0>=31 && LA31_0<=39)||LA31_0==44||LA31_0==48||(LA31_0>=50 && LA31_0<=55)||(LA31_0>=58 && LA31_0<=59)||(LA31_0>=81 && LA31_0<=83)) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalDmx.g:2182:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDmx.g:2182:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDmx.g:2183:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDmx.g:2183:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDmx.g:2184:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
                            lv_arguments_4_0=ruleDExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDConstructorCallRule());
                              							}
                              							add(
                              								current,
                              								"arguments",
                              								lv_arguments_4_0,
                              								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalDmx.g:2201:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==28) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // InternalDmx.g:2202:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDmx.g:2206:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDmx.g:2207:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDmx.g:2207:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDmx.g:2208:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_25);
                            	    lv_arguments_6_0=ruleDExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDConstructorCallRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"arguments",
                            	      									lv_arguments_6_0,
                            	      									"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getDConstructorCallAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDConstructorCall"


    // $ANTLR start "entryRuleOpConstructor"
    // InternalDmx.g:2236:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDmx.g:2236:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDmx.g:2237:2: iv_ruleOpConstructor= ruleOpConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpConstructor=ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpConstructor.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpConstructor"


    // $ANTLR start "ruleOpConstructor"
    // InternalDmx.g:2243:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:2249:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDmx.g:2250:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDmx.g:2250:2: (kw= 'NEW' | kw= 'new' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDmx.g:2251:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:2257:3: kw= 'new'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNewKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpConstructor"


    // $ANTLR start "entryRuleDContextReference"
    // InternalDmx.g:2266:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDmx.g:2266:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDmx.g:2267:2: iv_ruleDContextReference= ruleDContextReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDContextReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDContextReference=ruleDContextReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDContextReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDContextReference"


    // $ANTLR start "ruleDContextReference"
    // InternalDmx.g:2273:1: ruleDContextReference returns [EObject current=null] : ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_displayName_8_0=null;
        Token lv_plural_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDmx.g:2279:2: ( ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) ) )
            // InternalDmx.g:2280:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) )
            {
            // InternalDmx.g:2280:2: ( () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) ) )
            // InternalDmx.g:2281:3: () ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) )
            {
            // InternalDmx.g:2281:3: ()
            // InternalDmx.g:2282:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2288:3: ( ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? ) | (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==39) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalDmx.g:2289:4: ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
                    {
                    // InternalDmx.g:2289:4: ( ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )? )
                    // InternalDmx.g:2290:5: ( (otherlv_1= RULE_ID ) ) ( (lv_before_2_0= '@before' ) )?
                    {
                    // InternalDmx.g:2290:5: ( (otherlv_1= RULE_ID ) )
                    // InternalDmx.g:2291:6: (otherlv_1= RULE_ID )
                    {
                    // InternalDmx.g:2291:6: (otherlv_1= RULE_ID )
                    // InternalDmx.g:2292:7: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDContextReferenceRule());
                      							}
                      						
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getTargetDNamedElementCrossReference_1_0_0_0());
                      						
                    }

                    }


                    }

                    // InternalDmx.g:2303:5: ( (lv_before_2_0= '@before' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==30) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalDmx.g:2304:6: (lv_before_2_0= '@before' )
                            {
                            // InternalDmx.g:2304:6: (lv_before_2_0= '@before' )
                            // InternalDmx.g:2305:7: lv_before_2_0= '@before'
                            {
                            lv_before_2_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_before_2_0, grammarAccess.getDContextReferenceAccess().getBeforeBeforeKeyword_1_0_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDContextReferenceRule());
                              							}
                              							setWithLastConsumed(current, "before", true, "@before");
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:2319:4: (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) )
                    {
                    // InternalDmx.g:2319:4: (otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' ) )
                    // InternalDmx.g:2320:5: otherlv_3= '[' ( ( ruleDQualifiedName ) ) (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )? ( ( ']' )=>otherlv_10= ']' )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDContextReferenceAccess().getLeftSquareBracketKeyword_1_1_0());
                      				
                    }
                    // InternalDmx.g:2324:5: ( ( ruleDQualifiedName ) )
                    // InternalDmx.g:2325:6: ( ruleDQualifiedName )
                    {
                    // InternalDmx.g:2325:6: ( ruleDQualifiedName )
                    // InternalDmx.g:2326:7: ruleDQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDContextReferenceRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDContextReferenceAccess().getTargetIPrimaryNavigationTargetCrossReference_1_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
                    ruleDQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalDmx.g:2340:5: (otherlv_5= '#' ( (otherlv_6= RULE_ID ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==40) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalDmx.g:2341:6: otherlv_5= '#' ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getDContextReferenceAccess().getNumberSignKeyword_1_1_2_0());
                              					
                            }
                            // InternalDmx.g:2345:6: ( (otherlv_6= RULE_ID ) )
                            // InternalDmx.g:2346:7: (otherlv_6= RULE_ID )
                            {
                            // InternalDmx.g:2346:7: (otherlv_6= RULE_ID )
                            // InternalDmx.g:2347:8: otherlv_6= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getDContextReferenceRule());
                              								}
                              							
                            }
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(otherlv_6, grammarAccess.getDContextReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_2_1_0());
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalDmx.g:2359:5: (otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==41) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalDmx.g:2360:6: otherlv_7= '|' ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) )
                            {
                            otherlv_7=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getDContextReferenceAccess().getVerticalLineKeyword_1_1_3_0());
                              					
                            }
                            // InternalDmx.g:2364:6: ( ( (lv_displayName_8_0= RULE_ID ) ) | ( (lv_plural_9_0= '*' ) ) )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==RULE_ID) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==42) ) {
                                alt36=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }
                            switch (alt36) {
                                case 1 :
                                    // InternalDmx.g:2365:7: ( (lv_displayName_8_0= RULE_ID ) )
                                    {
                                    // InternalDmx.g:2365:7: ( (lv_displayName_8_0= RULE_ID ) )
                                    // InternalDmx.g:2366:8: (lv_displayName_8_0= RULE_ID )
                                    {
                                    // InternalDmx.g:2366:8: (lv_displayName_8_0= RULE_ID )
                                    // InternalDmx.g:2367:9: lv_displayName_8_0= RULE_ID
                                    {
                                    lv_displayName_8_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_displayName_8_0, grammarAccess.getDContextReferenceAccess().getDisplayNameIDTerminalRuleCall_1_1_3_1_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getDContextReferenceRule());
                                      									}
                                      									setWithLastConsumed(
                                      										current,
                                      										"displayName",
                                      										lv_displayName_8_0,
                                      										"com.mimacom.ddd.dm.dmx.Dmx.ID");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalDmx.g:2384:7: ( (lv_plural_9_0= '*' ) )
                                    {
                                    // InternalDmx.g:2384:7: ( (lv_plural_9_0= '*' ) )
                                    // InternalDmx.g:2385:8: (lv_plural_9_0= '*' )
                                    {
                                    // InternalDmx.g:2385:8: (lv_plural_9_0= '*' )
                                    // InternalDmx.g:2386:9: lv_plural_9_0= '*'
                                    {
                                    lv_plural_9_0=(Token)match(input,42,FOLLOW_34); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_plural_9_0, grammarAccess.getDContextReferenceAccess().getPluralAsteriskKeyword_1_1_3_1_1_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getDContextReferenceRule());
                                      									}
                                      									setWithLastConsumed(current, "plural", true, "*");
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // InternalDmx.g:2400:5: ( ( ']' )=>otherlv_10= ']' )
                    // InternalDmx.g:2401:6: ( ']' )=>otherlv_10= ']'
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getDContextReferenceAccess().getRightSquareBracketKeyword_1_1_4());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDContextReference"


    // $ANTLR start "entryRuleDIfExpression"
    // InternalDmx.g:2413:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDmx.g:2413:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDmx.g:2414:2: iv_ruleDIfExpression= ruleDIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDIfExpression=ruleDIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIfExpression"


    // $ANTLR start "ruleDIfExpression"
    // InternalDmx.g:2420:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
    public final EObject ruleDIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2426:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDmx.g:2427:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDmx.g:2427:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDmx.g:2428:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDmx.g:2428:3: ()
            // InternalDmx.g:2429:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDmx.g:2439:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDmx.g:2440:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDmx.g:2440:4: (lv_if_2_0= ruleDExpression )
            // InternalDmx.g:2441:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_if_2_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
              					}
              					set(
              						current,
              						"if",
              						lv_if_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDmx.g:2462:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDmx.g:2463:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDmx.g:2463:4: (lv_then_4_0= ruleDExpression )
            // InternalDmx.g:2464:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_then_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDmx.g:2481:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) && (synpred17_InternalDmx())) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDmx.g:2482:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDmx.g:2482:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDmx.g:2483:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDmx.g:2489:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDmx.g:2490:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDmx.g:2490:5: (lv_else_6_0= ruleDExpression )
                    // InternalDmx.g:2491:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_else_6_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDIfExpressionRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_6_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDIfExpressionAccess().getEndKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIfExpression"


    // $ANTLR start "entryRuleDForLoopExpression"
    // InternalDmx.g:2517:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDmx.g:2517:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDmx.g:2518:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDForLoopExpression=ruleDForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDForLoopExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDForLoopExpression"


    // $ANTLR start "ruleDForLoopExpression"
    // InternalDmx.g:2524:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
    public final EObject ruleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_declaredParam_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_forExpression_4_0 = null;

        EObject lv_eachExpression_6_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2530:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDmx.g:2531:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDmx.g:2531:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDmx.g:2532:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDmx.g:2532:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDmx.g:2533:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDmx.g:2545:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDmx.g:2546:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDmx.g:2546:5: ()
            // InternalDmx.g:2547:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDmx.g:2557:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDmx.g:2558:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDmx.g:2558:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDmx.g:2559:7: lv_declaredParam_2_0= RULE_ID
            {
            lv_declaredParam_2_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							newLeafNode(lv_declaredParam_2_0, grammarAccess.getDForLoopExpressionAccess().getDeclaredParamIDTerminalRuleCall_0_0_2_0());
              						
            }
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElement(grammarAccess.getDForLoopExpressionRule());
              							}
              							setWithLastConsumed(
              								current,
              								"declaredParam",
              								lv_declaredParam_2_0,
              								"com.mimacom.ddd.dm.dmx.Dmx.ID");
              						
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalDmx.g:2581:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDmx.g:2582:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDmx.g:2582:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDmx.g:2583:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_forExpression_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDForLoopExpressionRule());
              					}
              					set(
              						current,
              						"forExpression",
              						lv_forExpression_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,49,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDmx.g:2604:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDmx.g:2605:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDmx.g:2605:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDmx.g:2606:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_eachExpression_6_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDForLoopExpressionRule());
              					}
              					set(
              						current,
              						"eachExpression",
              						lv_eachExpression_6_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDForLoopExpressionAccess().getEndKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDForLoopExpression"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalDmx.g:2631:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDmx.g:2631:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDmx.g:2632:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMULTIPLICITYRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMULTIPLICITY=ruleMULTIPLICITY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMULTIPLICITY.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMULTIPLICITY"


    // $ANTLR start "ruleMULTIPLICITY"
    // InternalDmx.g:2638:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDmx.g:2644:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDmx.g:2645:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDmx.g:2645:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NATURAL) ) {
                alt40=1;
            }
            else if ( (LA40_0==42) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalDmx.g:2646:3: this_NATURAL_0= RULE_NATURAL
                    {
                    this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NATURAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NATURAL_0, grammarAccess.getMULTIPLICITYAccess().getNATURALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:2654:3: kw= '*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getMULTIPLICITYAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMULTIPLICITY"


    // $ANTLR start "entryRuleDBooleanLiteral"
    // InternalDmx.g:2663:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDmx.g:2663:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDmx.g:2664:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDBooleanLiteral=ruleDBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDBooleanLiteral"


    // $ANTLR start "ruleDBooleanLiteral"
    // InternalDmx.g:2670:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDmx.g:2676:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDmx.g:2677:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDmx.g:2677:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDmx.g:2678:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDmx.g:2678:3: ()
            // InternalDmx.g:2679:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2685:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt41=1;
                }
                break;
            case 51:
                {
                alt41=2;
                }
                break;
            case 52:
                {
                alt41=3;
                }
                break;
            case 53:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalDmx.g:2686:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDmx.g:2686:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDmx.g:2687:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDmx.g:2687:5: (lv_value_1_0= 'TRUE' )
                    // InternalDmx.g:2688:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getDBooleanLiteralAccess().getValueTRUEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "TRUE");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:2701:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDmx.g:2701:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDmx.g:2702:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDmx.g:2702:5: (lv_value_2_0= 'true' )
                    // InternalDmx.g:2703:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getDBooleanLiteralAccess().getValueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:2716:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDmx.g:2721:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDBooleanLiteralAccess().getFalseKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDBooleanLiteral"


    // $ANTLR start "entryRuleDStringLiteral"
    // InternalDmx.g:2730:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDmx.g:2730:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDmx.g:2731:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDStringLiteral=ruleDStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDStringLiteral"


    // $ANTLR start "ruleDStringLiteral"
    // InternalDmx.g:2737:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDmx.g:2743:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDmx.g:2744:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDmx.g:2744:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDmx.g:2745:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDmx.g:2745:3: ()
            // InternalDmx.g:2746:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2752:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDmx.g:2753:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDmx.g:2753:4: (lv_value_1_0= RULE_STRING )
            // InternalDmx.g:2754:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDStringLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDStringLiteral"


    // $ANTLR start "entryRuleDNaturalLiteral"
    // InternalDmx.g:2774:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDmx.g:2774:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDmx.g:2775:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNaturalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNaturalLiteral=ruleDNaturalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNaturalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNaturalLiteral"


    // $ANTLR start "ruleDNaturalLiteral"
    // InternalDmx.g:2781:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDmx.g:2787:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDmx.g:2788:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDmx.g:2788:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDmx.g:2789:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDmx.g:2789:3: ()
            // InternalDmx.g:2790:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2796:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDmx.g:2797:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDmx.g:2797:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDmx.g:2798:5: lv_value_1_0= RULE_NATURAL
            {
            lv_value_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDNaturalLiteralAccess().getValueNATURALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNaturalLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.NATURAL");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNaturalLiteral"


    // $ANTLR start "entryRuleDDecimalLiteral"
    // InternalDmx.g:2818:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDmx.g:2818:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDmx.g:2819:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDecimalLiteral=ruleDDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDecimalLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDDecimalLiteral"


    // $ANTLR start "ruleDDecimalLiteral"
    // InternalDmx.g:2825:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDmx.g:2831:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDmx.g:2832:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDmx.g:2832:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDmx.g:2833:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDmx.g:2833:3: ()
            // InternalDmx.g:2834:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2840:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDmx.g:2841:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDmx.g:2841:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDmx.g:2842:5: lv_value_1_0= ruleDECIMAL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDecimalLiteralAccess().getValueDECIMALParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDecimalLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DECIMAL");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDDecimalLiteral"


    // $ANTLR start "entryRuleDNilLiteral"
    // InternalDmx.g:2863:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDmx.g:2863:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDmx.g:2864:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNilLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNilLiteral=ruleDNilLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNilLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNilLiteral"


    // $ANTLR start "ruleDNilLiteral"
    // InternalDmx.g:2870:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDmx.g:2876:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDmx.g:2877:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDmx.g:2877:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDmx.g:2878:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDmx.g:2878:3: ()
            // InternalDmx.g:2879:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDmx.g:2885:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            else if ( (LA42_0==55) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalDmx.g:2886:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDmx.g:2891:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDNilLiteralAccess().getUndefinedKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNilLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalDmx.g:2900:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDmx.g:2900:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDmx.g:2901:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDECIMAL.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalDmx.g:2907:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDmx.g:2913:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDmx.g:2914:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDmx.g:2914:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDmx.g:2915:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDmx.g:2934:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=56 && LA45_0<=57)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDmx.g:2935:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDmx.g:2935:4: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==56) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==57) ) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalDmx.g:2936:5: kw= 'E'
                            {
                            kw=(Token)match(input,56,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDmx.g:2942:5: kw= 'e'
                            {
                            kw=(Token)match(input,57,FOLLOW_41); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDmx.g:2948:4: (kw= '+' | kw= '-' )?
                    int alt44=3;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==58) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==59) ) {
                        alt44=2;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalDmx.g:2949:5: kw= '+'
                            {
                            kw=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDmx.g:2955:5: kw= '-'
                            {
                            kw=(Token)match(input,59,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_3_1_1());
                              				
                            }

                            }
                            break;

                    }

                    this_NATURAL_7=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_NATURAL_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_NATURAL_7, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_3_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleDQualifiedName"
    // InternalDmx.g:2973:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDmx.g:2973:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDmx.g:2974:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQualifiedName=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDQualifiedName"


    // $ANTLR start "ruleDQualifiedName"
    // InternalDmx.g:2980:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDmx.g:2986:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDmx.g:2987:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDmx.g:2987:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDmx.g:2988:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDmx.g:2995:3: (kw= '.' this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==26) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalDmx.g:2996:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleOpOr"
    // InternalDmx.g:3013:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDmx.g:3019:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDmx.g:3020:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDmx.g:3020:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt47=1;
                }
                break;
            case 61:
                {
                alt47=2;
                }
                break;
            case 62:
                {
                alt47=3;
                }
                break;
            case 63:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalDmx.g:3021:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDmx.g:3021:3: (enumLiteral_0= 'OR' )
                    // InternalDmx.g:3022:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3029:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDmx.g:3029:3: (enumLiteral_1= 'or' )
                    // InternalDmx.g:3030:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3037:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDmx.g:3037:3: (enumLiteral_2= 'XOR' )
                    // InternalDmx.g:3038:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:3045:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDmx.g:3045:3: (enumLiteral_3= 'xor' )
                    // InternalDmx.g:3046:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "ruleOpAnd"
    // InternalDmx.g:3056:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDmx.g:3062:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDmx.g:3063:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDmx.g:3063:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==64) ) {
                alt48=1;
            }
            else if ( (LA48_0==65) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDmx.g:3064:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDmx.g:3064:3: (enumLiteral_0= 'AND' )
                    // InternalDmx.g:3065:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3072:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDmx.g:3072:3: (enumLiteral_1= 'and' )
                    // InternalDmx.g:3073:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "ruleOpEquality"
    // InternalDmx.g:3083:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDmx.g:3089:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDmx.g:3090:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDmx.g:3090:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt49=1;
                }
                break;
            case 67:
                {
                alt49=2;
                }
                break;
            case 68:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDmx.g:3091:3: (enumLiteral_0= '=' )
                    {
                    // InternalDmx.g:3091:3: (enumLiteral_0= '=' )
                    // InternalDmx.g:3092:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3099:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDmx.g:3099:3: (enumLiteral_1= '!=' )
                    // InternalDmx.g:3100:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3107:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDmx.g:3107:3: (enumLiteral_2= '<>' )
                    // InternalDmx.g:3108:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "ruleOpCompare"
    // InternalDmx.g:3118:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
    public final Enumerator ruleOpCompare() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDmx.g:3124:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDmx.g:3125:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDmx.g:3125:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt50=1;
                }
                break;
            case 70:
                {
                alt50=2;
                }
                break;
            case 71:
                {
                alt50=3;
                }
                break;
            case 72:
                {
                alt50=4;
                }
                break;
            case 73:
                {
                alt50=5;
                }
                break;
            case 74:
                {
                alt50=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalDmx.g:3126:3: (enumLiteral_0= '<' )
                    {
                    // InternalDmx.g:3126:3: (enumLiteral_0= '<' )
                    // InternalDmx.g:3127:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3134:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDmx.g:3134:3: (enumLiteral_1= '<=' )
                    // InternalDmx.g:3135:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3142:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDmx.g:3142:3: (enumLiteral_2= '\\u2264' )
                    // InternalDmx.g:3143:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:3150:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDmx.g:3150:3: (enumLiteral_3= '>=' )
                    // InternalDmx.g:3151:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:3158:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDmx.g:3158:3: (enumLiteral_4= '\\u2265' )
                    // InternalDmx.g:3159:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDmx.g:3166:3: (enumLiteral_5= '>' )
                    {
                    // InternalDmx.g:3166:3: (enumLiteral_5= '>' )
                    // InternalDmx.g:3167:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getOpCompareAccess().getGREATEREnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "ruleOpOther"
    // InternalDmx.g:3177:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDmx.g:3183:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDmx.g:3184:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDmx.g:3184:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt51=1;
                }
                break;
            case 76:
                {
                alt51=2;
                }
                break;
            case 77:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalDmx.g:3185:3: (enumLiteral_0= '..' )
                    {
                    // InternalDmx.g:3185:3: (enumLiteral_0= '..' )
                    // InternalDmx.g:3186:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3193:3: (enumLiteral_1= '->' )
                    {
                    // InternalDmx.g:3193:3: (enumLiteral_1= '->' )
                    // InternalDmx.g:3194:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3201:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDmx.g:3201:3: (enumLiteral_2= '=>' )
                    // InternalDmx.g:3202:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "ruleOpAdd"
    // InternalDmx.g:3212:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDmx.g:3218:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDmx.g:3219:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDmx.g:3219:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            else if ( (LA52_0==59) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDmx.g:3220:3: (enumLiteral_0= '+' )
                    {
                    // InternalDmx.g:3220:3: (enumLiteral_0= '+' )
                    // InternalDmx.g:3221:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3228:3: (enumLiteral_1= '-' )
                    {
                    // InternalDmx.g:3228:3: (enumLiteral_1= '-' )
                    // InternalDmx.g:3229:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpAddAccess().getSUBTRACTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "ruleOpMulti"
    // InternalDmx.g:3239:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDmx.g:3245:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDmx.g:3246:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDmx.g:3246:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt53=1;
                }
                break;
            case 78:
                {
                alt53=2;
                }
                break;
            case 79:
                {
                alt53=3;
                }
                break;
            case 80:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalDmx.g:3247:3: (enumLiteral_0= '*' )
                    {
                    // InternalDmx.g:3247:3: (enumLiteral_0= '*' )
                    // InternalDmx.g:3248:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3255:3: (enumLiteral_1= '/' )
                    {
                    // InternalDmx.g:3255:3: (enumLiteral_1= '/' )
                    // InternalDmx.g:3256:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3263:3: (enumLiteral_2= '**' )
                    {
                    // InternalDmx.g:3263:3: (enumLiteral_2= '**' )
                    // InternalDmx.g:3264:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:3271:3: (enumLiteral_3= '%' )
                    {
                    // InternalDmx.g:3271:3: (enumLiteral_3= '%' )
                    // InternalDmx.g:3272:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpMultiAccess().getMODULOEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "ruleOpUnary"
    // InternalDmx.g:3282:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDmx.g:3288:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDmx.g:3289:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDmx.g:3289:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt54=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt54=1;
                }
                break;
            case 59:
                {
                alt54=2;
                }
                break;
            case 81:
                {
                alt54=3;
                }
                break;
            case 82:
                {
                alt54=4;
                }
                break;
            case 83:
                {
                alt54=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalDmx.g:3290:3: (enumLiteral_0= '+' )
                    {
                    // InternalDmx.g:3290:3: (enumLiteral_0= '+' )
                    // InternalDmx.g:3291:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDmx.g:3298:3: (enumLiteral_1= '-' )
                    {
                    // InternalDmx.g:3298:3: (enumLiteral_1= '-' )
                    // InternalDmx.g:3299:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDmx.g:3306:3: (enumLiteral_2= '!' )
                    {
                    // InternalDmx.g:3306:3: (enumLiteral_2= '!' )
                    // InternalDmx.g:3307:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDmx.g:3314:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDmx.g:3314:3: (enumLiteral_3= 'NOT' )
                    // InternalDmx.g:3315:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDmx.g:3322:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDmx.g:3322:3: (enumLiteral_4= 'not' )
                    // InternalDmx.g:3323:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"

    // $ANTLR start synpred1_InternalDmx
    public final void synpred1_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:602:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDmx.g:602:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDmx.g:602:6: ( () ( ( ruleOpOr ) ) )
        // InternalDmx.g:603:6: () ( ( ruleOpOr ) )
        {
        // InternalDmx.g:603:6: ()
        // InternalDmx.g:604:6: 
        {
        }

        // InternalDmx.g:605:6: ( ( ruleOpOr ) )
        // InternalDmx.g:606:7: ( ruleOpOr )
        {
        // InternalDmx.g:606:7: ( ruleOpOr )
        // InternalDmx.g:607:8: ruleOpOr
        {
        pushFollow(FOLLOW_2);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalDmx

    // $ANTLR start synpred2_InternalDmx
    public final void synpred2_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:690:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDmx.g:690:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDmx.g:690:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDmx.g:691:6: () ( ( ruleOpAnd ) )
        {
        // InternalDmx.g:691:6: ()
        // InternalDmx.g:692:6: 
        {
        }

        // InternalDmx.g:693:6: ( ( ruleOpAnd ) )
        // InternalDmx.g:694:7: ( ruleOpAnd )
        {
        // InternalDmx.g:694:7: ( ruleOpAnd )
        // InternalDmx.g:695:8: ruleOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalDmx

    // $ANTLR start synpred3_InternalDmx
    public final void synpred3_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:778:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDmx.g:778:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDmx.g:778:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDmx.g:779:6: () ( ( ruleOpEquality ) )
        {
        // InternalDmx.g:779:6: ()
        // InternalDmx.g:780:6: 
        {
        }

        // InternalDmx.g:781:6: ( ( ruleOpEquality ) )
        // InternalDmx.g:782:7: ( ruleOpEquality )
        {
        // InternalDmx.g:782:7: ( ruleOpEquality )
        // InternalDmx.g:783:8: ruleOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalDmx

    // $ANTLR start synpred4_InternalDmx
    public final void synpred4_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:867:6: ( ( () ruleOpInstanceOf ) )
        // InternalDmx.g:867:7: ( () ruleOpInstanceOf )
        {
        // InternalDmx.g:867:7: ( () ruleOpInstanceOf )
        // InternalDmx.g:868:7: () ruleOpInstanceOf
        {
        // InternalDmx.g:868:7: ()
        // InternalDmx.g:869:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDmx

    // $ANTLR start synpred5_InternalDmx
    public final void synpred5_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:907:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDmx.g:907:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDmx.g:907:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDmx.g:908:7: () ( ( ruleOpCompare ) )
        {
        // InternalDmx.g:908:7: ()
        // InternalDmx.g:909:7: 
        {
        }

        // InternalDmx.g:910:7: ( ( ruleOpCompare ) )
        // InternalDmx.g:911:8: ( ruleOpCompare )
        {
        // InternalDmx.g:911:8: ( ruleOpCompare )
        // InternalDmx.g:912:9: ruleOpCompare
        {
        pushFollow(FOLLOW_2);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalDmx

    // $ANTLR start synpred6_InternalDmx
    public final void synpred6_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1026:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDmx.g:1026:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDmx.g:1026:6: ( () ( ( ruleOpOther ) ) )
        // InternalDmx.g:1027:6: () ( ( ruleOpOther ) )
        {
        // InternalDmx.g:1027:6: ()
        // InternalDmx.g:1028:6: 
        {
        }

        // InternalDmx.g:1029:6: ( ( ruleOpOther ) )
        // InternalDmx.g:1030:7: ( ruleOpOther )
        {
        // InternalDmx.g:1030:7: ( ruleOpOther )
        // InternalDmx.g:1031:8: ruleOpOther
        {
        pushFollow(FOLLOW_2);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalDmx

    // $ANTLR start synpred7_InternalDmx
    public final void synpred7_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1114:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDmx.g:1114:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDmx.g:1114:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDmx.g:1115:6: () ( ( ruleOpAdd ) )
        {
        // InternalDmx.g:1115:6: ()
        // InternalDmx.g:1116:6: 
        {
        }

        // InternalDmx.g:1117:6: ( ( ruleOpAdd ) )
        // InternalDmx.g:1118:7: ( ruleOpAdd )
        {
        // InternalDmx.g:1118:7: ( ruleOpAdd )
        // InternalDmx.g:1119:8: ruleOpAdd
        {
        pushFollow(FOLLOW_2);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDmx

    // $ANTLR start synpred8_InternalDmx
    public final void synpred8_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1202:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDmx.g:1202:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDmx.g:1202:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDmx.g:1203:6: () ( ( ruleOpMulti ) )
        {
        // InternalDmx.g:1203:6: ()
        // InternalDmx.g:1204:6: 
        {
        }

        // InternalDmx.g:1205:6: ( ( ruleOpMulti ) )
        // InternalDmx.g:1206:7: ( ruleOpMulti )
        {
        // InternalDmx.g:1206:7: ( ruleOpMulti )
        // InternalDmx.g:1207:8: ruleOpMulti
        {
        pushFollow(FOLLOW_2);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalDmx

    // $ANTLR start synpred9_InternalDmx
    public final void synpred9_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1365:5: ( ( () ruleOpCast ) )
        // InternalDmx.g:1365:6: ( () ruleOpCast )
        {
        // InternalDmx.g:1365:6: ( () ruleOpCast )
        // InternalDmx.g:1366:6: () ruleOpCast
        {
        // InternalDmx.g:1366:6: ()
        // InternalDmx.g:1367:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalDmx

    // $ANTLR start synpred10_InternalDmx
    public final void synpred10_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1462:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDmx.g:1462:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDmx.g:1462:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDmx.g:1463:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDmx.g:1463:7: ()
        // InternalDmx.g:1464:7: 
        {
        }

        match(input,26,FOLLOW_17); if (state.failed) return ;
        // InternalDmx.g:1466:7: ( ( RULE_ID ) )
        // InternalDmx.g:1467:8: ( RULE_ID )
        {
        // InternalDmx.g:1467:8: ( RULE_ID )
        // InternalDmx.g:1468:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_11); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDmx

    // $ANTLR start synpred11_InternalDmx
    public final void synpred11_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1531:6: ( ( () '.' ) )
        // InternalDmx.g:1531:7: ( () '.' )
        {
        // InternalDmx.g:1531:7: ( () '.' )
        // InternalDmx.g:1532:7: () '.'
        {
        // InternalDmx.g:1532:7: ()
        // InternalDmx.g:1533:7: 
        {
        }

        match(input,26,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDmx

    // $ANTLR start synpred12_InternalDmx
    public final void synpred12_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1567:8: ( ( '(' ) )
        // InternalDmx.g:1567:9: ( '(' )
        {
        // InternalDmx.g:1567:9: ( '(' )
        // InternalDmx.g:1568:9: '('
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDmx

    // $ANTLR start synpred13_InternalDmx
    public final void synpred13_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1754:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDmx.g:1754:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDmx.g:1754:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDmx.g:1755:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDmx.g:1755:5: ()
        // InternalDmx.g:1756:5: 
        {
        }

        match(input,48,FOLLOW_17); if (state.failed) return ;
        // InternalDmx.g:1758:5: ( ( RULE_ID ) )
        // InternalDmx.g:1759:6: ( RULE_ID )
        {
        // InternalDmx.g:1759:6: ( RULE_ID )
        // InternalDmx.g:1760:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_4); if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDmx

    // $ANTLR start synpred14_InternalDmx
    public final void synpred14_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:1913:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )
        // InternalDmx.g:
        {
        if ( (input.LA(1)>=RULE_NATURAL && input.LA(1)<=RULE_PLAIN_TEXT_START)||(input.LA(1)>=RULE_ID && input.LA(1)<=RULE_STRING)||input.LA(1)==27||(input.LA(1)>=31 && input.LA(1)<=39)||input.LA(1)==44||input.LA(1)==48||(input.LA(1)>=50 && input.LA(1)<=55)||(input.LA(1)>=58 && input.LA(1)<=59)||(input.LA(1)>=81 && input.LA(1)<=83) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred14_InternalDmx

    // $ANTLR start synpred15_InternalDmx
    public final void synpred15_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2164:5: ( ( '(' ) )
        // InternalDmx.g:2164:6: ( '(' )
        {
        // InternalDmx.g:2164:6: ( '(' )
        // InternalDmx.g:2165:6: '('
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDmx

    // $ANTLR start synpred16_InternalDmx
    public final void synpred16_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2401:6: ( ']' )
        // InternalDmx.g:2401:7: ']'
        {
        match(input,43,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalDmx

    // $ANTLR start synpred17_InternalDmx
    public final void synpred17_InternalDmx_fragment() throws RecognitionException {   
        // InternalDmx.g:2483:5: ( 'else' )
        // InternalDmx.g:2483:6: 'else'
        {
        match(input,46,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalDmx

    // Delegated rules

    public final boolean synpred9_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDmx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDmx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDmx_fragment(); // can never throw exception
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
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\7\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\120\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\0\1\1\1\4\1\2\1\7\1\6\1\5\1\3\2\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\12\uffff\1\1\2\uffff\1\2\1\3\3\1\1\uffff\2\1\14\uffff\1\1\2\uffff\3\1\1\uffff\1\1\10\uffff\13\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "()* loopback of 864:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDmx()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDmx()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\6\uffff\1\10\5\uffff";
    static final String dfa_9s = "\1\4\5\uffff\1\7\5\uffff";
    static final String dfa_10s = "\1\67\5\uffff\1\120\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\6";
    static final String dfa_12s = "\1\0\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\4\uffff\1\6\1\1\20\uffff\1\5\3\uffff\2\2\2\3\2\4\2\7\1\10\4\uffff\1\11\3\uffff\1\12\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\2\10\12\uffff\1\10\2\uffff\5\10\1\13\3\10\13\uffff\1\10\2\uffff\3\10\1\uffff\1\10\10\uffff\27\10",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1671:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==RULE_NATURAL||LA22_0==RULE_STRING||(LA22_0>=50 && LA22_0<=55)) ) {s = 1;}

                        else if ( ((LA22_0>=31 && LA22_0<=32)) ) {s = 2;}

                        else if ( ((LA22_0>=33 && LA22_0<=34)) ) {s = 3;}

                        else if ( ((LA22_0>=35 && LA22_0<=36)) ) {s = 4;}

                        else if ( (LA22_0==27) ) {s = 5;}

                        else if ( (LA22_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA22_0>=37 && LA22_0<=38)) ) {s = 7;}

                        else if ( (LA22_0==39) ) {s = 8;}

                        else if ( (LA22_0==44) ) {s = 9;}

                        else if ( (LA22_0==48) && (synpred13_InternalDmx())) {s = 10;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\102\uffff";
    static final String dfa_15s = "\1\35\101\uffff";
    static final String dfa_16s = "\1\4\1\uffff\2\0\76\uffff";
    static final String dfa_17s = "\1\123\1\uffff\2\0\76\uffff";
    static final String dfa_18s = "\1\uffff\1\1\2\uffff\31\1\1\2\44\uffff";
    static final String dfa_19s = "\1\0\1\uffff\1\1\1\2\76\uffff}>";
    static final String[] dfa_20s = {
            "\1\14\1\33\1\34\2\35\1\1\1\13\10\uffff\1\35\2\uffff\5\35\1\25\2\35\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\2\uffff\1\35\1\uffff\1\31\3\35\1\32\1\35\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\25\35\1\4\1\5\1\6",
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
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1912:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'UNDEFINED' | 'undefined' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | '[' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL | RULE_PLAIN_TEXT_ONLY | RULE_PLAIN_TEXT_START )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) && (synpred14_InternalDmx())) {s = 1;}

                        else if ( (LA26_0==58) ) {s = 2;}

                        else if ( (LA26_0==59) ) {s = 3;}

                        else if ( (LA26_0==81) && (synpred14_InternalDmx())) {s = 4;}

                        else if ( (LA26_0==82) && (synpred14_InternalDmx())) {s = 5;}

                        else if ( (LA26_0==83) && (synpred14_InternalDmx())) {s = 6;}

                        else if ( (LA26_0==50) && (synpred14_InternalDmx())) {s = 7;}

                        else if ( (LA26_0==51) && (synpred14_InternalDmx())) {s = 8;}

                        else if ( (LA26_0==52) && (synpred14_InternalDmx())) {s = 9;}

                        else if ( (LA26_0==53) && (synpred14_InternalDmx())) {s = 10;}

                        else if ( (LA26_0==RULE_STRING) && (synpred14_InternalDmx())) {s = 11;}

                        else if ( (LA26_0==RULE_NATURAL) && (synpred14_InternalDmx())) {s = 12;}

                        else if ( (LA26_0==54) && (synpred14_InternalDmx())) {s = 13;}

                        else if ( (LA26_0==55) && (synpred14_InternalDmx())) {s = 14;}

                        else if ( (LA26_0==31) && (synpred14_InternalDmx())) {s = 15;}

                        else if ( (LA26_0==32) && (synpred14_InternalDmx())) {s = 16;}

                        else if ( (LA26_0==33) && (synpred14_InternalDmx())) {s = 17;}

                        else if ( (LA26_0==34) && (synpred14_InternalDmx())) {s = 18;}

                        else if ( (LA26_0==35) && (synpred14_InternalDmx())) {s = 19;}

                        else if ( (LA26_0==36) && (synpred14_InternalDmx())) {s = 20;}

                        else if ( (LA26_0==27) && (synpred14_InternalDmx())) {s = 21;}

                        else if ( (LA26_0==37) && (synpred14_InternalDmx())) {s = 22;}

                        else if ( (LA26_0==38) && (synpred14_InternalDmx())) {s = 23;}

                        else if ( (LA26_0==39) && (synpred14_InternalDmx())) {s = 24;}

                        else if ( (LA26_0==44) && (synpred14_InternalDmx())) {s = 25;}

                        else if ( (LA26_0==48) && (synpred14_InternalDmx())) {s = 26;}

                        else if ( (LA26_0==RULE_PLAIN_TEXT_ONLY) && (synpred14_InternalDmx())) {s = 27;}

                        else if ( (LA26_0==RULE_PLAIN_TEXT_START) && (synpred14_InternalDmx())) {s = 28;}

                        else if ( (LA26_0==EOF||(LA26_0>=RULE_PLAIN_TEXT_MIDDLE && LA26_0<=RULE_PLAIN_TEXT_END)||LA26_0==19||(LA26_0>=22 && LA26_0<=26)||(LA26_0>=28 && LA26_0<=29)||LA26_0==42||(LA26_0>=45 && LA26_0<=47)||LA26_0==49||(LA26_0>=60 && LA26_0<=80)) ) {s = 29;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDmx()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDmx()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0CFD10FF88000670L,0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0CFD10FF88000610L,0x00000000000E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L,0x00000000000007E0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000004C000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0CFD10FFA8000670L,0x00000000000E0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0CFD10FF88000672L,0x00000000000E0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000B0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C00000000000010L});

}