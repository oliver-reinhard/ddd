package com.mimacom.ddd.dm.dms.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dms.services.DmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NATURAL", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'global'", "'{'", "'}'", "'function'", "'('", "','", "')'", "':'", "'domain'", "'import'", "'.*'", "'.'", "'aggregate'", "'constraint'", "'primitive'", "'redefines'", "'enumeration'", "'abstract'", "'root'", "'relationship'", "'detail'", "'extends'", "'derived'", "'composite'", "'..'", "'key'", "'returns'", "'event'", "'triggered'", "'by'", "'before'", "'after'", "'condition'", "'notification'", "'sent'", "'to'", "'context'", "'human'", "'actor'", "'time'", "'application'", "'service'", "'kind'", "'precondition'", "'postcondition'", "'raises'", "'exception'", "':='", "'ISA'", "'isa'", "'AS'", "'as'", "'SELF'", "'self'", "'RETURN'", "'return'", "'RAISE'", "'raise'", "'NEW'", "'new'", "'if'", "'then'", "'else'", "'end'", "'for'", "'do'", "'*'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'NIL'", "'nil'", "'E'", "'e'", "'+'", "'-'", "'reference'", "'inverse'", "'SYNC'", "'ASYNC'", "'IN'", "'OUT'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=7;
    public static final int T__59=59;
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
    public static final int RULE_PLAIN_TEXT_END=10;
    public static final int RULE_ID=4;
    public static final int RULE_PLAIN_TEXT_START=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_PLAIN_TEXT_MIDDLE=9;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_NATURAL=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int RULE_PLAIN_TEXT=11;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDms.g"; }



     	private DmsGrammarAccess grammarAccess;

        public InternalDmsParser(TokenStream input, DmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DModel";
       	}

       	@Override
       	protected DmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDModel"
    // InternalDms.g:65:1: entryRuleDModel returns [EObject current=null] : iv_ruleDModel= ruleDModel EOF ;
    public final EObject entryRuleDModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDModel = null;


        try {
            // InternalDms.g:65:47: (iv_ruleDModel= ruleDModel EOF )
            // InternalDms.g:66:2: iv_ruleDModel= ruleDModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDModel=ruleDModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDModel; 
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
    // $ANTLR end "entryRuleDModel"


    // $ANTLR start "ruleDModel"
    // InternalDms.g:72:1: ruleDModel returns [EObject current=null] : ( () (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )? ( (lv_domain_6_0= ruleDDomain ) )? ) ;
    public final EObject ruleDModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_globalTypes_3_0 = null;

        EObject lv_globalFunctions_4_0 = null;

        EObject lv_domain_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:78:2: ( ( () (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )? ( (lv_domain_6_0= ruleDDomain ) )? ) )
            // InternalDms.g:79:2: ( () (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )? ( (lv_domain_6_0= ruleDDomain ) )? )
            {
            // InternalDms.g:79:2: ( () (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )? ( (lv_domain_6_0= ruleDDomain ) )? )
            // InternalDms.g:80:3: () (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )? ( (lv_domain_6_0= ruleDDomain ) )?
            {
            // InternalDms.g:80:3: ()
            // InternalDms.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDModelAccess().getDModelAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:87:3: (otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDms.g:88:4: otherlv_1= 'global' otherlv_2= '{' ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDModelAccess().getGlobalKeyword_1_0());
                      			
                    }
                    otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDModelAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalDms.g:96:4: ( ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) ) | ( (lv_globalFunctions_4_0= ruleDFunction ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==30||(LA1_0>=32 && LA1_0<=33)||LA1_0==36) ) {
                            alt1=1;
                        }
                        else if ( (LA1_0==19) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDms.g:97:5: ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) )
                    	    {
                    	    // InternalDms.g:97:5: ( (lv_globalTypes_3_0= ruleGlobalValueTypes ) )
                    	    // InternalDms.g:98:6: (lv_globalTypes_3_0= ruleGlobalValueTypes )
                    	    {
                    	    // InternalDms.g:98:6: (lv_globalTypes_3_0= ruleGlobalValueTypes )
                    	    // InternalDms.g:99:7: lv_globalTypes_3_0= ruleGlobalValueTypes
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDModelAccess().getGlobalTypesGlobalValueTypesParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_globalTypes_3_0=ruleGlobalValueTypes();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDModelRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"globalTypes",
                    	      								lv_globalTypes_3_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.GlobalValueTypes");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDms.g:117:5: ( (lv_globalFunctions_4_0= ruleDFunction ) )
                    	    {
                    	    // InternalDms.g:117:5: ( (lv_globalFunctions_4_0= ruleDFunction ) )
                    	    // InternalDms.g:118:6: (lv_globalFunctions_4_0= ruleDFunction )
                    	    {
                    	    // InternalDms.g:118:6: (lv_globalFunctions_4_0= ruleDFunction )
                    	    // InternalDms.g:119:7: lv_globalFunctions_4_0= ruleDFunction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDModelAccess().getGlobalFunctionsDFunctionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_globalFunctions_4_0=ruleDFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDModelRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"globalFunctions",
                    	      								lv_globalFunctions_4_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DFunction");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDModelAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:142:3: ( (lv_domain_6_0= ruleDDomain ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDms.g:143:4: (lv_domain_6_0= ruleDDomain )
                    {
                    // InternalDms.g:143:4: (lv_domain_6_0= ruleDDomain )
                    // InternalDms.g:144:5: lv_domain_6_0= ruleDDomain
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDModelAccess().getDomainDDomainParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_domain_6_0=ruleDDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDModelRule());
                      					}
                      					set(
                      						current,
                      						"domain",
                      						lv_domain_6_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DDomain");
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
    // $ANTLR end "ruleDModel"


    // $ANTLR start "entryRuleGlobalValueTypes"
    // InternalDms.g:165:1: entryRuleGlobalValueTypes returns [EObject current=null] : iv_ruleGlobalValueTypes= ruleGlobalValueTypes EOF ;
    public final EObject entryRuleGlobalValueTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalValueTypes = null;


        try {
            // InternalDms.g:165:57: (iv_ruleGlobalValueTypes= ruleGlobalValueTypes EOF )
            // InternalDms.g:166:2: iv_ruleGlobalValueTypes= ruleGlobalValueTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalValueTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalValueTypes=ruleGlobalValueTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalValueTypes; 
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
    // $ANTLR end "entryRuleGlobalValueTypes"


    // $ANTLR start "ruleGlobalValueTypes"
    // InternalDms.g:172:1: ruleGlobalValueTypes returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DDetailType_2= ruleDDetailType ) ;
    public final EObject ruleGlobalValueTypes() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DEnumeration_1 = null;

        EObject this_DDetailType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:178:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DDetailType_2= ruleDDetailType ) )
            // InternalDms.g:179:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DDetailType_2= ruleDDetailType )
            {
            // InternalDms.g:179:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DDetailType_2= ruleDDetailType )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDms.g:180:3: this_DPrimitive_0= ruleDPrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGlobalValueTypesAccess().getDPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitive_0=ruleDPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:189:3: this_DEnumeration_1= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGlobalValueTypesAccess().getDEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_1=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:198:3: this_DDetailType_2= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGlobalValueTypesAccess().getDDetailTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_2=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_2;
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
    // $ANTLR end "ruleGlobalValueTypes"


    // $ANTLR start "entryRuleDFunction"
    // InternalDms.g:210:1: entryRuleDFunction returns [EObject current=null] : iv_ruleDFunction= ruleDFunction EOF ;
    public final EObject entryRuleDFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunction = null;


        try {
            // InternalDms.g:210:50: (iv_ruleDFunction= ruleDFunction EOF )
            // InternalDms.g:211:2: iv_ruleDFunction= ruleDFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFunction=ruleDFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFunction; 
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
    // $ANTLR end "entryRuleDFunction"


    // $ANTLR start "ruleDFunction"
    // InternalDms.g:217:1: ruleDFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterNames_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )* otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameterNames_3_0=null;
        Token otherlv_4=null;
        Token lv_parameterNames_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_multiplicity_9_0 = null;



        	enterRule();

        try {
            // InternalDms.g:223:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterNames_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )* otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? ) )
            // InternalDms.g:224:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterNames_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )* otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? )
            {
            // InternalDms.g:224:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterNames_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )* otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )? )
            // InternalDms.g:225:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterNames_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )* otherlv_6= ')' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalDms.g:229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:230:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDFunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDms.g:251:3: ( (lv_parameterNames_3_0= RULE_STRING ) )
            // InternalDms.g:252:4: (lv_parameterNames_3_0= RULE_STRING )
            {
            // InternalDms.g:252:4: (lv_parameterNames_3_0= RULE_STRING )
            // InternalDms.g:253:5: lv_parameterNames_3_0= RULE_STRING
            {
            lv_parameterNames_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_parameterNames_3_0, grammarAccess.getDFunctionAccess().getParameterNamesSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              					addWithLastConsumed(
              						current,
              						"parameterNames",
              						lv_parameterNames_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.STRING");
              				
            }

            }


            }

            // InternalDms.g:269:3: (otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDms.g:270:4: otherlv_4= ',' ( (lv_parameterNames_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDFunctionAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDms.g:274:4: ( (lv_parameterNames_5_0= RULE_STRING ) )
            	    // InternalDms.g:275:5: (lv_parameterNames_5_0= RULE_STRING )
            	    {
            	    // InternalDms.g:275:5: (lv_parameterNames_5_0= RULE_STRING )
            	    // InternalDms.g:276:6: lv_parameterNames_5_0= RULE_STRING
            	    {
            	    lv_parameterNames_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_parameterNames_5_0, grammarAccess.getDFunctionAccess().getParameterNamesSTRINGTerminalRuleCall_4_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDFunctionRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"parameterNames",
            	      							lv_parameterNames_5_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.STRING");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_7=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDFunctionAccess().getColonKeyword_6());
              		
            }
            // InternalDms.g:301:3: ( (otherlv_8= RULE_ID ) )
            // InternalDms.g:302:4: (otherlv_8= RULE_ID )
            {
            // InternalDms.g:302:4: (otherlv_8= RULE_ID )
            // InternalDms.g:303:5: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getDFunctionAccess().getTypeDTypeCrossReference_7_0());
              				
            }

            }


            }

            // InternalDms.g:314:3: ( (lv_multiplicity_9_0= ruleDMultiplicity ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDms.g:315:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:315:4: (lv_multiplicity_9_0= ruleDMultiplicity )
                    // InternalDms.g:316:5: lv_multiplicity_9_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDFunctionAccess().getMultiplicityDMultiplicityParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_9_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDFunctionRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_9_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
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
    // $ANTLR end "ruleDFunction"


    // $ANTLR start "entryRuleDDomain"
    // InternalDms.g:337:1: entryRuleDDomain returns [EObject current=null] : iv_ruleDDomain= ruleDDomain EOF ;
    public final EObject entryRuleDDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomain = null;


        try {
            // InternalDms.g:337:48: (iv_ruleDDomain= ruleDDomain EOF )
            // InternalDms.g:338:2: iv_ruleDDomain= ruleDDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDomain=ruleDDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDomain; 
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
    // $ANTLR end "entryRuleDDomain"


    // $ANTLR start "ruleDDomain"
    // InternalDms.g:344:1: ruleDDomain returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_types_4_0 = null;

        EObject lv_aggregates_5_0 = null;

        EObject lv_applications_6_0 = null;

        EObject lv_events_7_0 = null;

        EObject lv_actors_8_0 = null;



        	enterRule();

        try {
            // InternalDms.g:350:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )* ) )
            // InternalDms.g:351:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )* )
            {
            // InternalDms.g:351:2: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )* )
            // InternalDms.g:352:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ( (lv_imports_3_0= ruleDImport ) )* ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainAccess().getDomainKeyword_0());
              		
            }
            // InternalDms.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDDomainAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:374:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_PLAIN_TEXT_ONLY && LA7_0<=RULE_PLAIN_TEXT_START)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDms.g:375:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:375:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:376:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:393:3: ( (lv_imports_3_0= ruleDImport ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDms.g:394:4: (lv_imports_3_0= ruleDImport )
            	    {
            	    // InternalDms.g:394:4: (lv_imports_3_0= ruleDImport )
            	    // InternalDms.g:395:5: lv_imports_3_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainAccess().getImportsDImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_imports_3_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDms.g:412:3: ( ( (lv_types_4_0= ruleDType ) ) | ( (lv_aggregates_5_0= ruleDAggregate ) ) | ( (lv_applications_6_0= ruleDExistingApplication ) ) | ( (lv_events_7_0= ruleDDomainEvent ) ) | ( (lv_actors_8_0= ruleDActor ) ) )*
            loop9:
            do {
                int alt9=6;
                switch ( input.LA(1) ) {
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    {
                    alt9=1;
                    }
                    break;
                case 28:
                    {
                    alt9=2;
                    }
                    break;
                case 56:
                    {
                    alt9=3;
                    }
                    break;
                case 43:
                    {
                    alt9=4;
                    }
                    break;
                case 53:
                case 55:
                case 57:
                    {
                    alt9=5;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalDms.g:413:4: ( (lv_types_4_0= ruleDType ) )
            	    {
            	    // InternalDms.g:413:4: ( (lv_types_4_0= ruleDType ) )
            	    // InternalDms.g:414:5: (lv_types_4_0= ruleDType )
            	    {
            	    // InternalDms.g:414:5: (lv_types_4_0= ruleDType )
            	    // InternalDms.g:415:6: lv_types_4_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getTypesDTypeParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_types_4_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_4_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:433:4: ( (lv_aggregates_5_0= ruleDAggregate ) )
            	    {
            	    // InternalDms.g:433:4: ( (lv_aggregates_5_0= ruleDAggregate ) )
            	    // InternalDms.g:434:5: (lv_aggregates_5_0= ruleDAggregate )
            	    {
            	    // InternalDms.g:434:5: (lv_aggregates_5_0= ruleDAggregate )
            	    // InternalDms.g:435:6: lv_aggregates_5_0= ruleDAggregate
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getAggregatesDAggregateParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_aggregates_5_0=ruleDAggregate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"aggregates",
            	      							lv_aggregates_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DAggregate");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDms.g:453:4: ( (lv_applications_6_0= ruleDExistingApplication ) )
            	    {
            	    // InternalDms.g:453:4: ( (lv_applications_6_0= ruleDExistingApplication ) )
            	    // InternalDms.g:454:5: (lv_applications_6_0= ruleDExistingApplication )
            	    {
            	    // InternalDms.g:454:5: (lv_applications_6_0= ruleDExistingApplication )
            	    // InternalDms.g:455:6: lv_applications_6_0= ruleDExistingApplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getApplicationsDExistingApplicationParserRuleCall_4_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_applications_6_0=ruleDExistingApplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"applications",
            	      							lv_applications_6_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DExistingApplication");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDms.g:473:4: ( (lv_events_7_0= ruleDDomainEvent ) )
            	    {
            	    // InternalDms.g:473:4: ( (lv_events_7_0= ruleDDomainEvent ) )
            	    // InternalDms.g:474:5: (lv_events_7_0= ruleDDomainEvent )
            	    {
            	    // InternalDms.g:474:5: (lv_events_7_0= ruleDDomainEvent )
            	    // InternalDms.g:475:6: lv_events_7_0= ruleDDomainEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getEventsDDomainEventParserRuleCall_4_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_events_7_0=ruleDDomainEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"events",
            	      							lv_events_7_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DDomainEvent");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDms.g:493:4: ( (lv_actors_8_0= ruleDActor ) )
            	    {
            	    // InternalDms.g:493:4: ( (lv_actors_8_0= ruleDActor ) )
            	    // InternalDms.g:494:5: (lv_actors_8_0= ruleDActor )
            	    {
            	    // InternalDms.g:494:5: (lv_actors_8_0= ruleDActor )
            	    // InternalDms.g:495:6: lv_actors_8_0= ruleDActor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getActorsDActorParserRuleCall_4_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_actors_8_0=ruleDActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actors",
            	      							lv_actors_8_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DActor");
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
    // $ANTLR end "ruleDDomain"


    // $ANTLR start "entryRuleDImport"
    // InternalDms.g:517:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDms.g:517:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDms.g:518:2: iv_ruleDImport= ruleDImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDImport=ruleDImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDImport; 
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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalDms.g:524:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:530:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDms.g:531:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDms.g:531:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDms.g:532:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDms.g:536:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDms.g:537:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDms.g:537:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDms.g:538:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDImportAccess().getImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleDQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"com.mimacom.ddd.dm.dms.Dms.DQualifiedNameWithWildcard");
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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleDQualifiedNameWithWildcard"
    // InternalDms.g:559:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDms.g:559:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDms.g:560:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQualifiedNameWithWildcard=ruleDQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleDQualifiedNameWithWildcard"


    // $ANTLR start "ruleDQualifiedNameWithWildcard"
    // InternalDms.g:566:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDms.g:572:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDms.g:573:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDms.g:573:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDms.g:574:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:584:3: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDms.g:585:4: kw= '.*'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getDQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
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
    // $ANTLR end "ruleDQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDms.g:595:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDms.g:595:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDms.g:596:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDms.g:602:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDms.g:608:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDms.g:609:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDms.g:609:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDms.g:610:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDms.g:617:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDms.g:618:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDAggregate"
    // InternalDms.g:635:1: entryRuleDAggregate returns [EObject current=null] : iv_ruleDAggregate= ruleDAggregate EOF ;
    public final EObject entryRuleDAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAggregate = null;


        try {
            // InternalDms.g:635:51: (iv_ruleDAggregate= ruleDAggregate EOF )
            // InternalDms.g:636:2: iv_ruleDAggregate= ruleDAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAggregateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAggregate=ruleDAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAggregate; 
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
    // $ANTLR end "entryRuleDAggregate"


    // $ANTLR start "ruleDAggregate"
    // InternalDms.g:642:1: ruleDAggregate returns [EObject current=null] : ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) ;
    public final EObject ruleDAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_description_2_0 = null;

        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:648:2: ( ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' ) )
            // InternalDms.g:649:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            {
            // InternalDms.g:649:2: ( () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}' )
            // InternalDms.g:650:3: () otherlv_1= 'aggregate' ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( (lv_types_4_0= ruleDType ) )* otherlv_5= '}'
            {
            // InternalDms.g:650:3: ()
            // InternalDms.g:651:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDAggregateAccess().getDAggregateAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDAggregateAccess().getAggregateKeyword_1());
              		
            }
            // InternalDms.g:661:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_PLAIN_TEXT_ONLY && LA12_0<=RULE_PLAIN_TEXT_START)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDms.g:662:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:662:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:663:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAggregateAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDAggregateAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:684:3: ( (lv_types_4_0= ruleDType ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30||(LA13_0>=32 && LA13_0<=36)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDms.g:685:4: (lv_types_4_0= ruleDType )
            	    {
            	    // InternalDms.g:685:4: (lv_types_4_0= ruleDType )
            	    // InternalDms.g:686:5: lv_types_4_0= ruleDType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDAggregateAccess().getTypesDTypeParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_types_4_0=ruleDType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDAggregateRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_4_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DType");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDAggregateAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDAggregate"


    // $ANTLR start "entryRuleDType"
    // InternalDms.g:711:1: entryRuleDType returns [EObject current=null] : iv_ruleDType= ruleDType EOF ;
    public final EObject entryRuleDType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDType = null;


        try {
            // InternalDms.g:711:46: (iv_ruleDType= ruleDType EOF )
            // InternalDms.g:712:2: iv_ruleDType= ruleDType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDType=ruleDType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDType; 
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
    // $ANTLR end "entryRuleDType"


    // $ANTLR start "ruleDType"
    // InternalDms.g:718:1: ruleDType returns [EObject current=null] : (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType ) ;
    public final EObject ruleDType() throws RecognitionException {
        EObject current = null;

        EObject this_DPrimitive_0 = null;

        EObject this_DEnumeration_1 = null;

        EObject this_DRootType_2 = null;

        EObject this_DRelationship_3 = null;

        EObject this_DDetailType_4 = null;



        	enterRule();

        try {
            // InternalDms.g:724:2: ( (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType ) )
            // InternalDms.g:725:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType )
            {
            // InternalDms.g:725:2: (this_DPrimitive_0= ruleDPrimitive | this_DEnumeration_1= ruleDEnumeration | this_DRootType_2= ruleDRootType | this_DRelationship_3= ruleDRelationship | this_DDetailType_4= ruleDDetailType )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt14=5;
                    }
                    break;
                case 34:
                    {
                    alt14=3;
                    }
                    break;
                case 35:
                    {
                    alt14=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDms.g:726:3: this_DPrimitive_0= ruleDPrimitive
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDPrimitiveParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DPrimitive_0=ruleDPrimitive();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DPrimitive_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:735:3: this_DEnumeration_1= ruleDEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DEnumeration_1=ruleDEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DEnumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:744:3: this_DRootType_2= ruleDRootType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRootTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRootType_2=ruleDRootType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRootType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:753:3: this_DRelationship_3= ruleDRelationship
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDRelationshipParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRelationship_3=ruleDRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRelationship_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDms.g:762:3: this_DDetailType_4= ruleDDetailType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDTypeAccess().getDDetailTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DDetailType_4=ruleDDetailType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DDetailType_4;
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
    // $ANTLR end "ruleDType"


    // $ANTLR start "entryRuleDConstraint"
    // InternalDms.g:774:1: entryRuleDConstraint returns [EObject current=null] : iv_ruleDConstraint= ruleDConstraint EOF ;
    public final EObject entryRuleDConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstraint = null;


        try {
            // InternalDms.g:774:52: (iv_ruleDConstraint= ruleDConstraint EOF )
            // InternalDms.g:775:2: iv_ruleDConstraint= ruleDConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDConstraint=ruleDConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDConstraint; 
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
    // $ANTLR end "entryRuleDConstraint"


    // $ANTLR start "ruleDConstraint"
    // InternalDms.g:781:1: ruleDConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:787:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDms.g:788:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDms.g:788:2: (otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDms.g:789:3: otherlv_0= 'constraint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConstraintAccess().getConstraintKeyword_0());
              		
            }
            // InternalDms.g:793:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:794:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:794:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:795:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDConstraintAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstraintRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDConstraintAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:815:3: ( (lv_condition_3_0= ruleDExpression ) )
            // InternalDms.g:816:4: (lv_condition_3_0= ruleDExpression )
            {
            // InternalDms.g:816:4: (lv_condition_3_0= ruleDExpression )
            // InternalDms.g:817:5: lv_condition_3_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConstraintAccess().getConditionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_condition_3_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConstraintRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:834:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_PLAIN_TEXT_ONLY && LA15_0<=RULE_PLAIN_TEXT_START)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDms.g:835:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDms.g:835:4: (lv_description_4_0= ruleDRichText )
                    // InternalDms.g:836:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConstraintAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConstraintRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDConstraint"


    // $ANTLR start "entryRuleDPrimitive"
    // InternalDms.g:857:1: entryRuleDPrimitive returns [EObject current=null] : iv_ruleDPrimitive= ruleDPrimitive EOF ;
    public final EObject entryRuleDPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimitive = null;


        try {
            // InternalDms.g:857:51: (iv_ruleDPrimitive= ruleDPrimitive EOF )
            // InternalDms.g:858:2: iv_ruleDPrimitive= ruleDPrimitive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDPrimitiveRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDPrimitive=ruleDPrimitive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDPrimitive; 
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
    // $ANTLR end "entryRuleDPrimitive"


    // $ANTLR start "ruleDPrimitive"
    // InternalDms.g:864:1: ruleDPrimitive returns [EObject current=null] : (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDPrimitive() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_description_2_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:870:2: ( (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' ) )
            // InternalDms.g:871:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            {
            // InternalDms.g:871:2: (otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}' )
            // InternalDms.g:872:3: otherlv_0= 'primitive' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )? ( (lv_constraints_6_0= ruleDConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDPrimitiveAccess().getPrimitiveKeyword_0());
              		
            }
            // InternalDms.g:876:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:877:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:877:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:878:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDPrimitiveAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDPrimitiveRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:894:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_PLAIN_TEXT_ONLY && LA16_0<=RULE_PLAIN_TEXT_START)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDms.g:895:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:895:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:896:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDPrimitiveAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:917:3: (otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDms.g:918:4: otherlv_4= 'redefines' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDPrimitiveAccess().getRedefinesKeyword_4_0());
                      			
                    }
                    // InternalDms.g:922:4: ( (otherlv_5= RULE_ID ) )
                    // InternalDms.g:923:5: (otherlv_5= RULE_ID )
                    {
                    // InternalDms.g:923:5: (otherlv_5= RULE_ID )
                    // InternalDms.g:924:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDPrimitiveRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getDPrimitiveAccess().getRedefinesDPrimitiveCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:936:3: ( (lv_constraints_6_0= ruleDConstraint ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDms.g:937:4: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:937:4: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDms.g:938:5: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDPrimitiveAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDPrimitiveRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_6_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDPrimitiveAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDPrimitive"


    // $ANTLR start "entryRuleDEnumeration"
    // InternalDms.g:963:1: entryRuleDEnumeration returns [EObject current=null] : iv_ruleDEnumeration= ruleDEnumeration EOF ;
    public final EObject entryRuleDEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEnumeration = null;


        try {
            // InternalDms.g:963:53: (iv_ruleDEnumeration= ruleDEnumeration EOF )
            // InternalDms.g:964:2: iv_ruleDEnumeration= ruleDEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDEnumeration=ruleDEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDEnumeration; 
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
    // $ANTLR end "entryRuleDEnumeration"


    // $ANTLR start "ruleDEnumeration"
    // InternalDms.g:970:1: ruleDEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' ) ;
    public final EObject ruleDEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_description_2_0 = null;

        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_constraints_7_0 = null;



        	enterRule();

        try {
            // InternalDms.g:976:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' ) )
            // InternalDms.g:977:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' )
            {
            // InternalDms.g:977:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}' )
            // InternalDms.g:978:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )? ( (lv_constraints_7_0= ruleDConstraint ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalDms.g:982:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:983:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:983:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:984:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDEnumerationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1000:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_PLAIN_TEXT_ONLY && LA19_0<=RULE_PLAIN_TEXT_START)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDms.g:1001:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:1001:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:1002:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDEnumerationAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDEnumerationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:1023:3: ( ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDms.g:1024:4: ( (lv_literals_4_0= ruleDLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )*
                    {
                    // InternalDms.g:1024:4: ( (lv_literals_4_0= ruleDLiteral ) )
                    // InternalDms.g:1025:5: (lv_literals_4_0= ruleDLiteral )
                    {
                    // InternalDms.g:1025:5: (lv_literals_4_0= ruleDLiteral )
                    // InternalDms.g:1026:6: lv_literals_4_0= ruleDLiteral
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_literals_4_0=ruleDLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                      						}
                      						add(
                      							current,
                      							"literals",
                      							lv_literals_4_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DLiteral");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:1043:4: (otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDms.g:1044:5: otherlv_5= ',' ( (lv_literals_6_0= ruleDLiteral ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getDEnumerationAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:1048:5: ( (lv_literals_6_0= ruleDLiteral ) )
                    	    // InternalDms.g:1049:6: (lv_literals_6_0= ruleDLiteral )
                    	    {
                    	    // InternalDms.g:1049:6: (lv_literals_6_0= ruleDLiteral )
                    	    // InternalDms.g:1050:7: lv_literals_6_0= ruleDLiteral
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDEnumerationAccess().getLiteralsDLiteralParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_literals_6_0=ruleDLiteral();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDEnumerationRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"literals",
                    	      								lv_literals_6_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DLiteral");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDms.g:1069:3: ( (lv_constraints_7_0= ruleDConstraint ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDms.g:1070:4: (lv_constraints_7_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:1070:4: (lv_constraints_7_0= ruleDConstraint )
            	    // InternalDms.g:1071:5: lv_constraints_7_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDEnumerationAccess().getConstraintsDConstraintParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_constraints_7_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"constraints",
            	      						lv_constraints_7_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDEnumerationAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleDEnumeration"


    // $ANTLR start "entryRuleDLiteral"
    // InternalDms.g:1096:1: entryRuleDLiteral returns [EObject current=null] : iv_ruleDLiteral= ruleDLiteral EOF ;
    public final EObject entryRuleDLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteral = null;


        try {
            // InternalDms.g:1096:49: (iv_ruleDLiteral= ruleDLiteral EOF )
            // InternalDms.g:1097:2: iv_ruleDLiteral= ruleDLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDLiteral=ruleDLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDLiteral; 
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
    // $ANTLR end "entryRuleDLiteral"


    // $ANTLR start "ruleDLiteral"
    // InternalDms.g:1103:1: ruleDLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? ) ;
    public final EObject ruleDLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1109:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? ) )
            // InternalDms.g:1110:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1110:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )? )
            // InternalDms.g:1111:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_description_1_0= ruleDRichText ) )?
            {
            // InternalDms.g:1111:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1112:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1112:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1113:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDLiteralAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1129:3: ( (lv_description_1_0= ruleDRichText ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_PLAIN_TEXT_ONLY && LA23_0<=RULE_PLAIN_TEXT_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDms.g:1130:4: (lv_description_1_0= ruleDRichText )
                    {
                    // InternalDms.g:1130:4: (lv_description_1_0= ruleDRichText )
                    // InternalDms.g:1131:5: lv_description_1_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDLiteralAccess().getDescriptionDRichTextParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_1_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDLiteralRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_1_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDLiteral"


    // $ANTLR start "entryRuleDRootType"
    // InternalDms.g:1152:1: entryRuleDRootType returns [EObject current=null] : iv_ruleDRootType= ruleDRootType EOF ;
    public final EObject entryRuleDRootType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRootType = null;


        try {
            // InternalDms.g:1152:50: (iv_ruleDRootType= ruleDRootType EOF )
            // InternalDms.g:1153:2: iv_ruleDRootType= ruleDRootType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRootTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRootType=ruleDRootType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRootType; 
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
    // $ANTLR end "entryRuleDRootType"


    // $ANTLR start "ruleDRootType"
    // InternalDms.g:1159:1: ruleDRootType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRootType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:1165:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:1166:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:1166:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:1167:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'root' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:1167:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDms.g:1168:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:1168:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:1169:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDRootTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRootTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDRootTypeAccess().getRootKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRootTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDRootTypeAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleDRootType"


    // $ANTLR start "entryRuleDRelationship"
    // InternalDms.g:1200:1: entryRuleDRelationship returns [EObject current=null] : iv_ruleDRelationship= ruleDRelationship EOF ;
    public final EObject entryRuleDRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationship = null;


        try {
            // InternalDms.g:1200:54: (iv_ruleDRelationship= ruleDRelationship EOF )
            // InternalDms.g:1201:2: iv_ruleDRelationship= ruleDRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDRelationship=ruleDRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDRelationship; 
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
    // $ANTLR end "entryRuleDRelationship"


    // $ANTLR start "ruleDRelationship"
    // InternalDms.g:1207:1: ruleDRelationship returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:1213:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:1214:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:1214:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:1215:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'relationship' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:1215:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDms.g:1216:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:1216:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:1217:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDRelationshipAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDRelationshipAccess().getRelationshipKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDRelationshipRule());
              			}
              			newCompositeNode(grammarAccess.getDRelationshipAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleDRelationship"


    // $ANTLR start "entryRuleDDetailType"
    // InternalDms.g:1248:1: entryRuleDDetailType returns [EObject current=null] : iv_ruleDDetailType= ruleDDetailType EOF ;
    public final EObject entryRuleDDetailType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDetailType = null;


        try {
            // InternalDms.g:1248:52: (iv_ruleDDetailType= ruleDDetailType EOF )
            // InternalDms.g:1249:2: iv_ruleDDetailType= ruleDDetailType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDetailTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDetailType=ruleDDetailType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDetailType; 
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
    // $ANTLR end "entryRuleDDetailType"


    // $ANTLR start "ruleDDetailType"
    // InternalDms.g:1255:1: ruleDDetailType returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) ;
    public final EObject ruleDDetailType() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        EObject this_DComplexType_2 = null;



        	enterRule();

        try {
            // InternalDms.g:1261:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] ) )
            // InternalDms.g:1262:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            {
            // InternalDms.g:1262:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current] )
            // InternalDms.g:1263:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'detail' this_DComplexType_2= ruleDComplexType[$current]
            {
            // InternalDms.g:1263:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDms.g:1264:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalDms.g:1264:4: (lv_abstract_0_0= 'abstract' )
                    // InternalDms.g:1265:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getDDetailTypeAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDDetailTypeRule());
                      					}
                      					setWithLastConsumed(current, "abstract", true, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDDetailTypeAccess().getDetailKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getDDetailTypeRule());
              			}
              			newCompositeNode(grammarAccess.getDDetailTypeAccess().getDComplexTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_DComplexType_2=ruleDComplexType(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DComplexType_2;
              			afterParserOrEnumRuleCall();
              		
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
    // $ANTLR end "ruleDDetailType"


    // $ANTLR start "ruleDComplexType"
    // InternalDms.g:1297:1: ruleDComplexType[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDComplexType(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_description_3_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_constraints_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1303:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' ) )
            // InternalDms.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            {
            // InternalDms.g:1304:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}' )
            // InternalDms.g:1305:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )? ( (lv_description_3_0= ruleDRichText ) )? otherlv_4= '{' ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )* otherlv_7= '}'
            {
            // InternalDms.g:1305:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1306:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1306:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1307:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDComplexTypeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDComplexTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:1323:3: (otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDms.g:1324:4: otherlv_1= 'extends' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDComplexTypeAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalDms.g:1328:4: ( (otherlv_2= RULE_ID ) )
                    // InternalDms.g:1329:5: (otherlv_2= RULE_ID )
                    {
                    // InternalDms.g:1329:5: (otherlv_2= RULE_ID )
                    // InternalDms.g:1330:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDComplexTypeRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getDComplexTypeAccess().getSuperTypeDComplexTypeCrossReference_1_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:1342:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_PLAIN_TEXT_ONLY && LA28_0<=RULE_PLAIN_TEXT_START)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDms.g:1343:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDms.g:1343:4: (lv_description_3_0= ruleDRichText )
                    // InternalDms.g:1344:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDComplexTypeAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDComplexTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:1365:3: ( ( (lv_features_5_0= ruleDFeature ) ) | ( (lv_constraints_6_0= ruleDConstraint ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==36||(LA29_0>=38 && LA29_0<=39)||(LA29_0>=93 && LA29_0<=94)) ) {
                    alt29=1;
                }
                else if ( (LA29_0==29) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDms.g:1366:4: ( (lv_features_5_0= ruleDFeature ) )
            	    {
            	    // InternalDms.g:1366:4: ( (lv_features_5_0= ruleDFeature ) )
            	    // InternalDms.g:1367:5: (lv_features_5_0= ruleDFeature )
            	    {
            	    // InternalDms.g:1367:5: (lv_features_5_0= ruleDFeature )
            	    // InternalDms.g:1368:6: lv_features_5_0= ruleDFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getFeaturesDFeatureParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_features_5_0=ruleDFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"features",
            	      							lv_features_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DFeature");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:1386:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    {
            	    // InternalDms.g:1386:4: ( (lv_constraints_6_0= ruleDConstraint ) )
            	    // InternalDms.g:1387:5: (lv_constraints_6_0= ruleDConstraint )
            	    {
            	    // InternalDms.g:1387:5: (lv_constraints_6_0= ruleDConstraint )
            	    // InternalDms.g:1388:6: lv_constraints_6_0= ruleDConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDComplexTypeAccess().getConstraintsDConstraintParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_constraints_6_0=ruleDConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDComplexTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_6_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDComplexTypeAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDComplexType"


    // $ANTLR start "entryRuleDFeature"
    // InternalDms.g:1414:1: entryRuleDFeature returns [EObject current=null] : iv_ruleDFeature= ruleDFeature EOF ;
    public final EObject entryRuleDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFeature = null;


        try {
            // InternalDms.g:1414:49: (iv_ruleDFeature= ruleDFeature EOF )
            // InternalDms.g:1415:2: iv_ruleDFeature= ruleDFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDFeature=ruleDFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDFeature; 
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
    // $ANTLR end "entryRuleDFeature"


    // $ANTLR start "ruleDFeature"
    // InternalDms.g:1421:1: ruleDFeature returns [EObject current=null] : (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) ;
    public final EObject ruleDFeature() throws RecognitionException {
        EObject current = null;

        EObject this_DAssociation_0 = null;

        EObject this_DAttribute_1 = null;

        EObject this_DQuery_2 = null;



        	enterRule();

        try {
            // InternalDms.g:1427:2: ( (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery ) )
            // InternalDms.g:1428:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            {
            // InternalDms.g:1428:2: (this_DAssociation_0= ruleDAssociation | this_DAttribute_1= ruleDAttribute | this_DQuery_2= ruleDQuery )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
            case 93:
            case 94:
                {
                alt30=1;
                }
                break;
            case 36:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==20) ) {
                    alt30=3;
                }
                else if ( (LA30_3==23) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalDms.g:1429:3: this_DAssociation_0= ruleDAssociation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDAssociationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAssociation_0=ruleDAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAssociation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:1438:3: this_DAttribute_1= ruleDAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDAttributeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DAttribute_1=ruleDAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DAttribute_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:1447:3: this_DQuery_2= ruleDQuery
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDFeatureAccess().getDQueryParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DQuery_2=ruleDQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DQuery_2;
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
    // $ANTLR end "ruleDFeature"


    // $ANTLR start "entryRuleDAssociation"
    // InternalDms.g:1459:1: entryRuleDAssociation returns [EObject current=null] : iv_ruleDAssociation= ruleDAssociation EOF ;
    public final EObject entryRuleDAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssociation = null;


        try {
            // InternalDms.g:1459:53: (iv_ruleDAssociation= ruleDAssociation EOF )
            // InternalDms.g:1460:2: iv_ruleDAssociation= ruleDAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAssociation=ruleDAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAssociation; 
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
    // $ANTLR end "entryRuleDAssociation"


    // $ANTLR start "ruleDAssociation"
    // InternalDms.g:1466:1: ruleDAssociation returns [EObject current=null] : ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_derived_0_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        EObject lv_multiplicity_7_0 = null;

        EObject lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1472:2: ( ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDms.g:1473:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1473:2: ( ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDms.g:1474:3: ( (lv_derived_0_0= 'derived' ) )? ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_description_8_0= ruleDRichText ) )?
            {
            // InternalDms.g:1474:3: ( (lv_derived_0_0= 'derived' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDms.g:1475:4: (lv_derived_0_0= 'derived' )
                    {
                    // InternalDms.g:1475:4: (lv_derived_0_0= 'derived' )
                    // InternalDms.g:1476:5: lv_derived_0_0= 'derived'
                    {
                    lv_derived_0_0=(Token)match(input,38,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_derived_0_0, grammarAccess.getDAssociationAccess().getDerivedDerivedKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAssociationRule());
                      					}
                      					setWithLastConsumed(current, "derived", true, "derived");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1488:3: ( ( (lv_kind_1_0= ruleDAssociationKind ) ) | ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39||LA32_0==93) ) {
                alt32=1;
            }
            else if ( (LA32_0==94) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalDms.g:1489:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    {
                    // InternalDms.g:1489:4: ( (lv_kind_1_0= ruleDAssociationKind ) )
                    // InternalDms.g:1490:5: (lv_kind_1_0= ruleDAssociationKind )
                    {
                    // InternalDms.g:1490:5: (lv_kind_1_0= ruleDAssociationKind )
                    // InternalDms.g:1491:6: lv_kind_1_0= ruleDAssociationKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindEnumRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_kind_1_0=ruleDAssociationKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      						}
                      						set(
                      							current,
                      							"kind",
                      							lv_kind_1_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DAssociationKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:1509:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    {
                    // InternalDms.g:1509:4: ( ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite' )
                    // InternalDms.g:1510:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) ) otherlv_3= 'composite'
                    {
                    // InternalDms.g:1510:5: ( (lv_kind_2_0= ruleDAssociationKindInverse ) )
                    // InternalDms.g:1511:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    {
                    // InternalDms.g:1511:6: (lv_kind_2_0= ruleDAssociationKindInverse )
                    // InternalDms.g:1512:7: lv_kind_2_0= ruleDAssociationKindInverse
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDAssociationAccess().getKindDAssociationKindInverseEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_31);
                    lv_kind_2_0=ruleDAssociationKindInverse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      							}
                      							set(
                      								current,
                      								"kind",
                      								lv_kind_2_0,
                      								"com.mimacom.ddd.dm.dms.Dms.DAssociationKindInverse");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDAssociationAccess().getCompositeKeyword_1_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1535:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalDms.g:1536:4: (lv_name_4_0= RULE_ID )
            {
            // InternalDms.g:1536:4: (lv_name_4_0= RULE_ID )
            // InternalDms.g:1537:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getDAssociationAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDAssociationAccess().getColonKeyword_3());
              		
            }
            // InternalDms.g:1557:3: ( (otherlv_6= RULE_ID ) )
            // InternalDms.g:1558:4: (otherlv_6= RULE_ID )
            {
            // InternalDms.g:1558:4: (otherlv_6= RULE_ID )
            // InternalDms.g:1559:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDAssociationRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDAssociationAccess().getTypeDRootTypeCrossReference_4_0());
              				
            }

            }


            }

            // InternalDms.g:1570:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDms.g:1571:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1571:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDms.g:1572:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getMultiplicityDMultiplicityParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_7_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_7_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1589:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_PLAIN_TEXT_ONLY && LA34_0<=RULE_PLAIN_TEXT_START)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDms.g:1590:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDms.g:1590:4: (lv_description_8_0= ruleDRichText )
                    // InternalDms.g:1591:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAssociationAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAssociationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_8_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDAssociation"


    // $ANTLR start "entryRuleDMultiplicity"
    // InternalDms.g:1612:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDms.g:1612:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDms.g:1613:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMultiplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDMultiplicity=ruleDMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMultiplicity; 
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
    // $ANTLR end "entryRuleDMultiplicity"


    // $ANTLR start "ruleDMultiplicity"
    // InternalDms.g:1619:1: ruleDMultiplicity returns [EObject current=null] : (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOccurs_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_maxOccurs_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1625:2: ( (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' ) )
            // InternalDms.g:1626:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            {
            // InternalDms.g:1626:2: (otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')' )
            // InternalDms.g:1627:3: otherlv_0= '(' ( (lv_minOccurs_1_0= RULE_NATURAL ) ) otherlv_2= '..' ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDms.g:1631:3: ( (lv_minOccurs_1_0= RULE_NATURAL ) )
            // InternalDms.g:1632:4: (lv_minOccurs_1_0= RULE_NATURAL )
            {
            // InternalDms.g:1632:4: (lv_minOccurs_1_0= RULE_NATURAL )
            // InternalDms.g:1633:5: lv_minOccurs_1_0= RULE_NATURAL
            {
            lv_minOccurs_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_minOccurs_1_0, grammarAccess.getDMultiplicityAccess().getMinOccursNATURALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDMultiplicityRule());
              					}
              					setWithLastConsumed(
              						current,
              						"minOccurs",
              						lv_minOccurs_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.NATURAL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_2());
              		
            }
            // InternalDms.g:1653:3: ( (lv_maxOccurs_3_0= ruleMULTIPLICITY ) )
            // InternalDms.g:1654:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            {
            // InternalDms.g:1654:4: (lv_maxOccurs_3_0= ruleMULTIPLICITY )
            // InternalDms.g:1655:5: lv_maxOccurs_3_0= ruleMULTIPLICITY
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_maxOccurs_3_0=ruleMULTIPLICITY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDMultiplicityRule());
              					}
              					set(
              						current,
              						"maxOccurs",
              						lv_maxOccurs_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.MULTIPLICITY");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDMultiplicityAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDMultiplicity"


    // $ANTLR start "entryRuleDAttribute"
    // InternalDms.g:1680:1: entryRuleDAttribute returns [EObject current=null] : iv_ruleDAttribute= ruleDAttribute EOF ;
    public final EObject entryRuleDAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAttribute = null;


        try {
            // InternalDms.g:1680:51: (iv_ruleDAttribute= ruleDAttribute EOF )
            // InternalDms.g:1681:2: iv_ruleDAttribute= ruleDAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDAttribute=ruleDAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDAttribute; 
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
    // $ANTLR end "entryRuleDAttribute"


    // $ANTLR start "ruleDAttribute"
    // InternalDms.g:1687:1: ruleDAttribute returns [EObject current=null] : ( ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) ;
    public final EObject ruleDAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_key_8_0=null;
        EObject lv_multiplicity_7_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1693:2: ( ( ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? ) )
            // InternalDms.g:1694:2: ( ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1694:2: ( ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )? )
            // InternalDms.g:1695:3: ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) ) ( (lv_multiplicity_7_0= ruleDMultiplicity ) )? ( (lv_key_8_0= 'key' ) )? ( (lv_description_9_0= ruleDRichText ) )?
            {
            // InternalDms.g:1695:3: ( (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDms.g:1696:4: (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalDms.g:1696:4: (otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
                    // InternalDms.g:1697:5: otherlv_0= 'detail' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getDAttributeAccess().getDetailKeyword_0_0_0());
                      				
                    }
                    // InternalDms.g:1701:5: ( (lv_name_1_0= RULE_ID ) )
                    // InternalDms.g:1702:6: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDms.g:1702:6: (lv_name_1_0= RULE_ID )
                    // InternalDms.g:1703:7: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_1_0, grammarAccess.getDAttributeAccess().getNameIDTerminalRuleCall_0_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDAttributeRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_1_0,
                      								"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getDAttributeAccess().getColonKeyword_0_0_2());
                      				
                    }
                    // InternalDms.g:1723:5: ( (otherlv_3= RULE_ID ) )
                    // InternalDms.g:1724:6: (otherlv_3= RULE_ID )
                    {
                    // InternalDms.g:1724:6: (otherlv_3= RULE_ID )
                    // InternalDms.g:1725:7: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDAttributeRule());
                      							}
                      						
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_3, grammarAccess.getDAttributeAccess().getTypeDDetailTypeCrossReference_0_0_3_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:1738:4: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalDms.g:1738:4: ( ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )
                    // InternalDms.g:1739:5: ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ':' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalDms.g:1739:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalDms.g:1740:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalDms.g:1740:6: (lv_name_4_0= RULE_ID )
                    // InternalDms.g:1741:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_4_0, grammarAccess.getDAttributeAccess().getNameIDTerminalRuleCall_0_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDAttributeRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_4_0,
                      								"com.mimacom.ddd.dm.dmx.Dmx.ID");
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDAttributeAccess().getColonKeyword_0_1_1());
                      				
                    }
                    // InternalDms.g:1761:5: ( (otherlv_6= RULE_ID ) )
                    // InternalDms.g:1762:6: (otherlv_6= RULE_ID )
                    {
                    // InternalDms.g:1762:6: (otherlv_6= RULE_ID )
                    // InternalDms.g:1763:7: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDAttributeRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getDAttributeAccess().getTypeDSimpleTypeCrossReference_0_1_2_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:1776:3: ( (lv_multiplicity_7_0= ruleDMultiplicity ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDms.g:1777:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1777:4: (lv_multiplicity_7_0= ruleDMultiplicity )
                    // InternalDms.g:1778:5: lv_multiplicity_7_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getMultiplicityDMultiplicityParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_38);
                    lv_multiplicity_7_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_7_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1795:3: ( (lv_key_8_0= 'key' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDms.g:1796:4: (lv_key_8_0= 'key' )
                    {
                    // InternalDms.g:1796:4: (lv_key_8_0= 'key' )
                    // InternalDms.g:1797:5: lv_key_8_0= 'key'
                    {
                    lv_key_8_0=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_key_8_0, grammarAccess.getDAttributeAccess().getKeyKeyKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDAttributeRule());
                      					}
                      					setWithLastConsumed(current, "key", true, "key");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1809:3: ( (lv_description_9_0= ruleDRichText ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_PLAIN_TEXT_ONLY && LA38_0<=RULE_PLAIN_TEXT_START)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDms.g:1810:4: (lv_description_9_0= ruleDRichText )
                    {
                    // InternalDms.g:1810:4: (lv_description_9_0= ruleDRichText )
                    // InternalDms.g:1811:5: lv_description_9_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDAttributeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDAttributeRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_9_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDAttribute"


    // $ANTLR start "entryRuleDQuery"
    // InternalDms.g:1832:1: entryRuleDQuery returns [EObject current=null] : iv_ruleDQuery= ruleDQuery EOF ;
    public final EObject entryRuleDQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQuery = null;


        try {
            // InternalDms.g:1832:47: (iv_ruleDQuery= ruleDQuery EOF )
            // InternalDms.g:1833:2: iv_ruleDQuery= ruleDQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQuery=ruleDQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQuery; 
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
    // $ANTLR end "entryRuleDQuery"


    // $ANTLR start "ruleDQuery"
    // InternalDms.g:1839:1: ruleDQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_multiplicity_8_0 = null;

        EObject lv_returns_10_0 = null;

        EObject lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDms.g:1845:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? ) )
            // InternalDms.g:1846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? )
            {
            // InternalDms.g:1846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )? )
            // InternalDms.g:1847:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (otherlv_7= RULE_ID ) ) ( (lv_multiplicity_8_0= ruleDMultiplicity ) )? (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )? ( (lv_description_11_0= ruleDRichText ) )?
            {
            // InternalDms.g:1847:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:1848:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:1848:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:1849:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDQueryAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDms.g:1869:3: ( ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDms.g:1870:4: ( (lv_parameters_2_0= ruleDQueryParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )*
                    {
                    // InternalDms.g:1870:4: ( (lv_parameters_2_0= ruleDQueryParameter ) )
                    // InternalDms.g:1871:5: (lv_parameters_2_0= ruleDQueryParameter )
                    {
                    // InternalDms.g:1871:5: (lv_parameters_2_0= ruleDQueryParameter )
                    // InternalDms.g:1872:6: lv_parameters_2_0= ruleDQueryParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_parameters_2_0=ruleDQueryParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DQueryParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:1889:4: (otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==21) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalDms.g:1890:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDQueryAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:1894:5: ( (lv_parameters_4_0= ruleDQueryParameter ) )
                    	    // InternalDms.g:1895:6: (lv_parameters_4_0= ruleDQueryParameter )
                    	    {
                    	    // InternalDms.g:1895:6: (lv_parameters_4_0= ruleDQueryParameter )
                    	    // InternalDms.g:1896:7: lv_parameters_4_0= ruleDQueryParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDQueryAccess().getParametersDQueryParameterParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_4_0=ruleDQueryParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDQueryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DQueryParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDQueryAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDQueryAccess().getColonKeyword_4());
              		
            }
            // InternalDms.g:1923:3: ( (otherlv_7= RULE_ID ) )
            // InternalDms.g:1924:4: (otherlv_7= RULE_ID )
            {
            // InternalDms.g:1924:4: (otherlv_7= RULE_ID )
            // InternalDms.g:1925:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getDQueryAccess().getTypeDTypeCrossReference_5_0());
              				
            }

            }


            }

            // InternalDms.g:1936:3: ( (lv_multiplicity_8_0= ruleDMultiplicity ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==20) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDms.g:1937:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:1937:4: (lv_multiplicity_8_0= ruleDMultiplicity )
                    // InternalDms.g:1938:5: lv_multiplicity_8_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getMultiplicityDMultiplicityParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_41);
                    lv_multiplicity_8_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_8_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:1955:3: (otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDms.g:1956:4: otherlv_9= 'returns' ( (lv_returns_10_0= ruleDExpression ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDQueryAccess().getReturnsKeyword_7_0());
                      			
                    }
                    // InternalDms.g:1960:4: ( (lv_returns_10_0= ruleDExpression ) )
                    // InternalDms.g:1961:5: (lv_returns_10_0= ruleDExpression )
                    {
                    // InternalDms.g:1961:5: (lv_returns_10_0= ruleDExpression )
                    // InternalDms.g:1962:6: lv_returns_10_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDQueryAccess().getReturnsDExpressionParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_returns_10_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDQueryRule());
                      						}
                      						set(
                      							current,
                      							"returns",
                      							lv_returns_10_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:1980:3: ( (lv_description_11_0= ruleDRichText ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_PLAIN_TEXT_ONLY && LA43_0<=RULE_PLAIN_TEXT_START)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDms.g:1981:4: (lv_description_11_0= ruleDRichText )
                    {
                    // InternalDms.g:1981:4: (lv_description_11_0= ruleDRichText )
                    // InternalDms.g:1982:5: lv_description_11_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_11_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDQuery"


    // $ANTLR start "entryRuleDQueryParameter"
    // InternalDms.g:2003:1: entryRuleDQueryParameter returns [EObject current=null] : iv_ruleDQueryParameter= ruleDQueryParameter EOF ;
    public final EObject entryRuleDQueryParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDQueryParameter = null;


        try {
            // InternalDms.g:2003:56: (iv_ruleDQueryParameter= ruleDQueryParameter EOF )
            // InternalDms.g:2004:2: iv_ruleDQueryParameter= ruleDQueryParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDQueryParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDQueryParameter=ruleDQueryParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDQueryParameter; 
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
    // $ANTLR end "entryRuleDQueryParameter"


    // $ANTLR start "ruleDQueryParameter"
    // InternalDms.g:2010:1: ruleDQueryParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDQueryParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2016:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDms.g:2017:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2017:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDms.g:2018:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ( (lv_description_4_0= ruleDRichText ) )?
            {
            // InternalDms.g:2018:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDms.g:2019:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDms.g:2019:4: (lv_name_0_0= RULE_ID )
            // InternalDms.g:2020:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDQueryParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDQueryParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDms.g:2040:3: ( (otherlv_2= RULE_ID ) )
            // InternalDms.g:2041:4: (otherlv_2= RULE_ID )
            {
            // InternalDms.g:2041:4: (otherlv_2= RULE_ID )
            // InternalDms.g:2042:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDQueryParameterRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDQueryParameterAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDms.g:2053:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDms.g:2054:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:2054:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDms.g:2055:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_3_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryParameterRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_3_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:2072:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_PLAIN_TEXT_ONLY && LA45_0<=RULE_PLAIN_TEXT_START)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDms.g:2073:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDms.g:2073:4: (lv_description_4_0= ruleDRichText )
                    // InternalDms.g:2074:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDQueryParameterAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDQueryParameterRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDQueryParameter"


    // $ANTLR start "entryRuleDDomainEvent"
    // InternalDms.g:2095:1: entryRuleDDomainEvent returns [EObject current=null] : iv_ruleDDomainEvent= ruleDDomainEvent EOF ;
    public final EObject entryRuleDDomainEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomainEvent = null;


        try {
            // InternalDms.g:2095:53: (iv_ruleDDomainEvent= ruleDDomainEvent EOF )
            // InternalDms.g:2096:2: iv_ruleDDomainEvent= ruleDDomainEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDDomainEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDDomainEvent=ruleDDomainEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDDomainEvent; 
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
    // $ANTLR end "entryRuleDDomainEvent"


    // $ANTLR start "ruleDDomainEvent"
    // InternalDms.g:2102:1: ruleDDomainEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( (lv_context_7_0= ruleDContext ) )+ ( (lv_notifications_8_0= ruleDNotification ) )+ (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )? (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )? otherlv_13= '}' ) ;
    public final EObject ruleDDomainEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_description_5_0 = null;

        EObject lv_context_7_0 = null;

        EObject lv_notifications_8_0 = null;

        EObject lv_before_10_0 = null;

        EObject lv_after_12_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2108:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( (lv_context_7_0= ruleDContext ) )+ ( (lv_notifications_8_0= ruleDNotification ) )+ (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )? (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )? otherlv_13= '}' ) )
            // InternalDms.g:2109:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( (lv_context_7_0= ruleDContext ) )+ ( (lv_notifications_8_0= ruleDNotification ) )+ (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )? (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )? otherlv_13= '}' )
            {
            // InternalDms.g:2109:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( (lv_context_7_0= ruleDContext ) )+ ( (lv_notifications_8_0= ruleDNotification ) )+ (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )? (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )? otherlv_13= '}' )
            // InternalDms.g:2110:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'triggered' otherlv_3= 'by' ( (otherlv_4= RULE_ID ) ) ( (lv_description_5_0= ruleDRichText ) )? otherlv_6= '{' ( (lv_context_7_0= ruleDContext ) )+ ( (lv_notifications_8_0= ruleDNotification ) )+ (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )? (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainEventAccess().getEventKeyword_0());
              		
            }
            // InternalDms.g:2114:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2115:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2115:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2116:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDDomainEventAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainEventRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDDomainEventAccess().getTriggeredKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,45,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDDomainEventAccess().getByKeyword_3());
              		
            }
            // InternalDms.g:2140:3: ( (otherlv_4= RULE_ID ) )
            // InternalDms.g:2141:4: (otherlv_4= RULE_ID )
            {
            // InternalDms.g:2141:4: (otherlv_4= RULE_ID )
            // InternalDms.g:2142:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDDomainEventRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDDomainEventAccess().getTriggerDActorCrossReference_4_0());
              				
            }

            }


            }

            // InternalDms.g:2153:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_PLAIN_TEXT_ONLY && LA46_0<=RULE_PLAIN_TEXT_START)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDms.g:2154:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDms.g:2154:4: (lv_description_5_0= ruleDRichText )
                    // InternalDms.g:2155:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainEventAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalDms.g:2176:3: ( (lv_context_7_0= ruleDContext ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==52) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDms.g:2177:4: (lv_context_7_0= ruleDContext )
            	    {
            	    // InternalDms.g:2177:4: (lv_context_7_0= ruleDContext )
            	    // InternalDms.g:2178:5: lv_context_7_0= ruleDContext
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getContextDContextParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_context_7_0=ruleDContext();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
            	      					}
            	      					add(
            	      						current,
            	      						"context",
            	      						lv_context_7_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DContext");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalDms.g:2195:3: ( (lv_notifications_8_0= ruleDNotification ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==49) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDms.g:2196:4: (lv_notifications_8_0= ruleDNotification )
            	    {
            	    // InternalDms.g:2196:4: (lv_notifications_8_0= ruleDNotification )
            	    // InternalDms.g:2197:5: lv_notifications_8_0= ruleDNotification
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getNotificationsDNotificationParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_notifications_8_0=ruleDNotification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
            	      					}
            	      					add(
            	      						current,
            	      						"notifications",
            	      						lv_notifications_8_0,
            	      						"com.mimacom.ddd.dm.dms.Dms.DNotification");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // InternalDms.g:2214:3: (otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+ )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDms.g:2215:4: otherlv_9= 'before' ( (lv_before_10_0= ruleDCondition ) )+
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDDomainEventAccess().getBeforeKeyword_9_0());
                      			
                    }
                    // InternalDms.g:2219:4: ( (lv_before_10_0= ruleDCondition ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==48) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalDms.g:2220:5: (lv_before_10_0= ruleDCondition )
                    	    {
                    	    // InternalDms.g:2220:5: (lv_before_10_0= ruleDCondition )
                    	    // InternalDms.g:2221:6: lv_before_10_0= ruleDCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getBeforeDConditionParserRuleCall_9_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_48);
                    	    lv_before_10_0=ruleDCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"before",
                    	      							lv_before_10_0,
                    	      							"com.mimacom.ddd.dm.dms.Dms.DCondition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    }
                    break;

            }

            // InternalDms.g:2239:3: (otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+ )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDms.g:2240:4: otherlv_11= 'after' ( (lv_after_12_0= ruleDCondition ) )+
                    {
                    otherlv_11=(Token)match(input,47,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDDomainEventAccess().getAfterKeyword_10_0());
                      			
                    }
                    // InternalDms.g:2244:4: ( (lv_after_12_0= ruleDCondition ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==48) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalDms.g:2245:5: (lv_after_12_0= ruleDCondition )
                    	    {
                    	    // InternalDms.g:2245:5: (lv_after_12_0= ruleDCondition )
                    	    // InternalDms.g:2246:6: lv_after_12_0= ruleDCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getAfterDConditionParserRuleCall_10_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_49);
                    	    lv_after_12_0=ruleDCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"after",
                    	      							lv_after_12_0,
                    	      							"com.mimacom.ddd.dm.dms.Dms.DCondition");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_11());
              		
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
    // $ANTLR end "ruleDDomainEvent"


    // $ANTLR start "entryRuleDCondition"
    // InternalDms.g:2272:1: entryRuleDCondition returns [EObject current=null] : iv_ruleDCondition= ruleDCondition EOF ;
    public final EObject entryRuleDCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCondition = null;


        try {
            // InternalDms.g:2272:51: (iv_ruleDCondition= ruleDCondition EOF )
            // InternalDms.g:2273:2: iv_ruleDCondition= ruleDCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDCondition=ruleDCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCondition; 
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
    // $ANTLR end "entryRuleDCondition"


    // $ANTLR start "ruleDCondition"
    // InternalDms.g:2279:1: ruleDCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_condition_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2285:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDms.g:2286:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2286:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDms.g:2287:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleDExpression ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDConditionAccess().getConditionKeyword_0());
              		
            }
            // InternalDms.g:2291:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2292:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2292:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2293:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDConditionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConditionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDConditionAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:2313:3: ( (lv_condition_3_0= ruleDExpression ) )
            // InternalDms.g:2314:4: (lv_condition_3_0= ruleDExpression )
            {
            // InternalDms.g:2314:4: (lv_condition_3_0= ruleDExpression )
            // InternalDms.g:2315:5: lv_condition_3_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDConditionAccess().getConditionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_condition_3_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDConditionRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:2332:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_PLAIN_TEXT_ONLY && LA53_0<=RULE_PLAIN_TEXT_START)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDms.g:2333:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDms.g:2333:4: (lv_description_4_0= ruleDRichText )
                    // InternalDms.g:2334:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDConditionAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDConditionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_4_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDCondition"


    // $ANTLR start "entryRuleDNotification"
    // InternalDms.g:2355:1: entryRuleDNotification returns [EObject current=null] : iv_ruleDNotification= ruleDNotification EOF ;
    public final EObject entryRuleDNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNotification = null;


        try {
            // InternalDms.g:2355:54: (iv_ruleDNotification= ruleDNotification EOF )
            // InternalDms.g:2356:2: iv_ruleDNotification= ruleDNotification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNotificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNotification=ruleDNotification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNotification; 
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
    // $ANTLR end "entryRuleDNotification"


    // $ANTLR start "ruleDNotification"
    // InternalDms.g:2362:1: ruleDNotification returns [EObject current=null] : (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? otherlv_5= 'sent' otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) ( (lv_description_8_0= ruleDRichText ) )? ) ;
    public final EObject ruleDNotification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2368:2: ( (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? otherlv_5= 'sent' otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) ( (lv_description_8_0= ruleDRichText ) )? ) )
            // InternalDms.g:2369:2: (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? otherlv_5= 'sent' otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) ( (lv_description_8_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2369:2: (otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? otherlv_5= 'sent' otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) ( (lv_description_8_0= ruleDRichText ) )? )
            // InternalDms.g:2370:3: otherlv_0= 'notification' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? otherlv_5= 'sent' otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) ( (lv_description_8_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDNotificationAccess().getNotificationKeyword_0());
              		
            }
            // InternalDms.g:2374:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2375:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2375:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2376:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDNotificationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDNotificationAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:2396:3: ( (otherlv_3= RULE_ID ) )
            // InternalDms.g:2397:4: (otherlv_3= RULE_ID )
            {
            // InternalDms.g:2397:4: (otherlv_3= RULE_ID )
            // InternalDms.g:2398:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDNotificationAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDms.g:2409:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==20) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDms.g:2410:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:2410:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDms.g:2411:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNotificationAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_51);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNotificationRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDNotificationAccess().getSentKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,51,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDNotificationAccess().getToKeyword_6());
              		
            }
            // InternalDms.g:2436:3: ( (otherlv_7= RULE_ID ) )
            // InternalDms.g:2437:4: (otherlv_7= RULE_ID )
            {
            // InternalDms.g:2437:4: (otherlv_7= RULE_ID )
            // InternalDms.g:2438:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getDNotificationAccess().getNotifiedDActorCrossReference_7_0());
              				
            }

            }


            }

            // InternalDms.g:2449:3: ( (lv_description_8_0= ruleDRichText ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_PLAIN_TEXT_ONLY && LA55_0<=RULE_PLAIN_TEXT_START)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDms.g:2450:4: (lv_description_8_0= ruleDRichText )
                    {
                    // InternalDms.g:2450:4: (lv_description_8_0= ruleDRichText )
                    // InternalDms.g:2451:5: lv_description_8_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNotificationAccess().getDescriptionDRichTextParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNotificationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_8_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDNotification"


    // $ANTLR start "entryRuleDContext"
    // InternalDms.g:2472:1: entryRuleDContext returns [EObject current=null] : iv_ruleDContext= ruleDContext EOF ;
    public final EObject entryRuleDContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContext = null;


        try {
            // InternalDms.g:2472:49: (iv_ruleDContext= ruleDContext EOF )
            // InternalDms.g:2473:2: iv_ruleDContext= ruleDContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDContextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDContext=ruleDContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDContext; 
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
    // $ANTLR end "entryRuleDContext"


    // $ANTLR start "ruleDContext"
    // InternalDms.g:2479:1: ruleDContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2485:2: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDms.g:2486:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2486:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDms.g:2487:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDContextAccess().getContextKeyword_0());
              		
            }
            // InternalDms.g:2491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2492:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDContextAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDContextAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:2513:3: ( (otherlv_3= RULE_ID ) )
            // InternalDms.g:2514:4: (otherlv_3= RULE_ID )
            {
            // InternalDms.g:2514:4: (otherlv_3= RULE_ID )
            // InternalDms.g:2515:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDContextAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDms.g:2526:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==20) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDms.g:2527:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:2527:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDms.g:2528:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:2545:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_PLAIN_TEXT_ONLY && LA57_0<=RULE_PLAIN_TEXT_START)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDms.g:2546:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDms.g:2546:4: (lv_description_5_0= ruleDRichText )
                    // InternalDms.g:2547:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDContext"


    // $ANTLR start "entryRuleDActor"
    // InternalDms.g:2568:1: entryRuleDActor returns [EObject current=null] : iv_ruleDActor= ruleDActor EOF ;
    public final EObject entryRuleDActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDActor = null;


        try {
            // InternalDms.g:2568:47: (iv_ruleDActor= ruleDActor EOF )
            // InternalDms.g:2569:2: iv_ruleDActor= ruleDActor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDActorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDActor=ruleDActor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDActor; 
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
    // $ANTLR end "entryRuleDActor"


    // $ANTLR start "ruleDActor"
    // InternalDms.g:2575:1: ruleDActor returns [EObject current=null] : (this_DHuman_0= ruleDHuman | this_DService_1= ruleDService | this_DTime_2= ruleDTime ) ;
    public final EObject ruleDActor() throws RecognitionException {
        EObject current = null;

        EObject this_DHuman_0 = null;

        EObject this_DService_1 = null;

        EObject this_DTime_2 = null;



        	enterRule();

        try {
            // InternalDms.g:2581:2: ( (this_DHuman_0= ruleDHuman | this_DService_1= ruleDService | this_DTime_2= ruleDTime ) )
            // InternalDms.g:2582:2: (this_DHuman_0= ruleDHuman | this_DService_1= ruleDService | this_DTime_2= ruleDTime )
            {
            // InternalDms.g:2582:2: (this_DHuman_0= ruleDHuman | this_DService_1= ruleDService | this_DTime_2= ruleDTime )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt58=1;
                }
                break;
            case 57:
                {
                alt58=2;
                }
                break;
            case 55:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalDms.g:2583:3: this_DHuman_0= ruleDHuman
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDHumanParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DHuman_0=ruleDHuman();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DHuman_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:2592:3: this_DService_1= ruleDService
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDServiceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DService_1=ruleDService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DService_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDms.g:2601:3: this_DTime_2= ruleDTime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDTimeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DTime_2=ruleDTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DTime_2;
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
    // $ANTLR end "ruleDActor"


    // $ANTLR start "entryRuleDHuman"
    // InternalDms.g:2613:1: entryRuleDHuman returns [EObject current=null] : iv_ruleDHuman= ruleDHuman EOF ;
    public final EObject entryRuleDHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHuman = null;


        try {
            // InternalDms.g:2613:47: (iv_ruleDHuman= ruleDHuman EOF )
            // InternalDms.g:2614:2: iv_ruleDHuman= ruleDHuman EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDHumanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDHuman=ruleDHuman();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDHuman; 
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
    // $ANTLR end "entryRuleDHuman"


    // $ANTLR start "ruleDHuman"
    // InternalDms.g:2620:1: ruleDHuman returns [EObject current=null] : (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDHuman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2626:2: ( (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalDms.g:2627:2: (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2627:2: (otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalDms.g:2628:3: otherlv_0= 'human' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHumanAccess().getHumanKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHumanAccess().getActorKeyword_1());
              		
            }
            // InternalDms.g:2636:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDms.g:2637:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDms.g:2637:4: (lv_name_2_0= RULE_ID )
            // InternalDms.g:2638:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDHumanAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHumanRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:2654:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_PLAIN_TEXT_ONLY && LA59_0<=RULE_PLAIN_TEXT_START)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDms.g:2655:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDms.g:2655:4: (lv_description_3_0= ruleDRichText )
                    // InternalDms.g:2656:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDHumanAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDHumanRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDHuman"


    // $ANTLR start "entryRuleDTime"
    // InternalDms.g:2677:1: entryRuleDTime returns [EObject current=null] : iv_ruleDTime= ruleDTime EOF ;
    public final EObject entryRuleDTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTime = null;


        try {
            // InternalDms.g:2677:46: (iv_ruleDTime= ruleDTime EOF )
            // InternalDms.g:2678:2: iv_ruleDTime= ruleDTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTime=ruleDTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTime; 
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
    // $ANTLR end "entryRuleDTime"


    // $ANTLR start "ruleDTime"
    // InternalDms.g:2684:1: ruleDTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? ) ;
    public final EObject ruleDTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2690:2: ( (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? ) )
            // InternalDms.g:2691:2: (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? )
            {
            // InternalDms.g:2691:2: (otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )? )
            // InternalDms.g:2692:3: otherlv_0= 'time' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) ( (lv_description_3_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDTimeAccess().getTimeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,54,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDTimeAccess().getActorKeyword_1());
              		
            }
            // InternalDms.g:2700:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDms.g:2701:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDms.g:2701:4: (lv_name_2_0= RULE_ID )
            // InternalDms.g:2702:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDTimeAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDTimeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:2718:3: ( (lv_description_3_0= ruleDRichText ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_PLAIN_TEXT_ONLY && LA60_0<=RULE_PLAIN_TEXT_START)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDms.g:2719:4: (lv_description_3_0= ruleDRichText )
                    {
                    // InternalDms.g:2719:4: (lv_description_3_0= ruleDRichText )
                    // InternalDms.g:2720:5: lv_description_3_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDTimeAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_3_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDTimeRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDTime"


    // $ANTLR start "entryRuleDExistingApplication"
    // InternalDms.g:2741:1: entryRuleDExistingApplication returns [EObject current=null] : iv_ruleDExistingApplication= ruleDExistingApplication EOF ;
    public final EObject entryRuleDExistingApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExistingApplication = null;


        try {
            // InternalDms.g:2741:61: (iv_ruleDExistingApplication= ruleDExistingApplication EOF )
            // InternalDms.g:2742:2: iv_ruleDExistingApplication= ruleDExistingApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDExistingApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDExistingApplication=ruleDExistingApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDExistingApplication; 
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
    // $ANTLR end "entryRuleDExistingApplication"


    // $ANTLR start "ruleDExistingApplication"
    // InternalDms.g:2748:1: ruleDExistingApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDExistingApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_description_2_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_exceptions_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2754:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )* otherlv_6= '}' ) )
            // InternalDms.g:2755:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )* otherlv_6= '}' )
            {
            // InternalDms.g:2755:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )* otherlv_6= '}' )
            // InternalDms.g:2756:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? otherlv_3= '{' ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExistingApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalDms.g:2760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2761:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDExistingApplicationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDExistingApplicationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:2778:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_PLAIN_TEXT_ONLY && LA61_0<=RULE_PLAIN_TEXT_START)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDms.g:2779:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:2779:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:2780:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDExistingApplicationAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_3);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDExistingApplicationAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDms.g:2801:3: ( ( (lv_services_4_0= ruleDService ) ) | ( (lv_exceptions_5_0= ruleDException ) ) )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==57) ) {
                    alt62=1;
                }
                else if ( (LA62_0==62) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalDms.g:2802:4: ( (lv_services_4_0= ruleDService ) )
            	    {
            	    // InternalDms.g:2802:4: ( (lv_services_4_0= ruleDService ) )
            	    // InternalDms.g:2803:5: (lv_services_4_0= ruleDService )
            	    {
            	    // InternalDms.g:2803:5: (lv_services_4_0= ruleDService )
            	    // InternalDms.g:2804:6: lv_services_4_0= ruleDService
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getServicesDServiceParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_services_4_0=ruleDService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"services",
            	      							lv_services_4_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DService");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:2822:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    {
            	    // InternalDms.g:2822:4: ( (lv_exceptions_5_0= ruleDException ) )
            	    // InternalDms.g:2823:5: (lv_exceptions_5_0= ruleDException )
            	    {
            	    // InternalDms.g:2823:5: (lv_exceptions_5_0= ruleDException )
            	    // InternalDms.g:2824:6: lv_exceptions_5_0= ruleDException
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDExistingApplicationAccess().getExceptionsDExceptionParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_exceptions_5_0=ruleDException();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDExistingApplicationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exceptions",
            	      							lv_exceptions_5_0,
            	      							"com.mimacom.ddd.dm.dms.Dms.DException");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDExistingApplicationAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDExistingApplication"


    // $ANTLR start "entryRuleDService"
    // InternalDms.g:2850:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDms.g:2850:49: (iv_ruleDService= ruleDService EOF )
            // InternalDms.g:2851:2: iv_ruleDService= ruleDService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDService=ruleDService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDService; 
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
    // $ANTLR end "entryRuleDService"


    // $ANTLR start "ruleDService"
    // InternalDms.g:2857:1: ruleDService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )? ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )? (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )? (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )? (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? ) ;
    public final EObject ruleDService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_description_7_0 = null;

        Enumerator lv_kind_9_0 = null;

        EObject lv_precondition_11_0 = null;

        EObject lv_postcondition_13_0 = null;



        	enterRule();

        try {
            // InternalDms.g:2863:2: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )? ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )? (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )? (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )? (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? ) )
            // InternalDms.g:2864:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )? ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )? (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )? (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )? (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? )
            {
            // InternalDms.g:2864:2: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )? ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )? (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )? (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )? (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )? )
            // InternalDms.g:2865:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )? ( (lv_description_7_0= ruleDRichText ) )? (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )? (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )? (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )? (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDServiceAccess().getServiceKeyword_0());
              		
            }
            // InternalDms.g:2869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:2870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:2870:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:2871:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDServiceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:2887:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDms.g:2888:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleDServiceParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDServiceAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalDms.g:2892:4: ( (lv_parameters_3_0= ruleDServiceParameter ) )
                    // InternalDms.g:2893:5: (lv_parameters_3_0= ruleDServiceParameter )
                    {
                    // InternalDms.g:2893:5: (lv_parameters_3_0= ruleDServiceParameter )
                    // InternalDms.g:2894:6: lv_parameters_3_0= ruleDServiceParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_parameters_3_0=ruleDServiceParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DServiceParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:2911:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==21) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalDms.g:2912:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDServiceParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_56); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDServiceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDms.g:2916:5: ( (lv_parameters_5_0= ruleDServiceParameter ) )
                    	    // InternalDms.g:2917:6: (lv_parameters_5_0= ruleDServiceParameter )
                    	    {
                    	    // InternalDms.g:2917:6: (lv_parameters_5_0= ruleDServiceParameter )
                    	    // InternalDms.g:2918:7: lv_parameters_5_0= ruleDServiceParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDServiceAccess().getParametersDServiceParameterParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_5_0=ruleDServiceParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDServiceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"com.mimacom.ddd.dm.dms.Dms.DServiceParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getDServiceAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:2941:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_PLAIN_TEXT_ONLY && LA65_0<=RULE_PLAIN_TEXT_START)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDms.g:2942:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDms.g:2942:4: (lv_description_7_0= ruleDRichText )
                    // InternalDms.g:2943:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_58);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_7_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:2960:3: (otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDms.g:2961:4: otherlv_8= 'kind' ( (lv_kind_9_0= ruleDServiceKind ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDServiceAccess().getKindKeyword_4_0());
                      			
                    }
                    // InternalDms.g:2965:4: ( (lv_kind_9_0= ruleDServiceKind ) )
                    // InternalDms.g:2966:5: (lv_kind_9_0= ruleDServiceKind )
                    {
                    // InternalDms.g:2966:5: (lv_kind_9_0= ruleDServiceKind )
                    // InternalDms.g:2967:6: lv_kind_9_0= ruleDServiceKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getKindDServiceKindEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_60);
                    lv_kind_9_0=ruleDServiceKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"kind",
                      							lv_kind_9_0,
                      							"com.mimacom.ddd.dm.dms.Dms.DServiceKind");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:2985:3: (otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==59) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDms.g:2986:4: otherlv_10= 'precondition' ( (lv_precondition_11_0= ruleDExpression ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getDServiceAccess().getPreconditionKeyword_5_0());
                      			
                    }
                    // InternalDms.g:2990:4: ( (lv_precondition_11_0= ruleDExpression ) )
                    // InternalDms.g:2991:5: (lv_precondition_11_0= ruleDExpression )
                    {
                    // InternalDms.g:2991:5: (lv_precondition_11_0= ruleDExpression )
                    // InternalDms.g:2992:6: lv_precondition_11_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPreconditionDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_precondition_11_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"precondition",
                      							lv_precondition_11_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:3010:3: (otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==60) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDms.g:3011:4: otherlv_12= 'postcondition' ( (lv_postcondition_13_0= ruleDExpression ) )
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getDServiceAccess().getPostconditionKeyword_6_0());
                      			
                    }
                    // InternalDms.g:3015:4: ( (lv_postcondition_13_0= ruleDExpression ) )
                    // InternalDms.g:3016:5: (lv_postcondition_13_0= ruleDExpression )
                    {
                    // InternalDms.g:3016:5: (lv_postcondition_13_0= ruleDExpression )
                    // InternalDms.g:3017:6: lv_postcondition_13_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDServiceAccess().getPostconditionDExpressionParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_62);
                    lv_postcondition_13_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDServiceRule());
                      						}
                      						set(
                      							current,
                      							"postcondition",
                      							lv_postcondition_13_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDms.g:3035:3: (otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==61) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDms.g:3036:4: otherlv_14= 'raises' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    {
                    otherlv_14=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getDServiceAccess().getRaisesKeyword_7_0());
                      			
                    }
                    // InternalDms.g:3040:4: ( (otherlv_15= RULE_ID ) )
                    // InternalDms.g:3041:5: (otherlv_15= RULE_ID )
                    {
                    // InternalDms.g:3041:5: (otherlv_15= RULE_ID )
                    // InternalDms.g:3042:6: otherlv_15= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDServiceRule());
                      						}
                      					
                    }
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_15, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_7_1_0());
                      					
                    }

                    }


                    }

                    // InternalDms.g:3053:4: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==21) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalDms.g:3054:5: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_16, grammarAccess.getDServiceAccess().getCommaKeyword_7_2_0());
                    	      				
                    	    }
                    	    // InternalDms.g:3058:5: ( (otherlv_17= RULE_ID ) )
                    	    // InternalDms.g:3059:6: (otherlv_17= RULE_ID )
                    	    {
                    	    // InternalDms.g:3059:6: (otherlv_17= RULE_ID )
                    	    // InternalDms.g:3060:7: otherlv_17= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getDServiceRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_17, grammarAccess.getDServiceAccess().getRaisesDExceptionCrossReference_7_2_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDService"


    // $ANTLR start "entryRuleDServiceParameter"
    // InternalDms.g:3077:1: entryRuleDServiceParameter returns [EObject current=null] : iv_ruleDServiceParameter= ruleDServiceParameter EOF ;
    public final EObject entryRuleDServiceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDServiceParameter = null;


        try {
            // InternalDms.g:3077:58: (iv_ruleDServiceParameter= ruleDServiceParameter EOF )
            // InternalDms.g:3078:2: iv_ruleDServiceParameter= ruleDServiceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDServiceParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDServiceParameter=ruleDServiceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDServiceParameter; 
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
    // $ANTLR end "entryRuleDServiceParameter"


    // $ANTLR start "ruleDServiceParameter"
    // InternalDms.g:3084:1: ruleDServiceParameter returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDServiceParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_multiplicity_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3090:2: ( ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDms.g:3091:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDms.g:3091:2: ( ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDms.g:3092:3: ( (lv_direction_0_0= ruleDDirection ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleDMultiplicity ) )? ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDms.g:3092:3: ( (lv_direction_0_0= ruleDDirection ) )
            // InternalDms.g:3093:4: (lv_direction_0_0= ruleDDirection )
            {
            // InternalDms.g:3093:4: (lv_direction_0_0= ruleDDirection )
            // InternalDms.g:3094:5: lv_direction_0_0= ruleDDirection
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDirectionDDirectionEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_direction_0_0=ruleDDirection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
              					}
              					set(
              						current,
              						"direction",
              						lv_direction_0_0,
              						"com.mimacom.ddd.dm.dms.Dms.DDirection");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDms.g:3111:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:3112:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:3112:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:3113:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDServiceParameterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDServiceParameterAccess().getColonKeyword_2());
              		
            }
            // InternalDms.g:3133:3: ( (otherlv_3= RULE_ID ) )
            // InternalDms.g:3134:4: (otherlv_3= RULE_ID )
            {
            // InternalDms.g:3134:4: (otherlv_3= RULE_ID )
            // InternalDms.g:3135:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceParameterRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDServiceParameterAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDms.g:3146:3: ( (lv_multiplicity_4_0= ruleDMultiplicity ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==20) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDms.g:3147:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    {
                    // InternalDms.g:3147:4: (lv_multiplicity_4_0= ruleDMultiplicity )
                    // InternalDms.g:3148:5: lv_multiplicity_4_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_4_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_4_0,
                      						"com.mimacom.ddd.dm.dms.Dms.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDms.g:3165:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_PLAIN_TEXT_ONLY && LA72_0<=RULE_PLAIN_TEXT_START)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDms.g:3166:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDms.g:3166:4: (lv_description_5_0= ruleDRichText )
                    // InternalDms.g:3167:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceParameterAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceParameterRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDServiceParameter"


    // $ANTLR start "entryRuleDException"
    // InternalDms.g:3188:1: entryRuleDException returns [EObject current=null] : iv_ruleDException= ruleDException EOF ;
    public final EObject entryRuleDException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDException = null;


        try {
            // InternalDms.g:3188:51: (iv_ruleDException= ruleDException EOF )
            // InternalDms.g:3189:2: iv_ruleDException= ruleDException EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDExceptionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDException=ruleDException();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDException; 
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
    // $ANTLR end "entryRuleDException"


    // $ANTLR start "ruleDException"
    // InternalDms.g:3195:1: ruleDException returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) ;
    public final EObject ruleDException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_description_2_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3201:2: ( (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? ) )
            // InternalDms.g:3202:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            {
            // InternalDms.g:3202:2: (otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )? )
            // InternalDms.g:3203:3: otherlv_0= 'exception' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDExceptionAccess().getExceptionKeyword_0());
              		
            }
            // InternalDms.g:3207:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDms.g:3208:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDms.g:3208:4: (lv_name_1_0= RULE_ID )
            // InternalDms.g:3209:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDExceptionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDExceptionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDms.g:3225:3: ( (lv_description_2_0= ruleDRichText ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_PLAIN_TEXT_ONLY && LA73_0<=RULE_PLAIN_TEXT_START)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDms.g:3226:4: (lv_description_2_0= ruleDRichText )
                    {
                    // InternalDms.g:3226:4: (lv_description_2_0= ruleDRichText )
                    // InternalDms.g:3227:5: lv_description_2_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDExceptionAccess().getDescriptionDRichTextParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_2_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDExceptionRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_2_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DRichText");
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
    // $ANTLR end "ruleDException"


    // $ANTLR start "entryRuleDRichText"
    // InternalDms.g:3248:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDms.g:3248:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDms.g:3249:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDms.g:3255:1: ruleDRichText returns [EObject current=null] : ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) ;
    public final EObject ruleDRichText() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3261:2: ( ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) ) )
            // InternalDms.g:3262:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            {
            // InternalDms.g:3262:2: ( ( (lv_elements_0_0= ruleDTextOnly ) ) | ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_PLAIN_TEXT_START) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalDms.g:3263:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    {
                    // InternalDms.g:3263:3: ( (lv_elements_0_0= ruleDTextOnly ) )
                    // InternalDms.g:3264:4: (lv_elements_0_0= ruleDTextOnly )
                    {
                    // InternalDms.g:3264:4: (lv_elements_0_0= ruleDTextOnly )
                    // InternalDms.g:3265:5: lv_elements_0_0= ruleDTextOnly
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextOnlyParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleDTextOnly();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      					}
                      					add(
                      						current,
                      						"elements",
                      						lv_elements_0_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DTextOnly");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:3283:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    {
                    // InternalDms.g:3283:3: ( ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) ) )
                    // InternalDms.g:3284:4: ( (lv_elements_1_0= ruleDTextStart ) ) ( (lv_elements_2_0= ruleDExpression ) ) ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )* ( (lv_elements_5_0= ruleDTextEnd ) )
                    {
                    // InternalDms.g:3284:4: ( (lv_elements_1_0= ruleDTextStart ) )
                    // InternalDms.g:3285:5: (lv_elements_1_0= ruleDTextStart )
                    {
                    // InternalDms.g:3285:5: (lv_elements_1_0= ruleDTextStart )
                    // InternalDms.g:3286:6: lv_elements_1_0= ruleDTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_elements_1_0=ruleDTextStart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DTextStart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:3303:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDms.g:3304:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDms.g:3304:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDms.g:3305:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_64);
                    lv_elements_2_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:3322:4: ( ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalDms.g:3323:5: ( (lv_elements_3_0= ruleDTextMiddle ) ) ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDms.g:3323:5: ( (lv_elements_3_0= ruleDTextMiddle ) )
                    	    // InternalDms.g:3324:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    {
                    	    // InternalDms.g:3324:6: (lv_elements_3_0= ruleDTextMiddle )
                    	    // InternalDms.g:3325:7: lv_elements_3_0= ruleDTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_elements_3_0=ruleDTextMiddle();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_3_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DTextMiddle");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalDms.g:3342:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDms.g:3343:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDms.g:3343:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDms.g:3344:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    lv_elements_4_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDRichTextRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    // InternalDms.g:3362:4: ( (lv_elements_5_0= ruleDTextEnd ) )
                    // InternalDms.g:3363:5: (lv_elements_5_0= ruleDTextEnd )
                    {
                    // InternalDms.g:3363:5: (lv_elements_5_0= ruleDTextEnd )
                    // InternalDms.g:3364:6: lv_elements_5_0= ruleDTextEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getElementsDTextEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elements_5_0=ruleDTextEnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDRichTextRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_5_0,
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
    // InternalDms.g:3386:1: entryRuleDTextOnly returns [EObject current=null] : iv_ruleDTextOnly= ruleDTextOnly EOF ;
    public final EObject entryRuleDTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextOnly = null;


        try {
            // InternalDms.g:3386:50: (iv_ruleDTextOnly= ruleDTextOnly EOF )
            // InternalDms.g:3387:2: iv_ruleDTextOnly= ruleDTextOnly EOF
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
    // InternalDms.g:3393:1: ruleDTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:3399:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDms.g:3400:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDms.g:3400:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDms.g:3401:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDms.g:3401:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDms.g:3402:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
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
    // InternalDms.g:3421:1: entryRuleDTextStart returns [EObject current=null] : iv_ruleDTextStart= ruleDTextStart EOF ;
    public final EObject entryRuleDTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextStart = null;


        try {
            // InternalDms.g:3421:51: (iv_ruleDTextStart= ruleDTextStart EOF )
            // InternalDms.g:3422:2: iv_ruleDTextStart= ruleDTextStart EOF
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
    // InternalDms.g:3428:1: ruleDTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:3434:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDms.g:3435:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDms.g:3435:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDms.g:3436:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDms.g:3436:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDms.g:3437:4: lv_value_0_0= RULE_PLAIN_TEXT_START
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
    // InternalDms.g:3456:1: entryRuleDTextMiddle returns [EObject current=null] : iv_ruleDTextMiddle= ruleDTextMiddle EOF ;
    public final EObject entryRuleDTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextMiddle = null;


        try {
            // InternalDms.g:3456:52: (iv_ruleDTextMiddle= ruleDTextMiddle EOF )
            // InternalDms.g:3457:2: iv_ruleDTextMiddle= ruleDTextMiddle EOF
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
    // InternalDms.g:3463:1: ruleDTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:3469:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDms.g:3470:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDms.g:3470:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDms.g:3471:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDms.g:3471:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDms.g:3472:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
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
    // InternalDms.g:3491:1: entryRuleDTextEnd returns [EObject current=null] : iv_ruleDTextEnd= ruleDTextEnd EOF ;
    public final EObject entryRuleDTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTextEnd = null;


        try {
            // InternalDms.g:3491:49: (iv_ruleDTextEnd= ruleDTextEnd EOF )
            // InternalDms.g:3492:2: iv_ruleDTextEnd= ruleDTextEnd EOF
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
    // InternalDms.g:3498:1: ruleDTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDms.g:3504:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDms.g:3505:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDms.g:3505:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDms.g:3506:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDms.g:3506:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDms.g:3507:4: lv_value_0_0= RULE_PLAIN_TEXT_END
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


    // $ANTLR start "entryRuleDExpression"
    // InternalDms.g:3526:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDms.g:3526:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDms.g:3527:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDms.g:3533:1: ruleDExpression returns [EObject current=null] : this_DAssignment_0= ruleDAssignment ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAssignment_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3539:2: (this_DAssignment_0= ruleDAssignment )
            // InternalDms.g:3540:2: this_DAssignment_0= ruleDAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDExpressionAccess().getDAssignmentParserRuleCall());
              	
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


    // $ANTLR start "entryRuleDAssignment"
    // InternalDms.g:3551:1: entryRuleDAssignment returns [EObject current=null] : iv_ruleDAssignment= ruleDAssignment EOF ;
    public final EObject entryRuleDAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAssignment = null;


        try {
            // InternalDms.g:3551:52: (iv_ruleDAssignment= ruleDAssignment EOF )
            // InternalDms.g:3552:2: iv_ruleDAssignment= ruleDAssignment EOF
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
    // InternalDms.g:3558:1: ruleDAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) ;
    public final EObject ruleDAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_DOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDms.g:3564:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression ) )
            // InternalDms.g:3565:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            {
            // InternalDms.g:3565:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) ) | this_DOrExpression_4= ruleDOrExpression )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==EOF||LA76_1==RULE_ID||(LA76_1>=RULE_PLAIN_TEXT_ONLY && LA76_1<=RULE_PLAIN_TEXT_END)||LA76_1==18||(LA76_1>=20 && LA76_1<=22)||(LA76_1>=27 && LA76_1<=30)||(LA76_1>=32 && LA76_1<=36)||(LA76_1>=38 && LA76_1<=40)||LA76_1==43||(LA76_1>=47 && LA76_1<=48)||LA76_1==53||(LA76_1>=55 && LA76_1<=57)||(LA76_1>=60 && LA76_1<=62)||(LA76_1>=64 && LA76_1<=67)||(LA76_1>=77 && LA76_1<=79)||(LA76_1>=81 && LA76_1<=82)||(LA76_1>=91 && LA76_1<=94)||(LA76_1>=99 && LA76_1<=118)) ) {
                    alt76=2;
                }
                else if ( (LA76_1==63) ) {
                    alt76=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA76_0>=RULE_STRING && LA76_0<=RULE_NATURAL)||LA76_0==20||(LA76_0>=68 && LA76_0<=76)||LA76_0==80||(LA76_0>=83 && LA76_0<=88)||(LA76_0>=91 && LA76_0<=92)||(LA76_0>=119 && LA76_0<=121)) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalDms.g:3566:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    {
                    // InternalDms.g:3566:3: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) ) )
                    // InternalDms.g:3567:4: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleDAssignment ) )
                    {
                    // InternalDms.g:3567:4: ()
                    // InternalDms.g:3568:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDAssignmentAccess().getDAssignmentAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDms.g:3574:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDms.g:3575:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDms.g:3575:5: (otherlv_1= RULE_ID )
                    // InternalDms.g:3576:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDAssignmentRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDAssignmentAccess().getMemberDTypedMemberCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDAssignmentAccess().getOpSingleAssignParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalDms.g:3594:4: ( (lv_value_3_0= ruleDAssignment ) )
                    // InternalDms.g:3595:5: (lv_value_3_0= ruleDAssignment )
                    {
                    // InternalDms.g:3595:5: (lv_value_3_0= ruleDAssignment )
                    // InternalDms.g:3596:6: lv_value_3_0= ruleDAssignment
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
                    // InternalDms.g:3615:3: this_DOrExpression_4= ruleDOrExpression
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
    // InternalDms.g:3627:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // InternalDms.g:3627:54: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // InternalDms.g:3628:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
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
    // InternalDms.g:3634:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:3640:2: (kw= ':=' )
            // InternalDms.g:3641:2: kw= ':='
            {
            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:3649:1: entryRuleDOrExpression returns [EObject current=null] : iv_ruleDOrExpression= ruleDOrExpression EOF ;
    public final EObject entryRuleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrExpression = null;


        try {
            // InternalDms.g:3649:54: (iv_ruleDOrExpression= ruleDOrExpression EOF )
            // InternalDms.g:3650:2: iv_ruleDOrExpression= ruleDOrExpression EOF
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
    // InternalDms.g:3656:1: ruleDOrExpression returns [EObject current=null] : (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) ;
    public final EObject ruleDOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3662:2: ( (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* ) )
            // InternalDms.g:3663:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            {
            // InternalDms.g:3663:2: (this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )* )
            // InternalDms.g:3664:3: this_DAndExpression_0= ruleDAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOrExpressionAccess().getDAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_66);
            this_DAndExpression_0=ruleDAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3672:3: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                switch ( input.LA(1) ) {
                case 99:
                    {
                    int LA77_2 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 100:
                    {
                    int LA77_3 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 101:
                    {
                    int LA77_4 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 102:
                    {
                    int LA77_5 = input.LA(2);

                    if ( (synpred1_InternalDms()) ) {
                        alt77=1;
                    }


                    }
                    break;

                }

                switch (alt77) {
            	case 1 :
            	    // InternalDms.g:3673:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    {
            	    // InternalDms.g:3673:4: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) ) )
            	    // InternalDms.g:3674:5: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    {
            	    // InternalDms.g:3684:5: ( () ( (lv_operator_2_0= ruleOpOr ) ) )
            	    // InternalDms.g:3685:6: () ( (lv_operator_2_0= ruleOpOr ) )
            	    {
            	    // InternalDms.g:3685:6: ()
            	    // InternalDms.g:3686:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOrExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3692:6: ( (lv_operator_2_0= ruleOpOr ) )
            	    // InternalDms.g:3693:7: (lv_operator_2_0= ruleOpOr )
            	    {
            	    // InternalDms.g:3693:7: (lv_operator_2_0= ruleOpOr )
            	    // InternalDms.g:3694:8: lv_operator_2_0= ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOrExpressionAccess().getOperatorOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:3713:4: ( (lv_rightOperand_3_0= ruleDAndExpression ) )
            	    // InternalDms.g:3714:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    {
            	    // InternalDms.g:3714:5: (lv_rightOperand_3_0= ruleDAndExpression )
            	    // InternalDms.g:3715:6: lv_rightOperand_3_0= ruleDAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOrExpressionAccess().getRightOperandDAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
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
            	    break loop77;
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
    // InternalDms.g:3737:1: entryRuleDAndExpression returns [EObject current=null] : iv_ruleDAndExpression= ruleDAndExpression EOF ;
    public final EObject entryRuleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAndExpression = null;


        try {
            // InternalDms.g:3737:55: (iv_ruleDAndExpression= ruleDAndExpression EOF )
            // InternalDms.g:3738:2: iv_ruleDAndExpression= ruleDAndExpression EOF
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
    // InternalDms.g:3744:1: ruleDAndExpression returns [EObject current=null] : (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) ;
    public final EObject ruleDAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3750:2: ( (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* ) )
            // InternalDms.g:3751:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            {
            // InternalDms.g:3751:2: (this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )* )
            // InternalDms.g:3752:3: this_DEqualityExpression_0= ruleDEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAndExpressionAccess().getDEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_67);
            this_DEqualityExpression_0=ruleDEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3760:3: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==103) ) {
                    int LA78_2 = input.LA(2);

                    if ( (synpred2_InternalDms()) ) {
                        alt78=1;
                    }


                }
                else if ( (LA78_0==104) ) {
                    int LA78_3 = input.LA(2);

                    if ( (synpred2_InternalDms()) ) {
                        alt78=1;
                    }


                }


                switch (alt78) {
            	case 1 :
            	    // InternalDms.g:3761:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    {
            	    // InternalDms.g:3761:4: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) ) )
            	    // InternalDms.g:3762:5: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    {
            	    // InternalDms.g:3772:5: ( () ( (lv_operator_2_0= ruleOpAnd ) ) )
            	    // InternalDms.g:3773:6: () ( (lv_operator_2_0= ruleOpAnd ) )
            	    {
            	    // InternalDms.g:3773:6: ()
            	    // InternalDms.g:3774:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAndExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3780:6: ( (lv_operator_2_0= ruleOpAnd ) )
            	    // InternalDms.g:3781:7: (lv_operator_2_0= ruleOpAnd )
            	    {
            	    // InternalDms.g:3781:7: (lv_operator_2_0= ruleOpAnd )
            	    // InternalDms.g:3782:8: lv_operator_2_0= ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAndExpressionAccess().getOperatorOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:3801:4: ( (lv_rightOperand_3_0= ruleDEqualityExpression ) )
            	    // InternalDms.g:3802:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    {
            	    // InternalDms.g:3802:5: (lv_rightOperand_3_0= ruleDEqualityExpression )
            	    // InternalDms.g:3803:6: lv_rightOperand_3_0= ruleDEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAndExpressionAccess().getRightOperandDEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_67);
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
            	    break loop78;
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
    // InternalDms.g:3825:1: entryRuleDEqualityExpression returns [EObject current=null] : iv_ruleDEqualityExpression= ruleDEqualityExpression EOF ;
    public final EObject entryRuleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDEqualityExpression = null;


        try {
            // InternalDms.g:3825:60: (iv_ruleDEqualityExpression= ruleDEqualityExpression EOF )
            // InternalDms.g:3826:2: iv_ruleDEqualityExpression= ruleDEqualityExpression EOF
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
    // InternalDms.g:3832:1: ruleDEqualityExpression returns [EObject current=null] : (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) ;
    public final EObject ruleDEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3838:2: ( (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* ) )
            // InternalDms.g:3839:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            {
            // InternalDms.g:3839:2: (this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )* )
            // InternalDms.g:3840:3: this_DRelationalExpression_0= ruleDRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getDRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_68);
            this_DRelationalExpression_0=ruleDRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3848:3: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                switch ( input.LA(1) ) {
                case 105:
                    {
                    int LA79_2 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt79=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA79_3 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt79=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA79_4 = input.LA(2);

                    if ( (synpred3_InternalDms()) ) {
                        alt79=1;
                    }


                    }
                    break;

                }

                switch (alt79) {
            	case 1 :
            	    // InternalDms.g:3849:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    {
            	    // InternalDms.g:3849:4: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) ) )
            	    // InternalDms.g:3850:5: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    {
            	    // InternalDms.g:3860:5: ( () ( (lv_operator_2_0= ruleOpEquality ) ) )
            	    // InternalDms.g:3861:6: () ( (lv_operator_2_0= ruleOpEquality ) )
            	    {
            	    // InternalDms.g:3861:6: ()
            	    // InternalDms.g:3862:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDEqualityExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:3868:6: ( (lv_operator_2_0= ruleOpEquality ) )
            	    // InternalDms.g:3869:7: (lv_operator_2_0= ruleOpEquality )
            	    {
            	    // InternalDms.g:3869:7: (lv_operator_2_0= ruleOpEquality )
            	    // InternalDms.g:3870:8: lv_operator_2_0= ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getOperatorOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:3889:4: ( (lv_rightOperand_3_0= ruleDRelationalExpression ) )
            	    // InternalDms.g:3890:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    {
            	    // InternalDms.g:3890:5: (lv_rightOperand_3_0= ruleDRelationalExpression )
            	    // InternalDms.g:3891:6: lv_rightOperand_3_0= ruleDRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDEqualityExpressionAccess().getRightOperandDRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_68);
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
            	    break loop79;
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
    // InternalDms.g:3913:1: entryRuleDRelationalExpression returns [EObject current=null] : iv_ruleDRelationalExpression= ruleDRelationalExpression EOF ;
    public final EObject entryRuleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRelationalExpression = null;


        try {
            // InternalDms.g:3913:62: (iv_ruleDRelationalExpression= ruleDRelationalExpression EOF )
            // InternalDms.g:3914:2: iv_ruleDRelationalExpression= ruleDRelationalExpression EOF
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
    // InternalDms.g:3920:1: ruleDRelationalExpression returns [EObject current=null] : (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDms.g:3926:2: ( (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* ) )
            // InternalDms.g:3927:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            {
            // InternalDms.g:3927:2: (this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )* )
            // InternalDms.g:3928:3: this_DOtherOperatorExpression_0= ruleDOtherOperatorExpression ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getDOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_69);
            this_DOtherOperatorExpression_0=ruleDOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:3936:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*
            loop80:
            do {
                int alt80=3;
                alt80 = dfa80.predict(input);
                switch (alt80) {
            	case 1 :
            	    // InternalDms.g:3937:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDms.g:3937:4: ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDms.g:3938:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDms.g:3938:5: ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) )
            	    // InternalDms.g:3939:6: ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf )
            	    {
            	    // InternalDms.g:3945:6: ( () ruleOpInstanceOf )
            	    // InternalDms.g:3946:7: () ruleOpInstanceOf
            	    {
            	    // InternalDms.g:3946:7: ()
            	    // InternalDms.g:3947:8: 
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
            	    pushFollow(FOLLOW_6);
            	    ruleOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:3962:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDms.g:3963:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDms.g:3963:6: (otherlv_3= RULE_ID )
            	    // InternalDms.g:3964:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDms.g:3977:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    {
            	    // InternalDms.g:3977:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) )
            	    // InternalDms.g:3978:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    {
            	    // InternalDms.g:3978:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDms.g:3979:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDms.g:3989:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDms.g:3990:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDms.g:3990:7: ()
            	    // InternalDms.g:3991:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDRelationalExpressionAccess().getDBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDms.g:3997:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDms.g:3998:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDms.g:3998:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDms.g:3999:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:4018:5: ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) )
            	    // InternalDms.g:4019:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    {
            	    // InternalDms.g:4019:6: (lv_rightOperand_6_0= ruleDOtherOperatorExpression )
            	    // InternalDms.g:4020:7: lv_rightOperand_6_0= ruleDOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDRelationalExpressionAccess().getRightOperandDOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_69);
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
            	    break loop80;
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
    // InternalDms.g:4043:1: entryRuleOpInstanceOf returns [String current=null] : iv_ruleOpInstanceOf= ruleOpInstanceOf EOF ;
    public final String entryRuleOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpInstanceOf = null;


        try {
            // InternalDms.g:4043:52: (iv_ruleOpInstanceOf= ruleOpInstanceOf EOF )
            // InternalDms.g:4044:2: iv_ruleOpInstanceOf= ruleOpInstanceOf EOF
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
    // InternalDms.g:4050:1: ruleOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:4056:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDms.g:4057:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDms.g:4057:2: (kw= 'ISA' | kw= 'isa' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==64) ) {
                alt81=1;
            }
            else if ( (LA81_0==65) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalDms.g:4058:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4064:3: kw= 'isa'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:4073:1: entryRuleDOtherOperatorExpression returns [EObject current=null] : iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF ;
    public final EObject entryRuleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOtherOperatorExpression = null;


        try {
            // InternalDms.g:4073:65: (iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF )
            // InternalDms.g:4074:2: iv_ruleDOtherOperatorExpression= ruleDOtherOperatorExpression EOF
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
    // InternalDms.g:4080:1: ruleDOtherOperatorExpression returns [EObject current=null] : (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) ;
    public final EObject ruleDOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4086:2: ( (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* ) )
            // InternalDms.g:4087:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            {
            // InternalDms.g:4087:2: (this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )* )
            // InternalDms.g:4088:3: this_DAdditiveExpression_0= ruleDAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getDAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_70);
            this_DAdditiveExpression_0=ruleDAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4096:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) ) )*
            loop82:
            do {
                int alt82=2;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA82_2 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt82=1;
                    }


                    }
                    break;
                case 114:
                    {
                    int LA82_3 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt82=1;
                    }


                    }
                    break;
                case 115:
                    {
                    int LA82_4 = input.LA(2);

                    if ( (synpred6_InternalDms()) ) {
                        alt82=1;
                    }


                    }
                    break;

                }

                switch (alt82) {
            	case 1 :
            	    // InternalDms.g:4097:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    {
            	    // InternalDms.g:4097:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDms.g:4098:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDms.g:4108:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDms.g:4109:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDms.g:4109:6: ()
            	    // InternalDms.g:4110:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDOtherOperatorExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:4116:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDms.g:4117:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDms.g:4117:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDms.g:4118:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:4137:4: ( (lv_rightOperand_3_0= ruleDAdditiveExpression ) )
            	    // InternalDms.g:4138:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    {
            	    // InternalDms.g:4138:5: (lv_rightOperand_3_0= ruleDAdditiveExpression )
            	    // InternalDms.g:4139:6: lv_rightOperand_3_0= ruleDAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandDAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_70);
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
            	    break loop82;
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
    // InternalDms.g:4161:1: entryRuleDAdditiveExpression returns [EObject current=null] : iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF ;
    public final EObject entryRuleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAdditiveExpression = null;


        try {
            // InternalDms.g:4161:60: (iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF )
            // InternalDms.g:4162:2: iv_ruleDAdditiveExpression= ruleDAdditiveExpression EOF
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
    // InternalDms.g:4168:1: ruleDAdditiveExpression returns [EObject current=null] : (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4174:2: ( (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* ) )
            // InternalDms.g:4175:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            {
            // InternalDms.g:4175:2: (this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )* )
            // InternalDms.g:4176:3: this_DMultiplicativeExpression_0= ruleDMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getDMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_71);
            this_DMultiplicativeExpression_0=ruleDMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4184:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==91) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred7_InternalDms()) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==92) ) {
                    int LA83_3 = input.LA(2);

                    if ( (synpred7_InternalDms()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // InternalDms.g:4185:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    {
            	    // InternalDms.g:4185:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDms.g:4186:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDms.g:4196:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDms.g:4197:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDms.g:4197:6: ()
            	    // InternalDms.g:4198:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDAdditiveExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:4204:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDms.g:4205:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDms.g:4205:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDms.g:4206:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:4225:4: ( (lv_rightOperand_3_0= ruleDMultiplicativeExpression ) )
            	    // InternalDms.g:4226:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    {
            	    // InternalDms.g:4226:5: (lv_rightOperand_3_0= ruleDMultiplicativeExpression )
            	    // InternalDms.g:4227:6: lv_rightOperand_3_0= ruleDMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDAdditiveExpressionAccess().getRightOperandDMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_71);
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
            	    break loop83;
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
    // InternalDms.g:4249:1: entryRuleDMultiplicativeExpression returns [EObject current=null] : iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF ;
    public final EObject entryRuleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicativeExpression = null;


        try {
            // InternalDms.g:4249:66: (iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF )
            // InternalDms.g:4250:2: iv_ruleDMultiplicativeExpression= ruleDMultiplicativeExpression EOF
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
    // InternalDms.g:4256:1: ruleDMultiplicativeExpression returns [EObject current=null] : (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) ;
    public final EObject ruleDMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4262:2: ( (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* ) )
            // InternalDms.g:4263:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            {
            // InternalDms.g:4263:2: (this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )* )
            // InternalDms.g:4264:3: this_DUnaryOperation_0= ruleDUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getDUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_72);
            this_DUnaryOperation_0=ruleDUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4272:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) ) )*
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case 82:
                    {
                    int LA84_2 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt84=1;
                    }


                    }
                    break;
                case 116:
                    {
                    int LA84_3 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt84=1;
                    }


                    }
                    break;
                case 117:
                    {
                    int LA84_4 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt84=1;
                    }


                    }
                    break;
                case 118:
                    {
                    int LA84_5 = input.LA(2);

                    if ( (synpred8_InternalDms()) ) {
                        alt84=1;
                    }


                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // InternalDms.g:4273:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    {
            	    // InternalDms.g:4273:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDms.g:4274:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDms.g:4284:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDms.g:4285:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDms.g:4285:6: ()
            	    // InternalDms.g:4286:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDMultiplicativeExpressionAccess().getDBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDms.g:4292:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDms.g:4293:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDms.g:4293:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDms.g:4294:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_19);
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

            	    // InternalDms.g:4313:4: ( (lv_rightOperand_3_0= ruleDUnaryOperation ) )
            	    // InternalDms.g:4314:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    {
            	    // InternalDms.g:4314:5: (lv_rightOperand_3_0= ruleDUnaryOperation )
            	    // InternalDms.g:4315:6: lv_rightOperand_3_0= ruleDUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandDUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_72);
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
            	    break loop84;
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
    // InternalDms.g:4337:1: entryRuleDUnaryOperation returns [EObject current=null] : iv_ruleDUnaryOperation= ruleDUnaryOperation EOF ;
    public final EObject entryRuleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUnaryOperation = null;


        try {
            // InternalDms.g:4337:56: (iv_ruleDUnaryOperation= ruleDUnaryOperation EOF )
            // InternalDms.g:4338:2: iv_ruleDUnaryOperation= ruleDUnaryOperation EOF
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
    // InternalDms.g:4344:1: ruleDUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) ;
    public final EObject ruleDUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDms.g:4350:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression ) )
            // InternalDms.g:4351:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            {
            // InternalDms.g:4351:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) ) | this_DCastExpression_3= ruleDCastExpression )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=91 && LA85_0<=92)||(LA85_0>=119 && LA85_0<=121)) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=RULE_ID && LA85_0<=RULE_NATURAL)||LA85_0==20||(LA85_0>=68 && LA85_0<=76)||LA85_0==80||(LA85_0>=83 && LA85_0<=88)) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalDms.g:4352:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    {
                    // InternalDms.g:4352:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) ) )
                    // InternalDms.g:4353:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    {
                    // InternalDms.g:4353:4: ()
                    // InternalDms.g:4354:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDUnaryOperationAccess().getDUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDms.g:4360:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDms.g:4361:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDms.g:4361:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDms.g:4362:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalDms.g:4379:4: ( (lv_operand_2_0= ruleDUnaryOperation ) )
                    // InternalDms.g:4380:5: (lv_operand_2_0= ruleDUnaryOperation )
                    {
                    // InternalDms.g:4380:5: (lv_operand_2_0= ruleDUnaryOperation )
                    // InternalDms.g:4381:6: lv_operand_2_0= ruleDUnaryOperation
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
                    // InternalDms.g:4400:3: this_DCastExpression_3= ruleDCastExpression
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
    // InternalDms.g:4412:1: entryRuleDCastExpression returns [EObject current=null] : iv_ruleDCastExpression= ruleDCastExpression EOF ;
    public final EObject entryRuleDCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCastExpression = null;


        try {
            // InternalDms.g:4412:56: (iv_ruleDCastExpression= ruleDCastExpression EOF )
            // InternalDms.g:4413:2: iv_ruleDCastExpression= ruleDCastExpression EOF
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
    // InternalDms.g:4419:1: ruleDCastExpression returns [EObject current=null] : (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DTypedMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4425:2: ( (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDms.g:4426:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDms.g:4426:2: (this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDms.g:4427:3: this_DTypedMemberReference_0= ruleDTypedMemberReference ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDCastExpressionAccess().getDTypedMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_73);
            this_DTypedMemberReference_0=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DTypedMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4435:3: ( ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==66) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred9_InternalDms()) ) {
                    alt86=1;
                }
            }
            else if ( (LA86_0==67) ) {
                int LA86_2 = input.LA(2);

                if ( (synpred9_InternalDms()) ) {
                    alt86=1;
                }
            }
            switch (alt86) {
                case 1 :
                    // InternalDms.g:4436:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDms.g:4436:4: ( ( ( () ruleOpCast ) )=> ( () ruleOpCast ) )
                    // InternalDms.g:4437:5: ( ( () ruleOpCast ) )=> ( () ruleOpCast )
                    {
                    // InternalDms.g:4443:5: ( () ruleOpCast )
                    // InternalDms.g:4444:6: () ruleOpCast
                    {
                    // InternalDms.g:4444:6: ()
                    // InternalDms.g:4445:7: 
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
                    pushFollow(FOLLOW_6);
                    ruleOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDms.g:4460:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDms.g:4461:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDms.g:4461:5: (otherlv_3= RULE_ID )
                    // InternalDms.g:4462:6: otherlv_3= RULE_ID
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
    // InternalDms.g:4478:1: entryRuleOpCast returns [String current=null] : iv_ruleOpCast= ruleOpCast EOF ;
    public final String entryRuleOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCast = null;


        try {
            // InternalDms.g:4478:46: (iv_ruleOpCast= ruleOpCast EOF )
            // InternalDms.g:4479:2: iv_ruleOpCast= ruleOpCast EOF
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
    // InternalDms.g:4485:1: ruleOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:4491:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDms.g:4492:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDms.g:4492:2: (kw= 'AS' | kw= 'as' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==66) ) {
                alt87=1;
            }
            else if ( (LA87_0==67) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalDms.g:4493:3: kw= 'AS'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4499:3: kw= 'as'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDTypedMemberReference"
    // InternalDms.g:4508:1: entryRuleDTypedMemberReference returns [EObject current=null] : iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF ;
    public final EObject entryRuleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTypedMemberReference = null;


        try {
            // InternalDms.g:4508:62: (iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF )
            // InternalDms.g:4509:2: iv_ruleDTypedMemberReference= ruleDTypedMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDTypedMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDTypedMemberReference=ruleDTypedMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDTypedMemberReference; 
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
    // $ANTLR end "entryRuleDTypedMemberReference"


    // $ANTLR start "ruleDTypedMemberReference"
    // InternalDms.g:4515:1: ruleDTypedMemberReference returns [EObject current=null] : (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )* ) ;
    public final EObject ruleDTypedMemberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_DPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_memberCallArguments_10_0 = null;

        EObject lv_memberCallArguments_12_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4521:2: ( (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )* ) )
            // InternalDms.g:4522:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )* )
            {
            // InternalDms.g:4522:2: (this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )* )
            // InternalDms.g:4523:3: this_DPrimaryExpression_0= ruleDPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getDPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_DPrimaryExpression_0=ruleDPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:4531:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? ) )*
            loop91:
            do {
                int alt91=3;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==27) ) {
                    int LA91_2 = input.LA(2);

                    if ( (synpred10_InternalDms()) ) {
                        alt91=1;
                    }
                    else if ( (synpred11_InternalDms()) ) {
                        alt91=2;
                    }


                }


                switch (alt91) {
            	case 1 :
            	    // InternalDms.g:4532:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    {
            	    // InternalDms.g:4532:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) ) )
            	    // InternalDms.g:4533:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleDAssignment ) )
            	    {
            	    // InternalDms.g:4533:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // InternalDms.g:4534:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // InternalDms.g:4546:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // InternalDms.g:4547:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // InternalDms.g:4547:7: ()
            	    // InternalDms.g:4548:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDAssignmentMemberContainerAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDms.g:4558:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDms.g:4559:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDms.g:4559:8: (otherlv_3= RULE_ID )
            	    // InternalDms.g:4560:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:4580:5: ( (lv_value_5_0= ruleDAssignment ) )
            	    // InternalDms.g:4581:6: (lv_value_5_0= ruleDAssignment )
            	    {
            	    // InternalDms.g:4581:6: (lv_value_5_0= ruleDAssignment )
            	    // InternalDms.g:4582:7: lv_value_5_0= ruleDAssignment
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getValueDAssignmentParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_value_5_0=ruleDAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
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
            	    // InternalDms.g:4601:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? )
            	    {
            	    // InternalDms.g:4601:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )? )
            	    // InternalDms.g:4602:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )?
            	    {
            	    // InternalDms.g:4602:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDms.g:4603:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDms.g:4609:6: ( () otherlv_7= '.' )
            	    // InternalDms.g:4610:7: () otherlv_7= '.'
            	    {
            	    // InternalDms.g:4610:7: ()
            	    // InternalDms.g:4611:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDTypedMemberReferenceAccess().getDTypedMemberReferenceMemberContainerAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDTypedMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:4623:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDms.g:4624:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDms.g:4624:6: (otherlv_8= RULE_ID )
            	    // InternalDms.g:4625:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDTypedMemberReferenceAccess().getMemberDTypedMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDms.g:4636:5: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')' )?
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==20) && (synpred12_InternalDms())) {
            	        alt90=1;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalDms.g:4637:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )? otherlv_13= ')'
            	            {
            	            // InternalDms.g:4637:6: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDms.g:4638:7: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDms.g:4642:7: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDms.g:4643:8: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,20,FOLLOW_75); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDTypedMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDTypedMemberReferenceRule());
            	              								}
            	              								setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              							
            	            }

            	            }


            	            }

            	            // InternalDms.g:4655:6: ( ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )* )?
            	            int alt89=2;
            	            int LA89_0 = input.LA(1);

            	            if ( ((LA89_0>=RULE_ID && LA89_0<=RULE_NATURAL)||LA89_0==20||(LA89_0>=68 && LA89_0<=76)||LA89_0==80||(LA89_0>=83 && LA89_0<=88)||(LA89_0>=91 && LA89_0<=92)||(LA89_0>=119 && LA89_0<=121)) ) {
            	                alt89=1;
            	            }
            	            switch (alt89) {
            	                case 1 :
            	                    // InternalDms.g:4656:7: ( (lv_memberCallArguments_10_0= ruleDExpression ) ) (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    {
            	                    // InternalDms.g:4656:7: ( (lv_memberCallArguments_10_0= ruleDExpression ) )
            	                    // InternalDms.g:4657:8: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    {
            	                    // InternalDms.g:4657:8: (lv_memberCallArguments_10_0= ruleDExpression )
            	                    // InternalDms.g:4658:9: lv_memberCallArguments_10_0= ruleDExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_0_0());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_9);
            	                    lv_memberCallArguments_10_0=ruleDExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									if (current==null) {
            	                      										current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
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

            	                    // InternalDms.g:4675:7: (otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) ) )*
            	                    loop88:
            	                    do {
            	                        int alt88=2;
            	                        int LA88_0 = input.LA(1);

            	                        if ( (LA88_0==21) ) {
            	                            alt88=1;
            	                        }


            	                        switch (alt88) {
            	                    	case 1 :
            	                    	    // InternalDms.g:4676:8: otherlv_11= ',' ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    {
            	                    	    otherlv_11=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      								newLeafNode(otherlv_11, grammarAccess.getDTypedMemberReferenceAccess().getCommaKeyword_1_1_2_1_1_0());
            	                    	      							
            	                    	    }
            	                    	    // InternalDms.g:4680:8: ( (lv_memberCallArguments_12_0= ruleDExpression ) )
            	                    	    // InternalDms.g:4681:9: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    {
            	                    	    // InternalDms.g:4681:9: (lv_memberCallArguments_12_0= ruleDExpression )
            	                    	    // InternalDms.g:4682:10: lv_memberCallArguments_12_0= ruleDExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										newCompositeNode(grammarAccess.getDTypedMemberReferenceAccess().getMemberCallArgumentsDExpressionParserRuleCall_1_1_2_1_1_1_0());
            	                    	      									
            	                    	    }
            	                    	    pushFollow(FOLLOW_9);
            	                    	    lv_memberCallArguments_12_0=ruleDExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										if (current==null) {
            	                    	      											current = createModelElementForParent(grammarAccess.getDTypedMemberReferenceRule());
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
            	                    	    break loop88;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_13, grammarAccess.getDTypedMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_2());
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
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
    // $ANTLR end "ruleDTypedMemberReference"


    // $ANTLR start "entryRuleDPrimaryExpression"
    // InternalDms.g:4712:1: entryRuleDPrimaryExpression returns [EObject current=null] : iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF ;
    public final EObject entryRuleDPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPrimaryExpression = null;


        try {
            // InternalDms.g:4712:59: (iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF )
            // InternalDms.g:4713:2: iv_ruleDPrimaryExpression= ruleDPrimaryExpression EOF
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
    // InternalDms.g:4719:1: ruleDPrimaryExpression returns [EObject current=null] : (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) ;
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
            // InternalDms.g:4725:2: ( (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) ) )
            // InternalDms.g:4726:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            {
            // InternalDms.g:4726:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )
            int alt92=10;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // InternalDms.g:4727:3: this_DLiteralExpression_0= ruleDLiteralExpression
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
                    // InternalDms.g:4736:3: this_DSelfExpression_1= ruleDSelfExpression
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
                    // InternalDms.g:4745:3: this_DReturnExpression_2= ruleDReturnExpression
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
                    // InternalDms.g:4754:3: this_DRaiseExpression_3= ruleDRaiseExpression
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
                    // InternalDms.g:4763:3: this_DParenthesizedExpression_4= ruleDParenthesizedExpression
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
                    // InternalDms.g:4772:3: this_DFunctionCall_5= ruleDFunctionCall
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
                    // InternalDms.g:4781:3: this_DConstructorCall_6= ruleDConstructorCall
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
                    // InternalDms.g:4790:3: this_DContextReference_7= ruleDContextReference
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
                    // InternalDms.g:4799:3: this_DIfExpression_8= ruleDIfExpression
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
                    // InternalDms.g:4808:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    {
                    // InternalDms.g:4808:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression )
                    // InternalDms.g:4809:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression
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
    // InternalDms.g:4834:1: entryRuleDLiteralExpression returns [EObject current=null] : iv_ruleDLiteralExpression= ruleDLiteralExpression EOF ;
    public final EObject entryRuleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDLiteralExpression = null;


        try {
            // InternalDms.g:4834:59: (iv_ruleDLiteralExpression= ruleDLiteralExpression EOF )
            // InternalDms.g:4835:2: iv_ruleDLiteralExpression= ruleDLiteralExpression EOF
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
    // InternalDms.g:4841:1: ruleDLiteralExpression returns [EObject current=null] : (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) ;
    public final EObject ruleDLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DBooleanLiteral_0 = null;

        EObject this_DStringLiteral_1 = null;

        EObject this_DNaturalLiteral_2 = null;

        EObject this_DDecimalLiteral_3 = null;

        EObject this_DNilLiteral_4 = null;



        	enterRule();

        try {
            // InternalDms.g:4847:2: ( (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral ) )
            // InternalDms.g:4848:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            {
            // InternalDms.g:4848:2: (this_DBooleanLiteral_0= ruleDBooleanLiteral | this_DStringLiteral_1= ruleDStringLiteral | this_DNaturalLiteral_2= ruleDNaturalLiteral | this_DDecimalLiteral_3= ruleDDecimalLiteral | this_DNilLiteral_4= ruleDNilLiteral )
            int alt93=5;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt93=1;
                }
                break;
            case RULE_STRING:
                {
                alt93=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA93_3 = input.LA(2);

                if ( (LA93_3==27) ) {
                    int LA93_5 = input.LA(3);

                    if ( (LA93_5==RULE_NATURAL) ) {
                        alt93=4;
                    }
                    else if ( (LA93_5==RULE_ID) ) {
                        alt93=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA93_3==EOF||LA93_3==RULE_ID||(LA93_3>=RULE_PLAIN_TEXT_ONLY && LA93_3<=RULE_PLAIN_TEXT_END)||LA93_3==18||(LA93_3>=21 && LA93_3<=22)||(LA93_3>=28 && LA93_3<=30)||(LA93_3>=32 && LA93_3<=36)||(LA93_3>=38 && LA93_3<=40)||LA93_3==43||(LA93_3>=47 && LA93_3<=48)||LA93_3==53||(LA93_3>=55 && LA93_3<=57)||(LA93_3>=60 && LA93_3<=62)||(LA93_3>=64 && LA93_3<=67)||(LA93_3>=77 && LA93_3<=79)||(LA93_3>=81 && LA93_3<=82)||(LA93_3>=91 && LA93_3<=94)||(LA93_3>=99 && LA93_3<=118)) ) {
                    alt93=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 3, input);

                    throw nvae;
                }
                }
                break;
            case 87:
            case 88:
                {
                alt93=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalDms.g:4849:3: this_DBooleanLiteral_0= ruleDBooleanLiteral
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
                    // InternalDms.g:4858:3: this_DStringLiteral_1= ruleDStringLiteral
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
                    // InternalDms.g:4867:3: this_DNaturalLiteral_2= ruleDNaturalLiteral
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
                    // InternalDms.g:4876:3: this_DDecimalLiteral_3= ruleDDecimalLiteral
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
                    // InternalDms.g:4885:3: this_DNilLiteral_4= ruleDNilLiteral
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
    // InternalDms.g:4897:1: entryRuleDSelfExpression returns [EObject current=null] : iv_ruleDSelfExpression= ruleDSelfExpression EOF ;
    public final EObject entryRuleDSelfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSelfExpression = null;


        try {
            // InternalDms.g:4897:56: (iv_ruleDSelfExpression= ruleDSelfExpression EOF )
            // InternalDms.g:4898:2: iv_ruleDSelfExpression= ruleDSelfExpression EOF
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
    // InternalDms.g:4904:1: ruleDSelfExpression returns [EObject current=null] : ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) ;
    public final EObject ruleDSelfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDms.g:4910:2: ( ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) ) )
            // InternalDms.g:4911:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            {
            // InternalDms.g:4911:2: ( () (otherlv_1= 'SELF' | otherlv_2= 'self' ) )
            // InternalDms.g:4912:3: () (otherlv_1= 'SELF' | otherlv_2= 'self' )
            {
            // InternalDms.g:4912:3: ()
            // InternalDms.g:4913:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDSelfExpressionAccess().getDSelfExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4919:3: (otherlv_1= 'SELF' | otherlv_2= 'self' )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==68) ) {
                alt94=1;
            }
            else if ( (LA94_0==69) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalDms.g:4920:4: otherlv_1= 'SELF'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDSelfExpressionAccess().getSELFKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4925:4: otherlv_2= 'self'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:4934:1: entryRuleDReturnExpression returns [EObject current=null] : iv_ruleDReturnExpression= ruleDReturnExpression EOF ;
    public final EObject entryRuleDReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDReturnExpression = null;


        try {
            // InternalDms.g:4934:58: (iv_ruleDReturnExpression= ruleDReturnExpression EOF )
            // InternalDms.g:4935:2: iv_ruleDReturnExpression= ruleDReturnExpression EOF
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
    // InternalDms.g:4941:1: ruleDReturnExpression returns [EObject current=null] : ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) ;
    public final EObject ruleDReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:4947:2: ( ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? ) )
            // InternalDms.g:4948:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            {
            // InternalDms.g:4948:2: ( () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )? )
            // InternalDms.g:4949:3: () (otherlv_1= 'RETURN' | otherlv_2= 'return' ) ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            {
            // InternalDms.g:4949:3: ()
            // InternalDms.g:4950:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDReturnExpressionAccess().getDReturnExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:4956:3: (otherlv_1= 'RETURN' | otherlv_2= 'return' )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==70) ) {
                alt95=1;
            }
            else if ( (LA95_0==71) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalDms.g:4957:4: otherlv_1= 'RETURN'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDReturnExpressionAccess().getRETURNKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:4962:4: otherlv_2= 'return'
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_76); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDReturnExpressionAccess().getReturnKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:4967:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?
            int alt96=2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // InternalDms.g:4968:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression )
                    {
                    // InternalDms.g:4969:4: (lv_expression_3_0= ruleDExpression )
                    // InternalDms.g:4970:5: lv_expression_3_0= ruleDExpression
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
    // InternalDms.g:4991:1: entryRuleDRaiseExpression returns [EObject current=null] : iv_ruleDRaiseExpression= ruleDRaiseExpression EOF ;
    public final EObject entryRuleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRaiseExpression = null;


        try {
            // InternalDms.g:4991:57: (iv_ruleDRaiseExpression= ruleDRaiseExpression EOF )
            // InternalDms.g:4992:2: iv_ruleDRaiseExpression= ruleDRaiseExpression EOF
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
    // InternalDms.g:4998:1: ruleDRaiseExpression returns [EObject current=null] : ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) ;
    public final EObject ruleDRaiseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDms.g:5004:2: ( ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) ) )
            // InternalDms.g:5005:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            {
            // InternalDms.g:5005:2: ( () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) ) )
            // InternalDms.g:5006:3: () (otherlv_1= 'RAISE' | otherlv_2= 'raise' ) ( (lv_expression_3_0= ruleDExpression ) )
            {
            // InternalDms.g:5006:3: ()
            // InternalDms.g:5007:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDRaiseExpressionAccess().getDRaiseExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5013:3: (otherlv_1= 'RAISE' | otherlv_2= 'raise' )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==72) ) {
                alt97=1;
            }
            else if ( (LA97_0==73) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalDms.g:5014:4: otherlv_1= 'RAISE'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDRaiseExpressionAccess().getRAISEKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:5019:4: otherlv_2= 'raise'
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDRaiseExpressionAccess().getRaiseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalDms.g:5024:3: ( (lv_expression_3_0= ruleDExpression ) )
            // InternalDms.g:5025:4: (lv_expression_3_0= ruleDExpression )
            {
            // InternalDms.g:5025:4: (lv_expression_3_0= ruleDExpression )
            // InternalDms.g:5026:5: lv_expression_3_0= ruleDExpression
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
    // InternalDms.g:5047:1: entryRuleDParenthesizedExpression returns [EObject current=null] : iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF ;
    public final EObject entryRuleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDParenthesizedExpression = null;


        try {
            // InternalDms.g:5047:65: (iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF )
            // InternalDms.g:5048:2: iv_ruleDParenthesizedExpression= ruleDParenthesizedExpression EOF
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
    // InternalDms.g:5054:1: ruleDParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDms.g:5060:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDms.g:5061:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDms.g:5061:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDms.g:5062:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_36);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5082:1: entryRuleDFunctionCall returns [EObject current=null] : iv_ruleDFunctionCall= ruleDFunctionCall EOF ;
    public final EObject entryRuleDFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDFunctionCall = null;


        try {
            // InternalDms.g:5082:54: (iv_ruleDFunctionCall= ruleDFunctionCall EOF )
            // InternalDms.g:5083:2: iv_ruleDFunctionCall= ruleDFunctionCall EOF
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
    // InternalDms.g:5089:1: ruleDFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalDms.g:5095:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalDms.g:5096:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalDms.g:5096:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')' )
            // InternalDms.g:5097:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalDms.g:5097:3: ()
            // InternalDms.g:5098:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDFunctionCallAccess().getDFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5104:3: ( (otherlv_1= RULE_ID ) )
            // InternalDms.g:5105:4: (otherlv_1= RULE_ID )
            {
            // InternalDms.g:5105:4: (otherlv_1= RULE_ID )
            // InternalDms.g:5106:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDFunctionCallAccess().getFunctionDFunctionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDms.g:5121:3: ( ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )* )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=RULE_ID && LA99_0<=RULE_NATURAL)||LA99_0==20||(LA99_0>=68 && LA99_0<=76)||LA99_0==80||(LA99_0>=83 && LA99_0<=88)||(LA99_0>=91 && LA99_0<=92)||(LA99_0>=119 && LA99_0<=121)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDms.g:5122:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) ) (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    {
                    // InternalDms.g:5122:4: ( (lv_functionCallArguments_3_0= ruleDExpression ) )
                    // InternalDms.g:5123:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    {
                    // InternalDms.g:5123:5: (lv_functionCallArguments_3_0= ruleDExpression )
                    // InternalDms.g:5124:6: lv_functionCallArguments_3_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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

                    // InternalDms.g:5141:4: (otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==21) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalDms.g:5142:5: otherlv_4= ',' ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDFunctionCallAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDms.g:5146:5: ( (lv_functionCallArguments_5_0= ruleDExpression ) )
                    	    // InternalDms.g:5147:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    {
                    	    // InternalDms.g:5147:6: (lv_functionCallArguments_5_0= ruleDExpression )
                    	    // InternalDms.g:5148:7: lv_functionCallArguments_5_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsDExpressionParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop98;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5175:1: entryRuleDConstructorCall returns [EObject current=null] : iv_ruleDConstructorCall= ruleDConstructorCall EOF ;
    public final EObject entryRuleDConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDConstructorCall = null;


        try {
            // InternalDms.g:5175:57: (iv_ruleDConstructorCall= ruleDConstructorCall EOF )
            // InternalDms.g:5176:2: iv_ruleDConstructorCall= ruleDConstructorCall EOF
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
    // InternalDms.g:5182:1: ruleDConstructorCall returns [EObject current=null] : ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) ;
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
            // InternalDms.g:5188:2: ( ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? ) )
            // InternalDms.g:5189:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            {
            // InternalDms.g:5189:2: ( () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )? )
            // InternalDms.g:5190:3: () ruleOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            {
            // InternalDms.g:5190:3: ()
            // InternalDms.g:5191:4: 
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
            pushFollow(FOLLOW_6);
            ruleOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDms.g:5204:3: ( (otherlv_2= RULE_ID ) )
            // InternalDms.g:5205:4: (otherlv_2= RULE_ID )
            {
            // InternalDms.g:5205:4: (otherlv_2= RULE_ID )
            // InternalDms.g:5206:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDConstructorCallAccess().getConstructorDIdentityTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDms.g:5217:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==20) && (synpred15_InternalDms())) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDms.g:5218:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )? otherlv_7= ')'
                    {
                    // InternalDms.g:5218:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDms.g:5219:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDms.g:5223:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDms.g:5224:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,20,FOLLOW_75); if (state.failed) return current;
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

                    // InternalDms.g:5236:4: ( ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )* )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( ((LA101_0>=RULE_ID && LA101_0<=RULE_NATURAL)||LA101_0==20||(LA101_0>=68 && LA101_0<=76)||LA101_0==80||(LA101_0>=83 && LA101_0<=88)||(LA101_0>=91 && LA101_0<=92)||(LA101_0>=119 && LA101_0<=121)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalDms.g:5237:5: ( (lv_arguments_4_0= ruleDExpression ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            {
                            // InternalDms.g:5237:5: ( (lv_arguments_4_0= ruleDExpression ) )
                            // InternalDms.g:5238:6: (lv_arguments_4_0= ruleDExpression )
                            {
                            // InternalDms.g:5238:6: (lv_arguments_4_0= ruleDExpression )
                            // InternalDms.g:5239:7: lv_arguments_4_0= ruleDExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_9);
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

                            // InternalDms.g:5256:5: (otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) ) )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==21) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // InternalDms.g:5257:6: otherlv_5= ',' ( (lv_arguments_6_0= ruleDExpression ) )
                            	    {
                            	    otherlv_5=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getDConstructorCallAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalDms.g:5261:6: ( (lv_arguments_6_0= ruleDExpression ) )
                            	    // InternalDms.g:5262:7: (lv_arguments_6_0= ruleDExpression )
                            	    {
                            	    // InternalDms.g:5262:7: (lv_arguments_6_0= ruleDExpression )
                            	    // InternalDms.g:5263:8: lv_arguments_6_0= ruleDExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDConstructorCallAccess().getArgumentsDExpressionParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_9);
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
                            	    break loop100;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5291:1: entryRuleOpConstructor returns [String current=null] : iv_ruleOpConstructor= ruleOpConstructor EOF ;
    public final String entryRuleOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpConstructor = null;


        try {
            // InternalDms.g:5291:53: (iv_ruleOpConstructor= ruleOpConstructor EOF )
            // InternalDms.g:5292:2: iv_ruleOpConstructor= ruleOpConstructor EOF
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
    // InternalDms.g:5298:1: ruleOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:5304:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDms.g:5305:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDms.g:5305:2: (kw= 'NEW' | kw= 'new' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==74) ) {
                alt103=1;
            }
            else if ( (LA103_0==75) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalDms.g:5306:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:5312:3: kw= 'new'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5321:1: entryRuleDContextReference returns [EObject current=null] : iv_ruleDContextReference= ruleDContextReference EOF ;
    public final EObject entryRuleDContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContextReference = null;


        try {
            // InternalDms.g:5321:58: (iv_ruleDContextReference= ruleDContextReference EOF )
            // InternalDms.g:5322:2: iv_ruleDContextReference= ruleDContextReference EOF
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
    // InternalDms.g:5328:1: ruleDContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDms.g:5334:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDms.g:5335:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDms.g:5335:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalDms.g:5336:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalDms.g:5336:3: ()
            // InternalDms.g:5337:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDContextReferenceAccess().getDContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5343:3: ( (otherlv_1= RULE_ID ) )
            // InternalDms.g:5344:4: (otherlv_1= RULE_ID )
            {
            // InternalDms.g:5344:4: (otherlv_1= RULE_ID )
            // InternalDms.g:5345:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDContextReferenceAccess().getContextElementDNamedElementCrossReference_1_0());
              				
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
    // $ANTLR end "ruleDContextReference"


    // $ANTLR start "entryRuleDIfExpression"
    // InternalDms.g:5360:1: entryRuleDIfExpression returns [EObject current=null] : iv_ruleDIfExpression= ruleDIfExpression EOF ;
    public final EObject entryRuleDIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDIfExpression = null;


        try {
            // InternalDms.g:5360:54: (iv_ruleDIfExpression= ruleDIfExpression EOF )
            // InternalDms.g:5361:2: iv_ruleDIfExpression= ruleDIfExpression EOF
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
    // InternalDms.g:5367:1: ruleDIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
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
            // InternalDms.g:5373:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDms.g:5374:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDms.g:5374:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDms.g:5375:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDms.g:5375:3: ()
            // InternalDms.g:5376:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDIfExpressionAccess().getDIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDms.g:5386:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDms.g:5387:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDms.g:5387:4: (lv_if_2_0= ruleDExpression )
            // InternalDms.g:5388:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_77);
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

            otherlv_3=(Token)match(input,77,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDms.g:5409:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDms.g:5410:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDms.g:5410:4: (lv_then_4_0= ruleDExpression )
            // InternalDms.g:5411:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_78);
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

            // InternalDms.g:5428:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==78) && (synpred16_InternalDms())) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDms.g:5429:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDms.g:5429:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDms.g:5430:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDms.g:5436:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDms.g:5437:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDms.g:5437:5: (lv_else_6_0= ruleDExpression )
                    // InternalDms.g:5438:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_79);
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

            otherlv_7=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5464:1: entryRuleDForLoopExpression returns [EObject current=null] : iv_ruleDForLoopExpression= ruleDForLoopExpression EOF ;
    public final EObject entryRuleDForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDForLoopExpression = null;


        try {
            // InternalDms.g:5464:59: (iv_ruleDForLoopExpression= ruleDForLoopExpression EOF )
            // InternalDms.g:5465:2: iv_ruleDForLoopExpression= ruleDForLoopExpression EOF
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
    // InternalDms.g:5471:1: ruleDForLoopExpression returns [EObject current=null] : ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) ;
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
            // InternalDms.g:5477:2: ( ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' ) )
            // InternalDms.g:5478:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            {
            // InternalDms.g:5478:2: ( ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end' )
            // InternalDms.g:5479:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) ) ( (lv_forExpression_4_0= ruleDExpression ) ) otherlv_5= 'do' ( (lv_eachExpression_6_0= ruleDExpression ) ) otherlv_7= 'end'
            {
            // InternalDms.g:5479:3: ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' ) )
            // InternalDms.g:5480:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=> ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            {
            // InternalDms.g:5492:4: ( () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':' )
            // InternalDms.g:5493:5: () otherlv_1= 'for' ( (lv_declaredParam_2_0= RULE_ID ) ) otherlv_3= ':'
            {
            // InternalDms.g:5493:5: ()
            // InternalDms.g:5494:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getDForLoopExpressionAccess().getDForLoopExpressionAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDForLoopExpressionAccess().getForKeyword_0_0_1());
              				
            }
            // InternalDms.g:5504:5: ( (lv_declaredParam_2_0= RULE_ID ) )
            // InternalDms.g:5505:6: (lv_declaredParam_2_0= RULE_ID )
            {
            // InternalDms.g:5505:6: (lv_declaredParam_2_0= RULE_ID )
            // InternalDms.g:5506:7: lv_declaredParam_2_0= RULE_ID
            {
            lv_declaredParam_2_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDForLoopExpressionAccess().getColonKeyword_0_0_3());
              				
            }

            }


            }

            // InternalDms.g:5528:3: ( (lv_forExpression_4_0= ruleDExpression ) )
            // InternalDms.g:5529:4: (lv_forExpression_4_0= ruleDExpression )
            {
            // InternalDms.g:5529:4: (lv_forExpression_4_0= ruleDExpression )
            // InternalDms.g:5530:5: lv_forExpression_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getForExpressionDExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_80);
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

            otherlv_5=(Token)match(input,81,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDForLoopExpressionAccess().getDoKeyword_2());
              		
            }
            // InternalDms.g:5551:3: ( (lv_eachExpression_6_0= ruleDExpression ) )
            // InternalDms.g:5552:4: (lv_eachExpression_6_0= ruleDExpression )
            {
            // InternalDms.g:5552:4: (lv_eachExpression_6_0= ruleDExpression )
            // InternalDms.g:5553:5: lv_eachExpression_6_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDForLoopExpressionAccess().getEachExpressionDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_79);
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

            otherlv_7=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5578:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDms.g:5578:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDms.g:5579:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDms.g:5585:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDms.g:5591:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDms.g:5592:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDms.g:5592:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_NATURAL) ) {
                alt105=1;
            }
            else if ( (LA105_0==82) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalDms.g:5593:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDms.g:5601:3: kw= '*'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5610:1: entryRuleDBooleanLiteral returns [EObject current=null] : iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF ;
    public final EObject entryRuleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDBooleanLiteral = null;


        try {
            // InternalDms.g:5610:56: (iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF )
            // InternalDms.g:5611:2: iv_ruleDBooleanLiteral= ruleDBooleanLiteral EOF
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
    // InternalDms.g:5617:1: ruleDBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDms.g:5623:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDms.g:5624:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDms.g:5624:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDms.g:5625:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDms.g:5625:3: ()
            // InternalDms.g:5626:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDBooleanLiteralAccess().getDBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5632:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt106=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt106=1;
                }
                break;
            case 84:
                {
                alt106=2;
                }
                break;
            case 85:
                {
                alt106=3;
                }
                break;
            case 86:
                {
                alt106=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // InternalDms.g:5633:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDms.g:5633:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDms.g:5634:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDms.g:5634:5: (lv_value_1_0= 'TRUE' )
                    // InternalDms.g:5635:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDms.g:5648:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDms.g:5648:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDms.g:5649:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDms.g:5649:5: (lv_value_2_0= 'true' )
                    // InternalDms.g:5650:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
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
                    // InternalDms.g:5663:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDms.g:5668:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:5677:1: entryRuleDStringLiteral returns [EObject current=null] : iv_ruleDStringLiteral= ruleDStringLiteral EOF ;
    public final EObject entryRuleDStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDStringLiteral = null;


        try {
            // InternalDms.g:5677:55: (iv_ruleDStringLiteral= ruleDStringLiteral EOF )
            // InternalDms.g:5678:2: iv_ruleDStringLiteral= ruleDStringLiteral EOF
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
    // InternalDms.g:5684:1: ruleDStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDms.g:5690:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDms.g:5691:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDms.g:5691:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDms.g:5692:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDms.g:5692:3: ()
            // InternalDms.g:5693:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDStringLiteralAccess().getDStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5699:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDms.g:5700:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDms.g:5700:4: (lv_value_1_0= RULE_STRING )
            // InternalDms.g:5701:5: lv_value_1_0= RULE_STRING
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
    // InternalDms.g:5721:1: entryRuleDNaturalLiteral returns [EObject current=null] : iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF ;
    public final EObject entryRuleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNaturalLiteral = null;


        try {
            // InternalDms.g:5721:56: (iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF )
            // InternalDms.g:5722:2: iv_ruleDNaturalLiteral= ruleDNaturalLiteral EOF
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
    // InternalDms.g:5728:1: ruleDNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDms.g:5734:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDms.g:5735:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDms.g:5735:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDms.g:5736:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDms.g:5736:3: ()
            // InternalDms.g:5737:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNaturalLiteralAccess().getDNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5743:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDms.g:5744:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDms.g:5744:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDms.g:5745:5: lv_value_1_0= RULE_NATURAL
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
    // InternalDms.g:5765:1: entryRuleDDecimalLiteral returns [EObject current=null] : iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF ;
    public final EObject entryRuleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDecimalLiteral = null;


        try {
            // InternalDms.g:5765:56: (iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF )
            // InternalDms.g:5766:2: iv_ruleDDecimalLiteral= ruleDDecimalLiteral EOF
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
    // InternalDms.g:5772:1: ruleDDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDms.g:5778:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDms.g:5779:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDms.g:5779:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDms.g:5780:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDms.g:5780:3: ()
            // InternalDms.g:5781:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDDecimalLiteralAccess().getDDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5787:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDms.g:5788:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDms.g:5788:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDms.g:5789:5: lv_value_1_0= ruleDECIMAL
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
    // InternalDms.g:5810:1: entryRuleDNilLiteral returns [EObject current=null] : iv_ruleDNilLiteral= ruleDNilLiteral EOF ;
    public final EObject entryRuleDNilLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNilLiteral = null;


        try {
            // InternalDms.g:5810:52: (iv_ruleDNilLiteral= ruleDNilLiteral EOF )
            // InternalDms.g:5811:2: iv_ruleDNilLiteral= ruleDNilLiteral EOF
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
    // InternalDms.g:5817:1: ruleDNilLiteral returns [EObject current=null] : ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) ) ;
    public final EObject ruleDNilLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDms.g:5823:2: ( ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) ) )
            // InternalDms.g:5824:2: ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) )
            {
            // InternalDms.g:5824:2: ( () (otherlv_1= 'NIL' | otherlv_2= 'nil' ) )
            // InternalDms.g:5825:3: () (otherlv_1= 'NIL' | otherlv_2= 'nil' )
            {
            // InternalDms.g:5825:3: ()
            // InternalDms.g:5826:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDNilLiteralAccess().getDNilLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDms.g:5832:3: (otherlv_1= 'NIL' | otherlv_2= 'nil' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==87) ) {
                alt107=1;
            }
            else if ( (LA107_0==88) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalDms.g:5833:4: otherlv_1= 'NIL'
                    {
                    otherlv_1=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDNilLiteralAccess().getNILKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDms.g:5838:4: otherlv_2= 'nil'
                    {
                    otherlv_2=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDNilLiteralAccess().getNilKeyword_1_1());
                      			
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
    // InternalDms.g:5847:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDms.g:5847:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDms.g:5848:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDms.g:5854:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDms.g:5860:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDms.g:5861:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDms.g:5861:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDms.g:5862:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,27,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDms.g:5881:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=89 && LA110_0<=90)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalDms.g:5882:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDms.g:5882:4: (kw= 'E' | kw= 'e' )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==89) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==90) ) {
                        alt108=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalDms.g:5883:5: kw= 'E'
                            {
                            kw=(Token)match(input,89,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDms.g:5889:5: kw= 'e'
                            {
                            kw=(Token)match(input,90,FOLLOW_83); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDms.g:5895:4: (kw= '+' | kw= '-' )?
                    int alt109=3;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==91) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==92) ) {
                        alt109=2;
                    }
                    switch (alt109) {
                        case 1 :
                            // InternalDms.g:5896:5: kw= '+'
                            {
                            kw=(Token)match(input,91,FOLLOW_33); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDms.g:5902:5: kw= '-'
                            {
                            kw=(Token)match(input,92,FOLLOW_33); if (state.failed) return current;
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


    // $ANTLR start "ruleDAssociationKind"
    // InternalDms.g:5920:1: ruleDAssociationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) ;
    public final Enumerator ruleDAssociationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5926:2: ( ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) ) )
            // InternalDms.g:5927:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            {
            // InternalDms.g:5927:2: ( (enumLiteral_0= 'reference' ) | (enumLiteral_1= 'composite' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==93) ) {
                alt111=1;
            }
            else if ( (LA111_0==39) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalDms.g:5928:3: (enumLiteral_0= 'reference' )
                    {
                    // InternalDms.g:5928:3: (enumLiteral_0= 'reference' )
                    // InternalDms.g:5929:4: enumLiteral_0= 'reference'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindAccess().getREFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5936:3: (enumLiteral_1= 'composite' )
                    {
                    // InternalDms.g:5936:3: (enumLiteral_1= 'composite' )
                    // InternalDms.g:5937:4: enumLiteral_1= 'composite'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDAssociationKindAccess().getCOMPOSITEEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDAssociationKind"


    // $ANTLR start "ruleDAssociationKindInverse"
    // InternalDms.g:5947:1: ruleDAssociationKindInverse returns [Enumerator current=null] : (enumLiteral_0= 'inverse' ) ;
    public final Enumerator ruleDAssociationKindInverse() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDms.g:5953:2: ( (enumLiteral_0= 'inverse' ) )
            // InternalDms.g:5954:2: (enumLiteral_0= 'inverse' )
            {
            // InternalDms.g:5954:2: (enumLiteral_0= 'inverse' )
            // InternalDms.g:5955:3: enumLiteral_0= 'inverse'
            {
            enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDAssociationKindInverseAccess().getINVERSE_COMPOSITEEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleDAssociationKindInverse"


    // $ANTLR start "ruleDServiceKind"
    // InternalDms.g:5964:1: ruleDServiceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'SYNC' ) | (enumLiteral_1= 'ASYNC' ) ) ;
    public final Enumerator ruleDServiceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5970:2: ( ( (enumLiteral_0= 'SYNC' ) | (enumLiteral_1= 'ASYNC' ) ) )
            // InternalDms.g:5971:2: ( (enumLiteral_0= 'SYNC' ) | (enumLiteral_1= 'ASYNC' ) )
            {
            // InternalDms.g:5971:2: ( (enumLiteral_0= 'SYNC' ) | (enumLiteral_1= 'ASYNC' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==95) ) {
                alt112=1;
            }
            else if ( (LA112_0==96) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalDms.g:5972:3: (enumLiteral_0= 'SYNC' )
                    {
                    // InternalDms.g:5972:3: (enumLiteral_0= 'SYNC' )
                    // InternalDms.g:5973:4: enumLiteral_0= 'SYNC'
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDServiceKindAccess().getSYNCHRONOUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:5980:3: (enumLiteral_1= 'ASYNC' )
                    {
                    // InternalDms.g:5980:3: (enumLiteral_1= 'ASYNC' )
                    // InternalDms.g:5981:4: enumLiteral_1= 'ASYNC'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDServiceKindAccess().getASYNCHRONOUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDServiceKindAccess().getASYNCHRONOUSEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDServiceKind"


    // $ANTLR start "ruleDDirection"
    // InternalDms.g:5991:1: ruleDDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) ) ;
    public final Enumerator ruleDDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:5997:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) ) )
            // InternalDms.g:5998:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) )
            {
            // InternalDms.g:5998:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==97) ) {
                alt113=1;
            }
            else if ( (LA113_0==98) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // InternalDms.g:5999:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDms.g:5999:3: (enumLiteral_0= 'IN' )
                    // InternalDms.g:6000:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDDirectionAccess().getINBOUNDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6007:3: (enumLiteral_1= 'OUT' )
                    {
                    // InternalDms.g:6007:3: (enumLiteral_1= 'OUT' )
                    // InternalDms.g:6008:4: enumLiteral_1= 'OUT'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDDirectionAccess().getOUTBOUNDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDDirectionAccess().getOUTBOUNDEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDDirection"


    // $ANTLR start "ruleOpOr"
    // InternalDms.g:6018:1: ruleOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDms.g:6024:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDms.g:6025:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDms.g:6025:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt114=4;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt114=1;
                }
                break;
            case 100:
                {
                alt114=2;
                }
                break;
            case 101:
                {
                alt114=3;
                }
                break;
            case 102:
                {
                alt114=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalDms.g:6026:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDms.g:6026:3: (enumLiteral_0= 'OR' )
                    // InternalDms.g:6027:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6034:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDms.g:6034:3: (enumLiteral_1= 'or' )
                    // InternalDms.g:6035:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6042:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDms.g:6042:3: (enumLiteral_2= 'XOR' )
                    // InternalDms.g:6043:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:6050:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDms.g:6050:3: (enumLiteral_3= 'xor' )
                    // InternalDms.g:6051:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6061:1: ruleOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:6067:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDms.g:6068:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDms.g:6068:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==103) ) {
                alt115=1;
            }
            else if ( (LA115_0==104) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalDms.g:6069:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDms.g:6069:3: (enumLiteral_0= 'AND' )
                    // InternalDms.g:6070:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6077:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDms.g:6077:3: (enumLiteral_1= 'and' )
                    // InternalDms.g:6078:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6088:1: ruleOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDms.g:6094:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDms.g:6095:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDms.g:6095:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt116=1;
                }
                break;
            case 106:
                {
                alt116=2;
                }
                break;
            case 107:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalDms.g:6096:3: (enumLiteral_0= '=' )
                    {
                    // InternalDms.g:6096:3: (enumLiteral_0= '=' )
                    // InternalDms.g:6097:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6104:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDms.g:6104:3: (enumLiteral_1= '!=' )
                    // InternalDms.g:6105:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6112:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDms.g:6112:3: (enumLiteral_2= '<>' )
                    // InternalDms.g:6113:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6123:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDms.g:6129:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDms.g:6130:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDms.g:6130:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt117=6;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt117=1;
                }
                break;
            case 109:
                {
                alt117=2;
                }
                break;
            case 110:
                {
                alt117=3;
                }
                break;
            case 111:
                {
                alt117=4;
                }
                break;
            case 112:
                {
                alt117=5;
                }
                break;
            case 113:
                {
                alt117=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalDms.g:6131:3: (enumLiteral_0= '<' )
                    {
                    // InternalDms.g:6131:3: (enumLiteral_0= '<' )
                    // InternalDms.g:6132:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6139:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDms.g:6139:3: (enumLiteral_1= '<=' )
                    // InternalDms.g:6140:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6147:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDms.g:6147:3: (enumLiteral_2= '\\u2264' )
                    // InternalDms.g:6148:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:6155:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDms.g:6155:3: (enumLiteral_3= '>=' )
                    // InternalDms.g:6156:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDms.g:6163:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDms.g:6163:3: (enumLiteral_4= '\\u2265' )
                    // InternalDms.g:6164:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDms.g:6171:3: (enumLiteral_5= '>' )
                    {
                    // InternalDms.g:6171:3: (enumLiteral_5= '>' )
                    // InternalDms.g:6172:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,113,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6182:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDms.g:6188:2: ( ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) ) )
            // InternalDms.g:6189:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            {
            // InternalDms.g:6189:2: ( (enumLiteral_0= '..' ) | (enumLiteral_1= '->' ) | (enumLiteral_2= '=>' ) )
            int alt118=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt118=1;
                }
                break;
            case 114:
                {
                alt118=2;
                }
                break;
            case 115:
                {
                alt118=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalDms.g:6190:3: (enumLiteral_0= '..' )
                    {
                    // InternalDms.g:6190:3: (enumLiteral_0= '..' )
                    // InternalDms.g:6191:4: enumLiteral_0= '..'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6198:3: (enumLiteral_1= '->' )
                    {
                    // InternalDms.g:6198:3: (enumLiteral_1= '->' )
                    // InternalDms.g:6199:4: enumLiteral_1= '->'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6206:3: (enumLiteral_2= '=>' )
                    {
                    // InternalDms.g:6206:3: (enumLiteral_2= '=>' )
                    // InternalDms.g:6207:4: enumLiteral_2= '=>'
                    {
                    enumLiteral_2=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6217:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDms.g:6223:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDms.g:6224:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDms.g:6224:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==91) ) {
                alt119=1;
            }
            else if ( (LA119_0==92) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalDms.g:6225:3: (enumLiteral_0= '+' )
                    {
                    // InternalDms.g:6225:3: (enumLiteral_0= '+' )
                    // InternalDms.g:6226:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6233:3: (enumLiteral_1= '-' )
                    {
                    // InternalDms.g:6233:3: (enumLiteral_1= '-' )
                    // InternalDms.g:6234:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6244:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDms.g:6250:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDms.g:6251:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDms.g:6251:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt120=4;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt120=1;
                }
                break;
            case 116:
                {
                alt120=2;
                }
                break;
            case 117:
                {
                alt120=3;
                }
                break;
            case 118:
                {
                alt120=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalDms.g:6252:3: (enumLiteral_0= '*' )
                    {
                    // InternalDms.g:6252:3: (enumLiteral_0= '*' )
                    // InternalDms.g:6253:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6260:3: (enumLiteral_1= '/' )
                    {
                    // InternalDms.g:6260:3: (enumLiteral_1= '/' )
                    // InternalDms.g:6261:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6268:3: (enumLiteral_2= '**' )
                    {
                    // InternalDms.g:6268:3: (enumLiteral_2= '**' )
                    // InternalDms.g:6269:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:6276:3: (enumLiteral_3= '%' )
                    {
                    // InternalDms.g:6276:3: (enumLiteral_3= '%' )
                    // InternalDms.g:6277:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
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
    // InternalDms.g:6287:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDms.g:6293:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDms.g:6294:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDms.g:6294:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt121=5;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt121=1;
                }
                break;
            case 92:
                {
                alt121=2;
                }
                break;
            case 119:
                {
                alt121=3;
                }
                break;
            case 120:
                {
                alt121=4;
                }
                break;
            case 121:
                {
                alt121=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalDms.g:6295:3: (enumLiteral_0= '+' )
                    {
                    // InternalDms.g:6295:3: (enumLiteral_0= '+' )
                    // InternalDms.g:6296:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDms.g:6303:3: (enumLiteral_1= '-' )
                    {
                    // InternalDms.g:6303:3: (enumLiteral_1= '-' )
                    // InternalDms.g:6304:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDms.g:6311:3: (enumLiteral_2= '!' )
                    {
                    // InternalDms.g:6311:3: (enumLiteral_2= '!' )
                    // InternalDms.g:6312:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDms.g:6319:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDms.g:6319:3: (enumLiteral_3= 'NOT' )
                    // InternalDms.g:6320:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDms.g:6327:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDms.g:6327:3: (enumLiteral_4= 'not' )
                    // InternalDms.g:6328:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalDms
    public final void synpred1_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3674:5: ( ( () ( ( ruleOpOr ) ) ) )
        // InternalDms.g:3674:6: ( () ( ( ruleOpOr ) ) )
        {
        // InternalDms.g:3674:6: ( () ( ( ruleOpOr ) ) )
        // InternalDms.g:3675:6: () ( ( ruleOpOr ) )
        {
        // InternalDms.g:3675:6: ()
        // InternalDms.g:3676:6: 
        {
        }

        // InternalDms.g:3677:6: ( ( ruleOpOr ) )
        // InternalDms.g:3678:7: ( ruleOpOr )
        {
        // InternalDms.g:3678:7: ( ruleOpOr )
        // InternalDms.g:3679:8: ruleOpOr
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
    // $ANTLR end synpred1_InternalDms

    // $ANTLR start synpred2_InternalDms
    public final void synpred2_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3762:5: ( ( () ( ( ruleOpAnd ) ) ) )
        // InternalDms.g:3762:6: ( () ( ( ruleOpAnd ) ) )
        {
        // InternalDms.g:3762:6: ( () ( ( ruleOpAnd ) ) )
        // InternalDms.g:3763:6: () ( ( ruleOpAnd ) )
        {
        // InternalDms.g:3763:6: ()
        // InternalDms.g:3764:6: 
        {
        }

        // InternalDms.g:3765:6: ( ( ruleOpAnd ) )
        // InternalDms.g:3766:7: ( ruleOpAnd )
        {
        // InternalDms.g:3766:7: ( ruleOpAnd )
        // InternalDms.g:3767:8: ruleOpAnd
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
    // $ANTLR end synpred2_InternalDms

    // $ANTLR start synpred3_InternalDms
    public final void synpred3_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3850:5: ( ( () ( ( ruleOpEquality ) ) ) )
        // InternalDms.g:3850:6: ( () ( ( ruleOpEquality ) ) )
        {
        // InternalDms.g:3850:6: ( () ( ( ruleOpEquality ) ) )
        // InternalDms.g:3851:6: () ( ( ruleOpEquality ) )
        {
        // InternalDms.g:3851:6: ()
        // InternalDms.g:3852:6: 
        {
        }

        // InternalDms.g:3853:6: ( ( ruleOpEquality ) )
        // InternalDms.g:3854:7: ( ruleOpEquality )
        {
        // InternalDms.g:3854:7: ( ruleOpEquality )
        // InternalDms.g:3855:8: ruleOpEquality
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
    // $ANTLR end synpred3_InternalDms

    // $ANTLR start synpred4_InternalDms
    public final void synpred4_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3939:6: ( ( () ruleOpInstanceOf ) )
        // InternalDms.g:3939:7: ( () ruleOpInstanceOf )
        {
        // InternalDms.g:3939:7: ( () ruleOpInstanceOf )
        // InternalDms.g:3940:7: () ruleOpInstanceOf
        {
        // InternalDms.g:3940:7: ()
        // InternalDms.g:3941:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalDms

    // $ANTLR start synpred5_InternalDms
    public final void synpred5_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:3979:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDms.g:3979:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDms.g:3979:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDms.g:3980:7: () ( ( ruleOpCompare ) )
        {
        // InternalDms.g:3980:7: ()
        // InternalDms.g:3981:7: 
        {
        }

        // InternalDms.g:3982:7: ( ( ruleOpCompare ) )
        // InternalDms.g:3983:8: ( ruleOpCompare )
        {
        // InternalDms.g:3983:8: ( ruleOpCompare )
        // InternalDms.g:3984:9: ruleOpCompare
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
    // $ANTLR end synpred5_InternalDms

    // $ANTLR start synpred6_InternalDms
    public final void synpred6_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4098:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDms.g:4098:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDms.g:4098:6: ( () ( ( ruleOpOther ) ) )
        // InternalDms.g:4099:6: () ( ( ruleOpOther ) )
        {
        // InternalDms.g:4099:6: ()
        // InternalDms.g:4100:6: 
        {
        }

        // InternalDms.g:4101:6: ( ( ruleOpOther ) )
        // InternalDms.g:4102:7: ( ruleOpOther )
        {
        // InternalDms.g:4102:7: ( ruleOpOther )
        // InternalDms.g:4103:8: ruleOpOther
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
    // $ANTLR end synpred6_InternalDms

    // $ANTLR start synpred7_InternalDms
    public final void synpred7_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4186:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDms.g:4186:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDms.g:4186:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDms.g:4187:6: () ( ( ruleOpAdd ) )
        {
        // InternalDms.g:4187:6: ()
        // InternalDms.g:4188:6: 
        {
        }

        // InternalDms.g:4189:6: ( ( ruleOpAdd ) )
        // InternalDms.g:4190:7: ( ruleOpAdd )
        {
        // InternalDms.g:4190:7: ( ruleOpAdd )
        // InternalDms.g:4191:8: ruleOpAdd
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
    // $ANTLR end synpred7_InternalDms

    // $ANTLR start synpred8_InternalDms
    public final void synpred8_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4274:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDms.g:4274:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDms.g:4274:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDms.g:4275:6: () ( ( ruleOpMulti ) )
        {
        // InternalDms.g:4275:6: ()
        // InternalDms.g:4276:6: 
        {
        }

        // InternalDms.g:4277:6: ( ( ruleOpMulti ) )
        // InternalDms.g:4278:7: ( ruleOpMulti )
        {
        // InternalDms.g:4278:7: ( ruleOpMulti )
        // InternalDms.g:4279:8: ruleOpMulti
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
    // $ANTLR end synpred8_InternalDms

    // $ANTLR start synpred9_InternalDms
    public final void synpred9_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4437:5: ( ( () ruleOpCast ) )
        // InternalDms.g:4437:6: ( () ruleOpCast )
        {
        // InternalDms.g:4437:6: ( () ruleOpCast )
        // InternalDms.g:4438:6: () ruleOpCast
        {
        // InternalDms.g:4438:6: ()
        // InternalDms.g:4439:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalDms

    // $ANTLR start synpred10_InternalDms
    public final void synpred10_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4534:6: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // InternalDms.g:4534:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // InternalDms.g:4534:7: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // InternalDms.g:4535:7: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // InternalDms.g:4535:7: ()
        // InternalDms.g:4536:7: 
        {
        }

        match(input,27,FOLLOW_6); if (state.failed) return ;
        // InternalDms.g:4538:7: ( ( RULE_ID ) )
        // InternalDms.g:4539:8: ( RULE_ID )
        {
        // InternalDms.g:4539:8: ( RULE_ID )
        // InternalDms.g:4540:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_65); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalDms

    // $ANTLR start synpred11_InternalDms
    public final void synpred11_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4603:6: ( ( () '.' ) )
        // InternalDms.g:4603:7: ( () '.' )
        {
        // InternalDms.g:4603:7: ( () '.' )
        // InternalDms.g:4604:7: () '.'
        {
        // InternalDms.g:4604:7: ()
        // InternalDms.g:4605:7: 
        {
        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalDms

    // $ANTLR start synpred12_InternalDms
    public final void synpred12_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4638:7: ( ( '(' ) )
        // InternalDms.g:4638:8: ( '(' )
        {
        // InternalDms.g:4638:8: ( '(' )
        // InternalDms.g:4639:8: '('
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDms

    // $ANTLR start synpred13_InternalDms
    public final void synpred13_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4809:4: ( ( () 'for' ( ( RULE_ID ) ) ':' ) )
        // InternalDms.g:4809:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        {
        // InternalDms.g:4809:5: ( () 'for' ( ( RULE_ID ) ) ':' )
        // InternalDms.g:4810:5: () 'for' ( ( RULE_ID ) ) ':'
        {
        // InternalDms.g:4810:5: ()
        // InternalDms.g:4811:5: 
        {
        }

        match(input,80,FOLLOW_6); if (state.failed) return ;
        // InternalDms.g:4813:5: ( ( RULE_ID ) )
        // InternalDms.g:4814:6: ( RULE_ID )
        {
        // InternalDms.g:4814:6: ( RULE_ID )
        // InternalDms.g:4815:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_10); if (state.failed) return ;

        }


        }

        match(input,23,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDms

    // $ANTLR start synpred14_InternalDms
    public final void synpred14_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:4968:4: ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )
        // InternalDms.g:
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_NATURAL)||input.LA(1)==20||(input.LA(1)>=68 && input.LA(1)<=76)||input.LA(1)==80||(input.LA(1)>=83 && input.LA(1)<=88)||(input.LA(1)>=91 && input.LA(1)<=92)||(input.LA(1)>=119 && input.LA(1)<=121) ) {
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
    // $ANTLR end synpred14_InternalDms

    // $ANTLR start synpred15_InternalDms
    public final void synpred15_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:5219:5: ( ( '(' ) )
        // InternalDms.g:5219:6: ( '(' )
        {
        // InternalDms.g:5219:6: ( '(' )
        // InternalDms.g:5220:6: '('
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalDms

    // $ANTLR start synpred16_InternalDms
    public final void synpred16_InternalDms_fragment() throws RecognitionException {   
        // InternalDms.g:5430:5: ( 'else' )
        // InternalDms.g:5430:6: 'else'
        {
        match(input,78,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalDms

    // Delegated rules

    public final boolean synpred8_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDms() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDms_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA80 dfa80 = new DFA80(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\166\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\2\1\3\1\4\1\6\1\0\1\1\1\5\1\7\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\4\1\7\uffff\1\1\2\uffff\2\1\4\uffff\4\1\1\uffff\5\1\1\uffff\3\1\2\uffff\1\1\3\uffff\2\1\4\uffff\1\1\1\uffff\3\1\2\uffff\3\1\1\uffff\1\2\1\3\2\1\11\uffff\3\1\1\uffff\2\1\10\uffff\4\1\4\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\5\1",
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

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 3936:3: ( ( ( ( ( () ruleOpInstanceOf ) )=> ( () ruleOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDms()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalDms()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA80_9 = input.LA(1);

                         
                        int index80_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalDms()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index80_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\6\uffff\1\12\5\uffff";
    static final String dfa_9s = "\1\4\5\uffff\1\4\5\uffff";
    static final String dfa_10s = "\1\130\5\uffff\1\166\5\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\10\1\6";
    static final String dfa_12s = "\1\0\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\2\1\15\uffff\1\5\57\uffff\2\2\2\3\2\4\2\7\1\10\3\uffff\1\11\2\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\4\12\7\uffff\1\12\1\uffff\1\13\2\12\4\uffff\4\12\1\uffff\5\12\1\uffff\3\12\2\uffff\1\12\3\uffff\2\12\4\uffff\1\12\1\uffff\3\12\2\uffff\3\12\1\uffff\4\12\11\uffff\3\12\1\uffff\2\12\10\uffff\4\12\4\uffff\24\12",
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

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "4726:2: (this_DLiteralExpression_0= ruleDLiteralExpression | this_DSelfExpression_1= ruleDSelfExpression | this_DReturnExpression_2= ruleDReturnExpression | this_DRaiseExpression_3= ruleDRaiseExpression | this_DParenthesizedExpression_4= ruleDParenthesizedExpression | this_DFunctionCall_5= ruleDFunctionCall | this_DConstructorCall_6= ruleDConstructorCall | this_DContextReference_7= ruleDContextReference | this_DIfExpression_8= ruleDIfExpression | ( ( ( () 'for' ( ( RULE_ID ) ) ':' ) )=>this_DForLoopExpression_9= ruleDForLoopExpression ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_0 = input.LA(1);

                         
                        int index92_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA92_0>=RULE_STRING && LA92_0<=RULE_NATURAL)||(LA92_0>=83 && LA92_0<=88)) ) {s = 1;}

                        else if ( ((LA92_0>=68 && LA92_0<=69)) ) {s = 2;}

                        else if ( ((LA92_0>=70 && LA92_0<=71)) ) {s = 3;}

                        else if ( ((LA92_0>=72 && LA92_0<=73)) ) {s = 4;}

                        else if ( (LA92_0==20) ) {s = 5;}

                        else if ( (LA92_0==RULE_ID) ) {s = 6;}

                        else if ( ((LA92_0>=74 && LA92_0<=75)) ) {s = 7;}

                        else if ( (LA92_0==76) ) {s = 8;}

                        else if ( (LA92_0==80) && (synpred13_InternalDms())) {s = 9;}

                         
                        input.seek(index92_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\127\uffff";
    static final String dfa_15s = "\1\32\126\uffff";
    static final String dfa_16s = "\1\4\3\0\123\uffff";
    static final String dfa_17s = "\1\171\3\0\123\uffff";
    static final String dfa_18s = "\4\uffff\26\1\1\2\74\uffff";
    static final String dfa_19s = "\1\0\1\1\1\2\1\3\123\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\13\1\14\4\32\7\uffff\1\32\1\uffff\1\25\2\32\4\uffff\4\32\1\uffff\5\32\1\uffff\3\32\2\uffff\1\32\3\uffff\2\32\4\uffff\1\32\1\uffff\3\32\2\uffff\3\32\1\uffff\4\32\1\17\1\20\1\21\1\22\1\23\1\24\1\26\1\27\1\30\3\32\1\31\2\32\1\7\1\10\1\11\1\12\1\15\1\16\2\uffff\1\2\1\3\2\32\4\uffff\24\32\1\4\1\5\1\6",
            "\1\uffff",
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

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "4967:3: ( ( '+' | '-' | '!' | 'NOT' | 'not' | 'TRUE' | 'true' | 'FALSE' | 'false' | 'NIL' | 'nil' | 'SELF' | 'self' | 'RETURN' | 'return' | 'RAISE' | 'raise' | '(' | 'NEW' | 'new' | 'if' | 'for' | RULE_ID | RULE_STRING | RULE_NATURAL )=> (lv_expression_3_0= ruleDExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_0 = input.LA(1);

                         
                        int index96_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA96_0==RULE_ID) ) {s = 1;}

                        else if ( (LA96_0==91) ) {s = 2;}

                        else if ( (LA96_0==92) ) {s = 3;}

                        else if ( (LA96_0==119) && (synpred14_InternalDms())) {s = 4;}

                        else if ( (LA96_0==120) && (synpred14_InternalDms())) {s = 5;}

                        else if ( (LA96_0==121) && (synpred14_InternalDms())) {s = 6;}

                        else if ( (LA96_0==83) && (synpred14_InternalDms())) {s = 7;}

                        else if ( (LA96_0==84) && (synpred14_InternalDms())) {s = 8;}

                        else if ( (LA96_0==85) && (synpred14_InternalDms())) {s = 9;}

                        else if ( (LA96_0==86) && (synpred14_InternalDms())) {s = 10;}

                        else if ( (LA96_0==RULE_STRING) && (synpred14_InternalDms())) {s = 11;}

                        else if ( (LA96_0==RULE_NATURAL) && (synpred14_InternalDms())) {s = 12;}

                        else if ( (LA96_0==87) && (synpred14_InternalDms())) {s = 13;}

                        else if ( (LA96_0==88) && (synpred14_InternalDms())) {s = 14;}

                        else if ( (LA96_0==68) && (synpred14_InternalDms())) {s = 15;}

                        else if ( (LA96_0==69) && (synpred14_InternalDms())) {s = 16;}

                        else if ( (LA96_0==70) && (synpred14_InternalDms())) {s = 17;}

                        else if ( (LA96_0==71) && (synpred14_InternalDms())) {s = 18;}

                        else if ( (LA96_0==72) && (synpred14_InternalDms())) {s = 19;}

                        else if ( (LA96_0==73) && (synpred14_InternalDms())) {s = 20;}

                        else if ( (LA96_0==20) && (synpred14_InternalDms())) {s = 21;}

                        else if ( (LA96_0==74) && (synpred14_InternalDms())) {s = 22;}

                        else if ( (LA96_0==75) && (synpred14_InternalDms())) {s = 23;}

                        else if ( (LA96_0==76) && (synpred14_InternalDms())) {s = 24;}

                        else if ( (LA96_0==80) && (synpred14_InternalDms())) {s = 25;}

                        else if ( (LA96_0==EOF||(LA96_0>=RULE_PLAIN_TEXT_ONLY && LA96_0<=RULE_PLAIN_TEXT_END)||LA96_0==18||(LA96_0>=21 && LA96_0<=22)||(LA96_0>=27 && LA96_0<=30)||(LA96_0>=32 && LA96_0<=36)||(LA96_0>=38 && LA96_0<=40)||LA96_0==43||(LA96_0>=47 && LA96_0<=48)||LA96_0==53||(LA96_0>=55 && LA96_0<=57)||(LA96_0>=60 && LA96_0<=62)||(LA96_0>=64 && LA96_0<=67)||(LA96_0>=77 && LA96_0<=79)||(LA96_0>=81 && LA96_0<=82)||(LA96_0>=93 && LA96_0<=94)||(LA96_0>=99 && LA96_0<=118)) ) {s = 26;}

                         
                        input.seek(index96_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_1 = input.LA(1);

                         
                        int index96_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index96_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA96_2 = input.LA(1);

                         
                        int index96_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index96_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA96_3 = input.LA(1);

                         
                        int index96_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalDms()) ) {s = 25;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index96_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000013400C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x03A0081F52000182L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x03A0081F52000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x03A0081F50000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020180L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001F40040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100070L,0x0380000019F91FF0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000A0040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020040010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020240000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000020180L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000D020040010L,0x0000000060000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100182L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L,0x0000000000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000100182L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000182L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000100182L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000182L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002C00000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001800000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000100000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4200000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x3C00000000100182L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x3C00000000000182L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000007800000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000018000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x00000E0000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0003F00000000003L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000010000000002L,0x000C000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0070000000040000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000500070L,0x0380000019F91FF0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000100072L,0x0380000019F91FF0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000040L,0x0000000018000000L});

}