package com.mimacom.ddd.dm.dem.parser.antlr.internal;

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
import com.mimacom.ddd.dm.dem.services.DemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PLAIN_TEXT_ONLY", "RULE_PLAIN_TEXT_START", "RULE_PLAIN_TEXT_MIDDLE", "RULE_PLAIN_TEXT_END", "RULE_NATURAL", "RULE_STRING", "RULE_LETTER", "RULE_PLAIN_TEXT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'alias'", "'event'", "'{'", "'context'", "'triggered'", "'by'", "'notifications'", "'preconditions'", "'postconditions'", "'}'", "':'", "'case'", "'when'", "'otherwise'", "'to'", "'human'", "'actor'", "'as'", "'service'", "'import'", "'test'", "','", "'in'", "'('", "')'", "'archetype'", "'is'", "'filter'", "'with'", "'*'", "'.'", "'@before'", "':='", "'|'", "'ISA'", "'isa'", "'AS'", "'NEW'", "'new'", "'['", "'#'", "']'", "'all'", "'if'", "'then'", "'else'", "'end'", "'..'", "'TRUE'", "'true'", "'FALSE'", "'false'", "'UNDEFINED'", "'undefined'", "'E'", "'e'", "'+'", "'-'", "'.*'", "'VOID'", "'BOOLEAN'", "'NUMBER'", "'TEXT'", "'IDENTIFIER'", "'TIMEPOINT'", "'STATE'", "'STATE_EVENT'", "'COMPLEX'", "'NOTIFICATION'", "'SERVICE'", "'OR'", "'or'", "'XOR'", "'xor'", "'AND'", "'and'", "'='", "'!='", "'<>'", "'<'", "'<='", "'\\u2264'", "'>='", "'\\u2265'", "'>'", "'IN'", "'->'", "'=>'", "'/'", "'**'", "'%'", "'!'", "'NOT'", "'not'", "'?'"
    };
    public static final int T__50=50;
    public static final int RULE_PLAIN_TEXT_ONLY=5;
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
    public static final int RULE_PLAIN_TEXT_END=8;
    public static final int RULE_ID=4;
    public static final int RULE_PLAIN_TEXT_START=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
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
    public static final int RULE_NATURAL=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int RULE_PLAIN_TEXT=12;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
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


        public InternalDemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDem.g"; }



     	private DemGrammarAccess grammarAccess;

        public InternalDemParser(TokenStream input, DemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DDomain";
       	}

       	@Override
       	protected DemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDDomain"
    // InternalDem.g:65:1: entryRuleDDomain returns [EObject current=null] : iv_ruleDDomain= ruleDDomain EOF ;
    public final EObject entryRuleDDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomain = null;


        try {
            // InternalDem.g:65:48: (iv_ruleDDomain= ruleDDomain EOF )
            // InternalDem.g:66:2: iv_ruleDDomain= ruleDDomain EOF
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
    // InternalDem.g:72:1: ruleDDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* ) ;
    public final EObject ruleDDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_5_0 = null;

        EObject lv_events_6_0 = null;

        EObject lv_actors_7_0 = null;



        	enterRule();

        try {
            // InternalDem.g:78:2: ( ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* ) )
            // InternalDem.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* )
            {
            // InternalDem.g:79:2: ( ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )* )
            // InternalDem.g:80:3: ( (lv_imports_0_0= ruleDImport ) )* otherlv_1= 'domain' ( (lv_name_2_0= ruleDQualifiedName ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )*
            {
            // InternalDem.g:80:3: ( (lv_imports_0_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDem.g:81:4: (lv_imports_0_0= ruleDImport )
            	    {
            	    // InternalDem.g:81:4: (lv_imports_0_0= ruleDImport )
            	    // InternalDem.g:82:5: lv_imports_0_0= ruleDImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainAccess().getImportsDImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleDImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"com.mimacom.ddd.dm.dmx.Dmx.DImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDDomainAccess().getDomainKeyword_1());
              		
            }
            // InternalDem.g:103:3: ( (lv_name_2_0= ruleDQualifiedName ) )
            // InternalDem.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            {
            // InternalDem.g:104:4: (lv_name_2_0= ruleDQualifiedName )
            // InternalDem.g:105:5: lv_name_2_0= ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDDomainAccess().getNameDQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDDomainRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:122:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDem.g:123:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDDomainAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDem.g:127:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDem.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDem.g:128:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDem.g:129:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDDomainAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_4_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDem.g:146:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_PLAIN_TEXT_ONLY && LA3_0<=RULE_PLAIN_TEXT_START)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDem.g:147:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:147:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:148:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_6);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainRule());
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

            // InternalDem.g:165:3: ( ( (lv_events_6_0= ruleDDomainEvent ) ) | ( (lv_actors_7_0= ruleDActor ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }
                else if ( (LA4_0==33||LA4_0==36) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDem.g:166:4: ( (lv_events_6_0= ruleDDomainEvent ) )
            	    {
            	    // InternalDem.g:166:4: ( (lv_events_6_0= ruleDDomainEvent ) )
            	    // InternalDem.g:167:5: (lv_events_6_0= ruleDDomainEvent )
            	    {
            	    // InternalDem.g:167:5: (lv_events_6_0= ruleDDomainEvent )
            	    // InternalDem.g:168:6: lv_events_6_0= ruleDDomainEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getEventsDDomainEventParserRuleCall_5_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_events_6_0=ruleDDomainEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"events",
            	      							lv_events_6_0,
            	      							"com.mimacom.ddd.dm.dem.Dem.DDomainEvent");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:186:4: ( (lv_actors_7_0= ruleDActor ) )
            	    {
            	    // InternalDem.g:186:4: ( (lv_actors_7_0= ruleDActor ) )
            	    // InternalDem.g:187:5: (lv_actors_7_0= ruleDActor )
            	    {
            	    // InternalDem.g:187:5: (lv_actors_7_0= ruleDActor )
            	    // InternalDem.g:188:6: lv_actors_7_0= ruleDActor
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDDomainAccess().getActorsDActorParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_actors_7_0=ruleDActor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDDomainRule());
            	      						}
            	      						add(
            	      							current,
            	      							"actors",
            	      							lv_actors_7_0,
            	      							"com.mimacom.ddd.dm.dem.Dem.DActor");
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


    // $ANTLR start "entryRuleDDomainEvent"
    // InternalDem.g:210:1: entryRuleDDomainEvent returns [EObject current=null] : iv_ruleDDomainEvent= ruleDDomainEvent EOF ;
    public final EObject entryRuleDDomainEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDDomainEvent = null;


        try {
            // InternalDem.g:210:53: (iv_ruleDDomainEvent= ruleDDomainEvent EOF )
            // InternalDem.g:211:2: iv_ruleDDomainEvent= ruleDDomainEvent EOF
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
    // InternalDem.g:217:1: ruleDDomainEvent returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )? (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )? otherlv_18= '}' ) ;
    public final EObject ruleDDomainEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        EObject lv_description_4_0 = null;

        EObject lv_context_7_0 = null;

        EObject lv_notifications_12_0 = null;

        EObject lv_preconditionsCNF_14_0 = null;

        EObject lv_postconditionsDNF_16_0 = null;

        EObject lv_postconditionsDNF_17_0 = null;



        	enterRule();

        try {
            // InternalDem.g:223:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )? (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )? otherlv_18= '}' ) )
            // InternalDem.g:224:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )? (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )? otherlv_18= '}' )
            {
            // InternalDem.g:224:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )? (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )? otherlv_18= '}' )
            // InternalDem.g:225:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (lv_description_4_0= ruleDRichText ) )? otherlv_5= '{' otherlv_6= 'context' ( (lv_context_7_0= ruleDContext ) )+ (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )? (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )? (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDDomainEventAccess().getEventKeyword_0());
              		
            }
            // InternalDem.g:229:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:230:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:230:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:231:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            // InternalDem.g:247:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDem.g:248:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDDomainEventAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDem.g:252:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDem.g:253:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDem.g:253:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDem.g:254:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDDomainEventAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDDomainEventRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDem.g:271:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_PLAIN_TEXT_ONLY && LA6_0<=RULE_PLAIN_TEXT_START)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDem.g:272:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDem.g:272:4: (lv_description_4_0= ruleDRichText )
                    // InternalDem.g:273:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDDomainEventAccess().getDescriptionDRichTextParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDDomainEventRule());
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

            otherlv_5=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDDomainEventAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDDomainEventAccess().getContextKeyword_5());
              		
            }
            // InternalDem.g:298:3: ( (lv_context_7_0= ruleDContext ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDem.g:299:4: (lv_context_7_0= ruleDContext )
            	    {
            	    // InternalDem.g:299:4: (lv_context_7_0= ruleDContext )
            	    // InternalDem.g:300:5: lv_context_7_0= ruleDContext
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDDomainEventAccess().getContextDContextParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
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
            	      						"com.mimacom.ddd.dm.dem.Dem.DContext");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalDem.g:317:3: (otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDem.g:318:4: otherlv_8= 'triggered' otherlv_9= 'by' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getDDomainEventAccess().getTriggeredKeyword_7_0());
                      			
                    }
                    otherlv_9=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDDomainEventAccess().getByKeyword_7_1());
                      			
                    }
                    // InternalDem.g:326:4: ( (otherlv_10= RULE_ID ) )
                    // InternalDem.g:327:5: (otherlv_10= RULE_ID )
                    {
                    // InternalDem.g:327:5: (otherlv_10= RULE_ID )
                    // InternalDem.g:328:6: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDDomainEventRule());
                      						}
                      					
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getDDomainEventAccess().getTriggerDActorCrossReference_7_2_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:340:3: (otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDem.g:341:4: otherlv_11= 'notifications' ( (lv_notifications_12_0= ruleDNotification ) )+
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getDDomainEventAccess().getNotificationsKeyword_8_0());
                      			
                    }
                    // InternalDem.g:345:4: ( (lv_notifications_12_0= ruleDNotification ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDem.g:346:5: (lv_notifications_12_0= ruleDNotification )
                    	    {
                    	    // InternalDem.g:346:5: (lv_notifications_12_0= ruleDNotification )
                    	    // InternalDem.g:347:6: lv_notifications_12_0= ruleDNotification
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getNotificationsDNotificationParserRuleCall_8_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_notifications_12_0=ruleDNotification();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"notifications",
                    	      							lv_notifications_12_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DNotification");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            // InternalDem.g:365:3: (otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDem.g:366:4: otherlv_13= 'preconditions' ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getDDomainEventAccess().getPreconditionsKeyword_9_0());
                      			
                    }
                    // InternalDem.g:370:4: ( (lv_preconditionsCNF_14_0= ruleDNamedPredicate ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDem.g:371:5: (lv_preconditionsCNF_14_0= ruleDNamedPredicate )
                    	    {
                    	    // InternalDem.g:371:5: (lv_preconditionsCNF_14_0= ruleDNamedPredicate )
                    	    // InternalDem.g:372:6: lv_preconditionsCNF_14_0= ruleDNamedPredicate
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getDDomainEventAccess().getPreconditionsCNFDNamedPredicateParserRuleCall_9_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_preconditionsCNF_14_0=ruleDNamedPredicate();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"preconditionsCNF",
                    	      							lv_preconditionsCNF_14_0,
                    	      							"com.mimacom.ddd.dm.dem.Dem.DNamedPredicate");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            // InternalDem.g:390:3: (otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDem.g:391:4: otherlv_15= 'postconditions' ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getDDomainEventAccess().getPostconditionsKeyword_10_0());
                      			
                    }
                    // InternalDem.g:395:4: ( ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+ | ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+ )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
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
                            // InternalDem.g:396:5: ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+
                            {
                            // InternalDem.g:396:5: ( (lv_postconditionsDNF_16_0= ruleDCaseConjunction ) )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==29) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalDem.g:397:6: (lv_postconditionsDNF_16_0= ruleDCaseConjunction )
                            	    {
                            	    // InternalDem.g:397:6: (lv_postconditionsDNF_16_0= ruleDCaseConjunction )
                            	    // InternalDem.g:398:7: lv_postconditionsDNF_16_0= ruleDCaseConjunction
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getDDomainEventAccess().getPostconditionsDNFDCaseConjunctionParserRuleCall_10_1_0_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_16);
                            	    lv_postconditionsDNF_16_0=ruleDCaseConjunction();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"postconditionsDNF",
                            	      								lv_postconditionsDNF_16_0,
                            	      								"com.mimacom.ddd.dm.dem.Dem.DCaseConjunction");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // InternalDem.g:416:5: ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+
                            {
                            // InternalDem.g:416:5: ( (lv_postconditionsDNF_17_0= ruleDNamedPredicate ) )+
                            int cnt14=0;
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_ID) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalDem.g:417:6: (lv_postconditionsDNF_17_0= ruleDNamedPredicate )
                            	    {
                            	    // InternalDem.g:417:6: (lv_postconditionsDNF_17_0= ruleDNamedPredicate )
                            	    // InternalDem.g:418:7: lv_postconditionsDNF_17_0= ruleDNamedPredicate
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getDDomainEventAccess().getPostconditionsDNFDNamedPredicateParserRuleCall_10_1_1_0());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    lv_postconditionsDNF_17_0=ruleDNamedPredicate();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							if (current==null) {
                            	      								current = createModelElementForParent(grammarAccess.getDDomainEventRule());
                            	      							}
                            	      							add(
                            	      								current,
                            	      								"postconditionsDNF",
                            	      								lv_postconditionsDNF_17_0,
                            	      								"com.mimacom.ddd.dm.dem.Dem.DNamedPredicate");
                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt14 >= 1 ) break loop14;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(14, input);
                                        throw eee;
                                }
                                cnt14++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getDDomainEventAccess().getRightCurlyBracketKeyword_11());
              		
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


    // $ANTLR start "entryRuleDNamedPredicate"
    // InternalDem.g:445:1: entryRuleDNamedPredicate returns [EObject current=null] : iv_ruleDNamedPredicate= ruleDNamedPredicate EOF ;
    public final EObject entryRuleDNamedPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNamedPredicate = null;


        try {
            // InternalDem.g:445:56: (iv_ruleDNamedPredicate= ruleDNamedPredicate EOF )
            // InternalDem.g:446:2: iv_ruleDNamedPredicate= ruleDNamedPredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDNamedPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDNamedPredicate=ruleDNamedPredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDNamedPredicate; 
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
    // $ANTLR end "entryRuleDNamedPredicate"


    // $ANTLR start "ruleDNamedPredicate"
    // InternalDem.g:452:1: ruleDNamedPredicate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDNamedPredicate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        EObject lv_predicate_4_0 = null;

        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:458:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:459:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:459:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:460:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_predicate_4_0= ruleDExpression ) ) ( (lv_description_5_0= ruleDRichText ) )?
            {
            // InternalDem.g:460:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:461:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:461:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:462:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDNamedPredicateAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNamedPredicateRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:478:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDem.g:479:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDNamedPredicateAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:483:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:484:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:484:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:485:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDNamedPredicateAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDNamedPredicateRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDNamedPredicateAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:506:3: ( (lv_predicate_4_0= ruleDExpression ) )
            // InternalDem.g:507:4: (lv_predicate_4_0= ruleDExpression )
            {
            // InternalDem.g:507:4: (lv_predicate_4_0= ruleDExpression )
            // InternalDem.g:508:5: lv_predicate_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNamedPredicateAccess().getPredicateDExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_predicate_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDNamedPredicateRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_4_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:525:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_PLAIN_TEXT_ONLY && LA18_0<=RULE_PLAIN_TEXT_START)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDem.g:526:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:526:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:527:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNamedPredicateAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNamedPredicateRule());
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
    // $ANTLR end "ruleDNamedPredicate"


    // $ANTLR start "entryRuleDCaseConjunction"
    // InternalDem.g:548:1: entryRuleDCaseConjunction returns [EObject current=null] : iv_ruleDCaseConjunction= ruleDCaseConjunction EOF ;
    public final EObject entryRuleDCaseConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDCaseConjunction = null;


        try {
            // InternalDem.g:548:57: (iv_ruleDCaseConjunction= ruleDCaseConjunction EOF )
            // InternalDem.g:549:2: iv_ruleDCaseConjunction= ruleDCaseConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDCaseConjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDCaseConjunction=ruleDCaseConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDCaseConjunction; 
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
    // $ANTLR end "entryRuleDCaseConjunction"


    // $ANTLR start "ruleDCaseConjunction"
    // InternalDem.g:555:1: ruleDCaseConjunction returns [EObject current=null] : (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ ) ;
    public final EObject ruleDCaseConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_aliases_3_0=null;
        Token otherlv_4=null;
        Token lv_otherwise_6_0=null;
        Token otherlv_7=null;
        EObject lv_selector_5_0 = null;

        EObject lv_predicates_8_0 = null;



        	enterRule();

        try {
            // InternalDem.g:561:2: ( (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ ) )
            // InternalDem.g:562:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ )
            {
            // InternalDem.g:562:2: (otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+ )
            // InternalDem.g:563:3: otherlv_0= 'case' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )* ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) ) otherlv_7= ':' ( (lv_predicates_8_0= ruleDNamedPredicate ) )+
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDCaseConjunctionAccess().getCaseKeyword_0());
              		
            }
            // InternalDem.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDCaseConjunctionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDCaseConjunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:585:3: (otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDem.g:586:4: otherlv_2= 'alias' ( (lv_aliases_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDCaseConjunctionAccess().getAliasKeyword_2_0());
            	      			
            	    }
            	    // InternalDem.g:590:4: ( (lv_aliases_3_0= RULE_ID ) )
            	    // InternalDem.g:591:5: (lv_aliases_3_0= RULE_ID )
            	    {
            	    // InternalDem.g:591:5: (lv_aliases_3_0= RULE_ID )
            	    // InternalDem.g:592:6: lv_aliases_3_0= RULE_ID
            	    {
            	    lv_aliases_3_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_3_0, grammarAccess.getDCaseConjunctionAccess().getAliasesIDTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDCaseConjunctionRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalDem.g:609:3: ( (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) ) | ( (lv_otherwise_6_0= 'otherwise' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDem.g:610:4: (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) )
                    {
                    // InternalDem.g:610:4: (otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) ) )
                    // InternalDem.g:611:5: otherlv_4= 'when' ( (lv_selector_5_0= ruleDExpression ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getDCaseConjunctionAccess().getWhenKeyword_3_0_0());
                      				
                    }
                    // InternalDem.g:615:5: ( (lv_selector_5_0= ruleDExpression ) )
                    // InternalDem.g:616:6: (lv_selector_5_0= ruleDExpression )
                    {
                    // InternalDem.g:616:6: (lv_selector_5_0= ruleDExpression )
                    // InternalDem.g:617:7: lv_selector_5_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDCaseConjunctionAccess().getSelectorDExpressionParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
                    lv_selector_5_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getDCaseConjunctionRule());
                      							}
                      							set(
                      								current,
                      								"selector",
                      								lv_selector_5_0,
                      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:636:4: ( (lv_otherwise_6_0= 'otherwise' ) )
                    {
                    // InternalDem.g:636:4: ( (lv_otherwise_6_0= 'otherwise' ) )
                    // InternalDem.g:637:5: (lv_otherwise_6_0= 'otherwise' )
                    {
                    // InternalDem.g:637:5: (lv_otherwise_6_0= 'otherwise' )
                    // InternalDem.g:638:6: lv_otherwise_6_0= 'otherwise'
                    {
                    lv_otherwise_6_0=(Token)match(input,31,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_otherwise_6_0, grammarAccess.getDCaseConjunctionAccess().getOtherwiseOtherwiseKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDCaseConjunctionRule());
                      						}
                      						setWithLastConsumed(current, "otherwise", true, "otherwise");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDCaseConjunctionAccess().getColonKeyword_4());
              		
            }
            // InternalDem.g:655:3: ( (lv_predicates_8_0= ruleDNamedPredicate ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDem.g:656:4: (lv_predicates_8_0= ruleDNamedPredicate )
            	    {
            	    // InternalDem.g:656:4: (lv_predicates_8_0= ruleDNamedPredicate )
            	    // InternalDem.g:657:5: lv_predicates_8_0= ruleDNamedPredicate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDCaseConjunctionAccess().getPredicatesDNamedPredicateParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_predicates_8_0=ruleDNamedPredicate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDCaseConjunctionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"predicates",
            	      						lv_predicates_8_0,
            	      						"com.mimacom.ddd.dm.dem.Dem.DNamedPredicate");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // $ANTLR end "ruleDCaseConjunction"


    // $ANTLR start "entryRuleDNotification"
    // InternalDem.g:678:1: entryRuleDNotification returns [EObject current=null] : iv_ruleDNotification= ruleDNotification EOF ;
    public final EObject entryRuleDNotification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNotification = null;


        try {
            // InternalDem.g:678:54: (iv_ruleDNotification= ruleDNotification EOF )
            // InternalDem.g:679:2: iv_ruleDNotification= ruleDNotification EOF
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
    // InternalDem.g:685:1: ruleDNotification returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ) ;
    public final EObject ruleDNotification() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_message_4_0 = null;

        EObject lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalDem.g:691:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? ) )
            // InternalDem.g:692:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            {
            // InternalDem.g:692:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )? )
            // InternalDem.g:693:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_message_4_0= ruleDMessage ) ) otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) ( (lv_description_7_0= ruleDRichText ) )?
            {
            // InternalDem.g:693:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:694:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:694:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:695:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDNotificationAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:711:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDem.g:712:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDNotificationAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:716:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:717:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:717:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:718:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDNotificationAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDNotificationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDNotificationAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:739:3: ( (lv_message_4_0= ruleDMessage ) )
            // InternalDem.g:740:4: (lv_message_4_0= ruleDMessage )
            {
            // InternalDem.g:740:4: (lv_message_4_0= ruleDMessage )
            // InternalDem.g:741:5: lv_message_4_0= ruleDMessage
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDNotificationAccess().getMessageDMessageParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_message_4_0=ruleDMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDNotificationRule());
              					}
              					set(
              						current,
              						"message",
              						lv_message_4_0,
              						"com.mimacom.ddd.dm.dem.Dem.DMessage");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDNotificationAccess().getToKeyword_4());
              		
            }
            // InternalDem.g:762:3: ( (otherlv_6= RULE_ID ) )
            // InternalDem.g:763:4: (otherlv_6= RULE_ID )
            {
            // InternalDem.g:763:4: (otherlv_6= RULE_ID )
            // InternalDem.g:764:5: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDNotificationRule());
              					}
              				
            }
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_6, grammarAccess.getDNotificationAccess().getNotifiedDActorCrossReference_5_0());
              				
            }

            }


            }

            // InternalDem.g:775:3: ( (lv_description_7_0= ruleDRichText ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_PLAIN_TEXT_ONLY && LA23_0<=RULE_PLAIN_TEXT_START)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDem.g:776:4: (lv_description_7_0= ruleDRichText )
                    {
                    // InternalDem.g:776:4: (lv_description_7_0= ruleDRichText )
                    // InternalDem.g:777:5: lv_description_7_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDNotificationAccess().getDescriptionDRichTextParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_7_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDNotificationRule());
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


    // $ANTLR start "entryRuleDMessage"
    // InternalDem.g:798:1: entryRuleDMessage returns [EObject current=null] : iv_ruleDMessage= ruleDMessage EOF ;
    public final EObject entryRuleDMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMessage = null;


        try {
            // InternalDem.g:798:49: (iv_ruleDMessage= ruleDMessage EOF )
            // InternalDem.g:799:2: iv_ruleDMessage= ruleDMessage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDMessageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDMessage=ruleDMessage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDMessage; 
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
    // $ANTLR end "entryRuleDMessage"


    // $ANTLR start "ruleDMessage"
    // InternalDem.g:805:1: ruleDMessage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_multiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:811:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? ) )
            // InternalDem.g:812:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? )
            {
            // InternalDem.g:812:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )? )
            // InternalDem.g:813:3: ( (otherlv_0= RULE_ID ) ) ( (lv_multiplicity_1_0= ruleDMultiplicity ) )?
            {
            // InternalDem.g:813:3: ( (otherlv_0= RULE_ID ) )
            // InternalDem.g:814:4: (otherlv_0= RULE_ID )
            {
            // InternalDem.g:814:4: (otherlv_0= RULE_ID )
            // InternalDem.g:815:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDMessageRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getDMessageAccess().getTypeDTypeCrossReference_0_0());
              				
            }

            }


            }

            // InternalDem.g:826:3: ( (lv_multiplicity_1_0= ruleDMultiplicity ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41||LA24_0==47||LA24_0==74||LA24_0==112) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDem.g:827:4: (lv_multiplicity_1_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:827:4: (lv_multiplicity_1_0= ruleDMultiplicity )
                    // InternalDem.g:828:5: lv_multiplicity_1_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDMessageAccess().getMultiplicityDMultiplicityParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_1_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDMessageRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_1_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
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
    // $ANTLR end "ruleDMessage"


    // $ANTLR start "entryRuleDContext"
    // InternalDem.g:849:1: entryRuleDContext returns [EObject current=null] : iv_ruleDContext= ruleDContext EOF ;
    public final EObject entryRuleDContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDContext = null;


        try {
            // InternalDem.g:849:49: (iv_ruleDContext= ruleDContext EOF )
            // InternalDem.g:850:2: iv_ruleDContext= ruleDContext EOF
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
    // InternalDem.g:856:1: ruleDContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_aliases_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_multiplicity_5_0 = null;

        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:862:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDem.g:863:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDem.g:863:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDem.g:864:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ( (lv_multiplicity_5_0= ruleDMultiplicity ) )? ( (lv_description_6_0= ruleDRichText ) )?
            {
            // InternalDem.g:864:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:865:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:865:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:866:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDContextAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:882:3: (otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDem.g:883:4: otherlv_1= 'alias' ( (lv_aliases_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getDContextAccess().getAliasKeyword_1_0());
            	      			
            	    }
            	    // InternalDem.g:887:4: ( (lv_aliases_2_0= RULE_ID ) )
            	    // InternalDem.g:888:5: (lv_aliases_2_0= RULE_ID )
            	    {
            	    // InternalDem.g:888:5: (lv_aliases_2_0= RULE_ID )
            	    // InternalDem.g:889:6: lv_aliases_2_0= RULE_ID
            	    {
            	    lv_aliases_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_2_0, grammarAccess.getDContextAccess().getAliasesIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDContextRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_2_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDContextAccess().getColonKeyword_2());
              		
            }
            // InternalDem.g:910:3: ( (otherlv_4= RULE_ID ) )
            // InternalDem.g:911:4: (otherlv_4= RULE_ID )
            {
            // InternalDem.g:911:4: (otherlv_4= RULE_ID )
            // InternalDem.g:912:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDContextRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDContextAccess().getTypeDTypeCrossReference_3_0());
              				
            }

            }


            }

            // InternalDem.g:923:3: ( (lv_multiplicity_5_0= ruleDMultiplicity ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41||LA26_0==47||LA26_0==74||LA26_0==112) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDem.g:924:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:924:4: (lv_multiplicity_5_0= ruleDMultiplicity )
                    // InternalDem.g:925:5: lv_multiplicity_5_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getMultiplicityDMultiplicityParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_multiplicity_5_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_5_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalDem.g:942:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_PLAIN_TEXT_ONLY && LA27_0<=RULE_PLAIN_TEXT_START)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDem.g:943:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDem.g:943:4: (lv_description_6_0= ruleDRichText )
                    // InternalDem.g:944:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDContextAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDContextRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_6_0,
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
    // InternalDem.g:965:1: entryRuleDActor returns [EObject current=null] : iv_ruleDActor= ruleDActor EOF ;
    public final EObject entryRuleDActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDActor = null;


        try {
            // InternalDem.g:965:47: (iv_ruleDActor= ruleDActor EOF )
            // InternalDem.g:966:2: iv_ruleDActor= ruleDActor EOF
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
    // InternalDem.g:972:1: ruleDActor returns [EObject current=null] : (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService ) ;
    public final EObject ruleDActor() throws RecognitionException {
        EObject current = null;

        EObject this_DHumanActorRole_0 = null;

        EObject this_DService_1 = null;



        	enterRule();

        try {
            // InternalDem.g:978:2: ( (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService ) )
            // InternalDem.g:979:2: (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService )
            {
            // InternalDem.g:979:2: (this_DHumanActorRole_0= ruleDHumanActorRole | this_DService_1= ruleDService )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDem.g:980:3: this_DHumanActorRole_0= ruleDHumanActorRole
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDActorAccess().getDHumanActorRoleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DHumanActorRole_0=ruleDHumanActorRole();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DHumanActorRole_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:989:3: this_DService_1= ruleDService
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


    // $ANTLR start "entryRuleDHumanActorRole"
    // InternalDem.g:1001:1: entryRuleDHumanActorRole returns [EObject current=null] : iv_ruleDHumanActorRole= ruleDHumanActorRole EOF ;
    public final EObject entryRuleDHumanActorRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDHumanActorRole = null;


        try {
            // InternalDem.g:1001:56: (iv_ruleDHumanActorRole= ruleDHumanActorRole EOF )
            // InternalDem.g:1002:2: iv_ruleDHumanActorRole= ruleDHumanActorRole EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDHumanActorRoleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDHumanActorRole=ruleDHumanActorRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDHumanActorRole; 
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
    // $ANTLR end "entryRuleDHumanActorRole"


    // $ANTLR start "ruleDHumanActorRole"
    // InternalDem.g:1008:1: ruleDHumanActorRole returns [EObject current=null] : (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? ) ;
    public final EObject ruleDHumanActorRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_aliases_5_0=null;
        EObject lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1014:2: ( (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? ) )
            // InternalDem.g:1015:2: (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1015:2: (otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )? )
            // InternalDem.g:1016:3: otherlv_0= 'human' otherlv_1= 'actor' otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )* ( (lv_description_6_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDHumanActorRoleAccess().getHumanKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDHumanActorRoleAccess().getActorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDHumanActorRoleAccess().getAsKeyword_2());
              		
            }
            // InternalDem.g:1028:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDem.g:1029:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDem.g:1029:4: (lv_name_3_0= RULE_ID )
            // InternalDem.g:1030:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getDHumanActorRoleAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDHumanActorRoleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:1046:3: (otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDem.g:1047:4: otherlv_4= 'alias' ( (lv_aliases_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDHumanActorRoleAccess().getAliasKeyword_4_0());
            	      			
            	    }
            	    // InternalDem.g:1051:4: ( (lv_aliases_5_0= RULE_ID ) )
            	    // InternalDem.g:1052:5: (lv_aliases_5_0= RULE_ID )
            	    {
            	    // InternalDem.g:1052:5: (lv_aliases_5_0= RULE_ID )
            	    // InternalDem.g:1053:6: lv_aliases_5_0= RULE_ID
            	    {
            	    lv_aliases_5_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_5_0, grammarAccess.getDHumanActorRoleAccess().getAliasesIDTerminalRuleCall_4_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDHumanActorRoleRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_5_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalDem.g:1070:3: ( (lv_description_6_0= ruleDRichText ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_PLAIN_TEXT_ONLY && LA30_0<=RULE_PLAIN_TEXT_START)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDem.g:1071:4: (lv_description_6_0= ruleDRichText )
                    {
                    // InternalDem.g:1071:4: (lv_description_6_0= ruleDRichText )
                    // InternalDem.g:1072:5: lv_description_6_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDHumanActorRoleAccess().getDescriptionDRichTextParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_6_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDHumanActorRoleRule());
                      					}
                      					set(
                      						current,
                      						"description",
                      						lv_description_6_0,
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
    // $ANTLR end "ruleDHumanActorRole"


    // $ANTLR start "entryRuleDService"
    // InternalDem.g:1093:1: entryRuleDService returns [EObject current=null] : iv_ruleDService= ruleDService EOF ;
    public final EObject entryRuleDService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDService = null;


        try {
            // InternalDem.g:1093:49: (iv_ruleDService= ruleDService EOF )
            // InternalDem.g:1094:2: iv_ruleDService= ruleDService EOF
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
    // InternalDem.g:1100:1: ruleDService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) ;
    public final EObject ruleDService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_aliases_4_0=null;
        EObject lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1106:2: ( (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? ) )
            // InternalDem.g:1107:2: (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1107:2: (otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )? )
            // InternalDem.g:1108:3: otherlv_0= 'service' otherlv_1= 'actor' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )* ( (lv_description_5_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDServiceAccess().getServiceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDServiceAccess().getActorKeyword_1());
              		
            }
            // InternalDem.g:1116:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDem.g:1117:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDem.g:1117:4: (lv_name_2_0= RULE_ID )
            // InternalDem.g:1118:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDServiceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:1134:3: (otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDem.g:1135:4: otherlv_3= 'alias' ( (lv_aliases_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getDServiceAccess().getAliasKeyword_3_0());
            	      			
            	    }
            	    // InternalDem.g:1139:4: ( (lv_aliases_4_0= RULE_ID ) )
            	    // InternalDem.g:1140:5: (lv_aliases_4_0= RULE_ID )
            	    {
            	    // InternalDem.g:1140:5: (lv_aliases_4_0= RULE_ID )
            	    // InternalDem.g:1141:6: lv_aliases_4_0= RULE_ID
            	    {
            	    lv_aliases_4_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_aliases_4_0, grammarAccess.getDServiceAccess().getAliasesIDTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getDServiceRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"aliases",
            	      							lv_aliases_4_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalDem.g:1158:3: ( (lv_description_5_0= ruleDRichText ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_PLAIN_TEXT_ONLY && LA32_0<=RULE_PLAIN_TEXT_START)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDem.g:1159:4: (lv_description_5_0= ruleDRichText )
                    {
                    // InternalDem.g:1159:4: (lv_description_5_0= ruleDRichText )
                    // InternalDem.g:1160:5: lv_description_5_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDServiceAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_5_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDServiceRule());
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
    // $ANTLR end "ruleDService"


    // $ANTLR start "entryRuleDImport"
    // InternalDem.g:1181:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalDem.g:1181:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalDem.g:1182:2: iv_ruleDImport= ruleDImport EOF
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
    // InternalDem.g:1188:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1194:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) ) )
            // InternalDem.g:1195:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            {
            // InternalDem.g:1195:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) ) )
            // InternalDem.g:1196:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
              		
            }
            // InternalDem.g:1200:3: ( (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard ) )
            // InternalDem.g:1201:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            {
            // InternalDem.g:1201:4: (lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard )
            // InternalDem.g:1202:5: lv_importedNamespace_1_0= ruleDQualifiedNameWithWildcard
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
              						"com.mimacom.ddd.dm.dmx.Dmx.DQualifiedNameWithWildcard");
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


    // $ANTLR start "entryRuleDmxTest"
    // InternalDem.g:1223:1: entryRuleDmxTest returns [EObject current=null] : iv_ruleDmxTest= ruleDmxTest EOF ;
    public final EObject entryRuleDmxTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTest = null;


        try {
            // InternalDem.g:1223:48: (iv_ruleDmxTest= ruleDmxTest EOF )
            // InternalDem.g:1224:2: iv_ruleDmxTest= ruleDmxTest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTestRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTest=ruleDmxTest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTest; 
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
    // $ANTLR end "entryRuleDmxTest"


    // $ANTLR start "ruleDmxTest"
    // InternalDem.g:1230:1: ruleDmxTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleDmxTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_context_3_0 = null;

        EObject lv_context_5_0 = null;

        EObject lv_expr_7_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1236:2: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' ) )
            // InternalDem.g:1237:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            {
            // InternalDem.g:1237:2: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}' )
            // InternalDem.g:1238:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )? otherlv_6= '{' ( (lv_expr_7_0= ruleDExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxTestAccess().getTestKeyword_0());
              		
            }
            // InternalDem.g:1242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1243:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDmxTestAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            // InternalDem.g:1260:3: (otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDem.g:1261:4: otherlv_2= 'context' ( (lv_context_3_0= ruleDmxTestContext ) ) (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxTestAccess().getContextKeyword_2_0());
                      			
                    }
                    // InternalDem.g:1265:4: ( (lv_context_3_0= ruleDmxTestContext ) )
                    // InternalDem.g:1266:5: (lv_context_3_0= ruleDmxTestContext )
                    {
                    // InternalDem.g:1266:5: (lv_context_3_0= ruleDmxTestContext )
                    // InternalDem.g:1267:6: lv_context_3_0= ruleDmxTestContext
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_context_3_0=ruleDmxTestContext();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxTestRule());
                      						}
                      						add(
                      							current,
                      							"context",
                      							lv_context_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxTestContext");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:1284:4: (otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==39) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDem.g:1285:5: otherlv_4= ',' ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxTestAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalDem.g:1289:5: ( (lv_context_5_0= ruleDmxTestContext ) )
                    	    // InternalDem.g:1290:6: (lv_context_5_0= ruleDmxTestContext )
                    	    {
                    	    // InternalDem.g:1290:6: (lv_context_5_0= ruleDmxTestContext )
                    	    // InternalDem.g:1291:7: lv_context_5_0= ruleDmxTestContext
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxTestAccess().getContextDmxTestContextParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_context_5_0=ruleDmxTestContext();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxTestRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"context",
                    	      								lv_context_5_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxTestContext");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxTestAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalDem.g:1314:3: ( (lv_expr_7_0= ruleDExpression ) )
            // InternalDem.g:1315:4: (lv_expr_7_0= ruleDExpression )
            {
            // InternalDem.g:1315:4: (lv_expr_7_0= ruleDExpression )
            // InternalDem.g:1316:5: lv_expr_7_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxTestAccess().getExprDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_expr_7_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxTestRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_7_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDmxTestAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDmxTest"


    // $ANTLR start "entryRuleDmxTestContext"
    // InternalDem.g:1341:1: entryRuleDmxTestContext returns [EObject current=null] : iv_ruleDmxTestContext= ruleDmxTestContext EOF ;
    public final EObject entryRuleDmxTestContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTestContext = null;


        try {
            // InternalDem.g:1341:55: (iv_ruleDmxTestContext= ruleDmxTestContext EOF )
            // InternalDem.g:1342:2: iv_ruleDmxTestContext= ruleDmxTestContext EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTestContextRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTestContext=ruleDmxTestContext();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTestContext; 
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
    // $ANTLR end "entryRuleDmxTestContext"


    // $ANTLR start "ruleDmxTestContext"
    // InternalDem.g:1348:1: ruleDmxTestContext returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) ;
    public final EObject ruleDmxTestContext() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1354:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? ) )
            // InternalDem.g:1355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            {
            // InternalDem.g:1355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )? )
            // InternalDem.g:1356:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            {
            // InternalDem.g:1356:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1357:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1357:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1358:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDmxTestContextAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxTestContextAccess().getColonKeyword_1());
              		
            }
            // InternalDem.g:1378:3: ( (otherlv_2= RULE_ID ) )
            // InternalDem.g:1379:4: (otherlv_2= RULE_ID )
            {
            // InternalDem.g:1379:4: (otherlv_2= RULE_ID )
            // InternalDem.g:1380:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxTestContextRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxTestContextAccess().getTypeDTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDem.g:1391:3: ( (lv_multiplicity_3_0= ruleDMultiplicity ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41||LA35_0==47||LA35_0==74||LA35_0==112) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDem.g:1392:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    {
                    // InternalDem.g:1392:4: (lv_multiplicity_3_0= ruleDMultiplicity )
                    // InternalDem.g:1393:5: lv_multiplicity_3_0= ruleDMultiplicity
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxTestContextAccess().getMultiplicityDMultiplicityParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_3_0=ruleDMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDmxTestContextRule());
                      					}
                      					set(
                      						current,
                      						"multiplicity",
                      						lv_multiplicity_3_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicity");
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
    // $ANTLR end "ruleDmxTestContext"


    // $ANTLR start "entryRuleDmxBaseTypeSet"
    // InternalDem.g:1414:1: entryRuleDmxBaseTypeSet returns [EObject current=null] : iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF ;
    public final EObject entryRuleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBaseTypeSet = null;


        try {
            // InternalDem.g:1414:55: (iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF )
            // InternalDem.g:1415:2: iv_ruleDmxBaseTypeSet= ruleDmxBaseTypeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxBaseTypeSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxBaseTypeSet=ruleDmxBaseTypeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxBaseTypeSet; 
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
    // $ANTLR end "entryRuleDmxBaseTypeSet"


    // $ANTLR start "ruleDmxBaseTypeSet"
    // InternalDem.g:1421:1: ruleDmxBaseTypeSet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) ;
    public final EObject ruleDmxBaseTypeSet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_members_3_0 = null;

        Enumerator lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1427:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' ) )
            // InternalDem.g:1428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            {
            // InternalDem.g:1428:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')' )
            // InternalDem.g:1429:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'in' otherlv_2= '(' ( (lv_members_3_0= ruleDmxBaseType ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+ otherlv_6= ')'
            {
            // InternalDem.g:1429:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1430:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1430:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1431:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDmxBaseTypeSetAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxBaseTypeSetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxBaseTypeSetAccess().getInKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxBaseTypeSetAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:1455:3: ( (lv_members_3_0= ruleDmxBaseType ) )
            // InternalDem.g:1456:4: (lv_members_3_0= ruleDmxBaseType )
            {
            // InternalDem.g:1456:4: (lv_members_3_0= ruleDmxBaseType )
            // InternalDem.g:1457:5: lv_members_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_members_3_0=ruleDmxBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxBaseTypeSetRule());
              					}
              					add(
              						current,
              						"members",
              						lv_members_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxBaseType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:1474:3: (otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==39) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalDem.g:1475:4: otherlv_4= ',' ( (lv_members_5_0= ruleDmxBaseType ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDmxBaseTypeSetAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalDem.g:1479:4: ( (lv_members_5_0= ruleDmxBaseType ) )
            	    // InternalDem.g:1480:5: (lv_members_5_0= ruleDmxBaseType )
            	    {
            	    // InternalDem.g:1480:5: (lv_members_5_0= ruleDmxBaseType )
            	    // InternalDem.g:1481:6: lv_members_5_0= ruleDmxBaseType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxBaseTypeSetAccess().getMembersDmxBaseTypeEnumRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_members_5_0=ruleDmxBaseType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxBaseTypeSetRule());
            	      						}
            	      						add(
            	      							current,
            	      							"members",
            	      							lv_members_5_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxBaseType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_6=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxBaseTypeSetAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleDmxBaseTypeSet"


    // $ANTLR start "entryRuleDmxArchetype"
    // InternalDem.g:1507:1: entryRuleDmxArchetype returns [EObject current=null] : iv_ruleDmxArchetype= ruleDmxArchetype EOF ;
    public final EObject entryRuleDmxArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxArchetype = null;


        try {
            // InternalDem.g:1507:53: (iv_ruleDmxArchetype= ruleDmxArchetype EOF )
            // InternalDem.g:1508:2: iv_ruleDmxArchetype= ruleDmxArchetype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxArchetypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxArchetype=ruleDmxArchetype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxArchetype; 
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
    // $ANTLR end "entryRuleDmxArchetype"


    // $ANTLR start "ruleDmxArchetype"
    // InternalDem.g:1514:1: ruleDmxArchetype returns [EObject current=null] : (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) ;
    public final EObject ruleDmxArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_baseType_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1520:2: ( (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? ) )
            // InternalDem.g:1521:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            {
            // InternalDem.g:1521:2: (otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )? )
            // InternalDem.g:1522:3: otherlv_0= 'archetype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_baseType_3_0= ruleDmxBaseType ) ) ( (lv_description_4_0= ruleDRichText ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxArchetypeAccess().getArchetypeKeyword_0());
              		
            }
            // InternalDem.g:1526:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1527:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1527:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1528:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDmxArchetypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxArchetypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxArchetypeAccess().getIsKeyword_2());
              		
            }
            // InternalDem.g:1548:3: ( (lv_baseType_3_0= ruleDmxBaseType ) )
            // InternalDem.g:1549:4: (lv_baseType_3_0= ruleDmxBaseType )
            {
            // InternalDem.g:1549:4: (lv_baseType_3_0= ruleDmxBaseType )
            // InternalDem.g:1550:5: lv_baseType_3_0= ruleDmxBaseType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getBaseTypeDmxBaseTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_baseType_3_0=ruleDmxBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxArchetypeRule());
              					}
              					set(
              						current,
              						"baseType",
              						lv_baseType_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxBaseType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:1567:3: ( (lv_description_4_0= ruleDRichText ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_PLAIN_TEXT_ONLY && LA37_0<=RULE_PLAIN_TEXT_START)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDem.g:1568:4: (lv_description_4_0= ruleDRichText )
                    {
                    // InternalDem.g:1568:4: (lv_description_4_0= ruleDRichText )
                    // InternalDem.g:1569:5: lv_description_4_0= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDmxArchetypeAccess().getDescriptionDRichTextParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDmxArchetypeRule());
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
    // $ANTLR end "ruleDmxArchetype"


    // $ANTLR start "entryRuleDmxFilter"
    // InternalDem.g:1590:1: entryRuleDmxFilter returns [EObject current=null] : iv_ruleDmxFilter= ruleDmxFilter EOF ;
    public final EObject entryRuleDmxFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilter = null;


        try {
            // InternalDem.g:1590:50: (iv_ruleDmxFilter= ruleDmxFilter EOF )
            // InternalDem.g:1591:2: iv_ruleDmxFilter= ruleDmxFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFilter=ruleDmxFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFilter; 
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
    // $ANTLR end "entryRuleDmxFilter"


    // $ANTLR start "ruleDmxFilter"
    // InternalDem.g:1597:1: ruleDmxFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) ;
    public final EObject ruleDmxFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_typeDesc_8_0 = null;

        EObject lv_withTypeSet_10_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1603:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? ) )
            // InternalDem.g:1604:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            {
            // InternalDem.g:1604:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )? )
            // InternalDem.g:1605:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) ) (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxFilterAccess().getFilterKeyword_0());
              		
            }
            // InternalDem.g:1609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDem.g:1610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDem.g:1610:4: (lv_name_1_0= RULE_ID )
            // InternalDem.g:1611:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDmxFilterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFilterAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:1631:3: ( ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDem.g:1632:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    {
                    // InternalDem.g:1632:4: ( (lv_parameters_3_0= ruleDmxFilterParameter ) )
                    // InternalDem.g:1633:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    {
                    // InternalDem.g:1633:5: (lv_parameters_3_0= ruleDmxFilterParameter )
                    // InternalDem.g:1634:6: lv_parameters_3_0= ruleDmxFilterParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_parameters_3_0=ruleDmxFilterParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxFilterRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxFilterParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:1651:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==39) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalDem.g:1652:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getDmxFilterAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:1656:5: ( (lv_parameters_5_0= ruleDmxFilterParameter ) )
                    	    // InternalDem.g:1657:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    {
                    	    // InternalDem.g:1657:6: (lv_parameters_5_0= ruleDmxFilterParameter )
                    	    // InternalDem.g:1658:7: lv_parameters_5_0= ruleDmxFilterParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFilterAccess().getParametersDmxFilterParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_37);
                    	    lv_parameters_5_0=ruleDmxFilterParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxFilterParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDmxFilterAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,28,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxFilterAccess().getColonKeyword_5());
              		
            }
            // InternalDem.g:1685:3: ( (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDem.g:1686:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDem.g:1686:4: (lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor )
            // InternalDem.g:1687:5: lv_typeDesc_8_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_typeDesc_8_0=ruleDmxFilterTypeDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxFilterRule());
              					}
              					set(
              						current,
              						"typeDesc",
              						lv_typeDesc_8_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxFilterTypeDescriptor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:1704:3: (otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDem.g:1705:4: otherlv_9= 'with' ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDmxFilterAccess().getWithKeyword_7_0());
                      			
                    }
                    // InternalDem.g:1709:4: ( (lv_withTypeSet_10_0= ruleDmxBaseTypeSet ) )
                    // InternalDem.g:1710:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    {
                    // InternalDem.g:1710:5: (lv_withTypeSet_10_0= ruleDmxBaseTypeSet )
                    // InternalDem.g:1711:6: lv_withTypeSet_10_0= ruleDmxBaseTypeSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterAccess().getWithTypeSetDmxBaseTypeSetParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_withTypeSet_10_0=ruleDmxBaseTypeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxFilterRule());
                      						}
                      						set(
                      							current,
                      							"withTypeSet",
                      							lv_withTypeSet_10_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxBaseTypeSet");
                      						afterParserOrEnumRuleCall();
                      					
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
    // $ANTLR end "ruleDmxFilter"


    // $ANTLR start "entryRuleDmxFilterTypeDescriptor"
    // InternalDem.g:1733:1: entryRuleDmxFilterTypeDescriptor returns [EObject current=null] : iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF ;
    public final EObject entryRuleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterTypeDescriptor = null;


        try {
            // InternalDem.g:1733:64: (iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF )
            // InternalDem.g:1734:2: iv_ruleDmxFilterTypeDescriptor= ruleDmxFilterTypeDescriptor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFilterTypeDescriptor=ruleDmxFilterTypeDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFilterTypeDescriptor; 
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
    // $ANTLR end "entryRuleDmxFilterTypeDescriptor"


    // $ANTLR start "ruleDmxFilterTypeDescriptor"
    // InternalDem.g:1740:1: ruleDmxFilterTypeDescriptor returns [EObject current=null] : ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) ;
    public final EObject ruleDmxFilterTypeDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_collection_2_0=null;
        Enumerator lv_single_0_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1746:2: ( ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? ) )
            // InternalDem.g:1747:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            {
            // InternalDem.g:1747:2: ( ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )? )
            // InternalDem.g:1748:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_collection_2_0= '*' ) )?
            {
            // InternalDem.g:1748:3: ( ( (lv_single_0_0= ruleDmxBaseType ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=77 && LA41_0<=87)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDem.g:1749:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    {
                    // InternalDem.g:1749:4: ( (lv_single_0_0= ruleDmxBaseType ) )
                    // InternalDem.g:1750:5: (lv_single_0_0= ruleDmxBaseType )
                    {
                    // InternalDem.g:1750:5: (lv_single_0_0= ruleDmxBaseType )
                    // InternalDem.g:1751:6: lv_single_0_0= ruleDmxBaseType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleDmxBaseTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
                    lv_single_0_0=ruleDmxBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      						set(
                      							current,
                      							"single",
                      							lv_single_0_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxBaseType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:1769:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDem.g:1769:4: ( (otherlv_1= RULE_ID ) )
                    // InternalDem.g:1770:5: (otherlv_1= RULE_ID )
                    {
                    // InternalDem.g:1770:5: (otherlv_1= RULE_ID )
                    // InternalDem.g:1771:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleDmxBaseTypeSetCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:1783:3: ( (lv_collection_2_0= '*' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDem.g:1784:4: (lv_collection_2_0= '*' )
                    {
                    // InternalDem.g:1784:4: (lv_collection_2_0= '*' )
                    // InternalDem.g:1785:5: lv_collection_2_0= '*'
                    {
                    lv_collection_2_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_collection_2_0, grammarAccess.getDmxFilterTypeDescriptorAccess().getCollectionAsteriskKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDmxFilterTypeDescriptorRule());
                      					}
                      					setWithLastConsumed(current, "collection", true, "*");
                      				
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
    // $ANTLR end "ruleDmxFilterTypeDescriptor"


    // $ANTLR start "entryRuleDmxFilterParameter"
    // InternalDem.g:1801:1: entryRuleDmxFilterParameter returns [EObject current=null] : iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF ;
    public final EObject entryRuleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFilterParameter = null;


        try {
            // InternalDem.g:1801:59: (iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF )
            // InternalDem.g:1802:2: iv_ruleDmxFilterParameter= ruleDmxFilterParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFilterParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFilterParameter=ruleDmxFilterParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFilterParameter; 
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
    // $ANTLR end "entryRuleDmxFilterParameter"


    // $ANTLR start "ruleDmxFilterParameter"
    // InternalDem.g:1808:1: ruleDmxFilterParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) ;
    public final EObject ruleDmxFilterParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_typeDesc_2_0 = null;



        	enterRule();

        try {
            // InternalDem.g:1814:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) ) )
            // InternalDem.g:1815:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            {
            // InternalDem.g:1815:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) ) )
            // InternalDem.g:1816:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            {
            // InternalDem.g:1816:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:1817:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:1817:4: (lv_name_0_0= RULE_ID )
            // InternalDem.g:1818:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getDmxFilterParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFilterParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxFilterParameterAccess().getColonKeyword_1());
              		
            }
            // InternalDem.g:1838:3: ( (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor ) )
            // InternalDem.g:1839:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            {
            // InternalDem.g:1839:4: (lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor )
            // InternalDem.g:1840:5: lv_typeDesc_2_0= ruleDmxFilterTypeDescriptor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFilterParameterAccess().getTypeDescDmxFilterTypeDescriptorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_typeDesc_2_0=ruleDmxFilterTypeDescriptor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxFilterParameterRule());
              					}
              					set(
              						current,
              						"typeDesc",
              						lv_typeDesc_2_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxFilterTypeDescriptor");
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
    // $ANTLR end "ruleDmxFilterParameter"


    // $ANTLR start "entryRuleDExpression"
    // InternalDem.g:1861:1: entryRuleDExpression returns [EObject current=null] : iv_ruleDExpression= ruleDExpression EOF ;
    public final EObject entryRuleDExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDExpression = null;


        try {
            // InternalDem.g:1861:52: (iv_ruleDExpression= ruleDExpression EOF )
            // InternalDem.g:1862:2: iv_ruleDExpression= ruleDExpression EOF
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
    // InternalDem.g:1868:1: ruleDExpression returns [EObject current=null] : (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) ;
    public final EObject ruleDExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAssignment_0 = null;

        EObject this_DmxPredicateWithCorrelationVariable_1 = null;

        EObject this_DRichText_2 = null;



        	enterRule();

        try {
            // InternalDem.g:1874:2: ( (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText ) )
            // InternalDem.g:1875:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            {
            // InternalDem.g:1875:2: (this_DmxAssignment_0= ruleDmxAssignment | this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable | this_DRichText_2= ruleDRichText )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==50) ) {
                    alt43=1;
                }
                else if ( (LA43_1==EOF||(LA43_1>=RULE_ID && LA43_1<=RULE_PLAIN_TEXT_END)||(LA43_1>=26 && LA43_1<=29)||LA43_1==35||(LA43_1>=39 && LA43_1<=42)||(LA43_1>=47 && LA43_1<=49)||(LA43_1>=51 && LA43_1<=54)||(LA43_1>=62 && LA43_1<=65)||(LA43_1>=74 && LA43_1<=75)||(LA43_1>=88 && LA43_1<=108)) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
            case RULE_STRING:
            case 20:
            case 41:
            case 55:
            case 56:
            case 57:
            case 61:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 74:
            case 75:
            case 109:
            case 110:
            case 111:
                {
                alt43=2;
                }
                break;
            case RULE_PLAIN_TEXT_ONLY:
            case RULE_PLAIN_TEXT_START:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDem.g:1876:3: this_DmxAssignment_0= ruleDmxAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDmxAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxAssignment_0=ruleDmxAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:1885:3: this_DmxPredicateWithCorrelationVariable_1= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDmxPredicateWithCorrelationVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxPredicateWithCorrelationVariable_1=ruleDmxPredicateWithCorrelationVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxPredicateWithCorrelationVariable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDem.g:1894:3: this_DRichText_2= ruleDRichText
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDExpressionAccess().getDRichTextParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DRichText_2=ruleDRichText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DRichText_2;
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
    // InternalDem.g:1906:1: entryRuleDRichText returns [EObject current=null] : iv_ruleDRichText= ruleDRichText EOF ;
    public final EObject entryRuleDRichText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDRichText = null;


        try {
            // InternalDem.g:1906:50: (iv_ruleDRichText= ruleDRichText EOF )
            // InternalDem.g:1907:2: iv_ruleDRichText= ruleDRichText EOF
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
    // InternalDem.g:1913:1: ruleDRichText returns [EObject current=null] : ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) ;
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
            // InternalDem.g:1919:2: ( ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) ) )
            // InternalDem.g:1920:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            {
            // InternalDem.g:1920:2: ( ( (lv_segments_0_0= ruleDmxTextOnly ) ) | ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_PLAIN_TEXT_ONLY) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_PLAIN_TEXT_START) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalDem.g:1921:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    {
                    // InternalDem.g:1921:3: ( (lv_segments_0_0= ruleDmxTextOnly ) )
                    // InternalDem.g:1922:4: (lv_segments_0_0= ruleDmxTextOnly )
                    {
                    // InternalDem.g:1922:4: (lv_segments_0_0= ruleDmxTextOnly )
                    // InternalDem.g:1923:5: lv_segments_0_0= ruleDmxTextOnly
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextOnlyParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_0_0=ruleDmxTextOnly();

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
                      						"com.mimacom.ddd.dm.dmx.Dmx.DmxTextOnly");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:1941:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    {
                    // InternalDem.g:1941:3: ( ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) ) )
                    // InternalDem.g:1942:4: ( (lv_segments_1_0= ruleDmxTextStart ) ) ( (lv_segments_2_0= ruleDExpression ) ) ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )* ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    {
                    // InternalDem.g:1942:4: ( (lv_segments_1_0= ruleDmxTextStart ) )
                    // InternalDem.g:1943:5: (lv_segments_1_0= ruleDmxTextStart )
                    {
                    // InternalDem.g:1943:5: (lv_segments_1_0= ruleDmxTextStart )
                    // InternalDem.g:1944:6: lv_segments_1_0= ruleDmxTextStart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextStartParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_segments_1_0=ruleDmxTextStart();

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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxTextStart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:1961:4: ( (lv_segments_2_0= ruleDExpression ) )
                    // InternalDem.g:1962:5: (lv_segments_2_0= ruleDExpression )
                    {
                    // InternalDem.g:1962:5: (lv_segments_2_0= ruleDExpression )
                    // InternalDem.g:1963:6: lv_segments_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

                    // InternalDem.g:1980:4: ( ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_PLAIN_TEXT_MIDDLE) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalDem.g:1981:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) ) ( (lv_segments_4_0= ruleDExpression ) )
                    	    {
                    	    // InternalDem.g:1981:5: ( (lv_segments_3_0= ruleDmxTextMiddle ) )
                    	    // InternalDem.g:1982:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    {
                    	    // InternalDem.g:1982:6: (lv_segments_3_0= ruleDmxTextMiddle )
                    	    // InternalDem.g:1983:7: lv_segments_3_0= ruleDmxTextMiddle
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextMiddleParserRuleCall_1_2_0_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_segments_3_0=ruleDmxTextMiddle();

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
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxTextMiddle");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalDem.g:2000:5: ( (lv_segments_4_0= ruleDExpression ) )
                    	    // InternalDem.g:2001:6: (lv_segments_4_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:2001:6: (lv_segments_4_0= ruleDExpression )
                    	    // InternalDem.g:2002:7: lv_segments_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop44;
                        }
                    } while (true);

                    // InternalDem.g:2020:4: ( (lv_segments_5_0= ruleDmxTextEnd ) )
                    // InternalDem.g:2021:5: (lv_segments_5_0= ruleDmxTextEnd )
                    {
                    // InternalDem.g:2021:5: (lv_segments_5_0= ruleDmxTextEnd )
                    // InternalDem.g:2022:6: lv_segments_5_0= ruleDmxTextEnd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDRichTextAccess().getSegmentsDmxTextEndParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_segments_5_0=ruleDmxTextEnd();

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
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxTextEnd");
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


    // $ANTLR start "entryRuleDmxTextOnly"
    // InternalDem.g:2044:1: entryRuleDmxTextOnly returns [EObject current=null] : iv_ruleDmxTextOnly= ruleDmxTextOnly EOF ;
    public final EObject entryRuleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextOnly = null;


        try {
            // InternalDem.g:2044:52: (iv_ruleDmxTextOnly= ruleDmxTextOnly EOF )
            // InternalDem.g:2045:2: iv_ruleDmxTextOnly= ruleDmxTextOnly EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTextOnlyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTextOnly=ruleDmxTextOnly();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTextOnly; 
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
    // $ANTLR end "entryRuleDmxTextOnly"


    // $ANTLR start "ruleDmxTextOnly"
    // InternalDem.g:2051:1: ruleDmxTextOnly returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) ;
    public final EObject ruleDmxTextOnly() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2057:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) ) )
            // InternalDem.g:2058:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            {
            // InternalDem.g:2058:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_ONLY ) )
            // InternalDem.g:2059:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            {
            // InternalDem.g:2059:3: (lv_value_0_0= RULE_PLAIN_TEXT_ONLY )
            // InternalDem.g:2060:4: lv_value_0_0= RULE_PLAIN_TEXT_ONLY
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_ONLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextOnlyAccess().getValuePLAIN_TEXT_ONLYTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextOnlyRule());
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
    // $ANTLR end "ruleDmxTextOnly"


    // $ANTLR start "entryRuleDmxTextStart"
    // InternalDem.g:2079:1: entryRuleDmxTextStart returns [EObject current=null] : iv_ruleDmxTextStart= ruleDmxTextStart EOF ;
    public final EObject entryRuleDmxTextStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextStart = null;


        try {
            // InternalDem.g:2079:53: (iv_ruleDmxTextStart= ruleDmxTextStart EOF )
            // InternalDem.g:2080:2: iv_ruleDmxTextStart= ruleDmxTextStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTextStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTextStart=ruleDmxTextStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTextStart; 
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
    // $ANTLR end "entryRuleDmxTextStart"


    // $ANTLR start "ruleDmxTextStart"
    // InternalDem.g:2086:1: ruleDmxTextStart returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) ;
    public final EObject ruleDmxTextStart() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2092:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) ) )
            // InternalDem.g:2093:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            {
            // InternalDem.g:2093:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_START ) )
            // InternalDem.g:2094:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            {
            // InternalDem.g:2094:3: (lv_value_0_0= RULE_PLAIN_TEXT_START )
            // InternalDem.g:2095:4: lv_value_0_0= RULE_PLAIN_TEXT_START
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_START,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextStartAccess().getValuePLAIN_TEXT_STARTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextStartRule());
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
    // $ANTLR end "ruleDmxTextStart"


    // $ANTLR start "entryRuleDmxTextMiddle"
    // InternalDem.g:2114:1: entryRuleDmxTextMiddle returns [EObject current=null] : iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF ;
    public final EObject entryRuleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextMiddle = null;


        try {
            // InternalDem.g:2114:54: (iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF )
            // InternalDem.g:2115:2: iv_ruleDmxTextMiddle= ruleDmxTextMiddle EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTextMiddleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTextMiddle=ruleDmxTextMiddle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTextMiddle; 
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
    // $ANTLR end "entryRuleDmxTextMiddle"


    // $ANTLR start "ruleDmxTextMiddle"
    // InternalDem.g:2121:1: ruleDmxTextMiddle returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) ;
    public final EObject ruleDmxTextMiddle() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2127:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) ) )
            // InternalDem.g:2128:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            {
            // InternalDem.g:2128:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE ) )
            // InternalDem.g:2129:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            {
            // InternalDem.g:2129:3: (lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE )
            // InternalDem.g:2130:4: lv_value_0_0= RULE_PLAIN_TEXT_MIDDLE
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_MIDDLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextMiddleAccess().getValuePLAIN_TEXT_MIDDLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextMiddleRule());
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
    // $ANTLR end "ruleDmxTextMiddle"


    // $ANTLR start "entryRuleDmxTextEnd"
    // InternalDem.g:2149:1: entryRuleDmxTextEnd returns [EObject current=null] : iv_ruleDmxTextEnd= ruleDmxTextEnd EOF ;
    public final EObject entryRuleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxTextEnd = null;


        try {
            // InternalDem.g:2149:51: (iv_ruleDmxTextEnd= ruleDmxTextEnd EOF )
            // InternalDem.g:2150:2: iv_ruleDmxTextEnd= ruleDmxTextEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxTextEndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxTextEnd=ruleDmxTextEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxTextEnd; 
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
    // $ANTLR end "entryRuleDmxTextEnd"


    // $ANTLR start "ruleDmxTextEnd"
    // InternalDem.g:2156:1: ruleDmxTextEnd returns [EObject current=null] : ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) ;
    public final EObject ruleDmxTextEnd() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2162:2: ( ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) ) )
            // InternalDem.g:2163:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            {
            // InternalDem.g:2163:2: ( (lv_value_0_0= RULE_PLAIN_TEXT_END ) )
            // InternalDem.g:2164:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            {
            // InternalDem.g:2164:3: (lv_value_0_0= RULE_PLAIN_TEXT_END )
            // InternalDem.g:2165:4: lv_value_0_0= RULE_PLAIN_TEXT_END
            {
            lv_value_0_0=(Token)match(input,RULE_PLAIN_TEXT_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getDmxTextEndAccess().getValuePLAIN_TEXT_ENDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxTextEndRule());
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
    // $ANTLR end "ruleDmxTextEnd"


    // $ANTLR start "entryRuleDmxNavigableMemberReference"
    // InternalDem.g:2184:1: entryRuleDmxNavigableMemberReference returns [EObject current=null] : iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF ;
    public final EObject entryRuleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNavigableMemberReference = null;


        try {
            // InternalDem.g:2184:68: (iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF )
            // InternalDem.g:2185:2: iv_ruleDmxNavigableMemberReference= ruleDmxNavigableMemberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxNavigableMemberReference=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxNavigableMemberReference; 
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
    // $ANTLR end "entryRuleDmxNavigableMemberReference"


    // $ANTLR start "ruleDmxNavigableMemberReference"
    // InternalDem.g:2191:1: ruleDmxNavigableMemberReference returns [EObject current=null] : (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) ;
    public final EObject ruleDmxNavigableMemberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_explicitOperationCall_9_0=null;
        Token otherlv_11=null;
        Token lv_before_12_0=null;
        EObject this_DmxPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_callArguments_10_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2197:2: ( (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* ) )
            // InternalDem.g:2198:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            {
            // InternalDem.g:2198:2: (this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )* )
            // InternalDem.g:2199:3: this_DmxPrimaryExpression_0= ruleDmxPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_DmxPrimaryExpression_0=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxPrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2207:3: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) ) | ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? ) )*
            loop47:
            do {
                int alt47=3;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==48) ) {
                    int LA47_2 = input.LA(2);

                    if ( (synpred1_InternalDem()) ) {
                        alt47=1;
                    }
                    else if ( (synpred2_InternalDem()) ) {
                        alt47=2;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalDem.g:2208:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    {
            	    // InternalDem.g:2208:4: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) ) )
            	    // InternalDem.g:2209:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) ) ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    {
            	    // InternalDem.g:2209:5: ( ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign ) )
            	    // InternalDem.g:2210:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    {
            	    // InternalDem.g:2222:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign )
            	    // InternalDem.g:2223:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleDmxOpSingleAssign
            	    {
            	    // InternalDem.g:2223:7: ()
            	    // InternalDem.g:2224:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_2, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_0_0_0_1());
            	      						
            	    }
            	    // InternalDem.g:2234:7: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:2235:8: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:2235:8: (otherlv_3= RULE_ID )
            	    // InternalDem.g:2236:9: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      									}
            	      								
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberDNavigableMemberCrossReference_1_0_0_0_2_0());
            	      								
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxOpSingleAssignParserRuleCall_1_0_0_0_3());
            	      						
            	    }
            	    pushFollow(FOLLOW_46);
            	    ruleDmxOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2256:5: ( (lv_value_5_0= ruleDmxOrExpression ) )
            	    // InternalDem.g:2257:6: (lv_value_5_0= ruleDmxOrExpression )
            	    {
            	    // InternalDem.g:2257:6: (lv_value_5_0= ruleDmxOrExpression )
            	    // InternalDem.g:2258:7: lv_value_5_0= ruleDmxOrExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueDmxOrExpressionParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_value_5_0=ruleDmxOrExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      							set(
            	      								current,
            	      								"value",
            	      								lv_value_5_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxOrExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:2277:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    {
            	    // InternalDem.g:2277:4: ( ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )? )
            	    // InternalDem.g:2278:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) ) ( (otherlv_8= RULE_ID ) ) ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    {
            	    // InternalDem.g:2278:5: ( ( ( () '.' ) )=> ( () otherlv_7= '.' ) )
            	    // InternalDem.g:2279:6: ( ( () '.' ) )=> ( () otherlv_7= '.' )
            	    {
            	    // InternalDem.g:2285:6: ( () otherlv_7= '.' )
            	    // InternalDem.g:2286:7: () otherlv_7= '.'
            	    {
            	    // InternalDem.g:2286:7: ()
            	    // InternalDem.g:2287:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    otherlv_7=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_7, grammarAccess.getDmxNavigableMemberReferenceAccess().getFullStopKeyword_1_1_0_0_1());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2299:5: ( (otherlv_8= RULE_ID ) )
            	    // InternalDem.g:2300:6: (otherlv_8= RULE_ID )
            	    {
            	    // InternalDem.g:2300:6: (otherlv_8= RULE_ID )
            	    // InternalDem.g:2301:7: otherlv_8= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	      							}
            	      						
            	    }
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_8, grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberDNavigableMemberCrossReference_1_1_1_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2312:5: ( ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' ) | ( (lv_before_12_0= '@before' ) ) )?
            	    int alt46=3;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==41) && (synpred3_InternalDem())) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==49) ) {
            	        alt46=2;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalDem.g:2313:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            {
            	            // InternalDem.g:2313:6: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')' )
            	            // InternalDem.g:2314:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) ) ( (lv_callArguments_10_0= ruleDmxCallArguments ) ) otherlv_11= ')'
            	            {
            	            // InternalDem.g:2314:7: ( ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' ) )
            	            // InternalDem.g:2315:8: ( ( '(' ) )=> (lv_explicitOperationCall_9_0= '(' )
            	            {
            	            // InternalDem.g:2319:8: (lv_explicitOperationCall_9_0= '(' )
            	            // InternalDem.g:2320:9: lv_explicitOperationCall_9_0= '('
            	            {
            	            lv_explicitOperationCall_9_0=(Token)match(input,41,FOLLOW_48); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									newLeafNode(lv_explicitOperationCall_9_0, grammarAccess.getDmxNavigableMemberReferenceAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0_0());
            	              								
            	            }
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
            	              									}
            	              									setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              								
            	            }

            	            }


            	            }

            	            // InternalDem.g:2332:7: ( (lv_callArguments_10_0= ruleDmxCallArguments ) )
            	            // InternalDem.g:2333:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            {
            	            // InternalDem.g:2333:8: (lv_callArguments_10_0= ruleDmxCallArguments )
            	            // InternalDem.g:2334:9: lv_callArguments_10_0= ruleDmxCallArguments
            	            {
            	            if ( state.backtracking==0 ) {

            	              									newCompositeNode(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsDmxCallArgumentsParserRuleCall_1_1_2_0_1_0());
            	              								
            	            }
            	            pushFollow(FOLLOW_49);
            	            lv_callArguments_10_0=ruleDmxCallArguments();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              									if (current==null) {
            	              										current = createModelElementForParent(grammarAccess.getDmxNavigableMemberReferenceRule());
            	              									}
            	              									set(
            	              										current,
            	              										"callArguments",
            	              										lv_callArguments_10_0,
            	              										"com.mimacom.ddd.dm.dmx.Dmx.DmxCallArguments");
            	              									afterParserOrEnumRuleCall();
            	              								
            	            }

            	            }


            	            }

            	            otherlv_11=(Token)match(input,42,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(otherlv_11, grammarAccess.getDmxNavigableMemberReferenceAccess().getRightParenthesisKeyword_1_1_2_0_2());
            	              						
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDem.g:2357:6: ( (lv_before_12_0= '@before' ) )
            	            {
            	            // InternalDem.g:2357:6: ( (lv_before_12_0= '@before' ) )
            	            // InternalDem.g:2358:7: (lv_before_12_0= '@before' )
            	            {
            	            // InternalDem.g:2358:7: (lv_before_12_0= '@before' )
            	            // InternalDem.g:2359:8: lv_before_12_0= '@before'
            	            {
            	            lv_before_12_0=(Token)match(input,49,FOLLOW_44); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_before_12_0, grammarAccess.getDmxNavigableMemberReferenceAccess().getBeforeBeforeKeyword_1_1_2_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getDmxNavigableMemberReferenceRule());
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
            	    break loop47;
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
    // $ANTLR end "ruleDmxNavigableMemberReference"


    // $ANTLR start "entryRuleDmxCallArguments"
    // InternalDem.g:2378:1: entryRuleDmxCallArguments returns [EObject current=null] : iv_ruleDmxCallArguments= ruleDmxCallArguments EOF ;
    public final EObject entryRuleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCallArguments = null;


        try {
            // InternalDem.g:2378:57: (iv_ruleDmxCallArguments= ruleDmxCallArguments EOF )
            // InternalDem.g:2379:2: iv_ruleDmxCallArguments= ruleDmxCallArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxCallArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxCallArguments=ruleDmxCallArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxCallArguments; 
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
    // $ANTLR end "entryRuleDmxCallArguments"


    // $ANTLR start "ruleDmxCallArguments"
    // InternalDem.g:2385:1: ruleDmxCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) ;
    public final EObject ruleDmxCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2391:2: ( ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? ) )
            // InternalDem.g:2392:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            {
            // InternalDem.g:2392:2: ( () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )? )
            // InternalDem.g:2393:3: () ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            {
            // InternalDem.g:2393:3: ()
            // InternalDem.g:2394:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2400:3: ( ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||(LA49_0>=RULE_NATURAL && LA49_0<=RULE_STRING)||LA49_0==20||LA49_0==41||(LA49_0>=55 && LA49_0<=57)||LA49_0==61||(LA49_0>=66 && LA49_0<=71)||(LA49_0>=74 && LA49_0<=75)||(LA49_0>=109 && LA49_0<=111)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDem.g:2401:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    {
                    // InternalDem.g:2401:4: ( (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable ) )
                    // InternalDem.g:2402:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    {
                    // InternalDem.g:2402:5: (lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable )
                    // InternalDem.g:2403:6: lv_arguments_1_0= ruleDmxPredicateWithCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_arguments_1_0=ruleDmxPredicateWithCorrelationVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxCallArgumentsRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxPredicateWithCorrelationVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:2420:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==39) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalDem.g:2421:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:2425:5: ( (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable ) )
                    	    // InternalDem.g:2426:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    {
                    	    // InternalDem.g:2426:6: (lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable )
                    	    // InternalDem.g:2427:7: lv_arguments_3_0= ruleDmxPredicateWithCorrelationVariable
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxCallArgumentsAccess().getArgumentsDmxPredicateWithCorrelationVariableParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_50);
                    	    lv_arguments_3_0=ruleDmxPredicateWithCorrelationVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxCallArgumentsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_3_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxPredicateWithCorrelationVariable");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
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
    // $ANTLR end "ruleDmxCallArguments"


    // $ANTLR start "entryRuleDmxAssignment"
    // InternalDem.g:2450:1: entryRuleDmxAssignment returns [EObject current=null] : iv_ruleDmxAssignment= ruleDmxAssignment EOF ;
    public final EObject entryRuleDmxAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAssignment = null;


        try {
            // InternalDem.g:2450:54: (iv_ruleDmxAssignment= ruleDmxAssignment EOF )
            // InternalDem.g:2451:2: iv_ruleDmxAssignment= ruleDmxAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxAssignment=ruleDmxAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxAssignment; 
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
    // $ANTLR end "entryRuleDmxAssignment"


    // $ANTLR start "ruleDmxAssignment"
    // InternalDem.g:2457:1: ruleDmxAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) ;
    public final EObject ruleDmxAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2463:2: ( ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) ) )
            // InternalDem.g:2464:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            {
            // InternalDem.g:2464:2: ( () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) ) )
            // InternalDem.g:2465:3: () ( (otherlv_1= RULE_ID ) ) ruleDmxOpSingleAssign ( (lv_value_3_0= ruleDmxOrExpression ) )
            {
            // InternalDem.g:2465:3: ()
            // InternalDem.g:2466:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxAssignmentAccess().getDmxAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:2472:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:2473:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:2473:4: (otherlv_1= RULE_ID )
            // InternalDem.g:2474:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxAssignmentRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxAssignmentAccess().getAssignToMemberDNavigableMemberCrossReference_1_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAssignmentAccess().getDmxOpSingleAssignParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_46);
            ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2492:3: ( (lv_value_3_0= ruleDmxOrExpression ) )
            // InternalDem.g:2493:4: (lv_value_3_0= ruleDmxOrExpression )
            {
            // InternalDem.g:2493:4: (lv_value_3_0= ruleDmxOrExpression )
            // InternalDem.g:2494:5: lv_value_3_0= ruleDmxOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxAssignmentAccess().getValueDmxOrExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleDmxOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxAssignmentRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxOrExpression");
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
    // $ANTLR end "ruleDmxAssignment"


    // $ANTLR start "entryRuleDmxOpSingleAssign"
    // InternalDem.g:2515:1: entryRuleDmxOpSingleAssign returns [String current=null] : iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF ;
    public final String entryRuleDmxOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpSingleAssign = null;


        try {
            // InternalDem.g:2515:57: (iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF )
            // InternalDem.g:2516:2: iv_ruleDmxOpSingleAssign= ruleDmxOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOpSingleAssign=ruleDmxOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOpSingleAssign.getText(); 
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
    // $ANTLR end "entryRuleDmxOpSingleAssign"


    // $ANTLR start "ruleDmxOpSingleAssign"
    // InternalDem.g:2522:1: ruleDmxOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':=' ;
    public final AntlrDatatypeRuleToken ruleDmxOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:2528:2: (kw= ':=' )
            // InternalDem.g:2529:2: kw= ':='
            {
            kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDmxOpSingleAssignAccess().getColonEqualsSignKeyword());
              	
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
    // $ANTLR end "ruleDmxOpSingleAssign"


    // $ANTLR start "entryRuleDmxPredicateWithCorrelationVariable"
    // InternalDem.g:2537:1: entryRuleDmxPredicateWithCorrelationVariable returns [EObject current=null] : iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF ;
    public final EObject entryRuleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPredicateWithCorrelationVariable = null;


        try {
            // InternalDem.g:2537:76: (iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF )
            // InternalDem.g:2538:2: iv_ruleDmxPredicateWithCorrelationVariable= ruleDmxPredicateWithCorrelationVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxPredicateWithCorrelationVariable=ruleDmxPredicateWithCorrelationVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxPredicateWithCorrelationVariable; 
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
    // $ANTLR end "entryRuleDmxPredicateWithCorrelationVariable"


    // $ANTLR start "ruleDmxPredicateWithCorrelationVariable"
    // InternalDem.g:2544:1: ruleDmxPredicateWithCorrelationVariable returns [EObject current=null] : ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) ;
    public final EObject ruleDmxPredicateWithCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_correlationVariable_1_0 = null;

        EObject lv_predicate_3_0 = null;

        EObject this_DmxOrExpression_4 = null;



        	enterRule();

        try {
            // InternalDem.g:2550:2: ( ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression ) )
            // InternalDem.g:2551:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            {
            // InternalDem.g:2551:2: ( ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) ) | this_DmxOrExpression_4= ruleDmxOrExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||(LA50_1>=RULE_ID && LA50_1<=RULE_PLAIN_TEXT_END)||(LA50_1>=26 && LA50_1<=29)||LA50_1==35||(LA50_1>=39 && LA50_1<=42)||(LA50_1>=47 && LA50_1<=49)||(LA50_1>=52 && LA50_1<=54)||(LA50_1>=62 && LA50_1<=65)||(LA50_1>=74 && LA50_1<=75)||(LA50_1>=88 && LA50_1<=108)) ) {
                    alt50=2;
                }
                else if ( (LA50_1==51) ) {
                    alt50=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA50_0>=RULE_NATURAL && LA50_0<=RULE_STRING)||LA50_0==20||LA50_0==41||(LA50_0>=55 && LA50_0<=57)||LA50_0==61||(LA50_0>=66 && LA50_0<=71)||(LA50_0>=74 && LA50_0<=75)||(LA50_0>=109 && LA50_0<=111)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalDem.g:2552:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    {
                    // InternalDem.g:2552:3: ( () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) ) )
                    // InternalDem.g:2553:4: () ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) ) otherlv_2= '|' ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    {
                    // InternalDem.g:2553:4: ()
                    // InternalDem.g:2554:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxPredicateWithCorrelationVariableAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:2560:4: ( (lv_correlationVariable_1_0= ruleDmxCorrelationVariable ) )
                    // InternalDem.g:2561:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    {
                    // InternalDem.g:2561:5: (lv_correlationVariable_1_0= ruleDmxCorrelationVariable )
                    // InternalDem.g:2562:6: lv_correlationVariable_1_0= ruleDmxCorrelationVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableDmxCorrelationVariableParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_correlationVariable_1_0=ruleDmxCorrelationVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxPredicateWithCorrelationVariableRule());
                      						}
                      						set(
                      							current,
                      							"correlationVariable",
                      							lv_correlationVariable_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxCorrelationVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,51,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getVerticalLineKeyword_0_2());
                      			
                    }
                    // InternalDem.g:2583:4: ( (lv_predicate_3_0= ruleDmxOrExpression ) )
                    // InternalDem.g:2584:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    {
                    // InternalDem.g:2584:5: (lv_predicate_3_0= ruleDmxOrExpression )
                    // InternalDem.g:2585:6: lv_predicate_3_0= ruleDmxOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getPredicateDmxOrExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_predicate_3_0=ruleDmxOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxPredicateWithCorrelationVariableRule());
                      						}
                      						set(
                      							current,
                      							"predicate",
                      							lv_predicate_3_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxOrExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:2604:3: this_DmxOrExpression_4= ruleDmxOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getDmxOrExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxOrExpression_4=ruleDmxOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxOrExpression_4;
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
    // $ANTLR end "ruleDmxPredicateWithCorrelationVariable"


    // $ANTLR start "entryRuleDmxCorrelationVariable"
    // InternalDem.g:2616:1: entryRuleDmxCorrelationVariable returns [EObject current=null] : iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF ;
    public final EObject entryRuleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCorrelationVariable = null;


        try {
            // InternalDem.g:2616:63: (iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF )
            // InternalDem.g:2617:2: iv_ruleDmxCorrelationVariable= ruleDmxCorrelationVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxCorrelationVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxCorrelationVariable=ruleDmxCorrelationVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxCorrelationVariable; 
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
    // $ANTLR end "entryRuleDmxCorrelationVariable"


    // $ANTLR start "ruleDmxCorrelationVariable"
    // InternalDem.g:2623:1: ruleDmxCorrelationVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDmxCorrelationVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDem.g:2629:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDem.g:2630:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDem.g:2630:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDem.g:2631:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDem.g:2631:3: (lv_name_0_0= RULE_ID )
            // InternalDem.g:2632:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDmxCorrelationVariableAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDmxCorrelationVariableRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"com.mimacom.ddd.dm.dmx.Dmx.ID");
              			
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
    // $ANTLR end "ruleDmxCorrelationVariable"


    // $ANTLR start "entryRuleDmxOrExpression"
    // InternalDem.g:2651:1: entryRuleDmxOrExpression returns [EObject current=null] : iv_ruleDmxOrExpression= ruleDmxOrExpression EOF ;
    public final EObject entryRuleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOrExpression = null;


        try {
            // InternalDem.g:2651:56: (iv_ruleDmxOrExpression= ruleDmxOrExpression EOF )
            // InternalDem.g:2652:2: iv_ruleDmxOrExpression= ruleDmxOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOrExpression=ruleDmxOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOrExpression; 
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
    // $ANTLR end "entryRuleDmxOrExpression"


    // $ANTLR start "ruleDmxOrExpression"
    // InternalDem.g:2658:1: ruleDmxOrExpression returns [EObject current=null] : (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) ;
    public final EObject ruleDmxOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2664:2: ( (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* ) )
            // InternalDem.g:2665:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            {
            // InternalDem.g:2665:2: (this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )* )
            // InternalDem.g:2666:3: this_DmxAndExpression_0= ruleDmxAndExpression ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getDmxAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_DmxAndExpression_0=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2674:3: ( ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                switch ( input.LA(1) ) {
                case 88:
                    {
                    int LA51_2 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 89:
                    {
                    int LA51_3 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 90:
                    {
                    int LA51_4 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 91:
                    {
                    int LA51_5 = input.LA(2);

                    if ( (synpred4_InternalDem()) ) {
                        alt51=1;
                    }


                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // InternalDem.g:2675:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    {
            	    // InternalDem.g:2675:4: ( ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) ) )
            	    // InternalDem.g:2676:5: ( ( () ( ( ruleDmxOpOr ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    {
            	    // InternalDem.g:2686:5: ( () ( (lv_operator_2_0= ruleDmxOpOr ) ) )
            	    // InternalDem.g:2687:6: () ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    {
            	    // InternalDem.g:2687:6: ()
            	    // InternalDem.g:2688:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2694:6: ( (lv_operator_2_0= ruleDmxOpOr ) )
            	    // InternalDem.g:2695:7: (lv_operator_2_0= ruleDmxOpOr )
            	    {
            	    // InternalDem.g:2695:7: (lv_operator_2_0= ruleDmxOpOr )
            	    // InternalDem.g:2696:8: lv_operator_2_0= ruleDmxOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getOperatorDmxOpOrEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleDmxOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxOrExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.DmxOpOr");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDem.g:2715:4: ( (lv_rightOperand_3_0= ruleDmxAndExpression ) )
            	    // InternalDem.g:2716:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    {
            	    // InternalDem.g:2716:5: (lv_rightOperand_3_0= ruleDmxAndExpression )
            	    // InternalDem.g:2717:6: lv_rightOperand_3_0= ruleDmxAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOrExpressionAccess().getRightOperandDmxAndExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_rightOperand_3_0=ruleDmxAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "ruleDmxOrExpression"


    // $ANTLR start "entryRuleDmxAndExpression"
    // InternalDem.g:2739:1: entryRuleDmxAndExpression returns [EObject current=null] : iv_ruleDmxAndExpression= ruleDmxAndExpression EOF ;
    public final EObject entryRuleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAndExpression = null;


        try {
            // InternalDem.g:2739:57: (iv_ruleDmxAndExpression= ruleDmxAndExpression EOF )
            // InternalDem.g:2740:2: iv_ruleDmxAndExpression= ruleDmxAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxAndExpression=ruleDmxAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxAndExpression; 
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
    // $ANTLR end "entryRuleDmxAndExpression"


    // $ANTLR start "ruleDmxAndExpression"
    // InternalDem.g:2746:1: ruleDmxAndExpression returns [EObject current=null] : (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) ;
    public final EObject ruleDmxAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxEqualityExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2752:2: ( (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* ) )
            // InternalDem.g:2753:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            {
            // InternalDem.g:2753:2: (this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )* )
            // InternalDem.g:2754:3: this_DmxEqualityExpression_0= ruleDmxEqualityExpression ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getDmxEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_DmxEqualityExpression_0=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2762:3: ( ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==92) ) {
                    int LA52_2 = input.LA(2);

                    if ( (synpred5_InternalDem()) ) {
                        alt52=1;
                    }


                }
                else if ( (LA52_0==93) ) {
                    int LA52_3 = input.LA(2);

                    if ( (synpred5_InternalDem()) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalDem.g:2763:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    {
            	    // InternalDem.g:2763:4: ( ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) ) )
            	    // InternalDem.g:2764:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    {
            	    // InternalDem.g:2774:5: ( () ( (lv_operator_2_0= ruleDmxOpAnd ) ) )
            	    // InternalDem.g:2775:6: () ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    {
            	    // InternalDem.g:2775:6: ()
            	    // InternalDem.g:2776:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2782:6: ( (lv_operator_2_0= ruleDmxOpAnd ) )
            	    // InternalDem.g:2783:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    {
            	    // InternalDem.g:2783:7: (lv_operator_2_0= ruleDmxOpAnd )
            	    // InternalDem.g:2784:8: lv_operator_2_0= ruleDmxOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getOperatorDmxOpAndEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleDmxOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxAndExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.DmxOpAnd");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDem.g:2803:4: ( (lv_rightOperand_3_0= ruleDmxEqualityExpression ) )
            	    // InternalDem.g:2804:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    {
            	    // InternalDem.g:2804:5: (lv_rightOperand_3_0= ruleDmxEqualityExpression )
            	    // InternalDem.g:2805:6: lv_rightOperand_3_0= ruleDmxEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAndExpressionAccess().getRightOperandDmxEqualityExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_rightOperand_3_0=ruleDmxEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "ruleDmxAndExpression"


    // $ANTLR start "entryRuleDmxEqualityExpression"
    // InternalDem.g:2827:1: entryRuleDmxEqualityExpression returns [EObject current=null] : iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF ;
    public final EObject entryRuleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxEqualityExpression = null;


        try {
            // InternalDem.g:2827:62: (iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF )
            // InternalDem.g:2828:2: iv_ruleDmxEqualityExpression= ruleDmxEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxEqualityExpression=ruleDmxEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxEqualityExpression; 
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
    // $ANTLR end "entryRuleDmxEqualityExpression"


    // $ANTLR start "ruleDmxEqualityExpression"
    // InternalDem.g:2834:1: ruleDmxEqualityExpression returns [EObject current=null] : (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) ;
    public final EObject ruleDmxEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxRelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2840:2: ( (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* ) )
            // InternalDem.g:2841:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            {
            // InternalDem.g:2841:2: (this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )* )
            // InternalDem.g:2842:3: this_DmxRelationalExpression_0= ruleDmxRelationalExpression ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getDmxRelationalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_DmxRelationalExpression_0=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxRelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2850:3: ( ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) ) )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case 94:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 95:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 96:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred6_InternalDem()) ) {
                        alt53=1;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // InternalDem.g:2851:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    {
            	    // InternalDem.g:2851:4: ( ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) ) )
            	    // InternalDem.g:2852:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )=> ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    {
            	    // InternalDem.g:2862:5: ( () ( (lv_operator_2_0= ruleDmxOpEquality ) ) )
            	    // InternalDem.g:2863:6: () ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    {
            	    // InternalDem.g:2863:6: ()
            	    // InternalDem.g:2864:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:2870:6: ( (lv_operator_2_0= ruleDmxOpEquality ) )
            	    // InternalDem.g:2871:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    {
            	    // InternalDem.g:2871:7: (lv_operator_2_0= ruleDmxOpEquality )
            	    // InternalDem.g:2872:8: lv_operator_2_0= ruleDmxOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getOperatorDmxOpEqualityEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleDmxOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxEqualityExpressionRule());
            	      								}
            	      								set(
            	      									current,
            	      									"operator",
            	      									lv_operator_2_0,
            	      									"com.mimacom.ddd.dm.dmx.Dmx.DmxOpEquality");
            	      								afterParserOrEnumRuleCall();
            	      							
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // InternalDem.g:2891:4: ( (lv_rightOperand_3_0= ruleDmxRelationalExpression ) )
            	    // InternalDem.g:2892:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    {
            	    // InternalDem.g:2892:5: (lv_rightOperand_3_0= ruleDmxRelationalExpression )
            	    // InternalDem.g:2893:6: lv_rightOperand_3_0= ruleDmxRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandDmxRelationalExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_rightOperand_3_0=ruleDmxRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxRelationalExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // $ANTLR end "ruleDmxEqualityExpression"


    // $ANTLR start "entryRuleDmxRelationalExpression"
    // InternalDem.g:2915:1: entryRuleDmxRelationalExpression returns [EObject current=null] : iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF ;
    public final EObject entryRuleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxRelationalExpression = null;


        try {
            // InternalDem.g:2915:64: (iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF )
            // InternalDem.g:2916:2: iv_ruleDmxRelationalExpression= ruleDmxRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxRelationalExpression=ruleDmxRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxRelationalExpression; 
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
    // $ANTLR end "entryRuleDmxRelationalExpression"


    // $ANTLR start "ruleDmxRelationalExpression"
    // InternalDem.g:2922:1: ruleDmxRelationalExpression returns [EObject current=null] : (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleDmxRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxOtherOperatorExpression_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rightOperand_6_0 = null;



        	enterRule();

        try {
            // InternalDem.g:2928:2: ( (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* ) )
            // InternalDem.g:2929:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            {
            // InternalDem.g:2929:2: (this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )* )
            // InternalDem.g:2930:3: this_DmxOtherOperatorExpression_0= ruleDmxOtherOperatorExpression ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOtherOperatorExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_DmxOtherOperatorExpression_0=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxOtherOperatorExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:2938:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*
            loop54:
            do {
                int alt54=3;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalDem.g:2939:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalDem.g:2939:4: ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) )
            	    // InternalDem.g:2940:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDem.g:2940:5: ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) )
            	    // InternalDem.g:2941:6: ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf )
            	    {
            	    // InternalDem.g:2947:6: ( () ruleDmxOpInstanceOf )
            	    // InternalDem.g:2948:7: () ruleDmxOpInstanceOf
            	    {
            	    // InternalDem.g:2948:7: ()
            	    // InternalDem.g:2949:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getDmxOpInstanceOfParserRuleCall_1_0_0_0_1());
            	      						
            	    }
            	    pushFollow(FOLLOW_4);
            	    ruleDmxOpInstanceOf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalDem.g:2964:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalDem.g:2965:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDem.g:2965:6: (otherlv_3= RULE_ID )
            	    // InternalDem.g:2966:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getDmxRelationalExpressionAccess().getTypeDTypeCrossReference_1_0_1_0());
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDem.g:2979:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    {
            	    // InternalDem.g:2979:4: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) )
            	    // InternalDem.g:2980:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    {
            	    // InternalDem.g:2980:5: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) )
            	    // InternalDem.g:2981:6: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    {
            	    // InternalDem.g:2991:6: ( () ( (lv_operator_5_0= ruleOpCompare ) ) )
            	    // InternalDem.g:2992:7: () ( (lv_operator_5_0= ruleOpCompare ) )
            	    {
            	    // InternalDem.g:2992:7: ()
            	    // InternalDem.g:2993:8: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      								current = forceCreateModelElementAndSet(
            	      									grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	      									current);
            	      							
            	    }

            	    }

            	    // InternalDem.g:2999:7: ( (lv_operator_5_0= ruleOpCompare ) )
            	    // InternalDem.g:3000:8: (lv_operator_5_0= ruleOpCompare )
            	    {
            	    // InternalDem.g:3000:8: (lv_operator_5_0= ruleOpCompare )
            	    // InternalDem.g:3001:9: lv_operator_5_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      									newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getOperatorOpCompareEnumRuleCall_1_1_0_0_1_0());
            	      								
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_5_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									if (current==null) {
            	      										current = createModelElementForParent(grammarAccess.getDmxRelationalExpressionRule());
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

            	    // InternalDem.g:3020:5: ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) )
            	    // InternalDem.g:3021:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    {
            	    // InternalDem.g:3021:6: (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression )
            	    // InternalDem.g:3022:7: lv_rightOperand_6_0= ruleDmxOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandDmxOtherOperatorExpressionParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_rightOperand_6_0=ruleDmxOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getDmxRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rightOperand",
            	      								lv_rightOperand_6_0,
            	      								"com.mimacom.ddd.dm.dmx.Dmx.DmxOtherOperatorExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // $ANTLR end "ruleDmxRelationalExpression"


    // $ANTLR start "entryRuleDmxOpInstanceOf"
    // InternalDem.g:3045:1: entryRuleDmxOpInstanceOf returns [String current=null] : iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF ;
    public final String entryRuleDmxOpInstanceOf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpInstanceOf = null;


        try {
            // InternalDem.g:3045:55: (iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF )
            // InternalDem.g:3046:2: iv_ruleDmxOpInstanceOf= ruleDmxOpInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOpInstanceOfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOpInstanceOf=ruleDmxOpInstanceOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOpInstanceOf.getText(); 
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
    // $ANTLR end "entryRuleDmxOpInstanceOf"


    // $ANTLR start "ruleDmxOpInstanceOf"
    // InternalDem.g:3052:1: ruleDmxOpInstanceOf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ISA' | kw= 'isa' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpInstanceOf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3058:2: ( (kw= 'ISA' | kw= 'isa' ) )
            // InternalDem.g:3059:2: (kw= 'ISA' | kw= 'isa' )
            {
            // InternalDem.g:3059:2: (kw= 'ISA' | kw= 'isa' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            else if ( (LA55_0==53) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalDem.g:3060:3: kw= 'ISA'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getISAKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3066:3: kw= 'isa'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpInstanceOfAccess().getIsaKeyword_1());
                      		
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
    // $ANTLR end "ruleDmxOpInstanceOf"


    // $ANTLR start "entryRuleDmxOtherOperatorExpression"
    // InternalDem.g:3075:1: entryRuleDmxOtherOperatorExpression returns [EObject current=null] : iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF ;
    public final EObject entryRuleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxOtherOperatorExpression = null;


        try {
            // InternalDem.g:3075:67: (iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF )
            // InternalDem.g:3076:2: iv_ruleDmxOtherOperatorExpression= ruleDmxOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOtherOperatorExpression=ruleDmxOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOtherOperatorExpression; 
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
    // $ANTLR end "entryRuleDmxOtherOperatorExpression"


    // $ANTLR start "ruleDmxOtherOperatorExpression"
    // InternalDem.g:3082:1: ruleDmxOtherOperatorExpression returns [EObject current=null] : (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) ;
    public final EObject ruleDmxOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxAdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3088:2: ( (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* ) )
            // InternalDem.g:3089:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            {
            // InternalDem.g:3089:2: (this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )* )
            // InternalDem.g:3090:3: this_DmxAdditiveExpression_0= ruleDmxAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_DmxAdditiveExpression_0=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3098:3: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    int LA56_2 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA56_3 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA56_4 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case 104:
                    {
                    int LA56_5 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case 105:
                    {
                    int LA56_6 = input.LA(2);

                    if ( (synpred9_InternalDem()) ) {
                        alt56=1;
                    }


                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // InternalDem.g:3099:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    {
            	    // InternalDem.g:3099:4: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) ) )
            	    // InternalDem.g:3100:5: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    {
            	    // InternalDem.g:3110:5: ( () ( (lv_operator_2_0= ruleOpOther ) ) )
            	    // InternalDem.g:3111:6: () ( (lv_operator_2_0= ruleOpOther ) )
            	    {
            	    // InternalDem.g:3111:6: ()
            	    // InternalDem.g:3112:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3118:6: ( (lv_operator_2_0= ruleOpOther ) )
            	    // InternalDem.g:3119:7: (lv_operator_2_0= ruleOpOther )
            	    {
            	    // InternalDem.g:3119:7: (lv_operator_2_0= ruleOpOther )
            	    // InternalDem.g:3120:8: lv_operator_2_0= ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorOpOtherEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxOtherOperatorExpressionRule());
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

            	    // InternalDem.g:3139:4: ( (lv_rightOperand_3_0= ruleDmxAdditiveExpression ) )
            	    // InternalDem.g:3140:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    {
            	    // InternalDem.g:3140:5: (lv_rightOperand_3_0= ruleDmxAdditiveExpression )
            	    // InternalDem.g:3141:6: lv_rightOperand_3_0= ruleDmxAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandDmxAdditiveExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_rightOperand_3_0=ruleDmxAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxOtherOperatorExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleDmxOtherOperatorExpression"


    // $ANTLR start "entryRuleDmxAdditiveExpression"
    // InternalDem.g:3163:1: entryRuleDmxAdditiveExpression returns [EObject current=null] : iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF ;
    public final EObject entryRuleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxAdditiveExpression = null;


        try {
            // InternalDem.g:3163:62: (iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF )
            // InternalDem.g:3164:2: iv_ruleDmxAdditiveExpression= ruleDmxAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxAdditiveExpression=ruleDmxAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxAdditiveExpression; 
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
    // $ANTLR end "entryRuleDmxAdditiveExpression"


    // $ANTLR start "ruleDmxAdditiveExpression"
    // InternalDem.g:3170:1: ruleDmxAdditiveExpression returns [EObject current=null] : (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleDmxAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxMultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3176:2: ( (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* ) )
            // InternalDem.g:3177:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            {
            // InternalDem.g:3177:2: (this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )* )
            // InternalDem.g:3178:3: this_DmxMultiplicativeExpression_0= ruleDmxMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getDmxMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_DmxMultiplicativeExpression_0=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3186:3: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==74) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred10_InternalDem()) ) {
                        alt57=1;
                    }


                }
                else if ( (LA57_0==75) ) {
                    int LA57_3 = input.LA(2);

                    if ( (synpred10_InternalDem()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // InternalDem.g:3187:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    {
            	    // InternalDem.g:3187:4: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) ) )
            	    // InternalDem.g:3188:5: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    {
            	    // InternalDem.g:3198:5: ( () ( (lv_operator_2_0= ruleOpAdd ) ) )
            	    // InternalDem.g:3199:6: () ( (lv_operator_2_0= ruleOpAdd ) )
            	    {
            	    // InternalDem.g:3199:6: ()
            	    // InternalDem.g:3200:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3206:6: ( (lv_operator_2_0= ruleOpAdd ) )
            	    // InternalDem.g:3207:7: (lv_operator_2_0= ruleOpAdd )
            	    {
            	    // InternalDem.g:3207:7: (lv_operator_2_0= ruleOpAdd )
            	    // InternalDem.g:3208:8: lv_operator_2_0= ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorOpAddEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxAdditiveExpressionRule());
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

            	    // InternalDem.g:3227:4: ( (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression ) )
            	    // InternalDem.g:3228:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    {
            	    // InternalDem.g:3228:5: (lv_rightOperand_3_0= ruleDmxMultiplicativeExpression )
            	    // InternalDem.g:3229:6: lv_rightOperand_3_0= ruleDmxMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandDmxMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_rightOperand_3_0=ruleDmxMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxMultiplicativeExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleDmxAdditiveExpression"


    // $ANTLR start "entryRuleDmxMultiplicativeExpression"
    // InternalDem.g:3251:1: entryRuleDmxMultiplicativeExpression returns [EObject current=null] : iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF ;
    public final EObject entryRuleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxMultiplicativeExpression = null;


        try {
            // InternalDem.g:3251:68: (iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF )
            // InternalDem.g:3252:2: iv_ruleDmxMultiplicativeExpression= ruleDmxMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxMultiplicativeExpression=ruleDmxMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleDmxMultiplicativeExpression"


    // $ANTLR start "ruleDmxMultiplicativeExpression"
    // InternalDem.g:3258:1: ruleDmxMultiplicativeExpression returns [EObject current=null] : (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) ;
    public final EObject ruleDmxMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxUnaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3264:2: ( (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* ) )
            // InternalDem.g:3265:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            {
            // InternalDem.g:3265:2: (this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )* )
            // InternalDem.g:3266:3: this_DmxUnaryOperation_0= ruleDmxUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxUnaryOperationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_DmxUnaryOperation_0=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxUnaryOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3274:3: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) ) )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case 47:
                    {
                    int LA58_2 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 106:
                    {
                    int LA58_3 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 107:
                    {
                    int LA58_4 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case 108:
                    {
                    int LA58_5 = input.LA(2);

                    if ( (synpred11_InternalDem()) ) {
                        alt58=1;
                    }


                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // InternalDem.g:3275:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    {
            	    // InternalDem.g:3275:4: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) ) )
            	    // InternalDem.g:3276:5: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    {
            	    // InternalDem.g:3286:5: ( () ( (lv_operator_2_0= ruleOpMulti ) ) )
            	    // InternalDem.g:3287:6: () ( (lv_operator_2_0= ruleOpMulti ) )
            	    {
            	    // InternalDem.g:3287:6: ()
            	    // InternalDem.g:3288:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    // InternalDem.g:3294:6: ( (lv_operator_2_0= ruleOpMulti ) )
            	    // InternalDem.g:3295:7: (lv_operator_2_0= ruleOpMulti )
            	    {
            	    // InternalDem.g:3295:7: (lv_operator_2_0= ruleOpMulti )
            	    // InternalDem.g:3296:8: lv_operator_2_0= ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      								newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorOpMultiEnumRuleCall_1_0_0_1_0());
            	      							
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_operator_2_0=ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								if (current==null) {
            	      									current = createModelElementForParent(grammarAccess.getDmxMultiplicativeExpressionRule());
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

            	    // InternalDem.g:3315:4: ( (lv_rightOperand_3_0= ruleDmxUnaryOperation ) )
            	    // InternalDem.g:3316:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    {
            	    // InternalDem.g:3316:5: (lv_rightOperand_3_0= ruleDmxUnaryOperation )
            	    // InternalDem.g:3317:6: lv_rightOperand_3_0= ruleDmxUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandDmxUnaryOperationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_rightOperand_3_0=ruleDmxUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDmxMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rightOperand",
            	      							lv_rightOperand_3_0,
            	      							"com.mimacom.ddd.dm.dmx.Dmx.DmxUnaryOperation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleDmxMultiplicativeExpression"


    // $ANTLR start "entryRuleDmxUnaryOperation"
    // InternalDem.g:3339:1: entryRuleDmxUnaryOperation returns [EObject current=null] : iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF ;
    public final EObject entryRuleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUnaryOperation = null;


        try {
            // InternalDem.g:3339:58: (iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF )
            // InternalDem.g:3340:2: iv_ruleDmxUnaryOperation= ruleDmxUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxUnaryOperation=ruleDmxUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxUnaryOperation; 
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
    // $ANTLR end "entryRuleDmxUnaryOperation"


    // $ANTLR start "ruleDmxUnaryOperation"
    // InternalDem.g:3346:1: ruleDmxUnaryOperation returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) ;
    public final EObject ruleDmxUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_operand_2_0 = null;

        EObject this_DmxCastExpression_3 = null;



        	enterRule();

        try {
            // InternalDem.g:3352:2: ( ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression ) )
            // InternalDem.g:3353:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            {
            // InternalDem.g:3353:2: ( ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) ) | this_DmxCastExpression_3= ruleDmxCastExpression )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=74 && LA59_0<=75)||(LA59_0>=109 && LA59_0<=111)) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID||(LA59_0>=RULE_NATURAL && LA59_0<=RULE_STRING)||LA59_0==20||LA59_0==41||(LA59_0>=55 && LA59_0<=57)||LA59_0==61||(LA59_0>=66 && LA59_0<=71)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalDem.g:3354:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    {
                    // InternalDem.g:3354:3: ( () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) ) )
                    // InternalDem.g:3355:4: () ( (lv_operator_1_0= ruleOpUnary ) ) ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    {
                    // InternalDem.g:3355:4: ()
                    // InternalDem.g:3356:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getDmxUnaryOperationAccess().getDmxUnaryOperationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalDem.g:3362:4: ( (lv_operator_1_0= ruleOpUnary ) )
                    // InternalDem.g:3363:5: (lv_operator_1_0= ruleOpUnary )
                    {
                    // InternalDem.g:3363:5: (lv_operator_1_0= ruleOpUnary )
                    // InternalDem.g:3364:6: lv_operator_1_0= ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperatorOpUnaryEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_operator_1_0=ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxUnaryOperationRule());
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

                    // InternalDem.g:3381:4: ( (lv_operand_2_0= ruleDmxUnaryOperation ) )
                    // InternalDem.g:3382:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    {
                    // InternalDem.g:3382:5: (lv_operand_2_0= ruleDmxUnaryOperation )
                    // InternalDem.g:3383:6: lv_operand_2_0= ruleDmxUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getOperandDmxUnaryOperationParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleDmxUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxUnaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operand",
                      							lv_operand_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxUnaryOperation");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:3402:3: this_DmxCastExpression_3= ruleDmxCastExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxUnaryOperationAccess().getDmxCastExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxCastExpression_3=ruleDmxCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxCastExpression_3;
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
    // $ANTLR end "ruleDmxUnaryOperation"


    // $ANTLR start "entryRuleDmxCastExpression"
    // InternalDem.g:3414:1: entryRuleDmxCastExpression returns [EObject current=null] : iv_ruleDmxCastExpression= ruleDmxCastExpression EOF ;
    public final EObject entryRuleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxCastExpression = null;


        try {
            // InternalDem.g:3414:58: (iv_ruleDmxCastExpression= ruleDmxCastExpression EOF )
            // InternalDem.g:3415:2: iv_ruleDmxCastExpression= ruleDmxCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxCastExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxCastExpression=ruleDmxCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxCastExpression; 
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
    // $ANTLR end "entryRuleDmxCastExpression"


    // $ANTLR start "ruleDmxCastExpression"
    // InternalDem.g:3421:1: ruleDmxCastExpression returns [EObject current=null] : (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) ;
    public final EObject ruleDmxCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_DmxNavigableMemberReference_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3427:2: ( (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? ) )
            // InternalDem.g:3428:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            {
            // InternalDem.g:3428:2: (this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )? )
            // InternalDem.g:3429:3: this_DmxNavigableMemberReference_0= ruleDmxNavigableMemberReference ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxNavigableMemberReferenceParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_59);
            this_DmxNavigableMemberReference_0=ruleDmxNavigableMemberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DmxNavigableMemberReference_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3437:3: ( ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                int LA60_1 = input.LA(2);

                if ( (synpred12_InternalDem()) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==35) ) {
                int LA60_2 = input.LA(2);

                if ( (synpred12_InternalDem()) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // InternalDem.g:3438:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalDem.g:3438:4: ( ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast ) )
                    // InternalDem.g:3439:5: ( ( () ruleDmxOpCast ) )=> ( () ruleDmxOpCast )
                    {
                    // InternalDem.g:3445:5: ( () ruleDmxOpCast )
                    // InternalDem.g:3446:6: () ruleDmxOpCast
                    {
                    // InternalDem.g:3446:6: ()
                    // InternalDem.g:3447:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getDmxCastExpressionAccess().getDmxCastExpressionTargetAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxCastExpressionAccess().getDmxOpCastParserRuleCall_1_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    ruleDmxOpCast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:3462:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDem.g:3463:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDem.g:3463:5: (otherlv_3= RULE_ID )
                    // InternalDem.g:3464:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxCastExpressionRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getDmxCastExpressionAccess().getTypeDTypeCrossReference_1_1_0());
                      					
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
    // $ANTLR end "ruleDmxCastExpression"


    // $ANTLR start "entryRuleDmxOpCast"
    // InternalDem.g:3480:1: entryRuleDmxOpCast returns [String current=null] : iv_ruleDmxOpCast= ruleDmxOpCast EOF ;
    public final String entryRuleDmxOpCast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpCast = null;


        try {
            // InternalDem.g:3480:49: (iv_ruleDmxOpCast= ruleDmxOpCast EOF )
            // InternalDem.g:3481:2: iv_ruleDmxOpCast= ruleDmxOpCast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOpCastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOpCast=ruleDmxOpCast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOpCast.getText(); 
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
    // $ANTLR end "entryRuleDmxOpCast"


    // $ANTLR start "ruleDmxOpCast"
    // InternalDem.g:3487:1: ruleDmxOpCast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' | kw= 'as' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpCast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:3493:2: ( (kw= 'AS' | kw= 'as' ) )
            // InternalDem.g:3494:2: (kw= 'AS' | kw= 'as' )
            {
            // InternalDem.g:3494:2: (kw= 'AS' | kw= 'as' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            else if ( (LA61_0==35) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDem.g:3495:3: kw= 'AS'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getASKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3501:3: kw= 'as'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpCastAccess().getAsKeyword_1());
                      		
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
    // $ANTLR end "ruleDmxOpCast"


    // $ANTLR start "entryRuleDmxPrimaryExpression"
    // InternalDem.g:3510:1: entryRuleDmxPrimaryExpression returns [EObject current=null] : iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF ;
    public final EObject entryRuleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxPrimaryExpression = null;


        try {
            // InternalDem.g:3510:61: (iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF )
            // InternalDem.g:3511:2: iv_ruleDmxPrimaryExpression= ruleDmxPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxPrimaryExpression=ruleDmxPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxPrimaryExpression; 
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
    // $ANTLR end "entryRuleDmxPrimaryExpression"


    // $ANTLR start "ruleDmxPrimaryExpression"
    // InternalDem.g:3517:1: ruleDmxPrimaryExpression returns [EObject current=null] : (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxConstructorCall_4= ruleDmxConstructorCall | this_DmxStaticReference_5= ruleDmxStaticReference | this_DmxContextReference_6= ruleDmxContextReference | this_DmxIfExpression_7= ruleDmxIfExpression ) ;
    public final EObject ruleDmxPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxLiteralExpression_0 = null;

        EObject this_DmxParenthesizedExpression_1 = null;

        EObject this_DmxListExpression_2 = null;

        EObject this_DmxFunctionCall_3 = null;

        EObject this_DmxConstructorCall_4 = null;

        EObject this_DmxStaticReference_5 = null;

        EObject this_DmxContextReference_6 = null;

        EObject this_DmxIfExpression_7 = null;



        	enterRule();

        try {
            // InternalDem.g:3523:2: ( (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxConstructorCall_4= ruleDmxConstructorCall | this_DmxStaticReference_5= ruleDmxStaticReference | this_DmxContextReference_6= ruleDmxContextReference | this_DmxIfExpression_7= ruleDmxIfExpression ) )
            // InternalDem.g:3524:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxConstructorCall_4= ruleDmxConstructorCall | this_DmxStaticReference_5= ruleDmxStaticReference | this_DmxContextReference_6= ruleDmxContextReference | this_DmxIfExpression_7= ruleDmxIfExpression )
            {
            // InternalDem.g:3524:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxConstructorCall_4= ruleDmxConstructorCall | this_DmxStaticReference_5= ruleDmxStaticReference | this_DmxContextReference_6= ruleDmxContextReference | this_DmxIfExpression_7= ruleDmxIfExpression )
            int alt62=8;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalDem.g:3525:3: this_DmxLiteralExpression_0= ruleDmxLiteralExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxLiteralExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxLiteralExpression_0=ruleDmxLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxLiteralExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3534:3: this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxParenthesizedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxParenthesizedExpression_1=ruleDmxParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxParenthesizedExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDem.g:3543:3: this_DmxListExpression_2= ruleDmxListExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxListExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxListExpression_2=ruleDmxListExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxListExpression_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDem.g:3552:3: this_DmxFunctionCall_3= ruleDmxFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxFunctionCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxFunctionCall_3=ruleDmxFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxFunctionCall_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDem.g:3561:3: this_DmxConstructorCall_4= ruleDmxConstructorCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxConstructorCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxConstructorCall_4=ruleDmxConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxConstructorCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalDem.g:3570:3: this_DmxStaticReference_5= ruleDmxStaticReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxStaticReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxStaticReference_5=ruleDmxStaticReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxStaticReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalDem.g:3579:3: this_DmxContextReference_6= ruleDmxContextReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxContextReferenceParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxContextReference_6=ruleDmxContextReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxContextReference_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalDem.g:3588:3: this_DmxIfExpression_7= ruleDmxIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxPrimaryExpressionAccess().getDmxIfExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxIfExpression_7=ruleDmxIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxIfExpression_7;
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
    // $ANTLR end "ruleDmxPrimaryExpression"


    // $ANTLR start "entryRuleDmxLiteralExpression"
    // InternalDem.g:3600:1: entryRuleDmxLiteralExpression returns [EObject current=null] : iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF ;
    public final EObject entryRuleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxLiteralExpression = null;


        try {
            // InternalDem.g:3600:61: (iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF )
            // InternalDem.g:3601:2: iv_ruleDmxLiteralExpression= ruleDmxLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxLiteralExpression=ruleDmxLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxLiteralExpression; 
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
    // $ANTLR end "entryRuleDmxLiteralExpression"


    // $ANTLR start "ruleDmxLiteralExpression"
    // InternalDem.g:3607:1: ruleDmxLiteralExpression returns [EObject current=null] : (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) ;
    public final EObject ruleDmxLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DmxBooleanLiteral_0 = null;

        EObject this_DmxStringLiteral_1 = null;

        EObject this_DmxNaturalLiteral_2 = null;

        EObject this_DmxDecimalLiteral_3 = null;

        EObject this_DmxUndefinedLiteral_4 = null;



        	enterRule();

        try {
            // InternalDem.g:3613:2: ( (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral ) )
            // InternalDem.g:3614:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            {
            // InternalDem.g:3614:2: (this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral | this_DmxStringLiteral_1= ruleDmxStringLiteral | this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral | this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral | this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 66:
            case 67:
            case 68:
            case 69:
                {
                alt63=1;
                }
                break;
            case RULE_STRING:
                {
                alt63=2;
                }
                break;
            case RULE_NATURAL:
                {
                int LA63_3 = input.LA(2);

                if ( (LA63_3==48) ) {
                    int LA63_5 = input.LA(3);

                    if ( (LA63_5==RULE_NATURAL) ) {
                        alt63=4;
                    }
                    else if ( (LA63_5==RULE_ID) ) {
                        alt63=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA63_3==EOF||(LA63_3>=RULE_ID && LA63_3<=RULE_PLAIN_TEXT_END)||(LA63_3>=26 && LA63_3<=29)||LA63_3==35||(LA63_3>=39 && LA63_3<=40)||LA63_3==42||LA63_3==47||(LA63_3>=52 && LA63_3<=54)||(LA63_3>=62 && LA63_3<=65)||(LA63_3>=74 && LA63_3<=75)||(LA63_3>=88 && LA63_3<=108)) ) {
                    alt63=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 3, input);

                    throw nvae;
                }
                }
                break;
            case 70:
            case 71:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalDem.g:3615:3: this_DmxBooleanLiteral_0= ruleDmxBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxBooleanLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxBooleanLiteral_0=ruleDmxBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxBooleanLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:3624:3: this_DmxStringLiteral_1= ruleDmxStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxStringLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxStringLiteral_1=ruleDmxStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxStringLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDem.g:3633:3: this_DmxNaturalLiteral_2= ruleDmxNaturalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxNaturalLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxNaturalLiteral_2=ruleDmxNaturalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxNaturalLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDem.g:3642:3: this_DmxDecimalLiteral_3= ruleDmxDecimalLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxDecimalLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxDecimalLiteral_3=ruleDmxDecimalLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxDecimalLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDem.g:3651:3: this_DmxUndefinedLiteral_4= ruleDmxUndefinedLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDmxLiteralExpressionAccess().getDmxUndefinedLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DmxUndefinedLiteral_4=ruleDmxUndefinedLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DmxUndefinedLiteral_4;
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
    // $ANTLR end "ruleDmxLiteralExpression"


    // $ANTLR start "entryRuleDmxParenthesizedExpression"
    // InternalDem.g:3663:1: entryRuleDmxParenthesizedExpression returns [EObject current=null] : iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF ;
    public final EObject entryRuleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxParenthesizedExpression = null;


        try {
            // InternalDem.g:3663:67: (iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF )
            // InternalDem.g:3664:2: iv_ruleDmxParenthesizedExpression= ruleDmxParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxParenthesizedExpression=ruleDmxParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxParenthesizedExpression; 
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
    // $ANTLR end "entryRuleDmxParenthesizedExpression"


    // $ANTLR start "ruleDmxParenthesizedExpression"
    // InternalDem.g:3670:1: ruleDmxParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) ;
    public final EObject ruleDmxParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_DExpression_1 = null;



        	enterRule();

        try {
            // InternalDem.g:3676:2: ( (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' ) )
            // InternalDem.g:3677:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            {
            // InternalDem.g:3677:2: (otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')' )
            // InternalDem.g:3678:3: otherlv_0= '(' this_DExpression_1= ruleDExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDmxParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxParenthesizedExpressionAccess().getDExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_49);
            this_DExpression_1=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DExpression_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleDmxParenthesizedExpression"


    // $ANTLR start "entryRuleDmxListExpression"
    // InternalDem.g:3698:1: entryRuleDmxListExpression returns [EObject current=null] : iv_ruleDmxListExpression= ruleDmxListExpression EOF ;
    public final EObject entryRuleDmxListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxListExpression = null;


        try {
            // InternalDem.g:3698:58: (iv_ruleDmxListExpression= ruleDmxListExpression EOF )
            // InternalDem.g:3699:2: iv_ruleDmxListExpression= ruleDmxListExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxListExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxListExpression=ruleDmxListExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxListExpression; 
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
    // $ANTLR end "entryRuleDmxListExpression"


    // $ANTLR start "ruleDmxListExpression"
    // InternalDem.g:3705:1: ruleDmxListExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleDmxListExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3711:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalDem.g:3712:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalDem.g:3712:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}' )
            // InternalDem.g:3713:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalDem.g:3713:3: ()
            // InternalDem.g:3714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxListExpressionAccess().getDmxListExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxListExpressionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalDem.g:3724:3: ( ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_PLAIN_TEXT_START)||(LA65_0>=RULE_NATURAL && LA65_0<=RULE_STRING)||LA65_0==20||LA65_0==41||(LA65_0>=55 && LA65_0<=57)||LA65_0==61||(LA65_0>=66 && LA65_0<=71)||(LA65_0>=74 && LA65_0<=75)||(LA65_0>=109 && LA65_0<=111)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDem.g:3725:4: ( (lv_elements_2_0= ruleDExpression ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    {
                    // InternalDem.g:3725:4: ( (lv_elements_2_0= ruleDExpression ) )
                    // InternalDem.g:3726:5: (lv_elements_2_0= ruleDExpression )
                    {
                    // InternalDem.g:3726:5: (lv_elements_2_0= ruleDExpression )
                    // InternalDem.g:3727:6: lv_elements_2_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_elements_2_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxListExpressionRule());
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

                    // InternalDem.g:3744:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==39) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalDem.g:3745:5: otherlv_3= ',' ( (lv_elements_4_0= ruleDExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getDmxListExpressionAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:3749:5: ( (lv_elements_4_0= ruleDExpression ) )
                    	    // InternalDem.g:3750:6: (lv_elements_4_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:3750:6: (lv_elements_4_0= ruleDExpression )
                    	    // InternalDem.g:3751:7: lv_elements_4_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxListExpressionAccess().getElementsDExpressionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_elements_4_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxListExpressionRule());
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDmxListExpressionAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleDmxListExpression"


    // $ANTLR start "entryRuleDmxFunctionCall"
    // InternalDem.g:3778:1: entryRuleDmxFunctionCall returns [EObject current=null] : iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF ;
    public final EObject entryRuleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCall = null;


        try {
            // InternalDem.g:3778:56: (iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF )
            // InternalDem.g:3779:2: iv_ruleDmxFunctionCall= ruleDmxFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFunctionCall=ruleDmxFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFunctionCall; 
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
    // $ANTLR end "entryRuleDmxFunctionCall"


    // $ANTLR start "ruleDmxFunctionCall"
    // InternalDem.g:3785:1: ruleDmxFunctionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) ;
    public final EObject ruleDmxFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_callArguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3791:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' ) )
            // InternalDem.g:3792:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            {
            // InternalDem.g:3792:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')' )
            // InternalDem.g:3793:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) ) otherlv_4= ')'
            {
            // InternalDem.g:3793:3: ()
            // InternalDem.g:3794:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallAccess().getDmxFunctionCallAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3800:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:3801:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:3801:4: (otherlv_1= RULE_ID )
            // InternalDem.g:3802:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxFunctionCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxFunctionCallAccess().getFunctionDmxFilterCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalDem.g:3817:3: ( (lv_callArguments_3_0= ruleDmxFunctionCallArguments ) )
            // InternalDem.g:3818:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            {
            // InternalDem.g:3818:4: (lv_callArguments_3_0= ruleDmxFunctionCallArguments )
            // InternalDem.g:3819:5: lv_callArguments_3_0= ruleDmxFunctionCallArguments
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_49);
            lv_callArguments_3_0=ruleDmxFunctionCallArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxFunctionCallRule());
              					}
              					set(
              						current,
              						"callArguments",
              						lv_callArguments_3_0,
              						"com.mimacom.ddd.dm.dmx.Dmx.DmxFunctionCallArguments");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDmxFunctionCallAccess().getRightParenthesisKeyword_4());
              		
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
    // $ANTLR end "ruleDmxFunctionCall"


    // $ANTLR start "entryRuleDmxFunctionCallArguments"
    // InternalDem.g:3844:1: entryRuleDmxFunctionCallArguments returns [EObject current=null] : iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF ;
    public final EObject entryRuleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxFunctionCallArguments = null;


        try {
            // InternalDem.g:3844:65: (iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF )
            // InternalDem.g:3845:2: iv_ruleDmxFunctionCallArguments= ruleDmxFunctionCallArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxFunctionCallArguments=ruleDmxFunctionCallArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxFunctionCallArguments; 
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
    // $ANTLR end "entryRuleDmxFunctionCallArguments"


    // $ANTLR start "ruleDmxFunctionCallArguments"
    // InternalDem.g:3851:1: ruleDmxFunctionCallArguments returns [EObject current=null] : ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) ;
    public final EObject ruleDmxFunctionCallArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3857:2: ( ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? ) )
            // InternalDem.g:3858:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            {
            // InternalDem.g:3858:2: ( () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )? )
            // InternalDem.g:3859:3: () ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            {
            // InternalDem.g:3859:3: ()
            // InternalDem.g:3860:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxFunctionCallArgumentsAccess().getDmxCallArgumentsAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:3866:3: ( ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_PLAIN_TEXT_START)||(LA67_0>=RULE_NATURAL && LA67_0<=RULE_STRING)||LA67_0==20||LA67_0==41||(LA67_0>=55 && LA67_0<=57)||LA67_0==61||(LA67_0>=66 && LA67_0<=71)||(LA67_0>=74 && LA67_0<=75)||(LA67_0>=109 && LA67_0<=111)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDem.g:3867:4: ( (lv_arguments_1_0= ruleDExpression ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    {
                    // InternalDem.g:3867:4: ( (lv_arguments_1_0= ruleDExpression ) )
                    // InternalDem.g:3868:5: (lv_arguments_1_0= ruleDExpression )
                    {
                    // InternalDem.g:3868:5: (lv_arguments_1_0= ruleDExpression )
                    // InternalDem.g:3869:6: lv_arguments_1_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_arguments_1_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxFunctionCallArgumentsRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_1_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalDem.g:3886:4: (otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==39) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalDem.g:3887:5: otherlv_2= ',' ( (lv_arguments_3_0= ruleDExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getDmxFunctionCallArgumentsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalDem.g:3891:5: ( (lv_arguments_3_0= ruleDExpression ) )
                    	    // InternalDem.g:3892:6: (lv_arguments_3_0= ruleDExpression )
                    	    {
                    	    // InternalDem.g:3892:6: (lv_arguments_3_0= ruleDExpression )
                    	    // InternalDem.g:3893:7: lv_arguments_3_0= ruleDExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsDExpressionParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_50);
                    	    lv_arguments_3_0=ruleDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDmxFunctionCallArgumentsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_3_0,
                    	      								"com.mimacom.ddd.dm.dmx.Dmx.DExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
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
    // $ANTLR end "ruleDmxFunctionCallArguments"


    // $ANTLR start "entryRuleDmxConstructorCall"
    // InternalDem.g:3916:1: entryRuleDmxConstructorCall returns [EObject current=null] : iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF ;
    public final EObject entryRuleDmxConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxConstructorCall = null;


        try {
            // InternalDem.g:3916:59: (iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF )
            // InternalDem.g:3917:2: iv_ruleDmxConstructorCall= ruleDmxConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxConstructorCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxConstructorCall=ruleDmxConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxConstructorCall; 
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
    // $ANTLR end "entryRuleDmxConstructorCall"


    // $ANTLR start "ruleDmxConstructorCall"
    // InternalDem.g:3923:1: ruleDmxConstructorCall returns [EObject current=null] : ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleDmxConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitConstructorCall_3_0=null;
        Token otherlv_5=null;
        EObject lv_callArguments_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:3929:2: ( ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? ) )
            // InternalDem.g:3930:2: ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? )
            {
            // InternalDem.g:3930:2: ( () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )? )
            // InternalDem.g:3931:3: () ruleDmxOpConstructor ( (otherlv_2= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )?
            {
            // InternalDem.g:3931:3: ()
            // InternalDem.g:3932:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxConstructorCallAccess().getDmxConstructorCallAction_0(),
              					current);
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDmxConstructorCallAccess().getDmxOpConstructorParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            ruleDmxOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:3945:3: ( (otherlv_2= RULE_ID ) )
            // InternalDem.g:3946:4: (otherlv_2= RULE_ID )
            {
            // InternalDem.g:3946:4: (otherlv_2= RULE_ID )
            // InternalDem.g:3947:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxConstructorCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getDmxConstructorCallAccess().getConstructorDComplexTypeCrossReference_2_0());
              				
            }

            }


            }

            // InternalDem.g:3958:3: ( ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==41) && (synpred13_InternalDem())) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDem.g:3959:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) ) ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) ) otherlv_5= ')'
                    {
                    // InternalDem.g:3959:4: ( ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' ) )
                    // InternalDem.g:3960:5: ( ( '(' ) )=> (lv_explicitConstructorCall_3_0= '(' )
                    {
                    // InternalDem.g:3964:5: (lv_explicitConstructorCall_3_0= '(' )
                    // InternalDem.g:3965:6: lv_explicitConstructorCall_3_0= '('
                    {
                    lv_explicitConstructorCall_3_0=(Token)match(input,41,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_explicitConstructorCall_3_0, grammarAccess.getDmxConstructorCallAccess().getExplicitConstructorCallLeftParenthesisKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxConstructorCallRule());
                      						}
                      						setWithLastConsumed(current, "explicitConstructorCall", true, "(");
                      					
                    }

                    }


                    }

                    // InternalDem.g:3977:4: ( (lv_callArguments_4_0= ruleDmxFunctionCallArguments ) )
                    // InternalDem.g:3978:5: (lv_callArguments_4_0= ruleDmxFunctionCallArguments )
                    {
                    // InternalDem.g:3978:5: (lv_callArguments_4_0= ruleDmxFunctionCallArguments )
                    // InternalDem.g:3979:6: lv_callArguments_4_0= ruleDmxFunctionCallArguments
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxConstructorCallAccess().getCallArgumentsDmxFunctionCallArgumentsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_callArguments_4_0=ruleDmxFunctionCallArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxConstructorCallRule());
                      						}
                      						set(
                      							current,
                      							"callArguments",
                      							lv_callArguments_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.DmxFunctionCallArguments");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxConstructorCallAccess().getRightParenthesisKeyword_3_2());
                      			
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
    // $ANTLR end "ruleDmxConstructorCall"


    // $ANTLR start "entryRuleDmxOpConstructor"
    // InternalDem.g:4005:1: entryRuleDmxOpConstructor returns [String current=null] : iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF ;
    public final String entryRuleDmxOpConstructor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDmxOpConstructor = null;


        try {
            // InternalDem.g:4005:56: (iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF )
            // InternalDem.g:4006:2: iv_ruleDmxOpConstructor= ruleDmxOpConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxOpConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxOpConstructor=ruleDmxOpConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxOpConstructor.getText(); 
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
    // $ANTLR end "entryRuleDmxOpConstructor"


    // $ANTLR start "ruleDmxOpConstructor"
    // InternalDem.g:4012:1: ruleDmxOpConstructor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NEW' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleDmxOpConstructor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:4018:2: ( (kw= 'NEW' | kw= 'new' ) )
            // InternalDem.g:4019:2: (kw= 'NEW' | kw= 'new' )
            {
            // InternalDem.g:4019:2: (kw= 'NEW' | kw= 'new' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==55) ) {
                alt69=1;
            }
            else if ( (LA69_0==56) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalDem.g:4020:3: kw= 'NEW'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpConstructorAccess().getNEWKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:4026:3: kw= 'new'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDmxOpConstructorAccess().getNewKeyword_1());
                      		
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
    // $ANTLR end "ruleDmxOpConstructor"


    // $ANTLR start "entryRuleDmxStaticReference"
    // InternalDem.g:4035:1: entryRuleDmxStaticReference returns [EObject current=null] : iv_ruleDmxStaticReference= ruleDmxStaticReference EOF ;
    public final EObject entryRuleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStaticReference = null;


        try {
            // InternalDem.g:4035:59: (iv_ruleDmxStaticReference= ruleDmxStaticReference EOF )
            // InternalDem.g:4036:2: iv_ruleDmxStaticReference= ruleDmxStaticReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxStaticReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxStaticReference=ruleDmxStaticReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxStaticReference; 
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
    // $ANTLR end "entryRuleDmxStaticReference"


    // $ANTLR start "ruleDmxStaticReference"
    // InternalDem.g:4042:1: ruleDmxStaticReference returns [EObject current=null] : ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) ;
    public final EObject ruleDmxStaticReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_displayName_6_0=null;
        Token lv_plural_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalDem.g:4048:2: ( ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) ) )
            // InternalDem.g:4049:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            {
            // InternalDem.g:4049:2: ( () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' ) )
            // InternalDem.g:4050:3: () otherlv_1= '[' ( ( ruleDQualifiedName ) ) (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )? ( ( ']' )=>otherlv_8= ']' )
            {
            // InternalDem.g:4050:3: ()
            // InternalDem.g:4051:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStaticReferenceAccess().getDmxStaticReferenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxStaticReferenceAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalDem.g:4061:3: ( ( ruleDQualifiedName ) )
            // InternalDem.g:4062:4: ( ruleDQualifiedName )
            {
            // InternalDem.g:4062:4: ( ruleDQualifiedName )
            // InternalDem.g:4063:5: ruleDQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxStaticReferenceAccess().getTargetIStaticReferenceTargetCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_64);
            ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDem.g:4077:3: (otherlv_3= '#' ( (otherlv_4= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==58) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDem.g:4078:4: otherlv_3= '#' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxStaticReferenceAccess().getNumberSignKeyword_3_0());
                      			
                    }
                    // InternalDem.g:4082:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDem.g:4083:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDem.g:4083:5: (otherlv_4= RULE_ID )
                    // InternalDem.g:4084:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getDmxStaticReferenceAccess().getMemberDNavigableMemberCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalDem.g:4096:3: (otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDem.g:4097:4: otherlv_5= '|' ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDmxStaticReferenceAccess().getVerticalLineKeyword_4_0());
                      			
                    }
                    // InternalDem.g:4101:4: ( ( (lv_displayName_6_0= RULE_ID ) ) | ( (lv_plural_7_0= '*' ) ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_ID) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==47) ) {
                        alt71=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalDem.g:4102:5: ( (lv_displayName_6_0= RULE_ID ) )
                            {
                            // InternalDem.g:4102:5: ( (lv_displayName_6_0= RULE_ID ) )
                            // InternalDem.g:4103:6: (lv_displayName_6_0= RULE_ID )
                            {
                            // InternalDem.g:4103:6: (lv_displayName_6_0= RULE_ID )
                            // InternalDem.g:4104:7: lv_displayName_6_0= RULE_ID
                            {
                            lv_displayName_6_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_displayName_6_0, grammarAccess.getDmxStaticReferenceAccess().getDisplayNameIDTerminalRuleCall_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"displayName",
                              								lv_displayName_6_0,
                              								"com.mimacom.ddd.dm.dmx.Dmx.ID");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalDem.g:4121:5: ( (lv_plural_7_0= '*' ) )
                            {
                            // InternalDem.g:4121:5: ( (lv_plural_7_0= '*' ) )
                            // InternalDem.g:4122:6: (lv_plural_7_0= '*' )
                            {
                            // InternalDem.g:4122:6: (lv_plural_7_0= '*' )
                            // InternalDem.g:4123:7: lv_plural_7_0= '*'
                            {
                            lv_plural_7_0=(Token)match(input,47,FOLLOW_67); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_plural_7_0, grammarAccess.getDmxStaticReferenceAccess().getPluralAsteriskKeyword_4_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getDmxStaticReferenceRule());
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

            // InternalDem.g:4137:3: ( ( ']' )=>otherlv_8= ']' )
            // InternalDem.g:4138:4: ( ']' )=>otherlv_8= ']'
            {
            otherlv_8=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_8, grammarAccess.getDmxStaticReferenceAccess().getRightSquareBracketKeyword_5());
              			
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
    // $ANTLR end "ruleDmxStaticReference"


    // $ANTLR start "entryRuleDmxContextReference"
    // InternalDem.g:4148:1: entryRuleDmxContextReference returns [EObject current=null] : iv_ruleDmxContextReference= ruleDmxContextReference EOF ;
    public final EObject entryRuleDmxContextReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxContextReference = null;


        try {
            // InternalDem.g:4148:60: (iv_ruleDmxContextReference= ruleDmxContextReference EOF )
            // InternalDem.g:4149:2: iv_ruleDmxContextReference= ruleDmxContextReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxContextReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxContextReference=ruleDmxContextReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxContextReference; 
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
    // $ANTLR end "entryRuleDmxContextReference"


    // $ANTLR start "ruleDmxContextReference"
    // InternalDem.g:4155:1: ruleDmxContextReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) ;
    public final EObject ruleDmxContextReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_before_2_0=null;
        Token otherlv_3=null;
        Token lv_all_4_0=null;


        	enterRule();

        try {
            // InternalDem.g:4161:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? ) )
            // InternalDem.g:4162:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            {
            // InternalDem.g:4162:2: ( () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )? )
            // InternalDem.g:4163:3: () ( (otherlv_1= RULE_ID ) ) ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            {
            // InternalDem.g:4163:3: ()
            // InternalDem.g:4164:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxContextReferenceAccess().getDmxContextReferenceAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4170:3: ( (otherlv_1= RULE_ID ) )
            // InternalDem.g:4171:4: (otherlv_1= RULE_ID )
            {
            // InternalDem.g:4171:4: (otherlv_1= RULE_ID )
            // InternalDem.g:4172:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxContextReferenceRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getDmxContextReferenceAccess().getTargetDNamedElementCrossReference_1_0());
              				
            }

            }


            }

            // InternalDem.g:4183:3: ( ( (lv_before_2_0= '@before' ) ) | (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) ) )?
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==49) ) {
                alt73=1;
            }
            else if ( (LA73_0==48) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==60) ) {
                    alt73=2;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalDem.g:4184:4: ( (lv_before_2_0= '@before' ) )
                    {
                    // InternalDem.g:4184:4: ( (lv_before_2_0= '@before' ) )
                    // InternalDem.g:4185:5: (lv_before_2_0= '@before' )
                    {
                    // InternalDem.g:4185:5: (lv_before_2_0= '@before' )
                    // InternalDem.g:4186:6: lv_before_2_0= '@before'
                    {
                    lv_before_2_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_before_2_0, grammarAccess.getDmxContextReferenceAccess().getBeforeBeforeKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxContextReferenceRule());
                      						}
                      						setWithLastConsumed(current, "before", true, "@before");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4199:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    {
                    // InternalDem.g:4199:4: (otherlv_3= '.' ( (lv_all_4_0= 'all' ) ) )
                    // InternalDem.g:4200:5: otherlv_3= '.' ( (lv_all_4_0= 'all' ) )
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getDmxContextReferenceAccess().getFullStopKeyword_2_1_0());
                      				
                    }
                    // InternalDem.g:4204:5: ( (lv_all_4_0= 'all' ) )
                    // InternalDem.g:4205:6: (lv_all_4_0= 'all' )
                    {
                    // InternalDem.g:4205:6: (lv_all_4_0= 'all' )
                    // InternalDem.g:4206:7: lv_all_4_0= 'all'
                    {
                    lv_all_4_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_all_4_0, grammarAccess.getDmxContextReferenceAccess().getAllAllKeyword_2_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDmxContextReferenceRule());
                      							}
                      							setWithLastConsumed(current, "all", true, "all");
                      						
                    }

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
    // $ANTLR end "ruleDmxContextReference"


    // $ANTLR start "entryRuleDmxIfExpression"
    // InternalDem.g:4224:1: entryRuleDmxIfExpression returns [EObject current=null] : iv_ruleDmxIfExpression= ruleDmxIfExpression EOF ;
    public final EObject entryRuleDmxIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxIfExpression = null;


        try {
            // InternalDem.g:4224:56: (iv_ruleDmxIfExpression= ruleDmxIfExpression EOF )
            // InternalDem.g:4225:2: iv_ruleDmxIfExpression= ruleDmxIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxIfExpression=ruleDmxIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxIfExpression; 
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
    // $ANTLR end "entryRuleDmxIfExpression"


    // $ANTLR start "ruleDmxIfExpression"
    // InternalDem.g:4231:1: ruleDmxIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) ;
    public final EObject ruleDmxIfExpression() throws RecognitionException {
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
            // InternalDem.g:4237:2: ( ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' ) )
            // InternalDem.g:4238:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            {
            // InternalDem.g:4238:2: ( () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end' )
            // InternalDem.g:4239:3: () otherlv_1= 'if' ( (lv_if_2_0= ruleDExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleDExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )? otherlv_7= 'end'
            {
            // InternalDem.g:4239:3: ()
            // InternalDem.g:4240:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxIfExpressionAccess().getDmxIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDmxIfExpressionAccess().getIfKeyword_1());
              		
            }
            // InternalDem.g:4250:3: ( (lv_if_2_0= ruleDExpression ) )
            // InternalDem.g:4251:4: (lv_if_2_0= ruleDExpression )
            {
            // InternalDem.g:4251:4: (lv_if_2_0= ruleDExpression )
            // InternalDem.g:4252:5: lv_if_2_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getIfDExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_if_2_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxIfExpressionRule());
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

            otherlv_3=(Token)match(input,62,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDmxIfExpressionAccess().getThenKeyword_3());
              		
            }
            // InternalDem.g:4273:3: ( (lv_then_4_0= ruleDExpression ) )
            // InternalDem.g:4274:4: (lv_then_4_0= ruleDExpression )
            {
            // InternalDem.g:4274:4: (lv_then_4_0= ruleDExpression )
            // InternalDem.g:4275:5: lv_then_4_0= ruleDExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getThenDExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_then_4_0=ruleDExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxIfExpressionRule());
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

            // InternalDem.g:4292:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==63) && (synpred15_InternalDem())) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDem.g:4293:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleDExpression ) )
                    {
                    // InternalDem.g:4293:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalDem.g:4294:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getDmxIfExpressionAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalDem.g:4300:4: ( (lv_else_6_0= ruleDExpression ) )
                    // InternalDem.g:4301:5: (lv_else_6_0= ruleDExpression )
                    {
                    // InternalDem.g:4301:5: (lv_else_6_0= ruleDExpression )
                    // InternalDem.g:4302:6: lv_else_6_0= ruleDExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDmxIfExpressionAccess().getElseDExpressionParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_else_6_0=ruleDExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDmxIfExpressionRule());
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

            otherlv_7=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDmxIfExpressionAccess().getEndKeyword_6());
              		
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
    // $ANTLR end "ruleDmxIfExpression"


    // $ANTLR start "entryRuleDMultiplicity"
    // InternalDem.g:4328:1: entryRuleDMultiplicity returns [EObject current=null] : iv_ruleDMultiplicity= ruleDMultiplicity EOF ;
    public final EObject entryRuleDMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDMultiplicity = null;


        try {
            // InternalDem.g:4328:54: (iv_ruleDMultiplicity= ruleDMultiplicity EOF )
            // InternalDem.g:4329:2: iv_ruleDMultiplicity= ruleDMultiplicity EOF
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
    // InternalDem.g:4335:1: ruleDMultiplicity returns [EObject current=null] : ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleDMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_minOccurs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_shorthand_0_0 = null;

        AntlrDatatypeRuleToken lv_maxOccurs_4_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4341:2: ( ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) ) )
            // InternalDem.g:4342:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            {
            // InternalDem.g:4342:2: ( ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) ) | (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==47||LA75_0==74||LA75_0==112) ) {
                alt75=1;
            }
            else if ( (LA75_0==41) ) {
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
                    // InternalDem.g:4343:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    {
                    // InternalDem.g:4343:3: ( (lv_shorthand_0_0= ruleDMultiplicityShorthand ) )
                    // InternalDem.g:4344:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    {
                    // InternalDem.g:4344:4: (lv_shorthand_0_0= ruleDMultiplicityShorthand )
                    // InternalDem.g:4345:5: lv_shorthand_0_0= ruleDMultiplicityShorthand
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDMultiplicityAccess().getShorthandDMultiplicityShorthandEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_shorthand_0_0=ruleDMultiplicityShorthand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDMultiplicityRule());
                      					}
                      					set(
                      						current,
                      						"shorthand",
                      						lv_shorthand_0_0,
                      						"com.mimacom.ddd.dm.dmx.Dmx.DMultiplicityShorthand");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4363:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    {
                    // InternalDem.g:4363:3: (otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')' )
                    // InternalDem.g:4364:4: otherlv_1= '(' ( (lv_minOccurs_2_0= RULE_NATURAL ) ) otherlv_3= '..' ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDMultiplicityAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalDem.g:4368:4: ( (lv_minOccurs_2_0= RULE_NATURAL ) )
                    // InternalDem.g:4369:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    {
                    // InternalDem.g:4369:5: (lv_minOccurs_2_0= RULE_NATURAL )
                    // InternalDem.g:4370:6: lv_minOccurs_2_0= RULE_NATURAL
                    {
                    lv_minOccurs_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minOccurs_2_0, grammarAccess.getDMultiplicityAccess().getMinOccursNATURALTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDMultiplicityRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minOccurs",
                      							lv_minOccurs_2_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.NATURAL");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,65,FOLLOW_75); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDMultiplicityAccess().getFullStopFullStopKeyword_1_2());
                      			
                    }
                    // InternalDem.g:4390:4: ( (lv_maxOccurs_4_0= ruleMULTIPLICITY ) )
                    // InternalDem.g:4391:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    {
                    // InternalDem.g:4391:5: (lv_maxOccurs_4_0= ruleMULTIPLICITY )
                    // InternalDem.g:4392:6: lv_maxOccurs_4_0= ruleMULTIPLICITY
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDMultiplicityAccess().getMaxOccursMULTIPLICITYParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_maxOccurs_4_0=ruleMULTIPLICITY();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDMultiplicityRule());
                      						}
                      						set(
                      							current,
                      							"maxOccurs",
                      							lv_maxOccurs_4_0,
                      							"com.mimacom.ddd.dm.dmx.Dmx.MULTIPLICITY");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDMultiplicityAccess().getRightParenthesisKeyword_1_4());
                      			
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
    // $ANTLR end "ruleDMultiplicity"


    // $ANTLR start "entryRuleMULTIPLICITY"
    // InternalDem.g:4418:1: entryRuleMULTIPLICITY returns [String current=null] : iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF ;
    public final String entryRuleMULTIPLICITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMULTIPLICITY = null;


        try {
            // InternalDem.g:4418:52: (iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF )
            // InternalDem.g:4419:2: iv_ruleMULTIPLICITY= ruleMULTIPLICITY EOF
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
    // InternalDem.g:4425:1: ruleMULTIPLICITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMULTIPLICITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalDem.g:4431:2: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // InternalDem.g:4432:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // InternalDem.g:4432:2: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_NATURAL) ) {
                alt76=1;
            }
            else if ( (LA76_0==47) ) {
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
                    // InternalDem.g:4433:3: this_NATURAL_0= RULE_NATURAL
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
                    // InternalDem.g:4441:3: kw= '*'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDmxBooleanLiteral"
    // InternalDem.g:4450:1: entryRuleDmxBooleanLiteral returns [EObject current=null] : iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF ;
    public final EObject entryRuleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxBooleanLiteral = null;


        try {
            // InternalDem.g:4450:58: (iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF )
            // InternalDem.g:4451:2: iv_ruleDmxBooleanLiteral= ruleDmxBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxBooleanLiteral=ruleDmxBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxBooleanLiteral; 
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
    // $ANTLR end "entryRuleDmxBooleanLiteral"


    // $ANTLR start "ruleDmxBooleanLiteral"
    // InternalDem.g:4457:1: ruleDmxBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) ;
    public final EObject ruleDmxBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDem.g:4463:2: ( ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) ) )
            // InternalDem.g:4464:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            {
            // InternalDem.g:4464:2: ( () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' ) )
            // InternalDem.g:4465:3: () ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            {
            // InternalDem.g:4465:3: ()
            // InternalDem.g:4466:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxBooleanLiteralAccess().getDmxBooleanLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4472:3: ( ( (lv_value_1_0= 'TRUE' ) ) | ( (lv_value_2_0= 'true' ) ) | otherlv_3= 'FALSE' | otherlv_4= 'false' )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt77=1;
                }
                break;
            case 67:
                {
                alt77=2;
                }
                break;
            case 68:
                {
                alt77=3;
                }
                break;
            case 69:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalDem.g:4473:4: ( (lv_value_1_0= 'TRUE' ) )
                    {
                    // InternalDem.g:4473:4: ( (lv_value_1_0= 'TRUE' ) )
                    // InternalDem.g:4474:5: (lv_value_1_0= 'TRUE' )
                    {
                    // InternalDem.g:4474:5: (lv_value_1_0= 'TRUE' )
                    // InternalDem.g:4475:6: lv_value_1_0= 'TRUE'
                    {
                    lv_value_1_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getDmxBooleanLiteralAccess().getValueTRUEKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "TRUE");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4488:4: ( (lv_value_2_0= 'true' ) )
                    {
                    // InternalDem.g:4488:4: ( (lv_value_2_0= 'true' ) )
                    // InternalDem.g:4489:5: (lv_value_2_0= 'true' )
                    {
                    // InternalDem.g:4489:5: (lv_value_2_0= 'true' )
                    // InternalDem.g:4490:6: lv_value_2_0= 'true'
                    {
                    lv_value_2_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getDmxBooleanLiteralAccess().getValueTrueKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDmxBooleanLiteralRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4503:4: otherlv_3= 'FALSE'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDmxBooleanLiteralAccess().getFALSEKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalDem.g:4508:4: otherlv_4= 'false'
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDmxBooleanLiteralAccess().getFalseKeyword_1_3());
                      			
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
    // $ANTLR end "ruleDmxBooleanLiteral"


    // $ANTLR start "entryRuleDmxNaturalLiteral"
    // InternalDem.g:4517:1: entryRuleDmxNaturalLiteral returns [EObject current=null] : iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF ;
    public final EObject entryRuleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxNaturalLiteral = null;


        try {
            // InternalDem.g:4517:58: (iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF )
            // InternalDem.g:4518:2: iv_ruleDmxNaturalLiteral= ruleDmxNaturalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxNaturalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxNaturalLiteral=ruleDmxNaturalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxNaturalLiteral; 
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
    // $ANTLR end "entryRuleDmxNaturalLiteral"


    // $ANTLR start "ruleDmxNaturalLiteral"
    // InternalDem.g:4524:1: ruleDmxNaturalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) ;
    public final EObject ruleDmxNaturalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:4530:2: ( ( () ( (lv_value_1_0= RULE_NATURAL ) ) ) )
            // InternalDem.g:4531:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            {
            // InternalDem.g:4531:2: ( () ( (lv_value_1_0= RULE_NATURAL ) ) )
            // InternalDem.g:4532:3: () ( (lv_value_1_0= RULE_NATURAL ) )
            {
            // InternalDem.g:4532:3: ()
            // InternalDem.g:4533:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxNaturalLiteralAccess().getDmxNaturalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4539:3: ( (lv_value_1_0= RULE_NATURAL ) )
            // InternalDem.g:4540:4: (lv_value_1_0= RULE_NATURAL )
            {
            // InternalDem.g:4540:4: (lv_value_1_0= RULE_NATURAL )
            // InternalDem.g:4541:5: lv_value_1_0= RULE_NATURAL
            {
            lv_value_1_0=(Token)match(input,RULE_NATURAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDmxNaturalLiteralAccess().getValueNATURALTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxNaturalLiteralRule());
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
    // $ANTLR end "ruleDmxNaturalLiteral"


    // $ANTLR start "entryRuleDmxDecimalLiteral"
    // InternalDem.g:4561:1: entryRuleDmxDecimalLiteral returns [EObject current=null] : iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF ;
    public final EObject entryRuleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxDecimalLiteral = null;


        try {
            // InternalDem.g:4561:58: (iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF )
            // InternalDem.g:4562:2: iv_ruleDmxDecimalLiteral= ruleDmxDecimalLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxDecimalLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxDecimalLiteral=ruleDmxDecimalLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxDecimalLiteral; 
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
    // $ANTLR end "entryRuleDmxDecimalLiteral"


    // $ANTLR start "ruleDmxDecimalLiteral"
    // InternalDem.g:4568:1: ruleDmxDecimalLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) ;
    public final EObject ruleDmxDecimalLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4574:2: ( ( () ( (lv_value_1_0= ruleDECIMAL ) ) ) )
            // InternalDem.g:4575:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            {
            // InternalDem.g:4575:2: ( () ( (lv_value_1_0= ruleDECIMAL ) ) )
            // InternalDem.g:4576:3: () ( (lv_value_1_0= ruleDECIMAL ) )
            {
            // InternalDem.g:4576:3: ()
            // InternalDem.g:4577:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxDecimalLiteralAccess().getDmxDecimalLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4583:3: ( (lv_value_1_0= ruleDECIMAL ) )
            // InternalDem.g:4584:4: (lv_value_1_0= ruleDECIMAL )
            {
            // InternalDem.g:4584:4: (lv_value_1_0= ruleDECIMAL )
            // InternalDem.g:4585:5: lv_value_1_0= ruleDECIMAL
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDmxDecimalLiteralAccess().getValueDECIMALParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDmxDecimalLiteralRule());
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
    // $ANTLR end "ruleDmxDecimalLiteral"


    // $ANTLR start "entryRuleDmxStringLiteral"
    // InternalDem.g:4606:1: entryRuleDmxStringLiteral returns [EObject current=null] : iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF ;
    public final EObject entryRuleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxStringLiteral = null;


        try {
            // InternalDem.g:4606:57: (iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF )
            // InternalDem.g:4607:2: iv_ruleDmxStringLiteral= ruleDmxStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxStringLiteral=ruleDmxStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxStringLiteral; 
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
    // $ANTLR end "entryRuleDmxStringLiteral"


    // $ANTLR start "ruleDmxStringLiteral"
    // InternalDem.g:4613:1: ruleDmxStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDmxStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalDem.g:4619:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDem.g:4620:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDem.g:4620:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDem.g:4621:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDem.g:4621:3: ()
            // InternalDem.g:4622:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxStringLiteralAccess().getDmxStringLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4628:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDem.g:4629:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDem.g:4629:4: (lv_value_1_0= RULE_STRING )
            // InternalDem.g:4630:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getDmxStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDmxStringLiteralRule());
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
    // $ANTLR end "ruleDmxStringLiteral"


    // $ANTLR start "entryRuleDmxUndefinedLiteral"
    // InternalDem.g:4650:1: entryRuleDmxUndefinedLiteral returns [EObject current=null] : iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF ;
    public final EObject entryRuleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDmxUndefinedLiteral = null;


        try {
            // InternalDem.g:4650:60: (iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF )
            // InternalDem.g:4651:2: iv_ruleDmxUndefinedLiteral= ruleDmxUndefinedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDmxUndefinedLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDmxUndefinedLiteral=ruleDmxUndefinedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDmxUndefinedLiteral; 
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
    // $ANTLR end "entryRuleDmxUndefinedLiteral"


    // $ANTLR start "ruleDmxUndefinedLiteral"
    // InternalDem.g:4657:1: ruleDmxUndefinedLiteral returns [EObject current=null] : ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) ;
    public final EObject ruleDmxUndefinedLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDem.g:4663:2: ( ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) ) )
            // InternalDem.g:4664:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            {
            // InternalDem.g:4664:2: ( () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' ) )
            // InternalDem.g:4665:3: () (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            {
            // InternalDem.g:4665:3: ()
            // InternalDem.g:4666:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDmxUndefinedLiteralAccess().getDmxUndefinedLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalDem.g:4672:3: (otherlv_1= 'UNDEFINED' | otherlv_2= 'undefined' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==70) ) {
                alt78=1;
            }
            else if ( (LA78_0==71) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalDem.g:4673:4: otherlv_1= 'UNDEFINED'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDmxUndefinedLiteralAccess().getUNDEFINEDKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalDem.g:4678:4: otherlv_2= 'undefined'
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDmxUndefinedLiteralAccess().getUndefinedKeyword_1_1());
                      			
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
    // $ANTLR end "ruleDmxUndefinedLiteral"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalDem.g:4687:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalDem.g:4687:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalDem.g:4688:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalDem.g:4694:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;
        Token this_NATURAL_2=null;
        Token this_NATURAL_7=null;


        	enterRule();

        try {
            // InternalDem.g:4700:2: ( (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? ) )
            // InternalDem.g:4701:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            {
            // InternalDem.g:4701:2: (this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )? )
            // InternalDem.g:4702:3: this_NATURAL_0= RULE_NATURAL kw= '.' this_NATURAL_2= RULE_NATURAL ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            {
            this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_0, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,48,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
              		
            }
            this_NATURAL_2=(Token)match(input,RULE_NATURAL,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NATURAL_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_NATURAL_2, grammarAccess.getDECIMALAccess().getNATURALTerminalRuleCall_2());
              		
            }
            // InternalDem.g:4721:3: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=72 && LA81_0<=73)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDem.g:4722:4: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_NATURAL_7= RULE_NATURAL
                    {
                    // InternalDem.g:4722:4: (kw= 'E' | kw= 'e' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==72) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==73) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalDem.g:4723:5: kw= 'E'
                            {
                            kw=(Token)match(input,72,FOLLOW_78); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:4729:5: kw= 'e'
                            {
                            kw=(Token)match(input,73,FOLLOW_78); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getEKeyword_3_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalDem.g:4735:4: (kw= '+' | kw= '-' )?
                    int alt80=3;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==74) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==75) ) {
                        alt80=2;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalDem.g:4736:5: kw= '+'
                            {
                            kw=(Token)match(input,74,FOLLOW_73); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getDECIMALAccess().getPlusSignKeyword_3_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalDem.g:4742:5: kw= '-'
                            {
                            kw=(Token)match(input,75,FOLLOW_73); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDQualifiedNameWithWildcard"
    // InternalDem.g:4760:1: entryRuleDQualifiedNameWithWildcard returns [String current=null] : iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF ;
    public final String entryRuleDQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedNameWithWildcard = null;


        try {
            // InternalDem.g:4760:66: (iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF )
            // InternalDem.g:4761:2: iv_ruleDQualifiedNameWithWildcard= ruleDQualifiedNameWithWildcard EOF
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
    // InternalDem.g:4767:1: ruleDQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDem.g:4773:2: ( (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? ) )
            // InternalDem.g:4774:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            {
            // InternalDem.g:4774:2: (this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )? )
            // InternalDem.g:4775:3: this_DQualifiedName_0= ruleDQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDQualifiedNameWithWildcardAccess().getDQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_79);
            this_DQualifiedName_0=ruleDQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DQualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDem.g:4785:3: (kw= '.*' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==76) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDem.g:4786:4: kw= '.*'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDQualifiedName"
    // InternalDem.g:4796:1: entryRuleDQualifiedName returns [String current=null] : iv_ruleDQualifiedName= ruleDQualifiedName EOF ;
    public final String entryRuleDQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDQualifiedName = null;


        try {
            // InternalDem.g:4796:54: (iv_ruleDQualifiedName= ruleDQualifiedName EOF )
            // InternalDem.g:4797:2: iv_ruleDQualifiedName= ruleDQualifiedName EOF
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
    // InternalDem.g:4803:1: ruleDQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDem.g:4809:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDem.g:4810:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDem.g:4810:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDem.g:4811:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalDem.g:4818:3: (kw= '.' this_ID_2= RULE_ID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==48) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalDem.g:4819:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getDQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getDQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleDQualifiedName"


    // $ANTLR start "ruleDmxBaseType"
    // InternalDem.g:4836:1: ruleDmxBaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) ;
    public final Enumerator ruleDmxBaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalDem.g:4842:2: ( ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) ) )
            // InternalDem.g:4843:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            {
            // InternalDem.g:4843:2: ( (enumLiteral_0= 'VOID' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'NUMBER' ) | (enumLiteral_3= 'TEXT' ) | (enumLiteral_4= 'IDENTIFIER' ) | (enumLiteral_5= 'TIMEPOINT' ) | (enumLiteral_6= 'STATE' ) | (enumLiteral_7= 'STATE_EVENT' ) | (enumLiteral_8= 'COMPLEX' ) | (enumLiteral_9= 'NOTIFICATION' ) | (enumLiteral_10= 'SERVICE' ) )
            int alt84=11;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt84=1;
                }
                break;
            case 78:
                {
                alt84=2;
                }
                break;
            case 79:
                {
                alt84=3;
                }
                break;
            case 80:
                {
                alt84=4;
                }
                break;
            case 81:
                {
                alt84=5;
                }
                break;
            case 82:
                {
                alt84=6;
                }
                break;
            case 83:
                {
                alt84=7;
                }
                break;
            case 84:
                {
                alt84=8;
                }
                break;
            case 85:
                {
                alt84=9;
                }
                break;
            case 86:
                {
                alt84=10;
                }
                break;
            case 87:
                {
                alt84=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalDem.g:4844:3: (enumLiteral_0= 'VOID' )
                    {
                    // InternalDem.g:4844:3: (enumLiteral_0= 'VOID' )
                    // InternalDem.g:4845:4: enumLiteral_0= 'VOID'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxBaseTypeAccess().getVOIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4852:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalDem.g:4852:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalDem.g:4853:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxBaseTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4860:3: (enumLiteral_2= 'NUMBER' )
                    {
                    // InternalDem.g:4860:3: (enumLiteral_2= 'NUMBER' )
                    // InternalDem.g:4861:4: enumLiteral_2= 'NUMBER'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxBaseTypeAccess().getNUMBEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4868:3: (enumLiteral_3= 'TEXT' )
                    {
                    // InternalDem.g:4868:3: (enumLiteral_3= 'TEXT' )
                    // InternalDem.g:4869:4: enumLiteral_3= 'TEXT'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxBaseTypeAccess().getTEXTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:4876:3: (enumLiteral_4= 'IDENTIFIER' )
                    {
                    // InternalDem.g:4876:3: (enumLiteral_4= 'IDENTIFIER' )
                    // InternalDem.g:4877:4: enumLiteral_4= 'IDENTIFIER'
                    {
                    enumLiteral_4=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getDmxBaseTypeAccess().getIDENTIFIEREnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDem.g:4884:3: (enumLiteral_5= 'TIMEPOINT' )
                    {
                    // InternalDem.g:4884:3: (enumLiteral_5= 'TIMEPOINT' )
                    // InternalDem.g:4885:4: enumLiteral_5= 'TIMEPOINT'
                    {
                    enumLiteral_5=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getDmxBaseTypeAccess().getTIMEPOINTEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalDem.g:4892:3: (enumLiteral_6= 'STATE' )
                    {
                    // InternalDem.g:4892:3: (enumLiteral_6= 'STATE' )
                    // InternalDem.g:4893:4: enumLiteral_6= 'STATE'
                    {
                    enumLiteral_6=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getDmxBaseTypeAccess().getSTATEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalDem.g:4900:3: (enumLiteral_7= 'STATE_EVENT' )
                    {
                    // InternalDem.g:4900:3: (enumLiteral_7= 'STATE_EVENT' )
                    // InternalDem.g:4901:4: enumLiteral_7= 'STATE_EVENT'
                    {
                    enumLiteral_7=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getDmxBaseTypeAccess().getSTATE_EVENTEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalDem.g:4908:3: (enumLiteral_8= 'COMPLEX' )
                    {
                    // InternalDem.g:4908:3: (enumLiteral_8= 'COMPLEX' )
                    // InternalDem.g:4909:4: enumLiteral_8= 'COMPLEX'
                    {
                    enumLiteral_8=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getDmxBaseTypeAccess().getCOMPLEXEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalDem.g:4916:3: (enumLiteral_9= 'NOTIFICATION' )
                    {
                    // InternalDem.g:4916:3: (enumLiteral_9= 'NOTIFICATION' )
                    // InternalDem.g:4917:4: enumLiteral_9= 'NOTIFICATION'
                    {
                    enumLiteral_9=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getDmxBaseTypeAccess().getNOTIFICATIONEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalDem.g:4924:3: (enumLiteral_10= 'SERVICE' )
                    {
                    // InternalDem.g:4924:3: (enumLiteral_10= 'SERVICE' )
                    // InternalDem.g:4925:4: enumLiteral_10= 'SERVICE'
                    {
                    enumLiteral_10=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxBaseTypeAccess().getSERVICEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getDmxBaseTypeAccess().getSERVICEEnumLiteralDeclaration_10());
                      			
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
    // $ANTLR end "ruleDmxBaseType"


    // $ANTLR start "ruleDmxOpOr"
    // InternalDem.g:4935:1: ruleDmxOpOr returns [Enumerator current=null] : ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) ;
    public final Enumerator ruleDmxOpOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:4941:2: ( ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) ) )
            // InternalDem.g:4942:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            {
            // InternalDem.g:4942:2: ( (enumLiteral_0= 'OR' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'XOR' ) | (enumLiteral_3= 'xor' ) )
            int alt85=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt85=1;
                }
                break;
            case 89:
                {
                alt85=2;
                }
                break;
            case 90:
                {
                alt85=3;
                }
                break;
            case 91:
                {
                alt85=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalDem.g:4943:3: (enumLiteral_0= 'OR' )
                    {
                    // InternalDem.g:4943:3: (enumLiteral_0= 'OR' )
                    // InternalDem.g:4944:4: enumLiteral_0= 'OR'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4951:3: (enumLiteral_1= 'or' )
                    {
                    // InternalDem.g:4951:3: (enumLiteral_1= 'or' )
                    // InternalDem.g:4952:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpOrAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:4959:3: (enumLiteral_2= 'XOR' )
                    {
                    // InternalDem.g:4959:3: (enumLiteral_2= 'XOR' )
                    // InternalDem.g:4960:4: enumLiteral_2= 'XOR'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:4967:3: (enumLiteral_3= 'xor' )
                    {
                    // InternalDem.g:4967:3: (enumLiteral_3= 'xor' )
                    // InternalDem.g:4968:4: enumLiteral_3= 'xor'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getDmxOpOrAccess().getXOREnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleDmxOpOr"


    // $ANTLR start "ruleDmxOpAnd"
    // InternalDem.g:4978:1: ruleDmxOpAnd returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) ;
    public final Enumerator ruleDmxOpAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:4984:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) ) )
            // InternalDem.g:4985:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            {
            // InternalDem.g:4985:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'and' ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==92) ) {
                alt86=1;
            }
            else if ( (LA86_0==93) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalDem.g:4986:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDem.g:4986:3: (enumLiteral_0= 'AND' )
                    // InternalDem.g:4987:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:4994:3: (enumLiteral_1= 'and' )
                    {
                    // InternalDem.g:4994:3: (enumLiteral_1= 'and' )
                    // InternalDem.g:4995:4: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpAndAccess().getANDEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleDmxOpAnd"


    // $ANTLR start "ruleDmxOpEquality"
    // InternalDem.g:5005:1: ruleDmxOpEquality returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) ;
    public final Enumerator ruleDmxOpEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:5011:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) ) )
            // InternalDem.g:5012:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            {
            // InternalDem.g:5012:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<>' ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt87=1;
                }
                break;
            case 95:
                {
                alt87=2;
                }
                break;
            case 96:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalDem.g:5013:3: (enumLiteral_0= '=' )
                    {
                    // InternalDem.g:5013:3: (enumLiteral_0= '=' )
                    // InternalDem.g:5014:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDmxOpEqualityAccess().getEQUALEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5021:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDem.g:5021:3: (enumLiteral_1= '!=' )
                    // InternalDem.g:5022:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5029:3: (enumLiteral_2= '<>' )
                    {
                    // InternalDem.g:5029:3: (enumLiteral_2= '<>' )
                    // InternalDem.g:5030:4: enumLiteral_2= '<>'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDmxOpEqualityAccess().getNOT_EQUALEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleDmxOpEquality"


    // $ANTLR start "ruleOpCompare"
    // InternalDem.g:5040:1: ruleOpCompare returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) ;
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
            // InternalDem.g:5046:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) ) )
            // InternalDem.g:5047:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            {
            // InternalDem.g:5047:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '\\u2264' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '\\u2265' ) | (enumLiteral_5= '>' ) )
            int alt88=6;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt88=1;
                }
                break;
            case 98:
                {
                alt88=2;
                }
                break;
            case 99:
                {
                alt88=3;
                }
                break;
            case 100:
                {
                alt88=4;
                }
                break;
            case 101:
                {
                alt88=5;
                }
                break;
            case 102:
                {
                alt88=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalDem.g:5048:3: (enumLiteral_0= '<' )
                    {
                    // InternalDem.g:5048:3: (enumLiteral_0= '<' )
                    // InternalDem.g:5049:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpCompareAccess().getLESSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5056:3: (enumLiteral_1= '<=' )
                    {
                    // InternalDem.g:5056:3: (enumLiteral_1= '<=' )
                    // InternalDem.g:5057:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5064:3: (enumLiteral_2= '\\u2264' )
                    {
                    // InternalDem.g:5064:3: (enumLiteral_2= '\\u2264' )
                    // InternalDem.g:5065:4: enumLiteral_2= '\\u2264'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpCompareAccess().getLESS_OR_EQUALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5072:3: (enumLiteral_3= '>=' )
                    {
                    // InternalDem.g:5072:3: (enumLiteral_3= '>=' )
                    // InternalDem.g:5073:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:5080:3: (enumLiteral_4= '\\u2265' )
                    {
                    // InternalDem.g:5080:3: (enumLiteral_4= '\\u2265' )
                    // InternalDem.g:5081:4: enumLiteral_4= '\\u2265'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpCompareAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDem.g:5088:3: (enumLiteral_5= '>' )
                    {
                    // InternalDem.g:5088:3: (enumLiteral_5= '>' )
                    // InternalDem.g:5089:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5099:1: ruleOpOther returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) ;
    public final Enumerator ruleOpOther() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDem.g:5105:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) ) )
            // InternalDem.g:5106:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            {
            // InternalDem.g:5106:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= '..' ) | (enumLiteral_3= '->' ) | (enumLiteral_4= '=>' ) )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt89=1;
                }
                break;
            case 40:
                {
                alt89=2;
                }
                break;
            case 65:
                {
                alt89=3;
                }
                break;
            case 104:
                {
                alt89=4;
                }
                break;
            case 105:
                {
                alt89=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalDem.g:5107:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDem.g:5107:3: (enumLiteral_0= 'IN' )
                    // InternalDem.g:5108:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5115:3: (enumLiteral_1= 'in' )
                    {
                    // InternalDem.g:5115:3: (enumLiteral_1= 'in' )
                    // InternalDem.g:5116:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpOtherAccess().getINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5123:3: (enumLiteral_2= '..' )
                    {
                    // InternalDem.g:5123:3: (enumLiteral_2= '..' )
                    // InternalDem.g:5124:4: enumLiteral_2= '..'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpOtherAccess().getUNTILEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5131:3: (enumLiteral_3= '->' )
                    {
                    // InternalDem.g:5131:3: (enumLiteral_3= '->' )
                    // InternalDem.g:5132:4: enumLiteral_3= '->'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpOtherAccess().getSINGLE_ARROWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:5139:3: (enumLiteral_4= '=>' )
                    {
                    // InternalDem.g:5139:3: (enumLiteral_4= '=>' )
                    // InternalDem.g:5140:4: enumLiteral_4= '=>'
                    {
                    enumLiteral_4=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getOpOtherAccess().getDOUBLE_ARROWEnumLiteralDeclaration_4());
                      			
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
    // InternalDem.g:5150:1: ruleOpAdd returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOpAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDem.g:5156:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalDem.g:5157:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalDem.g:5157:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==74) ) {
                alt90=1;
            }
            else if ( (LA90_0==75) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalDem.g:5158:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:5158:3: (enumLiteral_0= '+' )
                    // InternalDem.g:5159:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpAddAccess().getADDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5166:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:5166:3: (enumLiteral_1= '-' )
                    // InternalDem.g:5167:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5177:1: ruleOpMulti returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) ;
    public final Enumerator ruleOpMulti() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDem.g:5183:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) ) )
            // InternalDem.g:5184:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            {
            // InternalDem.g:5184:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '**' ) | (enumLiteral_3= '%' ) )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt91=1;
                }
                break;
            case 106:
                {
                alt91=2;
                }
                break;
            case 107:
                {
                alt91=3;
                }
                break;
            case 108:
                {
                alt91=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalDem.g:5185:3: (enumLiteral_0= '*' )
                    {
                    // InternalDem.g:5185:3: (enumLiteral_0= '*' )
                    // InternalDem.g:5186:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpMultiAccess().getMULTIPLYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5193:3: (enumLiteral_1= '/' )
                    {
                    // InternalDem.g:5193:3: (enumLiteral_1= '/' )
                    // InternalDem.g:5194:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpMultiAccess().getDIVIDEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5201:3: (enumLiteral_2= '**' )
                    {
                    // InternalDem.g:5201:3: (enumLiteral_2= '**' )
                    // InternalDem.g:5202:4: enumLiteral_2= '**'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpMultiAccess().getPOWEREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5209:3: (enumLiteral_3= '%' )
                    {
                    // InternalDem.g:5209:3: (enumLiteral_3= '%' )
                    // InternalDem.g:5210:4: enumLiteral_3= '%'
                    {
                    enumLiteral_3=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
    // InternalDem.g:5220:1: ruleOpUnary returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) ;
    public final Enumerator ruleOpUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDem.g:5226:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) ) )
            // InternalDem.g:5227:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            {
            // InternalDem.g:5227:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '!' ) | (enumLiteral_3= 'NOT' ) | (enumLiteral_4= 'not' ) )
            int alt92=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt92=1;
                }
                break;
            case 75:
                {
                alt92=2;
                }
                break;
            case 109:
                {
                alt92=3;
                }
                break;
            case 110:
                {
                alt92=4;
                }
                break;
            case 111:
                {
                alt92=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalDem.g:5228:3: (enumLiteral_0= '+' )
                    {
                    // InternalDem.g:5228:3: (enumLiteral_0= '+' )
                    // InternalDem.g:5229:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getOpUnaryAccess().getPLUSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5236:3: (enumLiteral_1= '-' )
                    {
                    // InternalDem.g:5236:3: (enumLiteral_1= '-' )
                    // InternalDem.g:5237:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getOpUnaryAccess().getMINUSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5244:3: (enumLiteral_2= '!' )
                    {
                    // InternalDem.g:5244:3: (enumLiteral_2= '!' )
                    // InternalDem.g:5245:4: enumLiteral_2= '!'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDem.g:5252:3: (enumLiteral_3= 'NOT' )
                    {
                    // InternalDem.g:5252:3: (enumLiteral_3= 'NOT' )
                    // InternalDem.g:5253:4: enumLiteral_3= 'NOT'
                    {
                    enumLiteral_3=(Token)match(input,110,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getOpUnaryAccess().getNOTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDem.g:5260:3: (enumLiteral_4= 'not' )
                    {
                    // InternalDem.g:5260:3: (enumLiteral_4= 'not' )
                    // InternalDem.g:5261:4: enumLiteral_4= 'not'
                    {
                    enumLiteral_4=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleDMultiplicityShorthand"
    // InternalDem.g:5271:1: ruleDMultiplicityShorthand returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleDMultiplicityShorthand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDem.g:5277:2: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // InternalDem.g:5278:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // InternalDem.g:5278:2: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt93=1;
                }
                break;
            case 74:
                {
                alt93=2;
                }
                break;
            case 47:
                {
                alt93=3;
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
                    // InternalDem.g:5279:3: (enumLiteral_0= '?' )
                    {
                    // InternalDem.g:5279:3: (enumLiteral_0= '?' )
                    // InternalDem.g:5280:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_ONEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDem.g:5287:3: (enumLiteral_1= '+' )
                    {
                    // InternalDem.g:5287:3: (enumLiteral_1= '+' )
                    // InternalDem.g:5288:4: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getDMultiplicityShorthandAccess().getONE_OR_MOREEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDem.g:5295:3: (enumLiteral_2= '*' )
                    {
                    // InternalDem.g:5295:3: (enumLiteral_2= '*' )
                    // InternalDem.g:5296:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_MOREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getDMultiplicityShorthandAccess().getZERO_OR_MOREEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleDMultiplicityShorthand"

    // $ANTLR start synpred1_InternalDem
    public final void synpred1_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2210:6: ( ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign ) )
        // InternalDem.g:2210:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        {
        // InternalDem.g:2210:7: ( () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign )
        // InternalDem.g:2211:7: () '.' ( ( RULE_ID ) ) ruleDmxOpSingleAssign
        {
        // InternalDem.g:2211:7: ()
        // InternalDem.g:2212:7: 
        {
        }

        match(input,48,FOLLOW_4); if (state.failed) return ;
        // InternalDem.g:2214:7: ( ( RULE_ID ) )
        // InternalDem.g:2215:8: ( RULE_ID )
        {
        // InternalDem.g:2215:8: ( RULE_ID )
        // InternalDem.g:2216:9: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_45); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_2);
        ruleDmxOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalDem

    // $ANTLR start synpred2_InternalDem
    public final void synpred2_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2279:6: ( ( () '.' ) )
        // InternalDem.g:2279:7: ( () '.' )
        {
        // InternalDem.g:2279:7: ( () '.' )
        // InternalDem.g:2280:7: () '.'
        {
        // InternalDem.g:2280:7: ()
        // InternalDem.g:2281:7: 
        {
        }

        match(input,48,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalDem

    // $ANTLR start synpred3_InternalDem
    public final void synpred3_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2315:8: ( ( '(' ) )
        // InternalDem.g:2315:9: ( '(' )
        {
        // InternalDem.g:2315:9: ( '(' )
        // InternalDem.g:2316:9: '('
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalDem

    // $ANTLR start synpred4_InternalDem
    public final void synpred4_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2676:5: ( ( () ( ( ruleDmxOpOr ) ) ) )
        // InternalDem.g:2676:6: ( () ( ( ruleDmxOpOr ) ) )
        {
        // InternalDem.g:2676:6: ( () ( ( ruleDmxOpOr ) ) )
        // InternalDem.g:2677:6: () ( ( ruleDmxOpOr ) )
        {
        // InternalDem.g:2677:6: ()
        // InternalDem.g:2678:6: 
        {
        }

        // InternalDem.g:2679:6: ( ( ruleDmxOpOr ) )
        // InternalDem.g:2680:7: ( ruleDmxOpOr )
        {
        // InternalDem.g:2680:7: ( ruleDmxOpOr )
        // InternalDem.g:2681:8: ruleDmxOpOr
        {
        pushFollow(FOLLOW_2);
        ruleDmxOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalDem

    // $ANTLR start synpred5_InternalDem
    public final void synpred5_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2764:5: ( ( () ( ( ruleDmxOpAnd ) ) ) )
        // InternalDem.g:2764:6: ( () ( ( ruleDmxOpAnd ) ) )
        {
        // InternalDem.g:2764:6: ( () ( ( ruleDmxOpAnd ) ) )
        // InternalDem.g:2765:6: () ( ( ruleDmxOpAnd ) )
        {
        // InternalDem.g:2765:6: ()
        // InternalDem.g:2766:6: 
        {
        }

        // InternalDem.g:2767:6: ( ( ruleDmxOpAnd ) )
        // InternalDem.g:2768:7: ( ruleDmxOpAnd )
        {
        // InternalDem.g:2768:7: ( ruleDmxOpAnd )
        // InternalDem.g:2769:8: ruleDmxOpAnd
        {
        pushFollow(FOLLOW_2);
        ruleDmxOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalDem

    // $ANTLR start synpred6_InternalDem
    public final void synpred6_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2852:5: ( ( () ( ( ruleDmxOpEquality ) ) ) )
        // InternalDem.g:2852:6: ( () ( ( ruleDmxOpEquality ) ) )
        {
        // InternalDem.g:2852:6: ( () ( ( ruleDmxOpEquality ) ) )
        // InternalDem.g:2853:6: () ( ( ruleDmxOpEquality ) )
        {
        // InternalDem.g:2853:6: ()
        // InternalDem.g:2854:6: 
        {
        }

        // InternalDem.g:2855:6: ( ( ruleDmxOpEquality ) )
        // InternalDem.g:2856:7: ( ruleDmxOpEquality )
        {
        // InternalDem.g:2856:7: ( ruleDmxOpEquality )
        // InternalDem.g:2857:8: ruleDmxOpEquality
        {
        pushFollow(FOLLOW_2);
        ruleDmxOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalDem

    // $ANTLR start synpred7_InternalDem
    public final void synpred7_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2941:6: ( ( () ruleDmxOpInstanceOf ) )
        // InternalDem.g:2941:7: ( () ruleDmxOpInstanceOf )
        {
        // InternalDem.g:2941:7: ( () ruleDmxOpInstanceOf )
        // InternalDem.g:2942:7: () ruleDmxOpInstanceOf
        {
        // InternalDem.g:2942:7: ()
        // InternalDem.g:2943:7: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpInstanceOf();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalDem

    // $ANTLR start synpred8_InternalDem
    public final void synpred8_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:2981:6: ( ( () ( ( ruleOpCompare ) ) ) )
        // InternalDem.g:2981:7: ( () ( ( ruleOpCompare ) ) )
        {
        // InternalDem.g:2981:7: ( () ( ( ruleOpCompare ) ) )
        // InternalDem.g:2982:7: () ( ( ruleOpCompare ) )
        {
        // InternalDem.g:2982:7: ()
        // InternalDem.g:2983:7: 
        {
        }

        // InternalDem.g:2984:7: ( ( ruleOpCompare ) )
        // InternalDem.g:2985:8: ( ruleOpCompare )
        {
        // InternalDem.g:2985:8: ( ruleOpCompare )
        // InternalDem.g:2986:9: ruleOpCompare
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
    // $ANTLR end synpred8_InternalDem

    // $ANTLR start synpred9_InternalDem
    public final void synpred9_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3100:5: ( ( () ( ( ruleOpOther ) ) ) )
        // InternalDem.g:3100:6: ( () ( ( ruleOpOther ) ) )
        {
        // InternalDem.g:3100:6: ( () ( ( ruleOpOther ) ) )
        // InternalDem.g:3101:6: () ( ( ruleOpOther ) )
        {
        // InternalDem.g:3101:6: ()
        // InternalDem.g:3102:6: 
        {
        }

        // InternalDem.g:3103:6: ( ( ruleOpOther ) )
        // InternalDem.g:3104:7: ( ruleOpOther )
        {
        // InternalDem.g:3104:7: ( ruleOpOther )
        // InternalDem.g:3105:8: ruleOpOther
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
    // $ANTLR end synpred9_InternalDem

    // $ANTLR start synpred10_InternalDem
    public final void synpred10_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3188:5: ( ( () ( ( ruleOpAdd ) ) ) )
        // InternalDem.g:3188:6: ( () ( ( ruleOpAdd ) ) )
        {
        // InternalDem.g:3188:6: ( () ( ( ruleOpAdd ) ) )
        // InternalDem.g:3189:6: () ( ( ruleOpAdd ) )
        {
        // InternalDem.g:3189:6: ()
        // InternalDem.g:3190:6: 
        {
        }

        // InternalDem.g:3191:6: ( ( ruleOpAdd ) )
        // InternalDem.g:3192:7: ( ruleOpAdd )
        {
        // InternalDem.g:3192:7: ( ruleOpAdd )
        // InternalDem.g:3193:8: ruleOpAdd
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
    // $ANTLR end synpred10_InternalDem

    // $ANTLR start synpred11_InternalDem
    public final void synpred11_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3276:5: ( ( () ( ( ruleOpMulti ) ) ) )
        // InternalDem.g:3276:6: ( () ( ( ruleOpMulti ) ) )
        {
        // InternalDem.g:3276:6: ( () ( ( ruleOpMulti ) ) )
        // InternalDem.g:3277:6: () ( ( ruleOpMulti ) )
        {
        // InternalDem.g:3277:6: ()
        // InternalDem.g:3278:6: 
        {
        }

        // InternalDem.g:3279:6: ( ( ruleOpMulti ) )
        // InternalDem.g:3280:7: ( ruleOpMulti )
        {
        // InternalDem.g:3280:7: ( ruleOpMulti )
        // InternalDem.g:3281:8: ruleOpMulti
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
    // $ANTLR end synpred11_InternalDem

    // $ANTLR start synpred12_InternalDem
    public final void synpred12_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3439:5: ( ( () ruleDmxOpCast ) )
        // InternalDem.g:3439:6: ( () ruleDmxOpCast )
        {
        // InternalDem.g:3439:6: ( () ruleDmxOpCast )
        // InternalDem.g:3440:6: () ruleDmxOpCast
        {
        // InternalDem.g:3440:6: ()
        // InternalDem.g:3441:6: 
        {
        }

        pushFollow(FOLLOW_2);
        ruleDmxOpCast();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalDem

    // $ANTLR start synpred13_InternalDem
    public final void synpred13_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:3960:5: ( ( '(' ) )
        // InternalDem.g:3960:6: ( '(' )
        {
        // InternalDem.g:3960:6: ( '(' )
        // InternalDem.g:3961:6: '('
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalDem

    // $ANTLR start synpred14_InternalDem
    public final void synpred14_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:4138:4: ( ']' )
        // InternalDem.g:4138:5: ']'
        {
        match(input,59,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalDem

    // $ANTLR start synpred15_InternalDem
    public final void synpred15_InternalDem_fragment() throws RecognitionException {   
        // InternalDem.g:4294:5: ( 'else' )
        // InternalDem.g:4294:6: 'else'
        {
        match(input,63,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalDem

    // Delegated rules

    public final boolean synpred9_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalDem() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDem_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA54 dfa54 = new DFA54(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\4\1\uffff\10\0\2\uffff";
    static final String dfa_4s = "\1\154\1\uffff\10\0\2\uffff";
    static final String dfa_5s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_6s = "\2\uffff\1\4\1\5\1\0\1\2\1\6\1\7\1\1\1\3\2\uffff}>";
    static final String[] dfa_7s = {
            "\5\1\21\uffff\4\1\5\uffff\1\1\3\uffff\2\1\1\uffff\1\1\4\uffff\2\1\3\uffff\1\2\1\3\1\1\7\uffff\4\1\10\uffff\2\1\14\uffff\11\1\1\4\1\5\1\6\1\7\1\10\1\11\6\1",
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

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2938:3: ( ( ( ( ( () ruleDmxOpInstanceOf ) )=> ( () ruleDmxOpInstanceOf ) ) ( (otherlv_3= RULE_ID ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( (lv_operator_5_0= ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleDmxOtherOperatorExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalDem()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalDem()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\4\uffff\1\11\5\uffff";
    static final String dfa_10s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_11s = "\1\107\3\uffff\1\154\5\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\10\1\4\1\7";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\4\4\uffff\2\1\11\uffff\1\3\24\uffff\1\2\15\uffff\2\5\1\6\3\uffff\1\7\4\uffff\6\1",
            "",
            "",
            "",
            "\5\11\21\uffff\4\11\5\uffff\1\11\3\uffff\2\11\1\10\1\11\4\uffff\3\11\2\uffff\3\11\7\uffff\4\11\10\uffff\2\11\14\uffff\25\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3524:2: (this_DmxLiteralExpression_0= ruleDmxLiteralExpression | this_DmxParenthesizedExpression_1= ruleDmxParenthesizedExpression | this_DmxListExpression_2= ruleDmxListExpression | this_DmxFunctionCall_3= ruleDmxFunctionCall | this_DmxConstructorCall_4= ruleDmxConstructorCall | this_DmxStaticReference_5= ruleDmxStaticReference | this_DmxContextReference_6= ruleDmxContextReference | this_DmxIfExpression_7= ruleDmxIfExpression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000012000C0062L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001200080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F400010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2380020000100670L,0x0000E00000000CFCL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000820000000002L,0x0001000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000820000000062L,0x0001000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000040062L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FFE000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L,0x0000000000FFE000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2380020000100610L,0x0000E00000000CFCL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003020000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2380060000100610L,0x0000E00000000CFCL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x000000000F000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0030000000000002L,0x0000007E00000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000010000000002L,0x0000038000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800000000002L,0x00001C0000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000800000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2380020008100670L,0x0000E00000000CFCL});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2380060000100670L,0x0000E00000000CFCL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0C08000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0808000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000800000000200L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000C00L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}